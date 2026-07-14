/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends lm {
    int[] field_D;
    static int[] field_v;
    String field_C;
    char[] field_x;
    static jl field_A;
    char[] field_t;
    static ll field_w;
    boolean field_y;
    static int field_u;
    int[] field_z;

    final void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 92) {
            return;
        }
        if (!(((qe) this).field_D == null)) {
            for (var2 = 0; var2 < ((qe) this).field_D.length; var2++) {
                ((qe) this).field_D[var2] = bq.a(((qe) this).field_D[var2], 32768);
            }
        }
        if (!(null == ((qe) this).field_z)) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((qe) this).field_z.length) {
                ((qe) this).field_z[var4] = bq.a(((qe) this).field_z[var4], 32768);
                var4++;
            }
        }
    }

    public static void g(int param0) {
        field_A = null;
        int var1 = -33 / ((10 - param0) / 52);
        field_w = null;
        field_v = null;
    }

    final void a(boolean param0, we param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0) {
            Object var5 = null;
            this.a(113, 78, (we) null);
        }
        while (true) {
            var3 = param1.f(255);
            if (0 == var3) {
                break;
            }
            this.a(var3, 3, param1);
        }
    }

    final static eh a(String param0, int param1, byte param2) {
        if (param2 < 111) {
            field_v = null;
        }
        eg var3 = new eg();
        ((eh) (Object) var3).field_e = param1;
        ((eh) (Object) var3).field_b = param0;
        return (eh) (Object) var3;
    }

    qe() {
        ((qe) this).field_y = false;
    }

    private final void a(int param0, int param1, we param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char stackIn_18_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 != 1) {
            if (2 == param0) {
              var4 = param2.f(param1 + 252);
              ((qe) this).field_x = new char[var4];
              ((qe) this).field_z = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  L2: {
                    ((qe) this).field_z[var5] = param2.a((byte) -128);
                    var6 = param2.a(0);
                    stackOut_15_0 = ((qe) this).field_x;
                    stackOut_15_1 = var5;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (-1 == (var6 ^ -1)) {
                      stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = (char)0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      break L2;
                    } else {
                      stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = cm.a((byte) var6, 63);
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L2;
                    }
                  }
                  stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (3 != param0) {
                if (param0 == 4) {
                  ((qe) this).field_y = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.f(255);
                ((qe) this).field_t = new char[var4];
                ((qe) this).field_D = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L4: {
                      ((qe) this).field_D[var5] = param2.a((byte) -113);
                      var6 = param2.a(0);
                      stackOut_6_0 = ((qe) this).field_t;
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
                        break L4;
                      } else {
                        stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = cm.a((byte) var6, 63);
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L4;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            ((qe) this).field_C = param2.h(param1 ^ 6);
            break L0;
          }
        }
        L5: {
          if (param1 == 3) {
            break L5;
          } else {
            var8 = null;
            ((qe) this).a(true, (we) null);
            break L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[8192];
    }
}
