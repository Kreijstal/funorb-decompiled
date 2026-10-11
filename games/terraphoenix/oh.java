/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    boolean field_a;
    int field_c;
    static int field_e;
    int field_d;
    static im field_b;
    static int field_f;
    int field_g;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 > -66) {
            field_f = -86;
          }
          param1 = je.a(80, "", param1, '_');
          var3 = wa.a((byte) -117, param1);
          stackIn_7_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("oh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (this.a(true) > 0) {
          this.field_c = this.a(true);
        }
        if (this.a(true) == 0) {
          this.field_c = 1000;
        }
        if (param0 != 0) {
          this.field_d = -80;
        }
    }

    final oh a(rk param0, rk param1, int param2) {
        Object stackIn_10_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk var6 = null;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        var5 = Terraphoenix.field_V;
        try {
          if (param2 != 8) {
            var6 = (rk) null;
            this.a((rk) null, (rk) null, -102);
          }
          boolean decompiledFrameRemainder2 = true;
          if (this.field_a) {
            boolean decompiledFrameRemainder1 = true;
            var4_int = 8;
            if (this.field_g == var4_int) {
              if (param0.field_a[var4_int] > 0) {
                param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                decompiledFrameRemainder1 = (var5 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (param1.field_a[var4_int] <= 0) {
                  stackIn_10_0 = null;
                  return (oh) (stackIn_10_0);
                }
                param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
              }
            }
            var4_intLifetime1 = 9;
            if (var4_intLifetime1 == this.field_g) {
              if (0 < param0.field_a[var4_intLifetime1]) {
                param0.field_a[var4_intLifetime1] = param0.field_a[var4_intLifetime1] - 1;
              } else {
                if (param1.field_a[var4_intLifetime1] <= 0) {
                  return null;
                }
                param1.field_a[var4_intLifetime1] = param1.field_a[var4_intLifetime1] - 1;
                if (var5 != 0) {
                  stackIn_19_0 = null;
                  return (oh) (stackIn_19_0);
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            var4_intLifetime2 = 12;
            if (this.field_g == var4_intLifetime2) {
              if (param0.field_a[var4_intLifetime2] > 0) {
                param0.field_a[var4_intLifetime2] = param0.field_a[var4_intLifetime2] - 1;
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (param1.field_a[var4_intLifetime2] <= 0) {
                  stackIn_27_0 = null;
                  return (oh) (stackIn_27_0);
                }
                param1.field_a[var4_intLifetime2] = param1.field_a[var4_intLifetime2] - 1;
              }
            }
            var4_intLifetime3 = 13;
            if (this.field_g == var4_intLifetime3) {
              if (param0.field_a[var4_intLifetime3] > 0) {
                param0.field_a[var4_intLifetime3] = param0.field_a[var4_intLifetime3] - 1;
              } else {
                if (param1.field_a[var4_intLifetime3] <= 0) {
                  return null;
                }
                param1.field_a[var4_intLifetime3] = param1.field_a[var4_intLifetime3] - 1;
                if (var5 != 0) {
                  stackIn_35_0 = null;
                  return (oh) (stackIn_35_0);
                }
              }
            }
            var4_intLifetime4 = 14;
            if (this.field_g == var4_intLifetime4) {
              if (0 < param0.field_a[var4_intLifetime4]) {
                param0.field_a[var4_intLifetime4] = param0.field_a[var4_intLifetime4] - 1;
                decompiledFrameRemainder2 = (var5 != 0);
              }
              if (decompiledFrameRemainder2) {
                if (param1.field_a[var4_intLifetime4] <= 0) {
                  stackIn_43_0 = null;
                  return (oh) (stackIn_43_0);
                }
                param1.field_a[var4_intLifetime4] = param1.field_a[var4_intLifetime4] - 1;
              }
            }
          }
          this.field_a = false;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_49_0 = var4;
          stackIn_49_1 = new StringBuilder().append("oh.B(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          return -114;
        }
        return od.field_c[this.field_g].field_o;
    }

    public static void b(int param0) {
        if (param0 != 6) {
          return;
        }
        field_b = null;
    }

    final static ci[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int var9 = 0;
        ci[] var10 = null;
        ci[] var11_ref_ci__ = null;
        int var11 = 0;
        int var12 = 0;
        ci var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = Terraphoenix.field_V;
        var9 = param1 + (param6 + param5);
        if (param2 != 1) {
          return (ci[]) null;
        }
        var10 = new ci[]{new ci(var9, var9), new ci(param3, var9), new ci(var9, var9), new ci(var9, param3), new ci(64, 64), new ci(var9, param3), new ci(var9, var9), new ci(param3, var9), new ci(var9, var9)};
        var11_ref_ci__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 < var11_ref_ci__.length) {
            var13 = var11_ref_ci__[var12];
            stackIn_13_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_13_0;
            while (var13.field_z.length > var14) {
              var13.field_z[var14] = param7;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_13_0 = 0;
          break;
        }
        var11 = stackIn_13_0;
        L6: while (true) {
          if (param6 > var11) {
            stackIn_24_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_24_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_z[(var9 - var11 - 1) * var9 + var12Lifetime1] = param4;
              var10[8].field_z[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param4;
              var10[2].field_z[var12Lifetime1 * var9 - 1 + (var9 - var11)] = param4;
              var10[8].field_z[var12Lifetime1 * var9 - (var11 + (1 - var9))] = param4;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_24_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_24_0;
        while (true) {
          stackIn_26_0 = param6;
          stackIn_26_1 = var11Lifetime1;
          if (stackIn_26_0 > stackIn_26_1) {
            stackIn_36_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_36_0;
              while (var12Lifetime2 < var9) {
                var10[0].field_z[var12Lifetime2 + var11Lifetime1 * var9] = param0;
                var10[0].field_z[var12Lifetime2 * var9 + var11Lifetime1] = param0;
                stackIn_26_0 = var12Lifetime2;
                stackIn_26_1 = -var11Lifetime1 + var9;
                if (stackIn_26_0 < stackIn_26_1) {
                  var10[2].field_z[var9 * var11Lifetime1 + var12Lifetime2] = param0;
                  var10[6].field_z[var9 * var12Lifetime2 + var11Lifetime1] = param0;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_36_0 = 0;
          }
          var11Lifetime1 = stackIn_36_0;
          L19: while (true) {
            if (param3 > var11Lifetime1) {
              stackIn_47_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var12Lifetime2Lifetime1 = stackIn_47_0;
              while (var12Lifetime2Lifetime1 < param6) {
                var10[7].field_z[var11Lifetime1 + param3 * (var9 + (-var12Lifetime2Lifetime1 - 1))] = param4;
                var10[5].field_z[var9 * var11Lifetime1 - var12Lifetime2Lifetime1 + var9 - 1] = param4;
                var10[1].field_z[param3 * var12Lifetime2Lifetime1 + var11Lifetime1] = param0;
                var10[3].field_z[var12Lifetime2Lifetime1 + var11Lifetime1 * var9] = param0;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L19;
            }
            stackIn_47_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_47_0;
          L25: while (var11Lifetime1 < param3 >> 1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param5 > var12Lifetime2Lifetime2) {
                var10[1].field_z[param3 * (-1 + (-var12Lifetime2Lifetime2 + var9)) + var11Lifetime1] = param8;
                var10[3].field_z[-var12Lifetime2Lifetime2 + (-1 + (var9 + var11Lifetime1 * var9))] = param8;
                var10[7].field_z[var12Lifetime2Lifetime2 * param3 + var11Lifetime1] = param8;
                var10[5].field_z[var12Lifetime2Lifetime2 + var11Lifetime1 * var9] = param8;
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
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    oh(int param0) {
        this.field_d = 8;
        this.field_g = param0;
        this.field_c = od.field_c[param0].field_o;
        if (this.field_c == -1) {
          this.field_c = 1;
        }
        this.field_a = false;
        if (0 == this.field_c) {
          this.field_c = 1000;
        }
    }

    static {
        field_e = 500;
        field_b = new im();
        field_f = 0;
    }
}
