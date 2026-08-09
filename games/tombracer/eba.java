/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eba extends pb {
    private java.lang.ref.SoftReference field_o;

    eba(Object param0, int param1) {
        super(param1);
        try {
            try {
                this.field_o = new java.lang.ref.SoftReference(param0);
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) ((Object) runtimeException), "eba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 != 14646) {
            return false;
        }
        return true;
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -19) {
              stackIn_4_0 = fsa.a(57, param2, true, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 56;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("eba.G(");

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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!oj.field_vb.startsWith("win")) {
              if (oj.field_vb.startsWith("linux")) {
                stackIn_9_0 = "lib" + param1 + ".so";
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (oj.field_vb.startsWith("mac")) {
                  stackIn_7_0 = "lib" + param1 + ".dylib";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2_int = -116 / ((param0 - -73) / 40);
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = param1 + ".dll";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("eba.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (String) ((Object) stackIn_11_0);
            }
          }
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 6912) {
              var2_int = param0.charAt(0);
              var3 = 1;
              L1: while (true) {
                if (param0.length() <= var3) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.charAt(var3) == var2_int) {
                    var3++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("eba.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        if (param0) {
          L0: {
            if (era.field_d != null) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (!vo.field_b) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final Object f(int param0) {
        if (param0 != 29243) {
            this.f(-86);
            return this.field_o.get();
        }
        return this.field_o.get();
    }

    static {
    }
}
