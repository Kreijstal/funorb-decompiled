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
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vb var14 = null;
        pk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof vb)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (pk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (pk) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (vb) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, ((va) this).field_i);
          var7 = param4 - (-param0.field_r + -var14.field_G);
          var8 = var14.field_K + (param1 - -param0.field_v);
          lk.b(var7, var8, var14.field_F, ((va) this).field_e);
          if (-1 == var14.field_M) {
            break L2;
          } else {
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_M) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            lk.b(var7 - -var11, var8 + var12, 1, ((va) this).field_h);
            break L2;
          }
        }
        lk.b(var7, var8, 2, 1);
        if (param2 != 5592405) {
          L3: {
            ((va) this).field_d = -11;
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            lk.e(var7, var8, var7 + var11, var12 + var8, 1);
            if (null == ((va) this).field_a) {
              break L3;
            } else {
              var13 = var14.field_F + (var14.field_G - -((va) this).field_f);
              int discarded$2 = ((va) this).field_a.a(param0.field_m, param0.field_r + (param4 + var13), param0.field_v + (param1 + ((va) this).field_d), -((va) this).field_f - var13 + param0.field_q, -(((va) this).field_f << 1286328385) + param0.field_p, ((va) this).field_g, ((va) this).field_c, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            lk.e(var7, var8, var7 + var11, var12 + var8, 1);
            if (null == ((va) this).field_a) {
              break L4;
            } else {
              var13 = var14.field_F + (var14.field_G - -((va) this).field_f);
              int discarded$3 = ((va) this).field_a.a(param0.field_m, param0.field_r + (param4 + var13), param0.field_v + (param1 + ((va) this).field_d), -((va) this).field_f - var13 + param0.field_q, -(((va) this).field_f << 1286328385) + param0.field_p, ((va) this).field_g, ((va) this).field_c, 1, 1, 0);
              break L4;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  var4 = null;
                  va.a(true, (java.applet.Applet) null);
                  break L0;
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
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    va(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((va) this).field_i = param7;
        ((va) this).field_d = param2;
        ((va) this).field_h = param6;
        ((va) this).field_f = param1;
        ((va) this).field_e = param5;
        ((va) this).field_a = param0;
        ((va) this).field_g = param3;
        ((va) this).field_c = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
