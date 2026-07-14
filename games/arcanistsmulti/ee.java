/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ee implements pd {
    static String field_c;
    static String field_a;
    static ll[] field_b;
    static dn field_g;
    private long field_e;
    static int[] field_d;
    static String field_f;

    abstract String a(boolean param0);

    public static void c(boolean param0) {
        Object var2 = null;
        field_c = null;
        field_a = null;
        field_g = null;
        if (!param0) {
          var2 = null;
          boolean discarded$2 = ee.a((ll) null, -106, -125, 14);
          field_d = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    final static boolean a(ll param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        byte[] var25 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        param2 = param2 >> 1;
        param1 = param1 >> 1;
        param2 += 0;
        var4 = param2;
        var5 = param0.field_h;
        if (param0.field_h > var4) {
          var7 = var4;
          var6 = 1;
          if ((var7 ^ -1) < 0) {
            param1 += 0;
            var7 = param1;
            var8 = param0.field_c;
            if (param0.field_c > var7) {
              var10 = var7;
              var9 = 1;
              if (-1 >= var10) {
                return false;
              } else {
                L0: {
                  if (var4 <= 0) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    stackOut_10_0 = var4;
                    stackIn_12_0 = stackOut_10_0;
                    break L0;
                  }
                }
                L1: {
                  var10 = stackIn_12_0;
                  var11 = var4 + var6;
                  if (var5 < var11) {
                    var11 = var5;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var7 <= 0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    stackOut_16_0 = var7;
                    stackIn_18_0 = stackOut_16_0;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_18_0;
                  var13 = var7 + var9;
                  var11 = var11 - var10;
                  if (var13 > var8) {
                    var13 = var8;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var13 = var13 - var12;
                if (param3 >= 32) {
                  var14 = var5 * var12 + var10;
                  var25 = param0.field_m;
                  var16 = var13;
                  var17 = var11;
                  if (0 != var25[var14]) {
                    L4: {
                      di.field_m = di.field_m + (var10 - (-var11 - -var17) << 497052513);
                      ce.field_k = ce.field_k + (-var16 + var12 + var13 << 1048514305);
                      if (0 == (var25[var14] ^ -1)) {
                        jo.field_b = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final String c(int param0) {
        if (param0 == 26146) {
          if (!((ee) this).a((byte) -90)) {
            if (qj.b(-26572) < 350L + ((ee) this).field_e) {
              return null;
            } else {
              return ((ee) this).a(true);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void b(int param0) {
        if (param0 != -17444) {
            ee.b(false);
            ((ee) this).field_e = qj.b(-26572);
            return;
        }
        ((ee) this).field_e = qj.b(-26572);
    }

    final static void b(boolean param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1 == null) {
                                statePc = 8;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            wl.field_K = (int)(var3.longValue() / 1048576L) - -1;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = null;
                            boolean discarded$2 = ee.a((ll) null, 125, 14, -99);
                            return;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            return;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        var5 = null;
                        boolean discarded$3 = ee.a((ll) null, 125, 14, -99);
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

    final static boolean a(byte param0, CharSequence param1) {
        int var2 = 88 / ((-13 - param0) / 38);
        return hd.a(param1, (byte) 59, false);
    }

    abstract eh b(byte param0);

    final static void a(int param0, byte param1) {
        if (param1 != 30) {
            ee.a(-79, (byte) -26);
            qg.field_c = param0;
            return;
        }
        qg.field_c = param0;
    }

    public final eh a(int param0) {
        if (((ee) this).a((byte) -82)) {
            return cg.field_Wb;
        }
        if (param0 > -65) {
            ((ee) this).b(-88);
            if (!(((ee) this).field_e + 350L <= qj.b(-26572))) {
                return da.field_f;
            }
            return ((ee) this).b((byte) -66);
        }
        if (!(((ee) this).field_e + 350L <= qj.b(-26572))) {
            return da.field_f;
        }
        return ((ee) this).b((byte) -66);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Arcane Book";
        field_d = new int[4];
        field_a = "Unpacking explosives";
        field_f = "Reload game";
    }
}
