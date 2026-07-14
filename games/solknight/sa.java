/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends gg {
    static int field_i;
    byte[] field_k;
    long field_h;
    static nc field_n;
    static int field_o;
    int field_j;
    static int field_m;
    static int[] field_l;

    public static void a(byte param0) {
        int var1 = 45 % ((param0 - 7) / 58);
        field_n = null;
        field_l = null;
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = SolKnight.field_L ? 1 : 0;
          var2 = param0.length();
          if ((var2 ^ -1) < -21) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (!param1) {
              field_m = -44;
              return new String(var8);
            } else {
              return new String(var8);
            }
          } else {
            L2: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 > 90) {
                  break L2;
                } else {
                  var3[var4] = (char)(var5 + 32);
                  var4++;
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (122 >= var5) {
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
                  if (var5 > 57) {
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

    sa(long param0, int param1, byte[] param2) {
        ((sa) this).field_k = param2;
        ((sa) this).field_h = param0;
        ((sa) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 5;
        field_n = new nc();
    }
}
