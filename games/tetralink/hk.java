/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hk {
    static int field_a;
    static String[] field_b;
    static int field_d;
    static long field_c;

    final static void a(byte param0) {
        if (fl.field_u != null) {
          fl.field_u.r(-128);
        }
        ko.field_q = new fn();
        mm.field_u.e(ko.field_q, -27667);
        if (param0 > -50) {
          field_d = -89;
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
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
        byte[] var16 = null;
        bh var17 = null;
        bh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = TetraLink.field_J;
        try {
          if (param1 > -35) {
            var16 = (byte[]) null;
            hk.a((byte[]) null, 72);
          }
          var17 = new bh(param0);
          var18 = var17;
          var18.field_t = -2 + param0.length;
          vj.field_n = var18.e(127);
          gm.field_g = new boolean[vj.field_n];
          ga.field_a = new byte[vj.field_n][];
          sn.field_e = new int[vj.field_n];
          qa.field_x = new int[vj.field_n];
          je.field_h = new int[vj.field_n];
          i.field_t = new int[vj.field_n];
          jg.field_i = new byte[vj.field_n][];
          var18.field_t = -(vj.field_n * 8) - 7 + param0.length;
          wm.field_l = var18.e(127);
          mm.field_w = var18.e(127);
          var3 = 1 + (255 & var18.d((byte) -99));
          for (var4 = 0; var4 < vj.field_n; var4++) {
            qa.field_x[var4] = var17.e(127);
          }
          for (var4Lifetime1 = 0; vj.field_n > var4Lifetime1; var4Lifetime1++) {
            i.field_t[var4Lifetime1] = var18.e(127);
          }
          for (var4Lifetime2 = 0; vj.field_n > var4Lifetime2; var4Lifetime2++) {
            je.field_h[var4Lifetime2] = var18.e(127);
          }
          for (var4Lifetime3 = 0; vj.field_n > var4Lifetime3; var4Lifetime3++) {
            sn.field_e[var4Lifetime3] = var18.e(127);
          }
          var18.field_t = 3 - 3 * var3 + (param0.length - (7 + vj.field_n * 8));
          ti.field_c = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            ti.field_c[var4Lifetime4] = var18.d(-1);
            if (ti.field_c[var4Lifetime4] == 0) {
              ti.field_c[var4Lifetime4] = 1;
            }
          }
          var18.field_t = 0;
          for (var4Lifetime5 = 0; vj.field_n > var4Lifetime5; var4Lifetime5++) {
            var5 = je.field_h[var4Lifetime5];
            var6 = sn.field_e[var4Lifetime5];
            var7 = var6 * var5;
            var21 = new byte[var7];
            var19 = var21;
            var8 = var19;
            ga.field_a[var4Lifetime5] = var21;
            var22 = new byte[var7];
            var20 = var22;
            var9 = var20;
            jg.field_i[var4Lifetime5] = var22;
            var10 = 0;
            var11 = var18.d((byte) -99);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var18.g(-1772093437);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var18.g(-1772093437);
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
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var18.g(-1772093437);
                }
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var18.g(-1772093437);
                    var9[var5 * var13 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_37_0 = var10;
                    if (var14 == -1) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var10 = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            gm.field_g[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("hk.B(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 8) {
          return;
        }
        field_b = null;
    }

    abstract byte[] b(int param0, int param1);

    abstract int a(int param0, int param1);

    abstract t a(int param0);

    static {
    }
}
