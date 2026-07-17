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
                        aja.field_o = 1 + (int)(var3.longValue() / 1048576L);
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
                break L0;
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

    final int[] a(int param0, int param1) {
        rca var3 = null;
        rca var4 = null;
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
            if (((pr) this).field_b != 1) {
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
                      var4 = (rca) (Object) ((pr) this).field_d.a(param1 ^ -7);
                      var3 = new rca(param0, var4.field_f);
                      ((pr) this).field_k[var4.field_g] = null;
                      var4.a(false);
                      break L2;
                    } else {
                      var3 = new rca(param0, ((pr) this).field_g);
                      ((pr) this).field_g = ((pr) this).field_g + 1;
                      break L2;
                    }
                  }
                  ((pr) this).field_k[param0] = var3;
                  break L1;
                }
              }
              ((pr) this).field_d.a(-59, (bw) (Object) var3);
              return ((pr) this).field_a[var3.field_f];
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
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            jb.d();
            ima.field_s = 11;
            qk.field_m = new int[260];
            if (param0 <= -21) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 256) {
                  var5 = 256;
                  var1_int = var5;
                  L2: while (true) {
                    if (qk.field_m.length <= var5) {
                      break L0;
                    } else {
                      qk.field_m[var5] = 255;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var2 = 15.0;
                  qk.field_m[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "pr.E(" + param0 + 41);
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
