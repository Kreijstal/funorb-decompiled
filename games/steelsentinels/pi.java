/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends java.awt.Canvas {
    private java.awt.Component field_d;
    static dk field_a;
    static char[] field_b;
    static int[] field_e;
    static int field_c;
    static String[] field_f;

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = null;
    }

    pi(java.awt.Component param0) {
        try {
            ((pi) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(byte param0, gh param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            if (!he.a((byte) 116)) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 <= -17) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var4_int = qa.field_O;
              var6 = 1;
              var7 = 0;
              L2: while (true) {
                if (var7 >= 8) {
                  stackOut_15_0 = param2;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  var8 = 0;
                  var9 = 0;
                  L3: while (true) {
                    if (35 <= var9) {
                      var7++;
                      continue L2;
                    } else {
                      L4: {
                        if (var7 != pe.field_O[var9]) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("pi.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_16_0;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((pi) this).field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "pi.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static a a(byte param0) {
        try {
            Throwable var1 = null;
            a stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            a stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (a) Class.forName("mk").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((pi) this).field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "pi.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_b = new char[128];
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_c = 0;
    }
}
