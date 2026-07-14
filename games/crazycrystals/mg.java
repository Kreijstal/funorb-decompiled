/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg {
    static dl[] field_b;
    static String field_h;
    static ko field_d;
    static int field_e;
    static db field_c;
    static int field_a;
    static db field_g;
    static String field_f;

    abstract void a(ng param0, byte param1);

    abstract wh a(int param0);

    public static void b(int param0) {
        if (param0 >= -86) {
          field_a = -24;
          field_d = null;
          field_g = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_g = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, db param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (le.field_g != null) {
          if (param0 >= -99) {
            L0: {
              mg.b(-23);
              var2 = 0;
              if (-5 >= (var2 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (null != le.field_g[var2]) {
                    var2++;
                    break L1;
                  } else {
                    le.field_g[var2] = bf.a(-1, oe.field_d[var2], "", param1);
                    var2++;
                    break L1;
                  }
                }
                var2++;
                var2++;
                break L0;
              }
            }
            return;
          } else {
            L2: {
              var2 = 0;
              if (-5 >= (var2 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (null != le.field_g[var2]) {
                    var2++;
                    break L3;
                  } else {
                    le.field_g[var2] = bf.a(-1, oe.field_d[var2], "", param1);
                    var2++;
                    break L3;
                  }
                }
                var2++;
                var2++;
                break L2;
              }
            }
            return;
          }
        } else {
          le.field_g = new dl[4][];
          cd.field_v = new int[10];
          cd.field_v[2] = 8;
          cd.field_v[7] = 12;
          cd.field_v[6] = 8;
          cd.field_v[1] = 4;
          cd.field_v[5] = 4;
          cd.field_v[9] = 12;
          if (param0 < -99) {
            L4: {
              var2 = 0;
              if (-5 >= (var2 ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (null != le.field_g[var2]) {
                    var2++;
                    break L5;
                  } else {
                    le.field_g[var2] = bf.a(-1, oe.field_d[var2], "", param1);
                    var2++;
                    break L5;
                  }
                }
                var2++;
                var2++;
                var2++;
                break L4;
              }
            }
            return;
          } else {
            L6: {
              mg.b(-23);
              var2 = 0;
              if (-5 >= (var2 ^ -1)) {
                break L6;
              } else {
                L7: {
                  if (null != le.field_g[var2]) {
                    var2++;
                    break L7;
                  } else {
                    le.field_g[var2] = bf.a(-1, oe.field_d[var2], "", param1);
                    var2++;
                    break L7;
                  }
                }
                var2++;
                var2++;
                break L6;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Hole";
        field_e = 100;
        field_f = "Please check if address is correct";
    }
}
