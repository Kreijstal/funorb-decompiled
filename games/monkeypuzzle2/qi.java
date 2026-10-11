/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends ua implements vc, ql {
    private boolean field_F;
    private String field_B;
    private rj field_H;
    static String field_A;
    private t field_D;
    static String field_J;
    private rj field_L;
    static le[] field_K;
    private t field_C;
    static String field_E;
    private boolean field_G;
    private t field_I;
    private boolean field_z;

    final void a(String param0, byte param1) {
        rj var3 = this.field_L;
        String var4 = param0;
        if (param1 != -34) {
          return;
        }
        try {
          var3.a(false, param1 ^ 5937, var4);
          this.field_H.f((byte) -64);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qi.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
          if (k.field_g == 11) {
            ub.a(250);
          }
          if (param1 >= -82) {
            field_A = (String) null;
          }
          kg.a(be.field_d, lh.field_e, pj.field_h, -9089);
          oh.a(0, (byte) 63, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qi.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, rj param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -19) {
            this.field_L = (rj) null;
          }
          if (param1 == this.field_L) {
            this.field_H.a((we) (this), false);
          }
          if (this.field_H == param1) {
            this.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qi.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, gk param1, int param2, boolean param3, int param4) {
        param1.b(12, -49152);
        param1.c(17, 93);
        if (param3) {
          return;
        }
        try {
          param1.c(param2, 96);
          param1.c(param0, 125);
          param1.b(param4, -49152);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qi.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_K = null;
        if (param0 != 98) {
          gk var2 = (gk) null;
          qi.a(10, (gk) null, 41, false, -90);
        }
        field_E = null;
        field_J = null;
        field_A = null;
    }

    final String a(int param0) {
        if (null == this.field_L.field_s) {
          return "";
        }
        if (param0 < 10) {
          return (String) null;
        }
        return this.field_L.field_s;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -56)) {
            return true;
          }
          var5_int = 120 % ((param3 - 37) / 50);
          if (param2 == 98) {
            stackIn_7_0 = this.a((byte) 120, param0);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param0, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qi.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void k(int param0) {
        int var2 = -33 / ((param0 + 52) / 50);
        this.field_L.f((byte) -20);
        this.field_H.f((byte) -51);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_B) {
          t.field_z.a(this.field_B, 20 + (this.field_r + param3), 15 + this.field_e + param2, this.field_l - 40, this.field_p, 16777215, -1, 1, 0, t.field_z.field_C);
        }
        if (this.field_D != null) {
          ge.a(10 + param3, param2 + 134, this.field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        vf.a((byte) 66);
        ge.c(param3, param4, param0, param2);
        if (!param1) {
          field_A = (String) null;
        }
    }

    public final void b(int param0, rj param1) {
        try {
          if (param0 != 16926) {
            this.a(-58);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qi.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qi(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ml) null);
        mh dupTemp$0 = null;
        mh dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        t stackIn_17_1 = null;
        t stackIn_17_2 = null;
        t stackIn_18_1 = null;
        t stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd var6 = null;
        RuntimeException var6_ref = null;
        ta var7 = null;
        String var8 = null;
        cd var9 = null;
        mh var12 = null;
        mh var13 = null;
        try {
          this.field_B = param1;
          stackIn_4_1 = (param4);
          this.field_F = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_G = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_z = stackIn_10_1;
          if (this.field_z && (this.field_G ||
            this.field_F)) {
            throw new IllegalStateException();
          }
          this.field_L = (rj) ((Object) new qc(param0, (of) (this), 100));
          this.field_H = (rj) ((Object) new qc("", (of) (this), 20));
          if (this.field_z) {
            this.field_I = new t(qd.field_c, (of) null);
            this.field_C = new t(vh.field_L, (of) null);
            this.field_L.field_w = false;
          } else {
            this.field_I = new t(fe.field_c, (of) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_F) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = nf.field_E;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = oi.field_d;
            }
            this.field_C = new t(stackIn_18_3, (of) null);
            if (this.field_G) {
              this.field_D = new t(oi.field_g, (of) (this));
            }
          }
          this.field_L.field_h = (ml) ((Object) new mg(10000536));
          this.field_H.field_h = (ml) ((Object) new ve(10000536));
          var6 = new hd();
          this.field_I.field_h = (ml) ((Object) var6);
          if (null != this.field_C) {
            this.field_C.field_h = (ml) ((Object) var6);
          }
          this.field_L.field_m = r.field_f;
          if (this.field_D != null) {
            this.field_D.field_h = (ml) ((Object) var6);
          }
          if (null != this.field_D) {
            this.field_D.field_m = wd.field_s;
          }
          if (this.field_z) {
            this.field_C.field_m = ba.field_c;
          } else {
            if (!this.field_F) {
              this.field_C.field_h = (ml) ((Object) new lc());
            } else {
              this.field_C.field_m = ca.field_n;
              this.field_C.field_h = (ml) ((Object) new lc());
            }
          }
          this.field_e = 15;
          var7 = t.field_z;
          if (this.field_B != null) {
            this.field_e = this.field_e + (var7.a(this.field_B, this.field_l - 40, var7.field_C) + 5);
          }
          var8 = wf.field_i;
          var9 = ei.a(ii.a(false), (byte) 125);
          if (var9 != oe.field_l) {
            if (dh.field_d == var9) {
              var8 = tj.field_e;
            }
          } else {
            var8 = p.field_c;
          }
          dupTemp$0 = new mh(10, this.field_e, this.field_l - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) -100, dupTemp$0);
          this.field_e = this.field_e + (5 + ((we) ((Object) var12)).field_p);
          dupTemp$1 = new mh(10, this.field_e, -20 + this.field_l, 25, this.field_H, false, 80, 3, var7, 16777215, ec.field_c);
          var13 = dupTemp$1;
          this.b((byte) -78, dupTemp$1);
          this.field_e = this.field_e + (((we) ((Object) var13)).field_p + 5);
          this.field_I.field_o = (of) (this);
          if (null != this.field_D) {
            this.field_D.field_o = (of) (this);
          }
          if (null != this.field_C) {
            this.field_C.field_o = (of) (this);
          }
          if (null == this.field_D) {
            this.field_I.a(30, 13361, 8, this.field_l - 6 - 10, this.field_e);
            this.field_e = this.field_e + 35;
          } else {
            this.field_I.a(30, 13361, 85, this.field_l - 95, this.field_e);
            this.field_e = this.field_e + 60;
          }
          if (this.field_D != null) {
            this.field_D.a(30, 13361, 8, this.field_l - 16, this.field_e);
            this.field_e = this.field_e + 35;
          }
          if (null != this.field_C) {
            if (!this.field_z &&
              !this.field_F) {
              this.field_C.a(20, 13361, 8, 40, this.field_e);
              this.field_e = this.field_e + 25;
            } else {
              this.field_C.a(30, 13361, 8, -6 + (this.field_l - 10), this.field_e);
              this.field_e = this.field_e + 35;
            }
          }
          this.a(3 + this.field_e, 13361, 0, this.field_l, 0);
          this.b((byte) -105, this.field_I);
          if (this.field_D != null) {
            this.b((byte) -69, this.field_D);
          }
          if (this.field_C != null) {
            this.b((byte) -64, this.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("qi.<init>(");
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
          throw la.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 != 7) {
            return;
          }
          if (this.field_I != param4) {
            if (param4 == this.field_D) {
              dc.a(0);
            } else {
              if (this.field_C == param4) {
                if (!this.field_z) {
                  if (!this.field_F) {
                    ok.a(15376);
                  } else {
                    wg.f(-1);
                  }
                } else {
                  vf.a(false);
                }
              }
            }
          } else {
            this.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("qi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        if (!param0) {
          field_E = (String) null;
        }
        if (ke.a(91) ||
          !(this.field_L.field_s.length() <= 0) &&
          !(0 >= this.field_H.field_s.length())) {
          gi.a((byte) 87, this.field_L.field_s, this.field_H.field_s);
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        wf var4 = null;
        bk var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var4 = (wf) (k.field_l.a((byte) -117));
          while (var4 != null) {
            wj.a(25533, var4, param1);
            var4 = (wf) (k.field_l.d((byte) 63));
          }
          var5 = (bk) (wg.field_k.a((byte) -117));
          while (var5 != null) {
            vb.a(param1, var5, true);
            var5 = (bk) (wg.field_k.d((byte) 63));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "qi.DA(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_J = "Email address is unavailable";
        field_A = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_E = "Passwords can only contain letters and numbers";
    }
}
