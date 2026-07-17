/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static r field_a;

    public static void a(int param0) {
        if (param0 > -100) {
            Object var2 = null;
            hd.a(-104, (byte) 63, (String) null, true, (java.awt.Color) null);
        }
        field_a = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var10_int = -param3;
            L2: while (true) {
              if (0 <= var10_int) {
                break L0;
              } else {
                param6[param1] = param0[(param2 >> 20) * param8 + param7];
                param2 = param2 + param9;
                param1 = param1 + param5;
                var10_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var10;
            stackOut_7_1 = new StringBuilder().append("hd.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final static void a(int param0, byte param1, String param2, boolean param3, java.awt.Color param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ug.field_y.getGraphics();
                  if (null == af.field_a) {
                    af.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param3) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, u.field_sb, bk.field_d);
                    break L3;
                  }
                }
                L4: {
                  if (param4 != null) {
                    break L4;
                  } else {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (wb.field_g != null) {
                        break L6;
                      } else {
                        wb.field_g = ug.field_y.createImage(304, 34);
                        break L6;
                      }
                    }
                    L7: {
                      var10 = wb.field_g.getGraphics();
                      var10.setColor(param4);
                      var10.drawRect(0, 0, 303, 33);
                      var10.fillRect(2, 2, 3 * param0, 30);
                      var10.setColor(java.awt.Color.black);
                      var10.drawRect(1, 1, 301, 31);
                      var10.fillRect(2 - -(3 * param0), 2, 300 - param0 * 3, 30);
                      var10.setFont(af.field_a);
                      if (param1 == -90) {
                        break L7;
                      } else {
                        field_a = null;
                        break L7;
                      }
                    }
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(wb.field_g, -152 + u.field_sb / 2, bk.field_d / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = u.field_sb / 2 - 152;
                    var8 = bk.field_d / 2 + -18;
                    var9.setColor(param4);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, 3 * param0, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, 1 + var8, 301, 31);
                    var9.fillRect(param0 * 3 + 2 + var7, var8 + 2, 300 - 3 * param0, 30);
                    var9.setFont(af.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, (-(param2.length() * 6) + 304) / 2 + var7, 22 + var8);
                    break L8;
                  }
                }
                L9: {
                  if (null == of.field_c) {
                    break L9;
                  } else {
                    var9.setFont(af.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(of.field_c, u.field_sb / 2 + -(6 * of.field_c.length() / 2), bk.field_d / 2 - 26);
                    break L9;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ug.field_y.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("hd.C(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L11;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L11;
            }
          }
          L12: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L12;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L12;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (param0.charAt(var3) != var2_int) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("hd.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 17 + 41);
        }
        return stackIn_9_0 != 0;
    }

    static {
    }
}
