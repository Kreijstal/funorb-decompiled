/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnlockOverlay extends MatchOverlay {
    private ModelAnimator field_o;
    private UnlockEntry field_m;
    private boolean field_k;
    static int field_n;
    static boolean field_p;
    private boolean field_j;
    static boolean field_l;

    final boolean pausesGame(boolean param0) {
        if (!param0) {
          return false;
        }
        return true;
    }

    final boolean handleKey(int param0, char param1, byte param2) {
        int var4 = -94 % ((29 - param2) / 57);
        if (param0 == 83) {
          this.field_j = true;
          return true;
        }
        if (param0 == 84) {
          this.field_j = true;
          return true;
        }
        if (param0 == 82) {
          this.field_j = true;
          return true;
        }
        if (param0 == 13) {
          this.field_j = true;
          return true;
        }
        if (param0 == 81) {
          this.field_j = true;
          return true;
        }
        if (83 != param0) {
          return false;
        }
        this.field_j = true;
        return true;
    }

    final boolean d(byte param0) {
        if (param0 != -75) {
          this.pausesGame(false);
          return this.field_j;
        }
        return this.field_j;
    }

    final void update(byte param0) {
        if (param0 > -107) {
          this.draw((byte) 103);
        }
        if (!this.field_k) {
          MatchProtocol.a(100, (byte) -76, 128, 222, 0, 96);
          this.field_k = true;
        }
        if (PlayerModel.field_b == 1) {
          this.field_j = true;
        }
        if (this.field_o != null) {
          this.field_o.tick(0);
          this.field_o.a(this.field_m.getIndex(-13939), false, 0, 37, false);
        }
    }

    UnlockOverlay(MatchScreen param0, UnlockEntry param1) {
        super(param0);
        this.field_k = false;
        try {
          this.field_m = param1;
          if (0 == param1.getKind(16)) {
            this.field_o = new ModelAnimator(0, param1.getIndex(-13939), 1);
            this.field_o.a(param1.getIndex(-13939), false, 0, 37, true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void draw(byte param0) {
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        ik.field_h.draw(0, 0);
        if (param0 > -13) {
          this.d((byte) 83);
          var2 = aaa.a(false) - PlayerInputQueue.field_a.width() >> 1;
          var3 = SwitchLinkList.b(0) - PlayerInputQueue.field_a.height() >> 1;
          if (this.field_m.getKind(16) == 0) {
            var6 = SocketArchiveNetworkClient.field_v;
            var7 = Room.field_m[this.field_m.getIndex(-13939)];
            MembersUpsellMenu.drawCentredTextWithShadow(var6.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.drawModelPreview(1024, 0, 0, this.field_o.getModel((byte) 74), -1918106173, 300, 320);
            RemovedFromGameMenu.f((byte) -6);
            PlayerInputQueue.field_a.draw(var2, var3 + 85);
            MembersUpsellMenu.drawCentredTextWithShadow(var7.toUpperCase(), 65793, eda.field_f, -1, (SwitchLinkList.b(0) >> 1) + 92, aaa.a(false) >> 1, -1);
            return;
          }
          if (this.field_m.getKind(16) == 1) {
            var4 = this.field_m.getIndex(-13939);
            MembersUpsellMenu.drawCentredTextWithShadow(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            OpenGlFramebuffer.field_i[var4].draw((aaa.a(false) >> 1) - OpenGlFramebuffer.field_i[var4].width() / 2, (SwitchLinkList.b(0) >> 1) - OpenGlFramebuffer.field_i[var4].height() / 2 - 20);
            PlayerInputQueue.field_a.draw(var2, var3 + 60);
            MembersUpsellMenu.drawCentredTextWithShadow(SecondaryLinkQueue.worldNames[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> 1, -1);
            return;
          }
          return;
        }
        var2Lifetime1 = aaa.a(false) - PlayerInputQueue.field_a.width() >> 1;
        var3Lifetime1 = SwitchLinkList.b(0) - PlayerInputQueue.field_a.height() >> 1;
        if (this.field_m.getKind(16) == 0) {
          var8 = SocketArchiveNetworkClient.field_v;
          var9 = Room.field_m[this.field_m.getIndex(-13939)];
          MembersUpsellMenu.drawCentredTextWithShadow(var8.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
          ura.a(-10985);
          hp.drawModelPreview(1024, 0, 0, this.field_o.getModel((byte) 74), -1918106173, 300, 320);
          RemovedFromGameMenu.f((byte) -6);
          PlayerInputQueue.field_a.draw(var2Lifetime1, var3Lifetime1 + 85);
          MembersUpsellMenu.drawCentredTextWithShadow(var9.toUpperCase(), 65793, eda.field_f, -1, (SwitchLinkList.b(0) >> 1) + 92, aaa.a(false) >> 1, -1);
          return;
        }
        if (this.field_m.getKind(16) == 1) {
          var4Lifetime1 = this.field_m.getIndex(-13939);
          MembersUpsellMenu.drawCentredTextWithShadow(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
          OpenGlFramebuffer.field_i[var4Lifetime1].draw((aaa.a(false) >> 1) - OpenGlFramebuffer.field_i[var4Lifetime1].width() / 2, (SwitchLinkList.b(0) >> 1) - OpenGlFramebuffer.field_i[var4Lifetime1].height() / 2 - 20);
          PlayerInputQueue.field_a.draw(var2Lifetime1, var3Lifetime1 + 60);
          MembersUpsellMenu.drawCentredTextWithShadow(SecondaryLinkQueue.worldNames[var4Lifetime1].toUpperCase(), 65793, eda.field_f, -1, 92 + var3Lifetime1, aaa.a(false) >> 1, -1);
          return;
        }
    }

    static {
        field_n = 0;
        field_p = true;
    }
}
