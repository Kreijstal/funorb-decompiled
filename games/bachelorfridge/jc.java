/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends eo {
    static String field_n;
    boolean field_w;
    String field_s;
    static int field_t;
    int[] field_q;
    static int field_r;
    static int field_v;
    int[] field_u;
    char[] field_p;
    char[] field_o;

    private final void a(lu param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char stackOut_18_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char stackOut_12_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var7 = BachelorFridge.field_y;
        if (param2 == -3) {
          L0: {
            if (param1 == 1) {
              ((jc) this).field_s = param0.g(49);
              break L0;
            } else {
              if ((param1 ^ -1) == -3) {
                var4 = param0.b(16711935);
                ((jc) this).field_u = new int[var4];
                ((jc) this).field_p = new char[var4];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    L2: {
                      ((jc) this).field_u[var5] = param0.e((byte) 114);
                      var6 = param0.b(true);
                      stackOut_16_0 = ((jc) this).field_p;
                      stackOut_16_1 = var5;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (var6 != 0) {
                        stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = vja.a((byte) var6, (byte) -93);
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L2;
                      } else {
                        stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L2;
                      }
                    }
                    stackIn_19_0[stackIn_19_1] = (char) stackIn_19_2;
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (param1 == 3) {
                  var4 = param0.b(16711935);
                  ((jc) this).field_q = new int[var4];
                  ((jc) this).field_o = new char[var4];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4) {
                      break L0;
                    } else {
                      L4: {
                        ((jc) this).field_q[var5] = param0.e((byte) 92);
                        var6 = param0.b(true);
                        stackOut_10_0 = ((jc) this).field_o;
                        stackOut_10_1 = var5;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var6 != 0) {
                          stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = vja.a((byte) var6, (byte) -46);
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L4;
                        } else {
                          stackOut_11_0 = (char[]) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 0;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L4;
                        }
                      }
                      stackIn_13_0[stackIn_13_1] = (char) stackIn_13_2;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if ((param1 ^ -1) == -5) {
                    ((jc) this).field_w = true;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(lu param0, boolean param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        while (true) {
            var3 = param0.b(16711935);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(param0, var3, -3);
        }
        if (param1) {
            jc.e(91);
        }
    }

    final static fea a(vr param0, int param1, boolean param2, vr param3, int param4) {
        if (!g.a(param4, param1, -30744, param3)) {
            return null;
        }
        if (param2) {
            return null;
        }
        return kea.a((byte) -3, param0.b(-26, param4, param1));
    }

    final static boolean f(int param0) {
        if (param0 != -24457) {
            field_n = null;
        }
        return pma.field_k;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = BachelorFridge.field_y;
        if (!(((jc) this).field_q == null)) {
            for (var2 = 0; var2 < ((jc) this).field_q.length; var2++) {
                ((jc) this).field_q[var2] = mp.a(((jc) this).field_q[var2], 32768);
            }
        }
        if (null != ((jc) this).field_u) {
            var4 = 0;
            var2 = var4;
            while (((jc) this).field_u.length > var4) {
                ((jc) this).field_u[var4] = mp.a(((jc) this).field_u[var4], 32768);
                var4++;
            }
        }
        if (param0 != -25) {
            field_v = -40;
        }
    }

    public static void e(int param0) {
        if (param0 < 91) {
            jc.e(5);
        }
        field_n = null;
    }

    jc() {
        ((jc) this).field_w = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
        field_v = 500;
    }
}
