/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends am {
    private int field_D;
    static hk field_B;
    private int field_G;
    private int field_y;
    private int field_t;
    static String field_x;
    static int[] field_z;
    private int field_v;
    private int field_w;
    static no field_E;
    static t field_s;
    private int field_u;
    static int field_A;

    private final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        var4 = this.field_G * (param1 + param0) >> -2117042772;
        var5 = de.field_d[var4 * 255 >> -40118932 & 255];
        var5 = (var5 << 1908267852) / this.field_G;
        var5 = (var5 << -1856604596) / this.field_D;
        var5 = this.field_w * var5 >> 794841228;
        if (param2 > 84) {
          if (var5 > param1 + -param0) {
            if (param1 - param0 <= -var5) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_D = -24;
          if (var5 > param1 + -param0) {
            if (param1 - param0 <= -var5) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        String var2;
        field_z = null;
        if (param0 != 95) {
          var2 = (String) null;
          vk.a((String) null, 60, (String) null);
          field_x = null;
          field_s = null;
          field_E = null;
          return;
        } else {
          field_x = null;
          field_s = null;
          field_E = null;
          return;
        }
    }

    final int[] a(byte param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        var11 = Torquing.field_u;
        var12 = this.field_l.a(param1, 25657);
        var3 = var12;
        if (this.field_l.field_b) {
          var4 = -2048 + dp.field_a[param1];
          var5 = 0;
          L0: while (true) {
            if (ci.field_c > var5) {
              L1: {
                var6 = q.field_b[var5] + -2048;
                var7 = var6 - -this.field_u;
                if (var7 < -2048) {
                  stackIn_16_0 = var7 - -4096;
                  break L1;
                } else {
                  stackIn_16_0 = var7;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_16_0;
                if (-2049 <= (var7 ^ -1)) {
                  stackIn_19_0 = var7;
                  break L2;
                } else {
                  stackIn_19_0 = var7 - 4096;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_19_0;
                var8 = var4 - -this.field_y;
                if ((var8 ^ -1) > 2047) {
                  stackIn_22_0 = 4096 + var8;
                  break L3;
                } else {
                  stackIn_22_0 = var8;
                  break L3;
                }
              }
              L4: {
                var8 = stackIn_22_0;
                if (var8 <= 2048) {
                  stackIn_25_0 = var8;
                  break L4;
                } else {
                  stackIn_25_0 = var8 - 4096;
                  break L4;
                }
              }
              L5: {
                var8 = stackIn_25_0;
                var9 = var6 + this.field_v;
                if (var9 >= -2048) {
                  stackIn_28_0 = var9;
                  break L5;
                } else {
                  stackIn_28_0 = 4096 + var9;
                  break L5;
                }
              }
              L6: {
                var9 = stackIn_28_0;
                if ((var9 ^ -1) >= -2049) {
                  stackIn_31_0 = var9;
                  break L6;
                } else {
                  stackIn_31_0 = -4096 + var9;
                  break L6;
                }
              }
              L7: {
                var9 = stackIn_31_0;
                var10 = var4 - -this.field_t;
                if ((var10 ^ -1) > 2047) {
                  stackIn_34_0 = 4096 + var10;
                  break L7;
                } else {
                  stackIn_34_0 = var10;
                  break L7;
                }
              }
              L8: {
                var10 = stackIn_34_0;
                if (-2049 > (var10 ^ -1)) {
                  stackIn_37_0 = -4096 + var10;
                  break L8;
                } else {
                  stackIn_37_0 = var10;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var10 = stackIn_37_0;
                  stackIn_40_0 = (int[]) (var12);

                  stackIn_40_1 = var5;

                  if (this.d(var7, 2016089164, var8)) {
                    break L10;
                  } else {




                    if (!this.a(var9, var10, (byte) 107)) {
                      stackIn_42_0 = (int[]) ((Object) stackIn_40_0);
                      stackIn_42_1 = stackIn_40_1;
                      stackIn_42_2 = 0;
                      break L9;
                    } else {
                      stackIn_40_0 = (int[]) ((Object) stackIn_40_0);

                      break L10;
                    }
                  }
                }
                stackIn_42_0 = (int[]) ((Object) stackIn_40_0);
                stackIn_42_1 = stackIn_40_1;
                stackIn_42_2 = 4096;
                break L9;
              }
              stackIn_42_0[stackIn_42_1] = stackIn_42_2;
              var5++;
              continue L0;
            } else {
              if (param0 < 86) {
                this.a((byte) 37, 0);
                return var12;
              } else {
                return var12;
              }
            }
          }
        } else {
          if (param0 < 86) {
            this.a((byte) 37, 0);
            return var12;
          } else {
            return var12;
          }
        }
    }

    public vk() {
        super(0, true);
        this.field_G = 12288;
        this.field_v = 0;
        this.field_y = 0;
        this.field_D = 8192;
        this.field_t = 2048;
        this.field_w = 4096;
        this.field_u = 2048;
    }

    private final boolean d(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = (-param0 + param2) * this.field_G >> 774803436;
        var5 = de.field_d[255 & var4 * 255 >> 2016089164];
        var5 = (var5 << 600493132) / this.field_G;
        var5 = (var5 << -838946484) / this.field_D;
        var5 = var5 * this.field_w >> 1440874764;
        if (param1 == 2016089164) {
          if (param0 - -param2 < var5) {
            if (-var5 >= param2 + param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_x = (String) null;
          if (param0 - -param2 < var5) {
            if (-var5 >= param2 + param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0) {
        if (param0 < 123) {
            return;
        }
        ie.a(14837);
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_u = param0.i(7088);
                return;
              } else {
                if (1 == var4_int) {
                  this.field_y = param0.i(7088);
                  return;
                } else {
                  if ((var4_int ^ -1) == -3) {
                    this.field_v = param0.i(7088);
                    return;
                  } else {
                    if (var4_int == 3) {
                      this.field_t = param0.i(7088);
                      return;
                    } else {
                      if (4 == var4_int) {
                        this.field_G = param0.i(7088);
                        return;
                      } else {
                        if ((var4_int ^ -1) != -6) {
                          if (var4_int == 6) {
                            this.field_D = param0.i(7088);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          this.field_w = param0.i(7088);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("vk.H(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param0 = kf.a(param0, '_', "", 121);
              if (param1 == 4096) {
                break L1;
              } else {
                vk.b(37);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = db.a(param0, 31108);
                if ((param2.indexOf(param0) ^ -1) != 0) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vk.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_z = new int[8192];
        field_B = null;
        field_x = "Nursery Slopes";
    }
}
