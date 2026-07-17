/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends am {
    static vh field_j;
    int field_l;
    static int field_o;
    int field_h;
    static vl field_q;
    static bd field_n;
    int field_m;
    int field_k;
    int field_i;
    static String field_p;
    int field_r;

    final static bd[] a(int param0, gb param1, int param2, int param3) {
        RuntimeException var4 = null;
        bd[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd[] stackOut_3_0 = null;
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
            if (rl.a(2884, param1, param3, param2)) {
              int discarded$2 = 26627;
              stackOut_3_0 = qa.a();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ne.A(").append(44).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2;
              var4 = ec.a(bm.field_b, (byte) 19);
              var5 = -1;
              var6 = 0;
              var7 = 0;
              if (0 >= var4) {
                break L1;
              } else {
                L2: {
                  var8 = 32;
                  if (8 >= var4) {
                    break L2;
                  } else {
                    var8 = 270 / var4;
                    break L2;
                  }
                }
                param2 = param2 - (-4 + var8 * var4 / 2);
                var9 = 0;
                L3: while (true) {
                  if (42 <= var9) {
                    if (var5 >= 0) {
                      L4: {
                        if (var8 >= 32) {
                          fj.field_Kb[var5].a(var6 + -6, var7 - 6, 44, 44);
                          break L4;
                        } else {
                          fj.field_Kb[var5].a(var6 - 6, var7 + -6, var8, var8);
                          break L4;
                        }
                      }
                      al.field_Z.b(il.field_b[var5].toUpperCase(), var3_int, 272, 16776960, -1);
                      int discarded$1 = al.field_Z.a(bh.field_g[var5].toUpperCase(), var3_int - 130, 304, 260, 100, 16777215, -1, 1, 0, 12);
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    L5: {
                      if (!hb.a(var9, bm.field_b, false)) {
                        var9++;
                        break L5;
                      } else {
                        L6: {
                          if (ka.a(280, 0, var8, var8, param2)) {
                            var6 = param2;
                            var7 = 280;
                            var5 = var9;
                            break L6;
                          } else {
                            if (32 <= var8) {
                              fj.field_Kb[var9].b(param2, 280);
                              break L6;
                            } else {
                              fj.field_Kb[var9].a(-6 + param2, 274, var8, var8);
                              break L6;
                            }
                          }
                        }
                        param2 = param2 + var8;
                        var9++;
                        break L5;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "ne.D(" + 24 + 44 + 280 + 44 + param2 + 41);
        }
    }

    final static bd a(bd param0, byte param1) {
        gk var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        bd stackIn_5_0 = null;
        gk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_4_0 = null;
        gk stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            if (!(param0 instanceof gk)) {
              stackOut_4_0 = param0.d();
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2 = (gk) (Object) param0;
              var3 = var2.i();
              var3.g();
              stackOut_6_0 = (gk) var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("ne.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return (bd) (Object) stackIn_7_0;
    }

    public static void a() {
        field_n = null;
        int var1 = -2;
        field_p = null;
        field_q = null;
        field_j = null;
    }

    final static nf a(gb param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        nf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf stackOut_3_0 = null;
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
            var5 = param0.a(param2, -2);
            var3 = var5;
            if (var5 != null) {
              var4 = -7;
              stackOut_3_0 = new nf(var5);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ne.C(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -19 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    ne(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ne) this).field_m = param1;
        ((ne) this).field_i = param0;
        ((ne) this).field_l = param3;
        ((ne) this).field_k = param4;
        ((ne) this).field_r = param2;
        ((ne) this).field_h = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_p = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_q = new vl();
    }
}
