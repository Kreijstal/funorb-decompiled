/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GooPuddle extends IntrusiveNode {
    static String field_l;
    static int field_i;
    static String field_j;
    private IntrusiveDeque field_h;
    static float field_k;

    final void draw(byte param0, Camera param1) {
        int var4 = 0;
        GooPuddleCell var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          var5 = (GooPuddleCell) (this.field_h.last((byte) 26));
          while (var5 != null) {
            var5.draw((byte) -28, param1);
            var5 = (GooPuddleCell) (this.field_h.previous(false));
          }
          if (param0 != 117) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean pollTrackedRequest(boolean param0) {
        if (!param0) {
          field_k = 1.1166023015975952f;
        }
        if (ArchiveLoadStep.field_l == null) {
          ArchiveLoadStep.field_l = DialWidgetPainter.sendTrackedRequest(false, 6);
        }
        if (ArchiveLoadStep.field_l.field_k) {
          ArchiveLoadStep.field_l = null;
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        int var1 = -73 / ((param0 + 7) / 41);
        field_l = null;
    }

    final static void initializeDialogRoot(byte param0) {
        ProxySocketConnector.field_j = BlastParticle.getSharedUiTheme(0);
        if (param0 > -57) {
          GooPuddle.initializeDialogRoot((byte) -40);
        }
        MessageDialogContent.field_S = new DialogLayer();
        ResizableDialog.showLoginPanel(true, (byte) -52, true);
    }

    final void update(int param0) {
        int var3 = ZombieDawn.field_J;
        GooPuddleCell var5 = (GooPuddleCell) (this.field_h.last((byte) 26));
        while (var5 != null) {
          var5.update((byte) -113);
          var5 = (GooPuddleCell) (this.field_h.previous(false));
        }
        if (param0 != -25687) {
          Human var4 = (Human) null;
          this.containsHuman((Human) null, (byte) 55);
        }
    }

    final static void flickerLightRadius(byte param0) {
        if (PowerupBar.field_g) {
          return;
        }
        if (param0 < 84) {
          field_i = 0;
        }
        int var1 = 20;
        int var2 = 40;
        int var3 = GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 5, 1);
        if (var3 == 0) {
          UiWidget.field_q = UiWidget.field_q - 3;
        } else {
          if (var3 == 1) {
            UiWidget.field_q = UiWidget.field_q + 3;
          }
        }
        if (!(UiWidget.field_q >= var2)) {
          UiWidget.field_q = var2;
        }
        if (UiWidget.field_q > var1 + var2) {
          UiWidget.field_q = var1 + var2;
        }
    }

    final static Js5Archive openCachedArchive(int param0, byte param1) {
        if (param1 >= -18) {
          field_i = -54;
        }
        return SpriteState.createResourceArchive(false, true, param0, 1, true, false);
    }

    final boolean containsHuman(Human param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        GooPuddleCell var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var3_int = param0.getX(true);
          var4 = param0.getY(237239984);
          if (param1 <= 49) {
            GooPuddle.releaseStatics((byte) 37);
          }
          var5 = (GooPuddleCell) (this.field_h.last((byte) 26));
          while (true) {
            if (var5 == null) {
              return false;
            }
            if (!var5.isNear(var4, var3_int, 114)) {
              var5 = (GooPuddleCell) (this.field_h.previous(false));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mm.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    GooPuddle(int param0, int param1) {
        boolean[][] var3;
        boolean[][] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        boolean[][] var8_ref_boolean____;
        int var9;
        int var10;
        int var11;
        boolean[][] var13;
        int var14;
        boolean[][] var15;
        boolean[][] var16;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        param0 = param0 / 24;
        param1 = param1 / 24;
        var16 = new boolean[1 + 2 * DialWidgetPainter.field_b][1 + DialWidgetPainter.field_b * 2];
        var15 = var16;
        var13 = var15;
        var3 = var13;
        var4 = new boolean[var16.length][var16[0].length];
        var5 = param0 - DialWidgetPainter.field_b;
        var6 = -DialWidgetPainter.field_b + param1;
        var13[DialWidgetPainter.field_b][DialWidgetPainter.field_b] = true;
        for (var7 = 0; var7 < DialWidgetPainter.field_b; var7++) {
          for (var8 = 0; var3.length > var8; var8++) {
            for (var9 = 0; var9 < var3[0].length; var9++) {
              var10 = var5 + var9;
              var11 = var6 + var8;
              if (var10 > 0 &&
                var11 > 0 &&
                TextLayout.field_a[0].length > var10 &&
                TextLayout.field_a.length > var11 &&
                (1 & TextLayout.field_a[var11][var10]) == 1 && (var3[var8][var9] ||
                (var9 > 0 &&
                var3[var8][-1 + var9] ||
                var8 > 0 &&
                var3[var8 - 1][var9] ||
                -1 + var3[0].length > var9 &&
                var3[var8][1 + var9]) ||
                var3.length - 1 > var8 &&
                var3[var8 + 1][var9])) {
                var4[var8][var9] = true;
              }
            }
          }
          var8_ref_boolean____ = var3;
          var3 = var4;
          var4 = var8_ref_boolean____;
        }
        this.field_h = new IntrusiveDeque();
        for (var7Lifetime1 = 0; var7Lifetime1 < var3.length; var7Lifetime1++) {
          var14 = 0;
          var8Lifetime1 = var14;
          while (var14 < var3[0].length) {
            var9Lifetime1 = var5 + var14;
            var10Lifetime1 = var7Lifetime1 + var6;
            var11Lifetime1 = (param0 - var9Lifetime1) * (param0 - var9Lifetime1) + (-var10Lifetime1 + param1) * (param1 - var10Lifetime1);
            if (var11Lifetime1 < 81 &&
              var3[var7Lifetime1][var14]) {
              this.field_h.addFirst(0, new GooPuddleCell(var9Lifetime1, var10Lifetime1, var11Lifetime1));
            }
            var14++;
          }
        }
    }

    static {
        field_i = -1;
        field_j = "More suggestions";
        field_l = "MELTDOWN";
    }
}
