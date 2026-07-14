/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_e;
    static String field_g;
    static ck field_c;
    static ji field_h;
    static qm field_a;
    static ck field_b;
    static int field_d;
    static boolean field_f;
    static long field_i;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != ik.field_f) {
            pf.field_g = 0;
            lc.field_f = param0.getX();
            te.field_r = param0.getY();
            ml.field_b = true;
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            if (!param0) {
              field_e = 126;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (param1.charAt(var5) == param2) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == ik.field_f) {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            pf.field_g = 0;
            pa.field_bb = 0;
            ml.field_b = true;
            var2 = param0.getModifiers();
            if ((8 & var2) == 0) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (0 == (16 & var2)) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (0 != (var2 & 4)) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(ik.field_f == null)) {
            pf.field_g = 0;
            lc.field_f = param0.getX();
            te.field_r = param0.getY();
            ml.field_b = true;
        }
    }

    final static void a(boolean param0, wl param1, ve param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ve stackIn_4_0 = null;
        ve stackIn_5_0 = null;
        ve stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ve stackIn_7_0 = null;
        ve stackIn_8_0 = null;
        ve stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ve stackIn_10_0 = null;
        ve stackIn_11_0 = null;
        ve stackIn_12_0 = null;
        ve stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ve stackIn_14_0 = null;
        ve stackIn_15_0 = null;
        ve stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ve stackIn_17_0 = null;
        ve stackIn_18_0 = null;
        ve stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ve stackIn_20_0 = null;
        ve stackIn_21_0 = null;
        ve stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        ve stackOut_3_0 = null;
        ve stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ve stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ve stackOut_6_0 = null;
        ve stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ve stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ve stackOut_9_0 = null;
        ve stackOut_10_0 = null;
        ve stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ve stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ve stackOut_13_0 = null;
        ve stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ve stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ve stackOut_16_0 = null;
        ve stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ve stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ve stackOut_19_0 = null;
        ve stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ve stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if (param0) {
            param2.field_rc = param1.d((byte) -75);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param2.field_mc = param1.d((byte) -75);
          param2.field_Wb = param1.d((byte) -62);
          var4 = param1.d((byte) -95);
          stackOut_3_0 = (ve) param2;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (-1 == (128 & var4 ^ -1)) {
            stackOut_5_0 = (ve) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (ve) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_Cc = stackIn_6_1 != 0;
          stackOut_6_0 = (ve) param2;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if ((32 & var4) == 0) {
            stackOut_8_0 = (ve) (Object) stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = (ve) (Object) stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          L4: {
            stackIn_9_0.field_Ic = stackIn_9_1 != 0;
            stackOut_9_0 = (ve) param2;
            stackIn_12_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (!param2.field_Cc) {
              break L4;
            } else {
              stackOut_10_0 = (ve) (Object) stackIn_10_0;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (param2.field_rc >= param2.field_mc) {
                break L4;
              } else {
                stackOut_11_0 = (ve) (Object) stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L3;
              }
            }
          }
          stackOut_12_0 = (ve) (Object) stackIn_12_0;
          stackOut_12_1 = 0;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L3;
        }
        L5: {
          stackIn_13_0.field_gc = stackIn_13_1 != 0;
          stackOut_13_0 = (ve) param2;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if ((64 & var4) == -1) {
            stackOut_15_0 = (ve) (Object) stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L5;
          } else {
            stackOut_14_0 = (ve) (Object) stackIn_14_0;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L5;
          }
        }
        L6: {
          stackIn_16_0.field_lc = stackIn_16_1 != 0;
          stackOut_16_0 = (ve) param2;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (-1 == (var4 & 8)) {
            stackOut_18_0 = (ve) (Object) stackIn_18_0;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L6;
          } else {
            stackOut_17_0 = (ve) (Object) stackIn_17_0;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L6;
          }
        }
        L7: {
          stackIn_19_0.field_wc = stackIn_19_1 != 0;
          stackOut_19_0 = (ve) param2;
          stackIn_21_0 = stackOut_19_0;
          stackIn_20_0 = stackOut_19_0;
          if (0 != (16 & var4)) {
            stackOut_21_0 = (ve) (Object) stackIn_21_0;
            stackOut_21_1 = 2;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L7;
          } else {
            stackOut_20_0 = (ve) (Object) stackIn_20_0;
            stackOut_20_1 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L7;
          }
        }
        L8: {
          stackIn_22_0.field_qc = stackIn_22_1;
          if (0 == (4 & var4)) {
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L8;
          } else {
            stackOut_23_0 = 1;
            stackIn_25_0 = stackOut_23_0;
            break L8;
          }
        }
        L9: {
          var5 = stackIn_25_0;
          if ((var4 & 2) == 0) {
            stackOut_27_0 = 0;
            stackIn_28_0 = stackOut_27_0;
            break L9;
          } else {
            stackOut_26_0 = 1;
            stackIn_28_0 = stackOut_26_0;
            break L9;
          }
        }
        var6 = stackIn_28_0;
        param1.a(param2.field_kc, 0, (byte) 126, param2.field_kc.length);
        param2.field_Ub = param1.e(3);
        param2.field_tc = ik.a(4) - (long)param1.i(7553);
        if (var5 == 0) {
          param2.field_Nb = -1;
          if (param3 <= -41) {
            param2.field_Xb = param1.f((byte) -108);
            var7 = param1.field_n;
            param2.field_Vb = param1.c((byte) -38);
            if (var6 != 0) {
              param2.field_xc = new String[param2.field_rc];
              param1.field_n = var7;
              var8 = 0;
              L10: while (true) {
                if (param2.field_rc > var8) {
                  param2.field_xc[var8] = param1.c((byte) -38);
                  var8++;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              param2.field_xc = null;
              return;
            }
          } else {
            return;
          }
        } else {
          param2.field_Nb = param1.i(7553);
          if (param3 <= -41) {
            param2.field_Xb = param1.f((byte) -108);
            var7 = param1.field_n;
            param2.field_Vb = param1.c((byte) -38);
            if (var6 != 0) {
              param2.field_xc = new String[param2.field_rc];
              param1.field_n = var7;
              var8 = 0;
              L11: while (true) {
                if (param2.field_rc > var8) {
                  param2.field_xc[var8] = param1.c((byte) -38);
                  var8++;
                  continue L11;
                } else {
                  return;
                }
              }
            } else {
              param2.field_xc = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(uf param0, byte param1) {
        int var2 = 82 % ((-69 - param1) / 43);
        return param0.a(1, (byte) 53) == 1 ? true : false;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ik.field_f == null)) {
            pa.field_bb = 0;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ik.field_f != null) {
          pf.field_g = 0;
          ge.field_a = param0.getX();
          qa.field_t = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              nk.field_l = 2;
              pa.field_bb = 2;
              var2 = param0.getModifiers();
              if (0 != (4 & var2)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              ml.field_b = true;
              if ((var2 & 16) == 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var2 & 8) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
              return;
            }
          } else {
            L3: {
              nk.field_l = 1;
              pa.field_bb = 1;
              var2 = param0.getModifiers();
              if (0 != (4 & var2)) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ml.field_b = true;
              if ((var2 & 16) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 8) == 0) {
                break L5;
              } else {
                break L5;
              }
            }
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(ik.field_f == null)) {
            pf.field_g = 0;
            lc.field_f = param0.getX();
            te.field_r = param0.getY();
            ml.field_b = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (ik.field_f != null) {
            pf.field_g = 0;
            lc.field_f = -1;
            te.field_r = -1;
            ml.field_b = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Find opponents";
        field_a = new qm(11, 0, 1, 2);
    }
}
