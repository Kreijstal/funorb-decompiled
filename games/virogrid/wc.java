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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -53;
              var4 = -param2.field_Nb + param1.field_Nb;
              if (wl.field_a != param1.field_Pb) {
                if (param1.field_Pb != null) {
                  break L1;
                } else {
                  var4 += 200;
                  break L1;
                }
              } else {
                var4 -= 200;
                break L1;
              }
            }
            L2: {
              if (wl.field_a == param2.field_Pb) {
                var4 += 200;
                break L2;
              } else {
                if (param2.field_Pb == null) {
                  var4 -= 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var4 <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("wc.B(").append(23).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0 != 0;
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
            if (param0 >= 32768) {
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
        hg var3 = null;
        try {
            var3 = gk.field_g;
            int var4 = -35;
            var3.g(param2, 8);
            var3.a(2, 85);
            var3.a(0, -106);
            var3.a(param0.field_m, 124);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "wc.A(" + (param0 != null ? "{...}" : "null") + 44 + 110 + 44 + param2 + 41);
        }
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
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((wc) this).field_d = new sl(64);
        try {
          L0: {
            L1: {
              ((wc) this).field_h = param1;
              ((wc) this).field_i = param2;
              if (null == ((wc) this).field_h) {
                break L1;
              } else {
                int discarded$4 = ((wc) this).field_h.d((byte) 107, 0);
                break L1;
              }
            }
            if (((wc) this).field_i != null) {
              int discarded$5 = ((wc) this).field_i.d((byte) 120, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("wc.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
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
