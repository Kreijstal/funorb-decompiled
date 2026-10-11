/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge extends qd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static hh field_p;
    static int field_i;
    static String field_m;
    static boolean field_n;
    static bi[] field_l;
    private java.awt.image.ImageConsumer field_o;
    private java.awt.image.ColorModel field_j;
    static bi[] field_k;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(String param0, int param1, boolean param2, int param3, java.awt.Color param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = tm.field_i.getGraphics();
            if (ha.field_a == null) {
              ha.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, me.field_e, nn.field_b);
            }
            if (param4 == null) {
              param4 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (rm.field_a == null) {
                rm.field_a = tm.field_i.createImage(304, 34);
              }
              var10 = rm.field_a.getGraphics();
              var10.setColor(param4);
              var10.drawRect(0, param3, 303, 33);
              var10.fillRect(2, 2, 3 * param1, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param1 + 2, 2, 300 - param1 * 3, 30);
              var10.setFont(ha.field_a);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (-(6 * param0.length()) + 304) / 2, 22);
              var9.drawImage(rm.field_a, me.field_e / 2 - 152, -18 + nn.field_b / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = me.field_e / 2 - 152;
              var8 = nn.field_b / 2 - 18;
              var9.setColor(param4);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, 2 + var8, 3 * param1, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, var8 + 1, 301, 31);
              var9.fillRect(param1 * 3 + (var7 + 2), 2 + var8, 300 - 3 * param1, 30);
              var9.setFont(ha.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, (304 - 6 * param0.length()) / 2 + var7, 22 + var8);
            }
            if (gd.field_a != null) {
              var9.setFont(ha.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(gd.field_a, me.field_e / 2 - 6 * gd.field_a.length() / 2, -26 + nn.field_b / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            tm.field_i.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("ge.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var14 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var12 = -param8; var12 < 0; var12++) {
            for (var13 = -param5; 0 > var13; var13++) {
              param3 = param0[param1++];
              if (param3 != 0 &&
                255 != param3) {
                var11 = 255 & param3;
                var10_int = param2[param6];
                incrementValue$1 = param6;
                param6++;
                param2[incrementValue$1] = ee.a(we.a(16711935, we.a(16711935, var10_int) * var11 >> 8), we.a(16711920, we.a(var10_int, 65280) * var11) >> 8);
              } else {
                param6++;
              }
            }
            param1 = param1 + param7;
            param6 = param6 + param9;
          }
          if (param4 != -28646) {
            ge.a(69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("ge.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_o;
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
          stackIn_4_1 = new StringBuilder().append("ge.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final synchronized void b(int param0) {
        if (this.field_o == null) {
          return;
        }
        if (param0 < 23) {
          java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
          this.startProduction((java.awt.image.ImageConsumer) null);
        }
        this.field_o.setPixels(0, 0, this.field_g, this.field_d, this.field_j, this.field_c, 0, this.field_g);
        this.field_o.imageComplete(2);
    }

    final void a(int param0, java.awt.Component param1, byte param2, int param3) {
        try {
          this.field_d = param0;
          this.field_g = param3;
          this.field_c = new int[param0 * param3 + 1];
          this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_b = param1.createImage((java.awt.image.ImageProducer) (this));
          this.b(88);
          param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.b(111);
          param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.b(49);
          param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.a((byte) 109);
          if (param2 > -91) {
            field_m = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ge.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        java.awt.Color var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0 != -134) {
            var3 = (java.awt.Color) null;
            ge.a((String) null, -93, true, -3, (java.awt.Color) null);
          }
          if (param1.equals("I")) {
            stackIn_9_0 = Integer.TYPE;
            return stackIn_9_0;
          }
          if (param1.equals("S")) {
            stackIn_13_0 = Short.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("J")) {
            stackIn_17_0 = Long.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("Z")) {
            stackIn_21_0 = Boolean.TYPE;
            return stackIn_21_0;
          }
          if (param1.equals("F")) {
            stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (param1.equals("D")) {
            stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!param1.equals("C")) {
            stackIn_32_0 = Class.forName(param1);
            return stackIn_32_0;
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("ge.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 6) {
          int[] var2 = (int[]) null;
          ge.a((int[]) null, -98, (int[]) null, -45, 88, 3, -20, 17, 70, -82);
        }
        field_p = null;
        field_l = null;
        field_m = null;
        field_k = null;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == this.field_o) {
            this.field_o = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ge.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ge.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_o = param0;
          param0.setDimensions(this.field_g, this.field_d);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_j);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ge.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        try {
          this.b(101);
          if (param2 >= -56) {
            ge.a(-40);
          }
          param0.drawImage(this.field_b, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ge.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ge() {
    }

    static {
        field_m = "to return to the normal view.";
        field_n = true;
    }
}
