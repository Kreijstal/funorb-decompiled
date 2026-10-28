/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends IntrusiveNode {
    int field_l;
    static String field_p;
    int field_r;
    int field_s;
    static String field_g;
    int field_q;
    int field_i;
    int field_h;
    static ee field_n;
    int field_o;
    int field_m;
    static String field_k;
    int field_j;

    final static void a(vj param0, boolean param1, int param2, boolean param3, byte param4) {
        String stackIn_25_2 = null;
        try {
          rh.field_O[0] = gk.field_a.nextInt();
          rh.field_O[1] = gk.field_a.nextInt();
          qj.field_a.position = 0;
          rh.field_O[2] = (int)(SecondaryIntrusiveDeque.field_b >> 32);
          rh.field_O[3] = (int)SecondaryIntrusiveDeque.field_b;
          qj.field_a.a((byte) 126, rh.field_O[0]);
          qj.field_a.a((byte) 123, rh.field_O[1]);
          qj.field_a.a((byte) 124, rh.field_O[2]);
          qj.field_a.a((byte) 126, rh.field_O[3]);
          jm.a(0, qj.field_a);
          qj.field_a.h(13, param2);
          param0.a(qj.field_a, (byte) -121);
          om.field_c.position = 0;
          if (!param1) {
            om.field_c.f(16, -123);
          } else {
            om.field_c.f(18, -123);
          }
          om.field_c.position = om.field_c.position + 2;
          int var5_int = om.field_c.position;
          om.field_c.a((byte) 123, jm.field_L);
          om.field_c.a(ck.field_q, (byte) -23);
          int var6 = 0;
          if (ej.field_d) {
            var6 = var6 | 1;
          }
          if (jc.field_b) {
            var6 = var6 | 4;
          }
          if (param3) {
            var6 = var6 | 8;
          }
          if (null != p.field_i) {
            var6 = var6 | 16;
          }
          om.field_c.f(var6, param4 - 24);
          String var7 = tf.a(param4 ^ 98, PointCloudEffect.d((byte) -120));
          if (var7 == null) {
            var7 = "";
          }
          om.field_c.a(var7, 101);
          if (param4 != -99) {
            return;
          }
          if (p.field_i != null) {
            om.field_c.a((byte) 100, p.field_i);
          }
          bn.a(param4 ^ -99, om.field_c, qj.field_a, q.field_O, cf.field_c);
          om.field_c.i(-var5_int + om.field_c.position, 32614);
          ClientException.a(-1, param4 + 30884);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var5;
          StringBuilder stackIn_24_1 = new StringBuilder().append("oh.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -20) {
          field_p = null;
          field_k = null;
          field_n = null;
          field_g = null;
          return;
        }
        vj var2 = (vj) null;
        oh.a((vj) null, true, 101, true, (byte) -46);
        field_p = null;
        field_k = null;
        field_n = null;
        field_g = null;
    }

    oh() {
    }

    static {
        field_g = "Extra thrust";
        field_n = new ee("usename");
        field_k = " - activate shield";
    }
}
