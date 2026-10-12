/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends ClientUiComponent {
    private ClientUiComponent field_Mb;
    private ClientUiComponent[] field_Ib;
    static String field_Nb;
    static String field_Lb;
    int field_Kb;
    private ClientUiComponent[] field_Jb;

    final static void a(p param0, byte param1) {
        int var2_int = 0;
        sn var3 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          wh.field_f = false;
          MoveAttackRequest.field_v = new sn[47];
          for (var2_int = 0; var2_int < 47; var2_int++) {
            var3 = param0.a(wl.field_M[var2_int], (byte) -97, "");
            if (var3 == null) {
              var3 = param0.a((byte) -128, "", wl.field_M[var2_int]);
            }
            MoveAttackRequest.field_v[var2_int] = var3;
          }
          if (param1 != 123) {
            String var5 = (String) null;
            ml.a(42, (au) null, false, (String) null);
          }
          wh.field_f = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ml.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.y = param1;
        this.height = param6;
        this.x = param2;
        this.width = param0;
        if (param4 != 0) {
          return;
        }
        this.a(param3, param5, param4 - 20199);
    }

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 != 2) {
          p var2 = (p) null;
          ml.a((p) null, (byte) 111);
        }
    }

    private final void a(int param0, int param1, int param2) {
        ClientUiComponent dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0;
        if (param2 != -20199) {
          ml.a(96, -94, -90, false);
        }
        while (this.field_Ib.length > var4) {
          var5 = this.width * var4 / this.field_Ib.length;
          var6 = this.width * (1 + var4) / this.field_Ib.length;
          this.field_Ib[var4].x = var5;
          this.field_Ib[var4].y = 0;
          this.field_Ib[var4].width = -var5 + var6;
          this.field_Ib[var4].height = param1;
          var4++;
        }
        this.field_Mb.setBounds(-param1 + this.height, -20500, this.width, param1, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Jb.length) {
          this.field_Jb[var8].setBounds(this.field_Mb.height - 2 * param0, -20500, -(param0 * 2) + this.field_Mb.width, param0, param0);
          if (var8 != this.field_Kb) {
            dupTemp$0 = this.field_Jb[var8];
            dupTemp$0.x = dupTemp$0.x + 10000;
          }
          var8++;
        }
    }

    final static void a(int param0, au param1, boolean param2, String param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tg var8 = null;
        String var9 = null;
        tg var10 = null;
        String var11 = null;
        tg var12 = null;
        String var13 = null;
        tg var14 = null;
        try {
          ng.a(CipherPacketBuffer.field_x, param1, (int[]) null, (String) null, param1.d((byte) -84), 92, -1, (String) null, 0L);
          if (param1.field_kc && (2 == param1.field_ac ||
            !(BufferedSocket.field_j < 2))) {
            var8 = tn.field_Z;
            var9 = fo.a(4800, SectorCacheStore.field_k, new String[]{param3});
            var8.field_i.addTextAction(10, var9, (byte) -118);
          }
          tn.field_Z.a((byte) 96);
          if (param2) {
            if (oo.field_a != tn.field_Z.field_c) {
              var12 = tn.field_Z;
              var13 = fo.a(4800, fs.field_a, new String[]{param3});
              var12.field_i.addTextAction(15, var13, (byte) -105);
            } else {
              var10 = tn.field_Z;
              var11 = fo.a(4800, cp.field_g, new String[]{param3});
              var10.field_i.addTextAction(16, var11, (byte) -103);
            }
          }
          var14 = tn.field_Z;
          var5 = BattleTutorial.pointerPressX;
          var6 = TeleportAction.pointerPressY;
          var7 = 125 / ((22 - param0) / 38);
          var14.field_i.layoutPopup(0, var6, 0, (byte) -118, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ml.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void l(int param0) {
        int var2 = 0;
        ClientUiComponent dupTemp$0 = null;
        ClientUiComponent dupTemp$1 = null;
        int var3;
        String var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 10000) {
          var4 = (String) null;
          ml.a(10, (au) null, false, (String) null);
        }
        for (var2 = 0; this.field_Ib.length > var2; var2++) {
          if (this.field_Kb != var2 &&
            this.field_Ib[var2].pressedButton != 0) {
            this.field_Ib[this.field_Kb].selected = false;
            dupTemp$0 = this.field_Jb[this.field_Kb];
            dupTemp$0.x = dupTemp$0.x + 10000;
            this.field_Kb = var2;
            this.field_Ib[var2].selected = true;
            dupTemp$1 = this.field_Jb[var2];
            dupTemp$1.x = dupTemp$1.x - 10000;
          }
        }
    }

    final static void a(CampaignMission param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var3Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8 = param0.getParticipantNames(-23209);
          var9 = var8;
          if (param0.campaign.localGodId != 1) {
            if (param0.campaign.localGodId == 2) {
              op.field_c[0][2] = lp.field_c[0];
            }
          } else {
            stackIn_5_0 = (!var9[1].equalsIgnoreCase(wf.field_q[1])) ? 2 : 1;
            var3 = stackIn_5_0;
            op.field_c[0][var3] = lp.field_c[0];
            stackIn_8_0 = (1 != var3) ? 1 : 2;
            var4 = stackIn_8_0;
            op.field_c[0][var4] = lp.field_c[3];
          }
          op.field_c[0][0] = lp.field_c[param0.campaign.localGodId];
          var7 = 0;
          var3Lifetime1 = var7;
          if (param1 != -26) {
            return;
          }
          while (var7 < op.field_c[0].length) {
            ActionRequest.unitModels[76][var7] = WeightedScoreStrategy.b(op.field_c[0][var7], -20849);
            ResourceProtocolClient.a(var7, op.field_c[0][var7], param1 - 100);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ml.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static af a(boolean param0, String param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        af stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10) {
            var7 = (String) null;
            ml.a(-33, (au) null, true, (String) null);
          }
          var4_long = 0L;
          var6 = null;
          if (-1 != param1.indexOf('@')) {
            var6 = param1;
          } else {
            var8 = (CharSequence) ((Object) param1);
            var4_long = wc.a(var8, param2 - 10);
          }
          stackIn_6_0 = oi.a((String) (var6), param3, param0, param2 ^ 11, var4_long);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ml.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          return true;
        }
        return (ko.pointerY - param0) * (-param0 + ko.pointerY) + (-param1 + AiPlanningStrategy.pointerX) * (-param1 + AiPlanningStrategy.pointerX) < param2 * param2 ? true : false;
    }

    ml(long param0, ClientUiComponent param1, String[] param2, ClientUiComponent param3, ClientUiComponent[] param4, int param5) {
        super(param0, (ClientUiComponent) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        ClientUiComponent var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Ib = new ClientUiComponent[param2.length];
          this.field_Mb = new ClientUiComponent(0L, param3);
          this.field_Jb = param4;
          for (var8_int = 0; param2.length > var8_int; var8_int++) {
            var9 = new ClientUiComponent(0L, param1);
            var9.text = param2[var8_int];
            this.field_Ib[var8_int] = var9;
            this.addChild(var9, 121);
          }
          this.addChild(this.field_Mb, 122);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_Mb.addChild(param4[var11], 75);
            var11++;
          }
          this.field_Kb = param5;
          this.field_Ib[param5].selected = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_Nb = "Set up new unrated game";
        field_Lb = "Press F10 to open Quick Chat.";
    }
}
