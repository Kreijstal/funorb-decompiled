/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hl {
    static String field_m;
    long field_o;
    static String[] field_j;
    static uf field_q;
    static String field_p;
    int field_l;
    static int field_n;
    static boolean field_k;
    byte[] field_i;

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            gn var5 = (gn) null;
            aa.a(-70, (gn) null);
            return em.a(true);
        }
        return em.a(true);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = param1;
            L1: while (true) {
              if (param0.length() <= var3) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("aa.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 <= 30) {
          aa.a(-108);
          field_j = null;
          field_p = null;
          field_q = null;
          return;
        } else {
          field_j = null;
          field_p = null;
          field_q = null;
          return;
        }
    }

    final static void a(int param0, gn param1) {
        hj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new hj(param1.a("", false, "final_frame.jpg"), (java.awt.Component) ((Object) kd.field_b));
            var3 = var2.field_s;
            var4 = var2.field_y;
            lj.a((byte) -120);
            w.field_c = new hj(var3, var4 * 3 / 4);
            w.field_c.f();
            var2.b(0, 0);
            kh.field_l = new hj(var3, var4 - w.field_c.field_y);
            kh.field_l.f();
            var2.b(0, -w.field_c.field_y);
            kh.field_l.field_x = w.field_c.field_y;
            dm.b((byte) -10);
            if (param0 == -18916) {
              break L0;
            } else {
              aa.a(-19);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("aa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    aa(long param0, int param1, byte[] param2) {
        try {
            this.field_o = param0;
            this.field_l = param1;
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "aa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Powerups are activated by pressing <img=0>.";
        field_k = false;
    }
}
