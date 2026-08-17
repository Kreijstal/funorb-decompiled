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
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (param1 == 6568) {
              si.field_g = va.field_e;
              if ((param0 ^ -1) == -256) {
                L1: {
                  stackIn_11_0 = param1 ^ 6648;

                  if ((rd.field_u ^ -1) <= -14) {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = 0;
                    break L1;
                  } else {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = 1;
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
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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
        int var1;
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
