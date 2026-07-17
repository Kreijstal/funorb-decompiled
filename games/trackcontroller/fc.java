/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    static String field_a;
    static String field_g;
    fc field_e;
    static String field_f;
    static String[] field_c;
    static int field_d;
    fc field_h;
    long field_b;

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 2) {
          L0: {
            L1: {
              if (rl.field_N < 10) {
                break L1;
              } else {
                if (ge.field_D) {
                  break L1;
                } else {
                  int discarded$2 = 3100;
                  if (gh.a()) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 10000536) {
            fc.a(20, 32, 14, (byte) -49, 34);
        }
        if (null == ((fc) this).field_e) {
            return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return field_c[var4];
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -14) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              ll.a(param4, param1, param0 + 1, 10000536);
              ll.a(param4, param2 + param1, param0 + 1, 12105912);
              var5_int = 1;
              var6 = param2;
              if (var5_int + param1 < ll.field_b) {
                var5_int = ll.field_b - param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 + var6 > ll.field_g) {
                var6 = -param1 + ll.field_g;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param2);
                var9 = var8 << 8 | var8 << 16 | var8;
                ll.field_i[param4 + (param1 - -var7) * ll.field_d] = var9;
                ll.field_i[param0 + (ll.field_d * (var7 + param1) - -param4)] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var5, "fc.LB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0) {
        if (!(null == sb.field_b)) {
            sb.field_b.f();
        }
        if (g.field_x != null) {
            g.field_x.f();
        }
    }

    final static boolean b(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          try {
            if (uf.field_b.startsWith("win")) {
              L0: {
                field_a = null;
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (param1.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  if (-1 != var2.indexOf((int) param1.charAt(var3))) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            return stackIn_17_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref2;
            stackOut_18_1 = new StringBuilder().append("fc.QB(").append(0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        field_c = null;
    }

    final void a(int param0) {
        if (param0 >= -22) {
            ((fc) this).field_b = 48L;
        }
        if (null == ((fc) this).field_e) {
            return;
        }
        ((fc) this).field_e.field_h = ((fc) this).field_h;
        ((fc) this).field_h.field_e = ((fc) this).field_e;
        ((fc) this).field_h = null;
        ((fc) this).field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Register";
        field_f = "Waiting for sound effects";
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_d = 0;
    }
}
