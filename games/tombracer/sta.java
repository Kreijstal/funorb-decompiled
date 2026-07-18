/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sta extends rva {
    private int[] field_F;
    private int field_x;
    int field_E;
    private int field_D;
    static String field_G;
    static String field_A;
    private int[] field_C;
    private int[] field_I;
    static nh[] field_y;
    static String field_H;
    static int field_B;
    private int field_z;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((sta) this).field_w.length) {
              break L1;
            } else {
              if (var3 >= ((sta) this).field_F.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < ((sta) this).field_w.length) {
                    if (((sta) this).field_C.length > var4) {
                      int incrementValue$1 = var2;
                      var2++;
                      var5 = ((sta) this).field_w[incrementValue$1];
                      if (var5 != null) {
                        this.a(var3, var5, var4, (byte) 85);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (param0 == 88) {
              break L3;
            } else {
              ((sta) this).field_F = null;
              break L3;
            }
          }
          return;
        }
    }

    private final void a(int param0, ae param1, int param2, byte param3) {
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((sta) this).field_C[((sta) this).field_C.length - 1];
              var6 = ((sta) this).field_F[((sta) this).field_F.length + -1];
              if (param2 <= 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((sta) this).field_C[-1 + param2];
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * ((sta) this).field_m / var5_int;
              if (param0 > 0) {
                stackOut_6_0 = ((sta) this).field_F[param0 - 1];
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = stackIn_7_0 * ((sta) this).field_p / var6;
                var9 = ((sta) this).field_m * ((sta) this).field_C[param2] / var5_int;
                var10 = ((sta) this).field_F[param0] * ((sta) this).field_p / var6;
                var11 = param2 + param0 * ((sta) this).field_C.length;
                var12 = ((sta) this).field_I[var11] & 48;
                var13 = 192 & ((sta) this).field_I[var11];
                var14 = param1.field_i;
                var15 = param1.field_n;
                var16 = param1.field_m;
                if (var9 + -var7 <= var16) {
                  break L4;
                } else {
                  if (0 == (1 & ((sta) this).field_I[var11])) {
                    break L4;
                  } else {
                    var14 = var7;
                    var16 = var9 - var7;
                    break L3;
                  }
                }
              }
              L5: {
                if (~var16 >= ~(var9 + -var7)) {
                  break L5;
                } else {
                  if ((4 & ((sta) this).field_I[var11]) == 0) {
                    break L5;
                  } else {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L3;
                  }
                }
              }
              if (var12 != 16) {
                if (var12 != 32) {
                  var14 = var7;
                  break L3;
                } else {
                  var14 = -var16 + var9;
                  break L3;
                }
              } else {
                var14 = -var16 + var7 - -var9 >> 1;
                break L3;
              }
            }
            L6: {
              L7: {
                var17 = param1.field_p;
                if (-var8 + var10 <= var17) {
                  break L7;
                } else {
                  if (0 == (2 & ((sta) this).field_I[var11])) {
                    break L7;
                  } else {
                    var15 = var8;
                    var17 = var10 - var8;
                    break L6;
                  }
                }
              }
              L8: {
                if (var17 <= -var8 + var10) {
                  break L8;
                } else {
                  if ((((sta) this).field_I[var11] & 8) == 0) {
                    break L8;
                  } else {
                    var17 = -var8 + var10;
                    var15 = var8;
                    break L6;
                  }
                }
              }
              if (var13 != 64) {
                if (128 != var13) {
                  var15 = var8;
                  break L6;
                } else {
                  var15 = -var17 + var10;
                  break L6;
                }
              } else {
                var15 = var10 + (var8 - var17) >> 1;
                break L6;
              }
            }
            var18 = ((sta) this).field_z;
            var19 = ((sta) this).field_x;
            param1.a((byte) -31, var16 - var18 * 2, -(2 * var19) + var17, var14 - -var18, var15 - -var19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("sta.V(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + 85 + ')');
        }
    }

    public static void h() {
        field_A = null;
        field_G = null;
        field_H = null;
        field_y = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (null == ((sta) this).field_F) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((sta) this).field_F.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var9 = new int[param2 * var4];
          var8 = var9;
          var5 = var8;
          if (null == ((sta) this).field_I) {
            ((sta) this).field_I = var5;
            break L1;
          } else {
            if (((sta) this).field_I.length >= -1) {
              ((sta) this).field_I = var5;
              break L1;
            } else {
              if (-1 >= var9.length) {
                ((sta) this).field_I = var5;
                break L1;
              } else {
                if (param0 <= 0) {
                  ((sta) this).field_I = var5;
                  break L1;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var4 <= var6) {
                      ((sta) this).field_I = var5;
                      break L1;
                    } else {
                      lua.a(((sta) this).field_I, var6 * param0, var5, var6 * param2, Math.min(param0, param2));
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 97) {
            return;
        }
        ((sta) this).field_z = param1;
        ((sta) this).field_x = param0;
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = ((sta) this).field_C != null ? ((sta) this).field_C.length : 0;
        int[] var5 = new int[var4 * param2];
        if (((sta) this).field_I != null) {
            if (0 < ((sta) this).field_I.length) {
                if (-1 > var5.length) {
                    if (-1 < param1) {
                        lua.a(((sta) this).field_I, 0, var5, 0, Math.min(param1, param2) * var4);
                    }
                }
            }
        }
        ((sta) this).field_I = var5;
    }

    private final void c(int param0, int param1) {
        int var4 = null == ((sta) this).field_C ? 0 : ((sta) this).field_C.length;
        ae[] var5 = new ae[var4 * param0];
        if (null != ((sta) this).field_w) {
            if (((sta) this).field_w.length > 0) {
                if (var5.length > 0) {
                    if (!(param1 <= 0)) {
                        lua.a((Object[]) (Object) ((sta) this).field_w, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        ((sta) this).field_w = var5;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0 = false;
        int stackOut_19_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              var5_int = param2;
              if (var5_int != 98) {
                if (var5_int != 99) {
                  if (96 == var5_int) {
                    stackOut_15_0 = ((sta) this).a(param1, 1);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    if (var5_int != 97) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      stackOut_17_0 = ((sta) this).a((byte) 43, param1);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_13_0 = ((sta) this).a(((sta) this).field_C.length, param1, 0);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                stackOut_11_0 = ((sta) this).a(param1, (byte) -14, ((sta) this).field_C.length);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("sta.P(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final void b(int param0, ae param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            if (param0 != 0) {
                ((sta) this).field_E = 89;
            }
            var4_int = ((sta) this).field_D % ((sta) this).field_C.length;
            var5 = ((sta) this).field_D / ((sta) this).field_C.length;
            ((sta) this).field_I[((sta) this).field_D] = param2;
            ((sta) this).field_w[((sta) this).field_D] = param1;
            if (!(param1 == null)) {
                this.a(var5, param1, var4_int, (byte) 85);
            }
            ((sta) this).field_D = ((sta) this).field_D + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sta.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param0 > 70) {
                break L1;
              } else {
                field_B = -13;
                break L1;
              }
            }
            stackOut_2_0 = super.a(89, param1, param2, param3, param4, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("sta.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean g() {
        return wba.field_o != null && wba.field_o.a((byte) -127);
    }

    private final void e(int param0, int param1) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = ((sta) this).field_F != null ? ((sta) this).field_F.length : 0;
        ae[] var5 = new ae[param0 * var4];
        if (null != ((sta) this).field_w) {
            if (-1 > ((sta) this).field_w.length) {
                if (-1 < var5.length) {
                    if (!(param1 <= 0)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            lua.a((Object[]) (Object) ((sta) this).field_w, param1 * var6, (Object[]) (Object) var5, param0 * var6, Math.min(param1, param0));
                        }
                    }
                }
            }
        }
        ((sta) this).field_w = var5;
    }

    sta(int param0, int param1, int param2, int param3, isa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        ((sta) this).field_D = 0;
        ((sta) this).field_E = 92;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            lua.a(var10, 0, param5, 1);
            var9 = new int[param6];
            lua.a(var9, 0, param6, 1);
            int discarded$0 = -97;
            this.a(var10);
            this.a(var9, 48);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sta.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int[] param0) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
            var3_int = ((sta) this).field_C == null ? 0 : ((sta) this).field_C.length;
            var4 = param0.length;
            ((sta) this).field_C = param0;
            var5 = param0;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            var6 = -21;
            int discarded$0 = 192;
            this.e(var4, var3_int);
            this.d(var3_int, -110, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sta.M(" + (param0 != null ? "{...}" : "null") + ',' + -97 + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
            var3_int = null == ((sta) this).field_F ? 0 : ((sta) this).field_F.length;
            var4 = param0.length;
            ((sta) this).field_F = param0;
            var5 = param0;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            int discarded$0 = 0;
            this.c(var4, var3_int);
            this.f(28705, var3_int, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sta.U(" + (param0 != null ? "{...}" : "null") + ',' + 48 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "This option cannot be combined with the current settings for:  ";
        field_B = 0;
        field_A = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "Mazes";
    }
}
