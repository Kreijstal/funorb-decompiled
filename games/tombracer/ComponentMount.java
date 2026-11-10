/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ComponentMount {
    private int field_c;
    private int slot;
    private RoomComponent child;
    private RoomComponent owner;
    static jea field_b;
    private IntPoint offset;
    private IntPoint rotatedOffset;
    private int field_f;

    final void a(int param0, byte param1, Room param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.offset.x = -this.offset.x;
          this.rotateBy(param0, param3, (byte) -100);
          this.field_f = GameScreen.positiveModulo(-this.field_f, 8192, 111);
          if (param1 != -61) {
            return;
          }
          if (this.child == null) {
            return;
          }
          this.child.mirror(param2, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mka.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void attach(RoomComponent param0, int param1) {
        try {
          this.child = param0;
          param0.attachToParent(this.owner, this.slot, (byte) -52);
          param0.setPosition(1434528720, this.offset.y, this.offset.x);
          int var3_int = -62 / ((param1 - 30) / 49);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mka.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntPoint getOffset(byte param0) {
        if (param0 < 103) {
          this.rotatedOffset = (IntPoint) null;
          return this.offset;
        }
        return this.offset;
    }

    final static boolean b(int param0) {
        if (param0 == 8192) {
          return C2SChooseRewardPacket.field_a.field_Ab == SimpleConditionBehaviour.field_r ? true : false;
        }
        ComponentMount.releaseStatics((byte) -112);
        return C2SChooseRewardPacket.field_a.field_Ab == SimpleConditionBehaviour.field_r ? true : false;
    }

    final static void a(int param0, int param1) {
        if (~param1 != ~msa.field_a) {
          return;
        }
        if (null == SecondaryNodeDequeIterator.field_a) {
          return;
        }
        MatchProtocol.b(param0, 0);
    }

    final void setOwner(int param0, int param1, RoomComponent param2) {
        try {
          this.owner = param2;
          int var4_int = 19 / ((param0 - 76) / 46);
          this.slot = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mka.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        int var1 = 36 / ((-63 - param0) / 42);
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(false);
          return this.field_f;
        }
        return this.field_f;
    }

    final int b(byte param0) {
        if (param0 != -125) {
          this.rotatedOffset = (IntPoint) null;
          return this.field_c;
        }
        return this.field_c;
    }

    final RoomComponent getChild(int param0) {
        int var2 = 89 % ((28 - param0) / 54);
        return this.child;
    }

    ComponentMount(int param0, int param1, int param2, int param3, int param4) {
        this.offset = new IntPoint(param0, param1);
        this.field_c = param4;
        this.field_f = param3;
        this.rotatedOffset = new IntPoint();
        this.child = null;
    }

    final void rotateBy(int param0, int param1, byte param2) {
        int var4 = -53 % ((9 - param2) / 58);
        this.rotatedOffset.x = this.offset.x * param1 - param0 * this.offset.y;
        this.rotatedOffset.y = param0 * this.offset.x + param1 * this.offset.y;
    }

    final static boolean compareDisplayModes(dh param0, int param1, dh param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_a < param2.field_a) {
            return true;
          }
          if (param1 != 13) {
            field_b = (jea) null;
          }
          if (param0.field_a != param2.field_a) {
            return false;
          }
          if (param2.field_c <= param0.field_c) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mka.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
