/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends ug implements sia {
    static String field_B;
    static jea field_C;

    abstract boolean a(int param0, kh param1, byte param2);

    final void c(int param0) {
        boolean discarded$2 = false;
        int var3 = 0;
        int var4 = 0;
        java.awt.Canvas var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = kw.b((byte) -97);
        if (wna.c(-127)) {
          fh.a(vka.A(90), var5, param0 ^ 0);
          return;
        } else {
          if (!lla.field_b) {
            dba.a(var5, (byte) 101);
            return;
          } else {
            L0: {
              if (av.field_e) {
                break L0;
              } else {
                if (!vpa.a(109)) {
                  ima.a(100.0f, th.field_u, -75);
                  dba.a(var5, (byte) 111);
                  return;
                } else {
                  break L0;
                }
              }
            }
            cna.field_a = true;
            if (param0 == 0) {
              var3 = -1 + kra.field_c.size();
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (-1 < (var3 ^ -1)) {
                        break L4;
                      } else {
                        ((sia) (kra.field_c.elementAt(var3))).b(param0 + 1);
                        var3--;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (cna.field_a) {
                        break L5;
                      } else {
                        this.c(true);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    discarded$2 = pka.a(false);
                    break L3;
                  }
                  fga.a(0, false, 0, var5);
                  break L2;
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(eb param0, int param1) {
        try {
            dma.field_l = param0;
            this.b((byte) 106, true);
            if (param1 <= 34) {
                return;
            }
            try {
                this.s(-1);
                this.j(-13);
                this.o(9822);
                this.g((byte) -126);
                this.p(22);
                this.d((byte) 87);
                vca.field_c[9] = -1;
                vca.field_c[10] = -1;
                kra.field_c = new Vector();
                aca.a((sia) (this), 19711);
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) ((Object) runtimeException), "rfa.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        if (!param0) {
            field_B = (String) null;
        }
    }

    public abstract void a(boolean param0, boolean param1);

    public static void w(int param0) {
        iu[] discarded$0 = null;
        field_C = null;
        if (param0 < 105) {
            iu[] var2 = (iu[]) null;
            discarded$0 = rfa.a((iu[]) null, 100);
        }
        field_B = null;
    }

    abstract void b(int param0, int param1);

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sia var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_43_0 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        boolean stackOut_63_0 = false;
        int stackOut_63_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param0) {
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
            L3: {
              if (lca.a(stackIn_3_0 != 0)) {
                break L3;
              } else {
                L4: {
                  if (!una.a((byte) 127)) {
                    break L4;
                  } else {
                    L5: {
                      if (sr.a(126)) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var3 = vk.c(107);
                            if (-3 != (var3 ^ -1)) {
                              break L7;
                            } else {
                              og.b(0);
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if ((var3 ^ -1) == -4) {
                              break L8;
                            } else {
                              if (-5 == (var3 ^ -1)) {
                                ts.a((byte) -63, ck.field_b, false);
                                kpa.field_c = true;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          in.a(-30600, true);
                          break L6;
                        }
                        this.a(true, false);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    au.b(false);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L9: {
                  if (fja.h(105)) {
                    break L9;
                  } else {
                    L10: {
                      if (ofa.d(true)) {
                        break L10;
                      } else {
                        L11: {
                          if (sr.a(125)) {
                            break L11;
                          } else {
                            var2 = 1;
                            var3 = -1;
                            L12: while (true) {
                              stackOut_21_0 = es.a(true);
                              stackIn_22_0 = stackOut_21_0;
                              L13: while (true) {
                                L14: {
                                  if (!stackIn_22_0) {
                                    break L14;
                                  } else {
                                    stackOut_23_0 = 0;
                                    stackOut_23_1 = fna.field_h ^ -1;
                                    stackIn_64_0 = stackOut_23_0;
                                    stackIn_64_1 = stackOut_23_1;
                                    stackIn_24_0 = stackOut_23_0;
                                    stackIn_24_1 = stackOut_23_1;
                                    if (var5 != 0) {
                                      break L1;
                                    } else {
                                      L15: {
                                        L16: {
                                          if (stackIn_24_0 == stackIn_24_1) {
                                            break L16;
                                          } else {
                                            if (on.a((byte) 15, fna.field_h)) {
                                              var3 = fna.field_h;
                                              if (var5 == 0) {
                                                continue L12;
                                              } else {
                                                break L16;
                                              }
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        if (fna.field_h != -1) {
                                          break L15;
                                        } else {
                                          if (0 != (var3 ^ -1)) {
                                            fna.field_h = var3;
                                            var3 = -1;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var4 = 0;
                                      L17: while (true) {
                                        L18: {
                                          if ((kra.field_c.size() ^ -1) >= (var4 ^ -1)) {
                                            break L18;
                                          } else {
                                            stackOut_34_0 = ((sia) (kra.field_c.elementAt(var4))).a((byte) -72, kda.field_td, fna.field_h);
                                            stackIn_22_0 = stackOut_34_0;
                                            stackIn_35_0 = stackOut_34_0;
                                            if (var5 != 0) {
                                              continue L13;
                                            } else {
                                              if (stackIn_35_0) {
                                                break L18;
                                              } else {
                                                var4++;
                                                if (var5 == 0) {
                                                  continue L17;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var5 == 0) {
                                          continue L12;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        L19: {
                          if (param0) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L19;
                          } else {
                            stackOut_41_0 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            break L19;
                          }
                        }
                        au.b(stackIn_43_0 != 0);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L20: {
                      if (sr.a(119)) {
                        break L20;
                      } else {
                        L21: {
                          var3 = kc.a(true);
                          if (var3 != 1) {
                            break L21;
                          } else {
                            ts.a((byte) -63, ura.field_a, true);
                            break L21;
                          }
                        }
                        this.a(true, false);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L20;
                        }
                      }
                    }
                    au.b(false);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L9;
                    }
                  }
                }
                L22: {
                  stackOut_50_0 = this;
                  stackOut_50_1 = -85;
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  if (null == dq.field_f) {
                    stackOut_52_0 = this;
                    stackOut_52_1 = stackIn_52_1;
                    stackOut_52_2 = 0;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    stackIn_53_2 = stackOut_52_2;
                    break L22;
                  } else {
                    stackOut_51_0 = this;
                    stackOut_51_1 = stackIn_51_1;
                    stackOut_51_2 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    stackIn_53_2 = stackOut_51_2;
                    break L22;
                  }
                }
                L23: {
                  L24: {
                    var3 = this.a(stackIn_53_1, stackIn_53_2 != 0);
                    if ((var3 ^ -1) == -2) {
                      break L24;
                    } else {
                      if ((var3 ^ -1) == -3) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (dq.field_f == null) {
                      break L25;
                    } else {
                      og.b(0);
                      break L25;
                    }
                  }
                  if (2 == var3) {
                    hha.a(di.a(110), (byte) -95);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                this.a(true, false);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            this.a(param0, false);
            break L2;
          }
          stackOut_63_0 = param0;
          stackOut_63_1 = 1;
          stackIn_64_0 = stackOut_63_0 ? 1 : 0;
          stackIn_64_1 = stackOut_63_1;
          break L1;
        }
        if (stackIn_64_0 == stackIn_64_1) {
          var3 = 0;
          L26: while (true) {
            L27: {
              if ((kra.field_c.size() ^ -1) >= (var3 ^ -1)) {
                break L27;
              } else {
                var6 = (sia) (kra.field_c.elementAt(var3));
                var6.a(true, var2 != 0);
                if (var5 != 0) {
                  break L27;
                } else {
                  L28: {
                    stackOut_69_0 = var2;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var6.a(-2)) {
                      stackOut_71_0 = stackIn_71_0;
                      stackOut_71_1 = 0;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      break L28;
                    } else {
                      stackOut_70_0 = stackIn_70_0;
                      stackOut_70_1 = 1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      break L28;
                    }
                  }
                  var2 = stackIn_72_0 & stackIn_72_1;
                  var3++;
                  if (var5 == 0) {
                    continue L26;
                  } else {
                    break L27;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public abstract void b(int param0);

    public final boolean a(int param0) {
        if (param0 != -2) {
            field_C = (jea) null;
            return true;
        }
        return true;
    }

    final static iu[] a(iu[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        iu var3 = null;
        int var4 = 0;
        iu[] stackIn_3_0 = null;
        iu[] stackIn_6_0 = null;
        iu[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        iu[] stackOut_5_0 = null;
        iu[] stackOut_8_0 = null;
        iu[] stackOut_2_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param1 >= 111) {
              L1: while (true) {
                L2: {
                  L3: {
                    if ((param0.length ^ -1) >= (var2_int ^ -1)) {
                      break L3;
                    } else {
                      var3 = param0[var2_int];
                      param0[var2_int].field_p = 0;
                      var3.field_o = 0;
                      param0[var2_int].field_n = param0[var2_int].field_m;
                      stackOut_5_0 = (iu[]) (param0);
                      stackIn_9_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        stackIn_6_0[var2_int].field_k = param0[var2_int].field_q;
                        var2_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = (iu[]) (param0);
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (iu[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("rfa.HB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cga var5 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (dq.field_f == null) {
            break L0;
          } else {
            if (!dq.field_f.field_b) {
              break L0;
            } else {
              og.b(0);
              vd.b(1);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = -127;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (dq.field_f == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          this.c((byte) stackIn_6_1, stackIn_6_2 != 0);
          if (!lpa.field_w) {
            break L2;
          } else {
            dma.field_l.a((byte) -38);
            lpa.field_w = false;
            break L2;
          }
        }
        L3: {
          if (wna.c(-128)) {
            this.r(114);
            if (wna.c(-112)) {
              return;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          L5: {
            this.u(97);
            if (!lla.field_b) {
              break L5;
            } else {
              L6: {
                L7: {
                  if (av.field_e) {
                    break L7;
                  } else {
                    if (!vpa.a(84)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                this.b(true);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L6;
                }
              }
              if (!dma.field_l.a(-127)) {
                break L4;
              } else {
                av.field_e = true;
                this.v(24230);
                ln.A(116);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
          }
          tc.a(pg.field_y, -2886);
          if (dma.field_l.b(-4171)) {
            dma.field_l.b((byte) -49);
            lla.field_b = true;
            break L4;
          } else {
            break L4;
          }
        }
        L8: {
          L9: {
            if (vpa.a(66)) {
              break L9;
            } else {
              L10: while (true) {
                var5 = (cga) ((Object) sua.field_H.c(119));
                if (var5 == null) {
                  break L9;
                } else {
                  woa.a(4, var5, false);
                  if (var4 != 0) {
                    break L8;
                  } else {
                    if (var4 == 0) {
                      continue L10;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
          }
          dra.a(param0);
          vsa.c((byte) 120, 0);
          break L8;
        }
        L11: {
          if (!uma.b(-1)) {
            break L11;
          } else {
            L12: {
              L13: {
                var2 = this.t(8);
                if (0 == var2) {
                  break L13;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              this.b(var2, 120);
              break L12;
            }
            L14: {
              var3 = 0;
              if (var2 != 2) {
                break L14;
              } else {
                var3 = 1;
                break L14;
              }
            }
            L15: {
              if (!this.h((byte) 84)) {
                break L15;
              } else {
                var3 = 1;
                break L15;
              }
            }
            L16: {
              if (uma.b(-1)) {
                break L16;
              } else {
                var3 = 0;
                break L16;
              }
            }
            if (var3 != 0) {
              dw.b((byte) -16);
              break L11;
            } else {
              break L11;
            }
          }
        }
    }

    abstract void v(int param0);

    private final void u(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 68 % ((param0 - 52) / 40);
        L0: while (true) {
          L1: {
            if (!cj.a(vca.field_c, 0)) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                L2: {
                  if (!this.a(oka.field_z, vc.field_q, (byte) 105)) {
                    break L2;
                  } else {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                this.m(-5);
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    public abstract boolean a(byte param0, char param1, int param2);

    abstract boolean h(byte param0);

    static {
    }
}
