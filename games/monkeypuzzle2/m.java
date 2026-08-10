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
        int var2;
        int var3;
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                      if (param0 <= -15) {
                        break L2;
                      } else {
                        field_h = 14;
                        break L2;
                      }
                    }
                    param1.getAppletContext().showDocument(uf.a(param1, (byte) 115, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("m.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ie.field_e.getGraphics();
                  if (de.field_o == null) {
                    de.field_o = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param3) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, ub.field_b, lb.field_z);
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (ei.field_b == null) {
                        ei.field_b = ie.field_e.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
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
                    var9.drawImage(ei.field_b, -152 + ub.field_b / 2, -18 + lb.field_z / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
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
                    break L7;
                  }
                }
                L8: {
                  if (null == rj.field_B) {
                    break L8;
                  } else {
                    var9.setFont(de.field_o);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(rj.field_B, ub.field_b / 2 - 6 * rj.field_B.length() / 2, -26 + lb.field_z / 2);
                    break L8;
                  }
                }
                L9: {
                  if (param4 == -3) {
                    break L9;
                  } else {
                    field_e = (int[]) null;
                    break L9;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ie.field_e.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("m.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L12;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        hb var13 = null;
        int var14 = 0;
        hb var15 = null;
        int[][] var19 = null;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var13 = MonkeyPuzzle2.field_D;
            var15 = var13;
            var2 = var15.a((byte) 114);
            var3 = (m) ((Object) gi.field_l.a((byte) -117));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if ((var3.field_g ^ -1) == (var2 ^ -1)) {
                    break L2;
                  } else {
                    var3 = (m) ((Object) gi.field_l.d((byte) 63));
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                gk.a(-1);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  if (param0 == -106) {
                    break L3;
                  } else {
                    field_k = (ai) null;
                    break L3;
                  }
                }
                L4: {
                  var4 = var15.a((byte) 114);
                  if (-1 != (var4 ^ -1)) {
                    var5 = var3.field_j;
                    ni.field_d[0] = cl.field_e;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        sb.b(2, var5, var4);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            hb.b((byte) 115, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = fd.field_n;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var9 >= var8) {
                                    var3.c(-19822);
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = hl.field_f[var9 + var5];
                                      var6[1][var14] = ni.field_d[var11];
                                      var19[1][var14 * 4] = gi.field_e[var11];
                                      var19[1][1 + 4 * var14] = jc.field_a[var11];
                                      var19[1][2 + var14 * 4] = hf.field_c[var11];
                                      var19[1][4 * var14 - -3] = rb.field_fb[var11];
                                      if (!f.a(-15189, ni.field_d[var11])) {
                                        break L9;
                                      } else {
                                        if (hf.field_c[var11] + jc.field_a[var11] + rb.field_fb[var11] != 0) {
                                          break L9;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        }
                                      }
                                    }
                                    var9++;
                                    var14++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = hl.field_f[var9];
                                  var6[0][var10] = ni.field_d[var11];
                                  var19[0][4 * var10] = gi.field_e[var11];
                                  var19[0][1 + var10 * 4] = jc.field_a[var11];
                                  var19[0][2 + 4 * var10] = hf.field_c[var11];
                                  var19[0][3 + var10 * 4] = rb.field_fb[var11];
                                  if (f.a(-15189, ni.field_d[var11])) {
                                    if (0 != jc.field_a[var11] - (-hf.field_c[var11] - rb.field_fb[var11])) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              hc.a((byte) 82, var15);
                              if ((var6_int ^ -1) != -1) {
                                hb.a(de.field_m, var6_int, qd.field_a, mk.field_i, 1000, lk.field_a);
                                break L11;
                              } else {
                                hb.a(de.field_m, var6_int, qd.field_a, mk.field_i, param0 ^ -898, lk.field_a);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        ni.field_d[var6_int] = var13.f(-1);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.c(-19822);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "m.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        field_e = new int[5];
        field_h = 0;
        field_f = null;
    }
}
