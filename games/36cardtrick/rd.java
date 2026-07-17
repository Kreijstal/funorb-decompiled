/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rd extends cg {
    static w field_j;
    static byte[][] field_k;

    public static void c() {
        field_k = null;
        field_j = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1266438832) {
          field_j = null;
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> 1);
          param0 = (param0 & 858993459) + (param0 >>> 2 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 4);
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        } else {
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> 1);
          param0 = (param0 & 858993459) + (param0 >>> 2 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 4);
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
    }

    final static void a(byte param0, String param1) {
        try {
            we.a(-119, param1);
            int discarded$0 = 16777215;
            ca.a(kj.field_q, false);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rd.K(" + 68 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final sg a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        sg stackIn_7_0 = null;
        sg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        sg stackOut_8_0 = null;
        sg stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              int discarded$10 = 64;
              if (null != di.a(param0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1 < -58) {
                break L2;
              } else {
                field_j = null;
                break L2;
              }
            }
            if (var3_int != 0) {
              stackOut_8_0 = ii.field_e;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = pe.field_b;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("rd.M(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    rd(hf param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (sd.field_c != null) {
          L0: {
            sd.field_c.b(true);
            if (null != ji.field_a) {
              ji.field_a.c(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = 63;
          int discarded$4 = 44;
          vb.a();
          return;
        } else {
          L1: {
            if (null != ji.field_a) {
              ji.field_a.c(true);
              break L1;
            } else {
              break L1;
            }
          }
          var1 = 63;
          int discarded$5 = 44;
          vb.a();
          return;
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((rd) this).a(param0, -81) != pe.field_b) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              stackOut_5_0 = gi.field_g;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = ha.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("rd.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    static {
    }
}
