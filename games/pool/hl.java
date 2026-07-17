/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements fp {
    private int field_b;
    private int field_i;
    static String field_c;
    private lr field_e;
    private int field_j;
    private int field_g;
    private int field_h;
    private int field_o;
    static ie field_a;
    private int field_f;
    private int field_l;
    private int field_k;
    private int field_d;
    private int field_m;
    static int field_n;

    final static eo a(String param0, int param1) {
        Object var2 = null;
        eo var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        Object stackIn_2_0 = null;
        eo stackIn_11_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        eo stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (null != gd.field_c) {
              L1: {
                var5 = (CharSequence) (Object) param0;
                var2 = (Object) (Object) hq.a(param1 ^ 123, var5);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = (Object) (Object) var5;
                  break L1;
                }
              }
              var3 = (eo) (Object) gd.field_c.a((long)((String) var2).hashCode(), false);
              L2: while (true) {
                if (var3 == null) {
                  if (param1 != 1) {
                    int discarded$2 = hl.a(-34);
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  L3: {
                    var6 = (CharSequence) (Object) var3.field_Zb;
                    var4 = hq.a(param1 ^ 104, var6);
                    if (var4 != null) {
                      break L3;
                    } else {
                      var4 = var3.field_Zb;
                      break L3;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (eo) (Object) gd.field_c.a(param1 ^ -98);
                    continue L2;
                  } else {
                    stackOut_10_0 = (eo) var3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (eo) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_17_0 = var2;
            stackOut_17_1 = new StringBuilder().append("hl.E(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return (eo) (Object) stackIn_16_0;
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var12 = null;
        ei stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ei stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof ri)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ei) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ei) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (ri) (Object) stackIn_3_0;
              if (var12 != null) {
                param0 = param0 & var12.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              qh.f(param4.field_C + param1, param4.field_D + param3, param4.field_l, param4.field_y, ((hl) this).field_f);
              if (param0) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var10 = 8 / ((param2 - 2) / 41);
              var8 = param1 - (-param4.field_C + -((hl) this).field_o);
              var9 = ((hl) this).field_k + (param3 - -param4.field_D);
              qh.c(var8, var9, ((hl) this).field_g, ((hl) this).field_j, 5592405);
              qh.f(var8, var9, ((hl) this).field_g, ((hl) this).field_j, var7);
              if (var12.field_G) {
                qh.d(var8, var9, var8 + ((hl) this).field_g, ((hl) this).field_j + var9, 1);
                qh.d(((hl) this).field_g + var8, var9, var8, var9 - -((hl) this).field_j, 1);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == ((hl) this).field_e) {
                break L5;
              } else {
                var11 = ((hl) this).field_g + ((hl) this).field_o - -((hl) this).field_m;
                int discarded$1 = ((hl) this).field_e.a(param4.field_m, var11 + (param1 - -param4.field_C), ((hl) this).field_d + (param3 - -param4.field_D), -var11 + (-((hl) this).field_m + param4.field_l), -(((hl) this).field_m << 1) + param4.field_y, ((hl) this).field_l, ((hl) this).field_i, ((hl) this).field_b, ((hl) this).field_h, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("hl.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 23467) {
            return 80;
        }
        return rl.field_a;
    }

    final static void a(dd param0, int param1) {
        try {
            int var2_int = 0;
            mm.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "hl.B(" + (param0 != null ? "{...}" : "null") + 44 + 106 + 41);
        }
    }

    hl(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((hl) this).field_b = 1;
        ((hl) this).field_h = 1;
        try {
            ((hl) this).field_i = param4;
            ((hl) this).field_j = param7;
            ((hl) this).field_d = param2;
            ((hl) this).field_e = param0;
            ((hl) this).field_g = param8;
            ((hl) this).field_k = param6;
            ((hl) this).field_l = param3;
            ((hl) this).field_o = param5;
            ((hl) this).field_f = param9;
            ((hl) this).field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_a = new ie();
    }
}
