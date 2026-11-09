/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeQueue {
    static DisplayNameForm field_a;
    static int field_c;
    static int field_d;
    private DualLinkNode sentinel;
    private DualLinkNode cursor;

    final DualLinkNode next(int guard) {
        DualLinkNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        if (guard != -2) {
          return (DualLinkNode) null;
        }
        this.cursor = var2.secondaryNext;
        return var2;
    }

    final int size(byte guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 2) {
          return 62;
        }
        int var2 = 0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (var3 != this.sentinel) {
          var2++;
          var3 = var3.secondaryNext;
        }
        return var2;
    }

    final static void readReflectionCheck(byte guard, PacketBuffer packet, PlatformTaskDispatcher dispatcher, int packetLength) {
        try {
          int var6 = 0;
          int var12_int = 0;
          int var13_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          Throwable decompiledCaughtException = null;
          int var4_int = 0;
          RuntimeException var4 = null;
          ReflectionCheck var5 = null;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          SecurityException var7_ref = null;
          NullPointerException var7_ref2 = null;
          Exception var7_ref3 = null;
          Throwable var7_ref4 = null;
          String var8 = null;
          String var9 = null;
          int var10 = 0;
          String[] var11 = null;
          byte[][] var12 = null;
          Class[] var13 = null;
          int var14 = 0;
          int var15 = 0;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var14Lifetime1;
          var15 = Sumoblitz.field_L ? 1 : 0;
          try {
            var4_int = 65 / ((9 - guard) / 55);
            var5 = new ReflectionCheck();
            var5.size = packet.readUnsignedByte(-31302);
            var5.id = packet.readInt(true);
            var5.fieldTasks = new PlatformTask[var5.size];
            var5.errors = new int[var5.size];
            var5.arguments = new byte[var5.size][][];
            var5.methodTasks = new PlatformTask[var5.size];
            var5.fieldValues = new int[var5.size];
            var5.operations = new int[var5.size];
            for (var6 = 0; var6 < var5.size; var6++) {
              try {
                var7_int = packet.readUnsignedByte(-31302);
                if (var7_int != 0 &&
                  1 != var7_int &&
                  var7_int != 2) {
                  if (3 == var7_int ||
                    var7_int == 4) {
                    var20 = packet.readCp1252String(-1);
                    var21 = packet.readCp1252String(-1);
                    var10 = packet.readUnsignedByte(-31302);
                    var11 = new String[var10];
                    for (var12_int = 0; var10 > var12_int; var12_int++) {
                      var11[var12_int] = packet.readCp1252String(-1);
                    }
                    var22 = new byte[var10][];
                    var19 = var22;
                    var12 = var19;
                    if (var7_int == 3) {
                      for (var13_int = 0; var13_int < var10; var13_int++) {
                        var14 = packet.readInt(true);
                        array$0 = new byte[var14];
                        var12[var13_int] = array$0;
                        packet.readBytes(var22[var13_int], var14, 0, (byte) -33);
                      }
                    }
                    var5.operations[var6] = var7_int;
                    var13 = new Class[var10];
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (var18 < var10) {
                      var13[var18] = UiWidget.resolvePrimitiveOrNamedClass((byte) -24, var11[var18]);
                      var18++;
                    }
                    var5.methodTasks[var6] = dispatcher.findDeclaredMethod(0, UiWidget.resolvePrimitiveOrNamedClass((byte) -24, var20), var21, var13);
                    var5.arguments[var6] = var22;
                  }
                } else {
                  var17 = packet.readCp1252String(-1);
                  var8 = var17;
                  var16 = packet.readCp1252String(-1);
                  var9 = var16;
                  var10 = 0;
                  if (var7_int == 1) {
                    var10 = packet.readInt(true);
                  }
                  var5.operations[var6] = var7_int;
                  var5.fieldValues[var6] = var10;
                  var5.fieldTasks[var6] = dispatcher.findDeclaredField(0, var16, UiWidget.resolvePrimitiveOrNamedClass((byte) -24, var17));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var5.errors[var6] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var7_ref = (SecurityException) (Object) decompiledCaughtException;
                var5.errors[var6] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var5.errors[var6] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var7_ref3 = (Exception) (Object) decompiledCaughtException;
                var5.errors[var6] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var7_ref4 = decompiledCaughtException;
                var5.errors[var6] = -5;
              }
            }
            AccountConnectionPhase.reflectionChecks.addLast((IntrusiveNode) (var5), (byte) 39);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_36_0 = var4;
            stackIn_36_1 = new StringBuilder().append("ro.K(").append(guard).append(',');
            if (packet == null) {
              stackIn_37_2 = "null";
            } else {
              stackIn_37_2 = "{...}";
            }
            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
            if (dispatcher == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(packetLength).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void initializeLoginLayer(int guard) {
        HardwareTurbulentWaterNoise.widgetTheme = ToolkitRasterStateCacheEntry.sharedWidgetTheme(false);
        RenderPresentationException.field_a = new DialogLayer();
        WidgetStateStyle.showLoginDialog((byte) 127, true, true);
        if (guard != 246) {
          SecondaryNodeQueue.a(22, 45, -112, 42, -110, true, -91, 8, 90);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_c = -79;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9;
        int var9Lifetime1;
        boolean decompiledFrameRemainder1 = true;
        param8 = param8 - param0;
        param3 = param3 - param0;
        param2 = param2 - param4;
        param6 = param6 - param4;
        if (param3 > param8) {
          decompiledFrameRemainder1 = !(param3 < -param7);
          if (decompiledFrameRemainder1) {
            decompiledFrameRemainder1 = !(param8 > param7);
          }
        } else {
          decompiledFrameRemainder1 = !(param8 < -param7);
          if (decompiledFrameRemainder1) {
            decompiledFrameRemainder1 = !(param3 > param7);
          }
        }
        if (decompiledFrameRemainder1) {
          boolean decompiledFrameRemainder0 = true;
          if (param6 > param2) {
            decompiledFrameRemainder0 = !(-param7 > param6);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(param7 < param2);
            }
          } else {
            decompiledFrameRemainder0 = !(-param7 > param2);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(param7 < param6);
            }
          }
          if (decompiledFrameRemainder0) {
            var9 = -12 + IntegerMath.floorLog2(42, param7 >> 31 ^ param7 | (param6 >> 31 ^ param6 | (param2 ^ param2 >> 31 | param8 >> 31 ^ param8 | param3 ^ param3 >> 31)));
            if (var9 > 0) {
              param3 = param3 >> var9;
              param2 = param2 >> var9;
              param7 = param7 >> var9;
              param6 = param6 >> var9;
              param8 = param8 >> var9;
            }
            if (param5) {
              SecondaryNodeQueue.a(67, -70, -24, 44, 33, true, -93, 8, -123);
            }
            if (param7 <= 0) {
              return -1;
            }
            var9Lifetime1 = param7 * param7;
            if (param8 * param8 + param2 * param2 < var9Lifetime1 &&
              param6 * param6 + param3 * param3 < var9Lifetime1) {
              return 1 + (1 << param1);
            }
            param6 = param6 - param2;
            param3 = param3 - param8;
            return BurstParticle.firstCollisionFraction(-var9Lifetime1 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1, param6 * param6 + param3 * param3 << 1, param1);
          }
          return -1;
        }
        return -1;
    }

    final void addLast(DualLinkNode node, byte guard) {
        try {
          if (node.secondaryPrevious != null) {
            node.unlinkSecondary(-5106);
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          if (guard > -100) {
            this.size((byte) 78);
          }
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ro.H(" + (node != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final DualLinkNode first(int guard) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (guard < 8) {
          this.sentinel = (DualLinkNode) null;
        }
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        return var2;
    }

    final void addFirst(DualLinkNode node, int guard) {
        try {
          if (node.secondaryPrevious != null) {
            node.unlinkSecondary(-5106);
          }
          node.secondaryPrevious = this.sentinel;
          node.secondaryNext = this.sentinel.secondaryNext;
          if (guard != -4) {
            SecondaryNodeQueue.releaseStatics(-24);
          }
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ro.B(" + (node != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final DualLinkNode removeFirst(byte guard) {
        if (guard != 72) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlinkSecondary(-5106);
        return var2;
    }

    final static void defeatDrone(Drone drone, byte guard) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (drone.isPlayerProtected(true)) {
            return;
          }
          drone.beginDestruction((byte) 0);
          ValidationMessageWidget.advanceCombo(guard - 111);
          if (guard != 113) {
            field_d = 68;
          }
          HardwareRidgedWaterNoise.awardDroneDefeatScore(6510, drone);
          LegacyOpenGlDisplayLists.maybeSpawnScorePowerup((byte) -106, drone);
          if (drone.field_P == 0 &&
            drone.field_R) {
            EmailSyntaxValidator.field_e = EmailSyntaxValidator.field_e + 1;
            if (AchievementThresholds.targets[9] != EmailSyntaxValidator.field_e) {
              return;
            }
            UnderageAccountInfoPanel.b(24753, 246, 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ro.J(");
          if (drone == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final DualLinkNode removeLast(byte guard) {
        if (guard != 126) {
          this.sentinel = (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryPrevious;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlinkSecondary(guard - 5232);
        return var2;
    }

    public SecondaryNodeQueue() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    static {
    }
}
