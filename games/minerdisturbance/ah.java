/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static gh field_a;
    static int field_h;
    static int field_e;
    static ta field_g;
    static int field_b;
    static int field_f;
    static ea[] field_c;
    static ea field_d;
    static boolean field_i;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
        if (!param0) {
            field_f = 2;
        }
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        if (param0 == -97) {
          L0: while (true) {
            L1: {
              if (var5 >= var4) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var2 = var2 * 37L;
                    var6 = param1.charAt(var5);
                    if (var6 < 65) {
                      break L3;
                    } else {
                      if (var6 > 90) {
                        break L3;
                      } else {
                        var2 = var2 + (long)(var6 + -64);
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var6 < 97) {
                      break L4;
                    } else {
                      if (var6 > 122) {
                        break L4;
                      } else {
                        var2 = var2 + (long)(-97 + (1 + var6));
                        break L2;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L2;
                  } else {
                    if (var6 > 57) {
                      break L2;
                    } else {
                      var2 = var2 + (long)(27 + var6 - 48);
                      break L2;
                    }
                  }
                }
                if ((var2 ^ -1L) <= -177917621779460414L) {
                  break L1;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
            L5: while (true) {
              L6: {
                if (0L != var2 % 37L) {
                  break L6;
                } else {
                  if (var2 == 0L) {
                    break L6;
                  } else {
                    var2 = var2 / 37L;
                    continue L5;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return -72L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20;
        field_a = new gh();
        field_e = -1;
        field_g = new ta();
    }
}
