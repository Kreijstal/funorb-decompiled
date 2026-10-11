/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
          this.a((byte) 23);
        }
        hk.a(this.field_f, this.field_g, this.field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = client.field_A ? 1 : 0;
        try {
          if (param0 != -72) {
            field_a = 89;
          }
          var16 = new wl(param1);
          var17 = var16;
          var17.field_n = -2 + param1.length;
          ec.field_g = var17.e(3);
          da.field_d = new boolean[ec.field_g];
          sg.field_d = new int[ec.field_g];
          fh.field_a = new int[ec.field_g];
          tm.field_a = new int[ec.field_g];
          hc.field_c = new int[ec.field_g];
          pd.field_e = new byte[ec.field_g][];
          tc.field_Nb = new byte[ec.field_g][];
          var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
          ed.field_f = var17.e(3);
          i.field_d = var17.e(3);
          var3 = 1 + (var17.d((byte) -104) & 255);
          for (var4 = 0; var4 < ec.field_g; var4++) {
            sg.field_d[var4] = var16.e(qm.b((int) param0, -69));
          }
          for (var4Lifetime1 = 0; ec.field_g > var4Lifetime1; var4Lifetime1++) {
            fh.field_a[var4Lifetime1] = var17.e(qm.b((int) param0, -69));
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < ec.field_g; var4Lifetime2++) {
            tm.field_a[var4Lifetime2] = var17.e(3);
          }
          for (var4Lifetime3 = 0; ec.field_g > var4Lifetime3; var4Lifetime3++) {
            hc.field_c[var4Lifetime3] = var17.e(3);
          }
          var17.field_n = -(3 * (var3 - 1)) + (param1.length - (7 + ec.field_g * 8));
          mb.field_d = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            mb.field_d[var4Lifetime4] = var17.h(param0 + 65352);
            if (0 == mb.field_d[var4Lifetime4]) {
              mb.field_d[var4Lifetime4] = 1;
            }
          }
          var17.field_n = 0;
          for (var4Lifetime5 = 0; ec.field_g > var4Lifetime5; var4Lifetime5++) {
            var5 = tm.field_a[var4Lifetime5];
            var6 = hc.field_c[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            tc.field_Nb[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            pd.field_e[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.d((byte) -35);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.g((byte) -127);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.g((byte) -119);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_32_0 = var10;
                  if (var13 == -1) {
                    stackIn_33_1 = 0;
                  } else {
                    stackIn_33_1 = 1;
                  }
                  var10 = stackIn_32_0 | stackIn_33_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.g((byte) -124);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.g((byte) -115);
                    var9[var12 + var13 * var5] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            da.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("eh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = (boolean[][]) null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
          eh.a(125);
        }
    }

    static {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
