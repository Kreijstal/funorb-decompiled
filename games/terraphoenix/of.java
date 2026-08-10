/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class of extends te implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String[] field_h;
    static String field_n;
    static int[] field_m;
    static String field_i;
    private java.awt.image.ColorModel field_l;
    private java.awt.image.ImageConsumer field_j;
    static byte[][] field_k;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "of.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
            if (param0 == this.field_j) {
                this.field_j = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "of.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(boolean param0) {
        if (!(null != this.field_j)) {
            return;
        }
        this.field_j.setPixels(0, 0, this.field_b, this.field_f, this.field_l, this.field_c, 0, this.field_b);
        if (!param0) {
            field_n = (String) null;
        }
        this.field_j.imageComplete(2);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_j = param0;
            param0.setDimensions(this.field_b, this.field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "of.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
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

            stackIn_4_1 = new StringBuilder().append("of.imageUpdate(");

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
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            this.field_c = new int[1 + param1 * param0];
            this.field_b = param0;
            this.field_f = param1;
            this.field_l = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            if (param2 != -36) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.addConsumer((java.awt.image.ImageConsumer) null);
            }
            this.field_d = param3.createImage((java.awt.image.ImageProducer) (this));
            this.a(true);
            param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.a(true);
            param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.a(true);
            param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.a(0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "of.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.a(true);
            if (param3 <= 34) {
                java.awt.Component var6 = (java.awt.Component) null;
                this.a(16, 118, (byte) 14, (java.awt.Component) null);
            }
            param2.drawImage(this.field_d, param1, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "of.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 < 66) {
            field_n = (String) null;
        }
        field_n = null;
        field_h = null;
        field_i = null;
        field_k = (byte[][]) null;
        field_m = null;
    }

    final static ef[] a(he param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ef[] var4 = null;
        int var5 = 0;
        ef var6 = null;
        int var7 = 0;
        mf var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ef[] stackIn_3_0 = null;
        ef[] stackIn_9_0 = null;
        ef[] stackIn_12_0 = null;
        ef[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.b(2)) {
              var8 = param0.a(-84);
              L1: while (true) {
                if (var8.field_d != 0) {
                  if ((var8.field_d ^ -1) != -3) {
                    var10 = (int[]) (var8.field_e);
                    var9 = var10;
                    var3 = var9;
                    var4 = new ef[var10.length >> 289190274];
                    if (param1 == 5) {
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackIn_17_0 = (ef[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new ef();
                          var4[var5] = var6;
                          var6.field_d = var3[var5 << 1999408194];
                          var6.field_e = var3[1 + (var5 << -942380542)];
                          var6.field_g = var3[2 + (var5 << 78991650)];
                          var6.field_f = var3[3 + (var5 << -1660728830)];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_12_0 = (ef[]) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = new ef[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  gi.a((byte) -64, 10L);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new ef[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("of.J(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_j == param0;
    }

    of() {
    }

    static {
        field_n = "Armour: ";
        field_m = new int[]{1, 1, 1, 2, 3, 2, 3, 2, 2, 2, 3, 5, 5, 10, 10, 10, 3};
        field_i = "Toggle schematic view";
        field_h = new String[]{"", "", "", "", "", "", "Experimental Laser", "Laser Carbine", "Alien Weapon", "Large Alien Weapon", "Pulse Carbine", "Pulse Grenade", "New Alien Weapons", "New Alien Weapons", "Heavy Fusion Gun", "Fusion Launcher", "Fusion Rifle", "Alien Shield", "", "", ""};
    }
}
