/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rj {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        if (param0 != 0) {
            rj.b(110);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final int a(int param0, long param1) {
        long var4 = 0L;
        var4 = ((rj) this).a(117);
        if (var4 > (long)param0) {
          i.a((byte) 20, var4);
          return ((rj) this).a(param1, true);
        } else {
          return ((rj) this).a(param1, true);
        }
    }

    abstract void c(int param0);

    final static aa a(String param0, byte param1, String param2, boolean param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        var6 = null;
        if (param1 < 67) {
          L0: {
            rj.b(-118);
            if ((param0.indexOf('@') ^ -1) == 0) {
              var7 = (CharSequence) (Object) param0;
              var4 = ti.a(var7, (byte) 44);
              break L0;
            } else {
              var6 = (Object) (Object) param0;
              break L0;
            }
          }
          return pb.a(param3, param2, var4, 0, (String) var6);
        } else {
          L1: {
            if ((param0.indexOf('@') ^ -1) == 0) {
              var8 = (CharSequence) (Object) param0;
              var4 = ti.a(var8, (byte) 44);
              break L1;
            } else {
              var6 = (Object) (Object) param0;
              break L1;
            }
          }
          return pb.a(param3, param2, var4, 0, (String) var6);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        ha.field_g = param4;
        ph.field_k = param1;
        uc.field_i = param3;
        if (param2 <= 76) {
            return;
        }
        we.field_c = param0;
    }

    abstract int a(long param0, boolean param1);

    abstract long a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
    }
}
