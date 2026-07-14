/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends wb {
    static int field_s;
    static String field_u;
    char[] field_p;
    String field_v;
    static ml field_t;
    boolean field_o;
    char[] field_r;
    int[] field_w;
    static int[] field_q;
    int[] field_x;

    final void d(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (null != ((u) this).field_w) {
            for (var2 = 0; ((u) this).field_w.length > var2; var2++) {
                ((u) this).field_w[var2] = oh.a(((u) this).field_w[var2], 32768);
            }
        }
        if (((u) this).field_x != null) {
            var4 = 0;
            var2 = var4;
            while (((u) this).field_x.length > var4) {
                ((u) this).field_x[var4] = oh.a(((u) this).field_x[var4], 32768);
                var4++;
            }
        }
        if (param0 != 3818) {
            u.b((byte) 57);
        }
    }

    public static void b(byte param0) {
        field_q = null;
        field_u = null;
        if (param0 != -11) {
            u.b((byte) -54);
        }
        field_t = null;
    }

    private final void a(int param0, jc param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char stackIn_10_2 = 0;
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
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char stackOut_9_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0 == -4) {
          L0: {
            if (param2 != 1) {
              if (param2 != 2) {
                if ((param2 ^ -1) != -4) {
                  if (param2 != 4) {
                    break L0;
                  } else {
                    ((u) this).field_o = true;
                    break L0;
                  }
                } else {
                  var4 = param1.g(11132);
                  ((u) this).field_w = new int[var4];
                  ((u) this).field_r = new char[var4];
                  var5 = 0;
                  L1: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      L2: {
                        ((u) this).field_w[var5] = param1.c((byte) -88);
                        var6 = param1.a((byte) 47);
                        stackOut_14_0 = ((u) this).field_r;
                        stackOut_14_1 = var5;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (0 != var6) {
                          stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = mm.a(param0 + 97, (byte) var6);
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
                }
              } else {
                var4 = param1.g(11132);
                ((u) this).field_x = new int[var4];
                ((u) this).field_p = new char[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L4: {
                      ((u) this).field_x[var5] = param1.c((byte) 125);
                      var6 = param1.a((byte) 77);
                      stackOut_7_0 = ((u) this).field_p;
                      stackOut_7_1 = var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var6 == 0) {
                        stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (char)0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L4;
                      } else {
                        stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = mm.a(100, (byte) var6);
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L4;
                      }
                    }
                    stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                    var5++;
                    continue L3;
                  }
                }
              }
            } else {
              ((u) this).field_v = param1.h(param0 + -121);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, jc param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param0 != 11693) {
            return;
        }
        while (true) {
            var3 = param1.g(param0 + -561);
            if (var3 == 0) {
                break;
            }
            this.a(-4, param1, var3);
        }
    }

    u() {
        ((u) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
        field_u = "You are offering an unrated rematch.";
    }
}
