/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    al field_o;
    static int field_f;
    static int field_n;
    static int field_b;
    static ej field_d;
    static String[] field_e;
    al field_q;
    static pb field_h;
    al field_j;
    al field_k;
    ka field_c;
    int field_m;
    long field_l;
    volatile int field_g;
    ka field_a;
    byte field_p;
    volatile int field_i;
    ph field_r;

    final int b(byte param0) {
        if (param0 > -77) {
          this.e(-118);
        }
        return this.field_o.b((byte) -7) + this.field_q.b((byte) -7);
    }

    abstract void a(byte param0);

    abstract boolean f(int param0);

    final static ml a(int param0, boolean param1, String param2) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ml(false);
          var3.field_g = param0;
          var3.field_e = param2;
          if (!param1) {
            field_f = -59;
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("fb.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
        if (param0 != -2918) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          fb.a(47, (String[]) null, 113, (java.applet.Applet) null, 32, -16);
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
          this.f(72);
        }
        return this.field_j.b((byte) -7) + this.field_k.b((byte) -7);
    }

    final static void a(int param0, byte param1, ta param2) {
        ha var3 = pg.field_fb;
        var3.f(param0, 950);
        var3.a(false, param2.field_o);
        if (param1 > -117) {
          return;
        }
        try {
          var3.a(false, param2.field_t);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fb.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != 2) {
          this.field_k = (al) null;
        }
        return 20 <= this.b((byte) -87) ? true : false;
    }

    final ph a(byte param0, int param1, boolean param2, int param3, boolean param4) {
        long var6 = ((long)param3 << 32) + (long)param1;
        if (!param4) {
          return (ph) null;
        }
        ph var8 = new ph();
        var8.field_F = param0;
        var8.field_u = param2 ? true : false;
        var8.field_o = var6;
        if (param2) {
          if (!(20 > this.b((byte) -92))) {
            throw new RuntimeException();
          }
          this.field_o.a((byte) 124, var8);
        } else {
          if (this.a(0) >= 20) {
            throw new RuntimeException();
          }
          this.field_j.a((byte) 125, var8);
        }
        return var8;
    }

    abstract void b(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final boolean e(int param0) {
        int var2 = -34 / ((-29 - param0) / 36);
        return this.a(0) >= 20 ? true : false;
    }

    final static void a(ka param0, int param1, ej param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          lb var18 = null;
          byte[][] var19 = null;
          byte[][] var20 = null;
          int var13Lifetime1;
          var14 = stellarshard.field_B;
          try {
            var18 = new lb();
            var18.field_s = param0.f(4);
            var18.field_l = param0.b(false);
            var18.field_p = new int[var18.field_s];
            var18.field_n = new int[var18.field_s];
            var18.field_k = new int[var18.field_s];
            var18.field_r = new re[var18.field_s];
            var18.field_m = new byte[var18.field_s][][];
            var18.field_q = new re[var18.field_s];
            if (param3 != 20) {
              return;
            }
            for (var5 = 0; var5 < var18.field_s; var5++) {
              try {
                var6_int = param0.f(4);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (3 == var6_int ||
                    var6_int == 4) {
                    var7 = param0.e((byte) 106);
                    var8 = param0.e((byte) 117);
                    var9 = param0.f(param3 ^ 16);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param0.e((byte) 85);
                    }
                    var20 = new byte[var9][];
                    var19 = var20;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param0.b(false);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(0, (byte) -106, var13, var20[var12_int]);
                      }
                    }
                    var18.field_k[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = he.b(var10[var17], -61);
                      var17++;
                    }
                    var18.field_q[var5] = param2.a(var8, var12, param3 + 94, he.b(var7, ih.a(param3, -73)));
                    var18.field_m[var5] = var20;
                  }
                } else {
                  var15 = param0.e((byte) 102);
                  var7 = var15;
                  var16 = param0.e((byte) 102);
                  var8 = var16;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.b(false);
                  }
                  var18.field_k[var5] = var6_int;
                  var18.field_n[var5] = var9;
                  var18.field_r[var5] = param2.a(he.b(var15, -112), 0, var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_p[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_p[var5] = -5;
              }
            }
            oc.field_c.b(param3 - 136, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("fb.S(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var8 = 0;
        ej var9 = null;
        var8 = stellarshard.field_B;
        try {
          vd.field_d = param3.getParameter("overxgames");
          if (vd.field_d == null) {
            vd.field_d = "0";
          }
          vg.field_r = param3.getParameter("overxachievements");
          if (null == vg.field_r) {
            vg.field_r = "0";
          }
          var6 = param3.getParameter("currency");
          if (var6 == null) {
            ic.field_a = 2;
          } else {
            if (!rg.a((byte) 19, (CharSequence) ((Object) var6))) {
              ic.field_a = 2;
            } else {
              ic.field_a = pf.a((CharSequence) ((Object) var6), (byte) 125);
            }
          }
          ki.field_x = param5;
          jb.field_a = param0;
          ki.field_t = param2;
          dl.field_C = new pb[param1.length];
          for (var7 = 0; param1.length > var7; var7++) {
            dl.field_C[var7] = new pb(317, 34);
          }
          if (param4 != -1) {
            var9 = (ej) null;
            fb.a((ka) null, 60, (ej) null, 71);
          }
          pk.field_d = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_21_0 = var6_ref;
          stackIn_21_1 = new StringBuilder().append("fb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    fb() {
        this.field_o = new al();
        this.field_q = new al();
        this.field_j = new al();
        this.field_k = new al();
        this.field_c = new ka(6);
        this.field_p = (byte) 0;
        this.field_i = 0;
        this.field_g = 0;
        this.field_a = new ka(10);
    }

    static {
        field_n = 0;
        field_f = 0;
    }
}
