/*
 * Decompiled by CFR-JS 0.4.0.
 */
class a implements ml, ui {
    static String field_d;
    private boolean field_i;
    int field_b;
    static String field_c;
    ta field_p;
    static String field_j;
    private int field_m;
    int field_l;
    int field_h;
    int field_k;
    int field_n;
    int field_g;
    int field_f;
    int field_e;
    int field_o;
    int field_a;

    String c(we param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        we var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -775) {
            var4 = (we) null;
            discarded$1 = this.a((we) null, -87);
          }
          stackIn_3_0 = param0.field_s;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final aa a(int param0, we param1) {
        RuntimeException var3 = null;
        aa stackIn_2_0 = null;
        aa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (aa) null;
            return stackIn_2_0;
          }
          if (null == param1.field_q) {
            param1.field_q = (aa) ((Object) new sb());
          }
          if (!this.field_i) {
            this.b(param1, 30373);
          } else {
            ((sb) (param1.field_q)).a(this.b(param1, true), this.field_a, this.c(param1, -775), this.field_o, this.field_p, this.a(param1, param0 - 1), param0 ^ -4477, this.field_l);
          }
          stackIn_10_0 = param1.field_q;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("a.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1 = pf.a((byte) 31, 5);
        if (param0 > 21) {
          cj.a((byte) 108, ke.field_h[20 + var1]);
          return;
        }
        field_j = (String) null;
        cj.a((byte) 108, ke.field_h[20 + var1]);
    }

