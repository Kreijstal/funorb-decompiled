/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_a;
    static int field_b;
    static hj field_c;

    final static void a(int param0, int param1, boolean param2, da param3) {
        if (-1 >= (param0 ^ -1)) {
            // if_icmpgt L19
        } else {
            param0 = -1 + (1 << param1);
        }
        if (!param2) {
            Object var5 = null;
            eg.a(-5, 79, 39, -52, -128, -44, 49, -52, 86, (qi) null, (qi) null, -67, (vn) null, -60, -43, 119, (vn) null, 123, 73, -126, (vn) null);
        }
        param3.a(73, param1, param0);
    }

    public static void a(int param0) {
        if (param0 != 32395) {
            eg.a(-113);
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, qi param9, qi param10, int param11, vn param12, int param13, int param14, int param15, vn param16, int param17, int param18, int param19, vn param20) {
        pa.a(param10, param9, (byte) -112, param2);
        dd.a(param3, param7, param17, param0, (byte) -96);
        pa.a(-76, param15, param13);
        ic.a(param18, param12, param16, 19362, param8, param14);
        jn.a(param1, param20, param4, 0);
        ih.a(14893, param6, param19, param5);
        if (param11 != 2) {
            field_b = 37;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        hj var2 = null;
        int var3 = 0;
        Object var4 = null;
        hj var5 = null;
        hj var6 = null;
        L0: {
          L1: {
            var3 = HoldTheLine.field_D;
            var1 = 128;
            if (0 == ej.field_b) {
              break L1;
            } else {
              if (ej.field_b == -2) {
                break L1;
              } else {
                if (0 != ej.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var1 = 256;
          break L0;
        }
        L2: {
          if (var1 > ga.field_o) {
            ga.field_o = ga.field_o + 2;
            if (var1 >= ga.field_o) {
              break L2;
            } else {
              ga.field_o = var1;
              break L2;
            }
          } else {
            if (var1 < ga.field_o) {
              ga.field_o = ga.field_o - 2;
              if (ga.field_o < var1) {
                ga.field_o = var1;
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (-2 == (ud.field_d ^ -1)) {
            L4: {
              vl.a(0);
              if (ga.field_o == 256) {
                break L4;
              } else {
                if (-129 == (ga.field_o ^ -1)) {
                  tc.f(0, 0, tc.field_j, tc.field_c);
                  break L4;
                } else {
                  ue.a(8911, ga.field_o);
                  break L4;
                }
              }
            }
            if ((ma.field_k ^ -1) != -2) {
              var6 = o.a(ma.field_k, 2);
              if (var6 == null) {
                break L3;
              } else {
                var6.d(0, 0, (kd.field_c << 1219861608) / 80);
                break L3;
              }
            } else {
              break L3;
            }
          } else {
            if (ma.field_k == 1) {
              vl.a(0);
              if (-257 != (ga.field_o ^ -1)) {
                if (-129 != (ga.field_o ^ -1)) {
                  ue.a(8911, ga.field_o);
                  var2 = o.a(ud.field_d, 2);
                  var2.d(0, 0, 256 + -((kd.field_c << 523481544) / 80));
                  break L3;
                } else {
                  tc.f(0, 0, tc.field_j, tc.field_c);
                  var2 = o.a(ud.field_d, 2);
                  var2.d(0, 0, 256 + -((kd.field_c << 523481544) / 80));
                  break L3;
                }
              } else {
                var2 = o.a(ud.field_d, 2);
                var2.d(0, 0, 256 + -((kd.field_c << 523481544) / 80));
                break L3;
              }
            } else {
              o.a(ud.field_d, 2).b(0, 0);
              if (ud.field_d != ma.field_k) {
                var5 = o.a(ma.field_k, 2);
                if (var5 == null) {
                  break L3;
                } else {
                  var5.d(0, 0, (kd.field_c << 1874450984) / 80);
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            var4 = null;
            eg.a(60, -46, true, (da) null);
            break L5;
          }
        }
    }

    final static bm[] b(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        bm[] var1 = new bm[vn.field_d];
        for (var2 = 0; var2 < vn.field_d; var2++) {
            var1[var2] = new bm(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], lk.field_e[var2], dd.field_E);
        }
        tk.a(param0);
        if (param0) {
            Object var4 = null;
            eg.a(-72, -10, 111, 19, -41, -54, -99, -123, -100, (qi) null, (qi) null, -127, (vn) null, 71, 19, 60, (vn) null, -44, 42, -10, (vn) null);
        }
        return var1;
    }

    static {
    }
}
