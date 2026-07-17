/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int field_c;
    int field_d;
    pc field_h;
    boolean field_l;
    int field_e;
    int field_i;
    int field_b;
    static String field_g;
    int field_a;
    int field_j;
    int field_k;
    int field_f;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 5) {
            break L0;
          } else {
            pc.a(-47);
            break L0;
          }
        }
        L1: {
          if (wna.field_n == null) {
            break L1;
          } else {
            var1 = (Object) (Object) wna.field_n;
            synchronized (var1) {
              L2: {
                wna.field_n = null;
                break L2;
              }
            }
            break L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((pc) this).field_k = param2;
        ((pc) this).field_c = param1;
        ((pc) this).field_e = param1;
        ((pc) this).field_a = param3;
        if (param4 != 44) {
            return;
        }
        ((pc) this).field_f = param3;
        ((pc) this).field_d = param0;
    }

    public static void a(boolean param0) {
        field_g = null;
    }

    final void a(int param0, byte param1) {
        int var3 = ((pc) this).field_e + -((pc) this).field_d;
        int var4 = ((pc) this).field_a + -((pc) this).field_k;
        ((pc) this).field_e = ((pc) this).field_d - -gqa.a(param0, (byte) 24, var3);
        if (param1 != 47) {
            Object var5 = null;
            pc.a(false, -126, (bb) null);
        }
        ((pc) this).field_a = ((pc) this).field_k + gqa.a(param0, (byte) 24, var4);
    }

    final static void a(boolean param0, int param1, bb param2) {
        kh var3 = null;
        try {
            var3 = ql.field_k;
            if (param0) {
                field_g = null;
            }
            var3.k(param1, -2988);
            var3.i(5, 0);
            var3.i(0, 0);
            var3.f(-1477662136, param2.field_n);
            var3.i(param2.field_j, 0);
            var3.i(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pc.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static bfa a(ela[] param0, int param1, String param2, bfa[] param3) throws rv {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        bfa stackIn_5_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        bfa stackOut_4_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          L0: while (true) {
            if (var4_int >= param0.length) {
              var8 = new StringBuilder("The method " + param2 + "(");
              var5 = 33 % ((param1 - -53) / 54);
              var6 = 0;
              L1: while (true) {
                if (var6 >= param3.length) {
                  StringBuilder discarded$4 = var8.append(") is undefined.");
                  throw new rv(var8.toString());
                } else {
                  L2: {
                    if (param3[var6].field_a) {
                      StringBuilder discarded$5 = var8.append(jd.a(param3[var6].field_d, 0).toString());
                      break L2;
                    } else {
                      StringBuilder discarded$6 = var8.append(rva.a(param3[var6].field_d.getClass(), (byte) -88));
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 + param3.length <= var6) {
                      break L3;
                    } else {
                      StringBuilder discarded$7 = var8.append(44);
                      break L3;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              if (!param0[var4_int].a(-120, param2, param3)) {
                var4_int++;
                continue L0;
              } else {
                stackOut_4_0 = param0[var4_int].a(param3, 0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("pc.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Cancel draw";
    }
}
