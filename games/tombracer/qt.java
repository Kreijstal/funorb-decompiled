/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static il field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -25809) {
          mr var2 = (mr) null;
          qt.a((String) null, true, 14, (String) null, (String) null, (mr) null, true);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        pd.field_p[ola.field_Eb] = param3;
        boa.field_n[ola.field_Eb] = ola.field_Eb;
        jk.field_h[ola.field_Eb] = param4;
        if (ap.field_d < param4) {
          ma.field_g = param4;
        }
        if (!(ota.field_c <= param4)) {
          kc.field_a = param4;
        }
        cu.field_o[ola.field_Eb] = param0;
        bq.field_h[ola.field_Eb] = param1;
        im.field_o[ola.field_Eb] = param2;
        int var6 = param2 + (param1 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param0 / var6;
        ic.field_c[ola.field_Eb] = var7;
        ola.field_Eb = ola.field_Eb + 1;
        if (ma.field_g < var7) {
          ma.field_g = var7;
        }
        if (var7 < kc.field_a) {
          kc.field_a = var7;
        }
        if (param5 > -9) {
          qt.a(-106);
        }
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        pha stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        pha stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        RuntimeException decompiledCaughtException = null;
        kh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        pha var3_ref_pha = null;
        ht var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ht var6 = null;
        pha var7 = null;
        int var8 = 0;
        pha var8_ref_pha = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ht var14 = null;
        pha var15 = null;
        Object var16 = null;
        Object var17 = null;
        ht var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        ht var19_ref = null;
        String var20 = null;
        pha var21 = null;
        String var22 = null;
        String var23 = null;
        Object var24 = null;
        ht var25 = null;
        String var26 = null;
        String var27 = null;
        pha var28 = null;
        pha var29 = null;
        pha var30 = null;
        pha var31 = null;
        pha var32 = null;
        ht var33 = null;
        ht var34 = null;
        pha var3_ref_phaLifetime1;
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
        var16 = null;
        var24 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 > -10) {
            return;
          }
          var1 = vc.field_q;
          var2 = ((uia) ((Object) var1)).h(255);
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            3 != var2 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((uia) ((Object) var1)).b(290646880);
              var23 = ((uia) ((Object) var1)).e((byte) -76);
              var20 = ((uia) ((Object) var1)).e((byte) -76);
              var22 = ((uia) ((Object) var1)).e((byte) -76);
              var21 = nl.a(true, var3_long);
              var8_ref_pha = var21;
              stackIn_12_0 = (var20.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var21 == null) {
                var8_ref_pha = new pha(var23, var22, var3_long);
                fua.field_a.a(-1, var8_ref_pha, var3_long);
              } else {
                if (var9 != 0) {
                  var21.a(var22, 75, var23);
                }
              }
              var8_ref_pha.field_Mb = bva.b((byte) -107) - (long)((uia) ((Object) var1)).e(-87);
              var8_ref_pha.field_Jb = ((uia) ((Object) var1)).d(121);
              var10 = ((uia) ((Object) var1)).b((byte) 100);
              stackIn_19_0 = var8_ref_pha;
              stackIn_20_1 = ((1 & var10) != 0);
              stackIn_19_0.field_tb = stackIn_20_1;
              var8_ref_pha.field_zb = var10 >> 1;
              var8_ref_pha.field_Ab = ((uia) ((Object) var1)).h(255);
              var8_ref_pha.field_Eb = ((uia) ((Object) var1)).h(255);
              ql.a(110, var8_ref_pha);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((uia) ((Object) var1)).b(290646880);
              var5 = ((uia) ((Object) var1)).h(255);
              var31 = nl.a(true, var3_longLifetime1);
              if (var31 == null) {
                return;
              }
              if (var31.field_Fb) {
                so.field_K = so.field_K - 1;
                var31.field_Fb = false;
              }
              if (0 == var5) {
                var31.p(63);
              } else {
                var31.field_xb = qsa.field_a;
                var31.field_Lb = var5;
              }
              var31.c(-7975);
              return;
            }
            if (var2 == 7) {
              var32 = (pha) (uma.field_b.f(-80));
              while (var32 != null) {
                var32.p(70);
                var32.c(-7975);
                var32 = (pha) (uma.field_b.e(118));
              }
              so.field_K = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((uia) ((Object) var1)).d(125);
              var4 = (ht) (jb.field_K.a(-126, (long)var3));
              if (var4 == null) {
                var4 = new ht(fk.field_b);
                jb.field_K.a(-1, var4, (long)var3);
              }
              ed.a(32, var4, true, var1);
              cua.a(var4, (byte) 80);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((uia) ((Object) var1)).d(121);
              var4_int = ((uia) ((Object) var1)).h(255);
              var33 = (ht) (jb.field_K.a(-107, (long)var3Lifetime4));
              if (var33 != null) {
                if (0 != var4_int) {
                  var33.field_zb = qsa.field_a;
                  var33.field_Ib = var4_int;
                } else {
                  var33.p(52);
                }
                var33.c(-7975);
              }
              return;
            }
            if (var2 == 10) {
              var34 = (ht) (asa.field_j.f(-80));
              while (var34 != null) {
                var34.p(122);
                var34.c(-7975);
                var34 = (ht) (asa.field_j.e(127));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((uia) ((Object) var1)).d(127);
                var4_intLifetime1 = ((uia) ((Object) var1)).h(255);
                var17_ref = (ht) (jb.field_K.a(-112, (long)var3Lifetime5));
                if (var17_ref != null) {
                  var14 = var17_ref;
                  var6 = var14;
                  var17_ref.field_Sb = false;
                  if (0 != var4_intLifetime1) {
                    var17_ref.field_zb = qsa.field_a;
                    var17_ref.field_Ib = var4_intLifetime1;
                  }
                  var14.field_gc = false;
                  cua.a(var17_ref, (byte) 48);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((uia) ((Object) var1)).b(290646880);
                    var26 = ((uia) ((Object) var1)).e((byte) -76);
                    var27 = ((uia) ((Object) var1)).e((byte) -76);
                    var7 = vba.a((byte) -40, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new pha(var26, var27, var3_longLifetime2);
                      tc.field_d.a(-1, var7, var3_longLifetime2);
                      uu.field_a.field_Mb = uu.field_a.field_Mb + 1;
                    }
                    var7.field_Jb = ((uia) ((Object) var1)).d(122);
                    var8 = ((uia) ((Object) var1)).b((byte) -123);
                    stackIn_61_0 = var7;
                    stackIn_62_1 = ((1 & var8) != 0);
                    stackIn_61_0.field_tb = stackIn_62_1;
                    var7.field_zb = var8 >> 1;
                    var7.field_Ab = ((uia) ((Object) var1)).h(255);
                    var7.field_Eb = ((uia) ((Object) var1)).h(255);
                    qha.field_g.b((byte) -54, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((uia) ((Object) var1)).b(290646880);
                    var5Lifetime1 = ((uia) ((Object) var1)).h(255);
                    var15 = vba.a((byte) -40, var3_longLifetime2);
                    var28 = var15;
                    if (var15 == null) {
                      return;
                    }
                    if (var5Lifetime1 == 0) {
                      var28.p(85);
                    } else {
                      var15.field_xb = qsa.field_a;
                      var15.field_Lb = var5Lifetime1;
                    }
                    var28.c(-7975);
                    uu.field_a.field_Mb = uu.field_a.field_Mb - 1;
                    return;
                  }
                  if (var2 == 20) {
                    ed.a(32, uu.field_a, false, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((uia) ((Object) var1)).d(124);
                    if (var3Lifetime5 == 0) {
                      uq.field_d = 0L;
                      return;
                    }
                    uq.field_d = bva.b((byte) -107) + (long)var3Lifetime5;
                    return;
                  }
                  if (var2 == 22) {
                    qb.field_f = ((uia) ((Object) var1)).d(123);
                    bha.field_z = ((uia) ((Object) var1)).b((byte) 114);
                    return;
                  }
                  if (var2 == 23) {
                    rb.field_r = ((uia) ((Object) var1)).b(290646880);
                    return;
                  }
                  ssa.a("L1: " + kk.a(32), (byte) 118, (Throwable) null);
                  dea.a(60);
                  return;
                }
                var3_longLifetime2 = ((uia) ((Object) var1)).b(290646880);
                var5Lifetime1Lifetime1 = ((uia) ((Object) var1)).h(255);
                var29 = nl.a(true, var3_longLifetime2);
                if (var29 == null) {
                  return;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var29.field_xb = qsa.field_a;
                  var29.field_Lb = var5Lifetime1Lifetime1;
                }
                if (15 == var2) {
                  var29.field_Hb = false;
                } else {
                  if (var29.field_Fb) {
                    so.field_K = so.field_K - 1;
                    var29.field_Fb = false;
                  }
                }
                ql.a(-42, var29);
                return;
              }
              var3_longLifetime2Lifetime1 = ((uia) ((Object) var1)).b(290646880);
              var30 = nl.a(true, var3_longLifetime2Lifetime1);
              if (var30 == null) {
                return;
              }
              if (var2 == 14) {
                var30.field_Hb = true;
              } else {
                if (!var30.field_Fb) {
                  so.field_K = so.field_K + 1;
                  var30.field_Fb = true;
                }
              }
              ql.a(112, var30);
              return;
            }
            var3Lifetime6 = ((uia) ((Object) var1)).d(123);
            var19_ref = (ht) (jb.field_K.a(-111, (long)var3Lifetime6));
            var25 = var19_ref;
            if (var25 == null) {
              return;
            }
            if (var2 == 11) {
              var25.field_gc = true;
            } else {
              var25.field_Sb = true;
            }
            cua.a(var25, (byte) -97);
            return;
          }
          var3_ref_pha = (pha) (qha.field_g.f(-80));
          while (var3_ref_pha != null) {
            var3_ref_pha.p(63);
            var3_ref_pha.c(-7975);
            var3_ref_pha = (pha) (qha.field_g.e(117));
          }
          var3_ref_phaLifetime1 = (pha) (fua.field_a.b(-119));
          while (var3_ref_phaLifetime1 != null) {
            if (var3_ref_phaLifetime1.field_Hb ||
              var3_ref_phaLifetime1.field_Fb) {
              var3_ref_phaLifetime1.field_Hb = false;
              if (var3_ref_phaLifetime1.field_Fb) {
                so.field_K = so.field_K - 1;
                var3_ref_phaLifetime1.field_Fb = false;
              }
              ql.a(114, var3_ref_phaLifetime1);
            }
            var3_ref_phaLifetime1 = (pha) (fua.field_a.a((byte) -112));
          }
          if (var2 == 1 &&
            uu.field_a != null) {
            wra.field_b = uu.field_a.field_tb;
          }
          if (var2 != 4) {
            uu.field_a = null;
          } else {
            var3Lifetime1 = ((uia) ((Object) var1)).d(125);
            uu.field_a = new ht(fk.field_b);
            uu.field_a.a(false, (long)var3Lifetime1);
            ed.a(32, uu.field_a, false, var1);
            uq.field_d = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            ifa.field_n = null;
          } else {
            if (ifa.field_n == null) {
              ifa.field_n = new ht(fk.field_b);
            }
          }
          if (var2 != 3) {
            qa.field_o = false;
            return;
          }
          qa.field_o = true;
          for (var3Lifetime2 = 0; vk.field_b.length > var3Lifetime2; var3Lifetime2++) {
            vk.field_b[var3Lifetime2] = ((uia) ((Object) var1)).c((byte) 48);
          }
          aja.field_H = ((uia) ((Object) var1)).h(255);
          mua.field_b = ((uia) ((Object) var1)).h(255);
          for (var3Lifetime3 = 0; var3Lifetime3 < tqa.field_e.length; var3Lifetime3++) {
            tqa.field_e[var3Lifetime3] = ((uia) ((Object) var1)).c((byte) 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "qt.D(" + param0 + ')');
        }
    }

    final static boolean a(String param0, boolean param1, int param2, String param3, String param4, mr param5, boolean param6) {
        RuntimeException var7 = null;
        rua var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fta.field_c != kl.field_a) {
            return false;
          }
          if (!param1) {
            field_a = (il) null;
          }
          var8 = new rua(ej.field_a, param5);
          ej.field_a.c(var8, 88);
          if (rg.f(7)) {
            var8.h(param1);
            return true;
          }
          kl.field_a = gsa.field_y;
          ub.field_i = param0;
          al.field_j = param6;
          wua.field_n = param2;
          osa.field_p = param4;
          ki.field_n = null;
          faa.field_g = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("qt.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    private qt() throws Throwable {
        throw new Error();
    }

    static {
    }
}
