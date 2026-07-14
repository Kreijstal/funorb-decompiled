/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends lc implements rc {
    private wd field_z;
    private wd field_A;
    static bc field_B;
    private wd field_F;
    static int field_C;
    static String field_E;
    static int field_D;
    static volatile boolean field_H;

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param2 != 98) {
            if (-100 != (param2 ^ -1)) {
              return false;
            } else {
              return ((k) this).a(param0, 19755);
            }
          } else {
            return ((k) this).a((byte) -71, param0);
          }
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var7 = 0;
        var7 = Bounce.field_N;
        if (param0 >= 6) {
          if (((k) this).field_A != param4) {
            if (((k) this).field_z != param4) {
              if (((k) this).field_F != param4) {
                return;
              } else {
                u.a((byte) -10);
                return;
              }
            } else {
              ii.n(8);
              return;
            }
          } else {
            hc.a(0);
            return;
          }
        } else {
          return;
        }
    }

    public k() {
        super(0, 0, 476, 225, (fc) null);
        ((k) this).field_z = new wd(gk.field_m, (sk) null);
        ((k) this).field_A = new wd(rg.field_e, (sk) null);
        ((k) this).field_F = new wd(bi.field_i, (sk) null);
        jh var1 = new jh();
        ((k) this).field_z.field_j = (fc) (Object) var1;
        ((k) this).field_A.field_j = (fc) (Object) var1;
        ((k) this).field_F.field_j = (fc) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1780193409;
        ((k) this).field_A.b(30, 80, var4, -var3 + ((k) this).field_k >> -731097023, ((k) this).field_m - (48 + var2));
        ((k) this).field_F.b(30, 80, var4, var4 + (((k) this).field_k + -var3 >> -531429759) - -var2, -var2 + -48 + ((k) this).field_m);
        ((k) this).field_z.b(30, 80, var3, ((k) this).field_k - var3 >> 388466433, -(2 * var2) + (-78 + ((k) this).field_m));
        ((k) this).field_A.field_n = (sk) this;
        ((k) this).field_z.field_n = (sk) this;
        ((k) this).field_z.field_q = ge.field_a;
        ((k) this).field_F.field_n = (sk) this;
        ((k) this).field_F.field_q = nf.field_a;
        ((k) this).b((lk) (Object) ((k) this).field_A, true);
        ((k) this).b((lk) (Object) ((k) this).field_z, true);
        ((k) this).b((lk) (Object) ((k) this).field_F, true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3 + ((k) this).field_r;
        var6 = param1 + ((k) this).field_i;
        if (param2 < 33) {
          return;
        } else {
          int discarded$2 = sg.field_a.a(r.field_d, 20 + var5, var6 + 20, ((k) this).field_k + -40, ((k) this).field_m - 50, 16777215, -1, 1, 0, sg.field_a.field_s);
          super.a(param0, param1, 50, param3);
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != -81) {
            k.e((byte) 88);
            field_B = null;
            field_E = null;
            return;
        }
        field_B = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new bc();
        field_C = 0;
        field_E = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_H = true;
    }
}
