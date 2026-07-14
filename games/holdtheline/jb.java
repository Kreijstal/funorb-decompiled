/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends nk implements wk {
    static oa field_T;
    static int[] field_Y;
    private int field_V;
    static ga field_X;
    static String field_S;
    private ia field_W;
    static int field_U;

    final void a(int param0, n param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        ((jb) this).field_V = -param0 + (nc.field_g - ((jb) this).field_k);
    }

    public static void p(int param0) {
        field_Y = null;
        field_X = null;
        field_S = null;
        if (param0 != 7950) {
            return;
        }
        field_T = null;
    }

    final void f(byte param0) {
        super.f((byte) -104);
        int var2 = -106 % ((param0 - -44) / 59);
        if (!(((jb) this).field_W == null)) {
            ((jb) this).field_W.a(21871);
        }
    }

    final void a(byte param0, ia param1) {
        ((jb) this).field_W = param1;
        if (param0 <= 35) {
            field_X = null;
        }
    }

    public final ia a(int param0) {
        if (param0 != 1) {
            ia discarded$0 = ((jb) this).a(106);
            return ((jb) this).field_W;
        }
        return ((jb) this).field_W;
    }

    final static void a(String param0, int param1) {
        ug.a(param0, 0);
        da.a(false, qd.field_g, 22676);
        if (param1 >= -46) {
            Object var3 = null;
            jb.a((wd[]) null, -122, false, 107, (vd) null, 44);
        }
    }

    jb(String param0, tb param1, int param2) {
        super(param0, param1, param2);
    }

    final String f(int param0) {
        if (((jb) this).field_p) {
          if (null == ((jb) this).field_z) {
            return null;
          } else {
            uh.a(rf.field_X, param0, ((jb) this).field_x + -((jb) this).field_V + nc.field_g);
            return ((jb) this).field_z;
          }
        } else {
          return null;
        }
    }

    final static void a(wd[] param0, int param1, boolean param2, int param3, vd param4, int param5) {
        uh var6 = null;
        uh var7 = null;
        wd var8 = null;
        qm var9 = null;
        qm var10 = null;
        int var11 = 0;
        int var12 = 0;
        wd var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        uh var19 = null;
        qm var20 = null;
        uh var21 = null;
        qm var22 = null;
        uh var23 = null;
        uh var24 = null;
        qm var25 = null;
        qm var26 = null;
        qm var27 = null;
        qm var28 = null;
        L0: {
          var18 = HoldTheLine.field_D;
          if (param5 < param1) {
            jb.a(param0, param1, param2, 116, param4, param0.length);
            jb.a(param0, 0, param2, 107, param4, param5);
            break L0;
          } else {
            break L0;
          }
        }
        var19 = o.a((byte) 37);
        var6 = var19;
        var21 = o.a((byte) 18);
        var7 = var21;
        var8 = param0[param1];
        var20 = var8.k(255);
        var9 = var20;
        if (param3 <= 103) {
          return;
        } else {
          var22 = var8.n(3337);
          var10 = var22;
          var19.a(var20.field_h, (byte) 67);
          var19.a(var20.field_f, (byte) 88);
          var21.a(var22.field_h, (byte) 94);
          var21.a(var22.field_f, (byte) 92);
          var11 = var8.field_k;
          var12 = param1;
          L1: while (true) {
            if (param5 <= var12) {
              param4.a(0.0f, var7.a(-58), var11, var6.a(-52), (byte) 49);
              return;
            } else {
              L2: {
                var13 = param0[var12];
                if (var13.field_k == var11) {
                  break L2;
                } else {
                  if (param2) {
                    param4.a(0.0f, var7.a(-92), var11, var6.a(-81), (byte) 49);
                    var23 = o.a((byte) 29);
                    var6 = var23;
                    var24 = o.a((byte) 105);
                    var7 = var24;
                    var23.a(var9.field_h, (byte) 101);
                    var23.a(var9.field_f, (byte) 104);
                    var24.a(var10.field_h, (byte) 100);
                    var24.a(var10.field_f, (byte) 99);
                    var11 = var13.field_k;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var14 = var13.f(50);
              var15 = (int)(var14 / 5.0f) + 1;
              var16 = 1.0f / (float)var15;
              var17 = var16;
              L3: while (true) {
                if (1.0f <= var17) {
                  var27 = var13.l(8421504);
                  var28 = var13.m(-14);
                  var6.a(var27.field_h, (byte) 101);
                  var6.a(var27.field_f, (byte) 67);
                  var7.a(var28.field_h, (byte) 95);
                  var7.a(var28.field_f, (byte) 108);
                  var12++;
                  continue L1;
                } else {
                  var25 = var13.c(var17, 109);
                  var26 = var13.a(-851, var17);
                  var6.a(var25.field_h, (byte) 123);
                  var6.a(var25.field_f, (byte) 123);
                  var7.a(var26.field_h, (byte) 83);
                  var7.a(var26.field_f, (byte) 93);
                  var17 = var17 + var16;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[8192];
        field_U = 0;
        field_S = "Members' Benefits";
    }
}
