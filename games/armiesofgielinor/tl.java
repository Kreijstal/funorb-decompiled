/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl implements Iterator {
    private tc field_d;
    static wk field_e;
    private int field_b;
    private tc field_c;
    static String field_a;
    static String field_f;
    static me field_i;
    private m field_g;
    static String field_h;

    public final void remove() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((tl) this).field_c == null) {
              throw new IllegalStateException();
            } else {
              ((tl) this).field_c.d(42);
              ((tl) this).field_c = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "tl.remove()");
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        Exception var6 = null;
        java.awt.Graphics var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          try {
            L0: {
              L1: {
                var5 = si.field_b.getGraphics();
                if (null != lf.field_g) {
                  break L1;
                } else {
                  lf.field_g = new java.awt.Font("Helvetica", 1, 13);
                  break L1;
                }
              }
              L2: {
                if (!param3) {
                  break L2;
                } else {
                  var5.setColor(java.awt.Color.black);
                  var5.fillRect(0, 0, bn.field_b, dt.field_a);
                  break L2;
                }
              }
              L3: {
                if (null != param1) {
                  break L3;
                } else {
                  param1 = new java.awt.Color(140, 17, 17);
                  break L3;
                }
              }
              try {
                L4: {
                  L5: {
                    if (gp.field_e != null) {
                      break L5;
                    } else {
                      gp.field_e = si.field_b.createImage(304, 34);
                      break L5;
                    }
                  }
                  var6_ref = gp.field_e.getGraphics();
                  var6_ref.setColor(param1);
                  if (param0 == -5790) {
                    var6_ref.drawRect(0, 0, 303, 33);
                    var6_ref.fillRect(2, 2, 3 * param4, 30);
                    var6_ref.setColor(java.awt.Color.black);
                    var6_ref.drawRect(1, 1, 301, 31);
                    var6_ref.fillRect(param4 * 3 + 2, 2, 300 + -(param4 * 3), 30);
                    var6_ref.setFont(lf.field_g);
                    var6_ref.setColor(java.awt.Color.white);
                    var6_ref.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
                    boolean discarded$1 = var5.drawImage(gp.field_e, -152 + bn.field_b / 2, dt.field_a / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L4;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var7 = bn.field_b / 2 - 152;
                  var8 = -18 + dt.field_a / 2;
                  var5.setColor(param1);
                  var5.drawRect(var7, var8, 303, 33);
                  var5.fillRect(2 + var7, var8 - -2, param4 * 3, 30);
                  var5.setColor(java.awt.Color.black);
                  var5.drawRect(var7 + 1, 1 + var8, 301, 31);
                  var5.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
                  var5.setFont(lf.field_g);
                  var5.setColor(java.awt.Color.white);
                  var5.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
                  break L6;
                }
              }
              L7: {
                if (an.field_G != null) {
                  var5.setFont(lf.field_g);
                  var5.setColor(java.awt.Color.white);
                  var5.drawString(an.field_G, bn.field_b / 2 + -(an.field_G.length() * 6 / 2), dt.field_a / 2 + -26);
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L8: {
              var5_ref = (Exception) (Object) decompiledCaughtException;
              si.field_b.repaint();
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5_ref2;
            stackOut_23_1 = new StringBuilder().append("tl.B(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qn.b();
              if (param0 == -90) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            ll.field_Rb.c(2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "tl.D(" + param0 + ')');
        }
    }

    public final Object next() {
        tc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        tc stackIn_3_0 = null;
        tc stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        tc stackOut_2_0 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((tl) this).field_g.field_c[((tl) this).field_b - 1] == ((tl) this).field_d) {
              L1: while (true) {
                L2: {
                  if (((tl) this).field_g.field_d <= ((tl) this).field_b) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((tl) this).field_b;
                    ((tl) this).field_b = ((tl) this).field_b + 1;
                    var1 = ((tl) this).field_g.field_c[fieldTemp$2].field_b;
                    if (var1 != ((tl) this).field_g.field_c[-1 + ((tl) this).field_b]) {
                      ((tl) this).field_c = var1;
                      ((tl) this).field_d = var1.field_b;
                      stackOut_8_0 = (tc) var1;
                      stackIn_9_0 = stackOut_8_0;
                      return (Object) (Object) stackIn_9_0;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              var1 = ((tl) this).field_d;
              ((tl) this).field_d = var1.field_b;
              ((tl) this).field_c = var1;
              stackOut_2_0 = (tc) var1;
              stackIn_3_0 = stackOut_2_0;
              return (Object) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "tl.next()");
        }
        return stackIn_12_0;
    }

    public final boolean hasNext() {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((tl) this).field_g.field_c[-1 + ((tl) this).field_b] == ((tl) this).field_d) {
              L1: while (true) {
                if (((tl) this).field_b >= ((tl) this).field_g.field_d) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    int fieldTemp$2 = ((tl) this).field_b;
                    ((tl) this).field_b = ((tl) this).field_b + 1;
                    if (((tl) this).field_g.field_c[fieldTemp$2].field_b != ((tl) this).field_g.field_c[((tl) this).field_b - 1]) {
                      break L2;
                    } else {
                      ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b - 1];
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b + -1].field_b;
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "tl.hasNext()");
        }
        return stackIn_12_0 != 0;
    }

    final static void a(byte param0, kl param1, kl param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              jj.field_c = param2;
              up.field_e = param1;
              if (param0 <= -117) {
                break L1;
              } else {
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("tl.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            field_i = null;
            int var1_int = -28 % ((param0 - -69) / 51);
            field_f = null;
            field_e = null;
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tl.C(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((tl) this).field_c = null;
              ((tl) this).field_d = ((tl) this).field_g.field_c[0].field_b;
              if (param0 < -85) {
                break L1;
              } else {
                ((tl) this).field_c = null;
                break L1;
              }
            }
            ((tl) this).field_b = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "tl.A(" + param0 + ')');
        }
    }

    tl(m param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((tl) this).field_c = null;
        try {
          L0: {
            ((tl) this).field_g = param0;
            this.c((byte) -101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tl.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new me(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
