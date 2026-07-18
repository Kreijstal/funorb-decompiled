/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static pb field_k;
    private int field_c;
    static pb field_g;
    int field_j;
    static pb field_d;
    static pb field_e;
    int field_i;
    private mj field_a;
    static pb field_l;
    static pb field_h;
    static pb field_b;
    static int field_m;
    static String field_n;
    static byte[] field_f;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                pb discarded$2 = pb.a((byte) 99, -109);
                break L1;
              }
            }
            field_f = null;
            field_h = null;
            field_n = null;
            field_k = null;
            field_d = null;
            field_l = null;
            field_e = null;
            field_b = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "pb.A(" + param0 + ')');
        }
    }

    final static pb a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        pb stackIn_29_0 = null;
        pb stackIn_31_0 = null;
        pb stackIn_33_0 = null;
        pb stackIn_35_0 = null;
        pb stackIn_37_0 = null;
        pb stackIn_39_0 = null;
        pb stackIn_41_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        pb stackOut_28_0 = null;
        pb stackOut_30_0 = null;
        pb stackOut_32_0 = null;
        pb stackOut_34_0 = null;
        pb stackOut_36_0 = null;
        pb stackOut_38_0 = null;
        pb stackOut_40_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_43_0 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param1;
            if (0 == var2_int) {
              stackOut_28_0 = (pb) field_k;
              stackIn_29_0 = stackOut_28_0;
              return stackIn_29_0;
            } else {
              if (var2_int == 1) {
                stackOut_30_0 = (pb) field_g;
                stackIn_31_0 = stackOut_30_0;
                return stackIn_31_0;
              } else {
                if (2 == var2_int) {
                  stackOut_32_0 = (pb) field_d;
                  stackIn_33_0 = stackOut_32_0;
                  return stackIn_33_0;
                } else {
                  L1: {
                    if (var2_int != 3) {
                      break L1;
                    } else {
                      if (var3 == 0) {
                        stackOut_34_0 = (pb) field_e;
                        stackIn_35_0 = stackOut_34_0;
                        return stackIn_35_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (var2_int != 4) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        stackOut_36_0 = (pb) field_l;
                        stackIn_37_0 = stackOut_36_0;
                        return stackIn_37_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var2_int == 5) {
                    stackOut_38_0 = (pb) field_h;
                    stackIn_39_0 = stackOut_38_0;
                    return stackIn_39_0;
                  } else {
                    if (6 == var2_int) {
                      stackOut_40_0 = (pb) field_b;
                      stackIn_41_0 = stackOut_40_0;
                      return stackIn_41_0;
                    } else {
                      if (param0 < -107) {
                        stackOut_45_0 = null;
                        stackIn_46_0 = stackOut_45_0;
                        break L0;
                      } else {
                        stackOut_43_0 = null;
                        stackIn_44_0 = stackOut_43_0;
                        return (pb) (Object) stackIn_44_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "pb.B(" + param0 + ',' + param1 + ')');
        }
        return (pb) (Object) stackIn_46_0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "pb.toString()");
        }
    }

    private pb(int param0, int param1, mj param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((pb) this).field_c = param1;
            ((pb) this).field_a = param2;
            ((pb) this).field_j = param0;
            ((pb) this).field_i = ((pb) this).field_c * ((pb) this).field_a.field_h;
            if (16 > ((pb) this).field_j) {
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pb(0, 3, mj.field_d);
        field_g = new pb(1, 3, mj.field_d);
        field_d = new pb(2, 4, mj.field_f);
        field_e = new pb(3, 1, mj.field_d);
        field_l = new pb(4, 2, mj.field_d);
        field_h = new pb(5, 3, mj.field_d);
        field_b = new pb(6, 4, mj.field_d);
        field_m = ieb.a(16, -111);
        field_f = new byte[]{(byte) 31, (byte) -117, (byte) 8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_n = "Launches a fighter for harrassment";
    }
}
