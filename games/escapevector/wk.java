/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_f;
    static String field_a;
    static mf field_e;
    static int field_d;
    static boolean[] field_b;
    static boolean field_c;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            Object var2 = null;
            ia discarded$0 = wk.a(10, (c) null);
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (param1 == 55) {
            break L0;
          } else {
            wk.a(50, 41, 94);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == vi.field_e) {
              break L2;
            } else {
              if (param0 <= vi.field_e.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          vi.field_e = new int[param0 * 2];
          break L1;
        }
        L3: {
          L4: {
            if (null == fl.field_k) {
              break L4;
            } else {
              if (param0 > fl.field_k.length) {
                break L4;
              } else {
                break L3;
              }
            }
          }
          fl.field_k = new int[param0 * 2];
          break L3;
        }
        L5: {
          L6: {
            if (pc.field_c == null) {
              break L6;
            } else {
              if (pc.field_c.length < param0) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          pc.field_c = new int[2 * param0];
          break L5;
        }
        L7: {
          L8: {
            if (mi.field_k == null) {
              break L8;
            } else {
              if (mi.field_k.length >= param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          mi.field_k = new int[2 * param0];
          break L7;
        }
        L9: {
          L10: {
            if (tm.field_fb == null) {
              break L10;
            } else {
              if (tm.field_fb.length < param0) {
                break L10;
              } else {
                break L9;
              }
            }
          }
          tm.field_fb = new int[2 * param0];
          break L9;
        }
        L11: {
          L12: {
            if (null == th.field_v) {
              break L12;
            } else {
              if (param0 <= th.field_v.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          th.field_v = new int[2 * param0];
          break L11;
        }
        L13: {
          L14: {
            if (cd.field_q == null) {
              break L14;
            } else {
              if (param2 + param0 <= cd.field_q.length) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          cd.field_q = new int[2 * (param0 - -param2)];
          break L13;
        }
        L15: {
          L16: {
            if (null == dj.field_a) {
              break L16;
            } else {
              if (param0 > dj.field_a.length) {
                break L16;
              } else {
                break L15;
              }
            }
          }
          dj.field_a = new boolean[2 * param0];
          break L15;
        }
        pl.field_r = -2147483648;
        jf.field_J = 0;
        oa.field_t = -2147483648;
        pg.field_d = 2147483647;
        vl.field_e = 2147483647;
    }

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = EscapeVector.field_A;
          if (param1 < 2) {
            break L0;
          } else {
            if (36 < param1) {
              break L0;
            } else {
              var4 = 0;
              if (param3 == 97) {
                var5 = 0;
                var6 = 0;
                var7 = param2.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    if (var5 != 0) {
                      return var6;
                    } else {
                      throw new NumberFormatException();
                    }
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param0) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        } else {
                          var4 = 1;
                          var8++;
                          continue L1;
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
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
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
                      L6: {
                        if (97 > var9) {
                          break L6;
                        } else {
                          if (122 < var9) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (param1 <= var9) {
                      throw new NumberFormatException();
                    } else {
                      L7: {
                        if (var4 == 0) {
                          break L7;
                        } else {
                          var9 = -var9;
                          break L7;
                        }
                      }
                      var10 = var6 * param1 - -var9;
                      if (var6 != var10 / param1) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                return 11;
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static ia a(int param0, c param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ia var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        var2 = param1.j(8, 8);
        if ((var2 ^ -1) < -1) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = 51 % ((-82 - param0) / 38);
            var4 = da.a(param1, (byte) -104) ? 1 : 0;
            var5 = da.a(param1, (byte) -114) ? 1 : 0;
            var6 = new ia();
            var6.field_K = (short)param1.j(16, 8);
            var6.field_L = rg.a(param1, 16, var6.field_L, -1);
            var6.field_r = rg.a(param1, 16, var6.field_r, -1);
            var6.field_J = rg.a(param1, 16, var6.field_J, -1);
            var6.field_D = (short)param1.j(16, 8);
            var6.field_e = rg.a(param1, 16, var6.field_e, -1);
            var6.field_o = rg.a(param1, 16, var6.field_o, -1);
            var6.field_f = rg.a(param1, 16, var6.field_f, -1);
            if (var4 != 0) {
              var6.field_M = (short)param1.j(16, 8);
              var6.field_N = rg.a(param1, 16, var6.field_N, -1);
              var6.field_q = rg.a(param1, 16, var6.field_q, -1);
              var6.field_w = rg.a(param1, 16, var6.field_w, -1);
              var6.field_h = rg.a(param1, 16, var6.field_h, -1);
              var6.field_u = rg.a(param1, 16, var6.field_u, -1);
              var6.field_j = rg.a(param1, 16, var6.field_j, -1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var5 == 0) {
              break L1;
            } else {
              int discarded$1 = param1.j(16, 8);
              var6.field_v = rg.a(param1, 16, var6.field_v, -1);
              var6.field_c = rg.a(param1, 16, var6.field_c, -1);
              var6.field_Q = rg.a(param1, 16, var6.field_Q, -1);
              var6.field_G = rg.a(param1, 16, var6.field_G, -1);
              var6.field_F = rg.a(param1, 16, var6.field_F, -1);
              break L1;
            }
          }
          L2: {
            if (!da.a(param1, (byte) -104)) {
              break L2;
            } else {
              var6.field_m = rg.a(param1, 16, var6.field_m, -1);
              break L2;
            }
          }
          L3: {
            if (!da.a(param1, (byte) -102)) {
              break L3;
            } else {
              var6.field_n = jm.a(16, 118, param1, var6.field_n);
              var7 = 0;
              var8 = 0;
              L4: while (true) {
                if (var8 >= var6.field_n.length) {
                  if (0 == var7) {
                    var6.field_n = null;
                    break L3;
                  } else {
                    var6.field_I = (byte)(1 + var7);
                    break L3;
                  }
                } else {
                  if ((255 & var6.field_n[var8]) > var7) {
                    var7 = var6.field_n[var8] & 255;
                    var8++;
                    continue L4;
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
          return var6;
        }
    }

    final static String a(String param0, boolean param1, String param2, String param3, mf param4) {
        if (!param4.b(0)) {
            return param0;
        }
        if (param1) {
            field_a = null;
        }
        return param2 + " - " + param4.a(param3, 0) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "No highscores";
        field_a = "Error connecting to server. Please try using a different server.";
        field_b = new boolean[]{true, true, true, true, true};
    }
}
