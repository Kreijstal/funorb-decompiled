/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackingCrusherComponent extends kna {
    static String field_H;
    static int field_F;
    static boolean field_G;

    final boolean z(int param0) {
        if (param0 != 0) {
          field_F = 126;
          return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
          field_H = (String) null;
          return 7;
        }
        return 7;
    }

    final static void a(String param0, byte param1) {
        if (param1 > -23) {
          return;
        }
        try {
          ji.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wta.TB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 ^ 1, 4194304, 4194304);
    }

    final static void A(int param0) {
        aca.field_h = new String[TouchSwitchBehaviour.field_n];
        aca.field_h[17] = pq.field_d;
        aca.field_h[20] = afa.field_b;
        aca.field_h[11] = aqa.field_b;
        aca.field_h[9] = cda.field_u;
        aca.field_h[21] = rua.field_jb;
        aca.field_h[19] = tq.field_b;
        aca.field_h[5] = tw.field_g;
        aca.field_h[4] = sma.field_d;
        aca.field_h[6] = nt.field_c;
        aca.field_h[7] = gn.field_A;
        if (param0 == 12) {
          aca.field_h[15] = oda.field_h;
          aca.field_h[16] = eka.field_n;
          aca.field_h[18] = se.field_q;
          aca.field_h[13] = wea.field_c;
          return;
        }
        field_G = true;
        aca.field_h[15] = oda.field_h;
        aca.field_h[16] = eka.field_n;
        aca.field_h[18] = se.field_q;
        aca.field_h[13] = wea.field_c;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    TrackingCrusherComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final Trap a(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        ApproachPlayerLocomotor var5 = null;
        CrusherBehaviour var6 = null;
        mfa var7 = null;
        dc var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.b((byte) -11, this.field_k, this.field_l);
          var9.a((byte) -3, 20);
          var9.h(param1, 0);
          var9.b((byte) 17, true);
          var9.a(4, (byte) -12, true);
          var5 = new ApproachPlayerLocomotor(param2, param0);
          var5.c(66, 0);
          var5.a(false, 262144);
          var9.a(var5, param1 ^ 3);
          var6 = new CrusherBehaviour(param2, param0);
          var6.a(25, 12, 1, 25, 12);
          var6.b((byte) 127, true);
          var9.a((byte) 83, (Behaviour) (var6));
          var7 = rm.field_a;
          var8 = (dc) (var7.a(11, param1 ^ 116));
          var9.a(var6, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("wta.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          field_H = (String) null;
          return false;
        }
        return false;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 15) {
          return;
        }
        field_H = null;
    }

    TrackingCrusherComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final void a(boolean param0, BitPacketBuffer param1) {
        try {
          super.a(param0, param1);
          if (param0) {
            field_F = 80;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wta.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Short Flamer";
        field_F = 2;
    }
}
