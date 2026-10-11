/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int[] field_a;
    int field_d;
    int[] field_e;
    static ja[] field_c;
    static long field_g;
    static ug field_b;
    static hi field_f;
    int field_h;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = -59 % ((param0 - 33) / 37);
        field_f = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0) {
          return 91;
        }
        if (null != this.field_e &&
          0 != this.field_e.length) {
          for (var3 = 1; var3 < this.field_e.length; var3++) {
            if ((this.field_e[-1 + var3] + this.field_e[var3] >> 1) > param1) {
              return var3 - 1;
            }
          }
          return -1 + this.field_e.length;
        }
        return 0;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != -27328) {
          this.field_h = 59;
        }
        if (this.field_e != null &&
          this.field_e.length != 0) {
          stackIn_7_0 = this.field_e[-1 + this.field_e.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    td(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_d = param0;
        this.field_e = new int[param2 + 1];
    }

    final static jm a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        jm var8 = (jm) (mf.field_b.g(86));
        if (var8 == null) {
          var8 = new jm();
        }
        var8.a(param5, param0, param1, param7, 27658, param4, param6, param2);
        if (param3 <= 26) {
          td.a(109, 31, 61, (byte) 110, 59, 3, 72, 118);
        }
        return var8;
    }

    static {
        field_b = null;
        field_a = new int[128];
        field_g = 20000000L;
    }
}
