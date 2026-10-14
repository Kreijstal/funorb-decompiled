/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscorePackSelector {
    static String[] field_d;
    private int buttonIndex;
    private int lastPointerY;
    int selectedPackIndex;
    static ResourceArchive field_c;
    private HighscoresScreen owner;
    private int lastPointerX;
    static String field_g;
    private int packCount;
    static UiComponent field_k;
    private boolean keyboardSelection;

    final boolean handleNavigationKey(int keyCode, char character, int obfuscationGuard) {
        int var4 = 107 / ((0 - obfuscationGuard) / 63);
        if (99 == keyCode) {
          this.selectedPackIndex = this.selectedPackIndex + 1;
          this.keyboardSelection = true;
        } else {
          if (keyCode == 98) {
            this.selectedPackIndex = this.selectedPackIndex - 1;
            this.keyboardSelection = true;
          }
        }
        if (this.selectedPackIndex < 0 ||
          this.selectedPackIndex >= this.packCount) {
          this.selectedPackIndex = -1;
          this.keyboardSelection = false;
          return true;
        }
        return false;
    }

    final static RgbSprite[] a(RgbSprite param0, int param1) {
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RgbSprite[] var4 = null;
        RgbSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = 48 / ((param1 - 55) / 32);
          var4 = new RgbSprite[9];
          var2 = var4;
          var4[4] = param0;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("jf.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void pushRaster(int obfuscationGuard) {
        if (obfuscationGuard != -99) {
          field_g = (String) null;
        }
        RasterSnapshot snapshot = (RasterSnapshot) (Mesh3D.rasterSnapshotPool.removeLast(127));
        if (snapshot == null) {
          snapshot = new RasterSnapshot();
        }
        snapshot.capture(Rasterizer2D.pixels, Rasterizer2D.clipLeft, Rasterizer2D.width, Rasterizer2D.height, obfuscationGuard ^ 194, Rasterizer2D.clipRight, Rasterizer2D.clipTop, Rasterizer2D.clipBottom);
        ButtonWidgetRenderer.rasterStack.addLast(snapshot, (byte) 3);
    }

    final static SocialListEntry findIgnoredPlayer(int obfuscationGuard, String name) {
        String nameKey = null;
        SocialListEntry entry = null;
        String entryNameKey = null;
        int unusedGameFlag = 0;
        String unusedName = null;
        CharSequence nameCharacters = null;
        CharSequence entryNameCharacters = null;
        SocialListEntry result = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (FullscreenFailureKind.ignoreIndex == null) {
            return null;
          }
          nameCharacters = (CharSequence) ((Object) name);
          nameKey = ChatMessage.normalizePlayerName(nameCharacters, 85);
          if (nameKey == null) {
            nameKey = name;
          }
          if (obfuscationGuard != 0) {
            unusedName = (String) null;
            HighscorePackSelector.findIgnoredPlayer(-82, (String) null);
          }
          entry = (SocialListEntry) (FullscreenFailureKind.ignoreIndex.get((long)nameKey.hashCode(), -1));
          while (true) {
            if (entry == null) {
              return null;
            }
            entryNameCharacters = (CharSequence) ((Object) entry.name);
            entryNameKey = ChatMessage.normalizePlayerName(entryNameCharacters, obfuscationGuard + 55);
            if (entryNameKey == null) {
              entryNameKey = entry.name;
            }
            if (!entryNameKey.equals(nameKey)) {
              entry = (SocialListEntry) (FullscreenFailureKind.ignoreIndex.nextMatch((byte) -43));
              continue;
            }
            break;
          }
          result = entry;
          return result;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("jf.A(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void draw(int obfuscationGuard) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = 26 % ((obfuscationGuard - 50) / 56);
        MenuButton var2 = this.owner.buttons[this.buttonIndex];
        int var4 = var2.x;
        int var5 = var2.y;
        for (var6 = 0; var6 < this.packCount; var6++) {
          if (this.selectedPackIndex == var6) {
            SoftwareFramebuffer.a(-111, var5, var4, cm.field_r[var6]);
            IntrusiveHashIterator.field_f[var6].f(var4, var5 - 1, 256);
          }
          ArchiveNetworkRequest.packSelectorIcons[var6].drawTransparent(var4, var5);
          var5 = var5 + (20 + ArchiveNetworkRequest.packSelectorIcons[var6].canvasHeight);
        }
    }

    final void updatePointerSelection(int obfuscationGuard) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        MenuButton var7;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.owner.selection.selectedIndex != this.buttonIndex) {
          this.lastPointerX = -1;
          this.keyboardSelection = false;
          this.lastPointerY = -1;
          this.selectedPackIndex = -1;
        } else {
          var7 = this.owner.buttons[this.buttonIndex];
          if (!this.keyboardSelection ||
            MusicPatch.pointerX != this.lastPointerX ||
            this.lastPointerY != po.pointerY) {
            var3 = var7.x;
            var4 = var7.y;
            for (var5 = 0; this.packCount > var5; var5++) {
              if (ArchiveNetworkRequest.packSelectorIcons[var5].containsPixel(var3, var4, MusicPatch.pointerX, po.pointerY)) {
                this.selectedPackIndex = var5;
                break;
              }
              var4 = var4 + (ArchiveNetworkRequest.packSelectorIcons[var5].canvasHeight + 20);
            }
          }
          this.lastPointerX = MusicPatch.pointerX;
          this.lastPointerY = po.pointerY;
        }
        if (obfuscationGuard <= 84) {
          this.buttonIndex = 25;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_d = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final void selectRelativeToEnd(int offset) {
        this.selectedPackIndex = offset + this.packCount;
        this.lastPointerY = po.pointerY;
        this.lastPointerX = MusicPatch.pointerX;
        this.keyboardSelection = true;
    }

    final void selectFirst(byte obfuscationGuard) {
        this.keyboardSelection = true;
        this.lastPointerY = po.pointerY;
        if (obfuscationGuard <= 32) {
          return;
        }
        this.lastPointerX = MusicPatch.pointerX;
        this.selectedPackIndex = 0;
    }

    HighscorePackSelector(HighscoresScreen owner, int buttonIndex, int packCount) {
        this.selectedPackIndex = -1;
        try {
          this.packCount = packCount;
          this.buttonIndex = buttonIndex;
          this.owner = owner;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jf.<init>(" + (owner != null ? "{...}" : "null") + ',' + buttonIndex + ',' + packCount + ')');
        }
    }

    static {
        field_d = new String[]{"Levels"};
        field_g = "Quit";
    }
}
