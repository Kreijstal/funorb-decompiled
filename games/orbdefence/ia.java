/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia {
    int field_g;
    static ba field_a;
    int field_h;
    static eb field_f;
    int field_d;
    int field_c;
    int field_b;
    int field_i;
    static int[] field_j;
    static String field_e;

    final static boolean a(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (pi.field_j != null) {
              break L2;
            } else {
              if (gj.c(1024)) {
                break L2;
              } else {
                if (am.field_h != null) {
                  break L2;
                } else {
                  if (!l.a(-1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void a(byte param0) {
        int var1 = 67 / ((66 - param0) / 58);
        field_a = null;
        field_j = null;
        field_f = null;
        field_e = null;
    }

    final static void b(int param0, int param1) {
        ij.field_g = param0;
        if (!(ml.field_c == null)) {
            ml.field_c.b(param0, 111);
        }
        if (!(gi.field_f == null)) {
            gi.field_f.a(0, param0);
        }
        if (param1 != -23235) {
            field_f = null;
        }
    }

    final static void a(int param0, int param1, fb param2) {
        se var3 = uk.field_b;
        var3.i(param1, 126);
        var3.a(2, -29);
        var3.a(0, -63);
        var3.a(param2.field_h, -21);
        if (param0 >= -11) {
            field_a = null;
        }
    }

    final static void a(og param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            L1: {
              var2 = 0;
              if (!param1) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: while (true) {
              if (gl.field_b <= var2) {
                od.field_j[param0.b((byte) -12)] = od.field_j[param0.b((byte) -12)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (gl.field_b <= var3) {
                    gl.field_b = var2;
                    gl.field_b = gl.field_b + 1;
                    jk.field_d[gl.field_b] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_d == jk.field_d[var3].field_d) {
                        var4 = jk.field_d[var3].b((byte) -25);
                        if (df.field_b < od.field_j[var4]) {
                          od.field_j[var4] = od.field_j[var4] - 1;
                          var3++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    jk.field_d[var2] = jk.field_d[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param0.field_d == jk.field_d[var2].field_d) {
                  od.field_j[jk.field_d[var2].b((byte) -63)] = od.field_j[jk.field_d[var2].b((byte) -63)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            od.field_j[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_a = new ba(2, 4, 4, 0);
        field_e = "<%0> BOSS";
    }
}
