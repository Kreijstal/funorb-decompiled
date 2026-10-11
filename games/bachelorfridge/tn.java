/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tn {
    static af field_a;
    static String field_b;

    final int a(byte param0, long param1) {
        long var4 = this.a((byte) 63);
        if (var4 > 0L) {
          gda.a(false, var4);
          if (param0 != 109) {
            this.a(-82L, 55);
            return this.a(param1, 0);
          }
          return this.a(param1, 0);
        }
        if (param0 == 109) {
          return this.a(param1, 0);
        }
        this.a(-82L, 55);
        return this.a(param1, 0);
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (af) null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 > 116) {
          return param0 >= 0 ? true : false;
        }
        tn.a(-33, 0);
        return param0 >= 0 ? true : false;
    }

    abstract void a(boolean param0);

    abstract int a(long param0, int param1);

    abstract long a(byte param0);

    static {
        field_a = new af();
        field_b = "<%0> has left the lobby.";
    }
}
