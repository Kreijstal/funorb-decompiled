/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oia extends kj {
    private int field_h;
    private eaa field_g;
    static long field_f;
    static String field_i;

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rea var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        rea stackIn_13_0 = null;
        rea stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        rea stackIn_14_0 = null;
        rea stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        rea stackIn_15_0 = null;
        rea stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        rea stackOut_12_0 = null;
        rea stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        rea stackOut_14_0 = null;
        rea stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        rea stackOut_13_0 = null;
        rea stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        var10 = BachelorFridge.field_y;
        if (param0 > 21) {
          int fieldTemp$4 = ((oia) this).field_h - 2;
          ((oia) this).field_h = ((oia) this).field_h - 2;
          if (0 == fieldTemp$4) {
            return true;
          } else {
            L0: {
              if (((oia) this).field_h <= 126) {
                var2 = ((oia) this).field_h;
                var2 += 16;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 32) {
                    break L0;
                  } else {
                    L2: {
                      var4 = kla.a(((oia) this).field_h, ((oia) this).field_e.field_h.field_w, -2147483648) - (((oia) this).field_h >> 1);
                      stackOut_9_0 = (((oia) this).field_h >> 2) - Math.abs(var4) / 2;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (kla.a(2, ((oia) this).field_e.field_h.field_w, -2147483648) <= 0) {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = -1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        break L2;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_12_0 * stackIn_12_1;
                      int discarded$5 = kla.a(50, ((oia) this).field_e.field_h.field_w, -2147483648);
                      var6 = var4 - -64;
                      var7 = var5 + 32;
                      var8 = (int)(Math.sin(300.0 * (double)var2) * 100.0) * 0;
                      stackOut_12_0 = null;
                      stackOut_12_1 = null;
                      stackOut_12_2 = var6;
                      stackOut_12_3 = var8;
                      stackOut_12_4 = var7;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      if (5 <= kla.a(20, ((oia) this).field_e.field_h.field_w, -2147483648)) {
                        stackOut_14_0 = null;
                        stackOut_14_1 = null;
                        stackOut_14_2 = stackIn_14_2;
                        stackOut_14_3 = stackIn_14_3;
                        stackOut_14_4 = stackIn_14_4;
                        stackOut_14_5 = 16711680;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        stackIn_15_5 = stackOut_14_5;
                        break L3;
                      } else {
                        stackOut_13_0 = null;
                        stackOut_13_1 = null;
                        stackOut_13_2 = stackIn_13_2;
                        stackOut_13_3 = stackIn_13_3;
                        stackOut_13_4 = stackIn_13_4;
                        stackOut_13_5 = 16631867;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_15_4 = stackOut_13_4;
                        stackIn_15_5 = stackOut_13_5;
                        break L3;
                      }
                    }
                    var9 = new rea(stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_15_5);
                    int discarded$6 = kla.a(3, ((oia) this).field_e.field_h.field_w, -2147483648);
                    int discarded$7 = kla.a(5000, ((oia) this).field_e.field_h.field_w, -2147483648);
                    var9.field_o = (double)(-1 + -kla.a(2, ((oia) this).field_e.field_h.field_w, -2147483648));
                    var9.field_n = 25 + -kla.a(10, ((oia) this).field_e.field_h.field_w, -2147483648);
                    var9.field_h = -1;
                    ((oia) this).field_g.a((bw) (Object) var9, true);
                    var3++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
            aga.a(((oia) this).field_e.field_h.field_w, true, ((oia) this).field_g, ((oia) this).field_h);
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((oia) this).field_g = null;
        }
    }

    final void a(int param0, int param1, int param2) {
        baa.a(((oia) this).field_g, true, 65280, param2, param0, 10);
        if (param1 != 0) {
            oia.c(85);
        }
    }

    oia(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            ((oia) this).field_h = 128;
            ((oia) this).field_g = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "oia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 50 / ((param0 - 13) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Game full";
    }
}
