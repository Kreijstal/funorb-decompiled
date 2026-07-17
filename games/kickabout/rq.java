/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends qt {
    static dp field_D;
    static String field_B;
    static uo field_E;
    static java.awt.Frame field_A;

    public static void a(boolean param0) {
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
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_13_0 = 0.0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var22 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var13 = go.a(param4, param0, 0, ra.field_F);
              var14 = go.a(param4, param0, 0, tf.field_g);
              var15 = go.a(param4, param0, 0, gm.field_fb);
              var16 = go.a(param4, param0, 0, ao.field_i);
              var19 = 0.0;
              jr.field_Mb = -1;
              if (param2 == -99) {
                break L1;
              } else {
                rq.a((byte) -36, 37L);
                break L1;
              }
            }
            var21 = param7;
            L2: while (true) {
              if (param1 <= var21) {
                stackOut_13_0 = var19;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var9_int = var13 - -ll.a(ra.field_F, param2 ^ -4, param0, param4, var21);
                  var10 = ll.a(tf.field_g, 111, param0, param4, var21) + var14;
                  var11 = var15 + ll.a(gm.field_fb, 121, param0, param4, var21);
                  var12 = var16 - -ll.a(ao.field_i, 110, param0, param4, var21);
                  if (var12 == 0) {
                    var21++;
                    break L3;
                  } else {
                    var17 = ((double)var10 * (double)var10 + (double)var9_int * (double)var9_int + (double)var11 * (double)var11) / (double)var12;
                    var12 = -var12 + param6;
                    var9_int = param5 - var9_int;
                    var11 = -var11 + param3;
                    var10 = param8 - var10;
                    if (var12 == 0) {
                      var21++;
                      break L3;
                    } else {
                      var17 = var17 + ((double)var11 * (double)var11 + ((double)var9_int * (double)var9_int + (double)var10 * (double)var10)) / (double)var12;
                      if (var17 <= var19) {
                        break L3;
                      } else {
                        var19 = var17;
                        jr.field_Mb = var21;
                        break L3;
                      }
                    }
                  }
                }
                var21++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var9;
            stackOut_15_1 = new StringBuilder().append("rq.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_14_0;
    }

    rq() {
    }

    final static void a(byte param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param1);
                if (param0 == -93) {
                  break L0;
                } else {
                  field_E = null;
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
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
