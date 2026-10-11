/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static pb field_k;
    private int field_c;
    static pb field_g;
    int field_j;
    static pb field_d;
    static pb field_e;
    int field_i;
    private mj field_a;
    static pb field_l;
    static pb field_h;
    static pb field_b;
    static int field_m;
    static String field_n;
    static byte[] field_f;

    public static void a(byte param0) {
        if (param0 <= -20) {
          field_f = null;
          field_h = null;
          field_n = null;
          field_k = null;
          field_d = null;
          field_l = null;
          field_e = null;
          field_b = null;
          field_g = null;
          return;
        }
        pb.a((byte) 99, -109);
        field_f = null;
        field_h = null;
        field_n = null;
        field_k = null;
        field_d = null;
        field_l = null;
        field_e = null;
        field_b = null;
        field_g = null;
    }

    final static pb a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = param1;
        if (0 == var2) {
          return field_k;
        }
        if (var2 == 1) {
          return field_g;
        }
        if (2 == var2) {
          return field_d;
        }
        if (var2 == 3) {
          return field_e;
        }
        if (var2 == 4) {
          return field_l;
        }
        if (var2 == 5) {
          return field_h;
        }
        if (6 == var2) {
          return field_b;
        }
        if (param0 < -107) {
          return null;
        }
        return (pb) null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private pb(int param0, int param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param1;
          this.field_a = param2;
          this.field_j = param0;
          this.field_i = this.field_c * this.field_a.field_h;
          if (16 > this.field_j) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_k = new pb(0, 3, mj.field_d);
        field_g = new pb(1, 3, mj.field_d);
        field_d = new pb(2, 4, mj.field_f);
        field_e = new pb(3, 1, mj.field_d);
        field_l = new pb(4, 2, mj.field_d);
        field_h = new pb(5, 3, mj.field_d);
        field_b = new pb(6, 4, mj.field_d);
        field_m = ieb.a(16, -111);
        field_f = new byte[]{(byte)31, (byte)-117, (byte)8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_n = "Launches a fighter for harrassment";
    }
}
