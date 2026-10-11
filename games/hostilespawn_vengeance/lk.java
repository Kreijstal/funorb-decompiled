/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends vd implements cd, qk {
    private boolean field_J;
    static int[] field_M;
    private ph field_P;
    static nd field_N;
    private boolean field_G;
    private ph field_R;
    private ig field_O;
    private String field_I;
    static String[] field_E;
    private boolean field_Q;
    static int field_H;
    private ph field_K;
    private ig field_L;

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != this.field_I) {
          jd.field_s.a(this.field_I, 20 + param1 + this.field_v, 15 + (this.field_m + param0), -40 + this.field_s, this.field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        }
        if (param2 <= 42) {
          lk.j(21);
        }
        if (this.field_P != null) {
          si.a(param1 + 10, 134 + param0, -20 + this.field_s, 4210752);
        }
        super.a(param0, param1, (byte) 123, param3);
    }

    final void a(boolean param0) {
        if (param0) {
          this.field_J = false;
        }
        this.field_O.o(-128);
        this.field_L.o(-124);
    }

    private final void e(byte param0) {
        int var2;
        if (gi.b((byte) -86) ||
          !(this.field_O.field_n.length() <= 0) &&
          !(this.field_L.field_n.length() <= 0)) {
          r.a(this.field_O.field_n, this.field_L.field_n, -125);
        }
        var2 = -47 / ((29 - param0) / 34);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = 14 / ((-63 - param4) / 52);
          if (this.field_K == param3) {
            this.e((byte) 124);
          } else {
            if (param3 != this.field_P) {
              if (param3 == this.field_R) {
                if (this.field_G) {
                  ki.a(-1);
                } else {
                  if (!this.field_J) {
                    vc.a((byte) -1);
                  } else {
                    mn.a((byte) -126);
                  }
                }
              }
            } else {
              gb.d(126);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("lk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(ig param0, byte param1) {
        try {
          int var3_int = 116 / ((-76 - param1) / 41);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "lk.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ig param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -31 % ((0 - param1) / 41);
          if (param0 == this.field_O) {
            this.field_L.a((byte) -47, (ag) (this));
          }
          if (param0 == this.field_L) {
            this.e((byte) -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lk.T(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void j(int param0) {
        if (param0 != 27219) {
          lk.l(-62);
        }
        field_M = null;
        field_N = null;
        field_E = null;
    }

    final static void l(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = mn.field_a;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 < 71) {
            lk.j(68);
          }
          while (var2 < var3) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "lk.O(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, vm param3, int param4, int param5, int param6, int param7, int param8, int param9, bd[] param10, bd[] param11, bd[] param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, vm param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          se.a(param20, param2, param3, new vh(param11), param6, param8, new vh(param12), param13, param1, param9, param18, param0, param19, param14, param5, param15 ^ 4686, new vh(param10), param17, param7, param16, param4);
          if (param15 != 7662) {
            field_N = (nd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("lk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param11 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param12 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        ig var3 = this.field_O;
        String var4 = param0;
        if (param1 != 10000536) {
          return;
        }
        try {
          var3.a((byte) 118, false, var4);
          this.field_L.o(param1 ^ -10000616);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "lk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_7_0 = this.a(param1, (byte) -21);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.b((byte) -126, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String k(int param0) {
        if (null == this.field_O.field_n) {
          return "";
        }
        if (param0 != 80) {
          return (String) null;
        }
        return this.field_O.field_n;
    }

    lk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nn) null);
        nh dupTemp$0 = null;
        nh dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ph stackIn_18_1 = null;
        ph stackIn_18_2 = null;
        ph stackIn_19_1 = null;
        ph stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ke var6 = null;
        RuntimeException var6_ref = null;
        vm var7 = null;
        String var8 = null;
        fa var9 = null;
        nh var12 = null;
        nh var13 = null;
        try {
          this.field_I = param1;
          stackIn_4_1 = (param3);
          this.field_Q = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_G = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_J = stackIn_10_1;
          if (this.field_G && (this.field_Q ||
            this.field_J)) {
            throw new IllegalStateException();
          }
          this.field_O = (ig) ((Object) new sf(param0, (mh) (this), 100));
          this.field_L = (ig) ((Object) new sf("", (mh) (this), 20));
          if (!this.field_G) {
            this.field_K = new ph(cb.field_b, (mh) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_J) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ej.field_n;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = hg.field_d;
            }
            this.field_R = new ph(stackIn_19_3, (mh) null);
            if (this.field_Q) {
              this.field_P = new ph(kc.field_f, (mh) (this));
            }
          } else {
            this.field_K = new ph(hf.field_f, (mh) null);
            this.field_R = new ph(sc.field_k, (mh) null);
            this.field_O.field_D = false;
          }
          this.field_O.field_h = (nn) ((Object) new sd(10000536));
          this.field_L.field_h = (nn) ((Object) new km(10000536));
          var6 = new ke();
          this.field_K.field_h = (nn) ((Object) var6);
          if (null != this.field_R) {
            this.field_R.field_h = (nn) ((Object) var6);
          }
          this.field_O.field_i = qj.field_n;
          if (null != this.field_P) {
            this.field_P.field_h = (nn) ((Object) var6);
          }
          if (null != this.field_P) {
            this.field_P.field_i = e.field_x;
          }
          if (!this.field_G) {
            if (this.field_J) {
              this.field_R.field_i = hk.field_l;
              this.field_R.field_h = (nn) ((Object) new ti());
            } else {
              this.field_R.field_h = (nn) ((Object) new ti());
            }
          } else {
            this.field_R.field_i = qg.field_s;
          }
          this.field_m = 15;
          var7 = jd.field_s;
          if (this.field_I != null) {
            this.field_m = this.field_m + (var7.b(this.field_I, -40 + this.field_s, var7.field_y) + 5);
          }
          var8 = jg.field_b;
          var9 = qj.a(bn.c(-1), (byte) -116);
          if (ub.field_b != var9) {
            if (var9 == wh.field_c) {
              var8 = dg.field_nb;
            }
          } else {
            var8 = dk.field_k;
          }
          dupTemp$0 = new nh(10, this.field_m, this.field_s - 20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(51448, dupTemp$0);
          this.field_m = this.field_m + (((ag) ((Object) var12)).field_x + 5);
          dupTemp$1 = new nh(10, this.field_m, -20 + this.field_s, 25, this.field_L, false, 80, 3, var7, 16777215, qh.field_x);
          var13 = dupTemp$1;
          this.a(51448, dupTemp$1);
          this.field_m = this.field_m + (((ag) ((Object) var13)).field_x + 5);
          this.field_K.field_p = (mh) (this);
          if (null != this.field_P) {
            this.field_P.field_p = (mh) (this);
          }
          if (null != this.field_R) {
            this.field_R.field_p = (mh) (this);
          }
          if (null == this.field_P) {
            this.field_K.a(-10 + this.field_s - 6, this.field_m, 0, 8, 30);
            this.field_m = this.field_m + 35;
          } else {
            this.field_K.a(this.field_s - 95, this.field_m, 0, 85, 30);
            this.field_m = this.field_m + 60;
          }
          if (this.field_P != null) {
            this.field_P.a(-6 + this.field_s - 10, this.field_m, 0, 8, 30);
            this.field_m = this.field_m + 35;
          }
          if (null != this.field_R) {
            if (!this.field_G &&
              !this.field_J) {
              this.field_R.a(40, this.field_m, 0, 8, 20);
              this.field_m = this.field_m + 25;
            } else {
              this.field_R.a(-6 + this.field_s - 10, this.field_m, 0, 8, 30);
              this.field_m = this.field_m + 35;
            }
          }
          this.a(this.field_s, 0, 0, 0, this.field_m + 3);
          this.a(51448, this.field_K);
          if (this.field_P != null) {
            this.a(51448, this.field_P);
          }
          if (null != this.field_R) {
            this.a(51448, this.field_R);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("lk.<init>(");
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
          throw wg.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_M = new int[8192];
        field_E = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_H = 0;
        field_N = new nd(6, 0, 4, 2);
    }
}
