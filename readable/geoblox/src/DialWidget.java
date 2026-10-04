/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidget extends ButtonWidget {
    static UiFontResources contentFadeInPhase;
    static MusicScore bakingMusicTrack;
    static String js5IoErrorText;
    int centerOffsetX;
    int stepCount;
    int centerOffsetY;
    static String fullscreenMembersButtonText;
    static int field_G;
    int secondaryMarkerStep;
    int selectedStep;
    int radius;

    final static HighscoreQuery getOrRequestHighscores(int queryId, int valuesPerEntry, int methodGuard, int entryLimit, int packetOpcode) {
        int var6 = Geoblox.clientControlFlowFlag;
        HighscoreQuery var5 = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.firstForIteration(methodGuard ^ methodGuard));
        while (var5 != null) {
            if (~var5.queryId == ~queryId) {
                return var5;
            }
            var5 = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.nextForIteration(1));
        }
        var5 = new HighscoreQuery();
        var5.entryLimit = entryLimit;
        var5.valuesPerEntry = valuesPerEntry;
        var5.queryId = queryId;
        ResourceArchive.pendingHighscoreQueries.addLast(-71, var5);
        DebouncedValidationProvider.writeHighscoreRequest(packetOpcode, methodGuard + 5, var5);
        return var5;
    }

    public static void f(int param0) {
        js5IoErrorText = null;
        bakingMusicTrack = null;
        if (param0 != 0) {
            bakingMusicTrack = (MusicScore) null;
        }
        contentFadeInPhase = null;
        fullscreenMembersButtonText = null;
    }

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Geoblox.clientControlFlowFlag;
        try {
          if (!super.handlePointerPress(parentY, -52, parentX, pointerButton, pointerX, pointerY, eventContext)) {
            var8_int = 35 % ((-3 - methodGuard) / 38);
            return false;
          }
          var8_int = -this.centerOffsetX - (this.widgetX + (parentX - pointerX));
          var9 = pointerY - (this.widgetY + parentY + this.centerOffsetY);
          if (var8_int * var8_int + var9 * var9 < this.radius * this.radius) {
            var10 = Math.atan2((double)var9, (double)var8_int) - TextInputValidator.dialReferenceAngleRadians;
            if (!(var10 < 0.0)) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.stepCount;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.stepCount;
            }
            this.selectedStep = (int)(var10 * (double)this.stepCount / 6.283185307179586);
            while (this.selectedStep >= this.stepCount) {
              this.selectedStep = this.selectedStep - this.stepCount;
            }
            while (this.selectedStep < 0) {
              this.selectedStep = this.selectedStep + this.stepCount;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("qb.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void populateCaretPositions(int spaceJustification256, TextLayoutLine line, String text, int methodGuard, BitmapFont font) {
        int characterIndex = 0;
        RuntimeException caretFailureForContext = null;
        StringBuilder caretContextBuilder = null;
        String lineDescription = null;
        StringBuilder caretContextBeforeText = null;
        String textDescription = null;
        StringBuilder caretContextBeforeFont = null;
        String fontDescription = null;
        RuntimeException caughtCaretFailure = null;
        int accumulatedJustification256 = 0;
        RuntimeException caretPopulationFailure = null;
        int markupAnchorX = 0;
        int characterCode = 0;
        int clientControlFlowSnapshot = 0;
        BitmapFont unusedFont = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          accumulatedJustification256 = 0;
          if (methodGuard != 60) {
            unusedFont = (BitmapFont) null;
            DialWidget.populateCaretPositions(-58, (TextLayoutLine) null, (String) null, -15, (BitmapFont) null);
          }
          markupAnchorX = -1;
          for (characterIndex = 1; characterIndex < text.length(); characterIndex++) {
            characterCode = text.charAt(characterIndex);
            if (60 == characterCode) {
              markupAnchorX = line.caretX[0] + (accumulatedJustification256 >> 8) + font.measureTextWidth(text.substring(0, characterIndex));
            }
            if (markupAnchorX == -1) {
              if (characterCode == 32) {
                accumulatedJustification256 = accumulatedJustification256 + spaceJustification256;
              }
              line.caretX[characterIndex] = line.caretX[0] + (accumulatedJustification256 >> 8) + font.measureTextWidth(text.substring(0, 1 + characterIndex)) - font.measureCharacterAdvance((char) characterCode);
            } else {
              line.caretX[characterIndex] = markupAnchorX;
            }
            if (characterCode != 62) {
              continue;
            }
            markupAnchorX = -1;
          }
          return;
        } catch (java.lang.RuntimeException caretException) {
          caughtCaretFailure = caretException;
          caretPopulationFailure = caughtCaretFailure;
          caretFailureForContext = caretPopulationFailure;
          caretContextBuilder = new StringBuilder().append("qb.C(").append(spaceJustification256).append(',');
          if (line == null) {
            lineDescription = "null";
          } else {
            lineDescription = "{...}";
          }
          caretContextBeforeText = ((StringBuilder) (Object) caretContextBuilder).append(lineDescription).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          caretContextBeforeFont = ((StringBuilder) (Object) caretContextBeforeText).append(textDescription).append(',').append(methodGuard).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caretFailureForContext), ((StringBuilder) (Object) caretContextBeforeFont).append(fontDescription).append(')').toString());
        }
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    static {
        contentFadeInPhase = new UiFontResources();
        js5IoErrorText = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        fullscreenMembersButtonText = "Members";
    }
}
