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
        if (param0 != 23801) {
          field_b = (sl) null;
          field_d = null;
          field_b = null;
          field_c = (int[][]) null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_c = (int[][]) null;
          return;
        }
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 260) {
              var10 = id.field_b;
              var2 = var10.j(-123);
              var3 = var10.j(param0 ^ -361);
              if (0 != var2) {
                if (1 == var2) {
                  var4 = var10.e((byte) -92);
                  var5 = (bk) ((Object) na.field_d.c((byte) -68));
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
                        var5 = (bk) ((Object) na.field_d.c(-270));
                        continue L1;
                      }
                    }
                    if (var5 == null) {
                      ob.b(param0 ^ -357);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var5.a(true);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  td.a("LR1: " + ck.a(-13299), (Throwable) null, (byte) -80);
                  ob.b(param0 ^ -363);
                  return;
                }
              } else {
                var4_ref_tc = (tc) ((Object) gf.field_q.c((byte) -79));
                if (var4_ref_tc == null) {
                  ob.b(-100);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = bb.field_i + -var10.field_q;
                    var12 = var4_ref_tc.field_n;
                    var11 = var12;
                    var6 = var11;
                    if (var5_int > var12.length << -805190558) {
                      var5_int = var12.length << 1503055586;
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
                      var6[var7 >> 1401436930] = var6[var7 >> 1401436930] + (var10.j(-103) << jh.a(var7 << -1786691480, 768));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "wj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_c = new int[][]{null, null, null, null, null, null, null, null, null, new int[]{1, 59, 579, 424, 464, 40, 0, 260, 40, 5, 5, 11, 9, 8, 7, 20, 4, 3, -1, 0, 8}, null, null, null, null, null, null};
        field_b = new sl();
        field_e = 0;
        field_d = "Help text missing from post: ";
    }
}
