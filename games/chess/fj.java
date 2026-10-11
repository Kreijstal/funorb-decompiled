/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int[] field_i;
    static int field_c;
    static String field_b;
    static int[] field_f;
    int field_e;
    static String field_h;
    static int field_a;
    static int field_g;
    int field_d;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = Chess.field_G;
        if (param1 != -1) {
          return 55;
        }
        if (this.field_i == null) {
          return 0;
        }
        if (this.field_i.length == 0) {
          return 0;
        }
        for (var3 = 1; var3 < this.field_i.length; var3++) {
          if (this.field_i[var3] + this.field_i[-1 + var3] >> 1 > param0) {
            return var3 - 1;
          }
        }
        return this.field_i.length - 1;
    }

    public static void a(byte param0) {
        int var1 = -27 % ((69 - param0) / 39);
        field_f = null;
        field_h = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -109);
        var3.c(param1, (byte) -79);
        var3.c(8, (byte) -113);
        var3.b(param2, 116);
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        try {
          eg.field_f.field_S = param3;
          eg.field_f.field_ib = param4;
          if (param2 != -1) {
            field_h = (String) null;
          }
          eg.field_f.field_M = eg.field_f.field_M + uc.field_c.field_M;
          eg.field_f.field_db = param0;
          uc.field_c.field_mb = uc.field_c.field_mb + uc.field_c.field_M;
          uc.field_c.field_M = param1;
          eg.field_f.field_M = eg.field_f.field_M - uc.field_c.field_M;
          uc.field_c.field_mb = uc.field_c.field_mb - uc.field_c.field_M;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "fj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        fi.a(param0 - 393711775);
        bk.a(param0 ^ 16777215);
        pj.field_h = null;
        rc.b(param0);
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        if (param0) {
          fj.a(117, 25, -75, -73);
        }
        if (null != this.field_i &&
          0 != this.field_i.length) {
          stackIn_7_0 = this.field_i[this.field_i.length - 1];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    fj(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_i = new int[1 + param2];
        this.field_e = param1;
    }

    final static ld a(int param0, int param1, int param2, int param3) {
        boolean stackIn_50_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ld var8_ref_ld;
        int var9;
        ld var9_ref_ld;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Chess.field_G;
        ac.field_j.field_Kb.field_I.e(-31023);
        var4 = null;
        var5 = 0;
        if (param3 != 8) {
          fj.a(71, 83, -95);
        }
        var6 = 0;
        for (var7 = qf.field_c - 1; var7 >= 0; var7--) {
          var8_ref_ld = ik.field_i[var7];
          var9 = 0;
          if (!qf.field_b &&
            fh.field_b > var5) {
            var10_int = lg.a(param3 ^ -43, var8_ref_ld.field_k);
            if (var10_int <= var8_ref_ld.b(2) && (var8_ref_ld.field_d ||
              !va.a(var8_ref_ld.field_i, -19554))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            var5++;
            if (null == var8_ref_ld.field_f ||
              tj.field_l) {
              if (var8_ref_ld.field_f == null) {
                s.field_O = s.field_O + 1;
              }
              var10 = mn.a((byte) -30, var8_ref_ld);
              var11 = var10 + lh.a(var8_ref_ld.field_n);
              var12 = wh.a(param3 ^ -9, var8_ref_ld);
              var8_ref_ld.field_f = new ci(0L, eh.field_M, var11);
              var8_ref_ld.field_f.field_ib = var12;
              var8_ref_ld.field_f.field_xb = sc.field_a;
              var6 = var6 + param2;
              var8_ref_ld.field_f.field_P = -(8355711 & var12 >> 1) + var12 + ((eh.field_M.field_P & 16711423) >> 1);
              var8_ref_ld.field_f.field_O = var12 - ((16711423 & var12) >> 1) + ((16711422 & eh.field_M.field_O) >> 1);
            }
          } else {
            var8_ref_ld.field_f = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; var8 < qf.field_c; var8++) {
          var9_ref_ld = ik.field_i[var8];
          if (var9_ref_ld.field_f != null) {
            ac.field_j.field_Kb.a((byte) 124, var9_ref_ld.field_f);
            var9_ref_ld.field_f.a(param0, var9_ref_ld.field_f.e((byte) 89), param3 + 2147483640, param2, var7Lifetime1);
            var7Lifetime1 = var7Lifetime1 + param2;
            if (var9_ref_ld.field_f.field_L != 0) {
              var4 = var9_ref_ld;
            }
          }
        }
        var8Lifetime1 = ac.field_j.field_Kb.field_pb + ac.field_j.field_Kb.field_N - (-var6 + var7Lifetime1);
        ac.field_j.field_Kb.field_V = ac.field_j.field_Kb.field_V + var8Lifetime1;
        ac.field_j.field_Kb.field_pb = ac.field_j.field_Kb.field_pb - var8Lifetime1;
        if (tj.field_l) {
          ac.field_j.field_Kb.field_pb = var7Lifetime1;
        }
        ac.field_j.field_Kb.field_N = var7Lifetime1 - ac.field_j.field_Kb.field_pb;
        if (tj.field_l) {
          tj.field_l = false;
          ac.field_j.field_Kb.field_V = -ac.field_j.field_Kb.field_pb + ac.field_j.field_Jb.field_pb;
          fl.field_j = true;
          ac.field_j.field_Kb.field_vb = 0;
        }
        if (kn.field_L &&
          ac.field_l != null) {
          fl.field_j = true;
        }
        var9Lifetime1 = -ac.field_j.field_Kb.field_pb - ac.field_j.field_Kb.field_N + ac.field_j.field_Jb.field_pb;
        if (fl.field_j) {
          ac.field_j.field_Kb.field_vb = var9Lifetime1 - ac.field_j.field_Kb.field_V;
        }
        ac.field_j.a((byte) -109, param2, true, param1 * 2 * param2);
        stackIn_50_0 = (ac.field_j.field_Kb.field_V + ac.field_j.field_Kb.field_vb == var9Lifetime1);
        fl.field_j = stackIn_50_0;
        return (ld) (var4);
    }

    static {
        field_f = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_b = "This option cannot be combined with the current '<%0>' setting.";
        field_c = 0;
    }
}
