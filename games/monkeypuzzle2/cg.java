/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    private int field_j;
    private int field_i;
    static kg field_c;
    private ug[] field_e;
    private ug field_f;
    static cj field_a;
    static int field_g;
    static int[] field_d;
    static int field_h;
    private ug field_b;

    public static void b() {
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a() {
        if (ok.a(false)) {
            return;
        }
        if (!(null != fj.field_E)) {
            int discarded$0 = -128;
            int discarded$1 = 4;
            fj.field_E = je.a();
        }
    }

    final static boolean a(String param0) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          try {
            if (!md.field_f.startsWith("win")) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (param0.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (param0.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref2;
            stackOut_21_1 = new StringBuilder().append("cg.C(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + 30 + ')');
        }
    }

    final ug a(byte param0, long param1) {
        ug var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 111) {
            return null;
        }
        ug var4 = ((cg) this).field_e[(int)(param1 & (long)(-1 + ((cg) this).field_j))];
        ((cg) this).field_b = var4.field_d;
        while (((cg) this).field_b != var4) {
            if (~((cg) this).field_b.field_a == ~param1) {
                var5 = ((cg) this).field_b;
                ((cg) this).field_b = ((cg) this).field_b.field_d;
                return var5;
            }
            ((cg) this).field_b = ((cg) this).field_b.field_d;
        }
        ((cg) this).field_b = null;
        return null;
    }

    final void a(ug param0, long param1, byte param2) {
        ug var5 = null;
        try {
            if (null != param0.field_c) {
                param0.c(-19822);
            }
            var5 = ((cg) this).field_e[(int)(param1 & (long)(-1 + ((cg) this).field_j))];
            if (param2 != -36) {
                ug discarded$0 = ((cg) this).a((byte) -88);
            }
            param0.field_d = var5;
            param0.field_c = var5.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "cg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ug a(int param0) {
        ((cg) this).field_i = param0;
        return ((cg) this).a((byte) -55);
    }

    final ug a(byte param0) {
        int var3 = 0;
        ug var4 = null;
        ug var5 = null;
        ug var6 = null;
        ug var9 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (0 < ((cg) this).field_i) {
          if (((cg) this).field_e[-1 + ((cg) this).field_i] != ((cg) this).field_f) {
            var9 = ((cg) this).field_f;
            ((cg) this).field_f = var9.field_d;
            return var9;
          } else {
            L0: while (true) {
              if (((cg) this).field_i >= ((cg) this).field_j) {
                if (param0 != -55) {
                  field_d = null;
                  return null;
                } else {
                  return null;
                }
              } else {
                int fieldTemp$2 = ((cg) this).field_i;
                ((cg) this).field_i = ((cg) this).field_i + 1;
                var4 = ((cg) this).field_e[fieldTemp$2].field_d;
                var6 = var4;
                if (var4 != ((cg) this).field_e[-1 + ((cg) this).field_i]) {
                  ((cg) this).field_f = var6.field_d;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((cg) this).field_i >= ((cg) this).field_j) {
              if (param0 != -55) {
                field_d = null;
                return null;
              } else {
                return null;
              }
            } else {
              int fieldTemp$3 = ((cg) this).field_i;
              ((cg) this).field_i = ((cg) this).field_i + 1;
              var4 = ((cg) this).field_e[fieldTemp$3].field_d;
              var5 = var4;
              if (var4 != ((cg) this).field_e[-1 + ((cg) this).field_i]) {
                ((cg) this).field_f = var5.field_d;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    cg(int param0) {
        int var2 = 0;
        ug var3 = null;
        ((cg) this).field_i = 0;
        ((cg) this).field_j = param0;
        ((cg) this).field_e = new ug[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            ug dupTemp$2 = new ug();
            var3 = dupTemp$2;
            ((cg) this).field_e[var2] = dupTemp$2;
            var3.field_c = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new kg();
        field_d = new int[4];
    }
}
