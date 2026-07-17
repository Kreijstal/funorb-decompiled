/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_b;
    jb field_a;
    static int field_d;
    static wb field_e;
    private jb field_c;

    final void a(int param0, jb param1) {
        try {
            if (!(null == param1.field_d)) {
                param1.a(false);
            }
            param1.field_b = ((wb) this).field_a.field_b;
            param1.field_d = ((wb) this).field_a;
            if (param0 <= 74) {
                field_d = 72;
            }
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "wb.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0) {
        jb var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = CrazyCrystals.field_B;
        L0: while (true) {
          var2 = ((wb) this).field_a.field_b;
          if (var2 == ((wb) this).field_a) {
            ((wb) this).field_c = null;
            if (param0 != 22800) {
              var4 = null;
              ((wb) this).b(44, (jb) null);
              return;
            } else {
              return;
            }
          } else {
            var2.a(false);
            continue L0;
          }
        }
    }

    final jb a(byte param0) {
        jb var2 = null;
        var2 = ((wb) this).field_a.field_d;
        if (((wb) this).field_a == var2) {
          ((wb) this).field_c = null;
          return null;
        } else {
          if (param0 >= -23) {
            jb discarded$2 = ((wb) this).a((byte) -78);
            ((wb) this).field_c = var2.field_d;
            return var2;
          } else {
            ((wb) this).field_c = var2.field_d;
            return var2;
          }
        }
    }

    public static void f() {
        field_e = null;
        field_b = null;
    }

    final jb a(boolean param0) {
        jb var2 = null;
        var2 = ((wb) this).field_c;
        if (!param0) {
          if (var2 == ((wb) this).field_a) {
            ((wb) this).field_c = null;
            return null;
          } else {
            ((wb) this).field_c = var2.field_b;
            return var2;
          }
        } else {
          return null;
        }
    }

    final jb g(int param0) {
        jb var2 = null;
        var2 = ((wb) this).field_a.field_b;
        if (var2 == ((wb) this).field_a) {
          ((wb) this).field_c = null;
          return null;
        } else {
          if (param0 != 32073) {
            ((wb) this).field_a = null;
            ((wb) this).field_c = var2.field_b;
            return var2;
          } else {
            ((wb) this).field_c = var2.field_b;
            return var2;
          }
        }
    }

    final static void a(int param0, dl param1, String param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              gh.field_A = param2;
              wl.field_o = param1;
              if (param0 == 0) {
                break L1;
              } else {
                var4 = null;
                wb.a(21, (dl) null, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wb.H(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final jb d(int param0) {
        jb var2 = null;
        int var3 = 0;
        var3 = -76 % ((-55 - param0) / 57);
        var2 = ((wb) this).field_a.field_d;
        if (var2 == ((wb) this).field_a) {
          return null;
        } else {
          var2.a(false);
          return var2;
        }
    }

    final void b(int param0, jb param1) {
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
              if (param1.field_d != null) {
                param1.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_d = ((wb) this).field_a.field_d;
            param1.field_b = ((wb) this).field_a;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            if (param0 == 0) {
              break L0;
            } else {
              jb discarded$2 = ((wb) this).c(-27);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("wb.B(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -16497) {
          L0: {
            field_e = null;
            if (((wb) this).field_a.field_b != ((wb) this).field_a) {
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
            if (((wb) this).field_a.field_b != ((wb) this).field_a) {
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

    final jb e(int param0) {
        jb var2 = null;
        var2 = ((wb) this).field_c;
        if (var2 == ((wb) this).field_a) {
          ((wb) this).field_c = null;
          return null;
        } else {
          ((wb) this).field_c = var2.field_d;
          if (param0 != 0) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final jb c(int param0) {
        jb var2 = null;
        Object var3 = null;
        if (param0 == 0) {
          var2 = ((wb) this).field_a.field_b;
          if (var2 == ((wb) this).field_a) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          var3 = null;
          ((wb) this).a(4, (jb) null);
          var2 = ((wb) this).field_a.field_b;
          if (var2 == ((wb) this).field_a) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    public wb() {
        ((wb) this).field_a = new jb();
        ((wb) this).field_a.field_b = ((wb) this).field_a;
        ((wb) this).field_a.field_d = ((wb) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Suggested names: ";
        field_d = 0;
        field_e = new wb();
    }
}
