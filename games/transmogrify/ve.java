/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lj {
    private wa field_A;
    static String field_D;
    static boolean[] field_B;
    private int field_C;

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = param1.charAt(0);
        var3 = param0;
        L0: while (true) {
          if (param1.length() > var3) {
            if (var2 != param1.charAt(var3)) {
              return false;
            } else {
              var3++;
              continue L0;
            }
          } else {
            return true;
          }
        }
    }

    final String f(int param0) {
        Object var3 = null;
        if (param0 == 4) {
          if (!((ve) this).field_g) {
            return null;
          } else {
            return ((ve) this).field_A.c(param0 + 30519);
          }
        } else {
          var3 = null;
          boolean discarded$5 = ((ve) this).a((qg) null, 58);
          if (!((ve) this).field_g) {
            return null;
          } else {
            return ((ve) this).field_A.c(param0 + 30519);
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        rc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ti var13 = null;
        ti var14 = null;
        ti var16 = null;
        ti var17 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        super.a(param0, param1, param2, (byte) 111);
        if (param2 != 0) {
          return;
        } else {
          var5 = ((ve) this).field_p + (param0 - -(((ve) this).field_l >> 223267105));
          var6 = param1 - (-((ve) this).field_n - (((ve) this).field_h >> 1057192001));
          var9 = -100 % ((param3 - 77) / 34);
          var8 = ((ve) this).field_A.a(27835);
          if (var8 != ek.field_a) {
            if (var8 != fi.field_u) {
              if (var8 != ec.field_d) {
                if (hi.field_b != var8) {
                  return;
                } else {
                  var13 = ai.field_b[1];
                  var13.c(var5 - (var13.field_n >> -2070636575), var6 + -(var13.field_m >> 1702224449), 256);
                  return;
                }
              } else {
                var14 = ai.field_b[2];
                var14.c(var5 + -(var14.field_n >> 785295009), var6 + -(var14.field_m >> -374736543), 256);
                return;
              }
            } else {
              var17 = ai.field_b[0];
              var10 = var17.field_r << 1165049825;
              var11 = var17.field_s << -381623679;
              if (null != vh.field_l) {
                if (var10 <= vh.field_l.field_n) {
                  if (vh.field_l.field_m >= var11) {
                    oj.a(vh.field_l, 256);
                    sb.c();
                    var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                    return;
                  } else {
                    vh.field_l = new ti(var10, var11);
                    oj.a(vh.field_l, 256);
                    var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                    fi.c(true);
                    vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                    return;
                  }
                } else {
                  vh.field_l = new ti(var10, var11);
                  oj.a(vh.field_l, 256);
                  var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                  fi.c(true);
                  vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                oj.a(vh.field_l, 256);
                var17.a(112, 144, var17.field_r << 1650091844, var17.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                fi.c(true);
                vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                return;
              }
            }
          } else {
            var16 = ai.field_b[0];
            var10 = var16.field_r << 1165049825;
            var11 = var16.field_s << -381623679;
            if (null != vh.field_l) {
              if (var10 <= vh.field_l.field_n) {
                if (vh.field_l.field_m >= var11) {
                  oj.a(vh.field_l, 256);
                  sb.c();
                  var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                  fi.c(true);
                  vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                  return;
                } else {
                  vh.field_l = new ti(var10, var11);
                  oj.a(vh.field_l, 256);
                  var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                  fi.c(true);
                  vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                oj.a(vh.field_l, 256);
                var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
                fi.c(true);
                vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                return;
              }
            } else {
              vh.field_l = new ti(var10, var11);
              oj.a(vh.field_l, 256);
              var16.a(112, 144, var16.field_r << 1650091844, var16.field_s << 598458308, -((ve) this).field_C << -2055185238, 4096);
              fi.c(true);
              vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_B = null;
        field_D = null;
        if (param0 > -58) {
            ve.a((byte) 42);
        }
    }

    final static uj a(String[] args, byte param1) {
        uj var2 = null;
        if (param1 > -98) {
          field_D = null;
          var2 = new uj(false);
          var2.field_j = args;
          return var2;
        } else {
          var2 = new uj(false);
          var2.field_j = args;
          return var2;
        }
    }

    final boolean a(qg param0, int param1) {
        if (param1 >= -11) {
            Object var4 = null;
            uj discarded$0 = ve.a((String[]) null, (byte) -44);
            return false;
        }
        return false;
    }

    ve(wa param0) {
        ((ve) this).field_A = param0;
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        ((ve) this).field_C = ((ve) this).field_C + 1;
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new boolean[112];
        field_D = "Total";
    }
}
