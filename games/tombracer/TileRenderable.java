/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TileRenderable implements Renderable {
    static long field_d;
    static String field_f;
    static int field_a;
    TileGridCell cell;
    static nt field_b;
    static jea field_c;

    final void setCell(int param0, TileGridCell param1) {
        try {
          this.cell = param1;
          if (param0 != 30711) {
            TileRenderable.releaseStatics(-92);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uq.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean c(int param0);

    public static void releaseStatics(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 <= 53) {
          TileRenderable.releaseStatics(22);
        }
    }

    public abstract void render(int param0, Camera param1);

    final Room getRoom(int param0) {
        if (param0 != 10685) {
          return (Room) null;
        }
        return this.cell.getRoom(0);
    }

    abstract void a(boolean param0);

    static {
        field_f = "Show all lobby chat";
        field_b = new nt();
    }
}
