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
        RuntimeException var7 = null;
        int var8 = 0;
        h var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) 77, param1, param2, param3, param4, param5);
              var9 = nc.field_e;
              var8 = -55 % ((param0 - 36) / 32);
              if (var9 == null) {
                break L1;
              } else {
                if (((d) this).a(param5, param2, (byte) 81, param1, param3)) {
                  if (((d) this).field_A instanceof hi) {
                    ((hi) (Object) ((d) this).field_A).a(var9, (d) this, 127);
                    nc.field_e = null;
                    break L1;
                  } else {
                    if (var9.field_A instanceof hi) {
                      ((hi) (Object) var9.field_A).a(var9, (d) this, -108);
                      nc.field_e = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7;
            stackOut_9_1 = new StringBuilder().append("d.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
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
            if (param0 < 0) {
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
            if (param0 < 0) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            param4 = param4 - param2;
            if (0 > param4) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param4 < el.field_Sb.length) {
                var5_int = 0;
                var12 = el.field_Sb[param4];
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var6 = var9;
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var12.length) {
                    stackOut_13_0 = var5_int;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    L2: {
                      if (!param3) {
                        fk.field_d.c(bi.field_b[var12[var7]], 74 + param1, var5_int + (param0 + 8), 16777215, -1);
                        vc.field_e[var6[var7 + 1]].f(76 + param1, var5_int + param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5_int += 12;
                    var7 += 2;
                    continue L1;
                  }
                }
              } else {
                return 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "d.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_14_0;
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
                      ef.a(1, false);
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
                  rh.field_w.field_Kb = 1;
                  break L1;
                } else {
                  tm.a(-2, param5, param0, 11);
                  rh.field_w.field_Kb = 1;
                  break L1;
                }
              }
              L2: {
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if (bd.field_c > 0) {
                  pl.a(param0, param5, 11, (byte) 66);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (fj.field_f > 0) {
                  cn.a(0, param0, param5, param9, 11);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (!vb.field_c) {
                    break L5;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, 11, mj.field_Sb, param2, 0);
                break L4;
              }
              ca.a(16777215, 1, param8, param2, 16777215, true, 11);
              ke.a(param8, 11, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            } else {
              me.field_e = (re.field_Z - 640) / 2;
              cc.a(param5, 0);
              if (0 >= je.field_t) {
                L6: {
                  rh.field_w.field_Kb = 1;
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if (bd.field_c > 0) {
                    pl.a(param0, param5, 11, (byte) 66);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (fj.field_f > 0) {
                    cn.a(0, param0, param5, param9, 11);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (vb.field_c) {
                  if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                    mj.field_Sb.field_Tb.field_S = null;
                    fl.field_c.field_T = true;
                    ke.a(param8, 11, mj.field_Sb, param2, 0);
                    ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                    ke.a(param8, 11, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  } else {
                    fl.field_c.field_T = false;
                    mj.field_Sb.field_Tb.field_S = pe.field_U;
                    ue.a(0, mj.field_Sb.field_Ub);
                    ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                    ke.a(param8, 11, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  }
                } else {
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, 11, mj.field_Sb, param2, 0);
                  ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                  ke.a(param8, 11, gl.field_t, param2, 0);
                  qa.field_H = qa.field_H + 1;
                  return;
                }
              } else {
                tm.a(-2, param5, param0, 11);
                L8: {
                  rh.field_w.field_Kb = 1;
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if (bd.field_c > 0) {
                    pl.a(param0, param5, 11, (byte) 66);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (fj.field_f > 0) {
                    cn.a(0, param0, param5, param9, 11);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (vb.field_c) {
                  if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                    mj.field_Sb.field_Tb.field_S = null;
                    fl.field_c.field_T = true;
                    ke.a(param8, 11, mj.field_Sb, param2, 0);
                    ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                    ke.a(param8, 11, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  } else {
                    fl.field_c.field_T = false;
                    mj.field_Sb.field_Tb.field_S = pe.field_U;
                    ue.a(0, mj.field_Sb.field_Ub);
                    ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                    ke.a(param8, 11, gl.field_t, param2, 0);
                    qa.field_H = qa.field_H + 1;
                    return;
                  }
                } else {
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, 11, mj.field_Sb, param2, 0);
                  ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                  ke.a(param8, 11, gl.field_t, param2, 0);
                  qa.field_H = qa.field_H + 1;
                  return;
                }
              }
            }
          } else {
            L10: {
              if (sb.field_bb.field_i != pb.field_j) {
                break L10;
              } else {
                if (pb.field_c != sb.field_bb.field_c) {
                  break L10;
                } else {
                  if (null == nf.field_b) {
                    if (ni.field_a != null) {
                      ef.a(1, true);
                      break L10;
                    } else {
                      vl.d(0);
                      break L10;
                    }
                  } else {
                    ef.a(1, false);
                    break L10;
                  }
                }
              }
            }
            if (param5) {
              L11: {
                me.field_e = ln.field_f;
                cc.a(param5, 0);
                if (0 >= je.field_t) {
                  rh.field_w.field_Kb = 1;
                  break L11;
                } else {
                  tm.a(-2, param5, param0, 11);
                  rh.field_w.field_Kb = 1;
                  break L11;
                }
              }
              L12: {
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if (bd.field_c > 0) {
                  pl.a(param0, param5, 11, (byte) 66);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (fj.field_f > 0) {
                  cn.a(0, param0, param5, param9, 11);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  if (!vb.field_c) {
                    break L15;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, 11, mj.field_Sb, param2, 0);
                break L14;
              }
              ca.a(16777215, 1, param8, param2, 16777215, true, 11);
              ke.a(param8, 11, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            } else {
              me.field_e = (re.field_Z - 640) / 2;
              cc.a(param5, 0);
              if (0 >= je.field_t) {
                L16: {
                  rh.field_w.field_Kb = 1;
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if (bd.field_c > 0) {
                    pl.a(param0, param5, 11, (byte) 66);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (fj.field_f > 0) {
                    cn.a(0, param0, param5, param9, 11);
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
                  ke.a(param8, 11, mj.field_Sb, param2, 0);
                  break L18;
                }
                ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                ke.a(param8, 11, gl.field_t, param2, 0);
                qa.field_H = qa.field_H + 1;
                return;
              } else {
                tm.a(-2, param5, param0, 11);
                L20: {
                  rh.field_w.field_Kb = 1;
                  rh.field_w.field_ub = gh.field_ib.field_ub;
                  if (bd.field_c > 0) {
                    pl.a(param0, param5, 11, (byte) 66);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (fj.field_f > 0) {
                    cn.a(0, param0, param5, param9, 11);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  L23: {
                    if (!vb.field_c) {
                      break L23;
                    } else {
                      if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                        fl.field_c.field_T = false;
                        mj.field_Sb.field_Tb.field_S = pe.field_U;
                        ue.a(0, mj.field_Sb.field_Ub);
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, 11, mj.field_Sb, param2, 0);
                  break L22;
                }
                ca.a(16777215, 1, param8, param2, 16777215, true, 11);
                ke.a(param8, 11, gl.field_t, param2, 0);
                qa.field_H = qa.field_H + 1;
                return;
              }
            }
          }
        } else {
          if (param5) {
            L24: {
              me.field_e = ln.field_f;
              cc.a(param5, 0);
              if (0 >= je.field_t) {
                rh.field_w.field_Kb = 1;
                break L24;
              } else {
                tm.a(-2, param5, param0, 11);
                rh.field_w.field_Kb = 1;
                break L24;
              }
            }
            L25: {
              rh.field_w.field_ub = gh.field_ib.field_ub;
              if (bd.field_c > 0) {
                pl.a(param0, param5, 11, (byte) 66);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (fj.field_f > 0) {
                cn.a(0, param0, param5, param9, 11);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              L28: {
                if (!vb.field_c) {
                  break L28;
                } else {
                  if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                    fl.field_c.field_T = false;
                    mj.field_Sb.field_Tb.field_S = pe.field_U;
                    ue.a(0, mj.field_Sb.field_Ub);
                    break L27;
                  } else {
                    break L28;
                  }
                }
              }
              mj.field_Sb.field_Tb.field_S = null;
              fl.field_c.field_T = true;
              ke.a(param8, 11, mj.field_Sb, param2, 0);
              break L27;
            }
            ca.a(16777215, 1, param8, param2, 16777215, true, 11);
            ke.a(param8, 11, gl.field_t, param2, 0);
            qa.field_H = qa.field_H + 1;
            return;
          } else {
            me.field_e = (re.field_Z - 640) / 2;
            cc.a(param5, 0);
            if (0 >= je.field_t) {
              L29: {
                rh.field_w.field_Kb = 1;
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if (bd.field_c > 0) {
                  pl.a(param0, param5, 11, (byte) 66);
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                if (fj.field_f > 0) {
                  cn.a(0, param0, param5, param9, 11);
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                L32: {
                  if (!vb.field_c) {
                    break L32;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, 11, mj.field_Sb, param2, 0);
                break L31;
              }
              ca.a(16777215, 1, param8, param2, 16777215, true, 11);
              ke.a(param8, 11, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            } else {
              tm.a(-2, param5, param0, 11);
              L33: {
                rh.field_w.field_Kb = 1;
                rh.field_w.field_ub = gh.field_ib.field_ub;
                if (bd.field_c > 0) {
                  pl.a(param0, param5, 11, (byte) 66);
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (fj.field_f > 0) {
                  cn.a(0, param0, param5, param9, 11);
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                L36: {
                  if (!vb.field_c) {
                    break L36;
                  } else {
                    if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                      fl.field_c.field_T = false;
                      mj.field_Sb.field_Tb.field_S = pe.field_U;
                      ue.a(0, mj.field_Sb.field_Ub);
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, 11, mj.field_Sb, param2, 0);
                break L35;
              }
              ca.a(16777215, 1, param8, param2, 16777215, true, 11);
              ke.a(param8, 11, gl.field_t, param2, 0);
              qa.field_H = qa.field_H + 1;
              return;
            }
          }
        }
    }

    final static ef a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ef var7 = null;
        int var8 = 0;
        ef stackIn_3_0 = null;
        ef stackIn_6_0 = null;
        ef stackIn_9_0 = null;
        ef stackIn_15_0 = null;
        ef stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_17_0 = null;
        ef stackOut_14_0 = null;
        ef stackOut_8_0 = null;
        ef stackOut_5_0 = null;
        ef stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param0.length();
            if (0 != var2_int) {
              if (var2_int <= 255) {
                var3 = ka.a('.', false, param0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_17_0 = rf.a((byte) 16, var3[var3.length + -1]);
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = fn.a(-119, var6);
                      if (var7 != null) {
                        stackOut_14_0 = (ef) var7;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = ud.field_A;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ma.field_cb;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = ud.field_A;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("d.GA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + false + ')');
        }
        return stackIn_18_0;
    }

    private d(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((d) this).field_J = param6;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "d.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static wk a(boolean param0) {
        int[] var20 = null;
        int[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Object var3 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var9 = null;
        int var5 = 0;
        byte[] var19 = null;
        int var7 = SteelSentinels.field_G;
        int var1 = le.field_L[0] * ca.field_r[0];
        byte[] var18 = dl.field_L[0];
        if (pd.field_U[0]) {
            var19 = sn.field_g[0];
            var20 = new int[var1];
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var1 > var6; var6++) {
                var5_ref_int__[var6] = vn.a(ba.field_d[ec.a((int) var18[var6], 255)], ec.a(255, (int) var19[var6]) << 24);
            }
            var3 = (Object) (Object) new ek(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var20);
        } else {
            var21 = new int[var1];
            var17 = var21;
            var9 = var17;
            for (var5 = 0; var1 > var5; var5++) {
                var9[var5] = ba.field_d[ec.a(255, (int) var18[var5])];
            }
            var3 = (Object) (Object) new wk(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var21);
        }
        uh.a(9324);
        return (wk) var3;
    }

    public static void h(int param0) {
        field_G = null;
        field_T = null;
        field_S = null;
        field_U = null;
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
