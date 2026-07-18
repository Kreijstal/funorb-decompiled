/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends gn {
    int[] field_r;
    int field_h;
    int field_g;
    int field_f;
    static int field_q;
    int field_i;
    int field_n;
    int field_k;
    static String field_p;
    static int[][] field_l;
    static boolean field_m;
    static String field_j;
    static int[][] field_o;
    int field_e;

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        field_j = null;
        field_o = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ml var2 = null;
        int var3 = 0;
        int var4 = 0;
        dl var5 = null;
        int var5_int = 0;
        hr var6_ref_hr = null;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            var2 = un.field_e;
            var3 = var2.h((byte) -123);
            var4 = var2.h((byte) -112);
            if (0 == var3) {
              var5 = (dl) (Object) ru.field_M.g(24009);
              if (var5 == null) {
                lr.b((byte) -116);
                return;
              } else {
                L1: {
                  var6 = -var2.field_n + ms.field_b;
                  var14 = var5.field_f;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var7 = var11;
                  if (var14.length << 2 < var6) {
                    var6 = var14.length << 2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var8 = 0;
                L2: while (true) {
                  if (var6 <= var8) {
                    var5.c((byte) -109);
                    break L0;
                  } else {
                    var7[var8 >> 2] = var7[var8 >> 2] + (var2.h((byte) -118) << (qj.b(3, var8) << 8));
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              if (var3 != 1) {
                bd.a("LR1: " + tr.b(0), (Throwable) null, 1);
                lr.b((byte) -116);
                return;
              } else {
                var5_int = var2.e(85);
                var6_ref_hr = (hr) (Object) ti.field_c.g(24009);
                L3: while (true) {
                  L4: {
                    if (var6_ref_hr == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var6_ref_hr.field_j != var4) {
                          break L5;
                        } else {
                          if (var6_ref_hr.field_i != var5_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6_ref_hr = (hr) (Object) ti.field_c.c(33);
                      continue L3;
                    }
                  }
                  if (var6_ref_hr != null) {
                    var6_ref_hr.c((byte) -109);
                    return;
                  } else {
                    lr.b((byte) -116);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "sm.B(" + 103 + ')');
        }
    }

    private sm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_p = "Drag a player from the grid to fill slot <%0> on the pitch.<br>Click ready when done.";
        field_m = true;
        field_o = new int[][]{new int[3], new int[3]};
        field_j = "Loading HUDs";
    }
}
