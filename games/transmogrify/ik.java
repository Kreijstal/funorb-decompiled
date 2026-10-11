/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ik extends a implements df {
    private boolean field_db;
    static tf field_cb;
    private kg field_hb;
    private boolean field_jb;
    private boolean field_gb;
    private qe field_fb;
    static long[] field_ib;
    private boolean field_eb;

    final static String q(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = Transmogrify.field_A ? 1 : 0;
        var6 = "(" + bd.field_t + " " + nf.field_k + " " + dg.field_a + ") " + ca.field_e;
        var1 = var6;
        if (param0 != 48) {
          field_cb = (tf) null;
        }
        if (tg.field_a > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < tg.field_a; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & nf.field_l.field_g[var2];
            var4 = var3 >> 4;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -121 % ((param2 - 65) / 55);
          if (param0 != 13) {
            stackIn_5_0 = super.a(param0, param1, (byte) 123, param3);
            return stackIn_5_0;
          }
          this.r(77);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ik.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void t(int param0) {
        this.field_fb.a(true, 4210752, param0);
        ee var2 = new ee(this, this.field_hb, cc.field_b);
        var2.a(lc.field_L, 15, 1);
        this.b(-21, var2);
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_7_1 = false;
        ee stackIn_12_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ee var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (this.field_db) {
            return;
          }
          stackIn_7_1 = (param1 == 256);
          this.field_gb = stackIn_7_1;
          this.field_db = true;
          this.field_fb.a(true, 4210752, 8405024);
          var6 = new ee(this, this.field_hb, param0);
          if (5 != param1) {
            if (param1 == 256) {
              var6.a((ma) (this), 8283, rc.field_b);
            } else {
              stackIn_12_0 = var6;
              if (!this.field_eb) {
                stackIn_13_1 = te.field_f;
              } else {
                stackIn_13_1 = rc.field_b;
              }
              ((ee) (Object) stackIn_12_0).a(stackIn_13_1, -1, 1);
            }
          } else {
            var6.a(qb.field_a, 11, param2 + 5);
            var6.a(ta.field_b, 17, param2 + 5);
          }
          if (~param1 == param2) {
            var6.a(ad.field_f, 7, param2 + 5);
          } else {
            if (param1 != 4) {
              if (6 != param1) {
                if (param1 == 9) {
                  var6.a((ma) (this), param2 + 8287, of.field_b);
                }
              } else {
                var6.a(ee.field_C, 9, param2 ^ -3);
              }
            } else {
              var6.a(ch.field_a, 8, 1);
            }
          }
          this.b(-96, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ik.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ik(da param0, kg param1, String param2, boolean param3, boolean param4) {
        super(param0, new ee((ik) null, param1, param2), 77, 10, 10);
        try {
          this.field_eb = param3 ? true : false;
          this.field_gb = false;
          this.field_jb = param4 ? true : false;
          this.field_db = false;
          this.field_hb = param1;
          this.field_fb = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_fb.field_w = true;
          this.a((qg) (this.field_fb), (byte) -88);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void s(int param0) {
        field_ib = null;
        field_cb = null;
        int var1 = -30 % ((param0 - 50) / 47);
    }

    final void r(int param0) {
        if (!this.field_A) {
          return;
        }
        this.field_A = false;
        if (param0 != 77) {
          this.r(-69);
        }
        if (this.field_eb) {
          ai.b(param0 - 202);
        } else {
          if (this.field_jb) {
            ff.a((byte) -124);
          }
        }
    }

    final static ti[] a(String param0, ci param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ti[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -15) {
            field_cb = (tf) null;
          }
          var4_int = param1.b(81, param0);
          var5 = param1.a(-1, param3, var4_int);
          stackIn_3_0 = cc.a(var5, param1, -42, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ik.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 != 17) {
            this.field_jb = false;
          }
          if (!this.field_gb) {
            ia.a(ha.b(105), 6, "tochangedisplayname.ws");
          } else {
            ba.a(123, 3);
            this.r(77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ik.MA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_cb = new tf(14, 0, 4, 1);
        field_ib = new long[32];
    }
}
