/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bqa implements bo {
    private int field_a;
    private int field_b;
    private int field_c;
    private int field_i;
    private boolean field_e;
    private int[] field_d;
    private int field_h;
    private int field_f;
    static String field_g;

    final void a(v param0, int param1, qh param2) {
        RuntimeException runtimeException = null;
        hca var4 = null;
        int var5 = 0;
        int var6 = 0;
        hca var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.f(param1 ^ param1)) {
              L1: {
                L2: {
                  if (((bqa) this).field_e) {
                    break L2;
                  } else {
                    if (!param0.a(((bqa) this).field_h, 54)) {
                      break L2;
                    } else {
                      if (!param2.field_k.a(false, ((bqa) this).field_h, ((bqa) this).field_c)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.a(param2.field_k, (byte) -98);
                var7 = param2.field_k.field_H[((bqa) this).field_h];
                var4 = var7;
                var5 = 0;
                L3: while (true) {
                  if (3 <= var5) {
                    if (param2.field_x != ((bqa) this).field_h) {
                      param2.c(((bqa) this).field_h, 51);
                      param0.a(((bqa) this).field_f, (byte) 125, ((bqa) this).field_h);
                      break L1;
                    } else {
                      param0.f(10);
                      break L1;
                    }
                  } else {
                    var7.a(true, var5, ((bqa) this).field_d[var5]);
                    var5++;
                    continue L3;
                  }
                }
              }
              param2.field_r = ((bqa) this).field_i;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("bqa.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param1.i(8);
            param1.a((byte) 3, ((bqa) this).field_e ? 1 : 0, 1);
            param1.a((byte) -125, ((bqa) this).field_h, 3);
            param1.a((byte) -125, ((bqa) this).field_c, 5);
            param1.a((byte) 113, ((bqa) this).field_b, 24);
            param1.a((byte) -128, ((bqa) this).field_a, 24);
            param1.a((byte) -126, ((bqa) this).field_f, 5);
            for (var3_int = 0; ((bqa) this).field_d.length > var3_int; var3_int++) {
                param1.a((byte) -125, ((bqa) this).field_d[var3_int], 8);
            }
            if (param0 != 200) {
                ((bqa) this).field_a = -62;
            }
            param1.a((byte) -126, 1 + ((bqa) this).field_i, 32);
            param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bqa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "S2CNewRoomPacket (force:" + ((bqa) this).field_e + ", playerid:" + ((bqa) this).field_h + ", roomid:" + ((bqa) this).field_c + ", course ticks:" + ((bqa) this).field_b + ", room ticks:" + ((bqa) this).field_a + ", disregard:" + ((bqa) this).field_f + ", treasure: " + this.a(1) + ")";
    }

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) 125);
        ((bqa) this).field_e = param0.b((byte) 44, 1) != 1 ? false : true;
        ((bqa) this).field_h = param0.b((byte) 44, 3);
        ((bqa) this).field_c = param0.b((byte) 44, 5);
        ((bqa) this).field_b = param0.b((byte) 44, 24);
        ((bqa) this).field_a = param0.b((byte) 44, 24);
        ((bqa) this).field_f = param0.b((byte) 44, 5);
        for (var3_int = 0; ((bqa) this).field_d.length > var3_int; var3_int++) {
            ((bqa) this).field_d[var3_int] = param0.b((byte) 44, 8);
        }
        if (param1 != -19) {
            return;
        }
        try {
            ((bqa) this).field_i = -1 + param0.b((byte) 44, 32);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bqa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        return 0 != (param1 & 540800);
    }

    private final void a(ff param0, byte param1) {
        try {
            param0.a(((bqa) this).field_c, ((bqa) this).field_h, 1, ((bqa) this).field_b, ((bqa) this).field_a);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bqa.E(" + (param0 != null ? "{...}" : "null") + ',' + -98 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        qja.a(true, param0, -127);
        if (param1 < 103) {
            field_g = null;
        }
    }

    private final String a(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        String var2 = String.valueOf(((bqa) this).field_d[0]);
        for (var3 = 1; var3 < 3; var3++) {
            var2 = var2 + "," + ((bqa) this).field_d[var3];
        }
        return var2;
    }

    bqa() {
        ((bqa) this).field_i = -1;
        ((bqa) this).field_d = new int[3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "2nd";
    }
}
