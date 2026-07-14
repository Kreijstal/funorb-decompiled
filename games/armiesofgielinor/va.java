/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends ms {
    int[] field_C;
    static String field_F;
    char[] field_v;
    static int field_u;
    static int field_z;
    boolean field_H;
    static int field_D;
    static String field_B;
    String field_E;
    char[] field_x;
    static hg field_w;
    static int[] field_G;
    int[] field_y;
    static String[] field_A;

    private final void a(byte param0, vh param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char stackIn_7_2 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char stackIn_14_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char stackOut_13_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char stackOut_12_2 = 0;
        char[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char stackOut_5_2 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = 81 % ((param0 - 47) / 62);
          if (param2 == 1) {
            ((va) this).field_E = param1.g(1);
            break L0;
          } else {
            if (-3 != (param2 ^ -1)) {
              if (3 != param2) {
                if (param2 != 4) {
                  break L0;
                } else {
                  ((va) this).field_H = true;
                  break L0;
                }
              } else {
                var5 = param1.k(0);
                ((va) this).field_v = new char[var5];
                ((va) this).field_y = new int[var5];
                var6 = 0;
                L1: while (true) {
                  if (var5 <= var6) {
                    break L0;
                  } else {
                    L2: {
                      ((va) this).field_y[var6] = param1.e((byte) -104);
                      var7 = param1.a((byte) -74);
                      stackOut_11_0 = ((va) this).field_v;
                      stackOut_11_1 = var6;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (0 == var7) {
                        stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (char)0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L2;
                      } else {
                        stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = we.a(-125, (byte) var7);
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L2;
                      }
                    }
                    stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = param1.k(0);
              ((va) this).field_C = new int[var5];
              ((va) this).field_x = new char[var5];
              var6 = 0;
              L3: while (true) {
                if (var5 <= var6) {
                  break L0;
                } else {
                  L4: {
                    ((va) this).field_C[var6] = param1.e((byte) -104);
                    var7 = param1.a((byte) 111);
                    stackOut_4_0 = ((va) this).field_x;
                    stackOut_4_1 = var6;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (0 == var7) {
                      stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (char)0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L4;
                    } else {
                      stackOut_5_0 = (char[]) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = we.a(-121, (byte) var7);
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L4;
                    }
                  }
                  stackIn_7_0[stackIn_7_1] = stackIn_7_2;
                  var6++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((va) this).field_y) {
            for (var2 = 0; var2 < ((va) this).field_y.length; var2++) {
                ((va) this).field_y[var2] = oe.c(((va) this).field_y[var2], 32768);
            }
        }
        if (!(((va) this).field_C == null)) {
            var5 = 0;
            var2 = var5;
            while (var5 < ((va) this).field_C.length) {
                ((va) this).field_C[var5] = oe.c(((va) this).field_C[var5], 32768);
                var5++;
            }
        }
        if (param0 <= 6) {
            Object var4 = null;
            this.a((byte) 40, (vh) null, -40);
        }
    }

    public static void h(int param0) {
        field_B = null;
        field_F = null;
        if (param0 > -91) {
            va.h(-117);
        }
        field_A = null;
        field_G = null;
        field_w = null;
    }

    final void a(byte param0, vh param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= -79) {
            return;
        }
        while (true) {
            var3 = param1.k(0);
            if (var3 == 0) {
                break;
            }
            this.a((byte) -120, param1, var3);
        }
    }

    va() {
        ((va) this).field_H = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "No options available";
        field_G = new int[]{7, 1, 0, 0, 2, 5, 4, 1, 1, 1, 9, 7, 11, 11, 1, 11};
        field_B = "Connection restored.";
        field_u = 0;
        field_w = new hg();
    }
}
