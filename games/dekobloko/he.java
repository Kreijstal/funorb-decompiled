/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends kf implements qh, vn {
    private ek field_X;
    static int field_gb;
    private ek field_ib;
    static int[] field_V;
    static boolean field_db;
    private rk field_bb;
    private boolean field_Z;
    private boolean field_W;
    private boolean field_eb;
    static int field_ab;
    private rk field_cb;
    static String field_fb;
    static w field_jb;
    static int field_S;
    private String field_T;
    static String field_Y;
    private ek field_U;
    static String field_hb;

    he(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (gl) null);
        de dupTemp$0 = null;
        de dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ek stackIn_17_1 = null;
        ek stackIn_17_2 = null;
        ek stackIn_18_1 = null;
        ek stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        fk var6 = null;
        RuntimeException var6_ref = null;
        mm var7 = null;
        String var8 = null;
        ij var9 = null;
        de var12 = null;
        de var13 = null;
        try {
          this.field_T = param1;
          stackIn_4_1 = (param2);
          this.field_Z = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_W = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_eb = stackIn_10_1;
          if (this.field_Z && (this.field_eb ||
            this.field_W)) {
            throw new IllegalStateException();
          }
          this.field_bb = (rk) ((Object) new og(param0, (kg) (this), 100));
          this.field_cb = (rk) ((Object) new og("", (kg) (this), 20));
          if (this.field_Z) {
            this.field_U = new ek(sh.field_c, (kg) null);
            this.field_X = new ek(ig.field_Tb, (kg) null);
            this.field_bb.field_I = false;
          } else {
            this.field_U = new ek(jh.field_a, (kg) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_W) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = bl.field_X;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ic.field_b;
            }
            this.field_X = new ek(stackIn_18_3, (kg) null);
            if (this.field_eb) {
              this.field_ib = new ek(i.field_f, (kg) (this));
            }
          }
          this.field_bb.field_p = (gl) ((Object) new di(10000536));
          this.field_cb.field_p = (gl) ((Object) new gm(10000536));
          var6 = new fk();
          this.field_U.field_p = (gl) ((Object) var6);
          if (this.field_X != null) {
            this.field_X.field_p = (gl) ((Object) var6);
          }
          this.field_bb.field_B = f.field_v;
          if (this.field_ib != null) {
            this.field_ib.field_p = (gl) ((Object) var6);
          }
          if (null != this.field_ib) {
            this.field_ib.field_B = tm.field_h;
          }
          if (!this.field_Z) {
            if (this.field_W) {
              this.field_X.field_B = kh.field_c;
              this.field_X.field_p = (gl) ((Object) new on());
            } else {
              this.field_X.field_p = (gl) ((Object) new on());
            }
          } else {
            this.field_X.field_B = gi.field_d;
          }
          this.field_D = 15;
          var7 = hh.field_e;
          if (this.field_T != null) {
            this.field_D = this.field_D + (5 + var7.b(this.field_T, this.field_t - 40, var7.field_R));
          }
          var8 = ua.field_G;
          var9 = jb.a(se.h(25144), -10314);
          if (var9 != ah.field_f) {
            if (var9 == ge.field_g) {
              var8 = sl.field_a;
            }
          } else {
            var8 = v.field_g;
          }
          dupTemp$0 = new de(10, this.field_D, this.field_t - 20, 25, this.field_bb, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, (byte) -55);
          this.field_D = this.field_D + (((ce) ((Object) var12)).field_y + 5);
          dupTemp$1 = new de(10, this.field_D, -20 + this.field_t, 25, this.field_cb, false, 80, 3, var7, 16777215, ch.field_d);
          var13 = dupTemp$1;
          this.b(dupTemp$1, (byte) -55);
          this.field_U.field_v = (kg) (this);
          this.field_D = this.field_D + (5 + ((ce) ((Object) var13)).field_y);
          if (this.field_ib != null) {
            this.field_ib.field_v = (kg) (this);
          }
          if (this.field_X != null) {
            this.field_X.field_v = (kg) (this);
          }
          if (null == this.field_ib) {
            this.field_U.b(30, this.field_t - 16, 8, this.field_D, -16555);
            this.field_D = this.field_D + 35;
          } else {
            this.field_U.b(30, this.field_t - 95, 85, this.field_D, -16555);
            this.field_D = this.field_D + 60;
          }
          if (null != this.field_ib) {
            this.field_ib.b(30, -10 + (-6 + this.field_t), 8, this.field_D, -16555);
            this.field_D = this.field_D + 35;
          }
          if (this.field_X != null) {
            if (!this.field_Z &&
              !this.field_W) {
              this.field_X.b(20, 40, 8, this.field_D, -16555);
              this.field_D = this.field_D + 25;
            } else {
              this.field_X.b(30, -10 + (-6 + this.field_t), 8, this.field_D, -16555);
              this.field_D = this.field_D + 35;
            }
          }
          this.b(this.field_D + 3, this.field_t, 0, 0, -16555);
          this.b(this.field_U, (byte) -55);
          if (null != this.field_ib) {
            this.b(this.field_ib, (byte) -55);
          }
          if (this.field_X != null) {
            this.b(this.field_X, (byte) -55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("he.<init>(");
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
          throw dh.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void b(int param0, rk param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_bb == param1) {
            this.field_cb.a(false, (ce) (this));
          }
          if (param1 == this.field_cb) {
            this.f((byte) -29);
          }
          if (param0 != -2569) {
            field_fb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("he.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2, uf param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var4_int = param3.a(param2, (byte) 81);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          var5 = param3.a(3, (byte) 52);
          if (param0 != 5) {
            stackIn_10_0 = (byte[]) null;
            return stackIn_10_0;
          }
          var6 = (byte)param3.a(8, (byte) 58);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(var6 + param3.a(var5, (byte) 117));
            }
          }
          stackIn_19_0 = (byte[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("he.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (ri.a(71) ||
          !(this.field_bb.field_E.length() <= 0) &&
          !(this.field_cb.field_E.length() <= 0)) {
          da.a((byte) -109, this.field_bb.field_E, this.field_cb.field_E);
        }
        if (param0 > -26) {
          field_hb = (String) null;
        }
    }

    final String j(int param0) {
        if (param0 != 80) {
          he.a(false, false, -20);
        }
        if (this.field_bb.field_E == null) {
          return "";
        }
        return this.field_bb.field_E;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        nm stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        w stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vj var4 = null;
        Object var5 = null;
        wb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pf var16 = null;
        pf var17 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          stackIn_3_0 = ge.field_f.field_Rb;
          stackIn_3_1 = 2 + kf.field_O;
          stackIn_3_2 = param2 * ((kf.field_O + 2) * 3);
          stackIn_3_3 = -15230;
          stackIn_4_4 = (ki.field_w == ge.field_f.field_Rb);
          var3_int = ((nm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, 2, param1) ? 1 : 0;
          var4 = ge.field_f.field_Sb.field_M;
          if (jj.field_b != 2 &&
            jj.field_b != 1) {
            ge.field_f.field_Hb = false;
            ge.field_f.field_Rb.field_Rb.field_Y = wf.field_m;
            gk.a(ge.field_f.field_Sb, true);
          } else {
            ge.field_f.field_Rb.field_Rb.field_Y = null;
            ge.field_f.field_Hb = true;
            var5 = null;
            var6 = (wb) (var4.c((byte) 95));
            while (var6 != null) {
              var7 = 0;
              if (null == var6.field_M) {
                var6.field_Sb = new w(0L, gg.field_G);
                var6.a(var6.field_Sb, -16834);
                var6.field_Wb = new w(0L, gg.field_G);
                var6.a(var6.field_Wb, -16834);
                var6.d(-36);
                var7 = 1;
              }
              var6.field_mb = ge.field_f.field_Sb.field_mb;
              var6.field_Sb.a(var6.field_mb, 0, 0, kf.field_O, 0);
              var8 = 0;
              if (var6.field_Tb != null &&
                !var6.field_Tb.equals("")) {
                var6.field_Wb.field_I = a.field_p;
                var6.field_Wb.field_Bb = 16737894;
                var6.field_Wb.a(3 + a.field_p.field_K, 0, 0, kf.field_O, 0);
                var8 = 1;
              }
              var9 = 0;
              var10 = var6.field_mb;
              if (var8 != 0) {
                var9 = 3 + a.field_p.field_K;
                var10 = var10 - var9;
              }
              stackIn_20_0 = var6.field_Sb;
              if (var10 <= 0) {
                stackIn_21_1 = var6.field_Ob;
              } else {
                stackIn_21_1 = mm.a(var6.field_Sb.field_J, var6.field_Ob, var10);
              }
              stackIn_20_0.field_Y = stackIn_21_1;
              stackIn_24_0 = (var6.field_Sb.field_Y.equals(var6.field_Ob)) ? 0 : 1;
              var11 = stackIn_24_0;
              var6.field_Sb.a(var10, 0, 0, kf.field_O, var9);
              if (var3_int == 0) {
                var6.field_F = kf.field_O - var6.field_N;
              }
              if (var7 != 0) {
                ge.field_f.field_Sb.a((w) (var5), var6, 2, 0);
              }
              if (null != var6.field_Wb &&
                var6.field_Wb.field_jb) {
                sl.field_g = var6.field_Tb;
              } else {
                if (var6.field_Sb.field_jb &&
                  var11 != 0) {
                  sl.field_g = var6.field_Ob;
                }
              }
              var5 = var6;
              if (var6.field_ob != 0) {
                sl.$cfr$intArgs$a$2862dfd4c01c(var6.field_Pb, (int[]) null, 112, ge.field_f.field_Rb, var6, var6.field_Ob, 0L, -1, -1);
                var16 = w.field_H;
                var13_ref_String = wk.field_o;
                var16.field_h.a(var13_ref_String, 7, 72);
                var17 = w.field_H;
                var13 = field_S;
                var14 = nf.field_h;
                var17.field_h.b(var14, var13, 89, 0, 0);
              }
              var6 = (wb) (var4.d(param0));
            }
            if (ge.field_f.field_Ob.field_ob != 0) {
              vh.field_h = new hb(ge.field_f.field_Ob.field_E, ge.field_f.field_Ob.field_pb, ge.field_f.field_Ob.field_mb, ge.field_f.field_Ob.field_N, pj.field_L, ah.field_h, ua.field_H, ua.field_H);
              of.field_d = 2;
            }
            if (ge.field_f.field_Nb.field_ob != 0) {
              vh.field_h = new hb(ge.field_f.field_Nb.field_E, ge.field_f.field_Nb.field_pb, ge.field_f.field_Nb.field_mb, ge.field_f.field_Nb.field_N, bn.field_b, ah.field_h, ua.field_H, ua.field_H);
              of.field_d = 3;
            }
          }
          if (!param0) {
            field_jb = (w) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "he.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (param0 >= -5) {
            he.a(true, true, -20);
          }
          if ((param1 <= 0 ||
            128 <= param1) &&
            (param1 < 160 ||
            255 < param1)) {
            if (param1 != 0) {
              var6 = nh.field_l;
              var2 = var6;
              for (var3 = 0; var3 < var6.length; var3++) {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "he.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = jm.a('_', param0, "", -1);
          var3 = oa.a(param0, -1);
          var4 = -17 % ((58 - param1) / 55);
          stackIn_5_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        rk var3 = null;
        String var4 = null;
        try {
          var3 = this.field_bb;
          var4 = param0;
          var3.a(var4, (byte) 114, false);
          if (param1 != 30534) {
            this.a(127, 108, (ce) null, 'ﾫ');
          }
          this.field_cb.m(0);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "he.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(65, param1, param2, param3)) {
            return true;
          }
          var5_int = 56 / ((-22 - param0) / 49);
          if (param1 == 98) {
            stackIn_6_0 = this.a(param2, (byte) -45);
            return stackIn_6_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_10_0 = this.a(32, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("he.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, rk param1) {
        try {
          if (param0 != 16737894) {
            this.field_W = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "he.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        if (param0 <= 28) {
          this.field_X = (ek) null;
        }
        this.field_bb.m(0);
        this.field_cb.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_T != null) {
          hh.field_e.a(this.field_T, param0 + (this.field_u + 20), param3 + (this.field_D + 15), this.field_t - 40, this.field_y, 16777215, -1, 1, 0, hh.field_e.field_R);
        }
        if (param1 > -103) {
          field_jb = (w) null;
        }
        if (this.field_ib != null) {
          hk.a(10 + param0, 134 + param3, -20 + this.field_t, 4210752);
        }
        super.a(param0, -119, param2, param3);
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (param2 != this.field_U) {
            if (param2 == this.field_ib) {
              ha.e(0);
            } else {
              if (param2 == this.field_X) {
                if (this.field_Z) {
                  qi.h(17);
                } else {
                  if (this.field_W) {
                    t.k((byte) -73);
                  } else {
                    lg.a(8927);
                  }
                }
              }
            }
          } else {
            this.f((byte) -37);
          }
          if (param0 != 67) {
            this.j(-21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("he.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        tf.field_gb.a(1141039778, param0);
        if (param1 > -73) {
          field_fb = (String) null;
        }
    }

    public static void i(int param0) {
        field_hb = null;
        field_Y = null;
        field_V = null;
        if (param0 != 0) {
          field_hb = (String) null;
        }
        field_fb = null;
        field_jb = null;
    }

    static {
        field_V = new int[4];
        field_gb = 250;
        field_fb = "Loading sound effects";
        field_S = 0;
    }
}
