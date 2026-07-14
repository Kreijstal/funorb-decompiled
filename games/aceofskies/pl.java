/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private long field_a;
    private int field_b;

    final static void a(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int[] var5 = gi.field_i;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final rl b(int param0, int param1) {
        int var3 = -83 % ((param1 - -62) / 63);
        return rl.a(this.a(param0, -5825), (byte) -101);
    }

    private final int a(int param0, int param1) {
        if (param1 != -5825) {
          rl discarded$2 = ((pl) this).b(-43, -86);
          return 15 & (int)(((pl) this).field_a >> rl.field_e * param0);
        } else {
          return 15 & (int)(((pl) this).field_a >> rl.field_e * param0);
        }
    }

    private final void a(rl param0, int param1) {
        ((pl) this).field_b = ((pl) this).field_b + 1;
        ((pl) this).field_a = ((pl) this).field_a | (long)(((rl) param0).field_f << rl.field_e * ((pl) this).field_b);
        if (param1 != 15258) {
            int discarded$0 = this.a(45, 78);
        }
    }

    final static void c(int param0, int param1) {
        int var3 = 0;
        ga var4 = null;
        uc var5 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        var4 = (ga) tq.field_d.d(268435455);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 0) {
              return;
            } else {
              var5 = (uc) nh.field_g.d(268435455);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ag.a(param0, 5, var5);
                  var5 = (uc) nh.field_g.b((byte) 103);
                  continue L1;
                }
              }
            }
          } else {
            ac.a(0, param0, var4);
            var4 = (ga) tq.field_d.b((byte) 103);
            continue L0;
          }
        }
    }

    pl(rl param0) {
        ((pl) this).field_b = 1;
        ((pl) this).field_a = (long)((rl) param0).field_f;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15) {
        int var17 = 0;
        var17 = AceOfSkies.field_G ? 1 : 0;
        if (param1 >= param8) {
          if (param4 <= param1) {
            if (param8 >= param4) {
              md.a(param1, param0, param12, param13, param14, vp.field_j, param11, param9, param3, param5, param2, param6, param7, param10, param8, param4, (byte) -46);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            } else {
              md.a(param1, param0, param6, param7, param3, vp.field_j, param9, param11, param14, param5, param2, param12, param13, param10, param4, param8, (byte) -24);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            }
          } else {
            md.a(param4, param9, param6, param10, param3, vp.field_j, param0, param11, param2, param12, param14, param5, param13, param7, param1, param8, (byte) -120);
            if (param15) {
              pl.c(70, -13);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param4 > param8) {
            md.a(param4, param9, param5, param13, param2, vp.field_j, param11, param0, param3, param12, param14, param6, param10, param7, param8, param1, (byte) -70);
            if (!param15) {
              return;
            } else {
              pl.c(70, -13);
              return;
            }
          } else {
            if (param1 < param4) {
              md.a(param8, param11, param5, param7, param2, vp.field_j, param9, param0, param14, param6, param3, param12, param10, param13, param4, param1, (byte) -65);
              if (!param15) {
                return;
              } else {
                pl.c(70, -13);
                return;
              }
            } else {
              md.a(param8, param11, param12, param10, param14, vp.field_j, param0, param9, param2, param6, param3, param5, param7, param13, param1, param4, (byte) -102);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    pl(rl[] param0) {
        int var2 = 0;
        for (var2 = 0; param0.length > var2; var2++) {
            this.a(param0[var2], 15258);
        }
    }

    final int a(byte param0) {
        if (param0 != 90) {
            ((pl) this).field_a = 34L;
            return ((pl) this).field_b;
        }
        return ((pl) this).field_b;
    }

    final static String b(int param0) {
        int var1 = 123 % ((param0 - -43) / 56);
        return nm.field_c.h(-17883);
    }

    static {
    }
}
