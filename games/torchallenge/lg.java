/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg {
    static int field_f;
    static int[][] field_d;
    qi[] field_a;
    static int[] field_e;
    static int field_c;
    static String field_b;

    final static void a(uj param0, byte param1, java.awt.Frame param2) {
        mi var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(-3816, param2);
          L1: while (true) {
            if (-1 != (var3.field_d ^ -1)) {
              if (1 == var3.field_d) {
                L2: {
                  if (param1 > 48) {
                    break L2;
                  } else {
                    var5 = null;
                    break L2;
                  }
                }
                param2.setVisible(false);
                param2.dispose();
                return;
              } else {
                c.a(-108, 100L);
                continue L0;
              }
            } else {
              c.a(-112, 10L);
              continue L1;
            }
          }
        }
    }

    final static int b(byte param0, int param1) {
        int[] var2 = null;
        int[] var3 = null;
        if (param0 == 84) {
          L0: {
            var3 = bj.field_d;
            var2 = var3;
            if (var3[4] == param1) {
              break L0;
            } else {
              if (var3[3] == param1) {
                break L0;
              } else {
                if (var3[2] != param1) {
                  if (param1 != var3[1]) {
                    if (var3[0] != param1) {
                      return -1;
                    } else {
                      return 2;
                    }
                  } else {
                    return 4;
                  }
                } else {
                  return 0;
                }
              }
            }
          }
          return 0;
        } else {
          return -106;
        }
    }

    final int a(String param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param0.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            L1: {
              if (param2 == 19) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (0 < var5) {
              return (-param3 + param1 << 562137096) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param0.charAt(var8);
            if (60 != var9) {
              if (var9 == 62) {
                var6 = 0;
                var8++;
                continue L0;
              } else {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -63) {
          L0: {
            L1: {
              if (null == ((lg) this).field_a) {
                break L1;
              } else {
                if (((lg) this).field_a.length > 0) {
                  stackOut_6_0 = ((lg) this).field_a[((lg) this).field_a.length - 1].field_e + -((lg) this).field_a[0].field_d;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 126;
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param1 == -1) {
          var2 = 0L;
          var4 = param0.length();
          var5 = 0;
          L0: while (true) {
            L1: {
              if (var4 <= var5) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var2 = var2 * 37L;
                    var6 = param0.charAt(var5);
                    if (var6 < 65) {
                      break L3;
                    } else {
                      if (var6 <= 90) {
                        var2 = var2 + (long)(-64 - -var6);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6 < 97) {
                      break L4;
                    } else {
                      if (var6 > 122) {
                        break L4;
                      } else {
                        var2 = var2 + (long)(-96 + var6);
                        break L2;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L2;
                  } else {
                    if (var6 > 57) {
                      break L2;
                    } else {
                      var2 = var2 + (long)(var6 + 27 - 48);
                      break L2;
                    }
                  }
                }
                if (var2 < 177917621779460413L) {
                  var5++;
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L5: while (true) {
              L6: {
                if ((var2 % 37L ^ -1L) != -1L) {
                  break L6;
                } else {
                  if (var2 == 0L) {
                    break L6;
                  } else {
                    var2 = var2 / 37L;
                    continue L5;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return 44L;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -27840) {
            Object var2 = null;
            lg.a(true, (byte) -97, (ej) null);
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        qi[] var3 = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 == 57) {
          L0: {
            var2 = -1;
            if (null == ((lg) this).field_a) {
              break L0;
            } else {
              var3 = ((lg) this).field_a;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b((byte) 104);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var2;
        } else {
          return 9;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        qi var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        qi[] var7 = ((lg) this).field_a;
        qi[] var3 = var7;
        if (param0 >= -103) {
            lg.a(-125);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_g.length > param1) {
                return var5.field_g[param1];
            }
            param1 = param1 - (var5.field_g.length + -1);
        }
        return 0;
    }

    final static void a(boolean param0, byte param1, ej param2) {
        if (param1 != -79) {
            field_e = null;
        }
        uc.a(param2, param1 + -3481, param0, 256);
    }

    final int a(byte param0, int param1) {
        qi var4 = null;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 != 7) {
            ((lg) this).field_a = null;
        }
        while (((lg) this).field_a.length > var3) {
            var4 = ((lg) this).field_a[var3];
            if (!(var4.field_g.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_g.length - 1);
            var3++;
        }
        return ((lg) this).field_a.length;
    }

    final static hb a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        hb var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        String var2 = g.a("jagex-last-login-method", (byte) 75, param0);
        if (var2 == null) {
            return ki.field_b;
        }
        hb[] var3 = dg.j(1);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, 0))) {
                return var5;
            }
        }
        if (param1 <= 125) {
            field_d = null;
        }
        return ki.field_b;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        qi var6 = null;
        int var7 = 0;
        int var8 = TorChallenge.field_F ? 1 : 0;
        if (((lg) this).field_a != null) {
            // ifeq L36
            // if_icmplt L36
        } else {
            return -1;
        }
        if (param2 > ((lg) this).field_a[-1 + ((lg) this).field_a.length].field_e) {
            return -1;
        }
        if (!(-2 != (((lg) this).field_a.length ^ -1))) {
            return ((lg) this).field_a[0].a(0, param0);
        }
        int var4 = 0;
        for (var5 = 0; ((lg) this).field_a.length > var5; var5++) {
            var6 = ((lg) this).field_a[var5];
            if (var6.field_d <= param2) {
                if (var6.field_e >= param2) {
                    var7 = var6.a(0, param0);
                    if (!(-1 != var7)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_g.length);
        }
        if (param1 != -77) {
            field_b = null;
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[][]{new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[20], new int[21]};
        field_c = 500;
    }
}
