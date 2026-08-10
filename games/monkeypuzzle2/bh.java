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
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var12;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 0) {
          var18 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          var1 = var18;
          if (-1 > (rc.field_f ^ -1)) {
            var1 = var18 + ":";
            var2 = 0;
            L0: while (true) {
              if (rc.field_f > var2) {
                L1: {
                  var19 = var1 + ' ';
                  var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                  var4 = var3 >> -1395198204;
                  var3 = var3 & 15;
                  if ((var4 ^ -1) <= -11) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var20 = var19 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var20 + (char)var3;
                var2++;
                continue L0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          field_j = -79;
          var12 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          var1 = var12;
          if (-1 > (rc.field_f ^ -1)) {
            var1 = var12 + ":";
            var2 = 0;
            L3: while (true) {
              if (rc.field_f > var2) {
                L4: {
                  var16 = var1 + ' ';
                  var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                  var4 = var3 >> -1395198204;
                  var3 = var3 & 15;
                  if ((var4 ^ -1) <= -11) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var17 = var16 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var17 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    static {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
