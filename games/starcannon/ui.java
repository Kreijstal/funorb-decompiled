/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui extends uh {
    static int field_p;
    static String field_t;
    static hl field_z;
    static String field_s;
    int field_q;
    static String field_n;
    int field_w;
    int field_x;
    int field_y;
    static int field_o;
    int field_u;
    int field_v;
    static int[] field_r;

    public static void d(byte param0) {
        field_z = null;
        field_r = null;
        field_s = null;
        field_t = null;
        field_n = null;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param3 != 23) {
          ((ui) this).field_y = 81;
          var6 = ((ui) this).field_x << 3;
          param4 = (param4 << 4) - -(var6 & 15);
          var7 = ((ui) this).field_q << 3;
          param2 = (param2 << 4) + (var7 & 15);
          ((ui) this).a(var6, var7, param4, param2, param1, param0);
          return;
        } else {
          var6 = ((ui) this).field_x << 3;
          param4 = (param4 << 4) - -(var6 & 15);
          var7 = ((ui) this).field_q << 3;
          param2 = (param2 << 4) + (var7 & 15);
          ((ui) this).a(var6, var7, param4, param2, param1, param0);
          return;
        }
    }

    final static int a(boolean param0) {
        return wg.field_c;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > -108) {
          ((ui) this).field_w = -67;
          this.a(param4 << 5, param1 << 8, param0, (byte) 23, param3);
          return;
        } else {
          this.a(param4 << 5, param1 << 8, param0, (byte) 23, param3);
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    ui() {
    }

    final static void a(int param0, int param1, qe param2, qe param3) {
        try {
            rh.field_h = param2;
            ai.field_h = param3;
            qa.field_c = param1;
            if (param0 != 640) {
                field_o = -116;
            }
            fc.a(ki.field_j / 2, (byte) 102, ki.field_f / 2);
            le.a(param0 + -5437, param2.field_r - -param2.field_q, param2.field_r, param3.field_r, param3.field_r + param3.field_q);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ui.MB(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Continue";
        field_n = "Connection lost - attempting to reconnect";
        field_o = 640;
        field_t = "Page ";
    }
}
