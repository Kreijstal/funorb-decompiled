/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private int field_a;
    static UiComponent field_g;
    private IntrusiveNode field_b;
    static Sprite field_f;
    static int field_d;
    private IterableNodeHashTable field_h;
    static String field_c;
    private IntrusiveNode field_e;

    public final void remove() {
        if (null == this.field_b) {
          throw new IllegalStateException();
        }
        this.field_b.unlink(true);
        this.field_b = null;
    }

    final static void centreMessageMenu(int param0) {
        int var3 = 0;
        boolean stackIn_11_0 = false;
        FramePainter stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        FramePainter var9 = null;
        int var10 = 0;
        int var4Lifetime1;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1_int = RandomAccessCacheFile.field_e - IntrusiveDequeCursor.field_i;
          IntrusiveDequeCursor.field_i = NetworkGameClient.field_x - (var1_int >> 1);
          RandomAccessCacheFile.field_e = IntrusiveDequeCursor.field_i + var1_int;
          PopupMenuBuilder.field_M = TextInputWidget.field_Q - (ArrayWidgetGroup.field_F >> 1);
          var2 = PopupMenuBuilder.field_M;
          for (var3 = 0; var3 < KeyboardListenerHelpers.field_e.length; var3++) {
            var4 = PackedArrayHelpers.field_a[var3];
            if (var4 < 0) {
              var5 = CacheEntry.field_x;
            } else {
              if (var4 == AlignedIconLabel.field_Jb.field_d) {
                var5 = DraggableWidget.field_N;
              } else {
                var5 = IndexedSpriteState.field_c;
              }
            }
            var6 = KeyboardListenerHelpers.field_e[var3];
            stackIn_11_0 = !(var4 < 0);
            var7 = ColourPickerWidget.measureText(stackIn_11_0, -76, var6);
            var8 = -(var7 >> 1) + NetworkGameClient.field_x;
            if (var4 >= 0) {
              var2 = var2 + EffectAudioHelpers.field_b;
              if (var4 == AlignedIconLabel.field_Jb.field_d) {
                stackIn_16_0 = DialogLayer.field_I;
              } else {
                stackIn_16_0 = DiskArchiveRequest.field_E;
              }
              var9 = stackIn_16_0;
              if (var9 != null) {
                var9.drawFrame(var2, -GameCharacter.field_db + var8, (GameCharacter.field_db << 1) + var7, (MessageDialog.field_tb << 1) + MusicPatch.field_n, 12018);
              }
              var2 = var2 + MessageDialog.field_tb;
            }
            if (var4 < 0) {
              SecondaryNodeDeque.field_c.drawLeft(var6, var8, ZombieDropView.field_H + var2, var5, -1);
              var2 = var2 + ImageProducerRasterBuffer.field_l;
            } else {
              AlternateUsernameCredentials.field_u.drawLeft(var6, var8, var2 + LaboratoryScreen.field_n, var5, -1);
              var2 = var2 + (MusicPatch.field_n + (EffectAudioHelpers.field_b + MessageDialog.field_tb));
            }
          }
          var4Lifetime1 = -17 / ((param0 + 59) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "up.C(" + param0 + ')');
        }
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.buckets[-1 + this.field_a] != this.field_e) {
          var1 = this.field_e;
          this.field_e = var1.previous;
          this.field_b = var1;
          return var1;
        }
        do {
          if (this.field_a >= this.field_h.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_h.buckets;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          var1 = fieldTemp$0[fieldTemp$1].previous;
        } while (this.field_h.buckets[this.field_a - 1] == var1);
        this.field_e = var1.previous;
        this.field_b = var1;
        return var1;
    }

    final static void layoutLobbySocialPanels(boolean param0) {
        LobbyPlayer.field_ac.setBounds(18, 0, -(GradientOutlineTextPainter.field_u ? 40 + (2 + (DualLinkNode.field_o + 2)) : 0) + FramePainter.field_b.field_zb, 0, -3344);
        AlignedIconLabel.field_Hb.setBounds(18, 0, 42 + DualLinkNode.field_o, -2 + (FramePainter.field_b.field_zb + (-DualLinkNode.field_o - 40)), -3344);
        if (param0) {
          field_g = (UiComponent) null;
        }
        ConditionalTextValue.field_e.setBoundsAndLayout(DualLinkNode.field_o, 2, FramePainter.field_b.field_zb, 0, FramePainter.field_b.field_z - 20, -31465, 20);
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.buckets[-1 + this.field_a] != this.field_e) {
          return true;
        }
        while (this.field_a < this.field_h.field_d) {
          fieldTemp$0 = this.field_h.buckets;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          if (fieldTemp$0[fieldTemp$1].previous != this.field_h.buckets[-1 + this.field_a]) {
            this.field_e = this.field_h.buckets[this.field_a - 1].previous;
            return true;
          }
          this.field_e = this.field_h.buckets[-1 + this.field_a];
        }
        return false;
    }

    final static String getTimedNoticeText(int param0) {
        int var1 = 57 % ((param0 - 77) / 49);
        if (PowerupProgressCard.field_l) {
          return null;
        }
        if (RasterBuffer.field_a < ClickMarkerParticle.field_h) {
          return null;
        }
        if (!(IntrusiveNode.field_a + ClickMarkerParticle.field_h <= RasterBuffer.field_a)) {
          return ProgramNoteUsage.field_k;
        }
        return null;
    }

    private final void reset(int param0) {
        this.field_e = this.field_h.buckets[0].previous;
        this.field_a = param0;
        this.field_b = null;
    }

    public static void releaseStatics(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 >= -8) {
          field_d = -60;
        }
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_b = null;
        try {
          this.field_h = param0;
          this.reset(1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Go!";
    }
}
