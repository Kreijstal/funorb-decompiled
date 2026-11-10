/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArrowShooterComponent extends ShooterComponent {
    static String field_K;
    static String field_J;

    final static void createFonts(GraphicsToolkit param0, int param1) {
        try {
          kn.field_p = param0.createFont(kv.field_a, rc.field_b, true);
          eda.field_f = param0.createFont(ds.field_n, MatchState.field_j, true);
          if (param1 > -66) {
            field_K = (String) null;
          }
          SingleChildWidget.field_v = param0.createFont(wb.field_a, MovingPlatformComponent.field_O, true);
          qf.field_j = param0.createFont(qp.field_r, gga.field_O, true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wpa.WB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.A(101);
          return false;
        }
        return false;
    }

    final static Sprite[] createCentreOnlyFrame(byte param0, Sprite param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -57) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param1;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("wpa.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean C(int param0) {
        if (param0 != 128) {
          return false;
        }
        return true;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_J = (String) null;
          return 7;
        }
        return 7;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        WeaponShooterBehaviour var5 = null;
        Weapon var6 = null;
        int var7_int = 0;
        ModelCodec var7 = null;
        BlockModel var8 = null;
        Trap var9 = null;
        Trap stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setObstructionLevel(param1, 0);
          var9.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new WeaponShooterBehaviour(param2, param0);
          var6 = TextureOperator.a(0, -1);
          var6.refillAmmo(91, true);
          if (this.s((byte) 73)) {
            var7_int = var6.a(true);
            if (var7_int > 0) {
              var6.b(param2.getRandom(122).nextBounded(var7_int, 0), false);
            }
          }
          var5.a(var6, (byte) 66);
          this.a((byte) 43, var5, param2);
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var7 = rm.field_a;
          var8 = (BlockModel) (var7.createModel(7, 86));
          var8.b(127, 12);
          var9.a(var5, (byte) 124, var8);
          stackIn_6_0 = var9;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wpa.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -129) {
          return;
        }
        field_K = null;
        field_J = null;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
          return true;
        }
        return true;
    }

    final static char decodeSingleByteCharacter(byte param0, byte param1) {
        int var3 = 0;
        if (param0 != 11) {
          return '\005';
        }
        int var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (160 > var2) {
          var3 = gha.cp1252HighChars[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
          field_K = (String) null;
          return true;
        }
        return true;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wpa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ArrowShooterComponent(Room param0, int param1) {
        super(param0, param1);
    }

    ArrowShooterComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-79, 2097152, 2097152);
    }

    static {
        field_K = "Failed!";
        field_J = "Room complete +<%0>, Speed bonus +<%1>";
    }
}
