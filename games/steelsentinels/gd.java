/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ac {
    private ja field_xb;
    static fh field_kb;
    static String field_ob;
    private int field_rb;
    private int field_yb;
    static gh field_jb;
    static boolean field_ub;
    private ui field_nb;
    private int field_tb;
    private int field_vb;
    private int field_ib;
    static al field_qb;
    static gh field_sb;
    private lh field_pb;
    static int field_lb;
    static gh field_wb;
    static int field_mb;

    final static gh l(byte param0) {
        int var1 = 116 / ((param0 - -52) / 48);
        return vi.field_W.field_Wb;
    }

    boolean i(int param0) {
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (param0 == -8350) {
            break L0;
          } else {
            field_ub = false;
            break L0;
          }
        }
        L1: {
          if (((gd) this).field_xb == null) {
            break L1;
          } else {
            if (((gd) this).field_xb != mj.field_Yb) {
              if (ob.field_t == ((gd) this).field_xb) {
                ((gd) this).field_vb = ((gd) this).field_vb + 1;
                if (((gd) this).field_vb + 1 == ((gd) this).field_tb) {
                  ((gd) this).field_nb.field_R = 256;
                  ((gd) this).field_xb = null;
                  break L1;
                } else {
                  ((gd) this).field_nb.field_R = (((gd) this).field_vb << -587425592) / ((gd) this).field_tb;
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              ((gd) this).field_vb = ((gd) this).field_vb + 1;
              if (((gd) this).field_vb + 1 != ((gd) this).field_yb) {
                ((gd) this).field_nb.field_R = -((((gd) this).field_vb << -1952145848) / ((gd) this).field_yb) + 256;
                break L1;
              } else {
                ((gd) this).field_xb = gi.field_q;
                ((gd) this).a((byte) 103, 12 - (-((gd) this).field_rb - ((gd) this).field_pb.field_E), ((gd) this).field_pb.field_x + 12, ((gd) this).field_ib);
                ((gd) this).field_vb = 0;
                ((gd) this).field_nb.field_R = 0;
                break L1;
              }
            }
          }
        }
        return super.i(-8350);
    }

    void c(lh param0, int param1) {
        if (param1 != -22908735) {
            return;
        }
        ((gd) this).field_pb = param0;
        if (gi.field_q != ((gd) this).field_xb) {
            // if_acmpeq L90
            ((gd) this).field_vb = 0;
            ((gd) this).field_xb = mj.field_Yb;
        } else {
            ((gd) this).a((byte) 103, ((gd) this).field_pb.field_E + ((gd) this).field_rb + 12, ((gd) this).field_pb.field_x + 12, ((gd) this).field_ib);
            ((gd) this).field_vb = 0;
        }
    }

    public static void l(int param0) {
        field_wb = null;
        if (param0 != -12930) {
            gh discarded$0 = gd.l((byte) 66);
        }
        field_ob = null;
        field_jb = null;
        field_qb = null;
        field_kb = null;
        field_sb = null;
    }

    final void j(byte param0) {
        if (((gd) this).field_xb == mj.field_Yb) {
            return;
        }
        ((gd) this).field_vb = 0;
        ((gd) this).field_xb = ob.field_t;
        this.c(-12243, ((gd) this).field_pb);
        if (param0 < 6) {
            Object var3 = null;
            this.c(90, (lh) null);
        }
        ((gd) this).field_nb.field_R = 0;
        ((gd) this).field_pb = null;
    }

    final static int[] b(int param0, int param1, byte param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = SteelSentinels.field_G;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = param0 >> 1763651056 & 255;
        int var5 = 255 & param0 >> 1479116424;
        int var6 = param0 & 255;
        int var7 = (param1 & 16749042) >> -133711184;
        if (param2 != -104) {
            field_ub = true;
        }
        int var8 = param1 >> 1407517416 & 255;
        int var9 = 255 & param1;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = (var10 * var6 >> -1333820088) + ((var9 * var11 >> -831977784) + ((var5 * var10 >> 1039446600) - -(var11 * var8 >> 725949320) << -1149393688) + ((var10 * var4 >> -84786232) + (var11 * var7 >> 753417128) << -1727847536));
        }
        return var3;
    }

    private final void c(int param0, lh param1) {
        if (!(((gd) this).field_nb == null)) {
            ((gd) this).field_nb.b(4);
        }
        if (param0 != -12243) {
            ((gd) this).field_rb = -45;
        }
        if (param1 == null) {
            ((gd) this).field_nb = new ui();
        } else {
            param1.a(6, (byte) -86, 6 - -((gd) this).field_rb, param1.field_x, param1.field_E);
            ((gd) this).field_nb = new ui(param1);
        }
        ((gd) this).a((lh) (Object) ((gd) this).field_nb, -88);
        ((gd) this).field_pb = null;
    }

    final boolean j(int param0) {
        ((gd) this).i((byte) -79);
        if (param0 > -50) {
            return false;
        }
        return super.j(-56);
    }

    gd(ka param0, lh param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param2 + (12 - -param1.field_E));
        ((gd) this).field_rb = param2;
        ((gd) this).field_ib = param4;
        ((gd) this).field_tb = param3;
        ((gd) this).field_yb = param3;
        this.c(-12243, param1);
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
        }
        if (!(((gd) this).field_nb == null)) {
            if (param1 == 98) {
                boolean discarded$0 = ((gd) this).field_nb.a(1, param3);
            }
            if (!((param1 ^ -1) != -100)) {
                boolean discarded$1 = ((gd) this).field_nb.a(1, param3);
            }
        }
        if (param0 != 30373) {
            Object var6 = null;
            ((gd) this).c((lh) null, -80);
        }
        return false;
    }

    final void i(byte param0) {
        if (((gd) this).field_xb != null) {
            if (!(((gd) this).field_xb == ob.field_t)) {
                ((gd) this).a((byte) -114, 12 - -((gd) this).field_pb.field_x, ((gd) this).field_rb + (12 + ((gd) this).field_pb.field_E));
                this.c(-12243, ((gd) this).field_pb);
            }
            ((gd) this).field_nb.field_R = 256;
            ((gd) this).field_xb = null;
        }
        int var2 = 29 / ((55 - param0) / 39);
        super.i((byte) 101);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Report <%0> for abuse";
    }
}
