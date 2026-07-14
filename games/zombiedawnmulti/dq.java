/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dq extends l implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_m;
    static String field_i;
    static cj field_k;
    static int[][] field_j;
    private java.awt.image.ImageConsumer field_n;
    static int field_l;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((dq) this).field_n == param0) {
            ((dq) this).field_n = null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((dq) this).field_n;
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        this.c((byte) -127);
        boolean discarded$9 = param1.drawImage(((dq) this).field_g, param3, param0, (java.awt.image.ImageObserver) this);
        if (param2 != 2) {
            Object var6 = null;
            boolean discarded$10 = ((dq) this).isConsumer((java.awt.image.ImageConsumer) null);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((dq) this).addConsumer(param0);
    }

    private final synchronized void c(byte param0) {
        int var2 = 0;
        if (((dq) this).field_n == null) {
          return;
        } else {
          ((dq) this).field_n.setPixels(0, 0, ((dq) this).field_h, ((dq) this).field_f, ((dq) this).field_m, ((dq) this).field_b, 0, ((dq) this).field_h);
          var2 = 56 / ((param0 - -54) / 43);
          ((dq) this).field_n.imageComplete(2);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        ((dq) this).field_b = new int[1 + param3 * param2];
        ((dq) this).field_f = param2;
        ((dq) this).field_h = param3;
        ((dq) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((dq) this).field_g = param1.createImage((java.awt.image.ImageProducer) this);
        this.c((byte) -110);
        boolean discarded$0 = param1.prepareImage(((dq) this).field_g, (java.awt.image.ImageObserver) this);
        this.c((byte) 77);
        boolean discarded$1 = param1.prepareImage(((dq) this).field_g, (java.awt.image.ImageObserver) this);
        this.c((byte) 50);
        boolean discarded$9 = param1.prepareImage(((dq) this).field_g, (java.awt.image.ImageObserver) this);
        ((dq) this).b((byte) 126);
        if (param0 != -6) {
            field_i = null;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -2) {
          field_j = null;
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (-1 != param0) {
          if (-1 < param0) {
            L0: {
              var2 = 1;
              if (param0 > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-256 > (param0 ^ -1)) {
                param0 = param0 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) >= -16) {
                break L2;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (param0 <= 3) {
                break L3;
              } else {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              }
            }
            L4: {
              if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            if (param1 != 16) {
              L5: {
                int discarded$1 = dq.b(-122, 106);
                var2 = 2;
                if (param0 < -65536) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (255 < (param0 ^ -1)) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (3 > param0) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                var2 = 2;
                if (param0 < -65536) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (255 < (param0 ^ -1)) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (3 > param0) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((dq) this).field_n = param0;
        param0.setDimensions(((dq) this).field_h, ((dq) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((dq) this).field_m);
        param0.setHints(14);
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 < -39) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (param1 > 11) {
                break L0;
              } else {
                L1: {
                  if (-2 < (param2 ^ -1)) {
                    break L1;
                  } else {
                    if (param2 > ib.a(param1, 1, param3)) {
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        } else {
          field_j = null;
          if (param1 >= 0) {
            if (param1 <= 11) {
              if (-2 >= param2) {
                if (param2 > ib.a(param1, 1, param3)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void c(int param0) {
        if (param0 >= -117) {
          field_j = null;
          wj.field_i.a((cf) (Object) new dg(), (byte) -41);
          return;
        } else {
          wj.field_i.a((cf) (Object) new dg(), (byte) -41);
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    dq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
