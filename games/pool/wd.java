/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends vh {
    static volatile boolean field_Sb;
    static int[] field_Qb;
    int field_Mb;
    private vh[] field_Nb;
    private vh[] field_Pb;
    static ph field_Lb;
    static String field_Rb;
    static String field_Ob;
    private vh field_Tb;
    static lq field_Ub;

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Pool.field_O;
        var4 = 0;
        L0: while (true) {
          if (((wd) this).field_Pb.length <= var4) {
            L1: {
              ((wd) this).field_Tb.b(param2, 2147483647, 0, ((wd) this).field_gb, ((wd) this).field_Db + -param2);
              if (param0 <= -99) {
                break L1;
              } else {
                field_Rb = null;
                break L1;
              }
            }
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (((wd) this).field_Nb.length <= var8) {
                return;
              } else {
                ((wd) this).field_Nb[var8].b(param1, 2147483647, param1, -(param1 * 2) + ((wd) this).field_Tb.field_gb, -(param1 * 2) + ((wd) this).field_Tb.field_Db);
                if (var8 != ((wd) this).field_Mb) {
                  ((wd) this).field_Nb[var8].field_qb = ((wd) this).field_Nb[var8].field_qb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((wd) this).field_gb / ((wd) this).field_Pb.length;
            var6 = ((wd) this).field_gb * (var4 - -1) / ((wd) this).field_Pb.length;
            ((wd) this).field_Pb[var4].field_qb = var5;
            ((wd) this).field_Pb[var4].field_eb = 0;
            ((wd) this).field_Pb[var4].field_gb = var6 - var5;
            ((wd) this).field_Pb[var4].field_Db = param2;
            var4++;
            continue L0;
          }
        }
    }

    public static void f(int param0) {
        field_Lb = null;
        field_Ob = null;
        field_Rb = null;
        if (param0 != -1) {
            field_Rb = null;
        }
        field_Qb = null;
        field_Ub = null;
    }

    final static String b(int param0, int param1) {
        if (param1 <= 51) {
            return null;
        }
        return (-1 == (param0 & nd.field_j) ? "" : "cont vis|") + ((sg.field_O & param0) == 0 ? "" : "gv visit+1|") + (-1 == (be.field_I & param0) ? "" : "gv shot+1|") + (0 == (param0 & nr.field_Q) ? "" : "gv BiH anywhere|") + (0 != (nr.field_R & param0) ? "gv BiH kitchen|" : "") + ((nr.field_V & param0) == 0 ? "" : "gv BiH in D|") + (-1 != (ag.field_e & param0 ^ -1) ? "wins|" : "") + ((hm.field_e & param0) == 0 ? "" : "loses|") + ((param0 & oa.field_b) == 0 ? "" : "group choice|") + (0 != (param0 & um.field_c) ? "respot white|" : "") + ((param0 & ob.field_F) == 0 ? "" : "rerack|") + (0 != (ll.field_f & param0) ? "ends turn|" : "");
    }

    wd(long param0, vh param1, String[] param2, vh param3, vh[] param4, int param5) {
        super(param0, (vh) null);
        int var8 = 0;
        vh var9 = null;
        ((wd) this).field_Pb = new vh[param2.length];
        ((wd) this).field_Tb = new vh(0L, param3);
        ((wd) this).field_Nb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new vh(0L, param1);
            var9.field_nb = param2[var8];
            ((wd) this).field_Pb[var8] = var9;
            ((wd) this).a(42, var9);
        }
        ((wd) this).a(91, ((wd) this).field_Tb);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((wd) this).field_Tb.a(126, param4[var11]);
            var11++;
        }
        ((wd) this).field_Mb = param5;
        ((wd) this).field_Pb[param5].field_Ib = true;
    }

    final void c(boolean param0) {
        int var2 = 0;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((wd) this).field_Pb.length) {
              return;
            } else {
              if (((wd) this).field_Mb != var2) {
                if (((wd) this).field_Pb[var2].field_R != 0) {
                  ((wd) this).field_Pb[((wd) this).field_Mb].field_Ib = false;
                  ((wd) this).field_Nb[((wd) this).field_Mb].field_qb = ((wd) this).field_Nb[((wd) this).field_Mb].field_qb + 10000;
                  ((wd) this).field_Mb = var2;
                  ((wd) this).field_Pb[var2].field_Ib = true;
                  ((wd) this).field_Nb[var2].field_qb = ((wd) this).field_Nb[var2].field_qb - 10000;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -37 % ((-50 - param2) / 32);
        ((wd) this).field_gb = param1;
        ((wd) this).field_qb = param0;
        ((wd) this).field_Db = param3;
        ((wd) this).field_eb = param4;
        this.a((byte) -125, param5, param6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = new int[64];
        field_Sb = false;
        field_Rb = "Connection timed out. Please try using a different server.";
        field_Ob = "Fullscreen";
    }
}
