/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends nb implements jk {
    private kf field_E;
    private kf field_C;
    static String field_H;
    static m field_B;
    static String field_D;
    private kf field_G;

    final static void b(int param0, int param1) {
        if (!(oc.field_e >= 0)) {
            return;
        }
        wj.field_j.a(kc.field_m[param0], param1, oc.field_e * 128 / 256);
    }

    public static void a(byte param0) {
        field_H = null;
        field_D = null;
        int var1 = 81 % ((param0 - 59) / 60);
        field_B = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param2 + ((mh) this).field_t;
        int var6 = ((mh) this).field_o - -param1;
        int discarded$0 = ql.field_Q.a(vb.field_k, 20 + var5, var6 - -20, ((mh) this).field_j - 40, -50 + ((mh) this).field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        super.a(param0, param1, param2, param3);
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        if (!(!super.a(param0, param1, param2, (byte) -124))) {
            return true;
        }
        if (!(param1 != 98)) {
            return ((mh) this).a(0, param2);
        }
        if (!(-100 != (param1 ^ -1))) {
            return ((mh) this).c((byte) 119, param2);
        }
        int var5 = -32 % ((param3 - -13) / 55);
        return false;
    }

    public mh() {
        super(0, 0, 476, 225, (rd) null);
        ((mh) this).field_E = new kf(ri.field_d, (vd) null);
        ((mh) this).field_G = new kf(ch.field_g, (vd) null);
        ((mh) this).field_C = new kf(a.field_f, (vd) null);
        v var1 = new v();
        ((mh) this).field_E.field_i = (rd) (Object) var1;
        ((mh) this).field_G.field_i = (rd) (Object) var1;
        ((mh) this).field_C.field_i = (rd) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1076550271;
        ((mh) this).field_G.a(30, var4, true, -var2 + (((mh) this).field_v + -48), -var3 + ((mh) this).field_j >> -1169847167);
        ((mh) this).field_C.a(30, var4, true, -var2 + -48 + ((mh) this).field_v, var4 + (-var3 + ((mh) this).field_j >> 393635457) - -var2);
        ((mh) this).field_E.a(30, var3, true, -(2 * var2) + -78 + ((mh) this).field_v, -var3 + ((mh) this).field_j >> 705547201);
        ((mh) this).field_G.field_r = (vd) this;
        ((mh) this).field_E.field_r = (vd) this;
        ((mh) this).field_C.field_r = (vd) this;
        ((mh) this).field_E.field_q = hi.field_a;
        ((mh) this).field_C.field_q = il.field_a;
        ((mh) this).b((byte) -107, (w) (Object) ((mh) this).field_G);
        ((mh) this).b((byte) 72, (w) (Object) ((mh) this).field_E);
        ((mh) this).b((byte) 94, (w) (Object) ((mh) this).field_C);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        if (param4 != ((mh) this).field_G) {
          if (param4 == ((mh) this).field_E) {
            bg.a(false);
            if (param2 != 215535458) {
              ((mh) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            if (param4 == ((mh) this).field_C) {
              ui.d(param2 ^ 215535462);
              if (param2 != 215535458) {
                ((mh) this).field_C = null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 == 215535458) {
                return;
              } else {
                ((mh) this).field_C = null;
                return;
              }
            }
          }
        } else {
          dc.c(255);
          if (param2 == 215535458) {
            return;
          } else {
            ((mh) this).field_C = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_B = new m("usename");
        field_D = "Name is available";
    }
}
