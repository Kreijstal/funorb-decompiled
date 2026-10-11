/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vbb extends rqa {
    static int[] field_o;
    static boolean field_p;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 2051507073) {
          vbb.a(-30);
        }
    }

    vbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ei.field_a = param0[0].a(50);
          if (param1 > -119) {
            vbb.a(15, 1, 90, -10, -70, -82, 78, -25);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vbb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var43Lifetime1;
        var47 = VoidHunters.field_G;
        try {
          var8_int = 0;
          var9 = param7;
          var10 = 0;
          var11 = param5 - param3;
          var12 = param7 - param3;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 1;
          if (param0 != 2051507073) {
            vbb.e(-74);
          }
          var18 = var13 << 1;
          var19 = var16 << 1;
          var20 = var15 << 1;
          var21 = param7 << 1;
          var22 = var12 << 1;
          var23 = var17 + var13 * (-var21 + 1);
          var24 = -(var18 * (var21 - 1)) + var14;
          var25 = var15 * (-var22 + 1) + var19;
          var26 = -((-1 + var22) * var20) + var16;
          var27 = var13 << 2;
          var28 = var14 << 2;
          var29 = var15 << 2;
          var30 = var16 << 2;
          var31 = 3 * var17;
          var32 = (-3 + var21) * var18;
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (-1 + var12);
          if (param2 >= lua.field_c &&
            param2 <= hab.field_i) {
            var57 = rba.field_b[param2];
            var40 = ksa.a(param0 ^ 2051537426, ob.field_j, mt.field_o, -param5 + param6);
            var41 = ksa.a(31123, ob.field_j, mt.field_o, param5 + param6);
            var42 = ksa.a(31123, ob.field_j, mt.field_o, param6 - var11);
            var43 = ksa.a(param0 ^ 2051537426, ob.field_j, mt.field_o, param6 + var11);
            ww.a(param1, var42, var57, (byte) 75, var40);
            ww.a(param4, var43, var57, (byte) 75, var42);
            ww.a(param1, var41, var57, (byte) 75, var43);
          }
          while (true) {
            if (var9 <= 0) {
              return;
            }
            stackIn_10_0 = (var12 < var9) ? 0 : 1;
            var39 = stackIn_10_0;
            if (var23 < 0) {
              while (var23 < 0) {
                var24 = var24 + var35;
                var23 = var23 + var31;
                var8_int++;
                var31 = var31 + var28;
                var35 = var35 + var28;
              }
            }
            if (var39 != 0) {
              if (var25 < 0) {
                while (var25 < 0) {
                  var26 = var26 + var37;
                  var25 = var25 + var33;
                  var37 = var37 + var30;
                  var33 = var33 + var30;
                  var10++;
                }
              }
              if (var26 < 0) {
                var25 = var25 + var33;
                var26 = var26 + var37;
                var33 = var33 + var30;
                var10++;
                var37 = var37 + var30;
              }
              var26 = var26 - var34;
              var25 = var25 - var38;
              var38 = var38 - var29;
              var34 = var34 - var29;
            }
            if (var24 < 0) {
              var23 = var23 + var31;
              var24 = var24 + var35;
              var31 = var31 + var28;
              var8_int++;
              var35 = var35 + var28;
            }
            var23 = var23 - var36;
            var24 = var24 - var32;
            var36 = var36 - var27;
            var9--;
            var32 = var32 - var27;
            var40Lifetime1 = -var9 + param2;
            var41Lifetime1 = var9 + param2;
            if (var41Lifetime1 < lua.field_c) {
              continue;
            }
            if (var40Lifetime1 > hab.field_i) {
              continue;
            }
            var42Lifetime1 = ksa.a(31123, ob.field_j, mt.field_o, var8_int + param6);
            var43Lifetime1 = ksa.a(31123, ob.field_j, mt.field_o, param6 - var8_int);
            if (var39 == 0) {
              if (var40Lifetime1 >= lua.field_c) {
                ww.a(param1, var42Lifetime1, rba.field_b[var40Lifetime1], (byte) 75, var43Lifetime1);
              }
              if (var41Lifetime1 > hab.field_i) {
                continue;
              }
              ww.a(param1, var42Lifetime1, rba.field_b[var41Lifetime1], (byte) 75, var43Lifetime1);
              continue;
            }
            var44 = ksa.a(param0 - 2051475950, ob.field_j, mt.field_o, var10 + param6);
            var45 = ksa.a(31123, ob.field_j, mt.field_o, param6 - var10);
            if (var40Lifetime1 >= lua.field_c) {
              var58 = rba.field_b[var40Lifetime1];
              ww.a(param1, var45, var58, (byte) 75, var43Lifetime1);
              ww.a(param4, var44, var58, (byte) 75, var45);
              ww.a(param1, var42Lifetime1, var58, (byte) 75, var44);
            }
            if (var41Lifetime1 > hab.field_i) {
              continue;
            }
            var59 = rba.field_b[var41Lifetime1];
            ww.a(param1, var45, var59, (byte) 75, var43Lifetime1);
            ww.a(param4, var44, var59, (byte) 75, var45);
            ww.a(param1, var42Lifetime1, var59, (byte) 75, var44);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var8), "vbb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void e(int param0) {
        ajb var1 = (ajb) (ce.field_p.c((byte) -113));
        if (var1 == null) {
          var1 = new ajb();
        }
        if (param0 != 3) {
          vbb.e(15);
        }
        var1.a(dma.field_j, dma.field_i, dma.field_c, (byte) -88, dma.field_a, dma.field_f, dma.field_g, dma.field_d);
        bc.field_b.b(-10258, var1);
    }

    static {
        field_p = true;
        field_o = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
