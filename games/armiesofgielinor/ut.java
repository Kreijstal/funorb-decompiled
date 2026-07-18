/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ut extends sf implements he {
    private fw field_bb;
    static String field_ib;
    private fw field_ab;
    private fw field_mb;
    private fw field_Y;
    private fw field_Z;
    private gh field_lb;
    private boolean field_hb;
    static byte[][] field_W;
    private boolean field_jb;
    private ob field_gb;
    static int field_eb;
    static String[] field_cb;
    static int field_fb;
    private fw[] field_kb;
    private ls[] field_db;
    private boolean field_nb;
    private fw field_X;

    ut(gk param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ls[] var3_ref_ls__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        fw var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        kb var7 = null;
        ls var8 = null;
        int var9 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_15_0 = null;
        ls stackIn_15_1 = null;
        Object stackIn_33_0 = null;
        ls stackIn_33_1 = null;
        ls[] stackIn_43_0 = null;
        ls[] stackIn_50_0 = null;
        ls[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        ls[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        Object stackIn_85_0 = null;
        ob stackIn_85_1 = null;
        ob stackIn_85_2 = null;
        int stackIn_85_3 = 0;
        Object stackIn_86_0 = null;
        ob stackIn_86_1 = null;
        ob stackIn_86_2 = null;
        int stackIn_86_3 = 0;
        Object stackIn_88_0 = null;
        ob stackIn_88_1 = null;
        ob stackIn_88_2 = null;
        int stackIn_88_3 = 0;
        Object stackIn_89_0 = null;
        ob stackIn_89_1 = null;
        ob stackIn_89_2 = null;
        int stackIn_89_3 = 0;
        Object stackIn_90_0 = null;
        ob stackIn_90_1 = null;
        ob stackIn_90_2 = null;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        Object stackIn_93_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        String stackIn_133_0 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        String stackIn_142_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_14_0 = null;
        ls stackOut_14_1 = null;
        Object stackOut_31_0 = null;
        ls stackOut_31_1 = null;
        ls[] stackOut_42_0 = null;
        ls[] stackOut_49_0 = null;
        ls[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        ls[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_62_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_83_0 = 0;
        Object stackOut_84_0 = null;
        ob stackOut_84_1 = null;
        ob stackOut_84_2 = null;
        int stackOut_84_3 = 0;
        Object stackOut_85_0 = null;
        ob stackOut_85_1 = null;
        ob stackOut_85_2 = null;
        int stackOut_85_3 = 0;
        Object stackOut_86_0 = null;
        ob stackOut_86_1 = null;
        ob stackOut_86_2 = null;
        int stackOut_86_3 = 0;
        Object stackOut_88_0 = null;
        ob stackOut_88_1 = null;
        ob stackOut_88_2 = null;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        Object stackOut_89_0 = null;
        ob stackOut_89_1 = null;
        ob stackOut_89_2 = null;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        Object stackOut_92_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        String stackOut_132_0 = null;
        String stackOut_130_0 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ((ut) this).field_db = ma.a(-114, ft.field_m);
                if (((ut) this).field_db.length > 0) {
                  var2_int = 0;
                  L3: while (true) {
                    L4: {
                      if (~var2_int <= ~((ut) this).field_db.length) {
                        break L4;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_62_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L5: {
                            L6: {
                              if (((ut) this).field_db[var2_int] != null) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3 = var2_int + 1;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (~((ut) this).field_db.length >= ~var3) {
                                    break L9;
                                  } else {
                                    stackOut_14_0 = null;
                                    stackOut_14_1 = ((ut) this).field_db[var3];
                                    stackIn_33_0 = stackOut_14_0;
                                    stackIn_33_1 = stackOut_14_1;
                                    stackIn_15_0 = stackOut_14_0;
                                    stackIn_15_1 = stackOut_14_1;
                                    if (var9 != 0) {
                                      break L8;
                                    } else {
                                      L10: {
                                        L11: {
                                          if (stackIn_15_0 != (Object) (Object) stackIn_15_1) {
                                            break L11;
                                          } else {
                                            if (var9 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        if (~((ut) this).field_db[var3].field_b != ~((ut) this).field_db[var2_int].field_b) {
                                          break L10;
                                        } else {
                                          if (~((ut) this).field_db[var3].field_a != ~((ut) this).field_db[var2_int].field_a) {
                                            break L10;
                                          } else {
                                            ((ut) this).field_db[var3] = null;
                                            break L10;
                                          }
                                        }
                                      }
                                      var3++;
                                      if (var9 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (null == ra.field_e) {
                                  break L5;
                                } else {
                                  stackOut_31_0 = null;
                                  stackOut_31_1 = ((ut) this).field_db[var2_int];
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  break L8;
                                }
                              }
                              if (stackIn_33_0 == (Object) (Object) stackIn_33_1) {
                                break L5;
                              } else {
                                if (ra.field_e.c(((ut) this).field_db[var2_int].field_b, 122, ((ut) this).field_db[var2_int].field_a)) {
                                  break L5;
                                } else {
                                  ((ut) this).field_db[var2_int] = null;
                                  break L5;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int = 0;
                    var3 = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (var3 >= ((ut) this).field_db.length) {
                            break L14;
                          } else {
                            stackOut_42_0 = ((ut) this).field_db;
                            stackIn_50_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var9 != 0) {
                              break L13;
                            } else {
                              L15: {
                                if (stackIn_43_0[var3] == null) {
                                  break L15;
                                } else {
                                  var2_int++;
                                  break L15;
                                }
                              }
                              var3++;
                              if (var9 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        stackOut_49_0 = ((ut) this).field_db;
                        stackIn_50_0 = stackOut_49_0;
                        break L13;
                      }
                      var3_ref_ls__ = stackIn_50_0;
                      ((ut) this).field_db = new ls[var2_int];
                      var4 = 0;
                      var5 = 0;
                      L16: while (true) {
                        L17: {
                          L18: {
                            if (var5 >= var3_ref_ls__.length) {
                              break L18;
                            } else {
                              stackOut_52_0 = (ls[]) var3_ref_ls__;
                              stackOut_52_1 = var5;
                              stackIn_60_0 = stackOut_52_0;
                              stackIn_60_1 = stackOut_52_1;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              if (var9 != 0) {
                                break L17;
                              } else {
                                L19: {
                                  if (stackIn_53_0[stackIn_53_1] == null) {
                                    break L19;
                                  } else {
                                    int incrementValue$1 = var4;
                                    var4++;
                                    ((ut) this).field_db[incrementValue$1] = var3_ref_ls__[var5];
                                    break L19;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          stackOut_59_0 = ((ut) this).field_db;
                          stackOut_59_1 = 1680474497;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          break L17;
                        }
                        uf.a(stackIn_60_0, stackIn_60_1);
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_61_0 = this;
              stackIn_62_0 = stackOut_61_0;
              break L1;
            }
            L20: {
              stackOut_62_0 = this;
              stackIn_65_0 = stackOut_62_0;
              stackIn_63_0 = stackOut_62_0;
              if (((ut) this).field_db.length <= 0) {
                stackOut_65_0 = this;
                stackOut_65_1 = 0;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                break L20;
              } else {
                stackOut_63_0 = this;
                stackOut_63_1 = 1;
                stackIn_66_0 = stackOut_63_0;
                stackIn_66_1 = stackOut_63_1;
                break L20;
              }
            }
            L21: {
              ((ut) this).field_jb = stackIn_66_1 != 0;
              var2_int = pr.b(85) ? 1 : 0;
              stackOut_66_0 = this;
              stackIn_69_0 = stackOut_66_0;
              stackIn_67_0 = stackOut_66_0;
              if (nw.g(79)) {
                stackOut_69_0 = this;
                stackOut_69_1 = 0;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                break L21;
              } else {
                stackOut_67_0 = this;
                stackOut_67_1 = 1;
                stackIn_70_0 = stackOut_67_0;
                stackIn_70_1 = stackOut_67_1;
                break L21;
              }
            }
            L22: {
              ((ut) this).field_hb = stackIn_70_1 != 0;
              if (var2_int != 0) {
                stackOut_73_0 = 3;
                stackIn_74_0 = stackOut_73_0;
                break L22;
              } else {
                stackOut_71_0 = 2;
                stackIn_74_0 = stackOut_71_0;
                break L22;
              }
            }
            L23: {
              L24: {
                var3 = stackIn_74_0;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (null == ra.field_e) {
                    break L24;
                  } else {
                    if (!ra.field_e.d((byte) 122)) {
                      break L24;
                    } else {
                      stackOut_81_0 = 1;
                      stackIn_84_0 = stackOut_81_0;
                      break L23;
                    }
                  }
                }
              }
              stackOut_83_0 = 0;
              stackIn_84_0 = stackOut_83_0;
              break L23;
            }
            L25: {
              L26: {
                var4 = stackIn_84_0;
                stackOut_84_0 = this;
                stackOut_84_1 = null;
                stackOut_84_2 = null;
                stackOut_84_3 = 10;
                stackIn_89_0 = stackOut_84_0;
                stackIn_89_1 = stackOut_84_1;
                stackIn_89_2 = stackOut_84_2;
                stackIn_89_3 = stackOut_84_3;
                stackIn_85_0 = stackOut_84_0;
                stackIn_85_1 = stackOut_84_1;
                stackIn_85_2 = stackOut_84_2;
                stackIn_85_3 = stackOut_84_3;
                if (var2_int != 0) {
                  break L26;
                } else {
                  stackOut_85_0 = this;
                  stackOut_85_1 = null;
                  stackOut_85_2 = null;
                  stackOut_85_3 = stackIn_85_3;
                  stackIn_89_0 = stackOut_85_0;
                  stackIn_89_1 = stackOut_85_1;
                  stackIn_89_2 = stackOut_85_2;
                  stackIn_89_3 = stackOut_85_3;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  stackIn_86_2 = stackOut_85_2;
                  stackIn_86_3 = stackOut_85_3;
                  if (var4 != 0) {
                    break L26;
                  } else {
                    stackOut_86_0 = this;
                    stackOut_86_1 = null;
                    stackOut_86_2 = null;
                    stackOut_86_3 = stackIn_86_3;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    stackIn_88_3 = stackOut_86_3;
                    stackOut_88_0 = this;
                    stackOut_88_1 = null;
                    stackOut_88_2 = null;
                    stackOut_88_3 = stackIn_88_3;
                    stackOut_88_4 = 75;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    stackIn_90_2 = stackOut_88_2;
                    stackIn_90_3 = stackOut_88_3;
                    stackIn_90_4 = stackOut_88_4;
                    break L25;
                  }
                }
              }
              stackOut_89_0 = this;
              stackOut_89_1 = null;
              stackOut_89_2 = null;
              stackOut_89_3 = stackIn_89_3;
              stackOut_89_4 = 58;
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              stackIn_90_3 = stackOut_89_3;
              stackIn_90_4 = stackOut_89_4;
              break L25;
            }
            L27: {
              ((ut) this).field_gb = new ob(stackIn_90_3, stackIn_90_4, 410, 105, (kh) null, var3, 1);
              ((ut) this).field_gb.field_Q = 83;
              ((ut) this).field_gb.d(5, 57, 5);
              ((ut) this).a((byte) 10, (kb) (Object) ((ut) this).field_gb);
              ((ut) this).field_mb = this.a((qo) this, oq.field_j, oa.field_H, false);
              if (var2_int == 0) {
                break L27;
              } else {
                ((ut) this).field_Z = this.a((qo) this, jd.field_n, dq.field_e, false);
                break L27;
              }
            }
            L28: {
              ((ut) this).field_bb = this.a((qo) this, oo.field_e, tg.field_b, false);
              stackOut_92_0 = this;
              stackIn_95_0 = stackOut_92_0;
              stackIn_93_0 = stackOut_92_0;
              if (var2_int != 0) {
                stackOut_95_0 = this;
                stackOut_95_1 = 3;
                stackIn_96_0 = stackOut_95_0;
                stackIn_96_1 = stackOut_95_1;
                break L28;
              } else {
                stackOut_93_0 = this;
                stackOut_93_1 = 2;
                stackIn_96_0 = stackOut_93_0;
                stackIn_96_1 = stackOut_93_1;
                break L28;
              }
            }
            L29: {
              ((ut) this).field_kb = new fw[stackIn_96_1];
              ((ut) this).field_kb[0] = ((ut) this).field_mb;
              if (var2_int == 0) {
                break L29;
              } else {
                ((ut) this).field_kb[2] = ((ut) this).field_Z;
                break L29;
              }
            }
            L30: {
              ((ut) this).field_kb[1] = ((ut) this).field_bb;
              if (!((ut) this).field_jb) {
                break L30;
              } else {
                if (var2_int != 0) {
                  var5_ref_String__ = new String[((ut) this).field_db.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L31: while (true) {
                    L32: {
                      L33: {
                        if (var7_int >= ((ut) this).field_db.length) {
                          break L33;
                        } else {
                          var8 = ((ut) this).field_db[var7_int];
                          if (var9 != 0) {
                            break L32;
                          } else {
                            L34: {
                              if (null == wq.field_a) {
                                break L34;
                              } else {
                                if (var8.field_b != ra.field_e.field_f) {
                                  break L34;
                                } else {
                                  if (~ra.field_e.field_n == ~var8.field_a) {
                                    var6_int = var7_int;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            var5_ref_String__[var7_int] = var8.field_b + "<times>" + var8.field_a;
                            var7_int++;
                            if (var9 == 0) {
                              continue L31;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      ((ut) this).field_lb = new gh((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((ut) this).field_lb.a(((ut) this).field_bb.field_B + ((ut) this).field_gb.field_B, 126, ((ut) this).field_bb.field_w + ((ut) this).field_bb.field_p + (((ut) this).field_gb.field_p + -19), 8192, 18);
                      break L32;
                    }
                    ((ut) this).field_D.a(750, (tc) (Object) ((ut) this).field_lb);
                    break L30;
                  }
                } else {
                  break L30;
                }
              }
            }
            L35: {
              L36: {
                ((ut) this).field_X = this.a((byte) 38, pe.field_w, (qo) this);
                var5 = ((ut) this).field_X.field_l / 2 + ((ut) this).field_X.field_B;
                ((ut) this).field_X.field_l = 150;
                ((ut) this).field_X.field_B = -((ut) this).field_X.field_l + -20 + var5;
                ((ut) this).field_ab = this.a((byte) 38, nr.field_f, (qo) this);
                ((ut) this).field_ab.field_I = false;
                ((ut) this).field_ab.field_B = var5 - -20;
                ((ut) this).field_ab.field_l = ((ut) this).field_X.field_l;
                if (var2_int != 0) {
                  break L36;
                } else {
                  if (var4 == 0) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
              L37: {
                if (var2_int != 0) {
                  stackOut_132_0 = oj.field_l;
                  stackIn_133_0 = stackOut_132_0;
                  break L37;
                } else {
                  stackOut_130_0 = fj.field_w;
                  stackIn_133_0 = stackOut_130_0;
                  break L37;
                }
              }
              var6_ref = stackIn_133_0;
              var7 = new kb(var6_ref, (qo) null);
              var7.field_p = 163;
              var7.field_B = 0;
              var7.field_l = ((ut) this).field_l;
              var7.field_w = 80;
              var7.field_k = (kh) (Object) new lk(ArmiesOfGielinor.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((ut) this).a((byte) 10, var7);
              break L35;
            }
            L38: {
              ((ut) this).field_nb = false;
              var6 = this.o(-1);
              if (var6 == null) {
                break L38;
              } else {
                var6.field_K = true;
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var2 = decompiledCaughtException;
            stackOut_138_0 = (RuntimeException) var2;
            stackOut_138_1 = new StringBuilder().append("ut.<init>(");
            stackIn_141_0 = stackOut_138_0;
            stackIn_141_1 = stackOut_138_1;
            stackIn_139_0 = stackOut_138_0;
            stackIn_139_1 = stackOut_138_1;
            if (param0 == null) {
              stackOut_141_0 = (RuntimeException) (Object) stackIn_141_0;
              stackOut_141_1 = (StringBuilder) (Object) stackIn_141_1;
              stackOut_141_2 = "null";
              stackIn_142_0 = stackOut_141_0;
              stackIn_142_1 = stackOut_141_1;
              stackIn_142_2 = stackOut_141_2;
              break L39;
            } else {
              stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
              stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
              stackOut_139_2 = "{...}";
              stackIn_142_0 = stackOut_139_0;
              stackIn_142_1 = stackOut_139_1;
              stackIn_142_2 = stackOut_139_2;
              break L39;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_142_0, stackIn_142_2 + ')');
        }
    }

    private final fw o(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        fw stackIn_5_0 = null;
        fw stackIn_14_0 = null;
        fw stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_13_0 = null;
        fw stackOut_15_0 = null;
        fw stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -1) {
              if (wq.field_a == null) {
                L1: {
                  if (ra.field_e == null) {
                    break L1;
                  } else {
                    if (!ra.field_e.field_h) {
                      break L1;
                    } else {
                      if (((ut) this).field_Z == null) {
                        break L1;
                      } else {
                        stackOut_13_0 = ((ut) this).field_Z;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                }
                stackOut_15_0 = ((ut) this).field_mb;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_4_0 = ((ut) this).field_bb;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fw) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "ut.IA(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                fw discarded$1 = this.a((qo) null, (String) null, (ru[]) null, true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == ((ut) this).field_X) {
                  break L3;
                } else {
                  L4: {
                    if (param4 == ((ut) this).field_ab) {
                      break L4;
                    } else {
                      L5: {
                        if (param4 == ((ut) this).field_mb) {
                          break L5;
                        } else {
                          L6: {
                            if (param4 != ((ut) this).field_Z) {
                              break L6;
                            } else {
                              this.a(param4, (byte) 34);
                              if (var7 == 0) {
                                break L2;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (((ut) this).field_lb == null) {
                                break L8;
                              } else {
                                if (!((ut) this).field_lb.field_t) {
                                  break L8;
                                } else {
                                  stackOut_23_0 = 1;
                                  stackIn_26_0 = stackOut_23_0;
                                  break L7;
                                }
                              }
                            }
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            break L7;
                          }
                          L9: {
                            var6_int = stackIn_26_0;
                            if (var6_int != 0) {
                              break L9;
                            } else {
                              if (param4 != ((ut) this).field_bb) {
                                break L9;
                              } else {
                                L10: {
                                  if (((ut) this).field_jb) {
                                    break L10;
                                  } else {
                                    ((ut) this).field_G.a((kb) (Object) new ud(((ut) this).field_G, hm.field_h), 0);
                                    if (var7 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (df.field_M <= 0) {
                                    break L11;
                                  } else {
                                    this.a(param4, (byte) 34);
                                    if (var7 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                ((ut) this).field_G.a((kb) (Object) new tn(((ut) this).field_G), 0);
                                break L9;
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.a(param4, (byte) 34);
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.r(param1 + -12);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.n(118);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var6;
            stackOut_54_1 = new StringBuilder().append("ut.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L12;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L12;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        qk.field_d = (param0 << -1851057136) / 150;
        qk.field_c = param0 * 400 / 150;
        if (param1 != 122) {
            return;
        }
        try {
            qk.field_a = param0 * 100 / 150;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ut.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ut) this).field_mb != ((ut) this).field_Y) {
                  break L2;
                } else {
                  ck.b(param0 + -59);
                  jb.e(param0 ^ -17024);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (((ut) this).field_Y != ((ut) this).field_Z) {
                  break L3;
                } else {
                  ck.b(-109);
                  jj.a(-4223);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (((ut) this).field_bb != ((ut) this).field_Y) {
                break L1;
              } else {
                L4: {
                  if (((ut) this).field_lb == null) {
                    break L4;
                  } else {
                    var2_int = ((ut) this).field_lb.a((byte) 71);
                    if (var2_int < 0) {
                      break L4;
                    } else {
                      ra.field_e.a(((ut) this).field_db[var2_int].field_b, ((ut) this).field_db[var2_int].field_a, -8717);
                      break L4;
                    }
                  }
                }
                sm.a(true, param0 + 8029);
                ((ut) this).field_G.a((kb) (Object) new cs(((ut) this).field_G), 0);
                break L1;
              }
            }
            L5: {
              if (param0 == -1) {
                break L5;
              } else {
                ((ut) this).field_Y = null;
                break L5;
              }
            }
            ((ut) this).field_ab.field_I = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "ut.K(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException runtimeException = null;
        fw[] var2 = null;
        int var3 = 0;
        fw var4 = null;
        int var5 = 0;
        fw stackIn_5_0 = null;
        fw stackIn_7_0 = null;
        fw stackIn_9_0 = null;
        fw stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_4_0 = null;
        fw stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        fw stackOut_5_0 = null;
        fw stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = ((ut) this).field_kb;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2.length >= ~var3) {
                    break L3;
                  } else {
                    var4 = var2[var3];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_4_0 = (fw) var4;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (((ut) this).field_Y != var4) {
                          stackOut_9_0 = (fw) (Object) stackIn_9_0;
                          stackOut_9_1 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L4;
                        } else {
                          stackOut_5_0 = (fw) (Object) stackIn_5_0;
                          stackIn_7_0 = stackOut_5_0;
                          stackOut_7_0 = (fw) (Object) stackIn_7_0;
                          stackOut_7_1 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          break L4;
                        }
                      }
                      stackIn_10_0.field_K = stackIn_10_1 != 0;
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -37) {
                  break L2;
                } else {
                  ((ut) this).field_nb = true;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "ut.R(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              pp.field_R[kt.field_p] = param5;
              vt.field_m[kt.field_p] = kt.field_p;
              no.field_U[kt.field_p] = param2;
              if (df.field_T >= param2) {
                break L1;
              } else {
                se.field_e = param2;
                break L1;
              }
            }
            L2: {
              if (param2 >= pd.field_e) {
                break L2;
              } else {
                sq.field_k = param2;
                break L2;
              }
            }
            L3: {
              wp.field_w[kt.field_p] = param3;
              ci.field_c[kt.field_p] = param0;
              pe.field_s[kt.field_p] = param1;
              var6_int = param0 + (param3 + param1);
              if (var6_int != 0) {
                stackOut_9_0 = 1000 * param3 / var6_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_7_0 = 0;
                stackIn_10_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_10_0;
              tb.field_h[kt.field_p] = var7;
              kt.field_p = kt.field_p + 1;
              if (sq.field_k > var7) {
                sq.field_k = var7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param4 > 120) {
                break L5;
              } else {
                ut.i((byte) 86);
                break L5;
              }
            }
            L6: {
              if (se.field_e >= var7) {
                break L6;
              } else {
                se.field_e = var7;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "ut.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static sc a(bv param0, byte param1, int param2) {
        sc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        sc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        sc stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
            if (param2 == 0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (sc) (Object) stackIn_4_0;
            } else {
              if (param1 <= -31) {
                var3 = new sc();
                no.a(param0, (uo) (Object) var3, param2, -24721);
                stackOut_8_0 = (sc) var3;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (sc) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ut.G(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    public static void p(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_W = null;
              field_ib = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_fb = -111;
                break L1;
              }
            }
            field_cb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ut.O(" + param0 + ')');
        }
    }

    final static void i(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              mu.field_a = null;
              qc.field_j = 0;
              if (vs.field_j) {
                rd.field_j = null;
                vs.field_j = false;
                bc.field_a = null;
                ef.b(-1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (pv.field_c) {
                pq.field_f = null;
                fi.field_u = new at();
                var1_array = ei.field_e;
                var2 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (8 <= var2) {
                        break L5;
                      } else {
                        var1_array[var2] = 0;
                        var2++;
                        if (var3 != 0) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var1_array = i.field_Nb;
                    break L4;
                  }
                  var2 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var2 >= 8) {
                          break L8;
                        } else {
                          var1_array[var2] = 0;
                          var2++;
                          if (var3 != 0) {
                            break L7;
                          } else {
                            if (var3 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      var1_array = rq.field_n;
                      break L7;
                    }
                    var2 = 0;
                    L9: while (true) {
                      L10: {
                        if (8 <= var2) {
                          break L10;
                        } else {
                          var1_array[var2] = 0;
                          var2++;
                          if (var3 != 0) {
                            break L2;
                          } else {
                            if (var3 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      pv.field_c = false;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              if (cl.field_t) {
                vh.i((byte) -97);
                pu.d(-112);
                da.c(-120);
                cl.field_t = false;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0 >= 120) {
                break L12;
              } else {
                ut.a(-43, 103, -36, -123, (byte) 96, -93);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ut.A(" + param0 + ')');
        }
    }

    private final void a(fw param0, byte param1) {
        fw var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ls var5 = null;
        fw stackIn_4_0 = null;
        fw stackIn_6_0 = null;
        fw stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_3_0 = null;
        fw stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        fw stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 34) {
                break L1;
              } else {
                ((ut) this).a(91, 13, -99, (kb) null);
                break L1;
              }
            }
            L2: {
              ((ut) this).field_Y = param0;
              boolean discarded$2 = param0.a(11, (kb) this);
              var3 = this.o(-1);
              stackOut_3_0 = ((ut) this).field_ab;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var3 == param0) {
                stackOut_6_0 = (fw) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = (fw) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_I = stackIn_7_1 != 0;
              if (((ut) this).field_bb != param0) {
                break L3;
              } else {
                if (var3 != param0) {
                  break L3;
                } else {
                  if (((ut) this).field_lb == null) {
                    break L3;
                  } else {
                    L4: {
                      var4 = ((ut) this).field_lb.a((byte) 71);
                      var5 = ((ut) this).field_db[var4];
                      if (~ra.field_e.field_f != ~var5.field_b) {
                        break L4;
                      } else {
                        if (ra.field_e.field_n != var5.field_a) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((ut) this).field_ab.field_I = true;
                    break L3;
                  }
                }
              }
            }
            this.q(-108);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("ut.U(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
    }

    private final fw a(byte param0, String param1, qo param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fw stackIn_4_0 = null;
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
        fw stackOut_3_0 = null;
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
              var4 = new fw(param1, param2);
              var4.field_k = (kh) (Object) new nu();
              if (param0 == 38) {
                break L1;
              } else {
                field_eb = 126;
                break L1;
              }
            }
            var5 = ((ut) this).field_w - 46;
            var4.a(15, -14 + (((ut) this).field_l + -16), var5, 8192, 30);
            ((ut) this).a((byte) 10, (kb) (Object) var4);
            stackOut_3_0 = (fw) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("ut.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        RuntimeException var5 = null;
        fw[] var5_array = null;
        int var6 = 0;
        fw var7 = null;
        int var8 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_24_1 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_22_0 = false;
        int stackOut_22_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (!lk.field_f) {
                  break L2;
                } else {
                  param3.f(1);
                  var5_array = ((ut) this).field_kb;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= var5_array.length) {
                      break L2;
                    } else {
                      var7 = var5_array[var6];
                      stackOut_4_0 = var7.field_t;
                      stackIn_12_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0) {
                            boolean discarded$1 = var7.a(param0 ^ 32729, (kb) this);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = ((ut) this).field_hb;
              stackIn_12_0 = stackOut_11_0;
              break L1;
            }
            L5: {
              if (stackIn_12_0) {
                break L5;
              } else {
                if (nw.g(115)) {
                  break L5;
                } else {
                  this.n(88);
                  ((ut) this).field_G.a((kb) (Object) new ut(((ut) this).field_G), 0);
                  break L5;
                }
              }
            }
            L6: {
              if (null == ((ut) this).field_lb) {
                break L6;
              } else {
                L7: {
                  stackOut_19_0 = ((ut) this).field_lb.l(11180);
                  stackIn_24_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (((ut) this).field_nb) {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L7;
                  } else {
                    stackOut_20_0 = stackIn_20_0;
                    stackIn_22_0 = stackOut_20_0;
                    stackOut_22_0 = stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_25_1 = stackOut_22_1;
                    break L7;
                  }
                }
                if ((stackIn_25_0 ? 1 : 0) != stackIn_25_1) {
                  break L6;
                } else {
                  this.a(((ut) this).field_bb, (byte) 34);
                  ((ut) this).field_nb = ((ut) this).field_lb.l(11180);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("ut.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                ((ut) this).field_bb = null;
                break L1;
              }
            }
            if (!((ut) this).field_L) {
              return;
            } else {
              ((ut) this).field_L = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "ut.T(" + param0 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_117_0 = 0;
        boolean stackIn_119_0 = false;
        Object stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        Object stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        Object stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_85_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_118_0 = false;
        Object stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        Object stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        Object stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (!((ut) this).field_mb.a(false)) {
                L2: {
                  if (((ut) this).field_Z == null) {
                    break L2;
                  } else {
                    if (!((ut) this).field_Z.a(false)) {
                      break L2;
                    } else {
                      var5 = (Object) (Object) ((ut) this).field_Z;
                      break L1;
                    }
                  }
                }
                if (((ut) this).field_bb.a(false)) {
                  var5 = (Object) (Object) ((ut) this).field_bb;
                  break L1;
                } else {
                  if (!((ut) this).field_X.a(false)) {
                    if (((ut) this).field_ab.a(false)) {
                      var5 = (Object) (Object) ((ut) this).field_ab;
                      break L1;
                    } else {
                      if (((ut) this).field_mb.field_K) {
                        var5 = (Object) (Object) ((ut) this).field_mb;
                        break L1;
                      } else {
                        L3: {
                          if (null == ((ut) this).field_Z) {
                            break L3;
                          } else {
                            if (((ut) this).field_Z.field_K) {
                              var5 = (Object) (Object) ((ut) this).field_Z;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (!((ut) this).field_bb.field_K) {
                          break L1;
                        } else {
                          var5 = (Object) (Object) ((ut) this).field_bb;
                          break L1;
                        }
                      }
                    }
                  } else {
                    var5 = (Object) (Object) ((ut) this).field_X;
                    break L1;
                  }
                }
              } else {
                var5 = (Object) (Object) ((ut) this).field_mb;
                break L1;
              }
            }
            L4: {
              if (param3 == -12215) {
                break L4;
              } else {
                ut.i((byte) 84);
                break L4;
              }
            }
            L5: {
              L6: {
                var6 = param1;
                if (var6 == 96) {
                  break L6;
                } else {
                  if (var6 == 97) {
                    if ((Object) (Object) ((ut) this).field_mb != var5) {
                      if ((Object) (Object) ((ut) this).field_Z == var5) {
                        boolean discarded$13 = ((ut) this).field_bb.a(11, (kb) this);
                        stackOut_85_0 = 1;
                        stackIn_86_0 = stackOut_85_0;
                        return stackIn_86_0 != 0;
                      } else {
                        if (var5 != (Object) (Object) ((ut) this).field_X) {
                          break L5;
                        } else {
                          if (!((ut) this).field_ab.field_I) {
                            break L5;
                          } else {
                            boolean discarded$14 = ((ut) this).field_ab.a(11, (kb) this);
                            stackOut_91_0 = 1;
                            stackIn_92_0 = stackOut_91_0;
                            return stackIn_92_0 != 0;
                          }
                        }
                      }
                    } else {
                      L7: {
                        L8: {
                          if (((ut) this).field_Z == null) {
                            break L8;
                          } else {
                            boolean discarded$15 = ((ut) this).field_Z.a(11, (kb) this);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        boolean discarded$16 = ((ut) this).field_bb.a(11, (kb) this);
                        break L7;
                      }
                      stackOut_80_0 = 1;
                      stackIn_81_0 = stackOut_80_0;
                      return stackIn_81_0 != 0;
                    }
                  } else {
                    L9: {
                      if (var6 != 98) {
                        break L9;
                      } else {
                        if (var7 == 0) {
                          if (var5 != (Object) (Object) ((ut) this).field_X) {
                            if ((Object) (Object) ((ut) this).field_ab == var5) {
                              boolean discarded$17 = ((ut) this).field_bb.a(param3 + 12226, (kb) this);
                              stackOut_99_0 = 1;
                              stackIn_100_0 = stackOut_99_0;
                              return stackIn_100_0 != 0;
                            } else {
                              break L5;
                            }
                          } else {
                            boolean discarded$18 = ((ut) this).field_mb.a(11, (kb) this);
                            stackOut_94_0 = 1;
                            stackIn_95_0 = stackOut_94_0;
                            return stackIn_95_0 != 0;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (99 != var6) {
                      break L5;
                    } else {
                      if (var7 == 0) {
                        L10: {
                          if ((Object) (Object) ((ut) this).field_mb == var5) {
                            break L10;
                          } else {
                            if ((Object) (Object) ((ut) this).field_Z != var5) {
                              if (var5 != (Object) (Object) ((ut) this).field_bb) {
                                break L5;
                              } else {
                                L11: {
                                  L12: {
                                    if (!((ut) this).field_ab.field_I) {
                                      break L12;
                                    } else {
                                      boolean discarded$19 = ((ut) this).field_ab.a(11, (kb) this);
                                      if (var7 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  boolean discarded$20 = ((ut) this).field_X.a(param3 ^ -12222, (kb) this);
                                  break L11;
                                }
                                stackOut_116_0 = 1;
                                stackIn_117_0 = stackOut_116_0;
                                return stackIn_117_0 != 0;
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        boolean discarded$21 = ((ut) this).field_X.a(11, (kb) this);
                        stackOut_105_0 = 1;
                        stackIn_106_0 = stackOut_105_0;
                        return stackIn_106_0 != 0;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              if (var5 == (Object) (Object) ((ut) this).field_bb) {
                L13: {
                  L14: {
                    if (((ut) this).field_Z == null) {
                      break L14;
                    } else {
                      boolean discarded$22 = ((ut) this).field_Z.a(11, (kb) this);
                      if (var7 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  boolean discarded$23 = ((ut) this).field_mb.a(param3 + 12226, (kb) this);
                  break L13;
                }
                stackOut_61_0 = 1;
                stackIn_62_0 = stackOut_61_0;
                return stackIn_62_0 != 0;
              } else {
                if (var5 != (Object) (Object) ((ut) this).field_Z) {
                  if ((Object) (Object) ((ut) this).field_ab == var5) {
                    boolean discarded$24 = ((ut) this).field_X.a(11, (kb) this);
                    stackOut_69_0 = 1;
                    stackIn_70_0 = stackOut_69_0;
                    return stackIn_70_0 != 0;
                  } else {
                    break L5;
                  }
                } else {
                  boolean discarded$25 = ((ut) this).field_mb.a(11, (kb) this);
                  stackOut_64_0 = 1;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0 != 0;
                }
              }
            }
            stackOut_118_0 = super.a(param0, param1, param2, -12215);
            stackIn_119_0 = stackOut_118_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_120_0 = var5;
            stackOut_120_1 = new StringBuilder().append("ut.F(");
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param0 == null) {
              stackOut_123_0 = stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L15;
            } else {
              stackOut_121_0 = stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L15;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_124_0, stackIn_124_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_119_0;
    }

    private final fw a(qo param0, String param1, ru[] param2, boolean param3) {
        fw var5 = null;
        RuntimeException var5_ref = null;
        ob var6 = null;
        fw var7 = null;
        fw stackIn_4_0 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_3_0 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5 = new fw(param1, param0);
              var5.field_k = (kh) (Object) new ps(param2);
              if (!param3) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            var6 = ((ut) this).field_gb;
            var7 = var5;
            var6.a((kb) (Object) var7, var6.field_Q, 0);
            ((ut) this).field_gb.e(0);
            stackOut_3_0 = (fw) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("ut.E(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
          L4: {
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "Most cruel";
        field_W = new byte[1000][];
        field_fb = -1;
        field_cb = new String[]{"Barbarians believe staunchly that magic is a gift from the gods. They will attempt to destroy any that believe otherwise. Being barbarians, they will also destroy anyone that looks at them funny, or spills their mead.", "The beloved of Armadyl, god of the skies, the aviansie are an honourable race of birdmen. Their ability to fly giving them a great advantage on the battlefield.", "How the lower simian races attained sentience is unknown, though the monkey god, Marimbo, probably had something to do with it. ", "When foes refuse to get close enough for the barbarians to destroy them face to face, their women throw sharp sticks at the enemy until the situation resolves itself one way or the other.", "Once the King Black Dragon has joined the fight, the door is opened for his relatives to enter the battlefield behind him.", "The TzHaar are a race of creatures born of the volcano, made of rock and fire. They are a lumbering but honourable people; anger one and it will not soon forget. The TzHaar-Ket, members of the warrior caste, make formidable opponents.", "Ancient creatures of the deep, dagannoths are smarter and stronger than they might first appear. Their true numbers are hidden by the underwater abyss. ", "Creating a teleportation node is no easy feat, and there are few wizards in Gielinor who have the ability to do so. Any faction who has portal mages on their side will have a distinct advantage over their enemies.", "Priestly knights, paladins are both great warriors and devout believers. They take their godly duties as seriously as their combat training.", "The wise and ever-watchful owl reflects perfectly the qualities of Saradomin.", "Monks may not be renowned warriors, but their faith gives them another kind of strength.", "The various mages and wizards who follow Saradomin are well-practised in the magic arts.", "Upholders of peace and guardians of what is now Falador, the organisation known as the White Knights boasts many strong and honourable warriors.", "Proud and noble creatures renowned for their curative powers, though a unicorn’s horn can also do plenty of damage.", "Centaurs are mystical creatures not often seen in the world. The lower half of their bodies is that of a horse; the upper half is that of a man. They are considered expert bowmen.", "The princely lions exude grace and power, which is part of what makes them royalty among the big cats.", "The rangers who fight for Saradomin loose arrows with unerring accuracy, in part due to their frequent prayers.", "Priests are the most devout followers of Saradomin, devoting their lives to prayer, and spreading his divine message. This gives them a strong link to their god, and grants them the ability to create spiritual wards and protections.", "Proud and loyal warriors of Saradomin, the icyene have a godly strength flowing through their veins, and beautiful wings that grant them the power of flight.", "Werewolves have two faces: one is that of a man, albeit a hairy one; the other is that of a wolf man, a savage beast with an insatiable hunger for meat.", "The remains of the fallen dead from centuries-old battles, imbued with dark energy by a necromancer to create terrifying and deadly warriors.", "Necromancers are mages with power over death. Their magics allow them to raise and control armies of undead creatures.", "Not as well-schooled as Saradomin mages, but no less deadly, the Zamorak mages have turned to the forgotten, darker arts to gain their power.", "The Black Knights, also known as the Kinshra, were once allied to the White Knights, but theological differences caused a rift between the two organisations.", "Demons possess incredible power and capability for destruction.", "Zamorakians will use any tricks they can to increase their chances of winning a fight, and the benefits of deploying ranged units are not lost on them. Their rangers are the equal of any fielded by Saradominist forces.", "Servants of the demon lords, hellhounds are dispatched by their masters to claim the lives of the cursed. Being demonkind, though, they don't always like to wait for the slow hand of fate to play its part.", "Sea slugs have the ability to take over and control a host body through which to act out their will, with the ultimate aim of achieving total domination of all other races on Gielinor. To this end, they strive to cause as much chaos and strife as possible through the act of war.", "These magically animated stone statues are particularly difficult to kill and are rarely friendly.", "Pyrelords may only be low demons, but as creatures of ever-burning flame with pyromaniacal leanings, they are dangerous beings. They have the ability to burn down forests.", "To compensate for their small stature, gnomes have taken to training the beasts of Gielinor to aid them in combat. The terrorbird is the ideal creature for a mounted or shock unit, granting their riders great speed, and striking fear into enemies with their shrill cries.", "Wolves are noble creatures of the earth that can be fearsome, but once their trust is earned they become faithful and steadfast allies.", "Druids form the bulk of the human followers of Guthix. They aim to live a life of balance, both taking from and giving to the land. In desperate times, they will fight to maintain balance in the world. The druids' knowledge of herbs grants them the ability to heal other units.", "The Black Guard are an organised dwarven militia, tasked with policing dwarf settlements when not engaged in combat. The Black Guard are typically responsible for manning dwarf multicannons.", "A truly impressive feat of dwarven engineering, the multicannon is an extremely powerful and surprisingly mobile weapon that can fire heavy steel cannonballs accurately over great distances. When deployed this cannon deals fire damage, and as such can use the same fire weapons as a dragon.", "One of Gielinor's elemental giants, moss giants are essentially walking piles of moss. It has been suggested that all moss giants' beards (also made of moss) are entities separate from the giants themselves.", "The Void Knights are the fighting force of the human followers of Guthix. Working mostly in secret, they exist to make decisive strikes against any foe who seeks to unbalance the world. For centuries, they have been fighting a secret war against an invading force of extra-dimensional pests.", "Where the terrorbird gives the gnomes speed, the battle tortoise gives them strength. Typically, three gnomes – a rider, a mage and a ranger – will ride atop the shell of one of these giant tortoises to create a formidable combat unit.", "Gnomes do not rely only on animals to enhance their combat effectiveness, and with the invention of ‘copters have gained a significant height advantage.", "Jade vines are typical plants in that they exist only to grow, but they are atypical in that they grow with extraordinary speed and ferocity, and have limited awareness and a sense of self-preservation.", "Ents are trees so old they have gained sentience, and now roam the woodlands and forests of Gielinor, protecting and nurturing them.", "Falcons are the ideal bird for carrying messages through the dense forests of Isafdar, as well as being a useful flying skirmish unit.", "The black bear is stronger than its brown cousins found in the east, and will not think twice before mauling unsuspecting explorers who encroach on their territory. ", "The crystals that elves use in almost every aspect of their lives are given shape by singing to them, which makes songstresses very important elves. Elven weapons are also formed in this way, and when a songstress sings in battle she can boost the effectiveness of her allies, and even increase the morale of non-elf units.", "Shieldmaidens wield crystal shields, often with a dagger or small sword, which they use to protect elf pikemen and archers. Crystal shields can soak up a lot of damage, giving the shieldmaiden's brethren an opportunity to triumph.", "Grenwalls are odd creatures, and natural predators of the timid pawya. They have the ability to fire their spines like miniature arrows, a weapon they use to strike their pawya prey before it can burrow to safety.", "Dire wolves are larger and meaner than the grey and white wolves that commonly fall under Guthix's banner. They show no loyalty to anything other than their packs, and will defend their territory without mercy.", "Foot soldiers of the elf army, these pikemen wield a large-bladed crystal halberd and wear strong yet lightweight armour. Pikemen are well-trained and formidable soldiers.", "Elf archers wield crystal weaponry in the form of a longbow. This crystal bow does not require conventional arrows, but rather creates enchanted arrows of light. This allows the elves to rain death upon their foes with little need for resupply.", "Even the higher echelons of elf society will engage in war when necessary. Although they are born into a higher station, they spend as much time learning the art of warfare as their subordinates, if not more.", "Female elves take an active part in all aspects of elf society, including hunting and war. They may not favour the heavier weapons used by an elf lord, but they are formidable warriors.", "Crystalline shape-shifters are stealthy creatures. They have the ability to teleport over short distances, often right next to you. They can even teleport into the space you are standing in, killing you in the process.", "Goblins live for war. They are not blessed with much intelligence, but great numbers of them can overwhelm their enemies.", "Goblin religion is very basic – 'Do what you're told on pain of death' – so the role of priest is quite a straightforward one. This doesn't stop goblin priests from becoming strong warriors and accomplished spellcasters, focusing on magics that strengthen their allies and weaken their enemies.", "Even by comparison with the other followers of Bandos ogres are stupid, but they have a stronger sense of community than their green-skinned brethren. Ogres are big, hulking and immensely strong creatures.", "A breed of ogre adapted to living in the jungle, jogres have tough hides to help them resist the poisons of jungle spiders, and to protect them from the bites of insects.", "Mogres have developed the ability to breathe underwater, and now prefer to live in marine environments. They have retained the ability to breathe on land, however, and are no less deadly when they do come to the surface.", "The hobgoblin occupies the rung on the evolutionary ladder between goblin and ork, and so display the best and worst traits of both races.", "Ogre shamans are among the most powerful magic users in all of Gielinor. One of their nastier spells creates a thick, black smog in which other Bandosian units thrive.", "Related to hill giants, cyclopes are distinguished by having just one eye in the middle of their faces, and some even have horns on their heads. Their gaze can be quite entrancing, so it is best not to look them in the eye. What they lack in depth-perception they make up for in club-swinging.", "Larger, stronger, faster and ever-so-slightly smarter than goblins, the ork is the staple soldier of any Bandosian army. Although they lack general intelligence, they have grasped the basic principles of tactical combat.", "Ogre men are bad enough, but their female counterparts are stronger still. They're also ravenous, and will eat anything or anyone that gets in their way.", "Ourgs are giant creatures with incredible strength and power - enough to bring even a mountain down to size - and their size alone will scare off most enemies. There are few ourgs in the ranks of Bandos's armies, so they tend to hold positions of command.", "The Kalphite Queen rules over the rest of her hive. A hive mind has great strength, and unwary warriors can be overwhelmed by her workers, soldiers and guardians as they swarm to and cover the area around her.", "Creatures that thrive in the harsh desert are typically scavengers, and jackals are a prime example of this. They are often found in the outskirts of desert cities, living off the scraps left by the city's inhabitants.", "A mummy is the animated remains of a Menaphite who has been entombed in the proper ceremonial manner. The body's owner has long since departed for the afterlife, but the mummy carries on, protecting the burial places of the dead from grave-robbers.", "Locusts are as deadly and pitiless as the desert itself, and swarms of these creatures have the ability to completely destroy crops in a very short space of time. Some have even been known to grow to the size of a small camel.", "The Bedabin are a nomadic people, travelling through the desert and surviving on what little it provides. This tough lifestyle has made them a hardy people. They also possess the secret of making darts, a deadly thrown weapon.", "The desert town of Pollnivneach has the tendency to attract the worst elements of society, not least of which are the thuggish thieves from Menaphos. They'll not give a second thought to taking a cosh to the back of your head, and stealing all your worldly goods.", "These warriors are devout followers of Icthlarin, god of life and death. Icthlarin is worshipped both for caring for the living and for guiding the dead to the afterlife. His warriors uphold their god's values, and take their ceremonial duties particularly seriously.", "All along the banks of the River Elid, and in the swamplands to the desert's south-east, you will find crocodiles basking in the hot sun of the Kharidian Desert. Don't be fooled by their placid demeanour, though: if you get too close they'll take a bite out of you.", "The followers of the lesser desert god Scabaras long ago twisted their form to become insect-like in appearance. They have a preference for isolation, but still know how to handle unwanted company.", "Sphinxes are strange, chimeric creatures that speak in riddles, which allows them to beguile any enemy units that get close enough to hear them.", "These are elementals of Elidinis, the desert goddess of water. They have the ability to create water, which allows them to maintain the River Elid, among other things.", "King of the dragons, this three-headed, black-skinned beast has the ability to breathe fire, and it's many heads allow it two attacks per turn. Not many dragonslayers are hardy enough to survive an attack from this creature, and the second can be devastating."};
    }
}
