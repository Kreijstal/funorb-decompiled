/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends kna {
    static efa field_F;

    final void a(boolean param0, BitPacketBuffer param1) {
        if (param0) {
          return;
        }
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "md.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 + 213, 2097152, 2097152);
        this.a((byte) 80, new mka[]{new mka(0, 0, 2097152, 0, 40)});
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    final Trap a(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        eq var5 = null;
        mfa var6 = null;
        boa var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.b((byte) -11, this.field_k, this.field_l);
          var4.a((byte) -3, 4);
          var4.h(param1, param1 ^ 3);
          var4.e(true, 122);
          var4.g(112, 1);
          var4.b((byte) 17, false);
          var4.a(1, (byte) -12, true);
          var5 = new eq(param2, param0);
          var4.a((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (boa) (var6.a(7, 103));
          var7.b(125, 0);
          var4.a((gr) null, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("md.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          this.t(100);
          return 7;
        }
        return 7;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          md.A(-92);
          return false;
        }
        return false;
    }

    public static void A(int param0) {
        if (param0 < 96) {
          md.A(19);
          field_F = null;
          return;
        }
        field_F = null;
    }

    md(Room param0, int param1) {
        super(param0, param1);
    }

    md(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    static {
    }
}
