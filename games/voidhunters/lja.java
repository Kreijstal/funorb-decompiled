/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja implements ntb {
    static String field_c;
    int field_e;
    static int field_b;
    static int field_d;
    int field_g;
    private int field_h;
    private int field_a;
    static int field_f;

    final void a(int param0, lta param1, int[] param2, int param3, pe param4, int param5, int param6) {
        RuntimeException var8 = null;
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
        anb var21 = null;
        ml var22 = null;
        mqb var23 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var23 = param4.h(this.field_e, -125);
              if (param6 >= 73) {
                break L1;
              } else {
                this.field_a = 55;
                break L1;
              }
            }
            L2: {
              if (var23 != null) {
                L3: {
                  var9 = skb.a(param2, 84);
                  var10 = param5 + (var9 * fc.a(param0, (byte) -96) >> -1861322640);
                  var11 = param3 + (eu.a(param0, 85) * var9 >> 1923524368);
                  var12 = -var10 + var23.d(false);
                  var13 = -var11 + var23.g((byte) 124);
                  var14 = ar.a(var12, (byte) 118, var13);
                  var15 = -this.field_a + var14;
                  var16 = 39219;
                  if (0 >= var15) {
                    break L3;
                  } else {
                    L4: {
                      var17 = var15 * 512 / this.field_a;
                      if (-256 > (var17 ^ -1)) {
                        var17 = 255;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var16 = 39219 + (var17 << 622535856);
                    break L3;
                  }
                }
                var17 = param1.a(var23.d(false), (byte) 115);
                var18 = param1.b(true, var23.g((byte) 119));
                var19 = param1.a(var10, (byte) 122);
                var20 = param1.b(true, var11);
                c.a(var18, var17, var19, var20, -16777216, var16);
                if (-1 >= (var23.l((byte) -68) ^ -1)) {
                  var21 = param4.d((byte) -27, var23.l((byte) -102));
                  if (var21 == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var22 = var21.field_k.c(var23.l(127), -97);
                    if (var22 != null) {
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8);
            stackOut_16_1 = new StringBuilder().append("lja.L(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
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

    private final void a(int param0, mqb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 == 32) {
              L1: {
                if (this.field_h == ls.field_r) {
                  break L1;
                } else {
                  this.field_h = ls.field_r;
                  param1.f(true);
                  param1.a(param0 ^ 86, true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("lja.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d(byte param0) {
        if (param0 != 126) {
            return -65;
        }
        if (1 == fra.field_a) {
            return 2048;
        }
        return ldb.field_q;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, byte param7, pe param8, int param9, anb param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        mqb var22 = null;
        int var23 = 0;
        int var24 = 0;
        mqb var25 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param7 > 3) {
                break L1;
              } else {
                this.field_a = 3;
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != this.field_e) {
                  break L3;
                } else {
                  if (this.field_g == 0) {
                    var12_int = param5 + (param9 * fc.a(param4, (byte) 30) - eu.a(param4, 103) * param6 >> -285842064);
                    var13 = param1 + (param9 * eu.a(param4, 43) - -(fc.a(param4, (byte) 87) * param6) >> -1960165136);
                    var14 = skb.a(param2, -71);
                    var15 = param5 + (fc.a(param4, (byte) -63) * var14 >> -143681328);
                    var16 = (var14 * eu.a(param4, 76) >> 766985616) + param1;
                    var17 = -var12_int + param0;
                    var18 = param3 + -var13;
                    var19 = ecb.a(var18, (byte) -77, var17);
                    var20 = rrb.a(22433, var19 - param4);
                    if (-257 > (Math.abs(var20) ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        this.field_a = bia.field_c;
                        var21 = -1;
                        if (param10 instanceof sg) {
                          var21 = ((sg) ((Object) param10)).o((byte) -117);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var22 = new mqb(new ml(28), param10.field_l, var21);
                      var14 = skb.a(var22.field_k.i((byte) -112).field_v, 80);
                      var22.a(param4, -17);
                      var23 = fc.a(param4, (byte) -127) * var14 >> -2083378608;
                      var24 = eu.a(param4, 77) * var14 >> 55766128;
                      var22.a(var23 * 2 + var15, var24 * 2 + var16, (byte) 100);
                      param8.a((byte) 67, var22);
                      var22.field_h = param10.field_h;
                      var22.field_f = param10.field_f;
                      qba.a(20382, var15, 12, var16, 50);
                      var22.a(var16, param4, var15, joa.field_a, 1948934248);
                      param10.a(var16, rrb.a(22433, param4 - -4096), var15, joa.field_a, 1948934248);
                      this.field_e = var22.field_l;
                      this.field_g = pca.field_i[0].d((byte) 64);
                      this.field_h = this.field_a;
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var25 = param8.h(this.field_e, -103);
              if (var25 != null) {
                L5: {
                  if (-1 == var25.l((byte) 123)) {
                    break L5;
                  } else {
                    qba.a(20382, var25.d(false), 13, var25.g((byte) -69), 50);
                    break L5;
                  }
                }
                this.a(32, var25);
                qba.a(20382, param5, 14, param1, 50);
                break L2;
              } else {
                break L2;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var12 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var12);
            stackOut_18_1 = new StringBuilder().append("lja.O(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param8 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param9).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param10 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void e(byte param0) {
        String var2 = (String) null;
        uhb.a((String) null, bfa.field_p, 0);
        if (param0 <= 11) {
            lja.e((byte) 76);
        }
    }

    final void a(anb param0, pe param1, int param2, boolean param3, byte param4, int param5, int param6, int[] param7) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        anb var17 = null;
        ml var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        mqb var33 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var32 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var33 = param1.h(this.field_e, -126);
              if (var33 == null) {
                L2: {
                  if (this.field_e != -1) {
                    this.field_e = -1;
                    param0.d((byte) -85);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-1 <= (this.field_g ^ -1)) {
                  break L1;
                } else {
                  this.field_g = this.field_g - 1;
                  param0.d((byte) 40);
                  break L1;
                }
              } else {
                L3: {
                  param0.d((byte) -74);
                  var10 = skb.a(param7, -82);
                  var11 = param5 + (var10 * fc.a(param6, (byte) -125) >> 1130576432);
                  var12 = param2 - -(var10 * eu.a(param6, 39) >> -933493168);
                  var13 = var33.d(false) - var11;
                  var14 = var33.g((byte) -54) - var12;
                  var15 = ar.a(var13, (byte) 114, var14);
                  var16 = var15 - this.field_a;
                  if (-1 <= (var16 ^ -1)) {
                    break L3;
                  } else {
                    var13 = (var13 << 12736648) / this.field_a;
                    var14 = (var14 << 1888209320) / this.field_a;
                    var17_int = var16 / Math.max(1, this.field_a >> -272195576);
                    if (bhb.field_i < var15) {
                      discarded$2 = var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -109);
                      break L3;
                    } else {
                      L4: {
                        if (var17_int > nra.field_b) {
                          var17_int = nra.field_b;
                          var16 = var17_int * this.field_a >> 311951496;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var18_int = (var16 * uua.field_o >> 1792144072) * var13;
                      var19 = var18_int >> -501063160;
                      var20 = var14 * (uua.field_o * var16 >> -1467857048);
                      var21_int = var20 >> -1515884184;
                      var33.a(-var21_int, var33.d(false), var33.g((byte) 122), (byte) -128, -var19);
                      param0.a(var21_int, var11, var12, (byte) -117, var19);
                      if (-1 != var33.l((byte) -106)) {
                        break L3;
                      } else {
                        this.a(32, var33);
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (var33.l((byte) 120) >= 0) {
                    var17 = param1.d((byte) -27, var33.l((byte) 121));
                    if (var17 != null) {
                      var18 = var17.field_k.c(var33.l(-109), -121);
                      if (var18 != null) {
                        L6: {
                          if (this.field_h > bia.field_c >> 1462780513) {
                            this.field_h = bia.field_c >> -940783295;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var19 = eu.a(var18.field_b, 126);
                        var20 = fc.a(var18.field_b, (byte) -76);
                        var21 = (long)var18.field_r + ((long)var20 * (long)var33.o(23463) - (long)var33.q(32) * (long)var19 >> -2017703088);
                        var23 = (long)var18.field_n + ((long)var33.o(23463) * (long)var19 + (long)var33.q(32) * (long)var20 >> -167801136);
                        var25 = (int)var21 + -var33.d(false);
                        var26 = (int)var23 - var33.g((byte) -29);
                        var27 = var33.c((byte) -121) + -var17.c((byte) -112);
                        var28 = var33.f(0) - var17.f(0);
                        var29 = Math.min(var33.e(false), var17.e(false) / 4);
                        var30 = (var25 - var27) * var29 / 2;
                        var31 = (-var28 + var26) * var29 / 2;
                        var33.a(var31, var33.d(false), var33.g((byte) 124), (byte) -118, var30);
                        var17.a(-var31, (int)var21, (int)var23, (byte) -123, -var30);
                        break L5;
                      } else {
                        var33.f(true);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var33.f(true);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (this.field_a <= this.field_h) {
                    break L7;
                  } else {
                    L8: {
                      this.field_a = this.field_a - ds.field_d;
                      if (this.field_h <= this.field_a) {
                        break L8;
                      } else {
                        this.field_a = this.field_h;
                        break L8;
                      }
                    }
                    if (this.field_h != ls.field_r) {
                      break L7;
                    } else {
                      if (0 <= var33.l((byte) -34)) {
                        var33.f(true);
                        var33.field_f = 0;
                        var33.field_h = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (param3) {
                  discarded$3 = var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -114);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var10 = 51 % ((param4 - 69) / 57);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var9 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var9);
            stackOut_39_1 = new StringBuilder().append("lja.N(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          L10: {
            stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param7 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
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

    public static void c(byte param0) {
        int var1 = 87 % ((46 - param0) / 63);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_e, 32);
            if (param1 >= -109) {
                this.field_a = -1;
            }
            param0.a(-632, this.field_h, 32);
            param0.a(-632, this.field_a, 32);
            param0.a(-632, this.field_g, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lja.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 != -113) {
            return true;
        }
        return this.field_e == -1 ? true : false;
    }

    public lja() {
        this.field_e = -1;
    }

    final int a(byte param0) {
        if (param0 != 12) {
            field_d = -53;
        }
        return dla.field_c;
    }

    final void a(pe param0, int param1) {
        mqb var3 = null;
        RuntimeException var3_ref = null;
        pe var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 19278) {
                break L1;
              } else {
                var4 = (pe) null;
                this.a(-123, (lta) null, (int[]) null, -18, (pe) null, 75, 40);
                break L1;
              }
            }
            L2: {
              var3 = param0.h(this.field_e, 101);
              if (var3 != null) {
                var3.n(620);
                this.field_e = -1;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3_ref);
            stackOut_6_1 = new StringBuilder().append("lja.I(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        lja var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var5 = (lja) ((Object) param0);
            if (param1 <= -19) {
              L1: {
                var4 = 0;
                if (var5.field_e == this.field_e) {
                  break L1;
                } else {
                  var4 = 1;
                  System.out.println("int hook_id has changed. before=" + var5.field_e + ", now=" + this.field_e);
                  break L1;
                }
              }
              L2: {
                if (var5.field_h == this.field_h) {
                  break L2;
                } else {
                  System.out.println("int target_rope_length has changed. before=" + var5.field_h + ", now=" + this.field_h);
                  var4 = 1;
                  break L2;
                }
              }
              L3: {
                if (var5.field_a == this.field_a) {
                  break L3;
                } else {
                  System.out.println("int rope_length has changed. before=" + var5.field_a + ", now=" + this.field_a);
                  var4 = 1;
                  break L3;
                }
              }
              L4: {
                if (var5.field_g != this.field_g) {
                  System.out.println("int reload has changed. before=" + var5.field_g + ", now=" + this.field_g);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var4 != 0) {
                  System.out.println("This instance of GrappleLauncherBehaviour has changed");
                  break L5;
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("lja.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_e = param0.i(0, 32);
              this.field_h = param0.i(0, 32);
              this.field_a = param0.i(0, 32);
              this.field_g = param0.i(0, 32);
              if (!param1) {
                break L1;
              } else {
                this.field_g = -16;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("lja.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        lja var4 = null;
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
        int stackOut_5_0 = 0;
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
              L2: {
                var3_int = -37 % ((param0 - 22) / 59);
                var4 = (lja) ((Object) param1);
                if (this.field_e != var4.field_e) {
                  break L2;
                } else {
                  if (var4.field_h != this.field_h) {
                    break L2;
                  } else {
                    if (this.field_a != var4.field_a) {
                      break L2;
                    } else {
                      if (this.field_g == var4.field_g) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("lja.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        lja var6 = null;
        lja var7 = null;
        try {
            var6 = (lja) ((Object) param1);
            var7 = var6;
            var7.field_h = this.field_h;
            if (param0 <= 54) {
                anb var4 = (anb) null;
                this.a(-126, -1, (int[]) null, -127, 86, -67, -61, (byte) 75, (pe) null, -84, (anb) null);
            }
            var7.field_e = this.field_e;
            var7.field_g = this.field_g;
            var7.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lja.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Win by destroying the enemy VIP";
        field_b = 80;
        field_d = 1;
    }
}
