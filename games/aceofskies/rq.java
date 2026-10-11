/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        te var3_ref_te = null;
        ds var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        dl var9 = null;
        byte[] var13 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var9 = nm.field_c;
          if (param0 <= 15) {
            field_a = (String) null;
          }
          var2 = var9.g(-112);
          if (var2 != 0) {
            if (var2 == 1) {
              var3 = var9.a((byte) 117);
              var4 = (ds) (cl.field_eb.d(268435455));
              while (var4 != null) {
                if (var4.field_g != var3) {
                  var4 = (ds) (cl.field_eb.b((byte) 103));
                  continue;
                }
                break;
              }
              if (var4 == null) {
                te.b(true);
                return;
              }
              var4.c(-127);
              return;
            }
            v.a("A1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
            te.b(true);
          } else {
            var3_ref_te = (te) (ep.field_z.d(268435455));
            if (var3_ref_te == null) {
              te.b(true);
              return;
            }
            var4_int = var9.g(-79);
            if (var4_int != 0) {
              var13 = new byte[var4_int];
              var9.a(0, 7186, var4_int, var13);
            } else {
              var5 = null;
            }
            var9.field_g = var9.field_g + 4;
            if (!var9.e(6103)) {
              te.b(true);
              return;
            }
            var3_ref_te.c(-124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "rq.A(" + param0 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != ho.field_b) {
            oj.field_g = 0;
            sj.field_a = -1;
            qd.field_m = -1;
            si.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rq.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(float[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param5 > 0 &&
            !mg.a(param5, (byte) 127)) {
            throw new IllegalArgumentException("");
          }
          if (param6 > ~param3 &&
            !mg.a(param3, (byte) 21)) {
            throw new IllegalArgumentException("");
          }
          var7_int = rl.a(param6 + 5, param4);
          var8 = 0;
          stackIn_10_0 = (param5 >= param3) ? param3 : param5;
          var9 = stackIn_10_0;
          var10 = param5 >> 1;
          var11 = param3 >> 1;
          var12 = param0;
          var13 = new float[var7_int * var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param1, var8, param2, param5, param3, 0, param4, 5126, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = var7_int * param5;
            var14 = var13;
            for (var17 = 0; var17 < var7_int; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var19 + var16;
              for (var21 = 0; var11 > var21; var21++) {
                for (var22 = 0; var10 > var22; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var15 = var15 + var12[var20];
                  var19 = var19 + var7_int;
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = 0.25f * var15;
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var19 = var19 + var16;
                var20 = var20 + var16;
              }
            }
            var13 = var12;
            param5 = var10;
            var12 = var14;
            param3 = var11;
            var11 = var11 >> 1;
            var9 = var9 >> 1;
            var10 = var10 >> 1;
            var8++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("rq.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
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
          if (null != ho.field_b) {
            oj.field_g = 0;
            mp.field_g = 0;
            si.field_b = true;
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            if (0 != (4 & var2_int)) {
            }
            if ((16 & var2_int) != 0) {
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
          stackIn_10_1 = new StringBuilder().append("rq.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          String var2 = (String) null;
          rq.a(101, (String) null);
        }
        field_a = null;
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ho.field_b != null) {
            oj.field_g = 0;
            kg.field_a = param0.getX();
            jd.field_e = param0.getY();
            kh.a(-125);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              me.field_b = 2;
              mp.field_g = 2;
            } else {
              me.field_b = 1;
              mp.field_g = 1;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 8) == 0) {
            }
            si.field_b = true;
            if ((4 & var2_int) != 0) {
            }
            if (0 != (var2_int & 16)) {
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
          stackIn_13_1 = new StringBuilder().append("rq.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static id a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        id stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gm.field_x.a(false) &&
            !param1.equals(gm.field_x.b(2))) {
            gm.field_x = od.a(param1, 60);
          }
          var2_int = 98 / ((param0 + 53) / 49);
          stackIn_4_0 = gm.field_x;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ho.field_b) {
            mp.field_g = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rq.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ho.field_b != null) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rq.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (ho.field_b != null) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rq.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (ho.field_b != null) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rq.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
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
          stackIn_6_1 = new StringBuilder().append("rq.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = "Waiting for music";
    }
}
