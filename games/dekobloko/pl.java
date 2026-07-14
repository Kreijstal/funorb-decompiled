/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private ng field_a;
    static String field_c;
    private ji field_g;
    static String field_e;
    static String field_f;
    private ji field_d;
    private ng field_b;

    final ud a(String param0, String param1, int param2) {
        if (param2 != 0) {
          ((pl) this).field_a = null;
          return this.a(param0, (int[]) null, param1, true);
        } else {
          return this.a(param0, (int[]) null, param1, true);
        }
    }

    final static void a(int param0) {
        if (param0 != 3970) {
            field_c = null;
            jc.a((byte) 103);
            return;
        }
        jc.a((byte) 103);
    }

    final ud a(int param0, int param1, int param2) {
        int var4 = -17 % ((-2 - param0) / 57);
        return this.a(121, param2, (int[]) null, param1);
    }

    final static java.net.URL a(String param0, String param1, boolean param2, java.net.URL param3, int param4) {
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
            var9 = client.field_A ? 1 : 0;
            var5 = param3.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
                    if (0 <= param4) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
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
                  if (0 > var7_int) {
                    break L3;
                  } else {
                    if (param1 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param0 == null) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              var7 = new StringBuilder(var6);
              if (!param2) {
                L6: {
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (-1 <= (param4 ^ -1)) {
                    break L6;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param4));
                    break L6;
                  }
                }
                L7: {
                  if (param1 == null) {
                    break L7;
                  } else {
                    if ((param1.length() ^ -1) < -1) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param0 == null) {
                    break L8;
                  } else {
                    if (0 < param0.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param0);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var6 >= var5.length()) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                    break L9;
                  }
                }
                try {
                  stackOut_39_0 = new java.net.URL(param3, var7.toString());
                  stackIn_40_0 = stackOut_39_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_40_0;
                }
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ud a(String param0, int[] param1, String param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param3 <= -17) {
          var5 = ((pl) this).field_d.b(-1, param2);
          if (0 <= var5) {
            var6 = ((pl) this).field_d.a(var5, 13030, param0);
            if ((var6 ^ -1) > -1) {
              return null;
            } else {
              return this.a(var6, param1, var5, -15027);
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          ud discarded$2 = ((pl) this).a((String) null, (String) null, 126);
          var5 = ((pl) this).field_d.b(-1, param2);
          if (0 <= var5) {
            var6 = ((pl) this).field_d.a(var5, 13030, param0);
            if ((var6 ^ -1) > -1) {
              return null;
            } else {
              return this.a(var6, param1, var5, -15027);
            }
          } else {
            return null;
          }
        }
    }

    final ud a(byte param0, String param1, String param2) {
        if (param0 != 101) {
            return null;
        }
        return this.a(param2, (int[]) null, param1, (byte) -75);
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 81 % ((param0 - -78) / 33);
        field_f = null;
    }

    private final ud a(String param0, int[] param1, String param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((pl) this).field_g.b(-1, param0);
        if (param3) {
          if (0 <= var5) {
            var6 = ((pl) this).field_g.a(var5, 13030, param2);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(119, var5, param1, var6);
            }
          } else {
            return null;
          }
        } else {
          ((pl) this).field_a = null;
          if (0 <= var5) {
            var6 = ((pl) this).field_g.a(var5, 13030, param2);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(119, var5, param1, var6);
            }
          } else {
            return null;
          }
        }
    }

    private final ud a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ud var8 = null;
        ud var8_ref = null;
        va var9 = null;
        va var10 = null;
        var5 = param0 ^ (65532 & param2 << 58549220 | param2 >>> 391646732);
        var5 = var5 | param2 << 13351536;
        var6 = 4294967296L ^ (long)var5;
        var8 = (ud) (Object) ((pl) this).field_b.a(var6, 126);
        if (var8 == null) {
          if (param1 != null) {
            if ((param1[0] ^ -1) < -1) {
              L0: {
                var10 = (va) (Object) ((pl) this).field_a.a(var6, 55);
                var9 = (va) (Object) ((pl) this).field_a.a(var6, 55);
                if (var10 != null) {
                  break L0;
                } else {
                  var9 = va.a(((pl) this).field_d, param2, param0);
                  if (var9 != null) {
                    ((pl) this).field_a.a(var6, param3 ^ 15026, (bh) (Object) var9);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              if (param3 == -15027) {
                var8_ref = var9.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9.b((byte) 101);
                  ((pl) this).field_b.a(var6, -1, (bh) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var10 = (va) (Object) ((pl) this).field_a.a(var6, 55);
              var9 = (va) (Object) ((pl) this).field_a.a(var6, 55);
              if (var10 != null) {
                break L1;
              } else {
                var9 = va.a(((pl) this).field_d, param2, param0);
                if (var9 != null) {
                  ((pl) this).field_a.a(var6, param3 ^ 15026, (bh) (Object) var9);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            if (param3 == -15027) {
              var8_ref = var9.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9.b((byte) 101);
                ((pl) this).field_b.a(var6, -1, (bh) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    private final ud a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ud var8 = null;
        bi var9 = null;
        ud var10 = null;
        ud var11 = null;
        bi var12 = null;
        ud var13 = null;
        bi var21 = null;
        ud var22 = null;
        bi var24 = null;
        ud var25 = null;
        var5 = param3 ^ (param1 << 1515294692 & 65531 | param1 >>> -487058036);
        var5 = var5 | param1 << 1656051856;
        if (param0 >= 113) {
          var6 = (long)var5;
          var11 = (ud) (Object) ((pl) this).field_b.a(var6, 106);
          var8 = (ud) (Object) ((pl) this).field_b.a(var6, 106);
          if (var11 == null) {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                var24 = bi.a(((pl) this).field_g, param1, param3);
                if (var24 == null) {
                  return null;
                } else {
                  L0: {
                    var25 = var24.b();
                    var8 = var25;
                    ((pl) this).field_b.a(var6, -1, (bh) (Object) var8);
                    if (param2 != null) {
                      param2[0] = param2[0] - var25.field_o.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              var24 = bi.a(((pl) this).field_g, param1, param3);
              if (var24 == null) {
                return null;
              } else {
                L1: {
                  var25 = var24.b();
                  var8 = var25;
                  ((pl) this).field_b.a(var6, -1, (bh) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var25.field_o.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8;
              }
            }
          } else {
            return var11;
          }
        } else {
          field_f = null;
          var6 = (long)var5;
          var11 = (ud) (Object) ((pl) this).field_b.a(var6, 106);
          var8 = (ud) (Object) ((pl) this).field_b.a(var6, 106);
          if (var11 == null) {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                var21 = bi.a(((pl) this).field_g, param1, param3);
                var9 = var21;
                if (var21 == null) {
                  return null;
                } else {
                  L2: {
                    var22 = var21.b();
                    var8 = var22;
                    ((pl) this).field_b.a(var6, -1, (bh) (Object) var8);
                    if (param2 != null) {
                      param2[0] = param2[0] - var22.field_o.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              var12 = bi.a(((pl) this).field_g, param1, param3);
              var9 = var12;
              if (var12 == null) {
                return null;
              } else {
                L3: {
                  var13 = var12.b();
                  var10 = var13;
                  var8 = var13;
                  ((pl) this).field_b.a(var6, -1, (bh) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var13.field_o.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8;
              }
            }
          } else {
            return var11;
          }
        }
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 != -1) {
            return null;
        }
        return this.a(param0, (int[]) null, param1, -15027);
    }

    pl(ji param0, ji param1) {
        ((pl) this).field_a = new ng(256);
        ((pl) this).field_b = new ng(256);
        ((pl) this).field_d = param1;
        ((pl) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "New Game";
        field_f = "You need to play 1 more rated game to unlock this option.";
        field_e = "Add <%0> to friend list";
    }
}
