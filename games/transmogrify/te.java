/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private int[] field_g;
    private boolean field_d;
    private int field_a;
    static String field_b;
    static int[] field_c;
    private int field_e;
    static String field_f;

    final static void a(gd param0, byte param1, int param2) {
        try {
            rh.field_r.a(param0, -101);
            ne.a((byte) 7, param0, param2);
            if (param1 != -10) {
                te.a((byte) 61);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "te.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var3 = this.field_g.length;
        L0: while (true) {
          if (var3 > param0) {
            if (param1 > -38) {
              field_b = (String) null;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (this.field_d) {
              if (0 != var3) {
                var3 = var3 * this.field_e;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + this.field_e;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        L0: {
          if (this.field_a < param0) {
            this.field_a = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= this.field_g.length) {
            this.c(param0, 0);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_g[param0] = param1;
        if (param2 > -111) {
          discarded$1 = this.a(-66, (byte) 61);
          return;
        } else {
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -14927) {
            return 44;
        }
        if (!(this.field_a >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_g[param0];
    }

    final static void a(ti[] param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param3 ^ -1) >= -1) {
                  break L1;
                } else {
                  L2: {
                    var6_int = param0[0].field_r;
                    var7 = param0[2].field_r;
                    var8 = param0[1].field_r;
                    param0[0].a(param5, param2, param1);
                    param0[2].a(-var7 + param5 - -param3, param2, param1);
                    sb.a(q.field_i);
                    if (param4 >= 13) {
                      break L2;
                    } else {
                      te.a((byte) 8);
                      break L2;
                    }
                  }
                  sb.g(param5 - -var6_int, param2, -var7 + (param5 - -param3), param2 + param0[1].field_s);
                  var9 = param5 - -var6_int;
                  var10 = param3 + param5 + -var7;
                  param5 = var9;
                  L3: while (true) {
                    if (var10 <= param5) {
                      sb.b(q.field_i);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].a(param5, param2, param1);
                      param5 = param5 + var8;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("te.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, byte param1) {
        this.a(1 + this.field_a, param0, param1 + -240);
        if (param1 != 118) {
            this.field_a = -79;
        }
    }

    private te() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        gd var3;
        if (param0 != 1) {
          var3 = (gd) null;
          te.a((gd) null, (byte) -123, -32);
          return 1 + this.field_a;
        } else {
          return 1 + this.field_a;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 8) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final void a(int param0, int param1) {
        if (param1 <= param0) {
          if (param0 <= this.field_a) {
            if (param0 != this.field_a) {
              ji.a(this.field_g, param0 - -1, this.field_g, param0, this.field_a + -param0);
              this.field_a = this.field_a - 1;
              return;
            } else {
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(param0, (byte) -53)];
        int[] var3 = var4;
        ji.a(this.field_g, param1, var4, 0, this.field_g.length);
        this.field_g = var4;
    }

    static {
        field_b = "Username: ";
        field_c = new int[128];
        field_f = "Back";
    }
}
