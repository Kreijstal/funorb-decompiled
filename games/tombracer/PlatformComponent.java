/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformComponent extends PrefabComponent {
    private int field_G;
    static ica field_F;
    static long field_H;

    public static void releaseStatics(int param0) {
        field_F = null;
        if (param0 != 15) {
          PlatformComponent.A(112);
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -128, this.field_G, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ln.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return false;
        }
        return false;
    }

    final static void a(IntrusiveNode param0, IntrusiveNode param1, byte param2) {
        try {
          if (null != param1.previous) {
            param1.unlink(63);
          }
          param1.previous = param0.previous;
          int var3_int = -97 % ((-39 - param2) / 63);
          param1.next = param0;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ln.VB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void A(int param0) {
        MessageDialog.j((byte) -116);
        int var1 = -6 / ((-10 - param0) / 45);
    }

    final static TimingPattern b(int param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 != 23688) {
          PlatformComponent.A(-122);
        }
        var2 = param0;
        if (var2 == 0) {
          return new TimingPattern(new int[]{});
        }
        if (1 == var2) {
          return new TimingPattern(new int[]{60, 60});
        }
        if (var2 == 2) {
          return new TimingPattern(new int[]{30, 30});
        }
        if (3 == var2) {
          return new TimingPattern(new int[]{15, 15});
        }
        if (var2 == 4) {
          return new TimingPattern(new int[]{40, 40, 20, 20});
        }
        if (var2 == 5) {
          return new TimingPattern(new int[]{40, 40, 20, 20, 20, 20});
        }
        if (var2 == 6) {
          return new TimingPattern(new int[]{40, 40, 20, 40, 20, 20});
        }
        if (var2 == 7) {
          return new TimingPattern(new int[]{5, 10, 10, 15, 5, 15, 10, 5, 10, 5, 20, 5});
        }
        if (var2 != 8) {
          return new TimingPattern(new int[]{});
        }
        return new TimingPattern(new int[]{15, 10, 10, 15, 10, 5, 10, 5, 15, 5, 10, 10});
    }

    PlatformComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_G = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    PlatformComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return false;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_F = (ica) null;
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        PlatformBehaviour var5 = null;
        ModelCodec var6 = null;
        PlatformModel var7 = null;
        Trap stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var5 = new PlatformBehaviour(param2, false);
          var5.b(-5, this.field_G);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          if (param1 != 3) {
            this.getRenderLayer(49);
          }
          if (60 != this.typeId) {
            var7 = (PlatformModel) (var6.createModel(17, param1 ^ 93));
            var7.setStyle(2, (byte) 23);
            var4.addModel(var5, (byte) 124, var7);
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ln.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return true;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.usesBehaviourModels(45);
          return 3;
        }
        return 3;
    }

    static {
        field_F = new ica();
    }
}
