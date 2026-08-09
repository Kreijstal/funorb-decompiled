/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends fh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static byte[] field_h;
    static int field_g;
    private java.awt.image.ColorModel field_j;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mj var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -34) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ij.a((byte) -53, 0);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = (mj) ((Object) nd.field_b.b((byte) -77));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == null) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        nk.a(param1, var4, 14);
                        var4 = (mj) ((Object) nd.field_b.d(853));
                        if (var3 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "ij.J(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_i = param0;
            param0.setDimensions(this.field_e, this.field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ij.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            this.field_f = param1;
            this.field_d = new int[param1 * param2 + 1];
            this.field_e = param2;
            this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_a = param3.createImage((java.awt.image.ImageProducer) (this));
            this.c(-123);
            param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.c(-123);
            param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.c(-126);
            param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            int var5_int = -113 / ((0 - param0) / 52);
            this.a(-40);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        vh.field_q[4] = new int[]{5};
        nc.field_cb[4] = new ja(4);
        kg.a(30, 468, 32, (byte) -128, new int[]{8, 9, 10, 5}, 2, 400);
        nc.field_cb[2] = new ja(2);
        if (param0 < tc.field_b) {
          if (ug.a((byte) 94, wc.field_c)) {
            kg.a(50, 288, 32, (byte) -96, new int[]{1, 12, 13, 4, 3, 25, 7}, 1, 200);
            nc.field_cb[1] = new ja(1);
            vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
            nc.field_cb[8] = new ja(8);
            if (-1 > (tc.field_b ^ -1)) {
              if ((bk.field_e ^ -1) != -8) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
            nc.field_cb[8] = new ja(8);
            if (-1 > (tc.field_b ^ -1)) {
              if ((bk.field_e ^ -1) != -8) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
          nc.field_cb[8] = new ja(8);
          if (-1 > (tc.field_b ^ -1)) {
            if ((bk.field_e ^ -1) != -8) {
              return;
            } else {
              bk.field_e = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ij.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, hj param2) {
        try {
            if (param0 > -26) {
                field_h = (byte[]) null;
            }
            hc.field_l = param2;
            pj.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ij.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void b(byte param0) {
        if (param0 <= 49) {
            ij.b(87);
            field_h = null;
            return;
        }
        field_h = null;
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

            stackIn_4_1 = new StringBuilder().append("ij.imageUpdate(");

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
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final synchronized void c(int param0) {
        if (param0 > -119) {
            field_h = (byte[]) null;
            if (!(this.field_i != null)) {
                return;
            }
            this.field_i.setPixels(0, 0, this.field_e, this.field_f, this.field_j, this.field_d, 0, this.field_e);
            this.field_i.imageComplete(2);
            return;
        }
        if (!(this.field_i != null)) {
            return;
        }
        this.field_i.setPixels(0, 0, this.field_e, this.field_f, this.field_j, this.field_d, 0, this.field_e);
        this.field_i.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_i != param0) {
                break L1;
              } else {
                this.field_i = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ij.removeConsumer(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_i;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.c(-122);
              param2.drawImage(this.field_a, param0, param1, (java.awt.image.ImageObserver) (this));
              if (param3) {
                break L1;
              } else {
                field_g = -68;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ij.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    ij() {
    }

    static {
        field_g = 256;
    }
}
