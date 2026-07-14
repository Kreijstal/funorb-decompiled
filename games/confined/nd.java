/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nd extends jl {
    static int field_s;
    static String field_u;
    int field_t;

    public static void c(int param0) {
        field_u = null;
        if (param0 != 30661) {
            field_u = null;
        }
    }

    abstract boolean f(byte param0);

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          if (param1 == -18) {
            break L0;
          } else {
            nd.c(-35);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 <= 0) {
              break L2;
            } else {
              if (param0 < 128) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param0 < 160) {
              if (param0 != 0) {
                var6 = cd.field_m;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 == param0) {
                      return true;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            } else {
              if (param0 <= 255) {
                break L1;
              } else {
                if (param0 != 0) {
                  var6 = cd.field_m;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L3;
                    } else {
                      var4 = var6[var3];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        od var3 = null;
        int var4 = Confined.field_J ? 1 : 0;
        if (param0 != 18) {
            return;
        }
        for (var1 = 1; -4 < (var1 ^ -1); var1++) {
            for (var2 = 0; 4 > var2; var2++) {
                bf.field_R[var1][var2] = new od(bf.field_R[-1 + var1][var2], false, true, true, true);
                var3 = new od(bf.field_R[-1 + var1][var2], false, true, true, true);
                var3.a(80, 80, 80);
            }
        }
    }

    abstract Object d(int param0);

    nd(int param0) {
        ((nd) this).field_t = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "<col=FFFFFF>Wing pods:</col> pilotless ships that surround your ship, back up some of your weapons with extra power, collect power-ups for you, and occasionally take enemy attacks for you. You can have up to five.";
    }
}
