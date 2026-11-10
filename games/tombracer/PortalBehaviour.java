/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PortalBehaviour extends Behaviour {
    static int field_n;
    static int[] field_o;
    private SwitchLinkList field_p;

    final static void a(int param0, boolean param1, qua param2, int param3) {
        RuntimeException var4 = null;
        qua var5 = null;
        sq stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_2_4;
        boolean stackIn_3_5 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = tva.field_d;
          stackIn_2_1 = 256;
          stackIn_2_2 = param3;
          stackIn_2_3 = -44;
          stackIn_2_4 = 1000000;
          stackIn_3_5 = !(param1);
          ((sq) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, (byte) stackIn_2_3, stackIn_2_4, stackIn_3_5, param2);
          if (param0 == 9) {
            return;
          }
          var5 = (qua) null;
          PortalBehaviour.a(70, false, (qua) null, -114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("im.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    PortalBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_p = new SwitchLinkList(1, 1, param0.formatVersion, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static jha a(int param0, String param1, int param2, int param3, String param4) {
        int var5_int = 0;
        int var6 = 0;
        jha stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 52 % ((20 - param2) / 58);
          if (param0 == 0) {
            param4 = "[" + cla.field_o.toUpperCase() + "] " + param4;
          } else {
            if (2 == param0) {
              param1 = "<col=ff0000>" + param1 + "</col>";
              param4 = "[" + dna.field_H.toUpperCase() + "] " + param4;
            } else {
              if (param3 >= 0) {
                param4 = "<col=" + PasswordValidator.field_k[param3] + ">" + param4 + "</col>";
              }
            }
          }
          stackIn_8_0 = new jha(0, param4, param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("im.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          field_o = (int[]) null;
          return 28;
        }
        return 28;
    }

    PortalBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_p = new SwitchLinkList(1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        if (param0 == -2) {
          super.g(param0 ^ 0);
          this.field_p.a(this.getScope((byte) 112), 8);
          return;
        }
        BitPacketBuffer var3 = (BitPacketBuffer) null;
        this.encode(false, (BitPacketBuffer) null);
        super.g(param0 ^ 0);
        this.field_p.a(this.getScope((byte) 112), 8);
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(param0, param1);
          param1.b((byte) -126, 3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "im.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int hashState(int param0, int param1) {
        if (param1 > -48) {
          qua var4 = (qua) null;
          PortalBehaviour.a(89, false, (qua) null, -34);
          return param0;
        }
        return param0;
    }

    public static void j(byte param0) {
        if (param0 == 124) {
          field_o = null;
          return;
        }
        String var2 = (String) null;
        PortalBehaviour.a(21, (String) null, -123, -2, (String) null);
        field_o = null;
    }

    final SwitchLinkList g(byte param0) {
        if (param0 != 99) {
          field_o = (int[]) null;
          return this.field_p;
        }
        return this.field_p;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_p.encode(30489, this.getScope((byte) 122), param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "im.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int directionToAngle(int param0, int param1, int param2) {
        if (param2 == 1) {
          if (param1 < 0) {
            if (param0 < 0) {
              return -3072;
            }
            if (param0 > 0) {
              return -1024;
            }
            return -2048;
          }
          if (param1 <= 0) {
            if (0 > param0) {
              return 4096;
            }
            if (param0 <= 0) {
            }
            return 0;
          }
          if (0 > param0) {
            return 3072;
          }
          if (param0 > 0) {
            return 1024;
          }
          return 2048;
        }
        field_o = (int[]) null;
        if (param1 < 0) {
          if (param0 < 0) {
            return -3072;
          }
          if (param0 > 0) {
            return -1024;
          }
          return -2048;
        }
        if (param1 <= 0) {
          if (0 > param0) {
            return 4096;
          }
          if (param0 > 0) {
          }
          return 0;
        }
        if (0 > param0) {
          return 3072;
        }
        if (param0 <= 0) {
          return 2048;
        }
        return 1024;
    }

    final void tick(int param0) {
        int var15 = 0;
        Switchable[] var2;
        Object var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        Room var12;
        Collidable[] var13;
        Collidable[] var14;
        Collidable var16;
        Object var17;
        int var18;
        int var19;
        int var20;
        int var21;
        TeleportState var22;
        int var23;
        int var24;
        Object var25;
        int var26;
        Switchable[] var27;
        Teleportable var28;
        WorldBody var29;
        var17 = null;
        var25 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        var27 = this.field_p.getTargets(1);
        var2 = var27;
        if (var27.length == 0) {
          return;
        }
        var3 = null;
        if (var27[0] instanceof Trap) {
          var3 = (Trap) (var27[0]);
        }
        if (var3 == null) {
          return;
        }
        if (param0 != 5418) {
          return;
        }
        var4 = this.trap.getX(param0 - 5415);
        var5 = this.trap.getY(9648);
        var6 = this.trap.getWidth(-119);
        var7 = this.trap.getHeight((byte) 55);
        var8 = ((Trap) (var3)).getX(3);
        var9 = ((Trap) (var3)).getY(param0 ^ 12442);
        var10 = ((Trap) (var3)).getWidth(param0 - 5510);
        var11 = ((Trap) (var3)).getHeight((byte) 55);
        var12 = this.getRoom(true);
        var13 = var12.collisionGrid.b(var5, -1, var4, var6, var7);
        var14 = var13;
        for (var15 = 0; var14.length > var15; var15++) {
          var16 = var14[var15];
          if (var16 instanceof Teleportable) {
            var28 = (Teleportable) ((Object) var16);
            if (var28.canTeleport((byte) -113) &&
              var16 != this.trap &&
              !this.trap.a(var16, true)) {
              var18 = var16.getX(3);
              var19 = var16.getY(9648);
              var20 = var16.getWidth(-128);
              var21 = var16.getHeight((byte) 55);
              var18 = var18 + 5 * var20 / 100;
              var19 = var19 + 5 * var21 / 100;
              var20 = 9 * var20 / 10;
              var21 = var21 * 9 / 10;
              if (io.centredBoxesOverlap(var6, var19, (byte) -93, var7, var18, var5, var21, var20, var4)) {
                var22 = var28.getTeleportState(false);
                var22.a((byte) -44);
                if (ck.a(var18, var21, var4, var6, var7, var19, (byte) 66, var5, var20)) {
                  var23 = -var4 + var18 + var8;
                  var24 = var19 + (var9 - var5);
                  if (ck.a(var23, var21, var8, var10, var11, var24, (byte) 99, var9, var20) &&
                    !var22.b(-59)) {
                    if (var16 instanceof WorldBody) {
                      var29 = (WorldBody) ((Object) var16);
                      if (!var12.a(var16, var21, 2, 1, var24, var23, false, var29, var20)) {
                        var12.a(var19, var18, 8, 0, (byte) 6);
                        var12.b(false).a(var19, var18, 0, -44);
                        var12.b(false).a(var24, var23, 0, -40);
                        var28.moveTo(var24, var23, 2);
                        var22.c(param0 ^ -5483);
                      }
                    } else {
                      var12.a(var19, var18, 8, 0, (byte) 6);
                      var12.b(false).a(var19, var18, 0, -44);
                      var12.b(false).a(var24, var23, 0, -40);
                      var28.moveTo(var24, var23, 2);
                      var22.c(param0 ^ -5483);
                    }
                  }
                }
              }
            }
          }
        }
        return;
    }

    static {
        field_n = 20;
    }
}
