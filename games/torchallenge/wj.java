/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static int[][] field_c;
    static sl field_b;
    static int field_e;
    static int field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        tc var4_ref_tc = null;
        int var4 = 0;
        bk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pa var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var10 = id.field_b;
            var2 = var10.j(-123);
            var3 = var10.j(-109);
            if (0 != var2) {
              if (1 == var2) {
                var4 = var10.e((byte) -92);
                var5 = (bk) (Object) na.field_d.c((byte) -68);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var3 != var5.field_v) {
                          break L3;
                        } else {
                          if (var4 == var5.field_o) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = (bk) (Object) na.field_d.c(-270);
                      continue L1;
                    }
                  }
                  if (var5 == null) {
                    ob.b(-97);
                    return;
                  } else {
                    var5.a(true);
                    break L0;
                  }
                }
              } else {
                td.a("LR1: " + ck.a(-13299), (Throwable) null, (byte) -80);
                ob.b(-111);
                return;
              }
            } else {
              var4_ref_tc = (tc) (Object) gf.field_q.c((byte) -79);
              if (var4_ref_tc == null) {
                ob.b(-100);
                return;
              } else {
                L4: {
                  var5_int = bb.field_i + -var10.field_q;
                  var14 = var4_ref_tc.field_n;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5_int > var14.length << 2) {
                    var5_int = var14.length << 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var5_int <= var7) {
                    var4_ref_tc.field_i = true;
                    var4_ref_tc.a(true);
                    return;
                  } else {
                    var6[var7 >> 2] = var6[var7 >> 2] + (var10.j(-103) << jh.a(var7 << 8, 768));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "wj.B(" + 260 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[][]{null, null, null, null, null, null, null, null, null, new int[21], null, null, null, null, null, null};
        field_b = new sl();
        field_e = 0;
        field_d = "Help text missing from post: ";
    }
}
