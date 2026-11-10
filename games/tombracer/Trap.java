/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Trap extends IntrusiveNode implements Switchable, SwitchableScope, Renderable, WorldBody, Collidable, noa, qn, Teleportable {
    private IntrusiveDeque children;
    static jea field_q;
    static int field_m;
    private SwitchableId switchableId;
    private Trap parent;
    private SwitchableId localSwitchableId;
    private int field_ab;
    private Room room;
    IntrusiveDeque locomotors;
    IntrusiveDeque behaviours;
    private boolean pushable;
    private int parentRotationSin;
    private int initialLocalY;
    private int localX;
    private int parentRotationCos;
    private int initialAngle;
    private int initialLocalX;
    private boolean movedThisTick;
    private int previousLocalX;
    private int angle;
    private int obstructionLevel;
    private boolean locomotorsEnabled;
    private int field_n;
    private int previousY;
    private boolean removeWhenBehavioursDone;
    private int height;
    private boolean independent;
    private boolean alwaysBlocksBeams;
    private int previousX;
    private boolean removeWhenLocomotorsDone;
    private boolean[] field_h;
    private int previousLocalY;
    private int localY;
    private int field_lb;
    private boolean field_cb;
    private boolean removed;
    private boolean[] field_W;
    private IntrusiveDeque models;
    private int width;
    private int lifetime;
    private boolean floating;
    private int collisionLevel;
    private int weight;
    private int pushMode;
    private boolean[] field_k;
    private bca field_o;
    private TeleportState field_fb;
    private int pushedTicks;
    private int crushThreshold;
    private boolean pushedThisTick;
    private boolean blockedY;
    private boolean blockedX;
    private int freezeTicks;
    private int field_H;
    private boolean collidesWithRelatives;
    private int field_z;
    private boolean attachedToParent;
    private int fallDepth;
    private int fallSpeed;
    private int verticalSize;

    final void addBehaviour(byte param0, Behaviour param1) {
        try {
          this.behaviours.addLast((byte) -58, param1);
          param1.attachToTrap(true, this);
          if (param0 != 83) {
            Locomotor var4 = (Locomotor) null;
            this.addLocomotor((Locomotor) null, 39);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(Collidable param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          if (!(param0 instanceof WorldBody)) {
            return false;
          }
          stackIn_5_0 = this.ignoresCollisionWith((WorldBody) ((Object) param0), (byte) -71);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fsa.PE(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void savePreviousPosition(byte param0) {
        this.previousLocalY = this.localY;
        if (param0 != 116) {
          this.b(83, 92, 87, -71, -11);
        }
        this.previousLocalX = this.localX;
        this.previousX = this.getX(3);
        this.previousY = this.getY(9648);
    }

    final void a(boolean param0, boolean param1, ui param2, ui param3) {
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        Locomotor var7 = null;
        Behaviour var8 = null;
        Trap var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param1) {
            stackIn_7_0 = (this.isIndependent((byte) -110));
          } else {
            stackIn_7_0 = true;
          }
          param1 = stackIn_7_0;
          if (param2 != null) {
            this.switchableId = param2.a(-114, param1);
          }
          if (param3 != null) {
            this.localSwitchableId = param3.a(-102, false);
          }
          var7 = (Locomotor) (this.locomotors.first(-80));
          while (var7 != null) {
            var7.a(param1, (byte) -128, param2, param3);
            var7 = (Locomotor) (this.locomotors.next(116));
          }
          if (!param0) {
            this.b((byte) -99, -59);
          }
          var8 = (Behaviour) (this.behaviours.first(-80));
          while (var8 != null) {
            var8.a(-121, param2, param1, param3);
            var8 = (Behaviour) (this.behaviours.next(115));
          }
          var9 = (Trap) (this.children.first(-80));
          while (var9 != null) {
            var9.a(true, param1, param2, param3);
            var9 = (Trap) (this.children.next(109));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("fsa.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void a(bca param0, byte param1) {
        boolean discarded$0 = false;
        try {
          this.field_o = param0;
          if (param1 != 121) {
            discarded$0 = this.k(-16, 107);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.TC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setCrushThreshold(int param0, int param1) {
        this.crushThreshold = param0;
        if (param1 != -1) {
          this.removeWhenLocomotorsDone = true;
        }
    }

    public final boolean isPushable(byte param0, boolean param1) {
        if (param0 != -55) {
          this.setPushMode(74, 122);
        }
        if (!param1) {
          return this.pushable;
        }
        return !this.floating ? true : false;
    }

    private final void t(int param0) {
        int var2 = this.getX(3);
        int var3 = this.getY(param0 - 2087504);
        int var4 = this.getElevation((byte) 115);
        this.room.getParticleEffects(false).a((byte) 101, param0 + var4, var2, var3);
    }

    final void setObstructionLevel(int param0, int param1) {
        boolean discarded$0 = false;
        this.obstructionLevel = param0;
        if (null != this.parent) {
          this.parent.setObstructionLevel(param0, 0);
        }
        if (param1 != 0) {
          discarded$0 = this.hasParent(-45);
        }
    }

    public final void render(int param0, iq param1) {
        boolean discarded$2 = false;
        if (this.removed) {
          return;
        }
        try {
          discarded$2 = this.hasParent(-76);
          if (param0 <= 103) {
            IntPoint var4 = (IntPoint) null;
            this.a((IntPoint) null, -117);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(TrapPart param0, byte param1, TrapModel param2) {
        if (param2 == null) {
          return;
        }
        if (param1 != 124) {
          return;
        }
        try {
          this.models.addLast((byte) -74, param2);
          param2.attach(param0, (WorldBody) (this), (byte) 36);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.OE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void rotateBy(boolean param0, int param1) {
        int var3;
        if (this.collisionLevel != 0 &&
          this.d(true)) {
          var3 = this.angle;
          this.angle = this.angle + param1;
          this.angle = GameScreen.positiveModulo(this.angle, 8192, -126);
          this.updateParentRotation((byte) -60);
          if (this.d(true, -3)) {
            this.angle = var3;
            this.updateParentRotation((byte) -60);
          }
        } else {
          this.angle = this.angle + param1;
          this.angle = GameScreen.positiveModulo(this.angle, 8192, -67);
          this.updateParentRotation((byte) -60);
        }
        if (param0) {
          return;
        }
        this.z(1);
    }

    private final boolean B(byte param0) {
        if (param0 != -81) {
          this.toString();
          return false;
        }
        return false;
    }

    public final boolean isFallingIntoPit(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -1) {
          this.pushedThisTick = false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.fallDepth == 0 && (!this.attachedToParent ||
          this.parent == null ||
          !this.parent.isFallingIntoPit(-1))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    private final void clearModels(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        TrapModel var4 = (TrapModel) (this.models.first(-80));
        while (var4 != null) {
          var4.i((byte) -30);
          var4 = (TrapModel) (this.models.next(126));
        }
        if (param0 != -1332) {
          this.getRandom(5);
        }
        this.models.clear(8);
    }

    final static void a(int param0, kea param1) {
        if (param0 != 0) {
          return;
        }
        try {
          BitPacketBuffer.a(true, Room.field_k, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.AF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getPreviousX(int param0) {
        if (param0 < 90) {
          this.blockedY = true;
        }
        return this.previousX;
    }

    final int hashState(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        param0 = CurveOperator.mixHash((byte) 79, param0, this.localX);
        if (param1 >= -100) {
          this.verticalSize = -42;
        }
        param0 = CurveOperator.mixHash((byte) 64, param0, this.localY);
        param0 = CurveOperator.mixHash((byte) 84, param0, this.angle);
        Locomotor var5 = (Locomotor) (this.locomotors.first(-80));
        while (var5 != null) {
          param0 = var5.hashState(0, param0);
          var5 = (Locomotor) (this.locomotors.next(121));
        }
        Behaviour var6 = (Behaviour) (this.behaviours.first(-80));
        while (var6 != null) {
          param0 = var6.hashState(param0, -109);
          var6 = (Behaviour) (this.behaviours.next(115));
        }
        return param0;
    }

    public final boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int stackIn_20_0 = 0;
        int var7Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param4 == 0 &&
          param3 == 0) {
          return true;
        }
        if (!this.isPushable((byte) -55, param1)) {
          return false;
        }
        if (param2 != 2) {
          for (var7 = 0; param5 > var7; var7++) {
            param4 = param4 * 11 / 12;
            param3 = 11 * param3 / 12;
          }
        }
        if (param0 <= 68) {
          return false;
        }
        this.b(1 + param5, param4, 123, param2, param3);
        if (this.previousLocalX + param4 == this.localX) {
          stackIn_20_0 = (this.localY == param3 + this.previousLocalY) ? 1 : 0;
        } else {
          stackIn_20_0 = 0;
        }
        var7Lifetime1 = stackIn_20_0;
        if (var7Lifetime1 == 0 &&
          param2 == 2) {
          this.pushedThisTick = true;
        }
        if (!param1 &&
          var7Lifetime1 != 0 &&
          8192 <= S2CNextRoundPacket.abs(param4, -124) + S2CNextRoundPacket.abs(param3, -127) &&
          param5 <= 2) {
          this.room.a(false, this.getX(3), 0, 0, this.getY(9648), 0);
        }
        return var7Lifetime1 != 0;
    }

    final void setSize(byte param0, int param1, int param2) {
        if (param0 != -11) {
          return;
        }
        this.height = param1;
        this.width = param2;
    }

    final void startFalling(boolean param0) {
        TrapModel var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (this.isFallingIntoPit(-1)) {
          return;
        }
        if (this.parent != null &&
          !this.attachedToParent) {
        }
        Trap var2 = (Trap) (this.children.first(-80));
        while (var2 != null) {
          if (var2.attachedToParent) {
            var2.startFalling(true);
          }
          var2 = (Trap) (this.children.next(120));
        }
        this.fallDepth = 1;
        this.obstructionLevel = 0;
        this.fallSpeed = 0;
        this.floating = param0 ? true : false;
        RenderScene var5 = this.room.getScene((byte) 104);
        if (var5 != null) {
          var3 = (TrapModel) (this.models.first(-80));
          while (var3 != null) {
            var3.updateSceneLayer(-65, var5);
            var3 = (TrapModel) (this.models.next(123));
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var6Lifetime1;
        this.savePreviousPositionsRecursive((byte) -116);
        if (this.collisionLevel <= 0) {
          this.localY = this.localY + param4;
          this.localX = this.localX + param1;
        } else {
          var6 = 0;
          if (param1 != 0) {
            var6 = 1;
            this.localX = this.localX + param1;
          }
          if (var6 != 0 &&
            this.a(this.getX(3) - this.previousX, 0, -4648, param3, param0) == 2) {
            this.localX = this.previousLocalX;
            this.blockedX = true;
          }
          var6Lifetime1 = 0;
          if (0 != param4) {
            this.localY = this.localY + param4;
            var6Lifetime1 = 1;
          }
          if (var6Lifetime1 != 0 &&
            this.a(0, this.getY(9648) - this.previousY, -4648, param3, param0) == 2) {
            this.blockedY = true;
            this.localY = this.previousLocalY;
          }
          if (this.d(false, -3)) {
            if (this.previousLocalX != this.localX) {
              this.blockedX = true;
            }
            if (this.previousLocalY != this.localY) {
              this.blockedY = true;
            }
            this.localX = this.previousLocalX;
            this.localY = this.previousLocalY;
          }
        }
        if (this.previousLocalX != this.localX ||
          this.localY != this.previousLocalY) {
          this.movedThisTick = true;
          this.z(1);
        }
        if (param2 <= 109) {
          this.isFallingIntoPit(109);
        }
    }

    public final boolean restsOnFloor(int param0) {
        int var2 = 14 / ((param0 - 6) / 46);
        return !this.floating ? true : false;
    }

    final void tick(int param0, boolean param1) {
        boolean stackIn_20_0 = false;
        Trap var4;
        int var5;
        Locomotor var6;
        TrapModel var7;
        IntrusiveDequeCursor var8;
        IntrusiveDequeCursor var9;
        IntrusiveDequeCursor var10;
        Locomotor var11;
        Behaviour var12;
        var5 = TombRacer.field_G ? 1 : 0;
        if (this.removed) {
          return;
        }
        this.field_fb.a(86);
        if (this.pushedThisTick) {
          if (0 == this.pushedTicks) {
            this.pushedTicks = this.room.getRandom(-88).nextBounded(3, 0);
          } else {
            this.pushedTicks = this.pushedTicks + 1;
          }
        } else {
          this.pushedTicks = 0;
        }
        this.pushedThisTick = false;
        if (this.lifetime > 0) {
          this.lifetime = this.lifetime - 1;
          if (this.lifetime == 0) {
            this.remove((byte) 109);
          }
        }
        if (this.n((byte) 123)) {
          this.D((byte) 118);
        }
        if (!param1) {
          stackIn_20_0 = (this.getSimulation(15470).isTimeFrozen(99));
        } else {
          stackIn_20_0 = true;
        }
        param1 = stackIn_20_0;
        if (!param1 &&
          this.freezeTicks > 0) {
          this.freezeTicks = this.freezeTicks - 1;
          param1 = true;
        }
        if (!param1 &&
          this.pushable &&
          this.getSimulation(15470).isEffectActive(8, 10915)) {
          this.tryPush(86, true, 1, 131072 - this.room.getRandom(90).nextBounded(262144, 0), -this.room.getRandom(85).nextBounded(262144, 0) + 131072, 0);
        }
        if (!this.isFallingIntoPit(-1)) {
          this.blockedX = false;
          this.blockedY = false;
          var8 = new IntrusiveDequeCursor(this.locomotors);
          if (this.locomotorsEnabled &&
            !param1) {
            var11 = (Locomotor) (var8.first(true));
            while (var11 != null) {
              if (var11.a((byte) 87)) {
                var11.unlink(126);
                var11 = (Locomotor) (var8.next(-1));
                continue;
              }
              if (var11.isEnabled(-80)) {
                var11.tick((byte) -121);
              }
              var11 = (Locomotor) (var8.next(-1));
            }
          }
          var6 = (Locomotor) (var8.first(true));
          while (var6 != null) {
            var6.applyConstraint(1);
            var6 = (Locomotor) (var8.next(-1));
          }
          var9 = new IntrusiveDequeCursor(this.behaviours);
          var12 = (Behaviour) (var9.first(true));
          while (var12 != null) {
            if (!var12.a((byte) 87)) {
              if (var12.isEnabled(-116)) {
                if (param1) {
                  if (!var12.p((byte) 120)) {
                    var12.tick(5418);
                  }
                } else {
                  var12.tick(5418);
                }
              }
            } else {
              var12.unlink(82);
            }
            var12 = (Behaviour) (var9.next(-1));
          }
          var10 = new IntrusiveDequeCursor(this.children);
          var4 = (Trap) (var10.first(true));
          while (var4 != null) {
            var4.tick(75, param1);
            if (var4.removed) {
              var4.unlink(2);
              var4.B(-165);
            }
            var4 = (Trap) (var10.next(-1));
          }
        }
        var7 = (TrapModel) (this.models.first(-80));
        while (var7 != null) {
          var7.tick(-1);
          var7 = (TrapModel) (this.models.next(126));
        }
        if (this.removeWhenLocomotorsDone &&
          this.locomotors.isEmpty((byte) 14)) {
          this.remove((byte) 109);
          return;
        }
        if (this.removeWhenBehavioursDone &&
          this.behaviours.isEmpty((byte) 14)) {
          this.remove((byte) 109);
          return;
        }
        if (param0 <= 26) {
          this.e(-93, 58);
        }
        if (!this.floating && (!this.attachedToParent ||
          null == this.parent) && this.room.a(0, (WorldBody) (this)) == 1) {
          this.startFalling(true);
          return;
        }
        if (this.fallDepth != 0 && (this.parent == null ||
          !this.parent.isFallingIntoPit(-1))) {
          this.fallDepth = this.fallDepth + this.fallSpeed;
          this.fallSpeed = this.fallSpeed + 16384;
          if (17825792 <= this.fallDepth) {
            this.destroy(4, (byte) 9);
            return;
          }
        }
        this.movedThisTick = false;
        return;
    }

    final void updateParentRotation(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.parent != null) {
          this.parentRotationSin = MouseInputHandler.sin2048((byte) 124, -this.parent.getFacingAngle(-25787) >> 2);
          this.parentRotationCos = bua.cos2048(0, -this.parent.getFacingAngle(param0 - 25727) >> 2);
        }
        if (param0 != -60) {
          this.parentRotationSin = -7;
        }
        Trap var4 = (Trap) (this.children.first(param0 ^ 116));
        while (var4 != null) {
          var4.updateParentRotation((byte) -60);
          var4 = (Trap) (this.children.next(113));
        }
    }

    public final int getWeight(int param0) {
        int var2 = -112 % ((param0 - 1) / 45);
        return this.weight;
    }

    final static int parseInt(int param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param0 != 57) {
              var12 = (CharSequence) null;
              Trap.parseInt(110, -65, true, (CharSequence) null);
            }
            var7 = param3.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param1) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param1 * var6 + var9;
                if (var6 != var10 / param1) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("fsa.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final void setWeight(byte param0, int param1) {
        this.weight = param1;
        if (param0 != -3) {
          this.locomotorsEnabled = false;
        }
    }

    final void setAttachedToParent(boolean param0, int param1) {
        if (param1 != 11468) {
          this.getPreviousX(-92);
        }
        this.attachedToParent = param0 ? true : false;
    }

    public final boolean crush(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -77) {
            return true;
          }
          if (!this.isCrushable(12507, param1)) {
            return false;
          }
          if (this.pushedTicks < this.crushThreshold) {
            return false;
          }
          this.destroy(3, (byte) 9);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fsa.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int y(byte param0) {
        if (param0 >= -56) {
          this.getWeight(80);
        }
        return this.field_n;
    }

    final Switchable a(boolean param0, int param1, byte param2) {
        Switchable var4;
        int var7;
        Behaviour var8;
        Locomotor var9;
        Trap var10;
        IntrusiveDequeCursor var11;
        IntrusiveDequeCursor var12;
        Switchable var4Lifetime1;
        Switchable var4Lifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        if (WhirlpoolDigest.matchesSwitchableId(param1, param0, -27201, (Switchable) (this))) {
          return (Switchable) (this);
        }
        var9 = (Locomotor) (this.locomotors.first(-80));
        while (var9 != null) {
          var4 = var9.a(param0, 1, param1);
          if (var4 != null) {
            return var4;
          }
          var9 = (Locomotor) (this.locomotors.next(119));
        }
        var11 = new IntrusiveDequeCursor(this.behaviours);
        var8 = (Behaviour) (var11.first(true));
        while (var8 != null) {
          var4Lifetime1 = var8.a(0, param1, param0);
          if (var4Lifetime1 != null) {
            return var4Lifetime1;
          }
          var8 = (Behaviour) (var11.next(-1));
        }
        var12 = new IntrusiveDequeCursor(this.children);
        if (param2 != -26) {
          this.setObstructionLevel(122, -84);
        }
        var10 = (Trap) (var12.first(true));
        while (var10 != null) {
          var4Lifetime2 = var10.a(param0, param1, (byte) -26);
          if (var4Lifetime2 != null) {
            return var4Lifetime2;
          }
          var10 = (Trap) (var12.next(-1));
        }
        return null;
    }

    public final Room getRoom(byte param0) {
        int var2 = 38 % ((param0 - 0) / 61);
        return this.room;
    }

    public final boolean l(int param0) {
        Projectile var3;
        boolean stackIn_10_0 = false;
        if (param0 != 0) {
          var3 = (Projectile) null;
          this.applyProjectileEffect((Effect) null, (Projectile) null, -25);
        }
        stackIn_10_0 = ((null != this.parent &&
          this.parent.l(0)) ||
          (this.room.o((byte) -82) &&
          !(this.a(this.room.i(6029), 31749))));
        return stackIn_10_0;
    }

    public final int getCollisionId(boolean param0) {
        if (!param0) {
          return 123;
        }
        return 3 * (1 + this.field_ab);
    }

    final int getTop(int param0) {
        if (param0 != 2) {
          return 72;
        }
        return this.getY(9648) - this.height / 2;
    }

    private final int a(int param0, TrapPart param1) {
        ObjectList var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = this.collectParts((byte) -30);
          if (param0 != 13464) {
            this.locomotorsEnabled = true;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3.size(-1)) {
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            if (param1 != var3.get(true, var4)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fsa.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private Trap(Room param0, Trap param1, BitPacketBuffer param2, boolean param3) {
        this(param0, 0, 0, 32, 32, 0, param3);
        int var9 = 0;
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_1 = false;
        boolean stackIn_49_1 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Locomotor var7_ref_wda = null;
        int var8 = 0;
        Behaviour var8_ref_nv = null;
        Trap var9_ref_fsa = null;
        int var10 = 0;
        TrapModel var11 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          this.parent = param1;
          if (param1 != null) {
            this.field_cb = false;
          }
          this.localX = CoinItemComponent.fromOffsetBinary(true, 12, param2.readBits((byte) 44, 12)) << 16;
          this.localY = CoinItemComponent.fromOffsetBinary(true, 12, param2.readBits((byte) 44, 12)) << 16;
          this.width = param2.readBits((byte) 44, 10) << 16;
          this.height = param2.readBits((byte) 44, 10) << 16;
          stackIn_6_1 = (param2.readBits((byte) 44, 1) == 1);
          this.removeWhenLocomotorsDone = stackIn_6_1;
          stackIn_9_1 = (param2.readBits((byte) 44, 1) == 1);
          this.removeWhenBehavioursDone = stackIn_9_1;
          this.lifetime = param2.readBits((byte) 44, 6) * 50;
          if (param0.formatVersion >= 10) {
            this.angle = SnakePitModel.a(4, 8192, 0, param2.readBits((byte) 44, 4));
          } else {
            this.angle = SnakePitModel.a(3, 8192, 0, param2.readBits((byte) 44, 3));
          }
          if (10 >= param0.formatVersion) {
            this.weight = param2.readBits((byte) 44, 8) / 5;
            this.crushThreshold = 0;
          } else {
            this.weight = param2.readBits((byte) 44, 8);
            this.crushThreshold = param2.readBits((byte) 44, 8);
          }
          if (4 <= param0.formatVersion) {
            stackIn_19_1 = (param2.readBits((byte) 44, 1) == 1);
            this.floating = stackIn_19_1;
            stackIn_22_1 = (param2.readBits((byte) 44, 1) == 1);
            this.pushable = stackIn_22_1;
            this.obstructionLevel = param2.readBits((byte) 44, 3);
            this.collisionLevel = param2.readBits((byte) 44, 3);
            this.pushMode = param2.readBits((byte) 44, 3);
          }
          if (param0.formatVersion <= 9) {
            if (this.collisionLevel > 1) {
              this.collisionLevel = this.collisionLevel + 1;
            }
            if (this.obstructionLevel > 1) {
              this.obstructionLevel = this.obstructionLevel + 1;
            }
          }
          var5_int = param2.readBits((byte) 44, 3);
          for (var6 = 0; var5_int > var6; var6++) {
            var7_ref_wda = PlantModel.readLocomotor(param2, (byte) 95, param0, param3);
            this.locomotors.addLast((byte) -49, var7_ref_wda);
            var7_ref_wda.attachToTrap(64, this);
          }
          var6Lifetime1 = param2.readBits((byte) 44, 3);
          for (var7 = 0; var7 < var6Lifetime1; var7++) {
            var8_ref_nv = WhiteNoiseOperator.readBehaviour(param3, (byte) 44, param0, param2);
            this.behaviours.addLast((byte) -88, var8_ref_nv);
            var8_ref_nv.attachToTrap(true, this);
          }
          if (param0.formatVersion < 2) {
            var7Lifetime1 = param2.readBits((byte) 44, 2);
          } else {
            var7Lifetime1 = param2.readBits((byte) 44, 3);
          }
          for (var8 = 0; var8 < var7Lifetime1; var8++) {
            var9_ref_fsa = new Trap(param0, this, param2, param3);
            this.children.addLast((byte) -120, var9_ref_fsa);
          }
          if (param0.formatVersion > 8) {
            var8Lifetime1 = param2.readBits((byte) 44, 3);
            for (var9 = 0; var9 < var8Lifetime1; var9++) {
              var10 = param2.readBits((byte) 44, 5) - 1;
              var11 = rm.field_a.readModel(param0, param2, false);
              this.a(this.b(3, var10), (byte) 124, var11);
            }
          } else {
            this.rebuildBehaviourModels(437453352, false);
          }
          this.field_o = new bca(param0.formatVersion, param2);
          this.saveInitialPlacement(0);
          if (param0.formatVersion < 14) {
            this.attachedToParent = true;
          } else {
            stackIn_49_1 = (1 == param2.readBits((byte) 44, 1));
            this.attachedToParent = stackIn_49_1;
          }
          if (param0.formatVersion >= 15) {
            this.verticalSize = param2.readBits((byte) 44, 8);
          } else {
            this.verticalSize = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_57_0 = var5;
          stackIn_57_1 = new StringBuilder().append("fsa.<init>(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param1 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isFloating(byte param0) {
        if (param0 < 56) {
          this.field_ab = 22;
        }
        return this.floating;
    }

    final void setPushable(boolean param0, int param1) {
        if (param1 < 114) {
          return;
        }
        this.pushable = param0 ? true : false;
    }

    final void h(boolean param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.behaviours);
        Behaviour var5 = (Behaviour) (var2.first(true));
        while (var5 != null) {
          var5.g(-2);
          var5 = (Behaviour) (var2.next(-1));
        }
        var2 = new IntrusiveDequeCursor(this.children);
        Trap var6 = (Trap) (var2.first(param0));
        while (var6 != null) {
          var6.h(true);
          var6 = (Trap) (var2.next(-1));
        }
    }

    public final int getFacingAngle(int param0) {
        int var2 = this.angle;
        if (this.parent != null) {
          var2 = var2 + this.parent.getFacingAngle(param0 + 0);
        }
        if (param0 != -25787) {
          this.getCollisionId(false);
        }
        return GameScreen.positiveModulo(var2, 8192, 124);
    }

    public final int getRenderX(byte param0) {
        int var2 = -82 % ((-23 - param0) / 53);
        return this.localX;
    }

    public final int getWidth(int param0) {
        if (param0 > -11) {
          this.localY = 62;
        }
        return this.width;
    }

    final void setLocalY(int param0, int param1) {
        this.localY = param0;
        if (param1 != -19879) {
          this.setLocalY(-99, -65);
        }
    }

    public final int getHeight(byte param0) {
        if (param0 != 55) {
          return -54;
        }
        return this.height;
    }

    public final String toString() {
        return this.describe(116) + " (id " + this.switchableId + ")";
    }

    final boolean isFrozen(byte param0) {
        if (param0 >= -63) {
          return true;
        }
        return this.freezeTicks > 0 ? true : false;
    }

    final int E(byte param0) {
        if (param0 != 3) {
          this.getLocalY(false);
        }
        return this.field_H;
    }

    final boolean s(byte param0) {
        int var2;
        if (!this.f(false)) {
          return false;
        }
        if (!this.isFallingIntoPit(-1) &&
          !this.isExpired(18407)) {
          if (this.obstructionLevel < 1) {
            return false;
          }
          var2 = -59 % ((param0 + 33) / 62);
          return true;
        }
        return false;
    }

    public final int getElevation(byte param0) {
        int var2 = -this.fallDepth;
        if (param0 != 115) {
          return -57;
        }
        if (this.parent != null) {
          var2 = var2 + this.parent.getElevation((byte) 115);
        }
        return var2;
    }

    final int getInitialLocalY(byte param0) {
        if (param0 >= -91) {
          this.getWidth(101);
        }
        return this.initialLocalY;
    }

    final int getAngle(byte param0) {
        if (param0 != -80) {
          this.previousLocalX = 121;
        }
        return this.angle;
    }

    final int getCollisionLevel(boolean param0) {
        if (!param0) {
          return -108;
        }
        return this.collisionLevel;
    }

    private final boolean b(int param0, byte param1) {
        if (param1 <= 104) {
          this.getPreviousY(-34);
        }
        return this.field_W[param0];
    }

    final void a(int param0, RenderScene param1) {
        int var4 = 0;
        CharSequence var5 = null;
        Trap var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.a(param1, true);
          var6 = (Trap) (this.children.first(-80));
          while (var6 != null) {
            var6.a(127, param1);
            var6 = (Trap) (this.children.next(115));
          }
          if (param0 <= 115) {
            var5 = (CharSequence) null;
            Trap.parseInt(-115, -22, false, (CharSequence) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fsa.WE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void encode(BitPacketBuffer param0, int param1) {
        BitPacketBuffer stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        BitPacketBuffer stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        BitPacketBuffer stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        BitPacketBuffer stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        BitPacketBuffer stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_32_2 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Trap var4 = null;
        int var5 = 0;
        Locomotor var6 = null;
        Behaviour var7 = null;
        TrapModel var8 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param0.writeBits((byte) 0, dqa.toOffsetBinary(true, this.localX >> 16, 12), 12);
          param0.writeBits((byte) -126, dqa.toOffsetBinary(true, this.localY >> 16, 12), 12);
          param0.writeBits((byte) -127, this.width >> 16, 10);
          param0.writeBits((byte) 72, this.height >> 16, 10);
          stackIn_3_0 = (BitPacketBuffer) (param0);
          stackIn_3_1 = 58;
          if (!this.removeWhenLocomotorsDone) {
            stackIn_4_2 = 0;
          } else {
            stackIn_4_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_3_0).writeBits((byte) stackIn_3_1, stackIn_4_2, 1);
          stackIn_6_0 = (BitPacketBuffer) (param0);
          stackIn_6_1 = 118;
          if (!this.removeWhenBehavioursDone) {
            stackIn_7_2 = 0;
          } else {
            stackIn_7_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_6_0).writeBits((byte) stackIn_6_1, stackIn_7_2, 1);
          param0.writeBits((byte) -125, this.lifetime / 50, 6);
          var3_int = -112 / ((param1 + 58) / 39);
          param0.writeBits((byte) -125, ResourceArchive.a((byte) 59, this.angle, 8192, 4), 4);
          param0.writeBits((byte) -127, this.weight, 8);
          param0.writeBits((byte) -128, this.crushThreshold, 8);
          stackIn_9_0 = (BitPacketBuffer) (param0);
          stackIn_9_1 = 123;
          if (this.floating) {
            stackIn_10_2 = 1;
          } else {
            stackIn_10_2 = 0;
          }
          ((BitPacketBuffer) (Object) stackIn_9_0).writeBits((byte) stackIn_9_1, stackIn_10_2, 1);
          stackIn_12_0 = (BitPacketBuffer) (param0);
          stackIn_12_1 = -25;
          if (!this.pushable) {
            stackIn_13_2 = 0;
          } else {
            stackIn_13_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_12_0).writeBits((byte) stackIn_12_1, stackIn_13_2, 1);
          param0.writeBits((byte) 26, this.obstructionLevel, 3);
          param0.writeBits((byte) -127, this.collisionLevel, 3);
          param0.writeBits((byte) -126, this.pushMode, 3);
          param0.writeBits((byte) -125, this.locomotors.size((byte) -16), 3);
          var6 = (Locomotor) (this.locomotors.first(-80));
          while (var6 != null) {
            var6.encode(param0, (byte) -100);
            var6 = (Locomotor) (this.locomotors.next(118));
          }
          param0.writeBits((byte) -127, this.behaviours.size((byte) -16), 3);
          var7 = (Behaviour) (this.behaviours.first(-80));
          while (var7 != null) {
            var7.encode(false, param0);
            var7 = (Behaviour) (this.behaviours.next(111));
          }
          param0.writeBits((byte) -126, this.countDependentChildren((byte) 112), 3);
          var4 = (Trap) (this.children.first(-80));
          while (var4 != null) {
            if (var4.isIndependent((byte) -119)) {
              var4.B(-165);
              var4.unlink(17);
            } else {
              var4.encode(param0, -14);
            }
            var4 = (Trap) (this.children.next(124));
          }
          if (this.room.formatVersion >= 9) {
            param0.writeBits((byte) 88, this.models.size((byte) -16), 3);
            var8 = (TrapModel) (this.models.first(-80));
            while (var8 != null) {
              param0.writeBits((byte) -127, 1 + this.a(13464, var8.getPart(-93)), 5);
              rm.field_a.writeModel(15682, param0, var8);
              var8 = (TrapModel) (this.models.next(109));
            }
          }
          this.field_o.a((byte) -125, param0);
          stackIn_31_0 = (BitPacketBuffer) (param0);
          stackIn_31_1 = -127;
          if (!this.attachedToParent) {
            stackIn_32_2 = 0;
          } else {
            stackIn_32_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_31_0).writeBits((byte) stackIn_31_1, stackIn_32_2, 1);
          param0.writeBits((byte) -126, this.verticalSize, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("fsa.BF(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setIndependent(byte param0, boolean param1) {
        this.independent = param1 ? true : false;
        int var3 = 114 / ((param0 - 2) / 50);
    }

    final void A(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        TrapModel var2 = (TrapModel) (this.models.first(-80));
        while (var2 != null) {
          var2.e(param0 ^ -23607);
          var2 = (TrapModel) (this.models.next(param0 ^ 23599));
        }
        Trap var4 = (Trap) (this.children.first(-80));
        while (var4 != null) {
          var4.A(23645);
          var4 = (Trap) (this.children.next(110));
        }
        if (param0 != 23645) {
          this.field_lb = -40;
        }
    }

    public final int getX(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
          this.a((byte) 51, true, -11);
        }
        int var2 = this.localX;
        if (null != this.parent) {
          var3 = var2 >> 8;
          var4 = this.localY >> 8;
          var2 = -((this.parentRotationSin >> 8) * var4) + var3 * (this.parentRotationCos >> 8);
          var2 = var2 + this.parent.getX(3);
        }
        return var2;
    }

    private final void a(RenderScene param0, int param1) {
        int var4 = 0;
        TrapModel var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.A((byte) 26) ||
            this.B((byte) -81)) {
            param0.removeFromLayer(9, (Renderable) (this), (byte) -33);
          }
          if (param1 != 9411) {
            this.field_cb = true;
          }
          var5 = (TrapModel) (this.models.first(-80));
          while (var5 != null) {
            var5.removeFromScene(param0, 120);
            var5 = (TrapModel) (this.models.next(125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fsa.GD(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void rebuildBehaviourModels(int param0, boolean param1) {
        Trap var3_ref = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        this.clearModels(-1332);
        Behaviour var3 = (Behaviour) (this.behaviours.first(param0 ^ -437453416));
        while (var3 != null) {
          this.a(var3, (byte) 124, rm.field_a.a(var3, (WorldBody) (this), -126));
          var3 = (Behaviour) (this.behaviours.next(107));
        }
        if (param1) {
          var3_ref = (Trap) (this.children.first(param0 ^ -437453416));
          while (var3_ref != null) {
            var3_ref.rebuildBehaviourModels(437453352, true);
            var3_ref = (Trap) (this.children.next(117));
          }
        }
        if (param0 != 437453352) {
          this.getTop(108);
        }
    }

    public final boolean canTeleport(byte param0) {
        if (param0 >= -102) {
          return false;
        }
        return this.n((byte) 120);
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_W[param2] = param1;
        if (this.parent != null) {
          this.parent.a(26492, param1, param2);
        }
        if (param0 != 26492) {
          RenderScene var5 = (RenderScene) null;
          this.a(-7, (RenderScene) null);
        }
    }

    final int I(int param0) {
        if (param0 != -16423) {
          this.setAlwaysBlocksBeams(false, -102);
        }
        return this.field_lb;
    }

    final void o(int param0, int param1) {
        this.room.collisionGrid.remove((Collidable) (this), (byte) 112);
        this.localX = this.localX + param0;
        this.localY = this.localY + param0;
        if (param1 <= 78) {
          return;
        }
        this.room.collisionGrid.insert((Collidable) (this), 7073);
        this.saveInitialPlacement(0);
    }

    public final SwitchableScope getScope(byte param0) {
        if (param0 < 105) {
          this.initialLocalY = 102;
        }
        return (SwitchableScope) ((Object) this.getRoot(0));
    }

    final int getInitialLocalX(int param0) {
        if (param0 < 7) {
          this.addHeight(54, -8);
        }
        return this.initialLocalX;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 31749) {
          this.getLocalX(5);
        }
        return this.field_o.a(param0, 14530);
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.setLocalX(-103, -125);
        }
        return this.removed;
    }

    final void l(int param0, int param1) {
        this.field_H = param0;
        if (param1 != 146366800) {
          this.initialLocalX = -18;
        }
    }

    private final boolean isCrushable(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12507) {
            this.removed = true;
          }
          stackIn_5_0 = (this.crushThreshold != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fsa.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final boolean a(TrapModel param0, int param1) {
        TrapPart var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!param0.a((byte) 70)) {
            var3 = param0.getPart(-100);
            if ((var3 != null &&
              this == var3.getTrap((byte) 74)) &&
              (decompiledFrameRemainder0 = !(!var3.a((byte) 87)))) {
              return false;
            }
            if (decompiledFrameRemainder0) {
              return false;
            }
          }
          var3_int = 89 / ((param1 + 65) / 41);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fsa.LD(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(int param0, int param1) {
        if (param1 <= 15) {
          this.getCollisionId(true);
        }
        this.field_z = param0;
    }

    final int getInitialAngle(int param0) {
        if (param0 != 0) {
          return -91;
        }
        return this.initialAngle;
    }

    final void B(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.room.collisionGrid.remove((Collidable) (this), (byte) 112);
        if (this.room.getScene((byte) -74) != null) {
          this.a(this.room.getScene((byte) -96), param0 ^ -9320);
        }
        if (param0 != -165) {
          return;
        }
        Trap var4 = (Trap) (this.children.first(-80));
        while (var4 != null) {
          var4.B(-165);
          var4 = (Trap) (this.children.next(110));
        }
    }

    final void setPushMode(int param0, int param1) {
        this.pushMode = param1;
        if (param0 < 99) {
          kea var4 = (kea) null;
          Trap.a(-31, (kea) null);
        }
    }

    public final SwitchableId getGlobalId(int param0) {
        if (param0 != 31974) {
          this.setAngle(-74, (byte) 85);
        }
        return this.switchableId;
    }

    final void D(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.savePreviousPosition((byte) 116);
        this.field_n = this.previousY;
        if (param0 != 118) {
          this.switchableId = (SwitchableId) null;
        }
        this.field_lb = this.previousX;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        Trap var3 = (Trap) (var2.first(true));
        while (var3 != null) {
          var3.D((byte) 118);
          var3 = (Trap) (var2.next(-1));
        }
    }

    public final TeleportState getTeleportState(boolean param0) {
        if (param0) {
          this.removeWhenLocomotorsDone = false;
        }
        return this.field_fb;
    }

    final void setLocalX(int param0, int param1) {
        this.localX = param1;
        if (param0 != 1) {
          iq var4 = (iq) null;
          this.render(120, (iq) null);
        }
    }

    final boolean isIndependent(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 > -108) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.independent && (null == this.parent ||
          !this.parent.isIndependent((byte) -113))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public final int applyProjectileEffect(Effect param0, Projectile param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IntrusiveDequeCursor var6 = null;
        Behaviour var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.ignoresCollisionWith(param0.field_g, (byte) -74)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!this.b(param0.type, (byte) 120)) {
            stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if (param2 >= -97) {
            this.blockedY = false;
          }
          var4_int = param1.i(-1);
          if (!this.intersectsRect((byte) 110, param1.getY(9648), param1.getX(3), var4_int, var4_int)) {
            stackIn_14_0 = 0;
            return stackIn_14_0;
          }
          var5 = 0;
          var6 = new IntrusiveDequeCursor(this.behaviours);
          var7 = (Behaviour) (var6.first(true));
          while (var7 != null) {
            var5 = var5 + var7.a(25940, param1, param0);
            var7 = (Behaviour) (var6.next(-1));
          }
          stackIn_19_0 = var5;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("fsa.SD(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int getY(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = this.localY;
        if (param0 != 9648) {
          this.rebuildBehaviourModels(-71, false);
        }
        if (this.parent != null) {
          var3 = this.localX >> 8;
          var4 = var2 >> 8;
          var2 = (this.parentRotationCos >> 8) * var4 + var3 * (this.parentRotationSin >> 8);
          var2 = var2 + this.parent.getY(param0 + 0);
        }
        return var2;
    }

    public final int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDequeCursor var8 = null;
        Behaviour var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.ignoresCollisionWith(param0.field_g, (byte) -119)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!this.b(param0.type, (byte) 125)) {
            stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if (!this.intersectsRect((byte) 110, param4, param2, param5, param1)) {
            stackIn_12_0 = 0;
            return stackIn_12_0;
          }
          var7_int = param3;
          var8 = new IntrusiveDequeCursor(this.behaviours);
          var9 = (Behaviour) (var8.first(true));
          while (var9 != null) {
            var7_int = var7_int + var9.a(param5, param1, param0, param2, (byte) 8, param4);
            var9 = (Behaviour) (var8.next(-1));
          }
          stackIn_17_0 = var7_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_20_0 = var7;
          stackIn_20_1 = new StringBuilder().append("fsa.WC(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final Player getPlayer(int param0) {
        int var2 = 68 % ((-84 - param0) / 32);
        return this.room.getPlayer(-53);
    }

    final void setFloating(byte param0, boolean param1) {
        this.floating = param1 ? true : false;
        if (param0 != 17) {
          this.field_lb = 34;
        }
    }

    Trap(Room param0, BitPacketBuffer param1, boolean param2) {
        this(param0, (Trap) null, param1, param2);
    }

    final int getLocalX(int param0) {
        if (param0 != 25745) {
          this.removed = true;
        }
        return this.localX;
    }

    final void n(int param0, int param1) {
        if (this.freezeTicks <= param0) {
          this.freezeTicks = param0;
          if (param1 >= -103) {
            Trap.K(-88);
          }
          return;
        }
    }

    final boolean isEmpty(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 35) {
          this.field_lb = 122;
        }
        stackIn_7_0 = (this.children.isEmpty((byte) 14)) && (this.behaviours.isEmpty((byte) 14)) && (this.locomotors.isEmpty((byte) 14));
        return stackIn_7_0;
    }

    final void z(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (null == this.room) {
          return;
        }
        this.room.collisionGrid.pruneOutsideBounds((Collidable) (this), -78);
        this.room.collisionGrid.insert((Collidable) (this), param0 + 7072);
        Trap var2 = (Trap) (this.children.first(-80));
        if (param0 != 1) {
          this.initialLocalY = 74;
        }
        while (var2 != null) {
          var2.z(param0 + 0);
          var2 = (Trap) (this.children.next(122));
        }
    }

    final void u(int param0) {
        Trap var2;
        TrapModel var2_ref;
        int var3;
        Locomotor var4;
        Behaviour var5;
        Trap var6;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.independent) {
          this.collidesWithRelatives = true;
        }
        var2 = (Trap) (this.children.first(-80));
        while (var2 != null) {
          if (var2.isIndependent((byte) -127)) {
            var2.B(param0 ^ -165);
            var2.unlink(48);
          }
          var2 = (Trap) (this.children.next(118));
        }
        this.updateParentRotation((byte) -60);
        this.saveInitialPlacement(param0 ^ param0);
        var4 = (Locomotor) (this.locomotors.first(param0 - 80));
        while (var4 != null) {
          var4.attachToTrap(88, this);
          var4 = (Locomotor) (this.locomotors.next(120));
        }
        var5 = (Behaviour) (this.behaviours.first(-80));
        while (var5 != null) {
          var5.attachToTrap(true, this);
          var5.n((byte) 86);
          var5 = (Behaviour) (this.behaviours.next(122));
        }
        var2_ref = (TrapModel) (this.models.first(-80));
        while (var2_ref != null) {
          if (this.a(var2_ref, param0 ^ -113)) {
            var2_ref.attach(var2_ref.getPart(-118), (WorldBody) (this), (byte) 36);
          } else {
            var2_ref.unlink(91);
          }
          var2_ref = (TrapModel) (this.models.next(124));
        }
        var6 = (Trap) (this.children.first(-80));
        while (var6 != null) {
          var6.parent = this;
          var6.u(param0 + 0);
          var6 = (Trap) (this.children.next(126));
        }
    }

    final IsaacCipher getRandom(int param0) {
        if (param0 != 1751085328) {
          return (IsaacCipher) null;
        }
        return this.room.getRandom(param0 - 1751085231);
    }

    final boolean d(int param0, boolean param1) {
        if (param0 != 50) {
          return false;
        }
        if (this.movedThisTick) {
          return true;
        }
        if (param1) {
          if (null == this.parent) {
            return false;
          }
          return this.parent.d(50, param1);
        }
        return false;
    }

    final int getTopElevation(int param0) {
        if (param0 != 0) {
          Trap.K(-55);
        }
        return this.verticalSize + this.getElevation((byte) 115);
    }

    private final String describe(int param0) {
        String var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!this.children.isEmpty((byte) 14)) {
          var2 = "Compound Trap";
        } else {
          if (this.behaviours.isEmpty((byte) 14) &&
            this.locomotors.isEmpty((byte) 14)) {
            var2 = "Empty Trap";
          } else {
            var2 = "Regular Trap";
          }
        }
        var2 = var2 + " [" + this.switchableId.id + "]";
        if (param0 <= 108) {
          this.verticalSize = -28;
        }
        return var2;
    }

    private final TrapPart b(int param0, int param1) {
        ObjectList var3 = this.collectParts((byte) -30);
        if (param1 >= 0 &&
          !(param1 >= var3.size(-1))) {
          return (TrapPart) (var3.get(true, param1));
        }
        if (param0 == 3) {
          return null;
        }
        return (TrapPart) null;
    }

    public final boolean b(boolean param0) {
        Collidable var3;
        boolean stackIn_11_0 = false;
        if (!param0) {
          var3 = (Collidable) null;
          this.a(-86, (WorldBody) null, (Collidable) null, -88);
        }
        if (null != this.parent &&
          this.parent.b(param0)) {
          return true;
        }
        stackIn_11_0 = (this.f(false)) || !(this.locomotors.isEmpty((byte) 14));
        return stackIn_11_0;
    }

    final void a(int param0, boolean param1) {
        this.removeWhenBehavioursDone = true;
        int var3 = 18 / ((-5 - param0) / 36);
    }

    final void a(iq param0, int param1) {
        boolean discarded$1 = false;
        int var4 = 0;
        Behaviour var5 = null;
        Trap var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = (Behaviour) (this.behaviours.first(-80));
          while (var5 != null) {
            var5.b(123, param0);
            var5 = (Behaviour) (this.behaviours.next(param1 + 10546));
          }
          var6 = (Trap) (this.children.first(-80));
          while (var6 != null) {
            var6.a(param0, -10425);
            var6 = (Trap) (this.children.next(123));
          }
          if (param1 != -10425) {
            discarded$1 = this.B((byte) 57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fsa.SB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(RenderScene param0, boolean param1) {
        int var4 = 0;
        TrapModel var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.A((byte) 105) ||
            this.B((byte) -81)) {
            param0.addToLayer((byte) 4, 9, (Renderable) (this));
          }
          if (!param1) {
            return;
          }
          var5 = (TrapModel) (this.models.first(-80));
          while (var5 != null) {
            var5.addToScene(0, param0);
            var5 = (TrapModel) (this.models.next(111));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fsa.VE(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void savePreviousPositionsRecursive(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.savePreviousPosition((byte) 116);
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        Trap var3 = (Trap) (var2.first(true));
        while (var3 != null) {
          var3.savePreviousPositionsRecursive((byte) -102);
          var3 = (Trap) (var2.next(-1));
        }
        if (param0 > -90) {
          this.localY = 92;
        }
    }

    final void b(int param0, int param1, int param2) {
        this.localY = param1;
        if (param0 != 437453352) {
          return;
        }
        this.localX = param2;
    }

    public final void toggle(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        Trap var4 = (Trap) (this.children.first(-80));
        while (var4 != null) {
          var4.toggle(-93);
          var4 = (Trap) (this.children.next(123));
        }
        Locomotor var5 = (Locomotor) (this.locomotors.first(-80));
        while (var5 != null) {
          var5.toggle(127);
          var5 = (Locomotor) (this.locomotors.next(109));
        }
        Behaviour var6 = (Behaviour) (this.behaviours.first(-80));
        while (var6 != null) {
          var6.toggle(-109);
          var6 = (Behaviour) (this.behaviours.next(112));
        }
        int var2 = 14 / ((28 - param0) / 49);
    }

    final void d(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        Trap var6 = (Trap) (this.children.first(-80));
        while (var6 != null) {
          if (!var6.a(param0, 31749)) {
            var6.remove((byte) 109);
            var6.unlink(39);
          }
          var6 = (Trap) (this.children.next(119));
        }
        if (param1 >= -7) {
          ui var5 = (ui) null;
          this.a(true, false, (ui) null, (ui) null);
        }
    }

    private final void saveInitialPlacement(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.initialLocalX = this.getLocalX(25745);
        this.initialLocalY = this.getLocalY(false);
        if (param0 != 0) {
          return;
        }
        this.initialAngle = this.getAngle((byte) -80);
        Trap var4 = (Trap) (this.children.first(-80));
        while (var4 != null) {
          var4.saveInitialPlacement(0);
          var4 = (Trap) (this.children.next(126));
        }
        this.savePreviousPosition((byte) 116);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -12) {
          return;
        }
        this.b(0, param1, 127, this.pushMode, param2);
    }

    public final boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        Behaviour var11 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 <= 55) {
            return true;
          }
          if (this.isAttachedToParent(-107)) {
            return false;
          }
          if (this.ignoresCollisionWith(param1, (byte) -72)) {
            return false;
          }
          if (param7 > this.obstructionLevel) {
            return false;
          }
          if (!this.intersectsRect((byte) 110, param4, param6, param0, param3)) {
            return false;
          }
          var11 = (Behaviour) (this.behaviours.first(-80));
          while (true) {
            if (var11 == null) {
              return false;
            }
            if (!var11.a(param0, param3, 1, param6, param4, param7, param5)) {
              var11 = (Behaviour) (this.behaviours.next(126));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("fsa.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = TombRacer.field_G ? 1 : 0;
        if (!this.j(param4, 8192)) {
          return 0;
        }
        if (!this.intersectsRect((byte) 110, param2, param3, param5, param1)) {
          return 0;
        }
        if (!param0) {
          this.blockedX = true;
        }
        int var7 = 0;
        Behaviour var8 = (Behaviour) (this.behaviours.first(-80));
        while (var8 != null) {
          if (var8.isEnabled(-97)) {
            var7 = var7 + var8.a(param1, param5, param2, param4, (byte) 88, param3);
          }
          var8 = (Behaviour) (this.behaviours.next(126));
        }
        return var7;
    }

    final void destroy(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.getSimulation(param1 ^ 15463).getObserver(9262).onTrapDestroyed(this, param1 ^ 8);
        if (param1 != 9) {
          this.locomotorsEnabled = true;
        }
        this.t(param1 ^ 2097161);
        TrapModel var5 = (TrapModel) (this.models.first(param1 - 89));
        while (var5 != null) {
          var5.a((byte) -91, param0);
          var5 = (TrapModel) (this.models.next(118));
        }
        this.remove((byte) 109);
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = -63 % ((param0 + 61) / 41);
        this.field_h[param2] = param1;
        if (this.parent != null) {
          this.parent.a((byte) 102, param1, param2);
        }
    }

    public final SwitchableId getLocalId(byte param0) {
        if (param0 != 84) {
          return (SwitchableId) null;
        }
        return this.localSwitchableId;
    }

    public final void moveTo(int param0, int param1, int param2) {
        this.room.collisionGrid.remove((Collidable) (this), (byte) 115);
        this.b(437453352, param0, param1);
        this.savePreviousPositionsRecursive((byte) -108);
        this.room.collisionGrid.insert((Collidable) (this), param2 ^ 7075);
        if (param2 != 2) {
          this.parentRotationCos = -48;
        }
    }

    final void addHeight(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        TrapModel var5 = (TrapModel) (this.models.first(-80));
        while (var5 != null) {
          var5.addElevationOffset(param1, (byte) 122);
          var5 = (TrapModel) (this.models.next(param0 ^ 102));
        }
        if (param0 != 10) {
          this.switchableId = (SwitchableId) null;
        }
        this.verticalSize = this.verticalSize + param1;
    }

    public static void K(int param0) {
        if (param0 != 8424) {
          field_m = -93;
        }
        field_q = null;
    }

    public final Switchable findSwitchable(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
          return (Switchable) null;
        }
        if (param2) {
          return this.a(param2, param1, (byte) -26);
        }
        return this.room.findSwitchable(param0 + 0, param1, param2);
    }

    final Trap cloneInto(int param0, Room param1, boolean param2) {
        BitPacketBuffer var4 = null;
        RuntimeException var4_ref = null;
        Trap var5 = null;
        Trap stackIn_2_0 = null;
        Trap stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new BitPacketBuffer(30000);
          var4.beginBitWrite(8);
          if (param0 != -14402) {
            stackIn_2_0 = (Trap) null;
            return stackIn_2_0;
          }
          this.encode(var4, -108);
          var4.endBitWrite(-1826190686);
          var4.position = 0;
          var4.beginBitAccess((byte) 111);
          var5 = new Trap(param1, var4, param2);
          var4.endBitAccess((byte) 98);
          var5.a(true, param2, (ui) null, new ui());
          var5.h(true);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("fsa.SE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean canBeCrushedBy(WorldBody param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.movedThisTick = true;
          }
          stackIn_6_0 = (this.isCrushable(param1 ^ 12507, param0)) && (this.crushThreshold <= this.pushedTicks);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fsa.OA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void enableLocomotors(int param0) {
        this.locomotorsEnabled = true;
        int var2 = 66 % ((param0 - 60) / 58);
    }

    final void a(Room param0, boolean param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Locomotor var5 = null;
        Behaviour var6 = null;
        TrapModel var7 = null;
        Trap var8 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          param0.collisionGrid.remove((Collidable) (this), (byte) 116);
          if (param1) {
            this.localSwitchableId = (SwitchableId) null;
          }
          if (!this.n((byte) 122)) {
            this.previousLocalX = -this.previousLocalX;
            this.localX = -this.localX;
          } else {
            this.localX = param0.mirrorX(this.localX, (byte) 71);
            this.previousLocalX = param0.mirrorX(this.previousLocalX, (byte) 71);
          }
          this.field_lb = param0.mirrorX(this.field_lb, (byte) 71);
          this.previousX = param0.mirrorX(this.previousX, (byte) 71);
          if (this.n((byte) 108)) {
            this.initialLocalX = param0.mirrorX(this.initialLocalX, (byte) 71);
          } else {
            this.initialLocalX = -this.initialLocalX;
          }
          this.initialAngle = GameScreen.positiveModulo(-this.initialAngle, 8192, -35);
          this.angle = GameScreen.positiveModulo(-this.angle, 8192, -97);
          param0.collisionGrid.insert((Collidable) (this), 7073);
          var5 = (Locomotor) (this.locomotors.first(-80));
          while (var5 != null) {
            var5.c((byte) -122);
            var5 = (Locomotor) (this.locomotors.next(114));
          }
          var6 = (Behaviour) (this.behaviours.first(-80));
          while (var6 != null) {
            var6.h(28701);
            var6 = (Behaviour) (this.behaviours.next(116));
          }
          var7 = (TrapModel) (this.models.first(-80));
          while (var7 != null) {
            var7.h(65);
            var7 = (TrapModel) (this.models.next(110));
          }
          var8 = (Trap) (this.children.first(-80));
          while (var8 != null) {
            var8.a(param0, false);
            var8 = (Trap) (this.children.next(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("fsa.CC(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean n(byte param0) {
        if (param0 <= 105) {
          this.getAngle((byte) -1);
        }
        return this.field_cb;
    }

    final void F(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.room.getScene((byte) 104) != null) {
          this.a(this.room.getScene((byte) 49), true);
        }
        Trap var4 = (Trap) (this.children.first(-80));
        while (var4 != null) {
          var4.F(127);
          var4 = (Trap) (this.children.next(108));
        }
        this.u(0);
        this.savePreviousPosition((byte) 116);
        if (param0 < 96) {
          this.setLocalY(-88, 5);
        }
        this.z(1);
    }

    private final boolean hasParent(int param0) {
        if (param0 >= -40) {
          this.getPlayer(37);
        }
        return null != this.parent ? true : false;
    }

    final void setCollisionLevel(int param0, byte param1, boolean param2) {
        IntrusiveDequeCursor var4 = null;
        Trap var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        this.collisionLevel = param0;
        if (param2) {
          var4 = new IntrusiveDequeCursor(this.children);
          var5 = (Trap) (var4.first(true));
          while (var5 != null) {
            var5.setCollisionLevel(param0, (byte) -12, param2);
            var5 = (Trap) (var4.next(param1 ^ 11));
          }
        }
        if (param1 != -12) {
          this.crushThreshold = -21;
        }
    }

    final void addLocomotor(Locomotor param0, int param1) {
        try {
          this.locomotors.addLast((byte) -101, param0);
          param0.attachToTrap(45, this);
          if (param1 != 0) {
            this.room = (Room) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.WD(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean ignoresCollisionWith(WorldBody param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == this) {
            return true;
          }
          if (this.collidesWithRelatives) {
            return false;
          }
          if (param1 >= -43) {
            this.isIndependent((byte) -34);
          }
          if (param0 instanceof Trap &&
            this.getRoot(0) == ((Trap) (param0)).getRoot(0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("fsa.AD(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0, int param1) {
        int var3 = -10 / ((-12 - param0) / 42);
    }

    final Trap getRoot(int param0) {
        if (param0 != 0) {
          this.obstructionLevel = 55;
        }
        if (this.parent != null) {
          return this.parent.getRoot(0);
        }
        return this;
    }

    Trap(Room param0, boolean param1) {
        this(param0, 0, 0, 32, 32, 0, param1);
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          this.moveTo(65, 113, 36);
        }
        return this.getElevation((byte) 115);
    }

    public final boolean intersectsRect(byte param0, int param1, int param2, int param3, int param4) {
        if (this.removed) {
          return false;
        }
        if (param0 != 110) {
          ui var7 = (ui) null;
          this.a(false, false, (ui) null, (ui) null);
        }
        return io.centredBoxesOverlap(this.getWidth(-72), param1, (byte) -89, this.getHeight((byte) 55), param2, this.getY(9648), param3, param4, this.getX(3));
    }

    final int r(byte param0) {
        if (param0 != -95) {
          this.z(-122);
        }
        return this.getX(3) - this.width / 2;
    }

    final boolean wasBlockedY(byte param0) {
        if (param0 > -40) {
          return false;
        }
        return this.blockedY;
    }

    final void addChild(int param0, Trap param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.children.addLast((byte) -111, param1);
          param1.field_cb = false;
          param1.parent = this;
          param1.u(0);
          if (param0 >= -29) {
            this.setIndependent((byte) 16, false);
          }
          if (this.isIndependent((byte) -117)) {
            param1.setIndependent((byte) -74, true);
            param1.F(98);
          } else {
            param1.F(98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fsa.UC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int getLocalY(boolean param0) {
        if (param0) {
          return 31;
        }
        return this.localY;
    }

    final void setAngle(int param0, byte param1) {
        if (param1 < 69) {
          this.setCrushThreshold(-37, 91);
        }
        this.angle = param0;
    }

    final PlayerSimulation getSimulation(int param0) {
        if (param0 != 15470) {
          this.getLocalId((byte) -88);
        }
        return this.room.getSimulation(param0 ^ -1553485410);
    }

    final int w(int param0) {
        if (param0 != 17825792) {
          this.field_k = (boolean[]) null;
        }
        return this.field_z;
    }

    private final boolean f(boolean param0) {
        if (param0) {
          this.toggle(-111);
        }
        return this.pushable;
    }

    final void a(boolean param0, byte param1, int param2) {
        this.field_k[param2] = param0;
        if (this.parent != null) {
          this.parent.a(param0, (byte) -116, param2);
        }
        int var4 = -79 / ((param1 - 40) / 58);
    }

    final void remove(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.removed) {
          return;
        }
        this.removed = true;
        Behaviour var5 = (Behaviour) (this.behaviours.first(-80));
        while (var5 != null) {
          var5.stop(false);
          var5 = (Behaviour) (this.behaviours.next(120));
        }
        if (param0 != 109) {
          WorldBody var4 = (WorldBody) null;
          this.canBeCrushedBy((WorldBody) null, -13);
        }
        Trap var6 = (Trap) (this.children.first(-80));
        while (var6 != null) {
          var6.remove((byte) 109);
          var6 = (Trap) (this.children.next(111));
        }
        this.B(-165);
        this.clearModels(-1332);
    }

    final boolean wasBlockedX(byte param0) {
        if (param0 >= -101) {
          this.getPreviousY(-114);
        }
        return this.blockedX;
    }

    public final int applyBeamEffect(Effect param0, int param1, BeamSegment param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IntrusiveDequeCursor var6 = null;
        Behaviour var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.ignoresCollisionWith(param0.field_g, (byte) -116)) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!this.b(param0.type, (byte) 125) &&
            !this.alwaysBlocksBeams) {
            stackIn_9_0 = 0;
            return stackIn_9_0;
          }
          var4_int = SimulationObserver.a(this.width, param1, this.getY(param1 + 9636), this.height, param2, this.getX(param1 ^ 15), 2);
          if (var4_int == -1) {
            stackIn_12_0 = 0;
            return stackIn_12_0;
          }
          var5 = 0;
          var6 = new IntrusiveDequeCursor(this.behaviours);
          var7 = (Behaviour) (var6.first(true));
          while (var7 != null) {
            var5 = var5 + var7.a(-119, param0, param2);
            var7 = (Behaviour) (var6.next(-1));
          }
          stackIn_17_0 = var5;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("fsa.ED(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(int param0, WorldBody param1, Collidable param2, int param3) {
        int var6 = 0;
        Behaviour var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.k(param3, 0)) {
            return;
          }
          if (!this.intersectsRect((byte) 110, param1.getY(9648), param1.getX(3), param1.getHeight((byte) 55), param1.getWidth(param0 ^ -26685))) {
            return;
          }
          if (param0 != 26689) {
            this.crushThreshold = -15;
          }
          var7 = (Behaviour) (this.behaviours.first(-80));
          while (var7 != null) {
            if (var7.isEnabled(-115)) {
              var7.a(param2, (byte) 24, param1, param3);
            }
            var7 = (Behaviour) (this.behaviours.next(113));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("fsa.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean d(boolean param0, int param1) {
        Trap var4;
        int var5;
        int var6;
        int var7;
        IntrusiveDequeCursor var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = new IntrusiveDequeCursor(this.children);
        if (param1 != -3) {
          return true;
        }
        var4 = (Trap) (var8.first(true));
        while (true) {
          if (var4 == null) {
            return false;
          }
          if (param0 &&
            this.pushMode != 0) {
            var5 = var4.getX(3) - var4.getPreviousX(122);
            var6 = var4.getY(9648) - var4.getPreviousY(-21185);
          } else {
            var6 = 0;
            var5 = 0;
          }
          if (var4.a(var5, var6, -4648, this.pushMode, 0) != 2 &&
            !var4.d(param0, param1 ^ 0)) {
            var4 = (Trap) (var8.next(-1));
            continue;
          }
          break;
        }
        return true;
    }

    public final boolean isExpired(int param0) {
        if (param0 != 18407) {
          this.field_z = 79;
        }
        return this.removed;
    }

    private final ObjectList collectParts(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        ObjectList var2 = new ObjectList();
        Locomotor var3 = (Locomotor) (this.locomotors.first(-80));
        while (var3 != null) {
          var2.add((byte) -37, var3);
          var3 = (Locomotor) (this.locomotors.next(param0 ^ -110));
        }
        Behaviour var3_ref = (Behaviour) (this.behaviours.first(param0 - 50));
        while (var3_ref != null) {
          var2.add((byte) -37, var3_ref);
          var3_ref = (Behaviour) (this.behaviours.next(117));
        }
        if (param0 != -30) {
          this.isIndependent((byte) 21);
        }
        return var2;
    }

    private final boolean k(int param0, int param1) {
        if (param1 != 0) {
          this.verticalSize = -92;
        }
        return this.field_h[param0];
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.initialLocalX = 18;
        }
    }

    public final int getPreviousY(int param0) {
        if (param0 != -21185) {
          return -45;
        }
        return this.previousY;
    }

    final void c(byte param0, boolean param1) {
        if (param0 < 46) {
          field_q = (jea) null;
        }
        this.field_cb = param1 ? true : false;
    }

    final static void sleep(int param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param1);
            if (param0 != 9) {
              field_q = (jea) null;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        if (param2 != -4648) {
          this.angle = 108;
        }
        if (this.room == null) {
          return 0;
        }
        if (this.collisionLevel == 0) {
          return 0;
        }
        if (param3 != 0 && (param0 != 0 ||
          0 != param1)) {
          return this.room.a((Collidable) (this), (WorldBody) (this), this.collisionLevel, this.width, param1, param2 ^ -4652, this.height, this.getX(param2 + 4651), param3, param0, this.getY(9648), param4, true);
        }
        stackIn_15_0 = (this.room.a((Collidable) (this), this.height, 2, this.collisionLevel, this.getY(param2 + 14296), this.getX(3), true, (WorldBody) (this), this.width)) ? 2 : 0;
        return stackIn_15_0;
    }

    final void disableLocomotors(int param0) {
        if (param0 < 118) {
          return;
        }
        this.locomotorsEnabled = false;
    }

    final void a(IntPoint param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.parent) {
            param0.x = param0.x - this.parent.getX(3);
            param0.y = param0.y - this.parent.getY(9648);
            var3_int = param0.x >> 8;
            var4 = param0.y >> 8;
            param0.y = var4 * (this.parentRotationCos >> 8) - var3_int * (this.parentRotationSin >> 8);
            param0.x = var3_int * (this.parentRotationCos >> 8) + (this.parentRotationSin >> 8) * var4;
          }
          if (param1 <= 9) {
            this.field_fb = (TeleportState) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fsa.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
          return false;
        }
        return !this.children.isEmpty((byte) 14) ? true : false;
    }

    private final boolean A(byte param0) {
        if (param0 <= 12) {
          return false;
        }
        return this.room.o((byte) -82);
    }

    final void a(byte param0, IntPoint param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 54) {
            this.r((byte) 1);
          }
          if (null != this.parent) {
            var3_int = param1.x >> 8;
            var4 = param1.y >> 8;
            param1.x = -((this.parentRotationSin >> 8) * var4) + (this.parentRotationCos >> 8) * var3_int;
            param1.y = (this.parentRotationCos >> 8) * var4 + var3_int * (this.parentRotationSin >> 8);
            param1.x = param1.x + this.parent.getX(3);
            param1.y = param1.y + this.parent.getY(9648);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fsa.SC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final boolean isAttachedToParent(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -80) {
          this.initialLocalY = -124;
        }
        stackIn_6_0 = (this.attachedToParent) && (null != this.parent);
        return stackIn_6_0;
    }

    private final boolean j(int param0, int param1) {
        if (param1 != 8192) {
          return false;
        }
        return this.field_k[param0];
    }

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          Behaviour var3 = (Behaviour) null;
          this.addBehaviour((byte) 41, (Behaviour) null);
        }
        return this.localY;
    }

    public final boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Behaviour var8 = null;
        int var9 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.isAttachedToParent(param0 - 85)) {
            return false;
          }
          if (this.ignoresCollisionWith(param1, (byte) -51)) {
            return false;
          }
          if (this.obstructionLevel < param2 &&
            !this.alwaysBlocksBeams) {
            return false;
          }
          var5_int = SimulationObserver.a(this.width, 12, this.getY(param0 + 9649), this.height, param3, this.getX(3), 2);
          if (param0 == var5_int) {
            return false;
          }
          var6 = wm.a(4096, var5_int, param0 + 125);
          var7 = 0;
          var8 = (Behaviour) (this.behaviours.first(-80));
          while (var8 != null) {
            if (var8.a(param2, 1, param3, var6)) {
              var7 = 1;
            }
            var8 = (Behaviour) (this.behaviours.next(param0 ^ -114));
          }
          stackIn_21_0 = var7;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("fsa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void setAlwaysBlocksBeams(boolean param0, int param1) {
        this.alwaysBlocksBeams = param0 ? true : false;
        if (null != this.parent) {
          this.parent.setAlwaysBlocksBeams(param0, -102);
        }
        int var3 = -77 % ((param1 + 34) / 49);
    }

    private final int countDependentChildren(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        Trap var3 = (Trap) (this.children.first(-80));
        while (var3 != null) {
          if (!var3.isIndependent((byte) -113)) {
            var2++;
          }
          var3 = (Trap) (this.children.next(116));
        }
        if (param0 <= 15) {
          return -30;
        }
        return var2;
    }

    Trap(Room param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.children = new IntrusiveDeque();
        this.locomotors = new IntrusiveDeque();
        this.behaviours = new IntrusiveDeque();
        this.alwaysBlocksBeams = false;
        this.field_h = new boolean[3];
        this.obstructionLevel = 0;
        this.field_W = new boolean[6];
        this.field_cb = true;
        this.floating = true;
        this.independent = false;
        this.pushMode = 0;
        this.collisionLevel = 0;
        this.field_k = new boolean[3];
        this.models = new IntrusiveDeque();
        this.field_o = new bca();
        this.field_fb = new TeleportState();
        this.field_z = -1;
        this.verticalSize = 32;
        try {
          this.field_ab = RoomComponentFactory.field_b;
          this.height = param4 << 16;
          this.independent = param6 ? true : false;
          this.locomotorsEnabled = true;
          RoomComponentFactory.field_b = RoomComponentFactory.field_b + 1;
          this.room = param0;
          this.localY = param2 << 16;
          this.angle = param5;
          this.width = param3 << 16;
          this.localX = param1 << 16;
          this.a(true, param6, param0.e(-51), (ui) null);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fsa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
