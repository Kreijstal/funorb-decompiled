/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class VertexElementCollection extends jaclib.peer.nca {
    public final native void addElement(int param0, int param1, int param2, int param3, int param4, int param5);

    public final native void reset();

    public final native void finish();

    public VertexElementCollection(jaclib.peer.sha param0) {
        super(param0);
        this.init();
    }

    private final native void init();
}
