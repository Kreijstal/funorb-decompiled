/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends gn implements dm {
    static el field_N;
    static String field_K;
    private ae field_M;
    private ae field_O;
    private ae field_L;

    final static boolean a(int param0, byte param1) {
        if (param1 != 114) {
          qb.a(false);
        }
        return 0 <= param0 ? true : false;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TetraLink.field_J;
        try {
          if (param0 > 0) {
            this.a(-118, -114, -30, -7);
          }
          if (param1 != this.field_M) {
            if (param1 == this.field_L) {
              wk.b(108);
            } else {
              if (param1 == this.field_O) {
                vg.i(5959);
              }
            }
          } else {
            fi.t(11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qb.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_t + param1;
        int var6 = this.field_w + param2;
        od.field_S.a(we.field_m, 20 + var5, 20 + var6, -40 + this.field_F, -50 + this.field_u, 16777215, -1, 1, 0, od.field_S.field_N);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        if (param0 <= 54) {
          qb.a(-48);
        }
        field_N = null;
        field_K = null;
    }

    final static void a(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = kd.field_g;
        synchronized (var1) {
          ho.field_X = kf.field_c;
          ea.field_a = ea.field_a + 1;
          aa.field_Nb = nl.field_d;
          a.field_a = va.field_y;
          qd.field_T = tl.field_M;
          tl.field_M = param0;
          tm.field_t = tg.field_f;
          ci.field_B = qc.field_Z;
          li.field_o = qm.field_c;
          tg.field_f = 0;
        }
    }

    public qb() {
        super(0, 0, 476, 225, (kg) null);
        this.field_L = new ae(jm.field_f, (dn) null);
        this.field_M = new ae(bg.field_n, (dn) null);
        this.field_O = new ae(pi.field_d, (dn) null);
        uj var1 = new uj();
        this.field_L.field_H = (kg) ((Object) var1);
        this.field_M.field_H = (kg) ((Object) var1);
        this.field_O.field_H = (kg) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_M.a(30, -var2 + (this.field_u - 48), -125, this.field_F - var3 >> 1, var4);
        this.field_O.a(30, -48 + (this.field_u - var2), -119, var2 + (-var3 + this.field_F >> 1) + var4, var4);
        this.field_L.a(30, -(2 * var2) + (-78 + this.field_u), -9, -var3 + this.field_F >> 1, var3);
        this.field_M.field_s = (dn) (this);
        this.field_L.field_s = (dn) (this);
        this.field_L.field_C = vc.field_e;
        this.field_O.field_s = (dn) (this);
        this.field_O.field_C = rk.field_a;
        this.c(this.field_M, 10);
        this.c(this.field_L, 10);
        this.c(this.field_O, 10);
    }

    final static byte[] a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        li var5 = null;
        byte[] var6 = null;
        var7 = TetraLink.field_J;
        try {
          if (param3 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
              var8[var5_int] = param0[var5_int + param3];
            }
          } else {
            var4 = param0;
          }
          if (param1 != -89) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var5 = new li();
          var5.a(false);
          var5.a(var4, (long)(8 * param2), true);
          var6 = new byte[64];
          var5.a(var6, 0, param1 ^ 97);
          stackIn_10_0 = var6;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("qb.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(boolean param0, CharSequence param1, byte param2, int param3) {
        int var8 = 0;
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
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          if (2 <= param3 &&
            36 >= param3) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            if (param2 >= -51) {
              qb.a(-91);
            }
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param3) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param3 * var6;
                if (var10 / param3 != var6) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_40_0 = var6;
            return stackIn_40_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("qb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            qb.a(-72, (byte) -52);
          }
          if (super.a(param0, param1, param2 ^ 0, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.d(param3, -102);
            return stackIn_8_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param3, param2 + 114);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qb.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_K = "Return to Main Menu";
    }
}
