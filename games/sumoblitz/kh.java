/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_e;
    static byte[][] field_f;
    static int[][] field_c;
    static wb field_a;
    static String field_d;
    static int[] field_b;

    final static boolean a(pl param0, boolean param1) {
        if (param1) {
            field_b = null;
        }
        return param0.b(1, (byte) -116) == 1 ? true : false;
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
          var6 = Sumoblitz.field_L ? 1 : 0;
          var2 = param0.length();
          if (var2 <= 20) {
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
          if (var4 >= var2) {
            if (param1 == 1457) {
              return new String(var8);
            } else {
              return null;
            }
          } else {
            L2: {
              var5 = param0.charAt(var4);
              if (65 > var5) {
                break L2;
              } else {
                if (90 >= var5) {
                  var3[var4] = (char)(97 + (-65 + var5));
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
                  if (57 >= var5) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L1;
          }
        }
    }

    final static void a(boolean param0) {
        lr.a(true, bi.field_d, (byte) 122, in.field_C);
        if (param0) {
            field_c = null;
        }
        ih.field_c = true;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 2) {
            Object var2 = null;
            boolean discarded$0 = kh.a((pl) null, true);
        }
        field_c = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[1000][];
        field_b = new int[2];
    }
}
