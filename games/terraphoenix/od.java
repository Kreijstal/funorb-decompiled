/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ba[] field_h;
    static re[] field_c;
    static String field_b;
    static bg field_e;
    static boolean field_a;
    static String field_f;
    static o field_g;
    static String field_d;

    final static boolean b(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 255) {
            break L0;
          } else {
            var2 = null;
            od.a((dc) null, (byte) -95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ig.field_e == null) {
              break L2;
            } else {
              if (!mh.field_a.a(true)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(dc param0, byte param1) {
        int var2 = 0;
        dc var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param0.field_h == null) {
          return;
        } else {
          L0: {
            L1: {
              if (param0.field_f != 0) {
                break L1;
              } else {
                if (param0.field_j == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= am.field_J) {
                break L0;
              } else {
                var3 = ra.field_i[var2];
                if ((var3.field_l ^ -1) == -3) {
                  if (var3.field_f == param0.field_f) {
                    if (var3.field_j == param0.field_j) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param0.field_i != null) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1 <= -92) {
              break L4;
            } else {
              field_b = null;
              break L4;
            }
          }
          jd.a(param0, (byte) -119);
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_h = null;
        if (param0 != 21) {
            boolean discarded$0 = od.b(-64);
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new re[21];
        field_b = "Waiting for music";
        field_h = new ba[255];
        for (var0 = 0; field_h.length > var0; var0++) {
            field_h[var0] = new ba();
        }
        field_f = "Start the mission";
        field_g = new o();
        field_d = "Close minimap";
    }
}
