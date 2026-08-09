/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static e field_a;

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (ne.a(param1, param2, (byte) -33)) {
              L1: {
                if (param0 > 94) {
                  break L1;
                } else {
                  var5 = (CharSequence) null;
                  f.a((byte) -52, (CharSequence) null, true);
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (param1.length() <= var3_int) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (uc.a(2, param1.charAt(var3_int))) {
                    var3_int++;
                    continue L2;
                  } else {
                    stackIn_10_0 = 0;
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("f.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static void a(java.math.BigInteger param0, boolean param1, wi param2, wi param3, java.math.BigInteger param4) {
        try {
            if (param1) {
                field_a = (e) null;
            }
            dk.a(param3.field_h, 0, param2, 0, param4, param0, param3.field_i);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "f.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static qh a(String param0, int param1) {
        RuntimeException var2 = null;
        qh stackIn_2_0 = null;
        qh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -96) {
              L1: {
                if (!pb.field_k.a(1000)) {
                  break L1;
                } else {
                  if (param0.equals(pb.field_k.a((byte) -101))) {
                    break L1;
                  } else {
                    pb.field_k = kg.a(2, param0);
                    break L1;
                  }
                }
              }
              stackIn_7_0 = pb.field_k;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("f.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        if (param0 != -7355) {
            f.a(-56);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_9_0 = 0;
        if (!param1) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
