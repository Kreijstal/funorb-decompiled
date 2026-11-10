/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConstantEffectBehaviour extends Behaviour {
    static ToolkitSprite field_q;
    static float field_p;
    static char[] field_n;
    private Effect field_r;
    int field_o;

    final void k(int param0) {
        this.field_o = this.b(true).a(125, this.field_g.getY(9648), this.field_r, this.field_g.getHeight((byte) 55), this.field_g.getWidth(-111), this.field_g.getX(param0 - 5415));
        if (param0 != 5418) {
          this.k(-67);
        }
    }

    ConstantEffectBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_o = 0;
        try {
          this.field_r = new Effect(1, 50);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ConstantEffectBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_o = 0;
        try {
          this.field_r = ad.a((byte) 87, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, Effect param1) {
        try {
          this.field_r = param1;
          if (!param0) {
            field_q = (ToolkitSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fra.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
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

    final void a(boolean param0, BitPacketBuffer param1) {
        try {
          super.a(param0, param1);
          this.field_r.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fra.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, Trap param1) {
        try {
          super.a(param0, param1);
          this.field_r.a(this.e(6), 2348);
          param1.b((byte) -103, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fra.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(false);
          return 0;
        }
        return 0;
    }

    static {
        field_p = 1.0f;
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
