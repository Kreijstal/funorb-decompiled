/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends am {
    static char[] field_t;
    static ei field_s;
    private int field_v;
    private int field_x;
    private int field_u;
    static t field_w;
    static double field_y;

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_s = null;
        field_t = null;
        field_w = null;
    }

    final static void a(boolean param0, int param1) {
        on.field_c = param1;
        if (!param0) {
          return;
        }
        bd.a(true, 46);
    }

    public bd() {
        super(0, true);
        this.field_v = 204;
        this.field_x = 1;
        this.field_u = 1;
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
        fj var12;
        int[] var13;
        int[] var14;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Torquing.field_u;
        var14 = this.field_l.a(param1, 25657);
        var13 = var14;
        var3 = var13;
        if (param0 > 86) {
          if (!this.field_l.field_b) {
            return var3;
          }
          for (var4 = 0; ci.field_c > var4; var4++) {
            L1: {
              L2: {
                var5 = q.field_b[var4];
                var6 = dp.field_a[param1];
                var7 = this.field_u * var5 >> 12;
                var8 = this.field_x * var6 >> 12;
                var9 = this.field_u * (var5 % (4096 / this.field_u));
                var10 = this.field_x * (var6 % (4096 / this.field_x));
                if (this.field_v > var10) {
                  for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                  }
                  while (3 < var7) {
                    var7 -= 4;
                  }
                  if (var7 != 1) {
                    break L2;
                  }
                  if (this.field_v > var9) {
                    break L2;
                  }
                }
                if (var9 < this.field_v) {
                  for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                  }
                  while (var7 > 3) {
                    var7 -= 4;
                  }
                  if (var7 > 0) {
                    break L2;
                  }
                }
                var14[var4] = 4096;
                break L1;
              }
              var14[var4] = 0;
            }
          }
          return var3;
        }
        var12 = (fj) null;
        this.a((fj) null, -77, 90);
        if (!this.field_l.field_b) {
          return var3;
        }
        for (var4Lifetime1 = 0; ci.field_c > var4Lifetime1; var4Lifetime1++) {
          L10: {
            L11: {
              var5Lifetime1 = q.field_b[var4Lifetime1];
              var6Lifetime1 = dp.field_a[param1];
              var7Lifetime1 = this.field_u * var5Lifetime1 >> 12;
              var8Lifetime1 = this.field_x * var6Lifetime1 >> 12;
              var9Lifetime1 = this.field_u * (var5Lifetime1 % (4096 / this.field_u));
              var10Lifetime1 = this.field_x * (var6Lifetime1 % (4096 / this.field_x));
              if (this.field_v > var10Lifetime1) {
                for (var7Lifetime1 = var7Lifetime1 - var8Lifetime1; var7Lifetime1 < 0; var7Lifetime1 += 4) {
                }
                while (3 < var7Lifetime1) {
                  var7Lifetime1 -= 4;
                }
                if (var7Lifetime1 != 1) {
                  break L11;
                }
                if (this.field_v > var9Lifetime1) {
                  break L11;
                }
              }
              if (var9Lifetime1 >= this.field_v) {
                var14[var4Lifetime1] = 4096;
                break L10;
              }
              for (var7Lifetime1 = var7Lifetime1 - var8Lifetime1; var7Lifetime1 < 0; var7Lifetime1 += 4) {
              }
              while (var7Lifetime1 > 3) {
                var7Lifetime1 -= 4;
              }
              if (var7Lifetime1 <= 0) {
                var14[var4Lifetime1] = 4096;
                break L10;
              }
            }
            var14[var4Lifetime1] = 0;
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            bd.a(true);
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_v = param0.i(param1 + 7053);
              }
            } else {
              this.field_x = param0.i((byte) -101);
            }
          } else {
            this.field_u = param0.i((byte) -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bd.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(int param0) {
        qd.field_d = param0;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (of.field_m <= 20) {
          ea.b(-19, 0);
          var1 = -12 % ((40 - param0) / 47);
          return;
        }
        ea.b(-60, of.field_m - 20);
        var1Lifetime1 = -12 % ((40 - param0) / 47);
    }

    static {
        field_t = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_s = new ei();
    }
}
