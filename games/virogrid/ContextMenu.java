/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends SpriteWidget {
    private SpriteWidget field_Eb;
    private int[] field_Kb;
    private int field_Ib;
    private int field_Pb;
    private int field_Lb;
    private int field_Fb;
    private SpriteWidget field_Hb;
    static ConnectionStage field_Ob;
    private Sprite[] field_Jb;
    private int field_Qb;
    private int field_Mb;
    private int field_Nb;
    private IconTextComponent[] field_Gb;

    final static void attachMouseListeners(java.awt.Component param0, boolean param1) {
        try {
          param0.addMouseListener(MouseTrailPoint.field_l);
          if (param1) {
            java.awt.Component var3 = (java.awt.Component) null;
            ContextMenu.attachMouseListeners((java.awt.Component) null, true);
          }
          param0.addMouseMotionListener(MouseTrailPoint.field_l);
          param0.addFocusListener(MouseTrailPoint.field_l);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int pollAction(boolean param0, byte param1) {
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        this.updateInputFullScreen(param0, (byte) 98);
        if (!param0) {
          return -2;
        }
        var3 = 0;
        if (param1 != -89) {
          this.pollAction(true, (byte) -14);
        }
        while (this.field_Qb > var3) {
          if (this.field_Gb[var3].field_nb != 0) {
            return this.field_Kb[var3];
          }
          var3++;
        }
        if (MenuScreen.field_g != 0) {
          return -1;
        }
        return this.field_Nb;
    }

    public static void releaseStatics(int param0) {
        field_Ob = null;
        if (param0 >= -47) {
          field_Ob = (ConnectionStage) null;
        }
    }

    final boolean handleEscape(int param0) {
        if (this.field_Nb != -2) {
          return false;
        }
        if (param0 > -34) {
          this.field_Kb = (int[]) null;
        }
        if (ScrollPane.field_Gb != 13) {
          return true;
        }
        this.field_Nb = -1;
        return true;
    }

    final void addItem(int param0, String param1, int param2) {
        try {
          this.field_Gb[this.field_Qb] = new IconTextComponent(0L, (SpriteWidget) null, (SpriteWidget) null, this.field_Eb, (Sprite) null, param1);
          this.field_Gb[this.field_Qb].field_x = this.field_Jb;
          this.field_Gb[this.field_Qb].field_ib = true;
          this.field_Gb[this.field_Qb].field_D = param0;
          this.addChild(param0 ^ 1, this.field_Gb[this.field_Qb]);
          this.field_Kb[this.field_Qb] = param2;
          this.field_Qb = this.field_Qb + 1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void addIconItem(String param0, byte param1, int param2, Sprite param3) {
        try {
          this.field_Gb[this.field_Qb] = new IconTextComponent(0L, (SpriteWidget) null, (SpriteWidget) null, this.field_Eb, param3, param0);
          this.field_Gb[this.field_Qb].field_x = this.field_Jb;
          this.field_Gb[this.field_Qb].field_ib = true;
          this.field_Gb[this.field_Qb].field_D = 1;
          this.addChild(param1 - 89, this.field_Gb[this.field_Qb]);
          this.field_Kb[this.field_Qb] = param2;
          this.field_Qb = this.field_Qb + 1;
          if (param1 != 89) {
            this.field_Fb = -30;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean loadMasterIndex(int param0) {
        if (param0 != -20940) {
          java.awt.Component var2 = (java.awt.Component) null;
          ContextMenu.attachMouseListeners((java.awt.Component) null, false);
        }
        return DialWidgetPainter.field_q.loadMasterIndex((byte) 19);
    }

    ContextMenu(SpriteWidget param0, Sprite[] param1, SpriteWidget param2, SpriteWidget param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Nb = -2;
        this.field_Kb = new int[256];
        this.field_Gb = new IconTextComponent[256];
        try {
          this.field_Jb = param1;
          this.field_Mb = param8;
          this.field_Ib = param5;
          this.field_Pb = param7;
          this.field_Hb = param2;
          this.field_Fb = param4;
          this.field_Eb = param3;
          this.field_Lb = param6;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void openAt(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        int var9;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Virogrid.field_F ? 1 : 0;
        if (this.field_Qb == 0) {
          this.field_Gb[this.field_Qb] = new IconTextComponent(0L, (SpriteWidget) null, (SpriteWidget) null, this.field_Hb, (Sprite) null, OverlayDrawHelpers.field_a);
          this.field_Gb[this.field_Qb].field_D = 1;
          this.addChild(0, this.field_Gb[this.field_Qb]);
          this.field_Kb[this.field_Qb] = -1;
          this.field_Qb = this.field_Qb + 1;
        }
        var6 = 0;
        for (var7 = param1; var7 < this.field_Qb; var7++) {
          var8 = this.field_Gb[var7].getPreferredWidth(-89, this.field_Lb, this.field_Ib);
          if (var6 < var8) {
            var6 = var8;
          }
        }
        var6 = var6 + 2 * this.field_Fb;
        var7Lifetime1 = this.field_Mb * this.field_Qb + this.field_Pb + this.field_Pb;
        var8Lifetime1 = ProgressMessageDialog.choosePopupX(0, param2, param3, var6);
        var9 = IntrusiveDeque.fitHorizontalPosition(-1, var7Lifetime1, param4, param0);
        this.setGeometry(var8Lifetime1, var7Lifetime1, var6, (byte) -87, var9);
        for (var10 = 0; var10 < this.field_Qb; var10++) {
          this.field_Gb[var10].setBoundsAndLayout(-(2 * this.field_Fb) + var6, this.field_Fb, 2, var10 * this.field_Mb + this.field_Pb, this.field_Lb, this.field_Mb, this.field_Ib);
        }
    }

    ContextMenu(ContextMenu param0) {
        this(param0, param0.field_Jb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Ib, param0.field_Lb, param0.field_Pb, param0.field_Mb);
    }

    static {
        field_Ob = new ConnectionStage();
    }
}
