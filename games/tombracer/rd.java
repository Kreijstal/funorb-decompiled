/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wv {
    private dea field_q;
    static ur field_r;

    public static void d(int param0) {
        if (param0 > -126) {
            return;
        }
        field_r = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.field_q.a((byte) -120, param0, !param1 ? true : false);
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          field_r = (ur) null;
          return this.a((byte) 122, param0) - -this.field_m[param0].e(-163);
        } else {
          return this.a((byte) 122, param0) - -this.field_m[param0].e(-163);
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            this.a(false, false, 33);
            return this.field_n;
        }
        return this.field_n;
    }

    final static boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (!vpa.a(47)) {
            if ((wla.field_ub ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_r = (ur) null;
          if (vpa.a(47)) {
            return true;
          } else {
            L0: {
              if ((wla.field_ub ^ -1) < -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = this.field_q.e(param0 + 111);
        gg.field_f.a(aaa.a(false) - gg.field_f.a() >> 1056365473, var3 - -(gg.field_f.c() / 2));
        this.h(var3, 3);
        super.a(param0, param1);
    }

    final int a(byte param0, int param1) {
        if (param0 < 111) {
          this.field_q = (dea) null;
          return aaa.a(false) / 2 + (-(this.field_m.length * this.field_m[param1].e(-163) / 2) - -(param1 * this.field_m[param1].e(-163)));
        } else {
          return aaa.a(false) / 2 + (-(this.field_m.length * this.field_m[param1].e(-163) / 2) - -(param1 * this.field_m[param1].e(-163)));
        }
    }

    private final void h(int param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        if (param1 != 3) {
          return;
        } else {
          var3 = 500;
          var4 = aaa.a(false) / 2 - var3 / 2;
          var5 = param0 + 100;
          oka.a(wja.field_o.toUpperCase(), 2497287, qr.field_v, -1, -30 + gg.field_f.c() / 2 + var5, aaa.a(false) / 2, -1);
          var6 = kn.field_p;
          var7 = kv.field_a.field_h + (kv.field_a.field_g + 4);
          var8 = 3 * var7;
          var9 = aaa.field_e;
          discarded$1 = be.a(var9, 1, var6, 2431750, var7, var8, 1, gg.field_f.c() / 2 + var5, var4, -1, (byte) 60, var3);
          return;
        }
    }

    rd(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_q = new dea();
        try {
            this.field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new ur(6);
    }
}
