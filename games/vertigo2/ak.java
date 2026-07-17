/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static int[] field_d;
    static String field_c;
    static String field_f;
    static int field_e;
    private gp field_a;
    private gp field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        or.a((String) null, param0, 65536, param1);
        if (param2 != 3) {
            ak.a(false, true, -39);
        }
    }

    final gp b(byte param0) {
        gp var2 = null;
        if (param0 != -50) {
            field_e = -33;
            var2 = ((ak) this).field_a.field_p;
            if (!(((ak) this).field_a != var2)) {
                ((ak) this).field_b = null;
                return null;
            }
            ((ak) this).field_b = var2.field_p;
            return var2;
        }
        var2 = ((ak) this).field_a.field_p;
        if (!(((ak) this).field_a != var2)) {
            ((ak) this).field_b = null;
            return null;
        }
        ((ak) this).field_b = var2.field_p;
        return var2;
    }

    final int a(byte param0) {
        int var2 = 0;
        gp var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        if (param0 < 6) {
          ak.b(24);
          var3 = ((ak) this).field_a.field_p;
          L0: while (true) {
            if (var3 == ((ak) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ak) this).field_a.field_p;
          L1: while (true) {
            if (var3 == ((ak) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = 118 % ((64 - param0) / 40);
        field_f = null;
        field_c = null;
    }

    final void a(boolean param0, gp param1) {
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
              if (null != param1.field_o) {
                param1.a(-125);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_p = ((ak) this).field_a;
            param1.field_o = ((ak) this).field_a.field_o;
            param1.field_o.field_p = param1;
            param1.field_p.field_o = param1;
            if (!param0) {
              break L0;
            } else {
              int discarded$2 = ((ak) this).a((byte) 76);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ak.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (il.field_a) {
              L1: {
                var2_int = 83 / ((14 - param0) / 60);
                if (ui.field_g != 2) {
                  break L1;
                } else {
                  if (sm.field_Kb == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (sm.field_Kb.equals((Object) (Object) rc.a(var3, 320))) {
                      stackOut_9_0 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ak.F(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public ak() {
        ((ak) this).field_a = new gp();
        ((ak) this).field_a.field_p = ((ak) this).field_a;
        ((ak) this).field_a.field_o = ((ak) this).field_a;
    }

    final gp a(int param0) {
        gp var2 = null;
        if (param0 <= -8) {
          var2 = ((ak) this).field_a.field_p;
          if (var2 == ((ak) this).field_a) {
            return null;
          } else {
            var2.a(-122);
            return var2;
          }
        } else {
          return null;
        }
    }

    final gp a(boolean param0) {
        gp var2 = null;
        var2 = ((ak) this).field_b;
        if (var2 != ((ak) this).field_a) {
          if (!param0) {
            field_e = 54;
            ((ak) this).field_b = var2.field_p;
            return var2;
          } else {
            ((ak) this).field_b = var2.field_p;
            return var2;
          }
        } else {
          ((ak) this).field_b = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[4];
        field_f = "Your email address is used to identify this account";
        field_c = "You must play 1 more rated game before playing with the current options.";
        field_e = 3;
    }
}
