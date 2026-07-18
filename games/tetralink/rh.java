/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ll {
    byte field_H;
    static String field_L;
    static oh field_M;
    int field_I;
    static hl field_N;
    static le field_F;
    static String field_J;
    static boolean[] field_G;
    bh field_K;

    final static mh b(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        mh var7 = null;
        int var8 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        mh stackIn_16_0 = null;
        mh stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_9_0 = null;
        mh stackOut_18_0 = null;
        mh stackOut_15_0 = null;
        mh stackOut_5_0 = null;
        mh stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int <= 255) {
                var3 = hi.a(param1, '.', 783);
                if (var3.length < 2) {
                  stackOut_9_0 = c.field_o;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_18_0 = rf.a(-1723, var3[-1 + var3.length]);
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = sd.a(30, var6);
                      if (var7 != null) {
                        stackOut_15_0 = (mh) var7;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackOut_5_0 = nb.field_V;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = c.field_o;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("rh.N(").append(2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(java.awt.Color param0, int param1, String param2, byte param3, boolean param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = uh.field_b.getGraphics();
                  if (null == gg.field_k) {
                    gg.field_k = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param4) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, n.field_M, d.field_h);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 != null) {
                    break L4;
                  } else {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (wm.field_p == null) {
                        wm.field_p = uh.field_b.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = wm.field_p.getGraphics();
                    var10.setColor(param0);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param1 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param1 * 3 + 2, 2, -(3 * param1) + 300, 30);
                    var10.setFont(gg.field_k);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(wm.field_p, n.field_M / 2 - 152, d.field_h / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + n.field_M / 2;
                    var8 = -18 + d.field_h / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, 2 + var8, param1 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, 1 + var8, 301, 31);
                    var9.fillRect(3 * param1 + 2 + var7, var8 + 2, -(param1 * 3) + 300, 30);
                    var9.setFont(gg.field_k);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, (304 - param2.length() * 6) / 2 + var7, var8 + 22);
                    break L7;
                  }
                }
                L8: {
                  if (null == sj.field_c) {
                    break L8;
                  } else {
                    var9.setFont(gg.field_k);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(sj.field_c, n.field_M / 2 - 6 * sj.field_c.length() / 2, d.field_h / 2 - 26);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                uh.field_b.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("rh.J(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 84 + ',' + param4 + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var2_int = ll.a(dd.field_c, (byte) -122, mb.field_z);
              if (param1 <= -34) {
                break L1;
              } else {
                field_N = null;
                break L1;
              }
            }
            L2: {
              if (var2_int == 1) {
                param0 = "<img=0>" + param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var2_int != 2) {
                break L3;
              } else {
                param0 = "<img=1>" + param0;
                break L3;
              }
            }
            stackOut_7_0 = (String) param0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("rh.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static byte a(char param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (0 < param0) {
          if (param0 >= 128) {
            if (param0 >= 160) {
              if (param0 > 255) {
                if (param0 != 8364) {
                  if (8218 == param0) {
                    var2 = -126;
                    return (byte) var2;
                  } else {
                    if (param0 == 402) {
                      var2 = -125;
                      return (byte) var2;
                    } else {
                      if (param0 == 8222) {
                        var2 = -124;
                        return (byte) var2;
                      } else {
                        if (param0 == 8230) {
                          var2 = -123;
                          return (byte) var2;
                        } else {
                          if (param0 == 8224) {
                            var2 = -122;
                            return (byte) var2;
                          } else {
                            if (param0 == 8225) {
                              var2 = -121;
                              return (byte) var2;
                            } else {
                              if (param0 == 710) {
                                var2 = -120;
                                return (byte) var2;
                              } else {
                                if (param0 == 8240) {
                                  var2 = -119;
                                  return (byte) var2;
                                } else {
                                  if (param0 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    L0: {
                                      if (param0 != 8249) {
                                        if (338 == param0) {
                                          var2 = -116;
                                          return (byte) var2;
                                        } else {
                                          if (param0 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (param0 == 8216) {
                                              var2 = -111;
                                              return (byte) var2;
                                            } else {
                                              if (param0 != 8217) {
                                                if (param0 != 8220) {
                                                  if (param0 != 8221) {
                                                    if (param0 == 8226) {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param0 == 8211) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param0 != 8212) {
                                                          if (param0 == 732) {
                                                            var2 = -104;
                                                            return (byte) var2;
                                                          } else {
                                                            if (8482 == param0) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (param0 != 353) {
                                                                if (param0 != 8250) {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param0 != 382) {
                                                                      if (param0 != 376) {
                                                                        var2 = 63;
                                                                        break L0;
                                                                      } else {
                                                                        var2 = -97;
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L0;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L0;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    }
                                    return (byte) var2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            } else {
              if (param0 != 8364) {
                if (8218 != param0) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 != 8224) {
                          if (param0 != 8225) {
                            if (param0 != 710) {
                              if (param0 != 8240) {
                                if (param0 != 352) {
                                  L1: {
                                    if (param0 != 8249) {
                                      if (338 != param0) {
                                        if (param0 == 381) {
                                          var2 = -114;
                                          return (byte) var2;
                                        } else {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            break L1;
                                          } else {
                                            if (param0 != 8217) {
                                              if (param0 != 8220) {
                                                if (param0 != 8221) {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    break L1;
                                                  } else {
                                                    if (param0 == 8211) {
                                                      var2 = -106;
                                                      break L1;
                                                    } else {
                                                      if (param0 != 8212) {
                                                        if (param0 == 732) {
                                                          var2 = -104;
                                                          break L1;
                                                        } else {
                                                          if (8482 == param0) {
                                                            var2 = -103;
                                                            break L1;
                                                          } else {
                                                            if (param0 != 353) {
                                                              if (param0 != 8250) {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  break L1;
                                                                } else {
                                                                  if (param0 != 382) {
                                                                    if (param0 != 376) {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    } else {
                                                                      var2 = -97;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        return (byte) var2;
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  }
                                  return (byte) var2;
                                } else {
                                  var2 = -118;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -119;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -120;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -121;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -122;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -124;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  return (byte) var2;
                }
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
          } else {
            var2 = (byte)param0;
            return (byte) var2;
          }
        } else {
          if (param0 >= 160) {
            if (param0 > 255) {
              if (param0 != 8364) {
                if (8218 != param0) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 == 8224) {
                          var2 = -122;
                          return (byte) var2;
                        } else {
                          L2: {
                            if (param0 == 8225) {
                              var2 = -121;
                              break L2;
                            } else {
                              if (param0 == 710) {
                                var2 = -120;
                                break L2;
                              } else {
                                if (param0 == 8240) {
                                  var2 = -119;
                                  break L2;
                                } else {
                                  if (param0 == 352) {
                                    var2 = -118;
                                    break L2;
                                  } else {
                                    if (param0 != 8249) {
                                      if (338 == param0) {
                                        var2 = -116;
                                        break L2;
                                      } else {
                                        if (param0 == 381) {
                                          var2 = -114;
                                          break L2;
                                        } else {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            break L2;
                                          } else {
                                            if (param0 != 8217) {
                                              if (param0 != 8220) {
                                                if (param0 != 8221) {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    break L2;
                                                  } else {
                                                    if (param0 == 8211) {
                                                      var2 = -106;
                                                      break L2;
                                                    } else {
                                                      if (param0 != 8212) {
                                                        if (param0 == 732) {
                                                          var2 = -104;
                                                          break L2;
                                                        } else {
                                                          if (8482 == param0) {
                                                            var2 = -103;
                                                            break L2;
                                                          } else {
                                                            if (param0 != 353) {
                                                              if (param0 != 8250) {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  break L2;
                                                                } else {
                                                                  if (param0 != 382) {
                                                                    if (param0 != 376) {
                                                                      var2 = 63;
                                                                      break L2;
                                                                    } else {
                                                                      var2 = -97;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return (byte) var2;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -124;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  return (byte) var2;
                }
              } else {
                var2 = -128;
                return (byte) var2;
              }
            } else {
              var2 = (byte)param0;
              return (byte) var2;
            }
          } else {
            if (param0 != 8364) {
              if (8218 != param0) {
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (param0 == 8224) {
                        var2 = -122;
                        return (byte) var2;
                      } else {
                        L3: {
                          if (param0 == 8225) {
                            var2 = -121;
                            break L3;
                          } else {
                            if (param0 == 710) {
                              var2 = -120;
                              break L3;
                            } else {
                              if (param0 == 8240) {
                                var2 = -119;
                                break L3;
                              } else {
                                if (param0 == 352) {
                                  var2 = -118;
                                  break L3;
                                } else {
                                  if (param0 != 8249) {
                                    if (338 == param0) {
                                      var2 = -116;
                                      break L3;
                                    } else {
                                      if (param0 == 381) {
                                        var2 = -114;
                                        break L3;
                                      } else {
                                        if (param0 == 8216) {
                                          var2 = -111;
                                          break L3;
                                        } else {
                                          if (param0 != 8217) {
                                            if (param0 != 8220) {
                                              if (param0 != 8221) {
                                                if (param0 == 8226) {
                                                  var2 = -107;
                                                  break L3;
                                                } else {
                                                  if (param0 == 8211) {
                                                    var2 = -106;
                                                    break L3;
                                                  } else {
                                                    if (param0 != 8212) {
                                                      if (param0 == 732) {
                                                        var2 = -104;
                                                        break L3;
                                                      } else {
                                                        if (8482 == param0) {
                                                          var2 = -103;
                                                          break L3;
                                                        } else {
                                                          if (param0 != 353) {
                                                            if (param0 != 8250) {
                                                              if (param0 == 339) {
                                                                var2 = -100;
                                                                break L3;
                                                              } else {
                                                                if (param0 != 382) {
                                                                  if (param0 != 376) {
                                                                    var2 = 63;
                                                                    break L3;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L3;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return (byte) var2;
                      }
                    } else {
                      var2 = -123;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -124;
                    return (byte) var2;
                  }
                } else {
                  var2 = -125;
                  return (byte) var2;
                }
              } else {
                var2 = -126;
                return (byte) var2;
              }
            } else {
              var2 = -128;
              return (byte) var2;
            }
          }
        }
    }

    public static void g(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        int var1 = 91;
        field_F = null;
        field_L = null;
        field_G = null;
    }

    final static String a(int param0, bh param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          try {
            L0: {
              var3_int = param1.f((byte) 110);
              if (var3_int <= 80) {
                break L0;
              } else {
                var3_int = 80;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param1.field_t = param1.field_t + ck.field_Z.a(param1.field_u, 0, param1.field_t, var3_int, false, var4);
            var5 = cl.a(-1095, var3_int, var4, 0);
            stackOut_3_0 = (String) var5;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_5_0 = "Cabbage";
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("rh.M(").append(119).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 80 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((rh) this).field_I = -36;
            if (!(null != ((rh) this).field_K)) {
                return 0;
            }
            return 100 * ((rh) this).field_K.field_t / (((rh) this).field_K.field_u.length + -((rh) this).field_H);
        }
        if (!(null != ((rh) this).field_K)) {
            return 0;
        }
        return 100 * ((rh) this).field_K.field_t / (((rh) this).field_K.field_u.length + -((rh) this).field_H);
    }

    final byte[] c(boolean param0) {
        if (!((rh) this).field_v) {
          if (((rh) this).field_K.field_t >= ((rh) this).field_K.field_u.length - ((rh) this).field_H) {
            if (!param0) {
              return null;
            } else {
              return ((rh) this).field_K.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    rh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Waiting for textures";
        field_J = "Please remove <%0> from your ignore list first.";
    }
}
