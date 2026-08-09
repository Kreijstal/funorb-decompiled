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
            param1.field_b = this.field_a.field_b;
            param1.field_d = this.field_a;
            if (param0 <= 74) {
                field_d = 72;
            }
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "wb.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        jb var2;
        int var3;
        jb var4;
        var3 = CrazyCrystals.field_B;
        L0: while (true) {
          var2 = this.field_a.field_b;
          if (var2 == this.field_a) {
            this.field_c = null;
            if (param0 != 22800) {
              var4 = (jb) null;
              this.b(44, (jb) null);
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
        jb var2;
        var2 = this.field_a.field_d;
        if (this.field_a == var2) {
          this.field_c = null;
          return null;
        } else {
          if (param0 >= -23) {
            this.a((byte) -78);
            this.field_c = var2.field_d;
            return var2;
          } else {
            this.field_c = var2.field_d;
            return var2;
          }
        }
    }

    public static void f(int param0) {
        if (param0 < 1) {
            return;
        }
        field_e = null;
        field_b = null;
    }

    final jb a(boolean param0) {
        jb var2;
        var2 = this.field_c;
        if (!param0) {
          if (var2 == this.field_a) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_b;
            return var2;
          }
        } else {
          return (jb) null;
        }
    }

    final jb g(int param0) {
        jb var2;
        var2 = this.field_a.field_b;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        } else {
          if (param0 != 32073) {
            this.field_a = (jb) null;
            this.field_c = var2.field_b;
            return var2;
          } else {
            this.field_c = var2.field_b;
            return var2;
          }
        }
    }

    final static void a(int param0, dl param1, String param2) {
        RuntimeException runtimeException = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              gh.field_A = param2;
              wl.field_o = param1;
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (String) null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wb.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final jb d(int param0) {
        jb var2;
        int var3;
        var3 = -76 % ((-55 - param0) / 57);
        var2 = this.field_a.field_d;
        if (var2 == this.field_a) {
          return null;
        } else {
          var2.a(false);
          return var2;
        }
    }

    final void b(int param0, jb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            param1.field_d = this.field_a.field_d;
            param1.field_b = this.field_a;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            if (param0 == 0) {
              break L0;
            } else {
              this.c(-27);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("wb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -16497) {
          L0: {
            field_e = (wb) null;
            if (this.field_a.field_b != this.field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_a.field_b != this.field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final jb e(int param0) {
        jb var2;
        var2 = this.field_c;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_d;
          if (param0 != 0) {
            return (jb) null;
          } else {
            return var2;
          }
        }
    }

    final jb c(int param0) {
        jb var2;
        jb var3;
        if (param0 == 0) {
          var2 = this.field_a.field_b;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          var3 = (jb) null;
          this.a(4, (jb) null);
          var2 = this.field_a.field_b;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    public wb() {
        this.field_a = new jb();
        this.field_a.field_b = this.field_a;
        this.field_a.field_d = this.field_a;
    }

    static {
        field_b = "Suggested names: ";
        field_d = 0;
        field_e = new wb();
    }
}
