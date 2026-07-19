/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends lea {
    static String field_G;
    static int field_H;
    static String field_I;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = super.a(param0, param1, param2);
            var5 = new ue(param2, param0);
            var5.a(2, false);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (kga) ((Object) var6.a(12, 125));
            var7.b((byte) 123, 1);
            var4.a(var5, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("aja.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    aja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vna var17 = null;
        Object var18 = null;
        pha var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        jea var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        jea var26 = null;
        jea stackIn_18_0 = null;
        jea stackIn_19_0 = null;
        jea stackIn_20_0 = null;
        jea stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_80_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_145_0 = 0;
        jea stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        jea stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        jea stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        jea stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        jea stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        jea stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        jea stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        jea stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        jea stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        jea stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_174_2 = 0;
        jea stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        jea stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        jea stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        jea stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        jea stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jea stackOut_17_0 = null;
        jea stackOut_18_0 = null;
        jea stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        jea stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        boolean stackOut_73_0 = false;
        int stackOut_79_0 = 0;
        boolean stackOut_126_0 = false;
        int stackOut_144_0 = 0;
        jea stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        jea stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        jea stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        jea stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        jea stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        int stackOut_168_2 = 0;
        jea stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        jea stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        jea stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        jea stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        int stackOut_172_2 = 0;
        jea stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int stackOut_173_2 = 0;
        jea stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        jea stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        jea stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        jea stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        int stackOut_177_2 = 0;
        jea stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        int stackOut_178_2 = 0;
        var18 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              dga.a(fp.field_e, 199);
              if (null != uu.field_a) {
                L2: {
                  L3: {
                    bc.field_b.field_X = true;
                    var22 = pk.field_z;
                    var26 = var22;
                    pk.field_z.field_t = 0;
                    var26.field_G = 0;
                    var6 = hw.field_a;
                    hw.field_a.field_t = 0;
                    var6.field_G = 0;
                    var7 = dl.field_t;
                    dl.field_t.field_t = 0;
                    var7.field_G = 0;
                    if (!mka.b(param1 + 8193)) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          wf.field_g.field_r = una.field_d.toUpperCase();
                          var9 = (2 + dka.field_b.field_G) / 2;
                          pk.field_z.a(-2 + var9, 40, -23776, -40 + dka.field_b.field_t, 0);
                          if ((uu.field_a.field_Mb ^ -1) > (uu.field_a.field_Jb ^ -1)) {
                            break L5;
                          } else {
                            pk.field_z.field_r = ml.field_c.toUpperCase();
                            pk.field_z.field_X = false;
                            if (var19 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        pk.field_z.field_r = eu.field_b.toUpperCase();
                        pk.field_z.field_X = true;
                        break L4;
                      }
                      L6: {
                        pk.field_z.field_w = hg.field_g.field_w;
                        if (so.field_K > 0) {
                          L7: {
                            L8: {
                              if (1 != so.field_K) {
                                break L8;
                              } else {
                                var10_ref_String = sj.field_a;
                                if (var19 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var10_ref_String = gl.a((byte) 84, ld.field_f, new String[]{Integer.toString(so.field_K)});
                            break L7;
                          }
                          L9: {
                            if (-1 != (lh.field_a & 16 ^ -1)) {
                              break L9;
                            } else {
                              if (tla.field_e) {
                                break L9;
                              } else {
                                pk.field_z.field_w = hg.field_g.field_C;
                                break L9;
                              }
                            }
                          }
                          pk.field_z.field_r = pk.field_z.field_r + "<br>" + var10_ref_String;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L10: {
                        L11: {
                          hw.field_a.a(dka.field_b.field_G + -var9, 40, -23776, dka.field_b.field_t - 40, var9);
                          hw.field_a.field_r = ki.field_p.toUpperCase();
                          var8 = hw.field_a;
                          stackOut_17_0 = hw.field_a;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (!param3) {
                            break L11;
                          } else {
                            stackOut_18_0 = (jea) ((Object) stackIn_18_0);
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (uq.field_d != 0L) {
                              break L11;
                            } else {
                              stackOut_19_0 = (jea) ((Object) stackIn_19_0);
                              stackOut_19_1 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L10;
                            }
                          }
                        }
                        stackOut_20_0 = (jea) ((Object) stackIn_20_0);
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L10;
                      }
                      L12: {
                        stackIn_21_0.field_X = stackIn_21_1 != 0;
                        var10 = 2;
                        if (null != ce.field_A) {
                          L13: {
                            if (tba.field_m != null) {
                              break L13;
                            } else {
                              tba.field_m = new byte[fk.field_b];
                              sda.field_f = new boolean[fk.field_b];
                              break L13;
                            }
                          }
                          var11 = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if ((var11 ^ -1) <= (fk.field_b ^ -1)) {
                                  break L16;
                                } else {
                                  sda.field_f[var11] = false;
                                  var11++;
                                  if (var19 != 0) {
                                    break L15;
                                  } else {
                                    if (var19 == 0) {
                                      continue L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              break L15;
                            }
                            L17: while (true) {
                              L18: {
                                L19: {
                                  if (-3 >= (var10 ^ -1)) {
                                    break L19;
                                  } else {
                                    var11 = 0;
                                    stackOut_33_0 = 0;
                                    stackIn_66_0 = stackOut_33_0;
                                    stackIn_34_0 = stackOut_33_0;
                                    if (var19 != 0) {
                                      break L18;
                                    } else {
                                      var12 = stackIn_34_0;
                                      L20: while (true) {
                                        stackOut_35_0 = ce.field_A.length;
                                        stackOut_35_1 = var12;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (stackIn_36_0 <= stackIn_36_1) {
                                                break L23;
                                              } else {
                                                var25 = ce.field_A[var12];
                                                var23 = var25;
                                                var20 = var23;
                                                var13_ref_int__ = var20;
                                                stackOut_37_0 = 0;
                                                stackIn_62_0 = stackOut_37_0;
                                                stackIn_38_0 = stackOut_37_0;
                                                if (var19 != 0) {
                                                  break L22;
                                                } else {
                                                  var14 = stackIn_38_0;
                                                  L24: while (true) {
                                                    L25: {
                                                      L26: {
                                                        L27: {
                                                          if (var25.length <= var14) {
                                                            break L27;
                                                          } else {
                                                            var15 = var25[var14];
                                                            var16 = var20[1 + var14];
                                                            stackOut_40_0 = 0;
                                                            stackOut_40_1 = var15 ^ -1;
                                                            stackIn_54_0 = stackOut_40_0;
                                                            stackIn_54_1 = stackOut_40_1;
                                                            stackIn_41_0 = stackOut_40_0;
                                                            stackIn_41_1 = stackOut_40_1;
                                                            if (var19 != 0) {
                                                              break L26;
                                                            } else {
                                                              L28: {
                                                                if (stackIn_41_0 == stackIn_41_1) {
                                                                  L29: {
                                                                    if (-1 != (var10 ^ -1)) {
                                                                      stackOut_46_0 = uu.field_a.field_Mb;
                                                                      stackIn_47_0 = stackOut_46_0;
                                                                      break L29;
                                                                    } else {
                                                                      stackOut_45_0 = uu.field_a.field_Jb;
                                                                      stackIn_47_0 = stackOut_45_0;
                                                                      break L29;
                                                                    }
                                                                  }
                                                                  var17_int = stackIn_47_0;
                                                                  if ((var17_int ^ -1) == (var16 ^ -1)) {
                                                                    break L28;
                                                                  } else {
                                                                    if (var19 == 0) {
                                                                      break L25;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if ((var16 ^ -1) != (255 & uu.field_a.field_ac[var15] ^ -1)) {
                                                                    break L25;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              var14 += 2;
                                                              if (var19 == 0) {
                                                                continue L24;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var11 = 1;
                                                        var14 = -1;
                                                        var15 = 0;
                                                        stackOut_53_0 = var25.length;
                                                        stackOut_53_1 = var15;
                                                        stackIn_54_0 = stackOut_53_0;
                                                        stackIn_54_1 = stackOut_53_1;
                                                        break L26;
                                                      }
                                                      L30: while (true) {
                                                        L31: {
                                                          if (stackIn_54_0 <= stackIn_54_1) {
                                                            break L31;
                                                          } else {
                                                            var16 = var25[var15];
                                                            stackOut_55_0 = var14 ^ -1;
                                                            stackOut_55_1 = var16 ^ -1;
                                                            stackIn_36_0 = stackOut_55_0;
                                                            stackIn_36_1 = stackOut_55_1;
                                                            stackIn_56_0 = stackOut_55_0;
                                                            stackIn_56_1 = stackOut_55_1;
                                                            if (var19 != 0) {
                                                              continue L21;
                                                            } else {
                                                              L32: {
                                                                if (stackIn_56_0 <= stackIn_56_1) {
                                                                  break L32;
                                                                } else {
                                                                  var14 = var16;
                                                                  break L32;
                                                                }
                                                              }
                                                              var15 += 2;
                                                              if (var19 == 0) {
                                                                stackOut_53_0 = var25.length;
                                                                stackOut_53_1 = var15;
                                                                stackIn_54_0 = stackOut_53_0;
                                                                stackIn_54_1 = stackOut_53_1;
                                                                continue L30;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        sda.field_f[var14] = true;
                                                        break L25;
                                                      }
                                                    }
                                                    var12++;
                                                    if (var19 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_61_0 = var11;
                                            stackIn_62_0 = stackOut_61_0;
                                            break L22;
                                          }
                                          if (stackIn_62_0 != 0) {
                                            break L19;
                                          } else {
                                            var10++;
                                            if (var19 == 0) {
                                              continue L17;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_65_0 = 2;
                                stackIn_66_0 = stackOut_65_0;
                                break L18;
                              }
                              if (stackIn_66_0 > ld.field_e) {
                                break L12;
                              } else {
                                if (!oj.field_tb[12]) {
                                  break L12;
                                } else {
                                  var10 = 2;
                                  break L12;
                                }
                              }
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                      L33: {
                        L34: {
                          if (var10 >= 2) {
                            break L34;
                          } else {
                            hw.field_a.field_X = false;
                            if (!hw.field_a.field_pb) {
                              break L33;
                            } else {
                              var11_ref = null;
                              var12 = 0;
                              var13 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (var13 >= fk.field_b) {
                                      break L37;
                                    } else {
                                      stackOut_73_0 = sda.field_f[var13];
                                      stackIn_80_0 = stackOut_73_0 ? 1 : 0;
                                      stackIn_74_0 = stackOut_73_0;
                                      if (var19 != 0) {
                                        break L36;
                                      } else {
                                        L38: {
                                          if (!stackIn_74_0) {
                                            break L38;
                                          } else {
                                            L39: {
                                              var24 = "<col=A00000>" + kma.field_e[var13] + "</col>";
                                              if (var11_ref != null) {
                                                break L39;
                                              } else {
                                                var11_ref = var24;
                                                if (var19 == 0) {
                                                  break L38;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            var11_ref = (String) (var11_ref) + ", " + var24;
                                            var12 = 1;
                                            break L38;
                                          }
                                        }
                                        var13++;
                                        if (var19 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_79_0 = var10;
                                  stackIn_80_0 = stackOut_79_0;
                                  break L36;
                                }
                                L40: {
                                  if (stackIn_80_0 == 0) {
                                    L41: {
                                      var13_ref_String = wqa.field_J;
                                      if (var12 != 0) {
                                        break L41;
                                      } else {
                                        var14_ref_String = gl.a((byte) 82, field_I, new String[]{(String) (var11_ref)});
                                        if (var19 == 0) {
                                          break L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    var14_ref_String = v.field_j + (String) (var11_ref);
                                    break L40;
                                  } else {
                                    L42: {
                                      var13_ref_String = lha.field_m;
                                      if (var12 != 0) {
                                        break L42;
                                      } else {
                                        var14_ref_String = gl.a((byte) 102, bl.field_b, new String[]{(String) (var11_ref)});
                                        if (var19 == 0) {
                                          break L40;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    var14_ref_String = uda.field_w + (String) (var11_ref);
                                    break L40;
                                  }
                                }
                                qda.field_b = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                                if (var19 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (null != rl.field_u) {
                            break L43;
                          } else {
                            if (null != hp.field_a) {
                              break L43;
                            } else {
                              if (nra.field_g != null) {
                                break L43;
                              } else {
                                if (null == lga.field_z) {
                                  break L33;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        L44: while (true) {
                          L45: {
                            L46: {
                              if (var16 >= fk.field_b) {
                                break L46;
                              } else {
                                var17_int = uu.field_a.field_ac[var16] & 255;
                                if (var19 != 0) {
                                  break L45;
                                } else {
                                  L47: {
                                    if (rl.field_u == null) {
                                      break L47;
                                    } else {
                                      if (null == rl.field_u[var16]) {
                                        break L47;
                                      } else {
                                        if (!rl.field_u[var16][var17_int]) {
                                          break L47;
                                        } else {
                                          var11 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  L48: {
                                    if (null == hp.field_a) {
                                      break L48;
                                    } else {
                                      if (hp.field_a[var16] != null) {
                                        L49: {
                                          var18_int = hp.field_a[var16][var17_int];
                                          if (0 == var18_int) {
                                            break L49;
                                          } else {
                                            if (!dea.field_c) {
                                              var11 = 1;
                                              break L49;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                        if (var13 >= var18_int) {
                                          break L48;
                                        } else {
                                          var13 = var18_int;
                                          break L48;
                                        }
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (lga.field_z == null) {
                                      break L50;
                                    } else {
                                      if (null != lga.field_z[var16]) {
                                        var15 = var15 | lga.field_z[var16][var17_int];
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (null == nra.field_g) {
                                      break L51;
                                    } else {
                                      if (nra.field_g[var16] == null) {
                                        break L51;
                                      } else {
                                        L52: {
                                          var18_int = nra.field_g[var16][var17_int];
                                          if (var14 < var18_int) {
                                            var14 = var18_int;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        if (0 == var18_int) {
                                          break L51;
                                        } else {
                                          if (!dea.field_c) {
                                            var11 = 1;
                                            break L51;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L44;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L45;
                          }
                          var17 = tn.field_n.field_tb.field_J;
                          var18_ref = (pha) ((Object) var17.f(param1 + -79));
                          L53: while (true) {
                            L54: {
                              L55: {
                                if (var18_ref == null) {
                                  break L55;
                                } else {
                                  stackOut_126_0 = var18_ref.f(162);
                                  stackIn_145_0 = stackOut_126_0 ? 1 : 0;
                                  stackIn_127_0 = stackOut_126_0;
                                  if (var19 != 0) {
                                    break L54;
                                  } else {
                                    L56: {
                                      L57: {
                                        if (!stackIn_127_0) {
                                          break L57;
                                        } else {
                                          if (var19 == 0) {
                                            break L56;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      L58: {
                                        if (var11 == 0) {
                                          break L58;
                                        } else {
                                          if (var18_ref.field_tb) {
                                            break L58;
                                          } else {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L55;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                      }
                                      L59: {
                                        if ((var18_ref.field_Jb ^ -1) > (var13 ^ -1)) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L59;
                                          }
                                        } else {
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        if (var18_ref.field_zb >= var14) {
                                          break L60;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      L61: {
                                        if (-1 <= ((var18_ref.field_Eb ^ -1) & var15 ^ -1)) {
                                          break L61;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      if (var12 != 0) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L55;
                                        } else {
                                          break L56;
                                        }
                                      } else {
                                        break L56;
                                      }
                                    }
                                    var18_ref = (pha) ((Object) var17.e(120));
                                    if (var19 == 0) {
                                      continue L53;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                              }
                              stackOut_144_0 = -3;
                              stackIn_145_0 = stackOut_144_0;
                              break L54;
                            }
                            L62: {
                              if (stackIn_145_0 < (ld.field_e ^ -1)) {
                                break L62;
                              } else {
                                if (!oj.field_tb[12]) {
                                  break L62;
                                } else {
                                  var16 = 0;
                                  break L62;
                                }
                              }
                            }
                            if (var16 != 0) {
                              hw.field_a.field_X = false;
                              if (!hw.field_a.field_pb) {
                                break L33;
                              } else {
                                L63: {
                                  if ((rm.field_e.field_a.field_wb ^ -1) == -1) {
                                    break L63;
                                  } else {
                                    qda.field_b = gl.a((byte) 126, sta.field_A, new String[]{kh.field_p});
                                    if (var19 == 0) {
                                      break L33;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                qda.field_b = kh.field_o;
                                break L33;
                              }
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9_ref_String = uu.field_a.field_tb;
                  wf.field_g.field_r = gl.a((byte) 113, jea.field_nb, new String[]{var9_ref_String}).toUpperCase();
                  dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
                  dl.field_t.field_r = gl.a((byte) 107, bja.field_d, new String[]{var9_ref_String});
                  var8 = dl.field_t;
                  break L2;
                }
                L64: {
                  if ((uq.field_d ^ -1L) != -1L) {
                    L65: {
                      var9 = (int)(-bva.b((byte) -107) + uq.field_d);
                      var9 = (999 + var9) / 1000;
                      if ((var9 ^ -1) > -2) {
                        var9 = 1;
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                    var8.field_r = gl.a((byte) 97, he.field_b, new String[]{Integer.toString(var9)});
                    break L64;
                  } else {
                    break L64;
                  }
                }
                cea.field_a.field_r = gl.a((byte) 106, tra.field_A, new String[]{Integer.toString(uu.field_a.field_Mb), Integer.toString(uu.field_a.field_Jb)});
                break L1;
              } else {
                break L1;
              }
            }
            L66: {
              L67: {
                stackOut_164_0 = nra.field_c;
                stackOut_164_1 = -98;
                stackIn_168_0 = stackOut_164_0;
                stackIn_168_1 = stackOut_164_1;
                stackIn_165_0 = stackOut_164_0;
                stackIn_165_1 = stackOut_164_1;
                if (!param4) {
                  break L67;
                } else {
                  stackOut_165_0 = (jea) ((Object) stackIn_165_0);
                  stackOut_165_1 = stackIn_165_1;
                  stackIn_168_0 = stackOut_165_0;
                  stackIn_168_1 = stackOut_165_1;
                  stackIn_166_0 = stackOut_165_0;
                  stackIn_166_1 = stackOut_165_1;
                  if (param0) {
                    break L67;
                  } else {
                    stackOut_166_0 = (jea) ((Object) stackIn_166_0);
                    stackOut_166_1 = stackIn_166_1;
                    stackIn_168_0 = stackOut_166_0;
                    stackIn_168_1 = stackOut_166_1;
                    stackIn_167_0 = stackOut_166_0;
                    stackIn_167_1 = stackOut_166_1;
                    if (tla.field_e) {
                      break L67;
                    } else {
                      stackOut_167_0 = (jea) ((Object) stackIn_167_0);
                      stackOut_167_1 = stackIn_167_1;
                      stackOut_167_2 = 1;
                      stackIn_169_0 = stackOut_167_0;
                      stackIn_169_1 = stackOut_167_1;
                      stackIn_169_2 = stackOut_167_2;
                      break L66;
                    }
                  }
                }
              }
              stackOut_168_0 = (jea) ((Object) stackIn_168_0);
              stackOut_168_1 = stackIn_168_1;
              stackOut_168_2 = 0;
              stackIn_169_0 = stackOut_168_0;
              stackIn_169_1 = stackOut_168_1;
              stackIn_169_2 = stackOut_168_2;
              break L66;
            }
            L68: {
              L69: {
                ((jea) (Object) stackIn_169_0).c(stackIn_169_1, stackIn_169_2 != 0);
                stackOut_169_0 = dka.field_b;
                stackOut_169_1 = 67;
                stackIn_173_0 = stackOut_169_0;
                stackIn_173_1 = stackOut_169_1;
                stackIn_170_0 = stackOut_169_0;
                stackIn_170_1 = stackOut_169_1;
                if (!param4) {
                  break L69;
                } else {
                  stackOut_170_0 = (jea) ((Object) stackIn_170_0);
                  stackOut_170_1 = stackIn_170_1;
                  stackIn_173_0 = stackOut_170_0;
                  stackIn_173_1 = stackOut_170_1;
                  stackIn_171_0 = stackOut_170_0;
                  stackIn_171_1 = stackOut_170_1;
                  if (param0) {
                    break L69;
                  } else {
                    stackOut_171_0 = (jea) ((Object) stackIn_171_0);
                    stackOut_171_1 = stackIn_171_1;
                    stackIn_173_0 = stackOut_171_0;
                    stackIn_173_1 = stackOut_171_1;
                    stackIn_172_0 = stackOut_171_0;
                    stackIn_172_1 = stackOut_171_1;
                    if (tla.field_e) {
                      break L69;
                    } else {
                      stackOut_172_0 = (jea) ((Object) stackIn_172_0);
                      stackOut_172_1 = stackIn_172_1;
                      stackOut_172_2 = 1;
                      stackIn_174_0 = stackOut_172_0;
                      stackIn_174_1 = stackOut_172_1;
                      stackIn_174_2 = stackOut_172_2;
                      break L68;
                    }
                  }
                }
              }
              stackOut_173_0 = (jea) ((Object) stackIn_173_0);
              stackOut_173_1 = stackIn_173_1;
              stackOut_173_2 = 0;
              stackIn_174_0 = stackOut_173_0;
              stackIn_174_1 = stackOut_173_1;
              stackIn_174_2 = stackOut_173_2;
              break L68;
            }
            L70: {
              L71: {
                ((jea) (Object) stackIn_174_0).c(stackIn_174_1, stackIn_174_2 != 0);
                stackOut_174_0 = hf.field_a;
                stackOut_174_1 = 36;
                stackIn_178_0 = stackOut_174_0;
                stackIn_178_1 = stackOut_174_1;
                stackIn_175_0 = stackOut_174_0;
                stackIn_175_1 = stackOut_174_1;
                if (!param4) {
                  break L71;
                } else {
                  stackOut_175_0 = (jea) ((Object) stackIn_175_0);
                  stackOut_175_1 = stackIn_175_1;
                  stackIn_178_0 = stackOut_175_0;
                  stackIn_178_1 = stackOut_175_1;
                  stackIn_176_0 = stackOut_175_0;
                  stackIn_176_1 = stackOut_175_1;
                  if (param0) {
                    break L71;
                  } else {
                    stackOut_176_0 = (jea) ((Object) stackIn_176_0);
                    stackOut_176_1 = stackIn_176_1;
                    stackIn_178_0 = stackOut_176_0;
                    stackIn_178_1 = stackOut_176_1;
                    stackIn_177_0 = stackOut_176_0;
                    stackIn_177_1 = stackOut_176_1;
                    if (!tla.field_e) {
                      break L71;
                    } else {
                      stackOut_177_0 = (jea) ((Object) stackIn_177_0);
                      stackOut_177_1 = stackIn_177_1;
                      stackOut_177_2 = 1;
                      stackIn_179_0 = stackOut_177_0;
                      stackIn_179_1 = stackOut_177_1;
                      stackIn_179_2 = stackOut_177_2;
                      break L70;
                    }
                  }
                }
              }
              stackOut_178_0 = (jea) ((Object) stackIn_178_0);
              stackOut_178_1 = stackIn_178_1;
              stackOut_178_2 = 0;
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              stackIn_179_2 = stackOut_178_2;
              break L70;
            }
            ((jea) (Object) stackIn_179_0).c(stackIn_179_1, stackIn_179_2 != 0);
            rm.field_e.field_a.e((byte) -98);
            if (param1 == -1) {
              L72: {
                if (null == uu.field_a) {
                  break L72;
                } else {
                  L73: {
                    if (0 != bc.field_b.field_y) {
                      et.a(param2, 30, uu.field_a.f(0));
                      break L73;
                    } else {
                      break L73;
                    }
                  }
                  L74: {
                    if (-1 != (hw.field_a.field_y ^ -1)) {
                      hoa.field_p = true;
                      break L74;
                    } else {
                      break L74;
                    }
                  }
                  L75: {
                    if ((pk.field_z.field_y ^ -1) != -1) {
                      tla.field_e = true;
                      break L75;
                    } else {
                      break L75;
                    }
                  }
                  L76: {
                    if (-1 == (fsa.field_q.field_y ^ -1)) {
                      break L76;
                    } else {
                      tla.field_e = false;
                      break L76;
                    }
                  }
                  cm.a(param2, uu.field_a, param1 ^ 21289, false);
                  break L72;
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
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "aja.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void A(int param0) {
        field_I = null;
        if (param0 != 32076) {
            aja.a(false, 126, -63, false, true);
        }
        field_G = null;
    }

    aja(la param0, int param1) {
        super(param0, param1);
    }

    static {
        field_G = "Reject <%0> from this game";
        field_I = "Please select an option in the '<%0>' row.";
    }
}
