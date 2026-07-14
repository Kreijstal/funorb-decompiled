/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static hr field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dk a(String param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        dk var5 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if (var2 != -1) {
                L1: {
                  var3 = param0.substring(0, var2);
                  var4 = param0.substring(1 + var2);
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    field_b = null;
                    break L1;
                  }
                }
                var5 = g.a((byte) -126, var3);
                if (var5 == null) {
                  return lh.a(var4, -1);
                } else {
                  return var5;
                }
              } else {
                return qo.field_a;
              }
            } else {
              break L0;
            }
          }
        }
        return en.field_j;
    }

    final static boolean a(boolean param0, ki param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -10) {
            if (!param0) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (-10 >= (var4 ^ -1)) {
                  qr.field_b.field_x.a((byte) 28);
                  qr.field_b.field_r.a((byte) 28);
                  return true;
                } else {
                  if (nt.field_m[var4] != null) {
                    if (!qr.field_b.field_r.a(eb.field_b, nt.field_m[var4], -1, param1, 176400)) {
                      return false;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            if (null != nt.field_m[var2]) {
              if (!qr.field_b.field_x.a(eb.field_b, nt.field_m[var2], -1, param1, 176400)) {
                return false;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26238) {
            field_a = 82;
        }
    }

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + aw.a("%0a", param1, "\n", true));
        if (param0 < 4) {
            il.a(81);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
