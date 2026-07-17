/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static void a(byte param0, java.applet.Applet param1) {
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
                L1: {
                  var5 = param1.getCodeBase();
                  var3 = kk.a(var5, param1, 4767999).getFile();
                  Object discarded$8 = pb.a(param1, -11455, new Object[2], "updatelinks");
                  Object discarded$9 = pb.a(param1, -11455, new Object[2], "updatelinks");
                  Object discarded$10 = pb.a(param1, -11455, new Object[2], "updatelinks");
                  Object discarded$11 = pb.a(param1, -11455, new Object[2], "updatelinks");
                  Object discarded$12 = pb.a(param1, param0 ^ 11482, new Object[2], "updatelinks");
                  Object discarded$13 = pb.a(param1, -11455, new Object[2], "updatelinks");
                  break L1;
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
                stackOut_6_1 = new StringBuilder().append("ti.C(").append(param0).append(44);
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
              throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1) {
        nf.field_w = 0;
        ig.field_k = 0;
        la.field_b = rd.field_F;
        k.field_L = 0;
        lb.field_w = new ql(2);
        lb.field_w.a(-1, ua.a(ob.field_g, -13412, ck.field_c), param0, -76);
    }

    final static boolean a(lh param0, boolean param1) {
        return param0.e(1, (byte) 98) == 1;
    }

    static {
    }
}
