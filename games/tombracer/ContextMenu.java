/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends UiComponent {
    static int field_Eb;
    private int field_tb;
    private tv[] field_Db;
    static fta field_yb;
    private int[] field_Fb;
    private int field_Gb;
    private int field_zb;
    private int field_wb;
    private int field_vb;
    private UiComponent field_ub;
    private Sprite[] field_Cb;
    private int field_Hb;
    static PacketBuffer field_Bb;
    private UiComponent field_Ab;
    static ToolkitModel[] field_Ib;
    private int field_xb;

    final void openAt(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        if (this.field_zb == 0) {
          this.field_Db[this.field_zb] = new tv(0L, (UiComponent) null, (UiComponent) null, this.field_ub, (Sprite) null, LegacyOpenGlTurbulentTextureEffect.field_c);
          this.field_Db[this.field_zb].field_bb = 1;
          this.addChild(-128, this.field_Db[this.field_zb]);
          this.field_Fb[this.field_zb] = -1;
          this.field_zb = this.field_zb + 1;
        }
        var6 = 0;
        for (var7 = 0; this.field_zb > var7; var7++) {
          var8 = this.field_Db[var7].b(this.field_wb, 16474, this.field_vb);
          if (var6 < var8) {
            var6 = var8;
          }
        }
        var6 = var6 + this.field_Hb * 2;
        if (param2 >= -50) {
          return;
        }
        var7Lifetime1 = this.field_tb + (this.field_zb * this.field_Gb + this.field_tb);
        var8Lifetime1 = PitSnakeModel.clampToScreenX((byte) -8, var6, param3, param4);
        var9 = LegacyTextureCache.clampToScreenY(param1, var7Lifetime1, param0, (byte) -98);
        this.setBounds(var6, var7Lifetime1, -23776, var9, var8Lifetime1);
        for (var10 = 0; this.field_zb > var10; var10++) {
          this.field_Db[var10].a(var6 - this.field_Hb * 2, this.field_Hb, this.field_vb, this.field_Gb, 0, this.field_wb, this.field_tb + var10 * this.field_Gb);
        }
        return;
    }

    final boolean handleEscape(int param0) {
        if (this.field_xb != param0) {
          return false;
        }
        if (MenuEntry.field_h == 13) {
          this.field_xb = -1;
          return true;
        }
        return true;
    }

    ContextMenu(UiComponent param0, Sprite[] param1, UiComponent param2, UiComponent param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Db = new tv[256];
        this.field_Fb = new int[256];
        this.field_xb = -2;
        try {
          this.field_vb = param6;
          this.field_Cb = param1;
          this.field_Hb = param4;
          this.field_tb = param7;
          this.field_ub = param2;
          this.field_Ab = param3;
          this.field_Gb = param8;
          this.field_wb = param5;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ola.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void e(byte param0) {
        OpenGlUnderwaterEffect.field_q = 0;
        bb.a(-21844);
        if (param0 <= 95) {
          field_Eb = -113;
        }
    }

    ContextMenu(ContextMenu param0) {
        this(param0, param0.field_Cb, param0.field_ub, param0.field_Ab, param0.field_Hb, param0.field_wb, param0.field_vb, param0.field_tb, param0.field_Gb);
    }

    final int updateAndPollAction(int param0, boolean param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        this.layoutFullScreen(-102, param1);
        if (!param1) {
          return -2;
        }
        for (var3 = 0; var3 < this.field_zb; var3++) {
          if (0 != this.field_Db[var3].field_y) {
            return this.field_Fb[var3];
          }
        }
        if (PlayerModel.field_b != param0) {
          return -1;
        }
        return this.field_xb;
    }

    final static void releaseKeyboardHandler(byte param0) {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        var1 = 1 % ((-53 - param0) / 62);
        if (TileOperator.field_n != null) {
          var2 = TileOperator.field_n;
          synchronized (var2) {
            TileOperator.field_n = null;
          }
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -39) {
          ContextMenu.releaseKeyboardHandler((byte) -65);
        }
        field_yb = null;
        field_Ib = null;
        field_Bb = null;
    }

    final void addItem(byte param0, int param1, String param2) {
        this.field_Db[this.field_zb] = new tv(0L, (UiComponent) null, (UiComponent) null, this.field_Ab, (Sprite) null, param2);
        this.field_Db[this.field_zb].field_C = this.field_Cb;
        if (param0 > -63) {
          return;
        }
        try {
          this.field_Db[this.field_zb].field_eb = true;
          this.field_Db[this.field_zb].field_bb = 1;
          this.addChild(-125, this.field_Db[this.field_zb]);
          this.field_Fb[this.field_zb] = param1;
          this.field_zb = this.field_zb + 1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ola.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void addIconItem(Sprite param0, int param1, String param2, boolean param3) {
        try {
          this.field_Db[this.field_zb] = new tv(0L, (UiComponent) null, (UiComponent) null, this.field_Ab, param0, param2);
          this.field_Db[this.field_zb].field_C = this.field_Cb;
          if (param3) {
            this.field_Cb = (Sprite[]) null;
          }
          this.field_Db[this.field_zb].field_eb = true;
          this.field_Db[this.field_zb].field_bb = 1;
          this.addChild(-128, this.field_Db[this.field_zb]);
          this.field_Fb[this.field_zb] = param1;
          this.field_zb = this.field_zb + 1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ola.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, ena param1) {
        try {
          hba.field_c = param1;
          if (param0 != 13) {
            field_Eb = -36;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ola.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_yb = new fta();
    }
}
