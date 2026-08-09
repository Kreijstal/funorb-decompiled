/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static boolean field_b;
    static int field_a;
    static int field_d;
    static String field_c;

    final static String a(int param0) {
        if (fk.field_F == vh.field_c) {
            return da.field_i;
        }
        if (param0 != 23917) {
            return (String) null;
        }
        return lk.field_k;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            java.awt.Color var2 = (java.awt.Color) null;
            ja.a((String) null, (java.awt.Color) null, false, -82, (byte) -96);
        }
    }

    final static on a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        on stackIn_6_0 = null;
        on stackIn_9_0 = null;
        on stackIn_11_0 = null;
        on stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = 33 / ((param0 - 27) / 55);
            var2_int = md.a(0, param1, 79);
            if (3 == var2_int) {
              stackIn_13_0 = gk.a((byte) -81, param1);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (var2_int == 4) {
                stackIn_11_0 = fc.a(param1, (byte) 49);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (-6 == (var2_int ^ -1)) {
                  stackIn_9_0 = gm.a(param1, -4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (var2_int == 6) {
                    stackIn_6_0 = vk.a((byte) -105, param1);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ja.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final static int a(byte param0, String[] param1, String param2, int param3, rb param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = param4.b(param2);
              if (param3 < var5_int) {
                break L1;
              } else {
                if (-1 == param2.indexOf("<br>")) {
                  param1[0] = param2;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + (param3 + var5_int)) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L2: while (true) {
              if (var8 <= var9) {
                L3: {
                  if (param0 == 16) {
                    break L3;
                  } else {
                    field_c = (String) null;
                    break L3;
                  }
                }
                L4: {
                  if (var7 < var8) {
                    incrementValue$0 = var6;
                    var6++;
                    param1[incrementValue$0] = param2.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_28_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param2.charAt(var9);
                    if (-33 == (var10 ^ -1)) {
                      break L6;
                    } else {
                      if (var10 == 45) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param2.substring(var7, 1 + var9).trim();
                  var12 = param4.b(var11);
                  if (param3 <= var12) {
                    var7 = 1 + var9;
                    incrementValue$1 = var6;
                    var6++;
                    param1[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param1[incrementValue$2] = param2.substring(var7, var9 - 3).trim();
                      var7 = var9 - -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("ja.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_32_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_28_0;
        }
    }

    final static void a(String param0, java.awt.Color param1, boolean param2, int param3, byte param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = cj.field_d.getGraphics();
                  if (eo.field_f != null) {
                    break L2;
                  } else {
                    eo.field_f = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param2) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, te.field_eb, kj.field_c);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null != on.field_i) {
                        break L6;
                      } else {
                        on.field_i = cj.field_d.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = on.field_i.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param3, 30);
                    var7 = -59 / ((-1 - param4) / 55);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param3 * 3 + 2, 2, -(3 * param3) + 300, 30);
                    var10.setFont(eo.field_f);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                    var9.drawImage(on.field_i, -152 + te.field_eb / 2, kj.field_c / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    var7 = te.field_eb / 2 - 152;
                    var8 = kj.field_c / 2 - 18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, 3 * param3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 - -1, 301, 31);
                    var9.fillRect(2 + var7 - -(param3 * 3), 2 + var8, -(3 * param3) + 300, 30);
                    var9.setFont(eo.field_f);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 - -((-(param0.length() * 6) + 304) / 2), var8 + 22);
                    break L7;
                  }
                }
                if (ph.field_b == null) {
                  break L1;
                } else {
                  var9.setFont(eo.field_f);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(ph.field_b, te.field_eb / 2 + -(6 * ph.field_b.length() / 2), kj.field_c / 2 - 26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              cj.field_d.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("ja.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_d = -1;
        field_a = 2;
        field_c = "Try again";
    }
}
