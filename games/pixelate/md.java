/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends db {
    static boolean field_Y;
    private String field_ab;
    private int field_X;
    static String field_V;
    private ml field_W;
    private tf field_Z;

    final String b(byte param0) {
        if (param0 > 16) {
            return null;
        }
        ((md) this).field_ab = null;
        return null;
    }

    final static void a(tf param0, tf param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        Pixelate.field_E = param1;
        u.field_f = new tf(Pixelate.field_E.field_A, Pixelate.field_E.field_B);
        u.field_f.c();
        Pixelate.field_E.f(0, 0);
        var3 = 5395026;
        var4 = t.field_d;
        var5 = 0;
        L0: while (true) {
          if (t.field_k.length <= var5) {
            qa.field_g = new tf(640, 480);
            qa.field_g.c();
            param0.c(0, 0, 255, 80);
            param0.c(320, 0, 255, 80);
            param0.c(0, 240, 80, 0);
            param0.c(320, 240, param2, 0);
            qa.field_f.a(19692);
            return;
          } else {
            if (t.field_k[var5] < var3) {
              t.field_k[var5] = 0;
              var5++;
              continue L0;
            } else {
              var6 = -(var5 / t.field_j) + t.field_d;
              var7 = 255 * var6 / var4;
              t.field_k[var5] = bq.a(bq.a(var7 << -566932312, var7 << 551198192), var7 >> -216561759);
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5 = null;
        dj var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        tf var17 = null;
        Object var18 = null;
        tf var19 = null;
        tf var20 = null;
        tf var21 = null;
        tf var22 = null;
        Object var24 = null;
        tf var25 = null;
        tf var26 = null;
        tf var27 = null;
        af var28 = null;
        af var29 = null;
        L0: {
          L1: {
            var18 = null;
            var24 = null;
            var14 = Pixelate.field_H ? 1 : 0;
            var6 = ((md) this).field_W.a((byte) 113);
            if (var6 == uo.field_b) {
              break L1;
            } else {
              if (tg.field_j == var6) {
                break L1;
              } else {
                var5 = ((md) this).field_W.b((byte) -7);
                if (var5 == null) {
                  var5 = ((md) this).field_ab;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = ec.field_m;
          break L0;
        }
        if (var5.equals((Object) (Object) ((md) this).field_q)) {
          L2: {
            super.a(param0, param1, param2, (byte) -25);
            var6 = ((md) this).field_W.a((byte) 97);
            var29 = (af) (Object) ((md) this).field_y;
            var9 = ((md) this).field_z + param2;
            var10 = var29.a(param0, (ng) this, (byte) 107) + (var29.b(-117, (ng) this).b(1) >> -1526098015);
            var11 = -23 / ((param3 - 70) / 49);
            if (var6 == uo.field_b) {
              break L2;
            } else {
              if (tg.field_j == var6) {
                break L2;
              } else {
                if (sk.field_a != var6) {
                  if (var6 == qk.field_g) {
                    var25 = ha.field_g[1];
                    var25.b(var9, var10 + -(var25.field_E >> 1814421985), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var26 = ha.field_g[2];
                  var26.b(var9, var10 + -(var26.field_E >> 1710042305), 256);
                  return;
                }
              }
            }
          }
          var27 = ha.field_g[0];
          var12 = var27.field_A << 1145150689;
          var13 = var27.field_B << -907839;
          if (null != ((md) this).field_Z) {
            if (((md) this).field_Z.field_F >= var12) {
              if (((md) this).field_Z.field_E < var13) {
                ((md) this).field_Z = new tf(var12, var13);
                h.a(-119, ((md) this).field_Z);
                var27.a(112, 144, var27.field_A << -1272019036, var27.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
                ia.a((byte) 92);
                ((md) this).field_Z.b(-(var27.field_A >> -1082195679) + var9, var10 - var27.field_B, 256);
                return;
              } else {
                h.a(-72, ((md) this).field_Z);
                t.d();
                var27.a(112, 144, var27.field_A << -1272019036, var27.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
                ia.a((byte) 92);
                ((md) this).field_Z.b(-(var27.field_A >> -1082195679) + var9, var10 - var27.field_B, 256);
                return;
              }
            } else {
              ((md) this).field_Z = new tf(var12, var13);
              h.a(-119, ((md) this).field_Z);
              var27.a(112, 144, var27.field_A << -1272019036, var27.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
              ia.a((byte) 92);
              ((md) this).field_Z.b(-(var27.field_A >> -1082195679) + var9, var10 - var27.field_B, 256);
              return;
            }
          } else {
            ((md) this).field_Z = new tf(var12, var13);
            h.a(-119, ((md) this).field_Z);
            var27.a(112, 144, var27.field_A << -1272019036, var27.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
            ia.a((byte) 92);
            ((md) this).field_Z.b(-(var27.field_A >> -1082195679) + var9, var10 - var27.field_B, 256);
            return;
          }
        } else {
          ((md) this).field_q = var5;
          ((md) this).a(1829);
          super.a(param0, param1, param2, (byte) -25);
          var6 = ((md) this).field_W.a((byte) 97);
          var28 = (af) (Object) ((md) this).field_y;
          var9 = ((md) this).field_z + param2;
          var10 = var28.a(param0, (ng) this, (byte) 107) + (var28.b(-117, (ng) this).b(1) >> -1526098015);
          var11 = -23 / ((param3 - 70) / 49);
          if (var6 != uo.field_b) {
            if (tg.field_j != var6) {
              if (sk.field_a != var6) {
                if (var6 == qk.field_g) {
                  var21 = ha.field_g[1];
                  var21.b(var9, var10 + -(var21.field_E >> 1814421985), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var22 = ha.field_g[2];
                var22.b(var9, var10 + -(var22.field_E >> 1710042305), 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var20 = ha.field_g[0];
                  var17 = var20;
                  var12 = var20.field_A << 1145150689;
                  var13 = var20.field_B << -907839;
                  if (null == ((md) this).field_Z) {
                    break L4;
                  } else {
                    if (((md) this).field_Z.field_F < var12) {
                      break L4;
                    } else {
                      if (((md) this).field_Z.field_E >= var13) {
                        h.a(-72, ((md) this).field_Z);
                        t.d();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((md) this).field_Z = new tf(var12, var13);
                h.a(-119, ((md) this).field_Z);
                break L3;
              }
              var20.a(112, 144, var20.field_A << -1272019036, var20.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
              ia.a((byte) 92);
              ((md) this).field_Z.b(-(var20.field_A >> -1082195679) + var9, var10 - var20.field_B, 256);
              return;
            }
          } else {
            L5: {
              L6: {
                var19 = ha.field_g[0];
                var12 = var19.field_A << 1145150689;
                var13 = var19.field_B << -907839;
                if (null == ((md) this).field_Z) {
                  break L6;
                } else {
                  if (((md) this).field_Z.field_F < var12) {
                    break L6;
                  } else {
                    if (((md) this).field_Z.field_E >= var13) {
                      h.a(-72, ((md) this).field_Z);
                      t.d();
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              ((md) this).field_Z = new tf(var12, var13);
              h.a(-119, ((md) this).field_Z);
              break L5;
            }
            var19.a(112, 144, var19.field_A << -1272019036, var19.field_B << 1216280516, -((md) this).field_X << 1477975818, 4096);
            ia.a((byte) 92);
            ((md) this).field_Z.b(-(var19.field_A >> -1082195679) + var9, var10 - var19.field_B, 256);
            return;
          }
        }
    }

    final static void a(rh param0, boolean param1, int param2) {
        de.field_b.a(22125, (fa) (Object) param0);
        sd.a((byte) -52, param0, param2);
        if (!param1) {
            md.c(false);
        }
    }

    final boolean a(ng param0, int param1) {
        if (param1 != 27) {
            ((md) this).field_W = null;
            return false;
        }
        return false;
    }

    public static void c(boolean param0) {
        field_V = null;
        if (param0) {
            field_Y = false;
        }
    }

    md(ml param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (eb) (Object) ih.a((byte) 45));
        ((md) this).field_ab = param1;
        ((md) this).field_W = param0;
        ((md) this).a(param4, (byte) 121, param3, param2, param5);
    }

    final void a(int param0, int param1, int param2, ng param3) {
        ((md) this).field_X = ((md) this).field_X + 1;
        if (param0 != 40) {
          field_V = null;
          super.a(param0 + 0, param1, param2, param3);
          return;
        } else {
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Accept <%0> into this game";
    }
}
