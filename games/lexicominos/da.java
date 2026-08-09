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
        int stackIn_6_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_36_0 = false;
        String stackIn_54_0 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        boolean stackOut_35_0;
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
              stackIn_6_0 = var6_int ^ -1;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if (stackIn_6_0 <= -1) {
                        break L6;
                      } else {
                        if (var11 != 0) {
                          break L5;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var5 = var6_int + 2;
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      if (var3_int <= var5) {
                        break L8;
                      } else {
                        stackOut_13_0 = ne.a((byte) 115, param1.charAt(var5));
                        stackIn_6_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var11 != 0) {
                          continue L3;
                        } else {

                          if (!stackIn_14_0) {
                            break L8;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var7_ref_String = param1.substring(var6_int - -2, var5);
                      if (bc.a(param2, (CharSequence) ((Object) var7_ref_String))) {
                        break L9;
                      } else {
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        break L10;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          break L10;
                        } else {
                          var5++;
                          var8 = si.a((byte) 120, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (args[var8].length() + var6_int + -var5);
                          break L10;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L11: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackIn_32_0 = 0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (stackIn_32_0 > var8) {
                          break L14;
                        } else {
                          var5 = 2 + var8;
                          L15: while (true) {
                            L16: {
                              if (var3_int <= var5) {
                                break L16;
                              } else {
                                stackOut_35_0 = ne.a((byte) 85, param1.charAt(var5));
                                stackIn_32_0 = stackOut_35_0 ? 1 : 0;
                                stackIn_36_0 = stackOut_35_0;
                                if (var11 != 0) {
                                  continue L12;
                                } else {
                                  if (!stackIn_36_0) {
                                    break L16;
                                  } else {
                                    var5++;
                                    if (var11 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            var9 = param1.substring(var8 - -2, var5);
                            if (!bc.a(param2, (CharSequence) ((Object) var9))) {
                              continue L11;
                            } else {
                              if (var11 != 0) {
                                break L13;
                              } else {
                                L17: {
                                  if (var3_int <= var5) {
                                    break L17;
                                  } else {
                                    if (param1.charAt(var5) == 62) {
                                      var5++;
                                      var10 = si.a((byte) 114, (CharSequence) ((Object) var9));
                                      discarded$0 = var6.append(param1.substring(var7, var8));
                                      discarded$1 = var6.append(args[var10]);
                                      var7 = var5;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  continue L11;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                      }
                      discarded$2 = var6.append(param1.substring(var7));
                      break L13;
                    }
                    stackIn_54_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var3);

            stackIn_58_1 = new StringBuilder().append("da.B(");

            if (args == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L18;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');

            if (param1 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L19;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L19;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_59_0), stackIn_63_2 + ',' + param2 + ')');
        }
        return stackIn_54_0;
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
                  L3: {
                    uc.field_eb = 0;
                    qb.field_j = param0.getX();
                    gk.field_b = param0.getY();
                    rf.c(0);
                    if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                      break L3;
                    } else {
                      lj.field_a = 1;
                      bb.field_I = 1;
                      if (!Lexicominos.field_L) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  lj.field_a = 2;
                  bb.field_I = 2;
                  break L2;
                }
                L4: {
                  var2_int = param0.getModifiers();
                  if ((4 & var2_int) != 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (0 != (var2_int & 16)) {
                    break L5;
                  } else {
                    break L5;
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
            L6: {
              if (!param0.isPopupTrigger()) {
                break L6;
              } else {
                param0.consume();
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("da.mousePressed(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var21 = param0[0] + -param2[0];
                        var22 = -param2[1] + param0[1];
                        var23 = -param2[2] + param0[2];
                        var9 = var23 * param2[5] + (param2[4] * var22 + var21 * param2[3]) >> 16 - sb.field_d;
                        var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> 16 - sb.field_d;
                        var11 = var21 * param2[9] - (-(var22 * param2[10]) - var23 * param2[11]) >> -129962160;
                        var21 = k.field_g;
                        var22 = k.field_a;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var23 >= param5.field_w) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = param5.field_h[var23];
                        var25 = param5.field_I[var23];
                        var26 = param5.field_g[var23];
                        var27 = (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -sb.field_d + 16) + var9;
                        var28 = (var19 * var26 + (var13 * var24 + var16 * var25) >> -sb.field_d + 16) + var10;
                        var29 = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 318819856);
                        stackIn_60_0 = 50;
                        stackIn_6_0 = stackIn_60_0;
                        stackIn_60_1 = var29;
                        stackIn_6_1 = stackIn_60_1;
                        if (var30 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 > stackIn_6_1) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ej.field_c[var23] = var27 / var29 + var21;
                        fk.field_d[var23] = var22 + var28 / var29;
                        if ((var29 ^ -1) < (var8 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = var29;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        qd.field_a[var23] = var29;
                        if (var7_int <= var29) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7_int = var29;
                        if (var30 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        qd.field_a[var23] = -2147483648;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param3) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        pd.field_l[var23] = var27 >> sb.field_d;
                        cl.field_U[var23] = var28 >> sb.field_d;
                        pc.field_n[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param5.field_y == null) {
                            statePc = 54;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param5.field_i) {
                            statePc = 54;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param5.field_p) {
                            statePc = 54;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == param5.field_o) {
                            statePc = 54;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param5.field_l == null) {
                            statePc = 54;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param5.field_u == null) {
                            statePc = 54;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == param5.field_C) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param5.field_r == null) {
                            statePc = 54;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param5.field_t == null) {
                            statePc = 54;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var23 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var23 >= param5.field_H) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
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
                        if (var30 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var30 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (param1) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9 = param0[3];
                        var10 = param0[4];
                        var11 = param0[5];
                        var12 = param0[6];
                        var13 = param0[7];
                        var14 = param0[8];
                        var15 = param0[9];
                        var16 = param0[10];
                        var17 = param0[11];
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var18 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = param5.field_A;
                        stackIn_60_1 = var18;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 <= stackIn_60_1) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_69_0 = var18 ^ -1;
                        stackIn_62_0 = stackIn_69_0;
                        if (var30 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_64_0 = stackIn_62_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 <= (qf.field_q.length ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var19 = param5.field_z[var18];
                        var20 = param5.field_b[var18];
                        var21 = param5.field_c[var18];
                        qf.field_q[var18] = var21 * var15 + (var9 * var19 + var12 * var20) >> 241827920;
                        ee.field_b[var18] = var21 * var16 + (var10 * var19 + var20 * var13) >> 312680464;
                        wh.field_e[var18] = var21 * var17 + (var19 * var11 - -(var14 * var20)) >> 995475600;
                        var18++;
                        if (var30 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var8;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        he.a(stackIn_69_0, param5, 109, var7_int, param4);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var7);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("da.C(");
                    stackIn_72_1 = stackIn_74_1;
                    if (param0 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param1).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param2 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_82_0;
                    stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_80_1 = stackIn_82_1;
                    if (param5 == null) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    throw ld.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param6 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = null;
    }
}
