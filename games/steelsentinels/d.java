/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ug {
    static wk field_G;
    static java.awt.Color field_S;
    static int[][] field_T;
    static int field_R;
    static String field_U;

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        int var8 = 0;
        h var9 = null;
        super.a((byte) 77, param1, param2, param3, param4, param5);
        var9 = nc.field_e;
        var8 = -55 % ((param0 - 36) / 32);
        if (var9 != null) {
          if (((d) this).a(param5, param2, (byte) 81, param1, param3)) {
            if (!(((d) this).field_A instanceof hi)) {
              if (!(var9.field_A instanceof hi)) {
                return;
              } else {
                ((hi) (Object) var9.field_A).a(var9, (d) this, -108);
                nc.field_e = null;
                return;
              }
            } else {
              ((hi) (Object) ((d) this).field_A).a(var9, (d) this, 127);
              nc.field_e = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 0) {
          L0: {
            field_S = null;
            if ((param0 ^ -1) > -1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param0 ^ -1) > -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var8 = SteelSentinels.field_G;
        param4 = param4 - param2;
        if (0 <= param4) {
          if (param4 >= el.field_Sb.length) {
            return 0;
          } else {
            var5 = 0;
            var12 = el.field_Sb[param4];
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var6 = var9;
            var7 = 0;
            L0: while (true) {
              if (var7 >= var12.length) {
                return var5;
              } else {
                if (!param3) {
                  fk.field_d.c(bi.field_b[var12[var7]], 74 + param1, var5 + (param0 + 8), 16777215, -1);
                  vc.field_e[var6[var7 + 1]].f(76 + param1, var5 + param0);
                  var5 += 12;
                  var7 += 2;
                  continue L0;
                } else {
                  var5 += 12;
                  var7 += 2;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, byte param7, boolean param8, boolean param9) {
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        if (!param5) {
          if (re.field_Z == pb.field_c) {
            L0: {
              if (pb.field_j == sf.field_t) {
                break L0;
              } else {
                if (sb.field_bb.field_i != pb.field_j) {
                  break L0;
                } else {
                  if (pb.field_c != sb.field_bb.field_c) {
                    break L0;
                  } else {
                    if (null == nf.field_b) {
                      if (ni.field_a != null) {
                        ef.a(1, true);
                        break L0;
                      } else {
                        vl.d(0);
                        break L0;
                      }
                    } else {
                      ef.a(param7 + 7, false);
                      break L0;
                    }
                  }
                }
              }
            }
            if (param5) {
              L1: {
                me.field_e = ln.field_f;
                cc.a(param5, 0);
                if (0 >= je.field_t) {
                  break L1;
                } else {
                  tm.a(param7 + 4, param5, param0, param1);
                  break L1;
                }
              }
              rh.field_w.field_Kb = 1;
              if (param7 == -6) {
                L2: {
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if ((bd.field_c ^ -1) < -1) {
                    pl.a(param0, param5, param1, (byte) 66);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((fj.field_f ^ -1) < -1) {
                    cn.a(0, param0, param5, param9, param1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (vb.field_c) {
                  if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                    mj.field_Sb.field_Tb.field_S = null;
                    fl.field_c.field_T = true;
                    ke.a(param8, param1, mj.field_Sb, param2, 0);
                    ca.a(param4, 1, param8, param2, param3, param6, param1);
                    ke.a(param8, param1, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  } else {
                    fl.field_c.field_T = false;
                    mj.field_Sb.field_Tb.field_S = pe.field_U;
                    ue.a(0, mj.field_Sb.field_Ub);
                    ca.a(param4, 1, param8, param2, param3, param6, param1);
                    ke.a(param8, param1, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  }
                } else {
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, param1, mj.field_Sb, param2, 0);
                  ca.a(param4, 1, param8, param2, param3, param6, param1);
                  ke.a(param8, param1, gl.field_t, param2, 0);
                  qa.field_H = qa.field_H + 1;
                  return;
                }
              } else {
                return;
              }
            } else {
              L4: {
                me.field_e = (re.field_Z - 640) / 2;
                cc.a(param5, 0);
                if (0 >= je.field_t) {
                  break L4;
                } else {
                  tm.a(param7 + 4, param5, param0, param1);
                  break L4;
                }
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              } else {
                L5: {
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if ((bd.field_c ^ -1) < -1) {
                    pl.a(param0, param5, param1, (byte) 66);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((fj.field_f ^ -1) < -1) {
                    cn.a(0, param0, param5, param9, param1);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if (!vb.field_c) {
                      break L8;
                    } else {
                      if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                        fl.field_c.field_T = false;
                        mj.field_Sb.field_Tb.field_S = pe.field_U;
                        ue.a(0, mj.field_Sb.field_Ub);
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, param1, mj.field_Sb, param2, 0);
                  break L7;
                }
                ca.a(param4, 1, param8, param2, param3, param6, param1);
                ke.a(param8, param1, gl.field_t, param2, 0);
                qa.field_H = qa.field_H + 1;
                return;
              }
            }
          } else {
            L9: {
              if (sb.field_bb.field_i != pb.field_j) {
                break L9;
              } else {
                if (pb.field_c != sb.field_bb.field_c) {
                  break L9;
                } else {
                  if (null == nf.field_b) {
                    if (ni.field_a != null) {
                      ef.a(1, true);
                      break L9;
                    } else {
                      vl.d(0);
                      break L9;
                    }
                  } else {
                    ef.a(param7 + 7, false);
                    break L9;
                  }
                }
              }
            }
            if (param5) {
              L10: {
                me.field_e = ln.field_f;
                cc.a(param5, 0);
                if (0 >= je.field_t) {
                  break L10;
                } else {
                  tm.a(param7 + 4, param5, param0, param1);
                  break L10;
                }
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              } else {
                L11: {
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if ((bd.field_c ^ -1) < -1) {
                    pl.a(param0, param5, param1, (byte) 66);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((fj.field_f ^ -1) < -1) {
                    cn.a(0, param0, param5, param9, param1);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    if (!vb.field_c) {
                      break L14;
                    } else {
                      if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                        fl.field_c.field_T = false;
                        mj.field_Sb.field_Tb.field_S = pe.field_U;
                        ue.a(0, mj.field_Sb.field_Ub);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, param1, mj.field_Sb, param2, 0);
                  break L13;
                }
                ca.a(param4, 1, param8, param2, param3, param6, param1);
                ke.a(param8, param1, gl.field_t, param2, 0);
                qa.field_H = qa.field_H + 1;
                return;
              }
            } else {
              L15: {
                me.field_e = (re.field_Z - 640) / 2;
                cc.a(param5, 0);
                if (0 >= je.field_t) {
                  break L15;
                } else {
                  tm.a(param7 + 4, param5, param0, param1);
                  break L15;
                }
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              } else {
                L16: {
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if ((bd.field_c ^ -1) < -1) {
                    pl.a(param0, param5, param1, (byte) 66);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if ((fj.field_f ^ -1) < -1) {
                    cn.a(0, param0, param5, param9, param1);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    if (!vb.field_c) {
                      break L19;
                    } else {
                      if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                        fl.field_c.field_T = false;
                        mj.field_Sb.field_Tb.field_S = pe.field_U;
                        ue.a(0, mj.field_Sb.field_Ub);
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, param1, mj.field_Sb, param2, 0);
                  break L18;
                }
                ca.a(param4, 1, param8, param2, param3, param6, param1);
                ke.a(param8, param1, gl.field_t, param2, 0);
                qa.field_H = qa.field_H + 1;
                return;
              }
            }
          }
        } else {
          if (param5) {
            L20: {
              me.field_e = ln.field_f;
              cc.a(param5, 0);
              if (0 >= je.field_t) {
                break L20;
              } else {
                tm.a(param7 + 4, param5, param0, param1);
                break L20;
              }
            }
            rh.field_w.field_Kb = 1;
            if (param7 != -6) {
              return;
            } else {
              L21: {
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if ((bd.field_c ^ -1) < -1) {
                  pl.a(param0, param5, param1, (byte) 66);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if ((fj.field_f ^ -1) < -1) {
                  cn.a(0, param0, param5, param9, param1);
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                L24: {
                  if (!vb.field_c) {
                    break L24;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
                break L23;
              }
              ca.a(param4, 1, param8, param2, param3, param6, param1);
              ke.a(param8, param1, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            }
          } else {
            L25: {
              me.field_e = (re.field_Z - 640) / 2;
              cc.a(param5, 0);
              if (0 >= je.field_t) {
                break L25;
              } else {
                tm.a(param7 + 4, param5, param0, param1);
                break L25;
              }
            }
            rh.field_w.field_Kb = 1;
            if (param7 != -6) {
              return;
            } else {
              L26: {
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if ((bd.field_c ^ -1) < -1) {
                  pl.a(param0, param5, param1, (byte) 66);
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if ((fj.field_f ^ -1) < -1) {
                  cn.a(0, param0, param5, param9, param1);
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                L29: {
                  if (!vb.field_c) {
                    break L29;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
                break L28;
              }
              ca.a(param4, 1, param8, param2, param3, param6, param1);
              ke.a(param8, param1, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            }
          }
        }
    }

    final static ef a(String param0, boolean param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ef var7 = null;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        var2 = param0.length();
        if (0 != var2) {
          if (-256 <= (var2 ^ -1)) {
            var3 = ka.a('.', param1, param0);
            if (var3.length >= 2) {
              var4 = var3;
              var5 = 0;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = fn.a(-119, var6);
                  if (var7 != null) {
                    return var7;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  return rf.a((byte) 16, var3[var3.length + -1]);
                }
              }
            } else {
              return ud.field_A;
            }
          } else {
            return ma.field_cb;
          }
        } else {
          return ud.field_A;
        }
    }

    private d(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((d) this).field_J = param6;
    }

    final static wk a(boolean param0) {
        int var1 = 0;
        wk var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          var1 = le.field_L[0] * ca.field_r[0];
          var18 = dl.field_L[0];
          if (!pd.field_U[0]) {
            var21 = new int[var1];
            var17 = var21;
            var9 = var17;
            var5 = 0;
            L1: while (true) {
              if (var1 <= var5) {
                var3 = new wk(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var21);
                break L0;
              } else {
                var9[var5] = ba.field_d[ec.a(255, (int) var18[var5])];
                var5++;
                continue L1;
              }
            }
          } else {
            var19 = sn.field_g[0];
            var20 = new int[var1];
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var5_ref_int__ = var11;
            var6 = 0;
            L2: while (true) {
              if (var1 <= var6) {
                var3 = (wk) (Object) new ek(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var20);
                break L0;
              } else {
                var5_ref_int__[var6] = vn.a(ba.field_d[ec.a((int) var18[var6], 255)], ec.a(255, (int) var19[var6]) << 939166712);
                var6++;
                continue L2;
              }
            }
          }
        }
        uh.a(9324);
        if (!param0) {
          field_R = -27;
          return var3;
        } else {
          return var3;
        }
    }

    public static void h(int param0) {
        field_G = null;
        field_T = null;
        if (param0 != 12) {
          field_R = -95;
          field_S = null;
          field_U = null;
          return;
        } else {
          field_S = null;
          field_U = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[1], new int[1], new int[1], new int[2], new int[2], new int[3], new int[0], new int[1], new int[1], new int[1], new int[1], new int[2], new int[3], new int[2], new int[1], new int[2], new int[0], new int[1], new int[1], new int[1], new int[2], new int[2], new int[2], new int[1], new int[2], new int[0]};
        field_S = new java.awt.Color(10040319);
        field_U = null;
    }
}
