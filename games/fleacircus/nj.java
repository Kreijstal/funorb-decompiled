/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.net.URL;

final class nj {
    private int field_f;
    private ji[] field_e;
    static dd field_b;
    private int field_c;
    static String field_d;
    private int field_g;
    static od field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 29 / ((-60 - param0) / 36);
        field_a = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = ((nj) this).field_e.length + -1;
        L0: while (true) {
          if (0 > var2) {
            if (param0 >= -24) {
              ((nj) this).field_e = null;
              return;
            } else {
              return;
            }
          } else {
            if (null != ((nj) this).field_e[var2]) {
              ((nj) this).field_e[var2].b(true);
              var2--;
              continue L0;
            } else {
              var2--;
              continue L0;
            }
          }
        }
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = fleas.field_A ? 1 : 0;
            var5 = param3.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int ^ -1) > -1) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) <= -1) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if ((var7_int ^ -1) > -1) {
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
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
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
                if ((var7_int ^ -1) <= -1) {
                  if (param4 != null) {
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
                if (param0 == 53) {
                  break L6;
                } else {
                  field_b = null;
                  break L6;
                }
              }
              L7: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (0 < param1) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param2 == null) {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (-1 >= param4.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/s=");
                      StringBuilder discarded$13 = var7.append(param4);
                      break L8;
                    }
                  }
                } else {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (-1 <= param4.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var5.length() <= var6) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                }
              }
              try {
                stackOut_41_0 = new java.net.URL(param3, var7.toString());
                stackIn_42_0 = stackOut_41_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_42_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = fleas.field_A ? 1 : 0;
          if (gb.field_l > param3) {
            param2 = param2 - (gb.field_l - param3);
            param3 = gb.field_l;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 + param3 <= gb.field_h) {
            break L1;
          } else {
            param2 = gb.field_h + -param3;
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_b) {
            break L2;
          } else {
            param4 = param4 - (-param0 + gb.field_b);
            param0 = gb.field_b;
            break L2;
          }
        }
        L3: {
          if (gb.field_i >= param4 + param0) {
            break L3;
          } else {
            param4 = -param0 + gb.field_i;
            break L3;
          }
        }
        if (0 < param2) {
          if (0 >= param4) {
            return;
          } else {
            L4: {
              var6 = param0 * gb.field_d + param3;
              var7 = gb.field_d - param2;
              if (param5 == 1067) {
                break L4;
              } else {
                nj.a((byte) 101);
                break L4;
              }
            }
            param0 = -param4;
            L5: while (true) {
              if (0 <= param0) {
                return;
              } else {
                param3 = -param2;
                L6: while (true) {
                  if (0 <= param3) {
                    var6 = var6 + var7;
                    param0++;
                    continue L5;
                  } else {
                    var8 = gb.field_a[var6];
                    if (param1 < (65280 & var8) >> 1876065320) {
                      if ((var8 >> 875236872 & 255) >= (16711680 & var8) >> -275225488) {
                        L7: {
                          var9 = -60 + (510 & var8 >> 236763183);
                          if (-256 <= (var9 ^ -1)) {
                            break L7;
                          } else {
                            var9 = 255;
                            break L7;
                          }
                        }
                        var10 = 65280 & var8;
                        var10 = (var10 >> 1802518369) + -(var10 >> 937195909) & 65280;
                        var11 = (255 & var8) >> 1748457475;
                        gb.field_a[var6] = ne.a(ne.a(var9 << 1760663824, var10), var11);
                        var6++;
                        param3++;
                        continue L6;
                      } else {
                        var6++;
                        param3++;
                        continue L6;
                      }
                    } else {
                      var6++;
                      param3++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        int var6 = 0;
        ((nj) this).field_c = param0 + db.a((byte) -115, na.field_c, param2);
        ((nj) this).field_f = param1 - -db.a((byte) -115, na.field_c, param3);
        ((nj) this).field_e = new ji[50 - -db.a((byte) -115, na.field_c, 5)];
        for (var6 = ((nj) this).field_e.length + -1; var6 >= 0; var6--) {
            ((nj) this).field_e[var6] = new ji(((nj) this).field_c, ((nj) this).field_f, db.a((byte) -115, na.field_c, 1024), param4);
        }
        ((nj) this).field_g = db.a((byte) -115, na.field_c, 3) + 2;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != -9340) {
          L0: {
            nj.a(-16);
            if (gf.field_d > 32) {
              L1: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L1;
                } else {
                  break L1;
                }
              }
              ia.a(true, gf.field_d - var1);
              break L0;
            } else {
              ia.a(true, 0);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (gf.field_d > 32) {
              L3: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              ia.a(true, gf.field_d - var1);
              break L2;
            } else {
              ia.a(true, 0);
              break L2;
            }
          }
          return;
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        var4 = -1 + ((nj) this).field_e.length;
        L0: while (true) {
          if ((var4 ^ -1) > -1) {
            return var2 != 0;
          } else {
            if (null != ((nj) this).field_e[var4]) {
              ((nj) this).field_e[var4].a(((nj) this).field_g, (byte) -128);
              var2 = var2 != 0 & ((nj) this).field_e[var4].a(true) ? 1 : 0;
              var4--;
              continue L0;
            } else {
              var4--;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
