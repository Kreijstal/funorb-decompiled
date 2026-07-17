/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rn extends ag {
    private boolean field_R;
    private int field_O;
    static kc field_S;
    private long field_P;
    private int field_N;
    private long field_Q;
    private boolean field_M;
    static kc field_L;
    private int field_H;
    static String field_K;
    private int field_J;

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 == ((rn) this).field_N) {
          return ((rn) this).field_N;
        } else {
          if (param0 == 1000) {
            var2 = ((rn) this).field_N + -1;
            L0: while (true) {
              L1: {
                if (var2 <= 0) {
                  break L1;
                } else {
                  if (((rn) this).field_g.charAt(-1 + var2) == 32) {
                    break L1;
                  } else {
                    var2--;
                    continue L0;
                  }
                }
              }
              return var2;
            }
          } else {
            return 12;
          }
        }
    }

    final static void m() {
        if (!(pe.field_Jb)) {
            if (!(ce.field_i != null)) {
                ce.field_i = tj.a(4, -21402);
            }
            if (ce.field_i.field_l) {
                int discarded$0 = 1;
                ad.field_f = ko.a(ad.field_f, ce.field_i.field_i);
                ce.field_i = null;
                pe.field_Jb = true;
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ac var5 = null;
        long var6 = 0L;
        if (param0 > -52) {
            return;
        }
        if (((rn) this).field_r != null) {
            if (!(param2 != 0)) {
                ((rn) this).field_r.a((qm) this, 5592405, param1, param3, ((rn) this).field_B);
                if (((rn) this).field_r instanceof ac) {
                    var5 = (ac) (Object) ((rn) this).field_r;
                    if (((rn) this).field_N != ((rn) this).field_J) {
                        var5.a(param3, (qm) this, param1, 6600, ((rn) this).field_N, ((rn) this).field_J);
                    }
                    var6 = qj.b(-26572);
                    if (!((-((rn) this).field_Q + var6) % 1000L >= 500L)) {
                        var5.a(79, param3, param1, ((rn) this).field_N, (qm) this);
                    }
                }
            }
        }
    }

    void l(int param0) {
        if (!(!(((rn) this).field_o instanceof bn))) {
            ((bn) (Object) ((rn) this).field_o).a((rn) this, -20626);
        }
        if (param0 != -22706) {
            int discarded$0 = 0;
            this.c();
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((rn) this).field_N == ((rn) this).field_J)) {
            var2 = ((rn) this).field_J < ((rn) this).field_N ? ((rn) this).field_J : ((rn) this).field_N;
            var3 = ((rn) this).field_N <= ((rn) this).field_J ? ((rn) this).field_J : ((rn) this).field_N;
            ((rn) this).field_J = var2;
            ((rn) this).field_N = var2;
            ((rn) this).field_g = ((rn) this).field_g.substring(0, var2) + ((rn) this).field_g.substring(var3, ((rn) this).field_g.length());
            ((rn) this).l(-22706);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        ac var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              int discarded$3 = -100;
              this.h();
              if (((rn) this).field_t == 1) {
                L2: {
                  if (!(((rn) this).field_r instanceof ac)) {
                    break L2;
                  } else {
                    var5 = (ac) (Object) ((rn) this).field_r;
                    var6 = var5.b(param1, (qm) this, me.field_I, an.field_g, param3, param2 ^ 2364);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((rn) this).field_R) {
                          break L3;
                        } else {
                          if (var6 >= ((rn) this).field_O) {
                            break L3;
                          } else {
                            if (((rn) this).field_J < var6) {
                              var6 = ((rn) this).field_O;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((rn) this).field_N = var6;
                      break L2;
                    }
                  }
                }
                ((rn) this).field_Q = qj.b(-26572);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("rn.E(");
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
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int param1) {
        ((rn) this).field_N = param1;
        if (!(ri.field_b[param0])) {
            ((rn) this).field_J = ((rn) this).field_N;
        }
    }

    final void g(int param0) {
        ((rn) this).field_N = 0;
        if (param0 != 3545) {
            int discarded$0 = this.f(39);
        }
        ((rn) this).field_g = "";
        ((rn) this).field_J = 0;
        ((rn) this).l(-22706);
    }

    final static void i() {
        RuntimeException var1 = null;
        int var2 = 0;
        cg var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              dn.field_Db = false;
              om.field_x = null;
              wi.field_f = null;
              if (null != gm.field_j) {
                gm.field_j.c(-124);
                gm.field_j = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              bc.field_c = null;
              if (null == vh.field_a) {
                break L2;
              } else {
                vh.field_a.c(99);
                vh.field_a = null;
                break L2;
              }
            }
            L3: {
              nk.field_q = null;
              if (ph.field_a == null) {
                break L3;
              } else {
                ph.field_a.c(10);
                ph.field_a = null;
                break L3;
              }
            }
            L4: {
              kn.field_qb = null;
              if (null != bc.field_c) {
                var3 = (cg) (Object) bc.field_c.f(102);
                L5: while (true) {
                  if (var3 == null) {
                    bc.field_c = null;
                    break L4;
                  } else {
                    var3.a((byte) 88);
                    var3 = (cg) (Object) bc.field_c.a(-1);
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "rn.L(" + -123 + 41);
        }
    }

    private final void j() {
        int discarded$0 = 56;
        this.g();
        this.j(-10292);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.j(-10292);
                int discarded$1 = -34;
                this.a(var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rn(String param0, wc param1, int param2) {
        super(param0, param1);
        ((rn) this).field_R = false;
        ((rn) this).field_O = -1;
        ((rn) this).field_P = 0L;
        try {
            ((rn) this).field_r = io.field_n.field_l;
            ((rn) this).field_H = param2;
            ((rn) this).a(true, param0, false);
            ((rn) this).field_M = true;
            ((rn) this).field_Q = qj.b(-26572);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void n() {
        field_L = null;
        field_K = null;
        field_S = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((rn) this).field_Q = qj.b(-26572);
              if (param2 == 60) {
                break L1;
              } else {
                if (param2 == 62) {
                  break L1;
                } else {
                  if (param1 < -120) {
                    L2: {
                      if (param2 < 32) {
                        break L2;
                      } else {
                        if (param2 > 126) {
                          break L2;
                        } else {
                          L3: {
                            if (~((rn) this).field_N != ~((rn) this).field_J) {
                              this.j(-10292);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (-1 == ((rn) this).field_H) {
                                break L5;
                              } else {
                                if (~((rn) this).field_g.length() <= ~((rn) this).field_H) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (((rn) this).field_N >= ((rn) this).field_g.length()) {
                                ((rn) this).field_g = ((rn) this).field_g + param2;
                                int dupTemp$4 = ((rn) this).field_g.length();
                                ((rn) this).field_N = dupTemp$4;
                                ((rn) this).field_J = dupTemp$4;
                                break L6;
                              } else {
                                ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_N) + param2 + ((rn) this).field_g.substring(((rn) this).field_N, ((rn) this).field_g.length());
                                ((rn) this).field_N = ((rn) this).field_N + 1;
                                ((rn) this).field_J = ((rn) this).field_N;
                                break L6;
                              }
                            }
                            ((rn) this).l(-22706);
                            break L4;
                          }
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                    if (param3 != 85) {
                      L7: {
                        if (param3 != 101) {
                          if (param3 != 13) {
                            if (param3 != 96) {
                              if (param3 == 97) {
                                if (~((rn) this).field_N <= ~((rn) this).field_g.length()) {
                                  break L7;
                                } else {
                                  L8: {
                                    stackOut_71_0 = this;
                                    stackOut_71_1 = 81;
                                    stackIn_73_0 = stackOut_71_0;
                                    stackIn_73_1 = stackOut_71_1;
                                    stackIn_72_0 = stackOut_71_0;
                                    stackIn_72_1 = stackOut_71_1;
                                    if (!ri.field_b[82]) {
                                      stackOut_73_0 = this;
                                      stackOut_73_1 = stackIn_73_1;
                                      stackOut_73_2 = 1 + ((rn) this).field_N;
                                      stackIn_74_0 = stackOut_73_0;
                                      stackIn_74_1 = stackOut_73_1;
                                      stackIn_74_2 = stackOut_73_2;
                                      break L8;
                                    } else {
                                      stackOut_72_0 = this;
                                      stackOut_72_1 = stackIn_72_1;
                                      stackOut_72_2 = this.i(-9125);
                                      stackIn_74_0 = stackOut_72_0;
                                      stackIn_74_1 = stackOut_72_1;
                                      stackIn_74_2 = stackOut_72_2;
                                      break L8;
                                    }
                                  }
                                  this.a(stackIn_74_1, stackIn_74_2);
                                  stackOut_74_0 = 1;
                                  stackIn_75_0 = stackOut_74_0;
                                  return stackIn_75_0 != 0;
                                }
                              } else {
                                if (param3 != 102) {
                                  if (param3 != 103) {
                                    if (param3 != 84) {
                                      L9: {
                                        if (!ri.field_b[82]) {
                                          break L9;
                                        } else {
                                          if (param3 != 65) {
                                            break L9;
                                          } else {
                                            int discarded$5 = 122;
                                            this.j();
                                            stackOut_60_0 = 1;
                                            stackIn_61_0 = stackOut_60_0;
                                            return stackIn_61_0 != 0;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (!ri.field_b[82]) {
                                          break L10;
                                        } else {
                                          if (66 != param3) {
                                            break L10;
                                          } else {
                                            int discarded$6 = 56;
                                            this.g();
                                            stackOut_64_0 = 1;
                                            stackIn_65_0 = stackOut_64_0;
                                            return stackIn_65_0 != 0;
                                          }
                                        }
                                      }
                                      if (!ri.field_b[82]) {
                                        break L7;
                                      } else {
                                        if (67 != param3) {
                                          break L7;
                                        } else {
                                          this.h(-9711);
                                          stackOut_68_0 = 1;
                                          stackIn_69_0 = stackOut_68_0;
                                          return stackIn_69_0 != 0;
                                        }
                                      }
                                    } else {
                                      int discarded$7 = 0;
                                      this.c();
                                      stackOut_56_0 = 1;
                                      stackIn_57_0 = stackOut_56_0;
                                      return stackIn_57_0 != 0;
                                    }
                                  } else {
                                    this.a(81, ((rn) this).field_g.length());
                                    stackOut_53_0 = 1;
                                    stackIn_54_0 = stackOut_53_0;
                                    return stackIn_54_0 != 0;
                                  }
                                } else {
                                  this.a(81, 0);
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  return stackIn_51_0 != 0;
                                }
                              }
                            } else {
                              if (((rn) this).field_N <= 0) {
                                break L7;
                              } else {
                                L11: {
                                  stackOut_43_0 = this;
                                  stackOut_43_1 = 81;
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_45_1 = stackOut_43_1;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  if (ri.field_b[82]) {
                                    stackOut_45_0 = this;
                                    stackOut_45_1 = stackIn_45_1;
                                    stackOut_45_2 = this.f(1000);
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    stackIn_46_2 = stackOut_45_2;
                                    break L11;
                                  } else {
                                    stackOut_44_0 = this;
                                    stackOut_44_1 = stackIn_44_1;
                                    stackOut_44_2 = ((rn) this).field_N + -1;
                                    stackIn_46_0 = stackOut_44_0;
                                    stackIn_46_1 = stackOut_44_1;
                                    stackIn_46_2 = stackOut_44_2;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_46_1, stackIn_46_2);
                                stackOut_46_0 = 1;
                                stackIn_47_0 = stackOut_46_0;
                                return stackIn_47_0 != 0;
                              }
                            }
                          } else {
                            ((rn) this).g(3545);
                            stackOut_39_0 = 1;
                            stackIn_40_0 = stackOut_39_0;
                            return stackIn_40_0 != 0;
                          }
                        } else {
                          if (~((rn) this).field_J == ~((rn) this).field_N) {
                            if (~((rn) this).field_N > ~((rn) this).field_g.length()) {
                              ((rn) this).field_J = 1 + ((rn) this).field_N;
                              this.j(-10292);
                              stackOut_36_0 = 1;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            } else {
                              break L7;
                            }
                          } else {
                            this.j(-10292);
                            stackOut_32_0 = 1;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          }
                        }
                      }
                      stackOut_76_0 = 0;
                      stackIn_77_0 = stackOut_76_0;
                      break L0;
                    } else {
                      if (((rn) this).field_N != ((rn) this).field_J) {
                        this.j(-10292);
                        stackOut_28_0 = 1;
                        stackIn_29_0 = stackOut_28_0;
                        return stackIn_29_0 != 0;
                      } else {
                        if (((rn) this).field_N > 0) {
                          ((rn) this).field_J = -1 + ((rn) this).field_N;
                          this.j(-10292);
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("rn.N(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_77_0 != 0;
    }

    private final void h() {
        kh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ac var9 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (((rn) this).field_M) {
          if (((rn) this).field_r instanceof ac) {
            var9 = (ac) (Object) ((rn) this).field_r;
            var3 = var9.a((qm) this, -46);
            var4 = var3.b((byte) 121);
            var5 = var9.a((qm) this, (byte) 101);
            var6 = var9.a(27184) >> 1;
            if (-var6 + var5 > var4) {
              ((rn) this).field_i = 0;
              ((rn) this).field_h = 0;
              return;
            } else {
              L0: {
                var7 = ((rn) this).field_h - -var3.a(((rn) this).field_N, 0);
                if (-var6 + var5 >= var7) {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    ((rn) this).field_h = ((rn) this).field_h + (-var7 + var6);
                    break L0;
                  }
                } else {
                  ((rn) this).field_h = ((rn) this).field_h - (var7 - -var6 - var5);
                  break L0;
                }
              }
              L1: {
                if (0 < ((rn) this).field_h) {
                  ((rn) this).field_h = 0;
                  break L1;
                } else {
                  if (((rn) this).field_h >= -var5 + var6) {
                    break L1;
                  } else {
                    ((rn) this).field_h = var6 + -var5;
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((rn) this).field_i = 0;
          ((rn) this).field_h = 0;
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = ((rn) this).field_g.length();
        if (var2 == ((rn) this).field_N) {
          return ((rn) this).field_N;
        } else {
          var3 = 1 + ((rn) this).field_N;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (32 == ((rn) this).field_g.charAt(var3 - 1)) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        }
    }

    private final void c() {
        if (((rn) this).field_o instanceof bn) {
            ((bn) (Object) ((rn) this).field_o).b((rn) this, 117);
        }
        ((rn) this).a((byte) -7, 102, 2, -128);
    }

    final void a(boolean param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rn) this).field_g = param1;
              var4_int = param1.length();
              if (-1 == ((rn) this).field_H) {
                break L2;
              } else {
                if (var4_int <= ((rn) this).field_H) {
                  break L2;
                } else {
                  ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_H);
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((rn) this).field_g.length();
              ((rn) this).field_J = dupTemp$2;
              ((rn) this).field_N = dupTemp$2;
              if (!param0) {
                ((rn) this).l(-22706);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param2) {
                break L4;
              } else {
                this.a(-16, 109);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rn.KA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    private final void a(String param0) {
        int var3_int = 0;
        if (((rn) this).field_H != -1) {
            var3_int = ((rn) this).field_H - ((rn) this).field_g.length();
            if (var3_int >= 0) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (((rn) this).field_N != ((rn) this).field_g.length()) {
            ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_N) + param0 + ((rn) this).field_g.substring(((rn) this).field_N, ((rn) this).field_g.length());
        } else {
            ((rn) this).field_g = ((rn) this).field_g + param0;
        }
        ((rn) this).field_N = ((rn) this).field_N + param0.length();
        ((rn) this).field_J = ((rn) this).field_N;
        try {
            ((rn) this).l(-22706);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rn.MA(" + (param0 != null ? "{...}" : "null") + 44 + -34 + 41);
        }
    }

    final static vg a(boolean param0, ab param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vg stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d(28089, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = hd.a(param1, (byte) 118) ? 1 : 0;
                var4 = hd.a(param1, (byte) 126) ? 1 : 0;
                var5 = new vg();
                var5.field_f = (short)param1.d(28089, 16);
                int discarded$37 = 16;
                int discarded$38 = 16;
                var5.field_b = eo.a(param1, var5.field_b);
                int discarded$39 = 16;
                int discarded$40 = 16;
                var5.field_B = eo.a(param1, var5.field_B);
                int discarded$41 = 16;
                int discarded$42 = 16;
                var5.field_L = eo.a(param1, var5.field_L);
                var5.field_G = (short)param1.d(28089, 16);
                int discarded$43 = 16;
                int discarded$44 = 16;
                var5.field_U = eo.a(param1, var5.field_U);
                int discarded$45 = 16;
                int discarded$46 = 16;
                var5.field_T = eo.a(param1, var5.field_T);
                int discarded$47 = 16;
                int discarded$48 = 16;
                var5.field_O = eo.a(param1, var5.field_O);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_A = (short)param1.d(28089, 16);
                  int discarded$49 = 16;
                  int discarded$50 = 16;
                  var5.field_r = eo.a(param1, var5.field_r);
                  int discarded$51 = 16;
                  int discarded$52 = 16;
                  var5.field_e = eo.a(param1, var5.field_e);
                  int discarded$53 = 16;
                  int discarded$54 = 16;
                  var5.field_S = eo.a(param1, var5.field_S);
                  int discarded$55 = 16;
                  int discarded$56 = 16;
                  var5.field_w = eo.a(param1, var5.field_w);
                  int discarded$57 = 16;
                  int discarded$58 = 16;
                  var5.field_q = eo.a(param1, var5.field_q);
                  int discarded$59 = 16;
                  int discarded$60 = 16;
                  var5.field_u = eo.a(param1, var5.field_u);
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$61 = param1.d(28089, 16);
                  int discarded$62 = 16;
                  int discarded$63 = 16;
                  var5.field_Q = eo.a(param1, var5.field_Q);
                  int discarded$64 = 16;
                  int discarded$65 = 16;
                  var5.field_d = eo.a(param1, var5.field_d);
                  int discarded$66 = 16;
                  int discarded$67 = 16;
                  var5.field_D = eo.a(param1, var5.field_D);
                  int discarded$68 = 16;
                  int discarded$69 = 16;
                  var5.field_s = eo.a(param1, var5.field_s);
                  int discarded$70 = 16;
                  int discarded$71 = 16;
                  var5.field_h = eo.a(param1, var5.field_h);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!hd.a(param1, (byte) 126)) {
                  break L3;
                } else {
                  int discarded$72 = 16;
                  int discarded$73 = 16;
                  var5.field_z = eo.a(param1, var5.field_z);
                  break L3;
                }
              }
              L4: {
                if (hd.a(param1, (byte) 120)) {
                  var5.field_H = ub.a(3, param1, 16, var5.field_H);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_H.length) {
                      if (var6 != 0) {
                        var5.field_F = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_H = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_H[var7] & 255) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_20_0 = (vg) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("rn.R(").append(1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    private final void g() {
        int discarded$0 = -23916;
        String var2 = this.k();
        if (var2.length() > 0) {
            int discarded$1 = -23916;
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k()), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String k() {
        int var2 = ((rn) this).field_J >= ((rn) this).field_N ? ((rn) this).field_N : ((rn) this).field_J;
        int var3 = ((rn) this).field_N <= ((rn) this).field_J ? ((rn) this).field_J : ((rn) this).field_N;
        return ((rn) this).field_g.substring(var2, var3);
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var8_int = 49 % ((param4 - -42) / 35);
            if (!super.a(param0, param1, param2, param3, -78, param5, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              if (((rn) this).field_r instanceof ac) {
                L1: {
                  var9_int = ((ac) (Object) ((rn) this).field_r).b(param6, (qm) this, me.field_I, an.field_g, param3, 2454);
                  stackOut_3_0 = this;
                  stackOut_3_1 = 81;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var9_int != -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var9_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, stackIn_6_2);
                  var9 = qj.b(-26572);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-((rn) this).field_P + var9 >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((rn) this).field_R = stackIn_9_1 != 0;
                  if (((rn) this).field_R) {
                    L4: {
                      ((rn) this).field_J = this.f(1000);
                      ((rn) this).field_N = this.i(-9125);
                      if (((rn) this).field_N <= 0) {
                        break L4;
                      } else {
                        if (32 == ((rn) this).field_g.charAt(-1 + ((rn) this).field_N)) {
                          ((rn) this).field_N = ((rn) this).field_N - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((rn) this).field_O = ((rn) this).field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((rn) this).field_P = var9;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("rn.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "WINNER - ";
    }
}
