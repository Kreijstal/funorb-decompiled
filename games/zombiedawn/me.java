/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends wo {
    static String[][][] field_Fb;
    static int field_Gb;
    static int field_Db;
    private int field_Eb;
    static String field_Hb;
    static int field_Bb;
    static String field_Cb;

    me(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((me) this).field_Eb = -72 + (so.c(144) + param0);
    }

    public static void x(int param0) {
        field_Fb = null;
        field_Cb = null;
        field_Hb = null;
        if (param0 <= 32) {
            field_Bb = -98;
        }
    }

    final int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        ((me) this).n(103);
        var2 = -1 + ((me) this).field_ub;
        var3 = this.f(var2, 0);
        if (param0 <= -42) {
          var4 = 1;
          L0: while (true) {
            if (((me) this).field_ub - 1 <= var4) {
              L1: {
                if (-1 + ((me) this).field_ub != var2) {
                  break L1;
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              return var2;
            } else {
              var5 = this.f(var4, 0);
              if (var3 < var5) {
                var2 = var4;
                var3 = var5;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 122;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        L0: {
          if (((me) this).f(237239984) < 0) {
            break L0;
          } else {
            if (((me) this).f(237239984) <= dj.field_e.field_H.field_p) {
              var2 = -66 % ((param0 - 66) / 50);
              super.d((byte) 118);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void g(int param0) {
        super.g(99);
        if (((me) this).f(237239984) - 48 > dj.field_e.field_H.field_p) {
            ((me) this).b(-27598);
            ((me) this).d(0);
            if (param0 > 95) {
                return;
            }
            ((me) this).field_Eb = 110;
            return;
        }
        if (param0 <= 95) {
            ((me) this).field_Eb = 110;
            return;
        }
    }

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ((me) this).field_F = 0;
        super.l(param0);
        var2 = ((me) this).field_Eb;
        var3 = 672;
        if (var3 - 24 <= ((me) this).f(237239984)) {
          ((me) this).field_Y = ((me) this).a(true);
          ((me) this).field_X = 48 + ((me) this).f(param0 + 237239932);
          ((me) this).c(0, ((me) this).field_D);
          ((me) this).e(1, param0 + -6956);
          ((me) this).g(param0 + 45);
          return;
        } else {
          if (((me) this).f(237239984) >= 96) {
            if (((me) this).field_F != 0) {
              return;
            } else {
              ((me) this).a(var2, (byte) 115, var3);
              return;
            }
          } else {
            ((me) this).field_Y = ((me) this).a(true);
            ((me) this).field_X = 48 + ((me) this).f(param0 + 237239932);
            ((me) this).c(0, ((me) this).field_D);
            ((me) this).e(1, param0 + -6956);
            ((me) this).g(param0 + 45);
            return;
          }
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, ec param3, int param4, int param5) {
        re[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        re[] var10 = null;
        op var11 = null;
        op var12 = null;
        java.awt.Frame var13 = null;
        op var14 = null;
        java.awt.Frame var15 = null;
        Object var16 = null;
        var16 = null;
        var9 = ZombieDawn.field_J;
        if (param3.c(10)) {
          if (-1 == (param4 ^ -1)) {
            var10 = ud.a(0, param3);
            var6 = var10;
            if (var6 != null) {
              var7 = 0;
              var8 = 0;
              L0: while (true) {
                if (var10.length <= var8) {
                  if (var7 != 0) {
                    var14 = param3.a(param4, 1525233840, param5, param2, param1);
                    var11 = var14;
                    var7 = 116 % ((47 - param0) / 60);
                    L1: while (true) {
                      if (0 != var14.field_f) {
                        var15 = (java.awt.Frame) var14.field_d;
                        if (var15 != null) {
                          if (2 == var14.field_f) {
                            jb.a(-41, var15, param3);
                            return null;
                          } else {
                            return var15;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        ld.a(10L, (byte) 118);
                        continue L1;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  if (var10[var8].field_a == param1) {
                    if (var10[var8].field_d == param5) {
                      L2: {
                        if (param2 == 0) {
                          break L2;
                        } else {
                          if (var10[var8].field_f == param2) {
                            break L2;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      L3: {
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (param4 < var10[var8].field_b) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      var7 = 1;
                      param4 = var10[var8].field_b;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var12 = param3.a(param4, 1525233840, param5, param2, param1);
            var7 = 116 % ((47 - param0) / 60);
            L4: while (true) {
              if (0 != var12.field_f) {
                var13 = (java.awt.Frame) var12.field_d;
                if (var13 != null) {
                  if (2 == var12.field_f) {
                    jb.a(-41, var13, param3);
                    return null;
                  } else {
                    return var13;
                  }
                } else {
                  return null;
                }
              } else {
                ld.a(10L, (byte) 118);
                continue L4;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final int f(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            java.awt.Frame discarded$4 = me.a((byte) 107, -40, 33, (ec) null, -118, -80);
            if (-1 < (qd.field_f[param0] ^ -1)) {
                return 0;
            }
            if (h.field_e[param0] == 0) {
                return 0;
            }
            return qd.field_f[param0] * h.field_e[param0];
        }
        if (-1 > qd.field_f[param0]) {
            return 0;
        }
        if ((h.field_e[param0] ^ -1) == 0) {
            return 0;
        }
        return qd.field_f[param0] * h.field_e[param0];
    }

    final void a(wk param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawn.field_J;
        int var3 = param0.a(((me) this).a(true), (byte) -99);
        int var4 = param0.a(((me) this).f(237239984), param1 ^ param1);
        bi.d(var3, var4, ((me) this).field_pb, 65535);
        bi.e(var3, var4, param0.a(((me) this).field_Y, (byte) -71), param0.a(((me) this).field_X, 0), 16711935);
        for (var5 = 0; var5 < ((me) this).field_ub; var5++) {
            var6 = param0.a(((me) this).field_jb[var5], (byte) -114);
            var7 = param0.a(((me) this).field_gb[var5], 0);
            bi.b(var6 - 1, var7 - 1, 3, 3, 0);
            bi.a(var6, var7, 65280);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = new String[][][]{new String[6][], new String[6][], new String[6][], new String[0][], new String[6][], new String[5][], new String[6][], new String[6][]};
        field_Hb = "Achievements this game:";
        field_Bb = 480;
        field_Gb = 50;
        field_Cb = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
