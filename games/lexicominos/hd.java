/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static r field_a;

    public static void a(int param0) {
        if (param0 > -100) {
          java.awt.Color var2 = (java.awt.Color) null;
          hd.a(-104, (byte) 63, (String) null, true, (java.awt.Color) null);
        }
        field_a = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param4 != 0) {
            field_a = (r) null;
          }
          for (var10_int = -param3; 0 > var10_int; var10_int++) {
            param6[param1] = param0[(param2 >> 20) * param8 + param7];
            param2 = param2 + param9;
            param1 = param1 + param5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_9_0 = var10;
          stackIn_9_1 = new StringBuilder().append("hd.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, String param2, boolean param3, java.awt.Color param4) {
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
            var9 = ug.field_y.getGraphics();
            if (null == af.field_a) {
              af.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, u.field_sb, bk.field_d);
            }
            if (param4 == null) {
              param4 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (wb.field_g == null) {
                wb.field_g = ug.field_y.createImage(304, 34);
              }
              var10 = wb.field_g.getGraphics();
              var10.setColor(param4);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param0, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + 3 * param0, 2, 300 - param0 * 3, 30);
              var10.setFont(af.field_a);
              if (param1 != -90) {
                field_a = (r) null;
              }
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
              var9.drawImage(wb.field_g, -152 + u.field_sb / 2, bk.field_d / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = u.field_sb / 2 - 152;
              var8 = bk.field_d / 2 - 18;
              var9.setColor(param4);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, 1 + var8, 301, 31);
              var9.fillRect(param0 * 3 + 2 + var7, var8 + 2, 300 - 3 * param0, 30);
              var9.setFont(af.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, (-(param2.length() * 6) + 304) / 2 + var7, 22 + var8);
            }
            if (null != of.field_c) {
              var9.setFont(af.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(of.field_c, u.field_sb / 2 - 6 * of.field_c.length() / 2, bk.field_d / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ug.field_y.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("hd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          var3 = 1;
          if (param1 != 17) {
            hd.a(89);
          }
          while (var3 < param0.length()) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
            var3++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("hd.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
