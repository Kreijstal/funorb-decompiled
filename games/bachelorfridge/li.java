/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends lw {
    static cf field_l;
    static boolean field_m;

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            cma.field_x = new js(256);
            var1_int = -102;
            var2 = 0;
            L1: while (true) {
              if (dq.field_a.length <= var2) {
                break L0;
              } else {
                cma.field_x.a((long)dq.field_a[var2].toLowerCase().hashCode(), (byte) 76, (bw) (Object) new ji(var2));
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "li.B(" + -117 + ')');
        }
    }

    final void a(int param0) {
        hp.field_a = true;
        int var2 = 125 / ((59 - param0) / 33);
        ((li) this).c(102);
    }

    final static iga a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        iga stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        iga stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param0 == 26130) {
                break L1;
              } else {
                var7 = null;
                iga discarded$2 = li.a(51, true, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (param2.indexOf('@') != -1) {
                var6 = (Object) (Object) param2;
                break L2;
              } else {
                var8 = (CharSequence) (Object) param2;
                var4_long = mp.a(var8, true);
                break L2;
              }
            }
            stackOut_5_0 = ov.a(var4_long, param1, (String) var6, param3, (byte) 58);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("li.F(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0) {
        int var2 = 0;
        var2 = (int)((-Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 100.0) + 1.0) * 256.0);
        if (param0 <= 103) {
          return;
        } else {
          L0: {
            if (((li) this).field_e != 0) {
              break L0;
            } else {
              vg.a(sia.field_j, 3360, 22997, 16000, 4096 + var2, 3520, 4096 - -var2, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
              break L0;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_l = null;
    }

    li() {
        super(true, new String[2], bp.field_w);
        ((li) this).field_c = new int[][]{new int[2], new int[2]};
    }

    final void a(int param0, byte param1) {
        if (param0 == 9) {
          ((li) this).field_a = 2;
          ((li) this).b(1);
          ((li) this).c(param1 ^ 1);
          if (param1 == 73) {
            return;
          } else {
            field_l = null;
            return;
          }
        } else {
          if (param0 == 34) {
            if (0 != ((li) this).field_e) {
              ((li) this).b(1);
              if (!((li) this).c((byte) 95)) {
                if (param1 == 73) {
                  return;
                } else {
                  field_l = null;
                  return;
                }
              } else {
                fla.b(23621);
                if (param1 == 73) {
                  return;
                } else {
                  field_l = null;
                  return;
                }
              }
            } else {
              if (param1 == 73) {
                return;
              } else {
                field_l = null;
                return;
              }
            }
          } else {
            if (param1 == 73) {
              return;
            } else {
              field_l = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new cf();
    }
}
