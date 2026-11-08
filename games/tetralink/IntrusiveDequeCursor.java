/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static long field_a;
    static String field_d;
    private IntrusiveDeque deque;
    private IntrusiveNode current;
    static volatile int field_f;
    static String field_c;

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.current;
          if (this.deque.sentinel == var2) {
            this.current = null;
            stackIn_2_0 = null;
            return (IntrusiveNode) (stackIn_2_0);
          }
          if (param0 != -66) {
            field_c = (String) null;
          }
          this.current = var2.previous;
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "tg.B(" + param0 + ')');
        }
    }

    final IntrusiveNode first(boolean param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.deque.sentinel.next;
          if (var2 == this.deque.sentinel) {
            this.current = null;
            stackIn_4_0 = null;
            return (IntrusiveNode) (stackIn_4_0);
          }
          if (!param0) {
            this.last(63);
          }
          this.current = var2.next;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "tg.E(" + param0 + ')');
        }
    }

    final IntrusiveNode startBackwardFrom(boolean param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
            if (TetraLink.field_J != 0) {
              var3 = this.deque.sentinel.previous;
            }
          } else {
            var3 = this.deque.sentinel.previous;
          }
          if (this.deque.sentinel == var3) {
            this.current = null;
            stackIn_7_0 = null;
            return (IntrusiveNode) (stackIn_7_0);
          }
          if (!param0) {
            field_c = (String) null;
          }
          this.current = var3.previous;
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("tg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final IntrusiveNode startForwardFrom(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            var3 = this.deque.sentinel.next;
            if (TetraLink.field_J != 0) {
              var3 = param1;
            }
          } else {
            var3 = param1;
          }
          if (var3 == this.deque.sentinel) {
            this.current = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (param0 >= -1) {
            stackIn_8_0 = (IntrusiveNode) null;
            return stackIn_8_0;
          }
          this.current = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.current;
          if (param0 != -58) {
            IntrusiveDequeCursor.releaseStatics(87);
          }
          if (this.deque.sentinel == var2) {
            this.current = null;
            stackIn_7_0 = null;
            return (IntrusiveNode) (stackIn_7_0);
          }
          this.current = var2.next;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "tg.G(" + param0 + ')');
        }
    }

    final IntrusiveNode last(int param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        IntrusiveNode stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.deque.sentinel.previous;
          if (var2 == this.deque.sentinel) {
            this.current = null;
            stackIn_2_0 = null;
            return (IntrusiveNode) (stackIn_2_0);
          }
          this.current = var2.previous;
          var3 = -100 / ((param0 - 40) / 42);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "tg.F(" + param0 + ')');
        }
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.deque = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_c = null;
          field_d = null;
          if (param0 != 0) {
            field_f = 18;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "tg.D(" + param0 + ')');
        }
    }

    final static void initializeChatWidgets(int param0, UiComponent param1, UiComponent param2, BitmapFont param3, UiComponent param4, UiComponent param5, UiComponent param6, UiComponent param7, boolean param8, UiComponent param9, UiComponent param10, VerticalScrollbar param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        UiComponent var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = TetraLink.field_J;
        try {
          AudioPumpThread.field_f[2] = 9474303;
          AudioPumpThread.field_f[0] = 16764000;
          CachedTextLayout.field_k = param3;
          AudioPumpThread.field_f[1] = 6356832;
          ArchiveRequest.field_A = param1;
          GzipDecompressor.field_c = param8;
          AudioPumpThread.field_f[3] = 16736511;
          AudioPumpThread.field_f[4] = 16711935;
          AudioPumpThread.field_f[4] = 16711935;
          UrlFetchTask.field_j[0] = 16764000;
          UrlFetchTask.field_j[2] = 16736352;
          ArchiveIndex.field_l = 8421504;
          UrlFetchTask.field_j[1] = 6356832;
          UrlFetchTask.field_j[3] = 16736511;
          var12 = new Sprite(4, 4);
          var13 = var12.field_C;
          var14 = var12.field_C;
          var12.field_C[15] = 7368816;
          var15 = var12.field_C;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          IsaacCipher.field_a = new UiComponent(0L, param4);
          IterableNodeHashTable.field_f = new UiComponent(0L, param10);
          IsaacCipher.field_a.addChild((byte) 73, IterableNodeHashTable.field_f);
          var17 = new UiComponent(0L, (UiComponent) null);
          var17.field_fb = new IntrusiveDeque();
          TriangleMesh.field_M = new ScrollPane(0L, var17, param5, param11);
          IterableNodeHashTable.field_f.addChild((byte) -97, TriangleMesh.field_M);
          TopLevelContainerHelpers.field_d = new UiComponent(0L, param6);
          IterableNodeHashTable.field_f.addChild((byte) -123, TopLevelContainerHelpers.field_d);
          PageReloadHelpers.field_g = new UiComponent(0L, param7);
          PageReloadHelpers.field_g.field_Ib = CachedTextLayout.field_k;
          TopLevelContainerHelpers.field_d.addChild((byte) 89, PageReloadHelpers.field_g);
          TopLevelContainerHelpers.field_d.markTreeDirty((byte) 84);
          MessageDialogContent.field_L = new UiComponent(0L, (UiComponent) null);
          MessageDialogContent.field_L.field_Eb = var16;
          TopLevelContainerHelpers.field_d.addChild((byte) -124, MessageDialogContent.field_L);
          LobbyGame.field_oc = new UiComponent[5];
          KeyEventHelpers.field_f = new UiComponent[5];
          HuffmanCodec.field_f = new UiComponent[5];
          CheckboxPainter.field_o = new UiComponent[5];
          var18 = param0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (5 <= var18))) {
            stackIn_28_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 != 0) {
                if (var18 == 1 &&
                  GzipDecompressor.field_c) {
                  var19 = KeyHandlerHelpers.field_e;
                } else {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = SoundMixerHelpers.field_b;
                  }
                }
              } else {
                if (GzipDecompressor.field_c) {
                  stackIn_24_0 = ReflectionCheck.field_v;
                } else {
                  stackIn_24_0 = MusicCrossfadeStream.field_v;
                }
                var19 = stackIn_24_0;
              }
              if (decompiledFrameRemainder0) {
                KeyEventHelpers.field_f[var18] = new UiComponent(0L, param9);
                LobbyGame.field_oc[var18] = new UiComponent(0L, ArchiveRequest.field_A, var19);
                HuffmanCodec.field_f[var18] = new UiComponent(0L, (UiComponent) null);
                HuffmanCodec.field_f[var18].field_J = 1;
                CheckboxPainter.field_o[var18] = new UiComponent(0L, ArchiveRequest.field_A);
                CheckboxPainter.field_o[var18].field_J = 1;
                KeyEventHelpers.field_f[var18].addChild((byte) -88, LobbyGame.field_oc[var18]);
                KeyEventHelpers.field_f[var18].addChild((byte) 14, HuffmanCodec.field_f[var18]);
                KeyEventHelpers.field_f[var18].addChild((byte) -106, CheckboxPainter.field_o[var18]);
                KeyEventHelpers.field_f[var18].markTreeDirty((byte) -96);
                IsaacCipher.field_a.addChild((byte) -111, KeyEventHelpers.field_f[var18]);
                QueuedListRequest.field_r = QueuedListRequest.field_r + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            NameAlphabetTable.field_e = new UiComponent(0L, param2);
            NameAlphabetTable.field_e.field_jb = RasterTargetHelpers.field_f;
            IsaacCipher.field_a.addChild((byte) 47, NameAlphabetTable.field_e);
            stackIn_28_0 = MusicCrossfadeStream.isLoginReplyPending(0) ? 1 : 0;
          }
          if (stackIn_28_0 != 0 &&
            !MenuLabelGlobals.field_a) {
            return;
          }
          TextLayoutLine.field_e = new DateOfBirthPanel(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_38_0 = var12_ref;
          stackIn_38_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param6 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param7 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param10 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param11 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_c = "Music: ";
    }
}
