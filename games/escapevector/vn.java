/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

abstract class vn {
    int field_d;
    static al field_g;
    static hh field_c;
    static cn field_e;
    int field_h;
    static String field_b;
    static int[][] field_a;
    java.awt.Image field_f;
    int[] field_i;

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 < 72) {
            return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0) {
        if (param0 <= 105) {
            vn.a((byte) -18);
        }
        em.a(((vn) this).field_i, ((vn) this).field_d, ((vn) this).field_h);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var9 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = EscapeVector.field_A;
        if (0 >= param1) {
            var4 = param0;
        } else {
            var9 = new byte[param2];
            var4 = var9;
            for (var5_int = 0; var5_int < param2; var5_int++) {
                var9[var5_int] = param0[param1 + var5_int];
            }
        }
        lj var5 = new lj();
        var5.b(false);
        var5.a((long)(8 * param2), var4, 2);
        byte[] var6 = new byte[64];
        var5.a(0, var6, false);
        if (param3 != 0) {
            Object var8 = null;
            d discarded$0 = vn.a((byte) 62, (String) null);
        }
        return var6;
    }

    final static d a(byte param0, String param1) {
        if (param0 < 24) {
            field_g = null;
        }
        return new d(param1);
    }

    final static java.net.URL a(String param0, int param1, String param2, java.net.URL param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_48_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_47_0 = null;
            var9 = EscapeVector.field_A;
            var5 = param3.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    if ((param1 ^ -1) <= -1) {
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
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) > -1) {
                    break L3;
                  } else {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L3;
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
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int ^ -1) <= -1) {
                  if (param0 != null) {
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
              var7 = new StringBuilder(var6);
              if (param4 == 1) {
                L6: {
                  StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                  if (param1 > 0) {
                    StringBuilder discarded$14 = var7.append("/l=");
                    StringBuilder discarded$15 = var7.append(Integer.toString(param1));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param2 != null) {
                    if (-1 < param2.length()) {
                      StringBuilder discarded$16 = var7.append("/p=");
                      StringBuilder discarded$17 = var7.append(param2);
                      if (param0 == null) {
                        break L7;
                      } else {
                        if (-1 <= (param0.length() ^ -1)) {
                          break L7;
                        } else {
                          StringBuilder discarded$18 = var7.append("/s=");
                          StringBuilder discarded$19 = var7.append(param0);
                          break L7;
                        }
                      }
                    } else {
                      if (param0 == null) {
                        break L7;
                      } else {
                        if (-1 <= (param0.length() ^ -1)) {
                          break L7;
                        } else {
                          StringBuilder discarded$20 = var7.append("/s=");
                          StringBuilder discarded$21 = var7.append(param0);
                          break L7;
                        }
                      }
                    }
                  } else {
                    if (param0 == null) {
                      break L7;
                    } else {
                      if (-1 <= param0.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$22 = var7.append("/s=");
                        StringBuilder discarded$23 = var7.append(param0);
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (var6 >= var5.length()) {
                    StringBuilder discarded$24 = var7.append(47);
                    break L8;
                  } else {
                    StringBuilder discarded$25 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  }
                }
                try {
                  stackOut_47_0 = new java.net.URL(param3, var7.toString());
                  stackIn_48_0 = stackOut_47_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_48_0;
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

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          var2 = 0L;
          var4 = param1.length();
          if (param0 >= 47) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-64 + var6);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (122 < var6) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-97 + (var6 + 1));
                      break L3;
                    }
                  }
                }
                if (48 > var6) {
                  break L3;
                } else {
                  if (57 >= var6) {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 < 177917621779460413L) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new al();
        field_b = "That name is not available";
        field_e = new cn();
        field_a = new int[][]{new int[2], new int[1], new int[1]};
    }
}
