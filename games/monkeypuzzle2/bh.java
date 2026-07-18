/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static int field_j;
    int field_a;
    static int field_e;
    int field_d;
    static int field_f;
    static String field_b;
    int field_l;
    int field_k;
    int field_c;
    static int field_g;
    int field_i;
    static String field_h;

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -8765) {
            bh.a(68);
        }
    }

    abstract void a(int param0, int param1);

    final static String a(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 0) {
          var15 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          if (rc.field_f > 0) {
            var1 = var15 + ":";
            var2 = 0;
            L0: while (true) {
              if (rc.field_f > var2) {
                L1: {
                  var16 = var1 + ' ';
                  var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (var4 >= 10) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var17 = var16 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var17 + (char)var3;
                var2++;
                continue L0;
              } else {
                return var1;
              }
            }
          } else {
            return var15;
          }
        } else {
          field_j = -79;
          var9 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          if (rc.field_f > 0) {
            var1 = var9 + ":";
            var2 = 0;
            L3: while (true) {
              if (rc.field_f > var2) {
                L4: {
                  var13 = var1 + ' ';
                  var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (var4 >= 10) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var14 = var13 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var14 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var9;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
