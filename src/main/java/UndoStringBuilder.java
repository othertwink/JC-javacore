
public class UndoStringBuilder {

    private StringBuilder sb;
    private Snapshot lastSnapshot;
    //lifo of snapshot

    public UndoStringBuilder(StringBuilder origin) {
        this.sb = origin;
    }

    public StringBuilder getOrigin() {
        return sb;
    }

    class Snapshot {
        private UndoStringBuilder origin;
        private String text;

        public Snapshot(StringBuilder origin) {
            this.origin = new UndoStringBuilder(origin);
            this.text = origin.toString();
        }

        public UndoStringBuilder restore() {
            sb = origin.getOrigin();
            //lifo pop snapshot
            return origin;
        }
    }

    public Snapshot createSnapshot() {
        // lifo push new Snapshot
        lastSnapshot = new Snapshot(this.sb);
        return lastSnapshot;
    }

    public UndoStringBuilder Undo() {
        // if lifo !empty()
        return lastSnapshot.restore();
    }

}
