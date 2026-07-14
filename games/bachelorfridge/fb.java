/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends td {
    static int field_p;
    static kv field_r;
    static String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 != -91) {
            field_r = null;
        }
        field_q = null;
    }

    fb(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        fna var4 = null;
        int[][] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        ko var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        aga var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int[][] var20 = null;
        int[] var21 = null;
        int[][] var22 = null;
        int[] var23 = null;
        var12 = BachelorFridge.field_y;
        var15 = ((fb) this).field_h.a(40, param0);
        var4 = new fna(((fb) this).field_g, new nq(var15));
        var22 = new int[param0.g((byte) 79)][2];
        var20 = var22;
        var18 = var20;
        var16 = var18;
        var5 = var16;
        var6 = 0;
        var7_int = 0;
        L0: while (true) {
          if (param0.field_d <= var7_int) {
            var23 = new int[var22.length];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var7 = var17;
            var13 = 0;
            var8_int = var13;
            L1: while (true) {
              if (var13 >= var23.length) {
                var8 = new ko(new int[1]);
                var6 = 0;
                var9 = 0;
                L2: while (true) {
                  if (var23.length <= var9) {
                    L3: {
                      var9 = 0;
                      if (param1 == 3) {
                        break L3;
                      } else {
                        field_p = 40;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (param0.field_d <= var9) {
                        return (ii) (Object) var4;
                      } else {
                        var14 = 0;
                        var10 = var14;
                        L5: while (true) {
                          if (-8 >= (var14 ^ -1)) {
                            var9++;
                            continue L4;
                          } else {
                            if (this.a(param0.field_S[var9].field_b[var14], -8, param0)) {
                              var4.field_o.a((bw) (Object) new cn(new nq(param0.field_S[var9].field_b[var14]), var5[var23[var6]][0], var5[var23[var6]][1]), true);
                              var6++;
                              var14++;
                              continue L5;
                            } else {
                              var14++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = var8.a(-21000, var23.length);
                    var11 = var23[var10];
                    var7[var10] = var23[var9];
                    var23[var9] = var11;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var23[var13] = var13;
                var13++;
                continue L1;
              }
            }
          } else {
            var8_int = 0;
            L6: while (true) {
              if (7 <= var8_int) {
                var7_int++;
                continue L0;
              } else {
                if (this.a(param0.field_S[var7_int].field_b[var8_int], -8, param0)) {
                  var5[var6] = new int[2];
                  var6++;
                  var8_int++;
                  continue L6;
                } else {
                  var8_int++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final boolean a(aga param0, int param1, op param2) {
        if (param0 == null) {
            return false;
        }
        if (param0.i(param1 + 116)) {
            return false;
        }
        if (!(!param0.a(32, (byte) 60))) {
            return false;
        }
        if (param1 != -8) {
            return false;
        }
        if (param2.b(false, param2.field_a[param0.field_x][param0.field_J].field_n) == -1) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "***No Target!***";
    }
}
