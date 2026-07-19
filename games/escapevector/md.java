/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends r {
    static fk field_E;
    static volatile int field_G;
    static vn field_D;
    int field_F;
    static String field_H;

    public md() {
        super(0, 0, 0, 0, (db) null, (wn) null);
        this.field_F = 256;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1051710561;
        if (param0 != 127) {
          md.l(60);
          param1 = param1 | param1 >>> 1757938562;
          param1 = param1 | param1 >>> 1227445252;
          param1 = param1 | param1 >>> 1114085768;
          param1 = param1 | param1 >>> 1332124592;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 1757938562;
          param1 = param1 | param1 >>> 1227445252;
          param1 = param1 | param1 >>> 1114085768;
          param1 = param1 | param1 >>> 1332124592;
          return 1 + param1;
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException var3_ref = null;
            Exception var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = sh.a((byte) 95, param0, var3);
                    th.a(true, true, param0, var3.toString());
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    var3_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 < -91) {
                  break L0;
                } else {
                  field_H = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref);
                stackOut_6_1 = new StringBuilder().append("md.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              L4: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    md(hm param0) {
        super(param0.field_k, param0.field_j, param0.field_g, param0.field_x, (db) null, (wn) null);
        try {
            param0.a(this.field_g, 0, 0, true, this.field_x);
            this.field_C = param0;
            this.field_F = 256;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void l(int param0) {
        int var1 = -26 / ((param0 - -6) / 58);
        field_D = null;
        field_E = null;
        field_H = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ed var6 = null;
        if (param2 == 0) {
          if (null != this.field_C) {
            if (this.field_F != 0) {
              if ((this.field_F ^ -1) != -257) {
                var6 = new ed(this.field_C.field_g, this.field_C.field_x);
                eo.a(var6, (byte) -105);
                this.field_C.a(0, (byte) 91, param2, 0);
                if (param1 < 85) {
                  field_H = (String) null;
                  dl.a((byte) 107);
                  var6.d(this.field_k + param3, this.field_j + param0, this.field_F);
                  return;
                } else {
                  dl.a((byte) 107);
                  var6.d(this.field_k + param3, this.field_j + param0, this.field_F);
                  return;
                }
              } else {
                this.field_C.a(this.field_j + param0, (byte) 95, param2, this.field_k + param3);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_E = new fk(3);
        field_G = 0;
    }
}
