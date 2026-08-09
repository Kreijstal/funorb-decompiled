/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class st extends cha implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static jea field_j;
    private java.awt.image.ColorModel field_k;

    private final synchronized void a(byte param0) {
        java.awt.Image var3;
        if (param0 == 10) {
          if (this.field_i == null) {
            return;
          } else {
            this.field_i.setPixels(0, 0, this.field_f, this.field_e, this.field_k, this.field_g, 0, this.field_f);
            this.field_i.imageComplete(2);
            return;
          }
        } else {
          var3 = (java.awt.Image) null;
          this.imageUpdate((java.awt.Image) null, -80, 60, -118, 83, 123);
          if (this.field_i == null) {
            return;
          } else {
            this.field_i.setPixels(0, 0, this.field_f, this.field_e, this.field_k, this.field_g, 0, this.field_f);
            this.field_i.imageComplete(2);
            return;
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_i = param0;
            param0.setDimensions(this.field_f, this.field_e);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_k);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "st.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static jo b(int param0) {
        if (param0 != -5412) {
          st.c(-97);
          return new jo(0, 0, afa.field_c.field_m, 0, (isa) null, afa.field_c.field_r, afa.field_c.field_h, afa.field_c.field_m, afa.field_c.field_m, afa.field_c.field_g, afa.field_c.field_l, false, true, 32768, 0);
        } else {
          return new jo(0, 0, afa.field_c.field_m, 0, (isa) null, afa.field_c.field_r, afa.field_c.field_h, afa.field_c.field_m, afa.field_c.field_m, afa.field_c.field_g, afa.field_c.field_l, false, true, 32768, 0);
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
            st.c(-93);
            field_j = null;
            return;
        }
        field_j = null;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "st.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
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

            stackIn_4_1 = new StringBuilder().append("st.imageUpdate(");

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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
            this.field_f = param0;
            this.field_g = new int[param0 * param1 + 1];
            this.field_e = param1;
            this.field_k = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_a = param2.createImage((java.awt.image.ImageProducer) (this));
            this.a((byte) 10);
            param2.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.a((byte) 10);
            param2.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.a((byte) 10);
            param2.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.a(-19216);
            int var5_int = 15 / ((74 - param3) / 41);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "st.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, ht param1, boolean param2, String param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        lja var10 = null;
        String var11 = null;
        lja var12 = null;
        String var13 = null;
        lja var14 = null;
        String var15 = null;
        lja var16 = null;
        try {
          L0: {
            L1: {
              paa.a(nsa.field_i, param1.f(0), (String) null, 0L, -11635, (int[]) null, param1, -1, (String) null);
              if (!param1.field_ec) {
                break L1;
              } else {
                L2: {
                  if ((param1.field_yb ^ -1) == -3) {
                    break L2;
                  } else {
                    if (ld.field_e >= 2) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var10 = hka.field_b;
                var11 = gl.a((byte) 109, lm.field_o, new String[]{param3});
                var10.field_f.a((byte) -125, 10, var11);
                break L1;
              }
            }
            L3: {
              hka.field_b.a((byte) -84);
              if (!param2) {
                break L3;
              } else {
                if (hka.field_b.field_k == rda.field_o) {
                  var14 = hka.field_b;
                  var15 = gl.a((byte) 103, dka.field_d, new String[]{param3});
                  var14.field_f.a((byte) -65, 16, var15);
                  break L3;
                } else {
                  var12 = hka.field_b;
                  var13 = gl.a((byte) 125, gd.field_J, new String[]{param3});
                  var12.field_f.a((byte) -90, 15, var13);
                  break L3;
                }
              }
            }
            L4: {
              var16 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              if (param0 < -45) {
                break L4;
              } else {
                var7 = (String) null;
                st.a((byte) 0, (ht) null, false, (String) null);
                break L4;
              }
            }
            var16.field_f.b(var6, 0, -61, 0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("st.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_i == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    st() {
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            if (param3 != 2) {
                st.c(-107);
            }
            this.a((byte) 10);
            param2.drawImage(this.field_a, param1, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "st.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_i == param0) {
              this.field_i = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("st.removeConsumer(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
    }
}
