/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends wm {
    static int field_p;
    static int[][] field_s;
    static int field_u;
    static String field_r;
    static String field_q;
    static ck field_t;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param0, (byte) -40) == vm.field_u) {
            stackIn_3_0 = um.field_b;
            return stackIn_3_0;
          }
          if (param1 == -11) {
            return null;
          }
          field_u = 2;
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kd.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final tb b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        tb stackIn_2_0 = null;
        tb stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!be.a((byte) 98, var4)) {
            stackIn_2_0 = vm.field_u;
            return stackIn_2_0;
          }
          if (param1 != -40) {
            field_t = (ck) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = cb.a((byte) -106, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return dc.field_b;
          }
          stackIn_9_0 = vm.field_u;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kd.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        var14 = client.field_A ? 1 : 0;
        try {
          var5_int = param1 + param0;
          var6 = param4 + param3;
          if (param1 > hk.field_c) {
            stackIn_4_0 = param1;
          } else {
            stackIn_4_0 = hk.field_c;
          }
          var7 = stackIn_4_0;
          var9 = -83 / ((param2 - 29) / 53);
          if (hk.field_h >= param3) {
            stackIn_7_0 = hk.field_h;
          } else {
            stackIn_7_0 = param3;
          }
          var8 = stackIn_7_0;
          if (hk.field_g <= var5_int) {
            stackIn_10_0 = hk.field_g;
          } else {
            stackIn_10_0 = var5_int;
          }
          var10 = stackIn_10_0;
          if (var6 < hk.field_b) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = hk.field_b;
          }
          var11 = stackIn_13_0;
          if (param1 >= hk.field_c &&
            hk.field_g > param1) {
            var12 = param1 + var8 * hk.field_j;
            var13 = -var8 + var11 + 1 >> 1;
            while (true) {
              var13--;
              if (var13 < 0) {
                break;
              }
              hk.field_l[var12] = 16777215;
              var12 = var12 + hk.field_j * 2;
            }
          }
          if (param3 >= hk.field_h &&
            hk.field_b > var6) {
            var12Lifetime1 = hk.field_j * param3 + var7;
            var13Lifetime1 = -var7 + var10 + 1 >> 1;
            while (true) {
              var13Lifetime1--;
              if (var13Lifetime1 < 0) {
                break;
              }
              hk.field_l[var12Lifetime1] = 16777215;
              var12Lifetime1 += 2;
            }
          }
          if (var5_int >= hk.field_c &&
            var5_int < hk.field_g) {
            var12Lifetime2 = (var8 + (var5_int - param1 & 1)) * hk.field_j + var5_int;
            var13Lifetime2 = -var8 + 1 + var11 >> 1;
            while (true) {
              var13Lifetime2--;
              if (var13Lifetime2 < 0) {
                break;
              }
              hk.field_l[var12Lifetime2] = 16777215;
              var12Lifetime2 = var12Lifetime2 + 2 * hk.field_j;
            }
          }
          if (hk.field_h <= param3) {
            if (hk.field_b <= var6) {
              return;
            }
            var12Lifetime3 = (-param3 + var6 & 1) + var6 * hk.field_j + var7;
            var13Lifetime3 = 1 + var10 - var7 >> 1;
            while (true) {
              var13Lifetime3--;
              if (0 > var13Lifetime3) {
                return;
              }
              hk.field_l[var12Lifetime3] = 16777215;
              var12Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "kd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kd(rk param0) {
        super(param0);
    }

    public static void e(int param0) {
        field_t = null;
        field_q = null;
        field_s = (int[][]) null;
        field_r = null;
        int var1 = -6 / ((80 - param0) / 42);
    }

    static {
        field_s = new int[2][8];
        field_r = "Find opponent";
        field_q = "Loading music";
        vj discarded$0 = new vj();
    }
}
