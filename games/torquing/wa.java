/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ih {
    static double field_e;
    static String field_c;
    static boolean field_f;
    static IsaacPacketBuffer field_d;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 > -40) {
          wa.a((byte) 71, -60, -21, -91, 93, 31, -101, 24, -104);
        }
    }

    final static cp a(boolean param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        cp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (PacketBuffer) null;
            wa.a(true, (PacketBuffer) null);
          }
          stackIn_3_0 = new cp(param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.e((byte) 62), param1.i((byte) -101));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        PacketBuffer var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var5_intLifetime1;
        var6 = Torquing.field_u;
        try {
          if (!param2) {
            var7 = (PacketBuffer) null;
            wa.a(false, (PacketBuffer) null);
          }
          if (param3 < param4) {
            var5_int = param3;
            while (var5_int < param4) {
              qd.field_a[var5_int][param1] = param0;
              var5_int++;
              if (var6 != 0) {
                return;
              }
            }
            if (var6 == 0) {
              return;
            }
          }
          var5_intLifetime1 = param4;
          while (param3 > var5_intLifetime1) {
            qd.field_a[var5_intLifetime1][param1] = param0;
            var5_intLifetime1++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.wrapThrowable((Throwable) ((Object) var5), "wa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_12_0 = false;
        if (param1 != 34) {
          return false;
        }
        stackIn_12_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(65 > param0) &&
          !(90 < param0)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_12_0;
    }

    final static Sprite[] a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int var9 = 0;
        Sprite[] var10 = null;
        Sprite[] var11_ref_t__ = null;
        int var11 = 0;
        int var12 = 0;
        Sprite var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = Torquing.field_u;
        var9 = param2 - (-param3 - param1);
        var10 = new Sprite[]{new Sprite(var9, var9), new Sprite(param5, var9), new Sprite(var9, var9), new Sprite(var9, param5), new Sprite(64, 64), new Sprite(var9, param5), new Sprite(var9, var9), new Sprite(param5, var9), new Sprite(var9, var9)};
        var11_ref_t__ = var10;
        var12 = 0;
        scanLoop1: while (true) {
          if (var11_ref_t__.length > var12) {
            var13 = var11_ref_t__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break scanLoop1;
            }
            var14 = stackIn_11_0;
            while (var13.field_y.length > var14) {
              var13.field_y[var14] = param7;
              var14++;
            }
            var12++;
            continue scanLoop1;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        scanLoop2: while (true) {
          if (param2 > var11) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break scanLoop2;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var12Lifetime1 < var9) {
              var10[6].field_y[var9 * (-1 + var9 - var11) + var12Lifetime1] = param4;
              var10[8].field_y[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param4;
              var10[2].field_y[-var11 - (1 + (-var9 - var12Lifetime1 * var9))] = param4;
              var10[8].field_y[-var11 - 1 + var9 + var12Lifetime1 * var9] = param4;
              var12Lifetime1++;
            }
            var11++;
            continue scanLoop2;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = param2;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_34_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_34_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_y[var12Lifetime2 + var11Lifetime1 * var9] = param6;
                var10[0].field_y[var12Lifetime2 * var9 + var11Lifetime1] = param6;
                stackIn_24_0 = var9 - var11Lifetime1;
                stackIn_24_1 = var12Lifetime2;
                if (stackIn_24_0 > stackIn_24_1) {
                  var10[2].field_y[var11Lifetime1 * var9 + var12Lifetime2] = param6;
                  var10[6].field_y[var11Lifetime1 + var12Lifetime2 * var9] = param6;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var11Lifetime1 = stackIn_34_0;
          scanLoop3: while (true) {
            if (param5 > var11Lifetime1) {
              stackIn_45_0 = 0;
              if (var15 != 0) {
                break scanLoop3;
              }
              var12Lifetime2Lifetime1 = stackIn_45_0;
              while (var12Lifetime2Lifetime1 < param2) {
                var10[7].field_y[var11Lifetime1 + (-var12Lifetime2Lifetime1 + (var9 - 1)) * param5] = param4;
                var10[5].field_y[var9 * var11Lifetime1 + (-1 + var9) - var12Lifetime2Lifetime1] = param4;
                var10[1].field_y[var11Lifetime1 + param5 * var12Lifetime2Lifetime1] = param6;
                var10[3].field_y[var12Lifetime2Lifetime1 + var9 * var11Lifetime1] = param6;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue scanLoop3;
            }
            var11Lifetime1 = 0;
            stackIn_45_0 = param0;
            break;
          }
          if (stackIn_45_0 != -63) {
            return (Sprite[]) null;
          }
          scanLoop4: while (param5 >> 1 > var11Lifetime1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param1 > var12Lifetime2Lifetime2) {
                var10[1].field_y[var11Lifetime1 + param5 * (-var12Lifetime2Lifetime2 + var9 - 1)] = param8;
                var10[3].field_y[var9 * var11Lifetime1 + var9 - 1 - var12Lifetime2Lifetime2] = param8;
                var10[7].field_y[var12Lifetime2Lifetime2 * param5 + var11Lifetime1] = param8;
                var10[5].field_y[var9 * var11Lifetime1 + var12Lifetime2Lifetime2] = param8;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue scanLoop4;
            }
            break;
          }
          return var10;
        }
    }

    static {
        field_e = Math.atan2(1.0, 0.0);
        field_c = "WORLD:";
        field_f = false;
    }
}
