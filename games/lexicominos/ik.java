/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ik implements rd, ub {
    int field_r;
    int field_o;
    int field_l;
    int field_a;
    int field_e;
    private boolean field_i;
    int field_p;
    static int field_j;
    static int[] field_b;
    private int field_q;
    static int[] field_s;
    static b field_h;
    le field_f;
    int field_n;
    static String field_k;
    int field_d;
    static int[] field_g;
    int field_c;
    int field_m;

    final static String a(byte param0) {
        if (wf.field_i < 2) {
          return ui.field_w;
        }
        if (eh.field_d != null) {
          if (!eh.field_d.c(81)) {
            return oh.field_a;
          }
          return we.field_c;
        }
        if (!we.field_h.c(83)) {
          return qf.field_s;
        }
        if (param0 < 63) {
          ik.b((byte) -17);
        }
        if (!we.field_h.a("commonui", 10762)) {
          return pe.field_e + " - " + we.field_h.b("commonui", (byte) 118) + "%";
        }
        if (!gk.field_a.c(-75)) {
          return li.field_P;
        }
        if (!gk.field_a.a("commonui", 10762)) {
          return v.field_t + " - " + gk.field_a.b("commonui", (byte) 118) + "%";
        }
        if (!ej.field_d.c(-116)) {
          return ef.field_c;
        }
        if (!ej.field_d.a((byte) -114)) {
          return ck.field_c + " - " + ej.field_d.a(false) + "%";
        }
        return ta.field_b;
    }

    public final int a(w param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 20340) {
            stackIn_4_0 = this.a(param0, param1 ^ -20344, 0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ik.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, w param2, byte param3, int param4, int param5) {
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
        rj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ve var17 = null;
        ve var18 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param5 == param4) {
            return;
          }
          if (param2.a(18337)) {
            var17 = this.a(param2, (byte) 63);
            var18 = var17;
            if (param5 > param4) {
              var9 = param5;
              var8 = param4;
            } else {
              var8 = param5;
              var9 = param4;
            }
            var10 = var18.a(28276, var8);
            var11 = var18.a(28276, var9);
            ca.a(param2.field_j + param2.field_t + param1, param0 + param2.field_o, param1 + param2.field_t, param0 + param2.field_o + param2.field_v, false);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_c[var12];
              if (var12 == var10) {
                stackIn_14_0 = var18.a((byte) -114, var8);
              } else {
                stackIn_14_0 = var13.field_a[0];
              }
              var14 = stackIn_14_0;
              if (var11 == var12) {
                stackIn_19_0 = var18.a((byte) -116, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_a[var13.field_a.length - 1];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              nb.field_z.a(this.field_l >>> 24, -var14 + var15, var13.field_d + (param2.field_l + param0) + param2.field_o + this.field_d, var13.field_c, this.a(40, param2, param1, var14), 5092, this.field_l);
            }
            pd.a(param3 ^ -22972);
          }
          if (param3 == 31) {
            return;
          }
          this.field_r = 69;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ik.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(int param0, w param1) {
        RuntimeException var3 = null;
        w var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, (byte) 99);
          if (param0 != -13293) {
            var4 = (w) null;
            this.c(-125, (w) null);
          }
          stackIn_3_0 = param1.field_w.a(0) + this.field_d + this.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int b(int param0, w param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8089) {
            field_h = (b) null;
          }
          this.a(param1, (byte) -109);
          stackIn_3_0 = param1.field_w.a((byte) 94) + this.field_a + this.field_r;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, w param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        rj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ve var13 = null;
        ve var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            this.field_q = -122;
          }
          if (!param3.a(18337)) {
            return;
          }
          var13 = this.a(param3, (byte) -102);
          var14 = var13;
          var7 = var14.a(28276, param0);
          var8 = var13.field_c[var7];
          var9 = var14.a((byte) -125, param0);
          var10 = this.a(40, param3, param1, var9);
          var11 = this.a(param3, 20340, param2) + Math.max(0, var8.field_d);
          stackIn_6_0 = this.a(param3, 20340, param2);
          stackIn_6_1 = this.a((byte) -52, param3);
          stackIn_6_2 = var8.field_c;
          if (var14.field_c.length <= var7 + 1) {
            stackIn_7_3 = var8.field_c;
          } else {
            stackIn_7_3 = var13.field_c[var7 + 1].field_d;
          }
          var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
          ca.a(param1 + param3.field_t + param3.field_j, param2 + param3.field_o, param3.field_t + param1, param2 - (-param3.field_o - param3.field_v), false);
          nb.field_z.a((byte) 10, var12, this.field_c, var10, var10, var11);
          pd.a(-22949);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ik.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(w param0, int param1, int param2, int param3) {
        try {
          if (param2 != -30065) {
            this.a(28);
          }
          this.a(param0, 0, this.field_e, 0, param1, this.field_q, param3, -124);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ik.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var13;
        de var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var12;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        var13 = Lexicominos.field_L ? 1 : 0;
        if (!(param1 instanceof de)) {
          var2 = "";
          var11 = var2;
        } else {
          var14 = (de) ((Object) param1);
          var2 = var14.field_a + " | ";
          param1 = var14.field_c;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        if (param0 > -21) {
          return (String) null;
        }
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var16 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var16;
          var2Lifetime3Lifetime5 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf('\t'));
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (var9 != -1) {
            if (var10 == -1) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    public void a(int param0, int param1, boolean param2, w param3, int param4) {
        if (this.field_f == null) {
          return;
        }
        try {
          if (param4 != -3284) {
            w var7 = (w) null;
            this.a((w) null, -24, -67);
          }
          this.b(param3, param0, param4 - 26781, param1);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ik.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(w param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          ca.a(param0.field_t + (param6 + param0.field_j), param0.field_o + param4, param6 + param0.field_t, param0.field_v + (param4 + param0.field_o), false);
          var9_int = this.a(param0, 227);
          if (param7 > -67) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.a((byte) -83, param0);
          if (this.field_i) {
            this.field_f.a(this.c(349, param0), this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4), var9_int, var10, param2, param5, this.field_p, this.field_m, this.field_n);
          } else {
            var12 = this.field_m;
            if (var12 == 0) {
              var11 = this.field_f.field_E;
            } else {
              if (var12 == 2) {
                var11 = var10 - this.field_f.field_G;
              } else {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = this.field_f.field_E + (-this.field_f.field_E + (var10 - this.field_f.field_G) >> 1);
              }
            }
            var12Lifetime1 = this.field_p;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_f.a(this.c(349, param0), (var9_int >> 1) + this.a(40, param0, param6, param1), this.a(param0, -4, param3, param4) + var11, param2, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_f.c(this.c(349, param0), var9_int + this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_f.b(this.c(349, param0), this.a(40, param0, param6, param1), var11 + this.a(param0, -4, param3, param4), param2, param5);
            }
          }
          pd.a(-22949);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("ik.U(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(w param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 9) {
            stackIn_2_0 = -31;
            return stackIn_2_0;
          }
          this.a(param0, (byte) 55);
          stackIn_4_0 = param0.field_w.a(param4 - this.b(param0, 101, param3), (byte) -100, param5 - this.a(param0, param2 + 20331, param1));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("ik.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(w param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4) {
            this.field_q = -12;
          }
          stackIn_3_0 = this.field_d + (param0.field_o + param3) + (param0.field_l + param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ik.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final ve a(w param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ve stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 2 / ((param1 + 22) / 59);
          if (param0.field_w == null) {
            param0.field_w = (ve) ((Object) new kk());
          }
          if (!this.field_i) {
            this.b(param0, -54);
          } else {
            ((kk) (param0.field_w)).a(this.field_f, this.field_p, this.field_n, this.field_m, this.a(param0, 227), this.a((byte) -49, param0), -125, this.c(349, param0));
          }
          stackIn_6_0 = param0.field_w;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ik.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ik param0, boolean param1) {
        try {
          param0.field_q = this.field_q;
          param0.field_a = this.field_a;
          param0.field_i = this.field_i;
          if (param1) {
            w var4 = (w) null;
            this.a(39, 3, (w) null, (byte) -96, -55, -81);
          }
          param0.field_d = this.field_d;
          param0.field_e = this.field_e;
          param0.field_f = this.field_f;
          param0.field_c = this.field_c;
          param0.field_l = this.field_l;
          param0.field_p = this.field_p;
          param0.field_m = this.field_m;
          param0.field_r = this.field_r;
          param0.field_n = this.field_n;
          param0.field_o = this.field_o;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ik.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_g = null;
        if (param0 == -108) {
          field_k = null;
          field_s = null;
          return;
        }
        ik.a((byte) 33);
        field_k = null;
        field_s = null;
    }

    private final int a(int param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 40) {
            field_g = (int[]) null;
          }
          stackIn_3_0 = param3 + param1.field_p + (param2 + param1.field_t + this.field_a);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ik.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(w param0, int param1) {
        RuntimeException var3 = null;
        w var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 227) {
            var4 = (w) null;
            this.a((w) null, (byte) 102);
          }
          stackIn_3_0 = -this.field_r + (-this.field_a + param0.field_j);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 == 2) {
          return this.field_f.field_G + this.field_f.field_E;
        }
        field_s = (int[]) null;
        return this.field_f.field_G + this.field_f.field_E;
    }

    public final int b(w param0, int param1, int param2) {
        RuntimeException var4 = null;
        w var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 93) {
            var5 = (w) null;
            this.a((w) null, 21, -11, 2, -8, -25, -110, 81);
          }
          stackIn_3_0 = this.a(40, param0, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ik.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(w param0, int param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0.field_w == null) {
            param0.field_w = (ve) ((Object) new kk());
          }
          var3_int = this.a(param0, 227);
          var6 = -35 % ((13 - param1) / 61);
          var4 = this.a((byte) -114, param0);
          var7 = this.field_m;
          if (var7 == 0) {
            var5 = this.field_f.field_E;
          } else {
            if (var7 != 2) {
              if (3 != var7 &&
                var7 != 1) {
              }
              var5 = (-this.field_f.field_E + (var4 - this.field_f.field_G) >> 1) + this.field_f.field_E;
            } else {
              var5 = -this.field_f.field_G + var4;
            }
          }
          var7Lifetime1 = this.field_p;
          if (var7Lifetime1 != 0 &&
            var7Lifetime1 != 3) {
            if (var7Lifetime1 == 1) {
              if (!(param0.field_w instanceof kk)) {
                return;
              }
              ((kk) (param0.field_w)).a(var5, this.field_f, this.c(349, param0), var3_int >> 1, (byte) -11);
              return;
            }
            if (var7Lifetime1 != 2) {
              return;
            }
            if (!(param0.field_w instanceof kk)) {
              return;
            }
            ((kk) (param0.field_w)).a(this.field_f, this.c(349, param0), (byte) -125, var3_int, var5);
            return;
          }
          if (param0.field_w instanceof kk) {
            ((kk) (param0.field_w)).a(118, 0, this.c(349, param0), this.field_f, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("ik.G(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    ik(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected ik() {
    }

    ik(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_a = param1;
          this.field_q = param6;
          this.field_l = param11;
          this.field_m = param8;
          this.field_e = param5;
          this.field_n = param9;
          this.field_p = param7;
          this.field_f = param0;
          this.field_d = param3;
          this.field_i = param12 ? true : false;
          this.field_c = param10;
          this.field_o = param4;
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    String c(int param0, w param1) {
        RuntimeException var3 = null;
        w var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 349) {
            var4 = (w) null;
            this.b((w) null, 108, 82);
          }
          stackIn_3_0 = param1.field_u;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int a(byte param0, w param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -38) {
            stackIn_4_0 = param1.field_v - this.field_d - this.field_o;
            return stackIn_4_0;
          }
          stackIn_2_0 = -66;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ik.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_j = 250;
        field_s = new int[]{35, 83, 131, 179, 227, 203, 179, 155, 59, 83, 107, 107, 155, 131, 131, 131};
        field_b = new int[]{349, 349, 349, 349, 349, 313, 277, 241, 313, 277, 241, 313, 313, 277, 301, 205};
    }
}
