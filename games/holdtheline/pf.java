/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements hd {
    static oa field_g;
    static String field_b;
    static int[] field_c;
    int field_e;
    static int field_d;
    static String field_f;
    int field_a;

    final static void a(boolean param0) {
        ij.c(4);
        if (null != kd.field_b) {
          om.a(-46342, kd.field_b);
        }
        co.a(param0);
        lg.b(true);
        jk.a(27370);
        if (cm.a(-2043140287)) {
          da.field_p.c((byte) 33, 1);
          qn.a(0, 0);
        }
        r.a(-28036);
    }

    final static hj a(byte param0) {
        if (param0 >= -117) {
          field_c = (int[]) null;
          return ai.field_c;
        }
        return ai.field_c;
    }

    final static int a(byte param0, int param1) {
        if (param1 == 0) {
          if (!(param1 <= ao.field_b)) {
            return 1;
          }
          if (param0 > 0) {
            return 0;
          }
          pf.a((byte) -18);
          return 0;
        }
        if (!of.a(-969)) {
          return 2;
        }
        if (!(param1 <= ao.field_b)) {
          return 1;
        }
        if (param0 > 0) {
          return 0;
        }
        pf.a((byte) -18);
        return 0;
    }

    public final int a(byte param0, hd param1) {
        pf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (pf) (param1);
          var4 = -(var3.field_e * this.field_a) + this.field_e * var3.field_a;
          if (param0 != -101) {
            pf.a((byte) 83, 126);
          }
          if (var4 == 0) {
            var4 = var3.field_a * var3.field_a + (-(this.field_a * this.field_a) + var3.field_e * var3.field_e) - this.field_e * this.field_e;
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("pf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0 <= 8) {
          pf.b((byte) -9);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Orb points: <%0>";
        field_c = new int[]{0, 2, 4, 7};
        field_f = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
