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
        int var5 = 91 % ((param2 - 26) / 52);
        this.c((byte) -95);
        boolean discarded$0 = param1.drawImage(((aa) this).field_e, param0, param3, (java.awt.image.ImageObserver) this);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 > -125) {
            field_i = null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((aa) this).field_h = param0;
        param0.setDimensions(((aa) this).field_a, ((aa) this).field_c);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((aa) this).field_k);
        param0.setHints(14);
    }

    final static int a(nk param0, boolean param1, int param2) {
        if (param2 >= -41) {
            field_i = null;
        }
        return param0.b(param1, -118);
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = param0.length();
          if (20 >= var2) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            L2: {
              if (param1 <= -5) {
                break L2;
              } else {
                field_g = null;
                break L2;
              }
            }
            return new String(var8);
          } else {
            L3: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(-65 + var5 - -97);
                  var4++;
                  continue L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (97 > var5) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (48 > var5) {
                  break L6;
                } else {
                  if (var5 <= 57) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L1;
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((aa) this).field_h == param0;
    }

    final void a(boolean param0, int param1, int param2, java.awt.Component param3) {
        ((aa) this).field_b = new int[1 + param1 * param2];
        if (param0) {
            return;
        }
        ((aa) this).field_c = param1;
        ((aa) this).field_a = param2;
        ((aa) this).field_k = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((aa) this).field_e = param3.createImage((java.awt.image.ImageProducer) this);
        this.c((byte) -113);
        boolean discarded$0 = param3.prepareImage(((aa) this).field_e, (java.awt.image.ImageObserver) this);
        this.c((byte) -104);
        boolean discarded$1 = param3.prepareImage(((aa) this).field_e, (java.awt.image.ImageObserver) this);
        this.c((byte) -115);
        boolean discarded$2 = param3.prepareImage(((aa) this).field_e, (java.awt.image.ImageObserver) this);
        ((aa) this).b(1);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((aa) this).field_h == param0) {
            ((aa) this).field_h = null;
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
        if (null == ((aa) this).field_h) {
            return;
        }
        ((aa) this).field_h.setPixels(0, 0, ((aa) this).field_a, ((aa) this).field_c, ((aa) this).field_k, ((aa) this).field_b, 0, ((aa) this).field_a);
        ((aa) this).field_h.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((aa) this).addConsumer(param0);
    }

    aa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ih[8];
    }
}
