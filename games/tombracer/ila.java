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
        if (!(this.field_e)) {
            return;
        }
        if (!param0) {
            this.field_a = (gqa) null;
        }
        jha var4 = (jha) ((Object) this.field_d.f(-80));
        while (var4 != null) {
            var4.b((byte) -111);
            var4 = (jha) ((Object) this.field_d.e(107));
        }
    }

    final boolean b(int param0) {
        if (param0 != 4782) {
            this.field_d = (vna) null;
        }
        return this.field_e;
    }

    private final gqa f(int param0) {
        if (param0 != 1366884705) {
            this.d(-116);
        }
        if (ara.field_xb == 0) {
            return null;
        }
        return wea.field_d[-1 + ara.field_xb];
    }

    final void a(byte param0, boolean param1, boolean param2) {
        int stackIn_46_0 = 0;
        boolean stackIn_46_1 = false;
        gqa var4;
        int var5;
        int var6;
        String[] var7;
        jha var7_ref;
        gqa var8_ref_gqa;
        int var8;
        int var9;
        String[] var10;
        gqa var11;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            this.g(0);
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        if (param1) {
          L1: {
            if (null == this.field_a) {
              this.field_a = this.f(1366884705);
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
              if (this.field_a != var11) {
                var6 = 0;
                var10 = new String[10];
                var7 = var10;
                L3: while (true) {
                  L4: {
                    if (-11 >= (var6 ^ -1)) {
                      break L4;
                    } else {
                      if (0 > -var6 + (ara.field_xb - 1)) {
                        break L4;
                      } else {
                        var8_ref_gqa = wea.field_d[-1 + ara.field_xb - var6];
                        if (var8_ref_gqa == this.field_a) {
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
                  var10 = var7;
                  var8 = 9;
                  L5: while (true) {
                    if (-1 < (var8 ^ -1)) {
                      this.field_a = var11;
                      break L2;
                    } else {
                      if (null != var10[var8]) {
                        if ("" != var10[var8]) {
                          this.a(0, eea.a(var10[var8], (byte) -62));
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
            if (!this.field_e) {
              break L6;
            } else {
              var7_ref = (jha) ((Object) this.field_b.f(-80));
              L7: while (true) {
                if (var7_ref == null) {
                  var7_ref = (jha) ((Object) this.field_d.f(-80));
                  L8: while (true) {
                    if (var7_ref == null) {
                      break L6;
                    } else {
                      L9: {
                        var7_ref.a(var6, 4, aaa.a(false) - var7_ref.c((byte) -96));
                        var7_ref.a(-43);
                        if (var7_ref.c(-1)) {
                          var6 = var6 + var7_ref.a(true);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (var7_ref.e((byte) -39)) {
                          var7_ref.p(3);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var7_ref = (jha) ((Object) this.field_d.e(121));
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    var7_ref.d((byte) 80);
                    if (-1 > (var7_ref.a((byte) -100) ^ -1)) {
                      break L11;
                    } else {
                      this.field_d.b((byte) -77, var7_ref);
                      break L11;
                    }
                  }
                  var7_ref = (jha) ((Object) this.field_b.e(111));
                  continue L7;
                }
              }
            }
          }
          L12: {
            if (!this.field_c) {
              break L12;
            } else {
              stackIn_46_0 = 108;
              stackIn_46_1 = param1;
              rk.b(stackIn_46_0, stackIn_46_1, aaa.a(false) >> 1970883489, koa.b(0) >> -2076865759);
              fa.a((byte) -127);
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, jha param2) {
        if (param2 == null || param2.b(29161) == null) {
            return;
        }
        if (!(this.field_e)) {
            return;
        }
        try {
            if ((param0 ^ -1) >= -1) {
                this.field_d.b((byte) -67, param2);
            } else {
                this.field_b.b((byte) -80, param2);
                param2.a(false, param0);
            }
            if (param1 != 0) {
                this.field_e = true;
            }
            param2.a(false, 25, 12, 150);
            param2.a(1, aaa.a(false) / 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ila.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(boolean param0) {
        if (!(!this.field_c)) {
            return;
        }
        aka.j(28191);
        int var2 = 4;
        int var3 = 16;
        av.a(koa.b(0) >> 1092439713, 20, var2, -5327, "", var2, var3, var3, aaa.a(param0) >> 1366884705);
        this.field_c = true;
    }

    final static int a(boolean param0, String param1, int param2, int param3, String param4, boolean param5) {
        try {
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
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            StringBuilder stackIn_110_1 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
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
                      stackIn_4_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
                          var10 = (String) null;
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
                          if (-1 == (var6_int ^ -1)) {
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
                          if (-1 == (var6_int ^ -1)) {
                            break L8;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L8;
                            } else {
                              if (8 != var6_int) {
                                km.field_p = bi.field_a;
                                uca.field_d = -1;
                                break L7;
                              } else {
                                dea.a(60);
                                uc.field_L = false;
                                stackIn_31_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
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
                      if (!cla.g(0)) {
                        break L9;
                      } else {
                        L10: {
                          tr.field_g = vc.field_q.b(param2 + 290646830);
                          gj.field_q = param1;
                          ld.field_e = vc.field_q.h(param2 ^ 205);
                          rja.field_e = vc.field_q.h(255);
                          wla.field_ub = vc.field_q.d(124);
                          var6 = vc.field_q.c(param2 + -28740);
                          var7 = vc.field_q.h(255);
                          if ((var7 & 1) != 0) {
                            rra.a(84);
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
                                stackIn_43_0 = 0;
                                break L12;
                              } else {
                                stackIn_43_0 = 1;
                                break L12;
                              }
                            }
                            L13: {
                              ai.field_a = stackIn_43_0 != 0;
                              if ((2 & var7) == 0) {
                                stackIn_46_0 = 0;
                                break L13;
                              } else {
                                stackIn_46_0 = 1;
                                break L13;
                              }
                            }
                            L14: {
                              ok.field_s = stackIn_46_0 != 0;
                              if ((8 & var7) == 0) {
                                stackIn_49_0 = 0;
                                break L14;
                              } else {
                                stackIn_49_0 = 1;
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
                            stackIn_54_0 = 0;
                            break L15;
                          } else {
                            stackIn_54_0 = 1;
                            break L15;
                          }
                        }
                        L16: {
                          ha.field_b = stackIn_54_0 != 0;
                          if (!q.field_r) {
                            break L16;
                          } else {
                            vc.field_q.h(255);
                            vc.field_q.h(255);
                            vc.field_q.e(-104);
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
                          var11 = (CharSequence) ((Object) fna.field_k);
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
                          if (var6 != null) {
                            mp.a(var6, di.a(41), -21407);
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
                                    lb.b(di.a(26), 2864, "unzap");
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
                              lb.a(param2 ^ -114, "zap", di.a(param2 + 43), new Object[]{sv.a((byte) -38, tr.field_g)});
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
                            stackIn_81_0 = oka.field_z;
                            decompiledRegionSelector0 = 3;
                            break L0;
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
                      if (!cla.g(0)) {
                        break L28;
                      } else {
                        L29: {
                          dea.a(60);
                          if (-8 != (oka.field_z ^ -1)) {
                            break L29;
                          } else {
                            if (uc.field_L) {
                              break L29;
                            } else {
                              uc.field_L = true;
                              stackIn_88_0 = -1;
                              decompiledRegionSelector0 = 4;
                              break L0;
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
                        stackIn_93_0 = oka.field_z;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L31: {
                    if (null == oba.field_e) {
                      if (uc.field_L) {
                        L32: {
                          if ((rf.b((byte) -121) ^ -1L) < -30001L) {
                            io.field_b = hb.field_u;
                            break L32;
                          } else {
                            io.field_b = sq.field_x;
                            break L32;
                          }
                        }
                        uc.field_L = false;
                        stackIn_102_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
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
                  stackIn_104_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_7_0 = -82;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_107_0 = (RuntimeException) (var6_ref);

                stackIn_107_1 = new StringBuilder().append("ila.I(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackIn_108_2 = "null";
                  break L33;
                } else {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackIn_108_2 = "{...}";
                  break L33;
                }
              }
              L34: {


                stackIn_110_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackIn_111_2 = "null";
                  break L34;
                } else {
                  stackIn_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackIn_111_2 = "{...}";
                  break L34;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_108_0), stackIn_111_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_4_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_7_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_31_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_81_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_88_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_93_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_102_0;
                        } else {
                          return stackIn_104_0;
                        }
                      }
                    }
                  }
                }
              }
            }
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
        if (!this.field_c) {
            return false;
        }
        int var4 = 0;
        var4 = dha.a(13, 12, (byte) -107, 15) ? 1 : 0;
        return var4 != 0;
    }

    final void g(int param0) {
        if (!(!this.field_e)) {
            return;
        }
        this.field_e = true;
        this.field_d.d(8);
        if (param0 != 0) {
            this.field_a = (gqa) null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            String var2 = (String) null;
            ila.a(false, (String) null, 15, -14, (String) null, true);
        }
        qw.a(256);
    }

    final static gqa a(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kh var8 = null;
        wua var9 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = vc.field_q;
          var3 = var8.h(param0 + 19042);
          gja.field_x = 127 & var3;
          if ((128 & var3) == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          sb.field_b = stackIn_3_0 != 0;
          jda.field_m = var8.h(255);
          cca.field_z = var8.b(param0 ^ -290628099);
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
          if (-2 != (var8.h(param0 + 19042) ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
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
            if ((gja.field_x ^ -1) == -2) {
              break L5;
            } else {
              if (-5 == (gja.field_x ^ -1)) {
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
            hi.field_p = dl.a(var8, 80, -117);
            qra.field_e = null;
            break L6;
          } else {
            var5 = var8.d(121);
            try {
              L7: {
                L8: {
                  var9 = qu.field_a.a(false, var5);
                  hi.field_p = var9.b((byte) -5);
                  if (!gia.field_q.equals(fna.field_k)) {
                    stackIn_21_0 = var9.field_m;
                    break L8;
                  } else {
                    stackIn_21_0 = null;
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
                ssa.a("CC1", (byte) 115, (Throwable) ((Object) var6));
                hi.field_p = null;
                qra.field_e = null;
                break L9;
              }
            }
            break L6;
          }
        }
        L10: {
          if (param0 == -18787) {
            break L10;
          } else {
            ila.a(true);
            break L10;
          }
        }
        return new gqa(param1);
    }

    final void a(int param0, jha param1) {
        try {
            this.a(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ila.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.g(0);
        this.c(false);
        if (param0 >= -57) {
            this.field_b = (vna) null;
        }
    }

    private final void b(boolean param0) {
        if (!(this.field_e)) {
            return;
        }
        this.field_e = param0 ? true : false;
        this.field_d.d(8);
    }

    final boolean e(int param0) {
        gqa discarded$1 = null;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -8832) {
            break L0;
          } else {
            discarded$1 = this.f(-98);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_c) {
              break L2;
            } else {
              if (!ni.field_c) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        this.b(false);
        this.c(-59);
        int var2 = -75 / ((31 - param0) / 57);
    }

    final void c(int param0) {
        int var2 = -48 % ((2 - param0) / 41);
        if (!this.field_c) {
            return;
        }
        cn.e(19470);
        this.field_c = false;
    }

    ila() {
        this.field_e = false;
        this.field_c = false;
        this.field_d = new vna();
        this.field_b = new vna();
    }

    static {
    }
}
