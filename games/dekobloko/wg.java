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
        try {
            if (null != ik.field_f) {
                pf.field_g = 0;
                lc.field_f = param0.getX();
                te.field_r = param0.getY();
                ml.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wg.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_e = 126;
                    break L2;
                  }
                }
                stackIn_12_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if ((param1.charAt(var5) ^ -1) != (param2 ^ -1)) {
                    break L3;
                  } else {
                    var3_int++;
                    break L3;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("wg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
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
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ik.field_f) {
                L2: {
                  pf.field_g = 0;
                  pa.field_bb = 0;
                  ml.field_b = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int) == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 == (16 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (0 != (var2_int & 4)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("wg.mouseReleased(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ik.field_f != null) {
              pf.field_g = 0;
              lc.field_f = param0.getX();
              te.field_r = param0.getY();
              ml.field_b = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.mouseMoved(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(boolean param0, wl param1, ve param2, byte param3) {
        ve stackIn_6_0 = null;
        ve stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ve stackIn_9_0 = null;
        ve stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ve stackIn_13_0 = null;
        ve stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ve stackIn_16_0 = null;
        ve stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ve stackIn_19_0 = null;
        ve stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ve stackIn_22_0 = null;
        ve stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                param2.field_rc = param1.d((byte) -75);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param2.field_mc = param1.d((byte) -75);
              param2.field_Wb = param1.d((byte) -62);
              var4_int = param1.d((byte) -95);
              stackIn_6_0 = (ve) (param2);

              if (-1 == (128 & var4_int ^ -1)) {
                stackIn_7_0 = (ve) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (ve) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Cc = stackIn_7_1 != 0;
              stackIn_9_0 = (ve) (param2);

              if ((32 & var4_int) == 0) {
                stackIn_10_0 = (ve) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (ve) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_10_0.field_Ic = stackIn_10_1 != 0;
                stackIn_13_0 = (ve) (param2);

                if (!param2.field_Cc) {
                  break L5;
                } else {
                  stackIn_13_0 = (ve) ((Object) stackIn_13_0);

                  if (param2.field_rc >= param2.field_mc) {
                    break L5;
                  } else {
                    stackIn_14_0 = (ve) ((Object) stackIn_13_0);
                    stackIn_14_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_14_0 = (ve) ((Object) stackIn_13_0);
              stackIn_14_1 = 0;
              break L4;
            }
            L6: {
              stackIn_14_0.field_gc = stackIn_14_1 != 0;
              stackIn_16_0 = (ve) (param2);

              if ((64 & var4_int) == 0) {
                stackIn_17_0 = (ve) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L6;
              } else {
                stackIn_17_0 = (ve) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_17_0.field_lc = stackIn_17_1 != 0;
              stackIn_19_0 = (ve) (param2);

              if (-1 == (var4_int & 8 ^ -1)) {
                stackIn_20_0 = (ve) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = (ve) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_wc = stackIn_20_1 != 0;
              stackIn_22_0 = (ve) (param2);

              if (0 != (16 & var4_int)) {
                stackIn_23_0 = (ve) ((Object) stackIn_22_0);
                stackIn_23_1 = 2;
                break L8;
              } else {
                stackIn_23_0 = (ve) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_qc = stackIn_23_1;
              if (0 == (4 & var4_int)) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              if ((var4_int & 2) == 0) {
                stackIn_29_0 = 0;
                break L10;
              } else {
                stackIn_29_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_29_0;
              param1.a(param2.field_kc, 0, (byte) 126, param2.field_kc.length);
              param2.field_Ub = param1.e(3);
              param2.field_tc = ik.a(4) - (long)param1.i(7553);
              if (var5 == 0) {
                param2.field_Nb = -1;
                break L11;
              } else {
                param2.field_Nb = param1.i(7553);
                break L11;
              }
            }
            if (param3 <= -41) {
              param2.field_Xb = param1.f((byte) -108);
              var7 = param1.field_n;
              param2.field_Vb = param1.c((byte) -38);
              if (var6 != 0) {
                param2.field_xc = new String[param2.field_rc];
                param1.field_n = var7;
                var8 = 0;
                L12: while (true) {
                  if (param2.field_rc <= var8) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    param2.field_xc[var8] = param1.c((byte) -38);
                    var8++;
                    continue L12;
                  }
                }
              } else {
                param2.field_xc = null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("wg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(uf param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 82 % ((-69 - param1) / 43);
              if (param0.a(1, (byte) 53) != 1) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ik.field_f != null) {
              pa.field_bb = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ik.field_f == null) {
                break L1;
              } else {
                L2: {
                  pf.field_g = 0;
                  ge.field_a = param0.getX();
                  qa.field_t = param0.getY();
                  ik.a(4);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    nk.field_l = 2;
                    pa.field_bb = 2;
                    break L2;
                  } else {
                    nk.field_l = 1;
                    pa.field_bb = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if (0 != (4 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ml.field_b = true;
                  if ((var2_int & 16) == 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((var2_int & 8) == 0) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("wg.mousePressed(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ik.field_f != null) {
              pf.field_g = 0;
              lc.field_f = param0.getX();
              te.field_r = param0.getY();
              ml.field_b = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.mouseDragged(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.mouseClicked(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (ik.field_f != null) {
                pf.field_g = 0;
                lc.field_f = -1;
                te.field_r = -1;
                ml.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "wg.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Find opponents";
        field_a = new qm(11, 0, 1, 2);
    }
}
