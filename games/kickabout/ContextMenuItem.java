/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenuItem extends UiLayoutNode {
    private UiLayoutNode field_Bb;
    static ResourceArchive field_Eb;
    static int[] field_zb;
    static int field_Ab;
    static volatile int field_Fb;
    static int field_Cb;
    static boolean field_Db;
    static ScrollContainer field_Ib;
    UiLayoutNode field_yb;
    static String field_Gb;
    static int field_Hb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.setBounds(true, param2, param4, param3, param6);
        this.a(param0, -90, param1);
        if (param5 != 15114) {
          field_Hb = -18;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          for (var1_int = 0; vb.field_j > var1_int; var1_int++) {
            GrowableIntList.field_b[var1_int] = null;
          }
          vb.field_j = 0;
          if (param0 < 84) {
            ContextMenuItem.a(12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "vu.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == -15410) {
          field_Eb = null;
          field_zb = null;
          field_Gb = null;
          field_Ib = null;
          return;
        }
        ContextMenuItem.a(-117);
        field_Eb = null;
        field_zb = null;
        field_Gb = null;
        field_Ib = null;
    }

    ContextMenuItem(long param0, UiLayoutNode param1, UiLayoutNode param2, UiLayoutNode param3, Sprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Bb = new UiLayoutNode(0L, param2);
            this.field_Bb.field_N = param4;
            this.addChild((byte) -112, this.field_Bb);
          }
          if (param5 != null) {
            this.field_yb = new UiLayoutNode(0L, param3, param5);
            this.addChild((byte) -104, this.field_yb);
            this.invalidateChildren(false);
          } else {
            this.invalidateChildren(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("vu.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = -param0;
        if (this.field_Bb != null) {
          var4 = this.field_Bb.getPreferredWidth((byte) -74);
        }
        if (param1 > -61) {
          ContextMenuItem.a(-96);
        }
        int var5 = -param0;
        if (null != this.field_yb) {
          var5 = this.field_yb.computeContentWidth(this.field_q - param2 - var4 - (param0 + param2), 0);
        }
        int var6 = param2 + (var4 - (-param0 - var5)) + param2;
        if (var6 > this.field_q) {
          var5 = var5 + (-var6 + this.field_q);
          var6 = this.field_q;
        }
        if (this.field_A == 1) {
          param2 = param2 + (-var6 + this.field_q) / 2;
        }
        if (2 == this.field_A) {
          param2 = param2 + (this.field_q - var6);
        }
        if (this.field_Bb == null) {
          if (null == this.field_yb) {
          } else {
            this.field_yb.setBounds(true, var5, param0 + var4 + param2, 0, this.field_mb);
            this.field_yb.field_p = this.field_p;
            if (this.field_Bb == null) {
              this.field_yb.field_A = this.field_A;
            } else {
              this.field_yb.field_A = 0;
            }
          }
          return;
        }
        this.field_Bb.setBounds(true, var4, param2, 0, this.field_mb);
        this.field_Bb.field_p = this.field_p;
        if (null == this.field_yb) {
          return;
        }
        this.field_yb.setBounds(true, var5, param0 + var4 + param2, 0, this.field_mb);
        this.field_yb.field_p = this.field_p;
        if (this.field_Bb != null) {
          this.field_yb.field_A = 0;
          return;
        }
        this.field_yb.field_A = this.field_A;
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1 == 0) {
          var4 = -param0;
          if (null != this.field_Bb) {
            var4 = this.field_Bb.getPreferredWidth((byte) -92);
          }
          var5 = -param0;
          if (this.field_yb != null) {
            var5 = this.field_yb.getPreferredWidth((byte) -23);
          }
          return param2 + param0 + (param2 + var4 + var5);
        }
        this.a(-30, -44, -56, 15, -21, -62, 40);
        var4Lifetime1 = -param0;
        if (null != this.field_Bb) {
          var4Lifetime1 = this.field_Bb.getPreferredWidth((byte) -92);
        }
        var5Lifetime1 = -param0;
        if (this.field_yb != null) {
          var5Lifetime1 = this.field_yb.getPreferredWidth((byte) -23);
        }
        return param2 + param0 + (param2 + var4Lifetime1 + var5Lifetime1);
    }

    final static void a(boolean param0, boolean param1) {
        if (null != UrlRequest.field_e) {
          ar.a(15707, UrlRequest.field_e);
        }
        if (param0) {
          if (TextButton.field_v != null) {
            TextButton.field_v.hideMenu(param1, false);
          }
          nj.a(param1, -128);
          if (null != ck.field_b) {
            ck.field_b.draw(104, param1);
          }
          NumericDateInputWidget.a(30521, param1);
          return;
        }
        field_Db = true;
        if (TextButton.field_v != null) {
          TextButton.field_v.hideMenu(param1, false);
        }
        nj.a(param1, -128);
        if (null != ck.field_b) {
          ck.field_b.draw(104, param1);
        }
        NumericDateInputWidget.a(30521, param1);
    }

    static {
        field_zb = new int[128];
        field_Ab = 3;
        field_Fb = 0;
        field_Gb = "This kit is unlocked by a <col=ffff55>Hidden Achievement</col>.<br>";
        field_Hb = 2;
    }
}
