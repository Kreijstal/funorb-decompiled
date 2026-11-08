/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputQueue {
    private IntrusiveDeque field_b;
    private QueuedInput[] field_e;
    static String field_c;
    static String field_a;
    static int field_d;

    final int poll(boolean param0) {
        QueuedInput var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_c = (String) null;
          }
          var2 = (QueuedInput) (this.field_b.first(1504642273));
          if (null == var2) {
            stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          var2.unlink(2779);
          stackIn_7_0 = var2.field_k;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var2_ref), "ee.D(" + param0 + ')');
        }
    }

    final static void readFriendListPacket(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_49_0;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialListEntry var6 = null;
        String var7 = null;
        SocialListEntry var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialListEntry var6Lifetime1;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = MusicCrossfadeStream.field_o;
          var2 = var1.readUnsignedByte(255);
          if (var2 == 0) {
            if (null == GameResultsScreen.field_q) {
              GameResultsScreen.field_q = new SecondaryNodeHashTable(128);
              ReflectionCheckRequest.field_t = 0;
            }
            stackIn_11_0 = (var1.readUnsignedByte(255) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readString(5);
            if (var3_int != 0) {
              var5 = var1.readString(5);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = DisplayNameForm.findFriend(var4_ref_String, -106);
            var7 = var1.readString(5);
            var8 = DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_String), (byte) 100);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = DisplayNameForm.findFriend(var7, 69);
              if (null != var6) {
                GameResultsScreen.field_q.put(false, var6, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new SocialListEntry();
              GameResultsScreen.field_q.put(false, var6, (long)var8.hashCode());
              fieldTemp$0 = ReflectionCheckRequest.field_t;
              ReflectionCheckRequest.field_t = ReflectionCheckRequest.field_t + 1;
              var6.field_Kb = fieldTemp$0;
              LegacyMenuBuilder.field_b.addLast(22125, var6);
            }
            var6.field_Ib = var5;
            var6.field_Fb = var4_ref_String;
            var6.field_Gb = var7;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (ValidatedTextWidget.field_db == 1) {
                ValidatedTextWidget.field_db = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (ValidatedTextWidget.field_db == 2) {
                ValidatedTextWidget.field_db = 1;
              }
              return;
            }
            if (4 != var2) {
              CheckboxPainter.reportClientError(1, "F1: " + Cloud.describePacketHistory(-8), (Throwable) null);
              if (param0 >= -89) {
                return;
              }
              GameSocketHelpers.closeGameSocket(true);
              return;
            }
            ValidatedTextWidget.field_db = 1;
            var3 = var1.readString(5);
            LabeledField.field_L = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(255);
            LobbyGameLookupHelpers.unpackChatFilterSettings(var4, (byte) -113);
            return;
          }
          if (null == LobbyGameLookupHelpers.field_b) {
            LobbyGameLookupHelpers.field_b = new SecondaryNodeHashTable(128);
            DialWidgetPainter.field_q = 0;
          }
          var3Lifetime1 = var1.readString(5);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(5);
          var5Lifetime1 = var1.readString(5);
          var6Lifetime1 = LoadingStepTracker.findFriend(var4_ref_StringLifetime1, -1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = LoadingStepTracker.findFriend(var5Lifetime1, -1);
            if (null != var6Lifetime1) {
              LobbyGameLookupHelpers.field_b.put(false, var6Lifetime1, (long)DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 29).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialListEntry();
            LobbyGameLookupHelpers.field_b.put(false, var6Lifetime1, (long)DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 70).hashCode());
            fieldTemp$1 = DialWidgetPainter.field_q;
            DialWidgetPainter.field_q = DialWidgetPainter.field_q + 1;
            var6Lifetime1.field_Kb = fieldTemp$1;
            VerticalScrollbar.field_Hb.addLast(22125, var6Lifetime1);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Fb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Nb = (String) (var3Lifetime1);
          var6Lifetime1.field_Gb = var5Lifetime1;
          var6Lifetime1.unlink(2779);
          var7_ref = (SocialListEntry) (VerticalScrollbar.field_Hb.first(1504642273));
          scanLoop1: while (true) {
            if (null != var7_ref) {
              stackOut_49_0 = DebouncedValidator.comesBeforeFriend((byte) 115, var6Lifetime1, var7_ref);
              stackIn_60_0 = stackOut_49_0 ? 1 : 0;
              stackIn_50_0 = stackOut_49_0;
              if (var9 != 0) {
                break scanLoop1;
              }
              if (stackIn_50_0) {
                var7_ref = (SocialListEntry) (VerticalScrollbar.field_Hb.next(1504642273));
                continue;
              }
            }
            if (null == var7_ref) {
              VerticalScrollbar.field_Hb.addLast(22125, var6Lifetime1);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_60_0 = 95;
            break;
          }
          BackgroundScene.insertNodeBefore(stackIn_60_0, var7_ref, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1_ref), "ee.C(" + param0 + ')');
        }
    }

    final void clear(int param0) {
        if (param0 != -1) {
          return;
        }
        try {
          this.field_b.clear(77);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ee.G(" + param0 + ')');
        }
    }

    final int pollDueInput(int param0, byte param1) {
        QueuedInput discarded$1 = null;
        QueuedInput var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (QueuedInput) (this.field_b.first(1504642273));
          if (param1 >= -14) {
            discarded$1 = this.obtainQueuedInput(-71, -29, (byte) 37);
          }
          if (var3 != null &&
            var3.field_m < param0) {
            var3.unlink(2779);
            stackIn_10_0 = var3.field_k;
            return stackIn_10_0;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var3_ref), "ee.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -3) {
            field_c = (String) null;
          }
          field_a = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ee.H(" + param0 + ')');
        }
    }

    private final QueuedInput obtainQueuedInput(int param0, int param1, byte param2) {
        Object var4 = null;
        int var5 = 0;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        try {
          var4 = null;
          for (var5 = 0; var5 < this.field_e.length; var5++) {
            if (this.field_e[var5].isLinked(0)) {
              continue;
            }
            var4 = this.field_e[var5];
            break;
          }
          if (null == var4) {
            var4 = new QueuedInput();
          }
          ((QueuedInput) (var4)).field_k = param1;
          ((QueuedInput) (var4)).field_m = param0;
          var5Lifetime1 = -104 / ((-22 - param2) / 50);
          stackIn_12_0 = var4;
          return (QueuedInput) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) (var4), "ee.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    InputQueue() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_b = new IntrusiveDeque();
          this.field_e = new QueuedInput[10];
          var1_int = 0;
          while (var1_int < 10) {
            this.field_e[var1_int] = new QueuedInput();
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ee.<init>()");
        }
    }

    final static void compactMeshBlocks(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = DateInputWidget.field_N[param0];
          var2 = 1;
          while (var2 < DateInputWidget.field_N.length) {
            var3 = DateInputWidget.field_N[var2];
            ArraySupport.copyInts(HowToPlayDemoHelpers.field_c, var2 << 4, HowToPlayDemoHelpers.field_c, var1_int, var3);
            var1_int = var1_int + var3;
            var2++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ee.A(" + param0 + ')');
        }
    }

    final void enqueue(int param0, int param1, int param2) {
        try {
          this.field_b.addLast(22125, this.obtainQueuedInput(param0, param2, (byte) 109));
          if (param1 != 0) {
            this.enqueue(-120, 48, 81);
          }
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ee.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Message game";
        field_a = "Please log in as a subscribing member to access this feature.";
    }
}
