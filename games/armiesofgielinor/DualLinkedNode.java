/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkedNode extends IntrusiveNode {
    static String field_m;
    DualLinkedNode secondaryPrevious;
    static int field_t;
    static boolean field_o;
    long secondaryKey;
    static ClientUiComponent field_k;
    DualLinkedNode secondaryNext;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean isSecondaryLinked(byte obfuscationGuard) {
        if (this.secondaryPrevious == null) {
          return false;
        }
        int var2 = 106 / ((10 - obfuscationGuard) / 60);
        return true;
    }

    final void unlinkSecondary(byte obfuscationGuard) {
        if (this.secondaryPrevious == null) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        if (obfuscationGuard == -76) {
          this.secondaryNext = null;
          this.secondaryPrevious = null;
          return;
        }
        this.setSecondaryKey(true, -70L);
        this.secondaryNext = null;
        this.secondaryPrevious = null;
    }

    final static int a(int param0, ConsoleExpression[] param1, int param2) {
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
            if ((param0 - 1) >= param1[1 + var3_int].sourceOffset) {
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
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

    final long getSecondaryKey(int obfuscationGuard) {
        if (obfuscationGuard < 101) {
          field_o = true;
          return this.secondaryKey;
        }
        return this.secondaryKey;
    }

    final void setSecondaryKey(boolean obfuscationGuard, long key) {
        if (this.secondaryPrevious != null) {
          throw new RuntimeException();
        }
        if (obfuscationGuard) {
          this.secondaryKey = key;
          return;
        }
        this.secondaryPrevious = (DualLinkedNode) null;
        this.secondaryKey = key;
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
        DualLinkedNode.e(75);
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

    protected DualLinkedNode() {
    }

    static {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
