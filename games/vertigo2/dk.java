/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends da {
    static ve field_o;
    static String field_m;
    static String field_l;
    static String field_n;

    final static er[] a(int[] param0, boolean param1, er[] param2) {
        int incrementValue$0 = 0;
        er[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        er[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        er var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new er[96];
              var4 = 0;
              var5 = 0;
              if (param1) {
                break L1;
              } else {
                dk.c((byte) -110);
                break L1;
              }
            }
            L2: while (true) {
              if (6 <= var5) {
                ro.field_g.a(89);
                stackIn_20_0 = (er[]) (var3);
                break L0;
              } else {
                if (param2[var5].field_y == param2[var5].field_t) {
                  param0[var5] = (-param2[var5].field_y + 512) / 8;
                  var6 = 0;
                  L3: while (true) {
                    if ((var6 ^ -1) <= -5) {
                      var5++;
                      continue L2;
                    } else {
                      var7 = 0;
                      L4: while (true) {
                        if (4 <= var7) {
                          var6++;
                          continue L3;
                        } else {
                          var8 = new er(128, 128);
                          var8.d();
                          param2[var5].c(param0[var5] + -(param2[var5].field_y * var7 / 4), param0[var5] - var6 * param2[var5].field_t / 4);
                          var9 = param0[var5] - 1;
                          L5: while (true) {
                            if (-1 < (var9 ^ -1)) {
                              incrementValue$0 = var4;
                              var4++;
                              var3[incrementValue$0] = var8;
                              var7++;
                              continue L4;
                            } else {
                              var10 = 0;
                              L6: while (true) {
                                if (var8.field_y <= var10) {
                                  var9--;
                                  continue L5;
                                } else {
                                  var8.field_F[var8.field_y * var10 - -var9] = var8.field_F[var8.field_y * var10 - -param0[var5]];
                                  var8.field_F[-var9 + ((1 + var10) * var8.field_y - 1)] = var8.field_F[-param0[var5] + var8.field_y * (var10 - -1) - 1];
                                  var8.field_F[var8.field_y * var9 - -var10] = var8.field_F[param0[var5] * var8.field_y - -var10];
                                  var8.field_F[var10 + var8.field_y * (-var9 + (-1 + var8.field_t))] = var8.field_F[var8.field_y * (-param0[var5] + -1 + var8.field_t) - -var10];
                                  var10++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  throw new IllegalArgumentException("img_in pix32s must be exactly square.");
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("dk.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        return stackIn_20_0;
    }

    public static void c(byte param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0 != -73) {
            field_n = (String) null;
        }
        field_l = null;
    }

    final static void d(byte param0) {
        int var1 = 0;
        if (tg.field_e > 32) {
            var1 = tg.field_e % 32;
            if (0 == var1) {
                var1 = 32;
            }
            pk.b(-88, -var1 + tg.field_e);
        } else {
            pk.b(-128, 0);
        }
        var1 = -81 % ((-22 - param0) / 52);
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3614) {
              if (this.a(-1, param1) == ir.field_a) {
                stackIn_6_0 = sr.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return mh.field_b;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("dk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    dk(kp param0) {
        super(param0);
    }

    final ba a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ba stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        ba stackIn_8_0 = null;
        ba stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (null != ol.a(param1, param0 + -6674)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var3_int = stackIn_6_0;
              if (var3_int != 0) {
                stackIn_10_0 = qm.field_G;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = ir.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ba) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
        field_o = new ve(1, 2, 2, 0);
        field_n = "Loading extra data";
        field_l = "Macroing or use of bots";
        field_m = "<%0> is RED";
    }
}
