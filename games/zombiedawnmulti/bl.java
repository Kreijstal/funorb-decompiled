/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_f;
    static boolean field_h;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;
    static int field_a;
    static ri field_g;

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static int c(int param0) {
        return mc.field_e + -ch.field_i;
    }

    final static ja a(byte param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ja stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (ud.a(param1, param2, param3, (byte) -42)) {
              if (param0 == 50) {
                stackOut_6_0 = gl.a(15);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ja) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ja) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("bl.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized static long a(byte param0) {
        long var1 = System.currentTimeMillis();
        if (param0 < 38) {
            return 127L;
        }
        if (~var1 > ~he.field_e) {
            vn.field_b = vn.field_b + (-var1 + he.field_e);
        }
        he.field_e = var1;
        return vn.field_b + var1;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (pl.field_I != sp.field_g) {
              L1: {
                if (lb.a((byte) 53, pl.field_I)) {
                  gk.a(2, pl.field_I).b((byte) 69);
                  break L1;
                } else {
                  break L1;
                }
              }
              gk.field_b = 0;
              if (param0 == -9) {
                L2: {
                  pl.field_I = sp.field_g;
                  if (!bi.field_e) {
                    break L2;
                  } else {
                    wp.field_h = null;
                    hh.field_b = false;
                    cp.field_K = false;
                    df.field_I = false;
                    bi.field_e = false;
                    af.field_e = null;
                    np.field_m = null;
                    pp.field_n = false;
                    break L2;
                  }
                }
                L3: {
                  if (!cg.field_l) {
                    break L3;
                  } else {
                    var13 = k.field_n;
                    var11 = var13;
                    var9 = var11;
                    var7 = var9;
                    var4 = var7;
                    var1_array = var4;
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        var14 = fc.field_m;
                        var12 = var14;
                        var10 = var12;
                        var8 = var10;
                        var5 = var8;
                        var1_array = var5;
                        var6 = 0;
                        var2 = var6;
                        L5: while (true) {
                          if (var6 >= 8) {
                            cg.field_l = false;
                            break L3;
                          } else {
                            var14[var6] = 0;
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        var13[var2] = 0;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                L6: {
                  if (!ch.field_k) {
                    break L6;
                  } else {
                    ld.j(param0 + 1481707577);
                    wc.i(-28264);
                    cf.d(-8328);
                    ch.field_k = false;
                    break L6;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "bl.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_f = "Withdraw invitation to <%0> to join this game";
        field_b = "Unpacking levels";
        field_c = -1;
        field_d = "Your zombie will screech like the devil, making humans tremble with fear and unable to move!";
        field_e = "Rated games are available to members only. To become a member and gain access to all the research, please visit the 'Account' section of the website.";
        field_a = 0;
    }
}
