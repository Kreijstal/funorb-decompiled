/*
 * Decompiled by CFR-JS 0.4.0.
 */
class db extends qm {
    static String field_N;
    private String[] field_O;
    static int field_R;
    static boolean field_U;
    static byte[][] field_S;
    static int[] field_T;
    private bb field_Q;
    private ni field_P;

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, param1, param2, (byte) 119);
        if (0 != param1) {
          return;
        }
        int var5 = -12 % ((70 - param3) / 49);
        af var6 = (af) ((Object) this.field_y);
        ni var7 = this.field_P;
        if (var7 == null) {
        } else {
          var8 = var6.a((byte) 69, (ng) (this), param2);
          var9 = var6.a(param0, (ng) (this), (byte) -119);
          do {
            gk.a(var7.field_k + var8 - 2, -2 + var7.field_r + var9, (byte) -128, 2 + var7.field_t, 2 + var7.field_u);
            var7 = var7.field_l;
          } while (var7 != null);
        }
    }

    final void a(int param0) {
        ni discarded$0 = null;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        af var3;
        kd var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        mn var12;
        int var13;
        int var14;
        ni var15;
        int var16;
        int var7Lifetime1;
        var16 = Pixelate.field_H ? 1 : 0;
        this.field_Q = new bb();
        var2 = 0;
        if (param0 != 1829) {
          discarded$0 = this.b(64, -98, -83);
        }
        var3 = (af) ((Object) this.field_y);
        var4 = var3.b(-124, (ng) (this));
        while (true) {
          var5 = this.field_q.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_q.indexOf(">", var5);
          var6 = this.field_q.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_q.indexOf("</hotspot>", var5);
          var8 = var4.a(false, var5);
          var9 = var4.a(false, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_b[var11];
            if (var11 == var8) {
              stackIn_10_0 = var4.b(true, var5);
            } else {
              stackIn_10_0 = var12.field_g[0];
            }
            var13 = stackIn_10_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_15_0 = 0;
              } else {
                stackIn_15_0 = var12.field_g[-1 + var12.field_g.length];
              }
            } else {
              stackIn_15_0 = var4.b(true, var2);
            }
            var14 = stackIn_15_0;
            var15 = new ni(var7Lifetime1, var13, var12.field_b, -var13 + var14, Math.max(var3.a(param0 ^ -1832), -var12.field_b + var12.field_d));
            if (var10 != null) {
              ((ni) (var10)).field_l = var15;
            }
            this.field_Q.a(22125, var15);
            var10 = var15;
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        ni discarded$1 = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_O == null ||
            this.field_O.length <= param2) {
            var7 = new String[param2 + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_O) {
              for (var5 = 0; this.field_O.length > var5; var5++) {
                var7[var5] = this.field_O[var5];
              }
            }
            this.field_O = var8;
          }
          this.field_O[param2] = param0;
          if (param1 != 0) {
            discarded$1 = this.b(70, 115, -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("db.BA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 27) {
            this.a(123);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("db.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 53, param2, param3, param4);
        this.a(1829);
        if (param1 < 19) {
          this.field_Q = (bb) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 70 / ((-33 - param3) / 58);
        this.a(param1, (byte) 28, param2, param0, ((af) ((Object) this.field_y)).a((ng) (this), 4592));
    }

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != -94) {
          return;
        }
        if (null != fj.field_c) {
          var1 = fj.field_c;
          synchronized (var1) {
            fj.field_c = null;
          }
        }
    }

    db(String param0, eb param1) {
        super(param0, (fn) null);
        this.field_P = null;
        try {
          this.field_y = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 1861726552) {
          return;
        }
        field_T = null;
        field_S = (byte[][]) null;
        field_N = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          this.a(false, 78, -112, 21);
        }
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_z + param3;
        int var6 = -this.field_p + param1;
        ni var7 = this.b(var5, -22562, var6);
        if (var7 != null &&
          this.field_n != null) {
          ((om) ((Object) this.field_n)).a(var7.field_n, param2, -8894, this);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ca var5 = null;
        byte[] var6 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 > 0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
              var8[var5_int] = param0[param1 + var5_int];
            }
          } else {
            var4 = param0;
          }
          var5 = new ca();
          var5.a((byte) 123);
          if (param2 != 1761872464) {
            field_N = (String) null;
          }
          var5.a(var4, (long)(8 * param3), (byte) 115);
          var6 = new byte[64];
          var5.a(0, var6, param2 - 1761856307);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("db.PA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String b(byte param0) {
        if (null == this.field_P) {
          return null;
        }
        if (this.field_O == null) {
          return null;
        }
        if (param0 <= 16) {
          this.field_P = (ni) null;
        }
        if (this.field_P.field_n >= this.field_O.length) {
          return null;
        }
        return this.field_O[this.field_P.field_n];
    }

    private final ni b(int param0, int param1, int param2) {
        ni var4;
        ni var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param1 != -22562) {
          field_R = 126;
        }
        var4 = (ni) (this.field_Q.c(1504642273));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.field_k &&
              param2 >= var5.field_r &&
              var5.field_k + var5.field_t > param0 &&
              var5.field_r + var5.field_u >= param2) {
              return var4;
            }
            var5 = var5.field_l;
          }
          var4 = (ni) (this.field_Q.f(1504642273));
        }
        return null;
    }

    final static tf[] a(int param0, tf param1) {
        tf[] var2 = null;
        RuntimeException var2_ref = null;
        tf[] var3 = null;
        tf[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24414) {
            field_N = (String) null;
          }
          var3 = new tf[9];
          var2 = var3;
          var3[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("db.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length == 8) {
            if (param0) {
              field_T = (int[]) null;
            }
            jo.field_h = jo.field_h | ((255L & (long)param1[1]) << 8 | (16711680L & (long)param1[2] << 16 | ((long)param1[4] << 32 & 1095216660480L | ((255L & (long)param1[5]) << 40 | ((long)param1[6] << 48 & 71776119061217280L | (long)param1[7] << 56 & -72057594037927936L)) | (255L & (long)param1[3]) << 24)) | (long)param1[0] << 0 & 255L);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("db.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_P = null;
          if (this.field_D) {
            var5_int = uf.field_d - (param2 + this.field_z);
            var6 = -param1 + (bg.field_k - this.field_p);
            this.field_P = this.b(var5_int, -22562, var6);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "db.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "Played";
        field_T = new int[]{8};
        field_R = 0;
        field_S = new byte[250][];
    }
}
