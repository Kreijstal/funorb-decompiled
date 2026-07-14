/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li implements fe {
    static String field_e;
    private int field_c;
    static boolean field_l;
    private int field_j;
    private int field_a;
    private int field_d;
    private int field_g;
    private int field_b;
    private ok field_i;
    static String field_f;
    static sg field_m;
    private int field_h;
    static String field_n;
    static e field_k;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jh var14 = null;
        fj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fj stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof jh)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fj) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (jh) (Object) stackIn_3_0;
          fn.e(param3.field_q + param1, param4 + param3.field_m, param3.field_F, param3.field_z, ((li) this).field_d);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = var14.field_P + param3.field_q + param1;
        var8 = param3.field_m + (param4 - -var14.field_S);
        if (param0 > -97) {
          L2: {
            field_n = null;
            fn.e(var7, var8, var14.field_W, ((li) this).field_j);
            if (0 == (var14.field_T ^ -1)) {
              break L2;
            } else {
              var9 = (double)var14.field_T * 3.141592653589793 * 2.0 / (double)var14.field_Q;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
              var12 = (int)(Math.cos(var9) * (double)var14.field_W);
              fn.e(var11 + var7, var12 + var8, 1, ((li) this).field_h);
              break L2;
            }
          }
          L3: {
            fn.e(var7, var8, 2, 1);
            var9 = (double)var14.field_V * 3.141592653589793 * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
            var12 = (int)(Math.cos(var9) * (double)var14.field_W);
            fn.f(var7, var8, var11 + var7, var12 + var8, 1);
            if (((li) this).field_i != null) {
              var13 = ((li) this).field_a + var14.field_W + var14.field_P;
              int discarded$2 = ((li) this).field_i.a(param3.field_B, param1 + (param3.field_q + var13), param4 - (-param3.field_m - ((li) this).field_c), -((li) this).field_a - (var13 - param3.field_F), param3.field_z - (((li) this).field_a << 1950929057), ((li) this).field_g, ((li) this).field_b, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            fn.e(var7, var8, var14.field_W, ((li) this).field_j);
            if (0 == (var14.field_T ^ -1)) {
              break L4;
            } else {
              var9 = (double)var14.field_T * 3.141592653589793 * 2.0 / (double)var14.field_Q;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
              var12 = (int)(Math.cos(var9) * (double)var14.field_W);
              fn.e(var11 + var7, var12 + var8, 1, ((li) this).field_h);
              break L4;
            }
          }
          L5: {
            fn.e(var7, var8, 2, 1);
            var9 = (double)var14.field_V * 3.141592653589793 * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
            var12 = (int)(Math.cos(var9) * (double)var14.field_W);
            fn.f(var7, var8, var11 + var7, var12 + var8, 1);
            if (((li) this).field_i != null) {
              var13 = ((li) this).field_a + var14.field_W + var14.field_P;
              int discarded$3 = ((li) this).field_i.a(param3.field_B, param1 + (param3.field_q + var13), param4 - (-param3.field_m - ((li) this).field_c), -((li) this).field_a - (var13 - param3.field_F), param3.field_z - (((li) this).field_a << 1950929057), ((li) this).field_g, ((li) this).field_b, 1, 1, 0);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != 1) {
          li.a(117);
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = pn.a(var3, (byte) -33, param0);
                pk.a(true, var3.toString(), param0, (byte) -116);
                int var4 = 116 / ((param1 - 61) / 43);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    li(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((li) this).field_h = param6;
        ((li) this).field_i = param0;
        ((li) this).field_g = param3;
        ((li) this).field_c = param2;
        ((li) this).field_d = param7;
        ((li) this).field_j = param5;
        ((li) this).field_b = param4;
        ((li) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Keep an eye#on your Ready#Energy Meter.#If it runs out,#stop firing and#let it recharge.";
        field_n = "Highscores";
        field_f = "Thank you for playing.";
        field_k = new e(6, 0, 4, 2);
    }
}
