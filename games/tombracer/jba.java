/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jba extends kca {
    static float[] field_k;
    static String field_l;
    static int field_j;

    final static int a(int param0, boolean param1, int param2) {
        int var3;
        int var4;
        if (!param1) {
          field_j = -65;
          var3 = param2 + -param0 >> 501386288;
          var4 = 128 + 128 * var3 / 256;
          var4 = za.a(0, (byte) 40, 255, var4);
          return var4;
        } else {
          var3 = param2 + -param0 >> 501386288;
          var4 = 128 + 128 * var3 / 256;
          var4 = za.a(0, (byte) 40, 255, var4);
          return var4;
        }
    }

    final it a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        it stackIn_2_0 = null;
        it stackIn_5_0 = null;
        it stackIn_10_0 = null;
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
            if (sqa.a(var4, -3)) {
              if (param0 == 14) {
                L1: {
                  var5 = (CharSequence) ((Object) param1);
                  var3_int = jb.a(var5, (byte) 70);
                  if (-1 <= (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if (130 < var3_int) {
                      break L1;
                    } else {
                      return uh.field_k;
                    }
                  }
                }
                stackIn_10_0 = fp.field_c;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (it) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = fp.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("jba.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    jba(tra param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
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
            if (this.a((byte) 14, param1) != fp.field_c) {
              if (param0 != -1) {
                field_k = (float[]) null;
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = fm.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("jba.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_6_0);
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 501386288) {
            field_j = 108;
        }
    }

    static {
        field_k = new float[16];
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_j = 0;
    }
}
