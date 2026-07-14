/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    final static void a(byte param0) {
        int var4_int = 0;
        byte[] var13 = null;
        ds var4 = null;
        te var3_ref_te = null;
        Object var5 = null;
        int var3 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        dl var9 = nm.field_c;
        if (param0 <= 15) {
            field_a = (String) null;
        }
        int var2 = var9.g(-112);
        if (var2 == 0) {
            var3_ref_te = (te) ep.field_z.d(268435455);
            if (!(var3_ref_te != null)) {
                te.b(true);
                return;
            }
            var4_int = var9.g(-79);
            if (var4_int == 0) {
                var5 = null;
            } else {
                var13 = new byte[var4_int];
                var9.a(0, 7186, var4_int, var13);
            }
            ((dl) var9).field_g = ((dl) var9).field_g + 4;
            if (!var9.e(6103)) {
                te.b(true);
                return;
            }
            var3_ref_te.c(-124);
        } else {
            if ((var2 ^ -1) == -2) {
                var3 = var9.a((byte) 117);
                var4 = (ds) cl.field_eb.d(268435455);
                while (var4 != null) {
                    // if_icmpeq L202
                    var4 = (ds) cl.field_eb.b((byte) 103);
                }
                if (!(var4 != null)) {
                    te.b(true);
                    return;
                }
                var4.c(-127);
            } else {
                v.a("A1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                te.b(true);
            }
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != ho.field_b) {
            oj.field_g = 0;
            sj.field_a = -1;
            qd.field_m = -1;
            si.field_b = true;
        }
    }

    final static void a(float[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var23 = AceOfSkies.field_G ? 1 : 0;
          if (param5 >= -1) {
            break L0;
          } else {
            if (mg.a(param5, (byte) 127)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if (param6 >= param3) {
            break L1;
          } else {
            if (mg.a(param3, (byte) 21)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L2: {
          var7 = rl.a(param6 + 5, param4);
          var8 = 0;
          if (param5 >= param3) {
            stackOut_8_0 = param3;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = param5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var9 = stackIn_9_0;
        var10 = param5 >> 1393860097;
        var11 = param3 >> -291001311;
        var12 = param0;
        var13 = new float[var7 * var11 * var10];
        L3: while (true) {
          jaggl.OpenGL.glTexImage2Df(param1, var8, param2, param5, param3, 0, param4, 5126, var12, 0);
          if ((var9 ^ -1) < -2) {
            var16 = var7 * param5;
            var14 = var13;
            var17 = 0;
            L4: while (true) {
              if (var17 >= var7) {
                var13 = var12;
                param5 = var10;
                var12 = var14;
                param3 = var11;
                var11 = var11 >> 1;
                var9 = var9 >> 1;
                var10 = var10 >> 1;
                var8++;
                continue L3;
              } else {
                var18 = var17;
                var19 = var17;
                var20 = var19 - -var16;
                var21 = 0;
                L5: while (true) {
                  if (var11 <= var21) {
                    var17++;
                    continue L4;
                  } else {
                    var22 = 0;
                    L6: while (true) {
                      if (var10 <= var22) {
                        var19 = var19 + var16;
                        var20 = var20 + var16;
                        var21++;
                        continue L5;
                      } else {
                        var15 = param0[var19];
                        var19 = var19 + var7;
                        var15 = var15 + param0[var19];
                        var15 = var15 + param0[var20];
                        var19 = var19 + var7;
                        var20 = var20 + var7;
                        var15 = var15 + param0[var20];
                        var13[var18] = 0.25f * var15;
                        var20 = var20 + var7;
                        var18 = var18 + var7;
                        var22++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != ho.field_b) {
            oj.field_g = 0;
            mp.field_g = 0;
            si.field_b = true;
            var2 = param0.getModifiers();
            if ((8 & var2) == 0) {
            }
            if (0 == (4 & var2)) {
            }
            if ((16 & var2) == 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            String var2 = (String) null;
            id discarded$0 = rq.a(101, (String) null);
        }
        field_a = null;
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ho.field_b == null) {
        } else {
            oj.field_g = 0;
            kg.field_a = param0.getX();
            jd.field_e = param0.getY();
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                me.field_b = 1;
                mp.field_g = 1;
            } else {
                me.field_b = 2;
                mp.field_g = 2;
            }
            var2 = param0.getModifiers();
            if ((var2 & 8) != -1) {
            }
            si.field_b = true;
            if (-1 == (4 & var2)) {
            }
            if (0 == (var2 & 16)) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static id a(int param0, String param1) {
        if (gm.field_x.a(false)) {
            if (!param1.equals((Object) (Object) gm.field_x.b(2))) {
                gm.field_x = od.a(param1, 60);
            }
        }
        int var2 = 98 / ((param0 - -53) / 49);
        return gm.field_x;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == ho.field_b)) {
            mp.field_g = 0;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(ho.field_b == null)) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (ho.field_b != null) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (ho.field_b != null) {
            oj.field_g = 0;
            sj.field_a = param0.getX();
            qd.field_m = param0.getY();
            si.field_b = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
    }
}
