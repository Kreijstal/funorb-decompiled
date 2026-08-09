/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static String field_e;
    static String field_a;
    static String field_c;
    static String field_g;
    static vj field_b;
    static String field_f;
    static ke field_d;

    final static void a(int param0) {
        int var1;
        var1 = -63 % ((param0 - -6) / 38);
        kk.field_n = kk.field_n + 1;
        if (-141 < (kk.field_n ^ -1)) {
          cb.b((byte) 71);
          if (0 == kk.field_n % 20) {
            cg.a(true);
            return;
          } else {
            return;
          }
        } else {
          kk.field_n = 0;
          cb.b((byte) 71);
          if (0 != kk.field_n % 20) {
            return;
          } else {
            cg.a(true);
            return;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != 11) {
            return;
        }
        wg.field_i = ik.a(4);
        af.field_d = 0;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        L0: {
          fl.a(130, 256, 16694016, bj.field_c, param0 + 82, w.field_kb);
          if (1 != kd.field_p) {
            stackIn_3_0 = 145;
            break L0;
          } else {
            stackIn_3_0 = 140;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          fb.field_c[0][1].c(82 + param0, var2, 18, 18);
          stackIn_5_0 = var2;

          if (-2 == (kd.field_p ^ -1)) {
            stackIn_6_0 = stackIn_5_0;
            stackIn_6_1 = 8;
            break L1;
          } else {
            stackIn_6_0 = stackIn_5_0;
            stackIn_6_1 = 16;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_6_0 + (stackIn_6_1 + 16 * ga.a(198, 0, var2, rf.field_i, 16, 64, 16777215, se.field_S, (byte) -125, 0, 110 - -param0));
          fb.field_c[0][2].c(param0 + 108, var2, 18, 18);
          fb.field_c[0][2].c(param0 + 108, var2 + 18, 18, 18);
          fb.field_c[0][2].c(108 - -param0, var2 - -36, 18, 18);
          fb.field_c[0][2].c(param0 + 126, 36 + var2, 18, 18);
          ma.field_K.c(156 - -param0, 10 + var2);
          cg.a(0, 2, 6, 230 + param0, 36 + var2, 3, -2);
          cg.a(0, 2, 12, param0 + 230, var2 - -18, 3, -1);
          cg.a(0, 2, 8, param0 + 230, var2, 3, -1);
          cg.a(0, 2, 1, param0 + 248, var2 + 36, 2, -2);
          stackIn_8_0 = var2;

          stackIn_8_1 = 54;

          if (kd.field_p != 1) {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = stackIn_8_1;
            stackIn_9_2 = 16;
            break L2;
          } else {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = stackIn_8_1;
            stackIn_9_2 = 8;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0 + (stackIn_9_1 - -stackIn_9_2);
          fb.field_c[3][1].c(82 + param0, var2, 18, 18);
          var2 = var2 + ga.a(140, 0, var2, rk.field_N, 16, 64, 16777215, se.field_S, (byte) -127, 0, 110 - -param0) * 16;
          stackIn_11_0 = gi.field_c;

          stackIn_11_1 = nf.field_e;

          stackIn_11_2 = var2;

          stackIn_11_3 = 90;

          if (-2 == (kd.field_p ^ -1)) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = stackIn_11_2;
            stackIn_12_3 = stackIn_11_3;
            stackIn_12_4 = 16;
            break L3;
          } else {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = stackIn_11_2;
            stackIn_12_3 = stackIn_11_3;
            stackIn_12_4 = 0;
            break L3;
          }
        }
        wa.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 - (stackIn_12_3 + stackIn_12_4), param0 + 242, -1, 0, kk.field_n);
        hk.g(309 - -param0, 117, 242, 263172);
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(130, 256, 16694016, kc.field_q, 322 + param0, w.field_kb);
        ga.a(120, 0, 145, di.field_D, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 320);
        aj.field_c.c(455 + param0, 123);
        if (param1) {
          return;
        } else {
          fl.a(240, 256, 16694016, fm.field_c, 322 - -param0, w.field_kb);
          ga.a(120, 0, 255, ah.field_g, 16, 64, 16777215, se.field_S, (byte) -127, 0, 320 + param0);
          li.field_i.c(465 + param0, 235);
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -122) {
            field_f = (String) null;
            return qg.field_f[param0 & 2047];
        }
        return qg.field_f[param0 & 2047];
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        if (param0 > -127) {
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        if (!param0) {
          L0: {
            if (ph.n(-30146)) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (eh.field_a > 0) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(ke param0, byte param1) {
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (ab.e(-28199) == 0) {
                break L1;
              } else {
                param0 = null;
                break L1;
              }
            }
            L2: {
              if (kf.field_G == param0) {
                break L2;
              } else {
                if ((kf.field_G.field_o ^ -1) >= -1) {
                  break L2;
                } else {
                  kf.field_G.field_o = kf.field_G.field_o - 1;
                  break L2;
                }
              }
            }
            L3: {
              if (pd.field_d == null) {
                break L3;
              } else {
                if (param0 == pd.field_d) {
                  break L3;
                } else {
                  if (0 < pd.field_d.field_o) {
                    pd.field_d.field_o = pd.field_d.field_o - 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (field_d == null) {
                break L4;
              } else {
                if (field_d == param0) {
                  break L4;
                } else {
                  if (0 >= field_d.field_o) {
                    break L4;
                  } else {
                    field_d.field_o = field_d.field_o - 1;
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (null == cl.field_B) {
                break L5;
              } else {
                if (cl.field_B == param0) {
                  break L5;
                } else {
                  if (cl.field_B.field_o > 0) {
                    cl.field_B.field_o = cl.field_B.field_o - 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (null == am.field_a) {
                break L6;
              } else {
                if (param0 == am.field_a) {
                  break L6;
                } else {
                  if (-1 <= (am.field_a.field_o ^ -1)) {
                    break L6;
                  } else {
                    am.field_a.field_o = am.field_a.field_o - 1;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (ca.field_wb == null) {
                break L7;
              } else {
                if (param0 == ca.field_wb) {
                  break L7;
                } else {
                  if (-1 <= (ca.field_wb.field_o ^ -1)) {
                    break L7;
                  } else {
                    ca.field_wb.field_o = ca.field_wb.field_o - 1;
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (null == f.field_s) {
                break L8;
              } else {
                if (param0 == f.field_s) {
                  break L8;
                } else {
                  if ((f.field_s.field_o ^ -1) >= -1) {
                    break L8;
                  } else {
                    f.field_s.field_o = f.field_s.field_o - 1;
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (hh.field_a != ue.field_b) {
                break L9;
              } else {
                if (param0 == null) {
                  break L9;
                } else {
                  if (20 <= param0.field_o) {
                    break L9;
                  } else {
                    param0.field_c = param0.field_c + 16;
                    param0.field_o = param0.field_o + 1;
                    break L9;
                  }
                }
              }
            }
            L10: {
              if (null == pd.field_d) {
                break L10;
              } else {
                if (ba.field_c) {
                  break L10;
                } else {
                  if (pd.field_d.field_o != 0) {
                    break L10;
                  } else {
                    pd.field_d = null;
                    break L10;
                  }
                }
              }
            }
            L11: {
              if (am.field_a == null) {
                break L11;
              } else {
                if (fm.field_e) {
                  break L11;
                } else {
                  if (am.field_a.field_o != 0) {
                    break L11;
                  } else {
                    am.field_a = null;
                    break L11;
                  }
                }
              }
            }
            L12: {
              if (null == cl.field_B) {
                break L12;
              } else {
                if (mg.field_Zb) {
                  break L12;
                } else {
                  if (-1 != (cl.field_B.field_o ^ -1)) {
                    break L12;
                  } else {
                    cl.field_B = null;
                    break L12;
                  }
                }
              }
            }
            L13: {
              if (null == field_d) {
                break L13;
              } else {
                if (lk.field_F) {
                  break L13;
                } else {
                  if (field_d.field_o != 0) {
                    break L13;
                  } else {
                    field_d = null;
                    break L13;
                  }
                }
              }
            }
            L14: {
              if (null == ca.field_wb) {
                break L14;
              } else {
                if (ve.field_Hc) {
                  break L14;
                } else {
                  if (ca.field_wb.field_o != 0) {
                    break L14;
                  } else {
                    ca.field_wb = null;
                    break L14;
                  }
                }
              }
            }
            L15: {
              if (f.field_s == null) {
                break L15;
              } else {
                if (nk.field_k) {
                  break L15;
                } else {
                  if (-1 == (f.field_s.field_o ^ -1)) {
                    f.field_s = null;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
            }
            L16: {
              if (null != kf.field_G) {
                kf.field_G.k((byte) 111);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (pd.field_d != null) {
                pd.field_d.k((byte) 118);
                break L17;
              } else {
                break L17;
              }
            }
            if (param1 == 95) {
              L18: {
                if (null != field_d) {
                  field_d.k((byte) 122);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (cl.field_B != null) {
                  cl.field_B.k((byte) 127);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (null == am.field_a) {
                  break L20;
                } else {
                  am.field_a.k((byte) 122);
                  break L20;
                }
              }
              L21: {
                if (null != ca.field_wb) {
                  ca.field_wb.k((byte) 108);
                  break L21;
                } else {
                  break L21;
                }
              }
              if (f.field_s != null) {
                f.field_s.k((byte) 122);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var2 = decompiledCaughtException;
            stackIn_85_0 = (RuntimeException) (var2);

            stackIn_85_1 = new StringBuilder().append("h.H(");

            if (param0 == null) {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L22;
            } else {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L22;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 77 / ((param1 - -6) / 41);
        param0 = ((param0 & -1431655766) >>> -984139903) + (param0 & 1431655765);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> -1525474366);
        param0 = 252645135 & param0 + (param0 >>> 1797532260);
        param0 = param0 + (param0 >>> -2062994456);
        param0 = param0 + (param0 >>> -601060496);
        return param0 & 255;
    }

    static {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_g = "Enter name of friend to add to list";
        field_e = "Waiting for <%0> to start the game...";
        field_f = "Yes";
    }
}
