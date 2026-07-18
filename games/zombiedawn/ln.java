/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    static int[] field_c;
    static String[] field_a;
    static int field_b;

    final int a(long param0, int param1) {
        long var4 = 0L;
        var4 = ((ln) this).a((byte) -112);
        if (var4 > (long)param1) {
          ld.a(var4, (byte) 122);
          return ((ln) this).a(-99, param0);
        } else {
          return ((ln) this).a(-99, param0);
        }
    }

    final static aa a(boolean param0, int param1) {
        int var2 = 0;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        dm var9 = null;
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
          var8 = ZombieDawn.field_J;
          var2 = -59;
          var3 = fj.field_g;
          var4 = var3.d((byte) -128);
          cg.field_e = 127 & var4;
          if ((var4 & 128) == 0) {
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
          vi.field_d = stackIn_3_0 != 0;
          ei.field_J = var3.d((byte) -125);
          ce.field_s = var3.c(true);
          if (cg.field_e != 2) {
            td.field_a = 0;
            ep.field_i = 0;
            break L1;
          } else {
            ep.field_i = var3.f(2);
            td.field_a = var3.g(-1875);
            break L1;
          }
        }
        L2: {
          if (1 != var3.d((byte) -115)) {
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
          var5 = stackIn_9_0;
          ea.field_b = var3.a(true);
          if (var5 != 0) {
            af.field_a = var3.a(true);
            break L3;
          } else {
            af.field_a = ea.field_b;
            break L3;
          }
        }
        L4: {
          if (cg.field_e == 1) {
            int discarded$4 = var3.f(2);
            String discarded$5 = var3.a(true);
            break L4;
          } else {
            if (cg.field_e == 4) {
              int discarded$6 = var3.f(2);
              String discarded$7 = var3.a(true);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param0) {
          ge.field_a = jj.a(80, -23171, (de) (Object) var3);
          vk.field_d = null;
          return new aa(param0);
        } else {
          var6 = var3.f(2);
          try {
            L5: {
              L6: {
                var9 = pa.field_y.a(75, var6);
                ge.field_a = var9.e(80);
                if (!af.field_a.equals((Object) (Object) ce.field_r)) {
                  stackOut_21_0 = var9.field_u;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                  break L6;
                }
              }
              vk.field_d = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = (Exception) (Object) decompiledCaughtException;
            ae.a((Throwable) (Object) var7, 10331, "CC1");
            vk.field_d = null;
            ge.field_a = null;
            return new aa(param0);
          }
          return new aa(param0);
        }
    }

    abstract void a(boolean param0);

    public static void a() {
        field_c = null;
        field_a = null;
    }

    abstract long a(byte param0);

    abstract int a(int param0, long param1);

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          fk.field_F = hm.field_H;
          if (param0 != 255) {
            if (param0 < 100) {
              mp.field_f = te.a(param2, -13466, param0);
              return;
            } else {
              if (param0 <= 105) {
                mp.field_f = ao.a(param3, -91);
                return;
              } else {
                mp.field_f = te.a(param2, -13466, param0);
                return;
              }
            }
          } else {
            L0: {
              stackOut_2_0 = 5;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (ae.field_a >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L0;
              }
            }
            mp.field_f = fl.a(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ln.I(").append(param0).append(',').append(-14).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new int[]{};
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
