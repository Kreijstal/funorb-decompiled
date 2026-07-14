/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ug {
    static int[] field_e;
    static le[] field_i;
    static ai field_k;
    int field_g;
    static int field_h;
    int field_j;
    static fc field_f;

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = MonkeyPuzzle2.field_F ? 1 : 0;
              if (param1 <= 0) {
                break L2;
              } else {
                if (param1 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 <= 255) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (param1 != 8364) {
              if (param1 != 8218) {
                if (param1 == 402) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param1 == 8222) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param1 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (8240 != param1) {
                              if (param1 != 352) {
                                if (param1 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (338 != param1) {
                                    if (381 != param1) {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param1 == 8226) {
                                                var2 = -107;
                                                break L0;
                                              } else {
                                                if (8211 == param1) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (param1 == 8212) {
                                                    var2 = -105;
                                                    break L0;
                                                  } else {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L0;
                                                      } else {
                                                        if (param1 != 353) {
                                                          if (param1 != 8250) {
                                                            if (param1 != 339) {
                                                              if (382 == param1) {
                                                                var2 = -98;
                                                                break L0;
                                                              } else {
                                                                if (param1 == 376) {
                                                                  var2 = -97;
                                                                  break L0;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L0;
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
                                                    } else {
                                                      var2 = -104;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  } else {
                                    var2 = -116;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -118;
                                break L0;
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                }
              } else {
                var2 = -126;
                break L0;
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param1;
          break L0;
        }
        if (param0 == 1) {
          return (byte) var2;
        } else {
          return (byte) 57;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                if (param0 > -15) {
                    field_h = 14;
                }
                param1.getAppletContext().showDocument(uf.a(param1, (byte) 115, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = ie.field_e.getGraphics();
                        if (de.field_o == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        de.field_o = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, ub.field_b, lb.field_z);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ei.field_b == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ei.field_b = ie.field_e.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = ei.field_b.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param2, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param2 + 2, 2, 300 + -(param2 * 3), 30);
                        var10.setFont(de.field_o);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(ei.field_b, -152 + ub.field_b / 2, -18 + lb.field_z / 2, (java.awt.image.ImageObserver) null);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = ub.field_b / 2 - 152;
                        var8 = lb.field_z / 2 - 18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, 3 * param2, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 + 1, 301, 31);
                        var9.fillRect(3 * param2 + (var7 - -2), var8 - -2, -(3 * param2) + 300, 30);
                        var9.setFont(de.field_o);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, (304 + -(6 * param0.length())) / 2 + var7, var8 - -22);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null == rj.field_B) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9.setFont(de.field_o);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(rj.field_B, ub.field_b / 2 - 6 * rj.field_B.length() / 2, -26 + lb.field_z / 2);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param4 == -3) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_e = null;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    ie.field_e.repaint();
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        m var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hb var15 = null;
        int[][] var19 = null;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        var15 = MonkeyPuzzle2.field_D;
        var2 = var15.a((byte) 114);
        var3 = (m) (Object) gi.field_l.a((byte) -117);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_g == var2) {
                break L1;
              } else {
                var3 = (m) (Object) gi.field_l.d((byte) 63);
                continue L0;
              }
            }
          }
          if (var3 == null) {
            gk.a(-1);
            return;
          } else {
            L2: {
              if (param0 == -106) {
                break L2;
              } else {
                field_k = null;
                break L2;
              }
            }
            L3: {
              var4 = var15.a((byte) 114);
              if (-1 == (var4 ^ -1)) {
                break L3;
              } else {
                var5 = var3.field_j;
                ni.field_d[0] = cl.field_e;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    sb.b(2, var5, var4);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        hb.b((byte) 115, var5);
                        var6 = new String[2][var5];
                        var19 = new int[2][4 * var5];
                        var8 = fd.field_n;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L7: while (true) {
                              if (var13 >= var8) {
                                break L3;
                              } else {
                                var11 = hl.field_f[var13 + var5];
                                var6[1][var14] = ni.field_d[var11];
                                var19[1][var14 * 4] = gi.field_e[var11];
                                var19[1][1 + 4 * var14] = jc.field_a[var11];
                                var19[1][2 + var14 * 4] = hf.field_c[var11];
                                var19[1][4 * var14 - -3] = rb.field_fb[var11];
                                if (f.a(-15189, ni.field_d[var11])) {
                                  if (hf.field_c[var11] + jc.field_a[var11] + rb.field_fb[var11] == 0) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var13++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var13++;
                                    var14++;
                                    continue L7;
                                  }
                                } else {
                                  var13++;
                                  var14++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = hl.field_f[var9];
                            var6[0][var10] = ni.field_d[var11];
                            var19[0][4 * var10] = gi.field_e[var11];
                            var19[0][1 + var10 * 4] = jc.field_a[var11];
                            var19[0][2 + 4 * var10] = hf.field_c[var11];
                            var19[0][3 + var10 * 4] = rb.field_fb[var11];
                            if (f.a(-15189, ni.field_d[var11])) {
                              if (0 == jc.field_a[var11] - (-hf.field_c[var11] - rb.field_fb[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        hc.a((byte) 82, (gk) (Object) var15);
                        if (var6_int != 0) {
                          hb.a(de.field_m, var6_int, qd.field_a, mk.field_i, 1000, lk.field_a);
                          var6_int++;
                          continue L5;
                        } else {
                          hb.a(de.field_m, var6_int, qd.field_a, mk.field_i, param0 ^ -898, lk.field_a);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ni.field_d[var6_int] = var15.f(-1);
                    var6_int++;
                    continue L4;
                  }
                }
              }
            }
            var3.c(-19822);
            return;
          }
        }
    }

    private m() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 < 15) {
            return;
        }
        field_e = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[5];
        field_h = 0;
        field_f = null;
    }
}
