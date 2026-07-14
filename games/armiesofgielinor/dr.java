/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dr extends ms {
    static String field_y;
    static String field_D;
    Class[] field_u;
    String field_A;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String field_B;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return ((dr) this).field_A;
    }

    abstract nd a(int param0, nd[] param1);

    public static void d(byte param0) {
        field_D = null;
        field_v = null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
        if (param0 <= 68) {
            field_w = null;
        }
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        if (param1 != 96) {
            Object var5 = null;
            dr.a(125, (byte) -9, 20, (nr) null);
        }
    }

    final boolean a(String param0, byte param1, nd[] param2) {
        int var4 = 0;
        int var5 = 0;
        Class var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((dr) this).field_B.equals((Object) (Object) param0)) {
          return false;
        } else {
          if (((dr) this).field_u.length == param2.length) {
            var4 = -96 / ((-2 - param1) / 52);
            var5 = 0;
            L0: while (true) {
              if (var5 >= ((dr) this).field_u.length) {
                return true;
              } else {
                if (param2[var5].field_e) {
                  L1: {
                    var6 = cq.a(param2[var5].field_c, (byte) -75);
                    if (Boolean.TYPE != var6) {
                      break L1;
                    } else {
                      if (((dr) this).field_u[var5] != Boolean.TYPE) {
                        return false;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (Character.TYPE != var6) {
                      break L2;
                    } else {
                      if (((dr) this).field_u[var5] == Character.TYPE) {
                        break L2;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (rt.a(false, var6)) {
                    if (!rt.a(false, ((dr) this).field_u[var5])) {
                      return false;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  if (!((dr) this).field_u[var5].isInstance(param2[var5].field_c)) {
                    return false;
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    dr(String param0, Class[] param1, String param2) {
        int var5 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        ((dr) this).field_u = param1;
        ((dr) this).field_B = param0;
        var7 = new StringBuilder(((dr) this).field_B).append(40);
        var8 = var7;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((dr) this).field_u.length) {
            L1: {
              StringBuilder discarded$74 = var8.append(41);
              if (param2 == null) {
                break L1;
              } else {
                StringBuilder discarded$75 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                break L1;
              }
            }
            ((dr) this).field_A = var8.toString();
          } else {
            StringBuilder discarded$76 = var7.append(hw.a(640, ((dr) this).field_u[var5]));
            if (-1 + ((dr) this).field_u.length > var5) {
              StringBuilder discarded$77 = var8.append(", ");
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
            var1 = var0 - -1;
            field_z[var0] = Math.min(oe.c(oe.c(rn.a(var1 << -662008272, 16729482), rn.a(-2046820097, var1) << -2095792888), rn.a(var1 << 1918708674, 252)), 267583488);
            field_z[var0] = oe.c(rn.a(16515326, field_z[var0]), rn.a(32512, field_z[var0] >> -1888637087));
            var2 = gq.a(field_z[var0]);
            var2 = var2 & 655359;
            var3 = 255 & var2;
            if (!((var3 ^ -1) >= -6)) {
                var3 = 5;
            }
            var2 = -256 & var2 | var3;
            field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
