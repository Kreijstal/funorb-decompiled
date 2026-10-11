/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static pb a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        int var4 = -71 % ((param1 - 61) / 52);
        pb var7 = new pb(param2, param2);
        pb var3 = var7;
        for (var5 = 0; var3.field_z.length > var5; var5++) {
          var7.field_z[var5] = param0;
        }
        return var3;
    }

    final static void a(byte param0) {
        int var1 = 19 % ((38 - param0) / 55);
    }

    final static void a(String param0, byte param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = stellarshard.field_B;
        try {
          ki.field_v = ki.field_v + 1;
          if (vk.field_b == -1 &&
            -1 == wg.field_c) {
            wg.field_c = eb.field_a;
            vk.field_b = ni.field_e;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(hk.field_m));
          } else {
            decompiledFrameRemainder0 = (null == hk.field_m);
          }
          if (decompiledFrameRemainder0) {
            if (!wk.field_c) {
              if (pc.field_g <= ki.field_v) {
                stackIn_17_0 = (ki.field_v < pc.field_g + ul.field_D) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              ki.field_v = 0;
            } else {
              if (wk.field_c) {
                ki.field_v = pc.field_g;
              } else {
                if (var2_int == 0) {
                  ki.field_v = 0;
                } else {
                  ki.field_v = pc.field_g;
                }
              }
            }
            am.field_f = vk.field_b;
            if (param0 == null) {
              if (var2_int != 0) {
                wk.field_c = true;
              }
            } else {
              wk.field_c = false;
            }
            h.field_c = wg.field_c;
          }
          if (!wk.field_c &&
            pc.field_g > ki.field_v &&
            qc.field_a) {
            am.field_f = vk.field_b;
            ki.field_v = 0;
            h.field_c = wg.field_c;
          }
          hk.field_m = param0;
          if (wk.field_c &&
            ki.field_v == td.field_b) {
            ki.field_v = 0;
            wk.field_c = false;
          }
          vk.field_b = -1;
          wg.field_c = -1;
          if (param1 > 79) {
            return;
          }
          cl.a(-42, 42, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("cl.D(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          ri.a(param1, param0, var3, 0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("cl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_a = -1605303501;
    }
}
