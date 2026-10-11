/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hm extends an {
    private vo field_I;
    static vn field_E;
    private String[] field_K;
    private eg field_G;
    static long field_N;
    static sd field_H;
    static int field_L;
    static String field_M;
    static int[][] field_F;
    static int field_J;

    boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 67) {
            var4 = (ga) null;
            this.a((ga) null, (byte) 86, -110, -12);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        le var1 = null;
        int var2 = ZombieDawn.field_J;
        try {
          var1 = kn.field_L.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          var1 = se.field_m.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          if (param0 != 9) {
            hm.a(-124);
          }
          var1 = rm.field_e.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          kn.field_L.b(param0 ^ 67);
          se.field_m.b(-61);
          rm.field_e.b(68);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hm.G(" + param0 + ')');
        }
    }

    private final eg b(int param0, int param1, int param2) {
        eg var4;
        eg var5;
        int var6;
        eg var4Lifetime1;
        eg var5Lifetime1;
        var6 = ZombieDawn.field_J;
        if (param0 == 31677) {
          var4 = (eg) (this.field_I.b((byte) 26));
          while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
              if (param1 >= var5.field_i &&
                param2 >= var5.field_k &&
                var5.field_i + var5.field_j > param1 &&
                var5.field_m + var5.field_k >= param2) {
                return var4;
              }
              var5 = var5.field_h;
            }
            var4 = (eg) (this.field_I.a(false));
          }
          return null;
        }
        this.field_I = (vo) null;
        var4Lifetime1 = (eg) (this.field_I.b((byte) 26));
        while (var4Lifetime1 != null) {
          var5Lifetime1 = var4Lifetime1;
          while (var5Lifetime1 != null) {
            if (param1 >= var5Lifetime1.field_i &&
              param2 >= var5Lifetime1.field_k &&
              var5Lifetime1.field_i + var5Lifetime1.field_j > param1 &&
              var5Lifetime1.field_m + var5Lifetime1.field_k >= param2) {
              return var4Lifetime1;
            }
            var5Lifetime1 = var5Lifetime1.field_h;
          }
          var4Lifetime1 = (eg) (this.field_I.a(false));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(28, param1, param2, param3, param4);
        this.d((byte) -36);
        int var6 = 80 % ((param0 + 23) / 48);
    }

    final void d(byte param0) {
        int var11 = 0;
        int var2;
        ak var3;
        vg var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        oe var12;
        int var13;
        int var14;
        eg var15;
        int var16;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var7Lifetime1;
        var16 = ZombieDawn.field_J;
        this.field_I = new vo();
        if (param0 != -36) {
          return;
        }
        var2 = 0;
        var3 = (ak) ((Object) this.field_h);
        var4 = var3.a(-113, (ga) (this));
        while (true) {
          var5 = this.field_o.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_o.indexOf(">", var5);
          var6 = this.field_o.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_o.indexOf("</hotspot>", var5);
          var8 = var4.a(93, var5);
          var9 = var4.a(96, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_b[var11];
            if (var8 == var11) {
              stackIn_9_0 = var4.a((byte) -72, var5);
            } else {
              stackIn_9_0 = var12.field_e[0];
            }
            var13 = stackIn_9_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_14_0 = 0;
              } else {
                stackIn_14_0 = var12.field_e[-1 + var12.field_e.length];
              }
            } else {
              stackIn_14_0 = var4.a((byte) -72, var2);
            }
            var14 = stackIn_14_0;
            var15 = new eg(var7Lifetime1, var13, var12.field_b, -var13 + var14, Math.max(var3.a(param0 ^ -39), var12.field_g - var12.field_b));
            if (var10 != null) {
              ((eg) (var10)).field_h = var15;
            }
            var10 = var15;
            this.field_I.a(0, var15);
          }
        }
    }

    String d(int param0) {
        int var2 = -127 / ((param0 - 10) / 58);
        if (null == this.field_G) {
          return null;
        }
        if (this.field_K == null) {
          return null;
        }
        if (this.field_K.length > this.field_G.field_l) {
          return this.field_K[this.field_G.field_l];
        }
        return null;
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        ga var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          if (null == this.field_K ||
            param0 >= this.field_K.length) {
            var8 = new String[param0 + 1];
            var9 = var8;
            var4 = var9;
            if (this.field_K != null) {
              for (var5 = 0; this.field_K.length > var5; var5++) {
                var8[var5] = this.field_K[var5];
              }
            }
            this.field_K = var9;
          }
          if (param1 != -21423) {
            var7 = (ga) null;
            this.a((ga) null, (byte) 100, -58, -75);
          }
          this.field_K[param0] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("hm.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          this.a(-121, param1, param0, param3, ((ak) ((Object) this.field_h)).a(false, (ga) (this)));
          return;
        }
        hm.g(-53);
        this.a(-121, param1, param0, param3, ((ak) ((Object) this.field_h)).a(false, (ga) (this)));
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        try {
          super.a(param0, (byte) 106, param2, param3);
          this.field_G = null;
          int var5_int = -66 / ((46 - param1) / 42);
          if (this.field_l) {
            var6 = -param3 + ha.field_b - this.field_k;
            var7 = -this.field_j + ei.field_K - param2;
            this.field_G = this.b(31677, var6, var7);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        ak var5 = null;
        eg var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param1 == 0) {
          var5 = (ak) ((Object) this.field_h);
          var6 = this.field_G;
          if (var6 == null) {
          } else {
            var7 = var5.b((ga) (this), 128, param2);
            var8 = var5.a((ga) (this), 1, param0);
            do {
              on.b(var6.field_j + 2, var6.field_m + 2, var6.field_i + var7 - 2, param3 + 117, var6.field_k + var8 - 2);
              var6 = var6.field_h;
            } while (var6 != null);
          }
          return;
        }
    }

    final static int a(int param0, int param1, int[][] param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0 &&
            param1 >= 0) {
            if (param3 != 2) {
              field_L = -54;
            }
            if (param1 >= param2.length) {
              stackIn_9_0 = -1;
              return stackIn_9_0;
            }
            if (param0 >= param2[0].length) {
              stackIn_13_0 = -1;
              return stackIn_13_0;
            }
            stackIn_15_0 = param2[param1][param0];
            return stackIn_15_0;
          }
          stackIn_4_0 = -1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, 71, param2, param3);
        int var5 = -this.field_k + param0;
        int var6 = -this.field_j + param2;
        int var8 = 63 / ((-12 - param1) / 56);
        eg var7 = this.b(31677, var5, var6);
        if (var7 == null) {
          return;
        }
        if (null == this.field_v) {
          return;
        }
        ((oa) ((Object) this.field_v)).a(this, 120, var7.field_l, param3);
    }

    hm(String param0, io param1) {
        super(param0, (sk) null);
        this.field_G = null;
        try {
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_H = null;
        field_M = null;
        if (param0 == -27476) {
          field_F = (int[][]) null;
          return;
        }
        field_E = (vn) null;
        field_F = (int[][]) null;
    }

    static {
        field_H = new sd();
        field_M = "THE END";
        field_J = -1;
    }
}
