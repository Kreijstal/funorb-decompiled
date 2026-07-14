/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends l {
    int[] field_q;
    boolean field_w;
    char[] field_s;
    String field_x;
    static bn field_v;
    char[] field_r;
    int[] field_t;
    static boolean field_u;

    final void f(int param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = Chess.field_G;
        if (!(((j) this).field_t == null)) {
            for (var2 = 0; var2 < ((j) this).field_t.length; var2++) {
                ((j) this).field_t[var2] = s.a(((j) this).field_t[var2], 32768);
            }
        }
        if (param0 != 0) {
            Object var4 = null;
            ((j) this).a((p) null, -30);
        }
        if (!(null == ((j) this).field_q)) {
            var5 = 0;
            var2 = var5;
            while (var5 < ((j) this).field_q.length) {
                ((j) this).field_q[var5] = s.a(((j) this).field_q[var5], 32768);
                var5++;
            }
        }
    }

    public static void d(byte param0) {
        int var1 = -87 % ((-44 - param0) / 39);
        field_v = null;
    }

    private final void a(int param0, p param1, boolean param2) {
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
        char stackIn_11_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char stackIn_19_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char stackOut_18_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char stackOut_9_2 = 0;
        L0: {
          var7 = Chess.field_G;
          if (param2) {
            break L0;
          } else {
            j.d((byte) 104);
            break L0;
          }
        }
        L1: {
          if (param0 != 1) {
            if (param0 == 2) {
              var4 = param1.i(-116);
              ((j) this).field_q = new int[var4];
              ((j) this).field_r = new char[var4];
              var5 = 0;
              L2: while (true) {
                if (var4 <= var5) {
                  break L1;
                } else {
                  L3: {
                    ((j) this).field_q[var5] = param1.f(674914976);
                    var6 = param1.g(0);
                    stackOut_16_0 = ((j) this).field_r;
                    stackOut_16_1 = var5;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (0 == var6) {
                      stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = (char)0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L3;
                    } else {
                      stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = vm.a(123, (byte) var6);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      break L3;
                    }
                  }
                  stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                  var5++;
                  continue L2;
                }
              }
            } else {
              if (-4 != (param0 ^ -1)) {
                if (-5 != (param0 ^ -1)) {
                  break L1;
                } else {
                  ((j) this).field_w = true;
                  break L1;
                }
              } else {
                var4 = param1.i(-120);
                ((j) this).field_s = new char[var4];
                ((j) this).field_t = new int[var4];
                var5 = 0;
                L4: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    L5: {
                      ((j) this).field_t[var5] = param1.f(674914976);
                      var6 = param1.g(0);
                      stackOut_8_0 = ((j) this).field_s;
                      stackOut_8_1 = var5;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var6 == 0) {
                        stackOut_10_0 = (char[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = (char)0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L5;
                      } else {
                        stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = vm.a(117, (byte) var6);
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L5;
                      }
                    }
                    stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            ((j) this).field_x = param1.d(0);
            break L1;
          }
        }
    }

    final void a(p param0, int param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        if (param1 != 0) {
            j.d((byte) 71);
        }
        while (true) {
            var3 = param0.i(-96);
            if (0 == var3) {
                break;
            }
            this.a(var3, param0, true);
        }
    }

    j() {
        ((j) this).field_w = false;
    }

    static {
    }
}
