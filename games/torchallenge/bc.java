/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc implements j, gd {
    static boolean[][][] field_h;
    int field_e;
    static boolean[] field_l;
    static int field_d;
    int field_n;
    int field_a;
    private int field_m;
    int field_q;
    int field_p;
    int field_r;
    int field_i;
    int field_c;
    eg field_g;
    private boolean field_j;
    static int field_o;
    int field_k;
    int field_b;
    static ka field_f;

    public final int a(int param0) {
        if (param0 != -1) {
          return -82;
        }
        return this.field_g.field_K + this.field_g.field_x;
    }

    public final int a(ee param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_l = (boolean[]) null;
          }
          stackIn_3_0 = this.b(-161, param0, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bc.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, ee param1, int param2, int param3) {
        try {
          this.a(param0, param1, 0, param2, 0, this.field_k, 3, this.field_m);
          if (param3 != 1703945953) {
            bc.a(6, 'ﾓ');
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bc.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, int param4, ee param5) {
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lg var17 = null;
        lg var18 = null;
        var16 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param3 == param2) {
            return;
          }
          if (param5.c(param0 + 86)) {
            var17 = this.a(117, param5);
            var18 = var17;
            if (param2 < param3) {
              var9 = param3;
              var8 = param2;
            } else {
              var8 = param3;
              var9 = param2;
            }
            var10 = var18.a((byte) 7, var8);
            var11 = var18.a((byte) 7, var9);
            bc.a(param5.field_l + (param5.field_i + param1), param5.field_m + param4, param1 + param5.field_i, param5.field_p + (param4 + param5.field_m), 1);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_a[var12];
              if (var10 == var12) {
                stackIn_15_0 = var18.a(-120, var8);
              } else {
                stackIn_15_0 = var13.field_g[0];
              }
              var14 = stackIn_15_0;
              if (var12 != var11) {
                if (var13 != null) {
                  stackIn_20_0 = var13.field_g[var13.field_g.length - 1];
                } else {
                  stackIn_20_0 = 0;
                }
              } else {
                stackIn_20_0 = var18.a(param0 ^ -105, var9);
              }
              var15 = stackIn_20_0;
              kl.field_e.a(4, var15 - var14, this.field_q, var13.field_e, param5.field_i + param1 - (-this.field_a - param5.field_j - var13.field_d), this.a(param4, var14, param5, true), this.field_q >>> 24);
            }
            ie.b((byte) -9);
          }
          if (param0 != 3) {
            this.field_a = 64;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("bc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final int d(ee param0, byte param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4) {
            var4 = (ee) null;
            this.c((ee) null, (byte) -125);
          }
          stackIn_3_0 = -this.field_a + param0.field_l - this.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bc.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int b(int param0, ee param1, int param2, int param3) {
        RuntimeException var5 = null;
        ee var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -161) {
            var6 = (ee) null;
            this.a(36, -6, (ee) null, -5, (byte) 77);
          }
          stackIn_3_0 = param1.field_j + (param1.field_i + param2) + this.field_a + param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("bc.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(ee param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            this.field_q = 60;
          }
          stackIn_3_0 = -this.field_r + param0.field_p - this.field_p;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bc.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 >= -115) {
            field_l = (boolean[]) null;
          }
          param2 = df.a(param2, '_', "", (byte) 125);
          var3 = je.a(param1, 0);
          stackIn_7_0 = (param2.indexOf(param1) != -1) || (-1 != param2.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("bc.BA(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(int param0, ee param1) {
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
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == param1.field_t) {
            param1.field_t = (lg) ((Object) new fa());
          }
          var3_int = this.a(param1, (byte) -1);
          var4 = this.d(param1, (byte) -4);
          if (param0 != 1299932129) {
            return;
          }
          var6 = this.field_i;
          if (var6 != 0) {
            if (2 == var6) {
              var5 = -this.field_g.field_K + var4;
            } else {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = this.field_g.field_x + (var4 + (-this.field_g.field_x - this.field_g.field_K) >> 1);
            }
          } else {
            var5 = this.field_g.field_x;
          }
          var6Lifetime1 = this.field_e;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_t instanceof fa)) {
                return;
              }
              ((fa) (param1.field_t)).a(this.field_g, this.a(param1, -6782), var3_int >> 1, -25602, var5);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_t instanceof fa)) {
              return;
            }
            ((fa) (param1.field_t)).a(this.field_g, this.a(param1, param0 ^ -1299937693), var3_int, (byte) -9, var5);
            return;
          }
          if (param1.field_t instanceof fa) {
            ((fa) (param1.field_t)).b(this.field_g, this.a(param1, -6782), var5, -119, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("bc.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    bc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, int param1, ee param2, int param3, byte param4) {
        int var7 = 0;
        qi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lg var13 = null;
        lg var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2.c(92)) {
            var13 = this.a(-89, param2);
            var14 = var13;
            var7 = var14.a((byte) 7, param3);
            var8 = var13.field_a[var7];
            var9 = var14.a(-105, param3);
            var10 = this.a(param0, var9, param2, true);
            var11 = this.a(param2, 3, param1) + Math.max(0, var8.field_d);
            stackIn_4_0 = this.a(param2, 3, param1);
            stackIn_4_1 = this.d(param2, (byte) -4);
            stackIn_4_2 = var8.field_e;
            if (var14.field_a.length <= 1 + var7) {
              stackIn_5_3 = var8.field_e;
            } else {
              stackIn_5_3 = var13.field_a[1 + var7].field_d;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            bc.a(param2.field_l + param1 + param2.field_i, param2.field_m + param0, param2.field_i + param1, param2.field_p + (param2.field_m + param0), 1);
            kl.field_e.a(var10, var11, (byte) -106, var10, this.field_c, var12);
            ie.b((byte) -9);
          }
          if (param4 <= 60) {
            this.field_k = -55;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("bc.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    String a(ee param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -6782) {
            stackIn_4_0 = param0.field_v;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bc.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final lg a(int param0, ee param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        lg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -31 % ((param0 - 35) / 52);
          if (null == param1.field_t) {
            param1.field_t = (lg) ((Object) new fa());
          }
          if (this.field_j) {
            ((fa) (param1.field_t)).a(this.a(param1, (byte) -1), this.field_n, this.field_e, this.a(param1, -6782), this.field_g, this.d(param1, (byte) -4), -1, this.field_i);
          } else {
            this.b(1299932129, param1);
          }
          stackIn_7_0 = param1.field_t;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int c(ee param0, byte param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-96, param0);
          if (param1 > -91) {
            var4 = (ee) null;
            this.b((ee) null, (byte) -62);
          }
          stackIn_3_0 = param0.field_t.b((byte) 57) + (this.field_r + this.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bc.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1) {
          return;
        }
        wb.b((byte) -118);
        qg.a(param1, param2, param3, param0);
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (param0 < 75) {
          return false;
        }
        if (ea.a(param1, -121)) {
          return true;
        }
        if (45 != param1 &&
          param1 != 160 &&
          param1 != 32 &&
          95 != param1) {
          return false;
        }
        return true;
    }

    public final int a(int param0, int param1, ee param2, byte param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -53 / ((param3 - 13) / 38);
          this.a(-127, param2);
          stackIn_1_0 = param2.field_t.a(-this.a(param5, param2, false) + param1, (byte) -77, -this.a(param2, 3, param4) + param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("bc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, bc param1) {
        int discarded$0 = 0;
        try {
          param1.field_b = this.field_b;
          param1.field_c = this.field_c;
          param1.field_e = this.field_e;
          param1.field_j = this.field_j;
          if (param0 >= -93) {
            ee var4 = (ee) null;
            discarded$0 = this.d((ee) null, (byte) 49);
          }
          param1.field_i = this.field_i;
          param1.field_a = this.field_a;
          param1.field_k = this.field_k;
          param1.field_q = this.field_q;
          param1.field_n = this.field_n;
          param1.field_m = this.field_m;
          param1.field_r = this.field_r;
          param1.field_g = this.field_g;
          param1.field_p = this.field_p;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bc.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, ee param1, boolean param2) {
        RuntimeException var4 = null;
        ee var5 = null;
        Object stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        ee stackIn_4_3;
        Object stackIn_5_0;
        boolean stackIn_5_4;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var5 = (ee) null;
            this.b(46, (ee) null);
          }
          stackIn_4_0 = this;
          stackIn_4_1 = param0;
          stackIn_4_2 = 0;
          stackIn_4_3 = (ee) (param1);
          if (param2) {
            stackIn_5_0 = this;
            stackIn_5_4 = false;
          } else {
            stackIn_5_0 = this;
            stackIn_5_4 = true;
          }
          stackIn_6_0 = this.a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = (boolean[][][]) null;
        field_l = null;
        if (param0 != 46) {
          bc.a(58, 'j');
        }
    }

    public void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        if (this.field_g == null) {
          return;
        }
        if (param3 != 97) {
          return;
        }
        try {
          this.a(param2, param0, param1, param3 ^ 1703945856);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(ee param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-105, param0);
          var3_int = -23 / ((-65 - param1) / 49);
          stackIn_1_0 = param0.field_t.a((byte) -63) + (this.field_a + this.field_b);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bc.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, ee param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          bc.a(param1.field_i + param3 + param1.field_l, param1.field_m + param0, param3 + param1.field_i, param1.field_p + param1.field_m + param0, 1);
          var9_int = this.a(param1, (byte) -1);
          if (param6 != 3) {
            this.field_c = -22;
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.d(param1, (byte) -4);
          if (this.field_j) {
            this.field_g.a(this.a(param1, -6782), this.a(param0, param4, param1, true), this.b(-161, param1, param3, param2), var9_int, var10, param5, param7, this.field_e, this.field_i, this.field_n);
          } else {
            var12 = this.field_i;
            if (var12 == 0) {
              var11 = this.field_g.field_x;
            } else {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = (-this.field_g.field_x + var10 - this.field_g.field_K >> 1) + this.field_g.field_x;
              } else {
                var11 = var10 - this.field_g.field_K;
              }
            }
            var12Lifetime1 = this.field_e;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_g.a(this.a(param1, -6782), (var9_int >> 1) + this.a(param0, param4, param1, true), var11 + this.b(param6 - 164, param1, param3, param2), param5, param7);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_g.b(this.a(param1, -6782), var9_int + this.a(param0, param4, param1, true), this.b(param6 ^ -164, param1, param3, param2) + var11, param5, param7);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_g.c(this.a(param1, -6782), this.a(param0, param4, param1, true), var11 + this.b(-161, param1, param3, param2), param5, param7);
            }
          }
          ie.b((byte) -9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("bc.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    protected bc() {
    }

    private final int a(int param0, int param1, ee param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            stackIn_4_0 = param2.field_u + (this.field_r + param0 + (param2.field_m + param1));
            return stackIn_4_0;
          }
          stackIn_2_0 = -62;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("bc.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    bc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_n = param9;
          this.field_c = param10;
          this.field_i = param8;
          this.field_r = param1;
          this.field_a = param3;
          this.field_e = param7;
          this.field_j = param12 ? true : false;
          this.field_k = param5;
          this.field_q = param11;
          this.field_b = param4;
          this.field_m = param6;
          this.field_p = param2;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_h = new boolean[][][]{new boolean[][]{new boolean[]{false, true, false}, new boolean[]{true, false}, new boolean[]{true, false}, new boolean[]{true, true, true, true, true, true}, new boolean[]{true, false}, new boolean[]{false}, new boolean[]{true, true, true, true, true, false}}, new boolean[][]{new boolean[]{true, false}, new boolean[]{true, false, true, false}, new boolean[]{false, true, true, true, false, false}, new boolean[]{false, true, true, false, true, false}, new boolean[]{false, true, true, false, false}, new boolean[]{true, true, false, true, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, false}, new boolean[]{false, true}, new boolean[]{false, true, true, false}, new boolean[]{false, true, true, true, true, true}, new boolean[]{false, true, true}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}};
        field_d = 0;
        field_l = new boolean[]{false, false, false, false, false, false, true, true, true, true};
    }
}
