/*
 * Decompiled by CFR-JS 0.4.0.
 */
class h implements ui, m {
    int field_c;
    int field_a;
    private int field_m;
    int field_g;
    kg field_i;
    int field_b;
    int field_e;
    int field_k;
    int field_n;
    static char[] field_l;
    private boolean field_j;
    int field_d;
    int field_f;
    int field_h;

    public final int a(int param0, qg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_i = (kg) null;
          }
          this.a(param1, -2);
          stackIn_3_0 = param1.field_i.b((byte) 113) - (-this.field_h - this.field_k);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("h.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        if (this.field_i == null) {
          return;
        }
        try {
          this.a(251, param0, param1, param4);
          int var6_int = -127 % ((51 - param3) / 47);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "h.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    h(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, byte param1, int param2, int param3, int param4, qg param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -50) {
            stackIn_2_0 = 35;
            return stackIn_2_0;
          }
          this.a(param5, -2);
          stackIn_4_0 = param5.field_i.a(param4 - this.a(param1 + 9162, param5, param3), -1, -this.a(param5, -113, param0) + param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("h.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          return -99;
        }
        return this.field_i.field_y + this.field_i.field_t;
    }

    public final void a(int param0, int param1, int param2, qg param3, boolean param4) {
        ue var13 = null;
        ue var14 = null;
        int var7 = 0;
        ol var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!param4) {
          return;
        }
        try {
          if (param3.b((byte) -110)) {
            var13 = this.a(param3, -2);
            var14 = var13;
            var7 = var14.b(-1, param1);
            var8 = var13.field_b[var7];
            var9 = var14.c(0, param1);
            var10 = this.a(239, param3, param0, var9);
            var11 = this.a(param3, -83, param2) + Math.max(0, var8.field_a);
            var12 = this.a(param3, -102, param2) + Math.min(this.d(param3, 15065), Math.min(var8.field_f, 1 + var7 < var14.field_b.length ? var13.field_b[1 + var7].field_a : var8.field_f));
            c.a(param0 - (-param3.field_p - param3.field_l), param3.field_p + param0, (byte) -50, param3.field_h + param2 + param3.field_n, param2 + param3.field_n);
            vi.field_e.a(var10, this.field_n, var12, var11, var10, (byte) 119);
            fi.c(param4);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "h.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final void a(qg param0, int param1, int param2, int param3, byte param4, int param5) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ol var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ue var17 = null;
        ue var18 = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param4 != -49) {
            return;
          }
          if (param5 == param3) {
            return;
          }
          if (param0.b((byte) -104)) {
            var17 = this.a(param0, -2);
            var18 = var17;
            if (param5 > param3) {
              var8 = param3;
              var9 = param5;
            } else {
              var9 = param3;
              var8 = param5;
            }
            var10 = var18.b(-1, var8);
            var11 = var18.b(-1, var9);
            c.a(param2 + (param0.field_p + param0.field_l), param0.field_p + param2, (byte) -50, param0.field_h + (param1 + param0.field_n), param1 + param0.field_n);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_b[var12];
              if (var10 != var12) {
                stackIn_16_0 = var13.field_g[0];
              } else {
                stackIn_16_0 = var18.c(param4 + 49, var8);
              }
              var14 = stackIn_16_0;
              if (var11 == var12) {
                stackIn_21_0 = var18.c(param4 + 49, var9);
              } else {
                if (var13 != null) {
                  stackIn_21_0 = var13.field_g[-1 + var13.field_g.length];
                } else {
                  stackIn_21_0 = 0;
                }
              }
              var15 = stackIn_21_0;
              vi.field_e.a(this.field_g >>> 24, this.field_c + (param1 + param0.field_n - (-param0.field_o - var13.field_a)), var15 - var14, this.a(239, param0, param2, var14), this.field_g, var13.field_f, 4);
            }
            fi.c(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("h.BA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(byte param0, qg param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null == param1.field_i) {
            param1.field_i = (ue) ((Object) new jh());
          }
          var3_int = this.b(0, param1);
          var4 = this.d(param1, param0 + 14967);
          if (param0 != 98) {
            return;
          }
          var6 = this.field_a;
          if (var6 != 0) {
            if (var6 != 2) {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = (-this.field_i.field_t - this.field_i.field_y + var4 >> 1) + this.field_i.field_y;
            } else {
              var5 = var4 - this.field_i.field_t;
            }
          } else {
            var5 = this.field_i.field_y;
          }
          var6Lifetime1 = this.field_b;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param1.field_i instanceof jh) {
                ((jh) (param1.field_i)).a(var3_int >> 1, 7531, var5, this.field_i, this.c(param1, param0 - 10));
                return;
              }
            } else {
              if (2 == var6Lifetime1 &&
                param1.field_i instanceof jh) {
                ((jh) (param1.field_i)).a(this.field_i, var3_int, (byte) -74, this.c(param1, 86), var5);
                return;
              }
            }
            return;
          }
          if (param1.field_i instanceof jh) {
            ((jh) (param1.field_i)).a(this.c(param1, param0 + 7), (byte) 50, this.field_i, var5, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("h.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(byte param0, h param1) {
        try {
          param1.field_e = this.field_e;
          param1.field_i = this.field_i;
          param1.field_d = this.field_d;
          param1.field_f = this.field_f;
          param1.field_a = this.field_a;
          param1.field_b = this.field_b;
          if (param0 != -106) {
            this.field_d = -44;
          }
          param1.field_c = this.field_c;
          param1.field_n = this.field_n;
          param1.field_g = this.field_g;
          param1.field_h = this.field_h;
          param1.field_j = this.field_j;
          param1.field_m = this.field_m;
          param1.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "h.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String c(qg param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 53) {
            stackIn_4_0 = param0.field_k;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("h.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int d(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 15065) {
            this.field_d = -59;
          }
          stackIn_3_0 = -this.field_d + (-this.field_c + param0.field_h);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("h.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(qg param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 95 / ((param1 + 4) / 47);
          stackIn_1_0 = this.a(param0, (byte) 118, 0, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("h.R(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int b(int param0, qg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_f = -105;
          }
          stackIn_3_0 = -this.field_k - this.field_h + param1.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("h.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final ue a(qg param0, int param1) {
        RuntimeException var3 = null;
        qg var4 = null;
        ue stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            var4 = (qg) null;
            this.a(-104, (qg) null);
          }
          if (null == param0.field_i) {
            param0.field_i = (ue) ((Object) new jh());
          }
          if (this.field_j) {
            ((jh) (param0.field_i)).a(45, this.field_b, this.field_e, this.b(0, param0), this.c(param0, 127), this.field_i, this.d(param0, 15065), this.field_a);
          } else {
            this.a((byte) 98, param0);
          }
          stackIn_9_0 = param0.field_i;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("h.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int b(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 228) {
            stackIn_2_0 = -50;
            return stackIn_2_0;
          }
          this.a(param0, -2);
          stackIn_4_0 = param0.field_i.a(param1 ^ 153) + this.field_c + this.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("h.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, qg param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 239) {
            this.field_n = 69;
          }
          stackIn_3_0 = param3 + (param1.field_r + param2 + param1.field_p) + this.field_h;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("h.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, qg param3) {
        try {
          this.a(param2, param1, param3, (byte) -49, this.field_f, 0, 0, this.field_m);
          if (param0 != 251) {
            this.field_k = -107;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "h.W(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        if (param3) {
          if (dk.field_k[param0] < dk.field_k[param1]) {
            return true;
          }
          if (dk.field_k[param0] > dk.field_k[param1]) {
            return false;
          }
          if (tb.field_d[param1] > tb.field_d[param0]) {
            return true;
          }
          if (tb.field_d[param1] < tb.field_d[param0]) {
            return false;
          }
        } else {
          if (tb.field_d[param1] > tb.field_d[param0]) {
            return true;
          }
          if (tb.field_d[param0] > tb.field_d[param1]) {
            return false;
          }
          if (dk.field_k[param0] < dk.field_k[param1]) {
            return true;
          }
          if (dk.field_k[param1] < dk.field_k[param0]) {
            return false;
          }
        }
        var4 = bg.field_j[param0] + bh.field_a[param0] + pd.field_a[param0];
        var5 = bg.field_j[param1] + (pd.field_a[param1] + bh.field_a[param1]);
        if (param2 != -7079) {
          field_l = (char[]) null;
        }
        if (var5 > var4) {
          return true;
        }
        if (var4 > var5) {
          return false;
        }
        return !(param1 <= param0);
    }

    private final void a(int param0, int param1, qg param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qg var14 = null;
        int var12Lifetime1;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param3 != -49) {
            var14 = (qg) null;
            this.a(-60, (byte) -69, -117, 8, -43, (qg) null);
          }
          boolean decompiledFrameRemainder0 = true;
          c.a(param2.field_l + param1 + param2.field_p, param1 + param2.field_p, (byte) -50, param2.field_h + param0 + param2.field_n, param0 + param2.field_n);
          var9_int = this.b(0, param2);
          var10 = this.d(param2, 15065);
          if (!this.field_j) {
            var12 = this.field_a;
            if (0 != var12) {
              if (2 != var12) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.field_i.field_y + (var10 - this.field_i.field_y - this.field_i.field_t >> 1);
              } else {
                var11 = var10 - this.field_i.field_t;
              }
            } else {
              var11 = this.field_i.field_y;
            }
            var12Lifetime1 = this.field_b;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_i.c(this.c(param2, param3 ^ -108), this.a(239, param2, param1, param6) + (var9_int >> 1), var11 + this.a(param2, (byte) 123, param5, param0), param4, param7);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_i.a(this.c(param2, 60), this.a(239, param2, param1, param6) + var9_int, var11 + this.a(param2, (byte) 122, param5, param0), param4, param7);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_i.b(this.c(param2, 92), this.a(239, param2, param1, param6), var11 + this.a(param2, (byte) 121, param5, param0), param4, param7);
            }
          } else {
            this.field_i.a(this.c(param2, 108), this.a(239, param2, param1, param6), this.a(param2, (byte) 123, param5, param0), var9_int, var10, param4, param7, this.field_b, this.field_a, this.field_e);
          }
          fi.c(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_30_0 = var9;
          stackIn_30_1 = new StringBuilder().append("h.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int a(qg param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 117) {
            stackIn_4_0 = param0.field_n + (param3 + (this.field_c + param0.field_o) + param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 22;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("h.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 95) {
          h.a(103, 33, -47, false);
        }
        field_l = null;
    }

    public final int a(int param0, qg param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 9112) {
            stackIn_4_0 = this.a(239, param1, param2, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -58;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("h.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    protected h() {
    }

    h(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_j = param12 ? true : false;
          this.field_i = param0;
          this.field_a = param8;
          this.field_e = param9;
          this.field_k = param2;
          this.field_c = param3;
          this.field_d = param4;
          this.field_h = param1;
          this.field_b = param7;
          this.field_m = param6;
          this.field_g = param11;
          this.field_f = param5;
          this.field_n = param10;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_l = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
