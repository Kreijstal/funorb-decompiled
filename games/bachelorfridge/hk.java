/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int[] field_f;
    static int field_e;
    static boolean field_d;
    private String field_g;
    static String[] field_h;
    static String field_a;
    static sna field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_c = null;
        if (param0) {
          field_b = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
    }

    final static kv[] a(String param0, vr param1, int param2, String param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        kv[] var6 = null;
        kv[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 119 / ((-3 - param2) / 39);
          var6 = gw.a(param3, param0, param1, -43);
          var4 = var6;
          var6[3].field_o = var6[3].field_p;
          var6[1].field_n = var6[1].field_q;
          var6[5].field_o = var6[5].field_p;
          var6[7].field_n = var6[7].field_q;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("hk.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    hk(String param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 0) {
            field_d = true;
          }
          stackIn_3_0 = this.field_g.equals(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hk.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          int var3_int = 12 % ((-16 - param0) / 61);
          oc.a(param1, "jagex-last-login-method", 31536000L, 123, this.field_g);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "This game option is not available in rated games.";
        field_h = new String[]{"Idle.bin", "Walk.bin", "Jump.bin", "Happy.bin", "Attack.bin", "React.bin", "Death.bin", "Kick.bin", "Range.bin", "Climb.bin", "Eat.bin", "Sleep.bin"};
        field_b = "Cancel";
    }
}
