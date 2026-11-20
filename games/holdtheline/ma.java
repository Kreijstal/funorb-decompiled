/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends IntrusiveNode {
    int[] field_j;
    static SpriteAsset field_l;
    boolean field_i;
    static int field_k;
    int field_m;

    public static void clearSharedReferences(byte param0) {
        if (param0 > -48) {
          field_l = (SpriteAsset) null;
        }
        field_l = null;
    }

    final static void a(boolean param0, IsaacPacketBuffer param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        IsaacPacketBuffer var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            var5 = (IsaacPacketBuffer) null;
            ma.a(true, (IsaacPacketBuffer) null, -15);
          }
          var3_int = jn.a(16, (byte) -96, param1);
          var4 = d.field_c[param2];
          if (var4 != -1 && (var4 < var3_int ||
            var3_int == -1)) {
            ad.field_a = true;
            return;
          }
          d.field_c[param2] = var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 != -1) {
            return true;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param0.length) {
              return false;
            }
            if (!IterableSecondaryNodeDeque.field_g[param0[var2_int]]) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ma.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          return true;
        }
        return ao.a(GameKeyHandler.a(97), false);
    }

    final static void a(int param0, boolean param1) {
        int var3;
        var3 = HoldTheLine.field_D;
        if (param0 != -21383) {
          ma.clearSharedReferences((byte) 26);
        }
        if (PolarSortVector.a((byte) 20, ArchiveIndex.b((byte) -49).field_p) != 0) {
          return;
        }
        PathWaypoint.field_o = null;
        ClientException.field_c = 0;
        qd.a(20830, 3 + StrongCacheEntry.field_w);
        CheckboxRenderer.field_x = 3;
        pe.field_g = new int[4];
        if (7 != DelegatingCanvas.field_d) {
          if (1 != DelegatingCanvas.field_d &&
            !Vector2i.field_c) {
            AgeValidator.field_o = false;
          }
          bn.a(1, param0 ^ 21498);
          nm.field_b = ArchiveIndex.b((byte) -49);
          if (UsernameLoginCredentials.a(nm.field_b, true)) {
            MusicPatchPcmStream.field_r = new RaceWorld(nm.field_b, DelegatingCanvas.field_d, Vector2i.field_c, AgeValidator.field_o, t.field_l, IntrusiveDeque.field_b);
          } else {
            DiskCacheStore.field_i = IntrusiveDeque.field_b;
            ArchiveRequest.field_r = DelegatingCanvas.field_d;
            MusicPatchPcmStream.field_r = null;
            QuickChatPhraseDefinition.field_r = t.field_l;
            qn.field_k = AgeValidator.field_o;
            fl.field_j = Vector2i.field_c;
          }
          EntitySound.field_j = true;
          wm.a(param1, false, -1);
        } else {
          Vector2i.field_c = false;
          EntitySound.field_l = 4;
          t.field_j = new int[4];
          AgeValidator.field_o = false;
          IntrusiveDeque.field_b = -1;
          TextWidgetStyle.field_g = 3;
          eg.field_a = LoginForm.field_P;
          EntitySound.field_m = new int[MenuList.field_l[StrongCacheEntry.field_w]];
          ni.field_b = 859978912;
          CurvedRoadSegment.field_y = 0;
          LayeredWidgetStyle.field_d = 1913842707 + ((1 & StrongCacheEntry.field_w) << 1) + ((2 & StrongCacheEntry.field_w) >> 1);
          tn.field_c = -1134004831;
          cm.field_a = -1329759026;
          t.field_l = RotatedSpriteAsset.field_g[ArchiveIndex.b((byte) -49).field_p][0];
          ij.a(param1, -79);
          ((GameMenu) (l.field_a[10])).carouselOffset = 480.0f;
        }
    }

    ma() {
        this.field_i = false;
    }

    static {
        field_k = 1;
    }
}
