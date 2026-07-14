/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == -101) {
                break L0;
              } else {
                var4 = null;
                boolean discarded$7 = ti.a((lh) null, false);
                break L0;
              }
            }
            try {
              var5 = param1.getCodeBase();
              var3 = kk.a(var5, param1, 4767999).getFile();
              Object discarded$8 = pb.a(param1, -11455, new Object[2], "updatelinks");
              Object discarded$9 = pb.a(param1, -11455, new Object[2], "updatelinks");
              Object discarded$10 = pb.a(param1, -11455, new Object[2], "updatelinks");
              Object discarded$11 = pb.a(param1, -11455, new Object[2], "updatelinks");
              Object discarded$12 = pb.a(param1, param0 ^ 11482, new Object[2], "updatelinks");
              Object discarded$13 = pb.a(param1, -11455, new Object[2], "updatelinks");
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

    final static void a(boolean param0, int param1) {
        nf.field_w = 0;
        ig.field_k = param1;
        la.field_b = rd.field_F;
        k.field_L = 0;
        lb.field_w = new ql(2);
        lb.field_w.a(-1, ua.a(ob.field_g, -13412, ck.field_c), param0, -76);
    }

    final static boolean a(lh param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1) {
          L0: {
            field_a = -91;
            if (-2 != param0.e(1, (byte) 98)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-2 != param0.e(1, (byte) 98)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
