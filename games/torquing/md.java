/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_c;
    static String field_d;
    static int[] field_a;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 == -137) {
          field_b = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        md.a((byte) -126, (byte[]) null, true);
        field_b = null;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "md.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "md.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static sm a(String param0, int param1, la param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        sm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param1 ^ -31095, param3);
          if (param1 != 31094) {
            field_b = (String) null;
          }
          var5 = param2.a(param0, param1 ^ -30987, var4_int);
          stackIn_3_0 = bf.a(var4_int, var5, param2, (byte) -44);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("md.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        jm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        jm stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -5) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length > 136) {
            var3 = new jm();
            ((dp) ((Object) var3)).a((byte) -70, param1);
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          if (!param2) {
            stackIn_14_0 = (byte[]) (param1);
            return stackIn_14_0;
          }
          stackIn_12_0 = ch.a(param1, (byte) 115);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("md.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    md(java.awt.Component param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
