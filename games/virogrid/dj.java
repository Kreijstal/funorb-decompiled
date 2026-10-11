/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static e field_h;
    private String field_m;
    static nh field_l;
    private int field_j;
    private int[] field_k;
    static int field_c;
    private long field_i;
    int field_b;
    static int field_n;
    static ml[] field_f;
    ga field_a;
    String field_g;
    km field_d;
    static int field_e;

    private final boolean b(int param0, int param1, int param2) {
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (8 == param1) {
          na.a(this.field_i, this.field_g, param0 - 18);
        } else {
          if (param1 == 18) {
            qm.a(-94, this.field_g, this.field_i);
          } else {
            if (param1 == 11) {
              sd.a(0, param2, this.field_j, (byte) 114);
            } else {
              if (12 == param1) {
                sd.a(1, param2, this.field_j, (byte) 64);
              } else {
                if (param1 == 13) {
                  sd.a(2, param2, this.field_j, (byte) 84);
                } else {
                  if (param1 == 14) {
                    g.a(param0 ^ 14001);
                  } else {
                    if (param1 == 20) {
                      tf.a((byte) 85);
                    } else {
                      if (param1 != 19) {
                        return false;
                      }
                      ul.a(this.field_i, this.field_j, -22557, this.field_g, this.field_k);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 == 17) {
          return true;
        }
        this.field_j = 125;
        return true;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, byte param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int var6 = this.field_a.b(param3, (byte) -89);
        if (param4 != 95) {
          dj.a(-90, true, -128, -63, -5);
          if (var6 != -2) {
            discarded$0 = this.a(var6, param1, param4 - 98);
            discarded$1 = this.a(param2, var6, false);
            discarded$2 = this.b(param4 ^ 78, var6, param2);
            discarded$3 = this.c(param0, var6, param4 ^ -29);
            return true;
          }
          return false;
        }
        if (var6 != -2) {
          discarded$4 = this.a(var6, param1, param4 - 98);
          discarded$5 = this.a(param2, var6, false);
          discarded$6 = this.b(param4 ^ 78, var6, param2);
          discarded$7 = this.c(param0, var6, param4 ^ -29);
          return true;
        }
        return false;
    }

    final void a(byte param0, boolean param1) {
        this.field_a.a(param1, 24960);
        if (param0 > -16) {
          field_e = 9;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        da var4 = null;
        tm var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (da) (aj.field_m.a((byte) -100));
          while (var4 != null) {
            ha.a(param1, var4, (byte) -38);
            var4 = (da) (aj.field_m.a(param0 + 16211));
          }
          if (param0 != 2) {
            dj.a(false);
          }
          var5 = (tm) (bj.field_o.a((byte) -82));
          while (var5 != null) {
            wc.a(var5, (byte) 110, param1);
            var5 = (tm) (bj.field_o.a(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "dj.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        gh var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (param0 != 4) {
            this.field_k = (int[]) null;
          }
          if (null != this.field_g) {
            if (this.field_i == hh.field_d &&
              param2 != 2) {
              return;
            }
            if (oa.field_q != 2) {
              return;
            }
            var7 = this.a(1);
            var4 = var7;
            var5 = j.a(param0 ^ 4, this.field_g);
            var6 = fm.a(this.field_g, -1369854352) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_a.a(1, oi.a(new String[]{var7}, vj.field_a, 2), 4);
              this.field_a.a(1, oi.a(new String[]{var7}, og.field_a, 2), 6);
              if (param1 != null &&
                param2 != 2 &&
                !wg.field_f) {
                this.field_k = param1;
                this.field_a.a(1, oi.a(new String[]{var7}, bm.field_o, 2), 19);
              }
            }
            if (var5 != null) {
              if (!dd.a(this.field_g, false) &&
                !wg.field_f) {
                if (!dh.field_n) {
                  this.field_a.a(1, oi.a(new String[]{var7}, ha.field_d, 2), 8);
                }
                this.field_a.a(1, oi.a(new String[]{var7}, og.field_c, 2), 18);
                if (param1 != null) {
                  this.field_k = param1;
                  this.field_a.a(1, oi.a(new String[]{var7}, bm.field_o, param0 ^ 6), 19);
                }
              }
              this.field_a.a(1, oi.a(new String[]{var7}, nb.field_o, param0 - 2), 5);
            }
            if (var6 == 0) {
              return;
            }
            this.field_a.a(param0 ^ 5, oi.a(new String[]{var7}, hd.field_a, 2), 7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("dj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = -35 / ((23 - param2) / 37);
        if (param1 != 17) {
          return false;
        }
        km.field_yb = new bg(this.field_d.field_Bb, this.field_d.field_J, this.field_d.field_K, this.field_d.field_ub, param0, fn.field_e, wh.field_a, eb.field_b, ti.field_h, vd.field_Z, ma.field_e, this.field_g, this.field_i);
        return true;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        ic stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        ic stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        ic stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        ic stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        oi stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        bf.a(0, 25928, c.field_d);
        if (!ke.field_p.field_d) {
          bf.a(0, 25928, we.field_e);
        }
        if (param4 != -1) {
          if (-2 == param4) {
            throw new RuntimeException();
          }
          pj.a(c.field_d, param3 ^ 259);
          stackIn_44_0 = al.field_j[param4];
          stackIn_44_1 = param0;
          stackIn_45_2 = (ke.field_p.field_d) ? 0 : 2;
          ((oi) (Object) stackIn_44_0).b(stackIn_44_1, stackIn_45_2, -116);
          if (param2 != -1) {
            ff.a(param2, 0, ff.field_a);
          }
          ul.b((byte) 86);
        } else {
          if (vg.field_I != null) {
            if (!ke.field_p.field_d) {
              stackIn_15_0 = vg.field_I;
              stackIn_16_1 = (!(nk.field_K[11] < 0.0)) ? false : true;
              ((ic) (Object) stackIn_15_0).a(stackIn_16_1, (byte) 58, we.field_e, c.field_d);
            } else {
              stackIn_8_0 = vg.field_I;
              stackIn_9_1 = (!(0.0 > nk.field_K[11])) ? false : true;
              ((ic) (Object) stackIn_8_0).a(stackIn_9_1, 85, c.field_d);
            }
          } else {
            if (ei.field_b != null) {
              if (ke.field_p.field_d) {
                stackIn_35_0 = ei.field_b;
                stackIn_36_1 = (!(0.0 > nk.field_K[11])) ? false : true;
                ((ic) (Object) stackIn_35_0).a(stackIn_36_1, param3 ^ 92, c.field_d);
              } else {
                stackIn_28_0 = ei.field_b;
                stackIn_29_1 = (!(0.0 > nk.field_K[11])) ? false : true;
                ((ic) (Object) stackIn_28_0).a(stackIn_29_1, (byte) 90, we.field_e, c.field_d);
              }
            }
          }
        }
        if (param3 == 3) {
          return;
        }
        field_l = (nh) null;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        Object var4;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var5Lifetime1;
        String var5Lifetime2;
        String var5Lifetime3;
        var4 = null;
        if (param2) {
          return false;
        }
        if (param1 == 4) {
          var9 = ab.a((byte) 73, this.field_g, param0);
          if (var9 != null) {
            var5 = (String) null;
            gf.a(this.field_g, 0, false, var9, 2, (String) null);
          }
          return true;
        }
        if (param1 == 5) {
          var6 = og.a(this.field_g, true, param0);
          if (var6 == null) {
            return true;
          }
          var5Lifetime1 = (String) null;
          gf.a(this.field_g, 0, false, var6, 2, (String) null);
          return true;
        }
        if (param1 == 6) {
          var7 = g.a(this.field_g, -128, param0);
          if (var7 != null) {
            var5Lifetime2 = (String) null;
            gf.a(this.field_g, 0, false, var7, 2, (String) null);
          }
          return true;
        }
        if (param1 != 7) {
          return false;
        }
        var8 = og.a(this.field_m, param0, (byte) -106, this.field_g);
        if (var8 != null) {
          var5Lifetime3 = (String) null;
          gf.a(this.field_g, 0, false, var8, 2, (String) null);
        }
        return true;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, int param10, int param11) {
        nl.a(param5, param11, param10, param0, param1, param7, param6, 16777215, param4, param3, param9, param8, param2 + 83, 16777215);
        if (param2 != -83) {
          dj.a(63, true, -5, 52, -122);
        }
    }

    final void a(boolean param0, byte param1) {
        int var6 = Virogrid.field_F ? 1 : 0;
        if (param1 >= -90) {
          return;
        }
        if (null == this.field_g) {
          return;
        }
        if (~this.field_i == ~hh.field_d) {
          return;
        }
        if (wl.field_d == null) {
          return;
        }
        if (!k.b(1000)) {
          return;
        }
        lk var7 = db.a(this.field_i, false);
        lk var4 = ic.a(this.field_i, (byte) -127);
        String var5 = this.a(1);
        if (var4 == null) {
          if (var7 == null) {
            return;
          }
          if (!wl.field_d.field_Rb) {
            return;
          }
          if (wl.field_d.field_ic >= wl.field_d.field_vc) {
            return;
          }
          if (var7.field_Xb) {
            this.field_a.a(1, oi.a(new String[]{var5}, b.field_Cb, 2), 1);
            return;
          }
          if (!param0) {
            this.field_a.a(1, oi.a(new String[]{var5}, qm.field_Hb, 2), 0);
            return;
          }
          if (var7.field_Sb) {
            this.field_a.a(1, oi.a(new String[]{var5}, rb.field_b, 2), 0);
            this.field_a.a(1, oi.a(new String[]{var5}, oe.field_c, 2), 1);
            return;
          }
          this.field_a.a(1, oi.a(new String[]{var5}, qm.field_Hb, 2), 0);
          return;
        }
        if (!wl.field_d.field_kc) {
          this.field_a.a(1, oi.a(new String[]{var5}, fl.field_k, 2), 1);
          return;
        }
        if (wl.field_d.field_mc >= 0) {
          this.field_a.a(1, oi.a(new String[]{var5}, fl.field_k, 2), 1);
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var2Lifetime4Lifetime1;
        int var2Lifetime5Lifetime1;
        if (null != wl.field_d) {
          var2 = 103 / ((param0 - 60) / 39);
          return;
        }
        he var5 = qd.a((byte) 123, this.field_b);
        if (var5 == null) {
          var2Lifetime1 = 103 / ((param0 - 60) / 39);
          return;
        }
        String var3 = var5.field_Qb;
        if (var5.field_dc) {
          this.field_a.a(1, oi.a(new String[]{var3}, i.field_D, 2), 2);
          this.field_a.a(1, oi.a(new String[]{var3}, di.field_u, 2), 3);
          var2Lifetime2 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (var5.field_Ib) {
          this.field_a.a(1, oi.a(new String[]{var3}, ra.field_d, 2), 2);
          if (var5.field_sc) {
            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
          }
          var2Lifetime3 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (var5.field_sc) {
          if (var5.field_sc) {
            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
            var2Lifetime4 = 103 / ((param0 - 60) / 39);
            return;
          }
          var2Lifetime4Lifetime1 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (!var5.field_Rb) {
          if (var5.field_sc) {
            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
            var2Lifetime5 = 103 / ((param0 - 60) / 39);
            return;
          }
          var2Lifetime5Lifetime1 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (!var5.field_kc) {
          this.field_a.a(1, oi.a(new String[]{var3}, la.field_i, 2), 2);
          if (var5.field_sc) {
            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
          }
          var2Lifetime6 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (var5.field_Ib) {
          this.field_a.a(1, oi.a(new String[]{var3}, la.field_i, 2), 2);
          if (var5.field_sc) {
            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
          }
          var2Lifetime7 = 103 / ((param0 - 60) / 39);
          return;
        }
        if (var5.field_sc) {
          this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
        }
        var2Lifetime8 = 103 / ((param0 - 60) / 39);
    }

    final void a(byte param0) {
        String var3 = null;
        if (null != this.field_g &&
          this.field_i != hh.field_d) {
          var3 = this.a(1);
          String var2 = var3;
          this.field_a.a(1, oi.a(new String[]{var3}, db.field_f, 2), 17);
        }
        if (param0 < -40) {
          return;
        }
        dj.a(84, -6);
    }

    private final String a(int param0) {
        String var2 = null;
        if (this.field_m != null) {
          var2 = this.field_m;
        } else {
          var2 = this.field_g;
        }
        if (param0 == 1) {
          return var2;
        }
        field_l = (nh) null;
        return var2;
    }

    final boolean b(int param0) {
        if (param0 <= 41) {
          return false;
        }
        if (null == this.field_a) {
          return false;
        }
        if (this.field_a.g(-71)) {
          return true;
        }
        return false;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 == 0) {
          rj.a(param1, false, this.field_i);
        } else {
          if (param0 == 1) {
            w.a((byte) 74, this.field_i, param1);
          } else {
            if (param0 == 2) {
              cm.a((byte) 20, this.field_b, param1);
            } else {
              if (param0 == 3) {
                nn.a(this.field_b, param1, (byte) -115);
              } else {
                if (param0 == 10) {
                  sb.a(this.field_b, param1, param2 ^ -14533);
                } else {
                  if (param0 == 15) {
                    fm.a(this.field_b, 3, param1);
                  } else {
                    if (param0 != 16) {
                      return false;
                    }
                    fm.a(0, param2 + 6, param1);
                  }
                }
              }
            }
          }
        }
        if (param2 != -3) {
          return false;
        }
        return true;
    }

    dj(km param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_a = new ga(sd.field_f);
          this.field_k = param6;
          this.field_j = param5;
          this.field_m = param3;
          this.field_g = param2;
          param0.field_xb = true;
          this.field_d = param0;
          this.field_i = param1;
          this.field_b = param4;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(cj param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_j) {
            return;
          }
          this.field_j = param0.field_n;
          if (param0.field_n == 0) {
            if (ca.field_D == 0) {
              this.field_a.a(1, el.field_g, 12);
            }
            this.field_a.a(1, f.field_h, 13);
          }
          if (param1) {
            return;
          }
          if (param0.field_n == 1) {
            if (qe.field_m == 0) {
              this.field_a.a(1, w.field_F, 12);
            }
            this.field_a.a(1, la.field_m, 13);
          }
          if (param0.field_n != 2) {
            return;
          }
          if (el.field_t == 0) {
            this.field_a.a(1, rl.field_v, 12);
          }
          this.field_a.a(1, mi.field_a, 13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("dj.O(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
          return;
        }
        field_l = null;
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$498b55a4266a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, int param10, int param11) {
        nl.a(param5, param11, param10, param0, param1, param7, param6, 16777215, param4, param3, param9, param8, param2 + 83, 16777215);
        if (param2 != -83) {
          dj.a(63, true, -5, 52, -122);
        }
    }
}
