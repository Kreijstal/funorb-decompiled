/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends rg {
    static int field_y;
    char[] field_w;
    static String field_z;
    static eg field_E;
    int[] field_D;
    char[] field_A;
    boolean field_C;
    static String field_x;
    static wc field_B;
    int[] field_F;
    String field_G;

    public static void e(int param0) {
        field_E = null;
        field_z = null;
        field_x = null;
        if (param0 > -73) {
            field_E = null;
        }
        field_B = null;
    }

    private final void a(int param0, ge param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var7 = Pool.field_O;
          if (param2 != 1) {
            if ((param2 ^ -1) == -3) {
              var4 = param1.g(-90);
              ((sf) this).field_w = new char[var4];
              ((sf) this).field_F = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  L2: {
                    ((sf) this).field_F[var5] = param1.d(-1034);
                    var6 = param1.e((byte) 105);
                    stackOut_14_0 = ((sf) this).field_w;
                    stackOut_14_1 = var5;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (-1 != (var6 ^ -1)) {
                      stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = s.a((byte) var6, 8);
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      break L2;
                    } else {
                      stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      break L2;
                    }
                  }
                  stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if ((param2 ^ -1) == -4) {
                var4 = param1.g(-106);
                ((sf) this).field_A = new char[var4];
                ((sf) this).field_D = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    L4: {
                      ((sf) this).field_D[var5] = param1.d(-1034);
                      var6 = param1.e((byte) 105);
                      stackOut_8_0 = ((sf) this).field_A;
                      stackOut_8_1 = var5;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (-1 != (var6 ^ -1)) {
                        stackOut_10_0 = (char[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = s.a((byte) var6, 8);
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L4;
                      } else {
                        stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 0;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L4;
                      }
                    }
                    stackIn_11_0[stackIn_11_1] = (char) stackIn_11_2;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (param2 != 4) {
                  break L0;
                } else {
                  ((sf) this).field_C = true;
                  break L0;
                }
              }
            }
          } else {
            ((sf) this).field_G = param1.j(-119);
            break L0;
          }
        }
        L5: {
          if (param0 < -109) {
            break L5;
          } else {
            field_x = null;
            break L5;
          }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = Pool.field_O;
        if (((sf) this).field_D != null) {
            for (var2 = 0; var2 < ((sf) this).field_D.length; var2++) {
                ((sf) this).field_D[var2] = md.a(((sf) this).field_D[var2], 32768);
            }
        }
        if (!(null == ((sf) this).field_F)) {
            var5 = 0;
            var2 = var5;
            while (((sf) this).field_F.length > var5) {
                ((sf) this).field_F[var5] = md.a(((sf) this).field_F[var5], 32768);
                var5++;
            }
        }
        if (param0 != 0) {
            Object var4 = null;
            ((sf) this).a((byte) -86, (ge) null);
        }
    }

    final void a(byte param0, ge param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        L0: while (true) {
          var3 = param1.g(param0 ^ 1);
          if (var3 != 0) {
            this.a(-121, param1, var3);
            continue L0;
          } else {
            L1: {
              if (param0 == -123) {
                break L1;
              } else {
                ((sf) this).field_w = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void b(byte param0, ge param1) {
        wi.field_a = param1.d(-1034) << -1078580283;
        int var2 = param1.g(-74);
        jj.field_F = (var2 & 7) << 1428122834;
        wi.field_a = wi.field_a + (var2 >> 955408483);
        jj.field_F = jj.field_F + (param1.d(-1034) << 272319778);
        var2 = param1.g(-115);
        vd.field_n = (63 & var2) << 1268324143;
        jj.field_F = jj.field_F + (var2 >> 953647014);
        if (param0 <= 112) {
            field_x = null;
        }
        vd.field_n = vd.field_n + (param1.g(-75) << 1166961127);
        var2 = param1.g(-61);
        vd.field_n = vd.field_n + (var2 >> 444756769);
        vb.field_f = (var2 & 1) << 520027824;
        vb.field_f = vb.field_f + param1.d(-1034);
    }

    sf() {
        ((sf) this).field_C = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "The '<%0>' setting needs to be changed.";
        field_z = "<img=0> Click on the cue ball to take your shot.";
    }
}
