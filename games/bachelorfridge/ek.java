/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends at {
    private gj field_l;
    private int field_j;
    private int field_n;
    static String field_k;
    static String field_o;
    static String field_m;

    final static void d(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        mv.field_n = kca.field_c.a(lr.field_k[20]);
        int var1 = kca.field_c.a(lr.field_k[21]);
        if (mv.field_n >= var1) {
          mv.field_n = mv.field_n + 8;
          var2 = -65 % ((param0 - 41) / 42);
          return;
        }
        mv.field_n = var1;
        mv.field_n = mv.field_n + 8;
        var2Lifetime1 = -65 % ((param0 - 41) / 42);
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = BachelorFridge.field_y;
        try {
          var5_int = 16 % ((param3 + 74) / 52);
          while (true) {
            param0--;
            if (0 > param0) {
              return;
            }
            var6 = param1;
            var7 = param4;
            var8 = param2;
            var6[var7] = var8 + dda.a(var6[var7] >> 1, 8355711);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ek.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (!param2) {
          var3 = via.a(param0, (byte) 73);
          var4 = ft.a(param0, (byte) -128);
          var5 = via.a(param1, (byte) 84);
          var6 = ft.a(param1, (byte) -128);
          var7 = (int)((long)var3 * (long)var5 >> 16);
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        int[] var11 = (int[]) null;
        ek.a((byte) -49, (int[]) null);
        var3 = via.a(param0, (byte) 73);
        var4 = ft.a(param0, (byte) -128);
        var5 = via.a(param1, (byte) 84);
        var6 = ft.a(param1, (byte) -128);
        var7 = (int)((long)var3 * (long)var5 >> 16);
        var8 = (int)((long)var6 * (long)var3 >> 16);
        var9 = (int)((long)var4 * (long)var5 >> 16);
        var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    ek(gj param0, ad param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_j = param2;
          this.field_l = param0;
          this.field_n = 64;
          if (param1.field_s.field_y == 3) {
            this.field_j = this.field_j >> 1;
          }
          if (this.field_j > 0) {
            param1.a(16711680, 61, Integer.toString(this.field_j));
          } else {
            param1.a(65280, 28, Integer.toString(-this.field_j));
          }
          if (param1.field_s.field_I > 0) {
            return;
          }
          this.a(27799, new fl(this.field_l, param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ek.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var2 = 102 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_n - 1;
        this.field_n = this.field_n - 1;
        if (fieldTemp$0 <= 0) {
          return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != 8) {
          ek.d(-98);
          field_o = null;
          field_m = null;
          return;
        }
        field_o = null;
        field_m = null;
    }

    final static kv[] a(byte param0, int[] param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv[] var3 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new kv[14];
          var2 = var3;
          var3[1] = wo.field_k[1][param1[1]];
          var3[0] = wo.field_k[0][param1[0]];
          var3[2] = wo.field_k[2][param1[2]];
          var3[3] = wo.field_k[3][param1[3]];
          var3[5] = wo.field_k[5][param1[5]];
          var3[8] = wo.field_k[8][param1[8]];
          var3[4] = wo.field_k[4][param1[4]];
          var3[9] = wo.field_k[9][param1[9]];
          var3[10] = wo.field_k[10][param1[10]];
          var3[7] = wo.field_k[7][param1[7]];
          var3[6] = wo.field_k[6][param1[6]];
          if (param0 != -25) {
            field_m = (String) null;
          }
          var3[11] = wo.field_k[11][param1[8]];
          var3[12] = wo.field_k[12][param1[9]];
          var3[13] = wo.field_k[13][param1[10]];
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ek.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_k = "Welcome to the Arena! This is where your creatures fight in brutal combat. Normally you would have arrived here through the multiplayer lobby. <br><col=BBFF00> Next</col>";
        field_o = "<%0> has withdrawn the request to join.";
        field_m = "Connecting to<br>friend server...";
    }
}
