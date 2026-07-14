/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    be[] field_c;
    static int field_a;
    static ib field_b;

    final int a(int param0, String param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          var5 = 0;
          var6 = 0;
          if (param3 == -79) {
            break L0;
          } else {
            var11 = null;
            aa.a(71, (java.applet.Applet) null);
            break L0;
          }
        }
        var7 = param1.length();
        var8 = 0;
        L1: while (true) {
          if (var7 <= var8) {
            if (0 < var5) {
              return (-param2 + param0 << 427847240) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L1;
            } else {
              if (62 == var9) {
                var6 = 0;
                var8++;
                continue L1;
              } else {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int b(int param0, int param1) {
        be var4 = null;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = 0;
        if (param1 >= 0) {
            field_b = null;
        }
        while (var3 < ((aa) this).field_c.length) {
            var4 = ((aa) this).field_c[var3];
            if (!(var4.field_c.length <= param0)) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_c.length);
            var3++;
        }
        return ((aa) this).field_c.length;
    }

    final static int a(ta param0, int param1, String param2, boolean param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          var5 = param0.a(param2);
          if (var5 > param1) {
            break L0;
          } else {
            if (param2.indexOf("<br>") != -1) {
              break L0;
            } else {
              param4[0] = (String) (Object) param4;
              return 1;
            }
          }
        }
        var6 = (var5 - -param1 + -1) / param1;
        if (param3) {
          param1 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param2.length();
          var9 = 0;
          L1: while (true) {
            if (var8 <= var9) {
              L2: {
                if (var7 >= var8) {
                  break L2;
                } else {
                  var6++;
                  param4[var6] = param2.substring(var7, var8).trim();
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param2.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (var10 != 45) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = param2.substring(var7, 1 + var9).trim();
                var12 = param0.a(var11);
                if (param1 > var12) {
                  break L3;
                } else {
                  var6++;
                  param4[var6] = var11;
                  var7 = var9 - -1;
                  break L3;
                }
              }
              if (var10 == 62) {
                if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                  var6++;
                  param4[var6] = param2.substring(var7, -3 + var9).trim();
                  var7 = 1 + var9;
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
        } else {
          return 23;
        }
    }

    final int a(int param0, int param1) {
        int var5 = 0;
        be var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        be[] var8 = ((aa) this).field_c;
        be[] var3 = var8;
        int var4 = -95 / ((32 - param0) / 51);
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (!(param1 >= var6.field_c.length)) {
                return var6.field_c[param1];
            }
            param1 = param1 - (-1 + var6.field_c.length);
        }
        return 0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 > -123) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(uf.a(param1, (byte) 107, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -1) {
            field_a = 39;
        }
    }

    final int b(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 62) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = ((aa) this).a(121, (String) null, 20, (byte) -1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((aa) this).field_c == null) {
              break L2;
            } else {
              if (0 < ((aa) this).field_c.length) {
                stackOut_6_0 = -((aa) this).field_c[0].field_a + ((aa) this).field_c[-1 + ((aa) this).field_c.length].field_f;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        if (!(vh.field_B == null)) {
            vh.field_B.b();
        }
        if (null != fc.field_k) {
            fc.field_k.b();
        }
        if (param0 != -11449) {
            aa.c(26);
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        be[] var3 = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
          L0: {
            var2 = -1;
            if (((aa) this).field_c != null) {
              var3 = ((aa) this).field_c;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a(-1);
                    if (var6 > var2) {
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
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -117;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        be var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (((aa) this).field_c == null) {
            break L0;
          } else {
            if (((aa) this).field_c.length == 0) {
              break L0;
            } else {
              if (((aa) this).field_c[0].field_a <= param1) {
                if (((aa) this).field_c[((aa) this).field_c.length + -1].field_f >= param1) {
                  if ((((aa) this).field_c.length ^ -1) != -2) {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param2 <= -100) {
                        break L1;
                      } else {
                        aa.a(-27);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 >= ((aa) this).field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((aa) this).field_c[var5];
                          if (var6.field_a > param1) {
                            break L3;
                          } else {
                            if (param1 <= var6.field_f) {
                              var7 = var6.a(0, param0);
                              if ((var7 ^ -1) != 0) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_c.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((aa) this).field_c[0].a(0, param0);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ib();
    }
}
