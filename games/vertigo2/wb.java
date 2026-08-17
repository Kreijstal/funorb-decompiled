/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends ji {
    private int field_y;
    private int field_A;
    private int field_D;
    static String field_C;
    private int field_z;
    private int field_B;
    private int field_F;
    private int field_G;
    static int[] field_E;

    public wb() {
        super(0, true);
        this.field_D = 4096;
        this.field_B = 8192;
        this.field_G = 2048;
        this.field_F = 0;
        this.field_y = 0;
        this.field_A = 2048;
        this.field_z = 12288;
    }

    final int[] c(int param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        ed var12;
        int[] var13;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var13 = this.field_x.a(param0, (byte) 75);
          var3 = var13;
          if (!this.field_x.field_i) {
            break L0;
          } else {
            var4 = lf.field_y[param0] + -2048;
            var5 = 0;
            L1: while (true) {
              if (var5 >= we.field_M) {
                break L0;
              } else {
                L2: {
                  var6 = rh.field_O[var5] - 2048;
                  var7 = this.field_A + var6;
                  if (2047 < (var7 ^ -1)) {
                    stackIn_8_0 = 4096 + var7;
                    break L2;
                  } else {
                    stackIn_8_0 = var7;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_8_0;
                  if (var7 <= 2048) {
                    stackIn_11_0 = var7;
                    break L3;
                  } else {
                    stackIn_11_0 = -4096 + var7;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_11_0;
                  var8 = var4 + this.field_y;
                  if ((var8 ^ -1) <= 2047) {
                    stackIn_14_0 = var8;
                    break L4;
                  } else {
                    stackIn_14_0 = 4096 + var8;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_14_0;
                  if (2048 >= var8) {
                    stackIn_17_0 = var8;
                    break L5;
                  } else {
                    stackIn_17_0 = -4096 + var8;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_17_0;
                  var9 = this.field_F + var6;
                  if ((var9 ^ -1) <= 2047) {
                    stackIn_20_0 = var9;
                    break L6;
                  } else {
                    stackIn_20_0 = 4096 + var9;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_20_0;
                  if (2048 >= var9) {
                    stackIn_23_0 = var9;
                    break L7;
                  } else {
                    stackIn_23_0 = var9 - 4096;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_23_0;
                  var10 = this.field_G + var4;
                  if (-2048 <= var10) {
                    stackIn_26_0 = var10;
                    break L8;
                  } else {
                    stackIn_26_0 = var10 + 4096;
                    break L8;
                  }
                }
                L9: {
                  var10 = stackIn_26_0;
                  if (2048 < var10) {
                    stackIn_29_0 = var10 + -4096;
                    break L9;
                  } else {
                    stackIn_29_0 = var10;
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    var10 = stackIn_29_0;
                    stackIn_32_0 = (int[]) (var13);

                    stackIn_32_1 = var5;

                    if (this.a(var8, var7, false)) {
                      break L11;
                    } else {
                      stackIn_32_0 = (int[]) ((Object) stackIn_32_0);

                      if (this.a(var9, var10, (byte) 125)) {
                        break L11;
                      } else {
                        stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                        stackIn_33_1 = stackIn_32_1;
                        stackIn_33_2 = 0;
                        break L10;
                      }
                    }
                  }
                  stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                  stackIn_33_1 = stackIn_32_1;
                  stackIn_33_2 = 4096;
                  break L10;
                }
                stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                var5++;
                continue L1;
              }
            }
          }
        }
        L12: {
          if (param1 > 91) {
            break L12;
          } else {
            var12 = (ed) null;
            this.a((byte) -116, 10, (ed) null);
            break L12;
          }
        }
        return var13;
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        if (!Character.isISOControl(param0)) {
          var2 = 65 / ((param1 - 54) / 56);
          if (!d.a(param0, 2)) {
            L0: {
              if (45 == param0) {
                break L0;
              } else {
                if (param0 == 160) {
                  break L0;
                } else {
                  if (param0 == 32) {
                    break L0;
                  } else {
                    if (param0 != 95) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                this.field_G = 78;
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (var4_int == 0) {
                this.field_A = param2.a((byte) -11);
                break L2;
              } else {
                if (-2 == (var4_int ^ -1)) {
                  this.field_y = param2.a((byte) -11);
                  break L2;
                } else {
                  if (var4_int != 2) {
                    if ((var4_int ^ -1) != -4) {
                      if (-5 == (var4_int ^ -1)) {
                        this.field_z = param2.a((byte) -11);
                        break L2;
                      } else {
                        if ((var4_int ^ -1) == -6) {
                          this.field_D = param2.a((byte) -11);
                          break L2;
                        } else {
                          if (var4_int != 6) {
                            break L2;
                          } else {
                            this.field_B = param2.a((byte) -11);
                            break L2;
                          }
                        }
                      }
                    } else {
                      this.field_G = param2.a((byte) -11);
                      break L2;
                    }
                  } else {
                    this.field_F = param2.a((byte) -11);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("wb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        L0: {
          var4 = this.field_z * (param0 + param1) >> 2108705388;
          if (param2 > 85) {
            break L0;
          } else {
            wb.b((byte) 118);
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = qb.field_b[var4 * 255 >> -1991610932 & 255];
            var5 = (var5 << -565138452) / this.field_z;
            var5 = (var5 << -27571188) / this.field_B;
            var5 = var5 * this.field_D >> 1296573548;
            if (param1 + -param0 >= var5) {
              break L2;
            } else {
              if (param1 - param0 <= -var5) {
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

    private final boolean a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        var4 = this.field_z * (param0 - param1) >> -1532460244;
        var5 = qb.field_b[var4 * 255 >> 693034988 & 255];
        var5 = (var5 << -2021501492) / this.field_z;
        var5 = (var5 << 1970394188) / this.field_B;
        var5 = var5 * this.field_D >> 888408428;
        if (!param2) {
          L0: {
            L1: {
              if (param1 + param0 >= var5) {
                break L1;
              } else {
                if (param0 + param1 <= -var5) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0) {
        if (param0 >= -98) {
            return;
        }
        uk.d((byte) 37);
    }

    public static void b(byte param0) {
        if (param0 != -33) {
            return;
        }
        field_C = null;
        field_E = null;
    }

    static {
        field_C = "Please remove <%0> from your friend list first.";
    }
}
