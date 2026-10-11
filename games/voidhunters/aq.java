/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends rqa {
    static int field_o;
    static int[] field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            aq.a(80);
          }
          si.a(68, 62, param0[0].a(91));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aq.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    aq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != -10441) {
          field_o = -54;
        }
    }

    final static pgb b(int param0, int param1, int param2, int param3) {
        Object var4;
        int var5;
        int var6;
        int var7;
        pgb var8_ref_pgb;
        int var9;
        int var10_int;
        int var13;
        boolean stackIn_46_0 = false;
        boolean stackIn_54_0 = false;
        boolean stackIn_61_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_88_0 = false;
        int var8;
        pgb var9_ref_pgb;
        String var10;
        String var11;
        int var12;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        var13 = VoidHunters.field_G;
        var4 = null;
        if (param3 > -70) {
          return (pgb) null;
        }
        vea.field_p.field_wb.field_lb.e(122);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + ou.field_q; 0 <= var7; var7--) {
          var8_ref_pgb = nrb.field_b[var7];
          var9 = 0;
          if (!erb.field_p &&
            var5 < hab.field_k) {
            var10_int = jia.a(var8_ref_pgb.field_a, (byte) 19);
            if (var10_int <= var8_ref_pgb.a(1) && (var8_ref_pgb.field_k ||
              !ltb.a((byte) -94, var8_ref_pgb.field_n))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (null == var8_ref_pgb.field_j ||
              ebb.field_b) {
              if (null != var8_ref_pgb.field_j) {
              }
              var10 = dpb.a(true, var8_ref_pgb);
              var11 = var10 + no.c(var8_ref_pgb.field_d);
              var12 = ugb.a(2, var8_ref_pgb);
              var8_ref_pgb.field_j = new llb(0L, odb.field_b, var11);
              var8_ref_pgb.field_j.field_ib = ((odb.field_b.field_ib & 16711422) >> 1) - (var12 >> 1 & 8355711) + var12;
              var8_ref_pgb.field_j.field_Y = var12;
              var8_ref_pgb.field_j.field_qb = ((odb.field_b.field_qb & 16711422) >> 1) + var12 - (8355711 & var12 >> 1);
              var6 = var6 + param0;
              var8_ref_pgb.field_j.field_eb = ej.field_c;
            }
            var5++;
          } else {
            var8_ref_pgb.field_j = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; ou.field_q > var8; var8++) {
          var9_ref_pgb = nrb.field_b[var8];
          if (null != var9_ref_pgb.field_j) {
            vea.field_p.field_wb.b(-561, var9_ref_pgb.field_j);
            var9_ref_pgb.field_j.a(param1, 122, var9_ref_pgb.field_j.e(66), var7Lifetime1, param0);
            var7Lifetime1 = var7Lifetime1 + param0;
            if (var9_ref_pgb.field_j.field_o != 0) {
              var4 = var9_ref_pgb;
            }
          }
        }
        var8Lifetime1 = -var7Lifetime1 - (-var6 - (vea.field_p.field_wb.field_G + vea.field_p.field_wb.field_E));
        vea.field_p.field_wb.field_K = vea.field_p.field_wb.field_K + var8Lifetime1;
        vea.field_p.field_wb.field_G = vea.field_p.field_wb.field_G - var8Lifetime1;
        if (!ebb.field_b) {
          if (ebb.field_b) {
            ebb.field_b = false;
            vea.field_p.field_wb.field_db = 0;
            lf.field_o = true;
            vea.field_p.field_wb.field_K = vea.field_p.field_xb.field_G - vea.field_p.field_wb.field_G;
          }
          vea.field_p.field_wb.field_E = -vea.field_p.field_wb.field_G + var7Lifetime1;
          if (!fva.field_p) {
            var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
            if (lf.field_o) {
              vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
            }
            vea.field_p.a(2 * param0 * param2, true, param0, 0);
            stackIn_73_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
            lf.field_o = stackIn_73_0;
          } else {
            if (null == qw.field_l) {
              var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
              if (lf.field_o) {
                vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
              }
              vea.field_p.a(2 * param0 * param2, true, param0, 0);
              stackIn_81_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
              lf.field_o = stackIn_81_0;
            } else {
              lf.field_o = true;
              var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
              if (lf.field_o) {
                vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
              }
              vea.field_p.a(2 * param0 * param2, true, param0, 0);
              stackIn_88_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
              lf.field_o = stackIn_88_0;
            }
          }
        } else {
          vea.field_p.field_wb.field_G = var7Lifetime1;
          if (ebb.field_b) {
            ebb.field_b = false;
            vea.field_p.field_wb.field_db = 0;
            lf.field_o = true;
            vea.field_p.field_wb.field_K = vea.field_p.field_xb.field_G - vea.field_p.field_wb.field_G;
          }
          vea.field_p.field_wb.field_E = -vea.field_p.field_wb.field_G + var7Lifetime1;
          if (!fva.field_p) {
            var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
            if (lf.field_o) {
              vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
            }
            vea.field_p.a(2 * param0 * param2, true, param0, 0);
            stackIn_46_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
            lf.field_o = stackIn_46_0;
          } else {
            if (null == qw.field_l) {
              var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
              if (lf.field_o) {
                vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
              }
              vea.field_p.a(2 * param0 * param2, true, param0, 0);
              stackIn_61_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
              lf.field_o = stackIn_61_0;
            } else {
              lf.field_o = true;
              var9Lifetime1 = -vea.field_p.field_wb.field_E - vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
              if (lf.field_o) {
                vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9Lifetime1;
              }
              vea.field_p.a(2 * param0 * param2, true, param0, 0);
              stackIn_54_0 = (var9Lifetime1 == vea.field_p.field_wb.field_K + vea.field_p.field_wb.field_db);
              lf.field_o = stackIn_54_0;
            }
          }
        }
        return (pgb) (var4);
    }

    static {
        field_o = 8;
        field_p = new int[16384];
    }
}
