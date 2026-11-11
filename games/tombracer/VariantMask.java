/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VariantMask {
    static ToolkitSprite field_d;
    private FlagSet flags;
    static String field_c;
    static int[] field_a;

    public static void releaseStatics(int param0) {
        if (param0 == 3) {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_a = (int[]) null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static GameClock a(int param0) {
        if (param0 != 0) {
          vb var2 = (vb) null;
          VariantMask.a((vb) null, (byte) 31);
          return (GameClock) ((Object) new NanoTickClock());
        }
        return (GameClock) ((Object) new NanoTickClock());
    }

    private final void init(byte param0) {
        this.flags = new FlagSet(3);
        if (param0 != -101) {
          return;
        }
        this.flags.setAll(true, 106);
    }

    final static void b(byte param0) {
        RoomComponentFactory.field_b = 0;
        if (param0 != 55) {
          field_d = (ToolkitSprite) null;
        }
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          this.flags.encode(param1, (byte) -120);
          if (param0 >= -13) {
            field_d = (ToolkitSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(vb param0, byte param1) {
        try {
          PitModel.field_n.b(param0.field_f);
          if (param1 != -42) {
            VariantMask.b((byte) -90);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bca.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean includes(int param0, int param1) {
        if (param1 != 14530) {
          return false;
        }
        if (-1 == param0) {
          return true;
        }
        return this.flags.get(0, param0);
    }

    public VariantMask() {
        this.init((byte) -101);
    }

    VariantMask(int param0, BitPacketBuffer param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 8) {
            this.init((byte) -101);
            return;
          }
          this.flags = new FlagSet(3, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bca.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_c = "Points from room +<%0>";
        field_a = new int[]{};
    }
}
