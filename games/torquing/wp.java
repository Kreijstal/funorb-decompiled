/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends am {
    private int field_s;
    static int field_w;
    private int field_z;
    private int field_x;
    private int[] field_u;
    static t[] field_v;
    private int[] field_t;
    static int field_y;

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            return;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_x = param0.i((byte) -101);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_z = param0.i((byte) -101);
              }
            } else {
              this.field_s = param0.i(param1 ^ 7059);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wp.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static da b(int param0) {
        if (param0 >= -51) {
          return (da) null;
        }
        return new da(of.d((byte) -77), sd.b(2));
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, t[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          if (param5 != null &&
            0 < param2) {
            var6_int = param5[0].field_w;
            var7 = param5[2].field_w;
            var8 = param5[1].field_w;
            param5[0].c(param4, param0, param1);
            param5[2].c(param2 + param4 - var7, param0, param1);
            ph.b(lj.field_c);
            ph.f(var6_int + param4, param0, -var7 + param4 + param2, param0 + param5[1].field_u);
            var9 = var6_int + param4;
            var10 = -var7 + (param4 + param2);
            param4 = var9;
            if (param3) {
              field_v = (t[]) null;
            }
            while (var10 > param4) {
              param5[1].c(param4, param0, param1);
              param4 = param4 + var8;
            }
            ph.a(lj.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("wp.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        this.field_u = new int[1 + this.field_x];
        int var2 = 0;
        this.field_t = new int[this.field_x + 1];
        int var3 = 4096 / this.field_x;
        int var4 = this.field_s * var3 >> 12;
        for (var5 = 0; this.field_x > var5; var5++) {
          this.field_t[var5] = var2;
          this.field_u[var5] = var2 + var4;
          var2 = var2 + var3;
        }
        this.field_t[this.field_x] = 4096;
        this.field_u[this.field_x] = 4096 + this.field_u[0];
        if (param0 != 39) {
          this.a((byte) 98);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        var10 = Torquing.field_u;
        var13 = this.field_l.a(param1, 25657);
        var12 = var13;
        var3 = var12;
        if (param0 < 86) {
          this.field_z = -102;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_l.field_b) {
          var4 = dp.field_a[param1];
          if (this.field_z == 0) {
            var5 = 0;
            var6 = 0;
            L3: while (true) {
              if (var6 < this.field_x) {
                if (var4 >= this.field_t[var6] &&
                  this.field_t[var6 + 1] > var4) {
                  if (var4 < this.field_u[var6]) {
                    var5 = 4096;
                    break L3;
                  }
                  dk.a(var13, 0, ci.field_c, var5);
                  return var3;
                }
                var6++;
                continue;
              }
              break;
            }
            dk.a(var13, 0, ci.field_c, var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var5Lifetime1 = 0;
            while (!(ci.field_c <= var5Lifetime1)) {
              var6Lifetime1 = 0;
              var7 = 0;
              var8 = q.field_b[var5Lifetime1];
              var9 = this.field_z;
              if (var9 == 1) {
                var6Lifetime1 = var8;
              } else {
                if (var9 != 2) {
                  if (var9 == 3) {
                    var6Lifetime1 = (var8 - var4 >> 1) + 2048;
                  }
                } else {
                  var6Lifetime1 = (var4 - 4096 + var8 >> 1) + 2048;
                }
              }
              var11 = 0;
              var9Lifetime1 = var11;
              L8: while (true) {
                if (var11 < this.field_x) {
                  if (this.field_t[var11] <= var6Lifetime1 &&
                    var6Lifetime1 < this.field_t[var11 + 1]) {
                    if (var6Lifetime1 >= this.field_u[var11]) {
                      break L8;
                    }
                    var7 = 4096;
                    break L8;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var13 = var12;
              var13[var5Lifetime1] = var7;
              var5Lifetime1++;
            }
          }
        }
        return var3;
    }

    final void a(byte param0) {
        if (param0 <= 123) {
          this.field_s = 91;
        }
        this.g((byte) 39);
    }

    public wp() {
        super(0, true);
        this.field_z = 0;
        this.field_s = 2048;
        this.field_x = 10;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
          wp.b(110);
        }
    }

    static {
    }
}
