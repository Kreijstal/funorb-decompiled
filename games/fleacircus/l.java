/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static wj field_b;
    static int[] field_c;
    static String field_a;

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        ni var16 = null;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = fleas.field_A ? 1 : 0;
        try {
          var16 = new ni(param0);
          var17 = var16;
          var17.field_i = param0.length - 2;
          ef.field_l = var17.d((byte) -68);
          if (param1 != -91) {
            return;
          }
          vg.field_I = new int[ef.field_l];
          wb.field_t = new byte[ef.field_l][];
          gg.field_i = new boolean[ef.field_l];
          of.field_d = new byte[ef.field_l][];
          ij.field_H = new int[ef.field_l];
          ob.field_a = new int[ef.field_l];
          b.field_b = new int[ef.field_l];
          var17.field_i = -(ef.field_l * 8) + (-7 + param0.length);
          e.field_e = var17.d((byte) 75);
          uf.field_k = var17.d((byte) -49);
          var3 = 1 + (255 & var17.e(false));
          for (var4 = 0; ef.field_l > var4; var4++) {
            vg.field_I[var4] = var16.d((byte) 62);
          }
          for (var4Lifetime1 = 0; ef.field_l > var4Lifetime1; var4Lifetime1++) {
            b.field_b[var4Lifetime1] = var17.d((byte) -124);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < ef.field_l; var4Lifetime2++) {
            ij.field_H[var4Lifetime2] = var17.d((byte) 106);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < ef.field_l; var4Lifetime3++) {
            ob.field_a[var4Lifetime3] = var17.d((byte) -74);
          }
          var17.field_i = -(ef.field_l * 8) + param0.length - (7 + (-1 + var3) * 3);
          rd.field_d = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            rd.field_d[var4Lifetime4] = var17.c(true);
            if (0 == rd.field_d[var4Lifetime4]) {
              rd.field_d[var4Lifetime4] = 1;
            }
          }
          var17.field_i = 0;
          for (var4Lifetime5 = 0; ef.field_l > var4Lifetime5; var4Lifetime5++) {
            var5 = ij.field_H[var4Lifetime5];
            var6 = ob.field_a[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            of.field_d[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            wb.field_t[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.e(false);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.i(-124);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var17.i(df.a((int) param1, 31));
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_47_0 = var10;
                  if (var13 == -1) {
                    stackIn_48_1 = 0;
                  } else {
                    stackIn_48_1 = 1;
                  }
                  var10 = stackIn_47_0 | stackIn_48_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5 * var13] = var17.i(-65);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var17.i(-107);
                    var9[var5 * var13 + var12] = dupTemp$1;
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
            gg.field_i[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("l.D(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        bd.field_kb = null;
        ic.field_bb = null;
        int var1 = -5 % ((param0 - 44) / 58);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -29049) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (ok.field_x != null) {
          ok.field_x.n(param0 - 22645);
        }
        if (param0 != 0) {
          field_a = (String) null;
        }
        uc.field_e = new nf();
        ak.field_a.d(uc.field_e, param0 ^ 26034);
    }

    static {
        field_a = "Username: ";
    }
}
