/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static int field_c;
    static boolean field_a;
    static mg field_b;

    final static ne a(byte param0) {
        String var1;
        if (param0 == 12) {
          var1 = nf.a((byte) 123);
          if (var1 != null) {
            if ((var1.indexOf('@') ^ -1) > -1) {
              return new ne(nf.a((byte) 122), pa.a((byte) -106));
            } else {
              var1 = "";
              return new ne(nf.a((byte) 122), pa.a((byte) -106));
            }
          } else {
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          }
        } else {
          field_c = -110;
          var1 = nf.a((byte) 123);
          if (var1 == null) {
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          } else {
            L0: {
              if ((var1.indexOf('@') ^ -1) <= -1) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            n.a(-8);
        }
    }

    final static ua a(int param0, kl param1, kl param2, int param3, int param4) {
        RuntimeException var5 = null;
        ua stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ua stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 <= -114) {
              if (h.a(param0, param4, param1, -114)) {
                stackIn_7_0 = mg.a(65, param2.a(param4, param0, 1));
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ua) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("n.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ua) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
    }
}
