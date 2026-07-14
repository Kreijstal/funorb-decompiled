/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ura {
    static String field_a;
    static String field_b;

    final static void a(int param0, String[] param1, byte param2, String param3) {
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        kl.field_a = mua.field_a;
        if ((param0 ^ -1) == -256) {
          L0: {
            stackOut_16_0 = -108;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if ((wua.field_n ^ -1) <= -14) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L0;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L0;
            }
          }
          ki.field_n = es.a((byte) stackIn_19_0, stackIn_19_1 != 0);
          if (param2 != -103) {
            iu[] discarded$4 = ura.a(55, -28, true, -42, -47);
            return;
          } else {
            return;
          }
        } else {
          if (param0 < 100) {
            ki.field_n = doa.a(param3, param0, (byte) 114);
            if (param2 == -103) {
              return;
            } else {
              iu[] discarded$5 = ura.a(55, -28, true, -42, -47);
              return;
            }
          } else {
            if ((param0 ^ -1) >= -106) {
              ki.field_n = pla.a(param2 + 228, param1);
              if (param2 != -103) {
                iu[] discarded$6 = ura.a(55, -28, true, -42, -47);
                return;
              } else {
                return;
              }
            } else {
              ki.field_n = doa.a(param3, param0, (byte) 114);
              if (param2 == -103) {
                return;
              } else {
                iu[] discarded$7 = ura.a(55, -28, true, -42, -47);
                return;
              }
            }
          }
        }
    }

    final static iu[] a(int param0, int param1, boolean param2, int param3, int param4) {
        iu[] var5 = null;
        iu[] var6 = null;
        L0: {
          var6 = new iu[9];
          var5 = var6;
          var6[6] = jf.a(param0, 48, param3);
          var5[3] = jf.a(param0, 48, param3);
          var5[2] = jf.a(param0, 48, param3);
          var5[1] = jf.a(param0, 48, param3);
          var5[0] = jf.a(param0, 48, param3);
          var6[8] = jf.a(param4, 110, param3);
          var5[7] = jf.a(param4, 110, param3);
          var5[5] = jf.a(param4, 110, param3);
          if (param1 != 0) {
            var6[4] = jf.a(param1, 112, 64);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2) {
          ura.a(true);
          return var5;
        } else {
          return var5;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
            iu[] discarded$0 = ura.a(123, 14, false, 60, -69);
        }
    }

    final static void a(int param0) {
        float var1 = 0.0f;
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gda var10 = null;
        L0: {
          if (ss.a(126)) {
            var3 = 1.15234375f;
            var5 = -50;
            var1 = 0.69921875f;
            var4 = 61453;
            var7 = -50;
            var2 = 1.2000000476837158f;
            var6 = -60;
            break L0;
          } else {
            var1 = 0.10000000149011612f;
            var7 = -24;
            var5 = 0;
            var4 = 16770747;
            var6 = -24;
            var2 = 0.05000000074505806f;
            var3 = 0.6499999761581421f;
            tga.field_a.ZA(var4, var1, var2, (float)var5, (float)var6, (float)var7);
            break L0;
          }
        }
        var8 = 0;
        tga.field_a.xa(var3);
        var9 = 16384;
        tga.field_a.L(var8, var9, 0);
        tga.field_a.f(-16384, 16384);
        var10 = tga.field_a.b();
        var10.a();
        tga.field_a.a(var10);
        if (param0 != -10985) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please log in to access this feature.";
    }
}
