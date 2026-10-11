/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends k implements mj {
    static hj field_fb;
    static String field_db;
    private fb field_gb;
    static int field_bb;
    static String field_cb;
    static int[] field_eb;

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_gb == param0) {
            this.c(true);
          }
          if (param4 == -24221) {
            return;
          }
          ge.a(true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ge.DA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Chess.field_G;
        try {
          if (param0) {
            field_db = (String) null;
          }
          if (param1 ||
            null == pd.field_Rb) {
            jh.field_a = false;
          }
          if (param1) {
            if (an.field_e > 0) {
              an.field_e = an.field_e - 1;
              return;
            }
            if (aj.field_c > 0) {
              aj.field_c = aj.field_c - 1;
              return;
            }
            if (ed.field_c <= 0) {
              return;
            }
            ed.field_c = ed.field_c - 1;
            return;
          }
          if (pd.field_Rb != null) {
            if (an.field_e > 0) {
              an.field_e = an.field_e - 1;
              return;
            }
            if (aj.field_c > 0) {
              aj.field_c = aj.field_c - 1;
              return;
            }
            if (ug.field_b > ed.field_c) {
              if (0 == ed.field_c) {
                aj.a(false, true);
              }
              ed.field_c = ed.field_c + 1;
              return;
            }
          } else {
            if (null != ib.field_d) {
              if (an.field_e > 0) {
                an.field_e = an.field_e - 1;
                return;
              }
              if (0 < ed.field_c) {
                ed.field_c = ed.field_c - 1;
                return;
              }
              if (aj.field_c < ug.field_b) {
                if (aj.field_c == 0) {
                  aj.a(true, true);
                }
                aj.field_c = aj.field_c + 1;
                return;
              }
            } else {
              jh.field_a = false;
              if (aj.field_c > 0) {
                aj.field_c = aj.field_c - 1;
                return;
              }
              if (0 < ed.field_c) {
                ed.field_c = ed.field_c - 1;
                return;
              }
              if (ug.field_b > an.field_e) {
                if (an.field_e == 0) {
                  tj.b((byte) -126);
                }
                an.field_e = an.field_e + 1;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "ge.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        field_db = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_eb = null;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ge.H(" + param0 + ')');
        }
    }

    final static pg a(boolean param0, int param1, int param2, int param3) {
        Object var4 = null;
        pg var4_ref = null;
        int var5 = 0;
        pg stackIn_7_0 = null;
        pg stackIn_11_0 = null;
        pg stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref2 = null;
        pg var6 = null;
        pg var4_refLifetime1;
        var4 = null;
        var5 = Chess.field_G;
        try {
          var4_ref = (pg) (nd.field_h.g(-18110));
          while (var4_ref != null) {
            if (var4_ref.field_q == param2) {
              stackIn_7_0 = var4_ref;
              return stackIn_7_0;
            }
            var4_ref = (pg) (nd.field_h.a((byte) -111));
          }
          var6 = new pg();
          var4_refLifetime1 = var6;
          var6.field_u = param3;
          if (!param0) {
            stackIn_11_0 = (pg) null;
            return stackIn_11_0;
          }
          var4_refLifetime1.field_q = param2;
          nd.field_h.a((o) (var4_refLifetime1), (byte) 102);
          tm.a(false, var4_refLifetime1, param1);
          stackIn_13_0 = var4_refLifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4_ref2), "ge.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final fb a(String param0, rg param1, int param2) {
        fb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fb stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fb(param0, param1);
          var4.field_n = (jm) ((Object) new sf());
          var5 = this.field_C - 6;
          this.field_C = this.field_C + 38;
          var4.a(var5, 34, param2, -30 + this.field_y, 15);
          this.b(var4, 95);
          this.c((byte) 112);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("ge.I(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_0 = stackIn_5_0;
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_10_0 = stackIn_9_0;
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = stackIn_5_0;
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        if (!this.field_P) {
          return;
        }
        try {
          this.field_P = false;
          if (!param0) {
            ge.a(false, true);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ge.J(" + param0 + ')');
        }
    }

    ge(fm param0, ij param1) {
        super(param0, 200, 150);
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        String var5 = null;
        mf var6 = null;
        mf var7 = null;
        try {
          var3 = null;
          if (gi.field_a == param1) {
            var3 = Chess.field_D;
          } else {
            if (kh.field_k == param1) {
              this.field_C = this.field_C + 10;
              var5 = le.field_c;
              if (!jj.d(124)) {
                var6 = new mf(var5, (rg) null);
                var6.field_C = 80;
                var6.field_y = this.field_y;
                var6.field_r = 50;
                var6.field_u = 0;
                var6.field_n = (jm) ((Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
                this.b(var6, 95);
                this.field_gb = this.a(sj.field_m, (rg) (this), 30);
                return;
              }
              var3 = le.field_d;
              this.field_C = this.field_C + 20;
            } else {
              if (cm.field_t == param1) {
                this.field_C = this.field_C + 30;
                var3 = vd.field_Gb;
              }
            }
          }
          var7 = new mf((String) (var3), (rg) null);
          var7.field_C = 80;
          var7.field_y = this.field_y;
          var7.field_r = 50;
          var7.field_u = 0;
          var7.field_n = (jm) ((Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var7, 95);
          this.field_gb = this.a(sj.field_m, (rg) (this), 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ge.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) (stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 25) {
            ge.k(15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ge.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_cb = "Your game";
        field_eb = new int[1024];
        field_db = "Account created successfully!";
    }
}
