/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends mc {
    private boolean[] field_n;
    int field_o;
    int[][] field_q;
    int[] field_s;
    static String field_t;
    int field_r;
    int[] field_p;

    final static boolean a(byte param0, String param1, String param2) {
        if (q.a(false, param1)) {
            return false;
        }
        if (!(!ha.a(param1, -63))) {
            return false;
        }
        if (pi.a(param1, 17510)) {
            return false;
        }
        if (!(param2.length() != 0)) {
            return true;
        }
        if (!(!jd.a(param1, -6270, param2))) {
            return false;
        }
        if (param0 != -41) {
            oe.a(true);
        }
        if (mf.a((byte) 29, param2, param1)) {
            return false;
        }
        if (qa.a(param0 ^ -16757, param1, param2)) {
            return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
            oe.a(false);
        }
    }

    oe(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        bh var7 = null;
        bh var8 = null;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        ((oe) this).field_o = param0;
        var7 = new bh(param1);
        var8 = var7;
        ((oe) this).field_r = var8.d((byte) -99);
        ((oe) this).field_p = new int[((oe) this).field_r];
        ((oe) this).field_s = new int[((oe) this).field_r];
        ((oe) this).field_q = new int[((oe) this).field_r][];
        ((oe) this).field_n = new boolean[((oe) this).field_r];
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((oe) this).field_r) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((oe) this).field_r) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((oe) this).field_r) {
                    var4 = 0;
                    L3: while (true) {
                      if (((oe) this).field_r <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (((oe) this).field_r <= var4) {
                            return;
                          } else {
                            var5 = 0;
                            L5: while (true) {
                              if (((oe) this).field_q[var4].length <= var5) {
                                var4++;
                                continue L4;
                              } else {
                                ((oe) this).field_q[var4][var5] = var7.d((byte) -99);
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ((oe) this).field_q[var4] = new int[var7.d((byte) -99)];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((oe) this).field_s[var4] = var7.e(127);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  stackOut_5_0 = ((oe) this).field_n;
                  stackOut_5_1 = var4;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (-2 != (var8.d((byte) -99) ^ -1)) {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L6;
                  } else {
                    stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L6;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                var4++;
                continue L1;
              }
            }
          } else {
            ((oe) this).field_p[var4] = var7.d((byte) -99);
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Connecting to<br>friend server...";
    }
}
