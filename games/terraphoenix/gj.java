/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        int var4 = -1;
        for (var5 = param1; var5 < param0; var5++) {
            var4 = dm.field_b[(param3[var5] ^ var4) & 255] ^ var4 >>> -808185496;
        }
        if (param2 != 255) {
            field_a = -58;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(boolean param0, int param1, int param2, nb param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          ab.field_g[0] = j.field_H.nextInt();
          ab.field_g[param2] = j.field_H.nextInt();
          ab.field_g[3] = (int)kd.field_c;
          nc.field_c.field_k = 0;
          ab.field_g[2] = (int)(kd.field_c >> -1776611488);
          nc.field_c.e(ab.field_g[0], param2 ^ 8958);
          nc.field_c.e(ab.field_g[1], 8959);
          nc.field_c.e(ab.field_g[2], 8959);
          nc.field_c.e(ab.field_g[3], 8959);
          eh.a(9371, nc.field_c);
          nc.field_c.h(-1564407352, param1);
          param3.a((byte) -2, nc.field_c);
          di.field_l.field_k = 0;
          if (!param0) {
            di.field_l.i(16, 18);
            break L0;
          } else {
            di.field_l.i(18, param2 ^ 16);
            break L0;
          }
        }
        L1: {
          di.field_l.field_k = di.field_l.field_k + 2;
          var5 = di.field_l.field_k;
          di.field_l.e(nd.field_i, 8959);
          di.field_l.a(pc.field_a, 21);
          var6 = 0;
          if (jm.field_c) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (hf.field_x) {
            var6 = var6 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param4) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (og.field_e != null) {
            var6 = var6 | 16;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          di.field_l.i(var6, -112);
          var7 = kf.a(-95, dg.a(false));
          if (var7 != null) {
            break L5;
          } else {
            var7 = "";
            break L5;
          }
        }
        L6: {
          di.field_l.a(var7, 2295);
          if (og.field_e != null) {
            di.field_l.b(og.field_e, -108);
            break L6;
          } else {
            break L6;
          }
        }
        ea.a(ga.field_o, nc.field_c, 0, dj.field_c, (dh) (Object) di.field_l);
        di.field_l.g(-var5 + di.field_l.field_k, -20125);
        bc.a(-1, param2 + -1);
    }

    final static boolean a(e param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (param2 >= 57) {
            break L0;
          } else {
            field_a = -15;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (rd.field_t <= var4) {
            return false;
          } else {
            if (param1 >= p.field_a[var4].field_f) {
              if (p.field_a[var4].field_f + 32 >= param1) {
                if (param3 >= p.field_a[var4].field_e) {
                  if (p.field_a[var4].field_e - -32 >= param3) {
                    if (null != p.field_a[var4].field_d) {
                      L2: {
                        L3: {
                          if (p.field_a[var4].field_d.field_k) {
                            break L3;
                          } else {
                            if (p.field_a[var4].field_d.field_C != 0) {
                              sj.field_b = (p.field_a[var4].field_d.field_i - p.field_a[var4].field_d.field_gb) * 32;
                              lg.field_c = (p.field_a[var4].field_d.field_i + p.field_a[var4].field_d.field_gb) * 16;
                              eg.field_p = p.field_a[var4].field_d.field_R;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        sj.field_b = (-p.field_a[var4].field_d.field_H + p.field_a[var4].field_d.field_F) * 32;
                        lg.field_c = 16 * (p.field_a[var4].field_d.field_H + p.field_a[var4].field_d.field_F);
                        eg.field_p = p.field_a[var4].field_d.field_E;
                        break L2;
                      }
                      qd.a((byte) 69, 33);
                      return true;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, pk param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, bm param14, int param15, int param16, pk param17, int param18, int param19, int param20) {
        pe.a(param3, param4, 48, param17);
        aj.a(param7, -19605, param5, param15, param12);
        tb.a(param8, param2 ^ 21361, param19);
        uh.a(param0, param1, param13, param9, -128, param11);
        ph.a(param10, param14, param16, -1);
        if (param2 != 0) {
            return;
        }
        kb.a(param6, param20, param18, (byte) -83);
    }

    static {
    }
}
