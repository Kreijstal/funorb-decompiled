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
        if (!this.field_n) {
          if (!param0) {
            this.field_r = (byte[]) null;
            return this.field_r;
          } else {
            return this.field_r;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void a(qk param0, int param1) {
        kc var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new kc(param0.a((byte) 7, "", "final_frame.jpg"), (java.awt.Component) ((Object) tb.field_c));
            var3 = var2.field_p;
            var4 = var2.field_o;
            ji.a(true);
            sg.field_d = new kc(var3, 3 * var4 / 4);
            sg.field_d.c();
            var2.b(param1, 0);
            qg.field_z = new kc(var3, var4 - sg.field_d.field_o);
            qg.field_z.c();
            var2.b(0, -sg.field_d.field_o);
            qg.field_z.field_n = sg.field_d.field_o;
            gg.a(14756);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ab.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return 42;
        }
        if (this.field_n) {
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
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.a(0);
                  if (var3_int > param2) {
                    var3_int = param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                var5 = 54 % ((6 - param1) / 55);
                param0.field_i = param0.field_i + qf.field_J.a(var3_int, var4, param0.field_g, 0, 109, param0.field_i);
                var6 = bd.a(255, 0, var4, var3_int);
                stackIn_4_0 = (String) (var6);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_6_0 = "Cabbage";
              return stackIn_6_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ab.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    ab() {
    }

    static {
        field_w = new cc();
        field_q = "Username: ";
        field_t = 0;
    }
}
