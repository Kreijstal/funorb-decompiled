/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek extends fb {
    private int field_F;
    private int field_N;
    boolean field_G;
    static nk field_E;
    private int field_K;
    private int field_L;
    private int field_H;
    int field_M;
    private int field_D;
    static int field_I;
    static int field_J;

    final void j(int param0) {
        ((ek) this).b(-27598);
        ((ek) this).c((byte) -56);
        td.field_c.a((le) this, 87);
        if (param0 != -18475) {
            ek.i(112);
        }
    }

    private final void f() {
        ((ek) this).field_H = pb.a(so.field_a, 127, 1) + 128;
        ((ek) this).field_F = 0;
        ((ek) this).field_y = ((ek) this).field_N - (-pb.a(so.field_a, 24, 1) - -12) << 16;
        ((ek) this).field_x = ((ek) this).field_L - 12 - -pb.a(so.field_a, 24, 1) << 16;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ((ek) this).field_L = param0;
        ((ek) this).field_G = false;
        ((ek) this).field_N = param1;
        if (param3 != 2011722288) {
          return;
        } else {
          ((ek) this).field_y = param1 << 16;
          ((ek) this).field_x = param0 << 16;
          ((ek) this).field_M = 0;
          int discarded$2 = -8;
          this.f();
          var5 = bg.field_o.length;
          ((ek) this).field_D = pb.a(so.field_a, 10, 1);
          ((ek) this).field_K = pb.a(so.field_a, param2, 1);
          ((ek) this).field_F = pb.a(so.field_a, var5, 1);
          return;
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
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
        try {
          L0: {
            L1: {
              if (((ek) this).field_G) {
                break L1;
              } else {
                int fieldTemp$3 = ((ek) this).field_K - 1;
                ((ek) this).field_K = ((ek) this).field_K - 1;
                if (fieldTemp$3 > 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 < -76) {
                      break L2;
                    } else {
                      ((ek) this).j(-76);
                      break L2;
                    }
                  }
                  var3_int = param1.a(((ek) this).a(true), (byte) -59);
                  var4 = param1.a(((ek) this).f(237239984), 0) + -24;
                  if (km.a(21405, var3_int, param1, var4)) {
                    L3: {
                      if (ng.field_e) {
                        break L3;
                      } else {
                        if (dj.field_e.field_H.field_b[((ek) this).f(237239984) / 24][((ek) this).a(true) / 24]) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                    bg.field_o[((ek) this).field_F].e(var3_int, var4, ((ek) this).field_H);
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ek.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_E = null;
    }

    final void g(int param0) {
        int fieldTemp$3 = ((ek) this).field_D + 1;
        ((ek) this).field_D = ((ek) this).field_D + 1;
        if (fieldTemp$3 >= 4) {
          ((ek) this).field_D = 0;
          int fieldTemp$4 = ((ek) this).field_F + 1;
          ((ek) this).field_F = ((ek) this).field_F + 1;
          if (fieldTemp$4 < bg.field_o.length) {
            if (param0 < 95) {
              ((ek) this).a(-13, -95, -104, 35);
              return;
            } else {
              return;
            }
          } else {
            if (((ek) this).field_M == 1) {
              ((ek) this).field_G = true;
              if (param0 < 95) {
                ((ek) this).a(-13, -95, -104, 35);
                return;
              } else {
                return;
              }
            } else {
              int discarded$5 = -8;
              this.f();
              if (param0 >= 95) {
                return;
              } else {
                ((ek) this).a(-13, -95, -104, 35);
                return;
              }
            }
          }
        } else {
          if (param0 >= 95) {
            return;
          } else {
            ((ek) this).a(-13, -95, -104, 35);
            return;
          }
        }
    }

    ek() {
        super(0, 0, 0);
        ((ek) this).field_D = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new nk(0);
        field_J = 5;
    }
}
