/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ila {
    private vna field_d;
    private boolean field_e;
    private boolean field_c;
    private vna field_b;
    private gqa field_a;

    final void d(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((ila) this).field_e)) {
            return;
        }
        if (!param0) {
            ((ila) this).field_a = null;
        }
        jha var4 = (jha) (Object) ((ila) this).field_d.f(-80);
        while (var4 != null) {
            var4.b((byte) -111);
            var4 = (jha) (Object) ((ila) this).field_d.e(107);
        }
    }

    final boolean b(int param0) {
        if (param0 != 4782) {
            ((ila) this).field_d = null;
        }
        return ((ila) this).field_e;
    }

    private final gqa f(int param0) {
        if (param0 != 1366884705) {
            ((ila) this).d(-116);
        }
        if (ara.field_xb == 0) {
            return null;
        }
        return wea.field_d[-1 + ara.field_xb];
    }

    final void a(byte param0, boolean param1, boolean param2) {
        gqa var4 = null;
        int var5 = 0;
        int var6 = 0;
        jha var7 = null;
        String[] var7_array = null;
        int var8 = 0;
        gqa var8_ref_gqa = null;
        int var9 = 0;
        String[] var10 = null;
        gqa var11 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            ((ila) this).g(0);
            break L0;
          } else {
            int discarded$2 = 0;
            this.b();
            break L0;
          }
        }
        if (param1) {
          L1: {
            if (null == ((ila) this).field_a) {
              ((ila) this).field_a = this.f(1366884705);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var11 = this.f(1366884705);
            var4 = var11;
            var5 = -127 % ((param0 - -34) / 44);
            if (var11 == null) {
              break L2;
            } else {
              if (((ila) this).field_a != var11) {
                var6 = 0;
                var10 = new String[10];
                var7_array = var10;
                L3: while (true) {
                  L4: {
                    if (var6 >= 10) {
                      break L4;
                    } else {
                      if (0 > -var6 + (ara.field_xb - 1)) {
                        break L4;
                      } else {
                        var8_ref_gqa = wea.field_d[-1 + ara.field_xb - var6];
                        if (var8_ref_gqa == ((ila) this).field_a) {
                          break L4;
                        } else {
                          if (var8_ref_gqa.field_f != null) {
                            if (var8_ref_gqa.field_m) {
                              var10[var6] = var8_ref_gqa.field_f;
                              var6++;
                              continue L3;
                            } else {
                              var6++;
                              continue L3;
                            }
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var8 = 9;
                  L5: while (true) {
                    if (var8 < 0) {
                      ((ila) this).field_a = var11;
                      break L2;
                    } else {
                      if (null != var10[var8]) {
                        if ("" != var10[var8]) {
                          ((ila) this).a(0, eea.a(var10[var8], (byte) -62));
                          var8--;
                          continue L5;
                        } else {
                          var8--;
                          continue L5;
                        }
                      } else {
                        var8--;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
          }
          L6: {
            var6 = 120;
            if (!((ila) this).field_e) {
              break L6;
            } else {
              var7 = (jha) (Object) ((ila) this).field_b.f(-80);
              L7: while (true) {
                if (var7 == null) {
                  var7 = (jha) (Object) ((ila) this).field_d.f(-80);
                  L8: while (true) {
                    if (var7 == null) {
                      break L6;
                    } else {
                      L9: {
                        var7.a(var6, 4, aaa.a(false) - var7.c((byte) -96));
                        var7.a(-43);
                        if (var7.c(-1)) {
                          var6 = var6 + var7.a(true);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (var7.e((byte) -39)) {
                          var7.p(3);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var7 = (jha) (Object) ((ila) this).field_d.e(121);
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    var7.d((byte) 80);
                    if (var7.a((byte) -100) > 0) {
                      break L11;
                    } else {
                      ((ila) this).field_d.b((byte) -77, (vg) (Object) var7);
                      break L11;
                    }
                  }
                  var7 = (jha) (Object) ((ila) this).field_b.e(111);
                  continue L7;
                }
              }
            }
          }
          L12: {
            if (!((ila) this).field_c) {
              break L12;
            } else {
              rk.b(108, param1, aaa.a(false) >> 1, koa.b(0) >> 1);
              String discarded$3 = fa.a((byte) -127);
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, jha param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.b(29161) != null) {
                  if (!((ila) this).field_e) {
                    return;
                  } else {
                    L2: {
                      if (param0 > 0) {
                        ((ila) this).field_b.b((byte) -80, (vg) (Object) param2);
                        param2.a(false, param0);
                        break L2;
                      } else {
                        ((ila) this).field_d.b((byte) -67, (vg) (Object) param2);
                        break L2;
                      }
                    }
                    L3: {
                      if (param1 == 0) {
                        break L3;
                      } else {
                        ((ila) this).field_e = true;
                        break L3;
                      }
                    }
                    param2.a(false, 25, 12, 150);
                    param2.a(1, aaa.a(false) / 3);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ila.M(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void c() {
        if (!(!((ila) this).field_c)) {
            return;
        }
        int discarded$0 = 28191;
        aka.j();
        int var2 = 4;
        int var3 = 16;
        av.a(koa.b(0) >> 1, 20, var2, -5327, "", var2, var3, var3, aaa.a(false) >> 1);
        ((ila) this).field_c = true;
    }

    final static int a(boolean param0, String param1, int param2, int param3, String param4, boolean param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_104_0 = 0;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_103_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            var9 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (oba.field_e != null) {
                    break L1;
                  } else {
                    if (joa.a(param5, (byte) 121)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                if (param2 == 50) {
                  L2: {
                    if (sua.field_G != km.field_p) {
                      break L2;
                    } else {
                      L3: {
                        if (!param5) {
                          fd.field_d = via.a(param1, 64, false, param4);
                          break L3;
                        } else {
                          var10 = null;
                          fd.field_d = b.a(param1, 0, (String) null, false, tr.field_g);
                          break L3;
                        }
                      }
                      ql.field_k.field_h = 0;
                      ql.field_k.i(14, 0);
                      ql.field_k.i(fd.field_d.a((byte) 113).field_d, 0);
                      bl.a(-1, -1);
                      km.field_p = bva.field_b;
                      break L2;
                    }
                  }
                  L4: {
                    if (km.field_p != bva.field_b) {
                      break L4;
                    } else {
                      if (!ama.a(1, -1)) {
                        break L4;
                      } else {
                        L5: {
                          var6_int = vc.field_q.h(255);
                          if (var6_int == 0) {
                            km.field_p = ola.field_yb;
                            break L5;
                          } else {
                            km.field_p = bi.field_a;
                            oka.field_z = var6_int;
                            uca.field_d = -1;
                            break L5;
                          }
                        }
                        vc.field_q.field_h = 0;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (ola.field_yb != km.field_p) {
                      break L6;
                    } else {
                      if (ama.a(8, -1)) {
                        ra.field_L = vc.field_q.b(290646880);
                        vc.field_q.field_h = 0;
                        ova.a((byte) 121, param5, param3, fd.field_d, param0);
                        km.field_p = ria.field_o;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (km.field_p == ria.field_o) {
                      if (ama.a(1, param2 + -51)) {
                        L8: {
                          var6_int = vc.field_q.h(param2 + 205);
                          vc.field_q.field_h = 0;
                          oka.field_z = var6_int;
                          ji.field_d = null;
                          if (var6_int == 0) {
                            break L8;
                          } else {
                            if (var6_int == 1) {
                              break L8;
                            } else {
                              if (8 != var6_int) {
                                km.field_p = bi.field_a;
                                uca.field_d = -1;
                                break L7;
                              } else {
                                int discarded$12 = 60;
                                dea.a();
                                uc.field_L = false;
                                stackOut_30_0 = var6_int;
                                stackIn_31_0 = stackOut_30_0;
                                return stackIn_31_0;
                              }
                            }
                          }
                        }
                        km.field_p = eo.field_w;
                        uca.field_d = -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if (eo.field_w != km.field_p) {
                      break L9;
                    } else {
                      int discarded$13 = 0;
                      if (!cla.g()) {
                        break L9;
                      } else {
                        L10: {
                          tr.field_g = vc.field_q.b(param2 + 290646830);
                          gj.field_q = param1;
                          ld.field_e = vc.field_q.h(param2 ^ 205);
                          rja.field_e = vc.field_q.h(255);
                          wla.field_ub = vc.field_q.d(124);
                          var6_ref = vc.field_q.c(param2 + -28740);
                          var7 = vc.field_q.h(255);
                          if ((var7 & 1) != 0) {
                            int discarded$14 = 84;
                            rra.a();
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (param5) {
                            break L11;
                          } else {
                            L12: {
                              if (0 == (var7 & 4)) {
                                stackOut_42_0 = 0;
                                stackIn_43_0 = stackOut_42_0;
                                break L12;
                              } else {
                                stackOut_41_0 = 1;
                                stackIn_43_0 = stackOut_41_0;
                                break L12;
                              }
                            }
                            L13: {
                              ai.field_a = stackIn_43_0 != 0;
                              if ((2 & var7) == 0) {
                                stackOut_45_0 = 0;
                                stackIn_46_0 = stackOut_45_0;
                                break L13;
                              } else {
                                stackOut_44_0 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                break L13;
                              }
                            }
                            L14: {
                              ok.field_s = stackIn_46_0 != 0;
                              if ((8 & var7) == 0) {
                                stackOut_48_0 = 0;
                                stackIn_49_0 = stackOut_48_0;
                                break L14;
                              } else {
                                stackOut_47_0 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                break L14;
                              }
                            }
                            fua.field_g = stackIn_49_0 != 0;
                            if (!fua.field_g) {
                              break L11;
                            } else {
                              ok.field_s = true;
                              break L11;
                            }
                          }
                        }
                        L15: {
                          if (0 == (var7 & 16)) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L15;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L15;
                          }
                        }
                        L16: {
                          ha.field_b = stackIn_54_0 != 0;
                          if (!q.field_r) {
                            break L16;
                          } else {
                            int discarded$15 = vc.field_q.h(255);
                            int discarded$16 = vc.field_q.h(255);
                            int discarded$17 = vc.field_q.e(-104);
                            kl.field_k = vc.field_q.d(121);
                            np.field_J = new byte[kl.field_k];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= kl.field_k) {
                                break L16;
                              } else {
                                np.field_J[var8] = vc.field_q.c((byte) 103);
                                var8++;
                                continue L17;
                              }
                            }
                          }
                        }
                        L18: {
                          fna.field_k = vc.field_q.e((byte) -76);
                          var11 = (CharSequence) (Object) fna.field_k;
                          tia.field_b = jd.a(1, var11);
                          lsa.field_a = vc.field_q.h(255);
                          km.field_p = uga.field_n;
                          if (fd.field_d.a((byte) 113) == boa.field_s) {
                            vw.field_a.a(di.a(120), param2 ^ 55);
                            break L18;
                          } else {
                            if (fd.field_d.a((byte) 113) == vm.field_f) {
                              ub.field_d.a(di.a(109), 5);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          uc.field_L = false;
                          if (var6_ref != null) {
                            int discarded$18 = -21407;
                            mp.a(var6_ref, di.a(41));
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          L21: {
                            if (0 < wla.field_ub) {
                              break L21;
                            } else {
                              if (!ai.field_a) {
                                try {
                                  L22: {
                                    Object discarded$19 = lb.b(di.a(26), 2864, "unzap");
                                    break L22;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L23: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    break L23;
                                  }
                                }
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          try {
                            L24: {
                              Object discarded$20 = lb.a(param2 ^ -114, "zap", di.a(param2 + 43), new Object[1]);
                              break L24;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L25: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L25;
                            }
                          }
                          break L20;
                        }
                        L26: {
                          if (0 >= wla.field_ub) {
                            break L26;
                          } else {
                            ft.field_a = true;
                            break L26;
                          }
                        }
                        ql.field_k.a(-26185, qi.field_K);
                        var8 = 0;
                        L27: while (true) {
                          if (4 <= var8) {
                            vc.field_q.a(param2 ^ -26235, qi.field_K);
                            stackOut_80_0 = oka.field_z;
                            stackIn_81_0 = stackOut_80_0;
                            return stackIn_81_0;
                          } else {
                            qi.field_K[var8] = qi.field_K[var8] + 50;
                            var8++;
                            continue L27;
                          }
                        }
                      }
                    }
                  }
                  L28: {
                    if (bi.field_a == km.field_p) {
                      int discarded$21 = 0;
                      if (!cla.g()) {
                        break L28;
                      } else {
                        L29: {
                          int discarded$22 = 60;
                          dea.a();
                          if (oka.field_z != 7) {
                            break L29;
                          } else {
                            if (uc.field_L) {
                              break L29;
                            } else {
                              uc.field_L = true;
                              stackOut_87_0 = -1;
                              stackIn_88_0 = stackOut_87_0;
                              return stackIn_88_0;
                            }
                          }
                        }
                        L30: {
                          if (7 == oka.field_z) {
                            oka.field_z = 3;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        io.field_b = vc.field_q.e((byte) -76);
                        uc.field_L = false;
                        stackOut_92_0 = oka.field_z;
                        stackIn_93_0 = stackOut_92_0;
                        return stackIn_93_0;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L31: {
                    if (null == oba.field_e) {
                      if (uc.field_L) {
                        L32: {
                          int discarded$23 = -121;
                          if (rf.b() > 30000L) {
                            io.field_b = hb.field_u;
                            break L32;
                          } else {
                            io.field_b = sq.field_x;
                            break L32;
                          }
                        }
                        uc.field_L = false;
                        stackOut_101_0 = 3;
                        stackIn_102_0 = stackOut_101_0;
                        return stackIn_102_0;
                      } else {
                        var6_int = nn.field_b;
                        nn.field_b = uq.field_a;
                        uq.field_a = var6_int;
                        uc.field_L = true;
                        break L31;
                      }
                    } else {
                      break L31;
                    }
                  }
                  stackOut_103_0 = -1;
                  stackIn_104_0 = stackOut_103_0;
                  break L0;
                } else {
                  stackOut_6_0 = -82;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_105_0 = (RuntimeException) var6;
                stackOut_105_1 = new StringBuilder().append("ila.I(").append(param0).append(',');
                stackIn_107_0 = stackOut_105_0;
                stackIn_107_1 = stackOut_105_1;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                if (param1 == null) {
                  stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
                  stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
                  stackOut_107_2 = "null";
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  stackIn_108_2 = stackOut_107_2;
                  break L33;
                } else {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "{...}";
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_108_1 = stackOut_106_1;
                  stackIn_108_2 = stackOut_106_2;
                  break L33;
                }
              }
              L34: {
                stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
                stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param4 == null) {
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
              throw tba.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + ',' + param5 + ')');
            }
            return stackIn_104_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 != -1) {
            ila.a(false);
        }
        if (!((ila) this).field_c) {
            return false;
        }
        int var4 = 0;
        var4 = dha.a(13, 12, (byte) -107, 15) ? 1 : 0;
        return var4 != 0;
    }

    final void g(int param0) {
        if (!(!((ila) this).field_e)) {
            return;
        }
        ((ila) this).field_e = true;
        ((ila) this).field_d.d(8);
        if (param0 != 0) {
            ((ila) this).field_a = null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            int discarded$0 = ila.a(false, (String) null, 15, -14, (String) null, true);
        }
        qw.a(256);
    }

    final static gqa a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kh var8 = null;
        wua var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_20_0 = null;
        Object stackOut_19_0 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = vc.field_q;
          var3 = var8.h(255);
          gja.field_x = 127 & var3;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          sb.field_b = stackIn_3_0 != 0;
          jda.field_m = var8.h(255);
          cca.field_z = var8.b(290646880);
          if (gja.field_x == 2) {
            gb.field_a = var8.d(127);
            ega.field_b = var8.a(-32768);
            break L1;
          } else {
            gb.field_a = 0;
            ega.field_b = 0;
            break L1;
          }
        }
        L2: {
          if (var8.h(255) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          esa.field_c = var8.e((byte) -76);
          if (var4 != 0) {
            gia.field_q = var8.e((byte) -76);
            break L3;
          } else {
            gia.field_q = esa.field_c;
            break L3;
          }
        }
        L4: {
          L5: {
            if (gja.field_x == 1) {
              break L5;
            } else {
              if (gja.field_x == 4) {
                break L5;
              } else {
                era.field_a = 0;
                dga.field_a = null;
                break L4;
              }
            }
          }
          era.field_a = var8.d(122);
          dga.field_a = var8.e((byte) -76);
          break L4;
        }
        L6: {
          if (!param1) {
            int discarded$2 = -117;
            int discarded$3 = 80;
            hi.field_p = dl.a((uia) (Object) var8);
            qra.field_e = null;
            break L6;
          } else {
            var5 = var8.d(121);
            try {
              L7: {
                L8: {
                  var9 = qu.field_a.a(false, var5);
                  hi.field_p = var9.b((byte) -5);
                  if (!gia.field_q.equals((Object) (Object) fna.field_k)) {
                    stackOut_20_0 = var9.field_m;
                    stackIn_21_0 = stackOut_20_0;
                    break L8;
                  } else {
                    stackOut_19_0 = null;
                    stackIn_21_0 = (int[]) (Object) stackOut_19_0;
                    break L8;
                  }
                }
                qra.field_e = stackIn_21_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ssa.a("CC1", (byte) 115, (Throwable) (Object) var6);
                hi.field_p = null;
                qra.field_e = null;
                break L9;
              }
            }
            break L6;
          }
        }
        return new gqa(param1);
    }

    final void a(int param0, jha param1) {
        try {
            ((ila) this).a(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ila.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        ((ila) this).g(0);
        int discarded$0 = 0;
        this.c();
        if (param0 >= -57) {
            ((ila) this).field_b = null;
        }
    }

    private final void b() {
        if (!(((ila) this).field_e)) {
            return;
        }
        ((ila) this).field_e = false;
        ((ila) this).field_d.d(8);
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -8832) {
            break L0;
          } else {
            gqa discarded$2 = this.f(-98);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((ila) this).field_c) {
              break L2;
            } else {
              if (!ni.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        int discarded$0 = 0;
        this.b();
        ((ila) this).c(-59);
        int var2 = -75 / ((31 - param0) / 57);
    }

    final void c(int param0) {
        int var2 = -48 % ((2 - param0) / 41);
        if (!((ila) this).field_c) {
            return;
        }
        cn.e(19470);
        ((ila) this).field_c = false;
    }

    ila() {
        ((ila) this).field_e = false;
        ((ila) this).field_c = false;
        ((ila) this).field_d = new vna();
        ((ila) this).field_b = new vna();
    }

    static {
    }
}
