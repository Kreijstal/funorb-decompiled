/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_a;
    static int field_g;
    static char[] field_b;
    static int[] field_c;
    static ll field_f;
    static int field_e;
    static String field_d;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 84) {
          field_e = -83;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = HoldTheLine.field_D;
          var2 = param1.length();
          if ((var2 ^ -1) >= -21) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (param0 != 90) {
              d.a(-128);
              return new String(var8);
            } else {
              return new String(var8);
            }
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(32 + var5);
                  var4++;
                  var4++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (57 < var5) {
                    break L5;
                  } else {
                    break L3;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            var4++;
            continue L1;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = hg.a((byte) 95);
        if (param0) {
          return;
        } else {
          var2 = ml.b(20719);
          nc.field_c.a(ie.field_j - bi.field_g, (bi.field_g << 1475246337) + var2, -51, var1 - -(em.field_j << 1309317569), -em.field_j + mk.field_d);
          mk.c(117);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your email address is used to identify this account";
        field_b = new char[128];
        field_g = 64;
        field_d = "Cancel";
    }
}
