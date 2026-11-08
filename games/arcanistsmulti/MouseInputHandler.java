/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static IndexedSprite[] field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != ResizableModalPanel.field_hb) {
            rk.field_K = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != ResizableModalPanel.field_hb) {
            rf.field_o = 0;
            BevelBoxPainter.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ResizableModalPanel.field_hb != null) {
            rf.field_o = 0;
            bo.field_e = param0.getX();
            ResizableViewResizeListener.field_j = param0.getY();
            qj.monotonicTimeMillis(-26572);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              ValidationState.field_c = 2;
              rk.field_K = 2;
            } else {
              ValidationState.field_c = 1;
              rk.field_K = 1;
            }
            var2_int = param0.getModifiers();
            qa.field_g = true;
            if ((var2_int & 16) == 0) {
            }
            if ((var2_int & 4) != 0) {
            }
            if ((8 & var2_int) == 0) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("je.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -10338) {
          return;
        }
        field_a = null;
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (ResizableModalPanel.field_hb != null) {
            rf.field_o = 0;
            BevelBoxPainter.field_g = -1;
            dd.field_i = -1;
            qa.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ResizableModalPanel.field_hb) {
            rf.field_o = 0;
            rk.field_K = 0;
            qa.field_g = true;
            var2_int = param0.getModifiers();
            if (0 != (var2_int & 16)) {
            }
            if (0 != (var2_int & 4)) {
            }
            if ((var2_int & 8) != 0) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("je.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (ResizableModalPanel.field_hb != null) {
            rf.field_o = 0;
            BevelBoxPainter.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (ResizableModalPanel.field_hb != null) {
            rf.field_o = 0;
            BevelBoxPainter.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void readTimestamp(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          kj.field_c = param1.readUnsignedShort(-98) << 5;
          var2_int = param1.readUnsignedByte((byte) 99);
          IntrusiveDequeCursor.field_j = var2_int << 18 & 1835008;
          kj.field_c = kj.field_c + (var2_int >> 3);
          int var3 = 13 / ((71 - param0) / 52);
          IntrusiveDequeCursor.field_j = IntrusiveDequeCursor.field_j + (param1.readUnsignedShort(-98) << 2);
          var2_intLifetime1 = param1.readUnsignedByte((byte) -97);
          fo.field_a = var2_intLifetime1 << 15 & 2064384;
          IntrusiveDequeCursor.field_j = IntrusiveDequeCursor.field_j + (var2_intLifetime1 >> 6);
          fo.field_a = fo.field_a + (param1.readUnsignedByte((byte) -93) << 7);
          var2_intLifetime2 = param1.readUnsignedByte((byte) -97);
          fo.field_a = fo.field_a + (var2_intLifetime2 >> 1);
          qj.field_g = (1 & var2_intLifetime2) << 16;
          qj.field_g = qj.field_g + param1.readUnsignedShort(-98);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "je.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isCurrentUser(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            field_b = 108;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_3_0 = nm.field_b.equals(Js5ArchiveManager.normalizeNameForLookup(var3, -13));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void openGameInfo(int param0, LobbyGameEntry param1, String param2, boolean param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        PacketBuffer var7 = null;
        PlayerActionMenu var9 = null;
        String var10 = null;
        PlayerActionMenu var11 = null;
        String var12 = null;
        PlayerActionMenu var13 = null;
        String var14 = null;
        PlayerActionMenu var15 = null;
        try {
          ArcanistsMulti.openInfoPanel(-26335, (int[]) null, DebouncedValidator.field_g, (String) null, 0L, -1, param1.getSortKey((byte) 73), (String) null, param1);
          if (param1.field_Lb && (2 == param1.field_Fb ||
            !(qf.field_d < 2))) {
            var9 = eo.field_c;
            var10 = CachedArchiveProvider.formatTemplate(param0 - 949002960, new String[]{param2}, LinkButtonPainter.field_i);
            var9.field_l.addAction(10, var10, (byte) -26);
          }
          eo.field_c.addSocialActions(param0 ^ 949002929);
          if (param3) {
            if (eo.field_c.field_e != ki.field_q) {
              var13 = eo.field_c;
              var14 = CachedArchiveProvider.formatTemplate(-50, new String[]{param2}, FixedViewResizeListener.field_f);
              var13.field_l.addAction(15, var14, (byte) -26);
            } else {
              var11 = eo.field_c;
              var12 = CachedArchiveProvider.formatTemplate(-50, new String[]{param2}, LoadingTracker.field_o);
              var11.field_l.addAction(16, var12, (byte) -26);
            }
          }
          var15 = eo.field_c;
          var5 = pb.field_h;
          var6 = ja.field_s;
          var15.field_l.openAt(0, 0, param0 - 949032396, var6, var5);
          if (param0 == 949002930) {
            return;
          }
          var7 = (PacketBuffer) null;
          MouseInputHandler.readTimestamp(68, (PacketBuffer) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("je.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
