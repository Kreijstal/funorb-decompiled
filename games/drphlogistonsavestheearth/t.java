/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static he[] field_c;
    static int field_b;
    static he field_a;
    static nh field_d;

    final static void a(boolean param0, int param1, String param2, int param3, java.awt.Color param4) {
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          try {
            L0: {
              L1: {
                var9 = n.field_g.getGraphics();
                if (bd.field_S != null) {
                  break L1;
                } else {
                  bd.field_S = new java.awt.Font("Helvetica", 1, 13);
                  break L1;
                }
              }
              L2: {
                if (param0) {
                  var9.setColor(java.awt.Color.black);
                  var9.fillRect(0, 0, fg.field_h, bh.field_a);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param4 != null) {
                  break L3;
                } else {
                  param4 = new java.awt.Color(140, 17, 17);
                  break L3;
                }
              }
              try {
                L4: {
                  L5: {
                    if (ac.field_h != null) {
                      break L5;
                    } else {
                      ac.field_h = n.field_g.createImage(304, 34);
                      break L5;
                    }
                  }
                  var10 = ac.field_h.getGraphics();
                  var10.setColor(param4);
                  var10.drawRect(0, 0, 303, 33);
                  var10.fillRect(2, 2, param1 * 3, 30);
                  var10.setColor(java.awt.Color.black);
                  var10.drawRect(1, 1, 301, 31);
                  var10.fillRect(param1 * 3 + 2, 2, 300 - param1 * 3, 30);
                  var10.setFont(bd.field_S);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                  discarded$1 = var9.drawImage(ac.field_h, -152 + fg.field_h / 2, bh.field_a / param3 - 18, (java.awt.image.ImageObserver) null);
                  break L4;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var7 = fg.field_h / 2 - 152;
                  var8 = -18 + bh.field_a / 2;
                  var9.setColor(param4);
                  var9.drawRect(var7, var8, 303, 33);
                  var9.fillRect(var7 + 2, 2 + var8, 3 * param1, 30);
                  var9.setColor(java.awt.Color.black);
                  var9.drawRect(var7 - -1, 1 + var8, 301, 31);
                  var9.fillRect(param1 * 3 + (2 + var7), 2 + var8, -(3 * param1) + 300, 30);
                  var9.setFont(bd.field_S);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, var8 + 22);
                  break L6;
                }
              }
              if (null != pc.field_d) {
                var9.setFont(bd.field_S);
                var9.setColor(java.awt.Color.white);
                var9.drawString(pc.field_d, fg.field_h / 2 + -(pc.field_d.length() * 6 / 2), bh.field_a / 2 - 26);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            n.field_g.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void a(byte param0) {
        java.awt.Color var2 = null;
        if (param0 >= -88) {
          var2 = (java.awt.Color) null;
          t.a(true, -56, (String) null, 9, (java.awt.Color) null);
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (-2 <= (param0 ^ -1)) {
                if (1 != param0) {
                  L2: {
                    if (param1 == -103) {
                      break L2;
                    } else {
                      field_b = -110;
                      break L2;
                    }
                  }
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_8_0 = var3_int * param2;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((param0 & 1) != 0) {
                    var3_int = var3_int * param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "t.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_b = -1;
    }
}
