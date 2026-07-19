/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private ci[] field_a;
    static String field_b;
    static String field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        jl.a(this.field_a, param2, param4, param0, (byte) -123, param1);
        if (param3 != 0) {
            this.a(104, -42, -62, 0, 118);
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
        if (param2 < 126) {
          return;
        } else {
          l.e(param1, param0, 12, 16777215);
          l.e(param1, param0, 8, 0);
          return;
        }
    }

    final static dc a(boolean param0, int param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        uc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        uc var8 = null;
        mb var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_23_0 = null;
        Object stackOut_22_0 = null;
        L0: {
          var7 = Terraphoenix.field_V;
          var8 = mk.field_j;
          var2 = var8;
          var3 = var8.a(-16384);
          if (param1 == 0) {
            break L0;
          } else {
            field_c = (String) null;
            break L0;
          }
        }
        L1: {
          im.field_c = 127 & var3;
          if ((128 & var3) == 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          ng.field_s = stackIn_5_0 != 0;
          da.field_d = var8.a(-16384);
          pl.field_Q = var8.h((byte) 78);
          if ((im.field_c ^ -1) != -3) {
            ji.field_k = 0;
            wb.field_c = 0;
            break L2;
          } else {
            wb.field_c = var8.i(-25578);
            ji.field_k = var8.d((byte) -114);
            break L2;
          }
        }
        L3: {
          if (-2 != (var8.a(-16384) ^ -1)) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          ge.field_c = var8.e(-1);
          if (var4 != 0) {
            wh.field_a = var8.e(-1);
            break L4;
          } else {
            wh.field_a = ge.field_c;
            break L4;
          }
        }
        L5: {
          if (im.field_c == 1) {
            discarded$4 = var8.i(-25578);
            discarded$5 = var8.e(-1);
            break L5;
          } else {
            if ((im.field_c ^ -1) != -5) {
              break L5;
            } else {
              discarded$6 = var8.i(-25578);
              discarded$7 = var8.e(-1);
              break L5;
            }
          }
        }
        if (!param0) {
          ea.field_n = ui.a(80, var8, param1 ^ -48);
          ui.field_e = null;
          return new dc(param0);
        } else {
          var5 = var8.i(-25578);
          try {
            L6: {
              L7: {
                var9 = fl.field_c.a(true, var5);
                ea.field_n = var9.a(false);
                if (!wh.field_a.equals(kj.field_f)) {
                  stackOut_23_0 = var9.field_r;
                  stackIn_24_0 = stackOut_23_0;
                  break L7;
                } else {
                  stackOut_22_0 = null;
                  stackIn_24_0 = (int[]) ((Object) stackOut_22_0);
                  break L7;
                }
              }
              ui.field_e = stackIn_24_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            bd.a((Throwable) ((Object) var6), "CC1", -77);
            ui.field_e = null;
            ea.field_n = null;
            return new dc(param0);
          }
          return new dc(param0);
        }
    }

    bm(ci[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fb a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        fb var9 = null;
        RuntimeException var9_ref = null;
        fb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 74) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var9 = new fb(param1, param5, param0, param6, param8, param7, param2);
            hd.field_p.a(var9, -16611);
            mh.a(var9, param3, 0);
            stackOut_2_0 = (fb) (var9);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9_ref);
            stackOut_4_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        if (param0 <= 68) {
            bm.a(36, -120, (byte) -40);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_b = "Left click to collect objective";
        field_c = "    Impassable Terrain";
    }
}
