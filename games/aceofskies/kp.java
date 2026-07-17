/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    wf field_e;
    static kc field_a;
    private wf field_c;
    static kc field_d;
    static String field_b;
    static int[] field_f;

    final wf b(int param0) {
        wf var2 = null;
        if (param0 == 4095) {
          var2 = ((kp) this).field_e.field_c;
          if (((kp) this).field_e == var2) {
            return null;
          } else {
            var2.c(-124);
            return var2;
          }
        } else {
          ((kp) this).field_c = null;
          var2 = ((kp) this).field_e.field_c;
          if (((kp) this).field_e == var2) {
            return null;
          } else {
            var2.c(-124);
            return var2;
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((kp) this).field_e = null;
            if (((kp) this).field_e.field_a != ((kp) this).field_e) {
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
            if (((kp) this).field_e.field_a != ((kp) this).field_e) {
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

    final wf a(int param0) {
        wf var2 = null;
        if (param0 > 50) {
          var2 = ((kp) this).field_c;
          if (((kp) this).field_e == var2) {
            ((kp) this).field_c = null;
            return null;
          } else {
            ((kp) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, as param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          var2_int = 80 / ((-18 - param0) / 45);
          if (param1 == bd.field_C) {
            stackOut_14_0 = 7681;
            stackIn_15_0 = stackOut_14_0;
            return stackIn_15_0;
          } else {
            if (ru.field_a == param1) {
              stackOut_12_0 = 8448;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            } else {
              if (param1 != du.field_l) {
                if (param1 != lo.field_j) {
                  if (fs.field_d == param1) {
                    stackOut_10_0 = 34023;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  stackOut_6_0 = 260;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                stackOut_3_0 = 34165;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("kp.F(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L0;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L0;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0) {
              if (param2) {
                stackOut_6_0 = pk.field_e.a(param1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = nh.field_c.a(param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -40;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kp.E(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final wf e(int param0) {
        wf var2 = null;
        var2 = ((kp) this).field_e.field_a;
        if (param0 > 119) {
          if (var2 == ((kp) this).field_e) {
            return null;
          } else {
            var2.c(-124);
            return var2;
          }
        } else {
          return null;
        }
    }

    final wf a(byte param0) {
        wf var2 = null;
        var2 = ((kp) this).field_e.field_c;
        if (var2 == ((kp) this).field_e) {
          ((kp) this).field_c = null;
          return null;
        } else {
          ((kp) this).field_c = var2.field_c;
          if (param0 > -26) {
            return null;
          } else {
            return var2;
          }
        }
    }

    public static void f(int param0) {
        Object var2 = null;
        field_b = null;
        field_f = null;
        if (param0 != -19854) {
          var2 = null;
          int discarded$2 = kp.a(-73, (as) null);
          field_d = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          return;
        }
    }

    final void a(int param0, wf param1) {
        try {
            if (!(null == param1.field_c)) {
                param1.c(-128);
            }
            param1.field_c = ((kp) this).field_e.field_c;
            param1.field_a = ((kp) this).field_e;
            if (param0 < 65) {
                Object var4 = null;
                int discarded$0 = kp.a(false, (String) null, true);
            }
            param1.field_c.field_a = param1;
            param1.field_a.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "kp.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_c != null) {
                param0.c(param1 + -25736);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_a = ((kp) this).field_e.field_a;
            param0.field_c = ((kp) this).field_e;
            param0.field_c.field_a = param0;
            param0.field_a.field_c = param0;
            if (param1 == 25611) {
              break L0;
            } else {
              ((kp) this).field_e = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("kp.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final wf b(byte param0) {
        wf var2 = null;
        Object var3 = null;
        if (param0 == 103) {
          var2 = ((kp) this).field_c;
          if (var2 == ((kp) this).field_e) {
            ((kp) this).field_c = null;
            return null;
          } else {
            ((kp) this).field_c = var2.field_a;
            return var2;
          }
        } else {
          var3 = null;
          int discarded$2 = kp.a(false, (String) null, true);
          var2 = ((kp) this).field_c;
          if (var2 == ((kp) this).field_e) {
            ((kp) this).field_c = null;
            return null;
          } else {
            ((kp) this).field_c = var2.field_a;
            return var2;
          }
        }
    }

    final wf d(int param0) {
        wf var2 = null;
        var2 = ((kp) this).field_e.field_a;
        if (var2 == ((kp) this).field_e) {
          ((kp) this).field_c = null;
          return null;
        } else {
          if (param0 != 268435455) {
            kp.f(-106);
            ((kp) this).field_c = var2.field_a;
            return var2;
          } else {
            ((kp) this).field_c = var2.field_a;
            return var2;
          }
        }
    }

    final void c(int param0) {
        wf var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        L0: while (true) {
          var2 = ((kp) this).field_e.field_a;
          if (var2 == ((kp) this).field_e) {
            if (param0 != 268435455) {
              var4 = null;
              ((kp) this).a((wf) null, 37);
              ((kp) this).field_c = null;
              return;
            } else {
              ((kp) this).field_c = null;
              return;
            }
          } else {
            var2.c(param0 + -268435583);
            continue L0;
          }
        }
    }

    public kp() {
        ((kp) this).field_e = new wf();
        ((kp) this).field_e.field_c = ((kp) this).field_e;
        ((kp) this).field_e.field_a = ((kp) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new kc();
        field_d = new kc();
        field_b = ",";
        field_f = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
