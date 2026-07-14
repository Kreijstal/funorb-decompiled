/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends tc {
    private int field_p;
    private boolean field_k;
    private int field_m;
    private int field_n;
    static String field_o;
    private int field_l;

    final void b(int param0, int param1, byte param2) {
        ((ja) this).field_l = ((ja) this).field_l + 1;
        ((ja) this).field_p = ((ja) this).field_p + param1;
        if (param2 <= 85) {
          return;
        } else {
          ((ja) this).field_m = ((ja) this).field_m + param0;
          return;
        }
    }

    final void f(int param0) {
        int var2 = -56 % ((param0 - -48) / 43);
        ((ja) this).field_k = true;
    }

    final boolean a(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -5) {
          L0: {
            var3 = null;
            boolean discarded$2 = ((ja) this).a((jd) null, 101);
            ((ja) this).field_n = ((ja) this).field_n + 1;
            if (40 <= ((ja) this).field_n) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            ((ja) this).field_n = ((ja) this).field_n + 1;
            if (40 <= ((ja) this).field_n) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -66) {
            return false;
        }
        return ej.b(param3, param2, param0 ^ 76, param1);
    }

    final boolean a(byte param0) {
        if (param0 <= 123) {
            ((ja) this).b(82, 19, (byte) 40);
            return ((ja) this).field_k;
        }
        return ((ja) this).field_k;
    }

    final boolean a(int param0, ja param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var3 = param1.field_m / param1.field_l;
        var4 = param1.field_p / param1.field_l;
        var5 = ((ja) this).field_m / ((ja) this).field_l;
        var6 = ((ja) this).field_p / ((ja) this).field_l;
        var7 = -var5 + var3;
        var7 = var7 * var7;
        var8 = -var6 + var4;
        var8 = var8 * var8;
        if (param0 == -5) {
          if (var7 >= 4) {
            if (-26 < var7) {
              if (-5 <= var8) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (var8 >= 25) {
              if (-26 < var7) {
                if (-5 <= var8) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ((ja) this).field_n = -4;
          if (var7 < 4) {
            if (var8 >= 25) {
              if (-26 < var7) {
                if (-5 <= var8) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (-26 < var7) {
              if (-5 <= var8) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final boolean a(jd param0, int param1) {
        Object var4 = null;
        if (param1 != -4977) {
          var4 = null;
          boolean discarded$2 = ((ja) this).a(114, (ja) null);
          return ((ja) this).a(param0.field_J, param0.field_w, (byte) -95);
        } else {
          return ((ja) this).a(param0.field_J, param0.field_w, (byte) -95);
        }
    }

    final void a(byte param0, jd param1) {
        if (param0 > -59) {
            return;
        }
        ((ja) this).b(param1.field_J, param1.field_w, (byte) 108);
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = ((ja) this).field_m / ((ja) this).field_l;
        if (param2 < -27) {
          var5 = ((ja) this).field_p / ((ja) this).field_l;
          if (param0 >= -2 + var4) {
            if (var5 - 2 <= param1) {
              if (2 + var4 >= param0) {
                if (param1 > var5 + 2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$2 = ((ja) this).a((byte) 97);
          var5 = ((ja) this).field_p / ((ja) this).field_l;
          if (param0 >= -2 + var4) {
            if (var5 - 2 <= param1) {
              if (2 + var4 >= param0) {
                if (param1 > var5 + 2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final int b(int param0, ja param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var3 = param1.field_m / param1.field_l;
        var4 = param1.field_p / param1.field_l;
        var5 = ((ja) this).field_m / ((ja) this).field_l;
        if (param0 != 2) {
          return -59;
        } else {
          var6 = ((ja) this).field_p / ((ja) this).field_l;
          var7 = var3 + -var5;
          var8 = -var6 + var4;
          return var8 * var8 + var7 * var7;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = ((ja) this).field_m / ((ja) this).field_l;
        var4 = ((ja) this).field_p / ((ja) this).field_l;
        if (param1 >= -23) {
          return -50;
        } else {
          return var3 + var4 * param0;
        }
    }

    public static void e(int param0) {
        field_o = null;
        int var1 = 107 % ((param0 - -36) / 54);
    }

    ja(jd param0) {
        ((ja) this).field_l = 1;
        ((ja) this).field_p = param0.field_w;
        ((ja) this).field_m = param0.field_J;
    }

    ja(int param0, int param1) {
        ((ja) this).field_m = param0;
        ((ja) this).field_l = 1;
        ((ja) this).field_p = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Spells to harm a single unit.";
    }
}
