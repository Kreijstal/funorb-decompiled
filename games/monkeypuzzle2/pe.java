/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static le[] field_a;
    private int[] field_b;
    static wg[] field_d;
    static String field_c;

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != 16711680) {
          var2 = null;
          pe.a((String) null, (byte) -124, (java.applet.Applet) null);
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            e.field_c = param0;
            String var6 = param2.getParameter("cookieprefix");
            String var5 = var6;
            var5 = var6;
            String var4 = param2.getParameter("cookiehost");
            var5 = var4;
            var5 = var4;
            if (param1 != -108) {
                return;
            }
            try {
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (0 == param0.length()) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + ha.a((byte) -127, pf.a(0) - -94608000000L) + "; Max-Age=" + 94608000L;
                }
                mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            tf.a((byte) -53, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 69 / ((param0 - -50) / 44);
        if (!(!ok.field_e)) {
            pl.field_e.c("Clearances With Monkeys: " + dc.field_e, 635, 30, 16711680, 1);
            pl.field_e.c("Clearances WithOut Monkeys: " + ek.field_b, 635, 50, 16711680, 1);
            pl.field_e.c("Nuts Fired: " + sc.field_c, 635, 70, 16711680, 1);
            pl.field_e.c("Size of last detatched clump " + ke.field_c, 635, 90, 16711680, 1);
            pl.field_e.c("FPS: " + s.field_T, 635, 110, 16711680, 1);
            pl.field_e.c("LPS: " + jf.field_g, 635, 130, 16711680, 1);
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param3 == 0) {
          return 0;
        } else {
          var7 = 0;
          param3 = param3 + param1;
          if (param0 == -1) {
            var8 = param2;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (-1 >= (var9 ^ -1)) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] < 0) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param2 + var8 - -1;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if ((64 & var9) != 0) {
                  var7 = ((pe) this).field_b[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] >= 0) {
                  break L4;
                } else {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param2 + var8 - -1;
                  }
                }
              }
              L5: {
                if (-1 != (32 & var9 ^ -1)) {
                  var7 = ((pe) this).field_b[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] >= 0) {
                  break L6;
                } else {
                  param1++;
                  param4[param1] = (byte)var10;
                  if (param3 > param1) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param2 + var8 - -1;
                  }
                }
              }
              L7: {
                if (-1 == (var9 & 16)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] >= 0) {
                  break L8;
                } else {
                  param1++;
                  param4[param1] = (byte)var10;
                  if (param3 > param1) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param2 + var8 - -1;
                  }
                }
              }
              L9: {
                if (-1 == (8 & var9)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] < 0) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param2 + var8 - -1;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var9 & 4) == 0) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] >= 0) {
                  break L12;
                } else {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L12;
                  } else {
                    return -param2 + var8 - -1;
                  }
                }
              }
              L13: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((pe) this).field_b[var7];
                if (0 > ((pe) this).field_b[var7]) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param2 + var8 - -1;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if ((var9 & 1) == -1) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L15;
                }
              }
              var10 = ((pe) this).field_b[var7];
              if (-1 <= ((pe) this).field_b[var7]) {
                var8++;
                continue L0;
              } else {
                param1++;
                param4[param1] = (byte)(var10 ^ -1);
                if (param1 < param3) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return -param2 + var8 - -1;
                }
              }
            }
          } else {
            field_a = null;
            var8 = param2;
            L16: while (true) {
              L17: {
                var9 = param5[var8];
                if (-1 >= (var9 ^ -1)) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((pe) this).field_b[var7];
                  break L17;
                }
              }
              L18: {
                var10 = ((pe) this).field_b[var7];
                if (((pe) this).field_b[var7] < 0) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param3 > param1) {
                    var7 = 0;
                    break L18;
                  } else {
                    return -param2 + var8 - -1;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if ((64 & var9) != 0) {
                  var7 = ((pe) this).field_b[var7];
                  break L19;
                } else {
                  var7++;
                  break L19;
                }
              }
              L20: {
                L21: {
                  var10 = ((pe) this).field_b[var7];
                  if (((pe) this).field_b[var7] >= 0) {
                    break L21;
                  } else {
                    param1++;
                    param4[param1] = (byte)var10;
                    if (param1 < param3) {
                      var7 = 0;
                      break L21;
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (-1 != (32 & var9)) {
                    var7 = ((pe) this).field_b[var7];
                    break L22;
                  } else {
                    var7++;
                    break L22;
                  }
                }
                L23: {
                  var10 = ((pe) this).field_b[var7];
                  if (((pe) this).field_b[var7] >= 0) {
                    break L23;
                  } else {
                    param1++;
                    param4[param1] = (byte)(var10 ^ -1);
                    if (param3 > param1) {
                      var7 = 0;
                      break L23;
                    } else {
                      return -param2 + var8 - -1;
                    }
                  }
                }
                L24: {
                  if (-1 == (var9 & 16 ^ -1)) {
                    var7++;
                    break L24;
                  } else {
                    var7 = ((pe) this).field_b[var7];
                    break L24;
                  }
                }
                L25: {
                  var10 = ((pe) this).field_b[var7];
                  if (((pe) this).field_b[var7] >= 0) {
                    break L25;
                  } else {
                    param1++;
                    param4[param1] = (byte)var10;
                    if (param3 > param1) {
                      var7 = 0;
                      break L25;
                    } else {
                      return -param2 + var8 - -1;
                    }
                  }
                }
                L26: {
                  if (-1 == (8 & var9)) {
                    var7++;
                    break L26;
                  } else {
                    var7 = ((pe) this).field_b[var7];
                    break L26;
                  }
                }
                L27: {
                  var10 = ((pe) this).field_b[var7];
                  if (((pe) this).field_b[var7] < 0) {
                    param1++;
                    param4[param1] = (byte)(var10 ^ -1);
                    if (param1 < param3) {
                      var7 = 0;
                      break L27;
                    } else {
                      return -param2 + var8 - -1;
                    }
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if ((var9 & 4) == 0) {
                    var7++;
                    break L28;
                  } else {
                    var7 = ((pe) this).field_b[var7];
                    break L28;
                  }
                }
                L29: {
                  var10 = ((pe) this).field_b[var7];
                  if (((pe) this).field_b[var7] >= 0) {
                    break L29;
                  } else {
                    param1++;
                    param4[param1] = (byte)(var10 ^ -1);
                    if (param3 > param1) {
                      var7 = 0;
                      break L29;
                    } else {
                      break L20;
                    }
                  }
                }
                L30: {
                  if ((2 & var9) == 0) {
                    var7++;
                    break L30;
                  } else {
                    var7 = ((pe) this).field_b[var7];
                    break L30;
                  }
                }
                L31: {
                  var10 = ((pe) this).field_b[var7];
                  if (0 > ((pe) this).field_b[var7]) {
                    param1++;
                    param4[param1] = (byte)(var10 ^ -1);
                    if (param1 < param3) {
                      var7 = 0;
                      break L31;
                    } else {
                      return -param2 + var8 - -1;
                    }
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((var9 & 1) == -1) {
                    var7++;
                    break L32;
                  } else {
                    var7 = ((pe) this).field_b[var7];
                    break L32;
                  }
                }
                var10 = ((pe) this).field_b[var7];
                if (-1 <= ((pe) this).field_b[var7]) {
                  var8++;
                  continue L16;
                } else {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param3) {
                    var7 = 0;
                    var8++;
                    continue L16;
                  } else {
                    break L20;
                  }
                }
              }
              return -param2 + var8 - -1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wg[17];
        field_c = "Tips: <%0>";
    }
}
