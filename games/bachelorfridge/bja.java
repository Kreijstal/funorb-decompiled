/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bja extends jm {
    static String field_m;
    static String field_n;
    static byte[] field_o;
    static String field_p;

    public static void a() {
        field_o = null;
        field_n = null;
        field_m = null;
        field_p = null;
    }

    public bja() {
        ((bja) this).field_j = 6;
    }

    final void a(boolean param0, op param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        op stackIn_2_0 = null;
        op stackIn_3_0 = null;
        op stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        op stackOut_1_0 = null;
        op stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        op stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
            L1: {
              stackOut_1_0 = (op) param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
                stackOut_3_0 = (op) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (op) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            stackIn_4_0.field_l = stackIn_4_1 != 0;
            var3_int = 0;
            L2: while (true) {
              if (param1.field_z <= var3_int) {
                break L0;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= param1.field_B) {
                    var3_int++;
                    continue L2;
                  } else {
                    L4: {
                      if (param1.field_L.field_o[var3_int][var4].field_n == 1) {
                        param1.field_a[var3_int][var4].field_i = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("bja.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(27799, (at) (Object) new mi(param0.field_o, (bja) this));
              if (param1 < -2) {
                break L1;
              } else {
                var4 = null;
                bja.a((kv) null, 59, 82);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bja.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    bja(lu param0) {
        try {
            ((bja) this).field_j = 6;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bja.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(kv param0, int param1, int param2) {
        RuntimeException var3 = null;
        ee var3_ref = null;
        kv var4 = null;
        kv var5 = null;
        kv[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var15 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            var3_ref = ch.a(wha.field_a, param1 ^ -7, "basic", "fridge_rust");
            var4 = wfa.a("fridge_drips", wha.field_a, "basic", (byte) -107);
            var5 = wfa.a("fridge_muck", wha.field_a, "basic", (byte) -107);
            int discarded$1 = 27;
            ld.a(gla.field_j, var4, var5, var3_ref, param2, param0);
            if (param1 == 6) {
              L1: {
                if (300 > ep.field_m) {
                  kaa.field_l = gw.a("basic", "freezer_clean", wha.field_a, param1 ^ -108);
                  var6 = gw.a("basic", "freezer_dirty", wha.field_a, param1 + -68);
                  var7 = dg.field_i;
                  var8 = dg.field_c;
                  var15 = dg.field_e;
                  var10 = 0;
                  L2: while (true) {
                    if (kaa.field_l.length <= var10) {
                      dg.a(var15, var7, var8);
                      break L1;
                    } else {
                      kaa.field_l[var10].g();
                      kaa.field_l[var10].b();
                      var6[var10].a(0, 0, ep.field_m * 255 / 300);
                      kaa.field_l[var10].d();
                      var10++;
                      continue L2;
                    }
                  }
                } else {
                  kaa.field_l = gw.a("basic", "freezer_dirty", wha.field_a, -49);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bja.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "***Resist!***";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = "You cannot join this game - it is in progress";
    }
}
