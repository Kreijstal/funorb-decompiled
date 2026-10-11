/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends lk implements dm {
    private ho field_Bb;
    static int field_Db;
    private boolean field_Eb;
    private boolean field_yb;
    static String[] field_Ab;
    static String field_zb;
    static String field_xb;
    static boolean field_Cb;

    final static void a(String param0, int param1, byte param2) {
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          jd.field_a = false;
          s.field_f = false;
          if (null != fl.field_u &&
            fl.field_u.field_K) {
            var3_int = 1;
            if (8 == param1) {
              if (!qa.field_v) {
                param0 = ek.field_r;
              } else {
                param0 = fk.field_R;
              }
              param1 = 2;
              ao.field_c.a(true, mk.field_d);
            }
            if (10 == param1) {
              var3_int = 0;
              hk.a((byte) -89);
            }
            if (var3_int != 0) {
              if (jd.field_a) {
                param0 = sk.a(new String[]{param0}, lb.field_U, 122);
              }
              if (sn.field_b) {
                param0 = bf.field_s;
              }
              fl.field_u.a(param0, param1, 17);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !qa.field_v) {
              ao.field_c.a(1379);
            }
          }
          if (param2 != 20) {
            var4 = (String) null;
            fi.a(true, (String) null, (byte) -53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("fi.NB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (this.field_yb) {
          jd.a((byte) -71, false, true);
          return;
        }
        ud.d((byte) 58);
        if (param0 >= 0) {
          return;
        }
        try {
          this.r(-125);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fi.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fi(pk param0, ho param1) {
        super(param0, ab.field_V, ic.field_a, false, false);
        try {
          this.field_Bb = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_zb = null;
        int var1 = 90 / ((64 - param0) / 35);
        field_Ab = null;
        field_xb = null;
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -68) {
            stackIn_2_0 = -51;
            return stackIn_2_0;
          }
          if (!param0) {
            stackIn_7_0 = dk.field_d.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = cf.field_o.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fi.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(byte param0, fj param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = TetraLink.field_J;
        try {
          var2_int = t.field_l;
          if (2 == param1.field_i) {
            if (param1.field_l) {
              var2_intLifetime1 = t.field_l;
            } else {
              if (param1.field_g == 0 &&
                param1.field_s == 0) {
                var2_intLifetime1 = pg.field_f[param1.field_i];
              } else {
                var2_intLifetime1 = un.field_j[param1.field_i];
              }
            }
          } else {
            if (param1.field_i == 4) {
              var2_intLifetime1 = un.field_j[param1.field_i];
            } else {
              if (~param1.field_r == ~oj.field_c) {
                var2_intLifetime1 = pg.field_f[param1.field_i];
              } else {
                var2_intLifetime1 = un.field_j[param1.field_i];
              }
            }
          }
          if (param0 >= 81) {
            stackIn_18_0 = var2_intLifetime1;
            return stackIn_18_0;
          }
          stackIn_16_0 = 100;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("fi.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1, bc param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TetraLink.field_J;
        try {
          if (param3 != 119) {
            field_Ab = (String[]) null;
          }
          var4_int = param2.e(param0, (byte) -112);
          if (0 == var4_int) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param2.e(3, (byte) -112);
          var6 = (byte)param2.e(8, (byte) -112);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(var6 + param2.e(var5, (byte) -112));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("fi.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void t(int param0) {
        if (param0 != 11) {
          field_xb = (String) null;
        }
        String var2 = (String) null;
        ve.a(-1, (String) null, "");
    }

    final void s(int param0) {
        if (param0 <= 1) {
          field_Cb = false;
        }
        this.a(hj.a(wc.field_K, 248, false), 22811, true);
    }

    final static void a(int param0, int param1, String param2, int param3, String param4, String param5) {
        fj var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          var6 = new fj(param3, param2, param0, param5, param4);
          ei.a(-2792, var6);
          if (param1 != 0) {
            field_zb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("fi.MB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(sj param0, int param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ba var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          if (param1 != 22811) {
            field_zb = (String) null;
          }
          this.field_Eb = true;
          if (!param0.field_f) {
            if (param0.field_h == null) {
              var4 = param0.field_i;
              if (param0.field_d == 248) {
                if (!param2) {
                  vj.a(param1 - 22810);
                }
                var4 = wc.field_K;
                this.field_yb = true;
              }
            } else {
              var4 = qc.field_fb;
              if (this.field_Bb != null) {
                this.field_Bb.a(true);
              }
            }
          } else {
            var4 = te.field_N;
          }
          var5 = new ba((lk) (this), ab.field_V, var4);
          if (param0.field_f) {
            if (param0.field_b) {
              this.e(new ia(this), -27667);
              return;
            }
            var5.a((dn) (this), param1 ^ -22896, al.field_e);
          } else {
            if (this.field_yb) {
              var5.a((dn) (this), param1 ^ -22882, al.field_e);
            } else {
              if (param0.field_d == 5) {
                var5.a(ml.field_hb, 11, 122);
                var5.a(uh.field_a, 17, 95);
              } else {
                var5.a(nb.field_T, -1, 111);
              }
            }
            if (param0.field_d != 3) {
              if (param0.field_d != 6) {
                this.e(var5, -27667);
                return;
              }
              var5.a(em.field_c, 9, 115);
            } else {
              var5.a(hl.field_C, 7, 75);
            }
          }
          this.e(var5, -27667);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("fi.LB(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean l(int param0) {
        sj var2 = null;
        if (param0 != -1) {
          field_Ab = (String[]) null;
        }
        if (this.field_K &&
          !this.field_Eb) {
          var2 = ik.a(127);
          if (var2 != null) {
            this.a(var2, 22811, false);
          }
        }
        return super.l(-1);
    }

    final static boolean a(long param0, int param1, String param2, byte param3, int[] param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -81) {
            field_Cb = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4 != null && (param1 != 2 ||
            nl.a((byte) 127, param2, param0))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("fi.PB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Db = -1;
        field_xb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_Cb = true;
        field_zb = "Players";
    }
}
