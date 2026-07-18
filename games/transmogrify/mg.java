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

    public static void a() {
        field_e = null;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var4 = param3.indexOf(param0);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
            var4 = param3.indexOf(param0, param2.length() + var4);
        }
        return param3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        var18 = ((mg) this).field_a[0].field_j;
        var17 = var18;
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var7 = var14;
        var8 = param0 & 16711935;
        var9 = param0 >> 8 & 255;
        var10 = 0;
        L0: while (true) {
          if (((mg) this).field_b.length <= var10) {
            if (param2 == 3) {
              if (param3 < ((mg) this).field_a[4].field_f + ((mg) this).field_a[2].field_f + ((mg) this).field_a[0].field_f) {
                throw new RuntimeException();
              } else {
                sb.a(ic.field_d);
                ((mg) this).field_a[0].a(param4, param1);
                var10 = param4 + (-((mg) this).field_a[4].field_f + -((mg) this).field_a[2].field_f + param3 + ((mg) this).field_a[0].field_f >> 1);
                sb.g(param4 - -((mg) this).field_a[0].field_f, 0, var10, 480);
                var11 = param4 - -((mg) this).field_a[0].field_f;
                L1: while (true) {
                  if (var11 >= var10) {
                    sb.b(ic.field_d);
                    ((mg) this).field_a[2].b(var10, param1);
                    var11 = -((mg) this).field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -((mg) this).field_a[2].field_f, 0, var11, 480);
                    var12 = ((mg) this).field_a[2].field_f + var10;
                    L2: while (true) {
                      if (var11 <= var12) {
                        sb.b(ic.field_d);
                        ((mg) this).field_a[4].a(var11, param1);
                        return;
                      } else {
                        ((mg) this).field_a[3].a(var12, param1);
                        var12 = var12 + ((mg) this).field_a[3].field_f;
                        continue L2;
                      }
                    }
                  } else {
                    ((mg) this).field_a[1].a(var11, param1);
                    var11 = var11 + ((mg) this).field_a[1].field_f;
                    continue L1;
                  }
                }
              }
            } else {
              ((mg) this).field_f = -35;
              if (param3 < ((mg) this).field_a[4].field_f + ((mg) this).field_a[2].field_f + ((mg) this).field_a[0].field_f) {
                throw new RuntimeException();
              } else {
                sb.a(ic.field_d);
                ((mg) this).field_a[0].a(param4, param1);
                var10 = param4 + (-((mg) this).field_a[4].field_f + -((mg) this).field_a[2].field_f + param3 + ((mg) this).field_a[0].field_f >> 1);
                sb.g(param4 - -((mg) this).field_a[0].field_f, 0, var10, 480);
                var11 = param4 - -((mg) this).field_a[0].field_f;
                L3: while (true) {
                  if (var11 >= var10) {
                    sb.b(ic.field_d);
                    ((mg) this).field_a[2].b(var10, param1);
                    var11 = -((mg) this).field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -((mg) this).field_a[2].field_f, 0, var11, 480);
                    var12 = ((mg) this).field_a[2].field_f + var10;
                    L4: while (true) {
                      if (var11 <= var12) {
                        sb.b(ic.field_d);
                        ((mg) this).field_a[4].a(var11, param1);
                        return;
                      } else {
                        ((mg) this).field_a[3].a(var12, param1);
                        var12 = var12 + ((mg) this).field_a[3].field_f;
                        continue L4;
                      }
                    }
                  } else {
                    ((mg) this).field_a[1].a(var11, param1);
                    var11 = var11 + ((mg) this).field_a[1].field_f;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var11 = ((mg) this).field_b[var10];
            if ((var11 & 65535) != var11 >> 8) {
              if (((mg) this).field_f == var10) {
                var18 = var17;
                var18[var10] = param5;
                var10++;
                continue L0;
              } else {
                var10++;
                continue L0;
              }
            } else {
              var12 = var11 & 255;
              var14[var10] = cl.b(vg.c(var12 * var8 >> 8, 16711935), vg.c(var9 * var12, 65280));
              var10++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        return wf.a(-1);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 117;
        }
        return ((mg) this).field_a[0].field_g;
    }

    mg(ii[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((mg) this).field_a = param0;
            ((mg) this).field_b = new int[param0[0].field_j.length];
            ji.a(param0[0].field_j, 0, ((mg) this).field_b, 0, ((mg) this).field_b.length);
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (((mg) this).field_b.length <= var2_int) {
                  break L2;
                } else {
                  L3: {
                    var3 = ((mg) this).field_b[var2_int];
                    if ((16756717 & var3) >> 16 >= -129) {
                      var2_int++;
                      break L3;
                    } else {
                      if ((var3 & 65455) >> 8 <= 128) {
                        break L3;
                      } else {
                        if (-129 <= (255 & var3)) {
                          var2_int++;
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
              ((mg) this).field_f = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("mg.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = false;
    }
}
