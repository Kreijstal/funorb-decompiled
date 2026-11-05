/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static int field_b;
    static int field_a;
    static int field_c;
    static dl[] field_d;

    final static void a(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ng var16 = null;
        ng var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = CrazyCrystals.field_B;
        try {
          var16 = new ng(param0);
          var17 = var16;
          var17.field_f = -2 + param0.length;
          mg.field_a = var17.c((byte) -7);
          jm.field_a = new int[mg.field_a];
          uo.field_k = new int[mg.field_a];
          ng.field_g = new byte[mg.field_a][];
          rh.field_a = new boolean[mg.field_a];
          je.field_c = new int[mg.field_a];
          ui.field_c = new byte[mg.field_a][];
          uo.field_l = new int[mg.field_a];
          var17.field_f = param0.length - (7 + mg.field_a * 8);
          km.field_c = var17.c((byte) -7);
          if (!param1) {
            h.a((byte) 24, 15);
          }
          bo.field_o = var17.c((byte) -7);
          var3 = (255 & var17.h(255)) + 1;
          for (var4 = 0; mg.field_a > var4; var4++) {
            uo.field_k[var4] = var16.c((byte) -7);
          }
          for (var4Lifetime1 = 0; mg.field_a > var4Lifetime1; var4Lifetime1++) {
            jm.field_a[var4Lifetime1] = var17.c((byte) -7);
          }
          for (var4Lifetime2 = 0; mg.field_a > var4Lifetime2; var4Lifetime2++) {
            uo.field_l[var4Lifetime2] = var17.c((byte) -7);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < mg.field_a; var4Lifetime3++) {
            je.field_c[var4Lifetime3] = var17.c((byte) -7);
          }
          var17.field_f = -(mg.field_a * 8) - 7 + (param0.length - var3 * 3 + 3);
          gh.field_z = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            gh.field_z[var4Lifetime4] = var17.b(false);
            if (gh.field_z[var4Lifetime4] == 0) {
              gh.field_z[var4Lifetime4] = 1;
            }
          }
          var17.field_f = 0;
          for (var4Lifetime5 = 0; mg.field_a > var4Lifetime5; var4Lifetime5++) {
            var5 = uo.field_l[var4Lifetime5];
            var6 = je.field_c[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            ui.field_c[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ng.field_g[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.h(255);
            if (0 == (1 & var11)) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.d((byte) 124);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var17.d((byte) -113);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_48_0 = var10;
                  if (var13 == -1) {
                    stackIn_49_1 = 0;
                  } else {
                    stackIn_49_1 = 1;
                  }
                  var10 = stackIn_48_0 | stackIn_49_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var13 * var5] = var17.d((byte) -33);
                }
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var17.d((byte) 119);
                    var9[var13 * var5 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_36_0 = var10;
                    if (var14 == -1) {
                      stackIn_37_1 = 0;
                    } else {
                      stackIn_37_1 = 1;
                    }
                    var10 = stackIn_36_0 | stackIn_37_1;
                  }
                }
              }
            }
            rh.field_a[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("h.C(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
          h.a(-16);
        }
    }

    final synchronized static byte[] a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        byte[][] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          so.field_e > 0) {
          fieldTemp$0 = so.field_e - 1;
          so.field_e = so.field_e - 1;
          var2_ref_byte__ = mn.field_i[fieldTemp$0];
          mn.field_i[so.field_e] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          je.field_e > 0) {
          fieldTemp$1 = tg.field_e;
          fieldTemp$2 = je.field_e - 1;
          je.field_e = je.field_e - 1;
          var2_ref_byte__Lifetime1 = fieldTemp$1[fieldTemp$2];
          tg.field_e[je.field_e] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 != 26) {
          field_d = (dl[]) null;
        }
        if (param1 == 30000 &&
          ed.field_z > 0) {
          fieldTemp$3 = ed.field_z - 1;
          ed.field_z = ed.field_z - 1;
          var2_ref_byte__Lifetime2 = oc.field_a[fieldTemp$3];
          oc.field_a[ed.field_z] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != lp.field_a) {
          for (var2 = 0; kk.field_e.length > var2; var2++) {
            if (kk.field_e[var2] == param1 &&
              jd.field_K[var2] > 0) {
              dupTemp$4 = jd.field_K[var2] - 1;
              arrayValue$5 = lp.field_a[var2];
              jd.field_K[var2] = dupTemp$4;
              var3 = arrayValue$5[dupTemp$4];
              lp.field_a[var2][jd.field_K[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param1];
    }

    static {
        qd.a(-82, 50);
    }
}
