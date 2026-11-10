/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    private DualLinkDeque field_e;
    static gh field_g;
    static String field_d;
    static int field_a;
    private Thread field_i;
    private boolean field_f;
    static UiComponent field_c;
    static int field_b;
    int field_h;

    final li queueRead(int param0, SectorCacheStore param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        SectorCacheStore var5 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10) {
            var5 = (SectorCacheStore) null;
            this.readNow(-98, (SectorCacheStore) null, -12);
          }
          var4 = new li();
          var4.field_B = param1;
          var4.field_r = false;
          var4.field_y = 3;
          var4.secondaryKey = (long)param0;
          this.enqueue(false, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ai.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void startDisplayNameLogin(String param0, byte param1) {
        try {
          DateInputWidget.a(param0, (byte) 48);
          PowerupCommand.a(StatefulTextPainter.field_v, false, 102);
          int var2_int = -102 % ((52 - param1) / 40);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ai.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          li var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          while (!this.field_f) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (li) (this.field_e.removeLast(11356));
              if (var7 != null) {
                this.field_h = this.field_h - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_y == 2) {
                var7.field_B.write((byte) 118, var7.field_D, var7.field_D.length, (int)var7.secondaryKey);
                var7.field_t = false;
              } else {
                if (var7.field_y != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_D = var7.field_B.read(1, (int)var7.secondaryKey);
                  var7.field_t = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              MouseInputHandler.reportClientError((String) null, (Throwable) ((Object) var2_ref), false);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_t = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final li queueWrite(int param0, SectorCacheStore param1, byte[] param2, int param3) {
        li var5 = null;
        RuntimeException var5_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new li();
          var5.field_r = false;
          var5.secondaryKey = (long)param0;
          var5.field_D = param2;
          var5.field_y = 2;
          var5.field_B = param1;
          this.enqueue(false, var5);
          if (param3 > 26) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("ai.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int advanceSlideshow(boolean param0, byte param1) {
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          DualLinkDeque.field_b = DualLinkDeque.field_b + 65536;
          if (param1 != 110) {
            field_d = (String) null;
          }
          while (65536 <= DropTargetWidget.multiplyFixed16((byte) 120, DualLinkDeque.field_b, nf.field_b)) {
            ClientException.field_c = ClientException.field_c + 1;
            DualLinkDeque.field_b = DualLinkDeque.field_b - nf.field_b;
          }
          var2_int = -1;
          if (null == QuickChatMenu.field_Ub) {
            if (null != ao.field_h) {
              var2_int = ao.field_h.length;
            }
          } else {
            var2_int = QuickChatMenu.field_Ub.length;
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (lb.field_a < nf.field_c) {
              lb.field_a = lb.field_a + 1;
              if (lb.field_a > nf.field_a && (null == QuickChatMenu.field_Ub ||
                null == QuickChatMenu.field_Ub[DebouncedValidationProvider.field_g])) {
                lb.field_a = lb.field_a - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (lb.field_a >= nf.field_c &&
                  QuickChatMenu.field_Ub[(DebouncedValidationProvider.field_g + 1) % var2_int] == null) {
                  lb.field_a = lb.field_a - 1;
                }
              }
            }
            if (nf.field_c <= lb.field_a) {
              DebouncedValidationProvider.field_j = DebouncedValidationProvider.field_g;
              if (qh.field_a) {
                DebouncedValidationProvider.field_g = DebouncedValidationProvider.field_g + 1;
                if (DebouncedValidationProvider.field_g >= var2_int) {
                  DebouncedValidationProvider.field_g = DebouncedValidationProvider.field_g - var2_int;
                }
              } else {
                DebouncedValidationProvider.field_g = DebouncedValidationProvider.field_g - 1;
                if (DebouncedValidationProvider.field_g < 0) {
                  DebouncedValidationProvider.field_g = DebouncedValidationProvider.field_g + var2_int;
                }
              }
              lb.field_a = lb.field_a - nf.field_c;
            }
            if (nf.field_a < lb.field_a) {
              qh.field_a = true;
            }
          }
          if (ReportAbuseDialog.field_Tb != null) {
            var3 = -(ReportAbuseDialog.field_Tb.field_u / 2) + 357;
            var4 = 0;
            if (kd.field_b != 0 &&
              ChatMessage.field_t > var3 &&
              ReportAbuseDialog.field_Tb.height + var3 > ChatMessage.field_t) {
              if (269 - ReportAbuseDialog.field_Tb.width < vb.field_f &&
                vb.field_f < 269) {
                var4 = 1;
                lb.field_a = nf.field_c;
                qh.field_a = false;
              }
              if (vb.field_f > 586 &&
                vb.field_f < ReportAbuseDialog.field_Tb.width + 586) {
                var4 = 1;
                qh.field_a = true;
                lb.field_a = nf.field_c;
              }
            }
            if (var4 == 0 &&
              nf.field_a < lb.field_a &&
              bo.field_d > var3 &&
              ReportAbuseDialog.field_Tb.height + var3 > bo.field_d) {
              if (-ReportAbuseDialog.field_Tb.width + 269 < MouseInputHandler.field_g &&
                269 > MouseInputHandler.field_g) {
                lb.field_a = nf.field_a;
              }
              if (MouseInputHandler.field_g > 586 &&
                MouseInputHandler.field_g < 586 + ReportAbuseDialog.field_Tb.width) {
                lb.field_a = nf.field_a;
              }
            }
          }
          if (!param0) {
            return 0;
          }
          UsernameSuggestionsPanel.field_H.updatePointer(ResizableDialog.hitTestPairedSprites(bo.field_d, -1, MouseInputHandler.field_g), 104, ResizableDialog.hitTestPairedSprites(ChatMessage.field_t, param1 - 111, vb.field_f));
          if (UsernameSuggestionsPanel.field_H.isActivated(-85)) {
            if (UsernameSuggestionsPanel.field_H.field_d == 0) {
              stackIn_63_0 = 3;
              return stackIn_63_0;
            }
            if (UsernameSuggestionsPanel.field_H.field_d == 1) {
              stackIn_66_0 = 2;
              return stackIn_66_0;
            }
          }
          while (true) {
            if (!MusicPatchPcmStream.pollKeyEvent(param1 ^ -111)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            UsernameSuggestionsPanel.field_H.handleHorizontalNavigation(0, false);
            if (UsernameSuggestionsPanel.field_H.isActivated(-85)) {
              if (UsernameSuggestionsPanel.field_H.field_d == 0) {
                stackIn_72_0 = 3;
                return stackIn_72_0;
              }
              if (UsernameSuggestionsPanel.field_H.field_d == 1) {
                stackIn_76_0 = 1;
                return stackIn_76_0;
              }
            }
            if (13 != InfectionEvent.field_p) {
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ai.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 < 126) {
          field_a = 104;
          field_c = null;
          field_g = null;
          return;
        }
        field_c = null;
        field_g = null;
    }

    final li readNow(int param0, SectorCacheStore param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        li var6 = null;
        int var8 = 0;
        li stackIn_3_0 = null;
        li stackIn_12_0 = null;
        li stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4 = new li();
          if (param2 != -3) {
            stackIn_3_0 = (li) null;
            return stackIn_3_0;
          }
          var4.field_y = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (li) (this.field_e.first((byte) 85));
            while (var6 != null) {
              if (var6.secondaryKey == (long)param0 &&
                param1 == var6.field_B &&
                var6.field_y == 2) {
                var4.field_t = false;
                var4.field_D = var6.field_D;
                stackIn_12_0 = var4;
                return stackIn_12_0;
              }
              var6 = (li) (this.field_e.next((byte) 118));
            }
          }
          var4.field_D = param1.read(1, param0);
          var4.field_t = false;
          var4.field_r = true;
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("ai.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static Object wrapBytes(int param0, boolean param1, byte[] param2) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        bk stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param0 > ~param2.length) {
            var3 = new bk();
            ((t) ((Object) var3)).setBytes(param2, (byte) -72);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param1) {
            stackIn_10_0 = ValidationState.a(255, param2);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ai.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void enqueue(boolean param0, li param1) {
        synchronized (this.field_e) {
          this.field_e.add(29664, param1);
          if (param0) {
            this.field_i = (Thread) null;
          }
          this.field_h = this.field_h + 1;
          this.field_e.notifyAll();
        }
    }

    final void shutdown(byte param0) {
        try {
          String var4 = null;
          this.field_f = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
            if (param0 != 77) {
              var4 = (String) null;
              DiskCacheWorker.startDisplayNameLogin((String) null, (byte) 75);
            }
          }
          try {
            this.field_i.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean handleQuickChatKey(boolean param0, int param1, int param2) {
        if (InfectionEvent.field_p == 13) {
          ub.closeChatInputIfOpen(33423425);
          return true;
        }
        if (InfectionEvent.field_p == 102) {
          mj.field_Ib.resetSelection((byte) 113);
          return true;
        }
        if (param0) {
          DiskCacheWorker.advanceSlideshow(true, (byte) 112);
          if (null == mj.field_Ib) {
            return false;
          }
          if (mj.field_Ib.handleShortcutKey(96, param2, param1)) {
            return true;
          }
          return false;
        }
        if (null == mj.field_Ib) {
          return false;
        }
        if (mj.field_Ib.handleShortcutKey(96, param2, param1)) {
          return true;
        }
        return false;
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_e = new DualLinkDeque();
        this.field_f = false;
        this.field_h = 0;
        try {
          var2 = param0.startThread(121, (Runnable) (this), 5);
          while (var2.field_f == 0) {
            vd.a(false, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_i = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = -1;
        field_d = "The game options are not all set.";
    }
}
