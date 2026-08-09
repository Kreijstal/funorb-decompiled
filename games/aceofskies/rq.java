/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
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
          L0: {
            L1: {
              var9 = nm.field_c;
              if (param0 > 15) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = var9.g(-112);
              if (var2 != 0) {
                if ((var2 ^ -1) != -2) {
                  v.a("A1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                  te.b(true);
                  break L2;
                } else {
                  var3 = var9.a((byte) 117);
                  var4 = (ds) ((Object) cl.field_eb.d(268435455));
                  L3: while (true) {
                    L4: {
                      if (var4 == null) {
                        break L4;
                      } else {
                        if (var4.field_g == var3) {
                          break L4;
                        } else {
                          var4 = (ds) ((Object) cl.field_eb.b((byte) 103));
                          continue L3;
                        }
                      }
                    }
                    if (var4 == null) {
                      te.b(true);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var4.c(-127);
                      break L2;
                    }
                  }
                }
              } else {
                var3_ref_te = (te) ((Object) ep.field_z.d(268435455));
                if (var3_ref_te == null) {
                  te.b(true);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    var4_int = var9.g(-79);
                    if (var4_int != 0) {
                      var13 = new byte[var4_int];
                      var9.a(0, 7186, var4_int, var13);
                      break L5;
                    } else {
                      var5 = null;
                      break L5;
                    }
                  }
                  var9.field_g = var9.field_g + 4;
                  if (var9.e(6103)) {
                    var3_ref_te.c(-124);
                    break L2;
                  } else {
                    te.b(true);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "rq.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ho.field_b) {
                break L1;
              } else {
                oj.field_g = 0;
                sj.field_a = -1;
                qd.field_m = -1;
                si.field_b = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rq.mouseExited(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(float[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param5 ^ -1) >= -1) {
                break L1;
              } else {
                if (mg.a(param5, (byte) 127)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param6 <= (param3 ^ -1)) {
                break L2;
              } else {
                if (mg.a(param3, (byte) 21)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              var7_int = rl.a(param6 + 5, param4);
              var8 = 0;
              if (param5 >= param3) {
                stackIn_10_0 = param3;
                break L3;
              } else {
                stackIn_10_0 = param5;
                break L3;
              }
            }
            var9 = stackIn_10_0;
            var10 = param5 >> 1393860097;
            var11 = param3 >> -291001311;
            var12 = param0;
            var13 = new float[var7_int * var11 * var10];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Df(param1, var8, param2, param5, param3, 0, param4, 5126, var12, 0);
              if ((var9 ^ -1) < -2) {
                var16 = var7_int * param5;
                var14 = var13;
                var17 = 0;
                L5: while (true) {
                  if (var17 >= var7_int) {
                    var13 = var12;
                    param5 = var10;
                    var12 = var14;
                    param3 = var11;
                    var11 = var11 >> 1;
                    var9 = var9 >> 1;
                    var10 = var10 >> 1;
                    var8++;
                    continue L4;
                  } else {
                    var18 = var17;
                    var19 = var17;
                    var20 = var19 - -var16;
                    var21 = 0;
                    L6: while (true) {
                      if (var11 <= var21) {
                        var17++;
                        continue L5;
                      } else {
                        var22 = 0;
                        L7: while (true) {
                          if (var10 <= var22) {
                            var19 = var19 + var16;
                            var20 = var20 + var16;
                            var21++;
                            continue L6;
                          } else {
                            var15 = param0[var19];
                            var19 = var19 + var7_int;
                            var15 = var15 + param0[var19];
                            var15 = var15 + param0[var20];
                            var19 = var19 + var7_int;
                            var20 = var20 + var7_int;
                            var15 = var15 + param0[var20];
                            var13[var18] = 0.25f * var15;
                            var20 = var20 + var7_int;
                            var18 = var18 + var7_int;
                            var22++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("rq.C(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == ho.field_b) {
                break L1;
              } else {
                L2: {
                  oj.field_g = 0;
                  mp.field_g = 0;
                  si.field_b = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int) != 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (4 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if ((16 & var2_int) != 0) {
                  break L1;
                } else {
                  break L1;
                }
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("rq.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (ho.field_b != null) {
                L2: {
                  oj.field_g = 0;
                  kg.field_a = param0.getX();
                  jd.field_e = param0.getY();
                  kh.a(-125);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    me.field_b = 2;
                    mp.field_g = 2;
                    break L2;
                  } else {
                    me.field_b = 1;
                    mp.field_g = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if ((var2_int & 8) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  si.field_b = true;
                  if (-1 != (4 & var2_int ^ -1)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 != (var2_int & 16)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (!param0.isPopupTrigger()) {
                break L5;
              } else {
                param0.consume();
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("rq.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!gm.field_x.a(false)) {
                break L1;
              } else {
                if (param1.equals(gm.field_x.b(2))) {
                  break L1;
                } else {
                  gm.field_x = od.a(param1, 60);
                  break L1;
                }
              }
            }
            var2_int = 98 / ((param0 - -53) / 49);
            stackIn_4_0 = gm.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != ho.field_b) {
                mp.field_g = 0;
                break L1;
              } else {
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

            stackIn_6_1 = new StringBuilder().append("rq.focusLost(");

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (ho.field_b != null) {
                oj.field_g = 0;
                sj.field_a = param0.getX();
                qd.field_m = param0.getY();
                si.field_b = true;
                break L1;
              } else {
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

            stackIn_6_1 = new StringBuilder().append("rq.mouseMoved(");

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ho.field_b == null) {
                break L1;
              } else {
                oj.field_g = 0;
                sj.field_a = param0.getX();
                qd.field_m = param0.getY();
                si.field_b = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rq.mouseEntered(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ho.field_b == null) {
                break L1;
              } else {
                oj.field_g = 0;
                sj.field_a = param0.getX();
                qd.field_m = param0.getY();
                si.field_b = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rq.mouseDragged(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L1;
              } else {
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

            stackIn_6_1 = new StringBuilder().append("rq.mouseClicked(");

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_a = "Waiting for music";
    }
}
