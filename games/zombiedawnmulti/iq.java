/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    static gh field_c;
    static int field_e;
    static String field_d;
    static int[][] field_b;
    static boolean field_f;
    static String field_a;

    final static int[][] a(int param0) {
        RuntimeException var1 = null;
        int[][] stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 45) {
            iq.a((byte) -49, 120);
          }
          stackIn_3_0 = uf.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "iq.A(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, int param1) {
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 < 0) {
            stackIn_5_0 = ((param1 + 1) % 4 == 0);
            return stackIn_5_0;
          }
          if (param1 < 1582) {
            stackIn_11_0 = (0 == param1 % 4);
            return stackIn_11_0;
          }
          if (param1 % 4 != 0) {
            return false;
          }
          if (param1 % 100 != 0) {
            return true;
          }
          if (0 != param1 % 400) {
            return false;
          }
          if (param0 == 98) {
            return true;
          }
          field_c = (gh) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "iq.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        try {
          pi.a(135, true, 170, true, new int[]{46, 40, 44, 3, 12, 13, 4, 50, 2, 14, 11}, 470, 1, 30);
          pi.a(118, true, 170, true, new int[]{1, 12, 13, 34, 47, 50, 3, 7}, 460, 2, 34);
          pi.a(430, false, 0, true, new int[]{15, 5}, 640, 3, 40);
          if (param0 > -76) {
            iq.a((byte) -70, -75);
          }
          pi.a(430, false, 30, true, new int[]{17, 6, 18}, 468, 4, 200);
          pi.a(430, false, 0, true, new int[]{15, 5}, 640, 5, 120);
          pi.a(430, false, 100, true, new int[]{2, 5}, 440, 6, 220);
          pi.a(200, true, 194, true, new int[]{15, 16}, 446, 7, 100);
          pi.a(400, false, 50, true, new int[]{5}, 288, 14, 40);
          pi.a(400, false, 50, true, new int[]{5}, 288, 8, 40);
          DialogLayer.a(new int[]{5, 39, 26, 27, 28, 29, 30, 31, 32, 33}, false, 9, 240, (byte) 123, new int[]{5, 39, 22, 23, 24, 25}, 400, 160, 428);
          int[] var2 = (int[]) null;
          pi.a(310, false, 180, true, (int[]) null, 440, 10, 60);
          pi.a(0, true, 0, true, new int[]{}, 0, 11, 0);
          pi.a(0, true, 0, true, new int[]{19}, 0, 12, 0);
          pi.a(430, true, 170, true, new int[]{6}, 470, 13, 0);
          pi.a(430, false, 30, true, new int[]{45, 5}, 468, 15, 330);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "iq.E(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
          field_b = (int[][]) null;
          field_d = null;
          field_c = null;
          field_a = null;
          if (!param0) {
            iq.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "iq.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 99) {
            iq.a(77);
          }
          if (param0 == -2) {
            io.field_g = false;
            return;
          }
          if (21 != DiskCacheWorker.field_b) {
            if (19 != DiskCacheWorker.field_b &&
              DiskCacheWorker.field_b != 20) {
              if (-1 == param0) {
                DiskCacheWorker.field_b = -1;
                io.field_g = false;
                ml.field_Jb = -1;
                ArmedHumanView.field_rb = -1;
                WidgetContainer.field_E = 0;
                ma.field_d = -1;
                return;
              }
              if (param0 >= 0 &&
                param0 <= 21) {
                if (io.field_g) {
                  return;
                }
                FadingDialog.a(param1 ^ -17403, 0);
                return;
              }
              if (-14 != param0) {
                if (param0 != -3) {
                  return;
                }
                io.field_g = false;
                return;
              }
              if (ArmedHumanView.field_rb >= -1 + SimHuman.field_pb) {
                io.field_g = false;
                return;
              }
              FadingDialog.a(param1 ^ -17403, 1 + ArmedHumanView.field_rb);
              return;
            }
            if (param0 == -1) {
              FadingDialog.a(-17306, 0);
              return;
            }
            if (param0 != -14) {
              return;
            }
            if (-1 + SimHuman.field_pb > ArmedHumanView.field_rb) {
              FadingDialog.a(-17306, 1 + ArmedHumanView.field_rb);
              return;
            }
            if (pp.field_n) {
              pp.field_n = false;
              we.field_g[7] = WidgetContainer.field_D;
            }
            io.field_g = false;
            return;
          }
          var2_int = ArmedHumanView.field_rb;
          if (param0 != -12) {
            MusicPatch.a((byte) -12, param0);
          }
          if (param0 == -1) {
            w.field_m = 0;
            FadingDialog.a(-17306, 1);
          }
          if (PowerupButton.field_e.selection.size((byte) 98) == 0) {
            w.field_m = w.field_m & -9;
          }
          if (-12 == param0) {
            FadingDialog.a(-17306, 0);
          }
          if (ArmedHumanView.field_rb == 0 && (gh.a(-3, param1 + 11554) ||
            param0 == -14)) {
            FadingDialog.a(-17306, jh.field_ic);
          }
          if (1 == ArmedHumanView.field_rb &&
            gh.a(-8, 11653)) {
            FadingDialog.a(param1 ^ -17403, 2);
          }
          if (2 == ArmedHumanView.field_rb &&
            gh.a(-7, 11653)) {
            FadingDialog.a(param1 - 17405, 3);
          }
          if (ArmedHumanView.field_rb == 3 &&
            gh.a(-3, 11653)) {
            FadingDialog.a(-17306, 4);
          }
          if (4 == ArmedHumanView.field_rb &&
            gh.a(-13, 11653)) {
            FadingDialog.a(param1 ^ -17403, 5);
          }
          if (5 == ArmedHumanView.field_rb &&
            gh.a(-4, 11653)) {
            if (PowerupButton.field_e.selection.size((byte) 98) > 0) {
              FadingDialog.a(param1 ^ -17403, 6);
            } else {
              FadingDialog.a(param1 - 17405, 7);
            }
          }
          if (ArmedHumanView.field_rb == 6 &&
            gh.a(-6, 11653)) {
            FadingDialog.a(-17306, 7);
          }
          if (ArmedHumanView.field_rb == 7 &&
            gh.a(-5, 11653)) {
            FadingDialog.a(-17306, 6);
          }
          if ((6 == ArmedHumanView.field_rb ||
            ArmedHumanView.field_rb == 7) &&
            (gh.a(-6, 11653) &&
            gh.a(-5, 11653))) {
            FadingDialog.a(-17306, 8);
          }
          if (8 == ArmedHumanView.field_rb &&
            gh.a(-9, 11653)) {
            FadingDialog.a(param1 - 17405, 9);
          }
          if (ArmedHumanView.field_rb == 9 &&
            gh.a(-10, 11653)) {
            FadingDialog.a(-17306, 10);
          }
          if (ArmedHumanView.field_rb == 10 &&
            gh.a(-11, 11653)) {
            FadingDialog.a(-17306, 11);
          }
          if (ArmedHumanView.field_rb == 4 &&
            !gh.a(-3, param1 + 11554)) {
            FadingDialog.a(-17306, 3);
          }
          if (ArmedHumanView.field_rb != var2_int) {
            if (!io.field_g &&
              ArmedHumanView.field_rb != 0) {
              return;
            }
            PowerupButton.field_e.c(true, ArmedHumanView.field_rb);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "iq.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -1) {
            iq.a(38, -116, 25);
          }
          var3_int = 0;
          var4 = ce.field_k;
          while (var3_int < TextWidgetPainter.field_m.length) {
            var5 = MessageDialogContent.field_Q[var3_int];
            if (var5 < 0) {
              var4 = var4 + WidgetContainer.field_C;
            } else {
              var6 = hn.a(0, TextWidgetPainter.field_m[var3_int], true);
              var7 = am.field_c - (var6 >> 1);
              var4 = var4 + ResizableDialog.field_bb;
              if (IntrusiveDeque.a(param0, var7 - QuickChatHelpDialog.field_Gb, param2, var6 + (QuickChatHelpDialog.field_Gb << 1), var4, (DateInputWidget.field_G << 1) + me.field_h, -18)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (ResizableDialog.field_bb + (DateInputWidget.field_G << 1) + me.field_h);
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "iq.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = 20;
        field_a = "Add friend";
        field_f = true;
        field_d = "You appear to be telling someone your password - please don't!";
    }
}
