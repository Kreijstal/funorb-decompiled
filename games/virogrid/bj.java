/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends l {
    long field_p;
    byte[] field_l;
    static p field_o;
    int field_i;
    static byte[][] field_k;
    static ra field_h;
    static int field_j;
    static java.awt.Frame field_m;
    static String field_g;
    static boolean field_n;

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 >> 31 & param0 - 1;
        if (param2 != 1) {
          return 82;
        }
        return var3 + ((param1 >>> 31) + param1) % param0;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_i = param2;
        hn.field_q = param0;
        if (param1 != 23) {
          field_k = (byte[][]) null;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_g = null;
        field_k = (byte[][]) null;
        field_h = null;
        field_m = null;
        if (param0 >= -59) {
          bj.a(-31);
        }
    }

    bj(long param0, int param1, byte[] param2) {
        try {
          this.field_i = param1;
          this.field_l = param2;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        lk stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        int stackIn_102_0 = 0;
        lk stackIn_109_0 = null;
        boolean stackIn_110_1 = false;
        RuntimeException decompiledCaughtException = null;
        hg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        lk var3_ref_lk = null;
        int var4 = 0;
        he var4_ref_he = null;
        int var5 = 0;
        String var6 = null;
        he var6_ref = null;
        lk var7 = null;
        lk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        he var13 = null;
        lk var15 = null;
        Object var16 = null;
        Object var17 = null;
        he var17_ref = null;
        lk var18 = null;
        String var19 = null;
        String var20 = null;
        lk var21 = null;
        lk var22 = null;
        Object var23 = null;
        he var23_ref = null;
        he var24 = null;
        Object var25 = null;
        lk var26 = null;
        String var27 = null;
        String var28 = null;
        lk var29 = null;
        he var30 = null;
        he var31 = null;
        lk var3_ref_lkLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var23 = null;
        var17 = null;
        var16 = null;
        var25 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = sh.field_qb;
          var2 = ((jc) ((Object) var1)).g(11132);
          if (param0 >= -3) {
            return;
          }
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((jc) ((Object) var1)).e((byte) -60);
              var27 = ((jc) ((Object) var1)).h(-127);
              var6 = ((jc) ((Object) var1)).h(-124);
              var28 = ((jc) ((Object) var1)).h(-119);
              var29 = db.a(var3_long, false);
              var8 = var29;
              stackIn_102_0 = (var6.equals("")) ? 0 : 1;
              var9 = stackIn_102_0;
              if (var29 != null) {
                if (var9 != 0) {
                  var29.a(var28, var27, 0);
                }
              } else {
                var8 = new lk(var27, var28, var3_long);
                ti.field_i.a(var3_long, var8, 30804);
              }
              var8.field_Ib = hc.a(-9986) - (long)((jc) ((Object) var1)).d((byte) 123);
              var8.field_Vb = ((jc) ((Object) var1)).c((byte) 33);
              var10 = ((jc) ((Object) var1)).c(0);
              var8.field_Rb = var10 >> 1;
              stackIn_109_0 = var8;
              stackIn_110_1 = (0 != (1 & var10));
              stackIn_109_0.field_Jb = stackIn_110_1;
              var8.field_Ub = ((jc) ((Object) var1)).g(11132);
              var8.field_Fb = ((jc) ((Object) var1)).g(11132);
              je.a(var8, (byte) 95);
              return;
            }
            if (6 == var2) {
              var3_longLifetime1 = ((jc) ((Object) var1)).e((byte) -60);
              var5 = ((jc) ((Object) var1)).g(11132);
              var26 = db.a(var3_longLifetime1, false);
              if (var26 == null) {
                return;
              }
              if (var26.field_Sb) {
                ea.field_a = ea.field_a - 1;
                var26.field_Sb = false;
              }
              if (var5 != 0) {
                var26.field_Wb = var5;
                var26.field_Gb = fn.field_c;
              } else {
                var26.a(false);
              }
              var26.c(44);
              return;
            }
            if (var2 == 7) {
              var15 = (lk) (ci.field_o.a((byte) -77));
              while (var15 != null) {
                var15.a(false);
                var15.c(53);
                var15 = (lk) (ci.field_o.a(16213));
              }
              ea.field_a = 0;
              return;
            }
            if (8 == var2) {
              var3 = ((jc) ((Object) var1)).c((byte) 100);
              var4_ref_he = (he) (ma.field_c.a((long)var3, (byte) -103));
              if (var4_ref_he == null) {
                var4_ref_he = new he(vb.field_h);
                ma.field_c.a((long)var3, var4_ref_he, 30804);
              }
              cc.a(true, var4_ref_he, true, var1);
              pg.a(false, var4_ref_he);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((jc) ((Object) var1)).c((byte) 38);
              var4 = ((jc) ((Object) var1)).g(11132);
              var31 = (he) (ma.field_c.a((long)var3Lifetime4, (byte) 100));
              if (var31 == null) {
                return;
              }
              if (0 == var4) {
                var31.a(false);
              } else {
                var31.field_Eb = var4;
                var31.field_Mb = fn.field_c;
              }
              var31.c(25);
              return;
            }
            if (10 == var2) {
              var30 = (he) (te.field_f.a((byte) -110));
              while (var30 != null) {
                var30.a(false);
                var30.c(11);
                var30 = (he) (te.field_f.a(16213));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((jc) ((Object) var1)).c((byte) 66);
                var4Lifetime1 = ((jc) ((Object) var1)).g(11132);
                var23_ref = (he) (ma.field_c.a((long)var3Lifetime5, (byte) -5));
                if (var23_ref == null) {
                  return;
                }
                var13 = var23_ref;
                var6_ref = var13;
                var23_ref.field_sc = false;
                var13.field_dc = false;
                if (0 != var4Lifetime1) {
                  var23_ref.field_Eb = var4Lifetime1;
                  var23_ref.field_Mb = fn.field_c;
                }
                pg.a(false, var23_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((jc) ((Object) var1)).e((byte) -60);
                    var19 = ((jc) ((Object) var1)).h(-118);
                    var20 = ((jc) ((Object) var1)).h(-118);
                    var7 = ic.a(var3_longLifetime2, (byte) -127);
                    if (var7 == null) {
                      var7 = new lk(var19, var20, var3_longLifetime2);
                      ah.field_h.a(var3_longLifetime2, var7, 30804);
                      wl.field_d.field_ic = wl.field_d.field_ic + 1;
                    }
                    var7.field_Vb = ((jc) ((Object) var1)).c((byte) 75);
                    var8_int = ((jc) ((Object) var1)).c(0);
                    stackIn_52_0 = var7;
                    stackIn_53_1 = (0 != (1 & var8_int));
                    stackIn_52_0.field_Jb = stackIn_53_1;
                    var7.field_Rb = var8_int >> 1;
                    var7.field_Ub = ((jc) ((Object) var1)).g(11132);
                    var7.field_Fb = ((jc) ((Object) var1)).g(11132);
                    qm.field_Mb.a(var7, (byte) -101);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((jc) ((Object) var1)).e((byte) -60);
                    var5Lifetime1 = ((jc) ((Object) var1)).g(11132);
                    var18 = ic.a(var3_longLifetime2, (byte) -127);
                    if (var18 == null) {
                      return;
                    }
                    if (var5Lifetime1 != 0) {
                      var18.field_Gb = fn.field_c;
                      var18.field_Wb = var5Lifetime1;
                    } else {
                      var18.a(false);
                    }
                    var18.c(32);
                    wl.field_d.field_ic = wl.field_d.field_ic - 1;
                    return;
                  }
                  if (var2 == 20) {
                    cc.a(false, wl.field_d, true, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((jc) ((Object) var1)).c((byte) -90);
                    if (0 != var3Lifetime5) {
                      d.field_Eb = hc.a(-9986) + (long)var3Lifetime5;
                      return;
                    }
                    d.field_Eb = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    sb.field_i = ((jc) ((Object) var1)).c((byte) 69);
                    nh.field_c = ((jc) ((Object) var1)).c(0);
                    return;
                  }
                  if (var2 == 23) {
                    hh.field_d = ((jc) ((Object) var1)).e((byte) -60);
                    return;
                  }
                  en.a("L1: " + rg.a(true), (Throwable) null, 1);
                  tn.a(false);
                  return;
                }
                var3_longLifetime2 = ((jc) ((Object) var1)).e((byte) -60);
                var5Lifetime1Lifetime1 = ((jc) ((Object) var1)).g(11132);
                var21 = db.a(var3_longLifetime2, false);
                if (var21 != null) {
                  if (var2 == 15) {
                    var21.field_Xb = false;
                  } else {
                    if (var21.field_Sb) {
                      ea.field_a = ea.field_a - 1;
                      var21.field_Sb = false;
                    }
                  }
                  if (0 != var5Lifetime1Lifetime1) {
                    var21.field_Gb = fn.field_c;
                    var21.field_Wb = var5Lifetime1Lifetime1;
                  }
                  je.a(var21, (byte) 99);
                }
                return;
              }
              var3_longLifetime2Lifetime1 = ((jc) ((Object) var1)).e((byte) -60);
              var22 = db.a(var3_longLifetime2Lifetime1, false);
              if (var22 != null) {
                if (var2 == 14) {
                  var22.field_Xb = true;
                } else {
                  if (!var22.field_Sb) {
                    var22.field_Sb = true;
                    ea.field_a = ea.field_a + 1;
                  }
                }
                je.a(var22, (byte) 112);
              }
              return;
            }
            var3Lifetime6 = ((jc) ((Object) var1)).c((byte) 71);
            var17_ref = (he) (ma.field_c.a((long)var3Lifetime6, (byte) -46));
            var24 = var17_ref;
            if (var24 == null) {
              return;
            }
            if (11 != var2) {
              var24.field_sc = true;
            } else {
              var24.field_dc = true;
            }
            pg.a(false, var24);
            return;
          }
          var3_ref_lk = (lk) (qm.field_Mb.a((byte) -62));
          while (var3_ref_lk != null) {
            var3_ref_lk.a(false);
            var3_ref_lk.c(54);
            var3_ref_lk = (lk) (qm.field_Mb.a(16213));
          }
          var3_ref_lkLifetime1 = (lk) (ti.field_i.a(true));
          while (var3_ref_lkLifetime1 != null) {
            if (var3_ref_lkLifetime1.field_Xb ||
              var3_ref_lkLifetime1.field_Sb) {
              var3_ref_lkLifetime1.field_Xb = false;
              if (var3_ref_lkLifetime1.field_Sb) {
                ea.field_a = ea.field_a - 1;
                var3_ref_lkLifetime1.field_Sb = false;
              }
              je.a(var3_ref_lkLifetime1, (byte) 114);
            }
            var3_ref_lkLifetime1 = (lk) (ti.field_i.b(-1));
          }
          if (var2 == 1 &&
            wl.field_d != null) {
            cf.field_b = wl.field_d.field_Qb;
          }
          if (var2 != 4) {
            wl.field_d = null;
          } else {
            var3Lifetime1 = ((jc) ((Object) var1)).c((byte) -66);
            wl.field_d = new he(vb.field_h);
            wl.field_d.a(0, (long)var3Lifetime1);
            cc.a(false, wl.field_d, true, var1);
            d.field_Eb = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            la.field_h = null;
          } else {
            if (null == la.field_h) {
              la.field_h = new he(vb.field_h);
            }
          }
          if (3 != var2) {
            ld.field_c = false;
            return;
          }
          ld.field_c = true;
          for (var3Lifetime2 = 0; var3Lifetime2 < kn.field_E.length; var3Lifetime2++) {
            kn.field_E[var3Lifetime2] = ((jc) ((Object) var1)).a((byte) -88);
          }
          aa.field_e = ((jc) ((Object) var1)).g(11132);
          qc.field_c = ((jc) ((Object) var1)).g(11132);
          for (var3Lifetime3 = 0; var3Lifetime3 < pm.field_p.length; var3Lifetime3++) {
            pm.field_p[var3Lifetime3] = ((jc) ((Object) var1)).a((byte) -77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "bj.C(" + param0 + ')');
        }
    }

    static {
        field_o = new p();
        field_k = new byte[50][];
        field_h = new ra();
        field_g = "Create a free Account";
    }
}
