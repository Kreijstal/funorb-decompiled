/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkedNode extends IntrusiveNode {
    static String field_m;
    DualLinkedNode secondaryPrevious;
    static int field_t;
    static boolean automaticallySkipPlayerTurns;
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

    final static int consoleTokenAtCaret(int caretIndex, ConsoleExpression[] tokens, int obfuscationGuard) {
        int tokenIndex = 0;
        RuntimeException failure = null;
        int obfuscationControl = 0;
        int precedingToken = 0;
        int guardResult = 0;
        int lastToken = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String tokensDescription = null;
        RuntimeException caughtFailure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tokenIndex = 0;
          while (true) {
            if (-1 + tokens.length <= tokenIndex) {
              if (obfuscationGuard < -81) {
                lastToken = -1 + tokens.length;
                return lastToken;
              }
              guardResult = -74;
              return guardResult;
            }
            if ((caretIndex - 1) >= tokens[1 + tokenIndex].sourceOffset) {
              tokenIndex++;
              continue;
            }
            break;
          }
          precedingToken = tokenIndex;
          return precedingToken;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ms.FA(").append(caretIndex).append(',');
          if (tokens == null) {
            tokensDescription = "null";
          } else {
            tokensDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(tokensDescription).append(',').append(obfuscationGuard).append(')').toString());
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
          automaticallySkipPlayerTurns = true;
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
            qc.loginProgressDialog.showConnectionFailure(4259);
            return;
          }
          var1 = vt.field_n;
          if (var1 > 0) {
            if (1 != var1) {
              BestScoreStrategy.field_h = EmailCheckResult.a(4800, StandardContentDialog.field_nb, new String[]{Integer.toString(var1)});
            } else {
              BestScoreStrategy.field_h = TrianglePulse.field_a;
            }
            BestScoreStrategy.field_h = SpellCastEvent.a(593277313, new CharSequence[]{(CharSequence) ((Object) BestScoreStrategy.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
          }
          qc.loginProgressDialog.closeDialog(true);
          qf.a(56);
          return;
        }
        DualLinkedNode.e(75);
        ac.field_n = false;
        BestScoreStrategy.field_h = null;
        if (fh.field_i) {
          qc.loginProgressDialog.showConnectionFailure(4259);
        } else {
          var1 = vt.field_n;
          if (var1 > 0) {
            if (1 != var1) {
              BestScoreStrategy.field_h = EmailCheckResult.a(4800, StandardContentDialog.field_nb, new String[]{Integer.toString(var1)});
            } else {
              BestScoreStrategy.field_h = TrianglePulse.field_a;
            }
            BestScoreStrategy.field_h = SpellCastEvent.a(593277313, new CharSequence[]{(CharSequence) ((Object) BestScoreStrategy.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
          }
          qc.loginProgressDialog.closeDialog(true);
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
