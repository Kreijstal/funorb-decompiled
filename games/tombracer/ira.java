/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends osa {
    private int field_u;
    private int field_s;
    static jpa field_t;

    final int c(int param0) {
        if (param0 != 1) {
          this.b(31);
        }
        return 11;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = -54 / ((-50 - param2) / 41);
        return param0 * -1918454973 + -669632447 * param1;
    }

    final static int a(int param0, int param1, int param2) {
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        var4 = param1 >> 31;
        param1 = var4 + param1 ^ var4;
        var4Lifetime1 = param0 >> 31;
        param0 = param0 + var4Lifetime1 ^ var4Lifetime1;
        if (param2 < 73) {
          return 77;
        }
        if (param0 > param1) {
          var4Lifetime2 = param1;
          param1 = param0;
          param0 = var4Lifetime2;
        }
        var3 = 0;
        if (param1 >= 32768) {
          if (param1 >= 1073741824) {
            var3 += 16;
            param1 = param1 >> 16;
          }
          if (param1 >= 4194304) {
            param1 = param1 >> 8;
            var3 += 8;
          }
          if (param1 >= 262144) {
            var3 += 4;
            param1 = param1 >> 4;
          }
          if (param1 >= 65536) {
            var3 += 2;
            param1 = param1 >> 2;
          }
          if (32768 <= param1) {
            param1 = param1 >> 1;
            var3++;
          }
          param0 = param0 >> var3;
        }
        if (param0 << 5 < param1) {
          return param1 << var3;
        }
        param1 = param1 * param1 + param0 * param0;
        if (param1 < 65536) {
          if (param1 < 256) {
            if (0 > param1) {
              return -1;
            }
            return lw.field_g[param1] >> 12;
          }
          if (param1 >= 4096) {
            if (param1 >= 16384) {
              return lw.field_g[param1 >> 8] >> 8;
            }
            return lw.field_g[param1 >> 6] >> 9;
          }
          if (param1 >= 1024) {
            return lw.field_g[param1 >> 4] >> 10;
          }
          return lw.field_g[param1 >> 2] >> 11;
        }
        if (param1 < 16777216) {
          if (1048576 <= param1) {
            if (param1 < 4194304) {
              return lw.field_g[param1 >> 14] >> 5;
            }
            return lw.field_g[param1 >> 16] >> 4;
          }
          if (262144 > param1) {
            return lw.field_g[param1 >> 10] >> 7;
          }
          return lw.field_g[param1 >> 12] >> 6;
        }
        if (268435456 <= param1) {
          if (param1 >= 1073741824) {
            return lw.field_g[param1 >> 24] << var3;
          }
          if (1 > var3) {
            stackIn_42_0 = lw.field_g[param1 >> 22] >> 1 - var3;
          } else {
            stackIn_42_0 = lw.field_g[param1 >> 22] << var3 - 1;
          }
          return stackIn_42_0;
        }
        if (param1 >= 67108864) {
          if (2 > var3) {
            stackIn_51_0 = lw.field_g[param1 >> 20] >> 2 - var3;
          } else {
            stackIn_51_0 = lw.field_g[param1 >> 20] << -2 + var3;
          }
          return stackIn_51_0;
        }
        if (var3 >= 3) {
          stackIn_47_0 = lw.field_g[param1 >> 18] << var3 - 3;
        } else {
          stackIn_47_0 = lw.field_g[param1 >> 18] >> 3 - var3;
        }
        return stackIn_47_0;
    }

    final static void a(boolean param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var3Lifetime1;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 == -1 &&
            rba.field_a == null) {
            return;
          }
          if (param1 == hb.field_t.field_c) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != -1) {
            if (param1 >= 0 &&
              param1 != 7 &&
              param1 != 8 &&
              param1 != 12) {
              er.b(1, 0);
              kqa.b(18916);
              if ((!(wka.field_d) ||
                cs.field_c == null)) {
                fp.a(48);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (-2 == param1) {
                er.b(1, 0);
                kqa.b(18916);
                wka.field_d = false;
                cs.field_c = null;
              }
            }
          } else {
            er.b(1, 1);
            cs.field_c = null;
            wka.field_d = false;
          }
          wm.field_a = hb.field_t;
          if (null != wm.field_a) {
            wm.field_a.a(-123);
            if (wm.field_a.field_c == 1) {
              fp.a(108);
            }
            if (null != mq.field_e && (wm.field_a.field_c == 12 ||
              wm.field_a.field_c == 4)) {
              wma.a(tk.a(-22636), 12, mq.field_e.field_g, jg.a((byte) -80));
            }
          }
          hb.field_t = eka.d(param1, 121);
          if (hb.field_t instanceof wv) {
            ((wv) (hb.field_t)).a(0, 0, param0);
          }
          hb.field_t.a((byte) 114);
          if (mpa.field_X) {
            qv.field_o = null;
            sua.field_H = new vna();
            var11 = rb.field_o;
            var9 = var11;
            var6 = var9;
            var3 = var6;
            for (var4 = 0; var4 < 8; var4++) {
              var11[var4] = 0;
            }
            var12 = pq.field_e;
            var10 = var12;
            var7 = var10;
            var3Lifetime1 = var7;
            var8 = 0;
            var4Lifetime1 = var8;
            while (var8 < 8) {
              var12[var8] = 0;
              var8++;
            }
            uma.field_c = false;
            mpa.field_X = false;
            pna.field_p = false;
            ip.field_b = false;
          }
          if (era.field_c) {
            cv.o((byte) -119);
            ig.a(-125);
            ub.b(0);
            era.field_c = false;
          }
          if (hb.field_t instanceof wv &&
            wm.field_a instanceof wv &&
            ((wv) (wm.field_a)).a(true, (wv) (hb.field_t))) {
            hb.field_t.field_d = wm.field_a.field_c;
          }
          var3_int = 69 % ((40 - param2) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "ira.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        uia var16 = null;
        uia var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var16 = new uia(param1);
          var17 = var16;
          var17.field_h = -2 + param1.length;
          fa.field_b = var17.d(123);
          pg.field_C = new int[fa.field_b];
          ck.field_c = new byte[fa.field_b][];
          ak.field_p = new int[fa.field_b];
          iga.field_m = new int[fa.field_b];
          mq.field_b = new int[fa.field_b];
          pb.field_l = new byte[fa.field_b][];
          qqa.field_n = new boolean[fa.field_b];
          var17.field_h = -7 + param1.length - fa.field_b * 8;
          ika.field_a = var17.d(126);
          kba.field_s = var17.d(param0 ^ 126);
          var3 = 1 + (var17.h(255) & 255);
          for (var4 = 0; fa.field_b > var4; var4++) {
            ak.field_p[var4] = var16.d(121);
          }
          for (var4Lifetime1 = param0; var4Lifetime1 < fa.field_b; var4Lifetime1++) {
            pg.field_C[var4Lifetime1] = var17.d(127);
          }
          for (var4Lifetime2 = 0; fa.field_b > var4Lifetime2; var4Lifetime2++) {
            mq.field_b[var4Lifetime2] = var17.d(kha.b(param0, 122));
          }
          for (var4Lifetime3 = 0; fa.field_b > var4Lifetime3; var4Lifetime3++) {
            iga.field_m[var4Lifetime3] = var17.d(122);
          }
          var17.field_h = -(var3 * 3) + 3 + (-(8 * fa.field_b) + (-7 + param1.length));
          mga.field_g = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            mga.field_g[var4Lifetime4] = var17.a(-32768);
            if (mga.field_g[var4Lifetime4] == 0) {
              mga.field_g[var4Lifetime4] = 1;
            }
          }
          var17.field_h = 0;
          for (var4Lifetime5 = 0; fa.field_b > var4Lifetime5; var4Lifetime5++) {
            var5 = mq.field_b[var4Lifetime5];
            var6 = iga.field_m[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            ck.field_c[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            pb.field_l[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.h(param0 + 255);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.c((byte) 119);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.c((byte) 87);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_31_0 = var10;
                  if (var13 == -1) {
                    stackIn_32_1 = 0;
                  } else {
                    stackIn_32_1 = 1;
                  }
                  var10 = stackIn_31_0 | stackIn_32_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var13 * var5] = var17.c((byte) 103);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.c((byte) 47);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_46_0 = var10;
                    if (-1 == var14) {
                      stackIn_47_1 = 0;
                    } else {
                      stackIn_47_1 = 1;
                    }
                    var10 = stackIn_46_0 | stackIn_47_1;
                  }
                }
              }
            }
            qqa.field_n[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("ira.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var2 = this.field_n.s(25745) - this.f(10);
        int var3 = this.field_n.e(false) - this.g((byte) 30);
        int var4 = 0;
        if (var2 > this.field_u) {
          var4 = -(var2 - this.field_u);
        }
        int var5 = 0;
        if (-this.field_u > var2) {
          var4 = -this.field_u - var2;
        }
        if (var3 > this.field_s) {
          var5 = -(-this.field_s + var3);
        }
        if (-this.field_s > var3) {
          var5 = -this.field_s - var3;
        }
        if (param0 != 1) {
          return;
        }
        this.field_n.a((byte) -35, var4, var5);
    }

    ira(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_u = param1.b((byte) 44, 10) << 16;
          this.field_s = param1.b((byte) 44, 10) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ira.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void j(byte param0) {
        if (param0 != 91) {
          field_t = (jpa) null;
        }
        field_t = null;
    }

    final void b(byte param0) {
        int var2 = 27 / ((-69 - param0) / 42);
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          return 20;
        }
        param1 = fs.a((byte) 68, param1, this.field_u);
        param1 = fs.a((byte) 90, param1, this.field_s);
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
          super.a(param0, (byte) -106);
          param0.a((byte) -126, this.field_u >> 16, 10);
          if (param1 >= -78) {
            ira.a(true, -95, (byte) -90);
          }
          param0.a((byte) 16, this.field_s >> 16, 10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ira.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, fsa param1) {
        try {
          if (param0 <= 35) {
            byte[] var4 = (byte[]) null;
            ira.a(63, (byte[]) null);
          }
          super.a(112, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ira.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
