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
                int discarded$2 = mh.a(121, -17, 103, -39);
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
                var9[var6] = var7 + (pl.a(var9[var6], 16711422) >> 1);
                param4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("mh.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        int[] var23 = null;
        int[] var26 = null;
        hl stackIn_17_0 = null;
        hl stackIn_18_0 = null;
        hl stackIn_19_0 = null;
        hl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_36_0 = 0;
        hl stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        hl stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        hl stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        hl stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        hl stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        hl stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        hl stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        hl stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        hl stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        hl stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        hl stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        hl stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        hl stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        hl stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        hl stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackIn_153_2 = 0;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_16_0 = null;
        hl stackOut_17_0 = null;
        hl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        hl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        hl stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        hl stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        hl stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        hl stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        hl stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        hl stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        hl stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        hl stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        hl stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        hl stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        hl stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        hl stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        hl stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        hl stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        hl stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int stackOut_152_2 = 0;
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
                          if (ja.field_g != 1) {
                            var10_ref_String = sk.a(new String[1], field_e, 121);
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
                          stackOut_17_0 = (hl) (Object) stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (un.field_f != 0L) {
                            break L8;
                          } else {
                            stackOut_18_0 = (hl) (Object) stackIn_18_0;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_19_0 = (hl) (Object) stackIn_19_0;
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
                                if (var10 >= 2) {
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
                                      var26 = uj.field_s[var12];
                                      var23 = var26;
                                      var22 = var23;
                                      var20 = var22;
                                      var13_array = var20;
                                      var14_int = 0;
                                      L15: while (true) {
                                        L16: {
                                          if (var14_int >= var26.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L17: while (true) {
                                              if (var26.length <= var15) {
                                                rh.field_G[var14_int] = true;
                                                break L16;
                                              } else {
                                                L18: {
                                                  var16 = var26[var15];
                                                  if (var14_int >= var16) {
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                var15 += 2;
                                                continue L17;
                                              }
                                            }
                                          } else {
                                            L19: {
                                              var15 = var26[var14_int];
                                              var16 = var13_array[var14_int - -1];
                                              if (var15 != -1) {
                                                if (var16 == (qb.field_N.field_sc[var15] & 255)) {
                                                  break L19;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                L20: {
                                                  if (var10 == 0) {
                                                    stackOut_35_0 = qb.field_N.field_rc;
                                                    stackIn_36_0 = stackOut_35_0;
                                                    break L20;
                                                  } else {
                                                    stackOut_34_0 = qb.field_N.field_jc;
                                                    stackIn_36_0 = stackOut_34_0;
                                                    break L20;
                                                  }
                                                }
                                                var17_int = stackIn_36_0;
                                                if (var16 == var17_int) {
                                                  break L19;
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
                        L21: while (true) {
                          if (hg.field_k <= var13_int) {
                            L22: {
                              if (0 == var10) {
                                var13 = mn.field_b;
                                var14 = var13;
                                var14 = var13;
                                if (var12 != 0) {
                                  var14 = hm.field_d + var11;
                                  break L22;
                                } else {
                                  var14 = sk.a(new String[1], hb.field_f, 119);
                                  break L22;
                                }
                              } else {
                                var13 = gb.field_q;
                                var14 = var13;
                                var14 = var13;
                                if (var12 != 0) {
                                  var14 = o.field_p + var11;
                                  break L22;
                                } else {
                                  var14 = sk.a(new String[1], mc.field_d, 127);
                                  break L22;
                                }
                              }
                            }
                            re.field_P = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            L23: {
                              if (!rh.field_G[var13_int]) {
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var13_int++;
                            continue L21;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L24: {
                        if (ba.field_S != null) {
                          break L24;
                        } else {
                          if (a.field_g != null) {
                            break L24;
                          } else {
                            if (bi.field_e != null) {
                              break L24;
                            } else {
                              if (null != ti.field_f) {
                                break L24;
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
                      L25: while (true) {
                        if (hg.field_k <= var16) {
                          var16 = 0;
                          var17 = v.field_x.field_Pb.field_fb;
                          var18_ref = (gd) (Object) var17.c(false);
                          L26: while (true) {
                            L27: {
                              if (var18_ref == null) {
                                break L27;
                              } else {
                                if (var18_ref.d((byte) -1)) {
                                  var18_ref = (gd) (Object) var17.a((byte) -70);
                                  continue L26;
                                } else {
                                  L28: {
                                    if (var11_int == 0) {
                                      break L28;
                                    } else {
                                      if (!var18_ref.field_Tb) {
                                        var16 = 1;
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  if (var18_ref.field_Pb < var13_int) {
                                    var16 = 1;
                                    break L27;
                                  } else {
                                    if (var14_int <= var18_ref.field_Qb) {
                                      if (-1 < (var18_ref.field_Ub & var15)) {
                                        var16 = 1;
                                        break L27;
                                      } else {
                                        if (var12 != 0) {
                                          var16 = 1;
                                          break L27;
                                        } else {
                                          var18_ref = (gd) (Object) var17.a((byte) -70);
                                          continue L26;
                                        }
                                      }
                                    } else {
                                      var16 = 1;
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                            L29: {
                              if (2 > dd.field_c) {
                                break L29;
                              } else {
                                if (!sn.field_a[12]) {
                                  break L29;
                                } else {
                                  var16 = 0;
                                  break L29;
                                }
                              }
                            }
                            if (var16 == 0) {
                              break L2;
                            } else {
                              rn.field_c.field_S = false;
                              if (rn.field_c.field_rb) {
                                if (we.field_e.field_g.field_Lb != 0) {
                                  re.field_P = sk.a(new String[1], cn.field_b, 119);
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
                          L30: {
                            var17_int = qb.field_N.field_sc[var16] & 255;
                            if (null == ba.field_S) {
                              break L30;
                            } else {
                              if (null == ba.field_S[var16]) {
                                break L30;
                              } else {
                                if (!ba.field_S[var16][var17_int]) {
                                  break L30;
                                } else {
                                  var11_int = 1;
                                  break L30;
                                }
                              }
                            }
                          }
                          L31: {
                            if (a.field_g == null) {
                              break L31;
                            } else {
                              if (null != a.field_g[var16]) {
                                L32: {
                                  var18_int = a.field_g[var16][var17_int];
                                  if (var18_int == 0) {
                                    break L32;
                                  } else {
                                    if (oa.field_r) {
                                      break L32;
                                    } else {
                                      var11_int = 1;
                                      break L32;
                                    }
                                  }
                                }
                                if (var18_int > var13_int) {
                                  var13_int = var18_int;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L33: {
                            if (null == bi.field_e) {
                              break L33;
                            } else {
                              if (bi.field_e[var16] != null) {
                                L34: {
                                  var18_int = bi.field_e[var16][var17_int];
                                  if (var18_int == 0) {
                                    break L34;
                                  } else {
                                    if (oa.field_r) {
                                      break L34;
                                    } else {
                                      var11_int = 1;
                                      break L34;
                                    }
                                  }
                                }
                                if (var18_int <= var14_int) {
                                  break L33;
                                } else {
                                  var14_int = var18_int;
                                  break L33;
                                }
                              } else {
                                L35: {
                                  if (null == ti.field_f) {
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                var16++;
                                continue L25;
                              }
                            }
                          }
                          L36: {
                            if (null == ti.field_f) {
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          var16++;
                          continue L25;
                        }
                      }
                    }
                  } else {
                    var9_ref_String = qb.field_N.field_ec;
                    var10_ref_String = var9_ref_String;
                    var10_ref_String = var9_ref_String;
                    ua.field_d.field_jb = sk.a(new String[1], qe.field_e, 127).toUpperCase();
                    tn.field_a.a((byte) -110, fk.field_V.field_Hb, fk.field_V.field_R + -40, 40, 0);
                    tn.field_a.field_jb = sk.a(new String[1], om.field_Xb, 123);
                    var8 = tn.field_a;
                    break L2;
                  }
                }
                L37: {
                  if (un.field_f != 0L) {
                    L38: {
                      var9 = (int)(-k.a(0) + un.field_f);
                      var9 = (999 + var9) / 1000;
                      if (1 > var9) {
                        var9 = 1;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    var8.field_jb = sk.a(new String[1], ki.field_a, 121);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                e.field_d.field_jb = sk.a(new String[2], pl.field_c, 126);
                break L1;
              } else {
                break L1;
              }
            }
            L39: {
              L40: {
                stackOut_138_0 = tl.field_P;
                stackOut_138_1 = 0;
                stackIn_142_0 = stackOut_138_0;
                stackIn_142_1 = stackOut_138_1;
                stackIn_139_0 = stackOut_138_0;
                stackIn_139_1 = stackOut_138_1;
                if (!param3) {
                  break L40;
                } else {
                  stackOut_139_0 = (hl) (Object) stackIn_139_0;
                  stackOut_139_1 = stackIn_139_1;
                  stackIn_142_0 = stackOut_139_0;
                  stackIn_142_1 = stackOut_139_1;
                  stackIn_140_0 = stackOut_139_0;
                  stackIn_140_1 = stackOut_139_1;
                  if (param1) {
                    break L40;
                  } else {
                    stackOut_140_0 = (hl) (Object) stackIn_140_0;
                    stackOut_140_1 = stackIn_140_1;
                    stackIn_142_0 = stackOut_140_0;
                    stackIn_142_1 = stackOut_140_1;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    if (lg.field_S) {
                      break L40;
                    } else {
                      stackOut_141_0 = (hl) (Object) stackIn_141_0;
                      stackOut_141_1 = stackIn_141_1;
                      stackOut_141_2 = 1;
                      stackIn_143_0 = stackOut_141_0;
                      stackIn_143_1 = stackOut_141_1;
                      stackIn_143_2 = stackOut_141_2;
                      break L39;
                    }
                  }
                }
              }
              stackOut_142_0 = (hl) (Object) stackIn_142_0;
              stackOut_142_1 = stackIn_142_1;
              stackOut_142_2 = 0;
              stackIn_143_0 = stackOut_142_0;
              stackIn_143_1 = stackOut_142_1;
              stackIn_143_2 = stackOut_142_2;
              break L39;
            }
            L41: {
              L42: {
                ((hl) (Object) stackIn_143_0).a(stackIn_143_1, stackIn_143_2 != 0);
                var5_int = -1;
                stackOut_143_0 = fk.field_V;
                stackOut_143_1 = 0;
                stackIn_147_0 = stackOut_143_0;
                stackIn_147_1 = stackOut_143_1;
                stackIn_144_0 = stackOut_143_0;
                stackIn_144_1 = stackOut_143_1;
                if (!param3) {
                  break L42;
                } else {
                  stackOut_144_0 = (hl) (Object) stackIn_144_0;
                  stackOut_144_1 = stackIn_144_1;
                  stackIn_147_0 = stackOut_144_0;
                  stackIn_147_1 = stackOut_144_1;
                  stackIn_145_0 = stackOut_144_0;
                  stackIn_145_1 = stackOut_144_1;
                  if (param1) {
                    break L42;
                  } else {
                    stackOut_145_0 = (hl) (Object) stackIn_145_0;
                    stackOut_145_1 = stackIn_145_1;
                    stackIn_147_0 = stackOut_145_0;
                    stackIn_147_1 = stackOut_145_1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    if (lg.field_S) {
                      break L42;
                    } else {
                      stackOut_146_0 = (hl) (Object) stackIn_146_0;
                      stackOut_146_1 = stackIn_146_1;
                      stackOut_146_2 = 1;
                      stackIn_148_0 = stackOut_146_0;
                      stackIn_148_1 = stackOut_146_1;
                      stackIn_148_2 = stackOut_146_2;
                      break L41;
                    }
                  }
                }
              }
              stackOut_147_0 = (hl) (Object) stackIn_147_0;
              stackOut_147_1 = stackIn_147_1;
              stackOut_147_2 = 0;
              stackIn_148_0 = stackOut_147_0;
              stackIn_148_1 = stackOut_147_1;
              stackIn_148_2 = stackOut_147_2;
              break L41;
            }
            L43: {
              L44: {
                ((hl) (Object) stackIn_148_0).a(stackIn_148_1, stackIn_148_2 != 0);
                stackOut_148_0 = fj.field_b;
                stackOut_148_1 = 0;
                stackIn_152_0 = stackOut_148_0;
                stackIn_152_1 = stackOut_148_1;
                stackIn_149_0 = stackOut_148_0;
                stackIn_149_1 = stackOut_148_1;
                if (!param3) {
                  break L44;
                } else {
                  stackOut_149_0 = (hl) (Object) stackIn_149_0;
                  stackOut_149_1 = stackIn_149_1;
                  stackIn_152_0 = stackOut_149_0;
                  stackIn_152_1 = stackOut_149_1;
                  stackIn_150_0 = stackOut_149_0;
                  stackIn_150_1 = stackOut_149_1;
                  if (param1) {
                    break L44;
                  } else {
                    stackOut_150_0 = (hl) (Object) stackIn_150_0;
                    stackOut_150_1 = stackIn_150_1;
                    stackIn_152_0 = stackOut_150_0;
                    stackIn_152_1 = stackOut_150_1;
                    stackIn_151_0 = stackOut_150_0;
                    stackIn_151_1 = stackOut_150_1;
                    if (!lg.field_S) {
                      break L44;
                    } else {
                      stackOut_151_0 = (hl) (Object) stackIn_151_0;
                      stackOut_151_1 = stackIn_151_1;
                      stackOut_151_2 = 1;
                      stackIn_153_0 = stackOut_151_0;
                      stackIn_153_1 = stackOut_151_1;
                      stackIn_153_2 = stackOut_151_2;
                      break L43;
                    }
                  }
                }
              }
              stackOut_152_0 = (hl) (Object) stackIn_152_0;
              stackOut_152_1 = stackIn_152_1;
              stackOut_152_2 = 0;
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              stackIn_153_2 = stackOut_152_2;
              break L43;
            }
            L45: {
              ((hl) (Object) stackIn_153_0).a(stackIn_153_1, stackIn_153_2 != 0);
              we.field_e.field_g.c(true);
              if (qb.field_N == null) {
                break L45;
              } else {
                L46: {
                  if (qi.field_n.field_F != 0) {
                    g.e(qb.field_N.j(-56), -125, param2);
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (nm.field_n.field_F != 0) {
                    lg.field_S = true;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (0 == rn.field_c.field_F) {
                    break L48;
                  } else {
                    uf.field_b = true;
                    break L48;
                  }
                }
                L49: {
                  if (0 == c.field_b.field_F) {
                    break L49;
                  } else {
                    lg.field_S = false;
                    break L49;
                  }
                }
                hg.a(param2, qb.field_N, 30544, false);
                break L45;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var5, "mh.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + -87 + 41);
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
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
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
                  var13 = new byte[24];
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var6 = var7;
                  var14 = var6;
                  var12 = var14;
                  var10 = var12;
                  var8 = var10;
                  var2 = var8;
                  if (sk.field_f == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        sk.field_f.a(0L, 0);
                        sk.field_f.a(var13, (byte) 66);
                        var3 = 0;
                        L3: while (true) {
                          L4: {
                            if (var3 >= 24) {
                              break L4;
                            } else {
                              if (var14[var3] == 0) {
                                var3++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3 < 24) {
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
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
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
                param1.a(0, 128, var14, 24);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) runtimeException;
                stackOut_15_1 = new StringBuilder().append("mh.A(").append(param0).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
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
        if (-param2 + param1 >= 0) {
            return param1 - param2;
        }
        return ra.field_e + -param2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "(<%0> players want to join)";
        field_b = 0;
        field_a = 9;
        field_g = -1;
        field_f = "Cancel draw";
    }
}
