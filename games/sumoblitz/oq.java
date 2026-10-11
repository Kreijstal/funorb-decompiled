/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends pj {
    int[] field_u;
    static String field_r;
    private int[][] field_t;
    private int[] field_s;
    private String[] field_v;

    final void a(fs param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L1: while (true) {
            var3_int = param0.e(-31302);
            if (0 == var3_int) {
              if (var4 == 0) {
                break L1;
              }
            } else {
              this.a(param0, var3_int, (byte) 111);
            }
            if (var4 == 0) {
              continue;
            }
            break;
          }
          if (!param1) {
            oq.a(-64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("oq.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int var9 = 0;
        wb[] var10 = null;
        wb[] var11_ref_wb__ = null;
        int var11 = 0;
        int var12 = 0;
        wb var13_ref_wb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = Sumoblitz.field_L ? 1 : 0;
        var9 = param2 + (param3 + param4);
        var10 = new wb[]{new wb(var9, var9), new wb(param8, var9), new wb(var9, var9), new wb(var9, param8), new wb(64, 64), new wb(var9, param8), new wb(var9, var9), new wb(param8, var9), new wb(var9, var9)};
        var11_ref_wb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_wb__.length > var12) {
            var13_ref_wb = var11_ref_wb__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var13_ref_wb.field_C.length > var14) {
              var13_ref_wb.field_C[var14] = param0;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          if (var11 < param3) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_C[var12Lifetime1 + (-1 + (var9 - var11)) * var9] = param7;
              var10[8].field_C[var12Lifetime1 + var9 * (-1 + (var9 - var11))] = param7;
              var10[2].field_C[-1 + var9 - var11 + var12Lifetime1 * var9] = param7;
              var10[8].field_C[-var11 + (var9 - 1) + var12Lifetime1 * var9] = param7;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = param3;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_35_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_35_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_C[var12Lifetime2 + var11Lifetime1 * var9] = param5;
                var10[0].field_C[var11Lifetime1 + var12Lifetime2 * var9] = param5;
                stackIn_24_0 = ~(var9 - var11Lifetime1);
                stackIn_24_1 = ~var12Lifetime2;
                if (stackIn_24_0 < stackIn_24_1) {
                  var10[2].field_C[var12Lifetime2 + var9 * var11Lifetime1] = param5;
                  var10[6].field_C[var11Lifetime1 + var9 * var12Lifetime2] = param5;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            var11Lifetime1 = -16 / ((30 - param6) / 43);
            stackIn_35_0 = 0;
          }
          var12Lifetime2Lifetime1 = stackIn_35_0;
          L19: while (true) {
            if (var12Lifetime2Lifetime1 < param8) {
              stackIn_46_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var13 = stackIn_46_0;
              while (param3 > var13) {
                var10[7].field_C[var12Lifetime2Lifetime1 + param8 * (-1 + (-var13 + var9))] = param7;
                var10[5].field_C[var9 - 1 - var13 + var9 * var12Lifetime2Lifetime1] = param7;
                var10[1].field_C[var12Lifetime2Lifetime1 + var13 * param8] = param5;
                var10[3].field_C[var13 + var12Lifetime2Lifetime1 * var9] = param5;
                var13++;
              }
              var12Lifetime2Lifetime1++;
              continue L19;
            }
            stackIn_46_0 = 0;
            break;
          }
          var12Lifetime2Lifetime2 = stackIn_46_0;
          L25: while (var12Lifetime2Lifetime2 < param8 >> 1) {
            var13Lifetime1 = 0;
            while (true) {
              if (var13Lifetime1 < param4) {
                var10[1].field_C[var12Lifetime2Lifetime2 + (-1 - var13Lifetime1 + var9) * param8] = param1;
                var10[3].field_C[var9 * var12Lifetime2Lifetime2 - (var13Lifetime1 + 1) + var9] = param1;
                var10[7].field_C[var12Lifetime2Lifetime2 + param8 * var13Lifetime1] = param1;
                var10[5].field_C[var9 * var12Lifetime2Lifetime2 + var13Lifetime1] = param1;
                var13Lifetime1++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var12Lifetime2Lifetime2++;
              }
              break;
            }
            if (var15 == 0) {
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    final String f(int param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var6 = null;
        StringBuilder stackIn_9_0 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var6 = new StringBuilder(80);
        var6 = var6;
        if (this.field_v == null) {
          return "";
        }
        discarded$3 = var6.append(this.field_v[0]);
        var3 = 1;
        if (param0 != 1118) {
          this.f(26);
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_v.length <= var3))) {
          discarded$4 = var6.append("...");
          stackIn_9_0 = var6.append(this.field_v[var3]);
          if (var4 == 0) {
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_9_0 = var6;
        }
        return ((StringBuilder) (Object) stackIn_9_0).toString();
    }

    public static void g(int param0) {
        if (param0 != -6811) {
          oq.a(112, -53, -51, -110, 1, 98, (byte) -59, -49, -95);
        }
        field_r = null;
    }

    private final void a(fs param0, int param1, byte param2) {
        int[] array$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ts var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var4_intLifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 < 41) {
            this.field_v = (String[]) null;
          }
          if (1 == param1) {
            this.field_v = cn.a('<', param0.d(-1), -27224);
            if (var9 == 0) {
              return;
            }
          }
          if (param1 == 2) {
            var4_int = param0.e(-31302);
            this.field_u = new int[var4_int];
            var5 = 0;
            while (true) {
              if (var5 >= var4_int) {
                return;
              }
              this.field_u[var5] = param0.a(255);
              var5++;
              if (var9 != 0) {
                return;
              }
            }
          }
          if (param1 == 3) {
            var4_intLifetime1 = param0.e(-31302);
            this.field_s = new int[var4_intLifetime1];
            this.field_t = new int[var4_intLifetime1][];
            var5Lifetime1 = 0;
            while (var4_intLifetime1 > var5Lifetime1) {
              var6 = param0.a(255);
              var7 = ij.a(10341, var6);
              if (var9 != 0) {
                return;
              }
              if (var7 != null) {
                this.field_s[var5Lifetime1] = var6;
                array$0 = new int[var7.field_f];
                this.field_t[var5Lifetime1] = array$0;
                var8 = 0;
                while (!(var8 >= var7.field_f)) {
                  this.field_t[var5Lifetime1][var8] = param0.a(255);
                  var8++;
                }
              }
              var5Lifetime1++;
            }
            if (var9 == 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("oq.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean decompiledFrameCompleted0 = true;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_u) {
          var2 = 0;
          while (var2 < this.field_u.length) {
            this.field_u[var2] = ic.a(this.field_u[var2], 32768);
            var2++;
            if (var3 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param0 > -102)) {
          this.field_s = (int[]) null;
        }

    }

    oq() {
    }

    final static void a(int param0) {
        mn.b((byte) -116);
        if (param0 != -24233) {
          oq.a(99, -71, 95, 31, -80, 103, (byte) 57, 84, 30);
        }
    }

    static {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
    }
}
