/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends bh {
    static String field_Y;
    static String field_U;
    private String field_Z;
    private cn field_V;
    static cn field_W;
    private dp field_T;
    static cn field_I;
    private int field_X;

    final String c(byte param0) {
        if (param0 >= 3) {
          return null;
        }
        lm var3 = (lm) null;
        this.a(25, (lm) null);
        return null;
    }

    final boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 34) {
            return false;
          }
          field_U = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param0 >= -18) {
            field_W = (cn) null;
          }
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var4 == 0) {
              var5 = lb.a((char) var5, 80);
            } else {
              var5 = Character.toLowerCase((char) var5);
            }
            var3[var4] = (char)var5;
          }
          stackIn_10_0 = new String(var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("tn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        try {
          this.field_X = this.field_X + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tn.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        cd.field_b = false;
        qc.field_t = false;
        sn.a(49, param0);
        wd.field_d = sp.field_e;
        ol.field_i = sp.field_e;
    }

    final static pp a(int param0, int param1, se param2, cn param3, int param4, String param5) {
        int var10_int = 0;
        pp stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        cn var10 = null;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        cn var14 = null;
        cn var15 = null;
        cn var16 = null;
        int var17 = 0;
        String var18 = null;
        var17 = DungeonAssault.field_K;
        try {
          jh.c();
          var6_int = param2.b(param5);
          var7 = param2.field_E + param2.field_H;
          var8 = new cn(var6_int, var7);
          var8.e();
          param2.b(param5, 0, param2.field_H, 16760960, -1);
          if (param4 > -36) {
            var18 = (String) null;
            tn.a(9, 109, (se) null, (cn) null, 59, (String) null);
          }
          var9 = te.a(var6_int, var7, ag.field_c, 32, 32, 0.125);
          for (var10_int = 0; var9.field_B.length > var10_int; var10_int++) {
            if (0 == var8.field_B[var10_int]) {
              var9.field_B[var10_int] = 0;
            }
          }
          var10 = rb.a(16, var8, 16776960, (byte) 100);
          var11 = -var8.field_y + param3.field_y >> 1;
          var12 = param3.field_v - var8.field_v >> 1;
          var13 = dd.a((byte) -112, 4, var9);
          var14 = param3.d();
          var14.e();
          bp.a(var12, var13, var11, (byte) 99);
          var9.h(var11, var12);
          var14.h();
          var15 = var14.d();
          var15.e();
          gf.b(0, 0, param3.field_y, param3.field_v, 0, 160);
          var15.h();
          var16 = param3.d();
          var16.e();
          rb.a(8, var8, 12690143, (byte) -59).b(var11, var12, 32);
          var8.h(var11, var12);
          var10.field_w = var10.field_w + var11;
          var10.field_A = var10.field_A + var12;
          jh.b();
          stackIn_10_0 = new pp(var14, var15, var16, var10, param0, param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("tn.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    tn(dp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ri.a((byte) 56));
        try {
          this.field_Z = param1;
          this.field_T = param0;
          this.b(0, param4, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(byte param0) {
        field_Y = null;
        field_W = null;
        if (param0 != -89) {
          String var2 = (String) null;
          tn.a(-105, -33, (se) null, (cn) null, -20, (String) null);
        }
        field_U = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        od var6;
        th var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        cn var14;
        cn var15;
        cn var16;
        od var6Lifetime1;
        L0: {
          L1: {
            L2: {
              var13 = DungeonAssault.field_K;
              var6 = this.field_T.a((byte) -116);
              if (ub.field_s != var6 &&
                var6 != oc.field_A) {
                var5 = this.field_T.a(true);
                if (var5 == null) {
                  var5 = this.field_Z;
                  break L2;
                }
                if (!var5.equals(this.field_w)) {
                  break L1;
                }
                break L0;
              }
              var5 = kj.field_k;
            }
            if (var5.equals(this.field_w)) {
              break L0;
            }
          }
          this.field_w = var5;
          this.g((byte) 112);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_T.a((byte) -110);
        var8 = (th) ((Object) this.field_o);
        var9 = this.field_q + param1;
        var10 = var8.a((byte) 64, param3, (lm) (this)) + (var8.b(-2, (lm) (this)).b(263) >> 1);
        if (ub.field_s != var6Lifetime1 &&
          oc.field_A != var6Lifetime1) {
          if (var6Lifetime1 == pd.field_J) {
            var15 = sl.field_c[2];
            var15.b(var9, var10 - (var15.field_v >> 1), 256);
          } else if (var6Lifetime1 == c.field_d) {
            var16 = sl.field_c[1];
            var16.b(var9, var10 - (var16.field_v >> 1), 256);
          }
        } else {
          var14 = sl.field_c[0];
          var11 = var14.field_E << 1;
          var12 = var14.field_G << 1;
          if (this.field_V != null &&
            var11 <= this.field_V.field_y &&
            var12 <= this.field_V.field_v) {
            lm.a(this.field_V, (byte) 38);
            gf.a();
          } else {
            this.field_V = new cn(var11, var12);
            lm.a(this.field_V, (byte) -79);
          }
          var14.b(112, 144, var14.field_E << 4, var14.field_G << 4, -this.field_X << 10, 4096);
          ti.c(true);
          this.field_V.b(var9 - (var14.field_E >> 1), -var14.field_G + var10, 256);
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ec var16 = null;
        ec var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = DungeonAssault.field_K;
        try {
          var16 = new ec(param1);
          var17 = var16;
          var17.field_o = -2 + param1.length;
          dk.field_d = var17.k(0);
          jn.field_k = new int[dk.field_d];
          ub.field_q = new byte[dk.field_d][];
          gk.field_Q = new boolean[dk.field_d];
          hg.field_t = new int[dk.field_d];
          if (param0 <= 59) {
            return;
          }
          rf.field_P = new byte[dk.field_d][];
          jc.field_f = new int[dk.field_d];
          fe.field_g = new int[dk.field_d];
          var17.field_o = -7 + (param1.length - dk.field_d * 8);
          ce.field_x = var17.k(0);
          tb.field_i = var17.k(0);
          var3 = 1 + (255 & var17.c(true));
          for (var4 = 0; dk.field_d > var4; var4++) {
            hg.field_t[var4] = var16.k(0);
          }
          for (var4Lifetime1 = 0; dk.field_d > var4Lifetime1; var4Lifetime1++) {
            fe.field_g[var4Lifetime1] = var17.k(0);
          }
          for (var4Lifetime2 = 0; dk.field_d > var4Lifetime2; var4Lifetime2++) {
            jc.field_f[var4Lifetime2] = var17.k(0);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < dk.field_d; var4Lifetime3++) {
            jn.field_k[var4Lifetime3] = var17.k(0);
          }
          var17.field_o = -(3 * var3) + (-4 + param1.length - 8 * dk.field_d);
          uo.field_b = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            uo.field_b[var4Lifetime4] = var17.f(-114);
            if (uo.field_b[var4Lifetime4] == 0) {
              uo.field_b[var4Lifetime4] = 1;
            }
          }
          var17.field_o = 0;
          for (var4Lifetime5 = 0; dk.field_d > var4Lifetime5; var4Lifetime5++) {
            var5 = jc.field_f[var4Lifetime5];
            var6 = jn.field_k[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            ub.field_q[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            rf.field_P[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.c(true);
            if (0 == (1 & var11)) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.a((byte) 2);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.a((byte) 2);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_49_0 = var10;
                  if (var13 == -1) {
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_1 = 1;
                  }
                  var10 = stackIn_49_0 | stackIn_50_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var5 * var13] = var17.a((byte) 2);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var17.a((byte) 2);
                    var9[var5 * var13 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_38_0 = var10;
                    if (var14 == -1) {
                      stackIn_39_1 = 0;
                    } else {
                      stackIn_39_1 = 1;
                    }
                    var10 = stackIn_38_0 | stackIn_39_1;
                  }
                }
              }
            }
            gk.field_Q[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("tn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_U = "Cost";
        field_Y = "The reanimated corpses of previous failed raids; these four skeletons are well armed.<br><br>This monster will rise again when the party leaves the room, even if defeated.";
    }
}
