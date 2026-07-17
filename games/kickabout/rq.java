/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends qt {
    static dp field_D;
    static String field_B;
    static uo field_E;
    static java.awt.Frame field_A;

    public static void a() {
        field_D = null;
        field_E = null;
        field_A = null;
        field_B = null;
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        uo var3 = pb.field_C;
        int var4 = 20 - -((rq) this).field_j;
        int var5 = ((rq) this).field_j + 360;
        int var6 = ((hu) (Object) var3).field_p + ((hu) (Object) var3).field_G;
        int var7 = ((hu) (Object) var3).c(vp.field_p, -var4 + var5, var6);
        on.a(-12 + var4, 155, -var4 + (var5 + 24), 12 + var7, 6, 0, 128);
        int discarded$0 = ((hu) (Object) var3).a(vp.field_p, var4, 160, -var4 + var5, 1000, 16777215, -1, 0, 0, var6);
    }

    final static double a(int param0, int param1, byte param2, int param3, ea param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        double stackIn_12_0 = 0.0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_11_0 = 0.0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var22 = Kickabout.field_G;
        try {
          L0: {
            var13 = go.a(param4, param0, 0, ra.field_F);
            var14 = go.a(param4, param0, 0, tf.field_g);
            var15 = go.a(param4, param0, 0, gm.field_fb);
            var16 = go.a(param4, param0, 0, ao.field_i);
            var19 = 0.0;
            jr.field_Mb = -1;
            var21 = param7;
            L1: while (true) {
              if (param1 <= var21) {
                stackOut_11_0 = var19;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var9_int = var13 - -ll.a(ra.field_F, 97, param0, param4, var21);
                  var10 = ll.a(tf.field_g, 111, param0, param4, var21) + var14;
                  var11 = var15 + ll.a(gm.field_fb, 121, param0, param4, var21);
                  var12 = var16 - -ll.a(ao.field_i, 110, param0, param4, var21);
                  if (var12 == 0) {
                    var21++;
                    break L2;
                  } else {
                    var17 = ((double)var10 * (double)var10 + (double)var9_int * (double)var9_int + (double)var11 * (double)var11) / (double)var12;
                    var12 = -var12 + param6;
                    var9_int = param5 - var9_int;
                    var11 = -var11 + param3;
                    var10 = param8 - var10;
                    if (var12 == 0) {
                      var21++;
                      break L2;
                    } else {
                      var17 = var17 + ((double)var11 * (double)var11 + ((double)var9_int * (double)var9_int + (double)var10 * (double)var10)) / (double)var12;
                      if (var17 <= var19) {
                        break L2;
                      } else {
                        var19 = var17;
                        jr.field_Mb = var21;
                        break L2;
                      }
                    }
                  }
                }
                var21++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("rq.J(").append(param0).append(44).append(param1).append(44).append(-99).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_12_0;
    }

    rq() {
    }

    final static void a(byte param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              Thread.sleep(param1);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "The <%0> have begun";
    }
}
