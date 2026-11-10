/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RotateLocomotor extends Locomotor {
    private int field_p;
    static jea field_o;

    final int hashState(int param0, int param1) {
        if (param0 != 0) {
          return -115;
        }
        param1 = CurveOperator.mixHash((byte) 23, param1, this.field_p);
        return param1;
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        try {
          super.encode(param0, (byte) -109);
          if (param1 >= -78) {
            this.applyConstraint(-41);
          }
          param0.writeBits((byte) -128, dqa.a(true, this.field_p, 12), 12);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "spa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 > -121) {
          this.field_p = -76;
          this.field_p = param1;
          return;
        }
        this.field_p = param1;
    }

    RotateLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_p = CoinItemComponent.a(true, 12, param1.readBits((byte) 44, 12));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "spa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    RotateLocomotor(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_p = 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "spa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void tick(byte param0) {
        this.trap.rotateBy(false, this.field_p);
        int var2 = 24 % ((param0 + 69) / 42);
    }

    final void applyConstraint(int param0) {
        if (param0 != 1) {
          this.a((byte) 79, 28);
        }
    }

    final int getTypeId(int param0) {
        if (param0 != 1) {
          this.hashState(40, 31);
          return 6;
        }
        return 6;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_o = null;
    }

    final void c(byte param0) {
        super.c((byte) -125);
        if (param0 >= -116) {
          return;
        }
        this.field_p = -this.field_p;
    }

    static {
    }
}
