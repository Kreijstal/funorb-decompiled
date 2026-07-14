/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends an {
    static String field_E;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static int[] field_G;

    fm(String param0, sk param1, boolean param2) {
        this(param0, param1);
        ((fm) this).field_x = param2 ? true : false;
    }

    private fm(String param0, sk param1) {
        this(param0, se.field_j.field_a, param1);
        ((fm) this).field_h = se.field_j.field_g;
    }

    private fm(String param0, io param1, sk param2) {
        super(param0, param1, param2);
        ((fm) this).field_h = se.field_j.field_g;
    }

    final static void b(boolean param0) {
        int[] var3 = null;
        int[] var9 = null;
        am var5 = null;
        int var6 = 0;
        int var7 = 0;
        b var12 = null;
        int[] var10 = null;
        bo var11 = null;
        b var14 = null;
        int var8 = ZombieDawn.field_J;
        am var13 = fj.field_g;
        int var2 = var13.d((byte) -116);
        if (!param0) {
            field_G = null;
        }
        if (var2 == 0) {
            var10 = ae.a(14821);
            var3 = var10;
            var9 = var10;
            int[] var4 = var9;
            var5 = var13;
            var6 = ((de) (Object) var5).d((byte) -124);
            for (var7 = 0; var6 > var7; var7++) {
                var9[var7] = ((de) (Object) var5).c(-90);
            }
            var12 = (b) (Object) qi.field_J.b((byte) 26);
            if (!(var12 != null)) {
                p.a(1);
                return;
            }
            var12.field_o = true;
            var12.field_k = var3;
            var12.b(-27598);
        } else {
            if ((var2 ^ -1) == -2) {
                var11 = (bo) (Object) mp.field_g.b((byte) 26);
                if (!(var11 != null)) {
                    p.a(1);
                    return;
                }
                var11.b(-27598);
            } else {
                if (2 == var2) {
                    var14 = (b) (Object) qi.field_J.b((byte) 26);
                    if (!(var14 != null)) {
                        p.a(1);
                        return;
                    }
                    var14.field_k = ae.a(14821);
                    var14.field_o = true;
                    var14.b(-27598);
                } else {
                    ae.a((Throwable) null, 10331, "A1: " + cb.f(3));
                    p.a(1);
                }
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((fm) this).field_x = !((fm) this).field_x ? true : false;
        int var5 = -35 / ((-12 - param1) / 56);
        super.b(param0, -73, param2, param3);
    }

    public static void a(int param0) {
        field_H = null;
        field_G = null;
        field_I = null;
        field_E = null;
        if (param0 != 12959) {
            field_G = null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!vi.a(31153, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!vi.a(31153, param0.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (-2 >= (var4 ^ -1)) {
                if (var4 <= 12) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    if (param1 < -34) {
                      break L4;
                    } else {
                      fm.b(true);
                      break L4;
                    }
                  }
                  var6 = var2;
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (bh.a((char) var7, false)) {
                        var8 = qj.a(-122, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Unfortunately you are not eligible to create an account.";
        field_I = "The living have defeated your shambling advance.";
        field_F = true;
        field_H = "Level Selection";
        field_G = new int[8192];
    }
}
