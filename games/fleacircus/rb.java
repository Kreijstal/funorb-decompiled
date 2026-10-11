/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends gj implements da {
    private bb field_I;
    private bb field_J;
    static int field_H;
    static dd field_G;
    private bb field_F;

    final static void a(int param0, int param1, byte param2) {
        af.field_b = param0;
        vc.field_f = param1;
        if (param2 < 61) {
          rb.a(-16, 15, (byte) 71);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (param3 != 248) {
            rb.a(-65, -100, (byte) -84);
          }
          if (param4 != this.field_F) {
            if (param4 == this.field_J) {
              oh.d(false);
            } else {
              if (this.field_I == param4) {
                ak.a(65);
              }
            }
          } else {
            na.a((byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("rb.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          int stackIn_75_0 = 0;
          int stackIn_78_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = fleas.field_A ? 1 : 0;
          try {
            if (null == sg.field_h &&
              !id.a(false, param2)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (rh.field_k == d.field_O) {
              if (!param2) {
                cf.field_c = lk.a(param1, false, (byte) -35, param3);
              } else {
                var10 = (String) null;
                cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
              }
              ud.field_b.field_i = 0;
              ud.field_b.a(-11, 14);
              ud.field_b.a(-11, cf.field_c.a(true).field_c);
              dk.b((byte) 41, -1);
              rh.field_k = je.field_P;
            }
            if (rh.field_k == je.field_P &&
              gi.a(1, true)) {
              var6_int = ae.field_a.e(false);
              if (var6_int == 0) {
                rh.field_k = ef.field_h;
              } else {
                rh.field_k = pi.field_g;
                be.field_a = var6_int;
                pd.field_l = -1;
              }
              ae.field_a.field_i = 0;
            }
            if (ef.field_h == rh.field_k &&
              gi.a(8, true)) {
              ug.field_a = ae.field_a.f(-71);
              ae.field_a.field_i = 0;
              wd.a(param2, -120, cf.field_c, param4, param0);
              rh.field_k = dl.field_w;
            }
            boolean decompiledFrameRemainder0 = true;
            if (dl.field_w == rh.field_k &&
              gi.a(1, true)) {
              var6_intLifetime1 = ae.field_a.e(false);
              be.field_a = var6_intLifetime1;
              ae.field_a.field_i = 0;
              wc.field_p = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  rh.field_k = pi.field_g;
                  pd.field_l = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  k.c(-28354);
                  aa.field_q = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                pd.field_l = -1;
                rh.field_k = ll.field_r;
              }
            }
            if (ll.field_r == rh.field_k &&
              gf.b(-128)) {
              aj.field_w = ae.field_a.f(-109);
              qe.field_k = ae.field_a.e(false);
              ae.field_a.e(false);
              wc.field_q = ae.field_a.d((byte) -116);
              var11 = ae.field_a.a((byte) -115);
              var7 = ae.field_a.e(false);
              if ((var7 & 1) != 0) {
                f.d((byte) -37);
              }
              if (!param2) {
                stackIn_44_0 = ((var7 & 4) != 0);
                ed.field_a = stackIn_44_0;
                stackIn_47_0 = ((var7 & 8) != 0);
                ee.field_i = stackIn_47_0;
                if (!ee.field_i) {
                }
              }
              if (bk.field_e) {
                ae.field_a.e(false);
                ae.field_a.e(false);
                ae.field_a.c((byte) 123);
                ge.field_g = ae.field_a.d((byte) -117);
                gi.field_c = new byte[ge.field_g];
                for (var8 = 0; ge.field_g > var8; var8++) {
                  gi.field_c[var8] = ae.field_a.i(-127);
                }
              }
              b.field_e = ae.field_a.h(0);
              var12 = (CharSequence) ((Object) b.field_e);
              ma.field_a = uk.a(92, var12);
              nb.field_h = ae.field_a.e(false);
              rh.field_k = fh.field_b;
              if (cf.field_c.a(true) == wa.field_g) {
                ml.field_F.a(true, rl.a((byte) -111));
              } else {
                if (cf.field_c.a(true) == mk.field_i) {
                  wd.field_b.a(true, rl.a((byte) -116));
                }
              }
              aa.field_q = false;
              if (var11 != null) {
                ea.a(376, rl.a((byte) -120), var11);
              }
              if (0 >= wc.field_q &&
                !ed.field_a) {
                try {
                  eb.a("unzap", rl.a((byte) -65), -250);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  eb.a("zap", new Object[]{rh.a((byte) -70, aj.field_w)}, -11745, rl.a((byte) -126));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < wc.field_q) {
                va.field_m = true;
              }
              ud.field_b.a(ue.field_a, (byte) 12);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                ue.field_a[var8Lifetime1] = ue.field_a[var8Lifetime1] + 50;
              }
              ae.field_a.a(ue.field_a, (byte) 12);
              stackIn_75_0 = be.field_a;
              return stackIn_75_0;
            }
            if (param5 >= -19) {
              stackIn_78_0 = 13;
              return stackIn_78_0;
            }
            if (pi.field_g == rh.field_k &&
              gf.b(115)) {
              k.c(-28354);
              if (7 == be.field_a &&
                !aa.field_q) {
                aa.field_q = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (be.field_a == 7) {
                be.field_a = 3;
              }
              fh.field_a = ae.field_a.h(0);
              aa.field_q = false;
              stackIn_90_0 = be.field_a;
              return stackIn_90_0;
            }
            if (sg.field_h == null) {
              if (aa.field_q) {
                if (h.b(102) <= 30000L) {
                  fh.field_a = jc.field_d;
                } else {
                  fh.field_a = ok.field_B;
                }
                aa.field_q = false;
                stackIn_98_0 = 3;
                return stackIn_98_0;
              }
              var6_intLifetime2 = be.field_b;
              be.field_b = ab.field_d;
              ab.field_d = var6_intLifetime2;
              aa.field_q = true;
            }
            stackIn_100_0 = -1;
            return stackIn_100_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6;
            stackIn_103_1 = new StringBuilder().append("rb.AA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 > -95) {
          dd var2 = (dd) null;
          rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = this.field_y + param1;
        int var6 = this.field_z + param0;
        ug.field_e.a(rd.field_b, var5 + 20, var6 + 20, this.field_u - 40, this.field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
        super.b(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b(param2, -28533);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(32, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        this.field_J = new bb(qk.field_h, (kd) null);
        this.field_F = new bb(qj.field_J, (kd) null);
        this.field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        this.field_J.field_p = (ch) ((Object) var1);
        this.field_F.field_p = (ch) ((Object) var1);
        this.field_I.field_p = (ch) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_F.a(-var3 + this.field_u >> 1, var4, -var2 + this.field_j - 48, 30, 80);
        this.field_I.a(var2 + (var4 + (-var3 + this.field_u >> 1)), var4, -var2 + (-48 + this.field_j), 30, 80);
        this.field_J.a(this.field_u - var3 >> 1, var3, this.field_j - (78 + var2 * 2), 30, 80);
        this.field_F.field_s = (kd) (this);
        this.field_J.field_s = (kd) (this);
        this.field_J.field_m = se.field_f;
        this.field_I.field_s = (kd) (this);
        this.field_I.field_m = ga.field_n;
        this.a((qa) (this.field_F), (byte) -39);
        this.a((qa) (this.field_J), (byte) -59);
        this.a((qa) (this.field_I), (byte) -53);
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, byte param6, int param7, int param8) {
        bh.field_l = param2;
        li.field_i = param8;
        ei.field_V = param1;
        if (param6 <= 119) {
          return;
        }
        try {
          aj.field_q = param7;
          t.field_d = param0;
          kh.field_d = param5;
          wa.field_m = param4;
          pb.field_g = param3;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rb.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
