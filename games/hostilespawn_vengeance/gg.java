/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends fc {
    private vl field_B;
    static String field_E;
    static String[] field_D;
    static String[] field_C;

    public static void a(boolean param0) {
        field_D = null;
        field_C = null;
        field_E = null;
        if (param0) {
            gg.a(true);
        }
    }

    final ul k(int param0) {
        fl var2;
        ul var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var2 = new fl(this.field_B);
          if (param0 == 0) {
            break L0;
          } else {
            this.f((byte) 57);
            break L0;
          }
        }
        var3 = (ul) ((Object) var2.b(param0 ^ 1));
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_F) {
              return var3;
            } else {
              var3 = (ul) ((Object) var2.c(0));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final ag a(byte param0) {
        fl var2;
        ul var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var2 = new fl(this.field_B);
          if (param0 == -83) {
            break L0;
          } else {
            this.e((byte) 9);
            break L0;
          }
        }
        var3 = (ul) ((Object) var2.b(1));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_F) {
              var3 = (ul) ((Object) var2.c(0));
              continue L1;
            } else {
              return var3.i(19011);
            }
          } else {
            return null;
          }
        }
    }

    final void l(int param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        fl var2 = new fl(this.field_B);
        if (param0 > -65) {
            this.k(-75);
        }
        ul var3 = (ul) ((Object) var2.b(1));
        while (var3 != null) {
            if (!(!var3.j(-15953))) {
                var3.b(121);
            }
            var3 = (ul) ((Object) var2.c(0));
        }
    }

    final void c(ag param0, int param1) {
        ul var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (!(param0 instanceof ul)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (ul) ((Object) param0);
                this.field_B.a((byte) -102, var3);
                var3.field_F = true;
                var3.a((byte) -90, (ag) (this));
                if (param1 >= 78) {
                  break L1;
                } else {
                  this.e((byte) 84);
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
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("gg.R(");

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
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 114) {
            ag var5 = (ag) null;
            this.c((ag) null, 99);
        }
        fl var2 = new fl(this.field_B);
        ul var3 = (ul) ((Object) var2.b(param0 + -113));
        while (var3 != null) {
            if (var3.l(param0 + 65279)) {
                var3.b(127);
            }
            var3 = (ul) ((Object) var2.c(0));
        }
        this.field_A = (ag) ((Object) this.k(0));
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_h) {
            this.field_h.a(param0, param1, 15430, (ag) (this), true);
        }
        fl var5 = new fl(this.field_B);
        if (param2 <= 42) {
            return;
        }
        ag var6 = (ag) ((Object) var5.a(0));
        while (var6 != null) {
            var6.a(param0 - -this.field_m, this.field_v + param1, (byte) 120, param3);
            var6 = (ag) ((Object) var5.a(false));
        }
    }

    public gg() {
        super(0, 0, mm.field_q, fb.field_f, (nn) null, (mh) null);
        this.field_B = new vl();
    }

    final void f(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 32) {
            return;
        }
        fl var2 = new fl(this.field_B);
        ul var3 = (ul) ((Object) var2.b(1));
        while (var3 != null) {
            var3.field_F = false;
            var3 = (ul) ((Object) var2.c(param0 + -32));
        }
        this.field_A = null;
    }

    static {
        field_E = "Age:";
        field_C = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
