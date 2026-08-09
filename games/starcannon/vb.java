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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                          stackIn_14_0 = qb.field_d;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_16_0 = var3.a(26162);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              if (param0.equals(this.field_n.field_k)) {
                stackIn_21_0 = null;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                stackIn_19_0 = qb.field_d;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("vb.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_n = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("vb.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ')');
        }
    }

    final static void a(ue param0, int param1) {
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        String stackIn_374_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              ri.field_c = param0;
              var2 = cb.a("gamename", (byte) -124);
              if (null != var2) {
                wc.field_g = uh.a(121, var2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = cb.a("achievement_names,0", (byte) -124);
              if (null != var2) {
                di.field_j[0] = uh.a(127, var2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = cb.a("achievement_names,1", (byte) -124);
              if (var2 != null) {
                di.field_j[1] = uh.a(dg.a(param1, 30856), var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = cb.a("achievement_names,2", (byte) -124);
              if (null != var2) {
                di.field_j[2] = uh.a(126, var2);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2 = cb.a("achievement_names,3", (byte) -124);
              if (var2 == null) {
                break L5;
              } else {
                di.field_j[3] = uh.a(dg.a(param1, 30858), var2);
                break L5;
              }
            }
            L6: {
              var2 = cb.a("achievement_names,4", (byte) -124);
              if (var2 == null) {
                break L6;
              } else {
                di.field_j[4] = uh.a(120, var2);
                break L6;
              }
            }
            L7: {
              var2 = cb.a("achievement_names,5", (byte) -124);
              if (null == var2) {
                break L7;
              } else {
                di.field_j[5] = uh.a(115, var2);
                break L7;
              }
            }
            L8: {
              var2 = cb.a("achievement_names,6", (byte) -124);
              if (var2 == null) {
                break L8;
              } else {
                di.field_j[6] = uh.a(param1 + -30835, var2);
                break L8;
              }
            }
            L9: {
              var2 = cb.a("achievement_names,7", (byte) -124);
              if (var2 != null) {
                di.field_j[7] = uh.a(param1 + -30850, var2);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2 = cb.a("achievement_names,8", (byte) -124);
              if (var2 != null) {
                di.field_j[8] = uh.a(113, var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2 = cb.a("achievement_names,9", (byte) -124);
              if (var2 == null) {
                break L11;
              } else {
                di.field_j[9] = uh.a(121, var2);
                break L11;
              }
            }
            L12: {
              var2 = cb.a("achievement_names,10", (byte) -124);
              if (var2 == null) {
                break L12;
              } else {
                di.field_j[10] = uh.a(122, var2);
                break L12;
              }
            }
            L13: {
              var2 = cb.a("achievement_names,11", (byte) -124);
              if (var2 != null) {
                di.field_j[11] = uh.a(126, var2);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = cb.a("achievement_names,12", (byte) -124);
              if (null != var2) {
                di.field_j[12] = uh.a(123, var2);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = cb.a("achievement_names,13", (byte) -124);
              if (var2 != null) {
                di.field_j[13] = uh.a(120, var2);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2 = cb.a("achievement_names,14", (byte) -124);
              if (var2 == null) {
                break L16;
              } else {
                di.field_j[14] = uh.a(120, var2);
                break L16;
              }
            }
            L17: {
              var2 = cb.a("achievement_criteria,0", (byte) -124);
              if (null == var2) {
                break L17;
              } else {
                vd.field_h[0] = uh.a(116, var2);
                break L17;
              }
            }
            L18: {
              var2 = cb.a("achievement_criteria,1", (byte) -124);
              if (null == var2) {
                break L18;
              } else {
                vd.field_h[1] = uh.a(dg.a(param1, 30850), var2);
                break L18;
              }
            }
            L19: {
              var2 = cb.a("achievement_criteria,2", (byte) -124);
              if (null == var2) {
                break L19;
              } else {
                vd.field_h[2] = uh.a(123, var2);
                break L19;
              }
            }
            L20: {
              var2 = cb.a("achievement_criteria,3", (byte) -124);
              if (var2 == null) {
                break L20;
              } else {
                vd.field_h[3] = uh.a(dg.a(param1, 30850), var2);
                break L20;
              }
            }
            L21: {
              var2 = cb.a("achievement_criteria,4", (byte) -124);
              if (var2 != null) {
                vd.field_h[4] = uh.a(120, var2);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2 = cb.a("achievement_criteria,5", (byte) -124);
              if (var2 != null) {
                vd.field_h[5] = uh.a(120, var2);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2 = cb.a("achievement_criteria,6", (byte) -124);
              if (var2 == null) {
                break L23;
              } else {
                vd.field_h[6] = uh.a(param1 + -30843, var2);
                break L23;
              }
            }
            L24: {
              var2 = cb.a("achievement_criteria,7", (byte) -124);
              if (null == var2) {
                break L24;
              } else {
                vd.field_h[7] = uh.a(116, var2);
                break L24;
              }
            }
            L25: {
              var2 = cb.a("achievement_criteria,8", (byte) -124);
              if (var2 != null) {
                vd.field_h[8] = uh.a(117, var2);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = cb.a("achievement_criteria,9", (byte) -124);
              if (null != var2) {
                vd.field_h[9] = uh.a(127, var2);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = cb.a("achievement_criteria,10", (byte) -124);
              if (var2 == null) {
                break L27;
              } else {
                vd.field_h[10] = uh.a(param1 + -30840, var2);
                break L27;
              }
            }
            L28: {
              var2 = cb.a("achievement_criteria,11", (byte) -124);
              if (null == var2) {
                break L28;
              } else {
                vd.field_h[11] = uh.a(120, var2);
                break L28;
              }
            }
            L29: {
              var2 = cb.a("achievement_criteria,12", (byte) -124);
              if (var2 != null) {
                vd.field_h[12] = uh.a(117, var2);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2 = cb.a("achievement_criteria,13", (byte) -124);
              if (var2 == null) {
                break L30;
              } else {
                vd.field_h[13] = uh.a(123, var2);
                break L30;
              }
            }
            L31: {
              var2 = cb.a("achievement_criteria,14", (byte) -124);
              if (var2 != null) {
                vd.field_h[14] = uh.a(121, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = cb.a("optionscaps", (byte) -124);
              if (null == var2) {
                break L32;
              } else {
                uh.a(param1 ^ 30861, var2);
                break L32;
              }
            }
            L33: {
              var2 = cb.a("bosshealthcaps", (byte) -124);
              if (var2 != null) {
                s.field_h = uh.a(112, var2);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = cb.a("lev7a", (byte) -124);
              if (var2 != null) {
                jg.field_I = uh.a(127, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = cb.a("lev6c", (byte) -124);
              if (var2 == null) {
                break L35;
              } else {
                eh.field_c = uh.a(117, var2);
                break L35;
              }
            }
            L36: {
              var2 = cb.a("lev6b", (byte) -124);
              if (var2 != null) {
                jf.field_b = uh.a(122, var2);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = cb.a("lev6a", (byte) -124);
              if (var2 == null) {
                break L37;
              } else {
                d.field_n = uh.a(126, var2);
                break L37;
              }
            }
            L38: {
              var2 = cb.a("lev5b", (byte) -124);
              if (var2 == null) {
                break L38;
              } else {
                sb.field_o = uh.a(112, var2);
                break L38;
              }
            }
            L39: {
              var2 = cb.a("lev5a", (byte) -124);
              if (var2 != null) {
                bc.field_l = uh.a(126, var2);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = cb.a("lev4a", (byte) -124);
              if (null != var2) {
                vf.field_a = uh.a(param1 ^ 30860, var2);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = cb.a("lev3a", (byte) -124);
              if (null == var2) {
                break L41;
              } else {
                qc.field_a = uh.a(121, var2);
                break L41;
              }
            }
            L42: {
              var2 = cb.a("lev2a", (byte) -124);
              if (null == var2) {
                break L42;
              } else {
                ig.field_c = uh.a(123, var2);
                break L42;
              }
            }
            L43: {
              var2 = cb.a("lev1", (byte) -124);
              if (null == var2) {
                break L43;
              } else {
                eg.field_i = uh.a(114, var2);
                break L43;
              }
            }
            L44: {
              var2 = cb.a("spacetofire", (byte) -124);
              if (null != var2) {
                uh.a(120, var2);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2 = cb.a("escforopts", (byte) -124);
              if (null != var2) {
                uh.a(112, var2);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = cb.a("scorecapscolon", (byte) -124);
              if (null == var2) {
                break L46;
              } else {
                rd.field_o = uh.a(112, var2);
                break L46;
              }
            }
            L47: {
              var2 = cb.a("collecttopowerup", (byte) -124);
              if (null == var2) {
                break L47;
              } else {
                p.field_e = uh.a(param1 + -30845, var2);
                break L47;
              }
            }
            L48: {
              var2 = cb.a("lancepower", (byte) -124);
              if (var2 == null) {
                break L48;
              } else {
                ve.field_g = uh.a(114, var2);
                break L48;
              }
            }
            L49: {
              var2 = cb.a("helixpower", (byte) -124);
              if (null == var2) {
                break L49;
              } else {
                b.field_d = uh.a(param1 + -30838, var2);
                break L49;
              }
            }
            L50: {
              var2 = cb.a("pulsepower", (byte) -124);
              if (null == var2) {
                break L50;
              } else {
                be.field_b = uh.a(119, var2);
                break L50;
              }
            }
            L51: {
              var2 = cb.a("livescapscolon", (byte) -124);
              if (var2 != null) {
                vk.field_w = uh.a(param1 + -30842, var2);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2 = cb.a("atgcaps", (byte) -124);
              if (null != var2) {
                uh.a(115, var2);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2 = cb.a("levhard", (byte) -124);
              if (null != var2) {
                hg.field_D = uh.a(127, var2);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2 = cb.a("levmedium", (byte) -124);
              if (var2 != null) {
                fl.field_g = uh.a(120, var2);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = cb.a("leveasy", (byte) -124);
              if (null != var2) {
                cf.field_k = uh.a(param1 + -30847, var2);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2 = cb.a("fsoff", (byte) -124);
              if (var2 == null) {
                break L56;
              } else {
                uh.a(126, var2);
                break L56;
              }
            }
            L57: {
              var2 = cb.a("fson", (byte) -124);
              if (var2 == null) {
                break L57;
              } else {
                uh.a(114, var2);
                break L57;
              }
            }
            L58: {
              var2 = cb.a("gfxhigh", (byte) -124);
              if (null != var2) {
                gh.field_A = uh.a(120, var2);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2 = cb.a("gfxmed", (byte) -124);
              if (var2 != null) {
                fd.field_d = uh.a(param1 + -30850, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = cb.a("gfxlow", (byte) -124);
              if (var2 != null) {
                ec.field_d = uh.a(121, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = cb.a("maxpowtext", (byte) -124);
              if (var2 != null) {
                ab.field_B = uh.a(param1 ^ 30855, var2);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2 = cb.a("sideguntext", (byte) -124);
              if (null == var2) {
                break L62;
              } else {
                ra.field_y = uh.a(124, var2);
                break L62;
              }
            }
            L63: {
              var2 = cb.a("backguntext", (byte) -124);
              if (null != var2) {
                oi.field_i = uh.a(119, var2);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2 = cb.a("shieldtext", (byte) -124);
              if (null != var2) {
                t.field_x = uh.a(113, var2);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2 = cb.a("enginetext", (byte) -124);
              if (var2 != null) {
                hb.field_g = uh.a(126, var2);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2 = cb.a("powerup2of2", (byte) -124);
              if (var2 != null) {
                di.field_k = uh.a(120, var2);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2 = cb.a("collecttext", (byte) -124);
              if (var2 != null) {
                la.field_a = uh.a(117, var2);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2 = cb.a("lifetext", (byte) -124);
              if (null != var2) {
                a.field_c = uh.a(126, var2);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2 = cb.a("lancetext", (byte) -124);
              if (var2 != null) {
                mg.field_k = uh.a(118, var2);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2 = cb.a("helixtext", (byte) -124);
              if (null != var2) {
                mc.field_i = uh.a(120, var2);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2 = cb.a("pulsetext", (byte) -124);
              if (var2 != null) {
                gf.field_e = uh.a(123, var2);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2 = cb.a("powerup1of2", (byte) -124);
              if (null != var2) {
                vc.field_k = uh.a(127, var2);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2 = cb.a("con7", (byte) -124);
              if (null != var2) {
                eb.field_e = uh.a(127, var2);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2 = cb.a("con6", (byte) -124);
              if (var2 != null) {
                p.field_b = uh.a(114, var2);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2 = cb.a("con5", (byte) -124);
              if (var2 != null) {
                cc.field_k = uh.a(119, var2);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2 = cb.a("con4", (byte) -124);
              if (null == var2) {
                break L76;
              } else {
                qd.field_y = uh.a(param1 + -30843, var2);
                break L76;
              }
            }
            L77: {
              var2 = cb.a("con3", (byte) -124);
              if (null == var2) {
                break L77;
              } else {
                ac.field_c = uh.a(120, var2);
                break L77;
              }
            }
            L78: {
              var2 = cb.a("con2", (byte) -124);
              if (null == var2) {
                break L78;
              } else {
                fi.field_a = uh.a(112, var2);
                break L78;
              }
            }
            L79: {
              var2 = cb.a("con1", (byte) -124);
              if (null == var2) {
                break L79;
              } else {
                s.field_a = uh.a(param1 + -30840, var2);
                break L79;
              }
            }
            L80: {
              var2 = cb.a("controlcaps", (byte) -124);
              if (null == var2) {
                break L80;
              } else {
                tc.field_y = uh.a(param1 ^ 30860, var2);
                break L80;
              }
            }
            L81: {
              var2 = cb.a("storytext", (byte) -124);
              if (var2 == null) {
                break L81;
              } else {
                ff.field_p = uh.a(123, var2);
                break L81;
              }
            }
            L82: {
              var2 = cb.a("storycaps", (byte) -124);
              if (null == var2) {
                break L82;
              } else {
                sb.field_p = uh.a(117, var2);
                break L82;
              }
            }
            L83: {
              var2 = cb.a("nextcaps", (byte) -124);
              if (null == var2) {
                break L83;
              } else {
                uh.a(127, var2);
                break L83;
              }
            }
            L84: {
              var2 = cb.a("prevcaps", (byte) -124);
              if (null != var2) {
                uh.a(param1 ^ 30853, var2);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2 = cb.a("pageno", (byte) -124);
              if (null != var2) {
                ui.field_t = uh.a(120, var2);
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              var2 = cb.a("instrcaps", (byte) -124);
              if (null != var2) {
                uh.a(114, var2);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2 = cb.a("hsunavail", (byte) -124);
              if (null == var2) {
                break L87;
              } else {
                uh.a(115, var2);
                break L87;
              }
            }
            L88: {
              var2 = cb.a("waitforhs", (byte) -124);
              if (null == var2) {
                break L88;
              } else {
                uh.a(127, var2);
                break L88;
              }
            }
            L89: {
              var2 = cb.a("hardcaps", (byte) -124);
              if (var2 == null) {
                break L89;
              } else {
                td.field_j = uh.a(118, var2);
                break L89;
              }
            }
            L90: {
              var2 = cb.a("mediumcaps", (byte) -124);
              if (var2 == null) {
                break L90;
              } else {
                lb.field_l = uh.a(116, var2);
                break L90;
              }
            }
            L91: {
              var2 = cb.a("easycaps", (byte) -124);
              if (null != var2) {
                ta.field_a = uh.a(param1 ^ 30862, var2);
                break L91;
              } else {
                break L91;
              }
            }
            L92: {
              var2 = cb.a("lastscorestring", (byte) -124);
              if (null == var2) {
                break L92;
              } else {
                uh.a(120, var2);
                break L92;
              }
            }
            L93: {
              var2 = cb.a("logincaps", (byte) -124);
              if (null != var2) {
                uh.a(param1 + -30840, var2);
                break L93;
              } else {
                break L93;
              }
            }
            L94: {
              var2 = cb.a("highscorescaps", (byte) -124);
              if (null == var2) {
                break L94;
              } else {
                uh.a(113, var2);
                break L94;
              }
            }
            L95: {
              var2 = cb.a("menucaps", (byte) -124);
              if (null == var2) {
                break L95;
              } else {
                uh.a(123, var2);
                break L95;
              }
            }
            L96: {
              var2 = cb.a("hiddenachievement", (byte) -124);
              if (null != var2) {
                uh.a(127, var2);
                break L96;
              } else {
                break L96;
              }
            }
            L97: {
              var2 = cb.a("achievementscaps", (byte) -124);
              if (var2 != null) {
                uh.a(param1 + -30850, var2);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2 = cb.a("mainmenucaps", (byte) -124);
              if (null != var2) {
                uh.a(param1 + -30842, var2);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              var2 = cb.a("warninghardmode", (byte) -124);
              if (var2 == null) {
                break L99;
              } else {
                uh.a(param1 + -30836, var2);
                break L99;
              }
            }
            L100: {
              var2 = cb.a("gameover", (byte) -124);
              if (var2 != null) {
                ne.field_i = uh.a(127, var2);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2 = cb.a("benefits,0", (byte) -124);
              if (param1 == 30962) {
                break L101;
              } else {
                field_j = (String) null;
                break L101;
              }
            }
            L102: {
              if (null != var2) {
                rj.field_l[0] = uh.a(114, var2);
                break L102;
              } else {
                break L102;
              }
            }
            L103: {
              var2 = cb.a("benefits,1", (byte) -124);
              if (null != var2) {
                rj.field_l[1] = uh.a(121, var2);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2 = cb.a("benefits,2", (byte) -124);
              if (null == var2) {
                break L104;
              } else {
                rj.field_l[2] = uh.a(125, var2);
                break L104;
              }
            }
            ri.field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L105: {
            var2_ref = decompiledCaughtException;
            stackIn_373_0 = (RuntimeException) (var2_ref);

            stackIn_373_1 = new StringBuilder().append("vb.C(");

            if (param0 == null) {
              stackIn_374_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackIn_374_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackIn_374_2 = "null";
              break L105;
            } else {
              stackIn_374_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackIn_374_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackIn_374_2 = "{...}";
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        p stackIn_8_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        he var3_ref = null;
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
                    stackIn_8_0 = sb.field_n;
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
                stackIn_16_0 = sb.field_n;
                break L3;
              } else {
                stackIn_16_0 = bf.field_x;
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
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("vb.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
