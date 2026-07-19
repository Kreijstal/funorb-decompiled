/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends oj {
    int field_D;
    private int field_I;
    private boolean field_E;
    static je field_F;
    int field_z;
    static long field_G;
    static kl field_B;
    int field_H;
    private int field_A;
    private boolean field_y;

    final static rn a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rn stackIn_15_0 = null;
        rn stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_14_0 = null;
        rn stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3 >= var2_int) {
                      break L4;
                    } else {
                      var4 = param0.charAt(var3);
                      var7 = var4 ^ -1;
                      var6 = -49;
                      if (var5 != 0) {
                        if (var6 < var7) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (var6 >= var7) {
                          if (var4 <= 57) {
                            var3++;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                  if (param1 < -12) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                stackOut_14_0 = (rn) null;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_16_0 = ov.field_h;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("mb.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(ha param0, int param1) {
        if (this.field_E) {
            return;
        }
        try {
            this.field_E = true;
            param0.a(false, this.field_z, this.field_A, this.field_H, 1, this.field_D, this.field_I);
            this.field_w = param0.c(this.field_H, true, this.field_z);
            this.field_w.field_W = this.field_w.field_W | this.field_y;
            if (param1 != -26661) {
                this.field_A = -119;
            }
            fl.a(param0, param1 + 26537);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static jd a(int param0, int param1, int param2, int param3, vh param4, ha param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd var16 = null;
        int var17 = 0;
        jd stackIn_2_0 = null;
        jd stackIn_15_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_14_0 = null;
        jd stackOut_1_0 = null;
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
        try {
          L0: {
            if (param6 <= -75) {
              L1: {
                var8_int = param4.k(0);
                var9 = param4.e((byte) -104);
                var10 = param4.k(0);
                var11 = param4.a((byte) 110);
                var12 = param4.k(0);
                var13 = param4.k(0);
                var14 = param4.k(0);
                var15 = param4.k(0);
                if ((var14 ^ -1) == -256) {
                  var14 = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var16 = new jd(param3, param2, param0, var8_int >> 1859546053, var10, var11, var9, var13, 7 & var8_int, param5, var12 & 15, var12 >> -1879353052, var14, param7, var15);
                var16.field_V = param4.k(0);
                if ((var16.field_V & 4) == 0) {
                  break L2;
                } else {
                  var16.field_K = param4.h((byte) 121);
                  break L2;
                }
              }
              L3: {
                if (-1 <= (param1 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    var17 = param4.k(0);
                    if ((2 & var17) != 0) {
                      var16.field_E = param4.k(0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (0 == (1 & var17)) {
                    break L3;
                  } else {
                    var16.field_H = param4.k(0);
                    break L3;
                  }
                }
              }
              stackOut_14_0 = (jd) (var16);
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (jd) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8);
            stackOut_16_1 = new StringBuilder().append("mb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
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
            if (param5 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_15_0;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        ha var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param2.field_y = -2;
              if (param1 <= -84) {
                break L1;
              } else {
                var5 = (ha) null;
                this.a((ha) null, 15);
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("mb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        var4 = 46 % ((53 - param0) / 51);
        if (param1) {
          System.out.println("Summon event debug");
          System.out.println("Player " + this.field_D);
          System.out.println("Unit at " + this.field_z + "," + this.field_H);
          System.out.println("Type " + this.field_A + " Bonus" + this.field_I);
          var3 = "EventSummon: pos: (" + this.field_z + "," + this.field_H + "), bonus: " + this.field_I + ", player: " + this.field_D;
          return var3;
        } else {
          var3 = "EventSummon: pos: (" + this.field_z + "," + this.field_H + "), bonus: " + this.field_I + ", player: " + this.field_D;
          return var3;
        }
    }

    public static void d(byte param0) {
        jd discarded$2 = null;
        ha var2 = null;
        field_F = null;
        if (param0 <= 103) {
          var2 = (ha) null;
          discarded$2 = mb.a(48, -43, -111, 118, (vh) null, (ha) null, -109, true);
          field_B = null;
          return;
        } else {
          field_B = null;
          return;
        }
    }

    mb(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        this.field_H = param2;
        this.field_y = param5 ? true : false;
        this.field_m = 2;
        this.field_D = param4;
        this.field_I = param3;
        this.field_A = param0;
        this.field_z = param1;
    }

    mb(int param0, int param1, int param2, int param3, int param4) {
        this.field_H = param2;
        this.field_A = param0;
        this.field_m = 2;
        this.field_y = false;
        this.field_D = param4;
        this.field_z = param1;
        this.field_I = param3;
    }

    static {
    }
}
