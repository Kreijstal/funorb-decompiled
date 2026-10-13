/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseRepository {
    private ResourceArchive localArchive;
    static String field_e;
    static ClientUiComponent field_d;
    private WeightedLruCache phrases;
    private ResourceArchive globalArchive;
    static String field_a;

    final static boolean c(int param0) {
        if (param0 <= -97) {
          return !se.emailCheckResult.isComplete((byte) 125) ? true : false;
        }
        field_a = (String) null;
        return !se.emailCheckResult.isComplete((byte) 125) ? true : false;
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -107) {
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 27875) {
          field_d = (ClientUiComponent) null;
          if (!DamageEvent.g(81)) {
            return LoginForm.field_M <= 0 ? true : false;
          }
          return true;
        }
        if (DamageEvent.g(81)) {
          return true;
        }
        if (LoginForm.field_M > 0) {
          return false;
        }
        return true;
    }

    final static void configurePunctuationKeys(byte obfuscationGuard) {
        kw.awtToClientKeyCodes[46] = 72;
        kw.awtToClientKeyCodes[61] = 27;
        kw.awtToClientKeyCodes[192] = 28;
        kw.awtToClientKeyCodes[222] = 58;
        kw.awtToClientKeyCodes[520] = 59;
        kw.awtToClientKeyCodes[44] = 71;
        kw.awtToClientKeyCodes[93] = 43;
        kw.awtToClientKeyCodes[45] = 26;
        kw.awtToClientKeyCodes[92] = 74;
        kw.awtToClientKeyCodes[59] = 57;
        kw.awtToClientKeyCodes[91] = 42;
        if (obfuscationGuard >= 109) {
          kw.awtToClientKeyCodes[47] = 73;
          return;
        }
        field_d = (ClientUiComponent) null;
        kw.awtToClientKeyCodes[47] = 73;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != 32767) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(ck.a(-3780, var2, param1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void insertLobbyRoomSorted(int obfuscationGuard, LobbyRoom room) {
        LobbyRoom var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        java.applet.Applet var4 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          room.unlink(76);
          var2 = (LobbyRoom) (qc.lobbyRoomOrder.first((byte) 92));
          if (obfuscationGuard > -66) {
            var4 = (java.applet.Applet) null;
            QuickChatPhraseRepository.a(-6, (java.applet.Applet) null);
          }
          while (var2 != null) {
            if (var2.sortsBefore((byte) -76, room)) {
              var2 = (LobbyRoom) (qc.lobbyRoomOrder.next((byte) 123));
              continue;
            }
            break;
          }
          if (var2 == null) {
            qc.lobbyRoomOrder.addLast((byte) -119, (IntrusiveNode) (room));
            return;
          }
          stackIn_9_0 = -123;
          fj.$cfr$intArgs$a$f94c566f195c(stackIn_9_0, room, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("rf.F(").append(obfuscationGuard).append(',');
          if (room == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void popRasterState(int obfuscationGuard) {
        RasterState guardedSnapshot = null;
        Object var1 = null;
        RasterState snapshot;
        if (obfuscationGuard != -18862) {
          field_a = (String) null;
          guardedSnapshot = (RasterState) (ParasiteEvent.rasterStateStack.popLast((byte) -125));
          if (guardedSnapshot == null) {
            throw new IllegalStateException();
          }
          SoftwareRaster.setTarget(guardedSnapshot.pixels, guardedSnapshot.width, guardedSnapshot.height);
          SoftwareRaster.setClip(guardedSnapshot.clipLeft, guardedSnapshot.clipTop, guardedSnapshot.clipRight, guardedSnapshot.clipBottom);
          guardedSnapshot.pixels = null;
          EventPresenter.rasterStatePool.addLast((byte) -119, (IntrusiveNode) (guardedSnapshot));
          return;
        }
        snapshot = (RasterState) (ParasiteEvent.rasterStateStack.popLast((byte) -125));
        if (snapshot == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.setTarget(snapshot.pixels, snapshot.width, snapshot.height);
        SoftwareRaster.setClip(snapshot.clipLeft, snapshot.clipTop, snapshot.clipRight, snapshot.clipBottom);
        snapshot.pixels = null;
        EventPresenter.rasterStatePool.addLast((byte) -119, (IntrusiveNode) (snapshot));
    }

    final QuickChatPhrase getPhrase(int phraseId, int obfuscationGuard) {
        byte[] encodedPhrase = null;
        int guardRemainder = 112 % ((-78 - obfuscationGuard) / 40);
        QuickChatPhrase cachedPhrase = (QuickChatPhrase) (this.phrases.get((long)phraseId, (byte) 127));
        if (cachedPhrase != null) {
          return cachedPhrase;
        }
        if (32768 <= phraseId) {
          encodedPhrase = this.globalArchive.getFile((byte) 99, 32767 & phraseId, 1);
        } else {
          encodedPhrase = this.localArchive.getFile((byte) 118, phraseId, 1);
        }
        QuickChatPhrase phrase = new QuickChatPhrase();
        if (encodedPhrase != null) {
          phrase.decode(new PacketBuffer(encodedPhrase), (byte) 91);
          if (32768 <= phraseId) {
            phrase.applyGlobalIds(true);
            this.phrases.put(phrase, 100, (long)phraseId);
            return phrase;
          }
          this.phrases.put(phrase, 100, (long)phraseId);
          return phrase;
        }
        if (32768 > phraseId) {
          this.phrases.put(phrase, 100, (long)phraseId);
          return phrase;
        }
        phrase.applyGlobalIds(true);
        this.phrases.put(phrase, 100, (long)phraseId);
        return phrase;
    }

    QuickChatPhraseRepository(int unusedParameter, ResourceArchive localArchive, ResourceArchive globalArchive, gj unusedMarker) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.phrases = new WeightedLruCache(64);
        try {
          this.globalArchive = globalArchive;
          this.localArchive = localArchive;
          if (null != this.localArchive) {
            this.localArchive.getFileCapacity(1, -2);
          }
          if (this.globalArchive == null) {
            return;
          }
          this.globalArchive.getFileCapacity(1, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rf.<init>(").append(unusedParameter).append(',');
          if (localArchive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (globalArchive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (unusedMarker == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_e = "As a hero of Gielinor, you must choose which path to follow: align with your chosen god, or remain neutral in your devotions.";
        field_a = "Loading fonts";
    }
}
