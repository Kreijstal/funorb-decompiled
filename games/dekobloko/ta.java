/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static qm field_a;
    static boolean field_f;
    private String field_e;
    private boolean field_j;
    private boolean field_c;
    static hn field_i;
    static String field_g;
    static int field_d;
    static dd field_k;
    static int field_b;
    static String field_h;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          return;
        }
        field_h = null;
        field_k = null;
        field_g = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var2_int = -43 / ((param1 + 74) / 38);
          var3 = param0.length();
          var4 = 0;
          for (var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) + (-var4 + j.a(param0.charAt(var5), (byte) 28));
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ta.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 > -22) {
          ta.a(false);
        }
        boolean decompiledFrameRemainder0 = true;
        if (ca.field_vb >= 20 &&
          t.i((byte) 124) && (!(bb.field_e > 0) ||
          bd.d((byte) 31))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static boolean a(ji param0, ji param1, int param2, ji param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.a((byte) 121)) {
            return false;
          }
          if (!param0.a("commonui", (byte) -101)) {
            return false;
          }
          if (param1.a((byte) 121) &&
            param1.a("commonui", (byte) -117)) {
            if (param3.a((byte) 121) &&
              param3.a("button.gif", (byte) -34)) {
              if (param2 != -21) {
                field_h = (String) null;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ta.I(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static ck[] a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          ta.a(false, 17, -88, -29, -62);
        }
        return ca.a(param3, 1, param4, 1, 1, false, param2, param1, 3);
    }

    final void a(int param0, boolean param1) {
        this.field_j = true;
        this.field_c = param1 ? true : false;
        if (param0 != -21) {
          ta.a(false);
        }
    }

    final boolean b(int param0) {
        if (param0 != -3348) {
          return false;
        }
        return this.field_c;
    }

    final boolean a(int param0) {
        if (param0 < 49) {
          return false;
        }
        return this.field_j;
    }

    ta(String param0) {
        this.field_j = false;
        this.field_c = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (param0 < 59) {
          this.field_j = true;
        }
        return this.field_e;
    }

    static {
        field_i = null;
        field_g = "Fullscreen mode";
        field_d = 0;
        field_a = new qm(1, 2, 2, 0);
        field_h = "Auto-respond to <%0>";
    }
}
