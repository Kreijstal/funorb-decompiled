/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bullet extends FlightBody {
    static String field_k;
    Aircraft sourceAircraft;
    int remainingTicks;
    static int field_g;
    static String field_j;

    public Bullet() {
        super(new Vector2());
    }

    final void spawn(int sideOffset, int headingOffset, double turnOffset, Aircraft sourceAircraft) {
        try {
          this.sourceAircraft = sourceAircraft;
          this.position.setFrom(this.sourceAircraft.position, true);
          this.speed = 20.0;
          this.remainingTicks = 64;
          this.headingOffset = headingOffset;
          this.heading = this.sourceAircraft.heading;
          this.moveSideways((byte) 111, (double)sideOffset);
          this.turn(turnOffset, (byte) 25);
          this.moveForward(24.0, 128);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "eu.M(" + sideOffset + ',' + headingOffset + ',' + turnOffset + ',' + (sourceAircraft != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 0) {
            field_g = -18;
          }
          if (null != BitmapFontMetrics.field_g) {
            try {
              BitmapFontMetrics.field_g.a(true, 0L);
              BitmapFontMetrics.field_g.a(24, IntKeyLookup.incomingPacket.payload, IntKeyLookup.incomingPacket.position, -105);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          IntKeyLookup.incomingPacket.position = IntKeyLookup.incomingPacket.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void requestMenu(byte obfuscationGuard, int screenId, boolean pointerSelection) {
        int var3 = -50 % ((-21 - obfuscationGuard) / 51);
        ec.menuTransitionTicks = 0;
        ci.nextMenuId = screenId;
        if (!(ci.nextMenuId < 0)) {
          aa.menuScreens[ci.nextMenuId].open(pointerSelection, 1);
        }
    }

    public static void c(int param0) {
        if (param0 != 24) {
          Bullet.c(111);
          field_j = null;
          field_k = null;
          return;
        }
        field_j = null;
        field_k = null;
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new byte[param1];
          var4 = var6;
          var5 = -115 / ((param2 + 94) / 32);
          au.a(param0, param3, var6, 0, param1);
          stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("eu.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          qm.a(ft.field_o, (byte) -31, op.field_a, param1, param0, os.field_w, 0);
          for (var2_int = 0; os.field_w > var2_int; var2_int++) {
            uf.field_d[param0 + var2_int] = var2_int;
          }
          qm.a(fj.field_d, (byte) -52, nh.field_a, false, param0 + param0, os.field_w + param0, param0);
          if (param0 >= os.field_w) {
            return;
          }
          os.field_w = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "eu.J(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Back";
    }
}
