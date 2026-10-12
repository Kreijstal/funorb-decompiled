/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ms extends IntrusiveNode {
    static String field_m;
    ms field_l;
    static int field_t;
    static boolean field_o;
    long field_q;
    static je field_k;
    ms field_s;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean a(byte param0) {
        if (this.field_l == null) {
          return false;
        }
        int var2 = 106 / ((10 - param0) / 60);
        return true;
    }

    final void c(byte param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_l.field_s = this.field_s;
        this.field_s.field_l = this.field_l;
        if (param0 == -76) {
          this.field_s = null;
          this.field_l = null;
          return;
        }
        this.a(true, -70L);
        this.field_s = null;
        this.field_l = null;
    }

    final static int a(int param0, og[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          while (true) {
            if (-1 + param1.length <= var3_int) {
              if (param2 < -81) {
                stackIn_13_0 = -1 + param1.length;
                return stackIn_13_0;
              }
              stackIn_11_0 = -74;
              return stackIn_11_0;
            }
            if ((param0 - 1) >= param1[1 + var3_int].field_s) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ms.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
          return;
        }
        field_n = null;
        field_p = null;
        field_k = null;
        field_m = null;
    }

    final long a(int param0) {
        if (param0 < 101) {
          field_o = true;
          return this.field_q;
        }
        return this.field_q;
    }

    final void a(boolean param0, long param1) {
        if (this.field_l != null) {
          throw new RuntimeException();
        }
        if (param0) {
          this.field_q = param1;
          return;
        }
        this.field_l = (ms) null;
        this.field_q = param1;
    }

    final static void e(int param0) {
        int var1;
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 >= 111) {
          ac.field_n = false;
          BestScoreStrategy.field_h = null;
          if (fh.field_i) {
            qc.field_a.o(4259);
            return;
          }
          var1 = vt.field_n;
          if (var1 > 0) {
            if (1 != var1) {
              BestScoreStrategy.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
            } else {
              BestScoreStrategy.field_h = TrianglePulse.field_a;
            }
            BestScoreStrategy.field_h = SpellCastEvent.a(593277313, new CharSequence[]{(CharSequence) ((Object) BestScoreStrategy.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
          }
          qc.field_a.b(true);
          qf.a(56);
          return;
        }
        ms.e(75);
        ac.field_n = false;
        BestScoreStrategy.field_h = null;
        if (fh.field_i) {
          qc.field_a.o(4259);
        } else {
          var1 = vt.field_n;
          if (var1 > 0) {
            if (1 != var1) {
              BestScoreStrategy.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
            } else {
              BestScoreStrategy.field_h = TrianglePulse.field_a;
            }
            BestScoreStrategy.field_h = SpellCastEvent.a(593277313, new CharSequence[]{(CharSequence) ((Object) BestScoreStrategy.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
          }
          qc.field_a.b(true);
          qf.a(56);
        }
    }

    protected ms() {
    }

    static {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
