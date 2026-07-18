/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private ci[] field_a;
    static String field_b;
    static String field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        jl.a(((bm) this).field_a, param2, param4, param0, (byte) -123, param1);
        if (param3 != 0) {
            ((bm) this).a(104, -42, -62, 0, 118);
        }
    }

    final static void a(int param0) {
        vj.a(-24517);
        int var1 = -35 / ((-83 - param0) / 35);
        bm.a(4, (byte) 1);
    }

    final static void a(int param0, byte param1) {
        if (param1 != 1) {
            bm.a(0, (byte) -88);
            ga.field_c = param0;
            return;
        }
        ga.field_c = param0;
    }

    final static void a(int param0, int param1, byte param2) {
        l.e(param1, param0, 16, 0);
        l.e(param1, param0, 12, 16777215);
        l.e(param1, param0, 8, 0);
    }

    final static dc a(boolean param0, int param1) {
        uc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        uc var8 = null;
        mb var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_20_0 = null;
        L0: {
          var7 = Terraphoenix.field_V;
          var8 = mk.field_j;
          var2 = var8;
          var3 = var8.a(-16384);
          im.field_c = 127 & var3;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ng.field_s = stackIn_3_0 != 0;
          da.field_d = var8.a(-16384);
          pl.field_Q = var8.h((byte) 78);
          if (im.field_c != 2) {
            ji.field_k = 0;
            wb.field_c = 0;
            break L1;
          } else {
            wb.field_c = var8.i(-25578);
            ji.field_k = var8.d((byte) -114);
            break L1;
          }
        }
        L2: {
          if (var8.a(-16384) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          ge.field_c = var8.e(-1);
          if (var4 != 0) {
            wh.field_a = var8.e(-1);
            break L3;
          } else {
            wh.field_a = ge.field_c;
            break L3;
          }
        }
        L4: {
          if (im.field_c == 1) {
            int discarded$4 = var8.i(-25578);
            String discarded$5 = var8.e(-1);
            break L4;
          } else {
            if (im.field_c != 4) {
              break L4;
            } else {
              int discarded$6 = var8.i(-25578);
              String discarded$7 = var8.e(-1);
              break L4;
            }
          }
        }
        if (!param0) {
          ea.field_n = ui.a(80, (dh) (Object) var8, -48);
          ui.field_e = null;
          return new dc(param0);
        } else {
          var5 = var8.i(-25578);
          try {
            L5: {
              L6: {
                var9 = fl.field_c.a(true, var5);
                ea.field_n = var9.a(false);
                if (!wh.field_a.equals((Object) (Object) kj.field_f)) {
                  stackOut_21_0 = var9.field_r;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                  break L6;
                }
              }
              ui.field_e = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            bd.a((Throwable) (Object) var6, "CC1", -77);
            ui.field_e = null;
            ea.field_n = null;
            return new dc(param0);
          }
          return new dc(param0);
        }
    }

    bm(ci[] param0) {
        try {
            ((bm) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "bm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fb a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        fb var9 = null;
        RuntimeException var9_ref = null;
        fb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9 = new fb(23, 65512, param0, param6, param8, param7, param2);
            hd.field_p.a((uf) (Object) var9, -16611);
            mh.a(var9, 3, 0);
            stackOut_0_0 = (fb) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(23).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 3 + ',' + 93 + ',' + 65512 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Left click to collect objective";
        field_c = "    Impassable Terrain";
    }
}
