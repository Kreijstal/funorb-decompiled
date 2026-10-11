/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private boolean field_b;
    static String field_d;
    private String field_e;
    private boolean field_a;
    static String field_c;

    final void a(boolean param0, int param1) {
        this.field_a = param0 ? true : false;
        if (param1 != 1537025605) {
          return;
        }
        this.field_b = true;
    }

    final String b(int param0) {
        if (param0 != 25477) {
          field_c = (String) null;
          return this.field_e;
        }
        return this.field_e;
    }

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lu var8 = null;
        int stackIn_5_0 = 0;
        iv stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        try {
          if (param1 > -126) {
            var8 = (lu) null;
            n.a((lu) null, -83);
          }
          var2 = qi.a(param0, (byte) 123);
          var3 = param0.e((byte) 126);
          stackIn_5_0 = (0 == (var3 & 32768)) ? 0 : 1;
          var4 = stackIn_5_0;
          var5 = var3 & 32767;
          var3Lifetime1 = param0.b(16711935);
          var5 = -16384 + (var5 ^ 16384);
          var6 = var3Lifetime1 >> 5;
          var7 = param0.b(16711935);
          stackIn_6_0 = new iv(var2, var4 != 0, var6, var5, var7);
          return (pp) ((Object) stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("n.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_b;
    }

    public static void a(byte param0) {
        if (param0 < 81) {
          n.a((byte) 118);
          field_c = null;
          field_d = null;
          return;
        }
        field_c = null;
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != -7750) {
          lu var3 = (lu) null;
          n.a((lu) null, 124);
          return this.field_a;
        }
        return this.field_a;
    }

    n(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "The blue square shows where your creature can move to, click any blue square to command your creature to move there.";
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
