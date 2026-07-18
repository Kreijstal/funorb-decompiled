/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static gf field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("da.mouseDragged(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                if ((8 & var2_int) != 0) {
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
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("da.mouseReleased(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static String a(String[] args, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_13_0 = false;
        String stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        String stackOut_46_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = var6_int + 2;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      stackOut_11_0 = ne.a((byte) 115, param1.charAt(var5));
                      stackIn_13_0 = stackOut_11_0;
                      if (!stackIn_13_0) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (bc.a(false, (CharSequence) (Object) var7_ref_String)) {
                    L4: {
                      if (~var3_int >= ~var5) {
                        break L4;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          break L4;
                        } else {
                          var5++;
                          var8 = si.a((byte) 120, (CharSequence) (Object) var7_ref_String);
                          var4 = var4 + (args[var8].length() + var6_int + -var5);
                          break L4;
                        }
                      }
                    }
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 > var8) {
                    StringBuilder discarded$3 = var6.append(param1.substring(var7));
                    stackOut_46_0 = var6.toString();
                    stackIn_47_0 = stackOut_46_0;
                    break L0;
                  } else {
                    var5 = 2 + var8;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!ne.a((byte) 85, param1.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(var8 - -2, var5);
                      if (!bc.a(false, (CharSequence) (Object) var9)) {
                        continue L5;
                      } else {
                        L8: {
                          if (var3_int <= var5) {
                            break L8;
                          } else {
                            if (param1.charAt(var5) == 62) {
                              var5++;
                              var10 = si.a((byte) 114, (CharSequence) (Object) var9);
                              StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                              StringBuilder discarded$5 = var6.append(args[var10]);
                              var7 = var5;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var3;
            stackOut_48_1 = new StringBuilder().append("da.B(");
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (args == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L9;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L9;
            }
          }
          L10: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L10;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L10;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + false + ')');
        }
        return stackIn_47_0;
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("da.mouseExited(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("da.mouseEntered(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("da.focusLost(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("da.mouseMoved(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("da.mouseClicked(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (hh.field_M != null) {
                L2: {
                  uc.field_eb = 0;
                  qb.field_j = param0.getX();
                  gk.field_b = param0.getY();
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
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("da.mousePressed(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "da.A(" + 123 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, boolean param4, pk param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_59_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_57_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var30 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 2;
            var22 = param2[4] >> 2;
            var23 = param2[5] >> 2;
            var24 = param2[6] >> 2;
            var25 = param2[7] >> 2;
            var26 = param2[8] >> 2;
            var27 = param2[9] >> 2;
            var28 = param2[10] >> 2;
            var12 = param0[5] * var23 + param0[3] * var21 - -(var22 * param0[4]) >> 14;
            var13 = param0[5] * var26 + (var24 * param0[3] - -(param0[4] * var25)) >> 14;
            var29 = param2[11] >> 2;
            var18 = param0[10] * var22 + (var21 * param0[9] + var23 * param0[11]) >> 14;
            var15 = var21 * param0[6] - (-(param0[7] * var22) + -(var23 * param0[8])) >> 14;
            var19 = param0[11] * var26 + (var25 * param0[10] + var24 * param0[9]) >> 14;
            var20 = param0[11] * var29 + var27 * param0[9] - -(var28 * param0[10]) >> 14;
            var14 = param0[4] * var28 + (var27 * param0[3] - -(var29 * param0[5])) >> 14;
            var17 = param0[7] * var28 + var27 * param0[6] - -(var29 * param0[8]) >> 14;
            var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> 14;
            var21 = param0[0] + -param2[0];
            var22 = -param2[1] + param0[1];
            var23 = -param2[2] + param0[2];
            var9 = var23 * param2[5] + (param2[4] * var22 + var21 * param2[3]) >> 16 - sb.field_d;
            var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> 16 - sb.field_d;
            var11 = var21 * param2[9] - (-(var22 * param2[10]) - var23 * param2[11]) >> 16;
            var21 = k.field_g;
            var22 = k.field_a;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param5.field_w) {
                L2: {
                  if (param5.field_y == null) {
                    break L2;
                  } else {
                    if (null == param5.field_i) {
                      break L2;
                    } else {
                      if (null == param5.field_p) {
                        break L2;
                      } else {
                        if (null == param5.field_o) {
                          break L2;
                        } else {
                          if (param5.field_l == null) {
                            break L2;
                          } else {
                            if (param5.field_u == null) {
                              break L2;
                            } else {
                              if (null == param5.field_C) {
                                break L2;
                              } else {
                                if (param5.field_r == null) {
                                  break L2;
                                } else {
                                  if (param5.field_t == null) {
                                    break L2;
                                  } else {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (var23 >= param5.field_H) {
                                        break L2;
                                      } else {
                                        var24 = param5.field_y[var23];
                                        var25 = param5.field_i[var23];
                                        var26 = param5.field_p[var23];
                                        pl.field_c[var23] = (var24 * var12 + var25 * var15 + var18 * var26 >> 16) + var9;
                                        bd.field_k[var23] = var10 + (var24 * var13 + var25 * var16 - -(var19 * var26) >> 16);
                                        wg.field_j[var23] = (var17 * var25 + var14 * var24 + var26 * var20 >> 16) + var11;
                                        var24 = param5.field_o[var23];
                                        var25 = param5.field_l[var23];
                                        var26 = param5.field_u[var23];
                                        vg.field_c[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> 16);
                                        kd.field_b[var23] = (var13 * var24 + (var16 * var25 + var19 * var26) >> 16) + var10;
                                        pf.field_k[var23] = (var24 * var14 - -(var25 * var17) + var26 * var20 >> 16) + var11;
                                        var24 = param5.field_C[var23];
                                        var25 = param5.field_r[var23];
                                        var26 = param5.field_t[var23];
                                        kd.field_g[var23] = var9 - -(var24 * var12 - -(var25 * var15) - -(var26 * var18) >> 16);
                                        kc.field_l[var23] = (var19 * var26 + (var25 * var16 + var24 * var13) >> 16) + var10;
                                        ee.field_f[var23] = var11 - -(var25 * var17 + (var14 * var24 - -(var26 * var20)) >> 16);
                                        var23++;
                                        continue L3;
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
                L4: while (true) {
                  L5: {
                    if (param5.field_A <= var18) {
                      break L5;
                    } else {
                      stackOut_57_0 = ~var18;
                      stackIn_59_0 = stackOut_57_0;
                      if (stackIn_59_0 <= ~qf.field_q.length) {
                        break L5;
                      } else {
                        var19 = param5.field_z[var18];
                        var20 = param5.field_b[var18];
                        var21 = param5.field_c[var18];
                        qf.field_q[var18] = var21 * var15 + (var9 * var19 + var12 * var20) >> 16;
                        ee.field_b[var18] = var21 * var16 + (var10 * var19 + var20 * var13) >> 16;
                        wh.field_e[var18] = var21 * var17 + (var19 * var11 - -(var14 * var20)) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  int discarded$1 = 0;
                  he.a(var8, param5, 109, var7_int);
                  break L0;
                }
              } else {
                L6: {
                  var24 = param5.field_h[var23];
                  var25 = param5.field_I[var23];
                  var26 = param5.field_g[var23];
                  var27 = (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -sb.field_d + 16) + var9;
                  var28 = (var19 * var26 + (var13 * var24 + var16 * var25) >> -sb.field_d + 16) + var10;
                  var29 = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 16);
                  if (50 > var29) {
                    qd.field_a[var23] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      ej.field_c[var23] = var27 / var29 + var21;
                      fk.field_d[var23] = var22 + var28 / var29;
                      if (~var29 < ~var8) {
                        var8 = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    qd.field_a[var23] = var29;
                    if (var7_int <= var29) {
                      break L6;
                    } else {
                      var7_int = var29;
                      break L6;
                    }
                  }
                }
                var23++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("da.C(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L8;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L8;
            }
          }
          L9: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(true).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L9;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L9;
            }
          }
          L10: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(false).append(',').append(false).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L10;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L10;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + -58 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
