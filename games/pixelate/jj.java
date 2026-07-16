/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj {
    private String field_l;
    int field_d;
    static String field_j;
    static String field_e;
    tf[] field_k;
    tf[] field_f;
    tf[] field_a;
    static int[] field_h;
    int[][] field_g;
    private tf field_i;
    static String field_c;
    static int field_b;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (0 >= ((jj) this).field_d) {
            break L0;
          } else {
            L1: {
              var2 = -(kb.field_L.c(((jj) this).field_l) / 2) + 320 + -20;
              var3 = 20 + kb.field_L.c(((jj) this).field_l) / 2 + 320;
              var4 = -1;
              var5 = 25;
              t.a(nh.field_a);
              if (((jj) this).field_d <= dm.field_Cb + -var5) {
                if (var5 <= ((jj) this).field_d) {
                  break L1;
                } else {
                  var4 = 640 - ((jj) this).field_d * 640 / var5;
                  t.f(var4, 0, var3, 480);
                  break L1;
                }
              } else {
                var4 = 640 * (-((jj) this).field_d + dm.field_Cb) / var5;
                t.f(var2, 0, var4, 480);
                break L1;
              }
            }
            fi.a(((jj) this).field_i, 0, -kb.field_L.field_w + (140 - pd.field_Jb * 2));
            kb.field_L.b(((jj) this).field_l, 320, 140, 0, 0);
            t.b(nh.field_a);
            if (var4 <= 0) {
              break L0;
            } else {
              var6 = -((kb.field_L.field_w - -kb.field_L.field_z) / 2) + 141;
              var7 = 0;
              L2: while (true) {
                if (10 <= var7) {
                  break L0;
                } else {
                  t.a(-40 + var4 + 4 * var7 << 1754066532, var6 << -1912289564, var7 << 1298997987, 15, bo.field_c);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param0 <= -87) {
            break L3;
          } else {
            var9 = null;
            jj.a((byte) 106, (fa) null, (fa) null);
            break L3;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        gk.field_fb = param4;
        hq.field_r = param0;
        if (param1) {
            return;
        }
        ii.field_i = param3;
        ul.field_q = param2;
    }

    final static bo[] a(cb param0, int param1) {
        int var5 = 0;
        bo var6 = null;
        int var7 = Pixelate.field_H ? 1 : 0;
        if (param1 != -855969982) {
            return null;
        }
        if (!(param0.a((byte) 115))) {
            return new bo[]{};
        }
        ei var8 = param0.a(true);
        while (0 == var8.field_b) {
            vg.a(10L, (byte) 23);
        }
        if (-3 == (var8.field_b ^ -1)) {
            return new bo[]{};
        }
        int[] var12 = (int[]) var8.field_e;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        bo[] var4 = new bo[var12.length >> 1399587618];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new bo();
            var4[var5] = var6;
            var6.field_l = var3[var5 << 1403304098];
            var6.field_i = var3[1 + (var5 << -1650092766)];
            var6.field_j = var3[2 + (var5 << -1023987134)];
            var6.field_g = var3[3 + (var5 << -855969982)];
        }
        return var4;
    }

    void c(int param0) {
        if (param0 > (((jj) this).field_d ^ -1)) {
            ((jj) this).field_d = ((jj) this).field_d - 1;
        }
        jd.field_r = jd.field_r + 1;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -4136) {
            return;
        }
        field_j = null;
        field_c = null;
        field_h = null;
    }

    final static void a(byte param0, fa param1, fa param2) {
        if (param2.field_h != null) {
            param2.c(2779);
        }
        param2.field_a = param1;
        int var3 = 28 / ((58 - param0) / 36);
        param2.field_h = param1.field_h;
        param2.field_h.field_a = param2;
        param2.field_a.field_h = param2;
    }

    final static void a(int param0) {
        r.b(-93);
        eh.a(3, v.field_c, fq.field_q, r.field_c, h.field_V[param0].field_A, hk.field_b);
    }

    void a(boolean param0) {
        if (param0) {
            ((jj) this).field_d = -82;
        }
    }

    jj(String param0, tf[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        tf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        ((jj) this).field_d = 0;
        ((jj) this).field_f = param1;
        ((jj) this).field_l = "\"" + param0 + "\"";
        ((jj) this).field_k = new tf[((jj) this).field_f.length];
        ((jj) this).field_a = new tf[((jj) this).field_f.length];
        var3 = ((jj) this).field_f[0].field_F >> 150651905;
        var4 = ((jj) this).field_f[0].field_F >> 362835842;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((jj) this).field_f.length) {
            ((jj) this).field_i = new tf(640, 4 * pd.field_Jb + (kb.field_L.field_w + kb.field_L.field_z));
            ((jj) this).field_i.c();
            var5 = 320;
            var6 = ((jj) this).field_i.field_E - pd.field_Jb * 2 + -kb.field_L.field_z;
            kb.field_L.b(((jj) this).field_l, -1 + var5, var6 - 1, 0, -1);
            kb.field_L.b(((jj) this).field_l, var5 + 1, var6 + -1, 0, -1);
            kb.field_L.b(((jj) this).field_l, var5 - 1, var6 - -1, 0, -1);
            kb.field_L.b(((jj) this).field_l, 1 + var5, var6 + 1, 0, -1);
            t.c(pd.field_Jb, pd.field_Jb, 0, 0, ((jj) this).field_i.field_F, ((jj) this).field_i.field_E);
            kb.field_L.b(((jj) this).field_l, var5, var6, 0, -1);
            qa.field_f.a(19692);
            ((jj) this).field_g = new int[2][];
            var7 = 0;
            L1: while (true) {
              if (((jj) this).field_k.length <= var7) {
                var7 = 0;
                L2: while (true) {
                  if ((var7 ^ -1) <= -3) {
                    return;
                  } else {
                    var8 = ((jj) this).field_f[var7];
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var8.field_G.length) {
                        var8.field_G[127] = 0;
                        var8.field_G[63] = 0;
                        var8.field_G[64] = 0;
                        var8.field_G[0] = 0;
                        var8.field_G[1] = 0;
                        var8.field_G[62] = 0;
                        var9 = (-1 + var8.field_B) * var8.field_A;
                        var8.field_G[var9] = 0;
                        var8.field_G[var9 - -1] = 0;
                        var8.field_G[var9 - 64] = 0;
                        var8.field_G[var9 - -63] = 0;
                        var8.field_G[var9 + 62] = 0;
                        var8.field_G[var9 - 1] = 0;
                        var7++;
                        continue L2;
                      } else {
                        if (-1 == (var8.field_G[var9] ^ -1)) {
                          var8.field_G[var9] = 65793;
                          var9++;
                          continue L3;
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                var8_int = 0;
                var9 = 0;
                var10 = 0;
                var11 = 0;
                L4: while (true) {
                  if (((jj) this).field_k[var7].field_G.length <= var11) {
                    L5: {
                      var11 = 48;
                      var9 = var11 + (255 & var9 / ((jj) this).field_k[var7].field_G.length);
                      var8_int = var11 + (var8_int / ((jj) this).field_k[var7].field_G.length & 255);
                      var10 = (var10 / ((jj) this).field_k[var7].field_G.length & 255) + var11;
                      if ((var9 ^ -1) >= -256) {
                        break L5;
                      } else {
                        var9 = 255;
                        break L5;
                      }
                    }
                    L6: {
                      if ((var8_int ^ -1) >= -256) {
                        break L6;
                      } else {
                        var8_int = 255;
                        break L6;
                      }
                    }
                    L7: {
                      if (255 >= var10) {
                        break L7;
                      } else {
                        var10 = 255;
                        break L7;
                      }
                    }
                    ((jj) this).field_g[var7] = new int[32];
                    var17 = 0;
                    var12 = var17;
                    L8: while (true) {
                      if (var17 >= ((jj) this).field_g[var7].length) {
                        var7++;
                        continue L1;
                      } else {
                        var13 = 255 & var17 * var8_int / 32;
                        var14 = var9 * var17 / 32 & 255;
                        var15 = 255 & var10 * var17 / 32;
                        ((jj) this).field_g[var7][var17] = bq.a(bq.a(var13 << -451010832, var14 << 187509352), var15);
                        var17++;
                        continue L8;
                      }
                    }
                  } else {
                    var12 = ((jj) this).field_k[var7].field_G[var11];
                    var9 = var9 + ((var12 & 65280) >> -764360952);
                    var10 = var10 + (255 & var12);
                    var8_int = var8_int + (255 & var12 >> -659155568);
                    var11++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            ((jj) this).field_k[var5] = new tf(var3, var3);
            ((jj) this).field_a[var5] = new tf(var4, var4);
            ((jj) this).field_k[var5].c();
            ((jj) this).field_f[var5].d(0, 0);
            ((jj) this).field_a[var5].c();
            ((jj) this).field_f[var5].e(0, 0);
            ((jj) this).field_f[var5].c();
            t.a(0, 0, 128, 128, 0, 48);
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Enter name of friend to add to list";
        field_e = "<%0> would need a rating of <%1> to play with the current options.";
        field_c = "Reload game";
    }
}
