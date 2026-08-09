/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static gh field_c;
    static int field_b;
    static String field_g;
    static int field_a;
    static wk[] field_f;
    static int field_e;
    static long field_d;

    final static void a(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        c var3_ref_c = null;
        rh var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        kj var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var9 = rf.field_d;
            var2 = var9.f((byte) -70);
            if (param0 == -16786) {
              if (-1 != (var2 ^ -1)) {
                if ((var2 ^ -1) == -2) {
                  var3 = var9.i(0);
                  var4 = (rh) ((Object) ol.field_Vb.e(13058));
                  L1: while (true) {
                    L2: {
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.field_x ^ -1) != (var3 ^ -1)) {
                          var4 = (rh) ((Object) ol.field_Vb.a((byte) -59));
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var4 != null) {
                      var4.b(param0 ^ -16790);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_24_0 = param0;
                      stackIn_24_1 = 16882;
                      pm.m(stackIn_24_0 + stackIn_24_1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  sj.a("A1: " + ci.a((byte) 94), -126, (Throwable) null);
                  pm.m(param0 ^ -16880);
                  return;
                }
              } else {
                var3_ref_c = (c) ((Object) fg.field_Ub.e(13058));
                if (var3_ref_c != null) {
                  L3: {
                    var4_int = var9.f((byte) -106);
                    if (var4_int == 0) {
                      var5 = null;
                      break L3;
                    } else {
                      var11 = new byte[var4_int];
                      var10 = var11;
                      var8 = var10;
                      var5 = var8;
                      var9.a(0, var11, 28, var4_int);
                      break L3;
                    }
                  }
                  var9.field_p = var9.field_p + 4;
                  if (!var9.a((byte) -32)) {
                    pm.m(param0 ^ 16871);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3_ref_c.field_q = true;
                    var3_ref_c.field_t = (byte[]) (var5);
                    var3_ref_c.b(4);
                    return;
                  }
                } else {
                  pm.m(111);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "be.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static u a(cm param0, cm param1, byte param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        u stackIn_2_0 = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0.a(param4, 34);
            if (param2 < -44) {
              var6 = param0.a(var5_int, -32759, param3);
              stackIn_4_0 = lj.a(param1, var6, -56, param0, var5_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (u) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("be.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -34) {
            field_e = 65;
        }
    }

    final static void a(boolean param0, byte param1, String param2, java.applet.Applet param3) {
        try {
            RuntimeException var4 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (pn.field_w.startsWith("win")) {
                    if (!hj.a(-9062, param2)) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    sj.a("MGR1: " + param2, -85, (Throwable) null);
                    break L3;
                  }
                }
                if (param1 > 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  field_g = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4);

                stackIn_12_1 = new StringBuilder().append("be.A(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param3 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = "This option cannot be combined with the current '<%0>' setting.";
    }
}
