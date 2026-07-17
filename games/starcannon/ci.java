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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ci.a(-63);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ci.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        uj stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof sj)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (uj) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (uj) param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (sj) (Object) stackIn_4_0;
              ki.d(param4.field_s + param0, param4.field_j + param3, param4.field_i, param4.field_f, ((ci) this).field_a);
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
            ki.a(var9, var10, var8 + var9, var10, ((ci) this).field_f);
            var11 = -1 + var13.e((byte) 114);
            L3: while (true) {
              if (var11 < 0) {
                if (null != ((ci) this).field_h) {
                  ((ci) this).field_h.b(var13.field_k, var8 / 2 + var9, ((ci) this).field_h.field_x + var10 - -var13.field_A, ((ci) this).field_j, ((ci) this).field_e);
                  break L0;
                } else {
                  return;
                }
              } else {
                ki.e(var13.a(2, var11) * var8 / var13.e(-32242) + var9, var10, ((ci) this).field_i, ((ci) this).field_c);
                var11--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ci.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
                    var9 = null;
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
                    boolean discarded$1 = var10.drawImage(nh.field_h, -152 + eh.field_n / 2, -18 + ef.field_d / 2, (java.awt.image.ImageObserver) null);
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
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("ci.B(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 44 + param4 + 41);
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
            ((ci) this).field_i = param5;
            ((ci) this).field_h = param0;
            ((ci) this).field_a = param4;
            ((ci) this).field_c = param6;
            ((ci) this).field_j = param1;
            ((ci) this).field_f = param3;
            ((ci) this).field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ci.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
        field_d = "More suggestions";
    }
}
