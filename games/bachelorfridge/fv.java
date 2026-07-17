/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends ana {
    static kv field_y;
    private taa field_z;
    static int field_w;
    static int[] field_x;
    private boolean field_v;

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        RuntimeException var6 = null;
        rea var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_ref = (rea) (Object) param3.b((byte) 90);
              if (param5 <= -104) {
                break L1;
              } else {
                var9 = null;
                fv.a(6, 16, -46, (eaa) null, -23, (byte) 95);
                break L1;
              }
            }
            L2: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L3: {
                  var7 = (var6_ref.field_n >> 1) + (630 & (int)var6_ref.field_m * 8357 + 326565 * (int)var6_ref.field_j);
                  if (var7 <= 256) {
                    break L3;
                  } else {
                    var7 = 256;
                    break L3;
                  }
                }
                param1 = var6_ref.field_i;
                dg.f((int)var6_ref.field_m + param4, -2 + (param0 + (int)var6_ref.field_l), (128 + -var6_ref.field_n) / 16, param1, 256 - var7 >> 2);
                var6_ref = (rea) (Object) param3.c(0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("fv.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(boolean param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            ola.field_p = ki.field_w;
            if (255 == param1) {
              L1: {
                stackOut_6_0 = 120;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (fga.field_f >= 13) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L1;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L1;
                }
              }
              sg.field_p = nna.a((byte) stackIn_9_0, stackIn_9_1 != 0);
              break L0;
            } else {
              L2: {
                if (param1 < 100) {
                  break L2;
                } else {
                  if (param1 > 105) {
                    break L2;
                  } else {
                    sg.field_p = kw.a(false, param3);
                    return;
                  }
                }
              }
              sg.field_p = wu.a(param1, (byte) 97, param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fv.D(").append(1).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final boolean c(byte param0) {
        int var2 = -54 % ((param0 - 71) / 47);
        if (((fv) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((fv) this).field_z.a((byte) -106)) {
            return false;
        }
        if (!((fv) this).field_v) {
            ((fv) this).field_v = true;
            jja.a(192, -1, 42);
            ((fv) this).field_q.field_s.field_d = ((fv) this).field_q.field_s.field_d + 2;
            if (!(((fv) this).field_q.field_s.field_d >= 100)) {
                return false;
            }
            this.d(-103);
            return true;
        }
        ((fv) this).field_q.field_s.field_d = ((fv) this).field_q.field_s.field_d + 2;
        if (!(((fv) this).field_q.field_s.field_d >= 100)) {
            return false;
        }
        this.d(-103);
        return true;
    }

    private final void d(int param0) {
        ((fv) this).field_q.field_s.field_d = 100;
    }

    public static void e() {
        field_x = null;
        field_y = null;
    }

    fv(gj param0, tl param1) {
        super(param0, (bca) (Object) param1);
        ((fv) this).field_v = false;
        try {
            ((fv) this).field_z = new taa(((fv) this).field_q, (((fv) this).field_q.field_h.field_z >> 1) - 1, -3);
            ((fv) this).a(27799, (at) (Object) ((fv) this).field_z);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
