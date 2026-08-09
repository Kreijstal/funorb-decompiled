/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hj extends mf {
    static Random field_h;
    static int[] field_l;
    static int field_k;
    static int field_j;
    static String field_i;

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -92, param0) != fb.field_e) {
              if (!param1) {
                hj.e(-48);
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = ih.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hj.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_6_0);
        }
    }

    hj(ul param0) {
        super(param0);
    }

    final fi a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        fi stackIn_3_0 = null;
        fi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!vl.a(var4, -182)) {
              stackIn_3_0 = fb.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -44) {
                  break L1;
                } else {
                  field_h = (Random) null;
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = cc.a(true, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L2;
                  } else {
                    return nn.field_q;
                  }
                }
              }
              stackIn_10_0 = fb.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("hj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void e(int param0) {
        field_l = null;
        int var1 = 73 / ((param0 - -21) / 59);
        field_h = null;
        field_i = null;
    }

    static {
        field_h = new Random();
        field_l = new int[4];
        field_i = "You already have rapid fire";
    }
}
