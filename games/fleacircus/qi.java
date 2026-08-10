/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static fh field_b;
    static String field_d;
    static String field_e;
    static dd field_c;
    static int field_f;
    static String field_a;

    final static void a(java.math.BigInteger param0, int param1, int param2, byte[] param3, ni param4, java.math.BigInteger param5, byte param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = pf.a(param6 ^ 104, param1);
              if (null == vk.field_N) {
                vk.field_N = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            if (param6 == -60) {
              var9 = 0;
              L2: while (true) {
                if ((var9 ^ -1) <= -5) {
                  L3: {
                    L4: {
                      if (null == ri.field_x) {
                        break L4;
                      } else {
                        if (var7_int <= ri.field_x.field_k.length) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ri.field_x = new ni(var7_int);
                    break L3;
                  }
                  L5: {
                    L6: {
                      ri.field_x.field_i = 0;
                      ri.field_x.a(param3, param1, param2, 0);
                      ri.field_x.d(var7_int, 0);
                      ri.field_x.a(0, var13);
                      if (fleas.field_B == null) {
                        break L6;
                      } else {
                        if (100 > fleas.field_B.field_k.length) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fleas.field_B = new ni(100);
                    break L5;
                  }
                  fleas.field_B.field_i = 0;
                  fleas.field_B.a(param6 + 49, 10);
                  var11 = 0;
                  var9 = var11;
                  L7: while (true) {
                    if ((var11 ^ -1) <= -5) {
                      fleas.field_B.b((byte) -49, param1);
                      fleas.field_B.a(param0, param5, 127);
                      param4.a(fleas.field_B.field_k, fleas.field_B.field_i, 0, 0);
                      param4.a(ri.field_x.field_k, ri.field_x.field_i, 0, param6 + 60);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      fleas.field_B.a(var13[var11], (byte) -15);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  var8[var9] = vk.field_N.nextInt();
                  var9++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("qi.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -105) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        byte[] var9 = null;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              if (param1 == -22518) {
                break L1;
              } else {
                var9 = (byte[]) null;
                qi.a((byte[]) null, -34);
                break L1;
              }
            }
            L2: {
              var10 = new ni(param0);
              var3 = var10.e(false);
              var4 = var10.c((byte) 123);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (0 == lj.field_b) {
                    break L3;
                  } else {
                    if (var4 > lj.field_b) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var14 = new byte[var4];
                  var12 = var14;
                  var5 = var12;
                  var10.b(var14, 0, -126, var4);
                  stackIn_23_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var10.c((byte) 126);
                    if (0 > var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (lj.field_b == 0) {
                          break L5;
                        } else {
                          if (lj.field_b >= var5_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5_int];
                        var11 = var13;
                        var6 = var11;
                        if (var3 == 1) {
                          fe.a(var13, var5_int, param0, var4, 9);
                          break L6;
                        } else {
                          var7 = se.field_c;
                          synchronized (var7) {
                            L7: {
                              se.field_c.a((byte) -126, var13, var10);
                              break L7;
                            }
                          }
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("qi.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    static {
        field_e = "Service unavailable";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_b = new fh(8, 0, 4, 1);
    }
}
