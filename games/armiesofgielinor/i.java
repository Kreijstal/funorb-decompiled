/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends je {
    private fp field_Qb;
    private je field_Ib;
    long field_Sb;
    static kl field_Lb;
    private je field_Vb;
    private StringBuilder field_Jb;
    static int[] field_Nb;
    private je field_Tb;
    private je[] field_Ub;
    private je field_Mb;
    private int field_Kb;
    static String field_Ob;
    private je field_Rb;
    private je field_Pb;

    final static void a(wk[] param0, int param1, int param2, byte param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 == null) {
            return;
          }
          if (0 < param5 &&
            0 < param1) {
            if (param0[3] != null) {
              stackIn_9_0 = param0[3].field_A;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null != param0[5]) {
              stackIn_12_0 = param0[5].field_A;
            } else {
              stackIn_12_0 = 0;
            }
            var7 = stackIn_12_0;
            if (param0[1] != null) {
              stackIn_15_0 = param0[1].field_x;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (null != param0[7]) {
              stackIn_18_0 = param0[7].field_x;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            if (param3 != -47) {
              i.a(true, -79, -40);
            }
            var10 = param5 + param2;
            var11 = param1 + param4;
            var12 = var6_int + param2;
            var13 = var10 - var7;
            var14 = param4 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param2 + var6_int * param5 / (var6_int + var7);
              var16 = param2 + var6_int * param5 / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param4 + var8 * param1 / (var9 + var8);
              var18 = param4 + var8 * param1 / (var9 + var8);
            }
            qn.b(pd.field_g);
            if (null != param0[0]) {
              qn.b(param2, param4, var16, var18);
              param0[0].g(param2, param4);
              qn.a(pd.field_g);
            }
            if (param0[2] != null) {
              qn.b(var17, param4, var10, var18);
              param0[2].g(var13, param4);
              qn.a(pd.field_g);
            }
            if (param0[6] != null) {
              qn.b(param2, var19, var16, var11);
              param0[6].g(param2, var15);
              qn.a(pd.field_g);
            }
            if (null != param0[8]) {
              qn.b(var17, var19, var10, var11);
              param0[8].g(var13, var15);
              qn.a(pd.field_g);
            }
            if (param0[1] != null &&
              param0[1].field_A != 0) {
              qn.b(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param0[1].field_A) {
                param0[1].g(var20, param4);
              }
              qn.a(pd.field_g);
            }
            if (null != param0[7] &&
              0 != param0[7].field_A) {
              qn.b(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param0[7].field_A) {
                param0[7].g(var20Lifetime1, var15);
              }
              qn.a(pd.field_g);
            }
            if (null != param0[3] &&
              0 != param0[3].field_x) {
              qn.b(param2, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param0[3].field_x) {
                param0[3].g(param2, var20Lifetime2);
              }
              qn.a(pd.field_g);
            }
            if (null != param0[5] &&
              param0[5].field_x != 0) {
              qn.b(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param0[5].field_x) {
                param0[5].g(var13, var20Lifetime3);
              }
              qn.a(pd.field_g);
            }
            if (null != param0[4] &&
              param0[4].field_A != 0) {
              if (param0[4].field_x == 0) {
                return;
              }
              qn.b(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].field_x) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].field_A) {
                  param0[4].g(var21, var20Lifetime4);
                }
              }
              qn.a(pd.field_g);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("i.B(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_Nb = null;
        field_Ob = null;
        if (param0 < 60) {
          field_Lb = (kl) null;
        }
        field_Lb = null;
    }

    private final int a(je param0, int param1, je param2, int param3, String param4, int param5) {
        je var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new je(0L, param0, 0, param1, param3, param5, param4);
          param2.a(var7, 87);
          param1 += 32;
          stackIn_1_0 = param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("i.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean l(int param0) {
        int discarded$0 = 0;
        if (this.field_Kb != -2) {
          return false;
        }
        if (rs.field_q == 13) {
          this.field_Kb = -1;
        }
        if (param0 != 18585) {
          String var3 = (String) null;
          discarded$0 = this.a((je) null, 77, (je) null, -9, (String) null, 124);
          return true;
        }
        return true;
    }

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        fp stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        je stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var3;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(true, param0);
        var3 = 80 / ((param1 + 36) / 58);
        if (this.field_Rb != null) {
          this.field_Rb.field_X = this.field_Jb.toString();
          this.field_Rb.field_S = (this.field_gb - this.field_Rb.field_Z.a(this.field_Rb.field_X)) / 2;
          this.field_Rb.field_gb = -this.field_Rb.field_S + this.field_gb;
          if (null != this.field_Qb &&
            0 != this.field_Qb.field_yb) {
            stackIn_6_0 = this.field_Qb;
            stackIn_7_1 = !(this.field_Qb.field_rb);
            stackIn_6_0.field_rb = stackIn_7_1;
          }
          for (var4 = 0; cq.field_F > var4; var4++) {
            if (null != this.field_Ub[var4]) {
              stackIn_15_0 = this.field_Ub[var4];
              stackIn_16_1 = !(0 >= this.field_Jb.length());
              stackIn_15_0.field_xb = stackIn_16_1;
              if (this.field_Ub[var4].field_xb &&
                this.field_Ub[var4].field_yb != 0) {
                return var4;
              }
            }
          }
        }
        if (this.field_Ib.field_yb != 0) {
          return -1;
        }
        if (param0 &&
          0 != tr.field_A &&
          this.field_yb == 0) {
          return -1;
        }
        return this.field_Kb;
    }

    private final int a(int param0, int param1, je param2, je param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param4 += 8;
          var6_int = param3.field_Z.a(param3.field_X, -(param3.field_O * param1) + param0, param3.field_pb);
          param3.a(var6_int, -20500, param0, param4, 0);
          param4 = param4 + (var6_int - 0);
          param2.a(param3, 57);
          stackIn_1_0 = param4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("i.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void n(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[2] = 16777215;
        var2[0] = 1;
        var2[1] = param0;
        st.field_z = new hc(oh.field_J, ga.field_k, rs.field_n, var2, 0, 0);
    }

    final boolean o(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          this.field_Ub = (je[]) null;
        }
        stackIn_6_0 = (null != this.field_Qb) && (this.field_Qb.field_rb);
        return stackIn_6_0;
    }

    final String k(int param0) {
        if (param0 != 1) {
          return (String) null;
        }
        return this.field_Jb.toString();
    }

    i(int param0, int param1, int param2, int param3, int param4, je param5, je param6, je param7, je param8, fp param9, je param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        fp stackIn_6_1;
        fp stackIn_6_2;
        long stackIn_6_3;
        fp stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        fp stackIn_8_1;
        fp stackIn_8_2;
        String stackIn_8_5;
        je stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        je[] var15 = null;
        RuntimeException var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        je[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        fp stackIn_8_1Lifetime1;
        fp stackIn_8_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_Kb = -2;
        try {
          this.field_Sb = param12;
          this.field_Mb = new je(0L, param6, ij.field_u.toUpperCase());
          this.field_Mb.field_Eb = 1;
          this.a(this.field_Mb, 69);
          this.field_Ib = new je(0L, param7);
          this.field_Mb.a(this.field_Ib, 126);
          this.field_Tb = new je(0L, (je) null);
          this.a(this.field_Tb, 106);
          if (param11 != null) {
            this.field_Vb = new je(0L, param8, ii.field_c);
            this.field_Vb.field_Eb = 1;
            this.field_Vb.field_N = 11184810;
            this.field_Tb.a(this.field_Vb, 116);
            this.field_Pb = new je(0L, param8, mk.field_d);
            this.field_Pb.field_Eb = 1;
            this.field_Pb.field_N = 11184810;
            this.field_Tb.a(this.field_Pb, 119);
            this.field_Rb = new je(0L, param8);
            this.field_Rb.field_N = 16764006;
            this.field_Tb.a(this.field_Rb, 63);
            this.field_Rb.field_I = "|";
            if (!(tf.field_l < 5) ||
              !(hi.field_j < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (fp) (param9);
                if (tf.field_l < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (hi.field_j < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = jq.field_E;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = ua.field_v;
              }
              this.field_Qb = new fp(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Tb.a(this.field_Qb, 65);
            }
            var28 = new je[3];
            var15 = var28;
            var28[0] = new je(0L, (je) null);
            this.field_Tb.a(var28[0], 100);
            var28[1] = new je(0L, (je) null);
            this.field_Tb.a(var28[1], 65);
            var28[2] = new je(0L, (je) null);
            this.field_Tb.a(var28[2], 111);
            this.field_Ub = new je[cq.field_F];
            for (var16 = 0; var16 < cq.field_F; var16++) {
              if (ef.field_d[var16] != null) {
                this.field_Ub[var16] = new je(0L, param10, ef.field_d[var16]);
                this.field_Ub[var16].field_Eb = 0;
                stackIn_14_0 = this.field_Ub[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_xb = stackIn_15_1;
                this.field_Tb.a(this.field_Ub[var16], 75);
              }
            }
            this.field_Jb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Jb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_Z.a(is.field_g);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_Z.a(ua.field_y);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_Z.a(op.field_d);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; cq.field_F > var17Lifetime4; var17Lifetime4++) {
              if (this.field_Ub[var17Lifetime4] != null) {
                var18 = this.field_Ub[var17Lifetime4].j(92);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(param6, var18Lifetime3, var28[0], var16Lifetime2, is.field_g, 24);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[6], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[9], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[5], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[7], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[15], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.field_Ub[4], var18Lifetime3);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(param6, var18Lifetime4, var28[1], var16Lifetime2, ua.field_y, 24);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.field_Ub[16], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.field_Ub[17], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.field_Ub[18], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.field_Ub[19], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.field_Ub[20], var18Lifetime4);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(param6, var18Lifetime5, var28[2], var16Lifetime2, op.field_d, 24);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.field_Ub[13], var18Lifetime5);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.field_Ub[21], var18Lifetime5);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.field_Ub[11], var18Lifetime5);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.field_Mb.j(116);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.field_Qb) {
              var20Lifetime2 = this.field_Qb.d(79, 4);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Mb.a(24, -20500, 13 + (var19 + 13), 0, 0);
            this.field_Ib.a(15, -20500, 15, 5, -20 + this.field_Mb.field_gb);
            var21 = 10;
            this.field_Vb.a(jn.field_d * 2, -20500, var19, var21, 13);
            var21 = var21 + jn.field_d * 2;
            this.field_Pb.a(2 * jn.field_d, -20500, var19, var21, 13);
            var21 = var21 + (10 + 2 * jn.field_d);
            this.field_Rb.a(jn.field_d, -20500, 0, var21, 0);
            var21 = var21 + (10 + jn.field_d);
            if (null != this.field_Qb) {
              var20Lifetime3 = this.field_Qb.d(93, 4);
              this.field_Qb.a((byte) 120, var21, 4, jn.field_d, 13 + (-var20Lifetime3 + var19) / 2, var20Lifetime3);
              var21 = var21 + (10 + jn.field_d);
            }
            var28[0].a(var17Lifetime5, -20500, var16Lifetime2, var21, 13);
            var28[1].a(var17Lifetime5, -20500, var16Lifetime2, var21, 26 + var16Lifetime2);
            var28[2].a(var17Lifetime5, -20500, var16Lifetime2, var21, 26 + (2 * var16Lifetime2 + 13));
            var22 = var21;
            this.field_Tb.a(10 + var17Lifetime5 + var22, -20500, var19 + 13 + 13, 24, 0);
            this.field_Tb.field_G = tq.a(11579568, false, this.field_Tb.field_ob, 2105376, 3, 8421504);
            var23 = var19 + 26;
            var24 = 10 + (var17Lifetime5 + (var22 + 24));
            var25 = jp.a(param0, param2, var23, -1);
            var26 = pd.a(var24, 0, param1, param3);
            this.a(var24, -20500, var23, var26, var25);
            return;
          }
          this.field_Vb = new je(0L, param8, ot.field_F);
          this.field_Vb.field_Eb = 1;
          this.field_Vb.field_N = 11184810;
          this.field_Tb.a(this.field_Vb, 43);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Vb.field_Z.c(this.field_Vb.field_X, var15_int);
          this.field_Vb.a(jn.field_d * var17Lifetime1, -20500, var15_int, var16Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + jn.field_d * var17Lifetime1;
          this.field_Tb.a(var16Lifetime1 + 10, -20500, 13 + (var15_int + 13), 24, 0);
          this.field_Tb.field_G = tq.a(11579568, false, this.field_Tb.field_ob, 2105376, 3, 8421504);
          var18Lifetime1 = 13 + var15_int + 13;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = jp.a(param0, param2, var18Lifetime1, -1);
          var21Lifetime1 = pd.a(var19Lifetime1, 0, param1, param3);
          this.a(var19Lifetime1, -20500, var18Lifetime1, var21Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("i.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        cd.a(108, param2, param1, 2);
        if (param0) {
          wk[] var4 = (wk[]) null;
          i.a((wk[]) null, -22, 63, (byte) 45, 53, 9);
        }
    }

    static {
        field_Ob = "<%0> is already on your friend list.";
        field_Nb = ce.a(-30);
    }
}
