/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va implements mh {
    private vn field_a;
    private int field_e;
    private int field_h;
    private int field_g;
    private int field_f;
    private int field_i;
    private int field_c;
    private int field_d;
    static int field_b;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vb var14 = null;
        pk stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
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
            L1: {
              if (!(param0 instanceof vb)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pk) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (pk) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (vb) (Object) stackIn_3_0;
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, ((va) this).field_i);
              var7 = param4 - (-param0.field_r + -var14.field_G);
              var8 = var14.field_K + (param1 - -param0.field_v);
              lk.b(var7, var8, var14.field_F, ((va) this).field_e);
              if (-1 == var14.field_M) {
                break L3;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_M) / (double)var14.field_L;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
                var12 = (int)(Math.cos(var9) * (double)var14.field_F);
                lk.b(var7 - -var11, var8 + var12, 1, ((va) this).field_h);
                break L3;
              }
            }
            L4: {
              lk.b(var7, var8, 2, 1);
              if (param2 == 5592405) {
                break L4;
              } else {
                ((va) this).field_d = -11;
                break L4;
              }
            }
            L5: {
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
              var12 = (int)(Math.cos(var9) * (double)var14.field_F);
              lk.e(var7, var8, var7 + var11, var12 + var8, 1);
              if (null == ((va) this).field_a) {
                break L5;
              } else {
                var13 = var14.field_F + (var14.field_G - -((va) this).field_f);
                int discarded$1 = ((va) this).field_a.a(param0.field_m, param0.field_r + (param4 + var13), param0.field_v + (param1 + ((va) this).field_d), -((va) this).field_f - var13 + param0.field_q, -(((va) this).field_f << 1) + param0.field_p, ((va) this).field_g, ((va) this).field_c, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("va.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            Object var4 = null;
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
                  L1: {
                    if (!param0) {
                      break L1;
                    } else {
                      var4 = null;
                      va.a(true, (java.applet.Applet) null);
                      break L1;
                    }
                  }
                  var5 = param1.getCodeBase();
                  var3 = td.a((byte) 121, param1, var5).getFile();
                  Object discarded$6 = tw.a(-105, param1, "updatelinks", new Object[2]);
                  Object discarded$7 = tw.a(-115, param1, "updatelinks", new Object[2]);
                  Object discarded$8 = tw.a(-111, param1, "updatelinks", new Object[2]);
                  Object discarded$9 = tw.a(-106, param1, "updatelinks", new Object[2]);
                  Object discarded$10 = tw.a(-126, param1, "updatelinks", new Object[2]);
                  Object discarded$11 = tw.a(-101, param1, "updatelinks", new Object[2]);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("va.B(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    va(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((va) this).field_i = param7;
            ((va) this).field_d = param2;
            ((va) this).field_h = param6;
            ((va) this).field_f = param1;
            ((va) this).field_e = param5;
            ((va) this).field_a = param0;
            ((va) this).field_g = param3;
            ((va) this).field_c = param4;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "va.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
