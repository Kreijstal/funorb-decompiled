/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static eo field_h;
    static qr field_d;
    static pf field_g;
    static String field_e;
    static pf field_c;
    static int field_f;
    static bi field_b;
    static String field_a;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == pd.field_j) {
            return;
          }
          ql.field_q = 0;
          aj.field_f = param0.getX();
          rf.field_i = param0.getY();
          kh.field_Lb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ed.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ed.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == pd.field_j) {
            return;
          }
          ql.field_q = 0;
          aj.field_f = param0.getX();
          rf.field_i = param0.getY();
          kh.field_Lb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ed.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (pd.field_j != null) {
            ql.field_q = 0;
            aj.field_f = param0.getX();
            rf.field_i = param0.getY();
            kh.field_Lb = true;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ed.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static bi a(boolean param0) {
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var19 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Object var3 = null;
        int[] var9 = null;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1 = cm.field_g[0] * mc.field_s[0];
        int[] var13Lifetime1;
        int[] var11Lifetime1;
        int[] var5_ref_int__Lifetime1;
        Object var3Lifetime1;
        int[] var9Lifetime1;
        int var6Lifetime1;
        int var5Lifetime1;
        if (param0) {
          var20 = hd.field_q[0];
          if (ua.field_h[0]) {
            var21 = kc.field_l[0];
            var13 = new int[var1];
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var1 > var6; var6++) {
              var5_ref_int__[var6] = ee.a(eo.field_fb[we.a((int) var20[var6], 255)], we.a(-16777216, var21[var6] << 24));
            }
            var3 = new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var13);
          } else {
            var9 = new int[var1];
            for (var5 = 0; var1 > var5; var5++) {
              var9[var5] = eo.field_fb[we.a(255, (int) var20[var5])];
            }
            var3 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var9);
          }
          pd.a(0);
          return (bi) (var3);
        }
        ed.a(79);
        byte[] var18 = hd.field_q[0];
        if (ua.field_h[0]) {
          var19 = kc.field_l[0];
          var13Lifetime1 = new int[var1];
          var11Lifetime1 = var13Lifetime1;
          var5_ref_int__Lifetime1 = var11Lifetime1;
          for (var6Lifetime1 = 0; var1 > var6Lifetime1; var6Lifetime1++) {
            var5_ref_int__Lifetime1[var6Lifetime1] = ee.a(eo.field_fb[we.a((int) var18[var6Lifetime1], 255)], we.a(-16777216, var19[var6Lifetime1] << 24));
          }
          var3Lifetime1 = new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var13Lifetime1);
        } else {
          var9Lifetime1 = new int[var1];
          for (var5Lifetime1 = 0; var1 > var5Lifetime1; var5Lifetime1++) {
            var9Lifetime1[var5Lifetime1] = eo.field_fb[we.a(255, (int) var18[var5Lifetime1])];
          }
          var3Lifetime1 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var9Lifetime1);
        }
        pd.a(0);
        return (bi) (var3Lifetime1);
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = he.field_p != null ? 1 : 0;
        if (param0 != 1) {
          return true;
        }
        if (oq.field_j != 9) {
          if (oq.field_j == 10) {
            if (var3 != 0) {
              return false;
            }
            rg.a(true);
            return true;
          }
          if (11 != oq.field_j) {
            return false;
          }
          if (!jj.field_n) {
            return false;
          }
          if (vp.field_r == 2) {
            if (!ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
              return false;
            }
            if (vp.field_r == 2) {
              if (!sh.b(57)) {
                return true;
              }
              ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
              return true;
            }
            if (var3 != 0) {
              return false;
            }
            if (sh.b(57)) {
              ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
            }
            return true;
          }
          if (vp.field_r != 2 &&
            var3 != 0) {
            return false;
          }
          if (sh.b(57)) {
            ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
          }
          return true;
        }
        if (!j.a(2, uo.field_f, jj.field_o, tl.field_D, bq.field_e)) {
          if (oq.field_j == 10) {
            if (var3 != 0) {
              return false;
            }
            rg.a(true);
            return true;
          }
          if (11 == oq.field_j) {
            if (!jj.field_n) {
              return false;
            }
            if (vp.field_r == 2) {
              if (ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
                if (vp.field_r != 2 &&
                  var3 != 0) {
                  return false;
                }
                if (sh.b(57)) {
                  ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                }
                return true;
              }
              return false;
            }
            if (vp.field_r != 2 &&
              var3 != 0) {
              return false;
            }
            if (sh.b(57)) {
              ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
            }
            return true;
          }
          return false;
        }
        if (tl.field_D != 2 &&
          var3 != 0) {
          return false;
        }
        return tk.a(bq.field_e, jj.field_o, false, uo.field_f, tl.field_D);
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == pd.field_j) {
            return;
          }
          ql.field_q = 0;
          aj.field_f = -1;
          rf.field_i = -1;
          kh.field_Lb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ed.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          if (null != pd.field_j) {
            ql.field_q = 0;
            v.field_d = 0;
            kh.field_Lb = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 4) == 0) {
            }
            if (0 != (16 & var2_int)) {
            }
            if ((8 & var2_int) != 0) {
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
          stackIn_10_1 = new StringBuilder().append("ed.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != pd.field_j) {
            ql.field_q = 0;
            lc.field_c = param0.getX();
            el.field_e = param0.getY();
            pr.a(14274);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              vh.field_c = 2;
              v.field_d = 2;
            } else {
              vh.field_c = 1;
              v.field_d = 1;
            }
            var2_int = param0.getModifiers();
            kh.field_Lb = true;
            if ((var2_int & 16) == 0) {
            }
            if ((var2_int & 4) == 0) {
            }
            if (0 != (var2_int & 8)) {
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
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ed.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == pd.field_j) {
            return;
          }
          v.field_d = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ed.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_b = null;
        if (param0 > 54) {
          field_c = null;
          field_h = null;
          return;
        }
        ed.a(7, -49, -44);
        field_c = null;
        field_h = null;
    }

    static {
        field_e = "Waiting for extra data";
        field_g = new pf();
        field_c = new pf();
        field_f = 20;
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
