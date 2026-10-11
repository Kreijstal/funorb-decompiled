/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends ph {
    private vl field_G;
    static String field_K;
    private String[] field_H;
    private mm field_J;
    static int field_I;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          al.field_T = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          pc.a(var3, var2, true, var4, param0);
          if (param1 != 0) {
            cj.a(20, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("cj.AA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    String e(int param0) {
        if (param0 != 34) {
          return (String) null;
        }
        if (this.field_J == null) {
          return null;
        }
        if (this.field_H == null) {
          return null;
        }
        if (this.field_J.field_r >= this.field_H.length) {
          return null;
        }
        return this.field_H[this.field_J.field_r];
    }

    final static nc a(gb param0, int param1, int param2, gb param3, int param4) {
        RuntimeException var5 = null;
        nc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7844) {
            cj.a(false);
          }
          if (!rl.a(2884, param3, param4, param2)) {
            return null;
          }
          stackIn_6_0 = li.a(param0.a(false, param2, param4), 5116);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("cj.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) 72, param3);
        if (param3 != 0) {
          return;
        }
        mi var9 = (mi) ((Object) this.field_h);
        if (param2 <= 42) {
          field_K = (String) null;
        }
        mm var6 = this.field_J;
        if (var6 == null) {
        } else {
          var7 = var9.a(param1, -1, (ag) (this));
          var8 = var9.a(-1, (ag) (this), param0);
          do {
            bh.a(2 + var6.field_i, -2 + var6.field_p + var8, (byte) 65, -2 + (var7 + var6.field_l), 2 + var6.field_o);
            var6 = var6.field_j;
          } while (var6 != null);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        gb var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param0);
          var3_int = gm.a(var11, param2, (byte) 125);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param0.charAt(var8) != param2; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          if (param1 >= -5) {
            var10 = (gb) null;
            cj.a((gb) null, 50, 61, (gb) null, -88);
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("cj.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(-25638);
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_K = null;
    }

    final void a(int param0, String param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (null == this.field_H ||
            param2 >= this.field_H.length) {
            var7 = new String[1 + param2];
            var8 = var7;
            var4 = var8;
            if (null != this.field_H) {
              for (var5 = 0; this.field_H.length > var5; var5++) {
                var7[var5] = this.field_H[var5];
              }
            }
            this.field_H = var8;
          }
          if (param0 != -1) {
            return;
          }
          this.field_H[param2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("cj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.a(param1, param3, 0, param2, ((mi) ((Object) this.field_h)).b((ag) (this), (byte) -83));
        if (!param0) {
          cj.a(89, false);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          this.field_J = null;
          if (this.field_u) {
            var5_int = -this.field_v - param3 + j.field_c;
            var6 = -param1 + rb.field_m - this.field_m;
            this.field_J = this.a(-2, var6, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cj.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static uj a(int param0, int param1) {
        if (param1 != 5) {
          field_K = (String) null;
        }
        uj var2 = new uj();
        ve.field_b.a(var2, 109);
        pe.a((byte) 51, param0);
        return var2;
    }

    final void j(int param0) {
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        mi var3;
        ce var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        pm var12;
        int var13;
        int var14;
        mm var15;
        int var16;
        int var7Lifetime1;
        var16 = HostileSpawn.field_I ? 1 : 0;
        this.field_G = new vl();
        if (param0 != -25638) {
          this.field_G = (vl) null;
        }
        var2 = 0;
        var3 = (mi) ((Object) this.field_h);
        var4 = var3.a((ag) (this), 1);
        while (true) {
          var5 = this.field_n.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_n.indexOf(">", var5);
          var6 = this.field_n.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_n.indexOf("</hotspot>", var5);
          var8 = var4.a(var5, 0);
          var9 = var4.a(var2, param0 + 25638);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_d[var11];
            if (~var8 != ~var11) {
              stackIn_10_0 = var12.field_b[0];
            } else {
              stackIn_10_0 = var4.b(var5, param0 ^ -25638);
            }
            var13 = stackIn_10_0;
            if (var9 != var11) {
              if (var12 != null) {
                stackIn_15_0 = var12.field_b[-1 + var12.field_b.length];
              } else {
                stackIn_15_0 = 0;
              }
            } else {
              stackIn_15_0 = var4.b(var2, param0 ^ -25638);
            }
            var14 = stackIn_15_0;
            var15 = new mm(var7Lifetime1, var13, var12.field_i, var14 - var13, Math.max(var3.a(true), -var12.field_i + var12.field_f));
            if (var10 != null) {
              ((mm) (var10)).field_j = var15;
            }
            this.field_G.a(var15, param0 ^ -25716);
            var10 = var15;
          }
        }
    }

    private final mm a(int param0, int param1, int param2) {
        mm var4;
        mm var5;
        int var6;
        gb var7;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -2) {
          var7 = (gb) null;
          cj.a((gb) null, 119, -67, (gb) null, 52);
        }
        var4 = (mm) (this.field_G.g(-109));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_l &&
              param1 >= var5.field_p &&
              var5.field_l + var5.field_o > param2 &&
              param1 <= var5.field_i + var5.field_p) {
              return var4;
            }
            var5 = var5.field_j;
          }
          var4 = (mm) (this.field_G.a(12684));
        }
        return null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 55) {
          field_I = 21;
        }
        c.field_a.a(25957, param1);
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    cj(String param0, nn param1) {
        super(param0, (mh) null);
        this.field_J = null;
        try {
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - this.field_v;
        int var6 = param0 - this.field_m;
        mm var7 = this.a(-2, var6, var5);
        if (var7 != null &&
          this.field_p != null) {
          ((nk) ((Object) this.field_p)).a(-2, var7.field_r, this, param3);
        }
    }

    static {
        field_I = 5;
        field_K = "Get out of the complex before it disintegrates.";
    }
}
