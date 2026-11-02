/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ag[] field_c;
    static String field_e;
    static aa field_b;
    static String field_a;
    static aa field_d;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = rb.a(22479, param0);
          if (-1 == param1.indexOf(param0) &&
            -1 == param1.indexOf(var3)) {
            var4 = -12 % ((param2 - 62) / 33);
            stackIn_12_0 = (param1.startsWith(param0)) || (param1.startsWith(var3)) || (param1.endsWith(param0)) || (param1.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cb.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != hd.mouseHandler) {
            pa.idleTicks = 0;
            la.liveMouseX = param0.getX();
            ArchiveSource.liveMouseY = param0.getY();
            hd.inputPending = true;
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "cb.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != hd.mouseHandler) {
            db.liveMouseButton = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cb.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cb.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 <= 13) {
          Sprite[] var2 = (Sprite[]) null;
          MouseInputHandler.a(-60, (byte) -87, 63, -125, (Sprite[]) null, -25);
        }
        field_c = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, Sprite[] param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param4 != null &&
            param3 > 0) {
            if (param1 >= -101) {
              return;
            }
            var6_int = param4[0].field_s;
            var7 = param4[2].field_s;
            var8 = param4[1].field_s;
            param4[0].e(param5, param0, param2);
            param4[2].e(-var7 + (param3 + param5), param0, param2);
            SoftwareRasterizer.a(Archive.field_g);
            SoftwareRasterizer.b(param5 + var6_int, param0, -var7 + param5 + param3, param4[1].field_v + param0);
            var9 = param5 + var6_int;
            var10 = param5 + (param3 - var7);
            for (param5 = var9; param5 < var10; param5 = param5 + var8) {
              param4[1].e(param5, param0, param2);
            }
            SoftwareRasterizer.b(Archive.field_g);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("cb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != hd.mouseHandler) {
            pa.idleTicks = 0;
            la.liveMouseX = param0.getX();
            ArchiveSource.liveMouseY = param0.getY();
            hd.inputPending = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cb.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (hd.mouseHandler != null) {
            pa.idleTicks = 0;
            la.liveMouseX = param0.getX();
            ArchiveSource.liveMouseY = param0.getY();
            hd.inputPending = true;
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "cb.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != hd.mouseHandler) {
            pa.idleTicks = 0;
            sa.pressX = param0.getX();
            GameShell.pressY = param0.getY();
            qg.a(false);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              wf.pendingClick = 2;
              db.liveMouseButton = 2;
            } else {
              wf.pendingClick = 1;
              db.liveMouseButton = 1;
            }
            var2_int = param0.getModifiers();
            hd.inputPending = true;
            if (0 == (8 & var2_int)) {
            }
            if (0 == (4 & var2_int)) {
            }
            if ((var2_int & 16) == 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cb.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != hd.mouseHandler) {
            pa.idleTicks = 0;
            la.liveMouseX = -1;
            ArchiveSource.liveMouseY = -1;
            hd.inputPending = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cb.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ei var5_ref_ei = null;
        Object var6 = null;
        int var7 = 0;
        r var9 = null;
        la var10 = null;
        byte[] var14 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          var2 = -37 / ((-10 - param0) / 56);
          var10 = ne.field_a;
          var3 = var10.readUnsignedByte(16383);
          if (var3 == 0) {
            var9 = (r) (ne.field_b.first(2));
            if (var9 == null) {
              GameKeyHandler.a((byte) 113);
              return;
            }
            var5 = var10.readUnsignedByte(16383);
            if (0 != var5) {
              var14 = new byte[var5];
              var10.a(100, var14, 0, var5);
            } else {
              var6 = null;
            }
            var10.position = var10.position + 4;
            if (!var10.checkCrcTrailer(false)) {
              GameKeyHandler.a((byte) 118);
              return;
            }
            var9.unlink(-110);
          } else {
            if (var3 == 1) {
              var4 = var10.readInt((byte) 113);
              var5_ref_ei = (ei) (fj.field_H.first(2));
              while (var5_ref_ei != null) {
                if (var4 != var5_ref_ei.field_n) {
                  var5_ref_ei = (ei) (fj.field_H.next(10));
                  continue;
                }
                break;
              }
              if (var5_ref_ei != null) {
                var5_ref_ei.unlink(-119);
                return;
              }
              GameKeyHandler.a((byte) 121);
              return;
            }
            hb.reportClientError((Throwable) null, 0, "A1: " + jc.b(84));
            GameKeyHandler.a((byte) 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var1), "cb.D(" + param0 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (hd.mouseHandler != null) {
            pa.idleTicks = 0;
            db.liveMouseButton = 0;
            hd.inputPending = true;
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            if ((16 & var2_int) != 0) {
            }
            if (0 == (4 & var2_int)) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("cb.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        int var0 = 0;
        field_c = new ag[255];
        for (var0 = 0; var0 < field_c.length; var0++) {
          field_c[var0] = new ag();
        }
        field_e = "Visit the Account Management section on the main site to view.";
        field_a = "Please try again in a few minutes.";
        field_b = new aa(4, 1, 1, 1);
        field_d = new aa(10, 2, 2, 0);
    }
}
