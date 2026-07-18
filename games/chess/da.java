/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int stackIn_7_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_24_0 = null;
        boolean stackOut_30_0 = false;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
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
                String discarded$1 = da.a((String) null, (String) null, (um) null, -40);
                break L1;
              }
            }
            uh.field_m.a((byte) 125, ji.field_N);
            var17 = new ci(0L, (ci) null);
            var17.field_I = new jc();
            ac.field_j = new nb(0L, var17, param1, param4);
            ji.field_N.a((byte) 123, (ci) (Object) ac.field_j);
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
              L3: {
                L4: {
                  if (var18 >= 5) {
                    break L4;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_31_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var20 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_7_0 == var18) {
                              break L7;
                            } else {
                              L8: {
                                if (var18 != 1) {
                                  break L8;
                                } else {
                                  if (!dn.field_b) {
                                    break L8;
                                  } else {
                                    var19 = sg.field_b;
                                    if (var20 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (var18 != 2) {
                                break L5;
                              } else {
                                var19 = a.field_k;
                                if (var20 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L9: {
                            if (!dn.field_b) {
                              stackOut_26_0 = ij.field_e;
                              stackIn_27_0 = stackOut_26_0;
                              break L9;
                            } else {
                              stackOut_24_0 = ja.field_c;
                              stackIn_27_0 = stackOut_24_0;
                              break L9;
                            }
                          }
                          var19 = stackIn_27_0;
                          break L6;
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
                      if (var20 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                bj.field_jb = new ci(0L, param7);
                bj.field_jb.field_db = ka.field_b;
                uh.field_m.a((byte) 127, bj.field_jb);
                stackOut_30_0 = ub.a(21549);
                stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                break L3;
              }
              L10: {
                L11: {
                  if (stackIn_31_0 == 0) {
                    break L11;
                  } else {
                    if (!qf.field_b) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                ol.field_O = new jg(0, 0, 0, 0);
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var12 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var12;
            stackOut_38_1 = new StringBuilder().append("da.D(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L12;
            }
          }
          L13: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L13;
            }
          }
          L14: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L14;
            }
          }
          L15: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L15;
            }
          }
          L16: {
            stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param4 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L16;
            }
          }
          L17: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param5 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L17;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L17;
            }
          }
          L18: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param6 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L18;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L18;
            }
          }
          L19: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param7 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L19;
            }
          }
          L20: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param10 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L20;
            }
          }
          L21: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param11 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L21;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L21;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ')');
        }
    }

    final static int a(int param0, vg param1, String param2, vg param3, int param4, byte param5, boolean param6) {
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
        int stackIn_76_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
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
        int stackOut_75_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
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
                    return stackIn_9_0;
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
                    L4: {
                      qn.field_U.field_l = 0;
                      uc.field_b = null;
                      if (param2 == null) {
                        break L4;
                      } else {
                        L5: {
                          var9 = 0;
                          mn.field_h.field_l = 0;
                          if (param6) {
                            var9 = var9 | 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                          mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
                          mn.field_h.a(true, var7_ref);
                          mn.field_h.a(true, var8);
                          mn.field_h.a(true, q.a((CharSequence) (Object) param2, (byte) -57));
                          mn.field_h.b(param0, 86);
                          mn.field_h.c(param4, (byte) 92);
                          mn.field_h.c(var9, (byte) -107);
                          qn.field_U.c(18, (byte) 96);
                          qn.field_U.field_l = qn.field_U.field_l + 2;
                          var10 = qn.field_U.field_l;
                          var11_ref_String = m.a(bh.i(81), (byte) 87);
                          if (null == var11_ref_String) {
                            var11_ref_String = "";
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        qn.field_U.a(-104, var11_ref_String);
                        lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 86, se.field_M);
                        qn.field_U.d(qn.field_U.field_l - var10, 70);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L7: {
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
                        stackOut_28_0 = (p) (Object) stackIn_28_0;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = (String) var7_ref;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        break L7;
                      } else {
                        stackOut_24_0 = (p) (Object) stackIn_24_0;
                        stackOut_24_1 = stackIn_24_1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackOut_26_0 = (p) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = "";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        break L7;
                      }
                    }
                    L8: {
                      ((p) (Object) stackIn_29_0).a(stackIn_29_1 != 0, stackIn_29_2);
                      stackOut_29_0 = mn.field_h;
                      stackOut_29_1 = 1;
                      stackIn_32_0 = stackOut_29_0;
                      stackIn_32_1 = stackOut_29_1;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      if (!param3.a(-10585)) {
                        stackOut_32_0 = (p) (Object) stackIn_32_0;
                        stackOut_32_1 = stackIn_32_1;
                        stackOut_32_2 = "";
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        stackIn_33_2 = stackOut_32_2;
                        break L8;
                      } else {
                        stackOut_30_0 = (p) (Object) stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = (String) var8;
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        break L8;
                      }
                    }
                    ((p) (Object) stackIn_33_0).a(stackIn_33_1 != 0, stackIn_33_2);
                    qn.field_U.c(16, (byte) 63);
                    qn.field_U.field_l = qn.field_U.field_l + 1;
                    var9 = qn.field_U.field_l;
                    lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 55, se.field_M);
                    qn.field_U.a(qn.field_U.field_l + -var9, -1);
                    break L3;
                  }
                  vh.a(-1, (byte) -27);
                  tb.field_f = dk.field_f;
                  break L2;
                }
              }
              L9: {
                if (tb.field_f != dk.field_f) {
                  break L9;
                } else {
                  if (tk.a(82, 1)) {
                    L10: {
                      L11: {
                        var9 = tk.field_h.i(-115);
                        tk.field_h.field_l = 0;
                        if (var9 < 100) {
                          break L11;
                        } else {
                          if (var9 <= 105) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (var9 != 248) {
                        L12: {
                          if (var9 == 99) {
                            break L12;
                          } else {
                            sb.field_sb = -1;
                            tb.field_f = ii.field_P;
                            wg.field_B = var9;
                            if (var13 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        boolean discarded$1 = tk.a(50, lg.a((byte) -122));
                        uc.field_b = new Boolean(fi.a(param5 + 68, (p) (Object) tk.field_h));
                        tk.field_h.field_l = 0;
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        bo.a(bh.i(81), (byte) -12);
                        n.field_c = rb.field_d;
                        si.d(param5 + 65350);
                        ja.field_f = false;
                        stackOut_48_0 = var9;
                        stackIn_49_0 = stackOut_48_0;
                        return stackIn_49_0;
                      }
                    }
                    sa.field_b = new String[-100 + var9];
                    tb.field_f = vf.field_a;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L13: {
                if (vf.field_a == tb.field_f) {
                  var9 = 2;
                  if (tk.a(param5 + 103, var9)) {
                    var10 = tk.field_h.f(674914976);
                    tk.field_h.field_l = 0;
                    if (tk.a(-122, var10)) {
                      var11 = sa.field_b.length;
                      var12 = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (var12 >= var11) {
                              break L16;
                            } else {
                              sa.field_b[var12] = tk.field_h.d(false);
                              var12++;
                              if (var13 != 0) {
                                break L15;
                              } else {
                                if (var13 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          si.d(65280);
                          ja.field_f = false;
                          break L15;
                        }
                        stackOut_75_0 = var11 + 100;
                        stackIn_76_0 = stackOut_75_0;
                        return stackIn_76_0;
                      }
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L17: {
                if (ii.field_P == tb.field_f) {
                  if (jl.a(false)) {
                    L18: {
                      L19: {
                        if (wg.field_B == 255) {
                          break L19;
                        } else {
                          n.field_c = tk.field_h.d(0);
                          if (var13 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var9_ref_String = tk.field_h.b(true);
                      if (null == var9_ref_String) {
                        break L18;
                      } else {
                        aa.a(bh.i(81), -1, var9_ref_String);
                        break L18;
                      }
                    }
                    si.d(65280);
                    ja.field_f = false;
                    stackOut_90_0 = wg.field_B;
                    stackIn_91_0 = stackOut_90_0;
                    return stackIn_91_0;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L20: {
                if (null != lj.field_a) {
                  break L20;
                } else {
                  if (!ja.field_f) {
                    var9 = qh.field_a;
                    qh.field_a = bk.field_n;
                    bk.field_n = var9;
                    ja.field_f = true;
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        if (ea.i((byte) -121) <= 30000L) {
                          break L22;
                        } else {
                          n.field_c = nc.field_Q;
                          if (var13 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      n.field_c = li.field_b;
                      break L21;
                    }
                    ja.field_f = false;
                    stackOut_104_0 = 249;
                    stackIn_105_0 = stackOut_104_0;
                    return stackIn_105_0;
                  }
                }
              }
              stackOut_107_0 = -1;
              stackIn_108_0 = stackOut_107_0;
              break L0;
            } else {
              stackOut_2_0 = 6;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var7;
            stackOut_109_1 = new StringBuilder().append("da.N(").append(param0).append(',');
            stackIn_112_0 = stackOut_109_0;
            stackIn_112_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param1 == null) {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L23;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_113_0 = stackOut_110_0;
              stackIn_113_1 = stackOut_110_1;
              stackIn_113_2 = stackOut_110_2;
              break L23;
            }
          }
          L24: {
            stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
            stackOut_113_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_113_2).append(',');
            stackIn_116_0 = stackOut_113_0;
            stackIn_116_1 = stackOut_113_1;
            stackIn_114_0 = stackOut_113_0;
            stackIn_114_1 = stackOut_113_1;
            if (param2 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L24;
            } else {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "{...}";
              stackIn_117_0 = stackOut_114_0;
              stackIn_117_1 = stackOut_114_1;
              stackIn_117_2 = stackOut_114_2;
              break L24;
            }
          }
          L25: {
            stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');
            stackIn_120_0 = stackOut_117_0;
            stackIn_120_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param3 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L25;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_121_0 = stackOut_118_0;
              stackIn_121_1 = stackOut_118_1;
              stackIn_121_2 = stackOut_118_2;
              break L25;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_108_0;
    }

    final byte[] c(int param0, int param1) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, (byte) 51);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param1 == 1) {
                var4 = var3.a(false);
                var3.c(-2193);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3_ref, "da.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final lj b(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lj stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_53_0 = null;
        lj stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_38_0 = null;
        lj stackOut_60_0 = null;
        Object stackOut_21_0 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (null != ((da) this).field_n) {
              stackOut_4_0 = ((da) this).field_n;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null == ((da) this).field_q) {
                  if (((da) this).field_s.a(true)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (lj) (Object) stackIn_13_0;
                  } else {
                    ((da) this).field_q = (ab) (Object) ((da) this).field_s.a(107, 255, (byte) 0, true, ((da) this).field_v);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (((da) this).field_q.field_s) {
                stackOut_18_0 = null;
                stackIn_19_0 = stackOut_18_0;
                return (lj) (Object) stackIn_19_0;
              } else {
                if (param0 >= 18) {
                  L2: {
                    var2_array = ((da) this).field_q.a(false);
                    if (!(((da) this).field_q instanceof tc)) {
                      try {
                        L3: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((da) this).field_n = new lj(var2_array, ((da) this).field_l, ((da) this).field_u);
                            break L3;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          L5: {
                            var3 = decompiledCaughtException;
                            ((da) this).field_s.c(0);
                            ((da) this).field_n = null;
                            if (((da) this).field_s.a(true)) {
                              break L5;
                            } else {
                              ((da) this).field_q = (ab) (Object) ((da) this).field_s.a(109, 255, (byte) 0, true, ((da) this).field_v);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((da) this).field_q = null;
                          break L4;
                        }
                        stackOut_52_0 = null;
                        stackIn_53_0 = stackOut_52_0;
                        return (lj) (Object) stackIn_53_0;
                      }
                      if (null == ((da) this).field_h) {
                        break L2;
                      } else {
                        tc discarded$1 = ((da) this).field_f.a(var2_array, ((da) this).field_v, 2, ((da) this).field_h);
                        break L2;
                      }
                    } else {
                      try {
                        L6: {
                          if (var2_array == null) {
                            throw new RuntimeException();
                          } else {
                            ((da) this).field_n = new lj(var2_array, ((da) this).field_l, ((da) this).field_u);
                            if (~((da) this).field_n.field_s == ~((da) this).field_g) {
                              break L6;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L7: {
                          L8: {
                            var3 = decompiledCaughtException;
                            ((da) this).field_n = null;
                            if (!((da) this).field_s.a(true)) {
                              break L8;
                            } else {
                              ((da) this).field_q = null;
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ((da) this).field_q = (ab) (Object) ((da) this).field_s.a(115, 255, (byte) 0, true, ((da) this).field_v);
                          break L7;
                        }
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        return (lj) (Object) stackIn_39_0;
                      }
                      break L2;
                    }
                  }
                  L9: {
                    if (null == ((da) this).field_z) {
                      break L9;
                    } else {
                      ((da) this).field_E = new byte[((da) this).field_n.field_g];
                      break L9;
                    }
                  }
                  ((da) this).field_q = null;
                  stackOut_60_0 = ((da) this).field_n;
                  stackIn_61_0 = stackOut_60_0;
                  break L0;
                } else {
                  stackOut_21_0 = null;
                  stackIn_22_0 = stackOut_21_0;
                  return (lj) (Object) stackIn_22_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "da.F(" + param0 + ')');
        }
        return stackIn_61_0;
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
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("da.I(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        o var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (((da) this).field_t == null) {
              return;
            } else {
              if (((da) this).b(95) == null) {
                return;
              } else {
                L1: {
                  if (param0 == 12460) {
                    break L1;
                  } else {
                    ci discarded$3 = da.b((byte) 56);
                    break L1;
                  }
                }
                var2_ref = ((da) this).field_i.g(-18110);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((da) this).field_n.field_g) {
                                    break L7;
                                  } else {
                                    if (((da) this).field_n.field_l[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(param0 ^ -14397);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((da) this).field_E[var3] != 0) {
                                break L8;
                              } else {
                                ab discarded$4 = this.a(var3, 1, (byte) 74);
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 != ((da) this).field_E[var3]) {
                                break L9;
                              } else {
                                ab discarded$5 = this.a(var3, 2, (byte) 89);
                                break L9;
                              }
                            }
                            if (((da) this).field_E[var3] == 1) {
                              var2_ref.c(-2193);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((da) this).field_i.a((byte) -127);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "da.B(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((da) this).field_z != null) {
              L1: {
                ((da) this).field_x = true;
                if (param0 == 108) {
                  break L1;
                } else {
                  ((da) this).field_g = -13;
                  break L1;
                }
              }
              L2: {
                if (((da) this).field_t == null) {
                  ((da) this).field_t = new jc();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "da.P(" + param0 + ')');
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
              stackOut_3_0 = (String) param0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              stackOut_5_0 = param1 + " - " + param2.a((byte) -108) + "%";
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("da.H(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final ab a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_64_0 = null;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        Object stackIn_98_0 = null;
        int stackIn_103_0 = 0;
        byte stackIn_103_1 = 0;
        Object stackIn_111_0 = null;
        byte stackIn_131_0 = 0;
        byte stackIn_131_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        Object stackIn_150_0 = null;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_56_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_63_0 = null;
        byte stackOut_130_0 = 0;
        byte stackOut_130_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        Object stackOut_149_0 = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        Object stackOut_97_0 = null;
        int stackOut_102_0 = 0;
        byte stackOut_102_1 = 0;
        Object stackOut_110_0 = null;
        Object stackOut_158_0 = null;
        var10 = Chess.field_G;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (ab) (Object) ((da) this).field_j.a(-127, (long)param0);
              if (param2 >= 50) {
                break L0;
              } else {
                ((da) this).field_o = -55L;
                break L0;
              }
            }
            L1: {
              if (null == var4) {
                break L1;
              } else {
                if (0 != param1) {
                  break L1;
                } else {
                  if (((ab) var4).field_u) {
                    break L1;
                  } else {
                    if (((ab) var4).field_s) {
                      ((ab) var4).c(-2193);
                      var4 = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  if (0 == param1) {
                    L4: {
                      if (((da) this).field_z == null) {
                        break L4;
                      } else {
                        if (((da) this).field_E[param0] != -1) {
                          var4 = (Object) (Object) ((da) this).field_f.a((byte) -111, param0, ((da) this).field_z);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((da) this).field_s.a(true)) {
                        break L5;
                      } else {
                        var4 = (Object) (Object) ((da) this).field_s.a(113, ((da) this).field_v, (byte) 2, true, param0);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_56_0 = null;
                    stackIn_57_0 = stackOut_56_0;
                    return (ab) (Object) stackIn_57_0;
                  } else {
                    L6: {
                      if (param1 != 1) {
                        break L6;
                      } else {
                        if (null != ((da) this).field_z) {
                          var4 = (Object) (Object) ((da) this).field_f.a(((da) this).field_z, param0, (byte) -45);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    if (2 != param1) {
                      throw new RuntimeException();
                    } else {
                      if (null == ((da) this).field_z) {
                        throw new RuntimeException();
                      } else {
                        if (((da) this).field_E[param0] != -1) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            if (((da) this).field_s.e(-21)) {
                              break L7;
                            } else {
                              var4 = (Object) (Object) ((da) this).field_s.a(88, ((da) this).field_v, (byte) 2, false, param0);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          }
                          stackOut_45_0 = null;
                          stackIn_46_0 = stackOut_45_0;
                          return (ab) (Object) stackIn_46_0;
                        }
                      }
                    }
                  }
                }
                ((da) this).field_j.a(-125, (long)param0, (o) var4);
                break L2;
              } else {
                break L2;
              }
            }
            if (((ab) var4).field_s) {
              stackOut_63_0 = null;
              stackIn_64_0 = stackOut_63_0;
              return (ab) (Object) stackIn_64_0;
            } else {
              var5 = ((ab) var4).a(false);
              if (var4 instanceof tc) {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (2 >= var5.length) {
                      break L8;
                    } else {
                      eh.field_O.reset();
                      eh.field_O.update(var5, 0, var5.length - 2);
                      var6_int = (int)eh.field_O.getValue();
                      if (~var6_int == ~((da) this).field_n.field_p[param0]) {
                        L9: {
                          L10: {
                            if (null == ((da) this).field_n.field_t) {
                              break L10;
                            } else {
                              if (((da) this).field_n.field_t[param0] != null) {
                                var7_ref_byte__ = ((da) this).field_n.field_t[param0];
                                var8 = kh.a(0, -2 + var5.length, (byte) -43, var5);
                                var9 = 0;
                                L11: while (true) {
                                  if (64 <= var9) {
                                    break L10;
                                  } else {
                                    stackOut_130_0 = var7_ref_byte__[var9];
                                    stackOut_130_1 = var8[var9];
                                    stackIn_138_0 = stackOut_130_0;
                                    stackIn_138_1 = stackOut_130_1;
                                    stackIn_131_0 = stackOut_130_0;
                                    stackIn_131_1 = stackOut_130_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_131_0 != stackIn_131_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_137_0 = (var5[var5.length - 2] & 255) << 8;
                          stackOut_137_1 = -(var5[-1 + var5.length] & 255);
                          stackIn_138_0 = stackOut_137_0;
                          stackIn_138_1 = stackOut_137_1;
                          break L9;
                        }
                        var7 = stackIn_138_0 - stackIn_138_1;
                        if (var7 == (65535 & ((da) this).field_n.field_b[param0])) {
                          L12: {
                            if (1 != ((da) this).field_E[param0]) {
                              L13: {
                                if (((da) this).field_E[param0] != 0) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((da) this).field_E[param0] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (((ab) var4).field_u) {
                              break L14;
                            } else {
                              ((ab) var4).c(-2193);
                              break L14;
                            }
                          }
                          stackOut_149_0 = var4;
                          stackIn_150_0 = stackOut_149_0;
                          return (ab) (Object) stackIn_150_0;
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
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          eh.field_O.reset();
                          eh.field_O.update(var5, 0, -2 + var5.length);
                          var6_int = (int)eh.field_O.getValue();
                          if (var6_int == ((da) this).field_n.field_p[param0]) {
                            L17: {
                              if (null == ((da) this).field_n.field_t) {
                                break L17;
                              } else {
                                if (null == ((da) this).field_n.field_t[param0]) {
                                  break L17;
                                } else {
                                  var7_ref_byte__ = ((da) this).field_n.field_t[param0];
                                  var8 = kh.a(0, var5.length - 2, (byte) 111, var5);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_81_0 = var8[var9];
                                      stackOut_81_1 = var7_ref_byte__[var9];
                                      stackIn_103_0 = stackOut_81_0;
                                      stackIn_103_1 = stackOut_81_1;
                                      stackIn_82_0 = stackOut_81_0;
                                      stackIn_82_1 = stackOut_81_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_82_0 == stackIn_82_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((da) this).field_s.field_g = 0;
                            ((da) this).field_s.field_c = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((da) this).field_s.c(0);
                    ((ab) var4).c(-2193);
                    if (((ab) var4).field_u) {
                      if (!((da) this).field_s.a(true)) {
                        var4 = (Object) (Object) ((da) this).field_s.a(118, ((da) this).field_v, (byte) 2, true, param0);
                        ((da) this).field_j.a(92, (long)param0, (o) var4);
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  stackOut_97_0 = null;
                  stackIn_98_0 = stackOut_97_0;
                  return (ab) (Object) stackIn_98_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[var5.length - 2] = (byte)(((da) this).field_n.field_b[param0] >>> 8);
                      var5[-1 + var5.length] = (byte)((da) this).field_n.field_b[param0];
                      if (null != ((da) this).field_z) {
                        tc discarded$1 = ((da) this).field_f.a(var5, param0, 2, ((da) this).field_z);
                        stackOut_102_0 = 1;
                        stackOut_102_1 = ((da) this).field_E[param0];
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (stackIn_103_0 != stackIn_103_1) {
                    ((da) this).field_E[param0] = (byte) 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (!((ab) var4).field_u) {
                    ((ab) var4).c(-2193);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                stackOut_110_0 = var4;
                stackIn_111_0 = stackOut_110_0;
                return (ab) (Object) stackIn_111_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((da) this).field_E[param0] = (byte) -1;
              ((ab) var4).c(-2193);
              if (((ab) var4).field_u) {
                if (!((da) this).field_s.a(true)) {
                  var4 = (Object) (Object) ((da) this).field_s.a(96, ((da) this).field_v, (byte) 2, true, param0);
                  ((da) this).field_j.a(-117, (long)param0, (o) var4);
                  break L23;
                } else {
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_158_0 = null;
            stackIn_159_0 = stackOut_158_0;
            return (ab) (Object) stackIn_159_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw fk.a((Throwable) var4, "da.K(" + param0 + ',' + param1 + ',' + param2 + ')');
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
              if (param0 < 0) {
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
          throw fk.a((Throwable) (Object) var2, "da.M(" + param0 + ',' + param1 + ')');
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
            throw fk.a((Throwable) (Object) runtimeException, "da.O(" + param0 + ')');
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
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
              return stackIn_5_0;
            } else {
              if (~param3 == param1) {
                var4_ref = param0[param2];
                if (null != var4_ref) {
                  stackOut_12_0 = ((Object) (Object) var4_ref).toString();
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  stackOut_10_0 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                var4_int = param2 + param3;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  L2: {
                    if (~var4_int >= ~var6_int) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          var7_ref_CharSequence = param0[var6_int];
                          if (null != var7_ref_CharSequence) {
                            break L4;
                          } else {
                            var5 += 4;
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L3;
                      }
                      var6_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6 = new StringBuilder(var5);
                  var7 = param2;
                  L5: while (true) {
                    L6: {
                      if (var4_int <= var7) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var8 = param0[var7];
                            if (var8 == null) {
                              break L8;
                            } else {
                              StringBuilder discarded$2 = var6.append(var8);
                              if (var9 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          StringBuilder discarded$3 = var6.append("null");
                          break L7;
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_31_0 = var6.toString();
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4;
            stackOut_33_1 = new StringBuilder().append("da.E(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_32_0;
    }

    final int b(int param0, int param1) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (ab) (Object) ((da) this).field_j.a(-121, (long)param1);
            if (null == var3) {
              var4 = -18 % ((-1 - param0) / 45);
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = var3.f(89);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3_ref, "da.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
          throw fk.a((Throwable) (Object) var1, "da.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ab var2_ref = null;
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((da) this).field_t == null) {
                  break L2;
                } else {
                  if (((da) this).b(param0 ^ 108) == null) {
                    return;
                  } else {
                    L3: {
                      if (!((da) this).field_k) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((da) this).field_t.g(-18110);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (null == var3) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_11_0 = -1;
                                stackOut_11_1 = ~((da) this).field_E[var4];
                                stackIn_23_0 = stackOut_11_0;
                                stackIn_23_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_23_0 <= stackIn_23_1) {
                                      break L5;
                                    } else {
                                      stackOut_24_0 = -1;
                                      stackOut_24_1 = ~((da) this).field_n.field_l[((da) this).field_r];
                                      stackIn_96_0 = stackOut_24_0;
                                      stackIn_96_1 = stackOut_24_1;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackOut_25_1 = stackIn_25_1;
                                        stackIn_27_0 = stackOut_25_0;
                                        stackIn_27_1 = stackOut_25_1;
                                        L8: {
                                          L9: {
                                            if (stackIn_27_0 != stackIn_27_1) {
                                              break L9;
                                            } else {
                                              ((da) this).field_r = ((da) this).field_r + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (((da) this).field_f.field_c >= 250) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (0 != ((da) this).field_E[((da) this).field_r]) {
                                              break L11;
                                            } else {
                                              ab discarded$4 = this.a(((da) this).field_r, 1, (byte) 86);
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 != ((da) this).field_E[((da) this).field_r]) {
                                              break L12;
                                            } else {
                                              var3 = new o();
                                              var3.field_e = (long)((da) this).field_r;
                                              ((da) this).field_t.a(var3, (byte) -49);
                                              var2_int = 0;
                                              break L12;
                                            }
                                          }
                                          ((da) this).field_r = ((da) this).field_r + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_22_0 = ~((da) this).field_r;
                                        stackOut_22_1 = ~((da) this).field_n.field_l.length;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_12_0 == stackIn_12_1) {
                                      ab discarded$5 = this.a(var4, 1, (byte) 67);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (0 != ((da) this).field_E[var4]) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.c(-2193);
                                    break L14;
                                  }
                                  var3 = ((da) this).field_t.a((byte) -114);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_22_0 = ~((da) this).field_r;
                              stackOut_22_1 = ~((da) this).field_n.field_l.length;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              if (stackIn_23_0 <= stackIn_23_1) {
                                break L5;
                              } else {
                                stackOut_24_0 = -1;
                                stackOut_24_1 = ~((da) this).field_n.field_l[((da) this).field_r];
                                stackIn_96_0 = stackOut_24_0;
                                stackIn_96_1 = stackOut_24_1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackIn_27_0 = stackOut_25_0;
                                  stackIn_27_1 = stackOut_25_1;
                                  L17: {
                                    if (stackIn_27_0 != stackIn_27_1) {
                                      break L17;
                                    } else {
                                      ((da) this).field_r = ((da) this).field_r + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (((da) this).field_f.field_c >= 250) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (0 != ((da) this).field_E[((da) this).field_r]) {
                                      break L19;
                                    } else {
                                      ab discarded$4 = this.a(((da) this).field_r, 1, (byte) 86);
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 != ((da) this).field_E[((da) this).field_r]) {
                                      break L20;
                                    } else {
                                      var3 = new o();
                                      var3.field_e = (long)((da) this).field_r;
                                      ((da) this).field_t.a(var3, (byte) -49);
                                      var2_int = 0;
                                      break L20;
                                    }
                                  }
                                  ((da) this).field_r = ((da) this).field_r + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var2_int == 0) {
                              break L21;
                            } else {
                              ((da) this).field_k = false;
                              ((da) this).field_r = 0;
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L22: {
                      if (!((da) this).field_x) {
                        break L22;
                      } else {
                        var2_int = 1;
                        var3 = ((da) this).field_t.g(param0 ^ -18112);
                        L23: while (true) {
                          L24: {
                            L25: {
                              if (var3 == null) {
                                break L25;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_54_0 = ~((da) this).field_E[var4];
                                stackOut_54_1 = -2;
                                stackIn_67_0 = stackOut_54_0;
                                stackIn_67_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (var5 != 0) {
                                  L26: while (true) {
                                    if (stackIn_67_0 >= stackIn_67_1) {
                                      break L24;
                                    } else {
                                      stackOut_68_0 = 0;
                                      stackOut_68_1 = ((da) this).field_n.field_l[((da) this).field_r];
                                      stackIn_96_0 = stackOut_68_0;
                                      stackIn_96_1 = stackOut_68_1;
                                      stackIn_69_0 = stackOut_68_0;
                                      stackIn_69_1 = stackOut_68_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_69_0 = stackIn_69_0;
                                        stackOut_69_1 = stackIn_69_1;
                                        stackIn_71_0 = stackOut_69_0;
                                        stackIn_71_1 = stackOut_69_1;
                                        L27: {
                                          L28: {
                                            if (stackIn_71_0 != stackIn_71_1) {
                                              break L28;
                                            } else {
                                              ((da) this).field_r = ((da) this).field_r + 1;
                                              if (var5 == 0) {
                                                break L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                          L29: {
                                            if (!((da) this).field_s.e(-21)) {
                                              break L29;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L24;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          L30: {
                                            if (((da) this).field_E[((da) this).field_r] != 1) {
                                              ab discarded$6 = this.a(((da) this).field_r, 2, (byte) 77);
                                              break L30;
                                            } else {
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            if (1 == ((da) this).field_E[((da) this).field_r]) {
                                              break L31;
                                            } else {
                                              var3 = new o();
                                              var3.field_e = (long)((da) this).field_r;
                                              ((da) this).field_t.a(var3, (byte) 108);
                                              var2_int = 0;
                                              break L31;
                                            }
                                          }
                                          ((da) this).field_r = ((da) this).field_r + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        stackOut_66_0 = ((da) this).field_r;
                                        stackOut_66_1 = ((da) this).field_n.field_l.length;
                                        stackIn_67_0 = stackOut_66_0;
                                        stackIn_67_1 = stackOut_66_1;
                                        continue L26;
                                      }
                                    }
                                  }
                                } else {
                                  L32: {
                                    if (stackIn_55_0 != stackIn_55_1) {
                                      ab discarded$7 = this.a(var4, 2, (byte) 54);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  L33: {
                                    L34: {
                                      if (((da) this).field_E[var4] != 1) {
                                        break L34;
                                      } else {
                                        var3.c(param0 ^ -2195);
                                        if (var5 == 0) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L33;
                                  }
                                  var3 = ((da) this).field_t.a((byte) -117);
                                  if (var5 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            L35: while (true) {
                              stackOut_66_0 = ((da) this).field_r;
                              stackOut_66_1 = ((da) this).field_n.field_l.length;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              if (stackIn_67_0 >= stackIn_67_1) {
                                break L24;
                              } else {
                                stackOut_68_0 = 0;
                                stackOut_68_1 = ((da) this).field_n.field_l[((da) this).field_r];
                                stackIn_96_0 = stackOut_68_0;
                                stackIn_96_1 = stackOut_68_1;
                                stackIn_69_0 = stackOut_68_0;
                                stackIn_69_1 = stackOut_68_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_69_0 = stackIn_69_0;
                                  stackOut_69_1 = stackIn_69_1;
                                  stackIn_71_0 = stackOut_69_0;
                                  stackIn_71_1 = stackOut_69_1;
                                  L36: {
                                    if (stackIn_71_0 != stackIn_71_1) {
                                      break L36;
                                    } else {
                                      ((da) this).field_r = ((da) this).field_r + 1;
                                      if (var5 == 0) {
                                        continue L35;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  L37: {
                                    if (!((da) this).field_s.e(-21)) {
                                      break L37;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L24;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  L38: {
                                    if (((da) this).field_E[((da) this).field_r] != 1) {
                                      ab discarded$6 = this.a(((da) this).field_r, 2, (byte) 77);
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (1 == ((da) this).field_E[((da) this).field_r]) {
                                      break L39;
                                    } else {
                                      var3 = new o();
                                      var3.field_e = (long)((da) this).field_r;
                                      ((da) this).field_t.a(var3, (byte) 108);
                                      var2_int = 0;
                                      break L39;
                                    }
                                  }
                                  ((da) this).field_r = ((da) this).field_r + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            if (var2_int != 0) {
                              ((da) this).field_x = false;
                              ((da) this).field_r = 0;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    ((da) this).field_t = null;
                    break L2;
                  }
                }
              }
              stackOut_95_0 = param0;
              stackOut_95_1 = 2;
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              break L1;
            }
            L41: {
              if (stackIn_96_0 == stackIn_96_1) {
                break L41;
              } else {
                ((da) this).a((byte) 1);
                break L41;
              }
            }
            L42: {
              if (!((da) this).field_D) {
                break L42;
              } else {
                if (ud.a(2) < ((da) this).field_o) {
                  break L42;
                } else {
                  var2_ref = (ab) (Object) ((da) this).field_j.a(true);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            L46: {
                              if (!var2_ref.field_s) {
                                break L46;
                              } else {
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              if (var2_ref.field_q) {
                                break L47;
                              } else {
                                var2_ref.field_q = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (var2_ref.field_u) {
                              var2_ref.c(-2193);
                              break L45;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                          var2_ref = (ab) (Object) ((da) this).field_j.b((byte) 124);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((da) this).field_o = ud.a(2) - -1000L;
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "da.A(" + param0 + ')');
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
              ja.a(param0.field_Yb, param0.field_Lb, (byte) -122, param5, -1, (ci) (Object) param0, (int[]) null, -1, param0.field_Rb);
              pi.field_d.a(0, true);
              pi.field_d.a(17, (int[]) null, 0);
              pi.field_d.d(-32);
              if (!param6) {
                break L1;
              } else {
                field_C = null;
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
            stackOut_5_0 = (RuntimeException) var7_ref;
            stackOut_5_1 = new StringBuilder().append("da.L(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param6 + ')');
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
        ((da) this).field_j = new kl(16);
        ((da) this).field_r = 0;
        ((da) this).field_i = new jc();
        ((da) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((da) this).field_z = param1;
                ((da) this).field_v = param0;
                if (null != ((da) this).field_z) {
                  break L2;
                } else {
                  ((da) this).field_k = false;
                  if (Chess.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((da) this).field_k = true;
              ((da) this).field_t = new jc();
              break L1;
            }
            L3: {
              ((da) this).field_f = param4;
              ((da) this).field_D = param8;
              ((da) this).field_s = param3;
              ((da) this).field_h = param2;
              ((da) this).field_g = param7;
              ((da) this).field_u = param6;
              ((da) this).field_l = param5;
              if (null == ((da) this).field_h) {
                break L3;
              } else {
                ((da) this).field_q = (ab) (Object) ((da) this).field_f.a((byte) -111, ((da) this).field_v, ((da) this).field_h);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("da.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_m = new String[]{"Royalty", "Defender", "Quick Mover", "Safe Mover", "Pacifist", "Newcomer", "Challenger", "Victor", "Champion", "Master", "Samhain Sovereign"};
        field_p = -1;
        field_A = new String[16];
    }
}
