/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    int field_c;
    static boolean field_f;
    static ModelMesh field_a;
    int[] field_d;
    static String field_e;
    int field_b;

    final int characterIndexAt(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_d != null &&
            this.field_d.length != 0) {
            if (param0 <= 83) {
              stackIn_9_0 = -89;
              return stackIn_9_0;
            }
            var3_int = 1;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (this.field_d.length <= var3_int))) {
              stackIn_20_0 = this.field_d[-1 + var3_int] + this.field_d[var3_int] >> 1;
              stackIn_20_1 = param1;
              if (var4 == 0) {
                if (stackIn_20_0 > stackIn_20_1) {
                  stackIn_17_0 = var3_int - 1;
                  return stackIn_17_0;
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_20_0 = -1;
              stackIn_20_1 = this.field_d.length;
            }
            stackIn_21_0 = stackIn_20_0 + stackIn_20_1;
            return stackIn_21_0;
          }
          stackIn_6_0 = 0;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "ri.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static SpriteWidget getBoardScrollContent(byte param0) {
        RuntimeException var1 = null;
        SpriteWidget stackIn_2_0 = null;
        SpriteWidget stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 27) {
            stackIn_4_0 = ScrollPaneWithFooter.getPlayerListContent(true);
            return stackIn_4_0;
          }
          stackIn_2_0 = (SpriteWidget) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "ri.D(" + param0 + ')');
        }
    }

    final int getRightEdge(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_c = 22;
          }
          if (this.field_d != null &&
            this.field_d.length != 0) {
            stackIn_10_0 = this.field_d[this.field_d.length - 1];
          } else {
            stackIn_10_0 = 0;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "ri.E(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 2) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ri.C(" + param0 + ')');
        }
    }

    final static void handleSocialListResponse(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        SocialListEntry var6 = null;
        SocialListEntry var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialListEntry var6Lifetime1;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = ProgressMessageDialog.field_qb;
          var2 = var1.readUnsignedByte(11132);
          if (var2 == 0) {
            if (null == TextLayout.field_a) {
              TextLayout.field_a = new DualLinkHashTable(128);
              StrongCacheReference.field_z = 0;
            }
            stackIn_11_0 = (1 != var1.readUnsignedByte(11132)) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readString(-122);
            if (var3_int != 0) {
              var5 = var1.readString(-118);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = ClientServiceHelpers.findFriendByName((byte) 119, var4_ref_String);
            var7_ref = var1.readString(-119);
            var8 = DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_String), true);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = ClientServiceHelpers.findFriendByName((byte) 42, var7_ref);
              if (var6 != null) {
                TextLayout.field_a.put((long)var8.hashCode(), var6, 30804);
              }
            }
            if (var6 == null) {
              var6 = new SocialListEntry();
              TextLayout.field_a.put((long)var8.hashCode(), var6, 30804);
              fieldTemp$1 = StrongCacheReference.field_z;
              StrongCacheReference.field_z = StrongCacheReference.field_z + 1;
              var6.field_Nb = fieldTemp$1;
              LoginMethodHelpers.field_c.addFirst(var6, (byte) -58);
            }
            var6.field_Hb = var4_ref_String;
            var6.field_Ob = var5;
            var6.field_Jb = var7_ref;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (CachedArchiveSource.field_q == 1) {
                CachedArchiveSource.field_q = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (CachedArchiveSource.field_q == 2) {
                CachedArchiveSource.field_q = 1;
              }
              return;
            }
            if (4 == var2) {
              CachedArchiveSource.field_q = 1;
              var3 = var1.readString(-122);
              AudioSetupHelpers.field_a = ((String) (var3)).intern();
              var4 = var1.readUnsignedByte(11132);
              ChatSettingsHelpers.unpackChatFilterSettings(true, var4);
              return;
            }
            IconLabelWidget.reportClientError("F1: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
            if (param0 <= 44) {
              TextLayoutLine.handleSocialListResponse((byte) -47);
            }
            MenuInputState.closeGameConnection(false);
            return;
          }
          if (CachedArchiveSource.field_h == null) {
            CachedArchiveSource.field_h = new DualLinkHashTable(128);
            PatchNoteUsage.field_j = 0;
          }
          var3Lifetime1 = var1.readString(-128);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(-119);
          var5Lifetime1 = var1.readString(-120);
          var6Lifetime1 = NodeHashTableIterator.findListEntryByName(0, var4_ref_StringLifetime1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = NodeHashTableIterator.findListEntryByName(0, var5Lifetime1);
            if (null != var6Lifetime1) {
              CachedArchiveSource.field_h.put((long)DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, 30804);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialListEntry();
            CachedArchiveSource.field_h.put((long)DisplayNameHelpers.normalizeDisplayName((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, 30804);
            fieldTemp$0 = PatchNoteUsage.field_j;
            PatchNoteUsage.field_j = PatchNoteUsage.field_j + 1;
            var6Lifetime1.field_Nb = fieldTemp$0;
            LoginMethod.field_f.addFirst(var6Lifetime1, (byte) -96);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Hb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Jb = var5Lifetime1;
          var6Lifetime1.field_Pb = (String) (var3Lifetime1);
          var6Lifetime1.unlink(false);
          var7 = (SocialListEntry) (LoginMethod.field_f.first((byte) -27));
          while (null != var7) {
            if (QuickChatCategoryCache.sortsBefore((byte) 23, var6Lifetime1, var7)) {
              var7 = (SocialListEntry) (LoginMethod.field_f.next(16213));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (null == var7) {
            LoginMethod.field_f.addFirst(var6Lifetime1, (byte) -77);
            if (var9 == 0) {
              return;
            }
          }
          CanvasPresentHelpers.insertAfter(var7, (byte) -61, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1_ref), "ri.B(" + param0 + ')');
        }
    }

    TextLayoutLine(int param0, int param1, int param2) {
        try {
          this.field_b = param1;
          this.field_c = param0;
          this.field_d = new int[param2 + 1];
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ri.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Your game";
    }
}
