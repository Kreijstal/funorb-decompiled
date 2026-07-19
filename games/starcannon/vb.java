/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends qf {
    static hl field_l;
    private fe field_n;
    static rk field_k;
    static int field_m;
    static String field_j;

    final String a(String param0, boolean param1) {
        he var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_15_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_18_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (!(this.field_n instanceof ub)) {
                  break L1;
                } else {
                  var3 = ((ub) ((Object) this.field_n)).a(false);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.b((byte) 12) != bf.field_x) {
                        break L2;
                      } else {
                        if (!param0.equals(this.field_n.field_k)) {
                          stackOut_13_0 = qb.field_d;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_15_0 = var3.a(26162);
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              if (param0.equals(this.field_n.field_k)) {
                stackOut_20_0 = null;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                stackOut_18_0 = qb.field_d;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3_ref);
            stackOut_22_1 = new StringBuilder().append("vb.A(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return (String) ((Object) stackIn_21_0);
              }
            }
          }
        }
    }

    vb(fe param0, fe param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            this.field_n = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vb.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(ue param0, int param1) {
        String discarded$19 = null;
        String discarded$20 = null;
        String discarded$21 = null;
        String discarded$22 = null;
        String discarded$23 = null;
        String discarded$24 = null;
        String discarded$25 = null;
        String discarded$26 = null;
        String discarded$27 = null;
        String discarded$28 = null;
        String discarded$29 = null;
        String discarded$30 = null;
        String discarded$31 = null;
        String discarded$32 = null;
        String discarded$33 = null;
        String discarded$34 = null;
        String discarded$35 = null;
        String discarded$36 = null;
        String discarded$37 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        RuntimeException stackIn_371_0 = null;
        StringBuilder stackIn_371_1 = null;
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        String stackIn_374_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_370_0 = null;
        StringBuilder stackOut_370_1 = null;
        RuntimeException stackOut_373_0 = null;
        StringBuilder stackOut_373_1 = null;
        String stackOut_373_2 = null;
        RuntimeException stackOut_371_0 = null;
        StringBuilder stackOut_371_1 = null;
        String stackOut_371_2 = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              ri.field_c = param0;
              var2_array = cb.a("gamename", (byte) -124);
              if (null != var2_array) {
                wc.field_g = uh.a(121, var2_array);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2_array = cb.a("achievement_names,0", (byte) -124);
              if (null != var2_array) {
                di.field_j[0] = uh.a(127, var2_array);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_array = cb.a("achievement_names,1", (byte) -124);
              if (var2_array != null) {
                di.field_j[1] = uh.a(dg.a(param1, 30856), var2_array);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2_array = cb.a("achievement_names,2", (byte) -124);
              if (null != var2_array) {
                di.field_j[2] = uh.a(126, var2_array);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2_array = cb.a("achievement_names,3", (byte) -124);
              if (var2_array == null) {
                break L5;
              } else {
                di.field_j[3] = uh.a(dg.a(param1, 30858), var2_array);
                break L5;
              }
            }
            L6: {
              var2_array = cb.a("achievement_names,4", (byte) -124);
              if (var2_array == null) {
                break L6;
              } else {
                di.field_j[4] = uh.a(120, var2_array);
                break L6;
              }
            }
            L7: {
              var2_array = cb.a("achievement_names,5", (byte) -124);
              if (null == var2_array) {
                break L7;
              } else {
                di.field_j[5] = uh.a(115, var2_array);
                break L7;
              }
            }
            L8: {
              var2_array = cb.a("achievement_names,6", (byte) -124);
              if (var2_array == null) {
                break L8;
              } else {
                di.field_j[6] = uh.a(param1 + -30835, var2_array);
                break L8;
              }
            }
            L9: {
              var2_array = cb.a("achievement_names,7", (byte) -124);
              if (var2_array != null) {
                di.field_j[7] = uh.a(param1 + -30850, var2_array);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2_array = cb.a("achievement_names,8", (byte) -124);
              if (var2_array != null) {
                di.field_j[8] = uh.a(113, var2_array);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2_array = cb.a("achievement_names,9", (byte) -124);
              if (var2_array == null) {
                break L11;
              } else {
                di.field_j[9] = uh.a(121, var2_array);
                break L11;
              }
            }
            L12: {
              var2_array = cb.a("achievement_names,10", (byte) -124);
              if (var2_array == null) {
                break L12;
              } else {
                di.field_j[10] = uh.a(122, var2_array);
                break L12;
              }
            }
            L13: {
              var2_array = cb.a("achievement_names,11", (byte) -124);
              if (var2_array != null) {
                di.field_j[11] = uh.a(126, var2_array);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2_array = cb.a("achievement_names,12", (byte) -124);
              if (null != var2_array) {
                di.field_j[12] = uh.a(123, var2_array);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2_array = cb.a("achievement_names,13", (byte) -124);
              if (var2_array != null) {
                di.field_j[13] = uh.a(120, var2_array);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2_array = cb.a("achievement_names,14", (byte) -124);
              if (var2_array == null) {
                break L16;
              } else {
                di.field_j[14] = uh.a(120, var2_array);
                break L16;
              }
            }
            L17: {
              var2_array = cb.a("achievement_criteria,0", (byte) -124);
              if (null == var2_array) {
                break L17;
              } else {
                vd.field_h[0] = uh.a(116, var2_array);
                break L17;
              }
            }
            L18: {
              var2_array = cb.a("achievement_criteria,1", (byte) -124);
              if (null == var2_array) {
                break L18;
              } else {
                vd.field_h[1] = uh.a(dg.a(param1, 30850), var2_array);
                break L18;
              }
            }
            L19: {
              var2_array = cb.a("achievement_criteria,2", (byte) -124);
              if (null == var2_array) {
                break L19;
              } else {
                vd.field_h[2] = uh.a(123, var2_array);
                break L19;
              }
            }
            L20: {
              var2_array = cb.a("achievement_criteria,3", (byte) -124);
              if (var2_array == null) {
                break L20;
              } else {
                vd.field_h[3] = uh.a(dg.a(param1, 30850), var2_array);
                break L20;
              }
            }
            L21: {
              var2_array = cb.a("achievement_criteria,4", (byte) -124);
              if (var2_array != null) {
                vd.field_h[4] = uh.a(120, var2_array);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2_array = cb.a("achievement_criteria,5", (byte) -124);
              if (var2_array != null) {
                vd.field_h[5] = uh.a(120, var2_array);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2_array = cb.a("achievement_criteria,6", (byte) -124);
              if (var2_array == null) {
                break L23;
              } else {
                vd.field_h[6] = uh.a(param1 + -30843, var2_array);
                break L23;
              }
            }
            L24: {
              var2_array = cb.a("achievement_criteria,7", (byte) -124);
              if (null == var2_array) {
                break L24;
              } else {
                vd.field_h[7] = uh.a(116, var2_array);
                break L24;
              }
            }
            L25: {
              var2_array = cb.a("achievement_criteria,8", (byte) -124);
              if (var2_array != null) {
                vd.field_h[8] = uh.a(117, var2_array);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2_array = cb.a("achievement_criteria,9", (byte) -124);
              if (null != var2_array) {
                vd.field_h[9] = uh.a(127, var2_array);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2_array = cb.a("achievement_criteria,10", (byte) -124);
              if (var2_array == null) {
                break L27;
              } else {
                vd.field_h[10] = uh.a(param1 + -30840, var2_array);
                break L27;
              }
            }
            L28: {
              var2_array = cb.a("achievement_criteria,11", (byte) -124);
              if (null == var2_array) {
                break L28;
              } else {
                vd.field_h[11] = uh.a(120, var2_array);
                break L28;
              }
            }
            L29: {
              var2_array = cb.a("achievement_criteria,12", (byte) -124);
              if (var2_array != null) {
                vd.field_h[12] = uh.a(117, var2_array);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2_array = cb.a("achievement_criteria,13", (byte) -124);
              if (var2_array == null) {
                break L30;
              } else {
                vd.field_h[13] = uh.a(123, var2_array);
                break L30;
              }
            }
            L31: {
              var2_array = cb.a("achievement_criteria,14", (byte) -124);
              if (var2_array != null) {
                vd.field_h[14] = uh.a(121, var2_array);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2_array = cb.a("optionscaps", (byte) -124);
              if (null == var2_array) {
                break L32;
              } else {
                discarded$19 = uh.a(param1 ^ 30861, var2_array);
                break L32;
              }
            }
            L33: {
              var2_array = cb.a("bosshealthcaps", (byte) -124);
              if (var2_array != null) {
                s.field_h = uh.a(112, var2_array);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2_array = cb.a("lev7a", (byte) -124);
              if (var2_array != null) {
                jg.field_I = uh.a(127, var2_array);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2_array = cb.a("lev6c", (byte) -124);
              if (var2_array == null) {
                break L35;
              } else {
                eh.field_c = uh.a(117, var2_array);
                break L35;
              }
            }
            L36: {
              var2_array = cb.a("lev6b", (byte) -124);
              if (var2_array != null) {
                jf.field_b = uh.a(122, var2_array);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2_array = cb.a("lev6a", (byte) -124);
              if (var2_array == null) {
                break L37;
              } else {
                d.field_n = uh.a(126, var2_array);
                break L37;
              }
            }
            L38: {
              var2_array = cb.a("lev5b", (byte) -124);
              if (var2_array == null) {
                break L38;
              } else {
                sb.field_o = uh.a(112, var2_array);
                break L38;
              }
            }
            L39: {
              var2_array = cb.a("lev5a", (byte) -124);
              if (var2_array != null) {
                bc.field_l = uh.a(126, var2_array);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2_array = cb.a("lev4a", (byte) -124);
              if (null != var2_array) {
                vf.field_a = uh.a(param1 ^ 30860, var2_array);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2_array = cb.a("lev3a", (byte) -124);
              if (null == var2_array) {
                break L41;
              } else {
                qc.field_a = uh.a(121, var2_array);
                break L41;
              }
            }
            L42: {
              var2_array = cb.a("lev2a", (byte) -124);
              if (null == var2_array) {
                break L42;
              } else {
                ig.field_c = uh.a(123, var2_array);
                break L42;
              }
            }
            L43: {
              var2_array = cb.a("lev1", (byte) -124);
              if (null == var2_array) {
                break L43;
              } else {
                eg.field_i = uh.a(114, var2_array);
                break L43;
              }
            }
            L44: {
              var2_array = cb.a("spacetofire", (byte) -124);
              if (null != var2_array) {
                discarded$20 = uh.a(120, var2_array);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2_array = cb.a("escforopts", (byte) -124);
              if (null != var2_array) {
                discarded$21 = uh.a(112, var2_array);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2_array = cb.a("scorecapscolon", (byte) -124);
              if (null == var2_array) {
                break L46;
              } else {
                rd.field_o = uh.a(112, var2_array);
                break L46;
              }
            }
            L47: {
              var2_array = cb.a("collecttopowerup", (byte) -124);
              if (null == var2_array) {
                break L47;
              } else {
                p.field_e = uh.a(param1 + -30845, var2_array);
                break L47;
              }
            }
            L48: {
              var2_array = cb.a("lancepower", (byte) -124);
              if (var2_array == null) {
                break L48;
              } else {
                ve.field_g = uh.a(114, var2_array);
                break L48;
              }
            }
            L49: {
              var2_array = cb.a("helixpower", (byte) -124);
              if (null == var2_array) {
                break L49;
              } else {
                b.field_d = uh.a(param1 + -30838, var2_array);
                break L49;
              }
            }
            L50: {
              var2_array = cb.a("pulsepower", (byte) -124);
              if (null == var2_array) {
                break L50;
              } else {
                be.field_b = uh.a(119, var2_array);
                break L50;
              }
            }
            L51: {
              var2_array = cb.a("livescapscolon", (byte) -124);
              if (var2_array != null) {
                vk.field_w = uh.a(param1 + -30842, var2_array);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2_array = cb.a("atgcaps", (byte) -124);
              if (null != var2_array) {
                discarded$22 = uh.a(115, var2_array);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2_array = cb.a("levhard", (byte) -124);
              if (null != var2_array) {
                hg.field_D = uh.a(127, var2_array);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2_array = cb.a("levmedium", (byte) -124);
              if (var2_array != null) {
                fl.field_g = uh.a(120, var2_array);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2_array = cb.a("leveasy", (byte) -124);
              if (null != var2_array) {
                cf.field_k = uh.a(param1 + -30847, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = cb.a("fsoff", (byte) -124);
              if (var2_array == null) {
                break L56;
              } else {
                discarded$23 = uh.a(126, var2_array);
                break L56;
              }
            }
            L57: {
              var2_array = cb.a("fson", (byte) -124);
              if (var2_array == null) {
                break L57;
              } else {
                discarded$24 = uh.a(114, var2_array);
                break L57;
              }
            }
            L58: {
              var2_array = cb.a("gfxhigh", (byte) -124);
              if (null != var2_array) {
                gh.field_A = uh.a(120, var2_array);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2_array = cb.a("gfxmed", (byte) -124);
              if (var2_array != null) {
                fd.field_d = uh.a(param1 + -30850, var2_array);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2_array = cb.a("gfxlow", (byte) -124);
              if (var2_array != null) {
                ec.field_d = uh.a(121, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = cb.a("maxpowtext", (byte) -124);
              if (var2_array != null) {
                ab.field_B = uh.a(param1 ^ 30855, var2_array);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2_array = cb.a("sideguntext", (byte) -124);
              if (null == var2_array) {
                break L62;
              } else {
                ra.field_y = uh.a(124, var2_array);
                break L62;
              }
            }
            L63: {
              var2_array = cb.a("backguntext", (byte) -124);
              if (null != var2_array) {
                oi.field_i = uh.a(119, var2_array);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2_array = cb.a("shieldtext", (byte) -124);
              if (null != var2_array) {
                t.field_x = uh.a(113, var2_array);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2_array = cb.a("enginetext", (byte) -124);
              if (var2_array != null) {
                hb.field_g = uh.a(126, var2_array);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2_array = cb.a("powerup2of2", (byte) -124);
              if (var2_array != null) {
                di.field_k = uh.a(120, var2_array);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2_array = cb.a("collecttext", (byte) -124);
              if (var2_array != null) {
                la.field_a = uh.a(117, var2_array);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2_array = cb.a("lifetext", (byte) -124);
              if (null != var2_array) {
                a.field_c = uh.a(126, var2_array);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2_array = cb.a("lancetext", (byte) -124);
              if (var2_array != null) {
                mg.field_k = uh.a(118, var2_array);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2_array = cb.a("helixtext", (byte) -124);
              if (null != var2_array) {
                mc.field_i = uh.a(120, var2_array);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2_array = cb.a("pulsetext", (byte) -124);
              if (var2_array != null) {
                gf.field_e = uh.a(123, var2_array);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2_array = cb.a("powerup1of2", (byte) -124);
              if (null != var2_array) {
                vc.field_k = uh.a(127, var2_array);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2_array = cb.a("con7", (byte) -124);
              if (null != var2_array) {
                eb.field_e = uh.a(127, var2_array);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2_array = cb.a("con6", (byte) -124);
              if (var2_array != null) {
                p.field_b = uh.a(114, var2_array);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2_array = cb.a("con5", (byte) -124);
              if (var2_array != null) {
                cc.field_k = uh.a(119, var2_array);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2_array = cb.a("con4", (byte) -124);
              if (null == var2_array) {
                break L76;
              } else {
                qd.field_y = uh.a(param1 + -30843, var2_array);
                break L76;
              }
            }
            L77: {
              var2_array = cb.a("con3", (byte) -124);
              if (null == var2_array) {
                break L77;
              } else {
                ac.field_c = uh.a(120, var2_array);
                break L77;
              }
            }
            L78: {
              var2_array = cb.a("con2", (byte) -124);
              if (null == var2_array) {
                break L78;
              } else {
                fi.field_a = uh.a(112, var2_array);
                break L78;
              }
            }
            L79: {
              var2_array = cb.a("con1", (byte) -124);
              if (null == var2_array) {
                break L79;
              } else {
                s.field_a = uh.a(param1 + -30840, var2_array);
                break L79;
              }
            }
            L80: {
              var2_array = cb.a("controlcaps", (byte) -124);
              if (null == var2_array) {
                break L80;
              } else {
                tc.field_y = uh.a(param1 ^ 30860, var2_array);
                break L80;
              }
            }
            L81: {
              var2_array = cb.a("storytext", (byte) -124);
              if (var2_array == null) {
                break L81;
              } else {
                ff.field_p = uh.a(123, var2_array);
                break L81;
              }
            }
            L82: {
              var2_array = cb.a("storycaps", (byte) -124);
              if (null == var2_array) {
                break L82;
              } else {
                sb.field_p = uh.a(117, var2_array);
                break L82;
              }
            }
            L83: {
              var2_array = cb.a("nextcaps", (byte) -124);
              if (null == var2_array) {
                break L83;
              } else {
                discarded$25 = uh.a(127, var2_array);
                break L83;
              }
            }
            L84: {
              var2_array = cb.a("prevcaps", (byte) -124);
              if (null != var2_array) {
                discarded$26 = uh.a(param1 ^ 30853, var2_array);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2_array = cb.a("pageno", (byte) -124);
              if (null != var2_array) {
                ui.field_t = uh.a(120, var2_array);
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              var2_array = cb.a("instrcaps", (byte) -124);
              if (null != var2_array) {
                discarded$27 = uh.a(114, var2_array);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2_array = cb.a("hsunavail", (byte) -124);
              if (null == var2_array) {
                break L87;
              } else {
                discarded$28 = uh.a(115, var2_array);
                break L87;
              }
            }
            L88: {
              var2_array = cb.a("waitforhs", (byte) -124);
              if (null == var2_array) {
                break L88;
              } else {
                discarded$29 = uh.a(127, var2_array);
                break L88;
              }
            }
            L89: {
              var2_array = cb.a("hardcaps", (byte) -124);
              if (var2_array == null) {
                break L89;
              } else {
                td.field_j = uh.a(118, var2_array);
                break L89;
              }
            }
            L90: {
              var2_array = cb.a("mediumcaps", (byte) -124);
              if (var2_array == null) {
                break L90;
              } else {
                lb.field_l = uh.a(116, var2_array);
                break L90;
              }
            }
            L91: {
              var2_array = cb.a("easycaps", (byte) -124);
              if (null != var2_array) {
                ta.field_a = uh.a(param1 ^ 30862, var2_array);
                break L91;
              } else {
                break L91;
              }
            }
            L92: {
              var2_array = cb.a("lastscorestring", (byte) -124);
              if (null == var2_array) {
                break L92;
              } else {
                discarded$30 = uh.a(120, var2_array);
                break L92;
              }
            }
            L93: {
              var2_array = cb.a("logincaps", (byte) -124);
              if (null != var2_array) {
                discarded$31 = uh.a(param1 + -30840, var2_array);
                break L93;
              } else {
                break L93;
              }
            }
            L94: {
              var2_array = cb.a("highscorescaps", (byte) -124);
              if (null == var2_array) {
                break L94;
              } else {
                discarded$32 = uh.a(113, var2_array);
                break L94;
              }
            }
            L95: {
              var2_array = cb.a("menucaps", (byte) -124);
              if (null == var2_array) {
                break L95;
              } else {
                discarded$33 = uh.a(123, var2_array);
                break L95;
              }
            }
            L96: {
              var2_array = cb.a("hiddenachievement", (byte) -124);
              if (null != var2_array) {
                discarded$34 = uh.a(127, var2_array);
                break L96;
              } else {
                break L96;
              }
            }
            L97: {
              var2_array = cb.a("achievementscaps", (byte) -124);
              if (var2_array != null) {
                discarded$35 = uh.a(param1 + -30850, var2_array);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2_array = cb.a("mainmenucaps", (byte) -124);
              if (null != var2_array) {
                discarded$36 = uh.a(param1 + -30842, var2_array);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              var2_array = cb.a("warninghardmode", (byte) -124);
              if (var2_array == null) {
                break L99;
              } else {
                discarded$37 = uh.a(param1 + -30836, var2_array);
                break L99;
              }
            }
            L100: {
              var2_array = cb.a("gameover", (byte) -124);
              if (var2_array != null) {
                ne.field_i = uh.a(127, var2_array);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2_array = cb.a("benefits,0", (byte) -124);
              if (param1 == 30962) {
                break L101;
              } else {
                field_j = (String) null;
                break L101;
              }
            }
            L102: {
              if (null != var2_array) {
                rj.field_l[0] = uh.a(114, var2_array);
                break L102;
              } else {
                break L102;
              }
            }
            L103: {
              var2_array = cb.a("benefits,1", (byte) -124);
              if (null != var2_array) {
                rj.field_l[1] = uh.a(121, var2_array);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2_array = cb.a("benefits,2", (byte) -124);
              if (null == var2_array) {
                break L104;
              } else {
                rj.field_l[2] = uh.a(125, var2_array);
                break L104;
              }
            }
            ri.field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L105: {
            var2 = decompiledCaughtException;
            stackOut_370_0 = (RuntimeException) (var2);
            stackOut_370_1 = new StringBuilder().append("vb.C(");
            stackIn_373_0 = stackOut_370_0;
            stackIn_373_1 = stackOut_370_1;
            stackIn_371_0 = stackOut_370_0;
            stackIn_371_1 = stackOut_370_1;
            if (param0 == null) {
              stackOut_373_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackOut_373_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackOut_373_2 = "null";
              stackIn_374_0 = stackOut_373_0;
              stackIn_374_1 = stackOut_373_1;
              stackIn_374_2 = stackOut_373_2;
              break L105;
            } else {
              stackOut_371_0 = (RuntimeException) ((Object) stackIn_371_0);
              stackOut_371_1 = (StringBuilder) ((Object) stackIn_371_1);
              stackOut_371_2 = "{...}";
              stackIn_374_0 = stackOut_371_0;
              stackIn_374_1 = stackOut_371_1;
              stackIn_374_2 = stackOut_371_2;
              break L105;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_374_0), stackIn_374_2 + ',' + param1 + ')');
        }
        L106: {
          if (!th.field_i) {
            break L106;
          } else {
            var3++;
            StarCannon.field_A = var3;
            break L106;
          }
        }
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_k = null;
              if (param0 >= 108) {
                break L1;
              } else {
                field_k = (rk) null;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "vb.M(" + param0 + ')');
        }
    }

    final p a(String param0, int param1) {
        RuntimeException var3 = null;
        he var3_ref = null;
        p stackIn_8_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        p stackOut_7_0 = null;
        p stackOut_15_0 = null;
        p stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_n instanceof ub) {
                var3_ref = ((ub) ((Object) this.field_n)).a(false);
                if (var3_ref == null) {
                  break L1;
                } else {
                  if (var3_ref.b((byte) -8) == bf.field_x) {
                    break L1;
                  } else {
                    stackOut_7_0 = sb.field_n;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -26188) {
                break L2;
              } else {
                vb.e((byte) 95);
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_n.field_k)) {
                stackOut_15_0 = sb.field_n;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_13_0 = bf.field_x;
                stackIn_16_0 = stackOut_13_0;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("vb.B(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_16_0;
        }
    }

    static {
        field_k = new rk();
        field_j = "Prev";
    }
}
