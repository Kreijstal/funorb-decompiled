/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static he field_b;
    static String field_d;
    static String field_c;
    static vj field_a;
    static long field_f;
    static vh field_e;

    final static void a(bl param0, java.awt.Frame param1, byte param2) {
        il var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(param1, (byte) -124);
            while (var3.field_b == 0) {
              kk.a(10L, true);
            }
            if (1 != var3.field_b) {
              kk.a(100L, true);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          var3_int = -46 / ((64 - param2) / 50);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ce.D(");
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
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
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = param3 + param1;
          if (param2 != -16579) {
            return;
          }
          var6 = param0 + param4;
          if (param1 > wj.field_g) {
            stackIn_6_0 = param1;
          } else {
            stackIn_6_0 = wj.field_g;
          }
          var7 = stackIn_6_0;
          if (wj.field_e >= param4) {
            stackIn_9_0 = wj.field_e;
          } else {
            stackIn_9_0 = param4;
          }
          var8 = stackIn_9_0;
          if (wj.field_b > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = wj.field_b;
          }
          var9 = stackIn_12_0;
          if (wj.field_j > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = wj.field_j;
          }
          var10 = stackIn_15_0;
          if (wj.field_g <= param1 &&
            param1 < wj.field_b) {
            var11 = param1 + var8 * wj.field_k;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              wj.field_l[var11] = 16777215;
              var11 = var11 + 2 * wj.field_k;
            }
          }
          if (param4 >= wj.field_e &&
            wj.field_j > var6) {
            var11Lifetime1 = var7 + param4 * wj.field_k;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              wj.field_l[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (wj.field_g <= var5_int &&
            wj.field_b > var5_int) {
            var11Lifetime2 = var5_int + wj.field_k * (var8 + (var5_int - param1 & 1));
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              wj.field_l[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * wj.field_k;
            }
          }
          if (wj.field_e <= param4 &&
            wj.field_j > var6) {
            var11Lifetime3 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              wj.field_l[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var5), "ce.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= -90) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_a = (vj) null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        od var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new od(param1);
          if (param0 != 1) {
            ce.a(76, 80, 93, -121, -34);
          }
          var3 = var9.l(31760);
          var4 = var9.h(-4);
          if (var4 >= 0 && (0 == aj.field_d ||
            !(aj.field_d < var4))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.b(0, var4, param0 + 127, var12);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.h(-9);
            if (var5 >= 0 && (aj.field_d == 0 ||
              !(var5 > aj.field_d))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 != var3) {
                var7 = ei.field_i;
                synchronized (var7) {
                  ei.field_i.a(var13, var9, -1);
                }
              } else {
                gh.a(var13, var5, param1, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ce.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_c = "Email address is unavailable";
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new vh();
    }
}
