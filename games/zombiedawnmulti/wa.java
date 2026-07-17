/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa implements nl {
    private int field_m;
    static cj field_a;
    static boolean field_k;
    private fm field_h;
    private int field_e;
    private int field_l;
    static String field_j;
    private int field_f;
    private int field_c;
    private int field_i;
    static String field_d;
    static int field_g;
    static ja[] field_b;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wm var12 = null;
        cf stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 instanceof wm) {
                stackOut_3_0 = (cf) param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (cf) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (wm) (Object) stackIn_4_0;
              oo.e(param4.field_y + param3, param4.field_i + param1, param4.field_n, param4.field_w, ((wa) this).field_i);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == -15112) {
              var7 = -(var12.field_M * 2) + param4.field_n;
              var8 = param4.field_y + param3 - -var12.field_M;
              var9 = param1 + (param4.field_i + var12.field_N);
              oo.g(var8, var9, var8 - -var7, var9, ((wa) this).field_c);
              var10 = var12.a((byte) -72) + -1;
              L3: while (true) {
                if (0 > var10) {
                  if (null != ((wa) this).field_h) {
                    ((wa) this).field_h.b(var12.field_j, var8 + var7 / 2, var9 - (-((wa) this).field_h.field_w - var12.field_N), ((wa) this).field_e, ((wa) this).field_m);
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  oo.d(var8 + var7 * var12.a(var10, false) / var12.g((byte) -106), var9, ((wa) this).field_f, ((wa) this).field_l);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("wa.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_j = null;
        field_a = null;
        field_d = null;
    }

    wa(fm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((wa) this).field_e = param1;
            ((wa) this).field_i = param4;
            ((wa) this).field_c = param3;
            ((wa) this).field_m = param2;
            ((wa) this).field_f = param5;
            ((wa) this).field_l = param6;
            ((wa) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 != null) {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        mk.field_d = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 == 43) {
                  break L0;
                } else {
                  field_g = 6;
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = "Screech";
        field_g = 0;
    }
}
