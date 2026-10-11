/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    int field_d;
    static lh field_k;
    static String field_j;
    int[] field_h;
    int field_f;
    static int field_c;
    static pa[] field_i;
    static long field_e;
    static int field_b;
    static String field_a;
    static String field_g;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -13392) {
          co.a(24, -31, -7, 40, 82);
        }
        field_j = null;
        field_g = null;
        field_i = null;
        field_k = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_h == null) {
          return 0;
        }
        if (this.field_h.length == 0) {
          return 0;
        }
        for (var3 = 1; var3 < this.field_h.length; var3++) {
          if (param1 < this.field_h[var3] + this.field_h[var3 - 1] >> 1) {
            return -1 + var3;
          }
        }
        if (!param0) {
          this.field_d = -22;
        }
        return -1 + this.field_h.length;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        if (!param0) {
          return -8;
        }
        if (this.field_h != null &&
          0 != this.field_h.length) {
          stackIn_7_0 = this.field_h[-1 + this.field_h.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
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
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param4 <= 109) {
            co.a(23, -77, 74, -119, -5);
          }
          var5_int = param3 + param2;
          var6 = param0 + param1;
          if (param3 > vp.field_b) {
            stackIn_6_0 = param3;
          } else {
            stackIn_6_0 = vp.field_b;
          }
          var7 = stackIn_6_0;
          if (param0 <= vp.field_f) {
            stackIn_9_0 = vp.field_f;
          } else {
            stackIn_9_0 = param0;
          }
          var8 = stackIn_9_0;
          if (var5_int >= vp.field_k) {
            stackIn_12_0 = vp.field_k;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < vp.field_d) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = vp.field_d;
          }
          var10 = stackIn_15_0;
          if (vp.field_b <= param3 &&
            vp.field_k > param3) {
            var11 = param3 + vp.field_i * var8;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              vp.field_j[var11] = 16777215;
              var11 = var11 + 2 * vp.field_i;
            }
          }
          if (param0 >= vp.field_f &&
            var6 < vp.field_d) {
            var11Lifetime1 = vp.field_i * param0 + var7;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              vp.field_j[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= vp.field_b &&
            vp.field_k > var5_int) {
            var11Lifetime2 = ((1 & -param3 + var5_int) + var8) * vp.field_i + var5_int;
            var12Lifetime2 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              vp.field_j[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + vp.field_i * 2;
            }
          }
          if (vp.field_f <= param0) {
            if (vp.field_d <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * vp.field_i + (-param0 + var6 & 1));
            var12Lifetime3 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                break;
              }
              vp.field_j[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "co.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    co(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_f = param0;
        this.field_h = new int[param2 + 1];
    }

    static {
        field_j = "Waiting for graphics";
        field_k = new lh();
        field_a = "Passwords must be between 5 and 20 characters long";
        field_b = 0;
    }
}
