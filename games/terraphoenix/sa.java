/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_b;
    static int field_d;
    private int[] field_e;
    static bm field_c;
    static String field_a;
    static String field_f;

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (li.a(param0, param2, 18116)) {
          var3 = param1;
          L0: while (true) {
            if (param2.length() > var3) {
              if (qb.a(param2.charAt(var3), (byte) 61)) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ja var4 = null;
        var3 = Terraphoenix.field_V;
        var4 = (ja) (Object) vd.field_l.d(9272);
        L0: while (true) {
          if (var4 == null) {
            if (param0 != -336) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            eb.a(var4, 0, param1);
            var4 = (ja) (Object) vd.field_l.e((byte) -119);
            continue L0;
          }
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Terraphoenix.field_V;
        if (param1 != 0) {
          var7 = 0;
          if (param0 < -20) {
            param1 = param1 + param2;
            var8 = param3;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (var9 < 0) {
                  var7 = ((sa) this).field_e[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                var10 = ((sa) this).field_e[var7];
                if (((sa) this).field_e[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param1) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param3 + (1 + var8);
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 == (64 & var9)) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((sa) this).field_e[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((sa) this).field_e[var7];
                if (0 > ((sa) this).field_e[var7]) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param1) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param3 + (1 + var8);
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if ((var9 & 32) == -1) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((sa) this).field_e[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((sa) this).field_e[var7];
                if (-1 <= ((sa) this).field_e[var7]) {
                  break L6;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param1 > param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param3 + (1 + var8);
                  }
                }
              }
              L7: {
                if (-1 == (var9 & 16 ^ -1)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((sa) this).field_e[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((sa) this).field_e[var7];
                if (0 <= ((sa) this).field_e[var7]) {
                  break L8;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param1) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param3 + (1 + var8);
                  }
                }
              }
              L9: {
                if ((8 & var9) == 0) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((sa) this).field_e[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((sa) this).field_e[var7];
                if (((sa) this).field_e[var7] >= 0) {
                  break L10;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param1 > param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param3 + (1 + var8);
                  }
                }
              }
              L11: {
                if ((var9 & 4) != 0) {
                  var7 = ((sa) this).field_e[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                L13: {
                  var10 = ((sa) this).field_e[var7];
                  if (-1 >= (((sa) this).field_e[var7] ^ -1)) {
                    break L13;
                  } else {
                    param2++;
                    param4[param2] = (byte)var10;
                    if (param1 <= param2) {
                      break L12;
                    } else {
                      var7 = 0;
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-1 == (2 & var9)) {
                    var7++;
                    break L14;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L14;
                  }
                }
                L15: {
                  var10 = ((sa) this).field_e[var7];
                  if (((sa) this).field_e[var7] < 0) {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param1 <= param2) {
                      break L12;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 != (1 & var9)) {
                    var7 = ((sa) this).field_e[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                var10 = ((sa) this).field_e[var7];
                if (0 > ((sa) this).field_e[var7]) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param1 <= param2) {
                    break L12;
                  } else {
                    var7 = 0;
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
              return -param3 + (1 + var8);
            }
          } else {
            var12 = null;
            sa.a(-76, (String) null, 76, (java.awt.Color) null, true);
            param1 = param1 + param2;
            var8 = param3;
            L17: while (true) {
              L18: {
                var9 = param5[var8];
                if (var9 < 0) {
                  var7 = ((sa) this).field_e[var7];
                  break L18;
                } else {
                  var7++;
                  break L18;
                }
              }
              L19: {
                L20: {
                  var10 = ((sa) this).field_e[var7];
                  if (((sa) this).field_e[var7] < 0) {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param2 < param1) {
                      var7 = 0;
                      break L20;
                    } else {
                      break L19;
                    }
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (0 == (64 & var9)) {
                    var7++;
                    break L21;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L21;
                  }
                }
                L22: {
                  var10 = ((sa) this).field_e[var7];
                  if (0 > ((sa) this).field_e[var7]) {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param2 < param1) {
                      var7 = 0;
                      break L22;
                    } else {
                      return -param3 + (1 + var8);
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if ((var9 & 32) == -1) {
                    var7++;
                    break L23;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L23;
                  }
                }
                L24: {
                  var10 = ((sa) this).field_e[var7];
                  if (-1 <= ((sa) this).field_e[var7]) {
                    break L24;
                  } else {
                    param2++;
                    param4[param2] = (byte)var10;
                    if (param1 > param2) {
                      var7 = 0;
                      break L24;
                    } else {
                      break L19;
                    }
                  }
                }
                L25: {
                  if (-1 == (var9 & 16)) {
                    var7++;
                    break L25;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L25;
                  }
                }
                L26: {
                  var10 = ((sa) this).field_e[var7];
                  if (0 <= ((sa) this).field_e[var7]) {
                    break L26;
                  } else {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param2 < param1) {
                      var7 = 0;
                      break L26;
                    } else {
                      return -param3 + (1 + var8);
                    }
                  }
                }
                L27: {
                  if ((8 & var9) == 0) {
                    var7++;
                    break L27;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L27;
                  }
                }
                L28: {
                  var10 = ((sa) this).field_e[var7];
                  if (((sa) this).field_e[var7] >= 0) {
                    break L28;
                  } else {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param1 > param2) {
                      var7 = 0;
                      break L28;
                    } else {
                      return -param3 + (1 + var8);
                    }
                  }
                }
                L29: {
                  if ((var9 & 4) != 0) {
                    var7 = ((sa) this).field_e[var7];
                    break L29;
                  } else {
                    var7++;
                    break L29;
                  }
                }
                L30: {
                  var10 = ((sa) this).field_e[var7];
                  if (-1 >= (((sa) this).field_e[var7] ^ -1)) {
                    break L30;
                  } else {
                    param2++;
                    param4[param2] = (byte)var10;
                    if (param1 <= param2) {
                      break L19;
                    } else {
                      var7 = 0;
                      break L30;
                    }
                  }
                }
                L31: {
                  if (-1 == (2 & var9)) {
                    var7++;
                    break L31;
                  } else {
                    var7 = ((sa) this).field_e[var7];
                    break L31;
                  }
                }
                L32: {
                  var10 = ((sa) this).field_e[var7];
                  if (((sa) this).field_e[var7] < 0) {
                    param2++;
                    param4[param2] = (byte)(var10 ^ -1);
                    if (param1 <= param2) {
                      break L19;
                    } else {
                      var7 = 0;
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (0 != (1 & var9)) {
                    var7 = ((sa) this).field_e[var7];
                    break L33;
                  } else {
                    var7++;
                    break L33;
                  }
                }
                var10 = ((sa) this).field_e[var7];
                if (0 > ((sa) this).field_e[var7]) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param1 <= param2) {
                    break L19;
                  } else {
                    var7 = 0;
                    var8++;
                    continue L17;
                  }
                } else {
                  var8++;
                  continue L17;
                }
              }
              return -param3 + (1 + var8);
            }
          }
        } else {
          return 0;
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, String param1, int param2, java.awt.Color param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = ae.field_G.getGraphics();
                        if (null == t.field_e) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        t.field_e = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, ja.field_j, wc.field_p);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param3 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (ag.field_a != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ag.field_a = ae.field_G.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = ag.field_a.getGraphics();
                        var10.setColor(param3);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param2 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param2 + 2, 2, 300 - 3 * param2, 30);
                        var10.setFont(t.field_e);
                        if (param0 == -26) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param1, (304 - param1.length() * 6) / 2, 22);
                        boolean discarded$2 = var9.drawImage(ag.field_a, -152 + ja.field_j / 2, -18 + wc.field_p / 2, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + ja.field_j / 2;
                        var8 = wc.field_p / 2 + -18;
                        var9.setColor(param3);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, var8 + 2, 3 * param2, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                        var9.fillRect(2 + var7 + 3 * param2, 2 + var8, -(param2 * 3) + 300, 30);
                        var9.setFont(t.field_e);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param1, var7 - -((-(6 * param1.length()) + 304) / 2), 22 + var8);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (e.field_o != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9.setFont(t.field_e);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(e.field_o, ja.field_j / 2 + -(6 * e.field_o.length() / 2), -26 + wc.field_p / 2);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    ae.field_G.repaint();
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "M-06";
        field_b = "HTRRG-1";
    }
}
