/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ac {
    static kj field_y;
    static int[] field_x;

    public static void c(int param0) {
        if (param0 != 0) {
            field_x = null;
            field_y = null;
            field_x = null;
            return;
        }
        field_y = null;
        field_x = null;
    }

    final String c(int param0, el param1) {
        Object var4 = null;
        if (param0 < 109) {
          var4 = null;
          String discarded$2 = ((uh) this).c(-111, (el) null);
          return ah.a(0, '*', param1.field_s.length());
        } else {
          return ah.a(0, '*', param1.field_s.length());
        }
    }

    uh(int param0) {
        this(ng.field_F, param0);
    }

    final static int b(int param0) {
        if (param0 != 16) {
          field_x = null;
          return ee.field_B[el.field_t % ee.field_B.length];
        } else {
          return ee.field_B[el.field_t % ee.field_B.length];
        }
    }

    private uh(m param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        oc.b(-96);
        vb.b(param1, param0, param4, param3);
        if (param2 == -14045) {
            return;
        }
        int discarded$0 = uh.b(-111);
    }

    final static nf a(pk param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        var2 = param0.e((byte) -17, 8);
        if ((var2 ^ -1) < -1) {
          throw new IllegalStateException("" + var2);
        } else {
          var3 = ac.a((byte) 81, param0) ? 1 : 0;
          var4 = ac.a((byte) 7, param0) ? 1 : 0;
          var5 = new nf();
          var5.field_o = (short)param0.e((byte) -17, 16);
          var5.field_O = ji.a(var5.field_O, 16, 0, param0);
          var5.field_q = ji.a(var5.field_q, 16, 0, param0);
          var5.field_K = ji.a(var5.field_K, 16, 0, param0);
          var5.field_f = (short)param0.e((byte) -17, 16);
          var5.field_r = ji.a(var5.field_r, 16, 0, param0);
          if (param1 >= 111) {
            L0: {
              var5.field_B = ji.a(var5.field_B, 16, 0, param0);
              var5.field_c = ji.a(var5.field_c, 16, 0, param0);
              if (var3 != 0) {
                var5.field_m = (short)param0.e((byte) -17, 16);
                var5.field_M = ji.a(var5.field_M, 16, 0, param0);
                var5.field_t = ji.a(var5.field_t, 16, 0, param0);
                var5.field_i = ji.a(var5.field_i, 16, 0, param0);
                var5.field_P = ji.a(var5.field_P, 16, 0, param0);
                var5.field_u = ji.a(var5.field_u, 16, 0, param0);
                var5.field_e = ji.a(var5.field_e, 16, 0, param0);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var4 != 0) {
                int discarded$4 = param0.e((byte) -17, 16);
                var5.field_J = ji.a(var5.field_J, 16, 0, param0);
                var5.field_z = ji.a(var5.field_z, 16, 0, param0);
                var5.field_h = ji.a(var5.field_h, 16, 0, param0);
                var5.field_k = ji.a(var5.field_k, 16, 0, param0);
                var5.field_g = ji.a(var5.field_g, 16, 0, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ac.a((byte) 102, param0)) {
                var5.field_G = ji.a(var5.field_G, 16, 0, param0);
                break L2;
              } else {
                break L2;
              }
            }
            if (ac.a((byte) 37, param0)) {
              var5.field_n = vk.a(var5.field_n, param0, 16, 8);
              var6 = 0;
              var7 = 0;
              L3: while (true) {
                if (var5.field_n.length <= var7) {
                  if (-1 == (var6 ^ -1)) {
                    var5.field_n = null;
                    return var5;
                  } else {
                    var5.field_v = (byte)(1 + var6);
                    return var5;
                  }
                } else {
                  if ((255 & var5.field_n[var7]) > var6) {
                    var6 = 255 & var5.field_n[var7];
                    var7++;
                    continue L3;
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            } else {
              return var5;
            }
          } else {
            L4: {
              field_y = null;
              var5.field_B = ji.a(var5.field_B, 16, 0, param0);
              var5.field_c = ji.a(var5.field_c, 16, 0, param0);
              if (var3 != 0) {
                var5.field_m = (short)param0.e((byte) -17, 16);
                var5.field_M = ji.a(var5.field_M, 16, 0, param0);
                var5.field_t = ji.a(var5.field_t, 16, 0, param0);
                var5.field_i = ji.a(var5.field_i, 16, 0, param0);
                var5.field_P = ji.a(var5.field_P, 16, 0, param0);
                var5.field_u = ji.a(var5.field_u, 16, 0, param0);
                var5.field_e = ji.a(var5.field_e, 16, 0, param0);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var4 != 0) {
                int discarded$5 = param0.e((byte) -17, 16);
                var5.field_J = ji.a(var5.field_J, 16, 0, param0);
                var5.field_z = ji.a(var5.field_z, 16, 0, param0);
                var5.field_h = ji.a(var5.field_h, 16, 0, param0);
                var5.field_k = ji.a(var5.field_k, 16, 0, param0);
                var5.field_g = ji.a(var5.field_g, 16, 0, param0);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (ac.a((byte) 102, param0)) {
                var5.field_G = ji.a(var5.field_G, 16, 0, param0);
                break L6;
              } else {
                break L6;
              }
            }
            if (ac.a((byte) 37, param0)) {
              L7: {
                var5.field_n = vk.a(var5.field_n, param0, 16, 8);
                var6 = 0;
                var7 = 0;
                if (var5.field_n.length <= var7) {
                  break L7;
                } else {
                  L8: {
                    if ((255 & var5.field_n[var7]) <= var6) {
                      var7++;
                      break L8;
                    } else {
                      var6 = 255 & var5.field_n[var7];
                      break L8;
                    }
                  }
                  var7++;
                  var7++;
                  var7++;
                  break L7;
                }
              }
              if (-1 == (var6 ^ -1)) {
                var5.field_n = null;
                return var5;
              } else {
                var5.field_v = (byte)(1 + var6);
                return var5;
              }
            } else {
              return var5;
            }
          }
        }
    }

    final static void d(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ja var13 = null;
        ja var14 = null;
        var12 = Geoblox.field_C;
        if (param0 == 4740) {
          var14 = (ja) (Object) wd.field_e.g(0);
          if (var14 != null) {
            var2 = -320.0f + var14.field_o;
            var3 = -240.0f + var14.field_v;
            var4 = (int)((double)var2 * Math.cos((double)el.field_o.field_J) - Math.sin((double)el.field_o.field_J) * (double)var3 + 320.0);
            var5 = (int)((double)var2 * Math.sin((double)el.field_o.field_J) + (double)var3 * Math.cos((double)el.field_o.field_J) + 240.0);
            var6 = 0.01666666753590107f;
            var7 = 16764416;
            var8 = (float)el.field_o.field_v * 0.03999999910593033f;
            vb.e(var4, var5, 16, 16777215, 100);
            vb.f(var4, var5, 16, 0);
            var9 = var8 + 3.1415927410125732f;
            L0: while (true) {
              if (var8 >= var9) {
                var13 = (ja) (Object) wd.field_e.g(0);
                L1: while (true) {
                  if (var13 != null) {
                    var13.n(param0 + -4830);
                    var13 = (ja) (Object) wd.field_e.d(1);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                var10 = (int)((double)var4 + 16.0 * Math.cos((double)var9));
                var11 = (int)((double)var5 + Math.sin((double)var9) * 16.0);
                vb.d(var10, var11, 2, var7);
                var6 = var6 + var6 * 0.25f;
                // wide iinc 7 778
                var9 = var9 - var6;
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[128];
    }
}
