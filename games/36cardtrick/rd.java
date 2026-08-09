/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends cg {
    static w field_j;
    static byte[][] field_k;

    public static void c(boolean param0) {
        if (!param0) {
            rd.b((byte) 56);
            field_k = (byte[][]) null;
            field_j = null;
            return;
        }
        field_k = (byte[][]) null;
        field_j = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1266438832) {
          field_j = (w) null;
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> -1272223327);
          param0 = (param0 & 858993459) + (param0 >>> 2047830018 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 1646212772);
          param0 = param0 + (param0 >>> 1141612424);
          param0 = param0 + (param0 >>> 1266438832);
          return 255 & param0;
        } else {
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> -1272223327);
          param0 = (param0 & 858993459) + (param0 >>> 2047830018 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 1646212772);
          param0 = param0 + (param0 >>> 1141612424);
          param0 = param0 + (param0 >>> 1266438832);
          return 255 & param0;
        }
    }

    final static void a(byte param0, String param1) {
        try {
            we.a(-119, param1);
            if (param0 <= 54) {
                field_j = (w) null;
            }
            ca.a(kj.field_q, false, 16777215);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rd.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sg a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        sg stackIn_7_0 = null;
        sg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != di.a(param0, 64)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1 < -58) {
                break L2;
              } else {
                field_j = (w) null;
                break L2;
              }
            }
            if (var3_int != 0) {
              stackIn_9_0 = ii.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = pe.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("rd.M(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    rd(hf param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1;
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
          var1 = -127 / ((param0 - 12) / 41);
          vb.a((byte) 44);
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
          var1 = -127 / ((param0 - 12) / 41);
          vb.a((byte) 44);
          return;
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param0, -81) != pe.field_b) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_k = (byte[][]) null;
                  break L1;
                }
              }
              stackIn_6_0 = gi.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = ha.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("rd.I(");

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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
    }
}
