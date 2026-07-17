/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ic implements w {
    static String field_b;
    private long field_c;
    static int field_a;
    static ej field_d;

    public final cg b(int param0) {
        if (!((ic) this).a((byte) 28)) {
          if (param0 == -28036) {
            if (350L + ((ic) this).field_c > ih.a((byte) -98)) {
              return eh.field_c;
            } else {
              return ((ic) this).c((byte) -119);
            }
          } else {
            return null;
          }
        } else {
          return sf.field_a;
        }
    }

    abstract String b(byte param0);

    public static void d() {
        field_b = null;
        field_d = null;
    }

    abstract cg c(byte param0);

    public final void a(int param0) {
        ((ic) this).field_c = ih.a((byte) -98);
        if (param0 >= -81) {
            String discarded$0 = ((ic) this).c(-83);
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              param6 += 24;
              var7_int = 48 + l.field_f.b(gf.field_b) - -nj.field_f[param1];
              if (l.field_f.b(param0) > -nj.field_f[param1] + (var7_int - 48)) {
                var7_int = 48 + (l.field_f.b(param0) - -nj.field_f[param1]);
                break L1;
              } else {
                break L1;
              }
            }
            jf.field_n[0].e(param4 - var7_int / 2, -(jf.field_n[0].field_x / 2) + (2 + param6) + (-(l.field_f.field_N / 2) - -2));
            ti.d(-(var7_int / 2) + (param4 - -jf.field_n[0].field_w), 0, -jf.field_n[2].field_w + param4 + var7_int / 2, 480);
            var8_int = jf.field_n[0].field_w + param4 - var7_int / 2;
            L2: while (true) {
              if (-jf.field_n[2].field_w + var7_int / 2 + param4 <= var8_int) {
                L3: {
                  ti.b();
                  jf.field_n[2].e(-jf.field_n[2].field_w + (param4 + var7_int / 2), 2 + (param6 - (-2 + l.field_f.field_N / 2)) + -(jf.field_n[0].field_x / 2));
                  if (nj.field_f[param1] > 0) {
                    ti.a(param4 - (var7_int / 2 - 12) << 4, param6 + 2 - (l.field_f.field_N / 2 - 2) << 4, 512, nj.field_f[param1] * 4, ei.field_I);
                    ti.a(-14 + (var7_int / 2 + param4) << 4, -(l.field_f.field_N / 2) + 2 + param6 - -2 << 4, 512, nj.field_f[param1] * 4, ei.field_I);
                    ti.a(param4 - (var7_int / 2 - 12) << 4, -(l.field_f.field_N / 2) + (2 + param6 + 2) << 4, 256, nj.field_f[param1] * 2, ei.field_B);
                    ti.a(-14 + (var7_int / 2 + param4) << 4, 2 + -(l.field_f.field_N / 2) + (2 + param6) << 4, 256, nj.field_f[param1] * 2, ei.field_B);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (!param3) {
                  var8 = ai.a(param0, "<col", "<", -101);
                  l.field_f.c(var8, -1 + param4, param6, 0, -1);
                  l.field_f.c(var8, 1 + param4, param6, 0, -1);
                  l.field_f.c(var8, param4 + 1, -1 + param6, 0, -1);
                  l.field_f.c(var8, 1 + param4, param6 + 1, 0, -1);
                  l.field_f.c(param0, param4, param6, param5, param2);
                  break L0;
                } else {
                  return;
                }
              } else {
                jf.field_n[1].e(var8_int, 2 + (2 + param6) + (-(l.field_f.field_N / 2) + -(jf.field_n[0].field_x / 2)));
                var8_int = var8_int + jf.field_n[1].field_w;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("ic.I(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public final String c(int param0) {
        if (param0 == -22773) {
          if (!((ic) this).a((byte) 79)) {
            if (~ih.a((byte) -98) > ~(((ic) this).field_c + 350L)) {
              return null;
            } else {
              return ((ic) this).b((byte) 36);
            }
          } else {
            return null;
          }
        } else {
          cg discarded$7 = ((ic) this).c((byte) -69);
          if (!((ic) this).a((byte) 79)) {
            if (~ih.a((byte) -98) > ~(((ic) this).field_c + 350L)) {
              return null;
            } else {
              return ((ic) this).b((byte) 36);
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fk var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var4 = (fk) (Object) ib.field_c.b(-88);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$2 = 1;
                th.a(5, var4);
                var4 = (fk) (Object) ib.field_c.b((byte) 106);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "ic.J(" + 5 + 44 + 55 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Suggested names: ";
    }
}
