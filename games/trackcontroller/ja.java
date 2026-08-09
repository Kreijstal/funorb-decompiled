/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int[] field_a;
    static String[] field_c;
    fc field_d;
    private fc field_b;

    final fc a(int param0) {
        fc var2;
        var2 = this.field_b;
        if (var2 != this.field_d) {
          this.field_b = var2.field_h;
          if (param0 != 10) {
            field_c = (String[]) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final fc a(byte param0) {
        fc var2 = this.field_d.field_e;
        if (param0 != 95) {
            return (fc) null;
        }
        if (!(this.field_d != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_e;
        return var2;
    }

    final fc b(int param0) {
        fc var2 = this.field_d.field_h;
        if (param0 != 2) {
            return (fc) null;
        }
        if (!(this.field_d != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_h;
        return var2;
    }

    final fc d(int param0) {
        fc var2;
        var2 = this.field_b;
        if (this.field_d != var2) {
          this.field_b = var2.field_e;
          if (param0 <= 88) {
            this.b((byte) 68);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final void a(fc param0, byte param1) {
        try {
            if (!(param0.field_e == null)) {
                param0.a(-107);
            }
            param0.field_e = this.field_d;
            param0.field_h = this.field_d.field_h;
            int var3_int = 26 / ((-14 - param1) / 45);
            param0.field_e.field_h = param0;
            param0.field_h.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ja.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final fc c(byte param0) {
        fc var2;
        var2 = this.field_d.field_e;
        if (param0 < -59) {
          if (var2 == this.field_d) {
            return null;
          } else {
            var2.a(-92);
            return var2;
          }
        } else {
          return (fc) null;
        }
    }

    final fc b(byte param0) {
        fc var2;
        fc var3;
        var2 = this.field_d.field_h;
        if (var2 != this.field_d) {
          var2.a(-101);
          if (param0 >= -77) {
            var3 = (fc) null;
            this.a((byte) -94, (fc) null);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, fc param1) {
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
              if (param1.field_e != null) {
                param1.a(-31);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_e = this.field_d.field_e;
            param1.field_h = this.field_d;
            param1.field_e.field_h = param1;
            param1.field_h.field_e = param1;
            if (param0 <= -90) {
              break L0;
            } else {
              this.field_b = (fc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ja.M(").append(param0).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            this.a(false);
            if (this.field_d != this.field_d.field_h) {
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
            if (this.field_d != this.field_d.field_h) {
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

    public static void c(boolean param0) {
        if (param0) {
            field_c = (String[]) null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        String var2 = (String) null;
        oc.a(fi.field_l, (byte) 79, (String) null);
        if (param0 == 1) {
            return;
        }
        ja.c(true);
    }

    final int a(boolean param0) {
        int var2;
        fc var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        if (!param0) {
          this.a(true);
          var3 = this.field_d.field_h;
          L0: while (true) {
            if (this.field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = this.field_d.field_h;
          L1: while (true) {
            if (this.field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L1;
            }
          }
        }
    }

    public ja() {
        this.field_d = new fc();
        this.field_d.field_e = this.field_d;
        this.field_d.field_h = this.field_d;
    }

    final void e(int param0) {
        fc var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 == 1) {
          L0: while (true) {
            var2 = this.field_d.field_h;
            if (var2 != this.field_d) {
              var2.a(-42);
              continue L0;
            } else {
              this.field_b = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_a = new int[]{10, 2, 1, 3};
        field_c = new String[29];
    }
}
