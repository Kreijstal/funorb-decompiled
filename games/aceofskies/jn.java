/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends ab implements dn {
    static String field_u;
    private mi[] field_y;
    static boolean field_t;
    private oo field_x;
    private String field_z;
    private int field_v;
    private hc field_w;
    private int[] field_A;

    jn(oo param0, hc param1, String param2) {
        super(0, 0, 288, 0, (ir) null);
        int var4_int = 0;
        this.field_v = 0;
        try {
            this.field_x = param0;
            this.field_z = param2;
            this.field_w = param1;
            var4_int = null != this.field_z ? this.field_w.a(this.field_z, 260, this.field_w.field_I) : 0;
            this.a(22 + var4_int, 0, 0, 288, (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        if (param0 > -55) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            jn.a((byte) -63, (java.applet.Applet) null);
        }
        field_u = null;
    }

    final mi a(no param0, int param1, String param2) {
        mi discarded$2 = null;
        mi var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        mi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              var4 = new mi(param2, param0);
              var4.field_e = (ir) ((Object) new qb());
              if (param1 == 17547) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$2 = this.a((no) null, 91, (String) null);
                break L1;
              }
            }
            var5 = -2 + this.field_n;
            this.a(34 + this.field_n, 0, 0, this.field_q, (byte) 123);
            var4.a(30, 7, var5, -14 + this.field_q, (byte) 123);
            this.a(var4, param1 + -17546);
            stackOut_2_0 = (mi) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("jn.CA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        try {
            for (var6_int = 0; var6_int < this.field_v; var6_int++) {
                if (this.field_y[var6_int] == param1) {
                    var7 = this.field_A[var6_int];
                    if (0 == (var7 ^ -1)) {
                        this.field_x.h((byte) -67);
                        break;
                    }
                    oi.a(this.field_A[var6_int], 20665);
                    break;
                }
            }
            var6_int = 101 % ((param4 - -27) / 61);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jn.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void g(int param0) {
        if (param0 != 4) {
            field_t = true;
        }
        if (!(cn.b(true))) {
            if (!ml.field_p) {
                if (fa.field_b == null) {
                    fa.field_b = sc.a(false, 4);
                }
                if (fa.field_b.field_g) {
                    r.field_n = r.field_n & (fa.field_b.field_e ^ -1);
                    hg.field_D = hg.field_D | fa.field_b.field_e;
                    ml.field_p = true;
                    fa.field_b = null;
                }
            }
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        if (!(this.field_v < param1)) {
            return;
        }
        mi[] var7 = new mi[param1];
        mi[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_v; var5++) {
            var7[var5] = this.field_y[var5];
            var4[var5] = this.field_A[var5];
        }
        this.field_y = var3;
        if (param0 != 1) {
            return;
        }
        this.field_A = var4;
        this.field_v = param1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 >= 118) {
                        break L2;
                      } else {
                        field_t = true;
                        break L2;
                      }
                    }
                    L3: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if ((var3 ^ -1) <= -1) {
                        var4 = var4 + var2.substring(var3);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5 = new java.net.URL(param1.getCodeBase(), var4);
                    param1.getAppletContext().showDocument(jf.a(param1, var5, 56), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("jn.EA(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= 64) {
            this.field_y = (mi[]) null;
        }
        super.a((byte) 119, param1, param2, param3);
        int discarded$0 = this.field_w.a(this.field_z, this.field_p + param3 + 14, 10 + this.field_h + param2, this.field_q + -28, this.field_n, 16777215, -1, 0, 0, this.field_w.field_I);
    }

    final void a(int param0, byte param1, String param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_v;
            this.a(1, 1 + var4_int);
            this.field_y[var4_int] = this.a((no) (this), 17547, param2);
            this.field_A[var4_int] = param0;
            int var5 = -116 % ((param1 - 17) / 58);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jn.AA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "Names cannot contain consecutive spaces";
    }
}
