/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends da {
    static boolean field_r;
    static ge[] field_o;
    byte[] field_q;
    static String field_m;
    static int[] field_n;
    static int[][] field_p;
    static boolean field_j;
    long field_l;
    static int[][][] field_k;
    int field_i;

    final static int b(int param0, int param1) {
        if (param0 > -28) {
            return 6;
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
            return param1 < 6144 ? -k.field_d[-param1 + 6144] : k.field_d[-6144 + param1];
        }
        return param1 < 2048 ? k.field_d[-param1 + 2048] : -k.field_d[-2048 + param1];
    }

    final static boolean a(int param0) {
        ll.field_i = true;
        ji.field_y = 15000L + ol.a(256);
        return gj.field_c == 11 ? true : false;
    }

    final static void a(int param0, uf param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = dh.a(8, param4);
              if (af.field_d == null) {
                af.field_d = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (null == nh.field_eb) {
                      break L4;
                    } else {
                      if (var7_int > nh.field_eb.field_m.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  nh.field_eb = new uf(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    nh.field_eb.field_q = 0;
                    nh.field_eb.a(param4, 0, param3, -16384);
                    nh.field_eb.c(var7_int, (byte) 36);
                    nh.field_eb.a(var15, (byte) -124);
                    if (null == bi.field_d) {
                      break L6;
                    } else {
                      if (bi.field_d.field_m.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  bi.field_d = new uf(100);
                  break L5;
                }
                bi.field_d.field_q = 0;
                bi.field_d.d(10, (byte) 122);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (var11 >= 4) {
                    bi.field_d.a(param4, (byte) 106);
                    bi.field_d.a(param6, true, param5);
                    param1.a(bi.field_d.field_q, 0, bi.field_d.field_m, -16384);
                    param1.a(nh.field_eb.field_q, 0, nh.field_eb.field_m, -16384);
                    break L0;
                  } else {
                    bi.field_d.a(var15[var11], false);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = af.field_d.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("lc.D(").append(0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param6 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = -1;
          var5 = 0;
          if (v.field_X[0][rf.field_ib][param0][0] > nd.field_e) {
            break L0;
          } else {
            if (nd.field_e < v.field_X[0][rf.field_ib][param0][1]) {
              var4 = v.field_X[0][rf.field_ib][param0][1];
              var3 = v.field_X[0][rf.field_ib][param0][0];
              var5 = -var3 + nd.field_e;
              var2 = var5 * 256 / (var4 + -var3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (v.field_X[1][rf.field_ib][param0][0] > nd.field_e) {
            break L1;
          } else {
            if (nd.field_e < v.field_X[1][rf.field_ib][param0][1]) {
              var3 = v.field_X[1][rf.field_ib][param0][0];
              var4 = v.field_X[1][rf.field_ib][param0][1];
              var5 = -var3 + nd.field_e;
              var2 = 256 - 256 * var5 / (-var3 + var4);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (v.field_X[0][rf.field_ib][param0][0] > nd.field_e) {
            var2 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (nd.field_e < v.field_X[1][rf.field_ib][param0][1]) {
            break L3;
          } else {
            var2 = 0;
            break L3;
          }
        }
        return var2;
    }

    public static void b(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
        field_k = null;
        field_o = null;
    }

    lc(long param0, int param1, byte[] param2) {
        try {
            ((lc) this).field_l = param0;
            ((lc) this).field_q = param2;
            ((lc) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "lc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_r = false;
        field_p = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[1], new int[2]};
        field_n = new int[]{0, 0};
        field_k = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
