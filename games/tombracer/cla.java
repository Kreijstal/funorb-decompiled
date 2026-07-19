/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cla extends od {
    static String field_o;
    private long field_k;
    int field_p;
    static int[] field_n;
    static int[] field_m;
    private cka field_l;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 9181) {
          return false;
        } else {
          L0: {
            if ((param1 & -param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    protected final void finalize() throws Throwable {
        this.h(-6814);
        super.finalize();
    }

    private final void h(int param0) {
        if (param0 != -6814) {
          return;
        } else {
          L0: {
            if (-1L > (this.field_k ^ -1L)) {
              this.field_l.field_l.releasePbuffer(this.field_k);
              this.field_k = 0L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_o = null;
        if (param0 != 0) {
            field_n = (int[]) null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final long a(byte param0) {
        if (param0 != 101) {
            return -83L;
        }
        return this.field_k;
    }

    cla(cka param0, int param1, int param2) {
        try {
            this.field_l = param0;
            this.field_p = param2 * param1;
            this.field_k = this.field_l.field_l.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean g(int param0) {
        if (-1 == uca.field_d) {
            if (!ama.a(1, -1)) {
                return false;
            }
            uca.field_d = vc.field_q.h(255);
            vc.field_q.field_h = 0;
        }
        if (param0 != 0) {
            return true;
        }
        if (-2 != uca.field_d) {
            return ama.a(uca.field_d, -1);
        }
        if (!(ama.a(2, -1))) {
            return false;
        }
        uca.field_d = vc.field_q.d(125);
        vc.field_q.field_h = 0;
        return ama.a(uca.field_d, -1);
    }

    final static void f(int param0) {
        er.b(1, param0);
        bea.a();
        fp.a(122);
        if (!((ld.field_e ^ -1) > -3)) {
            dia.field_o = new gq(jk.a((byte) 122), o.field_d, dsa.field_c);
            aca.a(dia.field_o, 19711);
            aca.a(oq.a((byte) 124), 19711);
        }
        if (!(!vpa.a(83))) {
            caa.a((byte) -59);
        }
    }

    static {
        field_o = "Lobby";
        field_n = new int[]{0, 26, 27};
    }
}
