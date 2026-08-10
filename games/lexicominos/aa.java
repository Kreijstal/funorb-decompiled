/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aa extends dd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_k;
    static ih[] field_i;
    static qa field_g;
    private java.awt.image.ImageConsumer field_h;
    static int field_j;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, java.awt.Graphics param1, byte param2, int param3) {
        try {
            int var5_int = 91 % ((param2 - 26) / 52);
            this.c((byte) -95);
            param1.drawImage(this.field_e, param0, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("aa.imageUpdate(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 > -125) {
            field_i = (ih[]) null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_h = param0;
            param0.setDimensions(this.field_a, this.field_c);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_k);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "aa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(nk param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -41) {
                break L1;
              } else {
                field_i = (ih[]) null;
                break L1;
              }
            }
            stackIn_3_0 = param0.b(param1, -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("aa.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (20 >= var2_int) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                L3: {
                  if (param1 <= -5) {
                    break L3;
                  } else {
                    field_g = (qa) null;
                    break L3;
                  }
                }
                stackIn_23_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(-65 + var5 - -97);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (97 > var5) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (48 > var5) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("aa.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_h == param0;
    }

    final void a(boolean param0, int param1, int param2, java.awt.Component param3) {
        this.field_b = new int[1 + param1 * param2];
        if (param0) {
            return;
        }
        try {
            this.field_c = param1;
            this.field_a = param2;
            this.field_k = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_e = param3.createImage((java.awt.image.ImageProducer) (this));
            this.c((byte) -113);
            param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.c((byte) -104);
            param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.c((byte) -115);
            param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.b(1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "aa.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
            if (this.field_h == param0) {
                this.field_h = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "aa.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 >= 73) {
          if (wf.field_i < 2) {
            return 0;
          } else {
            L0: {
              if (ri.field_e != 0) {
                L1: {
                  if (eh.field_d != null) {
                    if (!eh.field_d.c(-43)) {
                      return 14;
                    } else {
                      if (eh.field_d.a("", (byte) -124)) {
                        if (!eh.field_d.a("", 10762)) {
                          return 29;
                        } else {
                          break L1;
                        }
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                if (we.field_h.c(-52)) {
                  if (we.field_h.a("commonui", 10762)) {
                    if (!gk.field_a.c(-91)) {
                      return 71;
                    } else {
                      if (gk.field_a.a("commonui", 10762)) {
                        if (ej.field_d.c(108)) {
                          if (ej.field_d.a((byte) 119)) {
                            break L0;
                          } else {
                            return 86;
                          }
                        } else {
                          return 82;
                        }
                      } else {
                        return 80;
                      }
                    }
                  } else {
                    return 57;
                  }
                } else {
                  return 43;
                }
              } else {
                if (we.field_h.c(94)) {
                  if (!we.field_h.a("commonui", 10762)) {
                    return 40;
                  } else {
                    if (!gk.field_a.c(76)) {
                      return 50;
                    } else {
                      if (gk.field_a.a("commonui", 10762)) {
                        if (ej.field_d.c(-84)) {
                          if (!ej.field_d.a((byte) 23)) {
                            return 80;
                          } else {
                            break L0;
                          }
                        } else {
                          return 70;
                        }
                      } else {
                        return 60;
                      }
                    }
                  }
                } else {
                  return 20;
                }
              }
            }
            return 100;
          }
        } else {
          return 125;
        }
    }

    private final synchronized void c(byte param0) {
        if (param0 > -93) {
            return;
        }
        if (null == this.field_h) {
            return;
        }
        this.field_h.setPixels(0, 0, this.field_a, this.field_c, this.field_k, this.field_b, 0, this.field_a);
        this.field_h.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "aa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    aa() {
    }

    static {
        field_i = new ih[8];
    }
}
