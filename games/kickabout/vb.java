/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static boolean field_k;
    static String field_e;
    static int field_b;
    static int field_d;
    static ut[] field_a;
    static String field_i;
    static int field_j;
    static double field_c;
    static String field_f;
    static int field_h;
    static byte[][] field_g;
    static ut field_l;

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var2 = param1.length();
        long var3 = 0L;
        for (var5 = param0; var2 > var5; var5++) {
            var3 = -var3 + ((var3 << 1347056389) + (long)param1.charAt(var5));
        }
        return var3;
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 != 0) {
            field_c = 0.39487605170744977;
        }
    }

    final static boolean b(int param0) {
        if (param0 < 117) {
            return false;
        }
        return null != jl.field_f ? true : false;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            var6 = Kickabout.field_G;
            if (-1 == rm.field_C) {
              break L1;
            } else {
              if (!vi.field_n) {
                break L1;
              } else {
                if (-2 != rm.field_C) {
                  if (-3 != rm.field_C) {
                    if ((rm.field_C ^ -1) != -4) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    bv.field_l = new rk[34];
                    var1 = 0;
                    var2 = 0;
                    L2: while (true) {
                      if (-18 <= var2) {
                        var1 = 0;
                        var2 = 17;
                        L3: while (true) {
                          if ((var2 ^ -1) <= -35) {
                            break L0;
                          } else {
                            if (p.a((byte) -24, 3) != 0) {
                              var3 = 1424;
                              var4 = p.a((byte) -24, 5);
                              var5 = p.a((byte) -24, 100);
                              bv.field_l[var2] = new rk(var1 - -var4, var3 - -var5, 4);
                              var1 += 54;
                              var2++;
                              continue L3;
                            } else {
                              var1 += 54;
                              var2++;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        if (p.a((byte) -24, 3) != 0) {
                          var3 = -170;
                          var4 = p.a((byte) -24, 5);
                          var5 = p.a((byte) -24, 100);
                          bv.field_l[var2] = new rk(var4 + var1, var5 + var3, 0);
                          var1 += 54;
                          var2++;
                          continue L2;
                        } else {
                          var1 += 54;
                          var2++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  bv.field_l = new rk[30];
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= bv.field_l.length) {
                      break L0;
                    } else {
                      L5: {
                        if (ih.field_c != 2) {
                          stackOut_7_0 = -60;
                          stackIn_8_0 = stackOut_7_0;
                          break L5;
                        } else {
                          stackOut_6_0 = -120;
                          stackIn_8_0 = stackOut_6_0;
                          break L5;
                        }
                      }
                      L6: {
                        var2 = stackIn_8_0;
                        var2 = el.a(29430, 15, var2);
                        var3 = 20 + var1 * 45;
                        var4 = 6;
                        if (0 == p.a((byte) -24, 2)) {
                          var4 = 2;
                          var2 = 896 + -var2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      bv.field_l[var1] = new rk(var2, var3, var4);
                      var1++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
          bv.field_l = null;
          break L0;
        }
        L7: {
          if (param0) {
            break L7;
          } else {
            boolean discarded$1 = vb.b(-46);
            break L7;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Go Back";
        field_b = 0;
        field_i = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_f = "Camera unlocked. Press 'Shift' + 'Enter' to attach.";
        field_c = Math.atan2(1.0, 0.0);
        field_g = new byte[1000][];
    }
}
