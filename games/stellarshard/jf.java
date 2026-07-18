/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends gg {
    static int[] field_k;
    static String field_l;
    static pf field_m;
    int field_o;
    static pb[] field_n;

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        kl var12 = null;
        he var13 = null;
        ha var14 = null;
        he var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var14 = ae.field_N;
              var2 = var14.f(4);
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 != 2) {
                    qe.a(115, "A1: " + bh.b((byte) -121), (Throwable) null);
                    oj.c(-2290);
                    break L1;
                  } else {
                    var15 = (he) (Object) pl.field_W.b(-98);
                    if (var15 != null) {
                      var15.field_m = ac.d((byte) 126);
                      var15.field_n = true;
                      var15.c(20);
                      break L1;
                    } else {
                      oj.c(-2290);
                      return;
                    }
                  }
                } else {
                  var12 = (kl) (Object) nl.field_e.b(-97);
                  if (var12 == null) {
                    oj.c(-2290);
                    return;
                  } else {
                    var12.c(20);
                    break L1;
                  }
                }
              } else {
                var11 = ac.d((byte) 127);
                var3 = var11;
                var10 = var11;
                var4 = var10;
                var5 = var14;
                var6 = ((ka) (Object) var5).f(4);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var13 = (he) (Object) pl.field_W.b(-78);
                    if (var13 == null) {
                      oj.c(-2290);
                      return;
                    } else {
                      var13.field_m = var3;
                      var13.field_n = true;
                      var13.c(20);
                      break L1;
                    }
                  } else {
                    var10[var7] = ((ka) (Object) var5).b(false);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "jf.D(" + 116 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_n = null;
        field_k = null;
        field_l = null;
    }

    final static void d(int param0) {
        ck.field_db = false;
        gk.field_a = false;
        rh.a(-1, (byte) -72);
        el.field_E = ok.field_a;
        o.field_l = ok.field_a;
    }

    final static String b(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = cj.a(nd.a(param0, (byte) -35), (byte) -112);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("jf.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    jf(int param0) {
        ((jf) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_l = "Gravity Well";
    }
}
