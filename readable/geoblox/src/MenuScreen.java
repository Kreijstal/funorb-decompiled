/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen {
    static Sprite[][][] amorphousFramesByThemeAndVariant;
    int firstItemY;
    int itemCount;
    static float introTintGreenDelta;
    int itemSpacing;
    static PlatformTaskDispatcher platformTaskDispatcher;
    static int avatarFeedbackFrameBase;
    int selectedItemIndex;
    private int hitRightX;
    boolean pointerInteractionActive;
    boolean keyboardSelectionActive;
    static long appletStopDeadlineMillis;
    private int hitLeftX;

    final static IndexedSprite[] loadIndexedSpriteFrames(String groupName, String resourceName, boolean methodGuard, ResourceArchive graphicsArchive) {
        int groupId = 0;
        RuntimeException spriteLoadFailure = null;
        int fileId = 0;
        IndexedSprite[] guardedNullResult = null;
        IndexedSprite[] loadedFramesResult = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String groupContextDescription = null;
        StringBuilder contextAfterGroup = null;
        String resourceContextDescription = null;
        StringBuilder contextBeforeArchive = null;
        String archiveContextDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (!methodGuard) {
            guardedNullResult = (IndexedSprite[]) null;
            return guardedNullResult;
          }
          groupId = graphicsArchive.findGroupId((byte) 126, groupName);
          fileId = graphicsArchive.findFileId(resourceName, -89, groupId);
          loadedFramesResult = NetworkArchiveRequest.loadIndexedSpriteFramesById(true, graphicsArchive, fileId, groupId);
          return loadedFramesResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          spriteLoadFailure = caughtFailure;
          failureContextCause = spriteLoadFailure;
          failureContextBuilder = new StringBuilder().append("ka.W(");
          if (groupName == null) {
            groupContextDescription = "null";
          } else {
            groupContextDescription = "{...}";
          }
          contextAfterGroup = ((StringBuilder) (Object) failureContextBuilder).append(groupContextDescription).append(',');
          if (resourceName == null) {
            resourceContextDescription = "null";
          } else {
            resourceContextDescription = "{...}";
          }
          contextBeforeArchive = ((StringBuilder) (Object) contextAfterGroup).append(resourceContextDescription).append(',').append(methodGuard).append(',');
          if (graphicsArchive == null) {
            archiveContextDescription = "null";
          } else {
            archiveContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) contextBeforeArchive).append(archiveContextDescription).append(')').toString());
        }
    }

    abstract void increaseMenuValue(byte methodGuard, int itemIndex);

    void handleMenuKey(int itemIndex, int methodGuard) {
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (methodGuard >= -26) {
          this.hitLeftX = 8;
        }
        if (ki.currentKeyboardEventCode != 96) {
          if (ki.currentKeyboardEventCode == 97) {
            this.increaseMenuValue((byte) 90, itemIndex);
          } else {
            if (!((ki.currentKeyboardEventCode != 84) &&
                (ki.currentKeyboardEventCode != 83))) {
              this.activateMenuItem(itemIndex, (byte) -2);
            }
          }
        } else {
          this.decreaseMenuValue(itemIndex, (byte) -7);
        }
    }

    void handleMenuPointer(int itemIndex, int pointerX, boolean initialClick, int rowOffsetY, boolean heldRepeat, int pointerButton) {
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (!heldRepeat) {
            if (1 != pointerButton) {
                this.decreaseMenuValue(itemIndex, (byte) -121);
            } else {
                this.activateMenuItem(itemIndex, (byte) -2);
            }
            Under13TermsPanel.menuPointerRepeatCountdown = lj.menuPointerInitialRepeatDelay;
        } else {
            Under13TermsPanel.menuPointerRepeatCountdown = Under13TermsPanel.menuPointerRepeatCountdown - 1;
            if (Under13TermsPanel.menuPointerRepeatCountdown <= 0) {
                if (pointerButton == 1) {
                    this.activateMenuItem(itemIndex, (byte) -2);
                } else {
                    this.decreaseMenuValue(itemIndex, (byte) 6);
                }
                Under13TermsPanel.menuPointerRepeatCountdown = CacheReference.menuPointerRepeatInterval;
            }
        }
        if (initialClick) {
            this.keyboardSelectionActive = false;
        }
    }

    abstract void renderMenuItem(boolean selected, byte methodGuard, int itemIndex, int rowY);

    public static void releaseStaticReferences(byte methodGuard) {
        int guardQuotient = -15 / ((methodGuard - 75) / 32);
        amorphousFramesByThemeAndVariant = (Sprite[][][]) null;
        platformTaskDispatcher = null;
    }

    int hitTestMenuItem(int pointerX, int pointerY, byte methodGuard) {
        int hitRowIndex;
        if ((this.hitLeftX <= pointerX) &&
            (pointerX < this.hitRightX) &&
            (this.firstItemY <= pointerY)) {
          if (methodGuard < 20) {
            return 81;
          }
          hitRowIndex = (pointerY - this.firstItemY) / this.itemSpacing;
          if (this.itemCount > hitRowIndex) {
            return hitRowIndex;
          }
          return -1;
        }
        return -1;
    }

    abstract void activateMenuItem(int itemIndex, byte methodGuard);

    final void updatePointer(boolean pointerUpdateGuard) {
        int hitItemIndex;
        int clientControlFlowGuard;
        int pressedItemSnapshot = 0;
        int pressedPointerXSnapshot = 0;
        Object pointerTargetSnapshot;
        boolean initialClickSnapshot;
        L0: {
          clientControlFlowGuard = Geoblox.clientControlFlowFlag;
          if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
            hitItemIndex = this.hitTestMenuItem(mc.pointerPressXSnapshot, FullscreenFocusCanvas.pointerPressYSnapshot, (byte) 28);
            this.selectedItemIndex = hitItemIndex;
            if (hitItemIndex != -1) {
              this.pointerInteractionActive = true;
              pressedItemSnapshot = hitItemIndex;
              pressedPointerXSnapshot = mc.pointerPressXSnapshot;
              if (pointerUpdateGuard) {
                pointerTargetSnapshot = this;
                initialClickSnapshot = false;
              } else {
                pointerTargetSnapshot = this;
                initialClickSnapshot = true;
              }
              this.handleMenuPointer(pressedItemSnapshot, pressedPointerXSnapshot, initialClickSnapshot, -(hitItemIndex * this.itemSpacing) - this.firstItemY + FullscreenFocusCanvas.pointerPressYSnapshot, false, CheckboxRenderer.pointerPressButtonSnapshot);
            } else {
              this.pointerInteractionActive = false;
            }
          } else {
            if ((gf.heldPointerButtonSnapshot != 0) &&
                (this.pointerInteractionActive)) {
              hitItemIndex = this.selectedItemIndex;
              if (hitItemIndex == -1) {
                break L0;
              }
              this.handleMenuPointer(hitItemIndex, PrefixCodeDecoder.pointerXSnapshot, false, -(this.itemSpacing * hitItemIndex) + (PcmResampler.pointerYSnapshot - this.firstItemY), true, gf.heldPointerButtonSnapshot);
              break L0;
            }
            this.pointerInteractionActive = false;
            if (wb.pointerActivitySnapshot) {
              hitItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, PcmResampler.pointerYSnapshot, (byte) 126);
              if (hitItemIndex != -1) {
                this.selectedItemIndex = hitItemIndex;
                this.keyboardSelectionActive = false;
              } else {
                if (!this.keyboardSelectionActive) {
                  this.selectedItemIndex = hitItemIndex;
                  this.keyboardSelectionActive = false;
                }
              }
            }
          }
        }
        if (!pointerUpdateGuard) {
          this.hitLeftX = 56;
        }
    }

    MenuScreen(int itemCount, int hitLeftX, int hitRightX, int firstItemY, int itemSpacing) {
        this.keyboardSelectionActive = true;
        this.selectedItemIndex = 0;
        this.hitLeftX = hitLeftX;
        this.itemSpacing = itemSpacing;
        this.hitRightX = hitRightX;
        this.itemCount = itemCount;
        this.firstItemY = firstItemY;
    }

    abstract void decreaseMenuValue(int itemIndex, byte methodGuard);

    void renderScreen(int methodGuard) {
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        int itemIndex = 0;
        if (methodGuard != -28750) {
            this.updatePointer(false);
        }
        int rowY = this.firstItemY;
        while (itemIndex < this.itemCount) {
            this.renderMenuItem(this.selectedItemIndex == itemIndex ? true : false, (byte) -112, itemIndex, rowY);
            rowY = rowY + this.itemSpacing;
            itemIndex++;
        }
    }

    static {
        amorphousFramesByThemeAndVariant = new Sprite[7][7][4];
        avatarFeedbackFrameBase = 0;
        appletStopDeadlineMillis = 0L;
    }
}
