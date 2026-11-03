/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends AnimatedPanel {
    static IntrusiveDeque field_Bb;
    private AnimatedPanel field_Ab;
    private AnimatedPanel field_xb;
    static int field_Fb;
    static MenuComponent field_Db;
    static String field_yb;
    static String field_zb;
    static th field_Cb;
    static AnimatedPanel field_Eb;

    private rs(long param0, AnimatedPanel param1, AnimatedPanel param2, String param3) {
        super(param0, (AnimatedPanel) null);
        try {
          this.field_xb = new AnimatedPanel(0L, param1);
          this.field_Ab = new AnimatedPanel(0L, param2);
          this.field_Ab.field_z = param3;
          this.addChild(4, this.field_xb);
          this.addChild(4, this.field_Ab);
          this.markDirty((byte) -123);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    rs(long param0, rs param1, String param2) {
        this(param0, param1.field_xb, param1.field_Ab, param2);
    }

    private final void b(int param0, byte param1) {
        this.field_xb.setTarget(this.field_xb.measureWidthUnbounded(false), this.field_mb, (byte) 69, 0, 0);
        int var3 = this.field_xb.field_K + param0;
        this.field_Ab.setTarget(-var3 + this.field_K, this.field_mb, (byte) 112, 0, var3);
        int var4 = 8 / ((23 - param1) / 43);
    }

    public static void clearStatics(int param0) {
        field_yb = null;
        field_zb = null;
        field_Eb = null;
        if (param0 == 2616) {
          field_Bb = null;
          field_Cb = null;
          field_Db = null;
          return;
        }
        field_yb = (String) null;
        field_Bb = null;
        field_Cb = null;
        field_Db = null;
    }

    rs(long param0, Sprite param1, Sprite param2, int param3, AnimatedPanel param4, String param5) {
        this(param0, (AnimatedPanel) null, param4, param5);
        try {
          this.field_xb.field_pb = param2;
          this.field_xb.field_G = param3;
          this.field_xb.field_Z = param1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (im.field_c == null) {
          if (param0 < -70) {
            return;
          }
          field_Db = (MenuComponent) null;
          return;
        }
        var1 = im.field_c;
        synchronized (var1) {
          im.field_c = null;
        }
        if (param0 >= -70) {
          field_Db = (MenuComponent) null;
        }
    }

    final int c(int param0, int param1) {
        if (param1 == 0) {
          return this.field_xb.measureWidthUnbounded(false) + (param0 + this.field_Ab.measureWidthUnbounded(false));
        }
        field_Fb = 86;
        return this.field_xb.measureWidthUnbounded(false) + (param0 + this.field_Ab.measureWidthUnbounded(false));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.setTarget(param0, param4, (byte) 42, param5, param1);
        int var7 = 89 % ((1 - param2) / 60);
        this.b(param3, (byte) -34);
    }

    static {
        field_Fb = -1;
        field_Bb = new IntrusiveDeque();
        field_yb = "To server list";
        field_zb = "Music: ";
    }
}
