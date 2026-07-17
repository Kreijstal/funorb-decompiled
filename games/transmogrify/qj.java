/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String[] field_a;
    wf field_d;
    static String field_c;
    private wf field_b;

    final wf a(byte param0) {
        if (param0 != -95) {
            return null;
        }
        wf var2 = ((qj) this).field_d.field_b;
        if (!(((qj) this).field_d != var2)) {
            ((qj) this).field_b = null;
            return null;
        }
        ((qj) this).field_b = var2.field_b;
        return var2;
    }

    final wf a(int param0) {
        wf var2 = null;
        if (param0 == -9424) {
          var2 = ((qj) this).field_d.field_f;
          if (((qj) this).field_d == var2) {
            return null;
          } else {
            var2.c(5);
            return var2;
          }
        } else {
          qj.c((byte) 97);
          var2 = ((qj) this).field_d.field_f;
          if (((qj) this).field_d == var2) {
            return null;
          } else {
            var2.c(5);
            return var2;
          }
        }
    }

    final static ti[] a(int param0, int param1, ci param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (rl.a(param1, 0, param0, param2)) {
            int discarded$2 = 31151;
            return uj.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qj.H(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -57 + 41);
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 65) {
            field_c = null;
            return ge.field_x;
        }
        return ge.field_x;
    }

    final wf a(boolean param0) {
        wf var2 = null;
        var2 = ((qj) this).field_b;
        if (((qj) this).field_d == var2) {
          ((qj) this).field_b = null;
          return null;
        } else {
          if (!param0) {
            wf discarded$2 = ((qj) this).a(true);
            ((qj) this).field_b = var2.field_b;
            return var2;
          } else {
            ((qj) this).field_b = var2.field_b;
            return var2;
          }
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == param0.field_f) {
                break L1;
              } else {
                param0.c(5);
                break L1;
              }
            }
            param0.field_f = ((qj) this).field_d.field_f;
            param0.field_b = ((qj) this).field_d;
            param0.field_f.field_b = param0;
            param0.field_b.field_f = param0;
            if (param1 <= -81) {
              break L0;
            } else {
              ((qj) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("qj.O(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final wf b(int param0) {
        wf var2 = null;
        var2 = ((qj) this).field_d.field_f;
        if (param0 == -10231) {
          if (((qj) this).field_d == var2) {
            ((qj) this).field_b = null;
            return null;
          } else {
            ((qj) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          field_c = null;
          if (((qj) this).field_d == var2) {
            ((qj) this).field_b = null;
            return null;
          } else {
            ((qj) this).field_b = var2.field_f;
            return var2;
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
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
            if (param1 >= 36) {
              stackOut_3_0 = ig.a(10, false, true, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qj.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final void g(int param0) {
        int var3 = 0;
        wf var4 = null;
        wf var5 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          L0: while (true) {
            var4 = ((qj) this).field_d.field_b;
            if (((qj) this).field_d != var4) {
              var4.c(5);
              continue L0;
            } else {
              ((qj) this).field_b = null;
              return;
            }
          }
        } else {
          boolean discarded$1 = qj.b((byte) 115);
          L1: while (true) {
            var5 = ((qj) this).field_d.field_b;
            if (((qj) this).field_d != var5) {
              var5.c(5);
              continue L1;
            } else {
              ((qj) this).field_b = null;
              return;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final wf f(int param0) {
        wf var2 = null;
        var2 = ((qj) this).field_b;
        if (var2 != ((qj) this).field_d) {
          if (param0 != -33) {
            ((qj) this).field_d = null;
            ((qj) this).field_b = var2.field_f;
            return var2;
          } else {
            ((qj) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          ((qj) this).field_b = null;
          return null;
        }
    }

    final void a(wf param0, byte param1) {
        if (param0.field_f != null) {
            param0.c(5);
        }
        if (param1 != 33) {
            return;
        }
        try {
            param0.field_b = ((qj) this).field_d.field_b;
            param0.field_f = ((qj) this).field_d;
            param0.field_f.field_b = param0;
            param0.field_b.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "qj.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            return true;
        }
        return ((qj) this).field_d == ((qj) this).field_d.field_b ? true : false;
    }

    final wf c(int param0) {
        wf var2 = null;
        Object var3 = null;
        var2 = ((qj) this).field_d.field_b;
        if (var2 != ((qj) this).field_d) {
          if (param0 > -71) {
            var3 = null;
            boolean discarded$2 = qj.a((CharSequence) null, 11);
            var2.c(5);
            return var2;
          } else {
            var2.c(5);
            return var2;
          }
        } else {
          return null;
        }
    }

    public qj() {
        ((qj) this).field_d = new wf();
        ((qj) this).field_d.field_f = ((qj) this).field_d;
        ((qj) this).field_d.field_b = ((qj) this).field_d;
    }

    final static void e() {
        int var1 = 0;
        if (kc.field_g <= 32) {
            ec.a(0, 9956);
        } else {
            var1 = kc.field_g % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            ec.a(-var1 + kc.field_g, 9956);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_a = new String[]{"Decent Score", "Great Score", "Anagram", "Super Anagram", "Recycler", "Supercycler", "Focus", "Double Focus", "Brave Effort", "Sterling Effort", "DIY Builder", "Word of Power", "Speedster", "Super Speedster", "Multitasker", "Monster Speller"};
    }
}
