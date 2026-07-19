/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends mi {
    private oi field_I;
    static String field_H;
    static boolean field_J;
    static ad field_L;
    static int field_K;
    static String field_G;

    public wi() {
        super(0, 0, dh.field_a, ik.field_K, (bf) null, (ce) null);
        this.field_I = new oi();
    }

    final ub a(byte param0) {
        ub discarded$2 = null;
        pf var2 = null;
        tj var3 = null;
        int var4 = 0;
        L0: {
          var4 = wizardrun.field_H;
          var2 = new pf(this.field_I);
          var3 = (tj) ((Object) var2.a((byte) 31));
          if (param0 < -29) {
            break L0;
          } else {
            discarded$2 = this.a((byte) -88);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_H) {
              var3 = (tj) ((Object) var2.b(35));
              continue L1;
            } else {
              return var3.d(-16);
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var4 = wizardrun.field_H;
        if (param0 != -5903) {
            this.a(86, 9, -39, -76);
        }
        pf var2 = new pf(this.field_I);
        tj var3 = (tj) ((Object) var2.a((byte) 31));
        while (var3 != null) {
            if (!(!var3.a(16))) {
                var3.a(false);
            }
            var3 = (tj) ((Object) var2.b(35));
        }
    }

    final void d(boolean param0) {
        int var4 = wizardrun.field_H;
        if (param0) {
            return;
        }
        pf var2 = new pf(this.field_I);
        tj var3 = (tj) ((Object) var2.a((byte) 31));
        while (var3 != null) {
            var3.field_H = false;
            var3 = (tj) ((Object) var2.b(35));
        }
        this.field_F = null;
    }

    final tj f(int param0) {
        pf var2 = null;
        tj var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var2 = new pf(this.field_I);
        if (param0 == 0) {
          var3 = (tj) ((Object) var2.a((byte) 31));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_H) {
                var3 = (tj) ((Object) var2.b(35));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (tj) null;
        }
    }

    final void b(ub param0, byte param1) {
        tj var3 = null;
        tj discarded$0 = null;
        boolean discarded$1 = false;
        try {
            if (!(param0 instanceof tj)) {
                throw new IllegalArgumentException();
            }
            var3 = (tj) ((Object) param0);
            if (param1 < 50) {
                discarded$0 = this.f(95);
            }
            this.field_I.a(var3, -5441);
            var3.field_H = true;
            discarded$1 = var3.a((ub) (this), 8);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wi.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = wizardrun.field_H;
        if (this.field_w != null) {
            this.field_w.a(param0, param3, (ub) (this), true, true);
        }
        pf var5 = new pf(this.field_I);
        if (param1 != 0) {
            return;
        }
        ub var6 = (ub) ((Object) var5.b((byte) 69));
        while (var6 != null) {
            var6.a(this.field_o + param0, 0, param2, param3 - -this.field_l);
            var6 = (ub) ((Object) var5.a(true));
        }
    }

    public static void h(byte param0) {
        if (param0 <= 80) {
            return;
        }
        field_H = null;
        field_G = null;
        field_L = null;
    }

    final void g(byte param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(this.field_I);
        tj var3 = (tj) ((Object) var2.a((byte) 31));
        while (var3 != null) {
            if (var3.g(1)) {
                var3.a(false);
            }
            var3 = (tj) ((Object) var2.b(35));
        }
        if (param0 <= 102) {
            field_L = (ad) null;
        }
        this.field_F = (ub) ((Object) this.f(0));
    }

    static {
        field_H = "The Ice Mountain";
        field_G = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
