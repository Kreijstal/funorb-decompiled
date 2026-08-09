/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static int field_e;
    static int field_f;
    static String field_c;
    static bd field_a;
    static String field_d;
    static String[] field_b;

    final static void a(byte[] param0, int param1, int param2, int param3, vi param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
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
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = ja.a(7, param2);
              if (hi.field_k == null) {
                hi.field_k = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (bb.field_f == null) {
                      break L4;
                    } else {
                      if (bb.field_f.field_n.length < var7_int) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  bb.field_f = new vi(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    bb.field_f.field_i = 0;
                    bb.field_f.a(param2, param0, true, param3);
                    bb.field_f.g(var7_int, -122);
                    bb.field_f.a(var13, (byte) 108);
                    if (tb.field_M == null) {
                      break L6;
                    } else {
                      if (-101 < (tb.field_M.field_n.length ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  tb.field_M = new vi(100);
                  break L5;
                }
                tb.field_M.field_i = 0;
                tb.field_M.d(95, 10);
                var11 = 0;
                var9 = var11;
                if (param1 < -98) {
                  L7: while (true) {
                    if (4 <= var11) {
                      tb.field_M.a((byte) -119, param2);
                      tb.field_M.a(param5, 0, param6);
                      param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                      param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      tb.field_M.b(var13[var11], 25251);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var8[var9] = hi.field_k.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("hg.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (bd) null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(byte param0, p param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        oj var13 = null;
        try {
          L0: {
            if (dl.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 64) {
                  break L1;
                } else {
                  hg.a(-79);
                  break L1;
                }
              }
              var13 = mm.field_m[0];
              var3 = jj.a(param1, 1, var13);
              if (var3 > 16.0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = nh.a(-12149, param1, var13);
                  var7 = 16.0;
                  if (-1 != (var13.field_t ^ -1)) {
                    var9 = (double)var13.field_t * Math.cos(3.141592653589793 * var13.field_K / 128.0);
                    var11 = (double)var13.field_t * Math.sin(3.141592653589793 * var13.field_K / 128.0);
                    var9 = var9 + var7 * Math.cos(var5 * 3.141592653589793 / 128.0);
                    var11 = var11 + Math.sin(3.141592653589793 * var5 / 128.0) * var7;
                    var5 = 128.0 * Math.atan2(var11, var9) / 3.141592653589793;
                    var7 = Math.sqrt(var11 * var11 + var9 * var9);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var13.field_K = var5;
                var13.field_t = Math.min(16, (int)var7);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("hg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
        field_e = 0;
        field_c = "This password contains your email address, and would be easy to guess";
        field_d = "Back";
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
