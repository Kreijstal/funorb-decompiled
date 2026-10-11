/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd extends hl {
    static String field_H;
    private int field_N;
    private int field_M;
    private int field_L;
    static String field_J;
    static String field_I;
    private int field_Q;
    static boolean field_R;
    private int field_K;
    static String[] field_O;
    private int field_P;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_N <= 0) {
        } else {
          var2 = this.field_M;
          var3 = this.field_L;
          fieldTemp$0 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (this.field_N > fieldTemp$0) {
            var4 = (this.field_N * 2 - this.field_Q) * this.field_Q;
            var5 = this.field_N * this.field_N;
            var2 = this.field_P + var4 * (-this.field_P + this.field_M) / var5;
            var3 = var4 * (this.field_L - this.field_K) / var5 + this.field_K;
          } else {
            this.field_N = 0;
            this.a((byte) -48);
          }
          this.a(var2, (byte) -78, var3);
        }
        if (param0 >= -18) {
          return false;
        }
        return super.j(-87);
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param2);
          if (param3 != 1) {
            stackIn_3_0 = (StringBuilder) null;
            return stackIn_3_0;
          }
          for (var5 = var4_int; param2 > var5; var5++) {
            param0.setCharAt(var5, param1);
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wd.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean k(int param0) {
        this.o(param0);
        return super.k(0);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (0 >= param1) {
          this.a(param0, (byte) -75, param3);
          return;
        }
        this.field_P = this.field_x;
        this.field_L = param3;
        this.field_Q = 0;
        this.field_K = this.field_u;
        if (param2) {
          return;
        }
        this.field_M = param0;
        this.field_N = param1;
    }

    final static k q(int param0) {
        if (param0 != 11782) {
          field_O = (String[]) null;
        }
        return qc.field_e;
    }

    public static void p(int param0) {
        field_J = null;
        field_I = null;
        if (param0 != 35) {
          return;
        }
        field_H = null;
        field_O = null;
    }

    void o(int param0) {
        if (0 >= this.field_N) {
          return;
        }
        this.a(this.field_M, (byte) -88, this.field_L);
        this.field_N = param0;
        this.a((byte) -48);
    }

    wd(vl param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_N = 0;
        this.field_Q = 0;
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = TrackController.field_F ? 1 : 0;
        ll.b(6 + param0, param2 + 35, this.field_x - 12, -40 + this.field_u, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var7 < var4) {
          if (ll.field_b <= var8 &&
            ll.field_g > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_x;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (-var10 + 20) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  ll.field_i[param0 + (var8 * ll.field_d + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    ll.field_i[param0 + var8 * ll.field_d + var11] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            ll.a(param0 + var10, var8, var11 - var10, var9);
          }
          var7++;
          var8++;
        }
        var4Lifetime1 = 22;
        if (param1 != 20) {
          field_I = (String) null;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          ll.a(param0, var8Lifetime1, 6, var9Lifetime1);
          ll.a(-6 + param0 + this.field_x, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ol.field_n.e(param0 + this.field_x - 90, param2 + 10);
        hc.a(param0 + 5, param2 + 35, this.field_x - 10, wj.field_a, -22081);
        hc.a(param0, param2 + (this.field_u - 22), this.field_x, kf.field_d, param1 ^ -22101);
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_u;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param2;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          ll.a(param0, var8Lifetime2, 6, var9Lifetime2);
          ll.a(param0 - (-this.field_x + 6), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    void a(byte param0) {
        if (param0 != -48) {
          this.field_M = -89;
        }
    }

    static {
        field_H = "Email address is unavailable";
        field_I = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_O = new String[]{"Showing by rating", "Showing by win percentage"};
        field_J = "Names cannot start or end with space or underscore";
    }
}
