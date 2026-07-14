/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends ck {
    int field_I;
    int field_N;
    int field_P;
    int field_K;
    static String[] field_S;
    int field_R;
    static en field_Q;
    static String[] field_O;
    static String[] field_L;
    int field_M;
    static int field_J;

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        var13 = DungeonAssault.field_K;
        var8 = -19 / ((-80 - param5) / 35);
        if (super.a(param0, param1, param2, param3, param4, (byte) 31, param6)) {
          var9 = param4 + (-param3 - ((j) this).field_q + -((j) this).field_I);
          var10 = param2 - param6 + (-((j) this).field_v + -((j) this).field_R);
          if (((j) this).field_M * ((j) this).field_M > var9 * var9 - -(var10 * var10)) {
            var11 = Math.atan2((double)var10, (double)var9) - jd.field_j;
            if (var11 >= 0.0) {
              if (0.0 < var11) {
                var11 = var11 + 3.141592653589793 / (double)((j) this).field_N;
                ((j) this).field_K = (int)((double)((j) this).field_N * var11 / 6.283185307179586);
                L0: while (true) {
                  if (((j) this).field_N <= ((j) this).field_K) {
                    ((j) this).field_K = ((j) this).field_K - ((j) this).field_N;
                    continue L0;
                  } else {
                    L1: while (true) {
                      if ((((j) this).field_K ^ -1) <= -1) {
                        return true;
                      } else {
                        ((j) this).field_K = ((j) this).field_K + ((j) this).field_N;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                ((j) this).field_K = (int)((double)((j) this).field_N * var11 / 6.283185307179586);
                L2: while (true) {
                  if (((j) this).field_N <= ((j) this).field_K) {
                    ((j) this).field_K = ((j) this).field_K - ((j) this).field_N;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if ((((j) this).field_K ^ -1) <= -1) {
                        return true;
                      } else {
                        ((j) this).field_K = ((j) this).field_K + ((j) this).field_N;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var11 = var11 - 3.141592653589793 / (double)((j) this).field_N;
              ((j) this).field_K = (int)((double)((j) this).field_N * var11 / 6.283185307179586);
              L4: while (true) {
                if (((j) this).field_N <= ((j) this).field_K) {
                  ((j) this).field_K = ((j) this).field_K - ((j) this).field_N;
                  continue L4;
                } else {
                  L5: while (true) {
                    if ((((j) this).field_K ^ -1) <= -1) {
                      return true;
                    } else {
                      ((j) this).field_K = ((j) this).field_K + ((j) this).field_N;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        L0: {
          var3 = null;
          if (null == ql.field_a) {
            break L0;
          } else {
            if (ql.field_a.equals((Object) (Object) param2.getParameter("settings"))) {
              break L0;
            } else {
              var3 = ql.field_a;
              var4 = var3;
              var4 = var3;
              break L0;
            }
          }
        }
        L1: {
          var4 = null;
          if (pa.field_b == null) {
            break L1;
          } else {
            if (!pa.field_b.equals((Object) (Object) param2.getParameter("session"))) {
              var4 = pa.field_b;
              break L1;
            } else {
              if (param0 < 87) {
                return null;
              } else {
                return ng.a(-1, 0, var4, var3, param1);
              }
            }
          }
        }
        if (param0 < 87) {
          return null;
        } else {
          return ng.a(-1, 0, var4, var3, param1);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        var2 = param0.charAt(0);
        if (param1 == -124) {
          var3 = 1;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) == var2) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void g(byte param0) {
        field_S = null;
        int var1 = 107 / ((param0 - -61) / 50);
        field_Q = null;
        field_O = null;
        field_L = null;
    }

    final static void f(byte param0) {
        gj.a(new int[0], 0, 0, (byte) 33, 1, 0, 1, 0, 1, 1, 1);
        gj.a(new int[0], 0, 0, (byte) 33, 3, 0, 2, 100, 2, 1, 1);
        gj.a(new int[0], 1, 0, (byte) 33, 4, 0, 2, 150, 1, 2, 1);
        gj.a(new int[0], -1, 0, (byte) 33, 2, 0, 1, 200, 3, 1, 2);
        gj.a(new int[0], -1, 0, (byte) 33, 13, 3500, 3, 300, 1, 4, 0);
        gj.a(new int[1], -1, 0, (byte) 33, 7, 4500, 1, 350, 3, 3, 1);
        gj.a(new int[0], -1, 0, (byte) 33, 6, 6500, 4, 400, 1, 1, 3);
        if (param0 == -4) {
          gj.a(new int[1], -1, 0, (byte) 33, 5, 7500, 2, 500, 2, 3, 3);
          gj.a(new int[1], -1, 1, (byte) 33, 34, 10000, 1, 550, 2, 3, 4);
          gj.a(new int[1], -1, 0, (byte) 33, 17, 12500, 4, 600, 2, 4, 0);
          gj.a(new int[1], 0, 1, (byte) 33, 11, 14500, 1, 800, 5, 4, 2);
          gj.a(new int[0], -1, 1, (byte) 33, 15, 16500, 3, 850, 4, 3, 4);
          gj.a(new int[1], 1, 0, (byte) 33, 16, 18500, 5, 900, 4, 3, 1);
          gj.a(new int[0], -1, 1, (byte) 33, 8, 20000, 6, 1000, 1, 5, 1);
          gj.a(new int[0], 1, 1, (byte) 33, 10, 21500, 7, 1100, 1, 1, 5);
          gj.a(new int[1], -1, 0, (byte) 33, 20, 23000, 3, 1150, 6, 3, 5);
          gj.a(new int[0], -1, 0, (byte) 33, 24, 24500, 6, 1200, 1, 7, 0);
          gj.a(new int[1], -1, -1, (byte) 33, 12, 27500, 4, 1300, 2, 5, 4);
          gj.a(new int[0], -1, -1, (byte) 33, 32, 29000, 7, 1400, 7, 4, 2);
          gj.a(new int[1], -1, 0, (byte) 33, 9, 31000, 5, 1450, 3, 5, 3);
          gj.a(new int[1], -1, 0, (byte) 33, 19, 33000, 3, 1500, 2, 4, 2);
          gj.a(new int[1], -1, 1, (byte) 33, 28, 35000, 5, 1600, 5, 7, 0);
          gj.a(new int[1], -1, 0, (byte) 33, 25, 37500, 2, 1800, 8, 3, 8);
          gj.a(new int[1], -1, 1, (byte) 33, 14, 40000, 1, 1900, 4, 6, 6);
          gj.a(new int[1], -1, 0, (byte) 33, 21, 42500, 8, 2000, 7, 2, 0);
          gj.a(new int[1], -1, 1, (byte) 33, 18, 45000, 4, 2100, 7, 7, 5);
          gj.a(new int[2], -1, 1, (byte) 33, 23, 47500, 10, 2200, 0, 0, 0);
          gj.a(new int[0], -1, -1, (byte) 33, 26, 50000, 6, 2300, 6, 6, 6);
          gj.a(new int[1], -1, 0, (byte) 33, 27, 52500, 8, 2400, 4, 9, 1);
          gj.a(new int[0], -1, 1, (byte) 33, 22, 55000, 8, 2500, 5, 5, 9);
          gj.a(new int[1], -1, 3, (byte) 33, 29, 59000, 7, 2700, 2, 6, 2);
          gj.a(new int[1], -1, 2, (byte) 33, 33, 63000, 6, 2800, 9, 6, 9);
          gj.a(new int[1], -1, -1, (byte) 33, 30, 67500, 9, 3000, 0, 9, 0);
          gj.a(new int[2], -1, 3, (byte) 33, 31, 70000, 10, 5000, 10, 10, 10);
          return;
        } else {
          field_L = null;
          gj.a(new int[1], -1, 0, (byte) 33, 5, 7500, 2, 500, 2, 3, 3);
          gj.a(new int[1], -1, 1, (byte) 33, 34, 10000, 1, 550, 2, 3, 4);
          gj.a(new int[1], -1, 0, (byte) 33, 17, 12500, 4, 600, 2, 4, 0);
          gj.a(new int[1], 0, 1, (byte) 33, 11, 14500, 1, 800, 5, 4, 2);
          gj.a(new int[0], -1, 1, (byte) 33, 15, 16500, 3, 850, 4, 3, 4);
          gj.a(new int[1], 1, 0, (byte) 33, 16, 18500, 5, 900, 4, 3, 1);
          gj.a(new int[0], -1, 1, (byte) 33, 8, 20000, 6, 1000, 1, 5, 1);
          gj.a(new int[0], 1, 1, (byte) 33, 10, 21500, 7, 1100, 1, 1, 5);
          gj.a(new int[1], -1, 0, (byte) 33, 20, 23000, 3, 1150, 6, 3, 5);
          gj.a(new int[0], -1, 0, (byte) 33, 24, 24500, 6, 1200, 1, 7, 0);
          gj.a(new int[1], -1, -1, (byte) 33, 12, 27500, 4, 1300, 2, 5, 4);
          gj.a(new int[0], -1, -1, (byte) 33, 32, 29000, 7, 1400, 7, 4, 2);
          gj.a(new int[1], -1, 0, (byte) 33, 9, 31000, 5, 1450, 3, 5, 3);
          gj.a(new int[1], -1, 0, (byte) 33, 19, 33000, 3, 1500, 2, 4, 2);
          gj.a(new int[1], -1, 1, (byte) 33, 28, 35000, 5, 1600, 5, 7, 0);
          gj.a(new int[1], -1, 0, (byte) 33, 25, 37500, 2, 1800, 8, 3, 8);
          gj.a(new int[1], -1, 1, (byte) 33, 14, 40000, 1, 1900, 4, 6, 6);
          gj.a(new int[1], -1, 0, (byte) 33, 21, 42500, 8, 2000, 7, 2, 0);
          gj.a(new int[1], -1, 1, (byte) 33, 18, 45000, 4, 2100, 7, 7, 5);
          gj.a(new int[2], -1, 1, (byte) 33, 23, 47500, 10, 2200, 0, 0, 0);
          gj.a(new int[0], -1, -1, (byte) 33, 26, 50000, 6, 2300, 6, 6, 6);
          gj.a(new int[1], -1, 0, (byte) 33, 27, 52500, 8, 2400, 4, 9, 1);
          gj.a(new int[0], -1, 1, (byte) 33, 22, 55000, 8, 2500, 5, 5, 9);
          gj.a(new int[1], -1, 3, (byte) 33, 29, 59000, 7, 2700, 2, 6, 2);
          gj.a(new int[1], -1, 2, (byte) 33, 33, 63000, 6, 2800, 9, 6, 9);
          gj.a(new int[1], -1, -1, (byte) 33, 30, 67500, 9, 3000, 0, 9, 0);
          gj.a(new int[2], -1, 3, (byte) 33, 31, 70000, 10, 5000, 10, 10, 10);
          return;
        }
    }

    private j() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new String[]{"Dark Arts", "The dark powers can be wielded by the <%0> equally well for both attack and defence. The <%0> can readjust the balance as she sees fit. (Single use)"};
        field_O = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Master of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
        field_L = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
