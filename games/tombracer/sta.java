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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          stackOut_1_0 = var2;
          stackOut_1_1 = this.field_w.length;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            if (stackIn_2_0 < stackIn_2_1) {
              var8 = this.field_F.length;
              var7 = var3;
              if (var6 != 0) {
                if (var7 != var8) {
                  this.field_F = (int[]) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (var7 < var8) {
                  var4 = 0;
                  if (var2 >= this.field_w.length) {
                    var3++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      if (param0 != 88) {
                        this.field_F = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    stackOut_18_0 = this.field_C.length;
                    stackOut_18_1 = var4;
                    stackIn_2_0 = stackOut_18_0;
                    stackIn_2_1 = stackOut_18_1;
                    continue L1;
                  }
                } else {
                  if (param0 != 88) {
                    this.field_F = (int[]) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 != 88) {
                this.field_F = (int[]) null;
                return;
              } else {
                return;
              }
            }
          }
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
        int[] var21 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_C[this.field_C.length - 1];
              var6 = this.field_F[this.field_F.length + -1];
              if (-1 <= (param2 ^ -1)) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_C[-1 + param2];
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * this.field_m / var5_int;
              if (param0 > 0) {
                stackOut_6_0 = this.field_F[param0 - 1];
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
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
                    if (var20 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
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
                    if (var20 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              L7: {
                if (var12 != 16) {
                  break L7;
                } else {
                  var14 = -var16 + var7 - -var9 >> 1962241089;
                  if (var20 == 0) {
                    break L4;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var12 != 32) {
                  break L8;
                } else {
                  var14 = -var16 + var9;
                  if (var20 == 0) {
                    break L4;
                  } else {
                    break L8;
                  }
                }
              }
              var14 = var7;
              break L4;
            }
            L9: {
              L10: {
                var17 = param1.field_p;
                if (-var8 + var10 <= var17) {
                  break L10;
                } else {
                  if (0 == (2 & this.field_I[var11])) {
                    break L10;
                  } else {
                    var15 = var8;
                    var17 = var10 - var8;
                    if (var20 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L11: {
                if (var17 <= -var8 + var10) {
                  break L11;
                } else {
                  if ((this.field_I[var11] & 8) == 0) {
                    break L11;
                  } else {
                    var17 = -var8 + var10;
                    var15 = var8;
                    if (var20 == 0) {
                      break L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L12: {
                if (-65 != (var13 ^ -1)) {
                  break L12;
                } else {
                  var15 = var10 + (var8 - var17) >> -2117289343;
                  if (var20 == 0) {
                    break L9;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (128 != var13) {
                  break L13;
                } else {
                  var15 = -var17 + var10;
                  if (var20 == 0) {
                    break L9;
                  } else {
                    break L13;
                  }
                }
              }
              var15 = var8;
              break L9;
            }
            var18 = this.field_z;
            var19 = this.field_x;
            param1.a((byte) -31, var16 - var18 * 2, -(2 * var19) + var17, var14 - -var18, var15 - -var19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var5);
            stackOut_33_1 = new StringBuilder().append("sta.V(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L14;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L14;
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
          if (null == this.field_F) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_F.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var9 = new int[param2 * var4];
        var8 = var9;
        var5 = var8;
        if (null != this.field_I) {
          if ((this.field_I.length ^ -1) < -1) {
            if (-1 <= (var9.length ^ -1)) {
              this.field_I = var5;
              if (param1 >= -100) {
                field_H = (String) null;
                return;
              } else {
                return;
              }
            } else {
              if (-1 <= (param0 ^ -1)) {
                this.field_I = var5;
                if (param1 >= -100) {
                  field_H = (String) null;
                  return;
                } else {
                  return;
                }
              } else {
                var6 = 0;
                L1: while (true) {
                  if (var4 <= var6) {
                    this.field_I = var5;
                    if (param1 >= -100) {
                      field_H = (String) null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    lua.a(this.field_I, var6 * param0, var5, var6 * param2, Math.min(param0, param2));
                    var6++;
                    if (var7 != 0) {
                      if (param1 >= -100) {
                        field_H = (String) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            }
          } else {
            this.field_I = var5;
            if (param1 >= -100) {
              field_H = (String) null;
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_I = var5;
          if (param1 >= -100) {
            field_H = (String) null;
            return;
          } else {
            return;
          }
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
        int var4 = 0;
        int[] var5 = null;
        ae var6 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (this.field_C == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_C.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param0 == 28705) {
          var5 = new int[var4 * param2];
          if (this.field_I != null) {
            if (0 < this.field_I.length) {
              if (-1 > (var5.length ^ -1)) {
                if (-1 > (param1 ^ -1)) {
                  lua.a(this.field_I, 0, var5, 0, Math.min(param1, param2) * var4);
                  this.field_I = var5;
                  return;
                } else {
                  this.field_I = var5;
                  return;
                }
              } else {
                this.field_I = var5;
                return;
              }
            } else {
              this.field_I = var5;
              return;
            }
          } else {
            this.field_I = var5;
            return;
          }
        } else {
          var6 = (ae) null;
          this.b(9, (ae) null, 31);
          var5 = new int[var4 * param2];
          if (this.field_I != null) {
            if (0 < this.field_I.length) {
              if (-1 > (var5.length ^ -1)) {
                if (-1 > (param1 ^ -1)) {
                  lua.a(this.field_I, 0, var5, 0, Math.min(param1, param2) * var4);
                  this.field_I = var5;
                  return;
                } else {
                  this.field_I = var5;
                  return;
                }
              } else {
                this.field_I = var5;
                return;
              }
            } else {
              this.field_I = var5;
              return;
            }
          } else {
            this.field_I = var5;
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        ae[] var5 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != this.field_C) {
            stackOut_2_0 = this.field_C.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new ae[var4 * param0];
        if (null != this.field_w) {
          if (-1 > (this.field_w.length ^ -1)) {
            L1: {
              if ((var5.length ^ -1) >= -1) {
                break L1;
              } else {
                if (param1 > 0) {
                  lua.a(this.field_w, 0, var5, 0, var4 * Math.min(param1, param0));
                  break L1;
                } else {
                  if (param2 != 0) {
                    return;
                  } else {
                    this.field_w = var5;
                    return;
                  }
                }
              }
            }
            if (param2 != 0) {
              return;
            } else {
              this.field_w = var5;
              return;
            }
          } else {
            if (param2 != 0) {
              return;
            } else {
              this.field_w = var5;
              return;
            }
          }
        } else {
          if (param2 != 0) {
            return;
          } else {
            this.field_w = var5;
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                L2: {
                  var5_int = param2;
                  if (-99 != (var5_int ^ -1)) {
                    break L2;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var5_int ^ -1) != -100) {
                    break L3;
                  } else {
                    if (var6 == 0) {
                      stackOut_16_0 = this.a(this.field_C.length, param1, 0);
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (96 == var5_int) {
                  stackOut_18_0 = this.a(param1, 1);
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (var5_int != 97) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if (var6 == 0) {
                      stackOut_20_0 = this.a((byte) 43, param1);
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_14_0 = this.a(param1, (byte) -14, this.field_C.length);
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("sta.P(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_23_0 != 0;
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
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("sta.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean g(byte param0) {
        if (param0 == 97) {
          if (wba.field_o != null) {
            if (!wba.field_o.a((byte) -127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_G = (String) null;
          if (wba.field_o != null) {
            if (!wba.field_o.a((byte) -127)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        ae[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (this.field_F == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_F.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new ae[param0 * var4];
        if (param2 == 192) {
          if (null != this.field_w) {
            if (-1 > (this.field_w.length ^ -1)) {
              if (-1 > (var5.length ^ -1)) {
                if (param1 > 0) {
                  var6 = 0;
                  L1: while (true) {
                    if (var4 > var6) {
                      lua.a(this.field_w, param1 * var6, var5, param0 * var6, Math.min(param1, param0));
                      var6++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        return;
                      }
                    } else {
                      this.field_w = var5;
                      return;
                    }
                  }
                } else {
                  this.field_w = var5;
                  return;
                }
              } else {
                this.field_w = var5;
                return;
              }
            } else {
              this.field_w = var5;
              return;
            }
          } else {
            this.field_w = var5;
            return;
          }
        } else {
          this.field_F = (int[]) null;
          if (null != this.field_w) {
            if (-1 > (this.field_w.length ^ -1)) {
              if (-1 > (var5.length ^ -1)) {
                if (param1 > 0) {
                  var6 = 0;
                  L2: while (true) {
                    if (var4 > var6) {
                      lua.a(this.field_w, param1 * var6, var5, param0 * var6, Math.min(param1, param0));
                      var6++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        return;
                      }
                    } else {
                      this.field_w = var5;
                      return;
                    }
                  }
                } else {
                  this.field_w = var5;
                  return;
                }
              } else {
                this.field_w = var5;
                return;
              }
            } else {
              this.field_w = var5;
              return;
            }
          } else {
            this.field_w = var5;
            return;
          }
        }
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
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_C != null) {
                stackOut_3_0 = this.field_C.length;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var3_int = stackIn_4_0;
            var4 = param0.length;
            this.field_C = param0;
            var5 = param0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 >= var5.length) {
                    break L4;
                  } else {
                    var7 = var7 + var5[var6];
                    var5[var6] = var7 + var5[var6];
                    var6++;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6 = -21 / ((-43 - param1) / 50);
                this.e(var4, var3_int, 192);
                this.d(var3_int, -110, var4);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("sta.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != this.field_F) {
                stackOut_3_0 = this.field_F.length;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              var4 = param0.length;
              this.field_F = param0;
              var5 = param0;
              if (param1 == 48) {
                break L2;
              } else {
                field_G = (String) null;
                break L2;
              }
            }
            var6 = 0;
            var7 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var6 >= var5.length) {
                    break L5;
                  } else {
                    var7 = var7 + var5[var6];
                    var5[var6] = var7 + var5[var6];
                    var6++;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.c(var4, var3_int, 0);
                this.f(param1 + 28657, var3_int, var4);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("sta.U(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
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