    private final void a(int param0, int param1, we param2, int param3) {
        try {
          this.a(this.field_m, param1, 0, param3, param2, param0 ^ -25601, this.field_f, 0);
          if (param0 != 25600) {
            this.field_m = -126;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "a.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int a(int param0) {
        if (param0 == 2) {
          return this.field_p.field_D + this.field_p.field_C;
        }
        this.field_i = false;
        return this.field_p.field_D + this.field_p.field_C;
    }

    public final int b(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_d = (String) null;
          }
          stackIn_3_0 = -this.field_g - this.field_h + param0.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-1, param0);
          if (param1) {
            this.field_a = 15;
          }
          stackIn_3_0 = param0.field_q.b(62) + this.field_n + this.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, we param1, int param2, int param3, int param4, int param5) {
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
        be var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        aa var17 = null;
        aa var18 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param4 == param2) {
            return;
          }
          if (param1.b((byte) 65)) {
            var17 = this.a(-1, param1);
            var18 = var17;
            if (param4 <= param2) {
              var8 = param4;
              var9 = param2;
            } else {
              var9 = param4;
              var8 = param2;
            }
            var10 = var18.b(var8, -98);
            var11 = var18.b(var9, -23);
            qi.a(param1.field_l + (param3 + param1.field_r), true, param1.field_p + param5 + param1.field_e, param1.field_r + param3, param5 + param1.field_e);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_c[var12];
              if (var10 != var12) {
                stackIn_15_0 = var13.field_c[0];
              } else {
                stackIn_15_0 = var18.a(124, var8);
              }
              var14 = stackIn_15_0;
              if (var11 != var12) {
                if (var13 == null) {
                  stackIn_20_0 = 0;
                } else {
                  stackIn_20_0 = var13.field_c[-1 + var13.field_c.length];
                }
              } else {
                stackIn_20_0 = var18.a(85, var9);
              }
              var15 = stackIn_20_0;
              hi.field_b.a(this.a((byte) 113, param3, param1, var14), this.field_e, this.field_e >>> 24, var13.field_f, 101, -var14 + var15, var13.field_a + (param1.field_e + param5 + (this.field_n + param1.field_i)));
            }
            tj.b(653);
          }
          if (param0 >= 81) {
            return;
          }
          this.field_m = -34;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("a.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(boolean param0, a param1) {
        try {
          param1.field_n = this.field_n;
          param1.field_o = this.field_o;
          param1.field_f = this.field_f;
          param1.field_b = this.field_b;
          param1.field_g = this.field_g;
          param1.field_h = this.field_h;
          param1.field_e = this.field_e;
          param1.field_l = this.field_l;
          param1.field_m = this.field_m;
          param1.field_a = this.field_a;
          param1.field_k = this.field_k;
          if (param0) {
            this.field_e = -9;
          }
          param1.field_p = this.field_p;
          param1.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "a.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(we param0, int param1, int param2) {
        RuntimeException var4 = null;
        we var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -52) {
            var5 = (we) null;
            this.a(51, (we) null);
          }
          stackIn_3_0 = this.a(param2, param0, 0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("a.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(we param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            this.field_f = 51;
          }
          stackIn_3_0 = -this.field_b + (-this.field_n + param0.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(boolean param0, we param1, int param2, int param3, int param4) {
        if (null == this.field_p) {
          return;
        }
        if (param4 <= 19) {
          return;
        }
        try {
          this.a(25600, param2, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "a.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    a(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(we param0, int param1) {
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
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null == param0.field_q) {
            param0.field_q = (aa) ((Object) new sb());
          }
          var3_int = this.b(param0, true);
          var4 = this.a(param0, param1 - 30375);
          var6 = this.field_o;
          if (var6 != 0) {
            if (var6 != 2) {
              if (3 != var6 &&
                var6 == 1) {
              }
              var5 = this.field_p.field_C + (-this.field_p.field_D + (var4 - this.field_p.field_C) >> 1);
            } else {
              var5 = var4 - this.field_p.field_D;
            }
          } else {
            var5 = this.field_p.field_C;
          }
          var6Lifetime1 = this.field_l;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 == 1) {
              if (param0.field_q instanceof sb) {
                ((sb) (param0.field_q)).a(this.c(param0, -775), var3_int >> 1, -2713, this.field_p, var5);
              }
            } else if (var6Lifetime1 == 2 &&
              param0.field_q instanceof sb) {
              ((sb) (param0.field_q)).a((byte) -82, this.field_p, this.c(param0, -775), var5, var3_int);
            }
          } else {
            if (param0.field_q instanceof sb) {
              ((sb) (param0.field_q)).a(this.c(param0, param1 ^ -30116), var5, 0, this.field_p, (byte) 79);
            }
          }
          if (param1 == 30373) {
            return;
          }
          a.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("a.S(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, we param4, int param5, int param6, int param7) {
        int discarded$0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        we var14 = null;
        int var12Lifetime1;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          qi.a(param3 + (param4.field_r + param4.field_l), true, param4.field_p + param1 + param4.field_e, param3 + param4.field_r, param4.field_e + param1);
          if (param5 != -1) {
            var14 = (we) null;
            discarded$0 = this.a((byte) 57, -109, (we) null, 41);
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.b(param4, true);
          var10 = this.a(param4, param5 ^ 1);
          if (this.field_i) {
            this.field_p.a(this.c(param4, param5 - 774), this.a((byte) 71, param3, param4, param2), this.a(param1, param4, param7, false), var9_int, var10, param6, param0, this.field_l, this.field_o, this.field_a);
          } else {
            var12 = this.field_o;
            if (var12 != 0) {
              if (2 == var12) {
                var11 = -this.field_p.field_D + var10;
              } else {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = this.field_p.field_C + (-this.field_p.field_C + var10 - this.field_p.field_D >> 1);
              }
            } else {
              var11 = this.field_p.field_C;
            }
            var12Lifetime1 = this.field_l;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_p.a(this.c(param4, -775), (var9_int >> 1) + this.a((byte) 72, param3, param4, param2), this.a(param1, param4, param7, false) + var11, param6, param0);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_p.c(this.c(param4, param5 - 774), var9_int + this.a((byte) 59, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_p.b(this.c(param4, param5 - 774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
            }
          }
          tj.b(653);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("a.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(int param0, byte param1, we param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 59) {
            this.field_m = 36;
          }
          stackIn_3_0 = this.a((byte) 89, param0, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("a.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int a(int param0, we param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        we var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            var6 = (we) null;
            this.c((we) null, 32);
          }
          stackIn_3_0 = param0 + (param1.field_e + this.field_n) + param1.field_i + param2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("a.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, we param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 54) {
            this.field_p = (ta) null;
          }
          stackIn_3_0 = param3 + param1 + (param2.field_r + (this.field_h + param2.field_k));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("a.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(we param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        be var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aa var13 = null;
        aa var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 0) {
            this.field_a = -17;
          }
          if (!param0.b((byte) 91)) {
            return;
          }
          var13 = this.a(-1, param0);
          var14 = var13;
          var7 = var14.b(param3, -25);
          var8 = var13.field_c[var7];
          var9 = var14.a(92, param3);
          var10 = this.a((byte) 124, param1, param0, var9);
          var11 = this.a(param0, -118, param2) + Math.max(0, var8.field_a);
          stackIn_6_0 = this.a(param0, -127, param2);
          stackIn_6_1 = this.a(param0, -2);
          stackIn_6_2 = var8.field_f;
          if (var14.field_c.length <= var7 + 1) {
            stackIn_7_3 = var8.field_f;
          } else {
            stackIn_7_3 = var13.field_c[var7 + 1].field_a;
          }
          var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
          qi.a(param0.field_r + (param1 + param0.field_l), true, param0.field_p + param0.field_e + param2, param0.field_r + param1, param0.field_e + param2);
          hi.field_b.a(13421772, this.field_k, var10, var11, var12, var10);
          tj.b(param4 ^ 653);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("a.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (!param0) {
          field_j = (String) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    public final int a(we param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-1, param0);
          if (param1 == 103) {
            stackIn_4_0 = param0.field_q.a(true) + this.field_h + this.field_g;
            return stackIn_4_0;
          }
          stackIn_2_0 = -124;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("a.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1, we param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            a.b(-109);
          }
          this.a(-1, param2);
          stackIn_3_0 = param2.field_q.a(param3 - this.a(param0, (byte) 121, param2), -this.a(param2, -92, param5) + param1, -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("a.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    protected a() {
    }

    a(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_n = param3;
          this.field_h = param1;
          this.field_a = param9;
          this.field_m = param6;
          this.field_k = param10;
          this.field_g = param2;
          this.field_p = param0;
          this.field_e = param11;
          this.field_i = param12 ? true : false;
          this.field_l = param7;
          this.field_o = param8;
          this.field_b = param4;
          this.field_f = param5;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_d = "Return to game";
        field_c = "Orb coins: <%0>";
        field_j = "Updates will sent to the email address you've given";
    }
}
