/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private vh field_f;
    static va field_g;
    static nf[] field_i;
    static int field_a;
    static int field_l;
    private mi field_c;
    private mi field_e;
    static java.awt.Color field_k;
    private vh field_j;
    static String field_h;
    static long field_b;
    static mn field_d;

    final bi a(int param0, int param1, int param2) {
        if (param2 != 256) {
            return null;
        }
        return this.a(param0, (int[]) null, false, param1);
    }

    private final bi a(int param0, int[] param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        bi var8 = null;
        fk var9 = null;
        bi var10 = null;
        bi stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        bi stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        bi stackOut_16_0 = null;
        Object stackOut_11_0 = null;
        bi stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = ((268439551 & param0) << 4 | param0 >>> 12) ^ param3;
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int;
            var8 = (bi) (Object) ((m) this).field_j.a(1, var6);
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (bi) (Object) stackIn_6_0;
                  }
                }
              }
              var9 = fk.a(((m) this).field_c, param0, param3);
              if (var9 != null) {
                if (!param2) {
                  L2: {
                    var10 = var9.a();
                    var8 = var10;
                    ((m) this).field_j.a((rk) (Object) var8, 11, var6);
                    if (param1 != null) {
                      param1[0] = param1[0] - var10.field_o.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackOut_16_0 = (bi) var8;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (bi) (Object) stackIn_12_0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (bi) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("m.E(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    final bi a(int param0, byte param1, int param2) {
        if (param1 != 76) {
          bi discarded$2 = ((m) this).a(-124, (byte) -9, -5);
          return this.a(param2, param0, (int[]) null, (byte) -117);
        } else {
          return this.a(param2, param0, (int[]) null, (byte) -117);
        }
    }

    private final bi a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        int var8 = 0;
        bi var9 = null;
        ph var10 = null;
        bi stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        bi stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        bi stackOut_16_0 = null;
        Object stackOut_14_0 = null;
        bi stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = (param0 >>> 12 | param0 << 4 & 65527) ^ param1;
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = -17;
            var9 = (bi) (Object) ((m) this).field_j.a(1, var6);
            if (var9 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (0 < param2[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var10 = (ph) (Object) ((m) this).field_f.a(1, var6);
                if (var10 == null) {
                  var10 = ph.a(((m) this).field_e, param0, param1);
                  if (var10 != null) {
                    ((m) this).field_f.a((rk) (Object) var10, 11, var6);
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (bi) (Object) stackIn_11_0;
                  }
                } else {
                  break L2;
                }
              }
              var9 = var10.a(param2);
              if (var9 != null) {
                var10.a(true);
                ((m) this).field_j.a((rk) (Object) var9, 11, var6);
                stackOut_16_0 = (bi) var9;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (bi) (Object) stackIn_15_0;
              }
            } else {
              stackOut_1_0 = (bi) var9;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("m.D(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -117 + 41);
        }
        return stackIn_17_0;
    }

    public static void a(int param0) {
        field_k = null;
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 != 27244) {
          m.a(23);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    m(mi param0, mi param1) {
        ((m) this).field_f = new vh(256);
        ((m) this).field_j = new vh(256);
        try {
            ((m) this).field_e = param1;
            ((m) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "m.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_l = 0;
        field_g = new va();
        field_h = "If we could get#our hands on their#technology#we could become#supreme rulers#of the galaxy.";
        field_k = new java.awt.Color(10040319);
        field_d = new mn();
    }
}
