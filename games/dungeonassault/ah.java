/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;
    static oi field_b;
    static String[] field_c;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        if (nl.field_d <= -1) {
          L0: {
            var3 = param1 + -135;
            var4 = -35 + param2;
            var5 = 256;
            if (-76 <= nl.field_d) {
              break L0;
            } else {
              var5 = (nl.field_d << 1686247208) / 75;
              break L0;
            }
          }
          L1: {
            if (nl.field_d > 200) {
              var5 = (-nl.field_d + 250 << -1884509240) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              ah.a(-19);
              break L2;
            }
          }
          L3: {
            lm.a(hc.field_a, (byte) -91);
            re.b();
            gf.a();
            id.a(439027688);
            if (-257 >= var5) {
              break L3;
            } else {
              gf.b(0, 0, gf.field_i, gf.field_c, 0, 256 - var5);
              break L3;
            }
          }
          L4: {
            ti.c(true);
            if (-151 > nl.field_d) {
              hc.field_a.a(var3, var4);
              break L4;
            } else {
              dm.field_g.d(15 + var3, var4 - -10, var5);
              break L4;
            }
          }
          L5: {
            var6 = -125 + nl.field_d;
            if ((var6 ^ -1) >= -1) {
              break L5;
            } else {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (30 <= var6) {
                    var7 = (-(var6 * 256) + 12800) / 20;
                    ie.field_l.b(var3, var4, var7);
                    break L5;
                  } else {
                    ie.field_l.b(var3, var4, 256);
                    break L5;
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  ie.field_l.b(var3, var4, var7);
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            var6 = -140 + nl.field_d;
            if (var6 > 0) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              lb.field_C.d(var3 + 15, 10 + var4, var7 * var5 >> 1734634536);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = DungeonAssault.field_K;
          if (param1 < 2) {
            break L0;
          } else {
            if ((param1 ^ -1) >= -37) {
              var4 = 0;
              if (param3 == -42) {
                var5 = 0;
                var6 = 0;
                var7 = param0.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param0.charAt(var8);
                      if (var8 == 0) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 > 57) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (65 > var9) {
                          break L5;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var9 < 97) {
                        return false;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L3;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (var9 < param1) {
                      L6: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var10 = param1 * var6 - -var9;
                      if (var10 / param1 != var6) {
                        return false;
                      } else {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static gp a(nh param0, int param1, String param2, String param3, nh param4) {
        int var5 = param4.a(param3, 1000);
        if (param1 != 200) {
            Object var7 = null;
            gp discarded$0 = ah.a((nh) null, 14, (String) null, (String) null, (nh) null);
        }
        int var6 = param4.a(0, param2, var5);
        return hh.a(param0, param4, var5, (byte) 124, var6);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -37) {
            field_a = null;
        }
    }

    final static void a(boolean param0, int param1) {
        ri.field_g = ec.field_j[param1].a();
        String var5 = ce.field_o[param1];
        int var3 = 40 - -ne.field_c.b(var5);
        cn var4 = new cn(var3, 32);
        jh.c();
        if (!param0) {
            field_a = null;
        }
        var4.e();
        ri.field_g.c(0, 0, 32, 32);
        ne.field_c.b(var5, 40, ne.field_c.field_H + 32 >> 1600563233, 16777215, -1);
        var4.d(16777215);
        var4.e();
        ri.field_g.b(0, 0, 32, 32, 0);
        ne.field_c.b(var5, 40, 32 - -ne.field_c.field_H >> 337737121, 0, -1);
        jh.b();
        ke.field_e = 0;
        pa.field_a = var4;
        sl.field_b = new rh(12 + (var3 >> -511804319), 32, 8 + var3, 32, 16711680, 768, 224);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Raider was trapped by guardian, which alerted the monsters of the dungeon.";
        field_c = new String[255];
    }
}
