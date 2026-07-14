/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends fh {
    int[] field_n;
    String field_p;
    static int field_o;
    char[] field_q;
    char[] field_m;
    boolean field_k;
    int[] field_l;

    final void a(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = VoidHunters.field_G;
        if (((rn) this).field_n != null) {
            for (var2 = 0; ((rn) this).field_n.length > var2; var2++) {
                ((rn) this).field_n[var2] = knb.a(((rn) this).field_n[var2], 32768);
            }
        }
        if (!(((rn) this).field_l == null)) {
            var4 = 0;
            var2 = var4;
            while (((rn) this).field_l.length > var4) {
                ((rn) this).field_l[var4] = knb.a(((rn) this).field_l[var4], 32768);
                var4++;
            }
        }
        if (param0 != 0) {
            ((rn) this).a(63);
        }
    }

    final void a(ds param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param1 != 8452) {
            return;
        }
        while (true) {
            var3 = param0.e((byte) -94);
            if (0 == var3) {
                break;
            }
            this.a(var3, (byte) 19, param0);
        }
    }

    private final void a(int param0, byte param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char stackIn_8_2 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char stackIn_15_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char stackOut_14_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char stackOut_13_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (1 != param0) {
            if ((param0 ^ -1) != -3) {
              if ((param0 ^ -1) != -4) {
                if (4 == param0) {
                  ((rn) this).field_k = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.e((byte) -106);
                ((rn) this).field_n = new int[var4];
                ((rn) this).field_m = new char[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L2: {
                      ((rn) this).field_n[var5] = param2.e(1869);
                      var6 = param2.d((byte) -114);
                      stackOut_12_0 = ((rn) this).field_m;
                      stackOut_12_1 = var5;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (0 == var6) {
                        stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = (char)0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        break L2;
                      } else {
                        stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = qe.a((byte) var6, -120);
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L2;
                      }
                    }
                    stackIn_15_0[stackIn_15_1] = stackIn_15_2;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var4 = param2.e((byte) -122);
              ((rn) this).field_q = new char[var4];
              ((rn) this).field_l = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  L4: {
                    ((rn) this).field_l[var5] = param2.e(mgb.a((int) param1, 1886));
                    var6 = param2.d((byte) -114);
                    stackOut_5_0 = ((rn) this).field_q;
                    stackOut_5_1 = var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (-1 == (var6 ^ -1)) {
                      stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = (char)0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L4;
                    } else {
                      stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = qe.a((byte) var6, param1 + 5);
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L4;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((rn) this).field_p = param2.a(param1 + -20);
            break L0;
          }
        }
        L5: {
          if (param1 == 19) {
            break L5;
          } else {
            ((rn) this).field_n = null;
            break L5;
          }
        }
    }

    rn() {
        ((rn) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 50;
    }
}
