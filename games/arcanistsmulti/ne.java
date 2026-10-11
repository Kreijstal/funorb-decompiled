/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    String field_h;
    static String field_j;
    pe field_l;
    private String field_k;
    static String field_a;
    private int[] field_m;
    static int field_g;
    private int field_i;
    private long field_d;
    int field_e;
    kc field_c;
    static int field_b;
    static String field_f;

    private final boolean a(int param0, int param1, int param2) {
        String var4_ref = null;
        int var5 = 0;
        String var6 = null;
        Object var4 = null;
        String var4_refLifetime1;
        String var4_refLifetime2;
        String var4_refLifetime3;
        String var6Lifetime1;
        String var6Lifetime2;
        String var6Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param0 == 4) {
          var4_ref = bo.a(this.field_h, (byte) -26, param2);
          var5 = 61 / ((11 - param1) / 63);
          if (var4_ref != null) {
            var6 = (String) null;
            ao.a(0, (byte) 97, var4_ref, this.field_h, 2, (String) null);
          }
          return true;
        }
        if (param0 == 5) {
          var4_refLifetime1 = oe.a(this.field_h, 29140, param2);
          var5Lifetime1 = 61 / ((11 - param1) / 63);
          if (var4_refLifetime1 != null) {
            var6Lifetime1 = (String) null;
            ao.a(0, (byte) 97, var4_refLifetime1, this.field_h, 2, (String) null);
            return true;
          }
          return true;
        }
        if (param0 == 6) {
          var4_refLifetime2 = eh.a((byte) -120, param2, this.field_h);
          var5Lifetime2 = 61 / ((11 - param1) / 63);
          if (var4_refLifetime2 != null) {
            var6Lifetime2 = (String) null;
            ao.a(0, (byte) 97, var4_refLifetime2, this.field_h, 2, (String) null);
          }
          return true;
        }
        if (param0 != 7) {
          return false;
        }
        var4_refLifetime3 = hf.a(this.field_h, this.field_k, param2, 10068666);
        var5Lifetime3 = 61 / ((11 - param1) / 63);
        if (var4_refLifetime3 != null) {
          var6Lifetime3 = (String) null;
          ao.a(0, (byte) 97, var4_refLifetime3, this.field_h, 2, (String) null);
        }
        return true;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var6 = 0;
        int var6Lifetime1;
        if (param4 != 12815) {
          this.d(102);
          var6 = this.field_l.a(-1, param0);
          if (var6 == -2) {
            return false;
          }
          discarded$0 = this.b(param2, param4 ^ 32446, var6);
          discarded$1 = this.a(var6, -68, param3);
          discarded$2 = this.a(var6, param3, false);
          discarded$3 = this.a(param1, (byte) -64, var6);
          return true;
        }
        var6Lifetime1 = this.field_l.a(-1, param0);
        if (var6Lifetime1 == -2) {
          return false;
        }
        boolean discarded$4 = this.b(param2, param4 ^ 32446, var6Lifetime1);
        boolean discarded$5 = this.a(var6Lifetime1, -68, param3);
        boolean discarded$6 = this.a(var6Lifetime1, param3, false);
        boolean discarded$7 = this.a(param1, (byte) -64, var6Lifetime1);
        return true;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param2 == 17) {
          db.field_a = new w(this.field_c.field_V, this.field_c.field_nb, this.field_c.field_x, this.field_c.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, this.field_h, this.field_d);
          return true;
        }
        if (param1 == -64) {
          return false;
        }
        this.field_c = (kc) null;
        return false;
    }

    final void d(int param0) {
        String var3 = null;
        if (this.field_h != null) {
          if (this.field_d == qf.field_a) {
            if (param0 != 5552) {
              field_a = (String) null;
              return;
            }
            return;
          }
          var3 = this.a((byte) 32);
          String var2 = var3;
          this.field_l.a(17, tj.a(-38, new String[]{var3}, ad.field_b), (byte) -26);
        }
        if (param0 == 5552) {
          return;
        }
        field_a = (String) null;
    }

    private final String a(byte param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == 32) {
          if (null == this.field_k) {
            var2 = this.field_h;
          } else {
            var2 = this.field_k;
          }
          return var2;
        }
        this.a(false, -123, 50, 70, -1);
        if (null == this.field_k) {
          var2Lifetime1 = this.field_h;
        } else {
          var2Lifetime1 = this.field_k;
        }
        return var2Lifetime1;
    }

    final static boolean b(int param0) {
        if (param0 != -22768) {
          field_g = 24;
          if (ob.field_Y == null) {
            return false;
          }
          if (ob.field_Y.d((byte) -126)) {
            return true;
          }
          return false;
        }
        if (ob.field_Y == null) {
          return false;
        }
        if (ob.field_Y.d((byte) -126)) {
          return true;
        }
        return false;
    }

    final void a(int param0, jg param1) {
        if (param1.field_i) {
          return;
        }
        try {
          this.field_i = param1.field_m;
          if (param0 != 19) {
            this.field_m = (int[]) null;
          }
          if (param1.field_m == 0) {
            if (0 == on.field_h) {
              this.field_l.a(12, fg.field_g, (byte) -26);
            }
            this.field_l.a(13, jg.field_j, (byte) -26);
          }
          if (param1.field_m == 1) {
            if (ra.field_m == 0) {
              this.field_l.a(12, go.field_a, (byte) -26);
            }
            this.field_l.a(13, dm.field_J, (byte) -26);
          }
          if (param1.field_m == 2) {
            if (hd.field_b == 0) {
              this.field_l.a(12, va.field_d, (byte) -26);
            }
            this.field_l.a(13, ol.field_c, (byte) -26);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ne.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        cg var4;
        String var5;
        int var6;
        cg var11;
        cg var12;
        cg var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 72) {
          this.a((byte) -94, false);
          if (this.field_h == null) {
            return;
          }
          if (this.field_d != qf.field_a &&
            null != wi.field_f) {
            if (!qk.k((byte) 98)) {
              return;
            }
            var12 = fn.a(this.field_d, 110);
            var4 = vf.a(this.field_d, 8192);
            var5 = this.a((byte) 32);
            if (var4 != null) {
              if (!wi.field_f.field_Lb) {
                this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                return;
              }
              if (wi.field_f.field_nc >= 0) {
                this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                return;
              }
            } else {
              if (var12 != null &&
                wi.field_f.field_kc) {
                if (wi.field_f.field_dc <= wi.field_f.field_Rb) {
                  return;
                }
                if (var12.field_Db) {
                  this.field_l.a(1, tj.a(124, new String[]{var5}, na.field_gc), (byte) -26);
                  return;
                }
                if (param1 &&
                  var12.field_Kb) {
                  this.field_l.a(0, tj.a(-55, new String[]{var5}, se.field_L), (byte) -26);
                  this.field_l.a(1, tj.a(param0 + 54, new String[]{var5}, gh.field_z), (byte) -26);
                  return;
                }
                this.field_l.a(0, tj.a(param0 + 48, new String[]{var5}, nh.field_x), (byte) -26);
                return;
              }
            }
          }
          return;
        }
        if (this.field_h == null) {
          return;
        }
        if (this.field_d == qf.field_a) {
          return;
        }
        if (null == wi.field_f) {
          return;
        }
        if (!qk.k((byte) 98)) {
          return;
        }
        var11 = fn.a(this.field_d, 110);
        var4Lifetime1 = vf.a(this.field_d, 8192);
        var5 = this.a((byte) 32);
        if (var4Lifetime1 != null) {
          if (wi.field_f.field_Lb &&
            wi.field_f.field_nc < 0) {
            return;
          }
          this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
          return;
        }
        if (var11 == null) {
          return;
        }
        if (!wi.field_f.field_kc) {
          return;
        }
        if (wi.field_f.field_dc <= wi.field_f.field_Rb) {
          return;
        }
        if (var11.field_Db) {
          this.field_l.a(1, tj.a(124, new String[]{var5}, na.field_gc), (byte) -26);
          return;
        }
        if (param1 &&
          var11.field_Kb) {
          this.field_l.a(0, tj.a(-55, new String[]{var5}, se.field_L), (byte) -26);
          this.field_l.a(1, tj.a(param0 + 54, new String[]{var5}, gh.field_z), (byte) -26);
          return;
        }
        this.field_l.a(0, tj.a(param0 + 48, new String[]{var5}, nh.field_x), (byte) -26);
    }

    final void a(int param0) {
        String var3;
        int var4;
        qb[] var5;
        na var6;
        na var7;
        na var8;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 3) {
          var5 = (qb[]) null;
          ne.a(39, -67, (qb[]) null, -123, 12, 116);
          if (wi.field_f != null) {
            return;
          }
          var8 = im.a(this.field_e, (byte) -103);
          if (var8 == null) {
            return;
          }
          var3 = var8.field_ic;
          if (var8.field_Hb) {
            this.field_l.a(2, tj.a(-106, new String[]{var3}, na.field_Sb), (byte) -26);
            this.field_l.a(3, tj.a(-91, new String[]{var3}, mk.field_I), (byte) -26);
            return;
          }
          if (var8.field_Ob) {
            this.field_l.a(2, tj.a(118, new String[]{var3}, ec.field_a), (byte) -26);
          } else {
            if (!var8.field_Nb &&
              var8.field_kc &&
              (!var8.field_Lb ||
              var8.field_Ob)) {
              this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
            }
          }
          if (!var8.field_Nb) {
            return;
          }
        } else {
          if (wi.field_f != null) {
            return;
          }
          var7 = im.a(this.field_e, (byte) -103);
          var6 = var7;
          if (var7 == null) {
            return;
          }
          var3 = var7.field_ic;
          if (var7.field_Hb) {
            this.field_l.a(2, tj.a(-106, new String[]{var3}, na.field_Sb), (byte) -26);
            this.field_l.a(3, tj.a(-91, new String[]{var3}, mk.field_I), (byte) -26);
            return;
          }
          if (var7.field_Ob) {
            this.field_l.a(2, tj.a(118, new String[]{var3}, ec.field_a), (byte) -26);
          } else {
            if (!var7.field_Nb &&
              var7.field_kc) {
              if (!var7.field_Lb) {
                this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
              } else {
                if (var7.field_Ob) {
                  this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
                }
              }
            }
          }
          if (!var7.field_Nb) {
            return;
          }
        }
        this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
    }

    final void a(int param0, boolean param1) {
        if (param0 != -22717) {
          field_b = -81;
          this.field_l.a(param1, true);
          return;
        }
        this.field_l.a(param1, true);
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        wa var5 = null;
        int var6 = 0;
        qb[] var7 = null;
        String var8 = null;
        try {
          if (null != this.field_h && (~qf.field_a != ~this.field_d ||
            param0 == 2) && jb.field_t == 2) {
            var8 = this.a((byte) 32);
            var4 = var8;
            var5 = im.a(param2 ^ 13, this.field_h);
            var6 = sa.a(this.field_h, param2 ^ 333) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_l.a(4, tj.a(param2 - 80, new String[]{var8}, ArcanistsMulti.field_F), (byte) -26);
              this.field_l.a(6, tj.a(-108, new String[]{var8}, tn.field_Lb), (byte) -26);
              if (param1 != null &&
                param0 != 2 &&
                !wh.field_g) {
                this.field_m = param1;
                this.field_l.a(19, tj.a(-25, new String[]{var8}, gh.field_O), (byte) -26);
              }
            }
            if (var5 != null) {
              if (!tc.a(this.field_h, -31046) &&
                !wh.field_g) {
                if (!ld.field_p) {
                  this.field_l.a(8, tj.a(-94, new String[]{var8}, mb.field_S), (byte) -26);
                }
                this.field_l.a(18, tj.a(127, new String[]{var8}, bh.field_b), (byte) -26);
                if (param1 != null) {
                  this.field_m = param1;
                  this.field_l.a(19, tj.a(-98, new String[]{var8}, gh.field_O), (byte) -26);
                }
              }
              this.field_l.a(5, tj.a(param2 - 48, new String[]{var8}, ke.field_F), (byte) -26);
            }
            if (var6 != 0) {
              this.field_l.a(7, tj.a(126, new String[]{var8}, ja.field_t), (byte) -26);
            }
          }
          if (param2 == 13) {
            return;
          }
          var7 = (qb[]) null;
          ne.a(-44, -48, (qb[]) null, 59, 24, -88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ne.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 19633) {
          return false;
        }
        if (param2 == 0) {
          qo.a(param0, (byte) -102, this.field_d);
          return true;
        }
        if (param2 == 1) {
          na.a(this.field_d, 126, param0);
          return true;
        }
        if (param2 == 2) {
          uj.a(this.field_e, (byte) -123, param0);
        } else {
          if (param2 == 3) {
            qc.a(false, this.field_e, param0);
            return true;
          }
          if (10 == param2) {
            qe.a(this.field_e, (byte) -35, param0);
            return true;
          }
          if (param2 == 15) {
            ce.a(this.field_e, param0, -123);
            return true;
          }
          if (param2 == 16) {
            ce.a(0, param0, -79);
            return true;
          }
          return false;
        }
        return true;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        boolean stackIn_32_2 = false;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param2) {
          if (8 == param0) {
            nb.a(this.field_h, this.field_d, -26510);
            return true;
          }
          if (18 == param0) {
            h.a(this.field_d, -30687, this.field_h);
            return true;
          }
          if (param0 == 11) {
            stackIn_31_0 = param1;
            stackIn_31_1 = 0;
            stackIn_32_2 = (param2) ? false : true;
            ea.a(stackIn_31_0, stackIn_31_1, stackIn_32_2, this.field_i);
            return true;
          }
        } else {
          this.field_c = (kc) null;
          if (8 == param0) {
            nb.a(this.field_h, this.field_d, -26510);
            return true;
          }
          if (18 == param0) {
            h.a(this.field_d, -30687, this.field_h);
            return true;
          }
          if (param0 == 11) {
            stackIn_8_0 = param1;
            stackIn_8_1 = 0;
            stackIn_9_2 = (param2) ? false : true;
            ea.a(stackIn_8_0, stackIn_8_1, stackIn_9_2, this.field_i);
            return true;
          }
        }
        if (param0 == 12) {
          ea.a(param1, 1, true, this.field_i);
          return true;
        }
        if (param0 == 13) {
          ea.a(param1, 2, true, this.field_i);
          return true;
        }
        if (param0 == 14) {
          j.a(param2);
          return true;
        }
        if (param0 == 20) {
          gj.a((byte) -61);
          return true;
        }
        if (19 != param0) {
          return false;
        }
        va.a(this.field_d, 1, this.field_m, this.field_h, this.field_i);
        return true;
    }

    final boolean b(byte param0) {
        if (param0 != 49) {
          return false;
        }
        if (this.field_l == null) {
          return false;
        }
        if (this.field_l.e(param0 ^ -22615)) {
          return true;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 < -1) {
          field_f = null;
          field_a = null;
          field_j = null;
          return;
        }
        field_j = (String) null;
        field_f = null;
        field_a = null;
        field_j = null;
    }

    ne(kc param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_l = new pe(ml.field_H);
          param0.field_ab = true;
          this.field_i = param5;
          this.field_m = param6;
          this.field_h = param2;
          this.field_d = param1;
          this.field_k = param3;
          this.field_e = param4;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2 != null &&
            param1 > 0) {
            var6_int = param2[0].field_n;
            var7 = param2[2].field_n;
            var8 = param2[1].field_n;
            param2[0].e(param4, param3, param5);
            param2[2].e(param4 + param1 - var7, param3, param5);
            de.a(sl.field_H);
            de.a(param4 + var6_int, param3, -var7 + (param1 + param4), param2[1].field_w + param3);
            var9 = var6_int + param4;
            var10 = -var7 + param4 + param1;
            if (param0 > -30) {
              return;
            }
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param2[1].e(param4, param3, param5);
            }
            de.b(sl.field_H);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ne.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_j = "These green slopes are where all young Arcanists train to become great mages. All that can be found here is a clean battleground in which to test your skills.";
        field_a = "Clan";
        field_f = "Day";
    }
}
