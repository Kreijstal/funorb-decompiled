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
            ((of) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "of.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

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
              if (param0 != ((of) this).field_j) {
                break L1;
              } else {
                ((of) this).field_j = null;
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
            stackOut_3_1 = new StringBuilder().append("of.removeConsumer(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final synchronized void a(boolean param0) {
        if (!(null != ((of) this).field_j)) {
            return;
        }
        ((of) this).field_j.setPixels(0, 0, ((of) this).field_b, ((of) this).field_f, ((of) this).field_l, ((of) this).field_c, 0, ((of) this).field_b);
        ((of) this).field_j.imageComplete(2);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((of) this).field_j = param0;
            param0.setDimensions(((of) this).field_b, ((of) this).field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((of) this).field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "of.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("of.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            ((of) this).field_c = new int[1 + param1 * param0];
            ((of) this).field_b = param0;
            ((of) this).field_f = param1;
            ((of) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            if (param2 != -36) {
                Object var6 = null;
                ((of) this).addConsumer((java.awt.image.ImageConsumer) null);
            }
            ((of) this).field_d = param3.createImage((java.awt.image.ImageProducer) this);
            this.a(true);
            boolean discarded$0 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
            this.a(true);
            boolean discarded$1 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
            this.a(true);
            boolean discarded$2 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
            ((of) this).a(0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "of.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.a(true);
            if (param3 <= 34) {
                Object var6 = null;
                ((of) this).a(16, 118, (byte) 14, (java.awt.Component) null);
            }
            boolean discarded$0 = param2.drawImage(((of) this).field_d, param1, param0, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "of.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void b(int param0) {
        field_n = null;
        field_h = null;
        field_i = null;
        field_k = null;
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
        int[] var11 = null;
        int[] var12 = null;
        ef[] stackIn_3_0 = null;
        ef[] stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        ef[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef[] stackOut_16_0 = null;
        Object stackOut_11_0 = null;
        ef[] stackOut_8_0 = null;
        ef[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.b(2)) {
              var8 = param0.a(-84);
              L1: while (true) {
                if (var8.field_d != 0) {
                  if (var8.field_d != 2) {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new ef[var12.length >> 2];
                    if (param1 == 5) {
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackOut_16_0 = (ef[]) var4;
                          stackIn_17_0 = stackOut_16_0;
                          break L0;
                        } else {
                          var6 = new ef();
                          var4[var5] = var6;
                          var6.field_d = var3[var5 << 2];
                          var6.field_e = var3[1 + (var5 << 2)];
                          var6.field_g = var3[2 + (var5 << 2)];
                          var6.field_f = var3[3 + (var5 << 2)];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      return (ef[]) (Object) stackIn_12_0;
                    }
                  } else {
                    stackOut_8_0 = new ef[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  gi.a((byte) -64, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new ef[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("of.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((of) this).field_j == param0;
    }

    of() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Armour: ";
        field_m = new int[]{1, 1, 1, 2, 3, 2, 3, 2, 2, 2, 3, 5, 5, 10, 10, 10, 3};
        field_i = "Toggle schematic view";
        field_h = new String[]{"", "", "", "", "", "", "Experimental Laser", "Laser Carbine", "Alien Weapon", "Large Alien Weapon", "Pulse Carbine", "Pulse Grenade", "New Alien Weapons", "New Alien Weapons", "Heavy Fusion Gun", "Fusion Launcher", "Fusion Rifle", "Alien Shield", "", "", ""};
    }
}
