/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rca extends me {
    private bua field_o;
    private taa field_m;
    private boolean field_k;
    static int field_n;
    static boolean field_p;
    private boolean field_j;
    static boolean field_l;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return true;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4;
        var4 = -94 % ((29 - param2) / 57);
        if (-84 != (param0 ^ -1)) {
          if (param0 != 84) {
            if ((param0 ^ -1) != -83) {
              if (-14 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -82) {
                  if (83 == param0) {
                    this.field_j = true;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  this.field_j = true;
                  return true;
                }
              } else {
                this.field_j = true;
                return true;
              }
            } else {
              this.field_j = true;
              return true;
            }
          } else {
            this.field_j = true;
            return true;
          }
        } else {
          this.field_j = true;
          return true;
        }
    }

    final boolean d(byte param0) {
        if (param0 != -75) {
            this.a(false);
            return this.field_j;
        }
        return this.field_j;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          L0: {
            this.b((byte) 103);
            if (!this.field_k) {
              v.a(100, (byte) -76, 128, 222, 0, 96);
              this.field_k = true;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-2 == (hf.field_b ^ -1)) {
              this.field_j = true;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_o != null) {
              this.field_o.a(0);
              this.field_o.a(this.field_m.a(-13939), false, 0, 37, false);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (!this.field_k) {
              v.a(100, (byte) -76, 128, 222, 0, 96);
              this.field_k = true;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-2 == (hf.field_b ^ -1)) {
              this.field_j = true;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_o != null) {
              this.field_o.a(0);
              this.field_o.a(this.field_m.a(-13939), false, 0, 37, false);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    rca(qh param0, taa param1) {
        super(param0);
        this.field_k = false;
        try {
            this.field_m = param1;
            if (0 == param1.c(16)) {
                this.field_o = new bua(0, param1.a(-13939), 1);
                this.field_o.a(param1.a(-13939), false, 0, 37, true);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        String var6;
        String var7;
        String var8;
        String var9;
        ik.field_h.a(0, 0);
        if (param0 <= -13) {
          var2 = aaa.a(false) - kq.field_a.a() >> -1312544927;
          var3 = koa.b(0) - kq.field_a.c() >> -1872517087;
          if (-1 != (this.field_m.c(16) ^ -1)) {
            if (this.field_m.c(16) != 1) {
              return;
            } else {
              var4 = this.field_m.a(-13939);
              oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
              cb.field_i[var4].a((aaa.a(false) >> -1347710559) - cb.field_i[var4].a() / 2, (koa.b(0) >> 1271516225) + -(cb.field_i[var4].c() / 2) - 20);
              kq.field_a.a(var2, var3 + 60);
              oka.a(vj.field_d[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> -1549693183, -1);
              return;
            }
          } else {
            var8 = gv.field_v;
            var9 = la.field_m[this.field_m.a(-13939)];
            oka.a(var8.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.a(1024, 0, 0, this.field_o.b((byte) 74), -1918106173, 300, 320);
            se.f((byte) -6);
            kq.field_a.a(var2, var3 + 85);
            oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> -2098880447) - -92, aaa.a(false) >> 732717537, -1);
            return;
          }
        } else {
          this.d((byte) 83);
          var2 = aaa.a(false) - kq.field_a.a() >> -1312544927;
          var3 = koa.b(0) - kq.field_a.c() >> -1872517087;
          if (-1 != (this.field_m.c(16) ^ -1)) {
            if (this.field_m.c(16) != 1) {
              return;
            } else {
              var4 = this.field_m.a(-13939);
              oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
              cb.field_i[var4].a((aaa.a(false) >> -1347710559) - cb.field_i[var4].a() / 2, (koa.b(0) >> 1271516225) + -(cb.field_i[var4].c() / 2) - 20);
              kq.field_a.a(var2, var3 + 60);
              oka.a(vj.field_d[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> -1549693183, -1);
              return;
            }
          } else {
            var6 = gv.field_v;
            var7 = la.field_m[this.field_m.a(-13939)];
            oka.a(var6.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.a(1024, 0, 0, this.field_o.b((byte) 74), -1918106173, 300, 320);
            se.f((byte) -6);
            kq.field_a.a(var2, var3 + 85);
            oka.a(var7.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> -2098880447) - -92, aaa.a(false) >> 732717537, -1);
            return;
          }
        }
    }

    static {
        field_n = 0;
        field_p = true;
    }
}
