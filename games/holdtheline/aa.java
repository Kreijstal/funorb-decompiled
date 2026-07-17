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
        int discarded$0 = 1;
        return em.a();
    }

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param0.length() <= var3) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("aa.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 1 + 41);
        }
        return stackIn_8_0 != 0;
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var2 = new hj(param1.a("", false, "final_frame.jpg"), (java.awt.Component) (Object) kd.field_b);
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
          int discarded$2 = -10;
          dm.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("aa.A(").append(-18916).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    aa(long param0, int param1, byte[] param2) {
        try {
            ((aa) this).field_o = param0;
            ((aa) this).field_l = param1;
            ((aa) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "aa.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Powerups are activated by pressing <img=0>.";
        field_k = false;
    }
}
