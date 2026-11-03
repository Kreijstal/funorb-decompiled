/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends SceneWidget {
    static String field_Nb;
    private SceneWidget field_Kb;
    static int[] field_Fb;
    private SceneWidget field_Eb;
    private int repeatDelay;
    private SceneWidget field_Pb;
    private SceneWidget field_Mb;
    private SceneWidget field_Rb;
    static int[] field_Sb;
    static MenuInputState field_Gb;
    private SceneWidget field_Jb;
    static int field_Ib;
    static SceneWidget field_Qb;
    static int field_Lb;
    static IntrusiveDeque field_Hb;

    public static void c(byte param0) {
        field_Qb = null;
        field_Hb = null;
        int var1 = -33 % ((49 - param0) / 39);
        field_Fb = null;
        field_Sb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final int a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        if (param0 != 3) {
          this.e((byte) -58);
        }
        int var6 = this.field_Rb.height - this.field_Pb.height;
        if (var6 > 0) {
          var7 = this.field_Pb.field_S;
          var8 = param1 - param3;
          var5 = (var8 * var7 + var6 / 2) / var6;
        }
        if (param2) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (param1 - param3 < var5) {
            var5 = -param3 + param1;
          }
          return var5;
        }
        if (var5 > -param3 + param1) {
          var5 = -param3 + param1;
        }
        if (0 > var5) {
          var5 = 0;
          return var5;
        }
        return var5;
    }

    final static PcmStreamMixer d(byte param0) {
        if (param0 != -58) {
          field_Lb = -5;
          return ClientContextMenu.field_d;
        }
        return ClientContextMenu.field_d;
    }

    VerticalScrollbar(long param0, VerticalScrollbar param1) {
        this(param0, param1.field_Kb, param1.field_Mb, param1.field_Eb, param1.field_Pb);
    }

    final boolean pollLineDown(byte param0) {
        if (this.field_Mb.field_P != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (param0 < 11) {
          field_Sb = (int[]) null;
        }
        if (this.field_Mb.heldPressButton == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (0 != this.repeatDelay) {
          return false;
        }
        this.repeatDelay = 3;
        return true;
    }

    final boolean e(byte param0) {
        if (this.field_Kb.field_P != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (0 != this.field_Kb.heldPressButton) {
          if (this.repeatDelay > 0) {
            this.repeatDelay = this.repeatDelay - 1;
            if (this.repeatDelay == 0) {
              this.repeatDelay = 3;
              return true;
            }
            if (param0 < 118) {
              VerticalScrollbar.c((byte) -109);
              return false;
            }
            return false;
          }
          if (this.repeatDelay == 0) {
            this.repeatDelay = 3;
            return true;
          }
          if (param0 < 118) {
            VerticalScrollbar.c((byte) -109);
            return false;
          }
          return false;
        }
        if (param0 >= 118) {
          return false;
        }
        VerticalScrollbar.c((byte) -109);
        return false;
    }

    final boolean k(int param0) {
        if (param0 <= 70) {
          return true;
        }
        return this.field_Pb.heldPressButton != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_S = param6;
        this.field_K = param5;
        this.field_D = param0;
        this.height = param2;
        this.a(param3, (byte) 108, param4, param1);
        if (param7 != -1) {
          VerticalScrollbar.a(55, 126);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        SceneWidget var17 = null;
        SceneWidget var18 = null;
        SceneWidget var19 = null;
        SceneWidget var14Lifetime1;
        SceneWidget var15Lifetime1;
        SceneWidget var16Lifetime1;
        SceneWidget var17Lifetime1;
        SceneWidget var18Lifetime1;
        SceneWidget var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.height < this.field_K * 2) {
          var6 = this.height / 2;
          var5 = this.height / 2;
        } else {
          var5 = this.field_K;
          var6 = -this.field_K + this.height;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param3 <= 0) {
          var9 = -param0 + param3;
          var10 = var7 - var8;
          var11 = 0;
          if (0 < var9) {
            var11 = (var9 / 2 + var10 * param2) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Kb;
          var14.field_K = this.field_K;
          var14.field_S = 0;
          var14.field_D = 0;
          var14.height = var5;
          var15 = this.field_Mb;
          var15.field_D = 0;
          var15.field_S = var6;
          var15.field_K = this.field_K;
          var15.height = this.height - var6;
          var16 = this.field_Rb;
          var16.field_K = this.field_K;
          var16.height = var7;
          var16.field_S = var5;
          var16.field_D = 0;
          var17 = this.field_Eb;
          var17.height = var12;
          var17.field_S = 0;
          var17.field_D = 0;
          var17.field_K = this.field_K;
          var18 = this.field_Jb;
          var18.field_S = var12;
          var18.field_D = 0;
          var18.field_K = this.field_K;
          var18.height = var7 - var12;
          var19 = this.field_Pb;
          var19.height = var8;
          if (param1 == 108) {
            var19.field_D = 0;
            this.field_Rb.field_rb = param3 > param0 ? true : false;
            this.field_Mb.field_rb = param3 > param0 ? true : false;
            this.field_Kb.field_rb = param3 > param0 ? true : false;
            var19.field_K = this.field_K;
            var19.field_S = var11;
            return;
          }
          return;
        }
        var8 = var8 * param0 / param3;
        if (!(this.field_K <= var8)) {
          var8 = this.field_K;
        }
        if (var8 > var7) {
          var8 = var7;
        }
        var9Lifetime1 = -param0 + param3;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (0 < var9Lifetime1) {
          var11Lifetime1 = (var9Lifetime1 / 2 + var10Lifetime1 * param2) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Kb;
        var14Lifetime1.field_K = this.field_K;
        var14Lifetime1.field_S = 0;
        var14Lifetime1.field_D = 0;
        var14Lifetime1.height = var5;
        var15Lifetime1 = this.field_Mb;
        var15Lifetime1.field_D = 0;
        var15Lifetime1.field_S = var6;
        var15Lifetime1.field_K = this.field_K;
        var15Lifetime1.height = this.height - var6;
        var16Lifetime1 = this.field_Rb;
        var16Lifetime1.field_K = this.field_K;
        var16Lifetime1.height = var7;
        var16Lifetime1.field_S = var5;
        var16Lifetime1.field_D = 0;
        var17Lifetime1 = this.field_Eb;
        var17Lifetime1.height = var12Lifetime1;
        var17Lifetime1.field_S = 0;
        var17Lifetime1.field_D = 0;
        var17Lifetime1.field_K = this.field_K;
        var18Lifetime1 = this.field_Jb;
        var18Lifetime1.field_S = var12Lifetime1;
        var18Lifetime1.field_D = 0;
        var18Lifetime1.field_K = this.field_K;
        var18Lifetime1.height = var7 - var12Lifetime1;
        var19Lifetime1 = this.field_Pb;
        var19Lifetime1.height = var8;
        if (param1 == 108) {
          var19Lifetime1.field_D = 0;
          this.field_Rb.field_rb = param3 > param0 ? true : false;
          this.field_Mb.field_rb = param3 > param0 ? true : false;
          this.field_Kb.field_rb = param3 > param0 ? true : false;
          var19Lifetime1.field_K = this.field_K;
          var19Lifetime1.field_S = var11Lifetime1;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        df var4 = null;
        sm var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var4 = (df) (he.field_b.c(param0 + 1504642273));
          while (var4 != null) {
            Pixelate.a(param1, (byte) 109, var4);
            var4 = (df) (he.field_b.last(1504642273));
          }
          if (param0 != 0) {
            field_Hb = (IntrusiveDeque) null;
          }
          var5 = (sm) (MusicPatchNode.field_J.c(param0 ^ 1504642273));
          while (var5 != null) {
            he.a((byte) -53, param1, var5);
            var5 = (sm) (MusicPatchNode.field_J.last(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2), "vp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        if (this.field_Eb.field_P != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.field_Eb.heldPressButton != 0) {
          if (0 < this.repeatDelay) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0 &&
            this.field_Pb.screenY + this.field_Pb.pendingYDelta > bg.field_k) {
            this.repeatDelay = 3;
            return true;
          }
        }
        if (param0 > 24) {
          return false;
        }
        VerticalScrollbar.c((byte) -65);
        return false;
    }

    VerticalScrollbar(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4) {
        super(param0, (SceneWidget) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        try {
          this.field_Kb = new SceneWidget(0L, param1);
          this.field_Mb = new SceneWidget(0L, param2);
          this.a(this.field_Kb, (byte) 26);
          this.a(this.field_Mb, (byte) 26);
          this.field_Rb = new SceneWidget(0L, (SceneWidget) null);
          this.a(this.field_Rb, (byte) 26);
          this.field_Eb = new SceneWidget(0L, param3);
          this.field_Jb = new SceneWidget(0L, param3);
          var9 = this.field_Eb;
          var10 = var9;
          this.field_Jb.field_A = true;
          var10.field_A = true;
          this.field_Rb.a(this.field_Eb, (byte) 26);
          this.field_Rb.a(this.field_Jb, (byte) 26);
          this.field_Pb = new SceneWidget(0L, param4);
          this.field_Pb.field_vb = true;
          this.field_Rb.a(this.field_Pb, (byte) 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("vp.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean j(int param0) {
        if (param0 != ~this.field_Jb.field_P) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.field_Jb.heldPressButton == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        if (bg.field_k >= this.field_Pb.pendingHeightDelta + (this.field_Pb.screenY + this.field_Pb.pendingYDelta + this.field_Pb.height)) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    static {
        field_Sb = new int[]{2, 20, 21, 27, 6, 5, 11, 13};
        field_Gb = new MenuInputState(1);
    }
}
