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
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        ae var5;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= this.field_w.length) {
              break L1;
            } else {
              if (var3 >= this.field_F.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < this.field_w.length) {
                    if (this.field_C.length > var4) {
                      incrementValue$0 = var2;
                      var2++;
                      var5 = this.field_w[incrementValue$0];
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
              this.field_F = (int[]) null;
              break L3;
            }
          }
          return;
        }
    }

    private final void a(int param0, ae param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int[] var21 = null;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_C[this.field_C.length - 1];
              var6 = this.field_F[this.field_F.length + -1];
              if (-1 <= (param2 ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = this.field_C[-1 + param2];
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * this.field_m / var5_int;
              if (param0 > 0) {
                stackIn_7_0 = this.field_F[param0 - 1];
                break L2;
              } else {
                stackIn_7_0 = 0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0 * this.field_p / var6;
              var9 = this.field_m * this.field_C[param2] / var5_int;
              var10 = this.field_F[param0] * this.field_p / var6;
              var11 = param2 + param0 * this.field_C.length;
              var12 = this.field_I[var11] & 48;
              var13 = 192 & this.field_I[var11];
              if (param3 == 85) {
                break L3;
              } else {
                var21 = (int[]) null;
                this.a((int[]) null, -46);
                break L3;
              }
            }
            L4: {
              L5: {
                var14 = param1.field_i;
                var15 = param1.field_n;
                var16 = param1.field_m;
                if (var9 + -var7 <= var16) {
                  break L5;
                } else {
                  if (0 == (1 & this.field_I[var11])) {
                    break L5;
                  } else {
                    var14 = var7;
                    var16 = var9 - var7;
                    break L4;
                  }
                }
              }
              L6: {
                if (var16 <= var9 + -var7) {
                  break L6;
                } else {
                  if (-1 == (4 & this.field_I[var11] ^ -1)) {
                    break L6;
                  } else {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L4;
                  }
                }
              }
              if (var12 != 16) {
                if (var12 != 32) {
                  var14 = var7;
                  break L4;
                } else {
                  var14 = -var16 + var9;
                  break L4;
                }
              } else {
                var14 = -var16 + var7 - -var9 >> 1962241089;
                break L4;
              }
            }
            L7: {
              L8: {
                var17 = param1.field_p;
                if (-var8 + var10 <= var17) {
                  break L8;
                } else {
                  if (0 == (2 & this.field_I[var11])) {
                    break L8;
                  } else {
                    var15 = var8;
                    var17 = var10 - var8;
                    break L7;
                  }
                }
              }
              L9: {
                if (var17 <= -var8 + var10) {
                  break L9;
                } else {
                  if ((this.field_I[var11] & 8) == 0) {
                    break L9;
                  } else {
                    var17 = -var8 + var10;
                    var15 = var8;
                    break L7;
                  }
                }
              }
              if (-65 != (var13 ^ -1)) {
                if (128 != var13) {
                  var15 = var8;
                  break L7;
                } else {
                  var15 = -var17 + var10;
                  break L7;
                }
              } else {
                var15 = var10 + (var8 - var17) >> -2117289343;
                break L7;
              }
            }
            var18 = this.field_z;
            var19 = this.field_x;
            param1.a((byte) -31, var16 - var18 * 2, -(2 * var19) + var17, var14 - -var18, var15 - -var19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5);

            stackIn_35_1 = new StringBuilder().append("sta.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void h(byte param0) {
        if (param0 >= -35) {
            return;
        }
        field_A = null;
        field_G = null;
        field_H = null;
        field_y = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = null != this.field_F ? this.field_F.length : 0;
        int[] var5 = new int[param2 * var4];
        if (null != this.field_I && (this.field_I.length ^ -1) < -1 && -1 > (var5.length ^ -1) && -1 > (param0 ^ -1)) {
            for (var6 = 0; var4 > var6; var6++) {
                lua.a(this.field_I, var6 * param0, var5, var6 * param2, Math.min(param0, param2));
            }
        }
        this.field_I = var5;
        if (param1 >= -100) {
            field_H = (String) null;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 97) {
            return;
        }
        this.field_z = param1;
        this.field_x = param0;
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = this.field_C != null ? this.field_C.length : 0;
        if (param0 != 28705) {
            ae var6 = (ae) null;
            this.b(9, (ae) null, 31);
        }
        int[] var5 = new int[var4 * param2];
        if (this.field_I != null && 0 < this.field_I.length && -1 > (var5.length ^ -1) && -1 > (param1 ^ -1)) {
            lua.a(this.field_I, 0, var5, 0, Math.min(param1, param2) * var4);
        }
        this.field_I = var5;
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = null == this.field_C ? 0 : this.field_C.length;
        ae[] var5 = new ae[var4 * param0];
        if (null != this.field_w && -1 > (this.field_w.length ^ -1) && (var5.length ^ -1) < -1) {
            if (!(param1 <= 0)) {
                lua.a(this.field_w, 0, var5, 0, var4 * Math.min(param1, param0));
            }
        }
        if (param2 != 0) {
            return;
        }
        this.field_w = var5;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              var5_int = param2;
              if (-99 != (var5_int ^ -1)) {
                if ((var5_int ^ -1) != -100) {
                  if (96 == var5_int) {
                    stackIn_16_0 = this.a(param1, 1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var5_int != 97) {
                      stackIn_20_0 = 0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_18_0 = this.a((byte) 43, param1);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_14_0 = this.a(this.field_C.length, param1, 0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_12_0 = this.a(param1, (byte) -14, this.field_C.length);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("sta.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  return stackIn_20_0 != 0;
                }
              }
            }
          }
        }
    }

    final void b(int param0, ae param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            if (param0 != 0) {
                this.field_E = 89;
            }
            var4_int = this.field_D % this.field_C.length;
            var5 = this.field_D / this.field_C.length;
            this.field_I[this.field_D] = param2;
            this.field_w[this.field_D] = param1;
            if (!(param1 == null)) {
                this.a(var5, param1, var4_int, (byte) 85);
            }
            this.field_D = this.field_D + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sta.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = super.a(89, param1, param2, param3, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("sta.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean g(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 97) {
            break L0;
          } else {
            field_G = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wba.field_o == null) {
              break L2;
            } else {
              if (!wba.field_o.a((byte) -127)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void e(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = this.field_F != null ? this.field_F.length : 0;
        ae[] var5 = new ae[param0 * var4];
        if (param2 != 192) {
            this.field_F = (int[]) null;
        }
        if (null != this.field_w && -1 > (this.field_w.length ^ -1) && -1 > (var5.length ^ -1)) {
            if (!(param1 <= 0)) {
                for (var6 = 0; var4 > var6; var6++) {
                    lua.a(this.field_w, param1 * var6, var5, param0 * var6, Math.min(param1, param0));
                }
            }
        }
        this.field_w = var5;
    }

    sta(int param0, int param1, int param2, int param3, isa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_D = 0;
        this.field_E = 92;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            lua.a(var10, 0, param5, 1);
            var9 = new int[param6];
            lua.a(var9, 0, param6, 1);
            this.a(var10, (byte) -97);
            this.a(var9, 48);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sta.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int[] param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
            var3_int = this.field_C == null ? 0 : this.field_C.length;
            var4 = param0.length;
            this.field_C = param0;
            var5 = param0;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            var6 = -21 / ((-43 - param1) / 50);
            this.e(var4, var3_int, 192);
            this.d(var3_int, -110, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sta.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
            var3_int = null == this.field_F ? 0 : this.field_F.length;
            var4 = param0.length;
            this.field_F = param0;
            var5 = param0;
            if (param1 != 48) {
                field_G = (String) null;
            }
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            this.c(var4, var3_int, 0);
            this.f(param1 + 28657, var3_int, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sta.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    static {
        field_G = "This option cannot be combined with the current settings for:  ";
        field_B = 0;
        field_A = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "Mazes";
    }
}
