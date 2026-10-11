/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wab extends rqa {
    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
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
        ds var16 = null;
        ds var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = VoidHunters.field_G;
        try {
          var16 = new ds(param1);
          var17 = var16;
          var17.field_e = -2 + param1.length;
          mma.field_a = var17.e(1869);
          hla.field_a = new int[mma.field_a];
          hja.field_o = new byte[mma.field_a][];
          sh.field_a = new byte[mma.field_a][];
          mk.field_o = new boolean[mma.field_a];
          so.field_f = new int[mma.field_a];
          nhb.field_o = new int[mma.field_a];
          iib.field_e = new int[mma.field_a];
          var17.field_e = -(mma.field_a * 8) - 7 + param1.length;
          fbb.field_i = var17.e(1869);
          sg.field_H = var17.e(1869);
          var3 = (255 & var17.e((byte) -110)) + 1;
          for (var4 = 0; mma.field_a > var4; var4++) {
            iib.field_e[var4] = var16.e(1869);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < mma.field_a; var4Lifetime1++) {
            so.field_f[var4Lifetime1] = var17.e(1869);
          }
          for (var4Lifetime2 = param0; mma.field_a > var4Lifetime2; var4Lifetime2++) {
            nhb.field_o[var4Lifetime2] = var17.e(1869);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < mma.field_a; var4Lifetime3++) {
            hla.field_a[var4Lifetime3] = var17.e(1869);
          }
          var17.field_e = -7 + param1.length - 8 * mma.field_a - (-1 + var3) * 3;
          rlb.field_d = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            rlb.field_d[var4Lifetime4] = var17.c((byte) -87);
            if (0 == rlb.field_d[var4Lifetime4]) {
              rlb.field_d[var4Lifetime4] = 1;
            }
          }
          var17.field_e = 0;
          for (var4Lifetime5 = 0; mma.field_a > var4Lifetime5; var4Lifetime5++) {
            var5 = nhb.field_o[var4Lifetime5];
            var6 = hla.field_a[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            sh.field_a[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            hja.field_o[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.e((byte) -105);
            if (0 == (1 & var11)) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.d((byte) -114);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var17.d((byte) -114);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_46_0 = var10;
                  if (-1 == var13) {
                    stackIn_47_1 = 0;
                  } else {
                    stackIn_47_1 = 1;
                  }
                  var10 = stackIn_46_0 | stackIn_47_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var13 * var5] = var17.d((byte) -114);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var17.d((byte) -114);
                    var9[var13 * var5 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_34_0 = var10;
                    if (-1 == var14) {
                      stackIn_35_1 = 0;
                    } else {
                      stackIn_35_1 = 1;
                    }
                    var10 = stackIn_34_0 | stackIn_35_1;
                  }
                }
              }
            }
            mk.field_o[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("wab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    wab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          ki.field_o = param0[0].a(81);
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wab.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
