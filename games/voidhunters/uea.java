/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends bob {
    private vv field_r;
    private vv[] field_q;
    static String field_p;

    final vv a(int param0, int param1) {
        if (param1 != -1) {
          uea.a((byte) -96);
        }
        vv dupTemp$0 = new vv();
        this.field_q[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(int param0, phb[] param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (null == this.field_q[var4_int]) {
            this.field_q[var4_int] = new vv();
          }
          if (param2 != 15486) {
            this.field_q = (vv[]) null;
          }
          this.field_q[param0].field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static uma a(ds param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        uma stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 50 / ((param1 + 28) / 55);
          stackIn_1_0 = new uma(param0.a(true), param0.a(true), param0.a(true), param0.a(true), param0.c((byte) -81), param0.c((byte) -45), param0.e((byte) -119));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("uea.Q(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        faa var2 = bk.field_w;
        faa var1 = var2;
        bk.field_w = im.field_q;
        im.field_q = var2;
        if (null == bk.field_w) {
          bk.field_w = new faa(1048576);
        }
        if (param0 != 9487) {
          field_p = (String) null;
        }
    }

    private final void a(uea param0, int param1, boolean param2) {
        int var4_int = 0;
        vv dupTemp$0 = null;
        vv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        vv stackIn_9_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        vv var5 = null;
        vv var6 = null;
        int var7 = 0;
        vv var6Lifetime1;
        vv var6Lifetime2;
        var7 = VoidHunters.field_G;
        try {
          super.a(param1 - 130, param0);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_q[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param0.field_q[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = 105;
                if (var6Lifetime2 != null) {
                  stackIn_9_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new vv();
                  param0.field_q[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                }
                ((vv) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_9_2);
              } else {
                param0.field_q[var4_int] = null;
              }
            }
          } else {
            cua.a(this.field_q, 0, param0.field_q, 0, 6);
          }
          if (param1 != 6) {
            this.field_r = (vv) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("uea.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 != -18) {
          uea.a((byte) 52, true, false, 58);
        }
    }

    final void a(phb[] param0, byte param1) {
        int var4 = 0;
        vv[] var3 = null;
        vv var5 = null;
        int var6 = 0;
        vv[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != -54) {
            return;
          }
          var7 = this.field_q;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uea.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        int var4;
        int var8;
        dla stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        int var5;
        int var6;
        int var7;
        var8 = VoidHunters.field_G;
        if (param0 != 88) {
          field_p = (String) null;
        }
        var4 = 0;
        if (-1 == param3) {
          amb.a(-30428, param2);
        } else {
          if (param3 == -2) {
            dma.a();
            wna.field_e = true;
          } else {
            if (param1) {
              amb.a(-30428, false);
            } else {
              if (null == wca.field_b) {
                wca.field_b = new dla();
              }
              var4 = 1;
              if (null != wca.field_b) {
                stackIn_10_0 = wca.field_b;
                stackIn_11_1 = (lo.field_a[param3].a(noa.field_q, pk.field_o, 6868) != -1) ? false : true;
                ((dla) (Object) stackIn_10_0).a(stackIn_11_1, (byte) 55);
              }
            }
            lo.field_a[param3].c((byte) 65);
          }
        }
        if (var4 == 0) {
          wca.field_b = null;
        }
        var5 = 1;
        var6 = 13421772;
        if (li.field_i) {
          var7 = 3;
          pj.a(og.field_r, de.a(var7, 300), nma.field_b[var7], -125, var6, ip.field_p.width, pk.field_o, var5, noa.field_q, ip.field_p.height);
        }
    }

    final void a(int param0, phb param1) {
        int var4 = 0;
        vv[] var3 = null;
        vv var5 = null;
        int var6 = 0;
        phb[] var7 = null;
        vv[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != 32460) {
            var7 = (phb[]) null;
            this.a((phb[]) null, (byte) -127);
          }
          var8 = this.field_q;
          var3 = var8;
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_e = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uea.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        shb stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        vv var7 = null;
        int var8 = 0;
        vv var10 = null;
        htb var11 = null;
        vv var12 = null;
        vv var13 = null;
        vv var14 = null;
        vv var15 = null;
        try {
          if (param1 instanceof htb) {
            stackIn_3_0 = (shb) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (htb) (stackIn_3_0);
          qca.a(param1.field_h + param2 + param1.field_g, param3 + param1.field_r + param1.field_f, param2 + param1.field_g, true, param3 + param1.field_r);
          if (var11 != null) {
            param4 = param4 & var11.field_x;
          }
          var8 = 14 % ((param0 + 27) / 35);
          var7 = this.field_q[0];
          this.field_r.a(120);
          var7.a(this.field_r, param2, param1, param3, -2879, this);
          if (var11 != null) {
            if (var11.field_u) {
              var12 = this.field_q[1];
              if (var12 != null) {
                var12.a(this.field_r, param2, param1, param3, -2879, this);
              }
            }
            if (var11.field_e) {
              var13 = this.field_q[3];
              if (var11.field_n != 0 &&
                var13 != null) {
                var13.a(this.field_r, param2, param1, param3, -2879, this);
              } else {
                var10 = this.field_q[2];
                if (var10 != null) {
                  var10.a(this.field_r, param2, param1, param3, -2879, this);
                }
              }
            }
          }
          if (param1.e((byte) -120)) {
            var14 = this.field_q[5];
            if (var14 != null) {
              var14.a(this.field_r, param2, param1, param3, -2879, this);
            }
          }
          if (!param4) {
            var15 = this.field_q[4];
            if (var15 != null) {
              var15.a(this.field_r, param2, param1, param3, -2879, this);
            }
          }
          this.field_r.a(this, false, param2, param1, param3);
          bia.a((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("uea.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public uea() {
        this.field_q = new vv[6];
        this.field_r = new vv();
        vv dupTemp$0 = new vv();
        this.field_q[0] = dupTemp$0;
        vv var1 = dupTemp$0;
        var1.a(120);
    }

    uea(uea param0, boolean param1) {
        this();
        try {
          param0.a(this, 6, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_p = "Buying or selling an account";
    }
}
