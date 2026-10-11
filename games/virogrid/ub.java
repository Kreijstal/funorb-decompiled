/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends nb {
    static byte[] field_D;
    static volatile boolean field_F;
    byte field_A;
    jc field_B;
    static dl field_E;
    int field_C;
    static qm field_z;

    public static void f(int param0) {
        field_z = null;
        field_E = null;
        int var1 = 125 % ((-84 - param0) / 36);
        field_D = null;
    }

    final byte[] b(byte param0) {
        if (param0 != 39) {
          return (byte[]) null;
        }
        if (this.field_t) {
          throw new RuntimeException();
        }
        if (this.field_B.field_l >= this.field_B.field_g.length - this.field_A) {
          return this.field_B.field_g;
        }
        throw new RuntimeException();
    }

    final static boolean g(int param0) {
        int var1 = 117 % ((5 - param0) / 51);
        return hm.a(d.field_Gb, oc.field_n, -24236);
    }

    final static void b(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param0, 8);
        if (param1 == -12508) {
          var2.a(1, -126);
          var2.a(1, -82);
          return;
        }
    }

    final int e(int param0) {
        if (param0 != 0) {
          ub.g(-41);
          if (this.field_B != null) {
            return 100 * this.field_B.field_l / (-this.field_A + this.field_B.field_g.length);
          }
          return 0;
        }
        if (this.field_B != null) {
          return 100 * this.field_B.field_l / (-this.field_A + this.field_B.field_g.length);
        }
        return 0;
    }

    final static kg a(int param0, String param1) {
        RuntimeException var2 = null;
        kg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (w.field_I.b(-106) &&
            !param1.equals(w.field_I.a(32))) {
            w.field_I = oe.a(param1, false);
          }
          if (param0 <= 54) {
            field_D = (byte[]) null;
          }
          stackIn_7_0 = w.field_I;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ub.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, String param2) {
        if (param0 != 102) {
          return;
        }
        try {
          sa.a((byte) 107, param2, param1, false);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ub.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, int param3, int param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var9 = fi.field_v.getGraphics();
            if (null == oh.field_c) {
              oh.field_c = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param1) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, fl.field_i, km.field_B);
            }
            if (param0 == null) {
              param0 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == oj.field_Gb) {
                oj.field_Gb = fi.field_v.createImage(304, 34);
              }
              var10 = oj.field_Gb.getGraphics();
              var10.setColor(param0);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param3, 30);
              var7 = 1 / ((param4 + 88) / 35);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
              var10.setFont(oh.field_c);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
              var9.drawImage(oj.field_Gb, fl.field_i / 2 - 152, -18 + km.field_B / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + fl.field_i / 2;
              var8 = -18 + km.field_B / 2;
              var9.setColor(param0);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, 3 * param3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(2 + (var7 + param3 * 3), var8 + 2, 300 - 3 * param3, 30);
              var9.setFont(oh.field_c);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, var7 + (-(param2.length() * 6) + 304) / 2, 22 + var8);
            }
            if (tm.field_k == null) {
              return;
            }
            var9.setFont(oh.field_c);
            var9.setColor(java.awt.Color.white);
            var9.drawString(tm.field_k, fl.field_i / 2 - tm.field_k.length() * 6 / 2, -26 + km.field_B / 2);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            fi.field_v.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var5_ref;
          stackIn_18_1 = new StringBuilder().append("ub.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    ub() {
    }

    static {
        field_F = true;
        field_E = new dl();
    }
}
