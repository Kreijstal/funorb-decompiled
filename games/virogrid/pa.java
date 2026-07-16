/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends in {
    p field_k;
    private i field_m;
    static ob field_l;
    static km field_o;
    r field_n;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = id.a(param1, 32);
        int var4 = nf.a(21855, param1);
        int var5 = id.a(param2, 32);
        int var6 = nf.a(21855, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 322461200);
        int var8 = (int)((long)var3 * (long)var6 >> -57759408);
        int var9 = (int)((long)var5 * (long)var4 >> -1506704752);
        int var11 = -89 % ((param0 - -71) / 53);
        int var10 = (int)((long)var4 * (long)var6 >> 1921634640);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void a(int param0) {
        int var2 = 0;
        wn var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        ((pa) this).field_n.a(param0);
        var3 = (wn) (Object) ((pa) this).field_k.a((byte) -111);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (((pa) this).field_m.b(-109, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_D >= var2) {
                    this.a(true, var2, var3);
                    var3.field_D = var3.field_D - var2;
                    break L1;
                  } else {
                    this.a(true, var3.field_D, var3);
                    var2 = var2 - var3.field_D;
                    if (!((pa) this).field_m.a(0, (int[]) null, var2, 123, var3)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (wn) (Object) ((pa) this).field_k.a(16213);
            continue L0;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        wn var6 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        ((pa) this).field_n.b(param0, param1, param2);
        var6 = (wn) (Object) ((pa) this).field_k.a((byte) -93);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (!((pa) this).field_m.b(-124, var6)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_D) {
                    this.a(var5, var6, param0, (byte) 46, var4, var4 - -var5);
                    var6.field_D = var6.field_D - var5;
                    break L1;
                  } else {
                    this.a(var6.field_D, var6, param0, (byte) 46, var4, var4 + var5);
                    var4 = var4 + var6.field_D;
                    var5 = var5 - var6.field_D;
                    if (((pa) this).field_m.a(var4, param0, var5, 123, var6)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (wn) (Object) ((pa) this).field_k.a(16213);
            continue L0;
          }
        }
    }

    final static int a(String param0, boolean param1, int param2, byte param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref_String = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var10 = null;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_54_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            L0: {
              var9 = Virogrid.field_F ? 1 : 0;
              if (oj.field_Ub == null) {
                if (ce.a(-69, param1)) {
                  break L0;
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
            L1: {
              if (ul.field_c == ug.field_a) {
                L2: {
                  if (!param1) {
                    ab.field_G = dg.a(param5, 16711935, param0, false);
                    break L2;
                  } else {
                    ab.field_G = pl.a(md.field_a, (String) null, param3 + 184, param0, false);
                    break L2;
                  }
                }
                gk.field_g.field_l = 0;
                gk.field_g.a(14, -77);
                gk.field_g.a(ab.field_G.a(true).field_d, 77);
                al.b(-1, -1);
                ug.field_a = th.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (th.field_t != ug.field_a) {
                break L3;
              } else {
                if (!wg.a(1, param3 + 57)) {
                  break L3;
                } else {
                  L4: {
                    var6 = sh.field_qb.g(11132);
                    if (0 == var6) {
                      ug.field_a = ga.field_Ob;
                      break L4;
                    } else {
                      ci.field_q = var6;
                      ba.field_a = -1;
                      ug.field_a = ub.field_E;
                      break L4;
                    }
                  }
                  sh.field_qb.field_l = 0;
                  break L3;
                }
              }
            }
            if (param3 == -57) {
              L5: {
                if (ug.field_a != ga.field_Ob) {
                  break L5;
                } else {
                  if (!wg.a(8, 0)) {
                    break L5;
                  } else {
                    ph.field_i = sh.field_qb.e((byte) -60);
                    sh.field_qb.field_l = 0;
                    md.a(param1, 0, param4, param2, ab.field_G);
                    ug.field_a = lg.field_d;
                    break L5;
                  }
                }
              }
              L6: {
                if (ug.field_a == lg.field_d) {
                  if (wg.a(1, 0)) {
                    L7: {
                      var6 = sh.field_qb.g(11132);
                      ci.field_q = var6;
                      mj.field_B = null;
                      sh.field_qb.field_l = 0;
                      if (-1 == (var6 ^ -1)) {
                        break L7;
                      } else {
                        if (var6 != 1) {
                          if (-9 != (var6 ^ -1)) {
                            ba.field_a = -1;
                            ug.field_a = ub.field_E;
                            break L6;
                          } else {
                            tn.a(false);
                            fh.field_e = false;
                            return var6;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                    ug.field_a = nf.field_h;
                    ba.field_a = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L8: {
                if (nf.field_h != ug.field_a) {
                  break L8;
                } else {
                  if (ic.c((byte) 48)) {
                    L9: {
                      md.field_a = sh.field_qb.e((byte) -60);
                      he.field_Wb = param0;
                      hd.field_d = sh.field_qb.g(11132);
                      og.field_s = sh.field_qb.g(11132);
                      bn.field_d = sh.field_qb.c((byte) -64);
                      var6_ref_String = sh.field_qb.f(param3 ^ -97);
                      var7 = sh.field_qb.g(param3 ^ -11077);
                      if ((var7 & 1) == 0) {
                        break L9;
                      } else {
                        oe.a(0);
                        break L9;
                      }
                    }
                    L10: {
                      if (!param1) {
                        L11: {
                          if (-1 == (var7 & 2 ^ -1)) {
                            stackOut_41_0 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            break L11;
                          } else {
                            stackOut_40_0 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            break L11;
                          }
                        }
                        L12: {
                          dh.field_n = stackIn_42_0 != 0;
                          if (-1 == (8 & var7 ^ -1)) {
                            stackOut_44_0 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            break L12;
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L12;
                          }
                        }
                        L13: {
                          wg.field_f = stackIn_45_0 != 0;
                          if (0 == (4 & var7)) {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            break L13;
                          } else {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            break L13;
                          }
                        }
                        cj.field_l = stackIn_48_0 != 0;
                        if (wg.field_f) {
                          dh.field_n = true;
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L14: {
                      if (-1 == (var7 & 16 ^ -1)) {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        break L14;
                      } else {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        break L14;
                      }
                    }
                    L15: {
                      wd.field_a = stackIn_54_0 != 0;
                      if (!el.field_k) {
                        break L15;
                      } else {
                        int discarded$5 = sh.field_qb.g(11132);
                        int discarded$6 = sh.field_qb.g(param3 + 11189);
                        int discarded$7 = sh.field_qb.d((byte) 98);
                        rn.field_e = sh.field_qb.c((byte) 127);
                        lj.field_d = new byte[rn.field_e];
                        var8 = 0;
                        L16: while (true) {
                          if ((rn.field_e ^ -1) >= (var8 ^ -1)) {
                            break L15;
                          } else {
                            lj.field_d[var8] = sh.field_qb.a((byte) 114);
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                    L17: {
                      mi.field_d = sh.field_qb.h(param3 + -69);
                      var10 = (CharSequence) (Object) mi.field_d;
                      wn.field_n = c.a(var10, true);
                      mf.field_h = sh.field_qb.g(11132);
                      ug.field_a = kh.field_c;
                      if (ab.field_G.a(true) != qg.field_r) {
                        if (ab.field_G.a(true) == p.field_b) {
                          Virogrid.field_O.a(mb.g((byte) -86), (byte) 100);
                          break L17;
                        } else {
                          break L17;
                        }
                      } else {
                        aa.field_b.a(mb.g((byte) -86), (byte) 88);
                        break L17;
                      }
                    }
                    L18: {
                      fh.field_e = false;
                      if (var6_ref_String != null) {
                        jd.a(-69, var6_ref_String, mb.g((byte) 13));
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      L20: {
                        if (0 < bn.field_d) {
                          break L20;
                        } else {
                          if (cj.field_l) {
                            break L20;
                          } else {
                            try {
                              L21: {
                                Object discarded$8 = q.b("unzap", 6168, mb.g((byte) 32));
                                break L21;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L22: {
                                var8_ref_Throwable = decompiledCaughtException;
                                break L22;
                              }
                            }
                            break L19;
                          }
                        }
                      }
                      try {
                        L23: {
                          Object discarded$9 = q.a(mb.g((byte) 61), -8582, new Object[1], "zap");
                          break L23;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L24: {
                          var8_ref_Throwable = decompiledCaughtException;
                          break L24;
                        }
                      }
                      break L19;
                    }
                    L25: {
                      if (-1 <= (bn.field_d ^ -1)) {
                        break L25;
                      } else {
                        wg.field_c = true;
                        break L25;
                      }
                    }
                    gk.field_g.a(sb.field_b, false);
                    var8 = 0;
                    L26: while (true) {
                      if (-5 >= (var8 ^ -1)) {
                        sh.field_qb.a(sb.field_b, false);
                        return ci.field_q;
                      } else {
                        sb.field_b[var8] = sb.field_b[var8] + 50;
                        var8++;
                        continue L26;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
              }
              L27: {
                if (ub.field_E == ug.field_a) {
                  if (ic.c((byte) 48)) {
                    L28: {
                      tn.a(false);
                      if ((ci.field_q ^ -1) != -8) {
                        break L28;
                      } else {
                        if (fh.field_e) {
                          break L28;
                        } else {
                          fh.field_e = true;
                          return -1;
                        }
                      }
                    }
                    L29: {
                      if (7 != ci.field_q) {
                        break L29;
                      } else {
                        ci.field_q = 3;
                        break L29;
                      }
                    }
                    ld.field_g = sh.field_qb.h(param3 ^ 68);
                    fh.field_e = false;
                    return ci.field_q;
                  } else {
                    break L27;
                  }
                } else {
                  break L27;
                }
              }
              L30: {
                if (null == oj.field_Ub) {
                  if (!fh.field_e) {
                    var6 = uh.field_b;
                    uh.field_b = tn.field_i;
                    fh.field_e = true;
                    tn.field_i = var6;
                    break L30;
                  } else {
                    L31: {
                      if (af.b(param3 ^ 69) <= 30000L) {
                        ld.field_g = ll.field_a;
                        break L31;
                      } else {
                        ld.field_g = wa.field_L;
                        break L31;
                      }
                    }
                    fh.field_e = false;
                    return 3;
                  }
                } else {
                  break L30;
                }
              }
              return -1;
            } else {
              return -38;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final in c() {
        wn var1 = (wn) (Object) ((pa) this).field_k.a((byte) -77);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_p == null)) {
            return (in) (Object) var1.field_p;
        }
        return ((pa) this).b();
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_o = null;
        }
        field_l = null;
        field_o = null;
    }

    final int d() {
        return 0;
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 > -110) {
            return false;
        }
        return jm.a(10, 88, true, param0);
    }

    private final void a(boolean param0, int param1, wn param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        i stackIn_7_0 = null;
        i stackIn_8_0 = null;
        i stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        i stackOut_6_0 = null;
        i stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        i stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          if (0 == (4 & ((pa) this).field_m.field_U[param2.field_h])) {
            break L0;
          } else {
            if ((param2.field_o ^ -1) > -1) {
              var4 = ((pa) this).field_m.field_I[param2.field_h] / ua.field_p;
              var5 = (-param2.field_B + (1048575 + var4)) / var4;
              param2.field_B = 1048575 & param2.field_B - -(param1 * var4);
              if (param1 >= var5) {
                L1: {
                  if (((pa) this).field_m.field_S[param2.field_h] == 0) {
                    param2.field_p = jh.b(param2.field_q, param2.field_p.k(), param2.field_p.l(), param2.field_p.f());
                    break L1;
                  } else {
                    L2: {
                      param2.field_p = jh.b(param2.field_q, param2.field_p.k(), 0, param2.field_p.f());
                      stackOut_6_0 = ((pa) this).field_m;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (-1 >= (param2.field_E.field_p[param2.field_l] ^ -1)) {
                        stackOut_8_0 = (i) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L2;
                      } else {
                        stackOut_7_0 = (i) (Object) stackIn_7_0;
                        stackOut_7_1 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L2;
                      }
                    }
                    ((i) (Object) stackIn_9_0).a(stackIn_9_1 != 0, -16257, param2);
                    break L1;
                  }
                }
                L3: {
                  if (param2.field_E.field_p[param2.field_l] < 0) {
                    param2.field_p.e(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param2.field_B / var4;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L4: {
          if (param0) {
            break L4;
          } else {
            var6 = null;
            ((pa) this).b((int[]) null, 69, -108);
            break L4;
          }
        }
        param2.field_p.a(param1);
    }

    private final void a(int param0, wn param1, int[] param2, byte param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jh var11 = null;
        int var12 = 0;
        i stackIn_12_0 = null;
        i stackIn_13_0 = null;
        i stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        i stackOut_11_0 = null;
        i stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        i stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var12 = Virogrid.field_F ? 1 : 0;
          if ((4 & ((pa) this).field_m.field_U[param1.field_h]) == 0) {
            break L0;
          } else {
            if (param1.field_o < 0) {
              var7 = ((pa) this).field_m.field_I[param1.field_h] / ua.field_p;
              L1: while (true) {
                var8 = (var7 + 1048575 + -param1.field_B) / var7;
                if (var8 <= param0) {
                  L2: {
                    param1.field_p.b(param2, param4, var8);
                    param4 = param4 + var8;
                    param1.field_B = param1.field_B + (var8 * var7 + -1048576);
                    param0 = param0 - var8;
                    var9 = ua.field_p / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param1.field_p;
                    if (((pa) this).field_m.field_S[param1.field_h] != 0) {
                      L4: {
                        param1.field_p = jh.b(param1.field_q, var11.k(), 0, var11.f());
                        stackOut_11_0 = ((pa) this).field_m;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (param1.field_E.field_p[param1.field_l] >= 0) {
                          stackOut_13_0 = (i) (Object) stackIn_13_0;
                          stackOut_13_1 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L4;
                        } else {
                          stackOut_12_0 = (i) (Object) stackIn_12_0;
                          stackOut_12_1 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L4;
                        }
                      }
                      ((i) (Object) stackIn_14_0).a(stackIn_14_1 != 0, -16257, param1);
                      param1.field_p.d(var9, var11.l());
                      break L3;
                    } else {
                      param1.field_p = jh.b(param1.field_q, var11.k(), var11.l(), var11.f());
                      break L3;
                    }
                  }
                  L5: {
                    if (0 > param1.field_E.field_p[param1.field_l]) {
                      param1.field_p.e(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11.g(var9);
                  var11.b(param2, param4, -param4 + param5);
                  if (var11.i()) {
                    ((pa) this).field_n.a((in) (Object) var11);
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  param1.field_B = param1.field_B + var7 * param0;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param3 != 46) {
          return;
        } else {
          param1.field_p.b(param2, param4, param0);
          return;
        }
    }

    final in b() {
        wn var1_ref = null;
        int var2 = Virogrid.field_F ? 1 : 0;
        do {
            var1_ref = (wn) (Object) ((pa) this).field_k.a(16213);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_p);
        return (in) (Object) var1_ref.field_p;
    }

    pa(i param0) {
        ((pa) this).field_k = new p();
        ((pa) this).field_n = new r();
        ((pa) this).field_m = param0;
    }

    static {
    }
}
