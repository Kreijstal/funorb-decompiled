/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static boolean field_b;
    static int field_a;
    static int field_d;
    static String field_c;

    final static String a(int param0) {
        if (fk.field_F == vh.field_c) {
            return da.field_i;
        }
        if (param0 != 23917) {
            return null;
        }
        return lk.field_k;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            Object var2 = null;
            ja.a((String) null, (java.awt.Color) null, false, -82, (byte) -96);
        }
    }

    final static on a(byte param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = 33 / ((param0 - 27) / 55);
        var2 = md.a(0, param1, 79);
        if (3 != var2) {
          if (var2 != 4) {
            if (-6 != (var2 ^ -1)) {
              if (var2 != 6) {
                return null;
              } else {
                return vk.a((byte) -105, param1);
              }
            } else {
              return gm.a(param1, -4);
            }
          } else {
            return fc.a(param1, (byte) 49);
          }
        } else {
          return gk.a((byte) -81, param1);
        }
    }

    final static int a(byte param0, String[] param1, String param2, int param3, rb param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        var5 = param4.b(param2);
        if (param3 < var5) {
          var6 = (-1 + (param3 + var5)) / param3;
          param3 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param2.length();
          var9 = 0;
          L0: while (true) {
            if (var8 <= var9) {
              if (param0 == 16) {
                L1: {
                  if (var7 < var8) {
                    var6++;
                    param1[var6] = param2.substring(var7, var8).trim();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var6;
              } else {
                L2: {
                  field_c = null;
                  if (var7 < var8) {
                    var6++;
                    param1[var6] = param2.substring(var7, var8).trim();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return var6;
              }
            } else {
              L3: {
                L4: {
                  var10 = param2.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (var10 == 45) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = param2.substring(var7, 1 + var9).trim();
                var12 = param4.b(var11);
                if (param3 <= var12) {
                  var7 = 1 + var9;
                  var6++;
                  param1[var6] = var11;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var10 != 62) {
                var9++;
                var9++;
                continue L0;
              } else {
                if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                  var6++;
                  param1[var6] = param2.substring(var7, var9 - 3).trim();
                  var7 = var9 - -1;
                  var9++;
                  continue L0;
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
          }
        } else {
          if (-1 == param2.indexOf("<br>")) {
            param1[0] = (String) (Object) param1;
            return 1;
          } else {
            var6 = (-1 + (param3 + var5)) / param3;
            param3 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L5: while (true) {
              if (var8 <= var9) {
                if (param0 == 16) {
                  L6: {
                    if (var7 < var8) {
                      var6++;
                      param1[var6] = param2.substring(var7, var8).trim();
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return var6;
                } else {
                  L7: {
                    field_c = null;
                    if (var7 < var8) {
                      var6++;
                      param1[var6] = param2.substring(var7, var8).trim();
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return var6;
                }
              } else {
                L8: {
                  L9: {
                    var10 = param2.charAt(var9);
                    if (var10 == 32) {
                      break L9;
                    } else {
                      if (var10 == 45) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var11 = param2.substring(var7, 1 + var9).trim();
                  var12 = param4.b(var11);
                  if (param3 <= var12) {
                    var7 = 1 + var9;
                    var6++;
                    param1[var6] = var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (var10 != 62) {
                  var9++;
                  var9++;
                  continue L5;
                } else {
                  if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                    var6++;
                    param1[var6] = param2.substring(var7, var9 - 3).trim();
                    var7 = var9 - -1;
                    var9++;
                    continue L5;
                  } else {
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, java.awt.Color param1, boolean param2, int param3, byte param4) {
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
                        var9 = cj.field_d.getGraphics();
                        if (eo.field_f != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        eo.field_f = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, te.field_eb, kj.field_c);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
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
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null != on.field_i) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        on.field_i = cj.field_d.createImage(304, 34);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = on.field_i.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param3, 30);
                        var7 = -59 / ((-1 - param4) / 55);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param3 * 3 + 2, 2, -(3 * param3) + 300, 30);
                        var10.setFont(eo.field_f);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(on.field_i, -152 + te.field_eb / 2, kj.field_c / 2 + -18, (java.awt.image.ImageObserver) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = te.field_eb / 2 - 152;
                        var8 = kj.field_c / 2 - 18;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 - -2, 3 * param3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 - -1, 301, 31);
                        var9.fillRect(2 + var7 - -(param3 * 3), 2 + var8, -(3 * param3) + 300, 30);
                        var9.setFont(eo.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, var7 - -((-(param0.length() * 6) + 304) / 2), var8 + 22);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ph.field_b == null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9.setFont(eo.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(ph.field_b, te.field_eb / 2 + -(6 * ph.field_b.length() / 2), kj.field_c / 2 - 26);
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (Exception) (Object) caughtException;
                    cj.field_d.repaint();
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_a = 2;
        field_c = "Try again";
    }
}
