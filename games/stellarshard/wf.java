/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf {
    static pf field_e;
    static String field_c;
    static int[] field_d;
    static String field_b;
    static char[] field_a;

    final static sk a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        sk stackIn_2_0 = null;
        hf stackIn_6_0 = null;
        ff stackIn_9_0 = null;
        nh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -57) {
            stackIn_2_0 = (sk) null;
            return stackIn_2_0;
          }
          if (param0 == 0L &&
            param1 != null) {
            stackIn_6_0 = new hf(param1, param3);
            return (sk) ((Object) stackIn_6_0);
          }
          if (!param4) {
            stackIn_11_0 = new nh(param0, param3);
            return (sk) ((Object) stackIn_11_0);
          }
          stackIn_9_0 = new ff(param0, param3);
          return (sk) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("wf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, int param1);

    public static void b(int param0) {
        field_b = null;
        if (param0 >= 72) {
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        wf.a(-88, (java.applet.Applet) null);
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              var3 = var2.indexOf((int) (char)param0);
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(lk.a(param1, var5, -102), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref2;
            stackIn_9_1 = new StringBuilder().append("wf.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract lh a(int param0);

    static {
        field_c = "Cancel";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_d = new int[]{200, 200, 200, 200, 200, 500, 300, 500, 200, 500, 1000, 200, 300, 100};
    }
}
