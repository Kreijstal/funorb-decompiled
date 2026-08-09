/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class skb extends rqa {
    static String field_p;
    static bc field_o;
    static String[] field_q;

    final static void a(java.awt.Color param0, int param1, int param2, boolean param3, String param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = igb.field_a.getGraphics();
                  if (null == fda.field_p) {
                    fda.field_p = new java.awt.Font("Helvetica", 1, 13);
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
                    var9.fillRect(0, 0, rda.field_p, fua.field_p);
                    break L3;
                  }
                }
                L4: {
                  if (param0 != null) {
                    break L4;
                  } else {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (nda.field_p != null) {
                        break L6;
                      } else {
                        nda.field_p = igb.field_a.createImage(304, 34);
                        break L6;
                      }
                    }
                    L7: {
                      var10 = nda.field_p.getGraphics();
                      var10.setColor(param0);
                      var10.drawRect(0, 0, 303, 33);
                      var10.fillRect(2, 2, 3 * param2, 30);
                      var10.setColor(java.awt.Color.black);
                      if (param1 == 13) {
                        break L7;
                      } else {
                        field_o = (bc) null;
                        break L7;
                      }
                    }
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 - -(param2 * 3), 2, 300 + -(3 * param2), 30);
                    var10.setFont(fda.field_p);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                    var9.drawImage(nda.field_p, -152 + rda.field_p / 2, fua.field_p / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = rda.field_p / 2 - 152;
                    var8 = -18 + fua.field_p / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, var8 - -2, 3 * param2, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, 1 + var8, 301, 31);
                    var9.fillRect(param2 * 3 + var7 - -2, 2 + var8, -(param2 * 3) + 300, 30);
                    var9.setFont(fda.field_p);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, (-(param4.length() * 6) + 304) / 2 + var7, var8 - -22);
                    break L8;
                  }
                }
                if (null == jj.field_r) {
                  break L1;
                } else {
                  var9.setFont(fda.field_p);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(jj.field_r, rda.field_p / 2 - jj.field_r.length() * 6 / 2, fua.field_p / 2 - 26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              igb.field_a.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("skb.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
    }

    skb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(upa.a(-8225));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("skb.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 301) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final static int a(int[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = 73 % ((param1 - 16) / 42);
            var4 = 0;
            L1: while (true) {
              if (var4 >= param0.length) {
                stackIn_8_0 = var2_int;
                break L0;
              } else {
                L2: {
                  var5 = param0[var4];
                  if (var2_int >= var5) {
                    break L2;
                  } else {
                    var2_int = var5;
                    break L2;
                  }
                }
                var4 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("skb.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_p = "Missile launcher";
        field_q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
