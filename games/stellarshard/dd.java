/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static oj field_g;
    static int field_d;
    private int[] field_c;
    static pb field_a;
    static String field_h;
    static String field_b;
    static int field_e;
    static String field_i;
    static String field_f;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var8 = stellarshard.field_B;
            try {
              L0: {
                var9 = param1.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) sh.a("getcookies", param1, (byte) 78);
                var5 = qj.a(';', var4, 10287);
                var6 = param0;
                L1: while (true) {
                  if (var6 >= var5.length) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var5[var6].indexOf('=');
                      if (var7 < 0) {
                        break L2;
                      } else {
                        if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          stackOut_6_0 = var5[var6].substring(var7 - -1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (null != l.field_g) {
              return l.field_g;
            } else {
              return param1.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static bm a(int param0, byte param1, pf param2, pf param3, int param4) {
        if (param1 < 108) {
            dd.b(-57);
        }
        if (!tl.a(param2, (byte) -5, param0, param4)) {
            return null;
        }
        return sa.a(2376, param3.a(param4, 16, param0));
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -26269) {
            Object var2 = null;
            bm discarded$0 = dd.a(48, (byte) -60, (pf) null, (pf) null, 98);
        }
        field_h = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = stellarshard.field_B;
          if (param6 < param7) {
            if (param7 >= param5) {
              if (param6 < param5) {
                mg.a(param7, param3, param2, param4, param6, ti.field_a, -445834032, param1, param5);
                break L0;
              } else {
                mg.a(param7, param3, param2, param1, param5, ti.field_a, -445834032, param4, param6);
                break L0;
              }
            } else {
              mg.a(param5, param1, param2, param4, param6, ti.field_a, -445834032, param3, param7);
              break L0;
            }
          } else {
            if (param5 <= param6) {
              if (param5 <= param7) {
                mg.a(param6, param4, param2, param1, param5, ti.field_a, param0 + -445802484, param3, param7);
                break L0;
              } else {
                mg.a(param6, param4, param2, param3, param7, ti.field_a, -445834032, param1, param5);
                break L0;
              }
            } else {
              mg.a(param5, param1, param2, param3, param7, ti.field_a, -445834032, param4, param6);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -31548) {
            break L1;
          } else {
            var10 = null;
            String discarded$1 = dd.a(-27, (java.applet.Applet) null);
            break L1;
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 <= -48) {
          L0: {
            if (pk.field_e != null) {
              var1 = (Object) (Object) pk.field_e;
              synchronized (var1) {
                L1: {
                  pk.field_e = null;
                  break L1;
                }
              }
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = stellarshard.field_B;
        if (-1 == (param4 ^ -1)) {
          return 0;
        } else {
          var7 = 0;
          param4 = param4 + param2;
          var8 = param1;
          L0: while (true) {
            L1: {
              var9 = param0[var8];
              if (0 <= var9) {
                var7++;
                break L1;
              } else {
                var7 = ((dd) this).field_c[var7];
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = ((dd) this).field_c[var7];
                if (((dd) this).field_c[var7] >= 0) {
                  break L3;
                } else {
                  int incrementValue$8 = param2;
                  param2++;
                  param3[incrementValue$8] = (byte)(var10 ^ -1);
                  if (param4 <= param2) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L3;
                  }
                }
              }
              L4: {
                if ((64 & var9) == 0) {
                  var7++;
                  break L4;
                } else {
                  var7 = ((dd) this).field_c[var7];
                  break L4;
                }
              }
              L5: {
                var10 = ((dd) this).field_c[var7];
                if (((dd) this).field_c[var7] >= 0) {
                  break L5;
                } else {
                  int incrementValue$9 = param2;
                  param2++;
                  param3[incrementValue$9] = (byte)(var10 ^ -1);
                  if (param4 <= param2) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L5;
                  }
                }
              }
              L6: {
                if ((var9 & 32) != 0) {
                  var7 = ((dd) this).field_c[var7];
                  break L6;
                } else {
                  var7++;
                  break L6;
                }
              }
              L7: {
                var10 = ((dd) this).field_c[var7];
                if (((dd) this).field_c[var7] < 0) {
                  int incrementValue$10 = param2;
                  param2++;
                  param3[incrementValue$10] = (byte)(var10 ^ -1);
                  if (param2 >= param4) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if ((16 & var9) != 0) {
                  var7 = ((dd) this).field_c[var7];
                  break L8;
                } else {
                  var7++;
                  break L8;
                }
              }
              L9: {
                var10 = ((dd) this).field_c[var7];
                if (((dd) this).field_c[var7] >= 0) {
                  break L9;
                } else {
                  int incrementValue$11 = param2;
                  param2++;
                  param3[incrementValue$11] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L9;
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if (0 != (8 & var9)) {
                  var7 = ((dd) this).field_c[var7];
                  break L10;
                } else {
                  var7++;
                  break L10;
                }
              }
              L11: {
                var10 = ((dd) this).field_c[var7];
                if (((dd) this).field_c[var7] >= 0) {
                  break L11;
                } else {
                  int incrementValue$12 = param2;
                  param2++;
                  param3[incrementValue$12] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L11;
                  } else {
                    break L2;
                  }
                }
              }
              L12: {
                if ((var9 & 4) != 0) {
                  var7 = ((dd) this).field_c[var7];
                  break L12;
                } else {
                  var7++;
                  break L12;
                }
              }
              L13: {
                var10 = ((dd) this).field_c[var7];
                if (0 > ((dd) this).field_c[var7]) {
                  int incrementValue$13 = param2;
                  param2++;
                  param3[incrementValue$13] = (byte)(var10 ^ -1);
                  if (param2 >= param4) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L14: {
                if ((var9 & 2) != 0) {
                  var7 = ((dd) this).field_c[var7];
                  break L14;
                } else {
                  var7++;
                  break L14;
                }
              }
              L15: {
                var10 = ((dd) this).field_c[var7];
                if (-1 < (((dd) this).field_c[var7] ^ -1)) {
                  int incrementValue$14 = param2;
                  param2++;
                  param3[incrementValue$14] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L15;
                  } else {
                    break L2;
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if ((1 & var9) != 0) {
                  var7 = ((dd) this).field_c[var7];
                  break L16;
                } else {
                  var7++;
                  break L16;
                }
              }
              var10 = ((dd) this).field_c[var7];
              if (0 > ((dd) this).field_c[var7]) {
                int incrementValue$15 = param2;
                param2++;
                param3[incrementValue$15] = (byte)(var10 ^ -1);
                if (param4 > param2) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  break L2;
                }
              } else {
                var8++;
                continue L0;
              }
            }
            L17: {
              if (param5) {
                break L17;
              } else {
                dd.b(-68);
                break L17;
              }
            }
            return -param1 + 1 + var8;
          }
        }
    }

    private dd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new oj();
        field_h = "Email: ";
        field_b = "Orb coins: <%0>";
        field_f = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_i = "Free game ending in ";
    }
}
