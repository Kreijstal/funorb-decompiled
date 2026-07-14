/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc implements ad {
    private int field_d;
    static boolean field_e;
    private int field_a;
    static String field_b;
    private we field_c;

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            nj.field_a = param1;
            try {
                var6 = param0.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                if (param2 < 66) {
                    field_b = null;
                }
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param1.length() == 0) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + e.a(sf.a((byte) -122) - -94608000000L, -127) + "; Max-Age=" + 94608000L;
                }
                lk.a(param0, "document.cookie=\"" + var5 + "\"", (byte) -106);
            } catch (Throwable throwable) {
            }
            ie.a(param0, true);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        int var1 = -96 % ((33 - param0) / 63);
        field_b = null;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        if (!param2.field_x) {
          if (!param2.k(param0 + -12174)) {
            var6 = 2188450;
            if (param0 == 12088) {
              int discarded$6 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
              if (param2.k(-105)) {
                var7 = ((nc) this).field_c.a(param2.field_s);
                var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                var9 = param2.field_u + param1;
                var10 = param3 - -param2.field_t;
                if (((nc) this).field_a != 2) {
                  if (1 == ((nc) this).field_a) {
                    var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                    if (-3 == ((nc) this).field_d) {
                      var10 = var10 + (param2.field_q + -var8);
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    } else {
                      L0: {
                        if (-2 != ((nc) this).field_d) {
                          break L0;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L0;
                        }
                      }
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    }
                  } else {
                    if (-3 == ((nc) this).field_d) {
                      var10 = var10 + (param2.field_q + -var8);
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    } else {
                      L1: {
                        if (-2 != ((nc) this).field_d) {
                          break L1;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L1;
                        }
                      }
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    }
                  }
                } else {
                  var9 = var9 + (-var7 + param2.field_v);
                  if (-3 == ((nc) this).field_d) {
                    var10 = var10 + (param2.field_q + -var8);
                    se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                    return;
                  } else {
                    L2: {
                      if (-2 != ((nc) this).field_d) {
                        break L2;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L2;
                      }
                    }
                    se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              field_b = null;
              int discarded$7 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
              if (param2.k(-105)) {
                var7 = ((nc) this).field_c.a(param2.field_s);
                var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                var9 = param2.field_u + param1;
                var10 = param3 - -param2.field_t;
                if (((nc) this).field_a != 2) {
                  if (1 == ((nc) this).field_a) {
                    var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                    if (-3 == ((nc) this).field_d) {
                      var10 = var10 + (param2.field_q + -var8);
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    } else {
                      L3: {
                        if (-2 != ((nc) this).field_d) {
                          break L3;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L3;
                        }
                      }
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    }
                  } else {
                    L4: {
                      if (-3 != ((nc) this).field_d) {
                        if (-2 != ((nc) this).field_d) {
                          break L4;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L4;
                        }
                      } else {
                        var10 = var10 + (param2.field_q + -var8);
                        break L4;
                      }
                    }
                    se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                    return;
                  }
                } else {
                  L5: {
                    var9 = var9 + (-var7 + param2.field_v);
                    if (-3 != ((nc) this).field_d) {
                      if (-2 != ((nc) this).field_d) {
                        break L5;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L5;
                      }
                    } else {
                      var10 = var10 + (param2.field_q + -var8);
                      break L5;
                    }
                  }
                  se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var6 = 3249872;
            if (param0 == 12088) {
              int discarded$8 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
              if (param2.k(-105)) {
                var7 = ((nc) this).field_c.a(param2.field_s);
                var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                var9 = param2.field_u + param1;
                var10 = param3 - -param2.field_t;
                if (((nc) this).field_a != 2) {
                  if (1 == ((nc) this).field_a) {
                    var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                    if (-3 == ((nc) this).field_d) {
                      var10 = var10 + (param2.field_q + -var8);
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    } else {
                      L6: {
                        if (-2 != ((nc) this).field_d) {
                          break L6;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L6;
                        }
                      }
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    }
                  } else {
                    if (-3 == ((nc) this).field_d) {
                      var10 = var10 + (param2.field_q + -var8);
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    } else {
                      L7: {
                        if (-2 != ((nc) this).field_d) {
                          break L7;
                        } else {
                          var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                          break L7;
                        }
                      }
                      se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                      return;
                    }
                  }
                } else {
                  L8: {
                    var9 = var9 + (-var7 + param2.field_v);
                    if (-3 != ((nc) this).field_d) {
                      if (-2 != ((nc) this).field_d) {
                        break L8;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L8;
                      }
                    } else {
                      var10 = var10 + (param2.field_q + -var8);
                      break L8;
                    }
                  }
                  se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                  return;
                }
              } else {
                return;
              }
            } else {
              L9: {
                field_b = null;
                int discarded$9 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
                if (param2.k(-105)) {
                  L10: {
                    var7 = ((nc) this).field_c.a(param2.field_s);
                    var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                    var9 = param2.field_u + param1;
                    var10 = param3 - -param2.field_t;
                    if (((nc) this).field_a != 2) {
                      if (1 == ((nc) this).field_a) {
                        var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      var9 = var9 + (-var7 + param2.field_v);
                      break L10;
                    }
                  }
                  L11: {
                    if (-3 != ((nc) this).field_d) {
                      if (-2 != ((nc) this).field_d) {
                        break L11;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L11;
                      }
                    } else {
                      var10 = var10 + (param2.field_q + -var8);
                      break L11;
                    }
                  }
                  se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        } else {
          var6 = 3249872;
          if (param0 == 12088) {
            int discarded$10 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
            if (param2.k(-105)) {
              var7 = ((nc) this).field_c.a(param2.field_s);
              var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
              var9 = param2.field_u + param1;
              var10 = param3 - -param2.field_t;
              if (((nc) this).field_a != 2) {
                if (1 == ((nc) this).field_a) {
                  var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                  if (-3 == ((nc) this).field_d) {
                    var10 = var10 + (param2.field_q + -var8);
                    se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                    return;
                  } else {
                    L12: {
                      if (-2 != ((nc) this).field_d) {
                        break L12;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L12;
                      }
                    }
                    se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                    return;
                  }
                } else {
                  L13: {
                    if (-3 != ((nc) this).field_d) {
                      if (-2 != ((nc) this).field_d) {
                        break L13;
                      } else {
                        var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                        break L13;
                      }
                    } else {
                      var10 = var10 + (param2.field_q + -var8);
                      break L13;
                    }
                  }
                  se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                  return;
                }
              } else {
                L14: {
                  var9 = var9 + (-var7 + param2.field_v);
                  if (-3 != ((nc) this).field_d) {
                    if (-2 != ((nc) this).field_d) {
                      break L14;
                    } else {
                      var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                      break L14;
                    }
                  } else {
                    var10 = var10 + (param2.field_q + -var8);
                    break L14;
                  }
                }
                se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                return;
              }
            } else {
              return;
            }
          } else {
            L15: {
              field_b = null;
              int discarded$11 = ((nc) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
              if (param2.k(-105)) {
                L16: {
                  var7 = ((nc) this).field_c.a(param2.field_s);
                  var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                  var9 = param2.field_u + param1;
                  var10 = param3 - -param2.field_t;
                  if (((nc) this).field_a != 2) {
                    if (1 == ((nc) this).field_a) {
                      var9 = var9 + (param2.field_v + -var7 >> -1146550079);
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    var9 = var9 + (-var7 + param2.field_v);
                    break L16;
                  }
                }
                L17: {
                  if (-3 != ((nc) this).field_d) {
                    if (-2 != ((nc) this).field_d) {
                      break L17;
                    } else {
                      var10 = var10 + (-var8 + param2.field_q >> 1274345089);
                      break L17;
                    }
                  } else {
                    var10 = var10 + (param2.field_q + -var8);
                    break L17;
                  }
                }
                se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
                break L15;
              } else {
                break L15;
              }
            }
            return;
          }
        }
    }

    public nc() {
        ((nc) this).field_a = 1;
        ((nc) this).field_d = 1;
        ((nc) this).field_c = bn.field_d;
    }

    nc(we param0, int param1, int param2) {
        ((nc) this).field_c = param0;
        ((nc) this).field_a = param1;
        ((nc) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_b = "Here Lies Crushed";
    }
}
