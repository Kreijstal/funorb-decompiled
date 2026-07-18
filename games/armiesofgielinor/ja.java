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
            boolean discarded$6 = ((ja) this).a((jd) null, 101);
            int fieldTemp$7 = ((ja) this).field_n;
            ((ja) this).field_n = ((ja) this).field_n + 1;
            if (40 <= fieldTemp$7) {
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
            int fieldTemp$8 = ((ja) this).field_n;
            ((ja) this).field_n = ((ja) this).field_n + 1;
            if (40 <= fieldTemp$8) {
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
        return ej.b(13, param2, -14, param1);
    }

    final boolean a(byte param0) {
        if (param0 <= 123) {
            ((ja) this).b(82, 19, (byte) 40);
            return ((ja) this).field_k;
        }
        return ((ja) this).field_k;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
              var3_int = param1.field_m / param1.field_l;
              var4 = param1.field_p / param1.field_l;
              var5 = ((ja) this).field_m / ((ja) this).field_l;
              var6 = ((ja) this).field_p / ((ja) this).field_l;
              var7 = -var5 + var3_int;
              var7 = var7 * var7;
              var8 = -var6 + var4;
              var8 = var8 * var8;
              if (param0 == -5) {
                break L1;
              } else {
                ((ja) this).field_n = -4;
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
                  if (var7 >= 25) {
                    break L5;
                  } else {
                    if (var8 >= 4) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ja.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean a(jd param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (param1 == -4977) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((ja) this).a(114, (ja) null);
                break L1;
              }
            }
            stackOut_2_0 = ((ja) this).a(param0.field_J, param0.field_w, (byte) -95);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ja.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, jd param1) {
        if (param0 > -59) {
            return;
        }
        try {
            ((ja) this).b(param1.field_J, param1.field_w, (byte) 108);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ja.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = param1.field_m / param1.field_l;
            var4 = param1.field_p / param1.field_l;
            var5 = ((ja) this).field_m / ((ja) this).field_l;
            if (param0 == 2) {
              var6 = ((ja) this).field_p / ((ja) this).field_l;
              var7 = var3_int + -var5;
              var8 = -var6 + var4;
              stackOut_3_0 = var8 * var8 + var7 * var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -59;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ja.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
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
        int var1 = 0;
    }

    ja(jd param0) {
        try {
            ((ja) this).field_l = 1;
            ((ja) this).field_p = param0.field_w;
            ((ja) this).field_m = param0.field_J;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
