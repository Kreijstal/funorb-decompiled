/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends kj {
    private int field_g;
    private int field_j;
    private int field_k;
    static int field_h;
    private int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (kn.field_e > param0) {
            break L0;
          } else {
            if (param0 > qg.field_z) {
              break L0;
            } else {
              param4 = ln.a(qk.field_p, j.field_q, param4, param3 ^ -2574);
              param1 = ln.a(qk.field_p, j.field_q, param1, param3 ^ -2613);
              wa.a(param2, param0, true, param1, param4);
              break L0;
            }
          }
        }
        if (param3 != -2686) {
          we.a(-97, -73, -88, -22, -89);
          return;
        } else {
          return;
        }
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_i = param1;
        this.field_j = param3;
        this.field_g = param0;
        this.field_k = param2;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 <= 7) {
          this.field_j = 39;
          var4 = param2 * this.field_g >> -1757895124;
          var5 = this.field_k * param2 >> -922082804;
          var6 = this.field_i * param1 >> -1535747764;
          var7 = this.field_j * param1 >> 399673868;
          wo.a(120, var4, var7, var6, var5, this.field_a);
          return;
        } else {
          var4 = param2 * this.field_g >> -1757895124;
          var5 = this.field_k * param2 >> -922082804;
          var6 = this.field_i * param1 >> -1535747764;
          var7 = this.field_j * param1 >> 399673868;
          wo.a(120, var4, var7, var6, var5, this.field_a);
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
            this.a((byte) -128, 112, -7);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param2 >= -101) {
          we.a(98, 26, 121, -55, -62);
          var4 = param0 * this.field_g >> 1002896172;
          var5 = this.field_k * param0 >> -1150108628;
          var6 = param1 * this.field_i >> -1627969780;
          var7 = param1 * this.field_j >> -1462841268;
          wd.a(this.field_c, this.field_e, var4, var7, true, var5, this.field_a, var6);
          return;
        } else {
          var4 = param0 * this.field_g >> 1002896172;
          var5 = this.field_k * param0 >> -1150108628;
          var6 = param1 * this.field_i >> -1627969780;
          var7 = param1 * this.field_j >> -1462841268;
          wd.a(this.field_c, this.field_e, var4, var7, true, var5, this.field_a, var6);
          return;
        }
    }

    static {
    }
}
