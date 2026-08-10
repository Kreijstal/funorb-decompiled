/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static gf field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hh.field_M == null) {
                break L1;
              } else {
                uc.field_eb = 0;
                cj.field_i = param0.getX();
                ij.field_h = param0.getY();
                ql.field_K = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("da.mouseDragged(");

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != hh.field_M) {
                L2: {
                  uc.field_eb = 0;
                  bb.field_I = 0;
                  ql.field_K = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 16) != 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 == (var2_int & 4)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (8 & var2_int ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("da.mouseReleased(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        boolean stackIn_13_0 = false;
        int stackIn_29_0 = 0;
        boolean stackIn_33_0 = false;
        String stackIn_49_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_b = 126;
                break L1;
              }
            }
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                var5 = var6_int + 2;
                L3: while (true) {
                  L4: {
                    if (var3_int <= var5) {
                      break L4;
                    } else {
                      stackIn_13_0 = ne.a((byte) 115, param1.charAt(var5));
                      if (!stackIn_13_0) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (bc.a(param2, (CharSequence) ((Object) var7_ref_String))) {
                    L5: {
                      if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        break L5;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          break L5;
                        } else {
                          var5++;
                          var8 = si.a((byte) 120, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (args[var8].length() + var6_int + -var5);
                          break L5;
                        }
                      }
                    }
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L6: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackIn_29_0 = 0;
                  L7: while (true) {
                    if (stackIn_29_0 > var8) {
                      discarded$0 = var6.append(param1.substring(var7));
                      stackIn_49_0 = var6.toString();
                      break L0;
                    } else {
                      var5 = 2 + var8;
                      L8: while (true) {
                        L9: {
                          if (var3_int <= var5) {
                            break L9;
                          } else {
                            stackOut_32_0 = ne.a((byte) 85, param1.charAt(var5));
                            stackIn_29_0 = stackOut_32_0 ? 1 : 0;
                            stackIn_33_0 = stackOut_32_0;
                            if (!stackIn_33_0) {
                              break L9;
                            } else {
                              var5++;
                              continue L8;
                            }
                          }
                        }
                        var9 = param1.substring(var8 - -2, var5);
                        if (!bc.a(param2, (CharSequence) ((Object) var9))) {
                          continue L6;
                        } else {
                          L10: {
                            if (var3_int <= var5) {
                              break L10;
                            } else {
                              if (param1.charAt(var5) == 62) {
                                var5++;
                                var10 = si.a((byte) 114, (CharSequence) ((Object) var9));
                                discarded$1 = var6.append(param1.substring(var7, var8));
                                discarded$2 = var6.append(args[var10]);
                                var7 = var5;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                          continue L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var3);

            stackIn_53_1 = new StringBuilder().append("da.B(");

            if (args == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L11;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L12;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_54_0), stackIn_58_2 + ',' + param2 + ')');
        }
        return stackIn_49_0;
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (hh.field_M != null) {
                uc.field_eb = 0;
                cj.field_i = -1;
                ij.field_h = -1;
                ql.field_K = true;
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
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("da.mouseExited(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (hh.field_M != null) {
                uc.field_eb = 0;
                cj.field_i = param0.getX();
                ij.field_h = param0.getY();
                ql.field_K = true;
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
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("da.mouseEntered(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hh.field_M == null) {
                break L1;
              } else {
                bb.field_I = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("da.focusLost(");

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hh.field_M == null) {
                break L1;
              } else {
                uc.field_eb = 0;
                cj.field_i = param0.getX();
                ij.field_h = param0.getY();
                ql.field_K = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("da.mouseMoved(");

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("da.mouseClicked(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (hh.field_M != null) {
                L2: {
                  uc.field_eb = 0;
                  qb.field_j = param0.getX();
                  gk.field_b = param0.getY();
                  rf.c(0);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    lj.field_a = 2;
                    bb.field_I = 2;
                    break L2;
                  } else {
                    lj.field_a = 1;
                    bb.field_I = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if ((4 & var2_int) != 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 != (var2_int & 16)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ql.field_K = true;
                if (0 == (var2_int & 8)) {
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
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("da.mousePressed(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 121) {
                break L1;
              } else {
                da.a((String[]) null, (String) null, false);
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "da.A(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, boolean param4, pk param5, byte param6) {
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 631314402;
            var22 = param2[4] >> 1174718210;
            var23 = param2[5] >> -353742974;
            var24 = param2[6] >> 1485445762;
            var25 = param2[7] >> 1732300098;
            var26 = param2[8] >> 1978565282;
            var27 = param2[9] >> 1269123074;
            var28 = param2[10] >> 1060400162;
            var12 = param0[5] * var23 + param0[3] * var21 - -(var22 * param0[4]) >> -1265042738;
            var13 = param0[5] * var26 + (var24 * param0[3] - -(param0[4] * var25)) >> 676273486;
            var29 = param2[11] >> 1158989186;
            var18 = param0[10] * var22 + (var21 * param0[9] + var23 * param0[11]) >> -927048786;
            var15 = var21 * param0[6] - (-(param0[7] * var22) + -(var23 * param0[8])) >> -709809074;
            var19 = param0[11] * var26 + (var25 * param0[10] + var24 * param0[9]) >> -1875287474;
            var20 = param0[11] * var29 + var27 * param0[9] - -(var28 * param0[10]) >> -1193231826;
            var14 = param0[4] * var28 + (var27 * param0[3] - -(var29 * param0[5])) >> -82753682;
            var17 = param0[7] * var28 + var27 * param0[6] - -(var29 * param0[8]) >> 540016622;
            var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> -763133682;
            if (param6 <= -19) {
              var21 = param0[0] + -param2[0];
              var22 = -param2[1] + param0[1];
              var23 = -param2[2] + param0[2];
              var9 = var23 * param2[5] + (param2[4] * var22 + var21 * param2[3]) >> 16 - sb.field_d;
              var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> 16 - sb.field_d;
              var11 = var21 * param2[9] - (-(var22 * param2[10]) - var23 * param2[11]) >> -129962160;
              var21 = k.field_g;
              var22 = k.field_a;
              var23 = 0;
              L1: while (true) {
                L2: {
                  if (var23 >= param5.field_w) {
                    L3: {
                      if (param5.field_y == null) {
                        break L3;
                      } else {
                        if (null == param5.field_i) {
                          break L3;
                        } else {
                          if (null == param5.field_p) {
                            break L3;
                          } else {
                            if (null == param5.field_o) {
                              break L3;
                            } else {
                              if (param5.field_l == null) {
                                break L3;
                              } else {
                                if (param5.field_u == null) {
                                  break L3;
                                } else {
                                  if (null == param5.field_C) {
                                    break L3;
                                  } else {
                                    if (param5.field_r == null) {
                                      break L3;
                                    } else {
                                      if (param5.field_t == null) {
                                        break L3;
                                      } else {
                                        var23 = 0;
                                        L4: while (true) {
                                          if (var23 >= param5.field_H) {
                                            break L3;
                                          } else {
                                            var24 = param5.field_y[var23];
                                            var25 = param5.field_i[var23];
                                            var26 = param5.field_p[var23];
                                            pl.field_c[var23] = (var24 * var12 + var25 * var15 + var18 * var26 >> 338426832) + var9;
                                            bd.field_k[var23] = var10 + (var24 * var13 + var25 * var16 - -(var19 * var26) >> 58004880);
                                            wg.field_j[var23] = (var17 * var25 + var14 * var24 + var26 * var20 >> 513904848) + var11;
                                            var24 = param5.field_o[var23];
                                            var25 = param5.field_l[var23];
                                            var26 = param5.field_u[var23];
                                            vg.field_c[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> -1400215088);
                                            kd.field_b[var23] = (var13 * var24 + (var16 * var25 + var19 * var26) >> -670513040) + var10;
                                            pf.field_k[var23] = (var24 * var14 - -(var25 * var17) + var26 * var20 >> -153227440) + var11;
                                            var24 = param5.field_C[var23];
                                            var25 = param5.field_r[var23];
                                            var26 = param5.field_t[var23];
                                            kd.field_g[var23] = var9 - -(var24 * var12 - -(var25 * var15) - -(var26 * var18) >> -1270708112);
                                            kc.field_l[var23] = (var19 * var26 + (var25 * var16 + var24 * var13) >> 1009640048) + var10;
                                            ee.field_f[var23] = var11 - -(var25 * var17 + (var14 * var24 - -(var26 * var20)) >> -329583728);
                                            var23++;
                                            continue L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1) {
                      var9 = param0[3];
                      var10 = param0[4];
                      var11 = param0[5];
                      var12 = param0[6];
                      var13 = param0[7];
                      var14 = param0[8];
                      var15 = param0[9];
                      var16 = param0[10];
                      var17 = param0[11];
                      var18 = 0;
                      L5: while (true) {
                        stackIn_58_0 = param5.field_A;
                        stackIn_58_1 = var18;
                        if (stackIn_58_0 <= stackIn_58_1) {
                          break L2;
                        } else {
                          stackIn_61_0 = var18 ^ -1;
                          if (stackIn_61_0 <= (qf.field_q.length ^ -1)) {
                            break L2;
                          } else {
                            var19 = param5.field_z[var18];
                            var20 = param5.field_b[var18];
                            var21 = param5.field_c[var18];
                            qf.field_q[var18] = var21 * var15 + (var9 * var19 + var12 * var20) >> 241827920;
                            ee.field_b[var18] = var21 * var16 + (var10 * var19 + var20 * var13) >> 312680464;
                            wh.field_e[var18] = var21 * var17 + (var19 * var11 - -(var14 * var20)) >> 995475600;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    var24 = param5.field_h[var23];
                    var25 = param5.field_I[var23];
                    var26 = param5.field_g[var23];
                    var27 = (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -sb.field_d + 16) + var9;
                    var28 = (var19 * var26 + (var13 * var24 + var16 * var25) >> -sb.field_d + 16) + var10;
                    var29 = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 318819856);
                    stackIn_58_0 = 50;

                    stackIn_58_1 = var29;

                    L7: {
                      if (stackIn_58_0 > stackIn_58_1) {
                        qd.field_a[var23] = -2147483648;
                        break L7;
                      } else {
                        L8: {
                          ej.field_c[var23] = var27 / var29 + var21;
                          fk.field_d[var23] = var22 + var28 / var29;
                          if ((var29 ^ -1) < (var8 ^ -1)) {
                            var8 = var29;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        qd.field_a[var23] = var29;
                        if (var7_int <= var29) {
                          break L7;
                        } else {
                          var7_int = var29;
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (!param3) {
                        break L9;
                      } else {
                        pd.field_l[var23] = var27 >> sb.field_d;
                        cl.field_U[var23] = var28 >> sb.field_d;
                        pc.field_n[var23] = var29;
                        break L9;
                      }
                    }
                    var23++;
                    continue L1;
                  }
                }
                he.a(var8, param5, 109, var7_int, param4);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("da.C(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L10;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L11;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L12;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_71_0), stackIn_79_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = null;
    }
}
