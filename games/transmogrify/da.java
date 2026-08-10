/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends fi {
    static String field_B;
    private qj field_D;
    static String field_A;
    static String field_z;
    static int field_C;
    static int field_y;

    public static void i(int param0) {
        field_z = null;
        if (param0 != 0) {
            return;
        }
        field_A = null;
        field_B = null;
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((bi.field_L ^ -1) <= -11) {
                if (!ki.b(true)) {
                  sb.c();
                  ub.a(320, 240, (byte) 116);
                  ah.a(0, 0, (byte) 110, param2);
                  break L1;
                } else {
                  if (gl.field_y == 0) {
                    ec.a(false, param0, -124);
                    ah.a(0, 0, (byte) 104, param2);
                    break L1;
                  } else {
                    ng.a(false, param2);
                    break L1;
                  }
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (!kb.field_l) {
                    break L2;
                  } else {
                    kb.field_l = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                jk.a(gj.field_a, (byte) -119, be.b(71), mh.b(100), var3_int != 0);
                break L1;
              }
            }
            L3: {
              if (param1 > 63) {
                break L3;
              } else {
                var5 = (java.awt.Canvas) null;
                da.a(false, (byte) -103, (java.awt.Canvas) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("da.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public da() {
        super(0, 0, cd.field_b, wj.field_h, (ui) null, (ma) null);
        this.field_D = new qj();
    }

    final mk e(byte param0) {
        int var2;
        tl var3;
        mk var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = -31 % ((param0 - -59) / 47);
        var3 = new tl(this.field_D);
        var4 = (mk) ((Object) var3.c(-101));
        L0: while (true) {
          if (var4 != null) {
            if (var4.field_A) {
              return var4;
            } else {
              var4 = (mk) ((Object) var3.a(405142401));
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_D);
        if (param0 != 31410) {
            field_B = (String) null;
        }
        mk var3 = (mk) ((Object) var2.c(-121));
        while (var3 != null) {
            var3.field_A = false;
            var3 = (mk) ((Object) var2.a(param0 ^ 405111091));
        }
        this.field_v = null;
    }

    final qg d(byte param0) {
        tl var2;
        mk var3;
        int var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(this.field_D);
        var4 = 71 % ((51 - param0) / 48);
        var3 = (mk) ((Object) var2.c(-116));
        L0: while (true) {
          if (var3 != null) {
            if (!var3.field_A) {
              var3 = (mk) ((Object) var2.a(405142401));
              continue L0;
            } else {
              return var3.i(-116);
            }
          } else {
            return null;
          }
        }
    }

    final void l(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_D);
        mk var3 = (mk) ((Object) var2.c(-116));
        if (param0 != 0) {
            field_A = (String) null;
        }
        while (var3 != null) {
            if (var3.m(0)) {
                var3.c(param0 ^ 5);
            }
            var3 = (mk) ((Object) var2.a(param0 ^ 405142401));
        }
        this.field_v = (qg) ((Object) this.e((byte) -107));
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = tg.a(-54, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("da.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        if (this.field_q != null) {
            this.field_q.a(param0, param1, true, (byte) 126, (qg) (this));
        }
        tl var5 = new tl(this.field_D);
        qg var6 = (qg) ((Object) var5.a((byte) 62));
        int var7 = -24 % ((param3 - 77) / 34);
        while (var6 != null) {
            var6.a(param0 - -this.field_p, this.field_n + param1, param2, (byte) -95);
            var6 = (qg) ((Object) var5.b(-29339));
        }
    }

    final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= 124) {
            field_y = -112;
        }
        tl var2 = new tl(this.field_D);
        mk var3 = (mk) ((Object) var2.c(-120));
        while (var3 != null) {
            if (!(!var3.a((byte) -97))) {
                var3.c(5);
            }
            var3 = (mk) ((Object) var2.a(405142401));
        }
    }

    final void b(qg param0, byte param1) {
        mk var3 = null;
        try {
            if (!(param0 instanceof mk)) {
                throw new IllegalArgumentException();
            }
            var3 = (mk) ((Object) param0);
            if (param1 != -71) {
                field_C = 1;
            }
            this.field_D.a((wf) (var3), (byte) 33);
            var3.field_A = true;
            var3.a((qg) (this), param1 + 51);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "da.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_A = "Create";
        field_C = 0;
        field_B = "Log in";
        field_z = "Submit";
        field_y = 0;
    }
}
