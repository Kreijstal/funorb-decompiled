/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hm {
    int field_e;
    String field_a;
    static wd field_b;
    static rh field_g;
    static String[] field_c;
    static String field_h;
    static String field_f;
    static int field_d;

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 2067) {
          field_g = null;
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        }
    }

    final static boolean a(gm param0, gm param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          var3 = -param0.field_mb + param1.field_mb;
          if (param2) {
            break L0;
          } else {
            var5 = null;
            bi discarded$2 = hm.a((String) null, (rh) null, (byte) -42, (String) null);
            break L0;
          }
        }
        L1: {
          if (param1.field_lb == ul.field_F) {
            var3 -= 200;
            break L1;
          } else {
            if (param1.field_lb != null) {
              break L1;
            } else {
              var3 += 200;
              break L1;
            }
          }
        }
        if (param0.field_lb != ul.field_F) {
          if (param0.field_lb == null) {
            L2: {
              var3 -= 200;
              if ((var3 ^ -1) >= -1) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L2;
              }
            }
            return stackIn_19_0 != 0;
          } else {
            L3: {
              if ((var3 ^ -1) >= -1) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            return stackIn_15_0 != 0;
          }
        } else {
          L4: {
            var3 += 200;
            if ((var3 ^ -1) >= -1) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          return stackIn_10_0 != 0;
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 200) {
          field_c = null;
          return new java.net.Socket(((hm) this).field_a, ((hm) this).field_e);
        } else {
          return new java.net.Socket(((hm) this).field_a, ((hm) this).field_e);
        }
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    final static bi a(String param0, rh param1, byte param2, String param3) {
        int var5 = 75 % ((param2 - 67) / 55);
        int var4 = param1.a(param3, (byte) -100);
        int var6 = param1.a(param0, (byte) -15, var4);
        return ji.a(param1, var4, -21460, var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new wd();
        field_c = new String[255];
        field_f = "<%0>Barriers and Blue Switches:<%1> these yellow walls get in the fleas' way, but if a flea presses a blue button, all the barriers and blue buttons disappear.";
        field_h = "Score: <%0>";
    }
}
