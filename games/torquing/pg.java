/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class pg {
    static String field_a;

    final static void a(byte param0) {
        if (jh.field_z != -pf.field_A + 0) {
          if (jh.field_z != 250 + -pf.field_A) {
            jh.field_z = jh.field_z + 1;
            if (param0 != -3) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            jh.field_z = jh.field_z + 1;
            if (param0 != -3) {
              field_a = null;
              return;
            } else {
              return;
            }
          }
        } else {
          jh.field_z = jh.field_z + 1;
          if (param0 != -3) {
            field_a = null;
            return;
          } else {
            return;
          }
        }
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_40_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            var9 = Torquing.field_u;
            var5 = param2.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int < 0) {
                    break L1;
                  } else {
                    if (0 <= param0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (-1 < (var7_int ^ -1)) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int ^ -1) <= -1) {
                    if (param4 == null) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if (0 <= var7_int) {
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (-1 <= (param0 ^ -1)) {
                  break L6;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                  break L6;
                }
              }
              L7: {
                if (param4 == null) {
                  break L7;
                } else {
                  if (param4.length() > 0) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param4);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param1 == null) {
                  break L8;
                } else {
                  if (-1 > (param1.length() ^ -1)) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param3 == 47) {
                  break L9;
                } else {
                  field_a = null;
                  break L9;
                }
              }
              L10: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L10;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L10;
                }
              }
              try {
                stackOut_39_0 = new java.net.URL(param2, var7.toString());
                stackIn_40_0 = stackOut_39_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_40_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dn a(int param0, String param1, int param2) {
        dn var3 = null;
        var3 = new dn(false);
        var3.field_a = param0;
        var3.field_e = param1;
        if (param2 != -1) {
          return null;
        } else {
          return var3;
        }
    }

    final static boolean a(boolean param0, la param1) {
        if (!param0) {
            return true;
        }
        return param1.c(-19375);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 47) {
            int discarded$0 = pg.a(-90, (byte) 40);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        pd.field_c = 0;
        up.field_a = null;
        rd.field_x = null;
        var2 = tl.field_u;
        tl.field_u = gi.field_c;
        if (param0 != 51) {
          if (50 != param0) {
            nn.field_c.field_k = 1;
            nn.field_c.field_g = nn.field_c.field_g + 1;
            gi.field_c = var2;
            if (param1 < -27) {
              L0: {
                if (2 > nn.field_c.field_g) {
                  break L0;
                } else {
                  if (param0 != 51) {
                    break L0;
                  } else {
                    return 2;
                  }
                }
              }
              if (2 > nn.field_c.field_g) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (-51 == (param0 ^ -1)) {
                  return 5;
                } else {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              field_a = null;
              if (2 <= nn.field_c.field_g) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 == param0) {
                      return 5;
                    } else {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if (nn.field_c.field_g <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 == (param0 ^ -1)) {
                    return 5;
                  } else {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              }
            }
          } else {
            nn.field_c.field_k = 5;
            nn.field_c.field_g = nn.field_c.field_g + 1;
            gi.field_c = var2;
            if (param1 < -27) {
              if (2 <= nn.field_c.field_g) {
                if (param0 != 51) {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 != param0) {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if (nn.field_c.field_g <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            } else {
              field_a = null;
              if (2 <= nn.field_c.field_g) {
                if (param0 != 51) {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 != (param0 ^ -1)) {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            }
          }
        } else {
          nn.field_c.field_k = 2;
          nn.field_c.field_g = nn.field_c.field_g + 1;
          gi.field_c = var2;
          if (param1 >= -27) {
            field_a = null;
            if (2 <= nn.field_c.field_g) {
              if (param0 != 51) {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if (2 > nn.field_c.field_g) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (-51 != (param0 ^ -1)) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            L1: {
              if (2 > nn.field_c.field_g) {
                break L1;
              } else {
                if (param0 != 51) {
                  break L1;
                } else {
                  return 2;
                }
              }
            }
            if (2 > nn.field_c.field_g) {
              if ((nn.field_c.field_g ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (-51 != (param0 ^ -1)) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for textures";
    }
}
