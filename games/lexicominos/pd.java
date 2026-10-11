/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends kd {
    int field_p;
    ei[] field_k;
    int[] field_m;
    int[] field_n;
    byte[][][] field_o;
    ei[] field_i;
    int field_j;
    static int[] field_l;
    int[] field_h;

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException var3_ref = null;
          java.applet.Applet var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = gf.a(3, var3, param2);
              m.a(true, true, var3.toString(), param2);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
              var3_ref2.printStackTrace();
            }
            if (param1 < -65) {
              return;
            }
            var4 = (java.applet.Applet) null;
            pd.a((String) null, -123, (java.applet.Applet) null);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref;
            stackIn_8_1 = new StringBuilder().append("pd.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = ne.a((char)param2, "", param0, (byte) -126);
          var3 = ci.a(param1, (byte) -79);
          stackIn_5_0 = (param0.indexOf(param1) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("pd.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        ul var1 = (ul) (vb.field_m.a(31334));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        lf.a(var1.field_h, var1.field_j, var1.field_n);
        lf.g(var1.field_l, var1.field_i, var1.field_p, var1.field_m);
        var1.field_h = null;
        pb.field_k.b(125, var1);
        if (param0 == -22949) {
          return;
        }
        field_l = (int[]) null;
    }

    pd() {
    }

    public static void b(int param0) {
        int var1 = 86 % ((param0 + 51) / 42);
        field_l = null;
    }

    static {
        field_l = new int[8192];
    }
}
