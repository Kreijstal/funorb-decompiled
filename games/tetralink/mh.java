/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static float field_c;
    static String field_f;
    static int field_a;
    static int field_b;
    static String field_e;
    static int field_g;
    static int field_d;

    public static void a(int param0) {
        if (param0 > -56) {
            mh.a(-37);
        }
        field_e = null;
        field_f = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int discarded$2 = 0;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                discarded$2 = mh.a(121, -17, 103, -39);
                break L1;
              }
            }
            L2: while (true) {
              param3--;
              if (0 > param3) {
                break L0;
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param4;
                var7 = param1;
                var9[var6] = var7 + (pl.a(var9[var6], 16711422) >> 1134962689);
                param4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("mh.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        hl var5_ref = null;
        int var5_int = 0;
        hl var6 = null;
        hl var7 = null;
        hl var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        je var17 = null;
        int var17_int = 0;
        Object var18 = null;
        gd var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var22 = null;
        String var24 = null;
        hl stackIn_17_0 = null;
        hl stackIn_18_0 = null;
        hl stackIn_19_0 = null;
        hl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_36_0 = 0;
        hl stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        hl stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        hl stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        hl stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        hl stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        hl stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        hl stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        hl stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        hl stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        hl stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        hl stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        hl stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        hl stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        hl stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        hl stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_16_0 = null;
        hl stackOut_17_0 = null;
        hl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        hl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        hl stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        hl stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        hl stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        hl stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        hl stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        hl stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        hl stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        hl stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        hl stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        hl stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        hl stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        hl stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        hl stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        hl stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        hl stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        var18 = null;
        var19 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              nb.a(am.field_f, (byte) 37);
              if (null != qb.field_N) {
                L2: {
                  qi.field_n.field_S = true;
                  nm.field_n.field_R = 0;
                  var5_ref = nm.field_n;
                  var5_ref.field_Hb = 0;
                  var6 = rn.field_c;
                  rn.field_c.field_R = 0;
                  var6.field_Hb = 0;
                  tn.field_a.field_R = 0;
                  var7 = tn.field_a;
                  var7.field_Hb = 0;
                  if (s.b(63)) {
                    L3: {
                      ua.field_d.field_jb = jn.field_d.toUpperCase();
                      var9 = (2 + fk.field_V.field_Hb) / 2;
                      nm.field_n.a((byte) -94, var9 + -2, -40 + fk.field_V.field_R, 40, 0);
                      if (qb.field_N.field_jc < qb.field_N.field_rc) {
                        nm.field_n.field_jb = ok.field_c.toUpperCase();
                        nm.field_n.field_S = true;
                        break L3;
                      } else {
                        nm.field_n.field_jb = cb.field_s.toUpperCase();
                        nm.field_n.field_S = false;
                        break L3;
                      }
                    }
                    L4: {
                      nm.field_n.field_Eb = rj.field_l.field_Eb;
                      if (ja.field_g <= 0) {
                        break L4;
                      } else {
                        L5: {
                          if ((ja.field_g ^ -1) != -2) {
                            var10_ref_String = sk.a(new String[]{Integer.toString(ja.field_g)}, field_e, 121);
                            break L5;
                          } else {
                            var10_ref_String = ca.field_d;
                            break L5;
                          }
                        }
                        L6: {
                          if ((16 & cb.field_u) != 0) {
                            break L6;
                          } else {
                            if (lg.field_S) {
                              break L6;
                            } else {
                              nm.field_n.field_Eb = rj.field_l.field_kb;
                              break L6;
                            }
                          }
                        }
                        nm.field_n.field_jb = nm.field_n.field_jb + "<br>" + var10_ref_String;
                        break L4;
                      }
                    }
                    L7: {
                      L8: {
                        rn.field_c.a((byte) -122, -var9 + fk.field_V.field_Hb, fk.field_V.field_R + -40, 40, var9);
                        rn.field_c.field_jb = lk.field_pb.toUpperCase();
                        var8 = rn.field_c;
                        stackOut_16_0 = rn.field_c;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (!param0) {
                          break L8;
                        } else {
                          stackOut_17_0 = (hl) ((Object) stackIn_17_0);
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (un.field_f != 0L) {
                            break L8;
                          } else {
                            stackOut_18_0 = (hl) ((Object) stackIn_18_0);
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_19_0 = (hl) ((Object) stackIn_19_0);
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L7;
                    }
                    L9: {
                      stackIn_20_0.field_S = stackIn_20_1 != 0;
                      var10 = 2;
                      if (null == uj.field_s) {
                        break L9;
                      } else {
                        L10: {
                          if (null != eg.field_K) {
                            break L10;
                          } else {
                            eg.field_K = new byte[hg.field_k];
                            rh.field_G = new boolean[hg.field_k];
                            break L10;
                          }
                        }
                        var11_int = 0;
                        L11: while (true) {
                          if (var11_int >= hg.field_k) {
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if (-3 >= (var10 ^ -1)) {
                                  break L13;
                                } else {
                                  var11_int = 0;
                                  var12 = 0;
                                  L14: while (true) {
                                    if (uj.field_s.length <= var12) {
                                      if (var11_int != 0) {
                                        break L13;
                                      } else {
                                        var10++;
                                        continue L12;
                                      }
                                    } else {
                                      var22 = uj.field_s[var12];
                                      var20 = var22;
                                      var13_array = var20;
                                      var14_int = 0;
                                      L15: while (true) {
                                        L16: {
                                          if (var14_int >= var22.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L17: while (true) {
                                              if (var22.length <= var15) {
                                                rh.field_G[var14_int] = true;
                                                break L16;
                                              } else {
                                                var16 = var22[var15];
                                                if (var14_int < var16) {
                                                  var14_int = var16;
                                                  var15 += 2;
                                                  continue L17;
                                                } else {
                                                  var15 += 2;
                                                  continue L17;
                                                }
                                              }
                                            }
                                          } else {
                                            L18: {
                                              var15 = var22[var14_int];
                                              var16 = var13_array[var14_int - -1];
                                              if ((var15 ^ -1) != 0) {
                                                if (var16 == (qb.field_N.field_sc[var15] & 255)) {
                                                  break L18;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                L19: {
                                                  if (var10 == 0) {
                                                    stackOut_35_0 = qb.field_N.field_rc;
                                                    stackIn_36_0 = stackOut_35_0;
                                                    break L19;
                                                  } else {
                                                    stackOut_34_0 = qb.field_N.field_jc;
                                                    stackIn_36_0 = stackOut_34_0;
                                                    break L19;
                                                  }
                                                }
                                                var17_int = stackIn_36_0;
                                                if (var16 == var17_int) {
                                                  break L18;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            var14_int += 2;
                                            continue L15;
                                          }
                                        }
                                        var12++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                              if (2 > dd.field_c) {
                                break L9;
                              } else {
                                if (!sn.field_a[12]) {
                                  break L9;
                                } else {
                                  var10 = 2;
                                  break L9;
                                }
                              }
                            }
                          } else {
                            rh.field_G[var11_int] = false;
                            var11_int++;
                            continue L11;
                          }
                        }
                      }
                    }
                    if (2 > var10) {
                      rn.field_c.field_S = false;
                      if (rn.field_c.field_rb) {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L20: while (true) {
                          if (hg.field_k <= var13_int) {
                            L21: {
                              if (0 == var10) {
                                var13 = mn.field_b;
                                if (var12 != 0) {
                                  var14 = hm.field_d + (String) (var11);
                                  break L21;
                                } else {
                                  var14 = sk.a(new String[]{(String) (var11)}, hb.field_f, 119);
                                  break L21;
                                }
                              } else {
                                var13 = gb.field_q;
                                if (var12 != 0) {
                                  var14 = o.field_p + (String) (var11);
                                  break L21;
                                } else {
                                  var14 = sk.a(new String[]{(String) (var11)}, mc.field_d, 127);
                                  break L21;
                                }
                              }
                            }
                            re.field_P = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            if (rh.field_G[var13_int]) {
                              L22: {
                                var24 = "<col=A00000>" + ll.field_y[var13_int] + "</col>";
                                if (var11 != null) {
                                  var12 = 1;
                                  var11 = (String) (var11) + ", " + var24;
                                  break L22;
                                } else {
                                  var11 = var24;
                                  break L22;
                                }
                              }
                              var13_int++;
                              continue L20;
                            } else {
                              var13_int++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L23: {
                        if (ba.field_S != null) {
                          break L23;
                        } else {
                          if (a.field_g != null) {
                            break L23;
                          } else {
                            if (bi.field_e != null) {
                              break L23;
                            } else {
                              if (null != ti.field_f) {
                                break L23;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      var11_int = 0;
                      var12 = 0;
                      var13_int = 0;
                      var14_int = 0;
                      var15 = 0;
                      var16 = 0;
                      L24: while (true) {
                        if (hg.field_k <= var16) {
                          var16 = 0;
                          var17 = v.field_x.field_Pb.field_fb;
                          var18_ref = (gd) ((Object) var17.c(false));
                          L25: while (true) {
                            L26: {
                              if (var18_ref == null) {
                                break L26;
                              } else {
                                if (var18_ref.d((byte) -1)) {
                                  var18_ref = (gd) ((Object) var17.a((byte) -70));
                                  continue L25;
                                } else {
                                  L27: {
                                    if (var11_int == 0) {
                                      break L27;
                                    } else {
                                      if (!var18_ref.field_Tb) {
                                        var16 = 1;
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  if (var18_ref.field_Pb < var13_int) {
                                    var16 = 1;
                                    break L26;
                                  } else {
                                    if (var14_int <= var18_ref.field_Qb) {
                                      if (-1 > ((var18_ref.field_Ub ^ -1) & var15 ^ -1)) {
                                        var16 = 1;
                                        break L26;
                                      } else {
                                        if (var12 != 0) {
                                          var16 = 1;
                                          break L26;
                                        } else {
                                          var18_ref = (gd) ((Object) var17.a((byte) -70));
                                          continue L25;
                                        }
                                      }
                                    } else {
                                      var16 = 1;
                                      break L26;
                                    }
                                  }
                                }
                              }
                            }
                            L28: {
                              if (2 > dd.field_c) {
                                break L28;
                              } else {
                                if (!sn.field_a[12]) {
                                  break L28;
                                } else {
                                  var16 = 0;
                                  break L28;
                                }
                              }
                            }
                            if (var16 == 0) {
                              break L2;
                            } else {
                              rn.field_c.field_S = false;
                              if (rn.field_c.field_rb) {
                                if (we.field_e.field_g.field_Lb != 0) {
                                  re.field_P = sk.a(new String[]{rl.field_e}, cn.field_b, 119);
                                  break L2;
                                } else {
                                  re.field_P = af.field_b;
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                        } else {
                          L29: {
                            var17_int = qb.field_N.field_sc[var16] & 255;
                            if (null == ba.field_S) {
                              break L29;
                            } else {
                              if (null == ba.field_S[var16]) {
                                break L29;
                              } else {
                                if (!ba.field_S[var16][var17_int]) {
                                  break L29;
                                } else {
                                  var11_int = 1;
                                  break L29;
                                }
                              }
                            }
                          }
                          L30: {
                            if (a.field_g == null) {
                              break L30;
                            } else {
                              if (null != a.field_g[var16]) {
                                L31: {
                                  var18_int = a.field_g[var16][var17_int];
                                  if (-1 == (var18_int ^ -1)) {
                                    break L31;
                                  } else {
                                    if (oa.field_r) {
                                      break L31;
                                    } else {
                                      var11_int = 1;
                                      break L31;
                                    }
                                  }
                                }
                                if (var18_int > var13_int) {
                                  var13_int = var18_int;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                          L32: {
                            if (null == bi.field_e) {
                              break L32;
                            } else {
                              if (bi.field_e[var16] != null) {
                                L33: {
                                  var18_int = bi.field_e[var16][var17_int];
                                  if (var18_int == 0) {
                                    break L33;
                                  } else {
                                    if (oa.field_r) {
                                      break L33;
                                    } else {
                                      var11_int = 1;
                                      break L33;
                                    }
                                  }
                                }
                                if (var18_int <= var14_int) {
                                  break L32;
                                } else {
                                  var14_int = var18_int;
                                  break L32;
                                }
                              } else {
                                if (null != ti.field_f) {
                                  if (null != ti.field_f[var16]) {
                                    var15 = var15 | ti.field_f[var16][var17_int];
                                    var16++;
                                    continue L24;
                                  } else {
                                    var16++;
                                    continue L24;
                                  }
                                } else {
                                  var16++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          if (null != ti.field_f) {
                            if (null != ti.field_f[var16]) {
                              var15 = var15 | ti.field_f[var16][var17_int];
                              var16++;
                              continue L24;
                            } else {
                              var16++;
                              continue L24;
                            }
                          } else {
                            var16++;
                            continue L24;
                          }
                        }
                      }
                    }
                  } else {
                    var9_ref_String = qb.field_N.field_ec;
                    ua.field_d.field_jb = sk.a(new String[]{var9_ref_String}, qe.field_e, 127).toUpperCase();
                    tn.field_a.a((byte) -110, fk.field_V.field_Hb, fk.field_V.field_R + -40, 40, 0);
                    tn.field_a.field_jb = sk.a(new String[]{var9_ref_String}, om.field_Xb, 123);
                    var8 = tn.field_a;
                    break L2;
                  }
                }
                L34: {
                  if ((un.field_f ^ -1L) != -1L) {
                    L35: {
                      var9 = (int)(-k.a(0) + un.field_f);
                      var9 = (999 + var9) / 1000;
                      if (1 > var9) {
                        var9 = 1;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    var8.field_jb = sk.a(new String[]{Integer.toString(var9)}, ki.field_a, 121);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                e.field_d.field_jb = sk.a(new String[]{Integer.toString(qb.field_N.field_jc), Integer.toString(qb.field_N.field_rc)}, pl.field_c, 126);
                break L1;
              } else {
                break L1;
              }
            }
            L36: {
              L37: {
                stackOut_145_0 = tl.field_P;
                stackOut_145_1 = 0;
                stackIn_149_0 = stackOut_145_0;
                stackIn_149_1 = stackOut_145_1;
                stackIn_146_0 = stackOut_145_0;
                stackIn_146_1 = stackOut_145_1;
                if (!param3) {
                  break L37;
                } else {
                  stackOut_146_0 = (hl) ((Object) stackIn_146_0);
                  stackOut_146_1 = stackIn_146_1;
                  stackIn_149_0 = stackOut_146_0;
                  stackIn_149_1 = stackOut_146_1;
                  stackIn_147_0 = stackOut_146_0;
                  stackIn_147_1 = stackOut_146_1;
                  if (param1) {
                    break L37;
                  } else {
                    stackOut_147_0 = (hl) ((Object) stackIn_147_0);
                    stackOut_147_1 = stackIn_147_1;
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_149_1 = stackOut_147_1;
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    if (lg.field_S) {
                      break L37;
                    } else {
                      stackOut_148_0 = (hl) ((Object) stackIn_148_0);
                      stackOut_148_1 = stackIn_148_1;
                      stackOut_148_2 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      stackIn_150_1 = stackOut_148_1;
                      stackIn_150_2 = stackOut_148_2;
                      break L36;
                    }
                  }
                }
              }
              stackOut_149_0 = (hl) ((Object) stackIn_149_0);
              stackOut_149_1 = stackIn_149_1;
              stackOut_149_2 = 0;
              stackIn_150_0 = stackOut_149_0;
              stackIn_150_1 = stackOut_149_1;
              stackIn_150_2 = stackOut_149_2;
              break L36;
            }
            L38: {
              L39: {
                ((hl) (Object) stackIn_150_0).a(stackIn_150_1, stackIn_150_2 != 0);
                var5_int = -59 % ((13 - param4) / 49);
                stackOut_150_0 = fk.field_V;
                stackOut_150_1 = 0;
                stackIn_154_0 = stackOut_150_0;
                stackIn_154_1 = stackOut_150_1;
                stackIn_151_0 = stackOut_150_0;
                stackIn_151_1 = stackOut_150_1;
                if (!param3) {
                  break L39;
                } else {
                  stackOut_151_0 = (hl) ((Object) stackIn_151_0);
                  stackOut_151_1 = stackIn_151_1;
                  stackIn_154_0 = stackOut_151_0;
                  stackIn_154_1 = stackOut_151_1;
                  stackIn_152_0 = stackOut_151_0;
                  stackIn_152_1 = stackOut_151_1;
                  if (param1) {
                    break L39;
                  } else {
                    stackOut_152_0 = (hl) ((Object) stackIn_152_0);
                    stackOut_152_1 = stackIn_152_1;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    if (lg.field_S) {
                      break L39;
                    } else {
                      stackOut_153_0 = (hl) ((Object) stackIn_153_0);
                      stackOut_153_1 = stackIn_153_1;
                      stackOut_153_2 = 1;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      stackIn_155_2 = stackOut_153_2;
                      break L38;
                    }
                  }
                }
              }
              stackOut_154_0 = (hl) ((Object) stackIn_154_0);
              stackOut_154_1 = stackIn_154_1;
              stackOut_154_2 = 0;
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              stackIn_155_2 = stackOut_154_2;
              break L38;
            }
            L40: {
              L41: {
                ((hl) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2 != 0);
                stackOut_155_0 = fj.field_b;
                stackOut_155_1 = 0;
                stackIn_159_0 = stackOut_155_0;
                stackIn_159_1 = stackOut_155_1;
                stackIn_156_0 = stackOut_155_0;
                stackIn_156_1 = stackOut_155_1;
                if (!param3) {
                  break L41;
                } else {
                  stackOut_156_0 = (hl) ((Object) stackIn_156_0);
                  stackOut_156_1 = stackIn_156_1;
                  stackIn_159_0 = stackOut_156_0;
                  stackIn_159_1 = stackOut_156_1;
                  stackIn_157_0 = stackOut_156_0;
                  stackIn_157_1 = stackOut_156_1;
                  if (param1) {
                    break L41;
                  } else {
                    stackOut_157_0 = (hl) ((Object) stackIn_157_0);
                    stackOut_157_1 = stackIn_157_1;
                    stackIn_159_0 = stackOut_157_0;
                    stackIn_159_1 = stackOut_157_1;
                    stackIn_158_0 = stackOut_157_0;
                    stackIn_158_1 = stackOut_157_1;
                    if (!lg.field_S) {
                      break L41;
                    } else {
                      stackOut_158_0 = (hl) ((Object) stackIn_158_0);
                      stackOut_158_1 = stackIn_158_1;
                      stackOut_158_2 = 1;
                      stackIn_160_0 = stackOut_158_0;
                      stackIn_160_1 = stackOut_158_1;
                      stackIn_160_2 = stackOut_158_2;
                      break L40;
                    }
                  }
                }
              }
              stackOut_159_0 = (hl) ((Object) stackIn_159_0);
              stackOut_159_1 = stackIn_159_1;
              stackOut_159_2 = 0;
              stackIn_160_0 = stackOut_159_0;
              stackIn_160_1 = stackOut_159_1;
              stackIn_160_2 = stackOut_159_2;
              break L40;
            }
            L42: {
              ((hl) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2 != 0);
              we.field_e.field_g.c(true);
              if (qb.field_N == null) {
                break L42;
              } else {
                L43: {
                  if (qi.field_n.field_F != 0) {
                    g.e(qb.field_N.j(-56), -125, param2);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (nm.field_n.field_F != 0) {
                    lg.field_S = true;
                    break L44;
                  } else {
                    break L44;
                  }
                }
                L45: {
                  if (0 == rn.field_c.field_F) {
                    break L45;
                  } else {
                    uf.field_b = true;
                    break L45;
                  }
                }
                L46: {
                  if (0 == c.field_b.field_F) {
                    break L46;
                  } else {
                    lg.field_S = false;
                    break L46;
                  }
                }
                hg.a(param2, qb.field_N, 30544, false);
                break L42;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "mh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, bh param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            var5 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  var9 = new byte[24];
                  var7 = var9;
                  var6 = var7;
                  var10 = var6;
                  var8 = var10;
                  var2 = var8;
                  if (sk.field_f == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        sk.field_f.a(0L, 0);
                        sk.field_f.a(var9, (byte) 66);
                        var3 = 0;
                        L3: while (true) {
                          L4: {
                            if ((var3 ^ -1) <= -25) {
                              break L4;
                            } else {
                              if (-1 == (var10[var3] ^ -1)) {
                                var3++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if ((var3 ^ -1) > -25) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (-25 >= (var4 ^ -1)) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                var3 = -39 % ((42 - param0) / 51);
                param1.a(0, 128, var10, 24);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (runtimeException);
                stackOut_15_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 - -param0 - -param2 <= ra.field_e) {
            return param0 + param1;
        }
        if (param3 != -8748) {
            field_b = 48;
        }
        if (-1 >= (-param2 + param1 ^ -1)) {
            return param1 - param2;
        }
        return ra.field_e + -param2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_e = "(<%0> players want to join)";
        field_b = 0;
        field_a = 9;
        field_g = -1;
        field_f = "Cancel draw";
    }
}
