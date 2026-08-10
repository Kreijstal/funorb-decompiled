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
        if (param0 != 0) {
            bl.a(-38);
        }
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static int c(int param0) {
        if (param0 >= -38) {
            return -76;
        }
        return mc.field_e + -ch.field_i;
    }

    final static ja a(byte param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ja stackIn_5_0 = null;
        ja stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param1, param2, param3, (byte) -42)) {
              if (param0 == 50) {
                stackIn_7_0 = gl.a(15);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ja) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ja) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized static long a(byte param0) {
        long var1 = System.currentTimeMillis();
        if (param0 < 38) {
            return 127L;
        }
        if ((var1 ^ -1L) > (he.field_e ^ -1L)) {
            vn.field_b = vn.field_b + (-var1 + he.field_e);
        }
        he.field_e = var1;
        return vn.field_b + var1;
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                    var9 = k.field_n;
                    var7 = var9;
                    var4 = var7;
                    var1 = var4;
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        var10 = fc.field_m;
                        var8 = var10;
                        var5 = var8;
                        var1 = var5;
                        var6 = 0;
                        var2 = var6;
                        L5: while (true) {
                          if (-9 >= (var6 ^ -1)) {
                            cg.field_l = false;
                            break L3;
                          } else {
                            var10[var6] = 0;
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        var9[var2] = 0;
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
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "bl.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_h = false;
        field_f = "Withdraw invitation to <%0> to join this game";
        field_b = "Unpacking levels";
        field_c = -1;
        field_d = "Your zombie will screech like the devil, making humans tremble with fear and unable to move!";
        field_e = "Rated games are available to members only. To become a member and gain access to all the research, please visit the 'Account' section of the website.";
        field_a = 0;
    }
}
