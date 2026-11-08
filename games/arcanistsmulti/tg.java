/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_g;
    static hg field_e;
    static String field_a;
    static int[] field_f;
    private DualLinkNode field_h;
    static int field_d;
    private DualLinkNode field_c;
    static IndexedSprite[] field_b;

    final void a(DualLinkNode param0, int param1) {
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary((byte) 88);
          }
          param0.secondaryNext = this.field_h;
          param0.secondaryPrevious = this.field_h.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param1 != 15893) {
            this.a((byte) -116);
          }
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        int var2 = -79 / ((param0 - 63) / 45);
        return this.field_h == this.field_h.secondaryNext ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 >= 22) {
          return rg.a(param0, param2, 13, param3);
        }
        tg.a(101, false, -57, -39);
        return rg.a(param0, param2, 13, param3);
    }

    final DualLinkNode e(int param0) {
        DualLinkNode var2 = this.field_c;
        if (this.field_h != var2) {
          this.field_c = var2.secondaryNext;
          int var3 = -86 % ((65 - param0) / 55);
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 < 115) {
          this.a(-116);
          var2 = this.field_h.secondaryNext;
          if (var2 != this.field_h) {
            var2.unlinkSecondary((byte) 88);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_h.secondaryNext;
        if (var2Lifetime1 != this.field_h) {
          var2Lifetime1.unlinkSecondary((byte) 88);
          return var2Lifetime1;
        }
        return null;
    }

    final int b(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        DualLinkNode var3 = this.field_h.secondaryNext;
        while (this.field_h != var3) {
          var2++;
          var3 = var3.secondaryNext;
        }
        if (param0 < -64) {
          return var2;
        }
        this.a((byte) 126);
        return var2;
    }

    final void a(int param0) {
        DualLinkNode var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        while (true) {
          var2 = this.field_h.secondaryNext;
          if (var2 != this.field_h) {
            var2.unlinkSecondary((byte) 88);
            continue;
          }
          break;
        }
        if (param0 == 17) {
          this.field_c = null;
          return;
        }
        this.b(100);
        this.field_c = null;
        return;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 >= -44) {
          return;
        }
        field_g = null;
    }

    final DualLinkNode b(int param0) {
        if (param0 < 23) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_h.secondaryNext;
        if (this.field_h == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.secondaryNext;
        return var2;
    }

    public tg() {
        this.field_h = new DualLinkNode();
        this.field_h.secondaryPrevious = this.field_h;
        this.field_h.secondaryNext = this.field_h;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param3 != 17) {
          return -27;
        }
        return le.h(-1993);
    }

    static {
        field_g = " turn left";
        field_a = "Connection timed out. Please try using a different server.";
        field_f = new int[17];
    }
}
