/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nbb extends anb implements ntb, ofa, utb {
    private int field_w;
    boolean field_x;
    boolean field_u;
    boolean field_v;
    static llb field_y;

    private final void a(boolean param0, nbb param1) {
        param1.field_o = ((nbb) this).field_o;
        param1.field_p = ((nbb) this).field_p;
        param1.field_t = ((nbb) this).field_t;
        ((nbb) this).field_p = 0;
        if (!param0) {
          ((nbb) this).field_x = true;
          ((nbb) this).field_o = 0;
          ((nbb) this).field_t = 0;
          return;
        } else {
          ((nbb) this).field_o = 0;
          ((nbb) this).field_t = 0;
          return;
        }
    }

    final int d(int param0) {
        if (param0 < 42) {
            return -85;
        }
        return 2;
    }

    public final void a(faa param0, int param1) {
        super.a(param0, param1);
        ((nbb) this).field_v = kv.a(false, param0);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -110);
        boolean discarded$6 = vq.a(param0, 118, ((nbb) this).field_v);
        if (param1 > -109) {
            int discarded$7 = ((nbb) this).d(-99);
        }
    }

    public final void a(tv param0, int param1) {
        nbb var3 = null;
        int var4 = 0;
        L0: {
          super.a(param0, -52);
          var3 = (nbb) (Object) param0;
          var4 = 0;
          if (var3.field_v == var3.field_v) {
            break L0;
          } else {
            System.out.println("boolean phantom has changed. before=" + var3.field_v + ", now=" + var3.field_v);
            var4 = 1;
            break L0;
          }
        }
        if (var4 == 0) {
          if (param1 > -19) {
            ((nbb) this).field_v = true;
            return;
          } else {
            return;
          }
        } else {
          System.out.println("This instance of Debris has changed");
          if (param1 <= -19) {
            return;
          } else {
            ((nbb) this).field_v = true;
            return;
          }
        }
    }

    nbb(ml param0, boolean param1) {
        L0: {
          L1: {
            ((nbb) this).field_w = 0;
            ((nbb) this).d((byte) -52);
            ((nbb) this).field_k = param0;
            ((nbb) this).a(((nbb) this).field_k.field_b, -56);
            ((nbb) this).a(((nbb) this).field_k.field_r, ((nbb) this).field_k.field_n, (byte) 31);
            ((nbb) this).field_k.c(0, ((nbb) this).field_k.b(52), 56, ((nbb) this).field_k.c((byte) 100));
            ((nbb) this).field_k.h((byte) 42);
            ((nbb) this).field_k.a((byte) -125, (anb) this);
            ((nbb) this).e((byte) 119);
            if (vc.field_p == 0) {
              break L1;
            } else {
              if (!param1) {
                ((nbb) this).field_k.d(false);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((nbb) this).field_u = true;
          break L0;
        }
    }

    final void d(byte param0) {
        gha.field_o = gha.field_o + 1;
        ((nbb) this).field_w = gha.field_o;
        int var2 = 102 / ((param0 - -4) / 38);
    }

    public final void a(faa param0, byte param1) {
        super.a(param0, (byte) -103);
        boolean discarded$6 = vq.a(param0, 95, ((nbb) this).field_v);
        if (param1 >= -91) {
            ((nbb) this).field_w = 55;
        }
    }

    public nbb() {
        ((nbb) this).field_w = 0;
        ((nbb) this).d((byte) -52);
    }

    public final void b(byte param0, tv param1) {
        nbb var3 = null;
        Object var4 = null;
        var3 = (nbb) (Object) param1;
        if (var3.field_w == var3.field_w) {
          return;
        } else {
          L0: {
            var3.field_w = var3.field_w;
            this.a(true, var3);
            super.b((byte) 60, param1);
            var3.field_v = var3.field_v;
            if (param0 >= 54) {
              break L0;
            } else {
              var4 = null;
              ((nbb) this).b((byte) -95, (tv) null);
              break L0;
            }
          }
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, false);
        ((nbb) this).field_v = kv.a(param1, param0);
    }

    public static void j(byte param0) {
        field_y = null;
        if (param0 >= -125) {
            nbb.j((byte) 120);
        }
    }

    public final boolean a(byte param0, tv param1) {
        nbb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var4 = 114 / ((param0 - 22) / 59);
        var3 = (nbb) (Object) param1;
        if (!super.a((byte) 93, param1)) {
          if (var3.field_v != var3.field_v) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
    }
}
