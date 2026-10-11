/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends rqa {
    static int field_p;
    static phb field_o;

    public static void e(int param0) {
        field_o = null;
        if (param0 != 3575) {
          ie.a(-8);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (phb) null;
          }
          stackIn_3_0 = new nc(frb.a(4, 94));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ie.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ie(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        jk stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        jk stackIn_84_0 = null;
        boolean stackIn_85_1 = false;
        RuntimeException decompiledCaughtException = null;
        faa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        jk var3_ref_jk = null;
        int var4 = 0;
        mm var4_ref_mm = null;
        int var5 = 0;
        mm var6 = null;
        jk var7 = null;
        int var8 = 0;
        jk var8_ref_jk = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jk var12 = null;
        mm var13 = null;
        mm var14 = null;
        mm var15 = null;
        Object var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        jk var20 = null;
        Object var21 = null;
        jk var22 = null;
        jk var23 = null;
        jk var24 = null;
        String var25 = null;
        String var26 = null;
        Object var27 = null;
        mm var27_ref = null;
        mm var28 = null;
        jk var29 = null;
        mm var30 = null;
        jk var31 = null;
        jk var3_ref_jkLifetime1;
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
        var21 = null;
        var27 = null;
        var16 = null;
        var11 = VoidHunters.field_G;
        try {
          var1 = qga.field_b;
          if (param0 != 13) {
            return;
          }
          var2 = ((ds) ((Object) var1)).e((byte) -114);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            4 != var2) {
            if (var2 == 5) {
              var3_long = ((ds) ((Object) var1)).k(param0 + 242);
              var18 = ((ds) ((Object) var1)).a(-1);
              var17 = ((ds) ((Object) var1)).a(-1);
              var19 = ((ds) ((Object) var1)).a(-1);
              var20 = pdb.a((byte) 80, var3_long);
              var8_ref_jk = var20;
              stackIn_12_0 = (var17.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var20 != null) {
                if (var9 != 0) {
                  var20.a(var19, var18, -424);
                }
              } else {
                var8_ref_jk = new jk(var18, var19, var3_long);
                oha.field_o.a(var8_ref_jk, (byte) -86, var3_long);
              }
              var8_ref_jk.field_Kb = wt.a(false) - (long)((ds) ((Object) var1)).h(77);
              var8_ref_jk.field_Gb = ((ds) ((Object) var1)).e(1869);
              var10 = ((ds) ((Object) var1)).l(param0 ^ 11425);
              stackIn_18_0 = var8_ref_jk;
              stackIn_19_1 = (0 != (var10 & 1));
              stackIn_18_0.field_Lb = stackIn_19_1;
              var8_ref_jk.field_Bb = var10 >> 1;
              var8_ref_jk.field_vb = ((ds) ((Object) var1)).e((byte) -120);
              var8_ref_jk.field_Ab = ((ds) ((Object) var1)).e((byte) -113);
              mnb.a(var8_ref_jk, true);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((ds) ((Object) var1)).k(255);
              var5 = ((ds) ((Object) var1)).e((byte) -120);
              var29 = pdb.a((byte) 80, var3_longLifetime1);
              if (var29 == null) {
                return;
              }
              if (var29.field_Fb) {
                qea.field_p = qea.field_p - 1;
                var29.field_Fb = false;
              }
              if (var5 == 0) {
                var29.b(param0 - 3859);
              } else {
                var29.field_Db = var5;
                var29.field_yb = ktb.field_p;
              }
              var29.d((byte) -35);
              return;
            }
            if (var2 == 7) {
              var31 = (jk) (cta.field_q.d(param0 ^ 13));
              while (var31 != null) {
                var31.b(param0 - 3859);
                var31.d((byte) -35);
                var31 = (jk) (cta.field_q.a((byte) 11));
              }
              qea.field_p = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((ds) ((Object) var1)).e(1869);
              var4_ref_mm = (mm) (ks.field_r.a(-1, (long)var3));
              if (var4_ref_mm == null) {
                var4_ref_mm = new mm(ocb.field_l);
                ks.field_r.a(var4_ref_mm, (byte) -115, (long)var3);
              }
              awa.a(118, var4_ref_mm, true, var1);
              eta.a((byte) 109, var4_ref_mm);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((ds) ((Object) var1)).e(1869);
              var4 = ((ds) ((Object) var1)).e((byte) -127);
              var30 = (mm) (ks.field_r.a(-1, (long)var3Lifetime4));
              if (var30 != null) {
                if (var4 != 0) {
                  var30.field_Db = ktb.field_p;
                  var30.field_ec = var4;
                } else {
                  var30.b(param0 - 3859);
                }
                var30.d((byte) -35);
              }
              return;
            }
            if (var2 == 10) {
              var15 = (mm) (kja.field_E.d(0));
              while (var15 != null) {
                var15.b(-3846);
                var15.d((byte) -35);
                var15 = (mm) (kja.field_E.a((byte) 106));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((ds) ((Object) var1)).e(1869);
                var4Lifetime1 = ((ds) ((Object) var1)).e((byte) -97);
                var27_ref = (mm) (ks.field_r.a(-1, (long)var3Lifetime5));
                if (var27_ref != null) {
                  var13 = var27_ref;
                  var6 = var13;
                  var27_ref.field_Qb = false;
                  if (var4Lifetime1 != 0) {
                    var27_ref.field_ec = var4Lifetime1;
                    var27_ref.field_Db = ktb.field_p;
                  }
                  var13.field_ac = false;
                  eta.a((byte) 109, var27_ref);
                }
                return;
              }
              if (14 != var2 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((ds) ((Object) var1)).k(255);
                    var25 = ((ds) ((Object) var1)).a(-1);
                    var26 = ((ds) ((Object) var1)).a(param0 ^ -14);
                    var7 = pjb.a(var3_longLifetime2, true);
                    if (var7 == null) {
                      var7 = new jk(var25, var26, var3_longLifetime2);
                      icb.field_p.a(var7, (byte) -76, var3_longLifetime2);
                      lqa.field_o.field_zb = lqa.field_o.field_zb + 1;
                    }
                    var7.field_Gb = ((ds) ((Object) var1)).e(1869);
                    var8 = ((ds) ((Object) var1)).l(11436);
                    stackIn_84_0 = var7;
                    stackIn_85_1 = ((1 & var8) != 0);
                    stackIn_84_0.field_Lb = stackIn_85_1;
                    var7.field_Bb = var8 >> 1;
                    var7.field_vb = ((ds) ((Object) var1)).e((byte) -103);
                    var7.field_Ab = ((ds) ((Object) var1)).e((byte) -111);
                    mea.field_e.b(-10258, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((ds) ((Object) var1)).k(255);
                    var5Lifetime1 = ((ds) ((Object) var1)).e((byte) -120);
                    var24 = pjb.a(var3_longLifetime2, true);
                    if (var24 != null) {
                      if (var5Lifetime1 != 0) {
                        var24.field_yb = ktb.field_p;
                        var24.field_Db = var5Lifetime1;
                      } else {
                        var24.b(-3846);
                      }
                      var24.d((byte) -35);
                      lqa.field_o.field_zb = lqa.field_o.field_zb - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    awa.a(-41, lqa.field_o, false, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((ds) ((Object) var1)).e(param0 ^ 1856);
                    if (var3Lifetime5 == 0) {
                      qga.field_a = 0L;
                      return;
                    }
                    qga.field_a = wt.a(false) + (long)var3Lifetime5;
                    return;
                  }
                  if (var2 == 22) {
                    tg.field_q = ((ds) ((Object) var1)).e(param0 + 1856);
                    cla.field_b = ((ds) ((Object) var1)).l(11436);
                    return;
                  }
                  if (var2 == 23) {
                    wqa.field_a = ((ds) ((Object) var1)).k(param0 ^ 242);
                    return;
                  }
                  gna.a((Throwable) null, "L1: " + hm.e(-13514), 0);
                  ifb.l(-123);
                  return;
                }
                var3_longLifetime2 = ((ds) ((Object) var1)).k(255);
                var5Lifetime1Lifetime1 = ((ds) ((Object) var1)).e((byte) -89);
                var12 = pdb.a((byte) 80, var3_longLifetime2);
                var23 = var12;
                if (var12 == null) {
                  return;
                }
                if (15 != var2) {
                  if (var23.field_Fb) {
                    qea.field_p = qea.field_p - 1;
                    var23.field_Fb = false;
                  }
                } else {
                  var12.field_Eb = false;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var23.field_yb = ktb.field_p;
                  var23.field_Db = var5Lifetime1Lifetime1;
                }
                mnb.a(var23, true);
                return;
              }
              var3_longLifetime2Lifetime1 = ((ds) ((Object) var1)).k(255);
              var22 = pdb.a((byte) 80, var3_longLifetime2Lifetime1);
              if (var22 != null) {
                if (var2 != 14) {
                  if (!var22.field_Fb) {
                    var22.field_Fb = true;
                    qea.field_p = qea.field_p + 1;
                  }
                } else {
                  var22.field_Eb = true;
                }
                mnb.a(var22, true);
              }
              return;
            }
            var3Lifetime6 = ((ds) ((Object) var1)).e(1869);
            var14 = (mm) (ks.field_r.a(-1, (long)var3Lifetime6));
            var28 = var14;
            if (var14 != null) {
              if (var2 != 11) {
                var28.field_Qb = true;
              } else {
                var14.field_ac = true;
              }
              eta.a((byte) 102, var28);
            }
            return;
          }
          var3_ref_jk = (jk) (mea.field_e.d(0));
          while (var3_ref_jk != null) {
            var3_ref_jk.b(-3846);
            var3_ref_jk.d((byte) -35);
            var3_ref_jk = (jk) (mea.field_e.a((byte) 80));
          }
          var3_ref_jkLifetime1 = (jk) (oha.field_o.c(-31));
          while (var3_ref_jkLifetime1 != null) {
            if (var3_ref_jkLifetime1.field_Eb ||
              var3_ref_jkLifetime1.field_Fb) {
              if (var3_ref_jkLifetime1.field_Fb) {
                qea.field_p = qea.field_p - 1;
                var3_ref_jkLifetime1.field_Fb = false;
              }
              var3_ref_jkLifetime1.field_Eb = false;
              mnb.a(var3_ref_jkLifetime1, true);
            }
            var3_ref_jkLifetime1 = (jk) (oha.field_o.d(-1));
          }
          if (var2 == 1 &&
            null != lqa.field_o) {
            dsa.field_p = lqa.field_o.field_Vb;
          }
          if (var2 != 4) {
            lqa.field_o = null;
          } else {
            var3Lifetime1 = ((ds) ((Object) var1)).e(1869);
            lqa.field_o = new mm(ocb.field_l);
            lqa.field_o.a((long)var3Lifetime1, (byte) 83);
            awa.a(-123, lqa.field_o, false, var1);
            qga.field_a = 0L;
          }
          if (var2 != 2 &&
            3 != var2) {
            ohb.field_o = null;
          } else {
            if (ohb.field_o == null) {
              ohb.field_o = new mm(ocb.field_l);
            }
          }
          if (3 != var2) {
            ii.field_h = false;
            return;
          }
          ii.field_h = true;
          for (var3Lifetime2 = 0; ce.field_o.length > var3Lifetime2; var3Lifetime2++) {
            ce.field_o[var3Lifetime2] = ((ds) ((Object) var1)).d((byte) -114);
          }
          imb.field_a = ((ds) ((Object) var1)).e((byte) -113);
          qd.field_d = ((ds) ((Object) var1)).e((byte) -95);
          for (var3Lifetime3 = 0; var3Lifetime3 < nkb.field_p.length; var3Lifetime3++) {
            nkb.field_p[var3Lifetime3] = ((ds) ((Object) var1)).d((byte) -114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ie.C(" + param0 + ')');
        }
    }

    static {
        field_p = 0;
    }
}
