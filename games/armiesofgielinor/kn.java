/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends oj {
    static int field_z;
    static String field_y;

    final boolean b(ha param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == -75) {
              L1: {
                if (param0.field_Eb[((kn) this).field_w.field_w * param0.field_v + ((kn) this).field_w.field_J].field_c == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kn.B(");
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
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 != -75) {
            kn.g(-9);
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          L0: {
            System.out.println("Teleport reappear event debug");
            System.out.println("Unit at " + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w);
            if (null != ((kn) this).field_w) {
              var3 = "EventTelefrag: pos: (" + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w + ")";
              break L0;
            } else {
              var3 = "EventTelefrag: unit: null";
              break L0;
            }
          }
          var4 = -50 % ((53 - param0) / 51);
          return var3;
        } else {
          L1: {
            if (null != ((kn) this).field_w) {
              var3 = "EventTelefrag: pos: (" + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w + ")";
              break L1;
            } else {
              var3 = "EventTelefrag: unit: null";
              break L1;
            }
          }
          var4 = -50 % ((53 - param0) / 51);
          return var3;
        }
    }

    final void a(ha param0, int param1) {
        ne var4 = null;
        ne var3 = null;
        if (param0.field_x) {
            return;
        }
        try {
            var4 = param0.field_Eb[param0.field_v * ((kn) this).field_w.field_w + ((kn) this).field_w.field_J];
            var3 = var4;
            if (null != var4.field_c) {
                var4.field_c.a(false, (byte) 105);
            }
            var3.field_c = ((kn) this).field_w;
            ((kn) this).field_w.a((byte) 82);
            if (((kn) this).field_w.field_N == 74) {
                ((kn) this).field_w.field_B = 2;
            } else {
                ((kn) this).field_w.field_B = 1;
            }
            if (param1 != -26661) {
                kn.g(99);
            }
            ((kn) this).field_w.field_s = true;
            fl.a(param0, -114);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "kn.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 <= -84) {
              stackOut_3_0 = ((kn) this).a((byte) -39, param2, param0, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kn.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    kn(jd param0) {
        try {
            ((kn) this).field_w = param0;
            ((kn) this).field_m = 5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "kn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_y = "Game full";
    }
}
