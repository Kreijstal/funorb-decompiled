/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var11 = null;
        char[] var14 = null;
        char[] var16 = null;
        char[] var25 = null;
        char[] var26 = null;
        char[] var27 = null;
        char[] var28 = null;
        char[] var29 = null;
        char[] var34 = null;
        char[] var37 = null;
        char[] var39 = null;
        char[] var48 = null;
        char[] var49 = null;
        char[] var50 = null;
        char[] var51 = null;
        char[] var52 = null;
        var5 = Geoblox.field_C;
        if (0 >= param1) {
          L0: {
            if (param1 < 160) {
              if (param0 == -112) {
                if (param1 != 0) {
                  var52 = lf.field_e;
                  var29 = var52;
                  var6 = var29;
                  var2 = var6;
                  var3 = 0;
                  L1: while (true) {
                    if (var52.length <= var3) {
                      break L0;
                    } else {
                      var4 = var52[var3];
                      if (var4 == param1) {
                        return true;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                field_b = null;
                if (param1 != 0) {
                  var51 = lf.field_e;
                  var28 = var51;
                  var6 = var28;
                  var2 = var6;
                  var3 = 0;
                  L2: while (true) {
                    if (var51.length <= var3) {
                      return false;
                    } else {
                      var4 = var51[var3];
                      if (var4 == param1) {
                        return true;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              if (255 >= param1) {
                return true;
              } else {
                if (param0 == -112) {
                  if (param1 != 0) {
                    var50 = lf.field_e;
                    var27 = var50;
                    var6 = var27;
                    var2 = var6;
                    var3 = 0;
                    L3: while (true) {
                      if (var50.length <= var3) {
                        break L0;
                      } else {
                        var4 = var50[var3];
                        if (var4 == param1) {
                          return true;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  field_b = null;
                  if (param1 != 0) {
                    var49 = lf.field_e;
                    var26 = var49;
                    var6 = var26;
                    var2 = var6;
                    var3 = 0;
                    L4: while (true) {
                      if (var49.length <= var3) {
                        return false;
                      } else {
                        var4 = var49[var3];
                        if (var4 == param1) {
                          return true;
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          if (128 <= param1) {
            if (param1 < 160) {
              if (param0 == -112) {
                if (param1 != 0) {
                  var48 = lf.field_e;
                  var25 = var48;
                  var6 = var25;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var48.length <= var3) {
                      return false;
                    } else {
                      var4 = var48[var3];
                      if (var4 == param1) {
                        return true;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                field_b = null;
                if (param1 != 0) {
                  var39 = lf.field_e;
                  var16 = var39;
                  var6 = var16;
                  var2 = var6;
                  var3 = 0;
                  L6: while (true) {
                    if (var39.length <= var3) {
                      return false;
                    } else {
                      var4 = var39[var3];
                      if (var4 == param1) {
                        return true;
                      } else {
                        var3++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              if (255 < param1) {
                if (param0 != -112) {
                  field_b = null;
                  if (param1 != 0) {
                    var37 = lf.field_e;
                    var14 = var37;
                    var6 = var14;
                    var2 = var6;
                    var3 = 0;
                    L7: while (true) {
                      if (var37.length > var3) {
                        var4 = var37[var3];
                        if (var4 == param1) {
                          return true;
                        } else {
                          var3++;
                          continue L7;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  if (param1 != 0) {
                    var34 = lf.field_e;
                    var11 = var34;
                    var6 = var11;
                    var2 = var6;
                    var3 = 0;
                    L8: while (true) {
                      if (var34.length > var3) {
                        var4 = var34[var3];
                        if (var4 == param1) {
                          return true;
                        } else {
                          var3++;
                          continue L8;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            tc.a(false);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            sd.field_z = param1;
            try {
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (param1.length() != 0) {
                    var5 = var8 + "; Expires=" + md.a((byte) -58, oa.a(-12520) - -94608000000L) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                int var6 = -93 % ((-64 - param0) / 61);
                wk.a(param2, "document.cookie=\"" + var5 + "\"", (byte) -92);
            } catch (Throwable throwable) {
            }
            oj.a(param2, 20000000);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_b = "Quit";
    }
}
