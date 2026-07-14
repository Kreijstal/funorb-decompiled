/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ck {
    int field_p;
    static wj field_o;
    static boolean field_A;
    static byte[] field_w;
    static el field_y;
    byte[] field_B;
    static wk[][] field_x;
    static boolean field_q;
    static String field_u;
    static int field_z;
    long field_v;
    static String field_C;
    static boolean field_r;
    static fk field_s;
    static String field_t;

    public static void d(int param0) {
        field_x = null;
        field_w = null;
        field_o = null;
        field_C = null;
        if (param0 != -1341) {
            Object var2 = null;
            String discarded$0 = kc.a((int[]) null, (int[]) null, -79);
        }
        field_t = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final static void a(String param0, int param1, boolean param2, int param3, java.awt.Color param4) {
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
                        var9 = sl.field_n.getGraphics();
                        if (null != wc.field_f) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        wc.field_f = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, na.field_i, li.field_A);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param4 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ll.field_j == null) {
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
                        ll.field_j = sl.field_n.createImage(304, 34);
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
                        var10 = ll.field_j.getGraphics();
                        var10.setColor(param4);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param1 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param1 + 2, 2, param3 - 3 * param1, 30);
                        var10.setFont(wc.field_f);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (304 - 6 * param0.length()) / 2, 22);
                        boolean discarded$1 = var9.drawImage(ll.field_j, -152 + na.field_i / 2, -18 + li.field_A / 2, (java.awt.image.ImageObserver) null);
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = na.field_i / 2 + -152;
                        var8 = -18 + li.field_A / 2;
                        var9.setColor(param4);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, param1 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 - -1, 301, 31);
                        var9.fillRect(2 + var7 + 3 * param1, 2 + var8, 300 + -(param1 * 3), 30);
                        var9.setFont(wc.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, var7 - -((-(6 * param0.length()) + 304) / 2), 22 + var8);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (id.field_Wb == null) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9.setFont(wc.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(id.field_Wb, na.field_i / 2 + -(6 * id.field_Wb.length() / 2), -26 + li.field_A / 2);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    sl.field_n.repaint();
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int[] param0, int[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.field_G;
        var3 = 0;
        var4 = 0;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (var6 >= param0.length) {
              break L1;
            } else {
              L2: {
                if (-1 == param0[var6]) {
                  break L2;
                } else {
                  var3 = var3 + param0[var6];
                  break L2;
                }
              }
              L3: {
                if ((param0[var6] ^ -1) == -50) {
                  var4 = 6;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = (var3 ^ 10 * var3) & 8388607;
              var6++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var6 = 0;
          L4: while (true) {
            L5: {
              if (var6 >= 8) {
                break L5;
              } else {
                var3 = 8388607 & (var3 ^ 10 * var3);
                var6++;
                if (0 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              var5 = cd.field_c[1];
              var6 = ul.a((byte) -84, param0[0]);
              if (var6 < 0) {
                break L6;
              } else {
                if (var6 >= cd.field_c.length) {
                  break L6;
                } else {
                  var5 = cd.field_c[var6];
                  break L6;
                }
              }
            }
            L7: {
              if (var6 == 0) {
                var3 = var3 ^ 8176765;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var5_ref = var5 + "-";
              if (var6 == 1) {
                var3 = var3 ^ 1155849;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param2 != var6) {
                break L9;
              } else {
                var3 = var3 ^ 5624312;
                break L9;
              }
            }
            L10: {
              if (var6 == 3) {
                var3 = var3 ^ 7177436;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var6 == 4) {
                var3 = var3 ^ 5318225;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (var6 != 5) {
                break L12;
              } else {
                var3 = var3 ^ 18177652;
                break L12;
              }
            }
            L13: {
              if (var6 == 6) {
                var3 = var3 ^ 7171409;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (var6 != 7) {
                break L14;
              } else {
                var3 = var3 ^ 3140392;
                break L14;
              }
            }
            L15: {
              if (8 == var6) {
                var3 = var3 ^ 5104464;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (var6 == 9) {
                var3 = var3 ^ 5940651;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (var6 != 10) {
                break L17;
              } else {
                var3 = var3 ^ 7257749;
                break L17;
              }
            }
            L18: {
              if (var6 == 11) {
                var3 = var3 ^ 2016943;
                break L18;
              } else {
                break L18;
              }
            }
            var7 = var3;
            var8 = 0;
            L19: while (true) {
              L20: {
                if (var8 >= 5) {
                  break L20;
                } else {
                  L21: {
                    L22: {
                      L23: {
                        if (-1 <= (var7 % 35 ^ -1)) {
                          break L23;
                        } else {
                          if (var7 % 35 > -27) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (-27 <= var7 % 35) {
                        var5_ref = var5_ref + (char)((-26 + var7 % 35) % 10 + 48);
                        if (0 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      } else {
                        break L21;
                      }
                    }
                    var5_ref = var5_ref + (char)(65 - -((var7 % 35 - 1) % 26));
                    break L21;
                  }
                  var7 = var7 / 35;
                  var8++;
                  if (0 == 0) {
                    continue L19;
                  } else {
                    break L20;
                  }
                }
              }
              var8 = 0;
              L24: while (true) {
                L25: {
                  if (param1.length <= var8) {
                    break L25;
                  } else {
                    L26: {
                      if ((param1[var8] ^ -1) != -1) {
                        break L26;
                      } else {
                        if (var4 < 1) {
                          var4 = 1;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (1 != param1[var8]) {
                        break L27;
                      } else {
                        if (2 <= var4) {
                          break L27;
                        } else {
                          var4 = 2;
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (-3 != param1[var8]) {
                        break L28;
                      } else {
                        if (var4 < 3) {
                          var4 = 3;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      if (-4 != param1[var8]) {
                        break L29;
                      } else {
                        if (var4 < 4) {
                          var4 = 4;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    L30: {
                      if (param1[var8] != 4) {
                        break L30;
                      } else {
                        if (var4 >= 5) {
                          break L30;
                        } else {
                          var4 = 5;
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if (param1[var8] != 5) {
                        break L31;
                      } else {
                        if (var4 < 1) {
                          var4 = 1;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                    }
                    L32: {
                      if (param1[var8] != 6) {
                        break L32;
                      } else {
                        if (var4 < 2) {
                          var4 = 2;
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (param1[var8] != 7) {
                        break L33;
                      } else {
                        if (var4 < 3) {
                          var4 = 3;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (param1[var8] != 8) {
                        break L34;
                      } else {
                        if (var4 < 4) {
                          var4 = 4;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                    L35: {
                      if (param1[var8] != 9) {
                        break L35;
                      } else {
                        if (var4 >= 5) {
                          break L35;
                        } else {
                          var4 = 5;
                          break L35;
                        }
                      }
                    }
                    L36: {
                      if ((param1[var8] ^ -1) != -11) {
                        break L36;
                      } else {
                        if (var4 < 1) {
                          var4 = 1;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L37: {
                      if (param1[var8] != 11) {
                        break L37;
                      } else {
                        if (var4 >= 2) {
                          break L37;
                        } else {
                          var4 = 2;
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (param1[var8] != 12) {
                        break L38;
                      } else {
                        if (var4 >= 3) {
                          break L38;
                        } else {
                          var4 = 3;
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (param1[var8] != 13) {
                        break L39;
                      } else {
                        if (var4 < 4) {
                          var4 = 4;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (param1[var8] != -15) {
                        break L40;
                      } else {
                        if (var4 >= 5) {
                          break L40;
                        } else {
                          var4 = 5;
                          break L40;
                        }
                      }
                    }
                    L41: {
                      if (-21 != param1[var8]) {
                        break L41;
                      } else {
                        if (6 <= var4) {
                          break L41;
                        } else {
                          var4 = 6;
                          break L41;
                        }
                      }
                    }
                    var8++;
                    if (0 == 0) {
                      continue L24;
                    } else {
                      break L25;
                    }
                  }
                }
                L42: {
                  if (1 == var4) {
                    var5_ref = var5_ref + "-V1";
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (var4 == 2) {
                    var5_ref = var5_ref + "-V2";
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (var4 != 3) {
                    break L44;
                  } else {
                    var5_ref = var5_ref + "-V3";
                    break L44;
                  }
                }
                L45: {
                  if (var4 != 4) {
                    break L45;
                  } else {
                    var5_ref = var5_ref + "-V4";
                    break L45;
                  }
                }
                L46: {
                  if (var4 != 5) {
                    break L46;
                  } else {
                    var5_ref = var5_ref + "-V5";
                    break L46;
                  }
                }
                L47: {
                  if (var4 == 6) {
                    var5_ref = var5_ref + "-<img=18>";
                    break L47;
                  } else {
                    break L47;
                  }
                }
                return var5_ref;
              }
            }
          }
        }
    }

    kc(long param0, int param1, byte[] param2) {
        ((kc) this).field_p = param1;
        ((kc) this).field_v = param0;
        ((kc) this).field_B = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = false;
        field_w = new byte[]{(byte) 1, (byte) 0, (byte) 0};
        field_u = "Choose a chassis for your sentinel configuration. Each chassis is equipped with a default set of weapons and modules.";
        field_C = "New Game";
        field_t = "Show all game chat";
    }
}
