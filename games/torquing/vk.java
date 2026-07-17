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
        int var4 = 0;
        int var5 = 0;
        var4 = ((vk) this).field_G * (param1 + param0) >> 12;
        var5 = de.field_d[var4 * 255 >> 12 & 255];
        var5 = (var5 << 12) / ((vk) this).field_G;
        var5 = (var5 << 12) / ((vk) this).field_D;
        var5 = ((vk) this).field_w * var5 >> 12;
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

    public static void b(int param0) {
        Object var2 = null;
        field_z = null;
        if (param0 != 95) {
          var2 = null;
          boolean discarded$2 = vk.a((String) null, 60, (String) null);
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
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        var11 = Torquing.field_u;
        var12 = ((vk) this).field_l.a(param1, 25657);
        var3 = var12;
        if (((vk) this).field_l.field_b) {
          var4 = -2048 + dp.field_a[param1];
          var5 = 0;
          L0: while (true) {
            if (~ci.field_c < ~var5) {
              L1: {
                var6 = q.field_b[var5] + -2048;
                var7 = var6 - -((vk) this).field_u;
                if (var7 < -2048) {
                  stackOut_11_0 = var7 - -4096;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = var7;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_12_0;
                if (var7 <= 2048) {
                  stackOut_14_0 = var7;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = var7 - 4096;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_15_0;
                var8 = var4 - -((vk) this).field_y;
                if (var8 < -2048) {
                  stackOut_17_0 = 4096 + var8;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = var8;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              L4: {
                var8 = stackIn_18_0;
                if (var8 <= 2048) {
                  stackOut_20_0 = var8;
                  stackIn_21_0 = stackOut_20_0;
                  break L4;
                } else {
                  stackOut_19_0 = var8 - 4096;
                  stackIn_21_0 = stackOut_19_0;
                  break L4;
                }
              }
              L5: {
                var8 = stackIn_21_0;
                var9 = var6 + ((vk) this).field_v;
                if (var9 >= -2048) {
                  stackOut_23_0 = var9;
                  stackIn_24_0 = stackOut_23_0;
                  break L5;
                } else {
                  stackOut_22_0 = 4096 + var9;
                  stackIn_24_0 = stackOut_22_0;
                  break L5;
                }
              }
              L6: {
                var9 = stackIn_24_0;
                if (var9 <= 2048) {
                  stackOut_26_0 = var9;
                  stackIn_27_0 = stackOut_26_0;
                  break L6;
                } else {
                  stackOut_25_0 = -4096 + var9;
                  stackIn_27_0 = stackOut_25_0;
                  break L6;
                }
              }
              L7: {
                var9 = stackIn_27_0;
                var10 = var4 - -((vk) this).field_t;
                if (var10 < -2048) {
                  stackOut_29_0 = 4096 + var10;
                  stackIn_30_0 = stackOut_29_0;
                  break L7;
                } else {
                  stackOut_28_0 = var10;
                  stackIn_30_0 = stackOut_28_0;
                  break L7;
                }
              }
              L8: {
                var10 = stackIn_30_0;
                if (var10 > 2048) {
                  stackOut_32_0 = -4096 + var10;
                  stackIn_33_0 = stackOut_32_0;
                  break L8;
                } else {
                  stackOut_31_0 = var10;
                  stackIn_33_0 = stackOut_31_0;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var10 = stackIn_33_0;
                  stackOut_33_0 = (int[]) var12;
                  stackOut_33_1 = var5;
                  stackIn_36_0 = stackOut_33_0;
                  stackIn_36_1 = stackOut_33_1;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  if (this.d(var7, 2016089164, var8)) {
                    break L10;
                  } else {
                    stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                    stackOut_34_1 = stackIn_34_1;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    if (!this.a(var9, var10, (byte) 107)) {
                      stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                      stackOut_37_1 = stackIn_37_1;
                      stackOut_37_2 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      break L9;
                    } else {
                      stackOut_35_0 = (int[]) (Object) stackIn_35_0;
                      stackOut_35_1 = stackIn_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      break L10;
                    }
                  }
                }
                stackOut_36_0 = (int[]) (Object) stackIn_36_0;
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = 4096;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                break L9;
              }
              stackIn_38_0[stackIn_38_1] = stackIn_38_2;
              var5++;
              continue L0;
            } else {
              if (param0 >= 86) {
                return var3;
              } else {
                int[] discarded$2 = ((vk) this).a((byte) 37, 0);
                return var3;
              }
            }
          }
        } else {
          if (param0 >= 86) {
            return var3;
          } else {
            int[] discarded$3 = ((vk) this).a((byte) 37, 0);
            return var3;
          }
        }
    }

    public vk() {
        super(0, true);
        ((vk) this).field_G = 12288;
        ((vk) this).field_v = 0;
        ((vk) this).field_y = 0;
        ((vk) this).field_D = 8192;
        ((vk) this).field_t = 2048;
        ((vk) this).field_w = 4096;
        ((vk) this).field_u = 2048;
    }

    private final boolean d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = (-param0 + param2) * ((vk) this).field_G >> 12;
        var5 = de.field_d[255 & var4 * 255 >> 12];
        var5 = (var5 << 12) / ((vk) this).field_G;
        var5 = (var5 << 12) / ((vk) this).field_D;
        var5 = var5 * ((vk) this).field_w >> 12;
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
          field_x = null;
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 == 35) {
            var4_int = param2;
            if (var4_int == 0) {
              ((vk) this).field_u = param0.i(7088);
              return;
            } else {
              if (1 == var4_int) {
                ((vk) this).field_y = param0.i(7088);
                return;
              } else {
                if (var4_int == 2) {
                  ((vk) this).field_v = param0.i(7088);
                  return;
                } else {
                  if (var4_int == 3) {
                    ((vk) this).field_t = param0.i(7088);
                    return;
                  } else {
                    if (4 == var4_int) {
                      ((vk) this).field_G = param0.i(7088);
                      return;
                    } else {
                      if (var4_int != 5) {
                        if (var4_int == 6) {
                          ((vk) this).field_D = param0.i(7088);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((vk) this).field_w = param0.i(7088);
                        return;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("vk.H(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L0;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                if (param2.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vk.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[8192];
        field_B = null;
        field_x = "Nursery Slopes";
    }
}
