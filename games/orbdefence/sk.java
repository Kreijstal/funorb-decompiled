/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends kj {
    static java.awt.Color field_H;
    private im field_B;
    static String field_G;
    static String field_C;
    static tl field_E;
    static int[] field_I;

    final void o(int param0) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        int var4 = -70 / ((param0 - 85) / 32);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (!(!var3.d(false))) {
                var3.b(57);
            }
            var3 = (sg) (Object) var2.b(true);
        }
        ((sk) this).field_y = (pj) (Object) ((sk) this).k(3469);
    }

    public static void m() {
        field_I = null;
        field_E = null;
        field_C = null;
        field_H = null;
        field_G = null;
    }

    final pj c(boolean param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (!(!var3.field_A)) {
                return var3.b((byte) -109);
            }
            var3 = (sg) (Object) var2.b(!param0 ? true : false);
        }
        if (!param0) {
            return null;
        }
        field_I = null;
        return null;
    }

    final void n(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 7920) {
            ((sk) this).field_B = null;
        }
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            var3.field_A = false;
            var3 = (sg) (Object) var2.b(true);
        }
        ((sk) this).field_y = null;
    }

    final sg k(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(param0 + 24466);
        while (var3 != null) {
            if (!(!var3.field_A)) {
                return var3;
            }
            var3 = (sg) (Object) var2.b(true);
        }
        if (param0 == 3469) {
            return null;
        }
        Object var5 = null;
        int discarded$0 = sk.a((byte) -126, (CharSequence) null);
        return null;
    }

    public sk() {
        super(0, 0, ed.field_a, lh.field_d, (td) null, (ag) null);
        ((sk) this).field_B = new im();
    }

    final void l(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 > -5) {
            ((sk) this).o(-56);
        }
        km var2 = new km(((sk) this).field_B);
        sg var3 = (sg) (Object) var2.d(27935);
        while (var3 != null) {
            if (var3.l(194)) {
                var3.b(57);
            }
            var3 = (sg) (Object) var2.b(true);
        }
    }

    final static boolean a(char param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param0 == 160) {
              break L1;
            } else {
              if (param0 == 32) {
                break L1;
              } else {
                if (param0 == 95) {
                  break L1;
                } else {
                  if (param0 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (null != ((sk) this).field_j) {
            ((sk) this).field_j.a(param0, param3, (pj) this, param2 + -1052969, true);
        }
        km var5 = new km(((sk) this).field_B);
        pj var6 = (pj) (Object) var5.c(param2 ^ -1040926);
        if (param2 != 1048575) {
            Object var8 = null;
            ((sk) this).b((byte) -95, (pj) null);
        }
        while (var6 != null) {
            var6.a(param0 + ((sk) this).field_n, param1, param2, param3 - -((sk) this).field_s);
            var6 = (pj) (Object) var5.a((byte) -84);
        }
    }

    final void b(byte param0, pj param1) {
        sg var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!(param1 instanceof sg)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (sg) (Object) param1;
                ((sk) this).field_B.a((ca) (Object) var3, 9);
                var3.field_A = true;
                boolean discarded$10 = var3.a(-81, (pj) this);
                if (param0 == 74) {
                  break L1;
                } else {
                  var4 = null;
                  int discarded$11 = sk.a((byte) 48, (CharSequence) null);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("sk.N(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 76) {
                break L1;
              } else {
                var6 = null;
                int discarded$2 = sk.a((byte) 9, (CharSequence) null);
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = -var3 + (var3 << 5) + oc.a(-109, param1.charAt(var4));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("sk.H(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Continue";
        field_H = new java.awt.Color(10040319);
        field_E = new tl();
        field_I = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
