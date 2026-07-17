/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hb {
    static bi field_d;
    static java.applet.Applet field_a;
    static bi[] field_b;
    static int field_e;
    static String field_c;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (hq.a(-95, (char) var3)) {
                    break L2;
                  } else {
                    if (!dk.a((byte) -66, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("hb.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + -31654 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        ve stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_19_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (eg.field_q != null) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var6 = (CharSequence) (Object) param1;
                var2 = ji.a(var6, true);
                if (var2 != null) {
                  if (param0 == -90) {
                    var3 = (ve) (Object) eg.field_q.a(65280, (long)var2.hashCode());
                    L0: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) (Object) var3.field_Ab;
                        var4 = ji.a(var7, true);
                        if (var4.equals((Object) (Object) var2)) {
                          stackOut_19_0 = (ve) var3;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          var3 = (ve) (Object) eg.field_q.d((byte) -112);
                          continue L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (ve) (Object) stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (ve) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ve) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2_ref;
            stackOut_23_1 = new StringBuilder().append("hb.I(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    abstract int b(byte param0);

    abstract oh a(byte param0);

    abstract oh a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = "Player";
    }
}
