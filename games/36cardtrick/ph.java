/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private DualLinkNode[] field_e;
    private long field_d;
    private int field_c;
    private DualLinkNode field_b;
    static String field_a;

    public static void clearStaticReferences(int param0) {
        int var1 = 110 % ((-13 - param0) / 60);
        field_a = null;
    }

    final DualLinkNode a(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = Main.field_T;
        this.field_d = param1;
        if (param0 <= -26) {
          var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_c))];
          this.field_b = var4.secondaryNext;
          while (true) {
            if (var4 == this.field_b) {
              this.field_b = null;
              return null;
            }
            if (~param1 != ~this.field_b.field_j) {
              this.field_b = this.field_b.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.field_b;
          this.field_b = this.field_b.secondaryNext;
          return var5;
        }
        ph.a(22, 12);
        var4Lifetime1 = this.field_e[(int)(param1 & (long)(-1 + this.field_c))];
        this.field_b = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~param1 != ~this.field_b.field_j) {
            this.field_b = this.field_b.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.secondaryNext;
        return var5Lifetime1;
    }

    final static void c(int param0) {
        ga.a(true);
        if (tb.field_c != null) {
          AccountCreationResultPanel.a(tb.field_c, (byte) -76);
          r.b((byte) 123);
          kf.d(param0 ^ param0);
          ui.d((byte) -122);
          if (wk.b((byte) -112)) {
            na.field_r.h(1, 0);
            fe.a((byte) -38, 0);
            mc.a((byte) -126);
            return;
          }
          mc.a((byte) -126);
          return;
        }
        r.b((byte) 123);
        kf.d(param0 ^ param0);
        ui.d((byte) -122);
        if (!wk.b((byte) -112)) {
          mc.a((byte) -126);
          return;
        }
        na.field_r.h(1, 0);
        fe.a((byte) -38, 0);
        mc.a((byte) -126);
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Main.field_T;
        if (param0 != 26847) {
          return (DualLinkNode) null;
        }
        if (this.field_b == null) {
          return null;
        }
        var2 = this.field_e[(int)((long)(-1 + this.field_c) & this.field_d)];
        while (true) {
          if (this.field_b == var2) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.field_j != this.field_d) {
            this.field_b = this.field_b.secondaryNext;
            continue;
          }
          break;
        }
        var3 = this.field_b;
        this.field_b = this.field_b.secondaryNext;
        return var3;
    }

    ph(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_c = param0;
        this.field_e = new DualLinkNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_27_0 = false;
        if (param1) {
          return true;
        }
        if (param0 < 48) {
          if (65 > param0) {
            if (param0 >= 97 &&
              param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (65 <= param0 &&
          param0 <= 90) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final void a(DualLinkNode param0, long param1, int param2) {
        DualLinkNode var5 = null;
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary(12);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_c - 1))];
          param0.secondaryNext = var5;
          param0.secondaryPrevious = var5.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param2 != 6144) {
            field_a = (String) null;
          }
          param0.field_j = param1;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ph.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 35 / ((40 - param0) / 45);
        param1 = param1 & 8191;
        if (4096 > param1) {
          return param1 < 2048 ? ad.field_g[param1] : ad.field_g[-param1 + 4096];
        }
        return param1 >= 6144 ? -ad.field_g[8192 - param1] : -ad.field_g[param1 - 4096];
    }

    static {
        field_a = "Please try again in a few minutes.";
    }
}
