/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends g implements pi, qh {
    private hf field_J;
    private boolean field_G;
    private hl field_I;
    private boolean field_D;
    static String field_L;
    private String field_F;
    static long[] field_P;
    static String[] field_N;
    private hf field_K;
    private hl field_M;
    private boolean field_E;
    static int field_O;
    private hl field_H;

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -99) {
            return false;
          }
          if (super.a(param0, (byte) -105, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_8_0 = this.b(106, param3);
            return stackIn_8_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(param3, (byte) -28);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ak.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void l(int param0) {
        this.field_J.n(param0 + 31843);
        this.field_K.n(-124);
        if (param0 != -31940) {
          this.e((byte) 23);
        }
    }

    public final void a(hf param0, int param1) {
        try {
          if (param1 != 12891) {
            hf var4 = (hf) null;
            this.a(-102, (hf) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ak.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ak(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ci) null);
        ck dupTemp$0 = null;
        ck dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        hl stackIn_18_1 = null;
        hl stackIn_18_2 = null;
        hl stackIn_19_1 = null;
        hl stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ki var6 = null;
        RuntimeException var6_ref = null;
        ee var7 = null;
        String var8 = null;
        qa var9 = null;
        ck var12 = null;
        ck var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_G = stackIn_4_1;
          this.field_F = param1;
          stackIn_7_1 = (param4);
          this.field_E = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_D = stackIn_10_1;
          if (this.field_G && (this.field_D ||
            this.field_E)) {
            throw new IllegalStateException();
          }
          this.field_J = (hf) ((Object) new v(param0, (pl) (this), 100));
          this.field_K = (hf) ((Object) new v("", (pl) (this), 20));
          if (!this.field_G) {
            this.field_I = new hl(q.field_f, (pl) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_E) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = uc.field_r;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = oa.field_b;
            }
            this.field_H = new hl(stackIn_19_3, (pl) null);
            if (this.field_D) {
              this.field_M = new hl(mg.field_K, (pl) (this));
            }
          } else {
            this.field_I = new hl(tc.field_c, (pl) null);
            this.field_H = new hl(pg.field_f, (pl) null);
            this.field_J.field_B = false;
          }
          this.field_J.field_v = (ci) ((Object) new r(10000536));
          this.field_K.field_v = (ci) ((Object) new rl(10000536));
          var6 = new ki();
          this.field_I.field_v = (ci) ((Object) var6);
          if (null != this.field_H) {
            this.field_H.field_v = (ci) ((Object) var6);
          }
          this.field_J.field_n = sl.field_c;
          if (this.field_M != null) {
            this.field_M.field_v = (ci) ((Object) var6);
          }
          if (null != this.field_M) {
            this.field_M.field_n = bl.field_b;
          }
          if (!this.field_G) {
            if (this.field_E) {
              this.field_H.field_n = w.field_m;
              this.field_H.field_v = (ci) ((Object) new nb());
            } else {
              this.field_H.field_v = (ci) ((Object) new nb());
            }
          } else {
            this.field_H.field_n = vg.field_c;
          }
          this.field_i = 15;
          var7 = j.field_C;
          if (this.field_F != null) {
            this.field_i = this.field_i + (5 + var7.b(this.field_F, this.field_h - 40, var7.field_s));
          }
          var8 = ck.field_F;
          var9 = ma.a(mk.g(-122), -3825);
          if (ke.field_c == var9) {
            var8 = ja.field_d;
          } else {
            if (oj.field_e == var9) {
              var8 = ab.field_q;
            }
          }
          dupTemp$0 = new ck(10, this.field_i, this.field_h - 20, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, (byte) 118);
          this.field_i = this.field_i + (5 + ((lk) ((Object) var12)).field_q);
          dupTemp$1 = new ck(10, this.field_i, this.field_h - 20, 25, this.field_K, false, 80, 3, var7, 16777215, fl.field_b);
          var13 = dupTemp$1;
          this.b(dupTemp$1, (byte) 118);
          this.field_i = this.field_i + (((lk) ((Object) var13)).field_q + 5);
          this.field_I.field_k = (pl) (this);
          if (null != this.field_M) {
            this.field_M.field_k = (pl) (this);
          }
          if (this.field_H != null) {
            this.field_H.field_k = (pl) (this);
          }
          if (null == this.field_M) {
            this.field_I.a(30, this.field_i, -10 + this.field_h - 6, 8, true);
            this.field_i = this.field_i + 35;
          } else {
            this.field_I.a(30, this.field_i, -95 + this.field_h, 85, true);
            this.field_i = this.field_i + 60;
          }
          if (this.field_M != null) {
            this.field_M.a(30, this.field_i, -16 + this.field_h, 8, true);
            this.field_i = this.field_i + 35;
          }
          if (this.field_H != null) {
            if (!this.field_G &&
              !this.field_E) {
              this.field_H.a(20, this.field_i, 40, 8, true);
              this.field_i = this.field_i + 25;
            } else {
              this.field_H.a(30, this.field_i, -10 + (this.field_h - 6), 8, true);
              this.field_i = this.field_i + 35;
            }
          }
          this.a(this.field_i + 3, 0, this.field_h, 0, true);
          this.b(this.field_I, (byte) 118);
          if (null != this.field_M) {
            this.b(this.field_M, (byte) 118);
          }
          if (null != this.field_H) {
            this.b(this.field_H, (byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ak.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = Main.field_T;
        try {
          if (param3 != this.field_I) {
            if (param3 == this.field_M) {
              jk.a(false);
            } else {
              if (param3 == this.field_H) {
                if (this.field_G) {
                  j.i(92);
                } else {
                  if (this.field_E) {
                    a.d((byte) 74);
                  } else {
                    td.a((byte) -11);
                  }
                }
              }
            }
          } else {
            this.e((byte) 121);
          }
          var6_int = 100 / ((param1 + 62) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final String d(byte param0) {
        int var2 = 2 % ((param0 + 1) / 36);
        if (null == this.field_J.field_r) {
          return "";
        }
        return this.field_J.field_r;
    }

    public final void a(int param0, hf param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_J) {
            this.field_K.a(param0 + 82, (lk) (this));
          }
          if (this.field_K == param1) {
            this.e((byte) 121);
          }
          if (param0 != -1) {
            field_O = -19;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ak.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 == -1) {
          if (null != this.field_F) {
            j.field_C.a(this.field_F, 20 + (this.field_o + param0), this.field_i + param1 + 15, this.field_h - 40, this.field_q, 16777215, -1, 1, 0, j.field_C.field_s);
          }
          if (this.field_M != null) {
            vj.d(10 + param0, param1 + 134, this.field_h - 20, 4210752);
          }
          super.a(param0, param1, param2 ^ 0, param3);
          return;
        }
    }

    public static void a(boolean param0) {
        field_P = null;
        field_N = null;
        if (param0) {
          ak.a(false);
        }
        field_L = null;
    }

    final void a(String param0, int param1) {
        hf var3 = null;
        String var4 = null;
        try {
          var3 = this.field_J;
          var4 = param0;
          if (param1 != -95) {
            lk var5 = (lk) null;
            this.a(',', (byte) -38, -43, (lk) null);
          }
          var3.a(var4, -18845, false);
          this.field_K.n(101);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ak.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 != 121) {
          this.field_E = false;
        }
        if (cc.a(77) ||
          !(this.field_J.field_r.length() <= 0) &&
          !(this.field_K.field_r.length() <= 0)) {
          tl.a(this.field_J.field_r, this.field_K.field_r, param0 ^ 9);
        }
    }

    static {
        field_L = "Waiting for fonts";
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_P = new long[32];
    }
}
