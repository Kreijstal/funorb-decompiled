/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends jea {
    private int field_Ib;
    private boolean field_tb;
    private int field_Gb;
    private int field_ub;
    private int field_yb;
    private naa field_Db;
    jea field_Cb;
    private int field_Ab;
    static String field_Fb;
    private fia field_Bb;
    private jea field_Eb;
    private StringBuilder field_wb;
    private long field_Hb;
    private jea field_xb;
    static int[] field_zb;
    private boolean field_vb;

    private final void a(String param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          L0: {
            L1: {
              if ((this.field_Ib ^ -1) == 0) {
                break L1;
              } else {
                var3_int = this.field_Ib + -this.field_wb.length();
                if (var3_int == 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_ub != this.field_wb.length()) {
                var4 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
                ana.a(this.field_ub, ' ', -11, this.field_wb);
                discarded$0 = this.field_wb.append(param0);
                discarded$1 = this.field_wb.append(var4);
                break L2;
              } else {
                discarded$2 = this.field_wb.append(param0);
                break L2;
              }
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                this.field_yb = -100;
                break L3;
              }
            }
            this.field_Cb.field_r = this.field_wb.toString();
            this.field_ub = this.field_wb.length();
            this.field_Ab = this.field_ub;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("sw.G(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void h(byte param0) {
        try {
            int dupTemp$0 = 0;
            Object stackIn_5_0 = null;
            Object stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            RuntimeException var2 = null;
            long var3_long = 0L;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var2_int = this.b(-2, -this.field_Cb.field_S + (-this.field_q + jba.field_j));
                  if (this.field_y != 1) {
                    L2: {
                      if ((ksa.field_p ^ -1) != -2) {
                        break L2;
                      } else {
                        if (this.field_tb) {
                          L3: {
                            if (!this.field_vb) {
                              break L3;
                            } else {
                              if (this.field_yb <= var2_int) {
                                break L3;
                              } else {
                                if (this.field_Ab < var2_int) {
                                  var2_int = this.field_yb;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          this.field_ub = var2_int;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.field_tb = false;
                    break L1;
                  } else {
                    L4: {
                      this.d(param0 + 18539, var2_int);
                      this.field_tb = true;
                      var3_long = bva.b((byte) -107);
                      stackIn_5_0 = this;

                      if (-251L >= (-this.field_Hb + var3_long ^ -1L)) {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 0;
                        break L4;
                      } else {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      ((sw) (this)).field_vb = stackIn_6_1 != 0;
                      if (this.field_vb) {
                        L6: {
                          this.field_Ab = this.j((byte) -69);
                          this.field_ub = this.g((byte) 24);
                          if (-1 <= (this.field_ub ^ -1)) {
                            break L6;
                          } else {
                            if (this.field_wb.charAt(this.field_ub - 1) != 32) {
                              break L6;
                            } else {
                              this.field_ub = this.field_ub - 1;
                              break L6;
                            }
                          }
                        }
                        this.field_yb = this.field_ub;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_Hb = var3_long;
                    break L1;
                  }
                }
                L7: {
                  if (!this.field_L) {
                    dupTemp$0 = this.field_wb.length();
                    this.field_Ab = dupTemp$0;
                    this.field_ub = dupTemp$0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  this.field_Eb.field_qb = this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_ub));
                  if (this.field_Ab == this.field_ub) {
                    this.field_xb.a(0, this.field_Gb, -23776, 2, this.field_Eb.field_qb);
                    break L8;
                  } else {
                    L9: {
                      var3 = this.field_Cb.field_qb + this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_Ab));
                      if (this.field_Eb.field_qb <= var3) {
                        stackIn_35_0 = this.field_Eb.field_qb;
                        break L9;
                      } else {
                        stackIn_35_0 = var3;
                        break L9;
                      }
                    }
                    var4_int = stackIn_35_0;
                    var5 = Math.abs(-this.field_Eb.field_qb + var3);
                    this.field_xb.a(var5, this.field_Gb, param0 ^ -23689, 2, this.field_Cb.field_S + var4_int);
                    break L8;
                  }
                }
                L10: {
                  if (null == this.field_Db) {
                    break L10;
                  } else {
                    if (0 == this.field_Db.field_b) {
                      break L10;
                    } else {
                      var7 = (java.awt.datatransfer.Transferable) (this.field_Db.field_f);
                      try {
                        L11: {
                          var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                          this.i((byte) -126);
                          this.a(var8, true);
                          break L11;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L12;
                        }
                      }
                      this.field_Db = null;
                      break L10;
                    }
                  }
                }
                if (param0 == 87) {
                  break L0;
                } else {
                  this.field_ub = 115;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) ((Object) var2), "sw.JA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1) {
        try {
            this.field_Ab = param0;
            if (param1 != 1) {
                this.field_Db = (naa) null;
            }
            this.field_ub = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        if (!(this.field_Bb != null)) {
            return;
        }
        try {
            this.f(82);
            int var2_int = -100 / ((param0 - 14) / 52);
            this.i((byte) -125);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.E(" + param0 + ')');
        }
    }

    sw(long param0, jea param1, jea param2, jea param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 65) {
                break L1;
              } else {
                discarded$1 = this.b(-116, -81);
                break L1;
              }
            }
            L2: {
              var4_int = this.field_wb.length();
              if (-1 >= (param2 ^ -1)) {
                if (var4_int >= param2) {
                  break L2;
                } else {
                  param2 = var4_int;
                  break L2;
                }
              } else {
                param2 = 0;
                break L2;
              }
            }
            L3: {
              if (param0 >= 0) {
                if (param0 > var4_int) {
                  param0 = var4_int;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                param0 = 0;
                break L3;
              }
            }
            this.field_ub = param2;
            this.field_Ab = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "sw.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(byte param0) {
        StringBuilder discarded$0 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -119) {
                break L1;
              } else {
                this.j(-109);
                break L1;
              }
            }
            L2: {
              if (this.field_ub == this.field_Ab) {
                break L2;
              } else {
                L3: {
                  if (this.field_Ab < this.field_ub) {
                    stackIn_7_0 = this.field_Ab;
                    break L3;
                  } else {
                    stackIn_7_0 = this.field_ub;
                    break L3;
                  }
                }
                L4: {
                  var2_int = stackIn_7_0;
                  if (this.field_ub > this.field_Ab) {
                    stackIn_11_0 = this.field_ub;
                    break L4;
                  } else {
                    stackIn_11_0 = this.field_Ab;
                    break L4;
                  }
                }
                var3 = stackIn_11_0;
                this.field_Ab = var2_int;
                this.field_ub = var2_int;
                var4 = this.field_wb.toString().substring(var3, this.field_wb.length());
                ana.a(var2_int, ' ', -11, this.field_wb);
                discarded$0 = this.field_wb.append(var4);
                this.field_Cb.field_r = this.field_wb.toString();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.H(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 > -84) {
            return;
        }
        try {
            ana.a(0, ' ', -11, this.field_wb);
            this.field_Ab = 0;
            this.field_ub = 0;
            this.field_Cb.field_r = this.field_wb.toString();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.HA(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (lca.a(false)) {
              wu.field_a.a(sc.field_k, true, oqa.field_w, param0 ^ -11);
              wu.field_a.g((byte) -128);
              L1: while (true) {
                if (!es.a(true)) {
                  if (param0 == 100) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    field_zb = (int[]) null;
                    return;
                  }
                } else {
                  wu.field_a.a((byte) -53, fna.field_h, kda.field_td);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (dq.field_f == null) {
                  break L2;
                } else {
                  if (!dq.field_f.field_b) {
                    break L2;
                  } else {
                    og.b(0);
                    wu.field_a.c(new gga(wu.field_a, or.field_j), 122);
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "sw.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int j(byte param0) {
        int var2_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_ub != 0) {
              var2_int = this.field_ub + -1;
              L1: while (true) {
                L2: {
                  if (-1 <= (var2_int ^ -1)) {
                    break L2;
                  } else {
                    if (up.a(this.field_wb.charAt(var2_int - 1), true)) {
                      break L2;
                    } else {
                      var2_int--;
                      continue L1;
                    }
                  }
                }
                var3 = 59 / ((74 - param0) / 41);
                stackIn_10_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = this.field_ub;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.RA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(fia param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_Bb = param0;
            var3_int = 85 / ((param1 - -26) / 51);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sw.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        if (param0 != 100) {
            this.field_Gb = -61;
        }
        if (this.field_Bb == null) {
            return;
        }
        try {
            this.field_Db = this.field_Bb.b(param0 + 25);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.D(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        try {
            java.awt.datatransfer.StringSelection var3 = null;
            if (!(this.field_Bb != null)) {
                return;
            }
            String var2 = this.f((byte) -107);
            if (var2.length() == 0) {
                return;
            }
            try {
                var3 = new java.awt.datatransfer.StringSelection(this.f((byte) -89));
                if (param0 != 82) {
                    this.field_wb = (StringBuilder) null;
                }
                this.field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) ((Object) var3));
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) ((Object) runtimeException), "sw.OA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String f(byte param0) {
        int discarded$1 = 0;
        String var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -76) {
                break L1;
              } else {
                discarded$1 = this.g((byte) 84);
                break L1;
              }
            }
            L2: {
              var2 = this.field_wb.toString();
              if (this.field_Ab < this.field_ub) {
                stackIn_6_0 = this.field_Ab;
                break L2;
              } else {
                stackIn_6_0 = this.field_ub;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_6_0;
              if (this.field_ub > this.field_Ab) {
                stackIn_10_0 = this.field_ub;
                break L3;
              } else {
                stackIn_10_0 = this.field_Ab;
                break L3;
              }
            }
            var4 = stackIn_10_0;
            stackIn_11_0 = var2.substring(var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "sw.TA(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1320) {
              stackIn_4_0 = this.field_ub;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 58;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.NA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 > -33) {
            return;
        }
        try {
            field_zb = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.B(" + param0 + ')');
        }
    }

    private sw(long param0, jea param1, jea param2, jea param3, int param4) {
        super(param0, param1);
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_tb = false;
        this.field_yb = -1;
        this.field_Hb = 0L;
        this.field_vb = false;
        try {
          L0: {
            L1: {
              this.field_Ib = param4;
              this.field_xb = new jea(0L, param2);
              this.field_Cb = new jea(0L, param3);
              this.field_Eb = new jea(0L, param3);
              this.field_Z = true;
              stackIn_3_0 = this;

              stackIn_3_1 = null;

              stackIn_3_2 = null;

              if (0 == (this.field_Ib ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = 256;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = null;
                stackIn_4_2 = null;
                stackIn_4_3 = this.field_Ib;
                break L1;
              }
            }
            ((sw) (this)).field_wb = new StringBuilder(stackIn_4_3);
            this.field_Cb.field_r = this.field_wb.toString();
            this.field_Eb.field_r = "";
            this.field_Eb.field_sb = "|";
            this.field_J = new vna();
            this.b(-122, this.field_xb);
            this.b(-122, this.field_Cb);
            this.b(-123, this.field_Eb);
            this.field_L = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("sw.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, String param1) {
        StringBuilder discarded$4 = null;
        int dupTemp$5 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_wb.setLength(0);
              var3_int = param1.length();
              if (this.field_Ib == -1) {
                break L1;
              } else {
                if (var3_int <= this.field_Ib) {
                  break L1;
                } else {
                  var3_int = this.field_Ib;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 >= 0) {
                break L2;
              } else {
                this.field_Ib = 96;
                break L2;
              }
            }
            discarded$4 = this.field_wb.append(param1.substring(0, var3_int));
            dupTemp$5 = this.field_wb.length();
            this.field_Ab = dupTemp$5;
            this.field_ub = dupTemp$5;
            this.field_Cb.field_r = this.field_wb.toString();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("sw.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        try {
          L0: {
            if (param1 == -19696) {
              L1: {
                if (param2 == 60) {
                  break L1;
                } else {
                  if ((param2 ^ -1) == -63) {
                    break L1;
                  } else {
                    L2: {
                      if (param2 < 32) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) < -127) {
                          break L2;
                        } else {
                          L3: {
                            if (this.field_Ab != this.field_ub) {
                              this.i((byte) -124);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (this.field_Ib == -1) {
                                break L5;
                              } else {
                                if (this.field_wb.length() >= this.field_Ib) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (this.field_ub == this.field_wb.length()) {
                                discarded$0 = this.field_wb.append(param2);
                                break L6;
                              } else {
                                var5 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
                                ana.a(this.field_ub, ' ', -11, this.field_wb);
                                discarded$1 = this.field_wb.append(param2);
                                discarded$2 = this.field_wb.append(var5);
                                break L6;
                              }
                            }
                            this.field_Cb.field_r = this.field_wb.toString();
                            this.field_ub = this.field_ub + 1;
                            this.field_Ab = this.field_ub;
                            break L4;
                          }
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    L7: {
                      if (85 == param0) {
                        if (this.field_Ab != this.field_ub) {
                          this.i((byte) -120);
                          stackIn_80_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if ((this.field_ub ^ -1) < -1) {
                            this.field_Ab = this.field_ub + -1;
                            this.i((byte) -125);
                            stackIn_78_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        if (101 != param0) {
                          if (-14 != (param0 ^ -1)) {
                            if (96 != param0) {
                              if (-98 != (param0 ^ -1)) {
                                if ((param0 ^ -1) != -103) {
                                  if (-104 != (param0 ^ -1)) {
                                    L8: {
                                      if (!oj.field_tb[82]) {
                                        break L8;
                                      } else {
                                        if ((param0 ^ -1) != -66) {
                                          break L8;
                                        } else {
                                          this.k(param1 ^ 19666);
                                          stackIn_63_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!oj.field_tb[82]) {
                                        break L9;
                                      } else {
                                        if (-67 == (param0 ^ -1)) {
                                          this.f(82);
                                          stackIn_72_0 = 1;
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!oj.field_tb[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param0) {
                                        break L7;
                                      } else {
                                        this.g(100);
                                        stackIn_70_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.d(param1 ^ -1070, this.field_wb.length());
                                    stackIn_59_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                } else {
                                  this.d(param1 + 38322, 0);
                                  stackIn_56_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                }
                              } else {
                                if (this.field_ub < this.field_wb.length()) {
                                  L10: {
                                    if (!oj.field_tb[82]) {
                                      stackIn_52_0 = this.field_ub + 1;
                                      break L10;
                                    } else {
                                      stackIn_52_0 = this.g((byte) 50);
                                      break L10;
                                    }
                                  }
                                  var4_int = stackIn_52_0;
                                  this.d(18626, var4_int);
                                  stackIn_53_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                } else {
                                  return false;
                                }
                              }
                            } else {
                              if (0 >= this.field_ub) {
                                break L7;
                              } else {
                                L11: {
                                  if (oj.field_tb[82]) {
                                    stackIn_41_0 = this.j((byte) -92);
                                    break L11;
                                  } else {
                                    stackIn_41_0 = -1 + this.field_ub;
                                    break L11;
                                  }
                                }
                                var4_int = stackIn_41_0;
                                this.d(18626, var4_int);
                                stackIn_42_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          } else {
                            this.d((byte) -95);
                            stackIn_34_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          if (this.field_Ab != this.field_ub) {
                            this.i((byte) -124);
                            stackIn_31_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            if (this.field_ub >= this.field_wb.length()) {
                              break L7;
                            } else {
                              this.field_Ab = 1 + this.field_ub;
                              this.i((byte) -124);
                              stackIn_29_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    stackIn_82_0 = 0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "sw.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_53_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_56_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_59_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_63_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_70_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_72_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_78_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_80_0 != 0;
                                    } else {
                                      return stackIn_82_0 != 0;
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

    final static int a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 6) {
              var2_int = param0;
              if (-2 != (var2_int ^ -1)) {
                if (2 != var2_int) {
                  if (3 != var2_int) {
                    if (-8 == (var2_int ^ -1)) {
                      stackIn_27_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var2_int != 6) {
                        if (var2_int == 5) {
                          stackIn_31_0 = 3;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          stackIn_33_0 = param0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackIn_29_0 = 2;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_25_0 = 5;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_23_0 = 6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_21_0 = 7;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 65;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0;
                    } else {
                      return stackIn_33_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_ub = param1;
              if (param0 == 18626) {
                break L1;
              } else {
                this.a(83, (byte) 112, 70);
                break L1;
              }
            }
            if (!oj.field_tb[81]) {
              this.field_Ab = this.field_ub;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "sw.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static void k(byte param0) {
        try {
            ta.field_ub = null;
            gca.field_g = null;
            mma.field_b = null;
            rl.field_t = null;
            df.field_J = null;
            ola.field_Ib = null;
            koa.field_b = null;
            int var1_int = -56 % ((6 - param0) / 33);
            mh.field_F = null;
            jna.field_j = null;
            jma.field_a = null;
            qi.field_O = null;
            System.gc();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.SA(" + param0 + ')');
        }
    }

    private final int g(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 3) {
                break L1;
              } else {
                this.field_tb = true;
                break L1;
              }
            }
            var2_int = this.field_wb.length();
            if (this.field_ub != var2_int) {
              var3 = 1 + this.field_ub;
              L2: while (true) {
                L3: {
                  if (var2_int <= var3) {
                    break L3;
                  } else {
                    if (up.a(this.field_wb.charAt(var3 - 1), true)) {
                      break L3;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
                stackIn_12_0 = var3;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_ub;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
            this.a(param0, param3, -23776, param2, param4);
            this.field_Cb.a(param0, param3, -23776, 0, 0);
            this.field_Eb.a(param0, param3, -23776, 0, 0);
            this.field_Gb = param3 + -4;
            if (param1 < 101) {
                this.e((byte) 103);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 0;
              if (param0 == -2) {
                break L1;
              } else {
                this.d((byte) -86);
                break L1;
              }
            }
            var5 = this.field_wb.length();
            L2: while (true) {
              L3: {
                if (var4 >= param1) {
                  break L3;
                } else {
                  if (var3_int >= var5) {
                    break L3;
                  } else {
                    incrementValue$1 = var3_int;
                    var3_int++;
                    var4 = var4 + this.field_Cb.field_H.a(this.field_wb.charAt(incrementValue$1));
                    continue L2;
                  }
                }
              }
              stackIn_8_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "sw.LA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final String e(byte param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -99) {
                break L1;
              } else {
                this.field_ub = -43;
                break L1;
              }
            }
            stackIn_3_0 = this.field_wb.toString();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.F(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Fb = "Open in popup window";
        field_zb = new int[]{1, 200, 300, 1000, 200, 500, 300, 100, 200, 300, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 500, 500, 300, 300, 100, 200, 300, 100, 100, 200, 300, 500, 300, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }
}
