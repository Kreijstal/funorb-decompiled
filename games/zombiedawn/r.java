/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends eh {
    private int[] field_E;
    static eo field_G;
    private int field_K;
    private int field_D;
    private int[] field_C;
    static String field_J;
    static String field_I;
    int field_M;
    private int[] field_L;
    static boolean field_F;
    private int field_H;

    private final void c(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var4 = null != this.field_E ? this.field_E.length : 0;
        ga[] var5 = new ga[param2 * var4];
        if (this.field_B != null && -1 > (this.field_B.length ^ -1) && (var5.length ^ -1) < -1 && 0 < param1) {
            for (var6 = 0; var4 > var6; var6++) {
                gp.a(this.field_B, param1 * var6, var5, var6 * param2, Math.min(param1, param2));
            }
        }
        this.field_B = var5;
        if (param0 != 0) {
            this.e(-38, -87, 127);
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 6199969) {
                break L1;
              } else {
                field_J = (String) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = wm.field_d;
            L2: while (true) {
              if (var3_int >= cj.field_h.length) {
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = hd.field_s[var3_int];
                  if ((var5 ^ -1) > -1) {
                    var4 = var4 + vl.field_r;
                    break L3;
                  } else {
                    var6 = tk.a(cj.field_h[var3_int], true, true);
                    var7 = mo.field_b + -(var6 >> 421652161);
                    var4 = var4 + fe.field_H;
                    if (bf.a(-lk.field_f + var7, param0 ^ 6199969, param2, var4, (lk.field_f << 6199969) + var6, (cn.field_h << 949770209) + qh.field_f, param1)) {
                      stackIn_9_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + ((cn.field_h << -351328543) + fe.field_H - -qh.field_f);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "r.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var4 = null == this.field_E ? 0 : this.field_E.length;
        if (param0 != -1) {
            int[] var8 = (int[]) null;
            this.a(115, (int[]) null);
        }
        int[] var10 = new int[var4 * param1];
        int[] var9 = var10;
        int[] var5 = var9;
        if (null != this.field_L && (this.field_L.length ^ -1) < -1 && -1 > (var10.length ^ -1)) {
            if (!(-1 <= (param2 ^ -1))) {
                for (var6 = 0; var6 < var4; var6++) {
                    gp.a(this.field_L, param2 * var6, var5, var6 * param1, Math.min(param2, param1));
                }
            }
        }
        this.field_L = var5;
    }

    final void e(byte param0) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        ga var5;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (this.field_B.length <= var2) {
              break L1;
            } else {
              if ((var3 ^ -1) <= (this.field_E.length ^ -1)) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (this.field_B.length > var2) {
                    if (var4 < this.field_C.length) {
                      incrementValue$0 = var2;
                      var2++;
                      var5 = this.field_B[incrementValue$0];
                      if (var5 != null) {
                        this.a(127, var5, var3, var4);
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
            if (param0 >= 38) {
              break L3;
            } else {
              this.field_L = (int[]) null;
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, ga param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            var4_int = this.field_K % this.field_C.length;
            var5 = this.field_K / this.field_C.length;
            this.field_L[this.field_K] = param2;
            this.field_B[this.field_K] = param1;
            if (param0 != 0) {
                r.b(-106, 119, -26);
            }
            if (!(param1 == null)) {
                this.a(126, param1, var5, var4_int);
            }
            this.field_K = this.field_K + 1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "r.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (!super.a(-42, param1, param2, param3)) {
              var5_int = 96 / ((-83 - param0) / 32);
              var6 = param1;
              if (-99 == (var6 ^ -1)) {
                stackIn_11_0 = this.a((byte) -102, this.field_C.length, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 != var6) {
                  if (var6 == 96) {
                    stackIn_15_0 = this.a(param2, false);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (97 != var6) {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_17_0 = this.a(12139, param2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_13_0 = this.a(true, param2, this.field_C.length);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
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
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("r.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L1;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  return stackIn_19_0 != 0;
                }
              }
            }
          }
        }
    }

    r(int param0, int param1, int param2, int param3, io param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_K = 0;
        this.field_M = 92;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            gp.a(var10, 0, param5, 1);
            var9 = new int[param6];
            gp.a(var9, 0, param6, 1);
            this.a(var10, 0);
            this.a(84, var9);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "r.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != 0) {
            this.field_C = (int[]) null;
        }
        int var4 = this.field_C == null ? 0 : this.field_C.length;
        ga[] var5 = new ga[var4 * param1];
        if (this.field_B != null && 0 < this.field_B.length && (var5.length ^ -1) < -1) {
            if (!((param2 ^ -1) >= -1)) {
                gp.a(this.field_B, 0, var5, 0, var4 * Math.min(param2, param1));
            }
        }
        this.field_B = var5;
    }

    final static void a(String param0, int param1, boolean param2, String param3) {
        try {
            lk.field_k = param0;
            m.field_B = param3;
            int var4_int = -81 % ((72 - param1) / 47);
            ti.a(md.field_wb, param2, false);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "r.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = ZombieDawn.field_J;
        try {
            var3_int = null != this.field_C ? this.field_C.length : 0;
            var4 = param0.length;
            this.field_C = param0;
            var5 = param0;
            var6 = param1;
            var7 = 0;
            while (var5.length > var6) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            this.c(0, var3_int, var4);
            this.d(-1, var4, var3_int);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "r.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
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
              if (param1 == 1) {
                break L1;
              } else {
                this.field_H = -86;
                break L1;
              }
            }
            stackIn_3_0 = super.a(param0, 1, param2, param3, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("r.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(109, param1, param2, param3, param4);
        int var6 = -60 % ((-23 - param0) / 48);
    }

    private final void a(int param0, ga param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
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
        var20 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = this.field_C[-1 + this.field_C.length];
              var6 = this.field_E[this.field_E.length + -1];
              stackIn_3_0 = this.field_i;

              if (param3 > 0) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_C[-1 + param3];
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * stackIn_4_1 / var5_int;
              stackIn_6_0 = this.field_n;

              if (0 >= param2) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = this.field_E[param2 + -1];
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0 * stackIn_7_1 / var6;
              var9 = this.field_i * this.field_C[param3] / var5_int;
              var10 = this.field_n * this.field_E[param2] / var6;
              var11 = param3 + this.field_C.length * param2;
              var12 = 48 & this.field_L[var11];
              var13 = 192 & this.field_L[var11];
              var14 = param1.field_k;
              if (param0 > 110) {
                break L3;
              } else {
                this.field_D = 59;
                break L3;
              }
            }
            L4: {
              L5: {
                var15 = param1.field_j;
                var16 = param1.field_i;
                var17 = param1.field_n;
                if (var16 >= -var7 + var9) {
                  break L5;
                } else {
                  if (-1 == (1 & this.field_L[var11] ^ -1)) {
                    break L5;
                  } else {
                    var16 = var9 - var7;
                    var14 = var7;
                    break L4;
                  }
                }
              }
              L6: {
                if (-var7 + var9 >= var16) {
                  break L6;
                } else {
                  if ((4 & this.field_L[var11]) == 0) {
                    break L6;
                  } else {
                    var14 = var7;
                    var16 = var9 + -var7;
                    break L4;
                  }
                }
              }
              if (var12 == 16) {
                var14 = var9 + var7 - var16 >> 1250577089;
                break L4;
              } else {
                if ((var12 ^ -1) != -33) {
                  var14 = var7;
                  break L4;
                } else {
                  var14 = -var16 + var9;
                  break L4;
                }
              }
            }
            L7: {
              L8: {
                if (var10 - var8 <= var17) {
                  break L8;
                } else {
                  if (-1 != (2 & this.field_L[var11] ^ -1)) {
                    var15 = var8;
                    var17 = -var8 + var10;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var17 <= -var8 + var10) {
                  break L9;
                } else {
                  if ((8 & this.field_L[var11]) != 0) {
                    var17 = -var8 + var10;
                    var15 = var8;
                    break L7;
                  } else {
                    break L9;
                  }
                }
              }
              if (-65 != (var13 ^ -1)) {
                if (128 == var13) {
                  var15 = var10 - var17;
                  break L7;
                } else {
                  var15 = var8;
                  break L7;
                }
              } else {
                var15 = -var17 + var10 + var8 >> 1858572129;
                break L7;
              }
            }
            var18 = this.field_H;
            var19 = this.field_D;
            param1.a(125, var15 + var19, var14 - -var18, var16 + -(var18 * 2), -(2 * var19) + var17);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var5);

            stackIn_37_1 = new StringBuilder().append("r.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = ZombieDawn.field_J;
        try {
            var3_int = this.field_E != null ? this.field_E.length : 0;
            var4 = param1.length;
            this.field_E = param1;
            var5 = param1;
            var6 = 0;
            var7 = 0;
            while (var5.length > var6) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            if (param0 < 74) {
                this.c(-22, -86, 61);
            }
            this.e(0, var4, var3_int);
            this.b((byte) 9, var4, var3_int);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "r.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_H = param1;
        int var4 = -47 % ((param0 - -45) / 32);
        this.field_D = param2;
    }

    public static void a(int param0) {
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    private final void b(byte param0, int param1, int param2) {
        if (param0 < 1) {
            r.b(-49, -85, 107);
        }
        int var4 = null == this.field_C ? 0 : this.field_C.length;
        int[] var5 = new int[param1 * var4];
        if (null != this.field_L && this.field_L.length > 0 && (var5.length ^ -1) < -1) {
            if (!(param2 <= 0)) {
                gp.a(this.field_L, 0, var5, 0, Math.min(param2, param1) * var4);
            }
        }
        this.field_L = var5;
    }

    static {
        field_J = "Change display name";
        field_I = "No highscores";
        field_F = false;
    }
}
