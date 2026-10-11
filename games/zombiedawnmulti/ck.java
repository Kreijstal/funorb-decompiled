/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -23838) {
            field_c = (String) null;
          }
          var5 = new int[rb.field_c.length + 1];
          var2 = var5;
          for (var3 = 0; rb.field_c.length > var3; var3++) {
            var5[var3] = rb.field_c[var3];
          }
          var2[var2.length - 1] = param0;
          rb.field_c = var2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        dm stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        dm stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        RuntimeException decompiledCaughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        dm var3_ref_dm = null;
        int var3 = 0;
        jh var3_ref_jh = null;
        long var3_long = 0L;
        jh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dm var7 = null;
        int var8 = 0;
        dm var8_ref_dm = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dm var14 = null;
        dm var15 = null;
        jh var16 = null;
        Object var17 = null;
        jh var17_ref = null;
        Object var18 = null;
        jh var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        dm var22 = null;
        dm var23 = null;
        jh var24 = null;
        dm var25 = null;
        dm var26 = null;
        String var27 = null;
        String var28 = null;
        dm var29 = null;
        Object var30 = null;
        jh var30_ref = null;
        jh var31 = null;
        dm var3_ref_dmLifetime1;
        dm var3_ref_dmLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var18 = null;
        var30 = null;
        var17 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = s.field_e;
          var2 = ((k) ((Object) var1)).g(31365);
          if (param0 != -2061) {
            field_c = (String) null;
          }
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            3 != var2 &&
            4 != var2) {
            if (var2 == 5) {
              var3_long = ((k) ((Object) var1)).a((byte) -30);
              var20 = ((k) ((Object) var1)).f((byte) -76);
              var19 = ((k) ((Object) var1)).f((byte) -50);
              var21 = ((k) ((Object) var1)).f((byte) -61);
              var22 = en.a((byte) 50, var3_long);
              var8_ref_dm = var22;
              stackIn_12_0 = (var19.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var22 != null) {
                if (var9 != 0) {
                  var22.a(var20, var21, 43);
                }
              } else {
                var8_ref_dm = new dm(var20, var21, var3_long);
                hq.field_c.a(param0 + 2060, var8_ref_dm, var3_long);
              }
              var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) ((Object) var1)).i(-1478490344);
              var8_ref_dm.field_Mb = ((k) ((Object) var1)).d((byte) 69);
              var10 = ((k) ((Object) var1)).a(param0 ^ -2061);
              stackIn_18_0 = var8_ref_dm;
              stackIn_19_1 = ((1 & var10) != 0);
              stackIn_18_0.field_Nb = stackIn_19_1;
              var8_ref_dm.field_Sb = var10 >> 1;
              var8_ref_dm.field_Yb = ((k) ((Object) var1)).g(31365);
              var8_ref_dm.field_Vb = ((k) ((Object) var1)).g(param0 + 33426);
              lf.a(var8_ref_dm, true);
              return;
            }
            if (6 == var2) {
              var3_longLifetime1 = ((k) ((Object) var1)).a((byte) -30);
              var5 = ((k) ((Object) var1)).g(31365);
              var23 = en.a((byte) 50, var3_longLifetime1);
              if (var23 == null) {
                return;
              }
              if (var23.field_Ob) {
                cb.field_i = cb.field_i - 1;
                var23.field_Ob = false;
              }
              if (0 != var5) {
                var23.field_bc = so.field_r;
                var23.field_Fb = var5;
              } else {
                var23.a(true);
              }
              var23.a(-4564);
              return;
            }
            if (7 == var2) {
              var3_ref_dm = (dm) (cg.field_i.c(66));
              while (var3_ref_dm != null) {
                var3_ref_dm.a(true);
                var3_ref_dm.a(-4564);
                var3_ref_dm = (dm) (cg.field_i.b(param0 + 2067));
              }
              cb.field_i = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((k) ((Object) var1)).d((byte) 69);
              var4 = (jh) (af.field_h.a((long)var3, -22877));
              if (var4 == null) {
                var4 = new jh(kj.field_h);
                af.field_h.a(-1, var4, (long)var3);
              }
              dl.a(var4, true, var1, false);
              mi.a(var4, param0 ^ 2144);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((k) ((Object) var1)).d((byte) 69);
              var4_int = ((k) ((Object) var1)).g(31365);
              var17_ref = (jh) (af.field_h.a((long)var3Lifetime4, -22877));
              var31 = var17_ref;
              if (var17_ref == null) {
                return;
              }
              if (var4_int == 0) {
                var31.a(true);
              } else {
                var17_ref.field_Jb = so.field_r;
                var17_ref.field_Vb = var4_int;
              }
              var31.a(-4564);
              return;
            }
            if (var2 == 10) {
              var3_ref_jh = (jh) (tn.field_C.c(param0 + 2175));
              while (var3_ref_jh != null) {
                var3_ref_jh.a(true);
                var3_ref_jh.a(param0 ^ 6623);
                var3_ref_jh = (jh) (tn.field_C.b(param0 + 2067));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((k) ((Object) var1)).d((byte) 69);
                var4_intLifetime1 = ((k) ((Object) var1)).g(param0 + 33426);
                var30_ref = (jh) (af.field_h.a((long)var3Lifetime5, -22877));
                if (var30_ref != null) {
                  var16 = var30_ref;
                  var30_ref.field_rc = false;
                  if (var4_intLifetime1 != 0) {
                    var30_ref.field_Jb = so.field_r;
                    var30_ref.field_Vb = var4_intLifetime1;
                  }
                  var16.field_lc = false;
                  mi.a(var30_ref, -57);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((k) ((Object) var1)).a((byte) -30);
                    var27 = ((k) ((Object) var1)).f((byte) -27);
                    var28 = ((k) ((Object) var1)).f((byte) -125);
                    var7 = vm.a(var3_longLifetime2, (byte) -99);
                    if (var7 == null) {
                      var7 = new dm(var27, var28, var3_longLifetime2);
                      kp.field_o.a(-1, var7, var3_longLifetime2);
                      mh.field_c.field_cc = mh.field_c.field_cc + 1;
                    }
                    var7.field_Mb = ((k) ((Object) var1)).d((byte) 69);
                    var8 = ((k) ((Object) var1)).a(0);
                    var7.field_Sb = var8 >> 1;
                    stackIn_83_0 = var7;
                    stackIn_84_1 = ((1 & var8) != 0);
                    stackIn_83_0.field_Nb = stackIn_84_1;
                    var7.field_Yb = ((k) ((Object) var1)).g(31365);
                    var7.field_Vb = ((k) ((Object) var1)).g(31365);
                    nh.field_g.a(var7, false);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((k) ((Object) var1)).a((byte) -30);
                    var5Lifetime1 = ((k) ((Object) var1)).g(31365);
                    var15 = vm.a(var3_longLifetime2, (byte) -54);
                    var26 = var15;
                    if (var15 != null) {
                      if (var5Lifetime1 == 0) {
                        var26.a(true);
                      } else {
                        var15.field_Fb = var5Lifetime1;
                        var15.field_bc = so.field_r;
                      }
                      var26.a(param0 ^ 6623);
                      mh.field_c.field_cc = mh.field_c.field_cc - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    dl.a(mh.field_c, false, var1, false);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((k) ((Object) var1)).d((byte) 69);
                    if (var3Lifetime5 != 0) {
                      qi.field_c = bl.a((byte) 97) + (long)var3Lifetime5;
                      return;
                    }
                    qi.field_c = 0L;
                    return;
                  }
                  if (22 == var2) {
                    bc.field_e = ((k) ((Object) var1)).d((byte) 69);
                    dm.field_Zb = ((k) ((Object) var1)).a(param0 + 2061);
                    return;
                  }
                  if (var2 == 23) {
                    ie.field_sb = ((k) ((Object) var1)).a((byte) -30);
                    return;
                  }
                  bd.a("L1: " + ci.a(0), (Throwable) null, false);
                  ak.a((byte) -125);
                  return;
                }
                var3_longLifetime2 = ((k) ((Object) var1)).a((byte) -30);
                var5Lifetime1Lifetime1 = ((k) ((Object) var1)).g(param0 + 33426);
                var14 = en.a((byte) 50, var3_longLifetime2);
                var25 = var14;
                if (var14 == null) {
                  return;
                }
                if (var2 != 15) {
                  if (var25.field_Ob) {
                    var25.field_Ob = false;
                    cb.field_i = cb.field_i - 1;
                  }
                } else {
                  var14.field_Pb = false;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var25.field_bc = so.field_r;
                  var25.field_Fb = var5Lifetime1Lifetime1;
                }
                lf.a(var25, true);
                return;
              }
              var3_longLifetime2Lifetime1 = ((k) ((Object) var1)).a((byte) -30);
              var29 = en.a((byte) 50, var3_longLifetime2Lifetime1);
              if (var29 == null) {
                return;
              }
              if (14 == var2) {
                var29.field_Pb = true;
              } else {
                if (!var29.field_Ob) {
                  cb.field_i = cb.field_i + 1;
                  var29.field_Ob = true;
                }
              }
              lf.a(var29, true);
              return;
            }
            var3Lifetime6 = ((k) ((Object) var1)).d((byte) 69);
            var18_ref = (jh) (af.field_h.a((long)var3Lifetime6, -22877));
            var24 = var18_ref;
            if (var24 == null) {
              return;
            }
            if (var2 == 11) {
              var24.field_lc = true;
            } else {
              var24.field_rc = true;
            }
            mi.a(var24, -126);
            return;
          }
          var3_ref_dmLifetime1 = (dm) (nh.field_g.c(113));
          while (var3_ref_dmLifetime1 != null) {
            var3_ref_dmLifetime1.a(true);
            var3_ref_dmLifetime1.a(-4564);
            var3_ref_dmLifetime1 = (dm) (nh.field_g.b(6));
          }
          var3_ref_dmLifetime2 = (dm) (hq.field_c.a((byte) 7));
          while (var3_ref_dmLifetime2 != null) {
            if (var3_ref_dmLifetime2.field_Pb ||
              var3_ref_dmLifetime2.field_Ob) {
              if (var3_ref_dmLifetime2.field_Ob) {
                cb.field_i = cb.field_i - 1;
                var3_ref_dmLifetime2.field_Ob = false;
              }
              var3_ref_dmLifetime2.field_Pb = false;
              lf.a(var3_ref_dmLifetime2, true);
            }
            var3_ref_dmLifetime2 = (dm) (hq.field_c.c((byte) 123));
          }
          if (var2 == 1 &&
            null != mh.field_c) {
            sb.field_k = mh.field_c.field_Nb;
          }
          if (var2 == 4) {
            var3Lifetime1 = ((k) ((Object) var1)).d((byte) 69);
            mh.field_c = new jh(kj.field_h);
            mh.field_c.a((byte) -85, (long)var3Lifetime1);
            dl.a(mh.field_c, false, var1, false);
            qi.field_c = 0L;
          } else {
            mh.field_c = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            ej.field_n = null;
          } else {
            if (null == ej.field_n) {
              ej.field_n = new jh(kj.field_h);
            }
          }
          if (var2 != 3) {
            la.field_k = false;
            return;
          }
          la.field_k = true;
          for (var3Lifetime2 = 0; fg.field_k.length > var3Lifetime2; var3Lifetime2++) {
            fg.field_k[var3Lifetime2] = ((k) ((Object) var1)).d(param0 - 249697519);
          }
          pb.field_h = ((k) ((Object) var1)).g(31365);
          sc.field_f = ((k) ((Object) var1)).g(31365);
          for (var3Lifetime3 = 0; var3Lifetime3 < tg.field_a.length; var3Lifetime3++) {
            tg.field_a[var3Lifetime3] = ((k) ((Object) var1)).d(-249699580);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ck.C(" + param0 + ')');
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_b = (String) null;
          }
          if (!lo.a(8192, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!eb.a((byte) 64, param0)) {
            return true;
          }
          return (var3_int != 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        int var1 = -20 % ((param0 - 40) / 63);
        field_b = null;
    }

    static {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
