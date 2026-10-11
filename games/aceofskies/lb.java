/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb implements sm {
    private ac field_f;
    static boolean field_e;
    static long field_g;
    int[] field_d;
    int field_b;
    int field_c;
    static String[] field_a;

    final static int a(int param0) {
        om.field_c.a((byte) 95);
        if (ul.field_r.f(param0 + param0)) {
          return 0;
        }
        return wl.t(19078);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          int var2_int = 0;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(jf.a(param1, var2, -69), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            var2_int = -36 / ((-4 - param0) / 53);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("lb.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    lb(kj param0, pa param1, ac param2) {
        RuntimeException runtimeException = null;
        jg var5 = null;
        vh var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledSharedTail0 = !(!(param1 instanceof vh));
          if (!decompiledSharedTail0) {
            if (!(param1 instanceof jg)) {
              throw new RuntimeException();
            }
            var5 = (jg) (param1);
            this.field_b = var5.field_p;
            this.field_c = var5.field_o;
            this.field_d = var5.field_E;
            decompiledSharedTail0 = (AceOfSkies.field_G);
          }
          if (decompiledSharedTail0) {
            var6 = (vh) (param1);
            this.field_b = var6.field_p;
            this.field_c = var6.field_o;
            this.field_d = var6.field_E;
          }
          if (param2 != null) {
            this.field_f = param2;
            if (this.field_f.field_a == this.field_c &&
              this.field_f.field_g == this.field_b) {
              return;
            }
            throw new RuntimeException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("lb.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        dl var2 = null;
        dl var2Lifetime1;
        if (param1 == 0) {
          var2 = q.field_p;
          var2.g(109, param0);
          var2.b(param1 - 1336879960, 1);
          var2.b(-1336879960, 2);
          return;
        }
        field_e = true;
        var2Lifetime1 = q.field_p;
        var2Lifetime1.g(109, param0);
        var2Lifetime1.b(param1 - 1336879960, 1);
        var2Lifetime1.b(-1336879960, 2);
    }

    public static void b(int param0) {
        if (param0 < 18) {
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = lm.a('_', -128, param0, "");
          var3 = ph.a(param0, 0);
          var4 = -32 % ((param2 + 6) / 63);
          stackIn_5_0 = (param1.indexOf(param0) != -1) || (-1 != param1.indexOf(var3));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("lb.B(");
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
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_g = 0L;
        field_a = new String[]{"Knight of Skies", "King of Skies", "Ace of Skies", "Squadron Leader", "Flying Fortress", "Veteran", "Defender of the Realm", "Top Gun", "Kamikaze"};
        field_e = true;
    }
}
