/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConstantEffectBehaviour extends Behaviour {
    static ToolkitSprite field_q;
    static float field_p;
    static char[] field_n;
    private HazardEffect field_r;
    int field_o;

    final void tick(int param0) {
        this.field_o = this.getRoom(true).applyAreaEffect(125, this.trap.getY(9648), this.field_r, this.trap.getHeight((byte) 55), this.trap.getWidth(-111), this.trap.getX(param0 - 5415));
        if (param0 != 5418) {
          this.tick(-67);
        }
    }

    ConstantEffectBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_o = 0;
        try {
          this.field_r = new HazardEffect(1, 50);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "fra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ConstantEffectBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_o = 0;
        try {
          this.field_r = CharacterChoiceTile.decodeEffect((byte) 87, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "fra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setEffect(boolean param0, HazardEffect param1) {
        try {
          this.field_r = param1;
          if (!param0) {
            field_q = (ToolkitSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "fra.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int hashState(int param0, int param1) {
        if (param1 > -48) {
          return 23;
        }
        return param0;
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_n = null;
        if (param0 != -27203) {
          field_q = (ToolkitSprite) null;
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_r.encode(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "fra.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(param0, param1);
          this.field_r.setSource(this.getRoot(6), 2348);
          param1.b((byte) -103, 8);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "fra.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.getTypeId(false);
          return 0;
        }
        return 0;
    }

    static {
        field_p = 1.0f;
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
