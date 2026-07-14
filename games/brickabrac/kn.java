/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends tk {
    boolean field_A;
    int[] field_x;
    static int field_z;
    static String[] field_E;
    String field_D;
    static int field_y;
    char[] field_u;
    static volatile boolean field_C;
    int[] field_v;
    char[] field_w;

    private final void a(int param0, wq param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_16_2 = 0;
        char[] stackOut_13_0;
        int stackOut_13_1;
        char[] stackOut_15_0;
        int stackOut_15_1;
        char stackOut_15_2;
        char[] stackOut_14_0;
        int stackOut_14_1;
        char stackOut_14_2;
        char[] stackOut_6_0;
        int stackOut_6_1;
        char[] stackOut_8_0;
        int stackOut_8_1;
        char stackOut_8_2;
        char[] stackOut_7_0;
        int stackOut_7_1;
        char stackOut_7_2;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (param0 > 59) {
            break L0;
          } else {
            field_z = -79;
            break L0;
          }
        }
        L1: {
          if (1 == param2) {
            ((kn) this).field_D = param1.d(-1);
            break L1;
          } else {
            if (-3 != (param2 ^ -1)) {
              if (-4 != (param2 ^ -1)) {
                if (param2 != 4) {
                  break L1;
                } else {
                  ((kn) this).field_A = true;
                  break L1;
                }
              } else {
                var4 = param1.l(255);
                ((kn) this).field_u = new char[var4];
                ((kn) this).field_v = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    L3: {
                      ((kn) this).field_v[var5] = param1.i(65280);
                      var6 = param1.b(true);
                      stackOut_13_0 = ((kn) this).field_u;
                      stackOut_13_1 = var5;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (0 == var6) {
                        stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (char)0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L3;
                      } else {
                        stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = cq.a((byte) -11, (byte) var6);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L3;
                      }
                    }
                    stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              var4 = param1.l(255);
              ((kn) this).field_x = new int[var4];
              ((kn) this).field_w = new char[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  L5: {
                    ((kn) this).field_x[var5] = param1.i(65280);
                    var6 = param1.b(true);
                    stackOut_6_0 = ((kn) this).field_w;
                    stackOut_6_1 = var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (0 == var6) {
                      stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = (char)0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L5;
                    } else {
                      stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = cq.a((byte) -112, (byte) var6);
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L5;
                    }
                  }
                  stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 <= 44) {
            kn.a((byte) -32);
        }
    }

    final void a(wq param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param1 == -29539) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.l(255);
          if (0 != var3) {
            this.a(104, param0, var3);
            continue L1;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (11 == i.field_j) {
            mk.a(-1);
        }
        if (!param0) {
            kn.a((byte) -116);
        }
        bf.a(ri.field_N, 8192, ep.field_a, vq.field_C);
        ck.a(param1, 0, 14209, 0);
    }

    final void c(byte param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -86) {
            Object var4 = null;
            kn.a(false, (java.awt.Canvas) null);
        }
        if (null != ((kn) this).field_v) {
            for (var2 = 0; var2 < ((kn) this).field_v.length; var2++) {
                ((kn) this).field_v[var2] = ud.d(((kn) this).field_v[var2], 32768);
            }
        }
        if (((kn) this).field_x != null) {
            var5 = 0;
            var2 = var5;
            while (var5 < ((kn) this).field_x.length) {
                ((kn) this).field_x[var5] = ud.d(((kn) this).field_x[var5], 32768);
                var5++;
            }
        }
    }

    kn() {
        ((kn) this).field_A = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = false;
    }
}
