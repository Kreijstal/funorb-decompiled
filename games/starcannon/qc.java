/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends java.awt.Canvas implements java.awt.event.FocusListener {
    static hl[] field_e;
    static d[] field_c;
    static String field_a;
    java.awt.Frame field_f;
    volatile boolean field_b;
    static int field_g;
    static int field_d;

    final static void a(hl[] param0, int param1, int param2, hl[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9, int param10, qe param11, int param12, int param13, qe param14) {
        try {
          int var15_int = -85 / ((param5 + 30) / 62);
          hl[] var16 = (hl[]) null;
          rc.a(0, param2, 0, 31944, sd.field_a, param12, 480, param7, sb.field_m, param1, ig.field_b, param14, param6, param0, param9, param13, (hl[]) null, param3, param11, param10, param4);
          se.a(param8, 480);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(fb param0, byte param1) {
        int var2_int = 0;
        fb var3 = null;
        int var4 = 0;
        fb var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = StarCannon.field_A;
        try {
          if (param0.field_h == null) {
            return;
          }
          if (param0.field_i != 0 ||
            param0.field_b != 0) {
            for (var2_int = 0; wi.field_b > var2_int; var2_int++) {
              var3 = lf.field_bb[var2_int];
              if (var3.field_q == 2 &&
                var3.field_i == param0.field_i &&
                param0.field_b == var3.field_b) {
                return;
              }
            }
          }
          if (param1 >= -36) {
            var5 = (fb) null;
            qc.a((fb) null, (byte) -81);
          }
          if (null == param0.field_a) {
          }
          mg.a((byte) 92, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("qc.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qc.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ka param0, byte param1) {
        try {
          int var3_int = -27 / ((param1 - 68) / 49);
          eg.a(this.field_f, (byte) -47, param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          int var2_int = -16 / ((-9 - param1) / 60);
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(hj.field_c);
          param0.addFocusListener(hj.field_c);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qc() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(boolean param0) {
        if (null != fa.field_G) {
          fa.field_G.n(-110);
        }
        if (param0) {
          return;
        }
        n.field_l = new hg();
        t.field_h.c(20317, n.field_l);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static int a(String param0, boolean param1, int param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_30_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_95_0 = 0;
          RuntimeException stackIn_98_0 = null;
          StringBuilder stackIn_98_1 = null;
          String stackIn_99_2 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          qe var9 = null;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          try {
            if (m.field_b == null &&
              !jh.a((byte) -68, param3)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (r.field_c == ua.field_b) {
              if (!param3) {
                jh.field_h = ll.a(false, (byte) -49, param5, param0);
              } else {
                var10 = (String) null;
                jh.field_h = ik.a(param0, -66, cb.field_a, (String) null, false);
              }
              d.field_b.field_g = 0;
              d.field_b.a(14, -51);
              d.field_b.a(jh.field_h.b((byte) 1).field_j, -92);
              nf.a(-1, (byte) 95);
              r.field_c = wc.field_d;
            }
            if (param4 != -1) {
              var9 = (qe) null;
              qc.a((hl[]) null, -12, 123, (hl[]) null, 4, 6, -76, 11, true, -78, -110, (qe) null, 9, 62, (qe) null);
            }
            if (wc.field_d == r.field_c &&
              ag.a(127, 1)) {
              var6_int = se.field_p.j(7909);
              se.field_p.field_g = 0;
              if (var6_int == 0) {
                r.field_c = od.field_f;
              } else {
                vh.field_t = var6_int;
                r.field_c = mg.field_i;
                il.field_g = -1;
              }
            }
            if (r.field_c == od.field_f &&
              ag.a(127, 8)) {
              mi.field_o = se.field_p.c((byte) 5);
              se.field_p.field_g = 0;
              se.a(param3, jh.field_h, 0, param2, param1);
              r.field_c = uc.field_a;
            }
            boolean decompiledFrameRemainder0 = true;
            if (uc.field_a == r.field_c &&
              ag.a(123, 1)) {
              var6_intLifetime1 = se.field_p.j(7909);
              lj.field_c = null;
              vh.field_t = var6_intLifetime1;
              se.field_p.field_g = 0;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (8 != var6_intLifetime1) {
                  r.field_c = mg.field_i;
                  il.field_g = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ec.a((byte) 27);
                  eb.field_f = false;
                  stackIn_30_0 = var6_intLifetime1;
                  return stackIn_30_0;
                }
              }
              if (decompiledFrameRemainder0) {
                r.field_c = dd.field_b;
                il.field_g = -1;
              }
            }
            if (r.field_c == dd.field_b &&
              fk.a(false)) {
              cb.field_a = se.field_p.c((byte) 5);
              ad.field_y = se.field_p.j(7909);
              se.field_p.j(7909);
              u.field_d = se.field_p.i(param4 ^ 1174051991);
              var6 = se.field_p.b((byte) 108);
              var7 = se.field_p.j(7909);
              if ((1 & var7) != 0) {
                gd.a(24);
              }
              if (!param3) {
                stackIn_43_0 = ((8 & var7) != 0);
                gd.field_g = stackIn_43_0;
                stackIn_46_0 = ((4 & var7) != 0);
                jh.field_d = stackIn_46_0;
                if (!gd.field_g) {
                }
              }
              if (qa.field_e) {
                se.field_p.j(param4 ^ -7910);
                se.field_p.j(param4 ^ -7910);
                se.field_p.f((byte) -105);
                na.field_f = se.field_p.i(-1174051992);
                qb.field_m = new byte[na.field_f];
                for (var8 = 0; var8 < na.field_f; var8++) {
                  qb.field_m[var8] = se.field_p.a(false);
                }
              }
              we.field_i = se.field_p.a(-110);
              var11 = (CharSequence) ((Object) we.field_i);
              ba.field_e = ni.a(param4 ^ -117, var11);
              jj.field_F = se.field_p.j(7909);
              r.field_c = pb.field_a;
              if (jh.field_h.b((byte) 1) != j.field_d) {
                if (jh.field_h.b((byte) 1) == na.field_b) {
                  bh.field_b.a(ll.b(119), true);
                }
              } else {
                p.field_a.a(ll.b(100), true);
              }
              eb.field_f = false;
              if (var6 != null) {
                lj.a(var6, 118, ll.b(param4 + 81));
              }
              if (u.field_d <= 0 &&
                !jh.field_d) {
                try {
                  mb.a(ll.b(param4 + 89), "unzap", true);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  mb.a(new Object[]{ue.a(cb.field_a, param4 + 16779)}, ll.b(114), "zap", -27504);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (u.field_d > 0) {
                ah.field_i = true;
              }
              d.field_b.a(jl.field_b, (byte) 122);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                jl.field_b[var8Lifetime1] = jl.field_b[var8Lifetime1] + 50;
              }
              se.field_p.a(jl.field_b, (byte) -82);
              stackIn_73_0 = vh.field_t;
              return stackIn_73_0;
            }
            if (mg.field_i == r.field_c &&
              fk.a(false)) {
              ec.a((byte) 27);
              if (vh.field_t == 7 &&
                !eb.field_f) {
                eb.field_f = true;
                stackIn_84_0 = -1;
                return stackIn_84_0;
              }
              if (vh.field_t == 7) {
                vh.field_t = 3;
              }
              uj.field_r = se.field_p.a(-94);
              eb.field_f = false;
              stackIn_82_0 = vh.field_t;
              return stackIn_82_0;
            }
            if (m.field_b == null) {
              if (eb.field_f) {
                if (kg.b((byte) -71) > 30000L) {
                  uj.field_r = ti.field_g;
                } else {
                  uj.field_r = va.field_o;
                }
                eb.field_f = false;
                stackIn_92_0 = 3;
                return stackIn_92_0;
              }
              var6_intLifetime2 = sj.field_I;
              sj.field_I = pe.field_c;
              pe.field_c = var6_intLifetime2;
              eb.field_f = true;
            }
            stackIn_95_0 = -1;
            return stackIn_95_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_98_0 = var6_ref;
            stackIn_98_1 = new StringBuilder().append("qc.G(");
            if (param0 == null) {
              stackIn_99_2 = "null";
            } else {
              stackIn_99_2 = "{...}";
            }
            stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -1) {
          fb var2 = (fb) null;
          qc.a((fb) null, (byte) -51);
        }
        field_e = null;
    }

    static {
        field_a = "Proxima liberated<br><br>Level 3<br>Destroy the Paragulan homeworld fleet";
        field_c = new d[4000];
    }
}
