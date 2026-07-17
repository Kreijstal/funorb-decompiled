/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ki {
    int field_C;
    static long field_B;
    static int field_D;
    ka field_G;
    byte field_F;
    static String field_E;

    final int a(boolean param0) {
        if (null == ((ph) this).field_G) {
          return 0;
        } else {
          if (!param0) {
            ((ph) this).field_F = (byte) 65;
            return 100 * ((ph) this).field_G.field_k / (-((ph) this).field_F + ((ph) this).field_G.field_r.length);
          } else {
            return 100 * ((ph) this).field_G.field_k / (-((ph) this).field_F + ((ph) this).field_G.field_r.length);
          }
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, int param4, qc param5) {
        le.field_k = param3;
        nh.field_h = param2;
        try {
            nh.field_f = param4;
            ld.field_y = param5;
            pk.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ph.B(" + 14835 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(String param0, int param1, java.awt.Color param2, int param3, boolean param4) {
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
          L0: {
            try {
              L1: {
                L2: {
                  var9 = qd.field_j.getGraphics();
                  if (null == sj.field_F) {
                    sj.field_F = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param4) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, lk.field_j, td.field_d);
                    break L3;
                  }
                }
                L4: {
                  if (param2 != null) {
                    break L4;
                  } else {
                    param2 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == wc.field_C) {
                        wc.field_C = qd.field_j.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = wc.field_C.getGraphics();
                    var10.setColor(param2);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(3 * param3 + 2, 2, -(3 * param3) + 300, 30);
                    var10.setFont(sj.field_F);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (-(6 * param0.length()) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(wc.field_C, lk.field_j / 2 + -152, -18 + td.field_d / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = lk.field_j / 2 + -152;
                    var8 = -18 + td.field_d / 2;
                    var9.setColor(param2);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, 2 + var8, 3 * param3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 + 1, 301, 31);
                    var9.fillRect(var7 - -2 + param3 * 3, 2 + var8, -(3 * param3) + 300, 30);
                    var9.setFont(sj.field_F);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 + (-(6 * param0.length()) + 304) / 2, var8 - -22);
                    break L7;
                  }
                }
                if (hf.field_j == null) {
                  break L1;
                } else {
                  var9.setFont(sj.field_F);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(hf.field_j, lk.field_j / 2 + -(hf.field_j.length() * 6 / 2), -26 + td.field_d / 2);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              qd.field_j.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("ph.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final byte[] g(int param0) {
        if (param0 == -27203) {
          if (!((ph) this).field_w) {
            if (((ph) this).field_G.field_k < -((ph) this).field_F + ((ph) this).field_G.field_r.length) {
              throw new RuntimeException();
            } else {
              return ((ph) this).field_G.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    public static void h(int param0) {
        int var1 = -69 % ((param0 - 44) / 32);
        field_E = null;
    }

    ph() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 20000000L;
        field_E = "FULL ACCESS";
    }
}
