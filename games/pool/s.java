/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static int[][] field_b;
    static String field_g;
    static int[] field_e;
    static di field_a;
    static int[] field_f;
    static ob[] field_c;
    static String[] field_d;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 2056898529) {
                field_g = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(p.a((byte) -83, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = param0 >>> 2056898529;
        var2 = var2 | var2 >>> 654288481;
        var2 = var2 | var2 >>> -264873598;
        var2 = var2 | var2 >>> -103579932;
        if (param1 < 86) {
          return -3;
        } else {
          var2 = var2 | var2 >>> 1552288104;
          var2 = var2 | var2 >>> -1650467856;
          return param0 & (var2 ^ -1);
        }
    }

    final static String a(ge param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        if (param2) {
          try {
            L0: {
              L1: {
                var3_int = param0.c((byte) -115);
                if (param1 < var3_int) {
                  var3_int = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = new byte[var3_int];
              param0.field_v = param0.field_v + Pool.field_J.a((byte) 36, 0, param0.field_v, var4, param0.field_t, var3_int);
              var5 = tl.a(var3_int, -7510, var4, 0);
              stackOut_5_0 = (String) var5;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return "Cabbage";
          }
          return stackIn_6_0;
        } else {
          return null;
        }
    }

    final static dj[] a(byte param0, sj param1) {
        int[] var3 = null;
        dj[] var4 = null;
        int var5 = 0;
        dj var6 = null;
        int var7 = 0;
        le var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        dj[] var12 = null;
        dj[] var13 = null;
        int[] var14 = null;
        var7 = Pool.field_O;
        if (param1.a((byte) 110)) {
          var8 = param1.a(84);
          L0: while (true) {
            if (-1 != (var8.field_f ^ -1)) {
              if (2 == var8.field_f) {
                return new dj[]{};
              } else {
                var14 = (int[]) var8.field_e;
                var11 = var14;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                if (param0 <= -86) {
                  var12 = new dj[var14.length >> 907850306];
                  var4 = var12;
                  var5 = 0;
                  L1: while (true) {
                    if (var12.length <= var5) {
                      return var4;
                    } else {
                      var6 = new dj();
                      var4[var5] = var6;
                      var6.field_f = var3[var5 << -255110494];
                      var6.field_i = var3[(var5 << -86700350) - -1];
                      var6.field_d = var3[(var5 << -40838206) + 2];
                      var6.field_k = var3[(var5 << 1905721698) + 3];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  int[] discarded$3 = s.a(67, 62);
                  var13 = new dj[var14.length >> 907850306];
                  var4 = var13;
                  var5 = 0;
                  L2: while (true) {
                    if (var13.length <= var5) {
                      return var4;
                    } else {
                      var6 = new dj();
                      var4[var5] = var6;
                      var6.field_f = var3[var5 << -255110494];
                      var6.field_i = var3[(var5 << -86700350) - -1];
                      var6.field_d = var3[(var5 << -40838206) + 2];
                      var6.field_k = var3[(var5 << 1905721698) + 3];
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              cf.a(-123, 10L);
              continue L0;
            }
          }
        } else {
          return new dj[]{};
        }
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (var2 != 0) {
          L0: {
            if (var2 < 128) {
              break L0;
            } else {
              if ((var2 ^ -1) > -161) {
                L1: {
                  var3 = rf.field_a[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = var3;
                break L0;
              } else {
                if (param1 == 8) {
                  return (char)var2;
                } else {
                  field_f = null;
                  return (char)var2;
                }
              }
            }
          }
          if (param1 != 8) {
            field_f = null;
            return (char)var2;
          } else {
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
            field_b = null;
        }
    }

    final static int[] a(int param0, int param1) {
        Object var3 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_14_0 = null;
        int[] stackOut_13_0 = null;
        int[] stackOut_10_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_2_0 = null;
        if (param1 <= 111) {
          L0: {
            var3 = null;
            s.a((java.applet.Applet) null, 17);
            if (0 != param0) {
              if (param0 == 8) {
                stackOut_15_0 = bc.field_c;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                if (8 <= param0) {
                  stackOut_14_0 = dq.field_i;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = v.field_a;
                  stackIn_16_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              stackOut_10_0 = jc.field_i;
              stackIn_16_0 = stackOut_10_0;
              break L0;
            }
          }
          return stackIn_16_0;
        } else {
          L1: {
            if (0 != param0) {
              if (param0 == 8) {
                stackOut_7_0 = bc.field_c;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                if (8 <= param0) {
                  stackOut_6_0 = dq.field_i;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = v.field_a;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
            } else {
              stackOut_2_0 = jc.field_i;
              stackIn_8_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_8_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> has left the lobby.";
        field_c = new ob[25];
        field_e = new int[12];
        field_d = new String[]{"Turn time (seconds)", "Game", "Theme", "Guide"};
    }
}
