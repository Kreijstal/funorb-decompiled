/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends la {
    int field_s;
    byte[] field_r;
    hc field_v;
    static cc field_w;
    static String field_q;
    static int field_t;
    static int[] field_u;
    static cf field_p;

    final byte[] b(boolean param0) {
        if (!((ab) this).field_n) {
          if (!param0) {
            ((ab) this).field_r = (byte[]) null;
            return ((ab) this).field_r;
          } else {
            return ((ab) this).field_r;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void a(qk param0, int param1) {
        kc var2 = new kc(param0.a((byte) 7, "", "final_frame.jpg"), (java.awt.Component) (Object) tb.field_c);
        int var3 = ((kc) var2).field_p;
        int var4 = ((kc) var2).field_o;
        ji.a(true);
        sg.field_d = new kc(var3, 3 * var4 / 4);
        sg.field_d.c();
        var2.b(param1, 0);
        qg.field_z = new kc(var3, var4 - sg.field_d.field_o);
        qg.field_z.c();
        var2.b(0, -sg.field_d.field_o);
        qg.field_z.field_n = sg.field_d.field_o;
        gg.a(14756);
    }

    final int a(boolean param0) {
        if (param0) {
            return 42;
        }
        if (((ab) this).field_n) {
            return 0;
        }
        return 100;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 >= -67) {
            return;
        }
        field_w = null;
        field_u = null;
        field_q = null;
    }

    final static String a(pb param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param0.a(0);
            if (var3_int > param2) {
              var3_int = param2;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          var5 = 54 % ((6 - param1) / 55);
          ((pb) param0).field_i = ((pb) param0).field_i + qf.field_J.a(var3_int, var4, ((pb) param0).field_g, 0, 109, ((pb) param0).field_i);
          var6 = bd.a(255, 0, var4, var3_int);
          stackOut_3_0 = (String) var6;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return (String) (Object) stackIn_4_0;
        }
        return null;
    }

    ab() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new cc();
        field_q = "Username: ";
        field_t = 0;
    }
}
