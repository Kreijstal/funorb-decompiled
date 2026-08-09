/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends bw {
    static vr field_h;
    boolean field_f;
    int field_g;

    final static void a(int param0) {
        L0: {
          kt.field_m = new sna(0L, (sna) null);
          if (eaa.field_c) {
            kt.field_m.a(-1, dea.field_m);
            break L0;
          } else {
            break L0;
          }
        }
        kt.field_m.a(-1, tv.field_o);
        if (param0 != 2048) {
          ft.a(93);
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          kf.a((byte) -6);
          return;
        } else {
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          kf.a((byte) -6);
          return;
        }
    }

    final static void c(byte param0) {
        int var1;
        if (!qo.field_c) {
          throw new IllegalStateException();
        } else {
          lia.field_i = true;
          var1 = -76 % ((param0 - 32) / 42);
          gq.a(false, 19626);
          jv.field_j = 0;
          return;
        }
    }

    private final void a(lu param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_g = param0.f(-95);
              stackIn_2_0 = this;

              if (-1 == (param0.b(16711935) ^ -1)) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            ((ft) (this)).field_f = stackIn_3_1 != 0;
            if (param1 == -26011) {
              break L0;
            } else {
              ft.a(-71, (byte) 7);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ft.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -81 / ((param0 - 3) / 50);
    }

    final static int a(int param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (param1 <= -127) {
          param0 = param0 & 8191;
          if (4096 > param0) {
            L0: {
              if (2048 <= param0) {
                stackIn_10_0 = -ed.field_b[-2048 + param0];
                break L0;
              } else {
                stackIn_10_0 = ed.field_b[2048 - param0];
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackIn_6_0 = -ed.field_b[6144 + -param0];
                break L1;
              } else {
                stackIn_6_0 = ed.field_b[param0 - 6144];
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return -124;
        }
    }

    ft(lu param0) {
        try {
            this.a(param0, -26011);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ft.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
