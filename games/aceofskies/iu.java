/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends ao {
    static eo field_h;
    static String field_e;
    static String field_f;
    static int field_g;

    iu() {
        this.b(0);
    }

    private final void b(int param0) {
        if (param0 != 0) {
          this.b(-8);
        }
    }

    final static IndexedSprite[] a(ResourceArchive param0, String param1, byte param2, String param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param2 != -86) {
            String var6 = (String) null;
            iu.a((ResourceArchive) null, (String) null, (byte) 65, (String) null);
          }
          int var4_int = param0.b(param1, 0);
          int var5 = param0.a(-67, var4_int, param3);
          IndexedSprite[] stackIn_3_0 = ur.a(101, var4_int, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("iu.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == 119) {
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_g = -109;
        field_h = null;
        field_f = null;
        field_e = null;
    }

    static {
        field_f = "arcade game";
        field_e = "Log in / Create account";
        field_g = 500;
        field_h = new eo(0);
    }
}
