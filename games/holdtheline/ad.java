/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static ll field_b;
    static int field_c;
    static boolean field_a;
    static int[] field_d;

    public static void b(byte param0) {
        int var1 = -20 / ((81 - param0) / 40);
        field_d = null;
        field_b = null;
    }

    final static ui a(int param0, int param1, el param2) {
        RuntimeException var3 = null;
        ui stackIn_2_0 = null;
        ui stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_3_0 = null;
        ui stackOut_1_0 = null;
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
            if (param0 == 255) {
              stackOut_3_0 = lg.a(db.a(param2, 100, param1), (byte) -68);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ui) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        hj var4 = null;
        ki var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            var5 = (ki) ((Object) sl.field_b.b((byte) 94));
            var1 = var5;
            if (var1 != null) {
              L1: {
                if (param0 > 80) {
                  break L1;
                } else {
                  var4 = (hj) null;
                  ad.a((int[]) null, 0.6495102643966675f, (byte) -45, 0.5647060871124268f, (hj) null);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= var1.field_p) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null != var5.field_k[var2]) {
                      if (0 != var5.field_k[var2].field_d) {
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null == var5.field_l[var2]) {
                      break L4;
                    } else {
                      if (0 == var5.field_l[var2].field_d) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "ad.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 10 / ((-30 - param0) / 44);
        if (0 != (ra.field_ab ^ -1)) {
            mn.field_b = ld.field_b << -1956267568 | ra.field_ab;
        } else {
            if (!(!na.field_k)) {
                mn.field_b = -1;
                qj.field_I = -1;
            }
        }
        hm.a((byte) 66, mn.field_b);
        ra.field_ab = -1;
    }

    final static void a(int[] param0, float param1, byte param2, float param3, hj param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var24 = HoldTheLine.field_D;
        try {
          L0: {
            gf.a();
            gf.a(param0, 0, param0.length);
            gf.c();
            var5_int = 51 % ((param2 - 26) / 33);
            L1: while (true) {
              if (!gf.d()) {
                break L0;
              } else {
                L2: {
                  var6 = gf.field_g;
                  if ((var6 ^ -1) > -1) {
                    var6 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = gf.field_b;
                  if (var7 >= tc.field_j) {
                    var7 = -1 + tc.field_j;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var8 = gf.field_a;
                  if (var8 < 0) {
                    var8 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (tc.field_c <= var8) {
                    var8 = -1 + tc.field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var9 = var6 % param4.field_s;
                var10 = var8 % param4.field_y;
                var11 = var8 * tc.field_j + var6;
                var12 = var10 * param4.field_s + var9;
                var13 = param4.field_s - var9;
                var14 = -var6 + var7;
                L6: while (true) {
                  var14--;
                  if (0 > var14) {
                    continue L1;
                  } else {
                    L7: {
                      var15 = tc.field_b[var11] & 16711680;
                      var16 = tc.field_b[var11] & 65280;
                      var17 = tc.field_b[var11] & 255;
                      var18 = 16711680 & param4.field_z[var12];
                      var19 = 65280 & param4.field_z[var12];
                      var20 = 255 & param4.field_z[var12];
                      if (param3 >= 0.0f) {
                        var21 = (int)(param3 * 256.0f);
                        var22 = 256 - var21;
                        var18 = var21 * 16711680 + var22 * var18 >>> -232238296;
                        var19 = var21 * 65280 + var19 * var22 >>> 1721527208;
                        var20 = var20 * var22 + 255 * var21 >>> -531361112;
                        break L7;
                      } else {
                        var21 = (int)((1.0f + param3) * 256.0f);
                        var19 = var21 * var19 >>> 207692680;
                        var18 = var18 * var21 >>> 1630221640;
                        var20 = var20 * var21 >>> -1641947256;
                        break L7;
                      }
                    }
                    var21 = (int)(param1 * (float)(-var15 + var18)) + var15;
                    var22 = (int)(param1 * (float)(-var16 + var19)) + var16;
                    var23 = (int)((float)(-var17 + var20) * param1) + var17;
                    tc.field_b[var11] = kc.a(pk.a(255, var23), kc.a(pk.a(var22, 65280), pk.a(var21, 16711680)));
                    var11++;
                    var12++;
                    var13--;
                    if (var13 == 0) {
                      var12 = var10 * param4.field_s;
                      var13 = param4.field_s;
                      continue L6;
                    } else {
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ad.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    static {
        field_b = new ll();
    }
}
