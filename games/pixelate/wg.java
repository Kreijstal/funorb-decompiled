/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static sb field_d;
    static int[] field_c;
    int[] field_f;
    static int field_e;
    static tf[] field_g;
    static boolean field_a;
    static int field_b;

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param1 != 15598) {
          return 95;
        }
        if (0 < param0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (255 < param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            param0 = param0 >> 2;
            var2 += 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nm.a(param0, 24)) {
            return false;
          }
          if (cm.a(param0, param2 ^ -98)) {
            return false;
          }
          if (param2 != -4) {
            var4 = (byte[]) null;
            wg.a((byte[]) null, 103, 27);
          }
          if (ep.a((byte) 34, param0)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (kb.a(param0, param1, (byte) -123)) {
            return false;
          }
          if (pc.a(param0, (byte) -47, param1)) {
            return false;
          }
          if (!gb.a(param0, param1, 95)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("wg.E(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final ae a(ae param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ae stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_h >> 2;
          var4 = param0.field_g >> 2;
          if (param1 < 35) {
            wg.b(-124, 49);
          }
          var5 = param0.field_i >> 2;
          stackIn_3_0 = new ae(this.field_f[0] * var3_int - (-(var4 * this.field_f[1]) - var5 * this.field_f[2]) >> 14, var3_int * this.field_f[3] + (this.field_f[4] * var4 + var5 * this.field_f[5]) >> 14, var5 * this.field_f[8] + this.field_f[7] * var4 + this.field_f[6] * var3_int >> 14);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wg.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 124) {
            stackIn_4_0 = da.a(param0, (byte) 110, 0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -91;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wg.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 == -5057) {
          return !an.field_e.d(125) ? true : false;
        }
        wg.a(26, 126);
        return !an.field_e.d(125) ? true : false;
    }

    final static mc b(int param0, int param1) {
        mc var2 = new mc();
        if (param0 == 255) {
          tj.field_z.a(22125, var2);
          ro.a(127, param1);
          return var2;
        }
        wg.a((byte) 74);
        tj.field_z.a(22125, var2);
        ro.a(127, param1);
        return var2;
    }

    private wg(int[] param0) {
        try {
          if (param0.length != 9) {
            throw new RuntimeException();
          }
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_f = new int[9];
        this.field_f[4] = param4;
        this.field_f[5] = param5;
        this.field_f[2] = param2;
        this.field_f[6] = param6;
        this.field_f[1] = param1;
        this.field_f[7] = param7;
        this.field_f[8] = param8;
        this.field_f[3] = param3;
        this.field_f[0] = param0;
    }

    final wg a(int param0, wg param1) {
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        long var6 = 0L;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        wg stackIn_3_0 = null;
        wg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var11 = new int[9];
          var10 = var11;
          var3 = var10;
          if (param0 != 8) {
            stackIn_3_0 = (wg) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < 3; var4++) {
            for (var5 = 0; var5 < 3; var5++) {
              var6 = 0L;
              for (var8 = 0; var8 < 3; var8++) {
                var6 = var6 + (long)param1.field_f[var8 * 3 + var5] * (long)this.field_f[var4 * 3 + var8];
              }
              var3[3 * var4 + var5] = (int)(var6 >> 16);
            }
          }
          stackIn_14_0 = new wg(var11);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 != -27) {
          field_a = true;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_c = new int[4];
    }
}
