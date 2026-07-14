/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int field_a;
    static vj field_c;
    static float field_d;
    static String field_b;

    final static void a(int param0, w param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pf var8 = null;
        ck var9 = null;
        String var10 = null;
        pf var11 = null;
        ck var12 = null;
        String var13 = null;
        pf var14 = null;
        ck var15 = null;
        String var16 = null;
        pf var17 = null;
        ck var18 = null;
        ck var18_ref = null;
        String var19 = null;
        pf var20 = null;
        ck var21 = null;
        String var22 = null;
        pf var23 = null;
        ck var24 = null;
        String var25 = null;
        pf var26 = null;
        ck var27 = null;
        ck var27_ref = null;
        String var28 = null;
        pf var29 = null;
        ck var30 = null;
        String var31 = null;
        pf var32 = null;
        ck var33 = null;
        String var34 = null;
        pf var35 = null;
        L0: {
          sl.a((String) null, (int[]) null, (byte) 90, (nm) null, param1, (String) null, 0L, param2, -1);
          if (0 == param2) {
            var8 = w.field_H;
            var9 = ef.field_O[0];
            var18 = var9;
            var27 = var18;
            var18 = var9;
            var10 = nh.field_f;
            var8.field_h.a(4193, 11, var9, var10);
            var11 = w.field_H;
            var12 = ef.field_O[1];
            var18 = var12;
            var27 = var18;
            var18 = var12;
            var13 = dj.field_bb;
            var11.field_h.a(4193, 12, var12, var13);
            var14 = w.field_H;
            var15 = ef.field_O[2];
            var18 = var15;
            var27 = var18;
            var18 = var15;
            var16 = gf.field_h;
            var14.field_h.a(param0 ^ 4192, 13, var15, var16);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == param2) {
            var17 = w.field_H;
            var18_ref = ef.field_O[0];
            var27 = var18_ref;
            var27 = var18_ref;
            var19 = dj.field_db;
            var17.field_h.a(4193, 11, var18_ref, var19);
            var20 = w.field_H;
            var21 = ef.field_O[1];
            var27 = var21;
            var27 = var21;
            var22 = rf.field_h;
            var20.field_h.a(param0 ^ 4192, 12, var21, var22);
            var23 = w.field_H;
            var24 = ef.field_O[2];
            var27 = var24;
            var27 = var24;
            var25 = dk.field_d;
            var23.field_h.a(4193, 13, var24, var25);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param2 ^ -1) == -3) {
            var26 = w.field_H;
            var27_ref = ef.field_O[0];
            var28 = client.field_y;
            var26.field_h.a(4193, 11, var27_ref, var28);
            var29 = w.field_H;
            var30 = ef.field_O[1];
            var31 = om.field_e;
            var29.field_h.a(param0 ^ 4192, 12, var30, var31);
            var32 = w.field_H;
            var33 = ef.field_O[2];
            var34 = ci.field_g;
            var32.field_h.a(4193, 13, var33, var34);
            break L2;
          } else {
            break L2;
          }
        }
        var35 = w.field_H;
        var4 = param1.field_E;
        var5 = param1.field_pb;
        var6 = param1.field_mb;
        var7 = param1.field_N;
        var35.field_h.b(var5, var4, 43, var7, var6);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 <= 123) {
            field_d = 0.3723239600658417f;
        }
        field_b = null;
    }

    final static void a(boolean param0) {
        wg.field_d = 8;
        nf.field_e = 0;
        gi.field_c = 0;
        if (!param0) {
            field_a = 78;
        }
        bf.field_o = 8;
    }

    final static void b(boolean param0, int param1) {
        if (!(-1 <= (lg.field_W ^ -1))) {
            if (!(!ve.field_Qb)) {
                hk.d(0, 0, hk.field_j, ea.field_D.field_pb);
                tc.field_Ob.a(param1 ^ 1141039779, param0);
            }
        }
        if (bf.field_r >= -1) {
            // if_icmplt L63
        } else {
            if (dn.field_k) {
                hk.d(0, 0, hk.field_j, ea.field_D.field_pb);
                mn.field_e.a(1141039778, param0);
            }
        }
        if (param1 != 1) {
            field_d = 1.5652884244918823f;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var7 = ob.field_j[param0][param1][param2].field_D;
        byte[] var8 = gf.field_f[param2].field_k;
        int[] var9 = ad.field_d.field_D;
        int var10 = 0;
        int var11 = 0;
        for (var12 = 0; var12 < 18; var12++) {
            for (var13 = 0; var13 < 18; var13++) {
                var14 = 0;
                if (var8[var10] != 0) {
                    var14 = var7[var10];
                }
                var11++;
                var9[var11] = var14;
                var10 += 2;
            }
            var10 += 36;
        }
        ad.field_d.e(param3 + param5, param4 + param6, 128);
        ad.field_d.c(param3, param4);
    }

    final static ck[] a(byte param0, ck[] param1) {
        int var2 = 0;
        ck var3 = null;
        int var4 = client.field_A ? 1 : 0;
        if (param0 < 112) {
            Object var5 = null;
            cg.a(-46, (w) null, 53);
        }
        for (var2 = 0; param1.length > var2; var2++) {
            var3 = param1[var2];
            param1[var2].field_z = 0;
            var3.field_F = 0;
            param1[var2].field_K = param1[var2].field_I;
            param1[var2].field_C = param1[var2].field_H;
        }
        return param1;
    }

    final static void a(ck param0, pi param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        L0: {
          var12 = param0.field_K;
          var13 = param0.field_C;
          var14 = param3 - param2;
          var15 = param2;
          if (var15 >= hk.field_c) {
            break L0;
          } else {
            var15 = hk.field_c;
            break L0;
          }
        }
        L1: {
          var16 = param3;
          if (var16 <= hk.field_g) {
            break L1;
          } else {
            var16 = hk.field_g;
            break L1;
          }
        }
        var17 = var15;
        L2: while (true) {
          if (var17 >= var16) {
            return;
          } else {
            L3: {
              var18 = (var12 * (var17 - param2) + (var14 >> 1)) / var14;
              if (var18 < var12) {
                break L3;
              } else {
                var18 = var12 - 1;
                break L3;
              }
            }
            L4: {
              var19 = (var18 + param10) % var12;
              if (param11 < 0) {
                break L4;
              } else {
                var18 = param11;
                break L4;
              }
            }
            L5: {
              var20 = param4 * var14 + (param5 - param4) * (var17 - param2) + (param5 - param4 >> 1);
              var21 = param6 * var14 + (param7 - param6) * (var17 - param2) + (param7 - param6 >> 1);
              var22 = var21 - var20;
              var23 = vl.a(23841, var14, var20 + (var14 >> 1));
              if (var23 >= hk.field_h) {
                break L5;
              } else {
                var23 = hk.field_h;
                break L5;
              }
            }
            L6: {
              var24 = vl.a(23841, var14, var21 + (var14 >> 1));
              if (var24 <= hk.field_b) {
                break L6;
              } else {
                var24 = hk.field_b;
                break L6;
              }
            }
            if (var24 > var23) {
              L7: {
                var25 = var13 * (var23 * var14 - var20) + (var22 >> 1);
                var26 = var13 * ((var24 - 1) * var14 - var20) + (var22 >> 1);
                if (var25 > -var22) {
                  break L7;
                } else {
                  var25 = -var22 + 1;
                  break L7;
                }
              }
              L8: {
                if (var25 < var13 * var22) {
                  break L8;
                } else {
                  var25 = var13 * var22 - 1;
                  break L8;
                }
              }
              L9: {
                if (var26 < var13 * var22) {
                  break L9;
                } else {
                  var26 = var13 * var22 - 1;
                  break L9;
                }
              }
              L10: {
                var27 = 0;
                if (var26 <= var25) {
                  break L10;
                } else {
                  var27 = (var26 - var25) / (var24 - var23 - 1);
                  break L10;
                }
              }
              var28 = var23 * hk.field_j + var17;
              var29 = var23;
              L11: while (true) {
                if (var29 < var24) {
                  L12: {
                    var30 = var25 / var22;
                    var31 = var30 * var12;
                    var32 = param0.field_D[var31 + var19];
                    if (var32 == 0) {
                      break L12;
                    } else {
                      L13: {
                        if (param1 == null) {
                          break L13;
                        } else {
                          if (param1.field_k[var31 + var18] == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (!param8) {
                          break L14;
                        } else {
                          var32 = var32 >> 1 & 8355711;
                          break L14;
                        }
                      }
                      L15: {
                        if (!param9) {
                          break L15;
                        } else {
                          var32 = var32 + (hk.field_l[var28] >> 1 & 8355711);
                          break L15;
                        }
                      }
                      hk.field_l[var28] = var32;
                      break L12;
                    }
                  }
                  var28 = var28 + hk.field_j;
                  var25 = var25 + var27;
                  var29++;
                  continue L11;
                } else {
                  var17++;
                  continue L2;
                }
              }
            } else {
              var17++;
              continue L2;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 89) {
            field_d = 0.6883823275566101f;
        }
        ah.field_c.a(0, 0, (byte) -72);
    }

    final static ck a(int param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ck var3 = new ck(36, 36);
        int[] var4 = ob.field_j[param0][param1][param2].field_D;
        byte[] var5 = gf.field_f[param2].field_k;
        int[] var6 = var3.field_D;
        int var7 = 0;
        int var8 = 0;
        for (var9 = 0; var9 < 36; var9++) {
            for (var10 = 0; var10 < 36; var10++) {
                var11 = 0;
                if (var5[var7] != 0) {
                    var11 = var4[var7];
                }
                var8++;
                var6[var8] = var11;
                var7++;
            }
        }
        return var3;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param0.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (param0.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param0.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param0.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (param0.equals((Object) (Object) "C")) {
            return Character.TYPE;
        }
        int var2 = 85 / ((-49 - param1) / 43);
        return Class.forName(param0);
    }

    final static void a(int param0, byte param1, int param2) {
        uf var3 = we.field_b;
        if (param1 != -9) {
            field_c = null;
        }
        var3.f(param2, -4);
        var3.a(true, 3);
        var3.a(true, 8);
        var3.d(-1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vj();
        field_b = " Press 'ESC' to accept.";
    }
}
