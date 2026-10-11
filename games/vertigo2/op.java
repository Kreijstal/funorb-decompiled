/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static String field_a;
    static int field_c;
    static String field_b;
    static si field_d;

    final static void a(int param0, int[] param1, int param2, byte[] param3, boolean param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param4) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= eb.field_g.length) {
              return;
            }
            param2 = eb.field_g[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = ac.field_K[incrementValue$1];
              dupTemp$2 = param3[param0];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              ac.field_K[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("op.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
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
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = ar.a(param1, var4, param0 ^ param0).getFile();
              je.a((byte) 83, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
              je.a((byte) 55, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
              je.a((byte) 120, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              je.a((byte) -72, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
              je.a((byte) 126, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
              je.a((byte) -117, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref;
            stackIn_6_1 = new StringBuilder().append("op.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
