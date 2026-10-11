/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          lh var4 = null;
          java.net.URL var5 = null;
          try {
            if (param0 != -101) {
              var4 = (lh) null;
              ti.a((lh) null, false);
            }
            try {
              var5 = param1.getCodeBase();
              var3 = kk.a(var5, param1, 4767999).getFile();
              pb.a(param1, -11455, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
              pb.a(param1, -11455, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
              pb.a(param1, -11455, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
              pb.a(param1, -11455, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
              pb.a(param1, param0 ^ 11482, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
              pb.a(param1, -11455, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ti.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_a = -91;
          }
          stackIn_5_0 = (param0.e(1, (byte) 98) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
