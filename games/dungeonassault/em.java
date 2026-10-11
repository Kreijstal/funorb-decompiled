/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vf {
    ec field_D;
    static volatile int field_C;
    byte field_E;
    static String field_F;
    int field_G;

    public static void c(boolean param0) {
        field_F = null;
        if (!param0) {
          field_C = 45;
        }
    }

    final static String e(int param0) {
        if (ol.field_i == ql.field_f) {
          return td.field_d;
        }
        if (param0 != 7142) {
          em.e(-19);
          return ek.field_i;
        }
        return ek.field_i;
    }

    final int d(byte param0) {
        if (param0 < 98) {
          this.field_G = -32;
          if (this.field_D != null) {
            return 100 * this.field_D.field_o / (-this.field_E + this.field_D.field_m.length);
          }
          return 0;
        }
        if (this.field_D != null) {
          return 100 * this.field_D.field_o / (-this.field_E + this.field_D.field_m.length);
        }
        return 0;
    }

    final static vk a(String[] args, int param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        vk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new vk(false);
          var2.field_c = args;
          if (param1 != 8082) {
            em.e(7);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("em.A(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] b(boolean param0) {
        if (!param0) {
          em.c(false);
          if (this.field_v) {
            throw new RuntimeException();
          }
          if (this.field_D.field_o >= this.field_D.field_m.length - this.field_E) {
            return this.field_D.field_m;
          }
          throw new RuntimeException();
        }
        if (this.field_v) {
          throw new RuntimeException();
        }
        if (this.field_D.field_o >= this.field_D.field_m.length - this.field_E) {
          return this.field_D.field_m;
        }
        throw new RuntimeException();
    }

    em() {
    }

    static {
        field_C = 0;
        field_F = "Select a goblin to sacrifice";
    }
}
