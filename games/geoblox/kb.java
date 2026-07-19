/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int field_c;
    static int field_b;
    static int field_d;
    static int[] field_a;

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (param1 == 6568) {
              si.field_g = va.field_e;
              if ((param0 ^ -1) == -256) {
                L1: {
                  stackOut_9_0 = param1 ^ 6648;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if ((rd.field_u ^ -1) <= -14) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L1;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L1;
                  }
                }
                me.field_g = hh.a(stackIn_12_0, stackIn_12_1 != 0);
                var6 = (String[]) null;
                ci.a((String[]) null, 416577356);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-101 < (param0 ^ -1)) {
                  me.field_g = ig.a(param3, param0, false);
                  return;
                } else {
                  if (param0 > 105) {
                    me.field_g = ig.a(param3, param0, false);
                    return;
                  } else {
                    var7 = param2;
                    ci.a(var7, 416577356);
                    me.field_g = ac.a(param1 + -6540, param2);
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (hl.field_G) {
          kf.field_e = true;
          q.a((byte) 123, true);
          hj.field_a = 0;
          if (param0 >= -90) {
            kb.c(-89);
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        ue.a(param0, true, (byte) -102);
    }

    final static void b(int param0) {
        int var1 = 0;
        if (null == kd.field_e) {
          if (vg.field_i != null) {
            vg.field_i.m(23181);
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          } else {
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          }
        } else {
          kd.field_e.l(0);
          if (vg.field_i == null) {
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          } else {
            vg.field_i.m(23181);
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 105) {
            field_c = 71;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_b = 640;
    }
}
