/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static aj field_d;
    static boolean[] field_e;
    static int[] field_g;
    static int field_c;
    static la field_a;
    static boolean field_f;
    static int field_b;

    final static java.awt.Container b(int param0) {
        if (!(null == un.field_b)) {
            return (java.awt.Container) (Object) un.field_b;
        }
        if (param0 != 20) {
            field_d = null;
        }
        return (java.awt.Container) (Object) ip.a(9);
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Torquing.field_u;
          var2 = param0.length();
          if (param1 >= 97) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (-21 <= (var2 ^ -1)) {
            break L1;
          } else {
            var2 = 20;
            break L1;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(var5 - -32);
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 < 48) {
                  break L6;
                } else {
                  if (var5 <= 57) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = ah.a((byte) 127, param0);
        int var4 = ao.b(2048, param0);
        int var5 = ah.a((byte) 127, param2);
        int var6 = ao.b(2048, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 425276240);
        int var8 = (int)((long)var3 * (long)var6 >> -1361267824);
        if (param1) {
            java.awt.Container discarded$0 = lp.b(25);
        }
        int var9 = (int)((long)var5 * (long)var4 >> -89329520);
        int var10 = (int)((long)var6 * (long)var4 >> -224405808);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(int param0) {
        if (param0 != 0) {
            java.awt.Container discarded$0 = lp.b(67);
        }
        field_e = null;
        field_a = null;
        field_g = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -2147483648;
        field_b = 0;
    }
}
