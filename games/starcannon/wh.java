/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.net.URL;

final class wh implements Iterator {
    private rf field_a;
    static int[] field_e;
    private ek field_b;
    private int field_c;
    private rf field_d;

    final static void b(int param0) {
        qb.b(-1);
        ic.field_a = true;
        tc.field_x = true;
        ti.field_b.l(26756);
        sc.a(false, (byte) 118, ui.field_n);
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = StarCannon.field_A;
        if (((wh) this).field_a == ((wh) this).field_b.field_a[((wh) this).field_c + -1]) {
          L0: while (true) {
            if (((wh) this).field_b.field_c > ((wh) this).field_c) {
              int fieldTemp$1 = ((wh) this).field_c;
              ((wh) this).field_c = ((wh) this).field_c + 1;
              if (((wh) this).field_b.field_a[fieldTemp$1].field_a != ((wh) this).field_b.field_a[((wh) this).field_c + -1]) {
                ((wh) this).field_a = ((wh) this).field_b.field_a[-1 + ((wh) this).field_c].field_a;
                return true;
              } else {
                ((wh) this).field_a = ((wh) this).field_b.field_a[((wh) this).field_c + -1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        ((wh) this).field_a = ((wh) this).field_b.field_a[0].field_a;
        ((wh) this).field_c = 1;
        if (param0 != -17399) {
          this.a(-19);
          ((wh) this).field_d = null;
          return;
        } else {
          ((wh) this).field_d = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        Object var2 = null;
        java.net.URL discarded$0 = wh.a(124, (java.net.URL) null, (java.applet.Applet) null);
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 == 127) {
              L1: {
                var3 = null;
                var4 = null;
                if (null == qi.field_b) {
                  break L1;
                } else {
                  if (qi.field_b.equals((Object) (Object) param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) qi.field_b;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                if (null == vk.field_v) {
                  break L2;
                } else {
                  if (!vk.field_v.equals((Object) (Object) param2.getParameter("session"))) {
                    var4 = (Object) (Object) vk.field_v;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_10_0 = ig.a((String) var3, -1, (String) var4, param1, 1);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("wh.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    public final Object next() {
        rf var1 = null;
        int var2 = 0;
        var2 = StarCannon.field_A;
        if (((wh) this).field_b.field_a[((wh) this).field_c + -1] == ((wh) this).field_a) {
          L0: while (true) {
            if (((wh) this).field_b.field_c > ((wh) this).field_c) {
              int fieldTemp$2 = ((wh) this).field_c;
              ((wh) this).field_c = ((wh) this).field_c + 1;
              var1 = ((wh) this).field_b.field_a[fieldTemp$2].field_a;
              if (((wh) this).field_b.field_a[-1 + ((wh) this).field_c] == var1) {
                continue L0;
              } else {
                ((wh) this).field_d = var1;
                ((wh) this).field_a = var1.field_a;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((wh) this).field_a;
          ((wh) this).field_d = var1;
          ((wh) this).field_a = var1.field_a;
          return (Object) (Object) var1;
        }
    }

    public final void remove() {
        if (((wh) this).field_d == null) {
            throw new IllegalStateException();
        }
        ((wh) this).field_d.b(4);
        ((wh) this).field_d = null;
    }

    wh(ek param0) {
        ((wh) this).field_d = null;
        try {
            ((wh) this).field_b = param0;
            this.a(-17399);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
