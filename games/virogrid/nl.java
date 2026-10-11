/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends aj {
    static int field_x;
    private jj[] field_w;
    static String field_v;
    private jj field_y;
    static int field_u;

    final void a(byte param0, mg param1) {
        int var4 = 0;
        jj[] var3 = null;
        jj var5 = null;
        int var6 = 0;
        mg var7 = null;
        jj[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = this.field_w;
          var3 = var8;
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_c = param1;
            }
          }
          if (param0 >= -113) {
            var7 = (mg) null;
            this.a((byte) -103, (mg) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("nl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(mg[] param0, int param1) {
        int var4 = 0;
        jj[] var3 = null;
        jj var5 = null;
        int var6 = 0;
        String[] var7 = null;
        jj[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = this.field_w;
          var3 = var8;
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_k = param0;
            }
          }
          if (param1 != 4) {
            var7 = (String[]) null;
            nl.a(38, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("nl.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.math.BigInteger param0, jc param1, jc param2, java.math.BigInteger param3, int param4) {
        try {
          bl.a(0, param1.field_l, param0, param2, param1.field_g, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "nl.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 != 17574) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (jc.a(var3, (byte) -126) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("nl.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        fi stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        jj var7 = null;
        jj var9 = null;
        tg var10 = null;
        jj var11 = null;
        jj var12 = null;
        jj var13 = null;
        jj var14 = null;
        try {
          if (!(param1 instanceof tg)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (fi) (param1);
          }
          var10 = (tg) (stackIn_3_0);
          uk.a(param1.field_m + param3 + param1.field_u, 6, param0 + param1.field_l, param1.field_g + param0 + param1.field_l, param3 + param1.field_u);
          if (var10 != null) {
            param2 = param2 & var10.field_C;
          }
          var7 = this.field_w[0];
          this.field_y.a(31749);
          var7.a(param3, this, (byte) -12, this.field_y, param1, param0);
          if (var10 != null) {
            if (var10.field_z) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(param3, this, (byte) -12, this.field_y, param1, param0);
              }
            }
            if (var10.field_p) {
              var12 = this.field_w[3];
              if (var10.field_i != 0 &&
                var12 != null) {
                var12.a(param3, this, (byte) -12, this.field_y, param1, param0);
              } else {
                var9 = this.field_w[2];
                if (var9 != null) {
                  var9.a(param3, this, (byte) -12, this.field_y, param1, param0);
                }
              }
            }
          }
          if (param1.f(true)) {
            var13 = this.field_w[5];
            if (var13 != null) {
              var13.a(param3, this, (byte) -12, this.field_y, param1, param0);
            }
          }
          if (!param2) {
            var14 = this.field_w[4];
            if (var14 != null) {
              var14.a(param3, this, (byte) -12, this.field_y, param1, param0);
            }
          }
          this.field_y.a(param1, param4 ^ -23296, this, param3, param0);
          if (param4 != -23294) {
            this.field_y = (jj) null;
          }
          ai.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, String[] param1) {
        java.applet.Applet var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != tk.field_b) {
            tk.field_b.field_H.a(param1, (byte) 72);
          }
          if (null != qi.field_c) {
            qi.field_c.field_F.a(param1, (byte) 56);
          }
          if (param0 != -22063) {
            var3 = (java.applet.Applet) null;
            nl.a((java.applet.Applet) null, 68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, mg[] param1, byte param2) {
        int var4_int = 0;
        if (param2 >= -119) {
          return;
        }
        try {
          var4_int = param0;
          if (this.field_w[var4_int] == null) {
            this.field_w[var4_int] = new jj();
          }
          this.field_w[param0].field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "nl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final jj a(byte param0, int param1) {
        if (param0 < 77) {
          field_v = (String) null;
        }
        jj dupTemp$0 = new jj();
        this.field_w[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static int b(int param0) {
        if (param0 != 4) {
          return -116;
        }
        return (qe.field_m << 2) + (ca.field_D << 4) + el.field_t;
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 < 119) {
          nl.c(46);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, boolean param11, int param12, int param13) {
        wc.field_g = null;
        qk.b((byte) 59);
        param0 = mc.a(param4, param0, false, param3, param1, param2, param9);
        if (param12 != 0) {
          return;
        }
        ha.a(param2, param10, param11, 104, param6, param7, param8, param5, param0, param13);
        eg.a(param8, -98, param10);
        ac.a(param8, -1, param3, param0);
    }

    public nl() {
        this.field_w = new jj[6];
        this.field_y = new jj();
        jj dupTemp$0 = new jj();
        this.field_w[0] = dupTemp$0;
        jj var1 = dupTemp$0;
        var1.a(31749);
    }

    private final void a(int param0, boolean param1, nl param2) {
        int var4_int = 0;
        jj dupTemp$0 = null;
        jj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        jj stackIn_12_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        jj var5 = null;
        jj var6 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 3) {
            return;
          }
          super.a(0, param2);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 != null) {
                var6 = param2.field_w[var4_int];
                stackIn_11_0 = var5;
                stackIn_11_1 = param0 + 13595;
                if (var6 == null) {
                  dupTemp$0 = new jj();
                  param2.field_w[var4_int] = dupTemp$0;
                  stackIn_12_2 = dupTemp$0;
                } else {
                  stackIn_12_2 = var6;
                }
                ((jj) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_12_2);
              } else {
                param2.field_w[var4_int] = null;
              }
            }
            return;
          }
          ek.a(this.field_w, 0, param2.field_w, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("nl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    nl(nl param0, boolean param1) {
        this();
        try {
          param0.a(3, param1, this);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "nl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_v = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_u = 0;
    }
}
