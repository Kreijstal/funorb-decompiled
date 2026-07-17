/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class VertexElementCollection extends jaclib.peer.doa {
    public final native void addElement(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void init();

    public final native void reset();

    public VertexElementCollection(jaclib.peer.tqb param0) {
        super(param0);
        this.init();
    }

    public final native void finish();
}
