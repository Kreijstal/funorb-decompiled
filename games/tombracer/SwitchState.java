/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SwitchState implements noa {
    private int releaseDelay;
    private int pressDelay;
    static ToolkitModel[] field_a;
    private boolean firesOnActivate;
    private int usesLeft;
    private int activateDelay;
    static String field_o;
    private boolean on;
    static ResourceArchive field_j;
    private int rearmDelay;
    private int phase;
    private boolean locked;
    private SwitchLinkList links;
    private int deactivateDelay;
    static String field_h;
    private int phaseTimer;

    final void encode(SwitchableScope param0, byte param1, BitPacketBuffer param2) {
        try {
          this.links.encode(30489, param0, param2);
          param2.writeBits((byte) -127, this.activateDelay, 8);
          param2.writeBits((byte) -45, this.deactivateDelay, 8);
          param2.writeBits((byte) -125, this.pressDelay, 8);
          if (param1 <= 65) {
            BitPacketBuffer var5 = (BitPacketBuffer) null;
            this.encode((SwitchableScope) null, (byte) 97, (BitPacketBuffer) null);
          }
          param2.writeBits((byte) -126, this.releaseDelay, 8);
          param2.writeBits((byte) -45, this.rearmDelay, 8);
          param2.writeBits((byte) 77, this.firesOnActivate ? 1 : 0, 1);
          param2.writeBits((byte) -127, this.on ? 1 : 0, 1);
          param2.writeBits((byte) -126, this.usesLeft, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "jma.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void cancelRelease(byte param0) {
        if (param0 >= -63) {
          return;
        }
        this.phase = 3;
    }

    final void setUses(int param0, int param1) {
        if (param1 < 50) {
          return;
        }
        this.usesLeft = param0;
    }

    private final void beginRelease(byte param0) {
        if (param0 != -102) {
          this.setDelays(-19, 46, -116, 50, -114, 44);
          if (this.releaseDelay > 0) {
            this.phase = 4;
            this.phaseTimer = this.releaseDelay;
            return;
          }
          this.beginDeactivate(8);
          return;
        }
        if (this.releaseDelay > 0) {
          this.phase = 4;
          this.phaseTimer = this.releaseDelay;
          return;
        }
        this.beginDeactivate(8);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_h = null;
        if (param0 <= 39) {
          return;
        }
        field_o = null;
        field_j = null;
    }

    final boolean isEngaged(int param0) {
        if (param0 != 4) {
          field_j = (ResourceArchive) null;
          if (this.phase == 1) {
            return true;
          }
          if (this.phase != 2) {
            return this.phase == 3 ? true : false;
          }
          return true;
        }
        if (this.phase == 1) {
          return true;
        }
        if (this.phase == 2) {
          return true;
        }
        if (this.phase != 3) {
          return false;
        }
        return true;
    }

    SwitchState(int param0) {
        this(param0, new Switchable[]{});
    }

    private final void beginDeactivate(int param0) {
        if (param0 != 8) {
          this.beginRelease((byte) 60);
          if (this.deactivateDelay <= 0) {
            this.deactivate((byte) 63);
            return;
          }
          this.phaseTimer = this.deactivateDelay;
          this.phase = 5;
          return;
        }
        if (this.deactivateDelay <= 0) {
          this.deactivate((byte) 63);
          return;
        }
        this.phaseTimer = this.deactivateDelay;
        this.phase = 5;
    }

    private final void activate(int param0) {
        this.phase = 3;
        if (this.firesOnActivate) {
          this.fireTargets((byte) -70);
        }
        if (param0 <= 49) {
          this.beginPress(95);
          return;
        }
    }

    private final void deactivate(byte param0) {
        this.phase = 0;
        this.phaseTimer = this.rearmDelay;
        int var2 = 101 % ((param0 + 2) / 52);
        if (this.on) {
          this.fireTargets((byte) -70);
        }
    }

    final void resolveLinks(byte param0, SwitchableScope param1) {
        try {
          if (param0 != 48) {
            field_j = (ResourceArchive) null;
          }
          this.links.resolveTargets(param1, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "jma.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final SwitchLinkList getLinks(int param0) {
        if (param0 != 1) {
          this.beginRelease((byte) -23);
          return this.links;
        }
        return this.links;
    }

    private final boolean tickPhaseTimer(boolean param0) {
        if (this.phaseTimer <= 0) {
          return true;
        }
        this.phaseTimer = this.phaseTimer - 1;
        if (param0) {
          return false;
        }
        this.phaseTimer = 15;
        return false;
    }

    final boolean isActive(byte param0) {
        if (param0 < 70) {
          field_h = (String) null;
          if (this.phase == 3) {
            return true;
          }
          if (this.phase != 4) {
            return 5 == this.phase ? true : false;
          }
          return true;
        }
        if (this.phase == 3) {
          return true;
        }
        if (this.phase == 4) {
          return true;
        }
        if (5 != this.phase) {
          return false;
        }
        return true;
    }

    final void setInput(byte param0, boolean param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.locked) {
          return;
        }
        if (param0 != -14) {
          return;
        }
        var3 = this.phase;
        if (var3 == 0) {
          if (!this.tickPhaseTimer(true)) {
            return;
          }
          if (!param1) {
            return;
          }
          this.beginPress(param0 - 86);
          return;
        }
        if (1 == var3) {
          if (!param1) {
            this.cancelPress(param0 ^ 8182);
            return;
          }
          if (!this.tickPhaseTimer(true)) {
            return;
          }
          this.beginActivate(-121);
          return;
        }
        if (var3 == 2) {
          if (!this.tickPhaseTimer(true)) {
            return;
          }
          this.activate(103);
          return;
        }
        if (var3 == 3) {
          if (param1) {
            return;
          }
          this.beginRelease((byte) -102);
          return;
        }
        if (4 != var3) {
          if (5 != var3) {
            return;
          }
          if (!this.tickPhaseTimer(true)) {
            return;
          }
          this.deactivate((byte) 122);
          return;
        }
        if (param1) {
          this.cancelRelease((byte) -69);
          return;
        }
        if (!this.tickPhaseTimer(true)) {
          return;
        }
        this.beginDeactivate(8);
        return;
    }

    final boolean isOn(boolean param0) {
        if (!param0) {
          this.locked = true;
          return this.on;
        }
        return this.on;
    }

    final boolean f(byte param0) {
        if (param0 != -56) {
          return true;
        }
        return false;
    }

    private final void beginPress(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.pressDelay > 0) {
          this.phase = 1;
          this.phaseTimer = this.pressDelay;
          var2 = 109 % ((param0 + 20) / 61);
          return;
        }
        this.beginActivate(-125);
        var2Lifetime1 = 109 % ((param0 + 20) / 61);
    }

    private final void fireTargets(byte param0) {
        Switchable[] var3;
        int var4;
        int var6;
        Switchable[] var7;
        Switchable[] var10;
        Switchable var11;
        Switchable[] var12;
        Switchable var13;
        Switchable[] var14;
        Switchable var15;
        Switchable[] var16;
        Switchable var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        Switchable[] var3Lifetime1;
        Switchable[] var7Lifetime1;
        Switchable[] var7Lifetime2;
        Switchable[] var7Lifetime3;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.usesLeft > 0) {
          this.usesLeft = this.usesLeft - 1;
          if (this.usesLeft != 0) {
            if (param0 == -70) {
              if (null == this.links) {
                return;
              }
              var7 = this.links.getTargets(1);
              var10 = var7;
              var3 = var7;
              for (var4 = 0; var10.length > var4; var4++) {
                var11 = var10[var4];
                if (var11 != null) {
                  var11.toggle(119);
                }
              }
              return;
            }
            field_o = (String) null;
            if (null == this.links) {
              return;
            }
            var7Lifetime3 = this.links.getTargets(1);
            var12 = var7Lifetime3;
            var3Lifetime1 = var7Lifetime3;
            for (var4Lifetime3 = 0; var12.length > var4Lifetime3; var4Lifetime3++) {
              var13 = var12[var4Lifetime3];
              if (var13 != null) {
                var13.toggle(119);
              }
            }
            return;
          }
          this.locked = true;
        }
        if (param0 == -70) {
          if (null == this.links) {
            return;
          }
          var7Lifetime1 = this.links.getTargets(1);
          var16 = var7Lifetime1;
          for (var4Lifetime1 = 0; var16.length > var4Lifetime1; var4Lifetime1++) {
            var17 = var16[var4Lifetime1];
            if (var17 != null) {
              var17.toggle(119);
            }
          }
          return;
        }
        field_o = (String) null;
        if (null == this.links) {
          return;
        }
        var7Lifetime2 = this.links.getTargets(1);
        var14 = var7Lifetime2;
        for (var4Lifetime2 = 0; var14.length > var4Lifetime2; var4Lifetime2++) {
          var15 = var14[var4Lifetime2];
          if (var15 != null) {
            var15.toggle(119);
          }
        }
        return;
    }

    private final void cancelPress(int param0) {
        if (param0 != -8188) {
          return;
        }
        this.phase = 0;
    }

    private final void beginActivate(int param0) {
        if (param0 > -119) {
          this.phaseTimer = -37;
          if (this.activateDelay <= 0) {
            this.activate(69);
            return;
          }
          this.phaseTimer = this.activateDelay;
          this.phase = 2;
          return;
        }
        if (this.activateDelay <= 0) {
          this.activate(69);
          return;
        }
        this.phaseTimer = this.activateDelay;
        this.phase = 2;
    }

    final void setDelays(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.releaseDelay = param1;
        if (param4 == 5) {
          this.rearmDelay = param2;
          this.deactivateDelay = param3;
          this.pressDelay = param0;
          this.activateDelay = param5;
          return;
        }
        this.fireTargets((byte) -52);
        this.rearmDelay = param2;
        this.deactivateDelay = param3;
        this.pressDelay = param0;
        this.activateDelay = param5;
    }

    private SwitchState(int param0, Switchable[] param1) {
        this.on = false;
        this.firesOnActivate = true;
        try {
          this.links = new SwitchLinkList(param0, 0);
          this.links.setTargets(9, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "jma.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int hashState(int param0, int param1) {
        param1 = CurveOperator.mixHash((byte) 85, param1, this.phase);
        if (param0 > 59) {
          param1 = CurveOperator.mixHash((byte) 93, param1, this.phaseTimer);
          return param1;
        }
        this.usesLeft = 32;
        param1 = CurveOperator.mixHash((byte) 93, param1, this.phaseTimer);
        return param1;
    }

    SwitchState(int param0, Room param1, BitPacketBuffer param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.on = false;
        this.firesOnActivate = true;
        try {
          this.links = new SwitchLinkList(param0, 0, param1.formatVersion, param2);
          if (param1.formatVersion > 9) {
            this.activateDelay = param2.readBits((byte) 44, 8);
            this.deactivateDelay = param2.readBits((byte) 44, 8);
            this.pressDelay = param2.readBits((byte) 44, 8);
            this.releaseDelay = param2.readBits((byte) 44, 8);
            this.rearmDelay = param2.readBits((byte) 44, 8);
          } else {
            this.activateDelay = param2.readBits((byte) 44, 8);
            this.deactivateDelay = param2.readBits((byte) 44, 8);
          }
          stackIn_7_1 = (1 == param2.readBits((byte) 44, 1));
          this.firesOnActivate = stackIn_7_1;
          stackIn_10_1 = (param2.readBits((byte) 44, 1) == 1);
          this.on = stackIn_10_1;
          this.usesLeft = param2.readBits((byte) 44, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jma.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void setOn(int param0, boolean param1) {
        if (param0 == -2) {
          this.on = param1 ? true : false;
          return;
        }
        boolean discarded$3 = this.tickPhaseTimer(true);
        this.on = param1 ? true : false;
    }

    static {
        field_o = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_h = "Create unrated game";
    }
}
