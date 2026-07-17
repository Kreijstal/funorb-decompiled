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
        fl var2 = null;
        ul var3 = null;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var2 = new fl(((gg) this).field_B);
          if (param0 == 0) {
            break L0;
          } else {
            ((gg) this).f((byte) 57);
            break L0;
          }
        }
        var3 = (ul) (Object) var2.b(param0 ^ 1);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_F) {
              return var3;
            } else {
              var3 = (ul) (Object) var2.c(0);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final ag a(byte param0) {
        fl var2 = null;
        ul var3 = null;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var2 = new fl(((gg) this).field_B);
          if (param0 == -83) {
            break L0;
          } else {
            ((gg) this).e((byte) 9);
            break L0;
          }
        }
        var3 = (ul) (Object) var2.b(1);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_F) {
              var3 = (ul) (Object) var2.c(0);
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
        fl var2 = new fl(((gg) this).field_B);
        if (param0 > -65) {
            ul discarded$0 = ((gg) this).k(-75);
        }
        ul var3 = (ul) (Object) var2.b(1);
        while (var3 != null) {
            if (!(!var3.j(-15953))) {
                var3.b(121);
            }
            var3 = (ul) (Object) var2.c(0);
        }
    }

    final void c(ag param0, int param1) {
        ul var3 = null;
        RuntimeException var3_ref = null;
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
            if (!(param0 instanceof ul)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (ul) (Object) param0;
                ((gg) this).field_B.a((byte) -102, (am) (Object) var3);
                var3.field_F = true;
                boolean discarded$7 = var3.a((byte) -90, (ag) this);
                if (param1 >= 78) {
                  break L1;
                } else {
                  ((gg) this).e((byte) 84);
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
            stackOut_6_1 = new StringBuilder().append("gg.R(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void e(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 114) {
            Object var5 = null;
            ((gg) this).c((ag) null, 99);
        }
        fl var2 = new fl(((gg) this).field_B);
        ul var3 = (ul) (Object) var2.b(param0 + -113);
        while (var3 != null) {
            if (var3.l(param0 + 65279)) {
                var3.b(127);
            }
            var3 = (ul) (Object) var2.c(0);
        }
        ((gg) this).field_A = (ag) (Object) ((gg) this).k(0);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (null != ((gg) this).field_h) {
            ((gg) this).field_h.a(param0, param1, 15430, (ag) this, true);
        }
        fl var5 = new fl(((gg) this).field_B);
        if (param2 <= 42) {
            return;
        }
        ag var6 = (ag) (Object) var5.a(0);
        while (var6 != null) {
            var6.a(param0 - -((gg) this).field_m, ((gg) this).field_v + param1, (byte) 120, param3);
            var6 = (ag) (Object) var5.a(false);
        }
    }

    public gg() {
        super(0, 0, mm.field_q, fb.field_f, (nn) null, (mh) null);
        ((gg) this).field_B = new vl();
    }

    final void f(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 32) {
            return;
        }
        fl var2 = new fl(((gg) this).field_B);
        ul var3 = (ul) (Object) var2.b(1);
        while (var3 != null) {
            var3.field_F = false;
            var3 = (ul) (Object) var2.c(param0 + -32);
        }
        ((gg) this).field_A = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Age:";
        field_C = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
