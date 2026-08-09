/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppb {
    static ri field_c;
    static String field_d;
    static asb field_a;
    static cda field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -52 / ((param0 - -64) / 39);
        field_b = null;
        field_d = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ps var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0 instanceof byte[]) {
                var4 = (byte[]) (param0);
                stackIn_6_0 = qcb.a(param3, var4, param1, 31783);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param2) {
                  if (param0 instanceof ps) {
                    var5 = (ps) (param0);
                    stackIn_13_0 = var5.a(param3, -106, param1);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  stackIn_9_0 = (byte[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("ppb.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static rb a(String param0, int param1, byte param2) {
        aqb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        aqb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -55) {
                break L1;
              } else {
                var4 = (String) null;
                ppb.a((String) null, 112, (byte) 96);
                break L1;
              }
            }
            var3 = new aqb();
            ((rb) ((Object) var3)).field_b = param1;
            ((rb) ((Object) var3)).field_a = param0;
            stackIn_3_0 = (aqb) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ppb.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (rb) ((Object) stackIn_3_0);
    }

    static {
        field_d = "Invisible";
        field_c = new ri(11, 0, 1, 2);
    }
}
