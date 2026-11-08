/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PieceDropAnimation extends IntrusiveNode {
    int field_u;
    int field_q;
    static QuickChatCommandType field_r;
    int field_s;
    boolean field_x;
    int field_n;
    static String field_p;
    static String field_w;
    int field_y;
    static int field_z;
    static String field_t;
    static byte[] field_o;
    static Sprite field_v;

    final static boolean matchesNormalizedSessionName(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4) {
            field_v = (Sprite) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = RegistrationResponseHelpers.field_f.equals(DialWidgetPainter.normalizeDisplayName(var3, (byte) 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ej.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void handleNameEntryPopupResult(boolean param0, int param1, byte param2) {
        int var3;
        int var4;
        String var5;
        Object var6;
        String var7;
        CharSequence var8;
        var3 = -22 / ((-38 - param2) / 57);
        if (BevelFrameSpriteFactory.field_b == null) {
          return;
        }
        var4 = BevelFrameSpriteFactory.field_b.updateAndPollNameInput(param0, (byte) 58);
        if (var4 == 0) {
          return;
        }
        if (var4 != 2) {
          DiskCacheWorker.field_c = -1;
          BevelFrameSpriteFactory.field_b = null;
          return;
        }
        if (null == BevelFrameSpriteFactory.field_b.field_jb) {
          DiskCacheWorker.field_c = -1;
          BevelFrameSpriteFactory.field_b = null;
          return;
        }
        if (BevelFrameSpriteFactory.field_b.field_jb.equals("")) {
          DiskCacheWorker.field_c = -1;
          BevelFrameSpriteFactory.field_b = null;
          return;
        }
        if (BevelFrameSpriteFactory.field_b.field_jb.charAt(0) == 91) {
          var5 = BevelFrameSpriteFactory.field_b.field_jb;
        } else {
          var8 = (CharSequence) ((Object) BevelFrameSpriteFactory.field_b.field_jb);
          var5 = DialWidgetPainter.normalizeDisplayName(var8, (byte) 124);
        }
        var6 = null;
        if (DiskCacheWorker.field_c == 0) {
          var6 = ReflectionCheckHelpers.requestAddIgnore((byte) 122, var5, param1);
        }
        if (DiskCacheWorker.field_c == 1) {
          var6 = AnimationPlayer.requestRemoveFriend(false, var5, param1);
        }
        if (DiskCacheWorker.field_c == 2) {
          var6 = WhirlpoolHasher.requestAddIgnore(param1, var5, 2);
        }
        if (DiskCacheWorker.field_c == 3) {
          var6 = ContextMenu.requestRemoveIgnore(var5, param1, 2, var5);
        }
        if (var6 == null) {
          DiskCacheWorker.field_c = -1;
          BevelFrameSpriteFactory.field_b = null;
          return;
        }
        var7 = (String) null;
        AccountCreationDialog.addChatMessage(0, 0, var5, 2, (String) (var6), (String) null);
        DiskCacheWorker.field_c = -1;
        BevelFrameSpriteFactory.field_b = null;
        return;
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_v = null;
        field_o = null;
        field_p = null;
        field_w = null;
        if (param0 == -1) {
          field_t = null;
          return;
        }
        field_z = -123;
        field_t = null;
    }

    PieceDropAnimation(int param0, int param1, boolean param2) {
        this.field_y = 0;
        this.field_q = 0;
        this.field_x = param2 ? true : false;
        this.field_u = param1;
        this.field_n = param0;
    }

    PieceDropAnimation(PendingMove param0, boolean param1) {
        try {
          this.field_x = param1 ? true : false;
          this.field_s = 0;
          this.field_q = 0;
          this.field_y = 0;
          this.field_u = param0.field_f;
          this.field_n = param0.field_b;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_w = "Offer rematch";
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = new QuickChatCommandType(2, 4, 4, 0);
        field_z = 250;
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
