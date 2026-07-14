/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static long field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, float param1, float param2, ei param3, ei param4) {
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var10 = HoldTheLine.field_D;
        var5 = (int)param2;
        if (param0 == 2) {
          var6 = (int)param1;
          var7 = (float)(-var5) + param2;
          var8 = (float)(-var6) + param1;
          if (var6 != var5) {
            if (var5 >= var6) {
              if (0.0f < var7) {
                param4.a((Object) (Object) td.a(150, var7, (vj) param3.field_b[var5]).c(false), (byte) 6);
                var11 = -1 + var5;
                var9 = var11;
                L0: while (true) {
                  if (var6 >= var11) {
                    param4.a((Object) (Object) ik.a(119, (vj) param3.field_b[var6], var8).c(false), (byte) 6);
                    return;
                  } else {
                    param4.a((Object) (Object) ((vj) param3.field_b[var11]).c(false), (byte) 6);
                    var11--;
                    continue L0;
                  }
                }
              } else {
                var11 = -1 + var5;
                var9 = var11;
                L1: while (true) {
                  if (var6 >= var11) {
                    param4.a((Object) (Object) ik.a(119, (vj) param3.field_b[var6], var8).c(false), (byte) 6);
                    return;
                  } else {
                    param4.a((Object) (Object) ((vj) param3.field_b[var11]).c(false), (byte) 6);
                    var11--;
                    continue L1;
                  }
                }
              }
            } else {
              param4.a((Object) (Object) ik.a(92, (vj) param3.field_b[var5], var7), (byte) 6);
              var9 = var5 - -1;
              L2: while (true) {
                if (var6 <= var9) {
                  if (var8 > 0.0f) {
                    param4.a((Object) (Object) td.a(param0 + 148, var8, (vj) param3.field_b[var6]), (byte) 6);
                    return;
                  } else {
                    return;
                  }
                } else {
                  param4.a(param3.field_b[var9], (byte) 6);
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            L3: {
              if (var7 != var8) {
                param4.a((Object) (Object) fk.a(1, var8, (vj) param3.field_b[var5], var7), (byte) 6);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        var5 = new int[2 * param2];
        var3 = var5;
        var4 = 0;
        L0: while (true) {
          if (param2 <= var4) {
            if (param0 > -1) {
              field_d = 35;
              return var5;
            } else {
              return var5;
            }
          } else {
            var5[var4 * 2] = var4;
            var5[2 * var4 + 1] = param1;
            var4++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = 15 / ((param0 - -77) / 48);
        field_b = null;
    }

    final static bm a(boolean param0) {
        bm var1 = null;
        if (!param0) {
          return null;
        } else {
          var1 = new bm(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], lk.field_e[0], dd.field_E);
          tk.a(false);
          return var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = "Not yet achieved";
    }
}
