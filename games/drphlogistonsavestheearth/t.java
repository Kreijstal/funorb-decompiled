/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static he[] field_c;
    static int field_b;
    static he field_a;
    static nh field_d;

    final static void a(boolean param0, int param1, String param2, int param3, java.awt.Color param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
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
                  var9.drawImage(ac.field_h, -152 + fg.field_h / 2, bh.field_a / param3 - 18, (java.awt.image.ImageObserver) null);
                  break L4;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  exception = (Exception) (Object) decompiledCaughtException;
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
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
    }

    public static void a(byte param0) {
        java.awt.Color var2;
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
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                  stackIn_14_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = var3_int * param2;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((param0 & 1 ^ -1) != -1) {
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
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
        field_b = -1;
    }
}
