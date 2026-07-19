/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends ua {
    private int field_g;
    private kl field_j;
    static String field_B;
    static String[] field_C;
    private wm field_s;
    private byte[] field_u;
    private lj field_n;
    private int field_v;
    static bn[] field_w;
    private gd field_z;
    static int field_F;
    private gd field_h;
    private int field_l;
    private byte[] field_E;
    static String[] field_m;
    static rk field_y;
    static String[] field_A;
    static int field_p;
    private on field_f;
    private ab field_q;
    private boolean field_x;
    private jc field_t;
    private jc field_i;
    private int field_r;
    private boolean field_k;
    private long field_o;
    private boolean field_D;

    final static void a(ci param0, ci param1, ci param2, ci param3, pd param4, ci param5, ci param6, ci param7, boolean param8, boolean param9, ci param10, lh param11) {
        String discarded$1 = null;
        RuntimeException var12 = null;
        km var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        km[] var16 = null;
        ci var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var20 = Chess.field_G;
        try {
          L0: {
            L1: {
              eh.field_M = param10;
              vm.field_i[3] = 16736511;
              dn.field_b = param8;
              vm.field_i[2] = 9474303;
              vm.field_i[4] = 16711935;
              vm.field_i[0] = 16764000;
              vm.field_i[1] = 6356832;
              sc.field_a = param11;
              kg.field_P[2] = 16736352;
              kg.field_P[1] = 6356832;
              vm.field_i[4] = 16711935;
              kg.field_P[3] = 16736511;
              kg.field_P[0] = 16764000;
              uh.field_l = 8421504;
              var12_ref = new km(4, 4);
              var13 = var12_ref.field_x;
              var14 = var12_ref.field_x;
              var15 = var12_ref.field_x;
              var12_ref.field_x[15] = 7368816;
              var15[8] = 7368816;
              var13[2] = 7368816;
              var14[5] = 7368816;
              var16 = new km[9];
              var16[4] = var12_ref;
              uh.field_m = new ci(0L, param3);
              ji.field_N = new ci(0L, param6);
              if (!param9) {
                break L1;
              } else {
                discarded$1 = da.a((String) null, (String) null, (um) null, -40);
                break L1;
              }
            }
            uh.field_m.a((byte) 125, ji.field_N);
            var17 = new ci(0L, (ci) null);
            var17.field_I = new jc();
            ac.field_j = new nb(0L, var17, param1, param4);
            ji.field_N.a((byte) 123, ac.field_j);
            qj.field_e = new ci(0L, param2);
            ji.field_N.a((byte) 126, qj.field_e);
            eg.field_f = new ci(0L, param5);
            eg.field_f.field_xb = sc.field_a;
            qj.field_e.a((byte) 125, eg.field_f);
            qj.field_e.h(0);
            uc.field_c = new ci(0L, (ci) null);
            uc.field_c.field_Ab = var16;
            qj.field_e.a((byte) 124, uc.field_c);
            t.field_K = new ci[5];
            ig.field_i = new ci[5];
            mf.field_l = new ci[5];
            g.field_d = new ci[5];
            var18 = 0;
            L2: while (true) {
              if (-6 >= (var18 ^ -1)) {
                L3: {
                  L4: {
                    bj.field_jb = new ci(0L, param7);
                    bj.field_jb.field_db = ka.field_b;
                    uh.field_m.a((byte) 127, bj.field_jb);
                    if (!ub.a(21549)) {
                      break L4;
                    } else {
                      if (!qf.field_b) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ol.field_O = new jg(0, 0, 0, 0);
                  break L3;
                }
                break L0;
              } else {
                L5: {
                  L6: {
                    if (0 == var18) {
                      L7: {
                        if (!dn.field_b) {
                          stackOut_25_0 = ij.field_e;
                          stackIn_26_0 = stackOut_25_0;
                          break L7;
                        } else {
                          stackOut_23_0 = ja.field_c;
                          stackIn_26_0 = stackOut_23_0;
                          break L7;
                        }
                      }
                      var19 = stackIn_26_0;
                      break L6;
                    } else {
                      L8: {
                        if (var18 != 1) {
                          break L8;
                        } else {
                          if (!dn.field_b) {
                            break L8;
                          } else {
                            var19 = sg.field_b;
                            break L6;
                          }
                        }
                      }
                      if (var18 != 2) {
                        break L5;
                      } else {
                        var19 = a.field_k;
                        break L6;
                      }
                    }
                  }
                  g.field_d[var18] = new ci(0L, param0);
                  t.field_K[var18] = new ci(0L, eh.field_M, var19);
                  ig.field_i[var18] = new ci(0L, (ci) null);
                  ig.field_i[var18].field_cb = 1;
                  mf.field_l[var18] = new ci(0L, eh.field_M);
                  mf.field_l[var18].field_cb = 1;
                  g.field_d[var18].a((byte) 125, t.field_K[var18]);
                  g.field_d[var18].a((byte) 123, ig.field_i[var18]);
                  g.field_d[var18].a((byte) 127, mf.field_l[var18]);
                  g.field_d[var18].h(0);
                  uh.field_m.a((byte) 127, g.field_d[var18]);
                  qm.field_d = qm.field_d + 1;
                  break L5;
                }
                var18++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var12 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var12);
            stackOut_36_1 = new StringBuilder().append("da.D(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L9;
            }
          }
          L10: {
            stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L10;
            }
          }
          L11: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L11;
            }
          }
          L12: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L12;
            }
          }
          L13: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L13;
            }
          }
          L14: {
            stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param5 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L14;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L14;
            }
          }
          L15: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_63_0 = stackOut_60_0;
            stackIn_63_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param6 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L15;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L15;
            }
          }
          L16: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param7 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L16;
            }
          }
          L17: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param10 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param11 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L18;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
        }
    }

    final static int a(int param0, vg param1, String param2, vg param3, int param4, byte param5, boolean param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        p stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        p stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        p stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        p stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        String stackIn_29_2 = null;
        p stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        p stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        p stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_33_2 = null;
        int stackIn_49_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        p stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        p stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        String stackOut_28_2 = null;
        p stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        p stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        String stackOut_26_2 = null;
        p stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        p stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_32_2 = null;
        p stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String stackOut_30_2 = null;
        int stackOut_48_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var13 = Chess.field_G;
        try {
          L0: {
            if (param5 == -70) {
              L1: {
                var7_ref = param1.a((byte) -64);
                var8 = param3.a((byte) -64);
                if (lj.field_a == null) {
                  var9 = gd.a((byte) 68, false) ? 1 : 0;
                  if (var9 != 0) {
                    break L1;
                  } else {
                    stackOut_8_0 = -1;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (tb.field_f != ca.field_h) {
                  break L2;
                } else {
                  L3: {
                    qn.field_U.field_l = 0;
                    uc.field_b = null;
                    if (param2 == null) {
                      L4: {
                        mn.field_h.field_l = 0;
                        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                        stackOut_23_0 = mn.field_h;
                        stackOut_23_1 = 1;
                        stackIn_28_0 = stackOut_23_0;
                        stackIn_28_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param1.a(-10585)) {
                          stackOut_28_0 = (p) ((Object) stackIn_28_0);
                          stackOut_28_1 = stackIn_28_1;
                          stackOut_28_2 = (String) (var7_ref);
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          stackIn_29_2 = stackOut_28_2;
                          break L4;
                        } else {
                          stackOut_24_0 = (p) ((Object) stackIn_24_0);
                          stackOut_24_1 = stackIn_24_1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackOut_26_0 = (p) ((Object) stackIn_26_0);
                          stackOut_26_1 = stackIn_26_1;
                          stackOut_26_2 = "";
                          stackIn_29_0 = stackOut_26_0;
                          stackIn_29_1 = stackOut_26_1;
                          stackIn_29_2 = stackOut_26_2;
                          break L4;
                        }
                      }
                      L5: {
                        ((p) (Object) stackIn_29_0).a(stackIn_29_1 != 0, stackIn_29_2);
                        stackOut_29_0 = mn.field_h;
                        stackOut_29_1 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (!param3.a(-10585)) {
                          stackOut_32_0 = (p) ((Object) stackIn_32_0);
                          stackOut_32_1 = stackIn_32_1;
                          stackOut_32_2 = "";
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          stackIn_33_2 = stackOut_32_2;
                          break L5;
                        } else {
                          stackOut_30_0 = (p) ((Object) stackIn_30_0);
                          stackOut_30_1 = stackIn_30_1;
                          stackOut_30_2 = (String) (var8);
                          stackIn_33_0 = stackOut_30_0;
                          stackIn_33_1 = stackOut_30_1;
                          stackIn_33_2 = stackOut_30_2;
                          break L5;
                        }
                      }
                      ((p) (Object) stackIn_33_0).a(stackIn_33_1 != 0, stackIn_33_2);
                      qn.field_U.c(16, (byte) 63);
                      qn.field_U.field_l = qn.field_U.field_l + 1;
                      var9 = qn.field_U.field_l;
                      lk.a(dk.field_k, mn.field_h, qn.field_U, 55, se.field_M);
                      qn.field_U.a(qn.field_U.field_l + -var9, -1);
                      break L3;
                    } else {
                      L6: {
                        var9 = 0;
                        mn.field_h.field_l = 0;
                        if (param6) {
                          var9 = var9 | 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                        mn.field_h.a(true, var7_ref);
                        mn.field_h.a(true, var8);
                        mn.field_h.a(true, q.a((CharSequence) ((Object) param2), (byte) -57));
                        mn.field_h.b(param0, 86);
                        mn.field_h.c(param4, (byte) 92);
                        mn.field_h.c(var9, (byte) -107);
                        qn.field_U.c(18, (byte) 96);
                        qn.field_U.field_l = qn.field_U.field_l + 2;
                        var10 = qn.field_U.field_l;
                        var11_ref_String = m.a(bh.i(81), (byte) 87);
                        if (null == var11_ref_String) {
                          var11_ref_String = "";
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      qn.field_U.a(-104, var11_ref_String);
                      lk.a(dk.field_k, mn.field_h, qn.field_U, 86, se.field_M);
                      qn.field_U.d(qn.field_U.field_l - var10, 70);
                      break L3;
                    }
                  }
                  vh.a(-1, (byte) -27);
                  tb.field_f = dk.field_f;
                  break L2;
                }
              }
              L8: {
                if (tb.field_f != dk.field_f) {
                  break L8;
                } else {
                  if (tk.a(82, 1)) {
                    L9: {
                      var9 = tk.field_h.i(-115);
                      tk.field_h.field_l = 0;
                      if (-101 < (var9 ^ -1)) {
                        break L9;
                      } else {
                        if (var9 <= 105) {
                          sa.field_b = new String[-100 + var9];
                          tb.field_f = vf.field_a;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((var9 ^ -1) != -249) {
                      if ((var9 ^ -1) == -100) {
                        discarded$1 = tk.a(50, lg.a((byte) -122));
                        uc.field_b = new Boolean(fi.a(param5 + 68, tk.field_h));
                        tk.field_h.field_l = 0;
                        break L8;
                      } else {
                        sb.field_sb = -1;
                        tb.field_f = ii.field_P;
                        wg.field_B = var9;
                        break L8;
                      }
                    } else {
                      bo.a(bh.i(81), (byte) -12);
                      n.field_c = rb.field_d;
                      si.d(param5 + 65350);
                      ja.field_f = false;
                      stackOut_48_0 = var9;
                      stackIn_49_0 = stackOut_48_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                if (vf.field_a == tb.field_f) {
                  var9 = 2;
                  if (tk.a(param5 + 103, var9)) {
                    var10 = tk.field_h.f(674914976);
                    tk.field_h.field_l = 0;
                    if (tk.a(-122, var10)) {
                      var11 = sa.field_b.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var12 >= var11) {
                          si.d(65280);
                          ja.field_f = false;
                          stackOut_73_0 = var11 + 100;
                          stackIn_74_0 = stackOut_73_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          sa.field_b[var12] = tk.field_h.d(false);
                          var12++;
                          continue L11;
                        }
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L12: {
                if (ii.field_P == tb.field_f) {
                  if (jl.a(false)) {
                    L13: {
                      if (-256 == (wg.field_B ^ -1)) {
                        var9_ref_String = tk.field_h.b(true);
                        if (null == var9_ref_String) {
                          break L13;
                        } else {
                          aa.a(bh.i(81), -1, var9_ref_String);
                          break L13;
                        }
                      } else {
                        n.field_c = tk.field_h.d(0);
                        break L13;
                      }
                    }
                    si.d(65280);
                    ja.field_f = false;
                    stackOut_88_0 = wg.field_B;
                    stackIn_89_0 = stackOut_88_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null != lj.field_a) {
                  break L14;
                } else {
                  if (!ja.field_f) {
                    var9 = qh.field_a;
                    qh.field_a = bk.field_n;
                    bk.field_n = var9;
                    ja.field_f = true;
                    break L14;
                  } else {
                    L15: {
                      if ((ea.i((byte) -121) ^ -1L) >= -30001L) {
                        n.field_c = li.field_b;
                        break L15;
                      } else {
                        n.field_c = nc.field_Q;
                        break L15;
                      }
                    }
                    ja.field_f = false;
                    stackOut_102_0 = 249;
                    stackIn_103_0 = stackOut_102_0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                }
              }
              stackOut_105_0 = -1;
              stackIn_106_0 = stackOut_105_0;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackOut_2_0 = 6;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_107_0 = (RuntimeException) (var7);
            stackOut_107_1 = new StringBuilder().append("da.N(").append(param0).append(',');
            stackIn_110_0 = stackOut_107_0;
            stackIn_110_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param1 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L16;
            } else {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "{...}";
              stackIn_111_0 = stackOut_108_0;
              stackIn_111_1 = stackOut_108_1;
              stackIn_111_2 = stackOut_108_2;
              break L16;
            }
          }
          L17: {
            stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param2 == null) {
              stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L17;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L17;
            }
          }
          L18: {
            stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
            stackOut_115_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_115_2).append(',');
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param3 == null) {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L18;
            } else {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L18;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_119_0), stackIn_119_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_49_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_74_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_89_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_103_0;
                  } else {
                    return stackIn_106_0;
                  }
                }
              }
            }
          }
        }
    }

    final byte[] c(int param0, int param1) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, (byte) 51);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 1) {
                var4 = var3.a(false);
                var3.c(-2193);
                stackOut_8_0 = (byte[]) (var4);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = (byte[]) null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3_ref), "da.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final lj b(int param0) {
        tc discarded$1 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lj stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        lj stackIn_22_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_53_0 = null;
        lj stackIn_61_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_38_0 = null;
        lj stackOut_60_0 = null;
        lj stackOut_21_0 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (null != this.field_n) {
              stackOut_4_0 = this.field_n;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_q) {
                  if (this.field_s.a(true)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_q = (ab) ((Object) this.field_s.a(107, 255, (byte) 0, true, this.field_v));
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_q.field_s) {
                stackOut_18_0 = null;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 >= 18) {
                  L2: {
                    var2_array = this.field_q.a(false);
                    if (!(this.field_q instanceof tc)) {
                      try {
                        L3: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            this.field_n = new lj(var2_array, this.field_l, this.field_u);
                            break L3;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var3 = decompiledCaughtException;
                          this.field_s.c(0);
                          this.field_n = null;
                          if (this.field_s.a(true)) {
                            this.field_q = null;
                            break L4;
                          } else {
                            this.field_q = (ab) ((Object) this.field_s.a(109, 255, (byte) 0, true, this.field_v));
                            break L4;
                          }
                        }
                        stackOut_52_0 = null;
                        stackIn_53_0 = stackOut_52_0;
                        return (lj) ((Object) stackIn_53_0);
                      }
                      if (null == this.field_h) {
                        break L2;
                      } else {
                        discarded$1 = this.field_f.a(var2_array, this.field_v, 2, this.field_h);
                        break L2;
                      }
                    } else {
                      try {
                        L5: {
                          if (var2_array == null) {
                            throw new RuntimeException();
                          } else {
                            this.field_n = new lj(var2_array, this.field_l, this.field_u);
                            if ((this.field_n.field_s ^ -1) == (this.field_g ^ -1)) {
                              break L5;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L6: {
                          var3 = decompiledCaughtException;
                          this.field_n = null;
                          if (!this.field_s.a(true)) {
                            this.field_q = (ab) ((Object) this.field_s.a(115, 255, (byte) 0, true, this.field_v));
                            break L6;
                          } else {
                            this.field_q = null;
                            break L6;
                          }
                        }
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        return (lj) ((Object) stackIn_39_0);
                      }
                      break L2;
                    }
                  }
                  L7: {
                    if (null == this.field_z) {
                      break L7;
                    } else {
                      this.field_E = new byte[this.field_n.field_g];
                      break L7;
                    }
                  }
                  this.field_q = null;
                  stackOut_60_0 = this.field_n;
                  stackIn_61_0 = stackOut_60_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackOut_21_0 = (lj) null;
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "da.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (lj) ((Object) stackIn_13_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (lj) ((Object) stackIn_19_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return stackIn_61_0;
              }
            }
          }
        }
    }

    final static void a(double[] param0, int param1, double[] param2, int param3, int param4, int param5, double[] param6) {
        RuntimeException var7 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            param6[param4] = param2[param3 - param5] * param0[param1 - -1] - param2[param3 + 1] * param0[param1 + 2];
            param6[param4 + 1] = -(param0[param1] * param2[2 + param3]) + param0[2 + param1] * param2[param3];
            param6[param4 - -2] = -(param2[param3] * param0[param1 + 1]) + param2[param3 - -1] * param0[param1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("da.I(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void d(int param0) {
        ci discarded$3 = null;
        ab discarded$4 = null;
        ab discarded$5 = null;
        RuntimeException var2 = null;
        o var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (this.field_t == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.b(95) == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 12460) {
                    break L1;
                  } else {
                    discarded$3 = da.b((byte) 56);
                    break L1;
                  }
                }
                var2_ref = this.field_i.g(-18110);
                L2: while (true) {
                  if (var2_ref == null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        var3 = (int)var2_ref.field_e;
                        if ((var3 ^ -1) > -1) {
                          break L4;
                        } else {
                          if ((var3 ^ -1) <= (this.field_n.field_g ^ -1)) {
                            break L4;
                          } else {
                            if (-1 != (this.field_n.field_l[var3] ^ -1)) {
                              L5: {
                                if (this.field_E[var3] != 0) {
                                  break L5;
                                } else {
                                  discarded$4 = this.a(var3, 1, (byte) 74);
                                  break L5;
                                }
                              }
                              L6: {
                                if (-1 != this.field_E[var3]) {
                                  break L6;
                                } else {
                                  discarded$5 = this.a(var3, 2, (byte) 89);
                                  break L6;
                                }
                              }
                              if (-2 == (this.field_E[var3] ^ -1)) {
                                var2_ref.c(-2193);
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2_ref.c(param0 ^ -14397);
                      break L3;
                    }
                    var2_ref = this.field_i.a((byte) -127);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "da.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z != null) {
              L1: {
                this.field_x = true;
                if (param0 == 108) {
                  break L1;
                } else {
                  this.field_g = -13;
                  break L1;
                }
              }
              L2: {
                if (this.field_t == null) {
                  this.field_t = new jc();
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "da.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, String param1, um param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var4_int = 86 % ((param3 - -7) / 41);
            if (!param2.c((byte) 118)) {
              stackOut_3_0 = (String) (param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_5_0 = param1 + " - " + param2.a((byte) -108) + "%";
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("da.H(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final ab a(int param0, int param1, byte param2) {
        tc discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_97_0 = null;
        Object stackIn_109_0 = null;
        Object stackIn_146_0 = null;
        Object stackIn_155_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_56_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_63_0 = null;
        Object stackOut_145_0 = null;
        Object stackOut_154_0 = null;
        Object stackOut_96_0 = null;
        Object stackOut_108_0 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var4 = (ab) ((Object) this.field_j.a(-127, (long)param0));
              if (param2 >= 50) {
                break L1;
              } else {
                this.field_o = -55L;
                break L1;
              }
            }
            L2: {
              if (null == var4) {
                break L2;
              } else {
                if (0 != param1) {
                  break L2;
                } else {
                  if (((ab) (var4)).field_u) {
                    break L2;
                  } else {
                    if (((ab) (var4)).field_s) {
                      ((ab) (var4)).c(-2193);
                      var4 = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (null == var4) {
                L4: {
                  if (0 == param1) {
                    L5: {
                      if (this.field_z == null) {
                        break L5;
                      } else {
                        if (this.field_E[param0] != -1) {
                          var4 = this.field_f.a((byte) -111, param0, this.field_z);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (this.field_s.a(true)) {
                      stackOut_56_0 = null;
                      stackIn_57_0 = stackOut_56_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4 = this.field_s.a(113, this.field_v, (byte) 2, true, param0);
                      break L4;
                    }
                  } else {
                    if (param1 != 1) {
                      if (2 != param1) {
                        throw new RuntimeException();
                      } else {
                        if (null == this.field_z) {
                          throw new RuntimeException();
                        } else {
                          if (0 != (this.field_E[param0] ^ -1)) {
                            throw new RuntimeException();
                          } else {
                            if (this.field_s.e(-21)) {
                              stackOut_45_0 = null;
                              stackIn_46_0 = stackOut_45_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              var4 = this.field_s.a(88, this.field_v, (byte) 2, false, param0);
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      if (null != this.field_z) {
                        var4 = this.field_f.a(this.field_z, param0, (byte) -45);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                this.field_j.a(-125, (long)param0, (o) (var4));
                break L3;
              } else {
                break L3;
              }
            }
            if (((ab) (var4)).field_s) {
              stackOut_63_0 = null;
              stackIn_64_0 = stackOut_63_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              var5 = ((ab) (var4)).a(false);
              if (var4 instanceof tc) {
                try {
                  L6: {
                    L7: {
                      if (var5 == null) {
                        break L7;
                      } else {
                        if (2 >= var5.length) {
                          break L7;
                        } else {
                          eh.field_O.reset();
                          eh.field_O.update(var5, 0, var5.length - 2);
                          var6_int = (int)eh.field_O.getValue();
                          if ((var6_int ^ -1) == (this.field_n.field_p[param0] ^ -1)) {
                            L8: {
                              if (null == this.field_n.field_t) {
                                break L8;
                              } else {
                                if (this.field_n.field_t[param0] != null) {
                                  var7_ref_byte__ = this.field_n.field_t[param0];
                                  var8 = kh.a(0, -2 + var5.length, (byte) -43, var5);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      if (var7_ref_byte__[var9] != var8[var9]) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var7 = ((var5[var5.length - 2] & 255) << -797303576) - -(var5[-1 + var5.length] & 255);
                            if (var7 == (65535 & this.field_n.field_b[param0])) {
                              L10: {
                                if (1 != this.field_E[param0]) {
                                  L11: {
                                    if (-1 != (this.field_E[param0] ^ -1)) {
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  this.field_E[param0] = (byte) 1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L12: {
                                if (((ab) (var4)).field_u) {
                                  break L12;
                                } else {
                                  ((ab) (var4)).c(-2193);
                                  break L12;
                                }
                              }
                              stackOut_145_0 = var4;
                              stackIn_146_0 = stackOut_145_0;
                              break L6;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (Exception) (Object) decompiledCaughtException;
                    this.field_E[param0] = (byte) -1;
                    ((ab) (var4)).c(-2193);
                    if (((ab) (var4)).field_u) {
                      if (!this.field_s.a(true)) {
                        var4 = this.field_s.a(96, this.field_v, (byte) 2, true, param0);
                        this.field_j.a(-117, (long)param0, (o) (var4));
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_154_0 = null;
                  stackIn_155_0 = stackOut_154_0;
                  return (ab) ((Object) stackIn_155_0);
                }
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                try {
                  L14: {
                    L15: {
                      if (null == var5) {
                        break L15;
                      } else {
                        if (var5.length > 2) {
                          eh.field_O.reset();
                          eh.field_O.update(var5, 0, -2 + var5.length);
                          var6_int = (int)eh.field_O.getValue();
                          if (var6_int == this.field_n.field_p[param0]) {
                            L16: {
                              if (null == this.field_n.field_t) {
                                break L16;
                              } else {
                                if (null == this.field_n.field_t[param0]) {
                                  break L16;
                                } else {
                                  var7_ref_byte__ = this.field_n.field_t[param0];
                                  var8 = kh.a(0, var5.length - 2, (byte) 111, var5);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (-65 >= (var9 ^ -1)) {
                                      break L16;
                                    } else {
                                      if (var8[var9] == var7_ref_byte__[var9]) {
                                        var9++;
                                        continue L17;
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_s.field_g = 0;
                            this.field_s.field_c = 0;
                            break L14;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L18: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    this.field_s.c(0);
                    ((ab) (var4)).c(-2193);
                    if (((ab) (var4)).field_u) {
                      if (!this.field_s.a(true)) {
                        var4 = this.field_s.a(118, this.field_v, (byte) 2, true, param0);
                        this.field_j.a(92, (long)param0, (o) (var4));
                        break L18;
                      } else {
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  stackOut_96_0 = null;
                  stackIn_97_0 = stackOut_96_0;
                  return (ab) ((Object) stackIn_97_0);
                }
                L19: {
                  var5[var5.length - 2] = (byte)(this.field_n.field_b[param0] >>> -1497777528);
                  var5[-1 + var5.length] = (byte)this.field_n.field_b[param0];
                  if (null != this.field_z) {
                    discarded$1 = this.field_f.a(var5, param0, 2, this.field_z);
                    if (1 != this.field_E[param0]) {
                      this.field_E[param0] = (byte) 1;
                      break L19;
                    } else {
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (!((ab) (var4)).field_u) {
                    ((ab) (var4)).c(-2193);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                stackOut_108_0 = var4;
                stackIn_109_0 = stackOut_108_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) (var4), "da.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ab) ((Object) stackIn_46_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ab) ((Object) stackIn_57_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ab) ((Object) stackIn_64_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (ab) ((Object) stackIn_109_0);
              } else {
                return (ab) ((Object) stackIn_146_0);
              }
            }
          }
        }
    }

    final static boolean a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_F = 64;
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) > -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "da.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void e(int param0) {
        field_y = null;
        field_m = null;
        field_w = null;
        field_B = null;
        if (param0 != 16) {
            return;
        }
        try {
            field_A = null;
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "da.O(" + param0 + ')');
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            if (0 == param3) {
              stackOut_4_0 = "";
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) == param1) {
                var4_ref = param0[param2];
                if (null != var4_ref) {
                  stackOut_12_0 = var4_ref.toString();
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_10_0 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param2 + param3;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if ((var4_int ^ -1) >= (var6_int ^ -1)) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_31_0 = var6.toString();
                        stackIn_32_0 = stackOut_31_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            discarded$2 = var6.append("null");
                            break L3;
                          } else {
                            discarded$3 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (null != var7_ref_CharSequence) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var4);
            stackOut_33_1 = new StringBuilder().append("da.E(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_32_0;
            }
          }
        }
    }

    final int b(int param0, int param1) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (ab) ((Object) this.field_j.a(-121, (long)param1));
            if (null == var3) {
              var4 = -18 % ((-1 - param0) / 45);
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = var3.f(89);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3_ref), "da.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static ci b(byte param0) {
        RuntimeException var1 = null;
        ci stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ci stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -105) {
                break L1;
              } else {
                da.e(65);
                break L1;
              }
            }
            stackOut_3_0 = ea.field_bb.field_Fb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "da.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void c(int param0) {
        ab discarded$4 = null;
        ab discarded$5 = null;
        ab discarded$6 = null;
        ab discarded$7 = null;
        RuntimeException var2 = null;
        ab var2_ref = null;
        int var2_int = 0;
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (this.field_t == null) {
                break L1;
              } else {
                if (this.b(param0 ^ 108) == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!this.field_k) {
                    if (!this.field_x) {
                      this.field_t = null;
                      break L1;
                    } else {
                      var2_int = 1;
                      var3 = this.field_t.g(param0 ^ -18112);
                      L2: while (true) {
                        if (var3 == null) {
                          L3: while (true) {
                            L4: {
                              if (this.field_r >= this.field_n.field_l.length) {
                                break L4;
                              } else {
                                stackOut_63_0 = 0;
                                stackOut_63_1 = this.field_n.field_l[this.field_r];
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_65_1 = stackOut_63_1;
                                if (stackIn_65_0 != stackIn_65_1) {
                                  if (!this.field_s.e(-21)) {
                                    L5: {
                                      if ((this.field_E[this.field_r] ^ -1) != -2) {
                                        discarded$4 = this.a(this.field_r, 2, (byte) 77);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (1 == this.field_E[this.field_r]) {
                                        break L6;
                                      } else {
                                        var3 = new o();
                                        var3.field_e = (long)this.field_r;
                                        this.field_t.a(var3, (byte) 108);
                                        var2_int = 0;
                                        break L6;
                                      }
                                    }
                                    this.field_r = this.field_r + 1;
                                    continue L3;
                                  } else {
                                    var2_int = 0;
                                    break L4;
                                  }
                                } else {
                                  this.field_r = this.field_r + 1;
                                  continue L3;
                                }
                              }
                            }
                            L7: {
                              if (var2_int != 0) {
                                this.field_x = false;
                                this.field_r = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            break L1;
                          }
                        } else {
                          L8: {
                            var4 = (int)var3.field_e;
                            if ((this.field_E[var4] ^ -1) != -2) {
                              discarded$5 = this.a(var4, 2, (byte) 54);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if ((this.field_E[var4] ^ -1) != -2) {
                              var2_int = 0;
                              break L9;
                            } else {
                              var3.c(param0 ^ -2195);
                              break L9;
                            }
                          }
                          var3 = this.field_t.a((byte) -117);
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_t.g(-18110);
                    L10: while (true) {
                      if (null == var3) {
                        L11: while (true) {
                          L12: {
                            if ((this.field_r ^ -1) <= (this.field_n.field_l.length ^ -1)) {
                              break L12;
                            } else {
                              stackOut_22_0 = -1;
                              stackOut_22_1 = this.field_n.field_l[this.field_r] ^ -1;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              if (stackIn_24_0 != stackIn_24_1) {
                                if ((this.field_f.field_c ^ -1) <= -251) {
                                  var2_int = 0;
                                  break L12;
                                } else {
                                  L13: {
                                    if (0 != this.field_E[this.field_r]) {
                                      break L13;
                                    } else {
                                      discarded$6 = this.a(this.field_r, 1, (byte) 86);
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (0 != this.field_E[this.field_r]) {
                                      break L14;
                                    } else {
                                      var3 = new o();
                                      var3.field_e = (long)this.field_r;
                                      this.field_t.a(var3, (byte) -49);
                                      var2_int = 0;
                                      break L14;
                                    }
                                  }
                                  this.field_r = this.field_r + 1;
                                  continue L11;
                                }
                              } else {
                                this.field_r = this.field_r + 1;
                                continue L11;
                              }
                            }
                          }
                          L15: {
                            if (var2_int == 0) {
                              break L15;
                            } else {
                              this.field_k = false;
                              this.field_r = 0;
                              break L15;
                            }
                          }
                          break L1;
                        }
                      } else {
                        L16: {
                          var4 = (int)var3.field_e;
                          if (-1 == (this.field_E[var4] ^ -1)) {
                            discarded$7 = this.a(var4, 1, (byte) 67);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (0 != this.field_E[var4]) {
                            var3.c(-2193);
                            break L17;
                          } else {
                            var2_int = 0;
                            break L17;
                          }
                        }
                        var3 = this.field_t.a((byte) -114);
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
            L18: {
              if (param0 == 2) {
                break L18;
              } else {
                this.a((byte) 1);
                break L18;
              }
            }
            L19: {
              if (!this.field_D) {
                break L19;
              } else {
                if (ud.a(2) < this.field_o) {
                  break L19;
                } else {
                  var2_ref = (ab) ((Object) this.field_j.a(true));
                  L20: while (true) {
                    if (var2_ref == null) {
                      this.field_o = ud.a(2) - -1000L;
                      break L19;
                    } else {
                      L21: {
                        if (!var2_ref.field_s) {
                          if (var2_ref.field_q) {
                            if (var2_ref.field_u) {
                              var2_ref.c(-2193);
                              break L21;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            var2_ref.field_q = true;
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      var2_ref = (ab) ((Object) this.field_j.b((byte) 124));
                      continue L20;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "da.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(r param0, int param1, int param2, int param3, int param4, nb param5, boolean param6) {
        dh var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ja.a(param0.field_Yb, param0.field_Lb, (byte) -122, param5, -1, param0, (int[]) null, -1, param0.field_Rb);
              pi.field_d.a(0, true);
              pi.field_d.a(17, (int[]) null, 0);
              pi.field_d.d(-32);
              if (!param6) {
                break L1;
              } else {
                field_C = (String[]) null;
                break L1;
              }
            }
            var7 = pi.field_d;
            var8 = param4;
            var9 = param1;
            var10 = param2;
            var11 = param3;
            var7.field_b.a(true, var8, var11, var9, var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7_ref);
            stackOut_5_1 = new StringBuilder().append("da.L(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ')');
        }
    }

    da(int param0, gd param1, gd param2, wm param3, on param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        this.field_j = new kl(16);
        this.field_r = 0;
        this.field_i = new jc();
        this.field_o = 0L;
        try {
          L0: {
            L1: {
              this.field_z = param1;
              this.field_v = param0;
              if (null != this.field_z) {
                this.field_k = true;
                this.field_t = new jc();
                break L1;
              } else {
                this.field_k = false;
                break L1;
              }
            }
            L2: {
              this.field_f = param4;
              this.field_D = param8;
              this.field_s = param3;
              this.field_h = param2;
              this.field_g = param7;
              this.field_u = param6;
              this.field_l = param5;
              if (null == this.field_h) {
                break L2;
              } else {
                this.field_q = (ab) ((Object) this.field_f.a((byte) -111, this.field_v, this.field_h));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var10);
            stackOut_9_1 = new StringBuilder().append("da.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_B = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_m = new String[]{"Royalty", "Defender", "Quick Mover", "Safe Mover", "Pacifist", "Newcomer", "Challenger", "Victor", "Champion", "Master", "Samhain Sovereign"};
        field_p = -1;
        field_A = new String[16];
    }
}
