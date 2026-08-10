/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private ii[] field_a;
    static boolean field_d;
    private int field_f;
    static volatile boolean field_c;
    static String field_e;
    private int[] field_b;

    public static void a(byte param0) {
        if (param0 != -28) {
            return;
        }
        field_e = null;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param1) {
          return (String) null;
        } else {
          var4 = param3.indexOf(param0);
          L0: while (true) {
            if (-1 == var4) {
              return param3;
            } else {
              param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
              var4 = param3.indexOf(param0, param2.length() + var4);
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var16;
        var13 = Transmogrify.field_A ? 1 : 0;
        var16 = this.field_a[0].field_j;
        var15 = var16;
        var14 = var15;
        var7 = var14;
        var8 = param0 & 16711935;
        var9 = param0 >> -1582457240 & 255;
        var10 = 0;
        L0: while (true) {
          if (this.field_b.length <= var10) {
            if (param2 == 3) {
              if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                throw new RuntimeException();
              } else {
                sb.a(ic.field_d);
                this.field_a[0].a(param4, param1);
                var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                var11 = param4 - -this.field_a[0].field_f;
                L1: while (true) {
                  if (var11 >= var10) {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    var12 = this.field_a[2].field_f + var10;
                    L2: while (true) {
                      if (var11 <= var12) {
                        sb.b(ic.field_d);
                        this.field_a[4].a(var11, param1);
                        return;
                      } else {
                        this.field_a[3].a(var12, param1);
                        var12 = var12 + this.field_a[3].field_f;
                        continue L2;
                      }
                    }
                  } else {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    continue L1;
                  }
                }
              }
            } else {
              this.field_f = -35;
              if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                throw new RuntimeException();
              } else {
                sb.a(ic.field_d);
                this.field_a[0].a(param4, param1);
                var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                var11 = param4 - -this.field_a[0].field_f;
                L3: while (true) {
                  if (var11 >= var10) {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    var12 = this.field_a[2].field_f + var10;
                    L4: while (true) {
                      if (var11 <= var12) {
                        sb.b(ic.field_d);
                        this.field_a[4].a(var11, param1);
                        return;
                      } else {
                        this.field_a[3].a(var12, param1);
                        var12 = var12 + this.field_a[3].field_f;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var11 = this.field_b[var10];
            if ((var11 & 65535 ^ -1) != (var11 >> 870552456 ^ -1)) {
              if (this.field_f == var10) {
                var16[var10] = param5;
                var10++;
                continue L0;
              } else {
                var10++;
                continue L0;
              }
            } else {
              var12 = var11 & 255;
              var14[var10] = cl.b(vg.c(var12 * var8 >> -413372120, 16711935), vg.c(var9 * var12, 65280));
              var10++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, boolean param1, int param2, boolean param3) {
        if (!param3) {
            mg.a(124, true, 121, true);
            return wf.a(-1);
        }
        return wf.a(-1);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 117;
        }
        return this.field_a[0].field_g;
    }

    mg(ii[] param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_a = param0;
            this.field_b = new int[param0[0].field_j.length];
            ji.a(param0[0].field_j, 0, this.field_b, 0, this.field_b.length);
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_b.length <= var2_int) {
                  break L2;
                } else {
                  var3 = this.field_b[var2_int];
                  if (((16756717 & var3) >> 705536496 ^ -1) >= -129) {
                    var2_int++;
                    continue L1;
                  } else {
                    if ((var3 & 65455) >> 1449862344 <= 128) {
                      var2_int++;
                      continue L1;
                    } else {
                      if (-129 >= (255 & var3 ^ -1)) {
                        var2_int++;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_f = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("mg.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_c = false;
        field_d = false;
    }
}
