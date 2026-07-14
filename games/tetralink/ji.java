/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends hl {
    static db field_Qb;
    hl field_Sb;
    hl field_Kb;
    hl field_Pb;
    rb field_Rb;
    static String field_Mb;
    static boolean field_Nb;
    static String field_Ob;
    static String field_Ub;
    static String field_Vb;
    static int field_Tb;
    static String field_Lb;

    final static String a(String param0, ah param1, String param2, String param3, int param4) {
        if (!param1.c(103)) {
            return param2;
        }
        if (param4 != 1152753825) {
            ji.d((byte) 23);
        }
        return param0 + " - " + param1.a(param3, true) + "%";
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param1 + ((ji) this).field_Hb) / param3;
        int var6 = ((ji) this).field_R + -param0;
        ((ji) this).field_Rb.a(((ji) this).field_Hb, param2, var6 + -param1, true, 0, 0, param1);
        ((ji) this).field_Sb.field_Hb = var5 - param1;
        ((ji) this).field_Sb.field_R = param0;
        ((ji) this).field_Sb.field_M = 0;
        ((ji) this).field_Sb.field_yb = var6;
        ((ji) this).field_Pb.field_R = param0;
        ((ji) this).field_Pb.field_yb = var6;
        ((ji) this).field_Pb.field_Hb = ((ji) this).field_Hb + -var5;
        ((ji) this).field_Pb.field_M = var5;
    }

    ji(long param0, hl param1, hl param2, bl param3, hl param4, String param5, String param6) {
        super(param0, param1);
        ((ji) this).field_Kb = new hl(0L, (hl) null);
        ((ji) this).field_Rb = new rb(0L, ((ji) this).field_Kb, param2, param3);
        ((ji) this).field_Sb = new hl(0L, param4);
        ((ji) this).field_Pb = new hl(0L, param4);
        ((ji) this).field_Sb.field_jb = param5;
        ((ji) this).field_Pb.field_jb = param6;
        ((ji) this).a((byte) -110, (hl) (Object) ((ji) this).field_Rb);
        ((ji) this).a((byte) -117, ((ji) this).field_Sb);
        ((ji) this).a((byte) 47, ((ji) this).field_Pb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ji) this).field_yb = param6;
        ((ji) this).field_R = param3;
        ((ji) this).field_M = param1;
        if (param0 != -2328) {
            Object var10 = null;
            String discarded$0 = ji.a((String) null, (ah) null, (String) null, (String) null, 48);
        }
        ((ji) this).field_Hb = param4;
        ((ji) this).a(param2, param5, param7, 2);
    }

    final static void a(ah param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int[] var6 = null;
        int var7 = 0;
        bc var8 = null;
        int var9 = 0;
        bc var10 = null;
        L0: {
          var7 = TetraLink.field_J;
          var8 = new bc(param0.a("logo.fo3d", "", true));
          var10 = var8;
          var3 = var10.d((byte) -99);
          var10.e(true);
          dh.field_n = lj.a(var10, 0);
          wa.field_f = new id[var3];
          da.field_b = new int[var3][];
          if (param1 == 1) {
            break L0;
          } else {
            field_Nb = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3) {
            var10.i((byte) 123);
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = wa.field_f[var9];
                var5.a(1, 6, true, 6, 6);
                var5.b(false);
                var6 = new int[]{var5.field_a - -var5.field_j >> -1002815199, var5.field_L + var5.field_f >> 1152753825, var5.field_P + var5.field_m >> -1191472959};
                da.field_b[var9] = var6;
                var5.a(-var6[2], param1 ^ 5337, -var6[0], -var6[1]);
                var9++;
                continue L2;
              }
            }
          } else {
            wa.field_f[var4] = lj.a(param1 + -16484, var8);
            var4++;
            continue L1;
          }
        }
    }

    final static void b(int param0, boolean param1) {
        if (re.field_P != null) {
            ua.a(7918, re.field_P);
        }
        if (!(null == hd.field_s)) {
            hd.field_s.a(param1, 15163);
        }
        uf.a(param1, -123);
        if (param0 != -1002815199) {
            field_Mb = null;
        }
        if (null != mm.field_y) {
            mm.field_y.a(param1, 256);
        }
        gl.a(param1, (byte) 24);
    }

    ji(long param0, ji param1, String param2, String param3) {
        this(param0, (hl) (Object) param1, param1.field_Rb.field_Ob, param1.field_Rb.field_Qb, param1.field_Sb, param2, param3);
    }

    public static void d(byte param0) {
        if (param0 != 116) {
            field_Mb = null;
        }
        field_Qb = null;
        field_Ub = null;
        field_Mb = null;
        field_Vb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static void h(int param0) {
        int var2 = TetraLink.field_J;
        ul.field_e = null;
        qi.field_q = 0;
        ca.field_c = param0;
        og.field_j.b(1);
        mm.field_s.b(1);
        gb var1 = wb.field_f.b(107);
        while (var1 != null) {
            var1.e(param0 ^ 0);
            var1 = wb.field_f.d(-1);
        }
        var1 = sd.field_nb.b(-127);
        while (var1 != null) {
            var1.e(param0 + 0);
            var1 = sd.field_nb.d(-1);
        }
        field_Tb = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Options";
        field_Qb = new db(8, 0, 4, 1);
        field_Ub = "Unpacking sound effects";
        field_Ob = "Show all game chat";
        field_Vb = "Please remove <%0> from your friend list first.";
    }
}
