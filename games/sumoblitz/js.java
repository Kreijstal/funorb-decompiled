/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends sp implements ca, ai, oe {
    private qq field_L;
    private wp field_M;
    private qq field_E;
    private wr field_H;
    private wp field_D;
    private qq field_K;
    pe field_B;
    private qq field_A;
    private ar field_C;
    static String field_J;
    private qq field_N;
    private qq field_I;
    static ts field_G;

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -91, param2, param3);
          var5_int = 70 % ((param1 + 25) / 45);
          this.field_M.field_x = this.j(97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("js.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(byte param0) {
        try {
          int var2_int = 110 / ((55 - param0) / 40);
          ((ou) (this.field_A.a(109))).e(-1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "js.H(" + param0 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            this.field_B = (pe) null;
          }
          if (super.a(param0, param1, (byte) 66, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_10_0 = this.a((byte) -58, param0);
            return stackIn_10_0;
          }
          if (param3 == 99) {
            stackIn_15_0 = this.a(param0, false);
            return stackIn_15_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("js.KA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, String param1, int param2, pk param3, int param4) {
        rt var6 = null;
        RuntimeException var6_ref = null;
        vr var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new rt(20, param2, param0 + 120, 25, param3, false, 120, 3, kw.field_b, 16777215, param1);
          this.a(var6, 82);
          var7 = new vr(((op) ((Object) param3)).a(34));
          this.a(var7, 63);
          if (param4 < 63) {
            stackIn_2_0 = -35;
            return stackIn_2_0;
          }
          var7.a(-57, 3 + var6.field_r + var6.field_q, (var6.field_p - 15 >> 1) + var6.field_v, 15, 15);
          stackIn_4_0 = var6.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("js.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 != 710) {
            return;
          }
          if (param2 != this.field_D) {
            if (this.field_M != param2) {
              return;
            }
            discarded$0 = this.i(513);
            if (!Sumoblitz.field_L) {
              return;
            }
          }
          nb.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("js.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_52_0;
        pl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        cn var5 = null;
        String var5_ref = null;
        String var6 = null;
        cn var6_ref = null;
        String var7 = null;
        cn var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = ig.field_a;
          var2 = var1.e(-31302);
          if (var2 == 0) {
            if (io.field_b == null) {
              io.field_b = new ci(128);
              jb.field_e = 0;
            }
            stackIn_11_0 = (var1.e(-31302) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.d(-1);
            if (var3_int != 0) {
              var1.d(-1);
            }
            var5 = is.a((byte) 123, var4_ref_String);
            var6 = var1.d(-1);
            var7 = uk.a(-1, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (null == var5) {
              var5 = is.a((byte) 122, var6);
              if (var5 != null) {
                io.field_b.a((long)var7.hashCode(), -8156, var5);
              }
            }
            if (null == var5) {
              var5 = new cn();
              io.field_b.a((long)var7.hashCode(), -8156, var5);
              fieldTemp$0 = jb.field_e;
              jb.field_e = jb.field_e + 1;
              var5.field_kb = fieldTemp$0;
              mu.field_t.a((ms) (var5), (byte) 39);
            }
            var5.field_jb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (wh.field_s == 1) {
                wh.field_s = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (wh.field_s == 2) {
                wh.field_s = 1;
              }
              return;
            }
            if (var2 != 4) {
              ms.a("F1: " + di.b((byte) 104), (Throwable) null, 0);
              kk.a((byte) -112);
              if (param0 <= 71) {
                field_G = (ts) null;
              }
              return;
            }
            wh.field_s = 1;
            var3 = var1.d(-1);
            jm.field_d = ((String) (var3)).intern();
            var4 = var1.e(-31302);
            en.a((byte) 38, var4);
            return;
          }
          if (null == wr.field_G) {
            wr.field_G = new ci(128);
            hi.field_h = 0;
          }
          var3Lifetime1 = var1.d(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.d(-1);
          var5_ref = var1.d(-1);
          var6_ref = hu.a(var4_ref_StringLifetime1, (byte) 15);
          if (null == var6_ref) {
            var6_ref = hu.a(var5_ref, (byte) 71);
            if (var6_ref != null) {
              wr.field_G.a((long)uk.a(-1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), -8156, var6_ref);
            }
          }
          if (var6_ref == null) {
            var6_ref = new cn();
            wr.field_G.a((long)uk.a(-1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), -8156, var6_ref);
            fieldTemp$1 = hi.field_h;
            hi.field_h = hi.field_h + 1;
            var6_ref.field_kb = fieldTemp$1;
            pc.field_d.a((ms) (var6_ref), (byte) 39);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_jb = var4_ref_StringLifetime1;
          var6_ref.field_gb = (String) (var3Lifetime1);
          var6_ref.b(false);
          var7_ref = (cn) (pc.field_d.b(-104));
          L16: while (true) {
            if (null != var7_ref) {
              stackOut_52_0 = hb.a(var6_ref, 0, var7_ref);
              stackIn_63_0 = stackOut_52_0 ? 1 : 0;
              stackIn_53_0 = stackOut_52_0;
              if (var8 != 0) {
                break L16;
              }
              if (stackIn_53_0) {
                var7_ref = (cn) (pc.field_d.d((byte) 18));
                continue;
              }
            }
            if (null == var7_ref) {
              pc.field_d.a((ms) (var6_ref), (byte) 39);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_63_0 = -2;
            break;
          }
          ha.a(stackIn_63_0, var7_ref, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "js.CA(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        try {
          field_J = null;
          field_G = null;
          if (param0 != 0) {
            js.g(1);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "js.O(" + param0 + ')');
        }
    }

    private final boolean i(int param0) {
        boolean discarded$1 = false;
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_12_0 = false;
        Throwable decompiledCaughtException = null;
        try {
          if (!this.j(-34)) {
            return false;
          }
          var2_int = -1;
          try {
            var2_int = Integer.parseInt(this.field_K.field_m);
            if (param0 != 513) {
              discarded$1 = this.i(8);
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          }
          stackIn_12_0 = fd.a(this, this.field_A.field_m, this.field_H.field_C, this.field_I.field_m, this.field_N.field_m, var2_int, 0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "js.P(" + param0 + ')');
        }
    }

    private final String k(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 128) {
            stackIn_4_0 = "</col></u>";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "js.J(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        try {
          dc.l(param0 ^ 224);
          if (param0 != 0) {
            js.f((byte) -20);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "js.E(" + param0 + ')');
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                hn.a((byte) 93, "conduct.ws");
                if (var6 != 0) {
                  hn.a((byte) 99, "privacy.ws");
                  hn.a((byte) 122, "terms.ws");
                }
              }
            } else {
              hn.a((byte) 99, "privacy.ws");
              if (var6 != 0) {
                hn.a((byte) 122, "terms.ws");
              }
            }
          } else {
            hn.a((byte) 122, "terms.ws");
          }
          if (param3 != -20036) {
            field_J = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("js.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, byte param2, int param3, String param4, pk param5, String param6) {
        rt var8 = null;
        RuntimeException var8_ref = null;
        bn var9 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new rt(20, param0, param1 + 120, 25, param5, false, 120, 3, kw.field_b, 16777215, param6);
          this.a(var8, 122);
          var9 = new bn(((op) ((Object) param5)).a(-128), param4, 126, param0 + var8.field_p, param1 + 50, param3);
          var9.field_o = (qm) (this);
          this.a(var9, 109);
          if (param2 < 31) {
            field_J = (String) null;
          }
          stackIn_4_0 = var9.field_p + var8.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_8_0 = var8_ref;
          stackIn_8_1 = new StringBuilder().append("js.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(int param0, op param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        gf var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(param0 ^ -23003);
          if (var3 == null) {
            return true;
          }
          var4 = var3.c(93);
          if (qr.field_e == var4) {
            return false;
          }
          if (mb.field_f == var4) {
            return false;
          }
          if (param0 != 22955) {
            return true;
          }
          if (ad.field_n == var4) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("js.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        qq var3 = null;
        String var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_A;
          var4 = param0;
          ((dh) ((Object) var3)).a(false, var4, (byte) 124);
          if (param1 != 0) {
            field_G = (ts) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("js.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, int param3, pk param4) {
        rt var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new rt(20, param2, 120 + param1, 25, param4, false, 120, 3, kw.field_b, 16777215, param0);
          this.a(var6, 79);
          if (param3 >= 32) {
            stackIn_4_0 = var6.field_p;
            return stackIn_4_0;
          }
          stackIn_2_0 = -85;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("js.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public js() {
        super(0, 0, 496, 0, (mh) null);
        int var1_int = 0;
        nl dupTemp$0 = null;
        c dupTemp$1 = null;
        String var2 = null;
        int var3 = 0;
        rt var4 = null;
        gm var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          this.field_A = new qq("", (qm) null, 12);
          this.field_I = new qq("", (qm) null, 100);
          this.field_E = new qq("", (qm) null, 100);
          this.field_N = new qq("", (qm) null, 20);
          this.field_L = new qq("", (qm) null, 20);
          this.field_K = new qq("", (qm) null, 3);
          var1_int = 1;
          this.field_H = new wr("", (qm) null, var1_int != 0);
          this.field_M = new wp(ff.field_o, (qm) null);
          this.field_D = new wp(jc.field_e, (qm) null);
          this.field_A.field_t = rq.field_a;
          this.field_I.field_t = pi.field_f;
          this.field_E.field_t = kn.field_d;
          this.field_N.field_t = pl.field_q;
          this.field_L.field_t = tj.field_k;
          this.field_K.field_t = dc.field_bb;
          this.field_H.field_t = gr.field_g;
          this.field_A.a((byte) -54, new ou(this.field_A));
          this.field_I.a((byte) 118, new ew(this.field_I));
          this.field_E.a((byte) -127, new wk(this.field_E, this.field_I));
          this.field_N.a((byte) 127, new tc(this.field_N, this.field_A, this.field_I));
          this.field_L.a((byte) -17, new nq(this.field_L, this.field_N));
          this.field_K.a((byte) 122, new jc(this.field_K));
          this.field_M.field_x = false;
          this.field_M.field_w = (mh) ((Object) new ue());
          this.field_D.field_w = (mh) ((Object) new bv());
          this.field_A.field_w = (mh) ((Object) new nl(10000536));
          dupTemp$0 = new nl(10000536);
          this.field_E.field_w = (mh) ((Object) dupTemp$0);
          this.field_I.field_w = (mh) ((Object) dupTemp$0);
          this.field_K.field_w = (mh) ((Object) new nl(10000536));
          this.field_H.field_w = (mh) ((Object) new oj());
          dupTemp$1 = new c(10000536);
          this.field_L.field_w = (mh) ((Object) dupTemp$1);
          this.field_N.field_w = (mh) ((Object) dupTemp$1);
          var2 = ic.a(cn.field_P, new String[]{this.e((byte) 66), this.k(128)}, (byte) -128);
          var3 = 20;
          var3 = var3 + this.a(ks.field_u, 170, var3, 78, this.field_I);
          var3 = var3 + (5 + this.a(var3, 170, (byte) 125, 20, "", this.field_E, pq.field_N));
          var3 = var3 + this.a(pi.field_g, 170, var3, 55, this.field_N);
          var3 = var3 + (5 + this.a(ht.field_b, 170, 15632, var3, qw.field_c, this.field_L));
          var3 = var3 + (this.a(un.field_c, 170, 15632, var3, oq.field_r, this.field_A) + 5);
          var3 = var3 + this.a(170, fm.field_a, var3, this.field_K, 64);
          var4 = new rt(46, var3, -90 + this.field_q, 25, this.field_H, true, -120 + this.field_q, 5, jm.field_a, 11579568, lv.field_e);
          this.a(var4, 100);
          var3 = var3 + var4.field_p;
          var5 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, kw.field_b.field_s, -1, 2147483647, true);
          this.field_C = new ar(var2, var5);
          this.field_C.field_t = "";
          this.field_C.a(-90, sb.field_e, 0);
          this.field_C.a(-61, sb.field_e, 1);
          this.field_C.field_o = (qm) (this);
          this.field_C.a(var3, false, 46, this.field_q - 90);
          var3 = var3 + (15 + this.field_C.field_p);
          this.a(this.field_C, 111);
          var6 = 4;
          var7 = 200;
          this.field_M.a(118, -var7 + 496 >> 1, var3, 40, var7);
          this.field_D.a(-122, 3 + var6, 15 + var3, 40, 60);
          this.field_D.field_o = (qm) (this);
          this.field_M.field_o = (qm) (this);
          this.a(this.field_M, 109);
          this.a(this.field_D, 124);
          this.field_B = new pe((oe) (this));
          this.field_B.a(93, 60 + this.field_A.field_q + this.field_A.field_r, this.field_A.field_v + 20, 150, -this.field_A.field_q - this.field_A.field_r + (this.field_q - 60));
          this.a(this.field_B, 108);
          this.a(-39, 0, 0, var6 + (var3 + 55), 496);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "js.<init>()");
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, pk param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 15632) {
            this.field_L = (qq) null;
          }
          stackIn_4_0 = this.a(param3, param1, (byte) 57, 35, param4, param5, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("js.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static f a(int param0, int param1, int param2, boolean param3, fr param4, byte param5, int param6, int[] param7) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_11_0 = null;
        f stackIn_14_0 = null;
        f stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 >= -6) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          if (!param4.field_Cc && (!rm.a(param6, -116) ||
            !rm.a(param0, -126))) {
            if (param4.field_C) {
              stackIn_16_0 = new f(param4, 34037, param6, param0, param3, param7, param2, param1);
              return stackIn_16_0;
            }
            stackIn_14_0 = new f(param4, param6, param0, hn.a(false, param6), hn.a(false, param0), param7);
            return stackIn_14_0;
          }
          stackIn_11_0 = new f(param4, 3553, param6, param0, param3, param7, param2, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("js.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final String e(byte param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 2) {
            this.field_B = (pe) null;
          }
          stackIn_4_0 = "<u=2164A2><col=2164A2>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "js.V(" + param0 + ')');
        }
    }

    private final boolean j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(22955, this.field_A) &&
            this.a(22955, this.field_I) &&
            this.a(22955, this.field_E) &&
            this.a(22955, this.field_N) &&
            this.a(22955, this.field_L) &&
            this.a(22955, this.field_K)) {
            var2_int = -125 % ((18 - param0) / 49);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "js.AA(" + param0 + ')');
        }
    }

    static {
        field_G = new ts(13, 0, 1, 0);
    }
}
