/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PressureSwitchComponent extends SwitchComponent {
    private int field_K;
    private int field_L;
    private int field_J;

    final static void a(boolean param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gqa var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (pk.field_r < SoftwareTransform3D.field_q) {
            pk.field_r = pk.field_r + 1;
          }
          if (mha.field_E != gn.field_C.field_e) {
            tj.field_b = tj.field_b + (gn.field_C.field_e - mha.field_E);
            mha.field_E = gn.field_C.field_e;
          }
          if (pk.field_r <= 0) {
            return;
          }
          rg.a((byte) -53);
          era.field_e.c(37, param0);
          if (null != apa.field_c) {
            if (!fua.field_g) {
              apa.field_c = null;
            } else {
              apa.field_c.processPointerFrame(era.field_e.field_A, param0, era.field_e.field_q, -90);
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = OpenGlSceneLight.field_p[var4_int];
            if (var5 != null) {
              if (var5.field_y != 0) {
                VoronoiNoiseOperator.a(false, var4_int, var5);
              }
              var6 = Transform3D.a(var4_int, -20011);
              MembersUpsellMenu.field_y[var4_int].field_R = ColouriseOperator.field_m[var6];
              PitModel.field_p[var4_int].field_r = StripedMazeGenerator.field_c[var6];
            }
          }
          if (0 != ara.field_ub.field_y) {
            RoomViewRenderer.field_c = new ReportAbuseDialog(ara.field_ub.field_q, ara.field_ub.field_A, ara.field_ub.field_G, ara.field_ub.field_t, param2, WallModel.field_r, OpenGlTransform3D.field_f, cga.field_g, Corpse.field_i, FacePlayerMountComponent.field_F, PressureSwitchBehaviour.field_p, (String) null, 0L);
          }
          var9 = mna.a((byte) 73, param3, di.field_a, mna.field_d);
          if (var9 != null) {
            hpa.a(-2, var9);
          }
          var8 = fa.a((byte) -126);
          if (param1 >= -75) {
            return;
          }
          if (var8 != null) {
            ArchiveNetworkClient.field_b = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var4), "pw.VB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int getMaxTargets(int param0) {
        if (param0 != 31609) {
          return -28;
        }
        return 3;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.field_K = -83;
          return false;
        }
        return false;
    }

    final static void C(int param0) {
        if (-SwitchableId.field_b + 0 != TimeSwitchBehaviour.field_r &&
          TimeSwitchBehaviour.field_r != 250 - SwitchableId.field_b) {
        }
        if (param0 != -5) {
          return;
        }
        TimeSwitchBehaviour.field_r = TimeSwitchBehaviour.field_r + 1;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.field_L = 117;
          return false;
        }
        return false;
    }

    PressureSwitchComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_L = 2;
        try {
          this.field_L = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyDefaults(byte param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        super.applyDefaults(param0);
        var2 = this.typeId;
        if (3 != var2) {
          if (var2 != 4) {
            this.field_J = -1;
            this.field_K = -1;
          } else {
            this.field_J = 2;
            this.field_K = 2;
          }
        } else {
          this.field_J = 1;
          this.field_K = 1;
        }
        this.setSize(106, this.field_J * 2097152, 2097152 * this.field_K);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.field_J = 97;
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.hasSize(97);
        }
        return 5;
    }

    PressureSwitchComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_L = 2;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5_int = 0;
        PressureSwitchBehaviour var5 = null;
        ModelCodec var6 = null;
        SwitchModel var7 = null;
        int var8 = 0;
        int var9 = 0;
        Trap var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = new Trap(param2, param0);
          var5_int = this.typeId;
          if (var5_int == 54) {
            this.height = 2097152;
          } else {
            if (55 == var5_int) {
              this.width = 2097152;
            }
          }
          var10.setSize((byte) -11, this.height, this.width);
          var5 = new PressureSwitchBehaviour(param2, param0);
          var5.setRequiredWeight(this.field_L, true);
          this.bindSwitchState(var5, (byte) -94);
          var10.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (SwitchModel) (var6.createModel(9, param1 ^ 113));
          if (param1 != 3) {
            this.field_K = 33;
          }
          var8 = this.typeId;
          if (var8 != 3) {
            if (var8 != 4) {
              if (54 == var8) {
                var7.setVariant(4, (byte) -112);
              } else {
                if (var8 != 55) {
                  var10.addModel(var5, (byte) 124, var7);
                  return var10;
                }
                var7.setVariant(5, (byte) -112);
              }
            } else {
              var7.setVariant(2, (byte) -112);
            }
          } else {
            var7.setVariant(0, (byte) -112);
          }
          var10.addModel(var5, (byte) 124, var7);
          stackIn_20_0 = var10;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("pw.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static GraphicsToolkit createNativeSoftwareToolkit(int param0, java.awt.Canvas param1, int param2, byte param3, TextureProvider param4) {
        RuntimeException var5 = null;
        GraphicsToolkit stackIn_2_0 = null;
        NativeSoftwareGraphicsToolkit stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -62) {
            stackIn_4_0 = new NativeSoftwareGraphicsToolkit(param1, param4, param2, param0);
            return (GraphicsToolkit) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (GraphicsToolkit) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pw.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean hasSize(int param0) {
        int var2;
        if (param0 != 555277520) {
          this.field_K = -36;
        }
        var2 = this.typeId;
        if (var2 == 54) {
          return true;
        }
        if (var2 != 55) {
          return false;
        }
        return true;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -125, this.field_L, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pw.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasInitialState(byte param0) {
        if (param0 != 93) {
          this.field_K = -50;
          return true;
        }
        return true;
    }

    static {
    }
}
