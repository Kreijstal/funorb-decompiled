/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends ve {
    static aj field_B;
    static int field_u;
    wk field_A;
    byte field_y;
    static ll[] field_w;
    int field_x;
    static String field_v;
    static String field_z;

    final static void c(boolean param0) {
        sb.field_a = param0 ? true : false;
    }

    final int e(byte param0) {
        if (this.field_A == null) {
          return 0;
        }
        if (param0 >= -71) {
          field_u = -34;
        }
        return this.field_A.field_g * 100 / (-this.field_y + this.field_A.field_j.length);
    }

    final byte[] c(int param0) {
        if (param0 >= -11) {
          field_z = (String) null;
        }
        if (this.field_p ||
          this.field_A.field_g < -this.field_y + this.field_A.field_j.length) {
          throw new RuntimeException();
        }
        return this.field_A.field_j;
    }

    public static void f(byte param0) {
        field_v = null;
        field_z = null;
        field_B = null;
        if (param0 != 20) {
          field_w = (ll[]) null;
        }
        field_w = null;
    }

    vk() {
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = ba.a(param0, param1, true);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 27 % ((-51 - param2) / 62);
          var5 = 0;
          while (true) {
            if (var5 >= param1.length()) {
              return null;
            }
            if (pm.a(param1.charAt(var5), 45)) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = mb.field_N;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("vk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_u = 0;
        field_B = new aj(1, 2, 2, 0);
        field_v = "Message game";
        field_z = "Remove friend";
    }
}
