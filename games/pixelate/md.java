/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends db {
    static boolean field_Y;
    private String field_ab;
    private int field_X;
    static String field_V;
    private ml field_W;
    private tf field_Z;

    final String b(byte param0) {
        if (param0 > 16) {
          return null;
        }
        this.field_ab = (String) null;
        return null;
    }

    final static void a(tf param0, tf param1, int param2) {
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          Pixelate.field_E = param1;
          u.field_f = new tf(Pixelate.field_E.field_A, Pixelate.field_E.field_B);
          u.field_f.c();
          Pixelate.field_E.f(0, 0);
          var3_int = 5395026;
          var4 = t.field_d;
          for (var5 = 0; t.field_k.length > var5; var5++) {
            if (t.field_k[var5] < var3_int) {
              t.field_k[var5] = 0;
            } else {
              var6 = -(var5 / t.field_j) + t.field_d;
              var7 = 255 * var6 / var4;
              t.field_k[var5] = bq.a(bq.a(var7 << 8, var7 << 16), var7 >> 1);
            }
          }
          qa.field_g = new tf(640, 480);
          qa.field_g.c();
          param0.c(0, 0, 255, 80);
          param0.c(320, 0, 255, 80);
          param0.c(0, 240, 80, 0);
          param0.c(320, 240, param2, 0);
          qa.field_f.a(19692);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("md.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5;
        dj var6;
        int var14;
        Object var18;
        Object var24;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        tf var17;
        tf var19;
        tf var20;
        tf var21;
        tf var22;
        tf var25;
        tf var26;
        tf var27;
        af var28;
        af var29;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        dj var6Lifetime1;
        dj var6Lifetime2;
        var18 = null;
        var24 = null;
        var14 = Pixelate.field_H ? 1 : 0;
        var6 = this.field_W.a((byte) 113);
        if (var6 != uo.field_b &&
          tg.field_j != var6) {
          var5 = this.field_W.b((byte) -7);
          if (var5 == null) {
            var5 = this.field_ab;
          }
        } else {
          var5 = ec.field_m;
        }
        if (var5.equals(this.field_q)) {
          super.a(param0, param1, param2, (byte) -25);
          var6Lifetime1 = this.field_W.a((byte) 97);
          var29 = (af) ((Object) this.field_y);
          var9 = this.field_z + param2;
          var10 = var29.a(param0, (ng) (this), (byte) 107) + (var29.b(-117, (ng) (this)).b(1) >> 1);
          var11 = -23 / ((param3 - 70) / 49);
          if (var6Lifetime1 != uo.field_b &&
            tg.field_j != var6Lifetime1) {
            if (sk.field_a == var6Lifetime1) {
              var26 = ha.field_g[2];
              var26.b(var9, var10 - (var26.field_E >> 1), 256);
              return;
            }
            if (var6Lifetime1 != qk.field_g) {
              return;
            }
            var25 = ha.field_g[1];
            var25.b(var9, var10 - (var25.field_E >> 1), 256);
            return;
          }
          var27 = ha.field_g[0];
          var12 = var27.field_A << 1;
          var13 = var27.field_B << 1;
          if (null == this.field_Z) {
            this.field_Z = new tf(var12, var13);
            h.a(-119, this.field_Z);
          } else {
            if (this.field_Z.field_F < var12) {
              this.field_Z = new tf(var12, var13);
              h.a(-119, this.field_Z);
            } else {
              if (this.field_Z.field_E < var13) {
                this.field_Z = new tf(var12, var13);
                h.a(-119, this.field_Z);
              } else {
                h.a(-72, this.field_Z);
                t.d();
              }
            }
          }
          var27.a(112, 144, var27.field_A << 4, var27.field_B << 4, -this.field_X << 10, 4096);
          ia.a((byte) 92);
          this.field_Z.b(-(var27.field_A >> 1) + var9, var10 - var27.field_B, 256);
          return;
        }
        this.field_q = var5;
        this.a(1829);
        super.a(param0, param1, param2, (byte) -25);
        var6Lifetime2 = this.field_W.a((byte) 97);
        var28 = (af) ((Object) this.field_y);
        var9Lifetime1 = this.field_z + param2;
        var10Lifetime1 = var28.a(param0, (ng) (this), (byte) 107) + (var28.b(-117, (ng) (this)).b(1) >> 1);
        var11Lifetime1 = -23 / ((param3 - 70) / 49);
        if (var6Lifetime2 == uo.field_b) {
          var19 = ha.field_g[0];
          var12Lifetime1 = var19.field_A << 1;
          var13Lifetime1 = var19.field_B << 1;
          if (null != this.field_Z &&
            this.field_Z.field_F >= var12Lifetime1 &&
            this.field_Z.field_E >= var13Lifetime1) {
            h.a(-72, this.field_Z);
            t.d();
          } else {
            this.field_Z = new tf(var12Lifetime1, var13Lifetime1);
            h.a(-119, this.field_Z);
          }
          var19.a(112, 144, var19.field_A << 4, var19.field_B << 4, -this.field_X << 10, 4096);
          ia.a((byte) 92);
          this.field_Z.b(-(var19.field_A >> 1) + var9Lifetime1, var10Lifetime1 - var19.field_B, 256);
          return;
        }
        if (tg.field_j != var6Lifetime2) {
          if (sk.field_a == var6Lifetime2) {
            var22 = ha.field_g[2];
            var22.b(var9Lifetime1, var10Lifetime1 - (var22.field_E >> 1), 256);
            return;
          }
          if (var6Lifetime2 != qk.field_g) {
            return;
          }
          var21 = ha.field_g[1];
          var21.b(var9Lifetime1, var10Lifetime1 - (var21.field_E >> 1), 256);
          return;
        }
        var20 = ha.field_g[0];
        var17 = var20;
        var12Lifetime2 = var20.field_A << 1;
        var13Lifetime2 = var20.field_B << 1;
        if (null != this.field_Z &&
          this.field_Z.field_F >= var12Lifetime2 &&
          this.field_Z.field_E >= var13Lifetime2) {
          h.a(-72, this.field_Z);
          t.d();
        } else {
          this.field_Z = new tf(var12Lifetime2, var13Lifetime2);
          h.a(-119, this.field_Z);
        }
        var20.a(112, 144, var20.field_A << 4, var20.field_B << 4, -this.field_X << 10, 4096);
        ia.a((byte) 92);
        this.field_Z.b(-(var20.field_A >> 1) + var9Lifetime1, var10Lifetime1 - var20.field_B, 256);
        return;
    }

    final static void a(rh param0, boolean param1, int param2) {
        try {
          de.field_b.a(22125, param0);
          sd.a((byte) -52, param0, param2);
          if (!param1) {
            md.c(false);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "md.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 27) {
            return false;
          }
          this.field_W = (ml) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("md.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_V = null;
        if (param0) {
          field_Y = false;
        }
    }

    md(ml param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ih.a((byte) 45));
        try {
          this.field_ab = param1;
          this.field_W = param0;
          this.a(param4, (byte) 121, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
          this.field_X = this.field_X + 1;
          if (param0 != 40) {
            field_V = (String) null;
          }
          super.a(param0 + 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "md.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_V = "Accept <%0> into this game";
    }
}
