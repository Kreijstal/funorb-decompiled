/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends ji {
    private int field_K;
    private int field_J;
    private int field_B;
    static String field_L;
    static String field_A;
    private int field_D;
    static int field_y;
    private int field_z;
    private int field_C;
    static int[] field_H;
    private int field_I;
    static int field_G;
    private int field_F;
    private int field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        tg.a((byte) -50);
        if (param3 != -30486) {
          field_y = 78;
          bi.c(param2, param0, param1, param4);
          return;
        } else {
          bi.c(param2, param0, param1, param4);
          return;
        }
    }

    public static void b(byte param0) {
        field_H = null;
        field_L = null;
        field_A = null;
        if (param0 == -118) {
            return;
        }
        field_y = 20;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = Vertigo2.field_L ? 1 : 0;
          if ((param3 ^ -1) >= -2049) {
            stackIn_3_0 = param3 * (4096 + param0) >> 1420937356;
            break L0;
          } else {
            stackIn_3_0 = -(param0 * param3 >> -1240887252) + (param3 + param0);
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param1) {
          if (0 < var5) {
            param2 = param2 * 6;
            var6 = -var5 + param3 + param3;
            var7 = (-var6 + var5 << -877878164) / var5;
            var8 = param2 >> 321980812;
            var9 = param2 + -(var8 << 1306561868);
            var10 = var5;
            var10 = var10 * var7 >> 1763568332;
            var10 = var9 * var10 >> 1767661164;
            var11 = var6 - -var10;
            var12 = var5 + -var10;
            var13 = var8;
            if (0 != var13) {
              if (-2 != (var13 ^ -1)) {
                if (var13 != 2) {
                  if (3 != var13) {
                    if (var13 != 4) {
                      if (-6 != (var13 ^ -1)) {
                        return;
                      } else {
                        this.field_z = var6;
                        this.field_F = var5;
                        this.field_B = var12;
                        return;
                      }
                    } else {
                      this.field_z = var6;
                      this.field_B = var5;
                      this.field_F = var11;
                      return;
                    }
                  } else {
                    this.field_z = var12;
                    this.field_F = var6;
                    this.field_B = var5;
                    return;
                  }
                } else {
                  this.field_z = var5;
                  this.field_F = var6;
                  this.field_B = var11;
                  return;
                }
              } else {
                this.field_F = var12;
                this.field_z = var5;
                this.field_B = var6;
                return;
              }
            } else {
              this.field_z = var11;
              this.field_F = var5;
              this.field_B = var6;
              return;
            }
          } else {
            this.field_B = param3;
            this.field_z = param3;
            this.field_F = param3;
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (-1 != (var4_int ^ -1)) {
                if ((var4_int ^ -1) == -2) {
                  this.field_D = (param2.g(111) << -537177300) / 100;
                  break L1;
                } else {
                  if (-3 == (var4_int ^ -1)) {
                    this.field_I = (param2.g(81) << -1779215636) / 100;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                this.field_J = param2.n(2);
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                this.field_z = -99;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("jb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public jb() {
        super(1, false);
        this.field_J = 0;
        this.field_D = 0;
        this.field_I = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param1 < param2) {
            stackIn_3_0 = param2;
            break L0;
          } else {
            stackIn_3_0 = param1;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param3 == 12288) {
          L1: {
            if (var5 < param0) {
              stackIn_8_0 = param0;
              break L1;
            } else {
              stackIn_8_0 = var5;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_8_0;
            if (param1 > param2) {
              stackIn_11_0 = param2;
              break L2;
            } else {
              stackIn_11_0 = param1;
              break L2;
            }
          }
          L3: {
            var6 = stackIn_11_0;
            if (var6 <= param0) {
              stackIn_14_0 = var6;
              break L3;
            } else {
              stackIn_14_0 = param0;
              break L3;
            }
          }
          var6 = stackIn_14_0;
          var7 = var5 + -var6;
          this.field_E = (var5 + var6) / 2;
          if ((this.field_E ^ -1) >= -1) {
            this.field_K = 0;
            if (-1 > (var7 ^ -1)) {
              var8 = (var5 - param2 << -1816751796) / var7;
              var9 = (var5 - param1 << 1705437100) / var7;
              var10 = (var5 + -param0 << 346720364) / var7;
              if (var5 == param2) {
                L4: {
                  stackIn_52_0 = this;

                  if (var6 != param1) {
                    stackIn_53_0 = this;
                    stackIn_53_1 = -var9 + 4096;
                    break L4;
                  } else {
                    stackIn_53_0 = this;
                    stackIn_53_1 = var10 + 20480;
                    break L4;
                  }
                }
                ((jb) (this)).field_C = stackIn_53_1;
                this.field_C = this.field_C / 6;
                return;
              } else {
                if (var5 != param1) {
                  L5: {
                    stackIn_47_0 = this;

                    if (param2 == var6) {
                      stackIn_48_0 = this;
                      stackIn_48_1 = 12288 - -var9;
                      break L5;
                    } else {
                      stackIn_48_0 = this;
                      stackIn_48_1 = 20480 - var8;
                      break L5;
                    }
                  }
                  ((jb) (this)).field_C = stackIn_48_1;
                  this.field_C = this.field_C / 6;
                  return;
                } else {
                  L6: {
                    stackIn_43_0 = this;

                    if (param0 == var6) {
                      stackIn_44_0 = this;
                      stackIn_44_1 = 4096 + var8;
                      break L6;
                    } else {
                      stackIn_44_0 = this;
                      stackIn_44_1 = -var10 + 12288;
                      break L6;
                    }
                  }
                  ((jb) (this)).field_C = stackIn_44_1;
                  this.field_C = this.field_C / 6;
                  return;
                }
              }
            } else {
              this.field_C = 0;
              return;
            }
          } else {
            if (this.field_E >= 4096) {
              this.field_K = 0;
              if (-1 > (var7 ^ -1)) {
                var8 = (var5 - param2 << -1816751796) / var7;
                var9 = (var5 - param1 << 1705437100) / var7;
                var10 = (var5 + -param0 << 346720364) / var7;
                if (var5 == param2) {
                  L7: {
                    stackIn_71_0 = this;

                    if (var6 != param1) {
                      stackIn_72_0 = this;
                      stackIn_72_1 = -var9 + 4096;
                      break L7;
                    } else {
                      stackIn_72_0 = this;
                      stackIn_72_1 = var10 + 20480;
                      break L7;
                    }
                  }
                  ((jb) (this)).field_C = stackIn_72_1;
                  this.field_C = this.field_C / 6;
                  return;
                } else {
                  if (var5 != param1) {
                    L8: {
                      stackIn_66_0 = this;

                      if (param2 == var6) {
                        stackIn_67_0 = this;
                        stackIn_67_1 = 12288 - -var9;
                        break L8;
                      } else {
                        stackIn_67_0 = this;
                        stackIn_67_1 = 20480 - var8;
                        break L8;
                      }
                    }
                    ((jb) (this)).field_C = stackIn_67_1;
                    this.field_C = this.field_C / 6;
                    return;
                  } else {
                    L9: {
                      stackIn_62_0 = this;

                      if (param0 == var6) {
                        stackIn_63_0 = this;
                        stackIn_63_1 = 4096 + var8;
                        break L9;
                      } else {
                        stackIn_63_0 = this;
                        stackIn_63_1 = -var10 + 12288;
                        break L9;
                      }
                    }
                    ((jb) (this)).field_C = stackIn_63_1;
                    this.field_C = this.field_C / 6;
                    return;
                  }
                }
              } else {
                this.field_C = 0;
                return;
              }
            } else {
              L10: {
                stackIn_18_0 = this;

                stackIn_18_1 = var7 << 1721524428;

                if ((this.field_E ^ -1) < -2049) {
                  stackIn_19_0 = this;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = -(this.field_E * 2) + 8192;
                  break L10;
                } else {
                  stackIn_19_0 = this;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = this.field_E * 2;
                  break L10;
                }
              }
              L11: {
                ((jb) (this)).field_K = stackIn_19_1 / stackIn_19_2;
                if (-1 <= (var7 ^ -1)) {
                  this.field_C = 0;
                  break L11;
                } else {
                  L12: {
                    var8 = (var5 - param2 << -1816751796) / var7;
                    var9 = (var5 - param1 << 1705437100) / var7;
                    var10 = (var5 + -param0 << 346720364) / var7;
                    if (var5 == param2) {
                      L13: {
                        stackIn_32_0 = this;

                        if (var6 != param1) {
                          stackIn_33_0 = this;
                          stackIn_33_1 = -var9 + 4096;
                          break L13;
                        } else {
                          stackIn_33_0 = this;
                          stackIn_33_1 = var10 + 20480;
                          break L13;
                        }
                      }
                      ((jb) (this)).field_C = stackIn_33_1;
                      break L12;
                    } else {
                      if (var5 == param1) {
                        L14: {
                          stackIn_28_0 = this;

                          if (param0 == var6) {
                            stackIn_29_0 = this;
                            stackIn_29_1 = 4096 + var8;
                            break L14;
                          } else {
                            stackIn_29_0 = this;
                            stackIn_29_1 = -var10 + 12288;
                            break L14;
                          }
                        }
                        ((jb) (this)).field_C = stackIn_29_1;
                        break L12;
                      } else {
                        L15: {
                          stackIn_24_0 = this;

                          if (param2 == var6) {
                            stackIn_25_0 = this;
                            stackIn_25_1 = 12288 - -var9;
                            break L15;
                          } else {
                            stackIn_25_0 = this;
                            stackIn_25_1 = 20480 - var8;
                            break L15;
                          }
                        }
                        ((jb) (this)).field_C = stackIn_25_1;
                        break L12;
                      }
                    }
                  }
                  this.field_C = this.field_C / 6;
                  break L11;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var25;
        int[] var26;
        int[] var27;
        int[][] var32;
        int[][] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var20 = this.field_v.a(param1, -2);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!this.field_v.field_c) {
            return var3;
          } else {
            var33 = this.c(0, 3, param1);
            var36 = var33[0];
            var35 = var33[1];
            var34 = var33[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L0: while (true) {
              if (we.field_M <= var11) {
                return var3;
              } else {
                this.a(var34[var11], var35[var11], var36[var11], 12288);
                this.field_E = this.field_E + this.field_I;
                this.field_K = this.field_K + this.field_D;
                this.field_C = this.field_C + this.field_J;
                L1: while (true) {
                  if (this.field_C >= 0) {
                    L2: {
                      if (0 > this.field_K) {
                        this.field_K = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (4096 >= this.field_C) {
                        L4: {
                          if (this.field_E >= 0) {
                            break L4;
                          } else {
                            this.field_E = 0;
                            break L4;
                          }
                        }
                        L5: {
                          if (this.field_K > 4096) {
                            this.field_K = 4096;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-4097 <= (this.field_E ^ -1)) {
                            break L6;
                          } else {
                            this.field_E = 4096;
                            break L6;
                          }
                        }
                        this.a(this.field_K, true, this.field_C, this.field_E);
                        var8[var11] = this.field_F;
                        var9[var11] = this.field_z;
                        var10[var11] = this.field_B;
                        var11++;
                        continue L0;
                      } else {
                        this.field_C = this.field_C - 4096;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_C = this.field_C + 4096;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          this.field_K = -88;
          var20 = this.field_v.a(param1, -2);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_v.field_c) {
            var32 = this.c(0, 3, param1);
            var27 = var32[0];
            var23 = var27;
            var26 = var32[1];
            var22 = var26;
            var25 = var32[2];
            var21 = var25;
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L7: while (true) {
              if (we.field_M > var11) {
                this.a(var25[var11], var26[var11], var27[var11], 12288);
                this.field_E = this.field_E + this.field_I;
                this.field_K = this.field_K + this.field_D;
                this.field_C = this.field_C + this.field_J;
                L8: while (true) {
                  if (this.field_C >= 0) {
                    L9: {
                      if (0 > this.field_K) {
                        this.field_K = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (4096 >= this.field_C) {
                        L11: {
                          if (this.field_E >= 0) {
                            break L11;
                          } else {
                            this.field_E = 0;
                            break L11;
                          }
                        }
                        L12: {
                          if (this.field_K > 4096) {
                            this.field_K = 4096;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (-4097 <= (this.field_E ^ -1)) {
                            break L13;
                          } else {
                            this.field_E = 4096;
                            break L13;
                          }
                        }
                        this.a(this.field_K, true, this.field_C, this.field_E);
                        var8[var11] = this.field_F;
                        var9[var11] = this.field_z;
                        var10[var11] = this.field_B;
                        var11++;
                        continue L7;
                      } else {
                        this.field_C = this.field_C - 4096;
                        continue L10;
                      }
                    }
                  } else {
                    this.field_C = this.field_C + 4096;
                    continue L8;
                  }
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    static {
        field_A = "Reload game";
        field_H = new int[8192];
        field_L = "If you jump while standing on a fan, you go twice as high. You need to do this to reach the top of this level. Remember to paint the fan, too!";
        field_y = 72;
        field_G = -1;
    }
}
