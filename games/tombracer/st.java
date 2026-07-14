/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class st extends cha implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static jea field_j;
    private java.awt.image.ColorModel field_k;

    private final synchronized void a(byte param0) {
        Object var3 = null;
        if (param0 == 10) {
          if (((st) this).field_i == null) {
            return;
          } else {
            ((st) this).field_i.setPixels(0, 0, ((st) this).field_f, ((st) this).field_e, ((st) this).field_k, ((st) this).field_g, 0, ((st) this).field_f);
            ((st) this).field_i.imageComplete(2);
            return;
          }
        } else {
          var3 = null;
          boolean discarded$1 = ((st) this).imageUpdate((java.awt.Image) null, -80, 60, -118, 83, 123);
          if (((st) this).field_i == null) {
            return;
          } else {
            ((st) this).field_i.setPixels(0, 0, ((st) this).field_f, ((st) this).field_e, ((st) this).field_k, ((st) this).field_g, 0, ((st) this).field_f);
            ((st) this).field_i.imageComplete(2);
            return;
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((st) this).field_i = param0;
        param0.setDimensions(((st) this).field_f, ((st) this).field_e);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((st) this).field_k);
        param0.setHints(14);
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
        ((st) this).addConsumer(param0);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        ((st) this).field_f = param0;
        ((st) this).field_g = new int[param0 * param1 + 1];
        ((st) this).field_e = param1;
        ((st) this).field_k = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((st) this).field_a = param2.createImage((java.awt.image.ImageProducer) this);
        this.a((byte) 10);
        boolean discarded$0 = param2.prepareImage(((st) this).field_a, (java.awt.image.ImageObserver) this);
        this.a((byte) 10);
        boolean discarded$1 = param2.prepareImage(((st) this).field_a, (java.awt.image.ImageObserver) this);
        this.a((byte) 10);
        boolean discarded$2 = param2.prepareImage(((st) this).field_a, (java.awt.image.ImageObserver) this);
        ((st) this).a(-19216);
        int var5 = 15 / ((74 - param3) / 41);
    }

    final static void a(byte param0, ht param1, boolean param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        lja var16 = null;
        lja var17 = null;
        lja var18 = null;
        String var19 = null;
        lja var20 = null;
        String var21 = null;
        lja var22 = null;
        lja var23 = null;
        String var24 = null;
        lja var25 = null;
        lja var26 = null;
        String var27 = null;
        lja var28 = null;
        String var29 = null;
        lja var30 = null;
        lja var31 = null;
        String var32 = null;
        lja var33 = null;
        String var34 = null;
        lja var35 = null;
        String var36 = null;
        lja var37 = null;
        lja var38 = null;
        String var39 = null;
        lja var40 = null;
        lja var41 = null;
        String var42 = null;
        lja var43 = null;
        paa.a(nsa.field_i, param1.f(0), (String) null, 0L, -11635, (int[]) null, (jea) (Object) param1, -1, (String) null);
        if (!param1.field_ec) {
          L0: {
            hka.field_b.a((byte) -84);
            if (!param2) {
              break L0;
            } else {
              if (hka.field_b.field_k == rda.field_o) {
                var41 = hka.field_b;
                var42 = gl.a((byte) 103, dka.field_d, new String[1]);
                var41.field_f.a((byte) -65, 16, var42);
                break L0;
              } else {
                var38 = hka.field_b;
                var39 = gl.a((byte) 125, gd.field_J, new String[1]);
                var38.field_f.a((byte) -90, 15, var39);
                var40 = hka.field_b;
                var5 = jm.field_m;
                var6 = lba.field_p;
                if (param0 < -45) {
                  var40.field_f.b(var6, 0, -61, 0, var5);
                  return;
                } else {
                  var7 = null;
                  st.a((byte) 0, (ht) null, false, (String) null);
                  var40.field_f.b(var6, 0, -61, 0, var5);
                  return;
                }
              }
            }
          }
          var43 = hka.field_b;
          var5 = jm.field_m;
          var6 = lba.field_p;
          if (param0 < -45) {
            var43.field_f.b(var6, 0, -61, 0, var5);
            return;
          } else {
            var7 = null;
            st.a((byte) 0, (ht) null, false, (String) null);
            var43.field_f.b(var6, 0, -61, 0, var5);
            return;
          }
        } else {
          if ((param1.field_yb ^ -1) == -3) {
            var23 = hka.field_b;
            var24 = gl.a((byte) 109, lm.field_o, new String[1]);
            var23.field_f.a((byte) -125, 10, var24);
            hka.field_b.a((byte) -84);
            if (param2) {
              L1: {
                if (hka.field_b.field_k == rda.field_o) {
                  var28 = hka.field_b;
                  var29 = gl.a((byte) 103, dka.field_d, new String[1]);
                  var28.field_f.a((byte) -65, 16, var29);
                  break L1;
                } else {
                  var26 = hka.field_b;
                  var27 = gl.a((byte) 125, gd.field_J, new String[1]);
                  var26.field_f.a((byte) -90, 15, var27);
                  break L1;
                }
              }
              var30 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              if (param0 < -45) {
                var30.field_f.b(var6, 0, -61, 0, var5);
                return;
              } else {
                var7 = null;
                st.a((byte) 0, (ht) null, false, (String) null);
                var30.field_f.b(var6, 0, -61, 0, var5);
                return;
              }
            } else {
              var25 = hka.field_b;
              var16 = var25;
              var5 = jm.field_m;
              var6 = lba.field_p;
              if (param0 < -45) {
                var25.field_f.b(var6, 0, -61, 0, var5);
                return;
              } else {
                var7 = null;
                st.a((byte) 0, (ht) null, false, (String) null);
                var25.field_f.b(var6, 0, -61, 0, var5);
                return;
              }
            }
          } else {
            if (ld.field_e >= 2) {
              L2: {
                var31 = hka.field_b;
                var32 = gl.a((byte) 109, lm.field_o, new String[1]);
                var31.field_f.a((byte) -125, 10, var32);
                hka.field_b.a((byte) -84);
                if (!param2) {
                  break L2;
                } else {
                  if (hka.field_b.field_k == rda.field_o) {
                    var35 = hka.field_b;
                    var36 = gl.a((byte) 103, dka.field_d, new String[1]);
                    var35.field_f.a((byte) -65, 16, var36);
                    break L2;
                  } else {
                    var33 = hka.field_b;
                    var34 = gl.a((byte) 125, gd.field_J, new String[1]);
                    var33.field_f.a((byte) -90, 15, var34);
                    break L2;
                  }
                }
              }
              var37 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              if (param0 < -45) {
                var37.field_f.b(var6, 0, -61, 0, var5);
                return;
              } else {
                var7 = null;
                st.a((byte) 0, (ht) null, false, (String) null);
                var37.field_f.b(var6, 0, -61, 0, var5);
                return;
              }
            } else {
              hka.field_b.a((byte) -84);
              if (param2) {
                L3: {
                  if (hka.field_b.field_k == rda.field_o) {
                    var20 = hka.field_b;
                    var21 = gl.a((byte) 103, dka.field_d, new String[1]);
                    var20.field_f.a((byte) -65, 16, var21);
                    break L3;
                  } else {
                    var18 = hka.field_b;
                    var19 = gl.a((byte) 125, gd.field_J, new String[1]);
                    var18.field_f.a((byte) -90, 15, var19);
                    break L3;
                  }
                }
                var22 = hka.field_b;
                var5 = jm.field_m;
                var6 = lba.field_p;
                if (param0 < -45) {
                  var22.field_f.b(var6, 0, -61, 0, var5);
                  return;
                } else {
                  var7 = null;
                  st.a((byte) 0, (ht) null, false, (String) null);
                  var22.field_f.b(var6, 0, -61, 0, var5);
                  return;
                }
              } else {
                var17 = hka.field_b;
                var16 = var17;
                var5 = jm.field_m;
                var6 = lba.field_p;
                if (param0 < -45) {
                  var17.field_f.b(var6, 0, -61, 0, var5);
                  return;
                } else {
                  var7 = null;
                  st.a((byte) 0, (ht) null, false, (String) null);
                  var17.field_f.b(var6, 0, -61, 0, var5);
                  return;
                }
              }
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((st) this).field_i == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    st() {
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param3 != 2) {
          st.c(-107);
          this.a((byte) 10);
          boolean discarded$4 = param2.drawImage(((st) this).field_a, param1, param0, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.a((byte) 10);
          boolean discarded$5 = param2.drawImage(((st) this).field_a, param1, param0, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((st) this).field_i != param0)) {
            ((st) this).field_i = null;
        }
    }

    static {
    }
}
