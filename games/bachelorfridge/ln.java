/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ana {
    static kv field_x;
    static kv field_v;
    private ima field_A;
    private boolean field_w;
    private boolean field_z;
    private boolean field_y;

    private final void h(int param0) {
        if (param0 != -11007) {
            return;
        }
        ((ln) this).field_n.field_p = 0;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        ur var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (0 >= param2) {
            var4 = param1;
            break L0;
          } else {
            var8 = new byte[param0];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param0) {
                break L0;
              } else {
                var8[var5_int] = param1[var5_int + param2];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new ur();
        var5.b(true);
        var5.a(var4, (long)(param0 * param3), 0);
        var6 = new byte[64];
        var5.a(65, 0, var6);
        return var6;
    }

    private final void g(int param0) {
        ad var4 = null;
        ad var6 = null;
        bj var5 = null;
        int var7 = BachelorFridge.field_y;
        if (param0 != 0) {
            this.g(2);
        }
        aga var8 = ((ln) this).field_n.field_s;
        if (!(!var8.i(-118))) {
            return;
        }
        pp var3 = (pp) (Object) ((ln) this).field_A.field_o.b((byte) 90);
        oha discarded$6 = al.a(-99, ((ln) this).field_A.field_k);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((ln) this).field_q);
            var4.b(-1, 7);
            if (var3 instanceof bj) {
                var5 = (bj) (Object) var3;
                var6 = var5.field_h.a(-27449, ((ln) this).field_q);
                ((ln) this).field_q.a(var5.field_i, var6, (byte) -106, var5.field_l);
            } else {
                var3.a(var8, ((ln) this).field_q.field_h, 12);
            }
            var3 = (pp) (Object) ((ln) this).field_A.field_o.c(0);
        }
        ((ln) this).field_y = true;
    }

    public static void d(int param0) {
        field_v = null;
        field_x = null;
        if (param0 != 4) {
            ln.f(41);
        }
    }

    final static void e(int param0) {
        if (param0 > -114) {
            ln.e(-92);
        }
        gs.field_f.a((byte) 79);
        if (!(bp.e(-29919))) {
            sja.field_fb.c(79, (byte) 103);
        }
    }

    final boolean c(byte param0) {
        int var2 = 32 % ((71 - param0) / 47);
        if (!(!((ln) this).field_m.a((byte) -106))) {
            return false;
        }
        if (!((ln) this).field_y) {
            if (!((ln) this).field_z) {
                if (!(((ln) this).field_n.field_p <= -192)) {
                    ((ln) this).field_z = true;
                    aba.a((byte) 62, 60);
                }
            }
            ((ln) this).field_n.field_p = ((ln) this).field_n.field_p + 2;
            if (((ln) this).field_n.field_p < 0) {
                return false;
            }
            this.g(0);
            ((ln) this).field_m = new taa(((ln) this).field_q, ((ln) this).field_n);
            ((ln) this).a(27799, (at) (Object) ((ln) this).field_m);
            ((ln) this).field_n.field_p = 1;
            return false;
        }
        if (!((ln) this).field_w) {
            if (-49 > (((ln) this).field_n.field_p ^ -1)) {
                ((ln) this).field_w = true;
                aba.a((byte) 18, 60);
            }
        }
        ((ln) this).field_n.field_p = ((ln) this).field_n.field_p + 2;
        if (!(((ln) this).field_n.field_p >= 256)) {
            return false;
        }
        this.h(-11007);
        return true;
    }

    ln(gj param0, ima param1) {
        super(param0, (bca) (Object) param1);
        ((ln) this).field_n.field_p = -256;
        ((ln) this).field_A = param1;
    }

    final static void f(int param0) {
        int var1 = 0;
        int var3 = BachelorFridge.field_y;
        fi.field_m = new js(4);
        for (var1 = 0; jl.field_q.length > var1; var1++) {
            fi.field_m.a((long)jl.field_q[var1].hashCode(), (byte) 86, (bw) (Object) new ji(var1 - -1));
        }
        int var2 = -38 % ((param0 - 43) / 46);
    }

    static {
    }
}
