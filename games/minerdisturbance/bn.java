/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn implements uj {
    static boolean[] field_b;
    static we field_d;
    static int field_c;
    static String field_a;

    public final String a(byte param0) {
        int var2 = -71 / ((-33 - param0) / 62);
        return "Done Editing";
    }

    public final void a(boolean param0) {
        tb.field_a = 0;
        if (param0) {
            boolean discarded$0 = bn.a(126, 'ﾂ');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != 160) {
            boolean discarded$0 = bn.a(-15, '￬');
        }
    }

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = MinerDisturbance.field_ab;
            if (param1 <= 0) {
              break L1;
            } else {
              if (128 > param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              var2 = -111 / ((param0 - 28) / 63);
              if (param1 != 0) {
                var3 = tk.field_e;
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var3.length) {
                    break L2;
                  } else {
                    var5 = var3[var4];
                    if (var5 != param1) {
                      var4++;
                      continue L3;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              if (param1 <= 255) {
                break L0;
              } else {
                var2 = -111 / ((param0 - 28) / 63);
                if (param1 != 0) {
                  var3 = tk.field_e;
                  var4 = 0;
                  L4: while (true) {
                    if (var4 >= var3.length) {
                      break L2;
                    } else {
                      var5 = var3[var4];
                      if (var5 != param1) {
                        var4++;
                        continue L4;
                      } else {
                        return true;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[21];
        field_a = "Ranking: Mega Miner";
    }
}
