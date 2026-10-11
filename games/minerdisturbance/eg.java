/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class eg implements ad, cf {
    int field_r;
    int field_c;
    static ea field_b;
    static String field_g;
    int field_i;
    private int field_o;
    private boolean field_f;
    static wh field_p;
    int field_d;
    int field_a;
    int field_q;
    int field_j;
    int field_l;
    int field_e;
    we field_k;
    int field_n;
    static ea[] field_m;
    static int field_h;

    private final void a(int param0, byte param1, int param2, fe param3) {
        try {
          int var5_int = -123 / ((param1 - 47) / 60);
          this.a(0, true, this.field_o, this.field_q, param2, 0, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "eg.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, fe param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28793) {
            this.field_j = 105;
          }
          stackIn_3_0 = this.a(param1, param2, -4, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("eg.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, eg param1) {
        try {
          param1.field_q = this.field_q;
          param1.field_n = this.field_n;
          param1.field_k = this.field_k;
          param1.field_c = this.field_c;
          int var3_int = 5 % ((-58 - param0) / 37);
          param1.field_l = this.field_l;
          param1.field_d = this.field_d;
          param1.field_r = this.field_r;
          param1.field_f = this.field_f;
          param1.field_i = this.field_i;
          param1.field_j = this.field_j;
          param1.field_o = this.field_o;
          param1.field_e = this.field_e;
          param1.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "eg.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0) {
        int var2 = -44 % ((61 - param0) / 61);
        return this.field_k.field_I + this.field_k.field_E;
    }

    public final int a(int param0, fe param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14463) {
            stackIn_2_0 = 15;
            return stackIn_2_0;
          }
          this.c(0, param1);
          stackIn_4_0 = param1.field_B.a(-1) + this.field_n + this.field_i;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eg.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static bj a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          int var8 = 0;
          ij var9 = null;
          bj stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (jl.field_fb.field_k != null) {
              fe.field_z = new me(jl.field_fb.field_k, 5200, 0);
              jl.field_fb.field_k = null;
              var6 = new uh(255, fe.field_z, new me(jl.field_fb.field_f, 12000, 0), 2097152);
            }
            var7 = null;
            var8 = -4 / ((param0 - 18) / 41);
            if (fe.field_z != null) {
              if (null == aa.field_h) {
                aa.field_h = new me[jl.field_fb.field_e.length];
              }
              if (null == aa.field_h[param1]) {
                aa.field_h[param1] = new me(jl.field_fb.field_e[param1], 12000, 0);
                jl.field_fb.field_e[param1] = null;
              }
              var7 = new uh(param1, fe.field_z, aa.field_h[param1], 2097152);
            }
            var9 = ke.field_U.a(param1, (uh) (var7), param2, 0, (uh) (var6));
            if (param3) {
              var9.b(-37);
            }
            stackIn_12_0 = new bj(var9, param4, param5);
            return stackIn_12_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final nf c(int param0, fe param1) {
        RuntimeException var3 = null;
        nf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1.field_B) {
            param1.field_B = (nf) ((Object) new bm());
          }
          if (this.field_f) {
            ((bm) (param1.field_B)).a(this.field_d, this.a(param1, 0), this.field_k, this.a(param1, (byte) -122), this.a(param1, false), (byte) 101, this.field_e, this.field_j);
          } else {
            this.d(119, param1);
          }
          if (param0 != 0) {
            this.field_d = -104;
          }
          stackIn_8_0 = param1.field_B;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("eg.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final int b(int param0, fe param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 100) {
            stackIn_4_0 = this.a(param1, 0, (byte) 26, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 28;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("eg.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fe param4) {
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nf var13 = null;
        nf var14 = null;
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
          if (param4.k(42)) {
            var13 = this.c(0, param4);
            var14 = var13;
            var7 = var14.a((byte) 39, param2);
            var8 = var13.field_f[var7];
            var9 = var14.a(param2, (byte) -124);
            var10 = this.a(param4, param1, -4, var9);
            var11 = this.b(100, param4, param3) + Math.max(0, var8.field_h);
            stackIn_4_0 = this.b(100, param4, param3);
            stackIn_4_1 = this.a(param4, 0);
            stackIn_4_2 = var8.field_i;
            if (1 + var7 < var14.field_f.length) {
              stackIn_5_3 = var13.field_f[var7 + 1].field_h;
            } else {
              stackIn_5_3 = var8.field_i;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            wf.a(param3 + param4.field_t, param1 + param4.field_u, (byte) 8, param1 + param4.field_u + param4.field_v, param4.field_q + (param3 + param4.field_t));
            bd.field_c.a(var10, var12, var11, (byte) 97, var10, this.field_a);
            tk.b(true);
          }
          if (param0 != 13034) {
            this.field_k = (we) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("eg.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, fe param7) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = MinerDisturbance.field_ab;
        try {
          boolean decompiledFrameRemainder0 = true;
          wf.a(param7.field_t + param4, param6 + param7.field_u, (byte) 8, param6 - (-param7.field_u - param7.field_v), param7.field_q + param4 + param7.field_t);
          var9_int = this.a(param7, false);
          var10 = this.a(param7, 0);
          if (!this.field_f) {
            var12 = this.field_d;
            if (0 == var12) {
              var11 = this.field_k.field_I;
            } else {
              if (2 != var12) {
                if (3 != var12 &&
                  var12 != 1) {
                }
                var11 = this.field_k.field_I + (-this.field_k.field_E - this.field_k.field_I + var10 >> 1);
              } else {
                var11 = -this.field_k.field_E + var10;
              }
            }
            var12Lifetime1 = this.field_j;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_k.b(this.a(param7, (byte) 101), (var9_int >> 1) + this.a(param7, param6, -4, param5), var11 + this.a(param7, param0, (byte) 26, param4), param3, param2);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_k.c(this.a(param7, (byte) -114), this.a(param7, param6, -4, param5) + var9_int, this.a(param7, param0, (byte) 26, param4) + var11, param3, param2);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_k.a(this.a(param7, (byte) -100), this.a(param7, param6, -4, param5), var11 + this.a(param7, param0, (byte) 26, param4), param3, param2);
            }
          } else {
            this.field_k.a(this.a(param7, (byte) 67), this.a(param7, param6, -4, param5), this.a(param7, param0, (byte) 26, param4), var9_int, var10, param3, param2, this.field_j, this.field_d, this.field_e);
          }
          tk.b(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_25_0 = var9;
          stackIn_25_1 = new StringBuilder().append("eg.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 19) {
          eg.b(122);
        }
        stackIn_7_0 = (kj.a(false)) || !(pj.field_a > 0);
        return stackIn_7_0;
    }

    private final int a(fe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_q = 121;
          }
          stackIn_3_0 = param0.field_q - (this.field_c + this.field_l);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eg.DA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void c(int param0) {
        field_b = null;
        field_g = null;
        field_m = null;
        field_p = null;
        if (param0 != -7709) {
          field_g = (String) null;
        }
    }

    private final int a(fe param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        fe var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 26) {
            var6 = (fe) null;
            this.a((fe) null, (byte) 74);
          }
          stackIn_3_0 = param1 + (param0.field_o + param3 + param0.field_t + this.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("eg.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(bj param0, int param1, bj param2, bj param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a((byte) 127) &&
            param2.a(false, "commonui")) {
            if (param0.a((byte) 95) &&
              param0.a(false, "commonui")) {
              if (param1 != 4) {
                return false;
              }
              if (param3.a((byte) 83) &&
                param3.a(false, "button.gif")) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("eg.U(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final int a(fe param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        fe var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var8 = (fe) null;
            this.b(77, (fe) null);
          }
          this.c(0, param0);
          stackIn_3_0 = param0.field_B.a(true, -this.a(28793, param0, param1) + param4, -this.b(100, param0, param5) + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("eg.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, fe param1, int param2, int param3, int param4, boolean param5) {
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nf var17 = null;
        nf var18 = null;
        var16 = MinerDisturbance.field_ab;
        try {
          if (param4 == param0) {
            return;
          }
          if (param1.k(-126)) {
            var17 = this.c(0, param1);
            var18 = var17;
            if (param4 < param0) {
              var9 = param0;
              var8 = param4;
            } else {
              var9 = param4;
              var8 = param0;
            }
            var10 = var18.a((byte) 39, var8);
            var11 = var18.a((byte) 39, var9);
            wf.a(param1.field_t + param2, param3 + param1.field_u, (byte) 8, param1.field_u + (param3 + param1.field_v), param1.field_q + (param1.field_t + param2));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_f[var12];
              if (var10 == var12) {
                stackIn_13_0 = var18.a(var8, (byte) -125);
              } else {
                stackIn_13_0 = var13.field_d[0];
              }
              var14 = stackIn_13_0;
              if (var11 == var12) {
                stackIn_18_0 = var18.a(var9, (byte) -122);
              } else {
                if (var13 != null) {
                  stackIn_18_0 = var13.field_d[-1 + var13.field_d.length];
                } else {
                  stackIn_18_0 = 0;
                }
              }
              var15 = stackIn_18_0;
              bd.field_c.a(this.field_r >>> 24, 0, var13.field_i, this.field_r, var15 - var14, this.a(param1, param3, -4, var14), param1.field_o + (this.field_c + (param1.field_t + (param2 + var13.field_h))));
            }
            tk.b(true);
          }
          if (param5) {
            this.field_r = -102;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("eg.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void d(int param0, fe param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.math.BigInteger var8 = null;
        int var6Lifetime1;
        var7 = MinerDisturbance.field_ab;
        try {
          if (param1.field_B == null) {
            param1.field_B = (nf) ((Object) new bm());
          }
          var3_int = this.a(param1, false);
          var4 = this.a(param1, 0);
          var6 = this.field_d;
          if (0 == var6) {
            var5 = this.field_k.field_I;
          } else {
            if (2 == var6) {
              var5 = -this.field_k.field_E + var4;
            } else {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = this.field_k.field_I + (-this.field_k.field_E + (-this.field_k.field_I + var4) >> 1);
            }
          }
          var6Lifetime1 = this.field_j;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (param1.field_B instanceof bm) {
                ((bm) (param1.field_B)).a(this.a(param1, (byte) 119), 27994, var5, this.field_k, var3_int >> 1);
              }
            } else if (var6Lifetime1 == 2 &&
              param1.field_B instanceof bm) {
              ((bm) (param1.field_B)).a(0, var3_int, this.a(param1, (byte) -108), this.field_k, var5);
            }
          } else {
            if (param1.field_B instanceof bm) {
              ((bm) (param1.field_B)).a(0, this.field_k, this.a(param1, (byte) -121), 110, var5);
            }
          }
          if (param0 < 41) {
            var8 = (java.math.BigInteger) null;
            eg.a(93, (byte) 88, (byte[]) null, -74, (java.math.BigInteger) null, (sb) null, (java.math.BigInteger) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("eg.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String param2, long param3, java.applet.Applet param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var9 = param4.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (param3 >= 0L) {
                var7Lifetime4 = var10 + "; Expires=" + e.a(sf.a((byte) 99) + 1000L * param3, -128) + "; Max-Age=" + param3;
              } else {
                var7Lifetime4 = var10 + "; Discard;";
              }
              lk.a(param4, "document.cookie=\"" + var7Lifetime4 + "\"", (byte) -106);
              var8 = 39 / ((12 - param1) / 62);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("eg.GA(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(fe param0, boolean param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (fe) null;
            this.b(10, (fe) null);
          }
          stackIn_3_0 = -this.field_i + (-this.field_n + param0.field_v);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eg.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(int param0, int param1, fe param2, int param3, boolean param4) {
        if (null == this.field_k) {
          return;
        }
        if (param0 != 12088) {
          return;
        }
        try {
          this.a(param1, (byte) -31, param3, param2);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "eg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(fe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -4) {
            this.field_n = -33;
          }
          stackIn_3_0 = param0.field_p + param0.field_u + (param1 + this.field_n + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("eg.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    eg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    String a(fe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 99 / ((param1 - 0) / 33);
          stackIn_1_0 = param0.field_s;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("eg.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int b(int param0, fe param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 13) {
            stackIn_2_0 = -39;
            return stackIn_2_0;
          }
          this.c(0, param1);
          stackIn_4_0 = param1.field_B.b(102) - (-this.field_c - this.field_l);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eg.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected eg() {
    }

    final static void a(int param0, byte param1, byte[] param2, int param3, java.math.BigInteger param4, sb param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = MinerDisturbance.field_ab;
        try {
          var7_int = th.a((byte) 24, param3);
          if (null == ae.field_d) {
            ae.field_d = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = ae.field_d.nextInt();
          }
          if (null == bd.field_f ||
            !(var7_int <= bd.field_f.field_u.length)) {
            bd.field_f = new sb(var7_int);
          }
          bd.field_f.field_o = 0;
          bd.field_f.a(param0, param3, true, param2);
          bd.field_f.a(-1, var7_int);
          bd.field_f.a(var13, 31747);
          if (null == c.field_a ||
            !(c.field_a.field_u.length >= 100)) {
            c.field_a = new sb(100);
          }
          c.field_a.field_o = 0;
          c.field_a.c(10, 25564);
          if (param1 <= 8) {
            return;
          }
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            c.field_a.a((byte) 84, var13[var11]);
            var11++;
          }
          c.field_a.b((byte) 122, param3);
          c.field_a.a((byte) -49, param4, param6);
          param5.a(0, c.field_a.field_o, true, c.field_a.field_u);
          param5.a(0, bd.field_f.field_o, true, bd.field_f.field_u);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("eg.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    eg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_e = param9;
          this.field_i = param2;
          this.field_l = param4;
          this.field_r = param11;
          this.field_n = param1;
          this.field_d = param8;
          this.field_k = param0;
          this.field_o = param6;
          this.field_f = param12 ? true : false;
          this.field_c = param3;
          this.field_q = param5;
          this.field_j = param7;
          this.field_a = param10;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = "More Achievements to earn";
        field_h = 0;
    }
}
