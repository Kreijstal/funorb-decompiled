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
              if (this.field_n != param0) {
                break L1;
              } else {
                this.field_n = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dq.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_n;
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        RuntimeException runtimeException = null;
        java.awt.image.ImageConsumer var6 = null;
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
              this.c((byte) -127);
              discarded$5 = param1.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) (this));
              if (param2 == 2) {
                break L1;
              } else {
                var6 = (java.awt.image.ImageConsumer) null;
                discarded$6 = this.isConsumer((java.awt.image.ImageConsumer) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dq.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void c(byte param0) {
        int var2 = 0;
        if (this.field_n == null) {
          return;
        } else {
          this.field_n.setPixels(0, 0, this.field_h, this.field_f, this.field_m, this.field_b, 0, this.field_h);
          var2 = 56 / ((param0 - -54) / 43);
          this.field_n.imageComplete(2);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
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
              this.field_b = new int[1 + param3 * param2];
              this.field_f = param2;
              this.field_h = param3;
              this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
              this.field_g = param1.createImage((java.awt.image.ImageProducer) (this));
              this.c((byte) -110);
              discarded$7 = param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
              this.c((byte) 77);
              discarded$8 = param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
              this.c((byte) 50);
              discarded$9 = param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
              this.b((byte) 126);
              if (param0 == -6) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dq.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -2) {
          field_j = (int[][]) null;
          field_j = (int[][]) null;
          return;
        } else {
          field_j = (int[][]) null;
          return;
        }
    }

    final static int b(int param0, int param1) {
        int discarded$1 = 0;
        int var2 = 0;
        if (-1 != (param0 ^ -1)) {
          if (-1 > (param0 ^ -1)) {
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
            if (param1 == 16) {
              L5: {
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
                if ((param0 ^ -1) > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (3 < (param0 ^ -1)) {
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
                discarded$1 = dq.b(-122, 106);
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
                if ((param0 ^ -1) > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (3 < (param0 ^ -1)) {
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
        try {
            this.field_n = param0;
            param0.setDimensions(this.field_h, this.field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dq.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
          field_j = (int[][]) null;
          if (param1 >= 0) {
            if (param1 <= 11) {
              if (-2 >= (param2 ^ -1)) {
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
          field_j = (int[][]) null;
          wj.field_i.a((cf) (new dg()), (byte) -41);
          return;
        } else {
          wj.field_i.a((cf) (new dg()), (byte) -41);
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("dq.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    dq() {
    }

    static {
        field_i = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
