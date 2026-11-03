/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClassicBallSkin extends BallSkin {
    static Sprite field_n;
    static int field_l;
    static boolean field_o;
    static int field_m;

    final boolean c(int param0) {
        if (param0 != 2) {
          field_o = true;
          return true;
        }
        return true;
    }

    final int ballColor(int param0, boolean param1) {
        if (!param1) {
          return 118;
        }
        return rc.field_e[param0];
    }

    final static int a(int param0, double param1) {
        if (param0 != 16) {
          return -57;
        }
        return SingleChildWidget.a(param1, 16, 1);
    }

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          this.field_a = new MeshBuilder[]{this.createSphereMesh(-930305852), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball1"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball2"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball3"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball4"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball5"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball6"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball7"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball8"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball9"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball10"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball11"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball12"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball13"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball14"), MeshBuilder.loadFromArchive(param0, "", "balls/CLASSIC/ball15")};
          if (param1 != 117) {
            return;
          }
          for (var3_int = 1; this.field_a.length > var3_int; var3_int++) {
            this.field_a[var3_int].scaleVertices(8, 8, 8, 4);
            IsaacCipher.a(this.field_a[var3_int], 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mf.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        Sprite[] dupTemp$0 = null;
        try {
          dupTemp$0 = NameEntryPopup.a(param0 ^ param0, "", param1, "top_bar_balls_modern");
          this.field_e = dupTemp$0;
          d.field_a = dupTemp$0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 != 1) {
          ClassicBallSkin.j(26);
        }
    }

    final static void j(int param0) {
        if (param0 != 1) {
          NineSliceFrame var2 = (NineSliceFrame) null;
          ClassicBallSkin.a((byte) -32, 29, (NineSliceFrame) null, (NineSliceFrame) null, -126, -60);
          sa.field_f = new QuickChatHelpDialog(tq.field_m, dg.field_J, qg.field_f, AlignedIconLabel.field_Lb, e.field_e, UiWidget.field_A);
          return;
        }
        sa.field_f = new QuickChatHelpDialog(tq.field_m, dg.field_J, qg.field_f, AlignedIconLabel.field_Lb, e.field_e, UiWidget.field_A);
    }

    ClassicBallSkin() {
        this.field_g = false;
    }

    final String groupName(byte param0, int param1) {
        if (param0 <= 9) {
          return (String) null;
        }
        return 0 == param1 ? EmailAvailabilityValidator.ballsetUsa8Group0 : PolarTableScene.ballsetUsa8Group1;
    }

    final static void a(byte param0, int param1, NineSliceFrame param2, NineSliceFrame param3, int param4, int param5) {
        td.field_e = param2;
        IterableDualLinkDeque.field_e = param1;
        NineBallRules.field_h = param5;
        if (param0 > -24) {
          return;
        }
        try {
          rm.field_b = param4;
          bk.field_m = param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mf.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
