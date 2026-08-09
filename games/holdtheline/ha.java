/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends hl implements hd {
    int field_q;
    static Random field_n;
    float field_m;
    static uf[] field_o;
    static int[][] field_j;
    ha field_s;
    boolean field_r;
    boolean field_l;
    static int field_p;
    static uf field_i;
    static va field_k;

    final static void a(boolean param0) {
        qj.field_N[61] = 27;
        qj.field_N[47] = 73;
        qj.field_N[222] = 58;
        qj.field_N[192] = 28;
        qj.field_N[520] = 59;
        qj.field_N[91] = 42;
        qj.field_N[59] = 57;
        qj.field_N[44] = 71;
        qj.field_N[93] = 43;
        qj.field_N[92] = 74;
        qj.field_N[45] = 26;
        qj.field_N[46] = 72;
        if (param0) {
            qm var2 = (qm) null;
            ha.a((qm) null, (qm) null, true);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_j = (int[][]) null;
        field_i = null;
        if (param0 < 29) {
            field_i = (uf) null;
        }
        field_k = null;
        field_n = null;
    }

    final static StringBuilder a(char param0, byte param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param3.length();
            param3.setLength(param2);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= param2) {
                if (param1 == -83) {
                  stackIn_8_0 = (StringBuilder) (param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (StringBuilder) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param3.setCharAt(var5, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ha.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static float a(qm param0, qm param1, boolean param2) {
        RuntimeException var3 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              stackIn_4_0 = (float)Math.atan2((double)(param0.field_f - param1.field_f), (double)(-param0.field_h + param1.field_h));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -0.9188363552093506f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ha.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    ha(boolean param0, float param1) {
        this.field_s = null;
        this.field_l = false;
        this.field_q = 0;
        this.field_r = param0 ? true : false;
        this.field_m = param1;
    }

    public final int a(byte param0, hd param1) {
        ha var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -101) {
                break L1;
              } else {
                this.field_l = true;
                break L1;
              }
            }
            var3 = (ha) ((Object) param1);
            if (this.field_m < var3.field_m) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var3.field_m < this.field_m) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ha.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_n = new Random();
    }
}
