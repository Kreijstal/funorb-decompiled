/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va implements ur, qa {
    int field_d;
    private boolean field_q;
    int field_n;
    static java.applet.Applet field_o;
    private int field_g;
    int field_m;
    int field_a;
    static int[] field_b;
    static wn field_s;
    static cr field_f;
    int field_e;
    int field_p;
    static String field_r;
    static cr field_h;
    int field_i;
    int field_j;
    int field_c;
    int field_k;
    cc field_l;

    final static void b(int param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!wq.field_H) {
            return;
          }
          bi.b(40, 40, 560, 400, 1, 164);
          bi.e(40, 40, 560, 400, 16777215);
          var1_int = 16;
          var2 = 60;
          var3 = 60;
          if (param0 <= 14) {
            field_o = (java.applet.Applet) null;
          }
          tk.field_c.b("Press 'H' to close this screen", var3, var2, 16777215, -1);
          var2 = var2 + var1_int;
          var4 = var2;
          for (var5 = 0; al.field_A.length > var5; var5++) {
            var7_int = al.field_x[var5];
            if (var7_int == 2) {
              var6 = al.field_A[var5] + "+ALT";
            } else {
              if (var7_int != 1) {
                if (var7_int == 3) {
                  var6 = al.field_A[var5] + "+CTRL+ALT";
                } else {
                  if (var7_int != 0) {
                    var6 = null;
                  } else {
                    var6 = al.field_A[var5];
                  }
                }
              } else {
                var6 = al.field_A[var5] + "+CTRL";
              }
            }
            boolean decompiledFrameRemainder0 = true;
            var9 = var5 / 12;
            var10 = var5 - var9 * 12;
            var11 = 0;
            if (-7 + var10 >= 0) {
              var12 = -7 + (var10 + 5 * var9);
              decompiledFrameRemainder0 = !(var12 < 0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(wa.field_h.length <= var12))) {
                var7 = wa.field_h[var12];
                var8 = 14517504;
              }
            } else {
              var12 = 7 * var9 + var10;
              decompiledFrameRemainder0 = !(jl.field_a.length <= var12);
              if (decompiledFrameRemainder0) {
                var7 = jl.field_a[var12];
                var8 = 39168;
                if ((1 << var12 & mb.field_s) != 0) {
                  var11 = 1;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (var11 != 0) {
                bi.b(-10 + var3, var2 - 10, 50, 20 + var1_int, var8, 120);
              } else {
                bi.b(var3 - 10, -10 + var2, 50, 20 + var1_int, var8);
              }
              tk.field_c.a((String) (var6), var3 - 10, -10 + var2, 50, 20 + var1_int, 16777215, 5592405, 1, 1, 0);
              tk.field_c.a(var7, -10 + (var3 + 60), var2 - 10, 140, var1_int + 20, 16777215, -1, 0, 1, 0);
              var2 = var2 + (24 + var1_int);
              if (var2 > 420) {
                var2 = var4;
                var3 += 220;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "va.H(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 19207) {
            stackIn_3_0 = -94;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (1 < param1) {
            if ((1 & param1) != 0) {
              var3_int = var3_int * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
          }
          if (1 == param1) {
            stackIn_14_0 = var3_int * param2;
            return stackIn_14_0;
          }
          stackIn_16_0 = var3_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "va.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 < 118) {
          va.a(0);
          sl.field_w = 1000000000L / (long)param0;
          return;
        }
        sl.field_w = 1000000000L / (long)param0;
    }

    final static boolean b(byte param0) {
        if (param0 != -81) {
          field_s = (wn) null;
          if (hn.field_w < 10) {
            return false;
          }
          if (!sq.field_c) {
            return !oe.q(95) ? true : false;
          }
          return false;
        }
        if (hn.field_w < 10) {
          return false;
        }
        if (!sq.field_c) {
          return !oe.q(95) ? true : false;
        }
        return false;
    }

    public final int a(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param0, param1 + 102);
          if (param1 != -1) {
            this.field_k = -38;
          }
          stackIn_3_0 = param0.field_r.b((byte) 116) + this.field_k + this.field_c;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = this.a(param2, (byte) 110, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("va.DA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, iq param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -94) {
            stackIn_4_0 = param3 + (param2.field_u + (param2.field_o + param0 + this.field_i));
            return stackIn_4_0;
          }
          stackIn_2_0 = 123;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("va.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        if (!param2) {
          this.field_k = 26;
        }
        if (this.field_l == null) {
          return;
        }
        try {
          this.a(0, param1, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "va.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int b(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -14323) {
            stackIn_4_0 = this.a(param1, (byte) -94, param0, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -38;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("va.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(iq param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param0, 46);
          if (param1 <= 98) {
            this.field_m = -99;
          }
          stackIn_3_0 = param0.field_r.a(8783) + this.field_i + this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int c(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_f = (cr) null;
          }
          stackIn_3_0 = -this.field_c - this.field_k + param0.field_s;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 110) {
            this.a((byte) -120);
          }
          stackIn_3_0 = param0 - (-param3.field_t + (-this.field_k - param3.field_y) - param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("va.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, iq param5, int param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          jb.a(param0 + param5.field_t, param5.field_n + (param5.field_o + param3), param5.field_o + param3, -30486, param5.field_s + param5.field_t + param0);
          var9_int = this.a(-1, param5);
          var10 = this.c(param5, 0);
          if (!this.field_q) {
            var12 = this.field_d;
            if (var12 == 0) {
              var11 = this.field_l.field_z;
            } else {
              if (2 != var12) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = (-this.field_l.field_z + var10 - this.field_l.field_M >> 1) + this.field_l.field_z;
              } else {
                var11 = var10 - this.field_l.field_M;
              }
            }
            var12Lifetime1 = this.field_m;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_l.c(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9_int >> 1), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_l.a(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + var9_int, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_l.b(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
            }
          } else {
            this.field_l.a(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5), var9_int, var10, param6, param1, this.field_m, this.field_d, this.field_n);
          }
          ln.d(-28558);
          if (param4 > 64) {
            return;
          }
          this.field_i = -47;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("va.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, iq param3, int param4) {
        ro var13 = null;
        ro var14 = null;
        int var7 = 0;
        lq var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 > -81) {
          return;
        }
        try {
          if (param3.f(48)) {
            var13 = this.b(param3, 80);
            var14 = var13;
            var7 = var14.a(param1, 22413);
            var8 = var13.field_c[var7];
            var9 = var14.b(param1, -61);
            var10 = this.a(param2, (byte) -94, param3, var9);
            var11 = this.a(param3, 1, param4) + Math.max(0, var8.field_f);
            var12 = this.a(param3, 1, param4) + Math.min(this.c(param3, 0), Math.min(var8.field_d, var14.field_c.length > 1 + var7 ? var13.field_c[1 + var7].field_f : var8.field_d));
            jb.a(param3.field_t + param4, param3.field_o + param2 + param3.field_n, param2 + param3.field_o, -30486, param4 + (param3.field_t + param3.field_s));
            eb.field_c.a(var10, var12, this.field_p, var10, var11, 105);
            ln.d(-28558);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "va.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(int param0, int param1, int param2, int param3, iq param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param4, 33);
          if (param2 > 21) {
            stackIn_4_0 = param4.field_r.a(param5 - this.a(param4, 1, param1), (byte) 42, param0 - this.b(param4, param3, -14323));
            return stackIn_4_0;
          }
          stackIn_2_0 = 114;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("va.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, iq param3) {
        try {
          this.a(param2, this.field_g, 0, param1, 65, param3, this.field_e, param0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "va.R(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, iq param1) {
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
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == param1.field_r) {
            param1.field_r = (ro) ((Object) new sl());
          }
          var3_int = this.a(-1, param1);
          var4 = this.c(param1, 0);
          var6 = this.field_d;
          if (var6 == 0) {
            var5 = this.field_l.field_z;
          } else {
            if (var6 == 2) {
              var5 = var4 - this.field_l.field_M;
            } else {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (var4 - (this.field_l.field_z + this.field_l.field_M) >> 1) + this.field_l.field_z;
            }
          }
          if (param0) {
            field_o = (java.applet.Applet) null;
          }
          var6Lifetime1 = this.field_m;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_r instanceof sl)) {
                return;
              }
              ((sl) (param1.field_r)).a(var5, this.field_l, this.a((byte) -90, param1), -12558, var3_int >> 1);
              return;
            }
            if (2 == var6Lifetime1 &&
              param1.field_r instanceof sl) {
              ((sl) (param1.field_r)).a(var3_int, (byte) 94, this.field_l, var5, this.a((byte) -90, param1));
              return;
            }
            return;
          }
          if (!(param1.field_r instanceof sl)) {
            return;
          }
          ((sl) (param1.field_r)).b(-96, this.field_l, this.a((byte) -90, param1), var5, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("va.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(int param0, va param1) {
        try {
          param1.field_g = this.field_g;
          param1.field_d = this.field_d;
          param1.field_n = this.field_n;
          param1.field_p = this.field_p;
          param1.field_l = this.field_l;
          param1.field_i = this.field_i;
          if (param0 != 16777215) {
            this.field_e = 14;
          }
          param1.field_c = this.field_c;
          param1.field_j = this.field_j;
          param1.field_a = this.field_a;
          param1.field_q = this.field_q;
          param1.field_e = this.field_e;
          param1.field_m = this.field_m;
          param1.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "va.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(byte param0) {
        if (param0 == -91) {
          return this.field_l.field_M + this.field_l.field_z;
        }
        iq var3 = (iq) null;
        this.a((iq) null, (byte) 64);
        return this.field_l.field_M + this.field_l.field_z;
    }

    public final int a(int param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_p = 47;
          }
          stackIn_3_0 = -this.field_j + param1.field_n - this.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(iq param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ro var17 = null;
        ro var18 = null;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 == param3) {
            return;
          }
          if (param0.f(24)) {
            var17 = this.b(param0, 122);
            var18 = var17;
            if (param3 < param1) {
              var9 = param1;
              var8 = param3;
            } else {
              var8 = param1;
              var9 = param3;
            }
            var10 = var18.a(var8, 22413);
            var11 = var18.a(var9, 22413);
            jb.a(param0.field_t + param4, param0.field_n + param0.field_o + param5, param0.field_o + param5, -30486, param0.field_s + (param4 + param0.field_t));
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_c[var12];
              if (var12 != var10) {
                stackIn_14_0 = var13.field_c[0];
              } else {
                stackIn_14_0 = var18.b(var8, -28);
              }
              var14 = stackIn_14_0;
              if (var12 != var11) {
                if (var13 == null) {
                  stackIn_19_0 = 0;
                } else {
                  stackIn_19_0 = var13.field_c[var13.field_c.length - 1];
                }
              } else {
                stackIn_19_0 = var18.b(var9, 126);
              }
              var15 = stackIn_19_0;
              eb.field_c.a(var13.field_d, (byte) -101, param4 + param0.field_t + (this.field_k + param0.field_y) + var13.field_f, this.field_a, this.field_a >>> 24, this.a(param5, (byte) -94, param0, var14), var15 - var14);
            }
            ln.d(-28558);
          }
          if (!param2) {
            return;
          }
          this.field_n = -106;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("va.U(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_r = null;
        field_o = null;
        if (param0 != 60) {
          return;
        }
        field_s = null;
        field_f = null;
    }

    String a(byte param0, iq param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -90) {
            va.a(-117, 22, 99);
          }
          stackIn_3_0 = param1.field_w;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final ro b(iq param0, int param1) {
        RuntimeException var3 = null;
        ro stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_r == null) {
            param0.field_r = (ro) ((Object) new sl());
          }
          if (param1 < 4) {
            this.field_p = -35;
          }
          if (!this.field_q) {
            this.a(false, param0);
          } else {
            ((sl) (param0.field_r)).a(this.field_d, this.a((byte) -90, param0), 1, this.field_l, this.field_m, this.c(param0, 0), this.a(-1, param0), this.field_n);
          }
          stackIn_9_0 = param0.field_r;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("va.S(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    protected va() {
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_g = param6;
          this.field_a = param11;
          this.field_q = param12 ? true : false;
          this.field_j = param2;
          this.field_d = param8;
          this.field_c = param4;
          this.field_k = param3;
          this.field_i = param1;
          this.field_e = param5;
          this.field_m = param7;
          this.field_n = param9;
          this.field_l = param0;
          this.field_p = param10;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_r = "<%0> cannot join; the game is full.";
        field_b = null;
    }
}
