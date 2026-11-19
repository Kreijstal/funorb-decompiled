/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeDeque {
    private DualLinkNode field_e;
    static SpriteAsset field_h;
    static int field_f;
    static SpriteAsset field_i;
    static int field_d;
    static int field_g;
    static IntrusiveDeque field_b;
    static String field_a;
    private DualLinkNode field_c;

    final void addLast(int param0, DualLinkNode param1) {
        try {
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary((byte) -42);
          }
          param1.secondaryNext = this.field_e;
          param1.secondaryPrevious = this.field_e.secondaryPrevious;
          int var3_int = 36 / ((param0 - 35) / 56);
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ol.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        TutorialAction.a((byte) -119, false, param0);
        int var2 = 99 % ((param1 + 21) / 62);
    }

    final int size(int param0) {
        int var5 = HoldTheLine.field_D;
        int var3 = -20 % ((param0 + 63) / 42);
        int var2 = 0;
        DualLinkNode var4 = this.field_e.secondaryNext;
        while (this.field_e != var4) {
          var4 = var4.secondaryNext;
          var2++;
        }
        return var2;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_b = null;
        if (param0 == 6985) {
          field_i = null;
          field_h = null;
          return;
        }
        field_i = (SpriteAsset) null;
        field_i = null;
        field_h = null;
    }

    final DualLinkNode removeFirst(byte param0) {
        int var3 = -20 / ((32 - param0) / 51);
        DualLinkNode var2 = this.field_e.secondaryNext;
        if (this.field_e != var2) {
          var2.unlinkSecondary((byte) -42);
          return var2;
        }
        return null;
    }

    final static boolean b(byte param0) {
        if (param0 != 38) {
          field_i = (SpriteAsset) null;
          return ra.field_Z.loadMasterIndex(-42);
        }
        return ra.field_Z.loadMasterIndex(-42);
    }

    final DualLinkNode next(int param0) {
        int var3 = -90 / ((23 - param0) / 32);
        DualLinkNode var2 = this.field_c;
        if (this.field_e != var2) {
          this.field_c = var2.secondaryNext;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final DualLinkNode first(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 < 64) {
          DualLinkNode var3 = (DualLinkNode) null;
          this.addLast(-122, (DualLinkNode) null);
          var2 = this.field_e.secondaryNext;
          if (this.field_e == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.secondaryNext;
          return var2;
        }
        var2Lifetime1 = this.field_e.secondaryNext;
        if (this.field_e == var2Lifetime1) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.secondaryNext;
        return var2Lifetime1;
    }

    final static void a(int param0, IntrusiveDeque param1) {
        try {
          param1.moveAllTo(-30510, RasterBuffer.field_e);
          if (param0 != 256) {
            field_d = 120;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ol.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
          field_f = 110;
          if (pj.b((byte) 87)) {
            return false;
          }
          if (0 >= fc.field_a) {
            return true;
          }
          return false;
        }
        if (pj.b((byte) 87)) {
          return false;
        }
        if (0 >= fc.field_a) {
          return true;
        }
        return false;
    }

    public SecondaryNodeDeque() {
        this.field_e = new DualLinkNode();
        this.field_e.secondaryPrevious = this.field_e;
        this.field_e.secondaryNext = this.field_e;
    }

    static {
        field_d = 256;
        field_f = 0;
        field_b = new IntrusiveDeque();
    }
}
