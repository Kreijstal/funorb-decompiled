/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends pv {
    static String field_l;
    static float field_q;
    static String field_k;
    private double field_j;
    static String field_n;
    private int field_o;
    private int field_m;
    static String field_p;

    private final void c(int param0) {
        ((qd) this).field_f.field_n = ((qd) this).field_f.c((byte) -125);
        ((qd) this).field_f.field_k = ((qd) this).field_f.b(true);
    }

    public static void c() {
        field_k = null;
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean b(boolean param0) {
        int stackIn_10_0 = 0;
        Object stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        Object stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        Object stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_9_1 = null;
        int stackOut_11_0 = 0;
        Object stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int fieldTemp$4 = ((qd) this).field_g + 1;
        ((qd) this).field_g = ((qd) this).field_g + 1;
        if (fieldTemp$4 <= this.c(false)) {
          if (((qd) this).field_m != 0) {
            L0: {
              if (1 == ((qd) this).field_g) {
                ((qd) this).field_f.field_l = ((qd) this).field_f.field_l + (int)((double)((qd) this).field_m / 39.0);
                ((qd) this).field_f.field_v.a((byte) 55, ((qd) this).field_f.field_g.field_o.field_b, 2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((qd) this).field_g < 18) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = ((qd) this).field_g;
                  stackOut_9_1 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (param0) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = this;
                    stackOut_11_2 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L2;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = this;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L2;
                  }
                }
                if (stackIn_12_0 <= this.c(stackIn_12_2 != 0) - 25) {
                  int discarded$5 = -102;
                  ((qd) this).field_f.field_k = this.b();
                  break L1;
                } else {
                  if (!param0) {
                    field_p = null;
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
            if (!param0) {
              field_p = null;
              return false;
            } else {
              return false;
            }
          } else {
            this.c(-123);
            return true;
          }
        } else {
          this.c(-123);
          return true;
        }
    }

    private final int c(boolean param0) {
        if (param0) {
            return -126;
        }
        return 40 * Math.abs(((qd) this).field_m) / 39;
    }

    private final int b() {
        return (int)((double)(((qd) this).field_g - 18) * ((qd) this).field_j) - -((qd) this).field_o;
    }

    final static boolean a(String param0) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
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
        var4 = BachelorFridge.field_y;
        try {
          try {
            if (!ht.field_i.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L0;
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
            stackOut_21_1 = new StringBuilder().append("qd.I(");
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
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -126 + 41);
        }
    }

    qd(jfa param0, int param1) {
        try {
            ((qd) this).field_f = param0;
            ((qd) this).field_m = param1;
            ((qd) this).field_o = ((qd) this).field_f.field_k;
            ((qd) this).field_j = (double)((qd) this).field_m / (-43.0 + (double)this.c(false));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Add to Cart";
        field_k = "Shortcut Reference";
        field_p = "This is your RuneScape clan if you have one.";
        field_n = "Error connecting to server. Please try using a different server.";
    }
}
