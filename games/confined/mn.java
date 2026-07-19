/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_g;
    static mi field_b;
    rk field_a;
    static e field_f;
    private rk field_d;
    static mi field_e;
    static String field_c;

    final rk b(byte param0) {
        rk var2 = null;
        if (param0 > 83) {
          var2 = this.field_a.field_a;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        } else {
          return (rk) null;
        }
    }

    final rk d(int param0) {
        rk discarded$2 = null;
        rk var2 = null;
        var2 = this.field_d;
        if (this.field_a != var2) {
          this.field_d = var2.field_h;
          if (param0 != 2123) {
            discarded$2 = this.d(48);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_d = null;
          return null;
        }
    }

    final rk c(int param0) {
        rk discarded$2 = null;
        rk var2 = null;
        if (param0 == 1) {
          var2 = this.field_a.field_h;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        } else {
          discarded$2 = this.b((byte) 116);
          var2 = this.field_a.field_h;
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        }
    }

    final void a(rk param0, byte param1) {
        try {
            int var3_int = -8 / ((param1 - 0) / 61);
            if (!(param0.field_a == null)) {
                param0.a(true);
            }
            param0.field_a = this.field_a.field_a;
            param0.field_h = this.field_a;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != -1) {
            return false;
        }
        return this.field_a.field_h == this.field_a ? true : false;
    }

    final static void a(String param0, int param1, byte param2, int param3, int param4, int param5) {
        try {
            nn.field_t[param4].d(param1, param3);
            pn.field_a.c(param0, 2 + param1, 14 + param3, 16777215, -1);
            if (param2 != -30) {
                mn.b(-116);
            }
            pn.field_a.a(Integer.toString(param5), 39 + param1, 38 + param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(rk param0, int param1) {
        if (param1 != -1) {
            return;
        }
        try {
            if (!(param0.field_a == null)) {
                param0.a(true);
            }
            param0.field_h = this.field_a.field_h;
            param0.field_a = this.field_a;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mn.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rk a(byte param0) {
        rk var2 = this.field_d;
        if (!(this.field_a != var2)) {
            this.field_d = null;
            return null;
        }
        int var3 = -15 % ((param0 - 12) / 41);
        this.field_d = var2.field_a;
        return var2;
    }

    final void e(int param0) {
        rk var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          var2 = this.field_a.field_h;
          if (var2 != this.field_a) {
            var2.a(true);
            continue L0;
          } else {
            this.field_d = null;
            if (param0 < 29) {
              field_b = (mi) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final rk a(rk param0, boolean param1) {
        rk discarded$2 = null;
        rk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        rk stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        rk stackOut_9_0 = null;
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$2 = this.a(true);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = this.field_a.field_a;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (this.field_a == var3) {
              this.field_d = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_d = var3.field_a;
              stackOut_9_0 = (rk) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("mn.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rk) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final rk a(int param0) {
        rk var2 = null;
        int var3 = 0;
        var2 = this.field_a.field_h;
        if (var2 == this.field_a) {
          this.field_d = null;
          return null;
        } else {
          var3 = -59 / ((-54 - param0) / 59);
          this.field_d = var2.field_h;
          return var2;
        }
    }

    final rk a(boolean param0) {
        rk var2 = null;
        var2 = this.field_a.field_a;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        } else {
          this.field_d = var2.field_a;
          if (param0) {
            mn.b(-115);
            return var2;
          } else {
            return var2;
          }
        }
    }

    public mn() {
        this.field_a = new rk();
        this.field_a.field_a = this.field_a;
        this.field_a.field_h = this.field_a;
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -97 / ((param0 - 17) / 52);
    }

    static {
        field_g = "Waiting for textures";
        field_f = new e(4, 1, 1, 1);
        field_c = "Click to skip";
    }
}
