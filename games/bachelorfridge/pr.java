/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static String field_e;
    private rca[] field_k;
    private int field_l;
    private int[][] field_a;
    static kv[] field_h;
    private int field_f;
    static int field_i;
    static vr field_j;
    private eaa field_d;
    private int field_g;
    static String field_c;
    private int field_b;
    boolean field_m;

    public static void a(int param0) {
        field_h = null;
        field_c = null;
        field_j = null;
        if (param0 >= -52) {
            pr.c(-93);
        }
        field_e = null;
    }

    final int[][] a(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!(((pr) this).field_b == ((pr) this).field_l)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < ((pr) this).field_b; var2++) {
            ((pr) this).field_k[var2] = jla.field_a;
        }
        if (param0) {
            ((pr) this).field_k = null;
        }
        return ((pr) this).field_a;
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
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            aja.field_o = 1 + (int)(var3.longValue() / 1048576L);
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2 = caughtException;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param0 == -21) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        field_j = null;
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

    final int[] a(int param0, int param1) {
        rca var3 = null;
        rca var3_ref = null;
        rca var4 = null;
        rca var4_ref = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var5 = BachelorFridge.field_y;
        if (param1 == -1) {
          if (((pr) this).field_l == ((pr) this).field_b) {
            L0: {
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (((pr) this).field_k[param0] != null) {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L0;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L0;
              }
            }
            ((pr) this).field_m = stackIn_18_1 != 0;
            ((pr) this).field_k[param0] = jla.field_a;
            return ((pr) this).field_a[param0];
          } else {
            if (-2 != (((pr) this).field_b ^ -1)) {
              L1: {
                var3 = ((pr) this).field_k[param0];
                var4 = var3;
                var4 = var3;
                if (var3 != null) {
                  ((pr) this).field_m = false;
                  break L1;
                } else {
                  L2: {
                    ((pr) this).field_m = true;
                    if (((pr) this).field_b <= ((pr) this).field_g) {
                      var4_ref = (rca) (Object) ((pr) this).field_d.a(param1 ^ -7);
                      var3_ref = new rca(param0, var4_ref.field_f);
                      ((pr) this).field_k[var4_ref.field_g] = null;
                      var4_ref.a(false);
                      break L2;
                    } else {
                      var3_ref = new rca(param0, ((pr) this).field_g);
                      ((pr) this).field_g = ((pr) this).field_g + 1;
                      break L2;
                    }
                  }
                  ((pr) this).field_k[param0] = var3_ref;
                  break L1;
                }
              }
              ((pr) this).field_d.a(-59, (bw) (Object) var3_ref);
              return ((pr) this).field_a[var3_ref.field_f];
            } else {
              L3: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((pr) this).field_f == param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              ((pr) this).field_m = stackIn_7_1 != 0;
              ((pr) this).field_f = param0;
              return ((pr) this).field_a[0];
            }
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        for (var2 = param0; ((pr) this).field_b > var2; var2++) {
            ((pr) this).field_a[var2] = null;
        }
        ((pr) this).field_k = null;
        ((pr) this).field_a = null;
        ((pr) this).field_d.d(73);
        ((pr) this).field_d = null;
    }

    final static void c(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = BachelorFridge.field_y;
        jb.d();
        ima.field_s = 11;
        qk.field_m = new int[260];
        if (param0 > -21) {
            return;
        }
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            qk.field_m[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (qk.field_m.length > var5) {
            qk.field_m[var5] = 255;
            var5++;
        }
    }

    pr(int param0, int param1, int param2) {
        ((pr) this).field_f = -1;
        ((pr) this).field_g = 0;
        ((pr) this).field_d = new eaa();
        ((pr) this).field_m = false;
        ((pr) this).field_b = param0;
        ((pr) this).field_l = param1;
        ((pr) this).field_k = new rca[((pr) this).field_l];
        ((pr) this).field_a = new int[((pr) this).field_b][param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Show all lobby chat";
        field_c = "To server list";
        field_i = 0;
    }
}
