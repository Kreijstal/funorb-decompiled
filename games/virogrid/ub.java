/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends nb {
    static byte[] field_D;
    static volatile boolean field_F;
    byte field_A;
    jc field_B;
    static dl field_E;
    int field_C;
    static qm field_z;

    public static void f(int param0) {
        field_z = null;
        field_E = null;
        int var1 = 0;
        field_D = null;
    }

    final byte[] b(byte param0) {
        if (param0 == 39) {
          if (!((ub) this).field_t) {
            if (((ub) this).field_B.field_l < ((ub) this).field_B.field_g.length - ((ub) this).field_A) {
              throw new RuntimeException();
            } else {
              return ((ub) this).field_B.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    final static boolean g(int param0) {
        int var1 = 117 % ((5 - param0) / 51);
        return hm.a(d.field_Gb, oc.field_n, -24236);
    }

    final static void b(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(11, 8);
        var2.a(1, -126);
        var2.a(1, -82);
    }

    final int e(int param0) {
        if (param0 == 0) {
          if (((ub) this).field_B == null) {
            return 0;
          } else {
            return 100 * ((ub) this).field_B.field_l / (-((ub) this).field_A + ((ub) this).field_B.field_g.length);
          }
        } else {
          boolean discarded$5 = ub.g(-41);
          if (((ub) this).field_B == null) {
            return 0;
          } else {
            return 100 * ((ub) this).field_B.field_l / (-((ub) this).field_A + ((ub) this).field_B.field_g.length);
          }
        }
    }

    final static kg a(int param0, String param1) {
        RuntimeException var2 = null;
        kg stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_4_0 = null;
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
            L1: {
              if (!w.field_I.b(-106)) {
                break L1;
              } else {
                if (!param1.equals((Object) (Object) w.field_I.a(32))) {
                  w.field_I = oe.a(param1, false);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = w.field_I;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ub.G(").append(99).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            sa.a((byte) 107, param2, param1, false);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ub.H(" + 102 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, int param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = fi.field_v.getGraphics();
                  if (null != oh.field_c) {
                    break L2;
                  } else {
                    oh.field_c = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, fl.field_i, km.field_B);
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
                      if (null != oj.field_Gb) {
                        break L6;
                      } else {
                        oj.field_Gb = fi.field_v.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = oj.field_Gb.getGraphics();
                    var10.setColor(param0);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param3, 30);
                    var7 = -1;
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
                    var10.setFont(oh.field_c);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(oj.field_Gb, fl.field_i / 2 + -152, -18 + km.field_B / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + fl.field_i / 2;
                    var8 = -18 + km.field_B / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, 3 * param3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(2 + (var7 - -(param3 * 3)), var8 + 2, 300 + -(3 * param3), 30);
                    var9.setFont(oh.field_c);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, var7 + (-(param2.length() * 6) + 304) / 2, 22 + var8);
                    break L7;
                  }
                }
                if (tm.field_k == null) {
                  break L1;
                } else {
                  var9.setFont(oh.field_c);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(tm.field_k, fl.field_i / 2 + -(tm.field_k.length() * 6 / 2), -26 + km.field_B / 2);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              fi.field_v.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5_ref;
            stackOut_16_1 = new StringBuilder().append("ub.J(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
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
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ',' + -126 + ')');
        }
    }

    ub() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = true;
        field_E = new dl();
    }
}
