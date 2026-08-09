/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ura {
    static String field_a;
    static String field_b;

    final static void a(int param0, String[] param1, byte param2, String param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              kl.field_a = mua.field_a;
              if ((param0 ^ -1) == -256) {
                L2: {
                  stackIn_10_0 = -108;

                  if ((wua.field_n ^ -1) <= -14) {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 1;
                    break L2;
                  }
                }
                ki.field_n = es.a((byte) stackIn_11_0, stackIn_11_1 != 0);
                break L1;
              } else {
                if (param0 < 100) {
                  ki.field_n = doa.a(param3, param0, (byte) 114);
                  break L1;
                } else {
                  if ((param0 ^ -1) >= -106) {
                    ki.field_n = pla.a(param2 + 228, param1);
                    break L1;
                  } else {
                    ki.field_n = doa.a(param3, param0, (byte) 114);
                    break L1;
                  }
                }
              }
            }
            if (param2 == -103) {
              break L0;
            } else {
              ura.a(55, -28, true, -42, -47);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ura.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final static iu[] a(int param0, int param1, boolean param2, int param3, int param4) {
        iu dupTemp$2 = null;
        iu dupTemp$3 = null;
        iu[] var5;
        iu[] var6;
        L0: {
          var6 = new iu[9];
          var5 = var6;
          dupTemp$2 = jf.a(param0, 48, param3);
          var6[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[0] = dupTemp$2;
          dupTemp$3 = jf.a(param4, 110, param3);
          var6[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
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
            ura.a(123, 14, false, 60, -69);
        }
    }

    final static void a(int param0) {
        float var1;
        float var2;
        float var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        gda var10;
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
          field_b = (String) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Please log in to access this feature.";
    }
}
