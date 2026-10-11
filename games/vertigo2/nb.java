/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ji {
    static String field_A;
    static boolean field_z;
    static String field_E;
    private int field_C;
    static cr field_D;
    static fd field_F;
    static ve field_B;
    static String field_y;

    final static void a(int param0, cc param1, cc param2, byte param3) {
        try {
          bc.field_c = param0;
          mf.field_c = param2;
          gb.field_b = param1;
          if (param3 >= -56) {
            field_A = (String) null;
          }
          tn.a(bi.field_j / 2, bi.field_e / 2, 55);
          ar.a(param1.field_M + param1.field_t, (byte) 92, param2.field_M + param2.field_t, param1.field_t, param2.field_t);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        tn var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var10Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          var9 = (tn) null;
          nb.a((tn) null, 86);
        }
        var12 = this.field_x.a(param0, (byte) -72);
        var11 = var12;
        var10 = var11;
        var3 = var10;
        if (this.field_x.field_i) {
          var4 = lf.field_y[param0];
          for (var5 = 0; var5 < we.field_M; var5++) {
            var6 = rh.field_O[var5];
            if (var6 > this.field_C &&
              var6 < -this.field_C + 4096 &&
              2048 - this.field_C < var4 &&
              2048 + this.field_C > var4) {
              var7 = -var6 + 2048;
              if (var7 < 0) {
                var10 = var3;
                stackIn_12_0 = -var7;
              } else {
                stackIn_12_0 = var7;
              }
              var10 = var3;
              var7 = stackIn_12_0;
              var7 = var7 << 12;
              var7 = var7 / (-this.field_C + 2048);
              var10[var5] = 4096 - var7;
            } else if (var6 > -this.field_C + 2048 &&
              var6 < 2048 + this.field_C) {
              var7 = -2048 + var4;
              if (var7 >= 0) {
                stackIn_19_0 = var7;
              } else {
                stackIn_19_0 = -var7;
              }
              var7 = stackIn_19_0;
              var7 = var7 - this.field_C;
              var7 = var7 << 12;
              var10[var5] = var7 / (-this.field_C + 2048);
            } else if (var4 >= this.field_C &&
              var4 <= -this.field_C + 4096) {
              if (this.field_C <= var6 &&
                -this.field_C + 4096 >= var6) {
                var12[var5] = 0;
              } else {
                var7 = 2048 - var4;
                if (var7 < 0) {
                  stackIn_35_0 = -var7;
                } else {
                  stackIn_35_0 = var7;
                }
                var7 = stackIn_35_0;
                var7 = var7 << 12;
                var7 = var7 / (2048 - this.field_C);
                var10[var5] = -var7 + 4096;
              }
            } else {
              var7 = -2048 + var6;
              if (var7 >= 0) {
                stackIn_27_0 = var7;
              } else {
                stackIn_27_0 = -var7;
              }
              var7 = stackIn_27_0;
              var7 = var7 - this.field_C;
              var7 = var7 << 12;
              var10[var5] = var7 / (-this.field_C + 2048);
            }
          }
        }
        var10Lifetime1 = var3;
        return var10Lifetime1;
    }

    final static tn a(boolean param0, byte param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        mi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        mi var8 = null;
        q var9 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 32) {
          field_A = (String) null;
        }
        var8 = id.field_f;
        var2 = var8;
        var3 = var8.h(-11);
        ln.field_c = 127 & var3;
        stackIn_5_0 = (0 != (var3 & 128));
        cb.field_Ib = stackIn_5_0;
        rq.field_u = var8.h(-11);
        ug.field_a = var8.i(-31016);
        if (ln.field_c == 2) {
          ck.field_J = var8.a((byte) -11);
          qf.field_a = var8.m(0);
        } else {
          ck.field_J = 0;
          qf.field_a = 0;
        }
        stackIn_11_0 = (var8.h(-11) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        sp.field_U = var8.f(128);
        if (var4 == 0) {
          fd.field_p = sp.field_U;
        } else {
          fd.field_p = var8.f(128);
        }
        if (ln.field_c == 1) {
          tj.field_b = var8.a((byte) -11);
          ad.field_a = var8.f(128);
        } else {
          if (ln.field_c == 4) {
            tj.field_b = var8.a((byte) -11);
            ad.field_a = var8.f(128);
          } else {
            tj.field_b = 0;
            ad.field_a = null;
          }
        }
        if (!param0) {
          tj.field_a = hh.a((byte) -123, 80, var8);
          sd.field_P = null;
        } else {
          var5 = var8.a((byte) -11);
          try {
            var9 = wm.field_k.a(1, var5);
            tj.field_a = var9.h(33);
            if (fd.field_p.equals(qe.field_V)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var9.field_w;
            }
            sd.field_P = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ke.a((Throwable) ((Object) var6), "CC1", 0);
            sd.field_P = null;
            tj.field_a = null;
          }
        }
        return new tn(param0);
    }

    final static void h(int param0) {
        if (param0 != -14829) {
          nb.i(-116);
        }
        hh.a(-20, lr.field_H);
    }

    final static il i(int param0) {
        try {
          Throwable var1 = null;
          il stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 0) {
              nb.g(127);
            }
            stackIn_3_0 = (il) (Class.forName("vk").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(tn param0, int param1) {
        String stackIn_9_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var2 = null;
          if (param0.field_l != null) {
            var5 = param0.field_l;
            var2 = var5;
            var2 = var5;
            var2 = var5;
            if (1 == param0.field_h) {
              var2 = "<img=0>" + var5;
            }
            if (2 == param0.field_h) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (param1 <= 6) {
            stackIn_9_0 = (String) null;
            return stackIn_9_0;
          }
          if (param0.field_s != 2) {
            if (param0.field_s == 0 &&
              fq.field_i) {
              var3 = "[" + fb.field_A + "] ";
            }
            if (param0.field_s == 1) {
              var3 = "[" + Vertigo2.a(new String[]{param0.field_k}, ie.field_Rb, -117) + "] ";
            }
            if (param0.field_s == 4 &&
              v.field_a != null) {
              var3 = "[" + v.field_a + "] ";
            }
            if (param0.field_s == 3) {
              var3 = "[#" + param0.field_k + "] ";
            }
            if (!param0.field_n) {
              var3 = var3 + (String) (var2) + ": ";
            }
          } else {
            if (!param0.field_n) {
              if (param0.field_o == 0 &&
                param0.field_m == 0) {
                var3 = Vertigo2.a(new String[]{(String) (var2)}, di.field_B, 70);
              } else {
                var3 = Vertigo2.a(new String[]{(String) (var2)}, af.field_L, -118);
              }
            }
          }
          stackIn_34_0 = var3;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("nb.E(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wn.a((Throwable) (stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1;
          if (0 == var4_int) {
            this.field_C = param2.a((byte) -11);
          }
          if (param0 != 110) {
            field_A = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void d(int param0, int param1) {
        li var2 = null;
        int var3 = 0;
        hn var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = (hn) (qo.field_B.a((byte) 100));
          while (var4 != null) {
            lh.a(param0, var4, (byte) 81);
            var4 = (hn) (qo.field_B.b(45));
          }
          var2 = vf.field_C.a((byte) 100);
          while (var2 != null) {
            mp.a(param0, 98);
            var2 = vf.field_C.b(36);
          }
          if (param1 != -2) {
            nb.a(false, (byte) 93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "nb.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var7_int = param4 + param0;
          if (param3 != -92) {
            return;
          }
          var8 = param5 - param4;
          for (var11 = param0; var7_int > var11; var11++) {
            ki.a(-101, param6, vl.field_e[var11], param1, param2);
          }
          var9 = param4 + param6;
          var10 = -param4 + param1;
          for (var11Lifetime1 = param5; var8 < var11Lifetime1; var11Lifetime1--) {
            ki.a(-81, param6, vl.field_e[var11Lifetime1], param1, param2);
          }
          for (var11Lifetime2 = var7_int; var8 >= var11Lifetime2; var11Lifetime2++) {
            var17 = vl.field_e[var11Lifetime2];
            ki.a(-106, param6, var17, var9, param2);
            ki.a(-128, var10, var17, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "nb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public nb() {
        super(0, true);
        this.field_C = 585;
    }

    public static void g(int param0) {
        field_F = null;
        field_y = null;
        field_D = null;
        field_A = null;
        field_E = null;
        field_B = null;
        if (param0 != 0) {
          cc var2 = (cc) null;
          nb.a(102, (cc) null, (cc) null, (byte) 77);
        }
    }

    static {
        field_E = "Select mode";
        field_z = true;
        field_F = new fd(0, 0);
        field_B = new ve(15, 0, 1, 0);
    }
}
