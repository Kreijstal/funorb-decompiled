/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextualRuntimeException extends RuntimeException {
    static tv field_c;
    static String field_e;
    Throwable originalCause;
    static java.awt.Frame field_f;
    String context;
    static String field_a;
    static String field_d;

    public static void c(int param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 1) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 != -85) {
          return;
        }
        lm.field_g = param2;
        bt.field_g = param1;
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -1) {
          ContextualRuntimeException.a((byte) 1, -105, -40);
        }
        if (param1 >= 4096) {
          return param1 < 6144 ? -e.field_a[-param1 + 6144] : e.field_a[-6144 + param1];
        }
        return param1 >= 2048 ? -e.field_a[-2048 + param1] : e.field_a[2048 - param1];
    }

    final static void a(int param0, ResourceArchive param1) {
        ClientUiComponent var6 = null;
        ClientUiComponent var7 = null;
        ClientUiComponent var3 = null;
        try {
          NodeHashIterator.field_e = GameplayController.a("display_name_changed", (byte) 51, "basic", param1);
          mw.field_E = new SocialListPanel(0L, br.field_g, h.field_b, AnimationFrameSet.field_y);
          TaggedMapData.field_g = new SocialListPanel(0L, br.field_g, lm.field_a, ArchiveIndex.field_u);
          su.field_d = new ClientUiComponent(0L, (ClientUiComponent) null);
          bn.field_c = new ClientUiComponent(0L, eq.field_h);
          bn.field_c.horizontalAlignment = 1;
          AdaptiveMidiPcmStream.field_kb = new ClientUiComponent(0L, SoundPlaybackHandle.field_p, su.field_b);
          ek.field_a = new ClientUiComponent(0L, br.field_e, nl.field_C);
          PlayerProfile.field_f = new ClientUiComponent(0L, DualLinkedNode.field_k);
          su.field_d.addChild(bn.field_c, 49);
          su.field_d.addChild(AdaptiveMidiPcmStream.field_kb, 109);
          su.field_d.addChild(ek.field_a, 49);
          su.field_d.addChild(mw.field_E, 105);
          su.field_d.addChild(PlayerProfile.field_f, 56);
          mw.field_E.scrollContainer.viewport.applyStyle(param0 + 6145, eq.field_h);
          mw.field_E.scrollContainer.viewport.verticalAlignment = 1;
          var6 = mw.field_E.scrollContainer.viewport;
          var7 = var6;
          var7.horizontalAlignment = 1;
          TaggedMapData.field_g.scrollContainer.viewport.applyStyle(0, eq.field_h);
          if (param0 != -6145) {
            ResourceArchive var4 = (ResourceArchive) null;
            ContextualRuntimeException.a(-105, (ResourceArchive) null);
          }
          TaggedMapData.field_g.scrollContainer.viewport.verticalAlignment = 1;
          var3 = TaggedMapData.field_g.scrollContainer.viewport;
          var3.horizontalAlignment = 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "g.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 < gk.field_J) {
          gk.field_J = gk.field_J - 1;
        } else {
          if (PreparedAction.field_r <= 0) {
            if (InstructionsPanel.field_D > 0) {
              InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
            }
          } else {
            PreparedAction.field_r = PreparedAction.field_r - 1;
          }
        }
        if (gk.field_J > 0) {
          bh.d(false);
        }
        if (PreparedAction.field_r > 0) {
          AnimationSequence.a(PreparedAction.field_r, -71);
        }
        if (param0 != -6145) {
          return;
        }
        if (InstructionsPanel.field_D > 0) {
          AnimationSequence.a(InstructionsPanel.field_D, param0 + 6255);
        }
    }

    ContextualRuntimeException(Throwable originalCause, String context) {
        this.originalCause = originalCause;
        this.context = context;
    }

    final static boolean a(int param0) {
        int var2 = 0;
        dc var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        dc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (dc) (DualNodeHashTable.field_e.first((byte) 115));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != -17211) {
            field_e = (String) null;
          }
          for (var2 = 0; var2 < var1.field_p; var2++) {
            if (var4.field_k[var2] != null &&
              var4.field_k[var2].status == 0) {
              return false;
            }
            if (var4.field_r[var2] != null &&
              0 == var4.field_r[var2].status) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "g.D(" + param0 + ')');
        }
    }

    static {
        field_c = new tv();
        field_e = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4>-<%5></col>  Cost:<nbsp><col=ff0000><%6></col>";
        field_a = "If you are not, please change your password to something more obscure!";
        field_d = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
