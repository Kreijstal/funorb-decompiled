/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc {
    static Calendar field_l;
    private eh field_i;
    private sl field_d;
    static String field_g;
    static km field_k;
    private eh field_h;
    static ml field_a;
    static String field_b;
    static int field_m;
    static int field_j;
    static String field_e;
    static eg field_f;
    static String[][] field_c;

    final static boolean a(byte param0, gh param1, gh param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          var3 = 53 / ((-45 - param0) / 50);
          var4 = -param2.field_Nb + param1.field_Nb;
          if (wl.field_a != param1.field_Pb) {
            if (param1.field_Pb != null) {
              break L0;
            } else {
              var4 += 200;
              break L0;
            }
          } else {
            var4 -= 200;
            break L0;
          }
        }
        if (wl.field_a != param2.field_Pb) {
          if (param2.field_Pb != null) {
            L1: {
              if ((var4 ^ -1) >= -1) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L1;
              }
            }
            return stackIn_17_0 != 0;
          } else {
            L2: {
              var4 -= 200;
              if ((var4 ^ -1) >= -1) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0 != 0;
          }
        } else {
          L3: {
            var4 += 200;
            if ((var4 ^ -1) >= -1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L3;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L3;
            }
          }
          return stackIn_8_0 != 0;
        }
    }

    final u a(int param0, byte param1) {
        u var3 = null;
        byte[] var4 = null;
        u var5 = null;
        var3 = (u) ((wc) this).field_d.b((long)param0, 0);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param0 ^ -1)) {
              var4 = ((wc) this).field_i.a(0, param0 & 32767, 0);
              break L0;
            } else {
              var4 = ((wc) this).field_h.a(0, param0, 0);
              break L0;
            }
          }
          L1: {
            var5 = new u();
            if (var4 != null) {
              var5.a(11693, new jc(var4));
              break L1;
            } else {
              break L1;
            }
          }
          if (32768 > param0) {
            if (param1 <= 33) {
              field_a = null;
              ((wc) this).field_d.a((Object) (Object) var5, (long)param0, -14696);
              return var5;
            } else {
              ((wc) this).field_d.a((Object) (Object) var5, (long)param0, -14696);
              return var5;
            }
          } else {
            var5.d(3818);
            if (param1 > 33) {
              ((wc) this).field_d.a((Object) (Object) var5, (long)param0, -14696);
              return var5;
            } else {
              field_a = null;
              ((wc) this).field_d.a((Object) (Object) var5, (long)param0, -14696);
              return var5;
            }
          }
        }
    }

    final static void a(tm param0, byte param1, int param2) {
        hg var3 = gk.field_g;
        int var4 = -35 / ((param1 - 42) / 58);
        var3.g(param2, 8);
        var3.a(2, 85);
        var3.a(0, -106);
        var3.a(param0.field_m, 124);
    }

    public static void a(int param0) {
        field_l = null;
        field_f = null;
        field_k = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != 200) {
          return;
        } else {
          field_c = null;
          field_g = null;
          return;
        }
    }

    wc(int param0, eh param1, eh param2) {
        ((wc) this).field_d = new sl(64);
        ((wc) this).field_h = param1;
        ((wc) this).field_i = param2;
        if (null != ((wc) this).field_h) {
            int discarded$0 = ((wc) this).field_h.d((byte) 107, 0);
        }
        if (((wc) this).field_i != null) {
            int discarded$1 = ((wc) this).field_i.d((byte) 120, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_b = "Please wait...";
        field_e = "The invitation has been withdrawn.";
        field_c = new String[][]{new String[7], new String[3]};
    }
}
