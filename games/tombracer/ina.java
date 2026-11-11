/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ina {
    private int field_e;
    private lt[] field_h;
    static IntrusiveDeque field_d;
    String field_b;
    private int field_f;
    static int field_a;
    private int field_g;
    float field_i;
    static SpriteData[] field_c;

    final static void createGameModels(GraphicsToolkit param0, int param1) {
        ToolkitModel dupTemp$0 = null;
        ToolkitModel dupTemp$1 = null;
        ToolkitModel dupTemp$2 = null;
        ToolkitModel dupTemp$3 = null;
        ToolkitModel dupTemp$4 = null;
        try {
          SwitchState.field_a = tc.createModels(SoftReferenceCache.field_b, -8829, param0);
          ContextMenu.field_Ib = tc.createModels(OpenGlBuffer.field_c, -8829, param0);
          mma.field_b = tc.createModels(DoorwayComponent.field_K, -8829, param0);
          RevolverItemComponent.field_J = tc.createModels(C2SActionPacket.field_l, param1 - 8829, param0);
          ta.field_ub = tc.createModels(CourseLayoutFactory.field_e, -8829, param0);
          PowerUpItemBehaviour.field_t = tc.createModels(dq.field_h, -8829, param0);
          GameApplet.field_j = tc.createModels(gta.field_f, param1 ^ -8829, param0);
          gca.field_g = tc.createModels(cba.field_b, param1 ^ -8829, param0);
          DoorwayComponent.field_F = tc.createModels(TriangleMesh.field_g, -8829, param0);
          SwitchLinkList.field_b = tc.createModels(ControllerLocomotor.field_p, -8829, param0);
          dupTemp$0 = RevolverItemComponent.field_J[9].copy((byte) 0, 654255, false);
          RevolverItemComponent.field_J[9] = dupTemp$0;
          dupTemp$0.O(224, 224, 224);
          dupTemp$1 = RevolverItemComponent.field_J[10].copy((byte) 0, 654255, false);
          RevolverItemComponent.field_J[10] = dupTemp$1;
          dupTemp$1.O(224, 224, 224);
          if (param1 != 0) {
            CharSequence var3 = (CharSequence) null;
            ina.a((byte) -94, (CharSequence) null);
          }
          dupTemp$2 = RevolverItemComponent.field_J[77].copy((byte) 0, 654255, false);
          RevolverItemComponent.field_J[77] = dupTemp$2;
          dupTemp$2.O(256, 256, 256);
          dupTemp$3 = RevolverItemComponent.field_J[78].copy((byte) 0, 654255, false);
          RevolverItemComponent.field_J[78] = dupTemp$3;
          dupTemp$3.O(256, 256, 256);
          dupTemp$4 = RevolverItemComponent.field_J[79].copy((byte) 0, 654255, false);
          RevolverItemComponent.field_J[79] = dupTemp$4;
          dupTemp$4.O(256, 256, 256);
          if (!TorchComponent.field_F) {
            ta.field_ub[20].O(128, 128, 64);
            ta.field_ub[21].O(128, 128, 64);
            ta.field_ub[23].O(128, 128, 64);
            ta.field_ub[24].O(128, 128, 64);
            RevolverItemComponent.field_J[4].O(96, 96, 96);
            RevolverItemComponent.field_J[70].O(96, 96, 96);
            RevolverItemComponent.field_J[5].O(96, 96, 96);
            RevolverItemComponent.field_J[17].H(0, 64, 0);
            RevolverItemComponent.field_J[17].O(256, 256, 256);
            RevolverItemComponent.field_J[24].O(256, 256, 256);
            RevolverItemComponent.field_J[25].O(256, 256, 256);
            PowerUpItemBehaviour.field_t[0].O(256, 256, 256);
            PowerUpItemBehaviour.field_t[1].O(192, 192, 192);
            PowerUpItemBehaviour.field_t[6].O(384, 384, 384);
            GameApplet.field_j[1].O(512, 512, 512);
            GameApplet.field_j[0].O(512, 512, 512);
            RevolverItemComponent.field_J[27].O(192, 156, 192);
            RevolverItemComponent.field_J[76].O(256, 256, 256);
            RevolverItemComponent.field_J[62].O(96, 96, 96);
            RevolverItemComponent.field_J[63].O(96, 96, 96);
            SwitchLinkList.field_b[1].H(0, 64, 0);
            SwitchLinkList.field_b[1].O(192, 192, 192);
            SwitchLinkList.field_b[1].FA(4096);
            SwitchLinkList.field_b[2].H(0, 64, 0);
            SwitchLinkList.field_b[2].O(192, 192, 192);
            SwitchLinkList.field_b[2].FA(4096);
            SwitchLinkList.field_b[10].O(256, 256, 256);
            SwitchLinkList.field_b[11].O(256, 256, 256);
            SwitchLinkList.field_b[12].O(256, 256, 256);
            SwitchLinkList.field_b[13].O(256, 256, 256);
            SwitchLinkList.field_b[8].O(256, 256, 256);
            TorchComponent.field_F = true;
          }
          AllPlatformsMazeComponent.field_O = RevolverItemComponent.field_J[4];
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ina.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void addStage(String param0, byte param1, String param2, ResourceArchive param3, String param4) {
        try {
          this.addStage(param0, -1, param4, param2, param3, (byte) -108);
          if (param1 != -36) {
            this.pollLoaded((byte) 90);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ina.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void addStage(String param0, int param1, String param2, String param3, ResourceArchive param4, byte param5) {
        lt[] var9 = null;
        int fieldTemp$0 = 0;
        if (this.field_h.length <= this.field_e) {
          var9 = new lt[this.field_e * 2];
          lt[] var7 = var9;
          ArrayUtils.copy(this.field_h, 0, var9, 0, this.field_e);
          this.field_h = var9;
        }
        lt var8 = new lt();
        lt var10 = var8;
        lt var7_ref = var10;
        if (param5 >= -51) {
          return;
        }
        try {
          var10.field_h = param4;
          var10.field_e = param2;
          var10.field_d = param1;
          var10.field_g = param3;
          var10.field_c = param0;
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ina.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 <= 20) {
          return;
        }
        field_c = null;
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16) {
            ina.releaseStatics(46);
          }
          stackIn_3_0 = TeleportState.a(param1, (byte) -91, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ina.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void setLoadingProgress(lt param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 22774) {
            return;
          }
          var4_float = (float)param2 / 100.0f + (float)(this.field_g + 1);
          this.field_i = (float)this.field_f * var4_float / (float)(1 + this.field_e);
          if (0 != param2) {
            this.field_b = param0.field_c + " - " + param2 + "%";
            return;
          }
          this.field_b = param0.field_e;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ina.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void addStage(int param0, ResourceArchive param1, String param2, String param3) {
        try {
          this.addStage(param3, -1, param2, (String) null, param1, (byte) -108);
          if (param0 != 256) {
            this.field_g = 68;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ina.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean pollLoaded(byte param0) {
        lt var2;
        int var3;
        lt var4;
        var3 = TombRacer.field_G ? 1 : 0;
        while (this.field_g < this.field_e) {
          var4 = this.field_h[this.field_g];
          var2 = var4;
          if (!var4.field_h.ensureIndex(-100)) {
            this.setLoadingProgress(var4, 22774, 0);
            return false;
          }
          if (var4.field_d >= 0 &&
            !var4.field_h.ensureGroupLoaded(var4.field_d, -2)) {
            this.setLoadingProgress(var2, param0 ^ 22739, var4.field_h.getGroupProgress(var4.field_d, (byte) 114));
            return false;
          }
          if (var4.field_g != null &&
            !var4.field_h.isGroupAvailableByName(var4.field_g, -125)) {
            this.setLoadingProgress(var2, 22774, var4.field_h.a(var4.field_g, true));
            return false;
          }
          if (0 > var4.field_d &&
            null == var4.field_g &&
            var4.field_c != null &&
            !var4.field_h.areAllGroupsAvailable(0)) {
            this.setLoadingProgress(var2, 22774, var4.field_h.getOverallProgress(true));
            return false;
          }
          this.field_g = this.field_g + 1;
        }
        if (param0 != 37) {
          return false;
        }
        return true;
    }

    ina(int param0) {
        this.field_h = new lt[16];
        this.field_f = param0;
    }

    static {
        field_d = new IntrusiveDeque();
    }
}
