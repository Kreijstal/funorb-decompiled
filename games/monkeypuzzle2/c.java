/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    private uj field_c;
    private ca[] field_g;
    private java.math.BigInteger field_d;
    private gk field_f;
    static c field_h;
    private wl field_e;
    static String field_j;
    private java.math.BigInteger field_i;
    static int field_b;
    private ob field_a;

    final boolean a(byte param0) {
        int stackIn_22_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        gk var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_f) {
          return true;
        }
        if (null == this.field_a) {
          if (this.field_e.d(20)) {
            return false;
          }
          this.field_a = this.field_e.a(255, 255, 122, true, (byte) 0);
        }
        if (this.field_a.field_j) {
          return false;
        }
        var10 = new gk(this.field_a.e(100));
        var10.field_h = 5;
        var3 = var10.a((byte) 114);
        var10.field_h = var10.field_h + var3 * 72;
        if (param0 > -49) {
          return true;
        }
        var13 = new byte[-var10.field_h + var10.field_g.length];
        var11 = var13;
        var4 = var11;
        var10.a(var4, var13.length, -111, 0);
        if (null != this.field_d &&
          null != this.field_i) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_d, this.field_i);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
          if (var8 != 0) {
            var5 = var4;
          }
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = ie.a(-51, var10.field_g, -5 + var10.field_h - var13.length, 5);
        var7 = 0;
        while (true) {
          if (var7 >= 64) {
            this.field_f = var10;
            this.field_g = new ca[var3];
            return true;
          }
          stackIn_22_0 = ~var15[var7];
          if (var8 != 0) {
            return stackIn_22_0 != 0;
          }
          if (stackIn_22_0 != ~var5[var7 + 1]) {
            throw new RuntimeException();
          }
          var7++;
        }
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_g == null) {
          return;
        }
        var2 = 0;
        if (!param0) {
          return;
        }
        while (true) {
          if (var2 >= this.field_g.length) {
            var2 = 0;
            break;
          }
          if (var3 == 0) {
            if (null != this.field_g[var2]) {
              this.field_g[var2].b(-1);
            }
            var2++;
            continue;
          }
          break;
        }
        while (var2 < this.field_g.length) {
          if (var3 == 0) {
            if (this.field_g[var2] != null) {
              this.field_g[var2].c(16311);
            }
            var2++;
            continue;
          }
          break;
        }
        return;
    }

    final static le[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int var9 = 0;
        le[] var10 = null;
        le[] var11_ref_le__ = null;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        var9 = param3 + (param7 + param6);
        var10 = new le[]{new le(var9, var9), new le(param1, var9), new le(var9, var9), new le(var9, param1), new le(64, 64), new le(var9, param1), new le(var9, var9), new le(param1, var9), new le(var9, var9)};
        var11_ref_le__ = var10;
        if (!param8) {
          c.a(-50, -14, 118, -7, 1, -75, 1, 23, false);
        }
        var12 = 0;
        L1: while (true) {
          if (var11_ref_le__.length > var12) {
            var13 = var11_ref_le__[var12];
            stackIn_13_0 = 0;
            if (var15 != 0) {
              break L1;
            }
            var14 = stackIn_13_0;
            while (var14 < var13.field_s.length) {
              var13.field_s[var14] = param5;
              var14++;
            }
            var12++;
            continue L1;
          }
          stackIn_13_0 = 0;
          break;
        }
        var11 = stackIn_13_0;
        L7: while (true) {
          if (param7 > var11) {
            stackIn_24_0 = 0;
            if (var15 != 0) {
              break L7;
            }
            var12Lifetime1 = stackIn_24_0;
            while (var12Lifetime1 < var9) {
              var10[6].field_s[var12Lifetime1 + var9 * (-var11 + var9 - 1)] = param2;
              var10[8].field_s[var12Lifetime1 + (-var11 + var9 - 1) * var9] = param2;
              var10[2].field_s[var12Lifetime1 * var9 - var11 + (var9 - 1)] = param2;
              var10[8].field_s[var9 * var12Lifetime1 - (var11 + (1 - var9))] = param2;
              var12Lifetime1++;
            }
            var11++;
            continue L7;
          }
          stackIn_24_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_24_0;
        while (true) {
          stackIn_26_0 = var11Lifetime1;
          stackIn_26_1 = param7;
          if (stackIn_26_0 < stackIn_26_1) {
            stackIn_36_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_36_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_s[var9 * var11Lifetime1 + var12Lifetime2] = param4;
                var10[0].field_s[var9 * var12Lifetime2 + var11Lifetime1] = param4;
                stackIn_26_0 = ~var12Lifetime2;
                stackIn_26_1 = ~(-var11Lifetime1 + var9);
                if (stackIn_26_0 > stackIn_26_1) {
                  var10[2].field_s[var9 * var11Lifetime1 + var12Lifetime2] = param4;
                  var10[6].field_s[var11Lifetime1 + var9 * var12Lifetime2] = param4;
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
          L20: while (true) {
            if (param1 > var11Lifetime1) {
              stackIn_47_0 = 0;
              if (var15 != 0) {
                break L20;
              }
              var12Lifetime2Lifetime1 = stackIn_47_0;
              while (var12Lifetime2Lifetime1 < param7) {
                var10[7].field_s[param1 * (-1 + var9 - var12Lifetime2Lifetime1) + var11Lifetime1] = param2;
                var10[5].field_s[var9 * var11Lifetime1 + (var9 - 1 - var12Lifetime2Lifetime1)] = param2;
                var10[1].field_s[param1 * var12Lifetime2Lifetime1 + var11Lifetime1] = param4;
                var10[3].field_s[var11Lifetime1 * var9 + var12Lifetime2Lifetime1] = param4;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L20;
            }
            stackIn_47_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_47_0;
          L26: while (var11Lifetime1 < param1 >> 1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param6 > var12Lifetime2Lifetime2) {
                var10[1].field_s[param1 * (var9 - var12Lifetime2Lifetime2 - 1) + var11Lifetime1] = param0;
                var10[3].field_s[var9 * var11Lifetime1 - var12Lifetime2Lifetime2 - (1 - var9)] = param0;
                var10[7].field_s[var11Lifetime1 + var12Lifetime2Lifetime2 * param1] = param0;
                var10[5].field_s[var9 * var11Lifetime1 + var12Lifetime2Lifetime2] = param0;
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
              continue L26;
            }
            break;
          }
          return var10;
        }
    }

    c(wl param0, uj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
          c.a(true);
        }
        field_h = null;
    }

    final ca a(int param0, gf param1, int param2, gf param3, boolean param4) {
        ca stackIn_9_0 = null;
        ca stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ca var9 = null;
        gf var10 = null;
        byte[] var14 = null;
        try {
          if (null == this.field_f) {
            throw new RuntimeException();
          }
          if (0 <= param2 &&
            this.field_g.length > param2) {
            if (this.field_g[param2] != null) {
              stackIn_9_0 = this.field_g[param2];
              return stackIn_9_0;
            }
            this.field_f.field_h = param2 * 72 + 6;
            var6_int = this.field_f.e(126);
            var7 = this.field_f.e(-61);
            if (param0 != -24559) {
              var10 = (gf) null;
              this.a(-126, (gf) null, 30, (gf) null, false);
            }
            var14 = new byte[64];
            this.field_f.a(var14, 64, -86, 0);
            var9 = new ca(param2, param3, param1, this.field_e, this.field_c, var6_int, var14, var7, param4);
            this.field_g[param2] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("c.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    private c(wl param0, uj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_e = param0;
          this.field_i = param3;
          this.field_d = param2;
          this.field_c = param1;
          if (!this.field_e.d(20)) {
            this.field_a = this.field_e.a(255, 255, 105, true, (byte) 0);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Creating your account";
    }
}
