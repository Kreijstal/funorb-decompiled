/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static boolean field_a;
    static hj field_c;
    static int field_b;

    final static void a(String param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                hg.field_M = param0;
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!(0 != param0.length())) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                eo.a(param1, -31645, "document.cookie=\"" + var5 + "\"");
                int discarded$0 = 49;
                bb.a(param1);
            } catch (RuntimeException runtimeException) {
                throw kk.a((Throwable) (Object) runtimeException, "mn.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_c = null;
    }

    final static void a(wd[] param0, vd param1, byte param2) {
        RuntimeException var3 = null;
        uh var3_ref = null;
        uh var4 = null;
        wd var5 = null;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        wd var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        uh var20 = null;
        qm var21 = null;
        uh var22 = null;
        qm var23 = null;
        qm var24 = null;
        qm var25 = null;
        uh var26 = null;
        uh var27 = null;
        qm var28 = null;
        qm var29 = null;
        uh var30 = null;
        uh var31 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            var20 = o.a((byte) 80);
            var3_ref = var20;
            var22 = o.a((byte) 7);
            var4 = var22;
            var5 = param0[-1 + param0.length];
            var21 = var5.c(true);
            var23 = var5.o(-14);
            var20.a(var21.field_h, (byte) 77);
            var20.a(var21.field_f, (byte) 104);
            var22.a(var23.field_h, (byte) 85);
            var22.a(var23.field_f, (byte) 81);
            var8 = ce.a(-1, (wc[]) (Object) param0);
            var9 = 1 + (int)(var8 / 40.0f);
            var10 = var8 / (float)var9;
            if (param2 < -13) {
              var11 = var10;
              var12 = 0;
              L1: while (true) {
                if (var12 >= param0.length) {
                  break L0;
                } else {
                  var13 = param0[var12];
                  var14 = var13.f(50);
                  var15 = 1 + (int)(var14 / 5.0f);
                  var16 = var14 / (float)var15;
                  var17 = 1.0f / (float)var15;
                  var18 = var17;
                  L2: while (true) {
                    if (1.0f <= var18) {
                      var28 = var13.h(7560980);
                      var29 = var13.a((byte) 29);
                      var3_ref.a(var28.field_h, (byte) 117);
                      var3_ref.a(var28.field_f, (byte) 66);
                      var4.a(var29.field_h, (byte) 95);
                      var4.a(var29.field_f, (byte) 121);
                      param1.a(ef.a(1.0f, var13, 14, -var17 + var18), var4.a(-60), var13.field_k, var3_ref.a(-127), (byte) 49);
                      var30 = o.a((byte) 17);
                      var31 = o.a((byte) -128);
                      var30.a(var28.field_h, (byte) 71);
                      var30.a(var28.field_f, (byte) 123);
                      var31.a(var29.field_h, (byte) 91);
                      var31.a(var29.field_f, (byte) 101);
                      var11 = var10;
                      var12++;
                      continue L1;
                    } else {
                      L3: {
                        var24 = var13.a(var18, 255);
                        var25 = var13.a(var18, false);
                        var3_ref.a(var24.field_h, (byte) 110);
                        var3_ref.a(var24.field_f, (byte) 122);
                        var4.a(var25.field_h, (byte) 102);
                        var11 = var11 - var16;
                        var4.a(var25.field_f, (byte) 110);
                        if (var11 >= 0.0f) {
                          break L3;
                        } else {
                          param1.a(ef.a(var18, var13, 14, var18 - var17), var4.a(-50), var13.field_k, var3_ref.a(-90), (byte) 49);
                          var26 = o.a((byte) 51);
                          var3_ref = var26;
                          var27 = o.a((byte) 21);
                          var4 = var27;
                          var26.a(var24.field_h, (byte) 84);
                          var26.a(var24.field_f, (byte) 68);
                          var27.a(var25.field_h, (byte) 67);
                          var11 = var11 + var10;
                          var27.a(var25.field_f, (byte) 77);
                          break L3;
                        }
                      }
                      var18 = var18 + var17;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("mn.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = -1;
    }
}
