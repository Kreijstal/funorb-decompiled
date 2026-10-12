/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws extends fw {
    static int field_O;
    static ClientUiComponent field_P;
    int field_L;
    int field_Q;
    int field_N;
    int field_S;
    int field_R;
    int field_M;
    static String field_T;

    final boolean a(int param0, int param1, int param2, int param3, Widget param4, int param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, 120, param4, param5, param6)) {
            if (param3 >= 103) {
              return false;
            }
            field_O = 36;
            return false;
          }
          var8_int = param0 + (-this.x + (-param1 - this.field_S));
          var9 = param5 - this.field_M + (-this.y - param2);
          if (var8_int * var8_int + var9 * var9 < this.field_Q * this.field_Q) {
            var10 = Math.atan2((double)var9, (double)var8_int) - BattleCharacter.field_b;
            if (!(0.0 > var10)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_L;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_L;
            }
            this.field_R = (int)((double)this.field_L * var10 / 6.283185307179586);
            while (this.field_R >= this.field_L) {
              this.field_R = this.field_R - this.field_L;
            }
            while (this.field_R < 0) {
              this.field_R = this.field_R + this.field_L;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ws.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          SummonRequest.a((byte) 52, wf.field_y, 6);
          SummonRequest.a((byte) 33, sh.field_r, 26);
          MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(26, (byte) -107) + 30, 26, (byte) 126);
          SummonRequest.a((byte) 111, pu.field_B, 8);
          SummonRequest.a((byte) 67, sh.field_r, 27);
          MoveEvent.tutorialLayout.setTopY(30 + MoveEvent.tutorialLayout.getTopY(27, (byte) -126), 27, (byte) 125);
          SummonRequest.a((byte) 78, sh.field_r, 28);
          MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(28, (byte) -122) + 30, 28, (byte) 120);
          SummonRequest.a((byte) 45, pu.field_B, 9);
          if (!QuickChatPhraseRepository.a(27875)) {
            SummonRequest.a((byte) 54, cg.field_b, 1);
            SummonRequest.a((byte) 91, GameEvent.field_t, 24);
            SummonRequest.a((byte) 101, op.field_f, 17);
            SummonRequest.a((byte) 39, ClientConnectionState.field_i, 3);
            SummonRequest.a((byte) 78, AnimationFrameSet.field_D, 4);
            DisplacedUnitMarker.field_t[40] = od.field_f;
          }
          return;
        }
        field_P = (ClientUiComponent) null;
        SummonRequest.a((byte) 52, wf.field_y, 6);
        SummonRequest.a((byte) 33, sh.field_r, 26);
        MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(26, (byte) -107) + 30, 26, (byte) 126);
        SummonRequest.a((byte) 111, pu.field_B, 8);
        SummonRequest.a((byte) 67, sh.field_r, 27);
        MoveEvent.tutorialLayout.setTopY(30 + MoveEvent.tutorialLayout.getTopY(27, (byte) -126), 27, (byte) 125);
        SummonRequest.a((byte) 78, sh.field_r, 28);
        MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(28, (byte) -122) + 30, 28, (byte) 120);
        SummonRequest.a((byte) 45, pu.field_B, 9);
        if (!QuickChatPhraseRepository.a(27875)) {
          SummonRequest.a((byte) 54, cg.field_b, 1);
          SummonRequest.a((byte) 91, GameEvent.field_t, 24);
          SummonRequest.a((byte) 101, op.field_f, 17);
          SummonRequest.a((byte) 39, ClientConnectionState.field_i, 3);
          SummonRequest.a((byte) 78, AnimationFrameSet.field_D, 4);
          DisplacedUnitMarker.field_t[40] = od.field_f;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 > -122) {
                var3 = (java.applet.Applet) null;
                ws.a((java.applet.Applet) null, -54);
              }
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ws.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 < 124) {
          field_P = (ClientUiComponent) null;
          field_T = null;
          return;
        }
        field_T = null;
    }

    private ws() throws Throwable {
        throw new Error();
    }

    static {
        field_O = 0;
        field_T = "Players: <%0>/<%1>";
    }
}
