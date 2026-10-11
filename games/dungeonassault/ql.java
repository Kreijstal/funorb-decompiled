/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas {
    static String field_k;
    static cn field_c;
    private java.awt.Component field_i;
    static String field_l;
    static String field_a;
    static String field_h;
    static af field_f;
    static String field_g;
    static int field_d;
    static Object[] field_e;
    static int field_j;
    static int field_b;

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_i.update(param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ql.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_a = null;
        field_k = null;
        if (param0 == 20) {
          field_f = null;
          field_c = null;
          field_e = null;
          field_l = null;
          field_h = null;
          return;
        }
        nh var2 = (nh) null;
        ql.a((nh) null, (nh) null, (byte) 30, (nh) null);
        field_f = null;
        field_c = null;
        field_e = null;
        field_l = null;
        field_h = null;
    }

    final static boolean a(nh param0, nh param1, byte param2, nh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.a(-14354)) {
            return false;
          }
          if (!param3.a(false, "commonui")) {
            return false;
          }
          var4_int = 62 / ((-27 - param2) / 59);
          if (param0.a(-14354) &&
            param0.a(false, "commonui")) {
            if (param1.a(-14354) &&
              param1.a(false, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ql.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -105) {
          field_g = (String) (field_e[6]);
        }
    }

    ql(java.awt.Component param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_i.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ql.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_h = "Mouse over an icon for details";
        field_g = "STANDARD";
        field_l = "A knight in ornate black armour, adorned with evil-looking sigils. He has a grim look about him, likely from seeing so many enemies fall before his sword.";
        field_f = new af();
        field_j = 0;
        field_d = 256;
        field_e = new Object[1];
        field_b = 0;
    }
}
