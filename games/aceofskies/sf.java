/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends wf {
    private float field_f;
    private int field_i;
    private int field_j;
    private int field_h;
    private int field_g;
    private int field_e;

    final static Object a(boolean param0, int param1, byte[] param2) {
        ku var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ku stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_7_0 = null;
        ku stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if ((param2.length ^ -1) >= param1) {
                if (param0) {
                  stackOut_9_0 = fg.a(param2, (byte) 121);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = (byte[]) (param2);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = new ku();
                ((af) ((Object) var3)).a((byte) 56, param2);
                stackOut_4_0 = (ku) (var3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("sf.G(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    final int a(int param0) {
        float discarded$0 = 0.0f;
        if (param0 <= 53) {
            discarded$0 = this.a(true);
            return this.field_g;
        }
        return this.field_g;
    }

    final static ej[] d(byte param0) {
        if (param0 < 52) {
          return (ej[]) null;
        } else {
          return new ej[]{gm.field_v, o.field_c, av.field_a, pg.field_d, qe.field_e, tb.field_g, ej.field_b, kb.field_C, op.field_b, qd.field_n, rc.field_e, ct.field_H, lc.field_b, ml.field_j};
        }
    }

    final int c(byte param0) {
        if (param0 >= -73) {
            return 71;
        }
        return this.field_i;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            gt.field_r = param2;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param2.length() == 0) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + bt.a(false, 94608000000L + kh.a(-125)) + "; Max-Age=" + 94608000L;
                }
                fe.a(param1, -7012, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            if (param0 > -110) {
                return;
            }
            try {
                v.a(true, param1);
            } catch (RuntimeException runtimeException) {
                throw pn.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(int param0) {
        if (param0 != 0) {
            return 32;
        }
        return this.field_j;
    }

    final int d(int param0) {
        if (param0 != 0) {
            this.field_i = 76;
            return this.field_e;
        }
        return this.field_e;
    }

    final int a(byte param0) {
        int var2 = 104 % ((70 - param0) / 34);
        return this.field_h;
    }

    final float a(boolean param0) {
        if (param0) {
            return -0.44879353046417236f;
        }
        return this.field_f;
    }

    private sf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
