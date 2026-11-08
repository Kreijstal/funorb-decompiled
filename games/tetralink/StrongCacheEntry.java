/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends CacheEntry {
    private Object field_F;
    static IntrusiveDeque field_E;
    static String field_H;
    static String field_K;
    static int field_J;
    static int field_I;
    static String field_G;
    static UiComponent field_D;

    public static void releaseStatics(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_H = null;
          field_K = null;
          if (param0 != -103) {
            field_G = (String) null;
          }
          field_G = null;
          field_E = null;
          field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "wc.H(" + param0 + ')');
        }
    }

    final static void handleFriendListPacket(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        SocialListEntry stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        SocialListEntry stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
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
        var9 = TetraLink.field_J;
        try {
          var1 = BackgroundSparkle.field_q;
          var2 = var1.readUnsignedByte((byte) -99);
          if (0 == var2) {
            if (null == LoginDialog.field_nb) {
              LoginDialog.field_nb = new DualLinkNodeHashTable(128);
              SocketConnector.field_c = 0;
            }
            stackIn_11_0 = (var1.readUnsignedByte((byte) -99) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readString((byte) 81);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.readString((byte) 81);
            }
            var6 = HuffmanCodec.findSocialEntryByName(-32055, var4_ref_String);
            var7 = var1.readString((byte) 81);
            var8 = DialWidgetPainter.normalizeDisplayName((CharSequence) ((Object) var4_ref_String), (byte) 98);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = HuffmanCodec.findSocialEntryByName(-32055, var7);
              if (null != var6) {
                LoginDialog.field_nb.put((long)var8.hashCode(), var6, param0 + 104);
              }
            }
            if (var6 == null) {
              var6 = new SocialListEntry();
              LoginDialog.field_nb.put((long)var8.hashCode(), var6, 113);
              fieldTemp$0 = SocketConnector.field_c;
              SocketConnector.field_c = SocketConnector.field_c + 1;
              var6.field_Rb = fieldTemp$0;
              PasswordValidator.field_s.addLast(var6, false);
            }
            var6.field_Lb = var5;
            var6.field_Vb = var7;
            var6.field_Mb = var4_ref_String;
            return;
          }
          if (param0 != var2) {
            if (var2 == 2) {
              if (1 == TwoColumnListPanel.field_Tb) {
                TwoColumnListPanel.field_Tb = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == TwoColumnListPanel.field_Tb) {
                TwoColumnListPanel.field_Tb = 1;
              }
              return;
            }
            if (4 != var2) {
              HotspotTextWidget.reportClientError(-97, (Throwable) null, "F1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            TwoColumnListPanel.field_Tb = 1;
            var3 = var1.readString((byte) 81);
            SpriteCheckboxPainter.field_e = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte((byte) -99);
            LobbyPlayerEntry.unpackChatFilterSettings(var4, 3);
            return;
          }
          if (null == DelegatingCanvas.field_f) {
            DelegatingCanvas.field_f = new DualLinkNodeHashTable(128);
            SparkParticle.field_q = 0;
          }
          var3Lifetime1 = var1.readString((byte) 81);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString((byte) 81);
          var5Lifetime1 = var1.readString((byte) 81);
          var6Lifetime1 = DiskCacheWorker.findFriendByName(var4_ref_StringLifetime1, false);
          if (null == var6Lifetime1) {
            var6Lifetime1 = DiskCacheWorker.findFriendByName(var5Lifetime1, false);
            if (null != var6Lifetime1) {
              DelegatingCanvas.field_f.put((long)DialWidgetPainter.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 124).hashCode(), var6Lifetime1, 106);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialListEntry();
            DelegatingCanvas.field_f.put((long)DialWidgetPainter.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 95).hashCode(), var6Lifetime1, 96);
            fieldTemp$1 = SparkParticle.field_q;
            SparkParticle.field_q = SparkParticle.field_q + 1;
            var6Lifetime1.field_Rb = fieldTemp$1;
            CheckboxPainter.field_j.addLast(var6Lifetime1, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Mb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Ub = (String) (var3Lifetime1);
          var6Lifetime1.field_Vb = var5Lifetime1;
          var6Lifetime1.unlink(false);
          var7_ref = (SocialListEntry) (CheckboxPainter.field_j.first(false));
          scanLoop1: while (true) {
            if (null != var7_ref) {
              stackIn_59_0 = var6Lifetime1;
              stackIn_59_1 = 126;
              stackIn_59_2 = var7_ref;
              if (var9 != 0) {
                break scanLoop1;
              }
              if (ReportAbuseDialog.socialRowPrecedesIntArgs(stackIn_59_0, stackIn_59_1, stackIn_59_2)) {
                var7_ref = (SocialListEntry) (CheckboxPainter.field_j.next((byte) -70));
                continue;
              }
            }
            if (var7_ref == null) {
              CheckboxPainter.field_j.addLast(var6Lifetime1, false);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_59_0 = var7_ref;
            stackIn_59_1 = 10;
            stackIn_59_2 = var6Lifetime1;
            break;
          }
          MenuScreen.insertNodeBefore(stackIn_59_0, stackIn_59_1, stackIn_59_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "wc.F(" + param0 + ')');
        }
    }

    final Object getValue(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 22850) {
            stackIn_4_0 = this.field_F;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Object) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "wc.B(" + param0 + ')');
        }
    }

    StrongCacheEntry(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_F = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void clearDepthBuckets(int param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var1 = GraphicsSettings.field_m;
          var2 = 0;
          var3 = var1.length;
          while (var3 > var2) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          if (param0 != 3) {
            StrongCacheEntry.releaseStatics((byte) 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wc.G(" + param0 + ')');
        }
    }

    final boolean isSoftReference(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 37) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "wc.A(" + param0 + ')');
        }
    }

    static {
        field_E = new IntrusiveDeque();
        field_K = "Unfortunately you are not eligible to create an account.";
        field_H = "You have resigned and are offering a rematch.";
        field_G = "Connection timed out. Please try using a different server.";
    }
}
