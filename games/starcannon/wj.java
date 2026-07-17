/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_c;
    static String field_f;
    static gi field_d;
    static hl field_g;
    static int field_b;
    static int field_e;
    static volatile int field_a;

    final static void a(int param0, hl[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var5_int = param1[0].field_x;
                  var6 = param1[2].field_x;
                  var7 = param1[1].field_x;
                  param1[0].e(param2, param3);
                  param1[2].e(param2 + param4 + -var6, param3);
                  ki.a(be.field_c);
                  ki.c(var5_int + param2, param3, -var6 + param2 + param4, param1[1].field_q + param3);
                  var8 = param2 - -var5_int;
                  var9 = 80 % ((param0 - 53) / 32);
                  var10 = param2 + (param4 + -var6);
                  param2 = var8;
                  L2: while (true) {
                    if (var10 <= param2) {
                      ki.b(be.field_c);
                      break L0;
                    } else {
                      param1[1].e(param2, param3);
                      param2 = param2 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("wj.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(java.applet.Applet param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = param0.getDocumentBase().getFile();
                  var4 = var2;
                  var4 = var2;
                  var3 = var2.indexOf('?');
                  var4 = "reload.ws";
                  if (var3 < 0) {
                    break L0;
                  } else {
                    var4 = var4 + var2.substring(var3);
                    break L0;
                  }
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(wh.a(127, var5, param0), "_self");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("wj.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_d = null;
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final static void b() {
        bc var1 = (bc) (Object) va.field_h.d(77);
        if (!(var1 != null)) {
            var1 = new bc();
        }
        var1.a(ki.field_j, ki.field_g, ki.field_i, ki.field_a, ki.field_l, ki.field_e, ki.field_f, false);
        gi.field_a.b(70, (rf) (Object) var1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_e = 0;
        field_g = new hl(540, 140);
        field_a = -1;
    }
}
