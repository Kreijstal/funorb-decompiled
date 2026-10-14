/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeQueue {
    static RgbSprite field_d;
    static String field_c;
    static int[] field_b;
    private DualLinkNode sentinel;
    private DualLinkNode cursor;
    static String field_e;
    static String field_a;

    final static void d(int param0) {
        MusicCrossfadeStream.nameEntryPopup = null;
        int var1 = -1 / ((42 - param0) / 59);
    }

    final void addLast(DualLinkNode node, boolean obfuscationGuard) {
        try {
          if (node.secondaryPrevious != null) {
            node.unlinkSecondary(3);
          }
          if (obfuscationGuard) {
            ResourceArchive var4 = (ResourceArchive) null;
            SecondaryNodeQueue.loadIndexedSprite(-17, 78, 86, (ResourceArchive) null);
          }
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lq.I(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final DualLinkNode removeFirst(int obfuscationGuard) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (obfuscationGuard != 25609) {
          this.sentinel = (DualLinkNode) null;
          var2 = this.sentinel.secondaryNext;
          if (this.sentinel != var2) {
            var2.unlinkSecondary(obfuscationGuard ^ 25610);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.secondaryNext;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlinkSecondary(obfuscationGuard ^ 25610);
          return var2Lifetime1;
        }
        return null;
    }

    final DualLinkNode next(int obfuscationGuard) {
        DualLinkNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        if (obfuscationGuard == -8394) {
          return var2;
        }
        DualLinkNode var3 = (DualLinkNode) null;
        this.addLast((DualLinkNode) null, true);
        return var2;
    }

    final DualLinkNode first(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        return var2;
    }

    final int size(int obfuscationGuard) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = 0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        if (obfuscationGuard != -25906) {
          return 88;
        }
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.secondaryNext;
        }
        return var2;
    }

    final static QuickChatParameterType[] getQuickChatParameterTypes(int obfuscationGuard) {
        if (obfuscationGuard == 0) {
          return new QuickChatParameterType[]{un.field_b, IntrusiveNode.field_c, Bzip2State.field_r, BirthDateValidator.field_i, o.field_h, GrowableIntList.field_m, wi.field_i, ba.field_B, pa.field_k, ScrollPaneWithFooter.field_Sb, CacheEntry.field_B, IntrusiveHashTable.field_o, IntNode.field_i, MusicVoiceMixer.field_o};
        }
        field_e = (String) null;
        return new QuickChatParameterType[]{un.field_b, IntrusiveNode.field_c, Bzip2State.field_r, BirthDateValidator.field_i, o.field_h, GrowableIntList.field_m, wi.field_i, ba.field_B, pa.field_k, ScrollPaneWithFooter.field_Sb, CacheEntry.field_B, IntrusiveHashTable.field_o, IntNode.field_i, MusicVoiceMixer.field_o};
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0) {
          field_e = null;
          field_c = null;
          return;
        }
        SecondaryNodeQueue.b(false);
        field_e = null;
        field_c = null;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3, ResourceArchive param4) {
        try {
          BallPulseEffect.field_j = param1;
          NineSliceFrame.field_g = param3;
          ic.field_a = param0;
          ArrayWidgetGroup.field_G = param4;
          GameScreen.field_e = new SoundCache(ArrayWidgetGroup.field_G, NineSliceFrame.field_g);
          if (param2 != -38) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite loadIndexedSprite(int obfuscationGuard, int groupId, int fileId, ResourceArchive archive) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ln.decodeSpritesFromArchive(-105, fileId, archive, groupId)) {
            stackIn_2_0 = null;
            return (IndexedSprite) (stackIn_2_0);
          }
          if (obfuscationGuard != 0) {
            SecondaryNodeQueue.d(-20);
          }
          stackIn_6_0 = LevelSelectScreen.buildIndexedSprite(false);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("lq.E(").append(obfuscationGuard).append(',').append(groupId).append(',').append(fileId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public SecondaryNodeQueue() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryNext = this.sentinel;
        this.sentinel.secondaryPrevious = this.sentinel;
    }

    static {
        field_c = "Go!";
        field_a = "Invite players";
    }
}
