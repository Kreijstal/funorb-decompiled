/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private nb field_a;
    private nb field_b;

    final nb a(byte param0) {
        nb var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        if (param0 >= 99) {
          this.field_b = var2.field_i;
          return var2;
        }
        this.a((byte) 86);
        this.field_b = var2.field_i;
        return var2;
    }

    final nb a(int param0) {
        nb var2 = this.field_a.field_i;
        if (var2 != this.field_a) {
          var2.c((byte) -50);
          int var3 = 111 / ((38 - param0) / 57);
          return var2;
        }
        return null;
    }

    final void a(nb param0, byte param1) {
        try {
          if (null != param0.field_h) {
            param0.c((byte) -58);
          }
          param0.field_h = this.field_a.field_h;
          param0.field_i = this.field_a;
          param0.field_h.field_i = param0;
          if (param1 > -89) {
            this.field_a = (nb) null;
          }
          param0.field_i.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ra.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 43 % ((param1 - 48) / 58);
          stackIn_1_0 = tf.a(true, 5, param0, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ra.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        df var4_ref_df = null;
        ep var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        am var9 = null;
        byte[] var13 = null;
        var7 = ZombieDawn.field_J;
        try {
          var2 = 42 / ((-82 - param0) / 32);
          var9 = fj.field_g;
          var3 = var9.d((byte) -118);
          if (0 == var3) {
            var4_ref_df = (df) (jj.field_D.b((byte) 26));
            if (var4_ref_df == null) {
              p.a(1);
              return;
            }
            var5_int = var9.d((byte) -122);
            if (var5_int != 0) {
              var13 = new byte[var5_int];
              var9.a(var5_int, 0, var13, 11240);
            } else {
              var6 = null;
            }
            var9.field_j = var9.field_j + 4;
            if (!var9.g((byte) -98)) {
              p.a(1);
              return;
            }
            var4_ref_df.field_k = true;
            var4_ref_df.b(-27598);
            return;
          }
          if (1 != var3) {
            ae.a((Throwable) null, 10331, "A1: " + cb.f(3));
            p.a(1);
            return;
          }
          var4 = var9.c(-105);
          var5 = (ep) (uk.field_a.b((byte) 26));
          while (var5 != null) {
            if (var4 != var5.field_k) {
              var5 = (ep) (uk.field_a.a(false));
              continue;
            }
            break;
          }
          if (var5 != null) {
            var5.b(-27598);
            return;
          }
          p.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ra.F(" + param0 + ')');
        }
    }

    final int a(boolean param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = 0;
        nb var3 = this.field_a.field_i;
        if (param0) {
          ra.e((byte) 21);
          while (this.field_a != var3) {
            var2++;
            var3 = var3.field_i;
          }
          return var2;
        }
        while (this.field_a != var3) {
          var2++;
          var3 = var3.field_i;
        }
        return var2;
    }

    final static void d(byte param0) {
        int var1 = 118 / ((-2 - param0) / 33);
        mg.a(false);
    }

    final static lp a(dj param0, String param1, String param2, int param3, dj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lp stackIn_2_0 = null;
        lp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param1, (byte) 8);
          if (param3 != 0) {
            stackIn_2_0 = (lp) null;
            return stackIn_2_0;
          }
          var6 = param4.a(var5_int, param2, true);
          stackIn_4_0 = oj.a(var6, param0, var5_int, param4, param3 + 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ra.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public ra() {
        this.field_a = new nb();
        this.field_a.field_i = this.field_a;
        this.field_a.field_h = this.field_a;
    }

    final void b(int param0) {
        nb var5 = null;
        nb var4 = null;
        int var3 = ZombieDawn.field_J;
        if (param0 < 37) {
          this.field_b = (nb) null;
          while (true) {
            var5 = this.field_a.field_i;
            if (this.field_a == var5) {
              break;
            }
            var5.c((byte) -122);
          }
          this.field_b = null;
          return;
        }
        while (true) {
          var4 = this.field_a.field_i;
          if (this.field_a == var4) {
            break;
          }
          var4.c((byte) -122);
        }
        this.field_b = null;
    }

    final nb c(byte param0) {
        nb var2 = this.field_a.field_i;
        if (param0 != 34) {
          this.field_a = (nb) null;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_i;
          return var2;
        }
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_i;
        return var2;
    }

    final static String e(byte param0) {
        if (fk.field_F == vh.field_c) {
          return to.field_d;
        }
        if (!gl.field_E.a(112)) {
          return gl.field_E.c(0);
        }
        if (tk.field_a == vh.field_c) {
          return gl.field_E.c(0);
        }
        if (param0 < -12) {
          return m.field_B;
        }
        ra.e((byte) 66);
        return m.field_B;
    }

    static {
    }
}
