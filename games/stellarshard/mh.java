/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mh extends vi implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_k;
    static byte[][] field_j;
    static pb[] field_i;
    private java.awt.image.ImageConsumer field_l;
    static String[] field_h;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_l == param0) {
            this.field_l = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mh.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == 2188) {
          field_j = (byte[][]) null;
          field_h = null;
          field_i = null;
          return;
        }
        field_i = (pb[]) null;
        field_j = (byte[][]) null;
        field_h = null;
        field_i = null;
    }

    private final synchronized void b(boolean param0) {
        if (this.field_l == null) {
          return;
        }
        if (!param0) {
          this.field_l.setPixels(0, 0, this.field_g, this.field_f, this.field_k, this.field_e, 0, this.field_g);
          this.field_l.imageComplete(2);
          return;
        }
        java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
        this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        this.field_l.setPixels(0, 0, this.field_g, this.field_f, this.field_k, this.field_e, 0, this.field_g);
        this.field_l.imageComplete(2);
    }

    final void a(java.awt.Component param0, int param1, int param2, byte param3) {
        try {
          this.field_e = new int[param2 * param1 + 1];
          this.field_f = param1;
          this.field_g = param2;
          int var5_int = -68 / ((param3 + 79) / 35);
          this.field_k = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_b = param0.createImage((java.awt.image.ImageProducer) (this));
          this.b(false);
          param0.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.b(false);
          param0.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.b(false);
          param0.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.a((byte) -107);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(ha param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -2) {
            field_h = (String[]) null;
          }
          stackIn_5_0 = (1 == param0.e(1, 8));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mh.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, String param2, uj param3, bd param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = param0; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param3.field_a[0] + param4.b(param2.substring(0, var7));
            }
            if (-1 == var6) {
              if (32 == var8) {
                var5_int = var5_int + param1;
              }
              param3.field_a[var7] = (var5_int >> 8) + (param3.field_a[0] + param4.b(param2.substring(0, 1 + var7))) - param4.a((char) var8);
            } else {
              param3.field_a[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("mh.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.field_g, this.field_f);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_k);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    mh() {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
          this.b(false);
          param1.drawImage(this.field_b, param0, param3, (java.awt.image.ImageObserver) (this));
          if (param2 != -22984) {
            field_j = (byte[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = b.field_u.a("", param1, (byte) -12);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("mh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_j = new byte[50][];
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
