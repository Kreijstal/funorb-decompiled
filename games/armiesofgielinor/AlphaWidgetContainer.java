/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaWidgetContainer extends SingleChildWidgetContainer {
    static String field_J;
    static String field_L;
    static String[] field_M;
    static String field_I;
    static ResourceArchive field_H;
    int alpha;

    final static String setMusicProfileTransitionMillis(int durationMillis, byte obfuscationGuard) {
        String previousDurationText = null;
        if (obfuscationGuard == 74) {
          previousDurationText = "old time: " + wf.musicProfileTransitionMillis;
          wf.musicProfileTransitionMillis = durationMillis;
          return previousDurationText;
        }
        return (String) null;
    }

    public static void c(boolean param0) {
        field_H = null;
        field_M = null;
        field_J = null;
        field_I = null;
        if (param0) {
          AlphaWidgetContainer.c(false);
          field_L = null;
          return;
        }
        field_L = null;
    }

    public AlphaWidgetContainer() {
        super(0, 0, 0, 0, (WidgetPainter) null, (WidgetListener) null);
        this.alpha = 256;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (renderLayer != 0) {
          return;
        }
        if (this.child == null) {
          return;
        }
        if (this.alpha == 0) {
          return;
        }
        if (this.alpha == 256) {
          this.child.drawWidget(this.x + originX, originY + this.y, (byte) -125, renderLayer);
          return;
        }
        RgbSprite compositeSprite = new RgbSprite(this.child.width, this.child.height);
        if (obfuscationGuard < -82) {
          CombatSandbox.a(compositeSprite, 3);
          this.child.drawWidget(0, 0, (byte) -86, renderLayer);
          QuickChatPhraseRepository.popRasterState(-18862);
          compositeSprite.drawWithOpacity(this.x + originX, originY + this.y, this.alpha);
          return;
        }
        field_M = (String[]) null;
        CombatSandbox.a(compositeSprite, 3);
        this.child.drawWidget(0, 0, (byte) -86, renderLayer);
        QuickChatPhraseRepository.popRasterState(-18862);
        compositeSprite.drawWithOpacity(this.x + originX, originY + this.y, this.alpha);
    }

    AlphaWidgetContainer(Widget child) {
        super(child.x, child.y, child.width, child.height, (WidgetPainter) null, (WidgetListener) null);
        try {
          child.setBounds(0, this.width, 0, 8192, this.height);
          this.alpha = 256;
          this.child = child;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bh.<init>(" + (child != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(boolean param0) {
        int var1 = (tq.field_c - 640) / 2;
        int var2 = mj.field_c * mj.field_c;
        int var3 = -(ModalDialogHost.field_J * ModalDialogHost.field_J) + var2;
        if (!param0) {
          NumericDateInputWidget.field_T.setBounds(-4 + (SoftwareRaster.height - 120) - 90, -20500, 199, 90, var1 - var3 * 199 / var2);
          ov.field_i.setBounds(-4 + (SoftwareRaster.height - 120), -20500, 438, 0, var3 * 438 / var2 + 202 + var1);
          return;
        }
    }

    static {
        field_J = "Login: ";
        field_I = "<%0> cannot join; the game has started.";
        field_L = "Spells to revive and rejuvenate your weary forces.";
        field_M = new String[]{"A unit that can capture structures.", null, null, "A unit that can capture structures.", "Flying, fire-breathing ranged unit.", null, "An amphibious, air-intercepting warrior.", "Opens a single portal for a single god's forces at a chosen location.", null, null, "Heals adjacent units by 3 points and cures poisoned units. Buries bones on his current map square, which increases the monk's maximum health by 1 point.", null, null, null, null, null, null, "Heals adjacent units by 3 points and cures poisoned units. Deploys a single spiritual barrier at a chosen location, which protects friendly units within.", "A flying unit with long-range throwing axes.", null, "Undead skirmish unit that slowly rots away.", "Raises the bones of the dead on adjacent map tiles into skeleton warriors; adjacent skeletons are healed fully.", null, null, null, null, null, "An amphibious parasitic creature that sacrifices itself in an attack to gain control of one enemy unit with strength equal or lower to its own.", "A flying demon with a long-range rock throwing attack.", "Burns down any forest it moves onto, converting it to open ground.", null, null, "Increases the combat strength of adjacent units by 5 points (which diminishes by 1 per turn) and cures poisoned units.", null, "A troop of engineers who will build a single, powerful cannon on a designated map tile.", null, null, null, null, "Can be commanded to grow onto adjacent open ground tiles, blocking them. Each tile containing a jade vine costs 10 Mana per turn. It can be commanded to whither and die.", "Plants a forest on any open ground tile onto which it moves.", null, null, "Allies within two map tiles of her song become equally effective in combat against all unit classes.", null, null, null, null, null, null, null, "Can burrow onto a map tile occupied by an enemy unit, killing that unit in the process.", null, "Confuses all enemy units within two map tiles, removing the defensive qualities of the ground on which they stand.", null, null, "An amphibious ogre.", "A warrior capable of intercepting flying units.", "A shaman who conjures a cloud of smoke that prevents ranged attacks on units within it.", "Enemy units within two map tiles are paralysed with fear and are unable to move.", null, null, "When moved a distance of one map tile onto a mountain, it destroys the mountain, converting it to open ground.", "Surrounded by insects that inhibit the movement of units crossing them.", null, "A tough, walking, rotting, poisonous corpse.", "A flying, poisonous insect.", null, null, null, "An amphibious warrior-beast.", "A mage with poisoning magic.", "A beast that can invade an adjacent unit's mind, giving you control of it.", "When moved a distance of one map tile from river/sea onto open ground, it converts the open ground to a river.", "The strongest of all dragons, who is only available to the first player to bring him to the fight. Lethal!", null, null, null, null, null, null, "Flying, fire-breathing ranged unit."};
    }
}
