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
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(uf.a(param1, (byte) 103, var2), "_top");
                    if (param0) {
                      break L1;
                    } else {
                      hd.b(false);
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
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("hd.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L2;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L2;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_u = null;
        if (param0 != 0) {
            field_u = (pj) null;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public hd() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param1.field_g) {
                if (param1.b((byte) 80)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof t)) {
                break L2;
              } else {
                param0 = param0 & ((t) ((Object) param1)).field_w;
                break L2;
              }
            }
            L3: {
              if (param0) {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_s;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_q;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_t;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              ab.a(param1.field_l, var7, this.field_r, (-this.field_r[0].field_n + param1.field_p >> 216225601) + param1.field_e + param2, param3 - -param1.field_r, (byte) 42);
              if (!param0) {
                stackIn_16_0 = 7105644;
                break L4;
              } else {
                stackIn_16_0 = 16777215;
                break L4;
              }
            }
            var8 = stackIn_16_0;
            if (param4 > 19) {
              this.field_p.a(param1.field_s, param1.field_r + param3, param2 + (param1.field_e + -2), param1.field_l, param1.field_p, var8, -1, 1, 1, this.field_p.field_C);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("hd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static java.awt.Container b(boolean param0) {
        java.applet.Applet var2;
        if (hk.field_e == null) {
          if (!param0) {
            var2 = (java.applet.Applet) null;
            hd.a(false, (java.applet.Applet) null);
            return (java.awt.Container) ((Object) ii.a(false));
          } else {
            return (java.awt.Container) ((Object) ii.a(false));
          }
        } else {
          return (java.awt.Container) ((Object) hk.field_e);
        }
    }

    private hd(int param0, int param1, int param2) {
        this.field_p = pj.field_c;
        this.field_q = param0;
        this.field_r = qj.field_C;
        this.field_s = param1;
        this.field_t = param2;
    }

    static {
        field_u = new pj();
    }
}
