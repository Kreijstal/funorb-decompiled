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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wm var12 = null;
        cf stackIn_3_0 = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param4 instanceof wm) {
            stackOut_2_0 = (cf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (cf) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (wm) (Object) stackIn_3_0;
          oo.e(param4.field_y + param3, param4.field_i + param1, param4.field_n, param4.field_w, ((wa) this).field_i);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 != -15112) {
          return;
        } else {
          var7 = -(var12.field_M * 2) + param4.field_n;
          var8 = param4.field_y + param3 - -var12.field_M;
          var9 = param1 + (param4.field_i + var12.field_N);
          oo.g(var8, var9, var8 - -var7, var9, ((wa) this).field_c);
          var10 = var12.a((byte) -72) + -1;
          L2: while (true) {
            if (0 > var10) {
              L3: {
                if (null != ((wa) this).field_h) {
                  ((wa) this).field_h.b(var12.field_j, var8 + var7 / 2, var9 - (-((wa) this).field_h.field_w - var12.field_N), ((wa) this).field_e, ((wa) this).field_m);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              oo.d(var8 + var7 * var12.a(var10, false) / var12.g((byte) -106), var9, ((wa) this).field_f, ((wa) this).field_l);
              var10--;
              continue L2;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_j = null;
        field_a = null;
        if (param0 != 2) {
            wa.a((byte) -21);
            field_d = null;
            return;
        }
        field_d = null;
    }

    wa(fm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((wa) this).field_e = param1;
        ((wa) this).field_i = param4;
        ((wa) this).field_c = param3;
        ((wa) this).field_m = param2;
        ((wa) this).field_f = param5;
        ((wa) this).field_l = param6;
        ((wa) this).field_h = param0;
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1 != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            mk.field_d = (int)(var3.longValue() / 1048576L) + 1;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2 = caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == 43) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_g = 6;
                            return;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
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
