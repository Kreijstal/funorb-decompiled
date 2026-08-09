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
        this.field_l = this.field_l + 1;
        this.field_p = this.field_p + param1;
        if (param2 <= 85) {
          return;
        } else {
          this.field_m = this.field_m + param0;
          return;
        }
    }

    final void f(int param0) {
        int var2 = -56 % ((param0 - -48) / 43);
        this.field_k = true;
    }

    final boolean a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        jd var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -5) {
          L0: {
            var3 = (jd) null;
            this.a((jd) null, 101);
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            if (40 <= fieldTemp$2) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            fieldTemp$3 = this.field_n;
            this.field_n = this.field_n + 1;
            if (40 <= fieldTemp$3) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
            this.b(82, 19, (byte) 40);
            return this.field_k;
        }
        return this.field_k;
    }

    final boolean a(int param0, ja param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_m / param1.field_l;
              var4 = param1.field_p / param1.field_l;
              var5 = this.field_m / this.field_l;
              var6 = this.field_p / this.field_l;
              var7 = -var5 + var3_int;
              var7 = var7 * var7;
              var8 = -var6 + var4;
              var8 = var8 * var8;
              if (param0 == -5) {
                break L1;
              } else {
                this.field_n = -4;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (var7 >= 4) {
                    break L4;
                  } else {
                    if (var8 < 25) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-26 >= (var7 ^ -1)) {
                    break L5;
                  } else {
                    if (-5 >= (var8 ^ -1)) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L2;
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ja.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean a(jd param0, int param1) {
        RuntimeException var3 = null;
        ja var4 = null;
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
              if (param1 == -4977) {
                break L1;
              } else {
                var4 = (ja) null;
                this.a(114, (ja) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0.field_J, param0.field_w, (byte) -95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ja.D(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, jd param1) {
        if (param0 > -59) {
            return;
        }
        try {
            this.b(param1.field_J, param1.field_w, (byte) 108);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ja.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        var4 = this.field_m / this.field_l;
        if (param2 < -27) {
          var5 = this.field_p / this.field_l;
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
          this.a((byte) 97);
          var5 = this.field_p / this.field_l;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param1.field_m / param1.field_l;
            var4 = param1.field_p / param1.field_l;
            var5 = this.field_m / this.field_l;
            if (param0 == 2) {
              var6 = this.field_p / this.field_l;
              var7 = var3_int + -var5;
              var8 = -var6 + var4;
              stackIn_4_0 = var8 * var8 + var7 * var7;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -59;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ja.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        var3 = this.field_m / this.field_l;
        var4 = this.field_p / this.field_l;
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
        try {
            this.field_l = 1;
            this.field_p = param0.field_w;
            this.field_m = param0.field_J;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ja(int param0, int param1) {
        this.field_m = param0;
        this.field_l = 1;
        this.field_p = param1;
    }

    static {
        field_o = "Spells to harm a single unit.";
    }
}
