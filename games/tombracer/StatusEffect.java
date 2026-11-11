/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatusEffect extends IntrusiveNode {
    static UiComponent field_g;
    private int remaining;
    private int duration;
    private int kind;

    private final boolean b(int param0) {
        if (param0 >= 96) {
          return this.kind < 6 ? true : false;
        }
        this.restart(-115);
        return this.kind < 6 ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != 2907) {
          field_g = (UiComponent) null;
        }
    }

    final void encode(int param0, BitPacketBuffer param1) {
        boolean discarded$0 = false;
        try {
          param1.writeBits((byte) 2, this.kind, 4);
          if (param0 != -29928) {
            discarded$0 = this.b(-112);
          }
          param1.writeBits((byte) -5, this.duration / 50, 6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void restart(int param0) {
        if (param0 != 100) {
          return;
        }
        this.remaining = this.duration;
    }

    final int getKind(byte param0) {
        if (param0 != 91) {
          this.kind = -58;
          return this.kind;
        }
        return this.kind;
    }

    final boolean isExpired(byte param0) {
        int var2 = -122 % ((7 - param0) / 52);
        if (this.duration <= 0) {
          return false;
        }
        if (this.remaining <= 0) {
          return true;
        }
        return false;
    }

    final void tick(int param0) {
        this.remaining = this.remaining - 1;
        if (param0 != -9) {
          field_g = (UiComponent) null;
        }
    }

    final StatusEffect copy(int param0) {
        if (param0 == -1) {
          return new StatusEffect(this.kind, this.duration);
        }
        Player var3 = (Player) null;
        this.a((byte) -15, (Player) null);
        return new StatusEffect(this.kind, this.duration);
    }

    private StatusEffect(int param0, int param1) {
        this.duration = 100;
        this.kind = param0;
        this.duration = param1;
        this.restart(100);
    }

    final boolean a(byte param0, Player param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        try {
          if (this.b(97)) {
            return false;
          }
          var3_int = this.kind;
          if (6 == var3_int) {
          }
          var3_intLifetime1 = -41 % ((param0 - 43) / 44);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StatusEffect(Room param0, BitPacketBuffer param1) {
        this.duration = 100;
        try {
          this.kind = param1.readBits((byte) 44, 4);
          if (param0.formatVersion > 8) {
            this.duration = 50 * param1.readBits((byte) 44, 6);
          } else {
            this.duration = 100;
          }
          this.restart(100);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
