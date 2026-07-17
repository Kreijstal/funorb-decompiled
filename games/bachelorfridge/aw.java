/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends ana {
    static eh field_x;
    static kv field_y;
    static ee[][] field_v;
    static kv[] field_w;
    private ica field_z;

    final static void a(boolean param0, int param1, vr param2, vr param3, vr param4) {
        try {
            ut.field_m = ida.a("", -203);
            ut.field_m.a(false, 1537025605);
            nm.a(param2, param3, 111, param4);
            int discarded$0 = 113;
            nga.b();
            ola.field_p = tn.field_a;
            dka.field_G = tn.field_a;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aw.C(" + param0 + 44 + -12472 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void f() {
        op var3 = null;
        aga var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var18 = null;
        hd var18_ref = null;
        int[][] var21 = null;
        var18 = null;
        var16 = BachelorFridge.field_y;
        var18_ref = (hd) (Object) al.a(-111, ((aw) this).field_z.field_k);
        var3 = ((aw) this).field_q.field_h;
        var4 = ((aw) this).field_z.field_l.a(92, ((aw) this).field_q.field_h);
        var21 = ((aw) this).field_z.a(((aw) this).field_q.field_h, 0, -99, var4);
        var6 = ((aw) this).field_z.field_s;
        var7 = ((aw) this).field_z.field_q;
        var8 = 17;
        var9 = 17;
        var10 = -1 + var8 >> 1;
        var11 = -1 + var9 >> 1;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var8) {
            return;
          } else {
            var13 = 0;
            L1: while (true) {
              if (var13 >= var9) {
                var12++;
                continue L0;
              } else {
                if (var21[var12][var13] == 1) {
                  var14 = -var10 - -var12 + var6;
                  var15 = -var11 - -var13 + var7;
                  if (var14 >= 0) {
                    if (var3.field_z > var14) {
                      if (var15 >= 0) {
                        if (var15 < var3.field_B) {
                          ip discarded$2 = new ip(((aw) this).field_q, var14, var15);
                          uea discarded$3 = new uea(((aw) this).field_q, var14, var15, gma.field_e[var18_ref.field_q].field_a);
                          var13++;
                          continue L1;
                        } else {
                          var13++;
                          continue L1;
                        }
                      } else {
                        var13++;
                        continue L1;
                      }
                    } else {
                      var13++;
                      continue L1;
                    }
                  } else {
                    var13++;
                    continue L1;
                  }
                } else {
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = 90 % ((71 - param0) / 47);
        int fieldTemp$0 = ((aw) this).field_l - 1;
        ((aw) this).field_l = ((aw) this).field_l - 1;
        if (fieldTemp$0 >= 0) {
            if (((aw) this).field_l == 25) {
                int discarded$1 = -124;
                this.f();
                int discarded$2 = 69;
                this.g();
            }
            return false;
        }
        this.d(17);
        return true;
    }

    private final void d(int param0) {
        if (param0 != 17) {
            this.d(-75);
        }
    }

    private final void g() {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var6 = ((aw) this).field_z.field_l.a(106, ((aw) this).field_q.field_h);
        if (var6.i(-69)) {
            return;
        }
        pp var3 = (pp) (Object) ((aw) this).field_z.field_o.b((byte) 90);
        oha discarded$6 = al.a(86, ((aw) this).field_z.field_k);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((aw) this).field_q);
            ((aw) this).a(27799, (at) (Object) new taa(((aw) this).field_q, var4));
            ((aw) this).a(27799, (at) (Object) new cb(var4, 6));
            ((aw) this).a(27799, (at) (Object) new fha((kj) (Object) new ip(((aw) this).field_q, var4.field_s.field_x, var4.field_s.field_J)));
            ((aw) this).a(27799, (at) (Object) new fha((kj) (Object) new oia(((aw) this).field_q, var4.field_s.field_x, var4.field_s.field_J)));
            var3.a(var6, ((aw) this).field_q.field_h, 12);
            var3 = (pp) (Object) ((aw) this).field_z.field_o.c(0);
        }
    }

    public static void e() {
        field_x = null;
        field_y = null;
        field_v = null;
        field_w = null;
    }

    aw(gj param0, ica param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((aw) this).field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
