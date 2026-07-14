/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static ed field_e;
    static ad field_c;
    static String[] field_b;
    static String[] field_a;
    static int field_f;
    static String field_d;

    final static int a(boolean param0, String param1, int param2) {
        if (param2 != -30633) {
            return -17;
        }
        if (!param0) {
            return n.field_c.b(param1);
        }
        return i.field_x.b(param1);
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != in.field_C) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (oh.a(-161, (char) var2)) {
                        var3 = 127 & ka.field_c - -1;
                        if (var3 != je.field_i) {
                            jk.field_Db[ka.field_c] = -1;
                            b.field_a[ka.field_c] = (char)var2;
                            ka.field_c = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    final static void a(boolean param0, int param1, gn param2) {
        if (param2 != null) {
            param2.a((byte) -117);
        }
        ce.field_p = param1;
        gk.field_L = param2;
        bl.field_k = param0 ? true : false;
        hc.field_b = param2 != null ? param2.field_a : 0;
    }

    final static void a(int param0, byte param1, int param2, q param3, int param4, byte param5) {
        int var7 = DungeonAssault.field_K;
        if (param1 >= -6) {
            field_d = null;
        }
        int var6 = param2 + param3.field_h * param4;
        while (true) {
            param0--;
            if ((param0 ^ -1) >= -1) {
                break;
            }
            param3.field_j[var6] = (byte)param5;
            var6 = var6 + param3.field_h;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == in.field_C)) {
            ia.field_M = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null != in.field_C) {
            L1: {
              L2: {
                hl.field_g = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (fl.field_m.length > var2) {
                    var2 = fl.field_m[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (0 > ia.field_M) {
              break L0;
            } else {
              if (-1 >= (var2 ^ -1)) {
                ih.field_r[ia.field_M] = var2 ^ -1;
                ia.field_M = 127 & 1 + ia.field_M;
                if (dl.field_b == ia.field_M) {
                  ia.field_M = -1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        param0.consume();
    }

    final static int a(se param0, byte param1, String[] param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = DungeonAssault.field_K;
          var5 = param0.b(param4);
          if (param3 < var5) {
            break L0;
          } else {
            if ((param4.indexOf("<br>") ^ -1) != 0) {
              break L0;
            } else {
              param2[0] = (String) (Object) param2;
              return 1;
            }
          }
        }
        var6 = (-1 + (param3 + var5)) / param3;
        param3 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param4.length();
        var10 = -128 % ((29 - param1) / 49);
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var7 < var8) {
                var6++;
                param2[var6] = param4.substring(var7, var8).trim();
                break L2;
              } else {
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var11 = param4.charAt(var9);
                if (32 == var11) {
                  break L4;
                } else {
                  if (var11 == 45) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var12 = param4.substring(var7, var9 + 1).trim();
              var13 = param0.b(var12);
              if (var13 >= param3) {
                var7 = var9 - -1;
                var6++;
                param2[var6] = var12;
                break L3;
              } else {
                break L3;
              }
            }
            if (var11 == 62) {
              if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param2[var6] = param4.substring(var7, var9 - 3).trim();
                var7 = var9 + 1;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 != 4) {
            return -99;
        }
        return jn.field_d;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null != in.field_C) {
            L1: {
              L2: {
                hl.field_g = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (fl.field_m.length > var2) {
                    var2 = fl.field_m[var2];
                    if ((var2 & 128) != 0) {
                      var2 = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if (0 > ia.field_M) {
                break L3;
              } else {
                if (var2 < 0) {
                  break L3;
                } else {
                  ih.field_r[ia.field_M] = var2;
                  ia.field_M = 1 + ia.field_M & 127;
                  if (dl.field_b == ia.field_M) {
                    ia.field_M = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (-1 < (var2 ^ -1)) {
                break L4;
              } else {
                var3 = 127 & 1 + ka.field_c;
                if (var3 != je.field_i) {
                  jk.field_Db[ka.field_c] = var2;
                  b.field_a[ka.field_c] = (char)0;
                  ka.field_c = var3;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var3 = param0.getModifiers();
            if (-1 != (10 & var3 ^ -1)) {
              param0.consume();
              break L0;
            } else {
              if ((var2 ^ -1) == -86) {
                param0.consume();
                break L0;
              } else {
                if (var2 != 10) {
                  break L0;
                } else {
                  param0.consume();
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -129) {
            field_f = -21;
        }
        field_c = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ad(8, 0, 4, 1);
        field_b = new String[]{"All scores", "My scores", "Best each"};
        field_a = new String[]{null, "One raider will be the <%highlight>party leader</col>, and will be first to enter the next room and encounter whatever lies inside. You can change your party leader before you enter any room by <col=FF0000>left-clicking on it in the party view</col> at the bottom-left of the screen."};
        field_d = "GUARDIAN";
    }
}
