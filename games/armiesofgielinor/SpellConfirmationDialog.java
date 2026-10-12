/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellConfirmationDialog {
    static ClientUiComponent field_i;
    int tileY;
    static String field_g;
    int tileX;
    static int field_a;
    int spellId;
    static String field_l;
    static int field_e;
    static RgbSprite field_j;
    int selectionMode;
    static ResourceArchive field_f;
    private String prompt;

    final static void a(ls[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        ls var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length;
          if (param1 != 1680474497) {
            return;
          }
          for (var3 = 1; var3 < var2_int; var3++) {
            var4 = param0[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (IconTextComponent.a(var4, param0[var5], 30549)) {
                param0[1 + var5] = param0[var5];
                continue;
              }
              break;
            }
            param0[1 + var5] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("uf.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getActionAtPointer(int cancelAction, byte obfuscationGuard, int confirmAction) {
        int surfaceWidth = so.field_b.field_a;
        int surfaceHeight = so.field_b.field_g;
        int dialogHeight = 30 + (rs.field_n.getParagraphHeight(this.prompt, 200, 0) + 5);
        if (IterableDualNodeDeque.isPointerInBounds(-33, surfaceWidth / 2 - 100, -2 + surfaceWidth / 2, surfaceHeight / 2 + ((dialogHeight >> 1) - 30), (dialogHeight >> 1) + surfaceHeight / 2)) {
          return confirmAction;
        }
        if (IterableDualNodeDeque.isPointerInBounds(-33, surfaceWidth / 2 + 2, surfaceWidth / 2 + 100, -30 + ((dialogHeight >> 1) + surfaceHeight / 2), surfaceHeight / 2 + (dialogHeight >> 1))) {
          return cancelAction;
        }
        if (obfuscationGuard < 41) {
          field_i = (ClientUiComponent) null;
        }
        return -1;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 <= 18) {
          return;
        }
        field_l = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void draw(int obfuscationGuard) {
        int var2 = so.field_b.field_a;
        int var3 = so.field_b.field_g;
        if (obfuscationGuard != 1619620993) {
          return;
        }
        SoftwareRaster.b(0, 0, var2, var3, 0, 128);
        int var4 = 5 + (rs.field_n.getParagraphHeight(this.prompt, 200, 0) + 30);
        fe.b(212, -(var4 >> 1) + (-8 + var3 / 2), 216, 16 + var4, MusicPatch.field_m, nd.field_b, 0, 128);
        rs.field_n.a(this.prompt, var2 / 2 - 100, -(var4 >> 1) + var3 / 2, 200, var4, 16777215, 0, 1, 0, 0);
        int[] var10 = IterableDualNodeDeque.isPointerInBounds(obfuscationGuard - 1619621026, var2 / 2 - 100, 318, -30 + var3 / 2 + (var4 >> 1), (var4 >> 1) + var3 / 2) ? TutorialController.field_e : nd.field_b;
        int[] var8 = var10;
        int[] var6 = var8;
        int[] var5 = var6;
        fe.a(-100 + var2 / 2, (var4 >> 1) + (var3 / 2 - 30), 98, 30, DisplacedUnitMarker.field_s, var10, 0, 128, true);
        int[] var11 = IterableDualNodeDeque.isPointerInBounds(-33, 2 + var2 / 2, var2 / 2 + 100, var3 / 2 - (-(var4 >> 1) + 30), var3 / 2 + (var4 >> 1)) ? TutorialController.field_e : nd.field_b;
        int[] var9 = var11;
        int[] var7 = var9;
        var5 = var7;
        fe.a(var2 / 2 + 2, -30 + (var3 / 2 + (var4 >> 1)), 98, 30, DisplacedUnitMarker.field_s, var11, 0, 128, true);
        fe.c(nt.field_p, 50 + (-100 + var2 / 2), 17 + (var4 >> 1) + var3 / 2 - 15, 0, true);
        fe.c(oa.field_G, -50 + var2 / 2 + 100, 2 + (var3 / 2 + (var4 >> 1)), 0, true);
    }

    SpellConfirmationDialog(int selectionMode, int spellId, int tileX, int tileY, String prompt, GameplayController unusedController) {
        try {
          this.tileY = tileY;
          this.spellId = spellId;
          this.tileX = tileX;
          this.prompt = prompt;
          this.selectionMode = selectionMode;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "uf.<init>(" + selectionMode + ',' + spellId + ',' + tileX + ',' + tileY + ',' + (prompt != null ? "{...}" : "null") + ',' + (unusedController != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Open <%0> portal";
        field_l = "Reject";
        field_j = new RgbSprite(150, 150);
    }
}
