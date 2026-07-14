/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends gp {
    static int field_y;
    int[] field_w;
    static int field_u;
    private int[][] field_A;
    static int field_x;
    private int[] field_C;
    static int field_v;
    static er[] field_z;
    private String[] field_t;

    public static void i(int param0) {
        field_z = null;
        if (param0 != 0) {
            field_z = null;
        }
    }

    final String h(int param0) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 33) {
            field_v = -73;
        }
        if (!(((q) this).field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((q) this).field_t[0]);
        for (var3 = 1; var3 < ((q) this).field_t.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((q) this).field_t[var3]);
        }
        return var2.toString();
    }

    final void a(ed param0, int param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= -20) {
            Object var5 = null;
            ((q) this).a((ed) null, 11);
        }
        while (true) {
            var3 = param0.h(-11);
            if (var3 == 0) {
                break;
            }
            this.a(param0, 19291, var3);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (((q) this).field_w != null) {
            for (var2 = 0; ((q) this).field_w.length > var2; var2++) {
                ((q) this).field_w[var2] = om.a(((q) this).field_w[var2], 32768);
            }
        }
        if (param0 != 93) {
            ((q) this).a((byte) 117);
        }
    }

    private final void a(ed param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          if (-2 != (param2 ^ -1)) {
            if (2 != param2) {
              if (3 == param2) {
                var4 = param0.h(-11);
                ((q) this).field_C = new int[var4];
                ((q) this).field_A = new int[var4][];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param0.a((byte) -11);
                    var7 = li.a(var6, -72);
                    if (var7 != null) {
                      ((q) this).field_C[var5] = var6;
                      ((q) this).field_A[var5] = new int[var7.field_c];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_c) {
                          ((q) this).field_A[var5][var8] = param0.a((byte) -11);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (4 == param2) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var4 = param0.h(param1 + -19302);
              ((q) this).field_w = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((q) this).field_w[var5] = param0.a((byte) -11);
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((q) this).field_t = jr.a((byte) -9, '<', param0.f(128));
            break L0;
          }
        }
        L4: {
          if (param1 == 19291) {
            break L4;
          } else {
            ((q) this).a((byte) 72);
            break L4;
          }
        }
    }

    q() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 33;
        field_v = 0;
    }
}
