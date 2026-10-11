/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    le[] field_e;
    private int field_i;
    private int field_c;
    private int field_b;
    private boolean field_d;
    static int[][] field_h;
    private int field_f;
    le field_a;
    private int field_g;

    public static void a(byte param0) {
        if (param0 != -105) {
          field_h = (int[][]) null;
          field_h = (int[][]) null;
          return;
        }
        field_h = (int[][]) null;
    }

    final void a(int param0, ak param1, int param2, int param3, we param4, hc param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_d) {
            param5.a(param1, param4, (byte) -2, param2, param0);
            param5.a(0);
          }
          if (this.field_g != -2147483648) {
            param5.field_g = this.field_g;
          }
          if (this.field_b >= -1) {
            param5.field_b = this.field_b;
          }
          if (-2147483648 != this.field_i) {
            param5.field_i = this.field_i;
          }
          if (this.field_f >= -1) {
            param5.field_f = this.field_f;
          }
          if (null != this.field_a) {
            param5.field_a = this.field_a;
          }
          if (-2147483648 != this.field_c) {
            param5.field_c = this.field_c;
          }
          if (this.field_e != null) {
            param5.field_e = this.field_e;
          }
          if (param3 > 75) {
            return;
          }
          this.b(-78, 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("hc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(byte param0, gk param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        if (param0 != 82) {
          return;
        }
        try {
          qd.field_a = param1.j(param0 + 17195) << 5;
          var2_int = param1.a((byte) 114);
          qd.field_a = qd.field_a + (var2_int >> 3);
          de.field_m = (7 & var2_int) << 18;
          de.field_m = de.field_m + (param1.j(17277) << 2);
          var2_intLifetime1 = param1.a((byte) 114);
          lk.field_a = (var2_intLifetime1 & 63) << 15;
          de.field_m = de.field_m + (var2_intLifetime1 >> 6);
          lk.field_a = lk.field_a + (param1.a((byte) 114) << 7);
          var2_intLifetime2 = param1.a((byte) 114);
          mk.field_i = 65536 & var2_intLifetime2 << 16;
          lk.field_a = lk.field_a + (var2_intLifetime2 >> 1);
          mk.field_i = mk.field_i + param1.j(17277);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final hc a(int param0, int param1) {
        if (param1 != 215650672) {
          this.a((byte) 54, true);
          this.field_g = param0;
          return this;
        }
        this.field_g = param0;
        return this;
    }

    final static void a(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          if (param1 != -50) {
            return;
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hc a(int param0, byte param1) {
        if (param1 != -3) {
          hc.a((byte) 54);
          this.field_f = param0;
          return this;
        }
        this.field_f = param0;
        return this;
    }

    final hc a(int param0, le[] param1) {
        RuntimeException var3 = null;
        hc var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param1;
          if (param0 != -20433) {
            var4 = (hc) null;
            this.a(-59, (hc) null);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(ak param0, we param1, byte param2, int param3, int param4) {
        ta stackIn_21_0;
        String stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_5 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_6 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          lb.a(param4 + param1.field_r, param1.field_l, (byte) -120, this.field_e, param1.field_e + param3, param1.field_p);
          if (this.field_a != null) {
            var6_int = param1.field_r + (param4 + this.field_i);
            var7 = param3 + param1.field_e + this.field_g;
            if (1 == param0.field_l) {
              var6_int = var6_int + (param1.field_l - this.field_a.field_m) / 2;
            }
            if (param0.field_l == 2) {
              var6_int = var6_int + (param1.field_l - this.field_a.field_m);
            }
            if (param0.field_o == 1) {
              var7 = var7 + (param1.field_p - this.field_a.field_n) / 2;
            }
            if (param0.field_o == 2) {
              var7 = var7 + (param1.field_p - this.field_a.field_n);
            }
            this.field_a.c(var6_int, var7);
          }
          if (param2 != -2) {
            this.field_g = 99;
          }
          var6 = param0.c(param1, param2 ^ 775);
          if (var6 != null &&
            null != param0.field_p) {
            if (this.field_f < 0) {
              return;
            }
            stackIn_21_0 = param0.field_p;
            stackIn_21_1 = var6;
            stackIn_21_2 = param4;
            stackIn_21_3 = -param1.field_r;
            stackIn_21_4 = param0.field_h;
            if (this.field_i == -2147483648) {
              stackIn_22_5 = 0;
            } else {
              stackIn_22_5 = this.field_i;
            }
            stackIn_24_2 = stackIn_21_2 - (stackIn_21_3 - (stackIn_21_4 + stackIn_22_5));
            stackIn_24_3 = param1.field_e;
            stackIn_24_4 = param3;
            stackIn_24_5 = -param0.field_n;
            if (this.field_g != -2147483648) {
              stackIn_25_6 = this.field_g;
            } else {
              stackIn_25_6 = 0;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 - (stackIn_24_5 - stackIn_25_6));
            stackIn_27_4 = -param0.field_g + (-param0.field_h + param1.field_l);
            stackIn_27_5 = -param0.field_b - param0.field_n + param1.field_p;
            stackIn_27_6 = this.field_f;
            stackIn_27_7 = this.field_b;
            if (this.field_c != -2147483648) {
              stackIn_28_8 = this.field_c;
            } else {
              stackIn_28_8 = 256;
            }
            ((ta) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param0.field_l, param0.field_o, param0.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("hc.K(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final hc b(int param0, int param1) {
        if (param0 < 117) {
          return (hc) null;
        }
        this.field_i = param1;
        return this;
    }

    final hc a(boolean param0, int param1) {
        if (!param0) {
          return (hc) null;
        }
        this.field_b = param1;
        return this;
    }

    final void a(int param0, hc param1) {
        try {
          param1.field_d = this.field_d;
          param1.field_g = this.field_g;
          param1.field_f = this.field_f;
          param1.field_c = this.field_c;
          int var3_int = 120 % ((-3 - param0) / 51);
          param1.field_a = this.field_a;
          param1.field_e = this.field_e;
          param1.field_i = this.field_i;
          param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final hc a(byte param0, boolean param1) {
        if (param0 != -48) {
          return (hc) null;
        }
        this.field_d = param1 ? true : false;
        return this;
    }

    final void a(int param0) {
        this.field_i = param0;
        this.field_g = 0;
        this.field_e = null;
        this.field_f = 0;
        this.field_a = null;
        this.field_b = -1;
        this.field_c = 256;
    }

    hc() {
        this.field_i = -2147483648;
        this.field_b = -2;
        this.field_e = null;
        this.field_d = false;
        this.field_a = null;
        this.field_f = -2;
        this.field_g = -2147483648;
        this.field_c = -2147483648;
    }

    static {
        field_h = new int[][]{new int[]{101, 121}, new int[]{485, 72}, new int[]{522, 374}, new int[]{219, 364}};
    }
}
