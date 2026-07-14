/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static sd field_c;
    static String field_b;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < 66) {
            field_a = -92;
        }
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
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = param0.length();
          if (-21 <= (var2 ^ -1)) {
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
            if (param1 != 20) {
              field_b = null;
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
                if (90 < var5) {
                  break L2;
                } else {
                  var3[var4] = (char)(var5 - -32);
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

    final static boolean a(CharSequence param0, boolean param1) {
        if (param1) {
            int discarded$0 = q.a(111, (byte) -112, -29);
            return rj.a(false, param0, (byte) 20);
        }
        return rj.a(false, param0, (byte) 20);
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = 0;
        if (param1 == -36) {
          var4 = fb.field_k;
          L0: while (true) {
            if (pl.field_k.length > var3) {
              var5 = gh.field_a[var3];
              if (var5 >= 0) {
                var6 = hh.a((byte) 74, pl.field_k[var3], true);
                var7 = jc.field_b + -(var6 >> 1710126753);
                var4 = var4 + ud.field_a;
                if (lf.a(param1 + -19828, param2, param0, hb.field_n + (vf.field_b << 2020137185), (pl.field_h << 559599169) + var6, -pl.field_h + var7, var4)) {
                  return var5;
                } else {
                  var4 = var4 + (hb.field_n + ud.field_a + (vf.field_b << 1662215201));
                  var3++;
                  var3++;
                  continue L0;
                }
              } else {
                var4 = var4 + gi.field_a;
                var3++;
                var3++;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          field_c = null;
          var4 = fb.field_k;
          if (pl.field_k.length > var3) {
            L1: {
              var5 = gh.field_a[var3];
              if (var5 >= 0) {
                var6 = hh.a((byte) 74, pl.field_k[var3], true);
                var7 = jc.field_b + -(var6 >> 1710126753);
                var4 = var4 + ud.field_a;
                if (lf.a(param1 + -19828, param2, param0, hb.field_n + (vf.field_b << 2020137185), (pl.field_h << 559599169) + var6, -pl.field_h + var7, var4)) {
                  return var5;
                } else {
                  var4 = var4 + (hb.field_n + ud.field_a + (vf.field_b << 1662215201));
                  break L1;
                }
              } else {
                var4 = var4 + gi.field_a;
                var3++;
                break L1;
              }
            }
            var3++;
            var3++;
            var3++;
            return -1;
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sd();
        field_b = "Unpacking levels";
        field_a = 0;
    }
}
