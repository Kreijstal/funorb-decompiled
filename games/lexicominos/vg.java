/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static byte[][][] field_a;
    static sg[] field_d;
    static int field_b;
    static int[] field_c;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (!param0) {
                      var4 = param1.getCodeBase();
                      var3 = gf.a(3, var4, param1).getFile();
                      oa.a(param1, 22347, "updatelinks", new Object[]{"home", var3 + "home.ws"});
                      oa.a(param1, 22347, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"});
                      oa.a(param1, 22347, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"});
                      oa.a(param1, 22347, "updatelinks", new Object[]{"options", var3 + "options.ws"});
                      oa.a(param1, 22347, "updatelinks", new Object[]{"terms", var3 + "terms.ws"});
                      oa.a(param1, 22347, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"});
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("vg.D(").append(param0).append(',');

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
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = (byte[][][]) null;
        if (param0 != 0) {
            field_b = -79;
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(int param0) {
        ug.field_A.h(0);
        if (param0 > 100) {
          if (qj.field_fb == null) {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, qj.field_fb);
            return;
          } else {
            ug.field_A.a(-14579, qj.field_fb);
            return;
          }
        } else {
          field_b = 110;
          if (qj.field_fb != null) {
            ug.field_A.a(-14579, qj.field_fb);
            return;
          } else {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, qj.field_fb);
            return;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_d = new sg[15];
        field_c = new int[8192];
        field_b = 0;
    }
}
