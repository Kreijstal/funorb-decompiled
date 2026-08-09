/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            lh var4 = null;
            java.net.URL var5 = null;
            try {
              L0: {
                if (param0 == -101) {
                  break L0;
                } else {
                  var4 = (lh) null;
                  ti.a((lh) null, false);
                  break L0;
                }
              }
              try {
                L1: {
                  var5 = param1.getCodeBase();
                  var3 = kk.a(var5, param1, 4767999).getFile();
                  pb.a(param1, -11455, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
                  pb.a(param1, -11455, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
                  pb.a(param1, -11455, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
                  pb.a(param1, -11455, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
                  pb.a(param1, param0 ^ 11482, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
                  pb.a(param1, -11455, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
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
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("ti.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
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
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = -91;
                break L1;
              }
            }
            L2: {
              if (-2 != (param0.e(1, (byte) 98) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ti.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
    }
}
