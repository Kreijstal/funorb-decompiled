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
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 == this.field_N) {
          return this.field_N;
        } else {
          if (param0 == 1000) {
            var2 = this.field_N + -1;
            L0: while (true) {
              L1: {
                if (-1 <= (var2 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_g.charAt(-1 + var2) == 32) {
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

    final static void m(int param0) {
        int var1;
        L0: {
          if (!pe.field_Jb) {
            L1: {
              if (ce.field_i == null) {
                ce.field_i = tj.a(4, -21402);
                break L1;
              } else {
                break L1;
              }
            }
            if (!ce.field_i.field_l) {
              break L0;
            } else {
              ad.field_f = ko.a(ad.field_f, ce.field_i.field_i, true);
              ce.field_i = null;
              pe.field_Jb = true;
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param0 == 0) {
          L2: {
            if (!jf.field_e) {
              L3: {
                if (0 == (1 & ne.field_g)) {
                  var1 = wd.field_d;
                  if (0 >= var1) {
                    if (-3 >= (qf.field_d ^ -1)) {
                      System.out.println("No data to pull");
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  if (2 <= qf.field_d) {
                    System.out.println("Orb coins not availiable");
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              jf.field_e = true;
              break L2;
            } else {
              break L2;
            }
          }
          L4: {
            if (be.field_g) {
              break L4;
            } else {
              L5: {
                if (null == ci.field_d) {
                  ci.field_d = ld.a(6, false);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (!ci.field_d.field_k) {
                break L4;
              } else {
                ec.a(ci.field_d.field_j, (byte) -49);
                ci.field_d = null;
                be.field_g = true;
                break L4;
              }
            }
          }
          L6: {
            if (la.field_a) {
              break L6;
            } else {
              if (!ta.field_b) {
                he.field_e.b((byte) -84, 65);
                ta.field_b = true;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (la.field_a) {
              kg.field_a = true;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!pe.field_Jb) {
              break L8;
            } else {
              if (!be.field_g) {
                break L8;
              } else {
                if (!kg.field_a) {
                  break L8;
                } else {
                  if (!jf.field_e) {
                    break L8;
                  } else {
                    wm.g(0);
                    qc.a(false);
                    break L8;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ac var5 = null;
        long var6 = 0L;
        if (param0 > -52) {
            return;
        }
        if (this.field_r != null) {
            if (!(param2 != 0)) {
                this.field_r.a((qm) (this), 5592405, param1, param3, this.field_B);
                if (this.field_r instanceof ac) {
                    var5 = (ac) ((Object) this.field_r);
                    if (this.field_N != this.field_J) {
                        var5.a(param3, (qm) (this), param1, 6600, this.field_N, this.field_J);
                    }
                    var6 = qj.b(-26572);
                    if (!(-501L >= ((-this.field_Q + var6) % 1000L ^ -1L))) {
                        var5.a(79, param3, param1, this.field_N, (qm) (this));
                    }
                }
            }
        }
    }

    void l(int param0) {
        if (!(!(this.field_o instanceof bn))) {
            ((bn) ((Object) this.field_o)).a((rn) (this), -20626);
        }
        if (param0 != -22706) {
            this.c(false);
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -10292) {
            return;
        }
        if (!(this.field_N == this.field_J)) {
            var2 = this.field_J < this.field_N ? this.field_J : this.field_N;
            var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
            this.field_J = var2;
            this.field_N = var2;
            this.field_g = this.field_g.substring(0, var2) + this.field_g.substring(var3, this.field_g.length());
            this.l(-22706);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        ac var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h((byte) -100);
              if ((this.field_t ^ -1) == -2) {
                L2: {
                  if (!(this.field_r instanceof ac)) {
                    break L2;
                  } else {
                    var5 = (ac) ((Object) this.field_r);
                    var6 = var5.b(param1, (qm) (this), me.field_I, an.field_g, param3, param2 ^ 2364);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_R) {
                          break L3;
                        } else {
                          if (var6 >= this.field_O) {
                            break L3;
                          } else {
                            if (this.field_J < var6) {
                              var6 = this.field_O;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_N = var6;
                      break L2;
                    }
                  }
                }
                this.field_Q = qj.b(-26572);
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
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("rn.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1) {
        this.field_N = param1;
        if (!(ri.field_b[param0])) {
            this.field_J = this.field_N;
        }
    }

    final void g(int param0) {
        int discarded$0 = 0;
        this.field_N = 0;
        if (param0 != 3545) {
            discarded$0 = this.f(39);
        }
        this.field_g = "";
        this.field_J = 0;
        this.l(-22706);
    }

    final static void i(byte param0) {
        int var2 = 0;
        ab var3 = null;
        cg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              dn.field_Db = false;
              om.field_x = null;
              wi.field_f = null;
              if (param0 < -97) {
                break L1;
              } else {
                var3 = (ab) null;
                rn.a(true, (ab) null);
                break L1;
              }
            }
            L2: {
              if (null != gm.field_j) {
                gm.field_j.c(-124);
                gm.field_j = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              bc.field_c = null;
              if (null == vh.field_a) {
                break L3;
              } else {
                vh.field_a.c(99);
                vh.field_a = null;
                break L3;
              }
            }
            L4: {
              nk.field_q = null;
              if (ph.field_a == null) {
                break L4;
              } else {
                ph.field_a.c(10);
                ph.field_a = null;
                break L4;
              }
            }
            L5: {
              kn.field_qb = null;
              if (null != bc.field_c) {
                var4 = (cg) ((Object) bc.field_c.f(102));
                L6: while (true) {
                  if (var4 == null) {
                    bc.field_c = null;
                    break L5;
                  } else {
                    var4.a((byte) 88);
                    var4 = (cg) ((Object) bc.field_c.a(-1));
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rn.L(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        this.g((byte) 56);
        if (param0 < 107) {
            return;
        }
        this.j(-10292);
    }

    private final void h(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                if (param0 == -9711) {
                  this.j(-10292);
                  this.a(var2, (byte) -34);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rn(String param0, wc param1, int param2) {
        super(param0, param1);
        this.field_R = false;
        this.field_O = -1;
        this.field_P = 0L;
        try {
            this.field_r = io.field_n.field_l;
            this.field_H = param2;
            this.a(true, param0, false);
            this.field_M = true;
            this.field_Q = qj.b(-26572);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 1) {
            rn.m(-26);
        }
        field_L = null;
        field_K = null;
        field_S = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
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
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_Q = qj.b(-26572);
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
                            if (this.field_N != this.field_J) {
                              this.j(-10292);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (-1 == this.field_H) {
                                break L5;
                              } else {
                                if (this.field_g.length() >= this.field_H) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (this.field_N >= this.field_g.length()) {
                                this.field_g = this.field_g + param2;
                                dupTemp$0 = this.field_g.length();
                                this.field_N = dupTemp$0;
                                this.field_J = dupTemp$0;
                                break L6;
                              } else {
                                this.field_g = this.field_g.substring(0, this.field_N) + param2 + this.field_g.substring(this.field_N, this.field_g.length());
                                this.field_N = this.field_N + 1;
                                this.field_J = this.field_N;
                                break L6;
                              }
                            }
                            this.l(-22706);
                            break L4;
                          }
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    if ((param3 ^ -1) != -86) {
                      L7: {
                        if (-102 != (param3 ^ -1)) {
                          if (-14 != (param3 ^ -1)) {
                            if (param3 != 96) {
                              if (param3 == 97) {
                                if (this.field_N >= this.field_g.length()) {
                                  break L7;
                                } else {
                                  L8: {
                                    stackIn_73_0 = this;

                                    stackIn_73_1 = 81;

                                    if (!ri.field_b[82]) {
                                      stackIn_74_0 = this;
                                      stackIn_74_1 = stackIn_73_1;
                                      stackIn_74_2 = 1 + this.field_N;
                                      break L8;
                                    } else {
                                      stackIn_74_0 = this;
                                      stackIn_74_1 = stackIn_73_1;
                                      stackIn_74_2 = this.i(-9125);
                                      break L8;
                                    }
                                  }
                                  this.a(stackIn_74_1, stackIn_74_2);
                                  stackIn_75_0 = 1;
                                  decompiledRegionSelector0 = 15;
                                  break L0;
                                }
                              } else {
                                if (param3 != 102) {
                                  if (-104 != (param3 ^ -1)) {
                                    if (param3 != 84) {
                                      L9: {
                                        if (!ri.field_b[82]) {
                                          break L9;
                                        } else {
                                          if ((param3 ^ -1) != -66) {
                                            break L9;
                                          } else {
                                            this.j((byte) 122);
                                            stackIn_61_0 = 1;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
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
                                            this.g((byte) 56);
                                            stackIn_65_0 = 1;
                                            decompiledRegionSelector0 = 13;
                                            break L0;
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
                                          stackIn_69_0 = 1;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      this.c(false);
                                      stackIn_57_0 = 1;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  } else {
                                    this.a(81, this.field_g.length());
                                    stackIn_54_0 = 1;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  }
                                } else {
                                  this.a(81, 0);
                                  stackIn_51_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            } else {
                              if (-1 <= (this.field_N ^ -1)) {
                                break L7;
                              } else {
                                L11: {
                                  stackIn_45_0 = this;

                                  stackIn_45_1 = 81;

                                  if (ri.field_b[82]) {
                                    stackIn_46_0 = this;
                                    stackIn_46_1 = stackIn_45_1;
                                    stackIn_46_2 = this.f(1000);
                                    break L11;
                                  } else {
                                    stackIn_46_0 = this;
                                    stackIn_46_1 = stackIn_45_1;
                                    stackIn_46_2 = this.field_N + -1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_46_1, stackIn_46_2);
                                stackIn_47_0 = 1;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          } else {
                            this.g(3545);
                            stackIn_40_0 = 1;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          if (this.field_J == this.field_N) {
                            if (this.field_N < this.field_g.length()) {
                              this.field_J = 1 + this.field_N;
                              this.j(-10292);
                              stackIn_37_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            this.j(-10292);
                            stackIn_33_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      stackIn_77_0 = 0;
                      decompiledRegionSelector0 = 16;
                      break L0;
                    } else {
                      if (this.field_N != this.field_J) {
                        this.j(-10292);
                        stackIn_29_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (-1 > (this.field_N ^ -1)) {
                          this.field_J = -1 + this.field_N;
                          this.j(-10292);
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("rn.N(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L12;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_51_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_54_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_57_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_61_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_65_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_69_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_75_0 != 0;
                                      } else {
                                        return stackIn_77_0 != 0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void h(byte param0) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.field_M) {
            this.field_i = 0;
            this.field_h = 0;
            return;
        }
        if (!(this.field_r instanceof ac)) {
            return;
        }
        ac var9 = (ac) ((Object) this.field_r);
        kh var3 = var9.a((qm) (this), -46);
        int var4 = var3.b((byte) 121);
        int var5 = var9.a((qm) (this), (byte) 101);
        if (param0 > -38) {
            return;
        }
        int var6 = var9.a(27184) >> 559979617;
        if (!(-var6 + var5 <= var4)) {
            this.field_i = 0;
            this.field_h = 0;
            return;
        }
        int var7 = this.field_h - -var3.a(this.field_N, 0);
        if (-var6 + var5 < var7) {
            this.field_h = this.field_h - (var7 - -var6 - var5);
        } else {
            if (var7 < var6) {
                this.field_h = this.field_h + (-var7 + var6);
            }
        }
        if (0 < this.field_h || this.field_h < -var5 + var6) {
            this.field_h = 0;
        }
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == -9125) {
            break L0;
          } else {
            this.h(99);
            break L0;
          }
        }
        var2 = this.field_g.length();
        if (var2 == this.field_N) {
          return this.field_N;
        } else {
          var3 = 1 + this.field_N;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (32 == this.field_g.charAt(var3 - 1)) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    private final void c(boolean param0) {
        if (this.field_o instanceof bn) {
            ((bn) ((Object) this.field_o)).b((rn) (this), 117);
        }
        if (param0) {
            this.a((byte) -7, 102, 2, -128);
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
              this.field_g = param1;
              var4_int = param1.length();
              if (-1 == this.field_H) {
                break L2;
              } else {
                if (var4_int <= this.field_H) {
                  break L2;
                } else {
                  this.field_g = this.field_g.substring(0, this.field_H);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_g.length();
              this.field_J = dupTemp$1;
              this.field_N = dupTemp$1;
              if (!param0) {
                this.l(-22706);
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("rn.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (0 != (this.field_H ^ -1)) {
            var3_int = this.field_H - this.field_g.length();
            if ((var3_int ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_N != this.field_g.length()) {
            this.field_g = this.field_g.substring(0, this.field_N) + param0 + this.field_g.substring(this.field_N, this.field_g.length());
        } else {
            this.field_g = this.field_g + param0;
        }
        this.field_N = this.field_N + param0.length();
        this.field_J = this.field_N;
        if (param1 >= -27) {
            return;
        }
        try {
            this.l(-22706);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rn.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static vg a(boolean param0, ab param1) {
        vg stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d(28089, 8);
            if ((var2_int ^ -1) >= -1) {
              L1: {
                var3 = hd.a(param1, (byte) 118) ? 1 : 0;
                var4 = hd.a(param1, (byte) 126) ? 1 : 0;
                if (param0) {
                  break L1;
                } else {
                  field_K = (String) null;
                  break L1;
                }
              }
              L2: {
                var5 = new vg();
                var5.field_f = (short)param1.d(28089, 16);
                var5.field_b = eo.a(param1, var5.field_b, 16, 16);
                var5.field_B = eo.a(param1, var5.field_B, 16, 16);
                var5.field_L = eo.a(param1, var5.field_L, 16, 16);
                var5.field_G = (short)param1.d(28089, 16);
                var5.field_U = eo.a(param1, var5.field_U, 16, 16);
                var5.field_T = eo.a(param1, var5.field_T, 16, 16);
                var5.field_O = eo.a(param1, var5.field_O, 16, 16);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_A = (short)param1.d(28089, 16);
                  var5.field_r = eo.a(param1, var5.field_r, 16, 16);
                  var5.field_e = eo.a(param1, var5.field_e, 16, 16);
                  var5.field_S = eo.a(param1, var5.field_S, 16, 16);
                  var5.field_w = eo.a(param1, var5.field_w, 16, 16);
                  var5.field_q = eo.a(param1, var5.field_q, 16, 16);
                  var5.field_u = eo.a(param1, var5.field_u, 16, 16);
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  param1.d(28089, 16);
                  var5.field_Q = eo.a(param1, var5.field_Q, 16, 16);
                  var5.field_d = eo.a(param1, var5.field_d, 16, 16);
                  var5.field_D = eo.a(param1, var5.field_D, 16, 16);
                  var5.field_s = eo.a(param1, var5.field_s, 16, 16);
                  var5.field_h = eo.a(param1, var5.field_h, 16, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!hd.a(param1, (byte) 126)) {
                  break L4;
                } else {
                  var5.field_z = eo.a(param1, var5.field_z, 16, 16);
                  break L4;
                }
              }
              L5: {
                if (hd.a(param1, (byte) 120)) {
                  var5.field_H = ub.a(3, param1, 16, var5.field_H);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_H.length) {
                      if (-1 != (var6 ^ -1)) {
                        var5.field_F = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_H = null;
                        break L5;
                      }
                    } else {
                      if ((var5.field_H[var7] & 255) > var6) {
                        var6 = var5.field_H[var7] & 255;
                        var7++;
                        continue L6;
                      } else {
                        var7++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              stackIn_23_0 = (vg) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("rn.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    private final void g(byte param0) {
        if (param0 != 56) {
            qm var3 = (qm) null;
            this.a(84, 58, (qm) null, 100, 126, 7, -93);
        }
        String var2 = this.k(param0 + -23972);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(-23916))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String k(int param0) {
        int var2 = this.field_J >= this.field_N ? this.field_N : this.field_J;
        if (param0 != -23916) {
            return (String) null;
        }
        int var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
        return this.field_g.substring(var2, var3);
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        try {
          L0: {
            var8_int = 49 % ((param4 - -42) / 35);
            if (!super.a(param0, param1, param2, param3, -78, param5, param6)) {
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_r instanceof ac) {
                L1: {
                  var9_int = ((ac) ((Object) this.field_r)).b(param6, (qm) (this), me.field_I, an.field_g, param3, 2454);
                  stackIn_5_0 = this;

                  stackIn_5_1 = 81;

                  if ((var9_int ^ -1) != 0) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = var9_int;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, stackIn_6_2);
                  var9 = qj.b(-26572);
                  stackIn_8_0 = this;

                  if (-this.field_P + var9 >= 250L) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((rn) (this)).field_R = stackIn_9_1 != 0;
                  if (this.field_R) {
                    L4: {
                      this.field_J = this.f(1000);
                      this.field_N = this.i(-9125);
                      if (-1 <= (this.field_N ^ -1)) {
                        break L4;
                      } else {
                        if (32 == this.field_g.charAt(-1 + this.field_N)) {
                          this.field_N = this.field_N - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_O = this.field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_P = var9;
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("rn.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    static {
        field_K = "WINNER - ";
    }
}
