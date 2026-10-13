/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends SingleChildWidgetContainer {
    static boolean field_H;
    static String field_L;
    static int field_J;
    static int field_K;
    private NodeDeque field_M;
    static String field_N;
    static String[] field_O;
    static long decodedChatAccountId;
    static String field_P;

    public gk() {
        super(0, 0, SoundPlaybackHandle.field_l, DebugConsole.field_x, (WidgetPainter) null, (WidgetListener) null);
        this.field_M = new NodeDeque();
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.painter != null) {
          this.painter.paintWidget((Widget) (this), originX, -80, true, originY);
        }
        NodeIterator var5 = new NodeIterator(this.field_M);
        if (obfuscationGuard > -82) {
          decodedChatAccountId = -21L;
        }
        Widget var6 = (Widget) (var5.last(50));
        while (var6 != null) {
          var6.drawWidget(this.x + originX, this.y + originY, (byte) -121, renderLayer);
          var6 = (Widget) (var5.previous((byte) -112));
        }
    }

    final wl a(byte param0) {
        NodeIterator var2;
        wl var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = new NodeIterator(this.field_M);
        if (param0 != 89) {
          field_N = (String) null;
        }
        var3 = (wl) (var2.first(param0 - 39));
        while (var3 != null) {
          if (var3.field_L) {
            return var3;
          }
          var3 = (wl) (var2.next(50));
        }
        return null;
    }

    final void j(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          var3.field_L = false;
          var3 = (wl) (var2.next(50));
        }
        this.child = null;
        if (param0 >= -85) {
          this.d((byte) 125);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 == this.width &&
          this.height == param1) {
          return;
        }
        int var4 = (-this.width + param0) / 2;
        int var5 = (-this.height + param1) / 2;
        NodeIterator var6 = new NodeIterator(this.field_M);
        wl var7 = (wl) (var6.first(50));
        if (param2 != -14) {
          this.drawWidget(-19, 39, (byte) 87, 16);
        }
        while (var7 != null) {
          var7.y = var7.y + var5;
          var7.x = var7.x + var4;
          var7 = (wl) (var6.next(50));
        }
        this.width = param0;
        this.height = param1;
    }

    final static void openPrivateTextChat(int obfuscationGuard, String recipientName, long accountId) {
        CharSequence var5 = null;
        try {
          rs.outgoingChatChannel = 2;
          qd.chatRecipientName = recipientName;
          var5 = (CharSequence) ((Object) recipientName);
          wm.chatRecipientNameKey = AccountNameNormalizer.normalize(var5, false);
          hf.textChatActive = true;
          if (obfuscationGuard != -23503) {
            gk.openPrivateTextChat(120, (String) null, 75L);
          }
          dj.chatRecipientAccountId = accountId;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gk.H(" + obfuscationGuard + ',' + (recipientName != null ? "{...}" : "null") + ',' + accountId + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 < 14) {
          field_L = (String) null;
        }
        field_P = null;
        field_L = null;
        field_N = null;
    }

    final void d(byte param0) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.a((byte) -1)) {
            var3.unlink(-116);
          }
          var3 = (wl) (var2.next(50));
        }
        this.child = (Widget) ((Object) this.a((byte) 89));
        int var4 = 94 / ((param0 - 30) / 60);
    }

    final void k(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        if (param0 != 0) {
          this.field_M = (NodeDeque) null;
        }
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.k(122)) {
            var3.unlink(param0 + 37);
          }
          var3 = (wl) (var2.next(param0 ^ 50));
        }
    }

    final void a(Widget param0, int param1) {
        wl var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof wl)) {
            throw new IllegalArgumentException();
          }
          var3 = (wl) (param0);
          this.field_M.addFirst(750, var3);
          var3.field_L = true;
          var3.takeFocus(11, (Widget) (this));
          if (param1 != 0) {
            this.field_M = (NodeDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("gk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final Widget getFocusedChild(int obfuscationGuard) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.field_M);
        wl var3 = (wl) (var2.first(50));
        while (var3 != null) {
          if (var3.field_L) {
            return var3.getFocusedChild((byte) 119);
          }
          var3 = (wl) (var2.next(obfuscationGuard + 1898));
        }
        if (obfuscationGuard == -1848) {
          return null;
        }
        decodedChatAccountId = -68L;
        return null;
    }

    static {
        field_N = "First tower";
        field_L = "<%0> and <%1>";
        field_O = new String[]{"zamorak", "saradomin", "guthix"};
        field_P = "Saradomin Strikes Highscores";
    }
}
