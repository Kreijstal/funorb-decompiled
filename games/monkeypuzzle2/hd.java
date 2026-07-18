/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends a {
    static pj field_u;
    private int field_q;
    private int field_t;
    private int field_s;
    private le[] field_r;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(uf.a(param1, (byte) 103, var2), "_top");
                    if (param0) {
                      break L1;
                    } else {
                      java.awt.Container discarded$2 = hd.b(false);
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("hd.A(").append(param0).append(',');
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L2;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L2;
                }
              }
              throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c() {
        field_u = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public hd() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_g) {
                if (param1.b((byte) 80)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof t)) {
                break L2;
              } else {
                param0 = param0 & ((t) (Object) param1).field_w;
                break L2;
              }
            }
            L3: {
              if (param0) {
                if (var6_int != 0) {
                  stackOut_12_0 = ((hd) this).field_s;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((hd) this).field_q;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = ((hd) this).field_t;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              int discarded$2 = 42;
              ab.a(param1.field_l, var7, ((hd) this).field_r, (-((hd) this).field_r[0].field_n + param1.field_p >> 1) + param1.field_e + param2, param3 - -param1.field_r);
              if (!param0) {
                stackOut_15_0 = 7105644;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 16777215;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            var8 = stackIn_16_0;
            if (param4 > 19) {
              int discarded$3 = ((hd) this).field_p.a(param1.field_s, param1.field_r + param3, param2 + (param1.field_e + -2), param1.field_l, param1.field_p, var8, -1, 1, 1, ((hd) this).field_p.field_C);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("hd.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static java.awt.Container b(boolean param0) {
        Object var2 = null;
        if (hk.field_e == null) {
          if (!param0) {
            var2 = null;
            hd.a(false, (java.applet.Applet) null);
            int discarded$4 = 0;
            return (java.awt.Container) (Object) ii.a();
          } else {
            int discarded$5 = 0;
            return (java.awt.Container) (Object) ii.a();
          }
        } else {
          return (java.awt.Container) (Object) hk.field_e;
        }
    }

    private hd(int param0, int param1, int param2) {
        ((hd) this).field_p = pj.field_c;
        ((hd) this).field_q = param0;
        ((hd) this).field_r = qj.field_C;
        ((hd) this).field_s = param1;
        ((hd) this).field_t = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new pj();
    }
}
