/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    int field_g;
    static int field_e;
    static long field_d;
    int field_h;
    int field_f;
    static String field_b;
    int field_c;
    static boolean field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        String[] stackIn_6_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var8 = wizardrun.field_H;
        try {
          var3_int = 0;
          var4 = pf.field_f;
          if (param0 != -578629823) {
            stackIn_3_0 = -85;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "rb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        stackIn_6_0 = a.field_b;
        try {
          while (stackIn_6_0.length > var3_int) {
            var5 = ec.field_g[var3_int];
            if (0 > var5) {
              var4 = var4 + si.field_f;
            } else {
              var6 = sf.a(true, 110, a.field_b[var3_int]);
              var7 = -(var6 >> 1) + id.field_c;
              var4 = var4 + na.field_e;
              if (ih.a(-vl.field_h + var7, (vl.field_h << 1) + var6, ec.field_c + (e.field_d << 1), var4, true, param1, param2)) {
                stackIn_11_0 = var5;
                return stackIn_11_0;
              }
              var4 = var4 + (ec.field_c + (na.field_e + (e.field_d << 1)));
            }
            var3_int++;
            stackIn_6_0 = a.field_b;
          }
          stackIn_17_0 = -1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "rb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        vf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          var4 = (vf) (r.field_d.b((byte) 50));
          if (param1 >= -72) {
            rb.a(57, (byte) -120);
          }
          while (var4 != null) {
            oj.a(param0, var4, -22);
            var4 = (vf) (r.field_d.d(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "rb.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == -1926289535) {
          return;
        }
        rb.a(-27, (byte) -34);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != -1926289535) {
              return;
            }
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = jl.a(-91, var3, param2);
              sh.a(true, 127, var3.toString(), param2);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("rb.B(");
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
            throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Achievements This Game";
    }
}
