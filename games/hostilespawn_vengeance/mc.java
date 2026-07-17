/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends vd implements qk {
    private String[] field_H;
    private ph[] field_M;
    private kn field_K;
    static be field_F;
    static String field_J;
    static int field_I;
    static String field_L;
    static int[] field_E;

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 126, param3);
        if (!(param3 == 0)) {
            return;
        }
        if (param2 <= 42) {
            Object var6 = null;
            ((mc) this).a((String[]) null, (byte) -47);
        }
        vm var5 = jd.field_s;
        if (null != ((mc) this).field_H) {
            int discarded$0 = var5.a(fk.field_b, param1 - -((mc) this).field_v, ((mc) this).field_m + param0, ((mc) this).field_s, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_y);
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((mc) this).a(param1, (byte) -120);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((mc) this).b((byte) -26, param1);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("mc.F(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ti var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ((mc) this).field_z.d(5719);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  ((mc) this).field_H = new String[var3_int];
                  var5 = -72 % ((61 - param1) / 62);
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new ti(jd.field_s, 0, 1);
                      ((mc) this).field_M = new ph[1 + var3_int];
                      var7 = 0;
                      var5 = var7;
                      L3: while (true) {
                        if (var7 >= var3_int) {
                          ((mc) this).field_M[var3_int] = new ph(oa.field_h, (mh) this);
                          ((mc) this).field_M[var3_int].field_h = (nn) (Object) var4;
                          ((mc) this).field_M[var3_int].a(100, 20 + 16 * var3_int + 16, 0, 0, 15);
                          ((mc) this).a(51448, (ag) (Object) ((mc) this).field_M[var3_int]);
                          break L0;
                        } else {
                          ((mc) this).field_M[var7] = new ph(((mc) this).field_H[var7], (mh) this);
                          ((mc) this).field_M[var7].field_h = (nn) (Object) var4;
                          ((mc) this).field_M[var7].field_i = uk.field_b;
                          ((mc) this).field_M[var7].a(80, 20 - -(16 * var7), 0, 0, 15);
                          ((mc) this).a(51448, (ag) (Object) ((mc) this).field_M[var7]);
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      ((mc) this).field_H[var4_int] = uj.a((CharSequence) (Object) param0[var4_int], 18719).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((mc) this).field_H = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("mc.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    public static void j(int param0) {
        field_E = null;
        field_J = null;
        field_F = null;
        field_L = null;
    }

    mc(kn param0) {
        super(0, 0, 0, 0, (nn) null);
        try {
            ((mc) this).field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "mc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        try {
            for (var6_int = 0; ((mc) this).field_H.length > var6_int; var6_int++) {
                if (!(((mc) this).field_M[var6_int] != param3)) {
                    ((mc) this).field_K.a(true, ((mc) this).field_H[var6_int]);
                }
            }
            if (((mc) this).field_M[((mc) this).field_H.length] == param3) {
                ((mc) this).field_K.a(false);
            }
            var6_int = 83 / ((param4 - -63) / 52);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "mc.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new be(1);
        field_J = "MISSION ";
        field_L = "Get to the lift before the explosives detonate.";
        field_I = 0;
    }
}
