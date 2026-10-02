/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_b;
    static int archivePort;
    static rl field_i;
    private int field_h;
    static String pleaseWaitText;
    private long field_e;
    static boolean[] field_j;
    private DualLinkNode[] field_g;
    private DualLinkNode field_c;
    static Sprite[] silverStarShockFrames;

    final void a(long param0, int param1, DualLinkNode param2) {
        DualLinkNode var5 = null;
        try {
            if (null != param2.previousSecondaryNode) {
                param2.unlinkSecondaryNode((byte) 65);
            }
            int var6 = -92 % ((param1 - 34) / 51);
            var5 = this.field_g[(int)(param0 & (long)(-1 + this.field_h))];
            param2.nextSecondaryNode = var5;
            param2.previousSecondaryNode = var5.previousSecondaryNode;
            param2.previousSecondaryNode.nextSecondaryNode = param2;
            param2.secondaryKey = param0;
            param2.nextSecondaryNode.previousSecondaryNode = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Geoblox.field_C;
        if (null == this.field_c) {
          return null;
        }
        var2 = this.field_g[(int)(this.field_e & (long)(-1 + this.field_h))];
        if (param0 == -29925) {
          L1: while (true) {
            if (this.field_c == var2) {
              this.field_c = null;
              return null;
            }
            if (this.field_e != this.field_c.secondaryKey) {
              this.field_c = this.field_c.nextSecondaryNode;
              continue L1;
            }
            var3 = this.field_c;
            this.field_c = this.field_c.nextSecondaryNode;
            return var3;
          }
        }
        this.field_g = (DualLinkNode[]) null;
        L0: while (true) {
          if (this.field_c == var2) {
            this.field_c = null;
            return null;
          }
          if (this.field_e != this.field_c.secondaryKey) {
            this.field_c = this.field_c.nextSecondaryNode;
            continue L0;
          }
          var3 = this.field_c;
          this.field_c = this.field_c.nextSecondaryNode;
          return var3;
        }
    }

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = Geoblox.field_C;
        this.field_e = param0;
        var4 = this.field_g[(int)(param0 & (long)(param1 + this.field_h))];
        this.field_c = var4.nextSecondaryNode;
        L0: while (true) {
          if (var4 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (param0 != this.field_c.secondaryKey) {
            this.field_c = this.field_c.nextSecondaryNode;
            continue L0;
          }
          var5 = this.field_c;
          this.field_c = this.field_c.nextSecondaryNode;
          return var5;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            return;
        }
        silverStarShockFrames = null;
        pleaseWaitText = null;
        field_j = null;
        field_b = null;
    }

    vg(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_g = new DualLinkNode[param0];
        this.field_h = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          var3.nextSecondaryNode = var3;
          var3.previousSecondaryNode = var3;
        }
    }

    static {
        field_j = new boolean[33];
        pleaseWaitText = "Please wait...";
    }
}
