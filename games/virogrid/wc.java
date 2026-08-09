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
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 53 / ((-45 - param0) / 50);
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
              if ((var4 ^ -1) >= -1) {
                stackIn_13_0 = 0;
                break L3;
              } else {
                stackIn_13_0 = 1;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("wc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final u a(int param0, byte param1) {
        u var3;
        byte[] var4;
        u var5;
        var3 = (u) (this.field_d.b((long)param0, 0));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param0 ^ -1)) {
              var4 = this.field_i.a(0, param0 & 32767, 0);
              break L0;
            } else {
              var4 = this.field_h.a(0, param0, 0);
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
              field_a = (ml) null;
              this.field_d.a(var5, (long)param0, -14696);
              return var5;
            } else {
              this.field_d.a(var5, (long)param0, -14696);
              return var5;
            }
          } else {
            var5.d(3818);
            if (param1 > 33) {
              this.field_d.a(var5, (long)param0, -14696);
              return var5;
            } else {
              field_a = (ml) null;
              this.field_d.a(var5, (long)param0, -14696);
              return var5;
            }
          }
        }
    }

    final static void a(tm param0, byte param1, int param2) {
        hg var3 = null;
        try {
            var3 = gk.field_g;
            int var4 = -35 / ((param1 - 42) / 58);
            var3.g(param2, 8);
            var3.a(2, 85);
            var3.a(0, -106);
            var3.a(param0.field_m, 124);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "wc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
          field_c = (String[][]) null;
          field_g = null;
          return;
        }
    }

    wc(int param0, eh param1, eh param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_d = new sl(64);
        try {
          L0: {
            L1: {
              this.field_h = param1;
              this.field_i = param2;
              if (null == this.field_h) {
                break L1;
              } else {
                this.field_h.d((byte) 107, 0);
                break L1;
              }
            }
            if (this.field_i != null) {
              this.field_i.d((byte) 120, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("wc.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_l = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_b = "Please wait...";
        field_e = "The invitation has been withdrawn.";
        field_c = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}, new String[]{"7", "9", "11"}};
    }
}
