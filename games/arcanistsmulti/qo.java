/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static String field_d;
    static dn field_f;
    static int field_e;
    static int field_b;
    static String field_c;
    static int[] field_a;
    static String field_g;

    final static void a(int param0, byte param1, long param2) {
        ab var4 = null;
        int var5 = 0;
        var4 = he.field_e;
        var4.b((byte) -75, param0);
        var4.field_g = var4.field_g + 1;
        var5 = var4.field_g;
        var4.f(6, (byte) -32);
        if (param1 >= -61) {
          field_e = -61;
          var4.a(param2, (byte) 72);
          var4.b(var4.field_g - var5, (byte) 43);
          return;
        } else {
          var4.a(param2, (byte) 72);
          var4.b(var4.field_g - var5, (byte) 43);
          return;
        }
    }

    final static void a(int param0, int param1) {
        on.field_h = (param1 & 48) >> 981655908;
        if (on.field_h <= 2) {
          ra.field_m = (param1 & 13) >> 1514545186;
          if (ra.field_m > param0) {
            L0: {
              ra.field_m = 2;
              hd.field_b = param1 & 3;
              if (-3 > hd.field_b) {
                hd.field_b = 2;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              hd.field_b = param1 & 3;
              if (-3 < hd.field_b) {
                hd.field_b = 2;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          on.field_h = 2;
          ra.field_m = (param1 & 13) >> 1514545186;
          if (ra.field_m <= param0) {
            L2: {
              hd.field_b = param1 & 3;
              if (-3 > hd.field_b) {
                hd.field_b = 2;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ra.field_m = 2;
              hd.field_b = param1 & 3;
              if (-3 < hd.field_b) {
                hd.field_b = 2;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        jf.field_a.field_g = 0;
        jf.field_a.f(12, (byte) -45);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.f(param0, (byte) -10);
        if (param3 >= -125) {
          qo.a(5, 14, 54, (byte) 68);
          jf.field_a.f(param1, (byte) -50);
          jf.field_a.c(param2, (byte) -66);
          jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
          he.field_e.b((byte) -25, 18);
          he.field_e.field_g = he.field_e.field_g + 1;
          var4 = he.field_e.field_g + 1;
          he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
          he.field_e.b(he.field_e.field_g + -var4, (byte) 43);
          return;
        } else {
          jf.field_a.f(param1, (byte) -50);
          jf.field_a.c(param2, (byte) -66);
          jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
          he.field_e.b((byte) -25, 18);
          he.field_e.field_g = he.field_e.field_g + 1;
          var4 = he.field_e.field_g + 1;
          he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
          he.field_e.b(he.field_e.field_g + -var4, (byte) 43);
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        Object var3 = null;
        var2 = rl.a(be.a(param1, false), 29424);
        if (param0 < 67) {
          L0: {
            var3 = null;
            String discarded$6 = qo.a((byte) -47, (CharSequence) null);
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    public static void a(int param0) {
        if (param0 != 6) {
          field_a = null;
          field_g = null;
          field_d = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!Character.isISOControl(param0)) {
          if (hn.a(param0, 17769)) {
            return true;
          } else {
            var6 = ih.field_c;
            var2 = var6;
            var3 = param1;
            L0: while (true) {
              if (var6.length <= var3) {
                var2 = eh.field_f;
                var3 = 0;
                L1: while (true) {
                  if (var2.length > var3) {
                    var4 = var2[var3];
                    if (var4 == param0) {
                      return true;
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var4 = var6[var3];
                if (param0 == var4) {
                  return true;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Mouse over an icon for details";
        field_b = 50;
        field_d = "<%0> has dropped out.";
        field_a = new int[]{19, 20, 21, 22, 23, 24, 51, 60, 52};
        field_g = "You can join this game";
    }
}
