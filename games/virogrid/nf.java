/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static String field_c;
    static dl field_h;
    static int field_g;
    static String field_b;
    static int field_d;
    static int[] field_f;
    static int field_e;
    static String field_a;

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 6) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = ij.a(param1.charAt(var4), 4290) + (var3 << 5) - var3;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("nf.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 8 + param3 + param5 + 495;
              wc.field_k.a(3, -6 + we.field_c.field_ub, var6_int + -6, (byte) -46, 3);
              var7 = -5 + wc.field_k.field_ub;
              qa.field_d.a(5, param2, param3 + (485 + param5 - -2), (byte) -48, -param2 + var7);
              di.field_n.a(param5, param2, -wa.field_I.field_K + (qa.field_d.field_K + -param5), (byte) -88, 0);
              var7 = var7 - (2 + param2);
              var8 = 0;
              wa.field_I.a(param5 - -di.field_n.field_K, param2, wa.field_I.field_K, (byte) -97, 0);
              ne.field_c.a(5, -126, 2 + (485 + param5) + param3, 2, var7 + -5, 5, param3);
              if (null != fh.field_c) {
                fh.field_c.a(ne.field_c.field_ub, true, ne.field_c.field_F, ne.field_c.field_tb, ne.field_c.field_K);
                break L1;
              } else {
                break L1;
              }
            }
            var9 = -param5 + (we.field_c.field_K + -var6_int);
            var10 = var9 / 2;
            var11 = var10 + (param1 - -param5);
            var12 = 0;
            var13 = 0;
            L2: while (true) {
              if (var13 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var13 >= 5) {
                      break L4;
                    } else {
                      if (null == ln.field_i[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = 3 + var12 * (-6 + we.field_c.field_ub + 2) / (1 + tn.field_h);
                  var12++;
                  var7 = 3 - -((2 + (we.field_c.field_ub - 6)) * var12 / (1 + tn.field_h)) - 2 + -var14;
                  if (var13 < 5) {
                    ln.field_i[var13].a(var6_int, var7, var9, (byte) -48, var14);
                    ak.field_d[var13].a(param5, var7, var10 - param5, (byte) -72, 0);
                    og.field_g[var13].a(var10, -param0 + (var7 + -param0), param1, (byte) -122, param0);
                    th.field_o[var13].a(var11, -param0 + -param0 + var7, -var11 + -param5 + var9, (byte) -112, param0);
                    break L3;
                  } else {
                    af.field_d.a(var6_int, var7, var9, (byte) -73, var14);
                    break L3;
                  }
                }
                var13++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var6, "nf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + -27 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, byte param1, int param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var13 = new char[param0];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param0 <= var6) {
                L2: {
                  if (param1 <= -93) {
                    break L2;
                  } else {
                    nf.a((byte) -118);
                    break L2;
                  }
                }
                stackOut_16_0 = new String(var13, 0, var5);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param3[var6 + param2];
                  if (var7 != 0) {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 < 160) {
                          L5: {
                            var8 = cg.field_f[var7 - 128];
                            if (0 == var8) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("nf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_h = null;
        field_c = null;
        field_f = null;
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (4096 > param1) {
            return param1 >= 2048 ? -af.field_h[-2048 + param1] : af.field_h[-param1 + 2048];
        }
        return param1 < 6144 ? -af.field_h[-param1 + 6144] : af.field_h[-6144 + param1];
    }

    final static void a(byte param0) {
        int var1 = 83 / ((-71 - param0) / 39);
        if (!(!ac.field_e)) {
            f.a((byte) -55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = new int[4];
        field_c = "Enter name of player to add to list";
        field_h = new dl();
        field_a = "<%0> has left.";
    }
}
