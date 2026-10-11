/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bc {
    private int field_x;
    static String field_A;
    static int[] field_u;
    static String field_w;
    static int[] field_s;
    private int field_B;
    static lj field_y;
    private ka[] field_t;
    static boolean field_z;
    private int field_v;

    public static void c(byte param0) {
        field_w = null;
        field_A = null;
        field_y = null;
        int var1 = 74 / ((param0 - 0) / 57);
        field_s = null;
        field_u = null;
    }

    public cl() {
        this(2188450, 2591221, 9543);
    }

    final static void b(byte param0) {
        int var1_int = 0;
        e var2 = null;
        int var3 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        e var2Lifetime1;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          bh.field_o.h();
          re.field_B.h();
          qb.field_b = qb.field_b - 1;
          var1_int = 120 % ((param0 + 61) / 54);
          if (qb.field_b == 0) {
            qb.field_b = 200;
            var2 = (e) (tj.field_e.c((byte) 112));
            while (var2 != null) {
              if (!var2.field_k.b(11163)) {
                var2.a(true);
              }
              var2 = (e) (tj.field_e.c(-270));
            }
            if (TorChallenge.field_I != null) {
              var2Lifetime1 = (e) (TorChallenge.field_I.c((byte) -118));
              while (var2Lifetime1 != null) {
                if (!var2Lifetime1.field_k.b(11163)) {
                  var2Lifetime1.a(true);
                }
                var2Lifetime1 = (e) (TorChallenge.field_I.c(-270));
              }
            }
          }
          if (la.field_a != null) {
            stackIn_17_0 = la.field_a.d(0);
            if (!stackIn_17_0) {
              tg.field_t = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "cl.M(" + param0 + ')');
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param0.field_w) {
            stackIn_6_0 = (param0.c(param3 ^ 1)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 instanceof ng) {
            param4 = param4 & ((ng) (param0)).field_F;
          }
          if (!param4) {
            stackIn_14_0 = this.field_B;
          } else {
            if (var6_int == 0) {
              stackIn_14_0 = this.field_v;
            } else {
              stackIn_14_0 = this.field_x;
            }
          }
          var7 = stackIn_14_0;
          uk.a(var7, param3 ^ 96, param0.field_m + param2, (param0.field_l - this.field_t[0].field_v >> 1) + param0.field_i + param1, param0.field_p, this.field_t);
          if (param3 != 97) {
            cl.c((byte) 98);
          }
          stackIn_19_0 = (!param4) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          this.field_g.a(param0.field_v, param2 + param0.field_m, param1 + (param0.field_i - 2), param0.field_p, param0.field_l, var8, -1, 1, 1, this.field_g.field_x);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("cl.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private cl(int param0, int param1, int param2) {
        this.field_t = ae.field_v;
        this.field_x = param1;
        this.field_B = param2;
        this.field_v = param0;
        this.field_g = dl.field_H;
    }

    static {
        field_u = new int[]{20, 40, 40, 20, 40};
        field_w = "End Game";
        field_s = new int[]{10, 10, 10};
        field_A = "You have 1 unread message!";
    }
}
