/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vta extends vw {
    static float field_e;
    static String field_f;
    static int[] field_d;

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_f = (String) null;
        }
    }

    vta(eo param0) {
        super(param0);
    }

    public static void d(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 36070) {
            field_d = (int[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_c.a(true, (byte) 100);
        int var3 = 121 / ((param0 - 41) / 62);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            field_d = (int[]) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        L0: {
          if (param2 == 2048) {
            break L0;
          } else {
            vta.c((byte) -99);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (param1 & 2048 ^ -1)) {
              break L2;
            } else {
              if (-1 == (param0 & 55 ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == -12754) {
                break L1;
              } else {
                vta.d(-51);
                break L1;
              }
            }
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = -var3 + ((var3 << -345436059) - -io.a(-377, param0.charAt(var4)));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("vta.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, iva param1, int param2) {
        try {
            this.field_c.a(true, param1);
            this.field_c.a((byte) -35, param0);
            if (param2 != 24595) {
                CharSequence var5 = (CharSequence) null;
                vta.a((CharSequence) null, -89);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vta.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        if (param0 >= -4) {
            field_e = -1.3910614252090454f;
        }
        this.field_c.a(false, (byte) 72);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            CharSequence var3 = (CharSequence) null;
            vta.a((CharSequence) null, -5);
            return true;
        }
        return true;
    }

    final static void c(byte param0) {
        fua.field_g = false;
        if (param0 < 52) {
            field_f = (String) null;
        }
        ok.field_s = -1 == (vc.field_q.h(255) ^ -1) ? true : false;
    }

    static {
        field_f = "Remove <%0> from ignore list";
        field_d = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
