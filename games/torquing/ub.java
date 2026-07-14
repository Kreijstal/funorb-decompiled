/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends lg {
    static mm field_G;
    private int field_H;
    private sk field_F;
    static int field_E;
    static int field_C;
    static int[] field_D;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        cd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        t var13 = null;
        t var14 = null;
        t var15 = null;
        t var16 = null;
        var11 = Torquing.field_u;
        super.a(param0, (byte) -126, param2, param3);
        if (0 == param0) {
          if (param1 <= -7) {
            var5 = (((ub) this).field_p >> 608864001) + ((ub) this).field_w + param3;
            var6 = ((ub) this).field_k + param2 - -(((ub) this).field_o >> -1011841791);
            var8 = ((ub) this).field_F.a((byte) -87);
            if (var8 == q.field_a) {
              var16 = wj.field_h[0];
              var9 = var16.field_w << 1718528257;
              var10 = var16.field_u << -4319519;
              if (dp.field_b != null) {
                if (dp.field_b.field_s >= var9) {
                  if (var10 > dp.field_b.field_t) {
                    dp.field_b = new t(var9, var10);
                    tm.a((byte) 99, dp.field_b);
                    var16.c(112, 144, var16.field_w << 479663076, var16.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                    r.a(123);
                    dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                    return;
                  } else {
                    tm.a((byte) -105, dp.field_b);
                    ph.b();
                    var16.c(112, 144, var16.field_w << 479663076, var16.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                    r.a(123);
                    dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                    return;
                  }
                } else {
                  dp.field_b = new t(var9, var10);
                  tm.a((byte) 99, dp.field_b);
                  var16.c(112, 144, var16.field_w << 479663076, var16.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                  r.a(123);
                  dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                  return;
                }
              } else {
                dp.field_b = new t(var9, var10);
                tm.a((byte) 99, dp.field_b);
                var16.c(112, 144, var16.field_w << 479663076, var16.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                r.a(123);
                dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                return;
              }
            } else {
              if (gn.field_h != var8) {
                if (var8 != so.field_u) {
                  if (so.field_s == var8) {
                    var13 = wj.field_h[1];
                    var13.a(var5 - (var13.field_s >> 656211425), -(var13.field_t >> -1879025759) + var6, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var14 = wj.field_h[2];
                  var14.a(-(var14.field_s >> 830834593) + var5, var6 + -(var14.field_t >> 746884737), 256);
                  return;
                }
              } else {
                var15 = wj.field_h[0];
                var9 = var15.field_w << 1718528257;
                var10 = var15.field_u << -4319519;
                if (dp.field_b != null) {
                  if (dp.field_b.field_s >= var9) {
                    if (var10 > dp.field_b.field_t) {
                      dp.field_b = new t(var9, var10);
                      tm.a((byte) 99, dp.field_b);
                      var15.c(112, 144, var15.field_w << 479663076, var15.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                      r.a(123);
                      dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                      return;
                    } else {
                      tm.a((byte) -105, dp.field_b);
                      ph.b();
                      var15.c(112, 144, var15.field_w << 479663076, var15.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                      r.a(123);
                      dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                      return;
                    }
                  } else {
                    dp.field_b = new t(var9, var10);
                    tm.a((byte) 99, dp.field_b);
                    var15.c(112, 144, var15.field_w << 479663076, var15.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                    r.a(123);
                    dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                    return;
                  }
                } else {
                  dp.field_b = new t(var9, var10);
                  tm.a((byte) 99, dp.field_b);
                  var15.c(112, 144, var15.field_w << 479663076, var15.field_u << -245397052, -((ub) this).field_H << -1621645078, 4096);
                  r.a(123);
                  dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, long param1) {
        if (param0 == 1976) {
          if (0L >= param1) {
            return;
          } else {
            if ((param1 % 10L ^ -1L) == -1L) {
              op.a(-1L + param1, 112);
              op.a(1L, 93);
              return;
            } else {
              op.a(param1, param0 + -1897);
              return;
            }
          }
        } else {
          ub.a(-53, -74L);
          if (0L >= param1) {
            return;
          } else {
            if ((param1 % 10L ^ -1L) == -1L) {
              op.a(-1L + param1, 112);
              op.a(1L, 93);
              return;
            } else {
              op.a(param1, param0 + -1897);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_G = null;
        field_D = null;
        if (param0 != -19) {
            ub.a((byte) -112);
        }
    }

    final boolean a(gm param0, boolean param1) {
        if (param1) {
            return false;
        }
        return false;
    }

    final void a(int param0, gm param1, int param2, int param3) {
        ((ub) this).field_H = ((ub) this).field_H + 1;
        int var5 = -105 % ((param0 - -28) / 43);
        super.a(-84, param1, param2, param3);
    }

    final String b(int param0) {
        if (((ub) this).field_s) {
            return ((ub) this).field_F.a(param0 ^ 124);
        }
        if (param0 == 0) {
            return null;
        }
        ub.a((byte) 125);
        return null;
    }

    ub(sk param0) {
        ((ub) this).field_F = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
    }
}
