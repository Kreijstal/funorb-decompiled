/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class osa extends wda {
    static byte[][][] field_r;
    static String field_p;
    private int field_q;
    private int field_o;

    final int g(byte param0) {
        if (param0 != 30) {
          ((osa) this).field_q = -20;
          return ((osa) this).a(false) + ((osa) this).field_q;
        } else {
          return ((osa) this).a(false) + ((osa) this).field_q;
        }
    }

    final void c(byte param0) {
        super.c((byte) -121);
        if (param0 >= -116) {
          ((osa) this).field_o = -33;
          ((osa) this).field_o = -((osa) this).field_o;
          return;
        } else {
          ((osa) this).field_o = -((osa) this).field_o;
          return;
        }
    }

    osa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        if (5 <= param0.field_E) {
            if (param0.field_E >= 25) {
                ((osa) this).field_o = bla.a(true, 12, param1.b((byte) 44, 12)) << -1397314128;
                ((osa) this).field_q = bla.a(true, 12, param1.b((byte) 44, 12)) << -1248066544;
            }
            ((osa) this).field_o = param1.b((byte) 44, 10) << -2003516464;
            ((osa) this).field_q = param1.b((byte) 44, 10) << -1260021104;
        }
    }

    void a(kh param0, byte param1) {
        super.a(param0, (byte) -120);
        if (param1 >= -78) {
          osa.e(2);
          param0.a((byte) -39, dqa.a(true, ((osa) this).field_o >> 1378891664, 12), 12);
          param0.a((byte) 45, dqa.a(true, ((osa) this).field_q >> 1544140208, 12), 12);
          return;
        } else {
          param0.a((byte) -39, dqa.a(true, ((osa) this).field_o >> 1378891664, 12), 12);
          param0.a((byte) 45, dqa.a(true, ((osa) this).field_q >> 1544140208, 12), 12);
          return;
        }
    }

    final int f(int param0) {
        if (param0 != 10) {
          int discarded$2 = ((osa) this).f(-109);
          return ((osa) this).d((byte) -52) - -((osa) this).field_o;
        } else {
          return ((osa) this).d((byte) -52) - -((osa) this).field_o;
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_p = null;
        int var1 = -33 / ((-22 - param0) / 52);
    }

    final int e(byte param0) {
        if (param0 != -43) {
            ((osa) this).field_o = 9;
            return ((osa) this).b(true);
        }
        return ((osa) this).b(true);
    }

    static {
    }
}
