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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            if (param0 > 79) {
              L1: {
                var14 = ae.field_N;
                var2 = var14.f(4);
                if (var2 != 0) {
                  if ((var2 ^ -1) != -2) {
                    if ((var2 ^ -1) != -3) {
                      qe.a(115, "A1: " + bh.b((byte) -121), (Throwable) null);
                      oj.c(-2290);
                      break L1;
                    } else {
                      var15 = (he) ((Object) pl.field_W.b(-98));
                      if (var15 != null) {
                        var15.field_m = ac.d((byte) 126);
                        var15.field_n = true;
                        var15.c(20);
                        break L1;
                      } else {
                        oj.c(-2290);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  } else {
                    var12 = (kl) ((Object) nl.field_e.b(-97));
                    if (var12 == null) {
                      oj.c(-2290);
                      decompiledRegionSelector0 = 3;
                      break L0;
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
                  var6 = ((ka) ((Object) var5)).f(4);
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var6) {
                      var13 = (he) ((Object) pl.field_W.b(-78));
                      if (var13 == null) {
                        oj.c(-2290);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var13.field_m = var3;
                        var13.field_n = true;
                        var13.c(20);
                        break L1;
                      }
                    } else {
                      var10[var7] = ((ka) ((Object) var5)).b(false);
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "jf.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -15917) {
            jf.e(-107);
        }
        field_n = null;
        field_k = null;
        field_l = null;
    }

    final static void d(int param0) {
        ck.field_db = false;
        gk.field_a = false;
        rh.a(param0, (byte) -72);
        el.field_E = ok.field_a;
        o.field_l = ok.field_a;
    }

    final static String b(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                jf.a(-95);
                break L1;
              }
            }
            L2: {
              var2 = cj.a(nd.a(param0, (byte) -35), (byte) -112);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("jf.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    jf(int param0) {
        this.field_o = param0;
    }

    static {
        field_k = new int[8192];
        field_l = "Gravity Well";
    }
}
