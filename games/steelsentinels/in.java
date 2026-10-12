/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_j;
    static String field_f;
    static int field_k;
    static wk field_e;
    static gh field_d;
    static int[] field_g;
    static String field_c;
    static String[][] field_b;
    static int field_h;
    static int field_a;
    static int field_i;

    final static void a(int param0) {
        cc stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        int stackIn_106_0 = 0;
        cc stackIn_112_0 = null;
        boolean stackIn_113_1 = false;
        RuntimeException decompiledCaughtException = null;
        kj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        cc var3_ref_cc = null;
        hk var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hk var6 = null;
        cc var7 = null;
        cc var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hk var13 = null;
        hk var15 = null;
        cc var16 = null;
        Object var17 = null;
        Object var18 = null;
        hk var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        hk var20_ref = null;
        hk var21 = null;
        hk var22 = null;
        String var23 = null;
        String var24 = null;
        cc var25 = null;
        cc var26 = null;
        cc var27 = null;
        cc var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        cc var32 = null;
        hk var33 = null;
        cc var34 = null;
        cc var3_ref_ccLifetime1;
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
        var17 = null;
        var20 = null;
        var18 = null;
        var19 = null;
        var11 = SteelSentinels.field_G;
        try {
          var1 = rf.field_d;
          if (param0 != 11247) {
            field_k = 50;
          }
          var2 = ((gi) ((Object) var1)).f((byte) -109);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((gi) ((Object) var1)).g((byte) -112);
              var30 = ((gi) ((Object) var1)).h(param0 - 11246);
              var29 = ((gi) ((Object) var1)).h(1);
              var31 = ((gi) ((Object) var1)).h(param0 - 11246);
              var32 = ri.a(var3_long, false);
              var8 = var32;
              stackIn_106_0 = (var29.equals("")) ? 0 : 1;
              var9 = stackIn_106_0;
              if (var32 != null) {
                if (var9 != 0) {
                  var32.a(15, var30, var31);
                }
              } else {
                var8 = new cc(var30, var31, var3_long);
                t.field_c.a(var8, param0 - 11246, var3_long);
              }
              var8.field_fc = mm.a(param0 - 11210) - (long)((gi) ((Object) var1)).i(param0 - 11247);
              var8.field_ac = ((gi) ((Object) var1)).c((byte) -60);
              var10 = ((gi) ((Object) var1)).e(61);
              var8.field_dc = var10 >> 1;
              stackIn_112_0 = var8;
              stackIn_113_1 = (0 != (var10 & 1));
              stackIn_112_0.field_nc = stackIn_113_1;
              var8.field_jc = ((gi) ((Object) var1)).f((byte) -78);
              var8.field_qc = ((gi) ((Object) var1)).f((byte) -107);
              la.a(124, var8);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((gi) ((Object) var1)).g((byte) -71);
              var5 = ((gi) ((Object) var1)).f((byte) -78);
              var28 = ri.a(var3_longLifetime1, false);
              if (var28 != null) {
                if (var28.field_kc) {
                  var28.field_kc = false;
                  ja.field_a = ja.field_a - 1;
                }
                if (var5 != 0) {
                  var28.field_Ub = ta.field_l;
                  var28.field_Wb = var5;
                } else {
                  var28.b(4);
                }
                var28.e(480);
              }
              return;
            }
            if (var2 == 7) {
              var34 = (cc) (q.field_m.e(13058));
              while (var34 != null) {
                var34.b(4);
                var34.e(480);
                var34 = (cc) (q.field_m.a((byte) -16));
              }
              ja.field_a = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((gi) ((Object) var1)).c((byte) -60);
              var4 = (hk) (fm.field_a.a((long)var3, (byte) -57));
              if (var4 == null) {
                var4 = new hk(be.field_a);
                fm.field_a.a(var4, param0 - 11246, (long)var3);
              }
              wd.a(var1, true, var4, (byte) -113);
              nm.a(true, var4);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((gi) ((Object) var1)).c((byte) -60);
              var4_int = ((gi) ((Object) var1)).f((byte) -61);
              var13 = (hk) (fm.field_a.a((long)var3Lifetime4, (byte) -39));
              var21 = var13;
              if (var13 == null) {
                return;
              }
              if (0 == var4_int) {
                var21.b(param0 - 11243);
              } else {
                var13.field_mc = ta.field_l;
                var13.field_Ac = var4_int;
              }
              var21.e(param0 ^ 10767);
              return;
            }
            if (var2 == 10) {
              var33 = (hk) (ci.field_e.e(param0 ^ 6381));
              while (var33 != null) {
                var33.b(4);
                var33.e(480);
                var33 = (hk) (ci.field_e.a((byte) -104));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((gi) ((Object) var1)).c((byte) -60);
                var4_intLifetime1 = ((gi) ((Object) var1)).f((byte) -68);
                var18_ref = (hk) (fm.field_a.a((long)var3Lifetime5, (byte) -50));
                if (var18_ref == null) {
                  return;
                }
                var15 = var18_ref;
                var6 = var15;
                var18_ref.field_bc = false;
                if (0 != var4_intLifetime1) {
                  var18_ref.field_Ac = var4_intLifetime1;
                  var18_ref.field_mc = ta.field_l;
                }
                var15.field_vc = false;
                nm.a(true, var18_ref);
                return;
              }
              if (14 != var2 &&
                var2 != 16) {
                if (15 != var2 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((gi) ((Object) var1)).g((byte) -83);
                    var23 = ((gi) ((Object) var1)).h(1);
                    var24 = ((gi) ((Object) var1)).h(1);
                    var7 = kh.a(false, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new cc(var23, var24, var3_longLifetime2);
                      me.field_b.a(var7, 1, var3_longLifetime2);
                      nf.field_b.field_wc = nf.field_b.field_wc + 1;
                    }
                    var7.field_ac = ((gi) ((Object) var1)).c((byte) -60);
                    var8_int = ((gi) ((Object) var1)).e(param0 ^ 11163);
                    stackIn_48_0 = var7;
                    stackIn_49_1 = (0 != (1 & var8_int));
                    stackIn_48_0.field_nc = stackIn_49_1;
                    var7.field_dc = var8_int >> 1;
                    var7.field_jc = ((gi) ((Object) var1)).f((byte) -98);
                    var7.field_qc = ((gi) ((Object) var1)).f((byte) -98);
                    o.field_d.a(3, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((gi) ((Object) var1)).g((byte) -128);
                    var5Lifetime1 = ((gi) ((Object) var1)).f((byte) -55);
                    var16 = kh.a(false, var3_longLifetime2);
                    var25 = var16;
                    if (var16 != null) {
                      if (var5Lifetime1 == 0) {
                        var25.b(4);
                      } else {
                        var16.field_Wb = var5Lifetime1;
                        var16.field_Ub = ta.field_l;
                      }
                      var25.e(param0 ^ 10767);
                      nf.field_b.field_wc = nf.field_b.field_wc - 1;
                    }
                    return;
                  }
                  if (20 == var2) {
                    wd.a(var1, false, nf.field_b, (byte) 98);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((gi) ((Object) var1)).c((byte) -60);
                    if (var3Lifetime5 == 0) {
                      ka.field_R = 0L;
                      return;
                    }
                    ka.field_R = (long)var3Lifetime5 + mm.a(-124);
                    return;
                  }
                  if (22 == var2) {
                    ba.field_b = ((gi) ((Object) var1)).c((byte) -60);
                    ud.field_D = ((gi) ((Object) var1)).e(param0 - 11173);
                    return;
                  }
                  if (var2 == 23) {
                    nb.field_G = ((gi) ((Object) var1)).g((byte) -124);
                    return;
                  }
                  sj.a("L1: " + ci.a((byte) 94), -106, (Throwable) null);
                  pm.m(-82);
                  return;
                }
                var3_longLifetime2 = ((gi) ((Object) var1)).g((byte) -119);
                var5Lifetime1Lifetime1 = ((gi) ((Object) var1)).f((byte) -66);
                var26 = ri.a(var3_longLifetime2, false);
                if (var26 == null) {
                  return;
                }
                if (15 == var2) {
                  var26.field_Zb = false;
                } else {
                  if (var26.field_kc) {
                    var26.field_kc = false;
                    ja.field_a = ja.field_a - 1;
                  }
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var26.field_Wb = var5Lifetime1Lifetime1;
                  var26.field_Ub = ta.field_l;
                }
                la.a(param0 ^ 11154, var26);
                return;
              }
              var3_longLifetime2Lifetime1 = ((gi) ((Object) var1)).g((byte) -91);
              var27 = ri.a(var3_longLifetime2Lifetime1, false);
              if (var27 != null) {
                if (var2 != 14) {
                  if (!var27.field_kc) {
                    var27.field_kc = true;
                    ja.field_a = ja.field_a + 1;
                  }
                } else {
                  var27.field_Zb = true;
                }
                la.a(124, var27);
              }
              return;
            }
            var3Lifetime6 = ((gi) ((Object) var1)).c((byte) -60);
            var20_ref = (hk) (fm.field_a.a((long)var3Lifetime6, (byte) -101));
            var22 = var20_ref;
            if (var22 == null) {
              return;
            }
            if (var2 == 11) {
              var22.field_vc = true;
            } else {
              var22.field_bc = true;
            }
            nm.a(true, var22);
            return;
          }
          var3_ref_cc = (cc) (o.field_d.e(param0 ^ 6381));
          while (var3_ref_cc != null) {
            var3_ref_cc.b(param0 ^ 11243);
            var3_ref_cc.e(480);
            var3_ref_cc = (cc) (o.field_d.a((byte) -25));
          }
          var3_ref_ccLifetime1 = (cc) (t.field_c.a(120));
          while (var3_ref_ccLifetime1 != null) {
            if (var3_ref_ccLifetime1.field_Zb ||
              var3_ref_ccLifetime1.field_kc) {
              if (var3_ref_ccLifetime1.field_kc) {
                var3_ref_ccLifetime1.field_kc = false;
                ja.field_a = ja.field_a - 1;
              }
              var3_ref_ccLifetime1.field_Zb = false;
              la.a(127, var3_ref_ccLifetime1);
            }
            var3_ref_ccLifetime1 = (cc) (t.field_c.a((byte) -76));
          }
          if (var2 == 1 &&
            null != nf.field_b) {
            im.field_g = nf.field_b.field_Xb;
          }
          if (4 == var2) {
            var3Lifetime1 = ((gi) ((Object) var1)).c((byte) -60);
            nf.field_b = new hk(be.field_a);
            nf.field_b.a((byte) 73, (long)var3Lifetime1);
            wd.a(var1, false, nf.field_b, (byte) 114);
            ka.field_R = 0L;
          } else {
            nf.field_b = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            ni.field_a = null;
          } else {
            if (null == ni.field_a) {
              ni.field_a = new hk(be.field_a);
            }
          }
          if (3 != var2) {
            ad.field_f = false;
            return;
          }
          ad.field_f = true;
          for (var3Lifetime2 = 0; var3Lifetime2 < rb.field_i.length; var3Lifetime2++) {
            rb.field_i[var3Lifetime2] = ((gi) ((Object) var1)).d((byte) -2);
          }
          fi.field_l = ((gi) ((Object) var1)).f((byte) -93);
          nb.field_L = ((gi) ((Object) var1)).f((byte) -59);
          for (var3Lifetime3 = 0; var3Lifetime3 < ti.field_s.length; var3Lifetime3++) {
            ti.field_s[var3Lifetime3] = ((gi) ((Object) var1)).d((byte) -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "in.D(" + param0 + ')');
        }
    }

    final static ld a(cm param0, int param1, int param2, cm param3, int param4) {
        RuntimeException var5 = null;
        ld stackIn_5_0 = null;
        ld stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wa.a((byte) 30, param2, param4, param3)) {
            return null;
          }
          if (param1 >= 97) {
            stackIn_7_0 = nc.a(param0.a(param4, (byte) 38, param2), 7045);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ld) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("in.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var2 = SteelSentinels.field_G;
        if ((fk.field_i.field_X.field_V & 1 << ed.field_j) != 0) {
          ti.field_A[10] = nb.field_m;
        } else {
          if (fk.field_i.field_X.field_V == 0) {
            ti.field_A[10] = ai.field_s;
          } else {
            ti.field_A[10] = wn.field_e;
          }
        }
        if (param0 != 2) {
          in.a((byte) 41, 86);
        }
    }

    final static void a(byte param0, int param1) {
        sg.field_c = (param1 & 63) >> 4;
        pm.field_Z = 3 & param1 >> 2;
        if (sg.field_c > 2) {
          sg.field_c = 2;
        }
        fi.field_y = 3 & param1;
        if (!(pm.field_Z <= 2)) {
          pm.field_Z = 2;
        }
        if (!(fi.field_y <= 2)) {
          fi.field_y = 2;
        }
        if (param0 <= 16) {
          field_g = (int[]) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        int var1 = -59 % ((28 - param0) / 63);
        field_d = null;
        field_b = (String[][]) null;
        field_j = null;
        field_g = null;
    }

    static {
        field_j = new int[]{107, 83, 24, 24, 35, -1, -1, -1, -1, -1, -1, -1};
        field_f = "Visit the Account Management section on the main site to view.";
        field_g = new int[]{50, 50};
        field_c = "This game option is only available to members.";
        field_h = 0;
        field_i = field_h;
    }
}
