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
        cf stackIn_4_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wm var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 instanceof wm) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = (cf) (param4);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = (wm) ((Object) stackIn_4_0);
                        oo.e(param4.field_y + param3, param4.field_i + param1, param4.field_n, param4.field_w, this.field_i);
                        if (var12 != null) {
                            statePc = 5;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 == -15112) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var7 = -(var12.field_M * 2) + param4.field_n;
                        var8 = param4.field_y + param3 - -var12.field_M;
                        var9 = param1 + (param4.field_i + var12.field_N);
                        oo.g(var8, var9, var8 - -var7, var9, this.field_c);
                        var10 = var12.a((byte) -72) + -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 > var10) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        oo.d(var8 + var7 * var12.a(var10, false) / var12.g((byte) -106), var9, this.field_f, this.field_l);
                        var10--;
                        if (var11 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null != this.field_h) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_h.b(var12.field_j, var8 + var7 / 2, var9 - (-this.field_h.field_w - var12.field_N), this.field_e, this.field_m);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var6);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("wa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param4 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        try {
            this.field_e = param1;
            this.field_i = param4;
            this.field_c = param3;
            this.field_m = param2;
            this.field_f = param5;
            this.field_l = param6;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 != null) {
                    try {
                      L2: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        mk.field_d = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2_ref = decompiledCaughtException;
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
        field_k = false;
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = "Screech";
        field_g = 0;
    }
}
