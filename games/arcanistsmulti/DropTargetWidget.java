/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildContainer {
    static java.math.BigInteger field_K;
    static String field_J;
    static String field_F;
    static int[] field_E;
    static String field_H;
    static String field_O;
    static String field_I;
    static aj field_G;
    static int field_P;
    static String field_M;
    static int field_N;
    static int field_L;

    public static void releaseStatics(int param0) {
        field_I = null;
        field_E = null;
        field_F = null;
        field_O = null;
        field_H = null;
        field_J = null;
        field_M = null;
        if (param0 == -1764031359) {
          field_K = null;
          field_G = null;
          return;
        }
        field_L = 98;
        field_K = null;
        field_G = null;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiComponent param5) {
        DraggableWidget var8 = null;
        try {
          super.handlePointerRelease(param0, param1 ^ 0, param2, param3, param4, param5);
          if (param1 != -20592) {
            field_J = (String) null;
          }
          var8 = MenuInputState.field_i;
          if (var8 != null &&
            this.containsPoint((byte) -47, param3, param0, param4, param2)) {
            if (this.field_o instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_o)).onWidgetDropped(var8, (byte) 125, this);
              MenuInputState.field_i = null;
              return;
            }
            if (!(var8.field_o instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var8.field_o)).onWidgetDropped(var8, (byte) 75, this);
            MenuInputState.field_i = null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "q.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] createCentreFrame(int param0, int param1) {
        Sprite[] var2 = null;
        Sprite[] var2Lifetime1;
        if (param1 == 0) {
          var2 = new Sprite[9];
          var2[4] = ce.createFilledSprite(64, param0, MouseWheelHandler.a(param1, 21385));
          return var2;
        }
        SceneWidget var3 = (SceneWidget) null;
        DropTargetWidget.buildAccountScene((SceneWidget) null, false, (SceneWidget) null, (SceneWidget) null, (SceneWidget) null);
        var2Lifetime1 = new Sprite[9];
        var2Lifetime1[4] = ce.createFilledSprite(64, param0, MouseWheelHandler.a(param1, 21385));
        return var2Lifetime1;
    }

    final static void buildAccountScene(SceneWidget param0, boolean param1, SceneWidget param2, SceneWidget param3, SceneWidget param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ResizableViewResizeListener.field_a != null) {
            return;
          }
          SocketJs5Transport.field_r = param1;
          if (!wh.field_g) {
            if (AlternateUsernameCredentials.field_p) {
              var5 = ra.field_l;
            } else {
              var5 = aj.field_i;
            }
          } else {
            var5 = rk.field_N;
          }
          var7 = (String) null;
          rb.showSavedLayout(ArchiveIndex.field_u, var5, 0, (String) null, 97);
          lo.field_y = sa.field_Cb;
          ResizableViewResizeListener.field_a = SingleChildContainer.field_D;
          SingleChildContainer.field_D.field_J = ArchiveIndex.field_u + (-(8355711 & ArchiveIndex.field_u >> 1) + ((16711422 & Battle.field_A.field_J) >> 1));
          SingleChildContainer.field_D.field_eb = -((16711423 & ArchiveIndex.field_u) >> 1) + ArchiveIndex.field_u + (8355711 & Battle.field_A.field_eb >> 1);
          SingleChildContainer.field_D.field_zb = ((Battle.field_A.field_zb & 16711422) >> 1) + (-(8355711 & ArchiveIndex.field_u >> 1) + ArchiveIndex.field_u);
          tm.field_d = new SceneWidget(0L, param3);
          ValidatedTextWidget.field_U = new SceneWidget(0L, param2);
          SceneScrollbar.field_Jb = new SceneWidget(0L, (SceneWidget) null);
          ck.field_d = new SceneWidget(0L, param4);
          SingleChildContainer.field_D = new SceneWidget(0L, param0);
          SingleChildContainer.field_D.field_Z = QuickChatCategory.field_x;
          ck.field_d.addChild(SingleChildContainer.field_D, 41);
          sa.field_Cb = new SceneWidget(0L, lo.field_y);
          ck.field_d.addChild(sa.field_Cb, 97);
          MembershipOfferScreen.field_f = new SceneWidget(0L, Battle.field_A, fe.field_k);
          ih.field_d = new SceneWidget(0L, Battle.field_A);
          tm.field_d.addChild(ValidatedTextWidget.field_U, 65);
          tm.field_d.addChild(SceneScrollbar.field_Jb, 126);
          SceneScrollbar.field_Jb.addChild(ck.field_d, 115);
          SceneScrollbar.field_Jb.addChild(MembershipOfferScreen.field_f, 81);
          SceneScrollbar.field_Jb.addChild(ih.field_d, 69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("q.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5, UiComponent param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_B = param6;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "q.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new java.math.BigInteger("65537");
        field_J = "MOST WET - ";
        field_E = new int[8192];
        field_F = "Hmm...you got hurt. Try not to hurt yourself in future.";
        field_I = "Options Menu";
        field_O = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "This is the Book of Seas. Sea spells focus on diverse attacks from above and below. You require 5 wands to purchase this spellbook; you currently have ";
        field_G = new aj(13, 0, 1, 0);
        field_M = "<%0> has left the lobby.";
    }
}
