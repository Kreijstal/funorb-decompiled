/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollContainer extends ClientUiComponent {
    static String field_Ob;
    static boolean field_Qb;
    static String field_Lb;
    ClientUiComponent content;
    static String[] unitDisplayNames;
    ClientUiComponent viewport;
    static String field_Kb;
    static String field_Mb;
    VerticalScrollbar scrollbar;

    final void setLayout(int x, boolean obfuscationGuard, int width, int scrollbarGap, int scrollbarWidth, int y, int height) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.layoutViewport(scrollbarWidth, obfuscationGuard, scrollbarGap);
    }

    private final void layoutViewport(int scrollbarWidth, boolean obfuscationGuard, int scrollbarGap) {
        this.viewport.height = this.height;
        if (!obfuscationGuard) {
          this.content.x = 0;
          this.viewport.width = -scrollbarWidth + (this.width - scrollbarGap);
          this.content.width = -scrollbarGap - scrollbarWidth + this.width;
          this.scrollbar.setLayout(201, scrollbarWidth, this.height, 0, this.content.height, this.viewport.height, -scrollbarWidth + this.width, -this.content.y);
          return;
        }
        ScrollContainer.l(-122);
        this.content.x = 0;
        this.viewport.width = -scrollbarWidth + (this.width - scrollbarGap);
        this.content.width = -scrollbarGap - scrollbarWidth + this.width;
        this.scrollbar.setLayout(201, scrollbarWidth, this.height, 0, this.content.height, this.viewport.height, -scrollbarWidth + this.width, -this.content.y);
    }

    final void advanceScroll(int arrowStep, boolean clampMinimumFirst, int wheelDelta, boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.applyScrollInput(0, arrowStep, clampMinimumFirst, wheelDelta, this.viewport.height);
          return;
        }
        field_Lb = (String) null;
        this.applyScrollInput(0, arrowStep, clampMinimumFirst, wheelDelta, this.viewport.height);
    }

    final boolean updateContentLayout(boolean forceChildLayout, int wheelDelta, int arrowStep, boolean preserveChildLayout, int layoutState, int childSpacing) {
        if (layoutState != 0) {
          return true;
        }
        return this.updateContentLayoutAndScroll(forceChildLayout, wheelDelta, this.viewport.height, arrowStep, 0, childSpacing, preserveChildLayout);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
          ScrollContainer.k(118);
          return null != EffectPresentation.field_e ? true : false;
        }
        return null != EffectPresentation.field_e ? true : false;
    }

    public static void k(int param0) {
        if (param0 != 0) {
          ScrollContainer.l(-24);
          field_Mb = null;
          unitDisplayNames = null;
          field_Kb = null;
          field_Ob = null;
          field_Lb = null;
          return;
        }
        field_Mb = null;
        unitDisplayNames = null;
        field_Kb = null;
        field_Ob = null;
        field_Lb = null;
    }

    private final void applyScrollInput(int pageDownXHalf, int arrowStep, boolean clampMinimumFirst, int wheelDelta, int pageStep) {
        if (this.scrollbar.pollScrollUp(-70)) {
          this.content.pendingYDelta = this.content.pendingYDelta + arrowStep;
        }
        if (this.scrollbar.pollScrollDown(57)) {
          this.content.pendingYDelta = this.content.pendingYDelta - arrowStep;
          if (this.scrollbar.pollPageUp(-46)) {
            this.content.pendingYDelta = this.content.pendingYDelta + pageStep;
          }
          if (this.scrollbar.pollPageDown(28809)) {
            this.content.pendingYDelta = this.content.pendingYDelta - pageStep;
          }
          if (this.heldButtonMatches) {
            this.content.pendingYDelta = this.content.pendingYDelta - wheelDelta;
          }
          if (!clampMinimumFirst) {
            if (!(-(this.content.y + this.content.pendingYDelta) <= this.content.height - (-this.content.pendingHeightDelta + this.viewport.height))) {
              this.content.pendingYDelta = -(-this.viewport.height + (this.content.height + this.content.pendingHeightDelta)) - this.content.y;
            }
            if (-(this.content.y + this.content.pendingYDelta) < 0) {
              this.content.pendingYDelta = -this.content.y;
              if (this.scrollbar.isThumbHeld(false)) {
                this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
                this.content.pendingYDelta = 0;
              }
              this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
              return;
            }
            if (this.scrollbar.isThumbHeld(false)) {
              this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
              this.content.pendingYDelta = 0;
            }
            this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
            return;
          }
          if (!(-(this.content.y + this.content.pendingYDelta) >= 0)) {
            this.content.pendingYDelta = -this.content.y;
          }
          if (-this.viewport.height + this.content.height + this.content.pendingHeightDelta < -(this.content.pendingYDelta + this.content.y)) {
            this.content.pendingYDelta = -this.content.y - (-this.viewport.height + (this.content.pendingHeightDelta + this.content.height));
            if (this.scrollbar.isThumbHeld(false)) {
              this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
              this.content.pendingYDelta = 0;
            }
            this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
            return;
          }
          if (this.scrollbar.isThumbHeld(false)) {
            this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
            this.content.pendingYDelta = 0;
          }
          this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
          return;
        }
        if (this.scrollbar.pollPageUp(-46)) {
          this.content.pendingYDelta = this.content.pendingYDelta + pageStep;
        }
        if (this.scrollbar.pollPageDown(28809)) {
          this.content.pendingYDelta = this.content.pendingYDelta - pageStep;
        }
        if (this.heldButtonMatches) {
          this.content.pendingYDelta = this.content.pendingYDelta - wheelDelta;
          if (!clampMinimumFirst) {
            if (!(-(this.content.y + this.content.pendingYDelta) <= this.content.height - (-this.content.pendingHeightDelta + this.viewport.height))) {
              this.content.pendingYDelta = -(-this.viewport.height + (this.content.height + this.content.pendingHeightDelta)) - this.content.y;
            }
            if (-(this.content.y + this.content.pendingYDelta) >= 0) {
              if (this.scrollbar.isThumbHeld(false)) {
                this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
                this.content.pendingYDelta = 0;
              }
              this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
              return;
            }
            this.content.pendingYDelta = -this.content.y;
            if (this.scrollbar.isThumbHeld(false)) {
              this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
              this.content.pendingYDelta = 0;
            }
            this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
            return;
          }
          if (!(-(this.content.y + this.content.pendingYDelta) >= 0)) {
            this.content.pendingYDelta = -this.content.y;
          }
          if (-this.viewport.height + this.content.height + this.content.pendingHeightDelta >= -(this.content.pendingYDelta + this.content.y)) {
            if (this.scrollbar.isThumbHeld(false)) {
              this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
              this.content.pendingYDelta = 0;
            }
            this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
            return;
          }
          this.content.pendingYDelta = -this.content.y - (-this.viewport.height + (this.content.pendingHeightDelta + this.content.height));
          if (this.scrollbar.isThumbHeld(false)) {
            this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
            this.content.pendingYDelta = 0;
          }
          this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
          return;
        }
        if (!clampMinimumFirst) {
          if (!(-(this.content.y + this.content.pendingYDelta) <= this.content.height - (-this.content.pendingHeightDelta + this.viewport.height))) {
            this.content.pendingYDelta = -(-this.viewport.height + (this.content.height + this.content.pendingHeightDelta)) - this.content.y;
          }
          if (-(this.content.y + this.content.pendingYDelta) >= 0) {
            if (this.scrollbar.isThumbHeld(false)) {
              this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
              this.content.pendingYDelta = 0;
            }
            this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
            return;
          }
          this.content.pendingYDelta = -this.content.y;
          if (this.scrollbar.isThumbHeld(false)) {
            this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
            this.content.pendingYDelta = 0;
          }
          this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
          return;
        }
        if (!(-(this.content.y + this.content.pendingYDelta) >= 0)) {
          this.content.pendingYDelta = -this.content.y;
        }
        if (-this.viewport.height + this.content.height + this.content.pendingHeightDelta >= -(this.content.pendingYDelta + this.content.y)) {
          if (this.scrollbar.isThumbHeld(false)) {
            this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
            this.content.pendingYDelta = 0;
          }
          this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
          return;
        }
        this.content.pendingYDelta = -this.content.y - (-this.viewport.height + (this.content.pendingHeightDelta + this.content.height));
        if (this.scrollbar.isThumbHeld(false)) {
          this.content.y = -this.scrollbar.getDraggedScrollOffset(this.viewport.height, clampMinimumFirst, this.content.height, 112);
          this.content.pendingYDelta = 0;
        }
        this.scrollbar.layoutThumb(pageDownXHalf + pageDownXHalf, this.content.height, this.viewport.height, -this.content.y);
    }

    private final boolean updateContentLayoutAndScroll(boolean forceChildLayout, int wheelDelta, int pageStep, int arrowStep, int pageDownXHalf, int childSpacing, boolean preserveChildLayout) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (preserveChildLayout) {
          var8 = 1;
          this.content.layoutVerticalContent(var8 != 0, this.viewport.height, childSpacing, -1379);
          this.applyScrollInput(pageDownXHalf, arrowStep, false, wheelDelta, pageStep);
          return var8 != 0;
        }
        if (!this.heldButtonMatches) {
          var8Lifetime1 = 0;
          this.content.layoutVerticalContent(var8Lifetime1 != 0, this.viewport.height, childSpacing, -1379);
          this.applyScrollInput(pageDownXHalf, arrowStep, false, wheelDelta, pageStep);
          return var8Lifetime1 != 0;
        }
        if (!forceChildLayout) {
          var8Lifetime2 = 1;
          this.content.layoutVerticalContent(var8Lifetime2 != 0, this.viewport.height, childSpacing, -1379);
          this.applyScrollInput(pageDownXHalf, arrowStep, false, wheelDelta, pageStep);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.content.layoutVerticalContent(var8Lifetime3 != 0, this.viewport.height, childSpacing, -1379);
        this.applyScrollInput(pageDownXHalf, arrowStep, false, wheelDelta, pageStep);
        return var8Lifetime3 != 0;
    }

    ScrollContainer(long key, ClientUiComponent content, ClientUiComponent viewportStyle, VerticalScrollbar scrollbarStyle) {
        super(key, (ClientUiComponent) null);
        try {
          this.viewport = new ClientUiComponent(0L, viewportStyle);
          this.scrollbar = new VerticalScrollbar(0L, scrollbarStyle);
          this.addChild(this.viewport, 53);
          this.addChild(this.scrollbar, 39);
          this.content = content;
          this.viewport.addChild(content, 54);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + key + ',' + (content != null ? "{...}" : "null") + ',' + (viewportStyle != null ? "{...}" : "null") + ',' + (scrollbarStyle != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Lb = "Armour";
        unitDisplayNames = new String[]{"Barbarian", "Aviansie", "Gorilla", "Barbarian spearwoman", "Red dragon", "TzHaar-Ket", "Dagannoth", "Portal mage", "Paladin", "Saradomin owl", "Monk", "Saradomin mage", "White Knight", "Unicorn", "Centaur", "Lion", "Saradomin ranger", "Priest", "Icyene", "Werewolf", "Skeleton", "Necromancer", "Zamorak mage", "Black Knight", "Greater demon", "Zamorak ranger", "Hellhound", "Sea slug", "Gargoyle", "Pyrelord", "Mounted terrorbird", "Wolf", "Druid", "Black Guard dwarf", "Dwarf cannon", "Moss giant", "Void Knight", "Battle tortoise", "Gnomecopter", "Jade vine", "Ent", "Falcon", "Black bear", "Elf songstress", "Elf shieldmaiden", "Grenwall", "Dire wolf", "Elven pikemen", "Elven archer", "Elf lord", "Elf lady", "Crystalline shape-shifter", "Goblin", "Goblin priest", "Ogre", "Jogre", "Mogre", "Hobgoblin", "Ogre shaman", "Cyclops", "Ork", "Ogress", "Ourg", "Kalphite Queen", "Jackal", "Mummy", "Locust", "Bedabin nomad", "Menaphite thug", "Warrior of Icthlarin", "Crocodile", "Scabarite mage", "Sphinx", "Elemental of Elidinis", "King Black Dragon", "", "", "", "", "", "", "Blue Dragon", "Ahrim", "Dharok", "Guthan", "Karil", "Torag", "Verac", "Zemouregal"};
        field_Ob = "Player names can be up to 12 letters, numbers and underscores";
        field_Mb = "On";
        field_Kb = "Most summons";
    }
}
