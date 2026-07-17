/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ms extends tc {
    static String field_m;
    ms field_l;
    static int field_t;
    static boolean field_o;
    long field_q;
    static je field_k;
    ms field_s;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean a(byte param0) {
        if (!(((ms) this).field_l != null)) {
            return false;
        }
        int var2 = 106 / ((10 - param0) / 60);
        return true;
    }

    final void c(byte param0) {
        if (((ms) this).field_l == null) {
          return;
        } else {
          ((ms) this).field_l.field_s = ((ms) this).field_s;
          ((ms) this).field_s.field_l = ((ms) this).field_l;
          if (param0 != -76) {
            ((ms) this).a(true, -70L);
            ((ms) this).field_s = null;
            ((ms) this).field_l = null;
            return;
          } else {
            ((ms) this).field_s = null;
            ((ms) this).field_l = null;
            return;
          }
        }
    }

    final static int a(int param0, og[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (-1 + param1.length <= var3_int) {
                if (param2 < -81) {
                  stackOut_10_0 = -1 + param1.length;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = -74;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                if (param0 + -1 >= param1[1 + var3_int].field_s) {
                  var3_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = var3_int;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ms.FA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    public static void f(int param0) {
        if (param0 != -1) {
            return;
        }
        field_n = null;
        field_p = null;
        field_k = null;
        field_m = null;
    }

    final long a(int param0) {
        if (param0 < 101) {
            field_o = true;
            return ((ms) this).field_q;
        }
        return ((ms) this).field_q;
    }

    final void a(boolean param0, long param1) {
        if (((ms) this).field_l == null) {
          if (!param0) {
            ((ms) this).field_l = null;
            ((ms) this).field_q = param1;
            return;
          } else {
            ((ms) this).field_q = param1;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= 111) {
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[1]);
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        } else {
          ms.e(75);
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[1]);
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[3]);
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        }
    }

    protected ms() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
