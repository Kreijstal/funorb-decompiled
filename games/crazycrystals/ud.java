/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends en {
    private th field_V;
    private int field_W;
    private int field_ab;
    private int field_T;
    static boolean field_U;
    static int[] field_bb;
    static int field_Z;
    static hm[] field_S;
    private qm field_X;
    private int field_R;
    private fp field_Q;
    private int field_Y;

    private final void a(int param0, qm param1) {
        try {
          if (null != this.field_V) {
            this.field_V.a(false);
          }
          if (param1 == null) {
            this.field_V = new th();
          } else {
            param1.a(param1.field_f, 6, this.field_R + 6, param1.field_g, (byte) -52);
            this.field_V = new th(param1);
          }
          this.b(this.field_V, param0 + 26550);
          if (param0 != -26498) {
            this.k(103);
          }
          this.field_X = null;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ud.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean e(byte param0) {
        if (param0 == 79) {
          this.j(-1);
          return super.e((byte) 79);
        }
        this.field_Q = (fp) null;
        this.j(-1);
        return super.e((byte) 79);
    }

    final void j(int param0) {
        if (null != this.field_Q) {
          if (mi.field_D != this.field_Q) {
            this.a(12 + this.field_R + this.field_X.field_f, (byte) -94, 12 + this.field_X.field_g);
            this.a(-26498, this.field_X);
          }
          this.field_V.field_z = 256;
          this.field_Q = null;
        }
        super.j(param0);
    }

    void a(qm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_X = param0;
          if (ok.field_b != this.field_Q) {
            if (this.field_Q != jh.field_f) {
              this.field_Q = jh.field_f;
              this.field_Y = 0;
            }
          } else {
            this.a(this.field_ab, this.field_R + 12 + this.field_X.field_f, (byte) -93, 12 + this.field_X.field_g);
            this.field_Y = 0;
          }
          if (param1 == -50) {
            return;
          }
          this.field_V = (th) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ud.CA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void k(int param0) {
        if (this.field_Q == jh.field_f) {
          return;
        }
        this.field_Y = 0;
        this.field_Q = mi.field_D;
        this.a(-26498, this.field_X);
        this.field_V.field_z = 0;
        if (param0 == 42) {
          this.field_X = null;
          return;
        }
        this.field_Y = 16;
        this.field_X = null;
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_V == null) {
            return false;
          }
          if (98 == param0) {
            this.field_V.a(true, param2);
          }
          if (99 == param0) {
            this.field_V.a(true, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ud.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 <= -6) {
          field_bb = null;
          field_S = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ud.a((CharSequence) null, -109, (byte) -70, false);
        field_bb = null;
        field_S = null;
    }

    boolean g(byte param0) {
        int fieldTemp$0 = 0;
        int var3 = CrazyCrystals.field_B;
        if (param0 != 8) {
          return true;
        }
        if (this.field_Q == null) {
          return super.g((byte) 8);
        }
        if (this.field_Q != jh.field_f) {
          if (mi.field_D != this.field_Q) {
            return super.g((byte) 8);
          }
          fieldTemp$0 = this.field_Y + 1;
          this.field_Y = this.field_Y + 1;
          if (fieldTemp$0 == this.field_W) {
            this.field_V.field_z = 256;
            this.field_Q = null;
            return super.g((byte) 8);
          }
          this.field_V.field_z = (this.field_Y << 8) / this.field_W;
          return super.g((byte) 8);
        }
        int fieldTemp$1 = this.field_Y + 1;
        this.field_Y = this.field_Y + 1;
        if (this.field_T == fieldTemp$1) {
          this.field_Q = ok.field_b;
          this.a(this.field_ab, this.field_X.field_f + (12 + this.field_R), (byte) -93, this.field_X.field_g + 12);
          this.field_Y = 0;
          this.field_V.field_z = 0;
          return super.g((byte) 8);
        }
        this.field_V.field_z = 256 - (this.field_Y << 8) / this.field_T;
        return super.g((byte) 8);
    }

    ud(ol param0, qm param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_g, param1.field_f + 12 + param2);
        try {
          this.field_R = param2;
          this.field_W = param3;
          this.field_T = param3;
          this.field_ab = param4;
          this.a(-26498, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, java.awt.Color param3, boolean param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var9 = jd.field_D.getGraphics();
            if (null == fg.field_i) {
              fg.field_i = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param4) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, ap.field_r, rh.field_f);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == ba.field_h) {
                ba.field_h = jd.field_D.createImage(304, 34);
              }
              var10 = ba.field_h.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param2, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(param1, 1, 301, 31);
              var10.fillRect(2 + param2 * 3, 2, -(param2 * 3) + 300, 30);
              var10.setFont(fg.field_i);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
              var9.drawImage(ba.field_h, ap.field_r / 2 - 152, -18 + rh.field_f / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + ap.field_r / 2;
              var8 = -18 + rh.field_f / 2;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, param2 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(3 * param2 + var7 + 2, var8 + 2, 300 - param2 * 3, 30);
              var9.setFont(fg.field_i);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (304 - 6 * param0.length()) / 2, 22 + var8);
            }
            if (nd.field_o == null) {
              return;
            }
            var9.setFont(fg.field_i);
            var9.setColor(java.awt.Color.white);
            var9.drawString(nd.field_o, ap.field_r / 2 - 6 * nd.field_o.length() / 2, rh.field_f / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            jd.field_D.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("ud.LA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1, byte param2, boolean param3) {
        int var9 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = 69 / ((param2 - 19) / 59);
            var8 = param0.length();
            for (var9 = 0; var8 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param0.charAt(var9);
              if ((0 == var9) &&
                (45 == var10)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var9 || (var10 != 43 ||
                !param3))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  122 >= var10) {
                  var10 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var10 >= param1) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var6 * param1 + var10;
                if (var6 != var11 / param1) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var11;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_40_0 = var6;
            return stackIn_40_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("ud.RB(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_bb = new int[8192];
        field_U = false;
        field_Z = 0;
    }
}
