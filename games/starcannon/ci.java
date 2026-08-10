/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci implements de {
    private qe field_h;
    static lb[] field_g;
    private int field_e;
    private int field_c;
    private int field_f;
    static long field_b;
    private int field_j;
    static String field_d;
    private int field_a;
    private int field_i;

    final static void a(String param0, int param1) {
        try {
            if (param1 != 0) {
                ci.a(-63);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ci.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sj var13 = null;
        uj stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof sj)) {
                stackIn_4_0 = null;
                break L1;
              } else {
                stackIn_4_0 = (uj) (param4);
                break L1;
              }
            }
            L2: {
              var13 = (sj) ((Object) stackIn_4_0);
              ki.d(param4.field_s + param0, param4.field_j + param3, param4.field_i, param4.field_f, this.field_a);
              var7 = 14 / ((2 - param2) / 54);
              if (var13 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            var8 = param4.field_i - 2 * var13.field_G;
            var9 = param4.field_s + (param0 + var13.field_G);
            var10 = param3 - (-param4.field_j + -var13.field_A);
            ki.a(var9, var10, var8 + var9, var10, this.field_f);
            var11 = -1 + var13.e((byte) 114);
            L3: while (true) {
              if (-1 < (var11 ^ -1)) {
                if (null != this.field_h) {
                  this.field_h.b(var13.field_k, var8 / 2 + var9, this.field_h.field_x + var10 - -var13.field_A, this.field_j, this.field_e);
                  break L0;
                } else {
                  return;
                }
              } else {
                ki.e(var13.a(2, var11) * var8 / var13.e(-32242) + var9, var10, this.field_i, this.field_c);
                var11--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ci.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var10 = kj.field_E.getGraphics();
                  if (null == jb.field_c) {
                    jb.field_c = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param4 == -27746) {
                    break L3;
                  } else {
                    var9 = (String) null;
                    ci.a(9, (java.awt.Color) null, (String) null, true, -93);
                    break L3;
                  }
                }
                L4: {
                  if (param3) {
                    var10.setColor(java.awt.Color.black);
                    var10.fillRect(0, 0, eh.field_n, ef.field_d);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1 == null) {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                try {
                  L6: {
                    L7: {
                      if (nh.field_h != null) {
                        break L7;
                      } else {
                        nh.field_h = kj.field_E.createImage(304, 34);
                        break L7;
                      }
                    }
                    var11 = nh.field_h.getGraphics();
                    var11.setColor(param1);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, 3 * param0, 30);
                    var11.setColor(java.awt.Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(2 + 3 * param0, 2, 300 + -(param0 * 3), 30);
                    var11.setFont(jb.field_c);
                    var11.setColor(java.awt.Color.white);
                    var11.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                    var10.drawImage(nh.field_h, -152 + eh.field_n / 2, -18 + ef.field_d / 2, (java.awt.image.ImageObserver) null);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + eh.field_n / 2;
                    var8 = ef.field_d / 2 - 18;
                    var10.setColor(param1);
                    var10.drawRect(var7, var8, 303, 33);
                    var10.fillRect(var7 - -2, var8 + 2, param0 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1 + var7, var8 + 1, 301, 31);
                    var10.fillRect(2 + var7 - -(3 * param0), 2 + var8, -(param0 * 3) + 300, 30);
                    var10.setFont(jb.field_c);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, var7 - -((304 + -(param2.length() * 6)) / 2), 22 + var8);
                    break L8;
                  }
                }
                if (hi.field_a == null) {
                  break L1;
                } else {
                  var10.setFont(jb.field_c);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(hi.field_a, eh.field_n / 2 + -(hi.field_a.length() * 6 / 2), -26 + ef.field_d / 2);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              kj.field_E.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("ci.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -114) {
            ci.a(47);
            field_g = null;
            return;
        }
        field_g = null;
    }

    ci(qe param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_i = param5;
            this.field_h = param0;
            this.field_a = param4;
            this.field_c = param6;
            this.field_j = param1;
            this.field_f = param3;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_b = 0L;
        field_d = "More suggestions";
    }
}
