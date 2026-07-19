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
        int var3 = 0;
        jha var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_e) {
          return;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              this.field_a = (gqa) null;
              break L0;
            }
          }
          var4 = (jha) ((Object) this.field_d.f(-80));
          L1: while (true) {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                var4.b((byte) -111);
                var4 = (jha) ((Object) this.field_d.e(107));
                if (var3 != 0) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return;
          }
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
        String discarded$1 = null;
        gqa var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        jha var7_ref = null;
        int var8 = 0;
        gqa var8_ref_gqa = null;
        int var9 = 0;
        String[] var10 = null;
        gqa var11 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        boolean stackIn_42_0 = false;
        boolean stackIn_50_0 = false;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        boolean stackOut_41_0 = false;
        boolean stackOut_49_0 = false;
        int stackOut_51_0 = 0;
        boolean stackOut_51_1 = false;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (!param1) {
            this.b(false);
            if (var9 == 0) {
              break L0;
            } else {
              this.g(0);
              break L0;
            }
          } else {
            this.g(0);
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
            L3: {
              L4: {
                L5: {
                  var11 = this.f(1366884705);
                  var4 = var11;
                  var5 = -127 % ((param0 - -34) / 44);
                  if (var11 == null) {
                    break L5;
                  } else {
                    if (this.field_a != var11) {
                      var6 = 0;
                      var10 = new String[10];
                      var7 = var10;
                      L6: while (true) {
                        L7: {
                          if (-11 >= (var6 ^ -1)) {
                            break L7;
                          } else {
                            stackOut_15_0 = 0;
                            stackOut_15_1 = -var6 + (ara.field_xb - 1);
                            stackIn_52_0 = stackOut_15_0;
                            stackIn_52_1 = stackOut_15_1;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              if (stackIn_16_0 > stackIn_16_1) {
                                break L7;
                              } else {
                                var8_ref_gqa = wea.field_d[-1 + ara.field_xb - var6];
                                if (var8_ref_gqa == this.field_a) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var8_ref_gqa.field_f == null) {
                                      break L8;
                                    } else {
                                      if (!var8_ref_gqa.field_m) {
                                        break L8;
                                      } else {
                                        var10[var6] = var8_ref_gqa.field_f;
                                        break L8;
                                      }
                                    }
                                  }
                                  var10 = var7;
                                  var6++;
                                  if (var9 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var10 = var7;
                        var8 = 9;
                        L9: while (true) {
                          L10: {
                            if (-1 < (var8 ^ -1)) {
                              break L10;
                            } else {
                              if (var9 != 0) {
                                break L4;
                              } else {
                                L11: {
                                  if (null == var10[var8]) {
                                    break L11;
                                  } else {
                                    if ("" != var10[var8]) {
                                      this.a(0, eea.a(var10[var8], (byte) -62));
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var8--;
                                if (var9 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          this.field_a = var11;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var6 = 120;
                break L4;
              }
              L12: {
                L13: {
                  if (!this.field_e) {
                    break L13;
                  } else {
                    var7_ref = (jha) ((Object) this.field_b.f(-80));
                    L14: while (true) {
                      L15: {
                        if (var7_ref == null) {
                          break L15;
                        } else {
                          var7_ref.d((byte) 80);
                          stackOut_35_0 = -1;
                          stackOut_35_1 = var7_ref.a((byte) -100) ^ -1;
                          stackIn_52_0 = stackOut_35_0;
                          stackIn_52_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            L16: {
                              if (stackIn_36_0 > stackIn_36_1) {
                                break L16;
                              } else {
                                this.field_d.b((byte) -77, var7_ref);
                                break L16;
                              }
                            }
                            var7_ref = (jha) ((Object) this.field_b.e(111));
                            if (var9 == 0) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      var7_ref = (jha) ((Object) this.field_d.f(-80));
                      L17: while (true) {
                        if (var7_ref == null) {
                          break L13;
                        } else {
                          var7_ref.a(var6, 4, aaa.a(false) - var7_ref.c((byte) -96));
                          var7_ref.a(-43);
                          stackOut_41_0 = var7_ref.c(-1);
                          stackIn_50_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (var9 != 0) {
                            break L12;
                          } else {
                            L18: {
                              if (stackIn_42_0) {
                                var6 = var6 + var7_ref.a(true);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var7_ref.e((byte) -39)) {
                                var7_ref.p(3);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            var7_ref = (jha) ((Object) this.field_d.e(121));
                            if (var9 == 0) {
                              continue L17;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_49_0 = this.field_c;
                stackIn_50_0 = stackOut_49_0;
                break L12;
              }
              if (!stackIn_50_0) {
                break L2;
              } else {
                stackOut_51_0 = 108;
                stackOut_51_1 = param1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1 ? 1 : 0;
                break L3;
              }
            }
            rk.b(stackIn_52_0, stackIn_52_1 != 0, aaa.a(false) >> 1970883489, koa.b(0) >> -2076865759);
            discarded$1 = fa.a((byte) -127);
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, jha param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.b(29161) != null) {
                  if (!this.field_e) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      L3: {
                        if ((param0 ^ -1) < -1) {
                          break L3;
                        } else {
                          this.field_d.b((byte) -67, param2);
                          if (!TombRacer.field_G) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_b.b((byte) -80, param2);
                      param2.a(false, param0);
                      break L2;
                    }
                    L4: {
                      if (param1 == 0) {
                        break L4;
                      } else {
                        this.field_e = true;
                        break L4;
                      }
                    }
                    param2.a(false, 25, 12, 150);
                    param2.a(1, aaa.a(false) / 3);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("ila.M(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
            int discarded$5 = 0;
            int discarded$6 = 0;
            int discarded$7 = 0;
            Object discarded$8 = null;
            Object discarded$9 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_111_0 = 0;
            int stackIn_113_0 = 0;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            String stackIn_117_2 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            RuntimeException stackIn_120_0 = null;
            StringBuilder stackIn_120_1 = null;
            String stackIn_120_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_100_0 = 0;
            int stackOut_110_0 = 0;
            int stackOut_112_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            String stackOut_116_2 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            RuntimeException stackOut_119_0 = null;
            StringBuilder stackOut_119_1 = null;
            String stackOut_119_2 = null;
            RuntimeException stackOut_118_0 = null;
            StringBuilder stackOut_118_1 = null;
            String stackOut_118_2 = null;
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
                      decompiledRegionSelector1 = 0;
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
                        L4: {
                          if (!param5) {
                            break L4;
                          } else {
                            var10 = (String) null;
                            fd.field_d = b.a(param1, 0, (String) null, false, tr.field_g);
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        fd.field_d = via.a(param1, 64, false, param4);
                        break L3;
                      }
                      ql.field_k.field_h = 0;
                      ql.field_k.i(14, 0);
                      ql.field_k.i(fd.field_d.a((byte) 113).field_d, 0);
                      bl.a(-1, -1);
                      km.field_p = bva.field_b;
                      break L2;
                    }
                  }
                  L5: {
                    if (km.field_p != bva.field_b) {
                      break L5;
                    } else {
                      if (!ama.a(1, -1)) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var6_int = vc.field_q.h(255);
                            if (-1 == (var6_int ^ -1)) {
                              break L7;
                            } else {
                              km.field_p = bi.field_a;
                              oka.field_z = var6_int;
                              uca.field_d = -1;
                              if (var9 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          km.field_p = ola.field_yb;
                          break L6;
                        }
                        vc.field_q.field_h = 0;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (ola.field_yb != km.field_p) {
                      break L8;
                    } else {
                      if (ama.a(8, -1)) {
                        ra.field_L = vc.field_q.b(290646880);
                        vc.field_q.field_h = 0;
                        ova.a((byte) 121, param5, param3, fd.field_d, param0);
                        km.field_p = ria.field_o;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (km.field_p == ria.field_o) {
                      if (ama.a(1, param2 + -51)) {
                        L10: {
                          var6_int = vc.field_q.h(param2 + 205);
                          vc.field_q.field_h = 0;
                          oka.field_z = var6_int;
                          ji.field_d = null;
                          if (-1 == (var6_int ^ -1)) {
                            break L10;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L10;
                            } else {
                              if (8 != var6_int) {
                                km.field_p = bi.field_a;
                                uca.field_d = -1;
                                if (var9 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                dea.a(60);
                                uc.field_L = false;
                                stackOut_32_0 = var6_int;
                                stackIn_33_0 = stackOut_32_0;
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                        km.field_p = eo.field_w;
                        uca.field_d = -1;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    if (eo.field_w != km.field_p) {
                      break L11;
                    } else {
                      if (!cla.g(0)) {
                        break L11;
                      } else {
                        L12: {
                          tr.field_g = vc.field_q.b(param2 + 290646830);
                          gj.field_q = param1;
                          ld.field_e = vc.field_q.h(param2 ^ 205);
                          rja.field_e = vc.field_q.h(255);
                          wla.field_ub = vc.field_q.d(124);
                          var6_ref = vc.field_q.c(param2 + -28740);
                          var7 = vc.field_q.h(255);
                          if ((var7 & 1) != 0) {
                            rra.a(84);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (param5) {
                            break L13;
                          } else {
                            L14: {
                              if (0 == (var7 & 4)) {
                                stackOut_44_0 = 0;
                                stackIn_45_0 = stackOut_44_0;
                                break L14;
                              } else {
                                stackOut_43_0 = 1;
                                stackIn_45_0 = stackOut_43_0;
                                break L14;
                              }
                            }
                            L15: {
                              ai.field_a = stackIn_45_0 != 0;
                              if ((2 & var7) == 0) {
                                stackOut_47_0 = 0;
                                stackIn_48_0 = stackOut_47_0;
                                break L15;
                              } else {
                                stackOut_46_0 = 1;
                                stackIn_48_0 = stackOut_46_0;
                                break L15;
                              }
                            }
                            L16: {
                              ok.field_s = stackIn_48_0 != 0;
                              if ((8 & var7) == 0) {
                                stackOut_50_0 = 0;
                                stackIn_51_0 = stackOut_50_0;
                                break L16;
                              } else {
                                stackOut_49_0 = 1;
                                stackIn_51_0 = stackOut_49_0;
                                break L16;
                              }
                            }
                            fua.field_g = stackIn_51_0 != 0;
                            if (!fua.field_g) {
                              break L13;
                            } else {
                              ok.field_s = true;
                              break L13;
                            }
                          }
                        }
                        L17: {
                          if (0 == (var7 & 16)) {
                            stackOut_55_0 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            break L17;
                          } else {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            break L17;
                          }
                        }
                        L18: {
                          L19: {
                            ha.field_b = stackIn_56_0 != 0;
                            if (!q.field_r) {
                              break L19;
                            } else {
                              discarded$5 = vc.field_q.h(255);
                              discarded$6 = vc.field_q.h(255);
                              discarded$7 = vc.field_q.e(-104);
                              kl.field_k = vc.field_q.d(121);
                              np.field_J = new byte[kl.field_k];
                              var8 = 0;
                              L20: while (true) {
                                if (var8 >= kl.field_k) {
                                  break L19;
                                } else {
                                  np.field_J[var8] = vc.field_q.c((byte) 103);
                                  var8++;
                                  if (var9 != 0) {
                                    break L18;
                                  } else {
                                    if (var9 == 0) {
                                      continue L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          fna.field_k = vc.field_q.e((byte) -76);
                          var11 = (CharSequence) ((Object) fna.field_k);
                          tia.field_b = jd.a(1, var11);
                          lsa.field_a = vc.field_q.h(255);
                          km.field_p = uga.field_n;
                          break L18;
                        }
                        L21: {
                          L22: {
                            if (fd.field_d.a((byte) 113) == boa.field_s) {
                              break L22;
                            } else {
                              if (fd.field_d.a((byte) 113) == vm.field_f) {
                                ub.field_d.a(di.a(109), 5);
                                if (var9 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                          vw.field_a.a(di.a(120), param2 ^ 55);
                          break L21;
                        }
                        L23: {
                          uc.field_L = false;
                          if (var6_ref != null) {
                            mp.a(var6_ref, di.a(41), -21407);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          L25: {
                            L26: {
                              if (0 < wla.field_ub) {
                                break L26;
                              } else {
                                if (!ai.field_a) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            try {
                              L27: {
                                discarded$8 = lb.a(param2 ^ -114, "zap", di.a(param2 + 43), new Object[]{sv.a((byte) -38, tr.field_g)});
                                decompiledRegionSelector0 = 0;
                                break L27;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L28: {
                                var8_ref_Throwable = decompiledCaughtException;
                                if (var9 == 0) {
                                  decompiledRegionSelector0 = 0;
                                  break L28;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L28;
                                }
                              }
                            }
                            if (decompiledRegionSelector0 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                          try {
                            L29: {
                              discarded$9 = lb.b(di.a(26), 2864, "unzap");
                              break L29;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L30: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L30;
                            }
                          }
                          break L24;
                        }
                        L31: {
                          if (0 >= wla.field_ub) {
                            break L31;
                          } else {
                            ft.field_a = true;
                            break L31;
                          }
                        }
                        ql.field_k.a(-26185, qi.field_K);
                        var8 = 0;
                        L32: while (true) {
                          L33: {
                            L34: {
                              if (4 <= var8) {
                                break L34;
                              } else {
                                qi.field_K[var8] = qi.field_K[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L33;
                                } else {
                                  if (var9 == 0) {
                                    continue L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            vc.field_q.a(param2 ^ -26235, qi.field_K);
                            break L33;
                          }
                          stackOut_88_0 = oka.field_z;
                          stackIn_89_0 = stackOut_88_0;
                          decompiledRegionSelector1 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                  L35: {
                    if (bi.field_a == km.field_p) {
                      if (!cla.g(0)) {
                        break L35;
                      } else {
                        L36: {
                          dea.a(60);
                          if (-8 != (oka.field_z ^ -1)) {
                            break L36;
                          } else {
                            if (uc.field_L) {
                              break L36;
                            } else {
                              uc.field_L = true;
                              stackOut_95_0 = -1;
                              stackIn_96_0 = stackOut_95_0;
                              decompiledRegionSelector1 = 4;
                              break L0;
                            }
                          }
                        }
                        L37: {
                          if (7 == oka.field_z) {
                            oka.field_z = 3;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        io.field_b = vc.field_q.e((byte) -76);
                        uc.field_L = false;
                        stackOut_100_0 = oka.field_z;
                        stackIn_101_0 = stackOut_100_0;
                        decompiledRegionSelector1 = 5;
                        break L0;
                      }
                    } else {
                      break L35;
                    }
                  }
                  L38: {
                    if (null == oba.field_e) {
                      L39: {
                        if (uc.field_L) {
                          break L39;
                        } else {
                          var6_int = nn.field_b;
                          nn.field_b = uq.field_a;
                          uq.field_a = var6_int;
                          uc.field_L = true;
                          if (var9 == 0) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      L40: {
                        L41: {
                          if ((rf.b((byte) -121) ^ -1L) < -30001L) {
                            break L41;
                          } else {
                            io.field_b = sq.field_x;
                            if (var9 == 0) {
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                        io.field_b = hb.field_u;
                        break L40;
                      }
                      uc.field_L = false;
                      stackOut_110_0 = 3;
                      stackIn_111_0 = stackOut_110_0;
                      decompiledRegionSelector1 = 6;
                      break L0;
                    } else {
                      break L38;
                    }
                  }
                  stackOut_112_0 = -1;
                  stackIn_113_0 = stackOut_112_0;
                  decompiledRegionSelector1 = 7;
                  break L0;
                } else {
                  stackOut_6_0 = -82;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L42: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_114_0 = (RuntimeException) (var6);
                stackOut_114_1 = new StringBuilder().append("ila.I(").append(param0).append(',');
                stackIn_116_0 = stackOut_114_0;
                stackIn_116_1 = stackOut_114_1;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                if (param1 == null) {
                  stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
                  stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
                  stackOut_116_2 = "null";
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  break L42;
                } else {
                  stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
                  stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
                  stackOut_115_2 = "{...}";
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  break L42;
                }
              }
              L43: {
                stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
                stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_119_0 = stackOut_117_0;
                stackIn_119_1 = stackOut_117_1;
                stackIn_118_0 = stackOut_117_0;
                stackIn_118_1 = stackOut_117_1;
                if (param4 == null) {
                  stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
                  stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
                  stackOut_119_2 = "null";
                  stackIn_120_0 = stackOut_119_0;
                  stackIn_120_1 = stackOut_119_1;
                  stackIn_120_2 = stackOut_119_2;
                  break L43;
                } else {
                  stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
                  stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
                  stackOut_118_2 = "{...}";
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_120_1 = stackOut_118_1;
                  stackIn_120_2 = stackOut_118_2;
                  break L43;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_120_0), stackIn_120_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_7_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_89_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_96_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_101_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_111_0;
                        } else {
                          return stackIn_113_0;
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
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1 == -1) {
            break L0;
          } else {
            ila.a(false);
            break L0;
          }
        }
        if (!this.field_c) {
          return false;
        } else {
          L1: {
            var4 = 0;
            if (!dha.a(13, 12, (byte) -107, 15)) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
          }
          var4 = stackIn_6_0;
          return var4 != 0;
        }
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
        int discarded$0 = 0;
        if (!param0) {
            String var2 = (String) null;
            discarded$0 = ila.a(false, (String) null, 15, -14, (String) null, true);
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
        int stackIn_10_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_23_0 = null;
        Object stackOut_22_0 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = vc.field_q;
          var3 = var8.h(param0 + 19042);
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
          L2: {
            sb.field_b = stackIn_3_0 != 0;
            jda.field_m = var8.h(255);
            cca.field_z = var8.b(param0 ^ -290628099);
            if (gja.field_x == 2) {
              break L2;
            } else {
              gb.field_a = 0;
              ega.field_b = 0;
              if (var7 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          gb.field_a = var8.d(127);
          ega.field_b = var8.a(-32768);
          break L1;
        }
        L3: {
          if (-2 != (var8.h(param0 + 19042) ^ -1)) {
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L3;
          } else {
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L3;
          }
        }
        L4: {
          L5: {
            var4 = stackIn_10_0;
            esa.field_c = var8.e((byte) -76);
            if (var4 != 0) {
              break L5;
            } else {
              gia.field_q = esa.field_c;
              if (var7 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          gia.field_q = var8.e((byte) -76);
          break L4;
        }
        L6: {
          L7: {
            if ((gja.field_x ^ -1) == -2) {
              break L7;
            } else {
              if (-5 == (gja.field_x ^ -1)) {
                break L7;
              } else {
                era.field_a = 0;
                dga.field_a = null;
                if (var7 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
          }
          era.field_a = var8.d(122);
          dga.field_a = var8.e((byte) -76);
          break L6;
        }
        L8: {
          L9: {
            if (!param1) {
              break L9;
            } else {
              var5 = var8.d(121);
              try {
                L10: {
                  L11: {
                    var9 = qu.field_a.a(false, var5);
                    hi.field_p = var9.b((byte) -5);
                    if (!gia.field_q.equals(fna.field_k)) {
                      stackOut_23_0 = var9.field_m;
                      stackIn_24_0 = stackOut_23_0;
                      break L11;
                    } else {
                      stackOut_22_0 = null;
                      stackIn_24_0 = (int[]) ((Object) stackOut_22_0);
                      break L11;
                    }
                  }
                  qra.field_e = stackIn_24_0;
                  break L10;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L12: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  ssa.a("CC1", (byte) 115, (Throwable) ((Object) var6));
                  hi.field_p = null;
                  qra.field_e = null;
                  break L12;
                }
              }
              if (var7 == 0) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          hi.field_p = dl.a(var8, 80, -117);
          qra.field_e = null;
          break L8;
        }
        L13: {
          if (param0 == -18787) {
            break L13;
          } else {
            ila.a(true);
            break L13;
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
        gqa discarded$2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -8832) {
            break L0;
          } else {
            discarded$2 = this.f(-98);
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
