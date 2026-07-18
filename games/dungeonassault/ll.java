/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ll extends ne {
    static boolean field_k;
    static md field_i;
    static String[] field_j;
    static nh field_r;
    static String field_s;
    ll field_n;
    static String[] field_m;
    static vk field_p;
    static String field_u;
    ll field_l;
    long field_o;
    static cn field_q;
    static String[] field_t;

    final static void a(int param0, byte[] param1, boolean param2, int param3, int[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (gg.field_a.length <= var5_int) {
                break L0;
              } else {
                param0 = gg.field_a[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$4 = param0;
                  param0--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param3 = hf.field_yb[incrementValue$5];
                    param4[param1[param3]] = param4[param1[param3]] + 1;
                    hf.field_yb[param4[param1[param3]]] = param3;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ll.K(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(true).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(int param0) {
        rf.field_K = new fm(ck.field_H);
        le.field_b = new gn[25][];
        le.field_b[0] = lc.a(-27711, new String[2][]);
        le.field_b[1] = lc.a(-27711, new String[2][]);
        int var1 = -50 % ((30 - param0) / 40);
        le.field_b[2] = lc.a(-27711, new String[4][]);
        le.field_b[3] = lc.a(-27711, new String[2][]);
        le.field_b[4] = lc.a(-27711, new String[4][]);
        le.field_b[5] = lc.a(-27711, new String[3][]);
        le.field_b[6] = lc.a(-27711, new String[3][]);
        le.field_b[7] = lc.a(-27711, new String[4][]);
        le.field_b[8] = lc.a(-27711, new String[2][]);
        le.field_b[9] = lc.a(-27711, new String[2][]);
        le.field_b[10] = lc.a(-27711, new String[1][]);
        le.field_b[11] = lc.a(-27711, new String[1][]);
        le.field_b[12] = lc.a(-27711, new String[1][]);
        le.field_b[13] = lc.a(-27711, new String[1][]);
        le.field_b[14] = lc.a(-27711, new String[1][]);
        le.field_b[15] = lc.a(-27711, new String[1][]);
        le.field_b[16] = lc.a(-27711, new String[1][]);
        le.field_b[17] = lc.a(-27711, new String[1][]);
        le.field_b[18] = lc.a(-27711, new String[2][]);
        le.field_b[19] = lc.a(-27711, new String[2][]);
        le.field_b[20] = lc.a(-27711, new String[3][]);
        le.field_b[21] = lc.a(-27711, new String[1][]);
        le.field_b[22] = lc.a(-27711, new String[1][]);
        le.field_b[23] = lc.a(-27711, new String[4][]);
        le.field_b[24] = lc.a(-27711, new String[1][]);
        if (!(kd.field_c <= 25)) {
            kd.field_c = 0;
        }
        uo.field_f = le.field_b[kd.field_c];
        if (!(fc.field_d <= uo.field_f.length)) {
            fc.field_d = 0;
        }
        og.a(false, 0, uo.field_f[fc.field_d]);
    }

    final void b(byte param0) {
        if (((ll) this).field_l == null) {
          return;
        } else {
          ((ll) this).field_l.field_n = ((ll) this).field_n;
          if (param0 != -2) {
            field_t = null;
            ((ll) this).field_n.field_l = ((ll) this).field_l;
            ((ll) this).field_l = null;
            ((ll) this).field_n = null;
            return;
          } else {
            ((ll) this).field_n.field_l = ((ll) this).field_l;
            ((ll) this).field_l = null;
            ((ll) this).field_n = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_i = null;
        field_t = null;
        field_p = null;
        field_r = null;
        field_j = null;
        if (param0 != 92) {
          var2 = null;
          bo discarded$2 = ll.a((String) null, (byte) 100);
          field_u = null;
          field_q = null;
          field_s = null;
          field_m = null;
          return;
        } else {
          field_u = null;
          field_q = null;
          field_s = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              gf.b(param1, param4, param2 + 1, 10000536);
              gf.b(param1, param3 + param4, 1 + param2, 12105912);
              var5_int = 1;
              var6 = param3;
              if (param0 == 2) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            L2: {
              if (gf.field_f <= var5_int + param4) {
                break L2;
              } else {
                var5_int = -param4 + gf.field_f;
                break L2;
              }
            }
            L3: {
              if (var6 + param4 > gf.field_e) {
                var6 = -param4 + gf.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 + var7 * 48 / param3;
                var9 = var8 | (var8 << 8 | var8 << 16);
                gf.field_b[param1 + (param4 - -var7) * gf.field_i] = var9;
                gf.field_b[(var7 + param4) * gf.field_i + (param1 + param2)] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "ll.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(byte param0, Random param1, int[] param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var4_int = uj.a(param1, 37, param3.length);
            stackOut_2_0 = mo.a(param2, param3[var4_int], param1, (byte) -74);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ll.G(").append(-110).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static bo a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        bo var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        bo stackIn_16_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        bo stackOut_15_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (fk.field_v != null) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  var6 = (CharSequence) (Object) param0;
                  var2 = jm.a((byte) 59, var6);
                  if (var2 != null) {
                    var3 = (bo) (Object) fk.field_v.a((byte) 125, (long)var2.hashCode());
                    L1: while (true) {
                      if (var3 == null) {
                        if (param1 != -47) {
                          ll.a((byte) 52);
                          stackOut_20_0 = null;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          return null;
                        }
                      } else {
                        var7 = (CharSequence) (Object) var3.field_Hb;
                        var4 = jm.a((byte) 59, var7);
                        if (var4.equals((Object) (Object) var2)) {
                          stackOut_15_0 = (bo) var3;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        } else {
                          var3 = (bo) (Object) fk.field_v.c((byte) 5);
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("ll.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return (bo) (Object) stackIn_21_0;
    }

    protected ll() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Magical Guardian";
        field_u = "Crusher";
        field_j = new String[]{null, "Another option is to <%flee>. If the raider survives at least one combat round, they may be able to escape the room (if they win a <%dodge> roll against the room's <%snare>), allowing you to send a different raider in to face it, or to seek a different route entirely.<br><br><%command>Select one of these strategies now.</col>"};
        field_i = new md();
        field_t = new String[]{"Ferocity", "The <%0> is able to channel his fury into a violent flurry of blows; during the first round of each combat, his <%attack> is doubled."};
    }
}
