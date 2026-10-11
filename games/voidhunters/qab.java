/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qab {
    private int field_e;
    static String field_a;
    private String field_c;
    static int field_d;
    int field_b;

    final char a(int param0) {
        int fieldTemp$0 = 0;
        if (param0 <= -75) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$0);
        }
        this.field_b = -65;
        int fieldTemp$1 = this.field_b;
        this.field_b = this.field_b + 1;
        return this.field_c.charAt(fieldTemp$1);
    }

    public final String toString() {
        return this.field_c.substring(0, this.field_b) + "|" + this.field_c.substring(this.field_b);
    }

    final boolean a(byte param0) {
        if (param0 <= -102) {
          return this.field_e <= this.field_b ? true : false;
        }
        this.a(-42);
        return this.field_e <= this.field_b ? true : false;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          qab.a(107, -118);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        if (param0 <= 32) {
          field_a = (String) null;
          if (param1 == 11) {
            return false;
          }
          if (param1 != 13) {
            return true;
          }
          return false;
        }
        if (param1 == 11) {
          return false;
        }
        if (param1 != 13) {
          return true;
        }
        return false;
    }

    qab(String param0) {
        this.field_b = 0;
        try {
          this.field_c = param0;
          this.field_e = this.field_c.length();
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_d = 1024;
    }
}
