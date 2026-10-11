/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends kg {
    int field_F;
    static pf field_K;
    int field_L;
    int field_E;
    int field_D;
    int field_M;
    static String field_J;
    static tc field_I;
    int field_H;

    final static nf i(int param0) {
        if (da.field_g == param0) {
          return null;
        }
        return wm.field_d[da.field_g - 1];
    }

    final static hb a(int param0, wb param1) {
        RuntimeException var2 = null;
        vf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -102) {
            rp.h(-96);
          }
          stackIn_3_0 = new vf(param1);
          return (hb) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static gm a(int param0, qf param1, int param2) {
        RuntimeException var3 = null;
        gm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 96) {
            field_J = (String) null;
          }
          stackIn_3_0 = e.a(param2 * param1.field_a / 96, -108, param1.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        field_J = null;
        if (param0 != 4) {
          field_J = (String) null;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, (byte) 98, param3, param4, param5, param6)) {
            if (param2 <= 95) {
              rp.i(34);
            }
            return false;
          }
          var8_int = -this.field_m + (-param4 - (this.field_M - param1));
          var9 = param3 - (param5 + this.field_q) - this.field_L;
          if (this.field_E * this.field_E <= var8_int * var8_int + var9 * var9) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - n.field_p;
          if (var10 < 0.0) {
            var10 = var10 - 3.141592653589793 / (double)this.field_F;
          } else {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_F;
            }
          }
          this.field_H = (int)((double)this.field_F * var10 / 6.283185307179586);
          while (this.field_F <= this.field_H) {
            this.field_H = this.field_H - this.field_F;
          }
          while (0 > this.field_H) {
            this.field_H = this.field_H + this.field_F;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("rp.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        int stackIn_12_0 = 0;
        mj stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        mj stackIn_66_0 = null;
        boolean stackIn_67_1 = false;
        RuntimeException decompiledCaughtException = null;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        mj var3_ref_mj = null;
        fb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fb var6 = null;
        mj var7 = null;
        int var8 = 0;
        mj var8_ref_mj = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        mj var14 = null;
        fb var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        fb var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        mj var22 = null;
        Object var23 = null;
        fb var24 = null;
        mj var25 = null;
        String var26 = null;
        String var27 = null;
        mj var28 = null;
        mj var29 = null;
        Object var30 = null;
        fb var30_ref = null;
        mj var31 = null;
        fb var32 = null;
        fb var33 = null;
        mj var34 = null;
        mj var3_ref_mjLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var23 = null;
        var16 = null;
        var18 = null;
        var30 = null;
        var17 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = sa.field_a;
          if (param0 < 69) {
            var12 = (java.applet.Applet) null;
            rp.a(false, (String) null, (java.applet.Applet) null);
          }
          var2 = ((ob) ((Object) var1)).j(-119);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            4 != var2) {
            if (var2 == 5) {
              var3_long = ((ob) ((Object) var1)).d(75);
              var20 = ((ob) ((Object) var1)).e(-1);
              var19 = ((ob) ((Object) var1)).e(-1);
              var21 = ((ob) ((Object) var1)).e(-1);
              var22 = ta.a(115, var3_long);
              var8_ref_mj = var22;
              stackIn_12_0 = (var19.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var22 != null) {
                if (var9 != 0) {
                  var22.a(var21, var20, (byte) 64);
                }
              } else {
                var8_ref_mj = new mj(var20, var21, var3_long);
                ShatteredPlansClient.field_H.a(var3_long, var8_ref_mj, true);
              }
              var8_ref_mj.field_zb = pr.a(14274) - (long)((ob) ((Object) var1)).a(16711680);
              var8_ref_mj.field_Qb = ((ob) ((Object) var1)).f(-20976);
              var10 = ((ob) ((Object) var1)).c(false);
              var8_ref_mj.field_Fb = var10 >> 1;
              stackIn_19_0 = var8_ref_mj;
              stackIn_20_1 = ((1 & var10) != 0);
              stackIn_19_0.field_Ub = stackIn_20_1;
              var8_ref_mj.field_Lb = ((ob) ((Object) var1)).j(-122);
              var8_ref_mj.field_Wb = ((ob) ((Object) var1)).j(-109);
              f.a((byte) -60, var8_ref_mj);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((ob) ((Object) var1)).d(29);
              var5 = ((ob) ((Object) var1)).j(-53);
              var31 = ta.a(-98, var3_longLifetime1);
              if (var31 == null) {
                return;
              }
              if (var31.field_Vb) {
                ah.field_X = ah.field_X - 1;
                var31.field_Vb = false;
              }
              if (var5 == 0) {
                var31.b((byte) -113);
              } else {
                var31.field_Eb = var5;
                var31.field_Gb = ks.field_i;
              }
              var31.a(16);
              return;
            }
            if (var2 == 7) {
              var34 = (mj) (gr.field_p.d(0));
              while (var34 != null) {
                var34.b((byte) -126);
                var34.a(16);
                var34 = (mj) (gr.field_p.a((byte) -71));
              }
              ah.field_X = 0;
              return;
            }
            if (8 == var2) {
              var3 = ((ob) ((Object) var1)).f(-20976);
              var4 = (fb) (ea.field_b.a(65280, (long)var3));
              if (var4 == null) {
                var4 = new fb(em.field_k);
                ea.field_b.a((long)var3, var4, true);
              }
              mi.a((byte) -89, var4, var1, true);
              ei.a(0, var4);
              return;
            }
            if (9 == var2) {
              var3Lifetime4 = ((ob) ((Object) var1)).f(-20976);
              var4_int = ((ob) ((Object) var1)).j(-98);
              var32 = (fb) (ea.field_b.a(65280, (long)var3Lifetime4));
              if (var32 == null) {
                return;
              }
              if (var4_int == 0) {
                var32.b((byte) -62);
              } else {
                var32.field_hc = var4_int;
                var32.field_Nb = ks.field_i;
              }
              var32.a(16);
              return;
            }
            if (10 == var2) {
              var33 = (fb) (kj.field_a.d(0));
              while (var33 != null) {
                var33.b((byte) -63);
                var33.a(16);
                var33 = (fb) (kj.field_a.a((byte) -71));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((ob) ((Object) var1)).f(-20976);
                var4_intLifetime1 = ((ob) ((Object) var1)).j(-60);
                var30_ref = (fb) (ea.field_b.a(65280, (long)var3Lifetime5));
                if (var30_ref == null) {
                  return;
                }
                var30_ref.field_Yb = false;
                var15 = var30_ref;
                var6 = var15;
                var15.field_Jb = false;
                if (var4_intLifetime1 != 0) {
                  var30_ref.field_hc = var4_intLifetime1;
                  var30_ref.field_Nb = ks.field_i;
                }
                ei.a(0, var30_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (15 != var2 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((ob) ((Object) var1)).d(26);
                    var26 = ((ob) ((Object) var1)).e(-1);
                    var27 = ((ob) ((Object) var1)).e(-1);
                    var7 = ik.a(-121, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new mj(var26, var27, var3_longLifetime2);
                      qp.field_w.a(var3_longLifetime2, var7, true);
                      np.field_a.field_Lb = np.field_a.field_Lb + 1;
                    }
                    var7.field_Qb = ((ob) ((Object) var1)).f(-20976);
                    var8 = ((ob) ((Object) var1)).c(false);
                    stackIn_66_0 = var7;
                    stackIn_67_1 = ((1 & var8) != 0);
                    stackIn_66_0.field_Ub = stackIn_67_1;
                    var7.field_Fb = var8 >> 1;
                    var7.field_Lb = ((ob) ((Object) var1)).j(-111);
                    var7.field_Wb = ((ob) ((Object) var1)).j(-68);
                    uo.field_a.a((byte) -113, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((ob) ((Object) var1)).d(105);
                    var5Lifetime1 = ((ob) ((Object) var1)).j(-120);
                    var28 = ik.a(-101, var3_longLifetime2);
                    if (var28 != null) {
                      if (0 != var5Lifetime1) {
                        var28.field_Gb = ks.field_i;
                        var28.field_Eb = var5Lifetime1;
                      } else {
                        var28.b((byte) -124);
                      }
                      var28.a(16);
                      np.field_a.field_Lb = np.field_a.field_Lb - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    mi.a((byte) -89, np.field_a, var1, false);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((ob) ((Object) var1)).f(-20976);
                    if (var3Lifetime5 != 0) {
                      sf.field_e = pr.a(14274) + (long)var3Lifetime5;
                      return;
                    }
                    sf.field_e = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    a.field_j = ((ob) ((Object) var1)).f(-20976);
                    bh.field_h = ((ob) ((Object) var1)).c(false);
                    return;
                  }
                  if (23 == var2) {
                    ec.field_p = ((ob) ((Object) var1)).d(65);
                    return;
                  }
                  jq.a(-29901, (Throwable) null, "L1: " + w.a(16738));
                  q.g(-115);
                  return;
                }
                var3_longLifetime2 = ((ob) ((Object) var1)).d(127);
                var5Lifetime1Lifetime1 = ((ob) ((Object) var1)).j(-119);
                var14 = ta.a(126, var3_longLifetime2);
                var25 = var14;
                if (var14 == null) {
                  return;
                }
                if (15 != var2) {
                  if (var25.field_Vb) {
                    ah.field_X = ah.field_X - 1;
                    var25.field_Vb = false;
                  }
                } else {
                  var14.field_Tb = false;
                }
                if (0 != var5Lifetime1Lifetime1) {
                  var25.field_Gb = ks.field_i;
                  var25.field_Eb = var5Lifetime1Lifetime1;
                }
                f.a((byte) -60, var25);
                return;
              }
              var3_longLifetime2Lifetime1 = ((ob) ((Object) var1)).d(127);
              var29 = ta.a(121, var3_longLifetime2Lifetime1);
              if (var29 != null) {
                if (var2 != 14) {
                  if (!var29.field_Vb) {
                    ah.field_X = ah.field_X + 1;
                    var29.field_Vb = true;
                  }
                } else {
                  var29.field_Tb = true;
                }
                f.a((byte) -60, var29);
              }
              return;
            }
            var3Lifetime6 = ((ob) ((Object) var1)).f(-20976);
            var18_ref = (fb) (ea.field_b.a(65280, (long)var3Lifetime6));
            var24 = var18_ref;
            if (var24 == null) {
              return;
            }
            if (var2 == 11) {
              var24.field_Jb = true;
            } else {
              var24.field_Yb = true;
            }
            ei.a(0, var24);
            return;
          }
          var3_ref_mj = (mj) (uo.field_a.d(0));
          while (var3_ref_mj != null) {
            var3_ref_mj.b((byte) -91);
            var3_ref_mj.a(16);
            var3_ref_mj = (mj) (uo.field_a.a((byte) -71));
          }
          var3_ref_mjLifetime1 = (mj) (ShatteredPlansClient.field_H.c((byte) -109));
          while (var3_ref_mjLifetime1 != null) {
            if (var3_ref_mjLifetime1.field_Tb ||
              var3_ref_mjLifetime1.field_Vb) {
              var3_ref_mjLifetime1.field_Tb = false;
              if (var3_ref_mjLifetime1.field_Vb) {
                ah.field_X = ah.field_X - 1;
                var3_ref_mjLifetime1.field_Vb = false;
              }
              f.a((byte) -60, var3_ref_mjLifetime1);
            }
            var3_ref_mjLifetime1 = (mj) (ShatteredPlansClient.field_H.b((byte) -107));
          }
          if (var2 == 1 &&
            null != np.field_a) {
            la.field_h = np.field_a.field_Xb;
          }
          if (4 != var2) {
            np.field_a = null;
          } else {
            var3Lifetime1 = ((ob) ((Object) var1)).f(-20976);
            np.field_a = new fb(em.field_k);
            np.field_a.a(16, (long)var3Lifetime1);
            mi.a((byte) -89, np.field_a, var1, false);
            sf.field_e = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            he.field_p = null;
          } else {
            if (he.field_p == null) {
              he.field_p = new fb(em.field_k);
            }
          }
          if (var2 != 3) {
            k.field_i = false;
            return;
          }
          k.field_i = true;
          for (var3Lifetime2 = 0; var3Lifetime2 < id.field_c.length; var3Lifetime2++) {
            id.field_c[var3Lifetime2] = ((ob) ((Object) var1)).g(-2852);
          }
          qj.field_b = ((ob) ((Object) var1)).j(-82);
          rj.field_q = ((ob) ((Object) var1)).j(-54);
          for (var3Lifetime3 = 0; qj.field_f.length > var3Lifetime3; var3Lifetime3++) {
            qj.field_f[var3Lifetime3] = ((ob) ((Object) var1)).g(-2852);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "rp.A(" + param0 + ')');
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            try {
              var3 = (String) (ll.a("getcookies", param2, (byte) 70));
              var4 = so.a(var3, ';', -116);
              var5 = 0;
              if (param0) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              while (var5 < var4.length) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("rp.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rp() throws Throwable {
        throw new Error();
    }

    static {
        field_J = "Total excess research";
    }
}
