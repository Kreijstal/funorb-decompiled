/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static String field_a;
    static int field_c;
    static String field_b;
    static si field_d;

    final static void a(int param0, int[] param1, int param2, byte[] param3, boolean param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!param4) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= eb.field_g.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param2 = eb.field_g[var5_int];
                  var6 = var5_int << 990596900;
                  L2: while (true) {
                    incrementValue$5 = param2;
                    param2--;
                    if (0 == incrementValue$5) {
                      var5_int++;
                      continue L1;
                    } else {
                      incrementValue$6 = var6;
                      var6++;
                      param0 = ac.field_K[incrementValue$6];
                      dupTemp$7 = param3[param0];
                      dupTemp$8 = param1[dupTemp$7];
                      param1[dupTemp$7] = dupTemp$8 + 1;
                      ac.field_K[dupTemp$8] = param0;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("op.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            field_b = (String) null;
        }
        field_b = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = ar.a(param1, var4, param0 ^ param0).getFile();
                    je.a((byte) 83, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
                    je.a((byte) 55, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
                    je.a((byte) 120, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    je.a((byte) -72, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
                    je.a((byte) 126, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
                    je.a((byte) -117, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("op.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "<img=2> / <img=10><br><img=1> / <img=12><br><img=3> / <img=11><br><img=4> / <img=9><br><img=5> / <img=7><br><br><img=6> / <img=13><br><img=5><img=5><br><br><img=0><br><img=15> / <img=17><br><img=14> / <img=16><br><img=8><br><img=18>";
        field_a = null;
    }
}
