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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param1 == 2056898529) {
                  break L0;
                } else {
                  field_g = (String) null;
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  param0.getAppletContext().showDocument(p.a((byte) -83, var2, param0), "_top");
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("s.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param2) {
              try {
                L1: {
                  L2: {
                    var3_int = param0.c((byte) -115);
                    if (param1 < var3_int) {
                      var3_int = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4 = new byte[var3_int];
                  param0.field_v = param0.field_v + Pool.field_J.a((byte) 36, 0, param0.field_v, var4, param0.field_t, var3_int);
                  var5 = tl.a(var3_int, -7510, var4, 0);
                  stackOut_6_0 = (String) (var5);
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                stackOut_8_0 = "Cabbage";
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("s.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static dj[] a(byte param0, sj param1) {
        int[] discarded$1 = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        dj[] var4 = null;
        int var5 = 0;
        dj var6 = null;
        int var7 = 0;
        le var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        dj[] stackIn_3_0 = null;
        dj[] stackIn_10_0 = null;
        dj[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dj[] stackOut_9_0 = null;
        dj[] stackOut_16_0 = null;
        dj[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (param1.a((byte) 110)) {
              var8 = param1.a(84);
              L1: while (true) {
                if (-1 != (var8.field_f ^ -1)) {
                  if (2 == var8.field_f) {
                    stackOut_9_0 = new dj[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var10 = (int[]) (var8.field_e);
                      var9 = var10;
                      var3 = var9;
                      if (param0 <= -86) {
                        break L2;
                      } else {
                        discarded$1 = s.a(67, 62);
                        break L2;
                      }
                    }
                    var4 = new dj[var10.length >> 907850306];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (dj[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new dj();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << -255110494];
                        var6.field_i = var3[(var5 << -86700350) - -1];
                        var6.field_d = var3[(var5 << -40838206) + 2];
                        var6.field_k = var3[(var5 << 1905721698) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  cf.a(-123, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new dj[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("s.B(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
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
                  field_f = (int[]) null;
                  return (char)var2;
                }
              }
            }
          }
          if (param1 != 8) {
            field_f = (int[]) null;
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
        field_b = (int[][]) null;
        if (param0 != -1) {
            field_b = (int[][]) null;
        }
    }

    final static int[] a(int param0, int param1) {
        java.applet.Applet var3 = null;
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
            var3 = (java.applet.Applet) null;
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
        field_g = "<%0> has left the lobby.";
        field_c = new ob[25];
        field_e = new int[12];
        field_d = new String[]{"Turn time (seconds)", "Game", "Theme", "Guide"};
    }
}
