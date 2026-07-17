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
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var11 = 0;
        int var10 = (int)((long)var4 * (long)var6 >> 16);
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wn var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            ((pa) this).field_n.b(param0, param1, param2);
            var6 = (wn) (Object) ((pa) this).field_k.a((byte) -93);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((pa) this).field_m.b(-124, var6)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_D) {
                        this.a(var5, var6, param0, (byte) 46, var4_int, var4_int - -var5);
                        var6.field_D = var6.field_D - var5;
                        break L2;
                      } else {
                        this.a(var6.field_D, var6, param0, (byte) 46, var4_int, var4_int + var5);
                        var4_int = var4_int + var6.field_D;
                        var5 = var5 - var6.field_D;
                        if (((pa) this).field_m.a(var4_int, param0, var5, 123, var6)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (wn) (Object) ((pa) this).field_k.a(16213);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("pa.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static int a(String param0, boolean param1, int param2, byte param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var10 = null;
            int stackIn_5_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_57_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_104_0 = 0;
            int stackIn_107_0 = 0;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            String stackIn_114_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_103_0 = 0;
            int stackOut_106_0 = 0;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            String stackOut_112_2 = null;
            var9 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (oj.field_Ub == null) {
                    if (ce.a(-69, param1)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ul.field_c == ug.field_a) {
                    L3: {
                      if (!param1) {
                        int discarded$9 = 0;
                        ab.field_G = dg.a(param5, 16711935, param0);
                        break L3;
                      } else {
                        int discarded$10 = 0;
                        ab.field_G = pl.a(md.field_a, (String) null, 127, param0);
                        break L3;
                      }
                    }
                    gk.field_g.field_l = 0;
                    gk.field_g.a(14, -77);
                    gk.field_g.a(ab.field_G.a(true).field_d, 77);
                    al.b(-1, -1);
                    ug.field_a = th.field_t;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (th.field_t != ug.field_a) {
                    break L4;
                  } else {
                    L5: {
                      if (!wg.a(1, 0)) {
                        break L5;
                      } else {
                        L6: {
                          var6_int = sh.field_qb.g(11132);
                          if (0 == var6_int) {
                            ug.field_a = ga.field_Ob;
                            break L6;
                          } else {
                            ci.field_q = var6_int;
                            ba.field_a = -1;
                            ug.field_a = ub.field_E;
                            break L6;
                          }
                        }
                        sh.field_qb.field_l = 0;
                        break L5;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (ug.field_a != ga.field_Ob) {
                    break L7;
                  } else {
                    if (!wg.a(8, 0)) {
                      break L7;
                    } else {
                      ph.field_i = sh.field_qb.e((byte) -60);
                      sh.field_qb.field_l = 0;
                      md.a(param1, 0, param4, param2, ab.field_G);
                      ug.field_a = lg.field_d;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (ug.field_a == lg.field_d) {
                    if (wg.a(1, 0)) {
                      L9: {
                        var6_int = sh.field_qb.g(11132);
                        ci.field_q = var6_int;
                        mj.field_B = null;
                        sh.field_qb.field_l = 0;
                        if (var6_int == 0) {
                          break L9;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int != 8) {
                              ba.field_a = -1;
                              ug.field_a = ub.field_E;
                              break L8;
                            } else {
                              tn.a(false);
                              fh.field_e = false;
                              stackOut_32_0 = var6_int;
                              stackIn_33_0 = stackOut_32_0;
                              return stackIn_33_0;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      ug.field_a = nf.field_h;
                      ba.field_a = -1;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (nf.field_h != ug.field_a) {
                    break L10;
                  } else {
                    if (ic.c((byte) 48)) {
                      L11: {
                        md.field_a = sh.field_qb.e((byte) -60);
                        he.field_Wb = param0;
                        hd.field_d = sh.field_qb.g(11132);
                        og.field_s = sh.field_qb.g(11132);
                        bn.field_d = sh.field_qb.c((byte) -64);
                        var6_ref = sh.field_qb.f(88);
                        var7 = sh.field_qb.g(11132);
                        if ((var7 & 1) == 0) {
                          break L11;
                        } else {
                          int discarded$11 = 0;
                          oe.a();
                          break L11;
                        }
                      }
                      L12: {
                        if (!param1) {
                          L13: {
                            if ((var7 & 2) == 0) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L13;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L13;
                            }
                          }
                          L14: {
                            dh.field_n = stackIn_45_0 != 0;
                            if ((8 & var7) == 0) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L14;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L14;
                            }
                          }
                          L15: {
                            wg.field_f = stackIn_48_0 != 0;
                            if (0 == (4 & var7)) {
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L15;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L15;
                            }
                          }
                          cj.field_l = stackIn_51_0 != 0;
                          if (wg.field_f) {
                            dh.field_n = true;
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      L16: {
                        if ((var7 & 16) == 0) {
                          stackOut_56_0 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          break L16;
                        } else {
                          stackOut_55_0 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          break L16;
                        }
                      }
                      L17: {
                        wd.field_a = stackIn_57_0 != 0;
                        if (!el.field_k) {
                          break L17;
                        } else {
                          int discarded$12 = sh.field_qb.g(11132);
                          int discarded$13 = sh.field_qb.g(11132);
                          int discarded$14 = sh.field_qb.d((byte) 98);
                          rn.field_e = sh.field_qb.c((byte) 127);
                          lj.field_d = new byte[rn.field_e];
                          var8 = 0;
                          L18: while (true) {
                            if (~rn.field_e >= ~var8) {
                              break L17;
                            } else {
                              lj.field_d[var8] = sh.field_qb.a((byte) 114);
                              var8++;
                              continue L18;
                            }
                          }
                        }
                      }
                      L19: {
                        mi.field_d = sh.field_qb.h(-126);
                        var10 = (CharSequence) (Object) mi.field_d;
                        wn.field_n = c.a(var10, true);
                        mf.field_h = sh.field_qb.g(11132);
                        ug.field_a = kh.field_c;
                        if (ab.field_G.a(true) != qg.field_r) {
                          if (ab.field_G.a(true) == p.field_b) {
                            Virogrid.field_O.a(mb.g((byte) -86), (byte) 100);
                            break L19;
                          } else {
                            break L19;
                          }
                        } else {
                          aa.field_b.a(mb.g((byte) -86), (byte) 88);
                          break L19;
                        }
                      }
                      L20: {
                        fh.field_e = false;
                        if (var6_ref != null) {
                          jd.a(-69, var6_ref, mb.g((byte) 13));
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          if (0 < bn.field_d) {
                            break L22;
                          } else {
                            if (cj.field_l) {
                              break L22;
                            } else {
                              try {
                                L23: {
                                  Object discarded$15 = q.b("unzap", 6168, mb.g((byte) 32));
                                  break L23;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L24: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L24;
                                }
                              }
                              break L21;
                            }
                          }
                        }
                        try {
                          L25: {
                            Object discarded$16 = q.a(mb.g((byte) 61), -8582, new Object[1], "zap");
                            break L25;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L26: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L26;
                          }
                        }
                        break L21;
                      }
                      L27: {
                        if (bn.field_d <= 0) {
                          break L27;
                        } else {
                          wg.field_c = true;
                          break L27;
                        }
                      }
                      gk.field_g.a(sb.field_b, false);
                      var8 = 0;
                      L28: while (true) {
                        if (var8 >= 4) {
                          sh.field_qb.a(sb.field_b, false);
                          stackOut_83_0 = ci.field_q;
                          stackIn_84_0 = stackOut_83_0;
                          return stackIn_84_0;
                        } else {
                          sb.field_b[var8] = sb.field_b[var8] + 50;
                          var8++;
                          continue L28;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L29: {
                  if (ub.field_E == ug.field_a) {
                    if (ic.c((byte) 48)) {
                      L30: {
                        tn.a(false);
                        if (ci.field_q != 7) {
                          break L30;
                        } else {
                          if (fh.field_e) {
                            break L30;
                          } else {
                            fh.field_e = true;
                            stackOut_91_0 = -1;
                            stackIn_92_0 = stackOut_91_0;
                            return stackIn_92_0;
                          }
                        }
                      }
                      L31: {
                        if (7 != ci.field_q) {
                          break L31;
                        } else {
                          ci.field_q = 3;
                          break L31;
                        }
                      }
                      ld.field_g = sh.field_qb.h(-125);
                      fh.field_e = false;
                      stackOut_95_0 = ci.field_q;
                      stackIn_96_0 = stackOut_95_0;
                      return stackIn_96_0;
                    } else {
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                L32: {
                  if (null == oj.field_Ub) {
                    if (!fh.field_e) {
                      var6_int = uh.field_b;
                      uh.field_b = tn.field_i;
                      fh.field_e = true;
                      tn.field_i = var6_int;
                      break L32;
                    } else {
                      L33: {
                        int discarded$17 = -126;
                        if (af.b() <= 30000L) {
                          ld.field_g = ll.field_a;
                          break L33;
                        } else {
                          ld.field_g = wa.field_L;
                          break L33;
                        }
                      }
                      fh.field_e = false;
                      stackOut_103_0 = 3;
                      stackIn_104_0 = stackOut_103_0;
                      return stackIn_104_0;
                    }
                  } else {
                    break L32;
                  }
                }
                stackOut_106_0 = -1;
                stackIn_107_0 = stackOut_106_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L34: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_108_0 = (RuntimeException) var6;
                stackOut_108_1 = new StringBuilder().append("pa.H(");
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param0 == null) {
                  stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                  stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
                  stackOut_110_2 = "null";
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  break L34;
                } else {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "{...}";
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_111_1 = stackOut_109_1;
                  stackIn_111_2 = stackOut_109_2;
                  break L34;
                }
              }
              L35: {
                stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
                stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(44).append(param1).append(44).append(param2).append(44).append(-57).append(44).append(param4).append(44);
                stackIn_113_0 = stackOut_111_0;
                stackIn_113_1 = stackOut_111_1;
                stackIn_112_0 = stackOut_111_0;
                stackIn_112_1 = stackOut_111_1;
                if (param5 == null) {
                  stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
                  stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                  stackOut_113_2 = "null";
                  stackIn_114_0 = stackOut_113_0;
                  stackIn_114_1 = stackOut_113_1;
                  stackIn_114_2 = stackOut_113_2;
                  break L35;
                } else {
                  stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                  stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                  stackOut_112_2 = "{...}";
                  stackIn_114_0 = stackOut_112_0;
                  stackIn_114_1 = stackOut_112_1;
                  stackIn_114_2 = stackOut_112_2;
                  break L35;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_114_0, stackIn_114_2 + 41);
            }
            return stackIn_107_0;
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
        field_l = null;
        field_o = null;
    }

    final int d() {
        return 0;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -110) {
              stackOut_3_0 = jm.a(10, 88, true, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pa.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0, int param1, wn param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        i stackIn_7_0 = null;
        i stackIn_8_0 = null;
        i stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        i stackOut_6_0 = null;
        i stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        i stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == (4 & ((pa) this).field_m.field_U[param2.field_h])) {
                  break L2;
                } else {
                  if (param2.field_o < 0) {
                    var4_int = ((pa) this).field_m.field_I[param2.field_h] / ua.field_p;
                    var5 = (-param2.field_B + (1048575 + var4_int)) / var4_int;
                    param2.field_B = 1048575 & param2.field_B - -(param1 * var4_int);
                    if (param1 >= var5) {
                      L3: {
                        if (((pa) this).field_m.field_S[param2.field_h] == 0) {
                          param2.field_p = jh.b(param2.field_q, param2.field_p.k(), param2.field_p.l(), param2.field_p.f());
                          break L3;
                        } else {
                          L4: {
                            param2.field_p = jh.b(param2.field_q, param2.field_p.k(), 0, param2.field_p.f());
                            stackOut_6_0 = ((pa) this).field_m;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_7_0 = stackOut_6_0;
                            if (param2.field_E.field_p[param2.field_l] >= 0) {
                              stackOut_8_0 = (i) (Object) stackIn_8_0;
                              stackOut_8_1 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              break L4;
                            } else {
                              stackOut_7_0 = (i) (Object) stackIn_7_0;
                              stackOut_7_1 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              break L4;
                            }
                          }
                          ((i) (Object) stackIn_9_0).a(stackIn_9_1 != 0, -16257, param2);
                          break L3;
                        }
                      }
                      L5: {
                        if (param2.field_E.field_p[param2.field_l] < 0) {
                          param2.field_p.e(-1);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      param1 = param2.field_B / var4_int;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    param2.field_p.a(param1);
                    break L1;
                  }
                }
              }
              param2.field_p.a(param1);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("pa.D(").append(1).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    private final void a(int param0, wn param1, int[] param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jh var11 = null;
        int var12 = 0;
        i stackIn_13_0 = null;
        i stackIn_14_0 = null;
        i stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        i stackOut_12_0 = null;
        i stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        i stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((pa) this).field_m.field_U[param1.field_h]) == 0) {
                break L1;
              } else {
                if (param1.field_o < 0) {
                  var7_int = ((pa) this).field_m.field_I[param1.field_h] / ua.field_p;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 + -param1.field_B) / var7_int;
                    if (var8 <= param0) {
                      L3: {
                        param1.field_p.b(param2, param4, var8);
                        param4 = param4 + var8;
                        param1.field_B = param1.field_B + (var8 * var7_int + -1048576);
                        param0 = param0 - var8;
                        var9 = ua.field_p / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param1.field_p;
                        if (((pa) this).field_m.field_S[param1.field_h] != 0) {
                          L5: {
                            param1.field_p = jh.b(param1.field_q, var11.k(), 0, var11.f());
                            stackOut_12_0 = ((pa) this).field_m;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (param1.field_E.field_p[param1.field_l] >= 0) {
                              stackOut_14_0 = (i) (Object) stackIn_14_0;
                              stackOut_14_1 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              break L5;
                            } else {
                              stackOut_13_0 = (i) (Object) stackIn_13_0;
                              stackOut_13_1 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              break L5;
                            }
                          }
                          ((i) (Object) stackIn_15_0).a(stackIn_15_1 != 0, -16257, param1);
                          param1.field_p.d(var9, var11.l());
                          break L4;
                        } else {
                          param1.field_p = jh.b(param1.field_q, var11.k(), var11.l(), var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param1.field_E.field_p[param1.field_l]) {
                          param1.field_p.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.g(var9);
                      var11.b(param2, param4, -param4 + param5);
                      if (var11.i()) {
                        ((pa) this).field_n.a((in) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      param1.field_B = param1.field_B + var7_int * param0;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_p.b(param2, param4, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var7;
            stackOut_26_1 = new StringBuilder().append("pa.E(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + 46 + 44 + param4 + 44 + param5 + 41);
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
        try {
            ((pa) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
