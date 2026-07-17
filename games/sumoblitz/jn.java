/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_b;
    static hr field_d;
    static hr[] field_c;
    ms field_e;
    private ms field_a;

    final ms a(int param0) {
        ms var2 = null;
        var2 = ((jn) this).field_e.field_g;
        if (((jn) this).field_e == var2) {
          ((jn) this).field_a = null;
          return null;
        } else {
          ((jn) this).field_a = var2.field_g;
          if (param0 != 9) {
            boolean discarded$2 = ((jn) this).a((byte) 19);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final ms d(byte param0) {
        ms var2 = null;
        if (param0 == 18) {
          var2 = ((jn) this).field_a;
          if (var2 == ((jn) this).field_e) {
            ((jn) this).field_a = null;
            return null;
          } else {
            ((jn) this).field_a = var2.field_b;
            return var2;
          }
        } else {
          ms discarded$2 = ((jn) this).b((byte) -83);
          var2 = ((jn) this).field_a;
          if (var2 == ((jn) this).field_e) {
            ((jn) this).field_a = null;
            return null;
          } else {
            ((jn) this).field_a = var2.field_b;
            return var2;
          }
        }
    }

    final void a(ms param0, int param1) {
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
              if (param0.field_g == null) {
                break L1;
              } else {
                param0.b(false);
                break L1;
              }
            }
            param0.field_g = ((jn) this).field_e;
            param0.field_b = ((jn) this).field_e.field_b;
            param0.field_g.field_b = param0;
            param0.field_b.field_g = param0;
            if (param1 == -10295) {
              break L0;
            } else {
              ((jn) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jn.A(");
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final ms d(int param0) {
        ms var2 = null;
        var2 = ((jn) this).field_a;
        if (var2 != ((jn) this).field_e) {
          if (param0 != 9) {
            ms discarded$2 = ((jn) this).d((byte) 68);
            ((jn) this).field_a = var2.field_g;
            return var2;
          } else {
            ((jn) this).field_a = var2.field_g;
            return var2;
          }
        } else {
          ((jn) this).field_a = null;
          return null;
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -65) {
          L0: {
            ((jn) this).e(-106);
            if (((jn) this).field_e.field_b != ((jn) this).field_e) {
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
            if (((jn) this).field_e.field_b != ((jn) this).field_e) {
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

    final void a(ms param0, byte param1) {
        if (!(param0.field_g == null)) {
            param0.b(false);
        }
        param0.field_b = ((jn) this).field_e;
        param0.field_g = ((jn) this).field_e.field_g;
        param0.field_g.field_b = param0;
        if (param1 != 39) {
            return;
        }
        try {
            param0.field_b.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jn.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final ms b(byte param0) {
        ms var2 = null;
        if (param0 < -98) {
          var2 = ((jn) this).field_e.field_g;
          if (((jn) this).field_e == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final ms c(int param0) {
        ms var2 = null;
        Object var3 = null;
        var2 = ((jn) this).field_e.field_b;
        if (var2 != ((jn) this).field_e) {
          if (param0 != 9) {
            var3 = null;
            ((jn) this).a((ms) null, (byte) 81);
            var2.b(false);
            return var2;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_c = null;
    }

    final ms b(int param0) {
        ms var2 = null;
        int var3 = 0;
        var3 = 64 % ((5 - param0) / 61);
        var2 = ((jn) this).field_e.field_b;
        if (((jn) this).field_e == var2) {
          ((jn) this).field_a = null;
          return null;
        } else {
          ((jn) this).field_a = var2.field_b;
          return var2;
        }
    }

    final void e(int param0) {
        ms var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var2 = ((jn) this).field_e.field_b;
          if (((jn) this).field_e == var2) {
            if (param0 < 114) {
              field_d = null;
              ((jn) this).field_a = null;
              return;
            } else {
              ((jn) this).field_a = null;
              return;
            }
          } else {
            var2.b(false);
            continue L0;
          }
        }
    }

    public jn() {
        ((jn) this).field_e = new ms();
        ((jn) this).field_e.field_g = ((jn) this).field_e;
        ((jn) this).field_e.field_b = ((jn) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 9;
    }
}
