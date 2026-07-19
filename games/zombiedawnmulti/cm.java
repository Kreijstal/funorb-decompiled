/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static cj field_b;
    static String[] field_c;
    static boolean field_e;
    static long field_d;
    static cj field_a;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 125) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, byte[] param3, boolean param4, int param5) {
        ga var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var6 = ma.field_a;
              var6.b((byte) -35, param5);
              var6.field_j = var6.field_j + 1;
              var7 = var6.field_j;
              var6.a(-55, 4);
              var6.a(123, param2);
              var8 = param1;
              if (!param4) {
                break L1;
              } else {
                var8 += 128;
                break L1;
              }
            }
            var6.a(109, var8);
            var6.a(param3, param3.length, 0, 115);
            var6.e(33, -var7 + var6.field_j);
            if (param0 > 28) {
              break L0;
            } else {
              cm.a((byte) 67);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6_ref);
            stackOut_5_1 = new StringBuilder().append("cm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, cj param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jb var13 = null;
        ja var14 = null;
        String var15 = null;
        jb var16 = null;
        ja var17 = null;
        String var18 = null;
        jb var19 = null;
        ja var20 = null;
        String var21 = null;
        jb var22 = null;
        ja var23 = null;
        String var24 = null;
        jb var25 = null;
        ja var26 = null;
        String var27 = null;
        jb var28 = null;
        ja var29 = null;
        String var30 = null;
        jb var31 = null;
        ja var32 = null;
        String var33 = null;
        jb var34 = null;
        ja var35 = null;
        String var36 = null;
        jb var37 = null;
        ja var38 = null;
        String var39 = null;
        jb var40 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ve.a(0L, 196, (String) null, (tq) null, (String) null, param2, param1, (int[]) null, -1);
              if (-1 != (param1 ^ -1)) {
                break L1;
              } else {
                var13 = pk.field_b;
                var14 = wp.field_j[0];
                var32 = var14;
                var32 = var14;
                var15 = wj.field_k;
                var13.field_j.a(var14, 11, var15, true);
                var16 = pk.field_b;
                var17 = wp.field_j[1];
                var32 = var17;
                var32 = var17;
                var18 = tk.field_o;
                var16.field_j.a(var17, 12, var18, true);
                var19 = pk.field_b;
                var20 = wp.field_j[2];
                var32 = var20;
                var32 = var20;
                var21 = rq.field_g;
                var19.field_j.a(var20, 13, var21, true);
                break L1;
              }
            }
            L2: {
              if (-2 != (param1 ^ -1)) {
                break L2;
              } else {
                var22 = pk.field_b;
                var23 = wp.field_j[0];
                var24 = io.field_h;
                var22.field_j.a(var23, 11, var24, true);
                var25 = pk.field_b;
                var26 = wp.field_j[1];
                var27 = rq.field_r;
                var25.field_j.a(var26, 12, var27, true);
                var28 = pk.field_b;
                var29 = wp.field_j[2];
                var30 = jk.field_c;
                var28.field_j.a(var29, 13, var30, true);
                break L2;
              }
            }
            L3: {
              var3_int = -34 % ((-60 - param0) / 40);
              if (2 != param1) {
                break L3;
              } else {
                var31 = pk.field_b;
                var32 = wp.field_j[0];
                var33 = ao.field_a;
                var31.field_j.a(var32, 11, var33, true);
                var34 = pk.field_b;
                var35 = wp.field_j[1];
                var36 = ji.field_d;
                var34.field_j.a(var35, 12, var36, true);
                var37 = pk.field_b;
                var38 = wp.field_j[2];
                var39 = gg.field_n;
                var37.field_j.a(var38, 13, var39, true);
                break L3;
              }
            }
            var40 = pk.field_b;
            var5 = param2.field_w;
            var6 = param2.field_qb;
            var7 = param2.field_zb;
            var8 = param2.field_z;
            var40.field_j.b(4542, var5, var8, var6, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("cm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        byte[] var3 = null;
        param0 = (param0 >>> 23735073 & 1431655765) + (1431655765 & param0);
        if (!param1) {
          var3 = (byte[]) null;
          cm.a(103, 105, 35, (byte[]) null, true, -40);
          param0 = (param0 & 858993459) - -(param0 >>> 1135734402 & 858993459);
          param0 = (param0 >>> 1762924228) + param0 & 252645135;
          param0 = param0 + (param0 >>> 885258696);
          param0 = param0 + (param0 >>> -1228650192);
          return 255 & param0;
        } else {
          param0 = (param0 & 858993459) - -(param0 >>> 1135734402 & 858993459);
          param0 = (param0 >>> 1762924228) + param0 & 252645135;
          param0 = param0 + (param0 >>> 885258696);
          param0 = param0 + (param0 >>> -1228650192);
          return 255 & param0;
        }
    }

    static {
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
