/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends pp {
    static ee[] field_i;
    static kv field_l;
    static sna field_k;
    private int field_j;

    final static String a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            qq.b(82);
          }
          stackIn_4_0 = gt.a(0, param0, (byte) 104, param0.length);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("qq.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(lu param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          er.a(this.field_h, 119, param0);
          var3_int = -74 / ((34 - param1) / 58);
          param0.d(this.field_j, 0);
          param0.b(this.field_f, -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("qq.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(eaa param0, int param1, int param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          var4 = (lh) (param0.b((byte) 90));
          param1 += 32;
          var5 = 0;
          if (param3 != -3227) {
            return;
          }
          while (var4 != null) {
            var6 = (var4.field_h * 326565 + var4.field_i * 8357 & 630) + (var4.field_o >> 1);
            if (var7 != 0) {
              return;
            }
            if (256 < var6) {
              var6 = 256;
            }
            lw.field_b[1 + (var5 & 1)].a(param1 + (var4.field_i >> 4) - 32, -32 + (-(var4.field_h >> 5) + (param2 + (var4.field_q >> 4)) - 2), var4.field_o << 3);
            var5++;
            var4 = (lh) (param0.c(param3 ^ -3227));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("qq.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static rga a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        rga var6 = null;
        rga stackIn_5_0 = null;
        rga stackIn_10_0 = null;
        rga stackIn_13_0 = null;
        rga stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1 &&
            param1.length() != 0) {
            var3 = 46 / ((param0 + 32) / 45);
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_10_0 = uc.field_j;
              return stackIn_10_0;
            }
            var4 = param1.substring(0, var2_int);
            var5 = param1.substring(1 + var2_int);
            var6 = ona.a(var4, -15679);
            if (var6 == null) {
              stackIn_15_0 = jq.a((byte) 117, var5);
              return stackIn_15_0;
            }
            stackIn_13_0 = var6;
            return stackIn_13_0;
          }
          stackIn_5_0 = gka.field_n;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("qq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(sna param0, sna param1, cw param2, sna param3, po param4, sna param5, sna param6, sna param7, sna param8, int param9, sna param10, boolean param11) {
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        kv[] var16 = null;
        sna var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = BachelorFridge.field_y;
        try {
          uc.field_l = param8;
          jaa.field_u[4] = 16711935;
          jaa.field_u[0] = 16764000;
          jaa.field_u[3] = 16736511;
          jaa.field_u[2] = 9474303;
          dc.field_r = param4;
          am.field_O = param11;
          jaa.field_u[1] = 6356832;
          wp.field_q[2] = 16736352;
          wp.field_q[0] = 16764000;
          jaa.field_u[4] = 16711935;
          wp.field_q[3] = 16736511;
          wp.field_q[1] = 6356832;
          vq.field_w = 8421504;
          var12 = new kv(4, 4);
          var13 = var12.field_v;
          var14 = var12.field_v;
          var12.field_v[15] = 7368816;
          var15 = var12.field_v;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var15[8] = 7368816;
          var16 = new kv[9];
          var16[4] = var12;
          i.field_a = new sna(0L, param10);
          gha.field_d = new sna(0L, param7);
          if (param9 != -30803) {
            field_k = (sna) null;
          }
          i.field_a.a(-1, gha.field_d);
          var17 = new sna(0L, (sna) null);
          var17.field_z = new eaa();
          af.field_b = new sga(0L, var17, param5, param2);
          gha.field_d.a(-1, af.field_b);
          oi.field_w = new sna(0L, param3);
          gha.field_d.a(-1, oi.field_w);
          jba.field_A = new sna(0L, param6);
          jba.field_A.field_jb = dc.field_r;
          oi.field_w.a(-1, jba.field_A);
          oi.field_w.d((byte) 116);
          ts.field_r = new sna(0L, (sna) null);
          ts.field_r.field_eb = var16;
          oi.field_w.a(-1, ts.field_r);
          r.field_l = new sna[5];
          bda.field_m = new sna[5];
          cb.field_o = new sna[5];
          wg.field_i = new sna[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_31_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 != 0) {
                if (var18 == 1 &&
                  am.field_O) {
                  var19 = hfa.field_B;
                } else {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = dha.field_d;
                  }
                }
              } else {
                if (!am.field_O) {
                  stackIn_27_0 = uha.field_Vb;
                } else {
                  stackIn_27_0 = cja.field_r;
                }
                var19 = stackIn_27_0;
              }
              if (decompiledFrameRemainder0) {
                r.field_l[var18] = new sna(0L, param0);
                cb.field_o[var18] = new sna(0L, uc.field_l, var19);
                wg.field_i[var18] = new sna(0L, (sna) null);
                wg.field_i[var18].field_Y = 1;
                bda.field_m[var18] = new sna(0L, uc.field_l);
                bda.field_m[var18].field_Y = 1;
                r.field_l[var18].a(param9 + 30802, cb.field_o[var18]);
                r.field_l[var18].a(-1, wg.field_i[var18]);
                r.field_l[var18].a(-1, bda.field_m[var18]);
                r.field_l[var18].d((byte) 126);
                i.field_a.a(param9 ^ 30802, r.field_l[var18]);
                rf.field_k = rf.field_k + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            kg.field_a = new sna(0L, param1);
            kg.field_a.field_Z = sv.field_b;
            i.field_a.a(-1, kg.field_a);
            stackIn_31_0 = cia.a(0) ? 1 : 0;
          }
          if (stackIn_31_0 != 0 &&
            !hl.field_I) {
            return;
          }
          ao.field_d = new d(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_41_0 = var12_ref;
          stackIn_41_1 = new StringBuilder().append("qq.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param4 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param5 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param6 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param7 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param8 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param11).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1, String param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fw.field_h[param5] = new pd(param5, param2, param1, param4, gma.field_e[param3], param6, param0);
          if (param7 != 29052) {
            qq.a((byte[]) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(aga param0, op param1, int param2) {
        RuntimeException runtimeException = null;
        aga var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = this.field_h.a(71, param1);
          if (-1 != this.field_j) {
            var4.field_k[this.field_j] = var4.field_k[this.field_j] - this.field_f;
            decompiledFrameRemainder0 = (BachelorFridge.field_y != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (var4.a(this.field_f, param0, (byte) 2))) {
            return;
          }
          if (param2 != 12) {
            this.a((lu) null, (byte) -4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("qq.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final static sca b(int param0) {
        try {
          Throwable var1 = null;
          RuntimeException var1_ref = null;
          sca stackIn_4_0 = null;
          Object stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != -5368) {
                field_l = (kv) null;
              }
              stackIn_4_0 = (sca) (Class.forName("qv").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              stackIn_6_0 = null;
              return (sca) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw pe.a((Throwable) ((Object) var1_ref), "qq.K(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 5) {
            qq.a(-19, (String) null);
          }
          field_l = null;
          field_i = null;
          field_k = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qq.F(" + param0 + ')');
        }
    }

    qq(nq param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param0;
          this.field_j = param1;
          this.field_f = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qq.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
