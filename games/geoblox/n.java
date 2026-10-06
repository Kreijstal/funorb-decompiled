/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends q {
    private dj field_i;
    static vd[] field_k;
    static tf field_l;
    static int field_j;

    n(dj param0, dj param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 0) {
            n.c((byte) 89);
        }
    }

    final static dm[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_56_0 = 0;
        int var9 = 0;
        dm[] var10 = null;
        dm[] var11_ref_dm__ = null;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Geoblox.field_C;
        var9 = param1 + param7 + param8;
        var10 = new dm[]{new dm(var9, var9), new dm(param3, var9), new dm(var9, var9), new dm(var9, param3), new dm(64, 64), new dm(var9, param3), new dm(var9, var9), new dm(param3, var9), new dm(var9, var9)};
        var11_ref_dm__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            if (var12 < var11_ref_dm__.length) {
              var13 = var11_ref_dm__[var12];
              stackIn_11_0 = 0;
              if (var15 != 0) {
                break L1;
              }
              var14 = stackIn_11_0;
              while (var13.field_v.length > var14) {
                var13.field_v[var14] = param5;
                var14++;
              }
              var12++;
              continue L0;
            }
            stackIn_11_0 = 0;
          }
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          L7: {
            if (var11 < param8) {
              stackIn_22_0 = 0;
              if (var15 != 0) {
                break L7;
              }
              var12 = stackIn_22_0;
              while (var9 > var12) {
                var10[6].field_v[var12 + (var9 - var11 - 1) * var9] = param6;
                var10[8].field_v[var12 + (-1 - var11 + var9) * var9] = param6;
                var10[2].field_v[var12 * var9 - var11 + var9 - 1] = param6;
                var10[8].field_v[-var11 - 1 - (-var9 - var9 * var12)] = param6;
                var12++;
              }
              var11++;
              continue L6;
            }
            stackIn_22_0 = 0;
          }
          break;
        }
        var11 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = var11;
          stackIn_24_1 = param8;
          if (stackIn_24_0 < stackIn_24_1) {
            stackIn_34_0 = 0;
            if (var15 == 0) {
              var12 = stackIn_34_0;
              while (var9 > var12) {
                var10[0].field_v[var12 + var11 * var9] = param2;
                var10[0].field_v[var11 + var12 * var9] = param2;
                stackIn_24_0 = ~(-var11 + var9);
                stackIn_24_1 = ~var12;
                if (stackIn_24_0 < stackIn_24_1) {
                  var10[2].field_v[var9 * var11 + var12] = param2;
                  var10[6].field_v[var11 + var12 * var9] = param2;
                }
                var12++;
              }
              var11++;
              continue;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var11 = stackIn_34_0;
          L19: while (true) {
            L20: {
              if (var11 < param3) {
                stackIn_45_0 = 0;
                if (var15 != 0) {
                  break L20;
                }
                var12 = stackIn_45_0;
                while (param8 > var12) {
                  var10[7].field_v[param3 * (var9 - var12 - 1) + var11] = param6;
                  var10[5].field_v[-1 + (var9 - var12 + var11 * var9)] = param6;
                  var10[1].field_v[param3 * var12 + var11] = param2;
                  var10[3].field_v[var12 + var9 * var11] = param2;
                  var12++;
                }
                var11++;
                continue L19;
              }
              stackIn_45_0 = 0;
            }
            break;
          }
          var11 = stackIn_45_0;
          L25: while (true) {
            L26: {
              if (var11 < param3 >> 1) {
                stackIn_56_0 = 0;
                if (var15 != 0) {
                  break L26;
                }
                var12 = stackIn_56_0;
                while (param1 > var12) {
                  var10[1].field_v[param3 * (-1 + (-var12 + var9)) + var11] = param0;
                  var10[3].field_v[-1 + var9 + (-var12 + var9 * var11)] = param0;
                  var10[7].field_v[var11 + param3 * var12] = param0;
                  var10[5].field_v[var9 * var11 + var12] = param0;
                  var12++;
                }
                var11++;
                continue L25;
              }
              stackIn_56_0 = param4;
            }
            break;
          }
          if (stackIn_56_0 != 1) {
            n.g(5);
          }
          return var10;
        }
    }

    final static void c(byte param0) {
        if (Geoblox.field_y != null) {
            Geoblox.field_y.h((byte) -104);
        }
        vk.field_d = new hi();
        int var1 = 32 / ((param0 - 43) / 47);
        hk.field_C.b(vk.field_d, -106);
    }

    final lh a(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -257) {
            stackIn_2_0 = (lh) null;
            return stackIn_2_0;
          }
          if (this.field_i instanceof nl) {
            var3 = ((nl) ((Object) this.field_i)).a((byte) -106);
            if (var3 != null &&
                var3.a((byte) -105) != kk.field_w) {
              stackIn_9_0 = si.field_m;
              return stackIn_9_0;
            }
          }
          if (!param1.equals(this.field_i.field_s)) {
            stackIn_13_0 = si.field_m;
          } else {
            stackIn_13_0 = kk.field_w;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("n.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String b(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 422) {
            field_l = (tf) null;
          }
          if (this.field_i instanceof nl) {
            var3 = ((nl) ((Object) this.field_i)).a((byte) -118);
            if (var3 != null) {
              if (var3.a((byte) -105) == kk.field_w &&
                  !param1.equals(this.field_i.field_s)) {
                stackIn_8_0 = sj.field_b;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.c(-21666);
              return stackIn_10_0;
            }
          }
          if (param1.equals(this.field_i.field_s)) {
            return null;
          }
          stackIn_14_0 = sj.field_b;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("n.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static sl d(byte param0) {
        if (uf.field_l == kd.field_b) {
            throw new IllegalStateException();
        }
        int var1 = 28 % ((-79 - param0) / 44);
        if (va.field_e == kd.field_b) {
            kd.field_b = uf.field_l;
            return dl.field_a;
        }
        return null;
    }

    static {
        field_l = new tf();
    }
}
