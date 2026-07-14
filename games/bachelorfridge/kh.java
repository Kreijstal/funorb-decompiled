/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends bca {
    static int field_r;
    static int field_q;

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, kv param8) {
        if (param0) {
          return;
        } else {
          fi.a(param6, param1, param7, 0, 0, param8, dg.field_e, 0, -123, 0, param4, param5, 0, param2, param3, 0, param8.field_v);
          return;
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_r = -87;
            return (at) (Object) new uk(param1, (kh) this);
        }
        return (at) (Object) new uk(param1, (kh) this);
    }

    kh(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        ((kh) this).a(param0, (byte) -2);
        int var3 = -89 % ((12 - param1) / 35);
    }

    kh(lu param0) {
        super(param0);
        ((kh) this).field_k = param0.e((byte) 89);
        ((kh) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((kh) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final static void a(byte param0, boolean param1) {
        L0: {
          if (lb.g((byte) 77)) {
            param1 = false;
            break L0;
          } else {
            break L0;
          }
        }
        jd.a(param1, (byte) 86);
        if (param0 > -47) {
          field_q = 118;
          v.a((byte) -50);
          return;
        } else {
          v.a((byte) -50);
          return;
        }
    }

    final static String a(vr param0, byte param1, String param2, String param3) {
        if (!param0.a(0)) {
          return param2;
        } else {
          if (param1 != -57) {
            field_q = -22;
            return param3 + " - " + param0.a(true) + "%";
          } else {
            return param3 + " - " + param0.a(true) + "%";
          }
        }
    }

    static {
    }
}
