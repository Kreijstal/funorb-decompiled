/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends cn {
    static kd field_w;
    static String field_x;
    static int field_v;
    static String field_y;
    private gm field_u;
    static int field_t;
    private gm[] field_s;

    public ha() {
        this.field_s = new gm[6];
        this.field_u = new gm();
        gm dupTemp$0 = new gm();
        this.field_s[0] = dupTemp$0;
        gm var1 = dupTemp$0;
        var1.b(122);
    }

    final gm a(int param0, boolean param1) {
        if (!param1) {
          return (gm) null;
        }
        gm dupTemp$0 = new gm();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(boolean param0, bd param1) {
        int var4 = 0;
        gm[] var3 = null;
        gm var5 = null;
        int var6 = 0;
        gm[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_a = param1;
            }
          }
          if (!param0) {
            field_v = 103;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ha.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          int var2_int = 40 / ((-19 - param0) / 41);
          hj.a(param1, 91);
          qa.a(false, (byte) -62, jj.field_i);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ha.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ha(ha param0, boolean param1) {
        this();
        try {
          param0.a(param1, 0, this);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, ha param2) {
        int var4_int = 0;
        gm dupTemp$0 = null;
        gm stackIn_10_0 = null;
        gm stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        gm var5 = null;
        gm var6 = null;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          super.a(-110, param2);
          if (param1 != 0) {
            return;
          }
          if (param0) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_s[var4_int];
              if (var5 == null) {
                param2.field_s[var4_int] = null;
              } else {
                var6 = param2.field_s[var4_int];
                stackIn_10_0 = var5;
                if (var6 != null) {
                  stackIn_11_1 = var6;
                } else {
                  dupTemp$0 = new gm();
                  param2.field_s[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                }
                ((gm) (Object) stackIn_10_0).a(stackIn_11_1, (byte) 33);
              }
            }
            return;
          }
          kf.a(this.field_s, 0, param2.field_s, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ha.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var4_int = 0;
        int var15 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        int var7 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        try {
          if (param1 != -10454) {
            field_w = (kd) null;
          }
          var12 = uj.field_p.field_e + 36;
          var13 = 12 + uj.field_p.field_g;
          var14 = -var12 + am.field_e;
          var4_int = var14 << 2;
          var15 = -var13 + jg.field_l;
          var6 = param0 << 2;
          var8 = 8;
          var11 = 1;
          var7 = param3 << 2;
          var5 = var15 << 2;
          var9 = 16;
          var10 = 1;
          var16 = (32 - param2.field_e) * 200 / 32;
          km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, 112, var4_int, var16, var8);
          var17 = (int)((double)var8 / 1.0);
          var18 = (int)((double)var9 / 1.2);
          bh.a((byte) var10, wk.field_d, (byte) var11, var17, var4_int, var5, var7, var18, var16, var6, 9233);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ha.HA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          ge.b();
          pk.field_i = new int[260];
          ih.field_w = 11;
          var1_int = 0;
          if (param0 != 255) {
            return;
          }
          while (var1_int < 256) {
            var2 = 15.0;
            pk.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
            var1_int++;
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (pk.field_i.length > var5) {
            pk.field_i[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "ha.CA(" + param0 + ')');
        }
    }

    final void a(int param0, bd[] param1, byte param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (this.field_s[var4_int] == null) {
            this.field_s[var4_int] = new gm();
          }
          if (param2 >= -4) {
            field_w = (kd) null;
          }
          this.field_s[param0].field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ha.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, bd[] param1) {
        gm[] var3 = null;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        ag var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3 = this.field_s;
          var4 = 0;
          if (param0) {
            var7 = (ag) null;
            this.a(-43, -76, 69, (ag) null, true);
          }
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_c = param1;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ha.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static StringBuilder a(char param0, int param1, byte param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = param3.length();
          param3.setLength(param1);
          for (var5 = var4_int; var5 < param1; var5++) {
            param3.setCharAt(var5, param0);
          }
          if (param2 > -126) {
            field_v = -44;
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ha.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_y = null;
        field_w = null;
        field_x = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        ag stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        gm var7 = null;
        gm var9 = null;
        bd[] var10 = null;
        ph var11 = null;
        gm var12 = null;
        gm var13 = null;
        gm var14 = null;
        gm var15 = null;
        try {
          if (!(param3 instanceof ph)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ag) (param3);
          }
          var11 = (ph) (stackIn_3_0);
          sf.a(param1 + param3.field_v + param3.field_s, param3.field_m + param0, param3.field_x + param0 + param3.field_m, param1 + param3.field_v, true);
          if (var11 != null) {
            param4 = param4 & var11.field_D;
          }
          var7 = this.field_s[0];
          this.field_u.b(param2 - 15305);
          var7.a(param3, this.field_u, (byte) 88, this, param0, param1);
          if (var11 != null) {
            if (var11.field_A) {
              var12 = this.field_s[1];
              if (var12 != null) {
                var12.a(param3, this.field_u, (byte) 95, this, param0, param1);
              }
            }
            if (var11.field_u) {
              var13 = this.field_s[3];
              if (var11.field_r != 0 &&
                var13 != null) {
                var13.a(param3, this.field_u, (byte) 57, this, param0, param1);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(param3, this.field_u, (byte) 106, this, param0, param1);
                }
              }
            }
          }
          if (param3.g(param2 ^ -8049)) {
            var14 = this.field_s[5];
            if (var14 != null) {
              var14.a(param3, this.field_u, (byte) 81, this, param0, param1);
            }
          }
          if (!param4) {
            var15 = this.field_s[4];
            if (var15 != null) {
              var15.a(param3, this.field_u, (byte) 82, this, param0, param1);
            }
          }
          this.field_u.a(this, 126, param1, param3, param0);
          if (param2 != 15430) {
            var10 = (bd[]) null;
            this.a(-65, (bd[]) null, (byte) -86);
          }
          eh.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("ha.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_x = "<col=ffffff>Security<nbsp>pass</col><br>This badge allows access to high-security areas of modern space stations.";
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
