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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -75) {
              L1: {
                if (param0.field_Eb[this.field_w.field_w * param0.field_v + this.field_w.field_J].field_c == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kn.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 != -75) {
            kn.g(-9);
        }
    }

    final String a(byte param0, boolean param1) {
        String var3;
        int var4;
        if (param1) {
          L0: {
            System.out.println("Teleport reappear event debug");
            System.out.println("Unit at " + this.field_w.field_J + "," + this.field_w.field_w);
            if (null != this.field_w) {
              var3 = "EventTelefrag: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
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
            if (null != this.field_w) {
              var3 = "EventTelefrag: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
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
            var4 = param0.field_Eb[param0.field_v * this.field_w.field_w + this.field_w.field_J];
            var3 = var4;
            if (null != var4.field_c) {
                var4.field_c.a(false, (byte) 105);
            }
            var3.field_c = this.field_w;
            this.field_w.a((byte) 82);
            if (-75 == (this.field_w.field_N ^ -1)) {
                this.field_w.field_B = 2;
            } else {
                this.field_w.field_B = 1;
            }
            if (param1 != -26661) {
                kn.g(99);
            }
            this.field_w.field_s = true;
            fl.a(param0, -114);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kn.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -84) {
              stackIn_4_0 = this.a((byte) -39, param2, param0, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("kn.A(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    kn(jd param0) {
        try {
            this.field_w = param0;
            this.field_m = 5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = 0;
        field_y = "Game full";
    }
}
