/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends il {
    static nc field_h;
    static String field_i;
    static String field_f;
    static wg field_j;
    static int field_g;

    final wb a(int param0) {
        if (param0 < 30) {
          field_h = (nc) null;
        }
        return og.field_a;
    }

    final static int a(int param0, int param1, boolean param2, String param3, mb param4, mb param5, int param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        gb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        gb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          var14 = param5.a(91);
          if (param6 != -21760) {
            vb.d(122);
          }
          var8 = param4.a(param6 + 21819);
          var11_ref_String = var8;
          var11_ref_StringLifetime1 = var8;
          if (lf.field_d == null &&
            !ai.a(false, (byte) -37)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (qc.field_i == ef.field_e) {
            n.field_b = null;
            id.field_c.field_m = 0;
            if (param3 != null) {
              var9 = 0;
              ic.field_z.field_m = 0;
              if (param2) {
                var9 = var9 | 1;
              }
              ic.field_z.b(ib.field_i.nextInt(), false);
              ic.field_z.b(ib.field_i.nextInt(), false);
              ic.field_z.b(-1955895016, var14);
              ic.field_z.b(param6 - 1955873256, var8);
              var15 = (CharSequence) ((Object) param3);
              ic.field_z.b(-1955895016, sa.a(var15, true));
              ic.field_z.a(true, param1);
              ic.field_z.c(-112, param0);
              ic.field_z.c(105, var9);
              id.field_c.c(-112, 18);
              id.field_c.field_m = id.field_c.field_m + 2;
              var10 = id.field_c.field_m;
              var11_ref_StringLifetime2 = hh.a(false, ia.g(-79));
              if (var11_ref_StringLifetime2 == null) {
                var11_ref_StringLifetime2 = "";
              }
              id.field_c.a(var11_ref_StringLifetime2, 0);
              al.a(ic.field_z, id.field_c, (byte) 76, nc.field_d, qa.field_p);
              id.field_c.a(id.field_c.field_m - var10, true);
            } else {
              ic.field_z.field_m = 0;
              ic.field_z.b(ib.field_i.nextInt(), false);
              ic.field_z.b(ib.field_i.nextInt(), false);
              stackIn_11_0 = ic.field_z;
              stackIn_11_1 = -1955895016;
              if (param5.a(true)) {
                stackIn_12_2 = var14;
              } else {
                stackIn_12_2 = "";
              }
              ((gb) (Object) stackIn_11_0).b(stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = ic.field_z;
              stackIn_14_1 = -1955895016;
              if (param4.a(true)) {
                stackIn_15_2 = var8;
              } else {
                stackIn_15_2 = "";
              }
              ((gb) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_15_2);
              id.field_c.c(-110, 16);
              id.field_c.field_m = id.field_c.field_m + 1;
              var9 = id.field_c.field_m;
              al.a(ic.field_z, id.field_c, (byte) 75, nc.field_d, qa.field_p);
              id.field_c.b(param6 + 21761, id.field_c.field_m - var9);
            }
            qf.a(0, -1);
            ef.field_e = di.field_l;
          }
          if (ef.field_e == di.field_l &&
            bf.c(param6 ^ -21696, 1)) {
            var9Lifetime1 = te.field_N.j(255);
            te.field_N.field_m = 0;
            if (100 <= var9Lifetime1 &&
              var9Lifetime1 <= 105) {
              ef.field_e = ta.field_e;
              ke.field_O = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                wb.a(ia.g(-103), (byte) -79);
                md.field_v = fi.field_j;
                je.a(false);
                je.field_c = false;
                stackIn_32_0 = var9Lifetime1;
                return stackIn_32_0;
              }
              if (var9Lifetime1 != 99) {
                te.field_O = -1;
                ob.field_h = var9Lifetime1;
                ef.field_e = bj.field_a;
              } else {
                bf.c(54, sk.g(-9917));
                n.field_b = new Boolean(lj.a(te.field_N, -2));
                te.field_N.field_m = 0;
              }
            }
          }
          if (ta.field_e == ef.field_e) {
            var9Lifetime2 = 2;
            if (bf.c(110, var9Lifetime2)) {
              var10Lifetime1 = te.field_N.i(-121);
              te.field_N.field_m = 0;
              if (bf.c(82, var10Lifetime1)) {
                var11 = ke.field_O.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ke.field_O[var12] = te.field_N.d(false);
                }
                je.a(false);
                je.field_c = false;
                stackIn_41_0 = 100 + var11;
                return stackIn_41_0;
              }
            }
          }
          if (bj.field_a == ef.field_e &&
            qd.b((byte) 125)) {
            if (ob.field_h != 255) {
              md.field_v = te.field_N.h(15);
            } else {
              var9_ref_String = te.field_N.g(86);
              if (var9_ref_String != null) {
                kl.a(ia.g(param6 + 21721), var9_ref_String, 13536);
              }
            }
            je.a(false);
            je.field_c = false;
            stackIn_50_0 = ob.field_h;
            return stackIn_50_0;
          }
          if (lf.field_d == null) {
            if (je.field_c) {
              if (30000L < dh.b(-1)) {
                md.field_v = il.field_d;
              } else {
                md.field_v = cl.field_j;
              }
              je.field_c = false;
              stackIn_58_0 = 249;
              return stackIn_58_0;
            }
            var9Lifetime3 = ia.field_kb;
            ia.field_kb = ki.field_C;
            je.field_c = true;
            ki.field_C = var9Lifetime3;
          }
          stackIn_60_0 = -1;
          return stackIn_60_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_63_0 = var7;
          stackIn_63_1 = new StringBuilder().append("vb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param4 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param5 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != 20364) {
          mb var2 = (mb) null;
          vb.a(-57, -128, false, (String) null, (mb) null, (mb) null, 106);
        }
        field_h = null;
        field_j = null;
        field_f = null;
    }

    final static int a(byte param0) {
        int var1 = 12 / ((param0 + 11) / 48);
        return v.field_d;
    }

    vb(long param0, String param1) {
        super(param0, param1);
    }

    final static o[] e(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        o[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = SolKnight.field_L ? 1 : 0;
        var1 = new o[nb.field_c];
        if (param0 != 255) {
          vb.e(64);
        }
        for (var2 = 0; var2 < nb.field_c; var2++) {
          var3 = uj.field_b[var2] * sa.field_l[var2];
          var21 = jc.field_c[var2];
          if (!rg.field_e[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = ig.field_H[fi.a((int) var21[var6], 255)];
            }
            var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var22);
          } else {
            var16 = uf.field_s[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = qk.a(ig.field_H[fi.a((int) var21[var7], 255)], fi.a((int) var16[var7], 255) << 24);
            }
            var1[var2] = (o) ((Object) new ui(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var17));
          }
        }
        og.a((byte) -97);
        return var1;
    }

    static {
        field_i = "Loading graphics";
        field_f = "Sound: ";
    }
}
