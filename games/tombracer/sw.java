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
        StringBuilder discarded$54 = null;
        StringBuilder discarded$55 = null;
        StringBuilder discarded$56 = null;
        StringBuilder discarded$57 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
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
              L3: {
                if (this.field_ub != this.field_wb.length()) {
                  break L3;
                } else {
                  discarded$54 = this.field_wb.append(param0);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
              discarded$55 = ana.a(this.field_ub, ' ', -11, this.field_wb);
              discarded$56 = this.field_wb.append(param0);
              discarded$57 = this.field_wb.append(var4);
              break L2;
            }
            L4: {
              if (param1) {
                break L4;
              } else {
                this.field_yb = -100;
                break L4;
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
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("sw.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void h(byte param0) {
        try {
            int dupTemp$1 = 0;
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            int stackIn_31_0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            int stackOut_30_0 = 0;
            int stackOut_29_0 = 0;
            L0: {
              L1: {
                var6 = TombRacer.field_G ? 1 : 0;
                var2 = this.b(-2, -this.field_Cb.field_S + (-this.field_q + jba.field_j));
                if (this.field_y != 1) {
                  break L1;
                } else {
                  L2: {
                    this.d(param0 + 18539, var2);
                    this.field_tb = true;
                    var3_long = bva.b((byte) -107);
                    stackOut_1_0 = this;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (-251L >= (-this.field_Hb + var3_long ^ -1L)) {
                      stackOut_3_0 = this;
                      stackOut_3_1 = 0;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      break L2;
                    } else {
                      stackOut_2_0 = this;
                      stackOut_2_1 = 1;
                      stackIn_4_0 = stackOut_2_0;
                      stackIn_4_1 = stackOut_2_1;
                      break L2;
                    }
                  }
                  L3: {
                    ((sw) (this)).field_vb = stackIn_4_1 != 0;
                    if (this.field_vb) {
                      this.field_Ab = this.j((byte) -69);
                      this.field_ub = this.g((byte) 24);
                      if (-1 <= (this.field_ub ^ -1)) {
                        this.field_yb = this.field_ub;
                        break L3;
                      } else {
                        if (this.field_wb.charAt(this.field_ub - 1) != 32) {
                          this.field_yb = this.field_ub;
                          break L3;
                        } else {
                          this.field_ub = this.field_ub - 1;
                          this.field_yb = this.field_ub;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  this.field_Hb = var3_long;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                L5: {
                  if ((ksa.field_p ^ -1) != -2) {
                    break L5;
                  } else {
                    if (this.field_tb) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_tb = false;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L4;
                }
              }
              L6: {
                if (!this.field_vb) {
                  break L6;
                } else {
                  if (this.field_yb <= var2) {
                    break L6;
                  } else {
                    if (this.field_Ab < var2) {
                      var2 = this.field_yb;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              this.field_ub = var2;
              break L0;
            }
            L7: {
              if (!this.field_L) {
                dupTemp$1 = this.field_wb.length();
                this.field_Ab = dupTemp$1;
                this.field_ub = dupTemp$1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                this.field_Eb.field_qb = this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_ub));
                if (this.field_Ab == this.field_ub) {
                  break L9;
                } else {
                  L10: {
                    var3 = this.field_Cb.field_qb + this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_Ab));
                    if (this.field_Eb.field_qb <= var3) {
                      stackOut_30_0 = this.field_Eb.field_qb;
                      stackIn_31_0 = stackOut_30_0;
                      break L10;
                    } else {
                      stackOut_29_0 = var3;
                      stackIn_31_0 = stackOut_29_0;
                      break L10;
                    }
                  }
                  var4_int = stackIn_31_0;
                  var5 = Math.abs(-this.field_Eb.field_qb + var3);
                  this.field_xb.a(var5, this.field_Gb, param0 ^ -23689, 2, this.field_Cb.field_S + var4_int);
                  if (var6 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              this.field_xb.a(0, this.field_Gb, -23776, 2, this.field_Eb.field_qb);
              break L8;
            }
            if (null != this.field_Db) {
              if (0 != this.field_Db.field_b) {
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
                if (param0 != 87) {
                  this.field_ub = 115;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 87) {
                  this.field_ub = 115;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 87) {
                this.field_ub = 115;
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1) {
        this.field_Ab = param0;
        if (param1 != 1) {
            this.field_Db = (naa) null;
            this.field_ub = param0;
            return;
        }
        this.field_ub = param0;
    }

    private final void k(int param0) {
        if (!(this.field_Bb != null)) {
            return;
        }
        this.f(82);
        int var2 = -100 / ((param0 - 14) / 52);
        this.i((byte) -125);
    }

    sw(long param0, jea param1, jea param2, jea param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 > 65) {
          L0: {
            L1: {
              var4 = this.field_wb.length();
              if (-1 >= (param2 ^ -1)) {
                break L1;
              } else {
                param2 = 0;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var4 >= param2) {
              break L0;
            } else {
              param2 = var4;
              break L0;
            }
          }
          L2: {
            if (param0 >= 0) {
              break L2;
            } else {
              param0 = 0;
              if (var5 != 0) {
                break L2;
              } else {
                this.field_ub = param2;
                this.field_Ab = param0;
                return;
              }
            }
          }
          if (param0 <= var4) {
            this.field_ub = param2;
            this.field_Ab = param0;
            return;
          } else {
            param0 = var4;
            this.field_ub = param2;
            this.field_Ab = param0;
            return;
          }
        } else {
          L3: {
            L4: {
              discarded$1 = this.b(-116, -81);
              var4 = this.field_wb.length();
              if (-1 >= (param2 ^ -1)) {
                break L4;
              } else {
                param2 = 0;
                if (var5 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (var4 >= param2) {
              break L3;
            } else {
              param2 = var4;
              break L3;
            }
          }
          if (param0 < 0) {
            param0 = 0;
            if (var5 != 0) {
              L5: {
                if (param0 > var4) {
                  param0 = var4;
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_ub = param2;
              this.field_Ab = param0;
              return;
            } else {
              this.field_ub = param2;
              this.field_Ab = param0;
              return;
            }
          } else {
            L6: {
              if (param0 > var4) {
                param0 = var4;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_ub = param2;
            this.field_Ab = param0;
            return;
          }
        }
    }

    private final void i(byte param0) {
        int discarded$5 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var2 = 0;
        int var3 = 0;
        String var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > -119) {
          L0: {
            discarded$5 = this.j(-109);
            if (this.field_ub == this.field_Ab) {
              break L0;
            } else {
              L1: {
                if (this.field_Ab < this.field_ub) {
                  stackOut_13_0 = this.field_Ab;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = this.field_ub;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (this.field_ub > this.field_Ab) {
                  stackOut_16_0 = this.field_ub;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = this.field_Ab;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              this.field_Ab = var2;
              this.field_ub = var2;
              var5 = this.field_wb.toString().substring(var3, this.field_wb.length());
              discarded$6 = ana.a(var2, ' ', -11, this.field_wb);
              discarded$7 = this.field_wb.append(var5);
              this.field_Cb.field_r = this.field_wb.toString();
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_ub == this.field_Ab) {
              break L3;
            } else {
              L4: {
                if (this.field_Ab < this.field_ub) {
                  stackOut_4_0 = this.field_Ab;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = this.field_ub;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (this.field_ub > this.field_Ab) {
                  stackOut_7_0 = this.field_ub;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = this.field_Ab;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              this.field_Ab = var2;
              this.field_ub = var2;
              var6 = this.field_wb.toString().substring(var3, this.field_wb.length());
              discarded$8 = ana.a(var2, ' ', -11, this.field_wb);
              discarded$9 = this.field_wb.append(var6);
              this.field_Cb.field_r = this.field_wb.toString();
              break L3;
            }
          }
          return;
        }
    }

    final void d(byte param0) {
        StringBuilder discarded$2 = null;
        if (param0 > -84) {
          return;
        } else {
          discarded$2 = ana.a(0, ' ', -11, this.field_wb);
          this.field_Ab = 0;
          this.field_ub = 0;
          this.field_Cb.field_r = this.field_wb.toString();
          return;
        }
    }

    final static void h(int param0) {
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (lca.a(false)) {
              discarded$14 = wu.field_a.a(sc.field_k, true, oqa.field_w, param0 ^ -11);
              wu.field_a.g((byte) -128);
              L1: while (true) {
                L2: {
                  L3: {
                    if (!es.a(true)) {
                      break L3;
                    } else {
                      discarded$15 = wu.field_a.a((byte) -53, fna.field_h, kda.field_td);
                      if (var2 != 0) {
                        break L2;
                      } else {
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == 100) {
                    break L2;
                  } else {
                    field_zb = (int[]) null;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L4: {
                if (dq.field_f == null) {
                  break L4;
                } else {
                  if (!dq.field_f.field_b) {
                    break L4;
                  } else {
                    og.b(0);
                    wu.field_a.c(new gga(wu.field_a, or.field_j), 122);
                    break L4;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_ub != 0) {
          var2 = this.field_ub + -1;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              stackOut_5_0 = up.a(this.field_wb.charAt(var2 - 1), true);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var4 == 0) {
                if (!stackIn_7_0) {
                  var2--;
                  continue L0;
                } else {
                  var3 = 59 / ((74 - param0) / 41);
                  return var2;
                }
              } else {
                var3 = stackIn_6_0 ? 1 : 0;
                return var2;
              }
            } else {
              var3 = 59 / ((74 - param0) / 41);
              return var2;
            }
          }
        } else {
          return this.field_ub;
        }
    }

    final void a(fia param0, byte param1) {
        try {
            this.field_Bb = param0;
            int var3_int = 85 / ((param1 - -26) / 51);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        if (param0 == 100) {
          if (this.field_Bb == null) {
            return;
          } else {
            this.field_Db = this.field_Bb.b(param0 + 25);
            return;
          }
        } else {
          this.field_Gb = -61;
          if (this.field_Bb == null) {
            return;
          } else {
            this.field_Db = this.field_Bb.b(param0 + 25);
            return;
          }
        }
    }

    private final void f(int param0) {
        try {
            naa discarded$4 = null;
            naa discarded$5 = null;
            String var2 = null;
            java.awt.datatransfer.StringSelection var3 = null;
            if (this.field_Bb == null) {
              return;
            } else {
              var2 = this.f((byte) -107);
              if (var2.length() != 0) {
                var3 = new java.awt.datatransfer.StringSelection(this.f((byte) -89));
                if (param0 != 82) {
                  this.field_wb = (StringBuilder) null;
                  discarded$4 = this.field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) ((Object) var3));
                  return;
                } else {
                  discarded$5 = this.field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) ((Object) var3));
                  return;
                }
              } else {
                return;
              }
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
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -76) {
          L0: {
            discarded$1 = this.g((byte) 84);
            var2 = this.field_wb.toString();
            if (this.field_Ab < this.field_ub) {
              stackOut_10_0 = this.field_Ab;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_ub;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            if (this.field_ub > this.field_Ab) {
              stackOut_13_0 = this.field_ub;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = this.field_Ab;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var4 = stackIn_14_0;
          return var2.substring(var3, var4);
        } else {
          L2: {
            var2 = this.field_wb.toString();
            if (this.field_Ab < this.field_ub) {
              stackOut_3_0 = this.field_Ab;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = this.field_ub;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            if (this.field_ub > this.field_Ab) {
              stackOut_6_0 = this.field_ub;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = this.field_Ab;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var4 = stackIn_7_0;
          return var2.substring(var3, var4);
        }
    }

    final int j(int param0) {
        if (param0 != -1320) {
            return 58;
        }
        return this.field_ub;
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 > -33) {
            return;
        }
        field_zb = null;
    }

    private sw(long param0, jea param1, jea param2, jea param3, int param4) {
        super(param0, param1);
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        StringBuilder stackIn_2_2 = null;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        StringBuilder stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        StringBuilder stackOut_1_1 = null;
        StringBuilder stackOut_1_2 = null;
        Object stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        StringBuilder stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        StringBuilder stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (0 == (this.field_Ib ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = null;
                stackOut_3_2 = null;
                stackOut_3_3 = 256;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = null;
                stackOut_2_2 = null;
                stackOut_2_3 = this.field_Ib;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
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
            stackOut_6_0 = (RuntimeException) (var7);
            stackOut_6_1 = new StringBuilder().append("sw.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
            this.field_wb.setLength(0);
            var3_int = param1.length();
            if (this.field_Ib != -1) {
                if (var3_int > this.field_Ib) {
                    var3_int = this.field_Ib;
                }
            }
            if (param0 < 0) {
                this.field_Ib = 96;
            }
            discarded$0 = this.field_wb.append(param1.substring(0, var3_int));
            dupTemp$1 = this.field_wb.length();
            this.field_Ab = dupTemp$1;
            this.field_ub = dupTemp$1;
            this.field_Cb.field_r = this.field_wb.toString();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        int var4 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == -19696) {
          L0: {
            if (param2 == 60) {
              break L0;
            } else {
              if (param2 == 62) {
                break L0;
              } else {
                if (param2 >= 32) {
                  if (param2 <= 126) {
                    L1: {
                      if (this.field_Ab != this.field_ub) {
                        this.i((byte) -124);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (this.field_Ib == -1) {
                        L3: {
                          if (this.field_ub == this.field_wb.length()) {
                            break L3;
                          } else {
                            var7 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
                            discarded$8 = ana.a(this.field_ub, ' ', -11, this.field_wb);
                            discarded$9 = this.field_wb.append(param2);
                            discarded$10 = this.field_wb.append(var7);
                            if (!TombRacer.field_G) {
                              this.field_Cb.field_r = this.field_wb.toString();
                              this.field_ub = this.field_ub + 1;
                              this.field_Ab = this.field_ub;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        discarded$11 = this.field_wb.append(param2);
                        this.field_Cb.field_r = this.field_wb.toString();
                        this.field_ub = this.field_ub + 1;
                        this.field_Ab = this.field_ub;
                        return true;
                      } else {
                        if (this.field_wb.length() >= this.field_Ib) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              if (this.field_ub == this.field_wb.length()) {
                                break L5;
                              } else {
                                var6 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
                                discarded$12 = ana.a(this.field_ub, ' ', -11, this.field_wb);
                                discarded$13 = this.field_wb.append(param2);
                                discarded$14 = this.field_wb.append(var6);
                                if (!TombRacer.field_G) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            discarded$15 = this.field_wb.append(param2);
                            break L4;
                          }
                          this.field_Cb.field_r = this.field_wb.toString();
                          this.field_ub = this.field_ub + 1;
                          this.field_Ab = this.field_ub;
                          return true;
                        }
                      }
                    }
                    return true;
                  } else {
                    L6: {
                      if (85 == param0) {
                        if (this.field_Ab != this.field_ub) {
                          this.i((byte) -120);
                          return true;
                        } else {
                          if ((this.field_ub ^ -1) < -1) {
                            this.field_Ab = this.field_ub + -1;
                            this.i((byte) -125);
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        if (101 != param0) {
                          if (-14 != (param0 ^ -1)) {
                            if (96 != param0) {
                              if (-98 != (param0 ^ -1)) {
                                if ((param0 ^ -1) != -103) {
                                  if (-104 != (param0 ^ -1)) {
                                    L7: {
                                      if (!oj.field_tb[82]) {
                                        break L7;
                                      } else {
                                        if ((param0 ^ -1) != -66) {
                                          break L7;
                                        } else {
                                          this.k(param1 ^ 19666);
                                          return true;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (!oj.field_tb[82]) {
                                        break L8;
                                      } else {
                                        if (-67 != (param0 ^ -1)) {
                                          break L8;
                                        } else {
                                          this.f(82);
                                          return true;
                                        }
                                      }
                                    }
                                    if (oj.field_tb[82]) {
                                      if (67 == param0) {
                                        this.g(100);
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.d(param1 ^ -1070, this.field_wb.length());
                                    return true;
                                  }
                                } else {
                                  this.d(param1 + 38322, 0);
                                  return true;
                                }
                              } else {
                                if (this.field_ub < this.field_wb.length()) {
                                  L9: {
                                    if (!oj.field_tb[82]) {
                                      stackOut_81_0 = this.field_ub + 1;
                                      stackIn_82_0 = stackOut_81_0;
                                      break L9;
                                    } else {
                                      stackOut_80_0 = this.g((byte) 50);
                                      stackIn_82_0 = stackOut_80_0;
                                      break L9;
                                    }
                                  }
                                  var4 = stackIn_82_0;
                                  this.d(18626, var4);
                                  return true;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              if (0 >= this.field_ub) {
                                return false;
                              } else {
                                L10: {
                                  if (oj.field_tb[82]) {
                                    stackOut_72_0 = this.j((byte) -92);
                                    stackIn_73_0 = stackOut_72_0;
                                    break L10;
                                  } else {
                                    stackOut_71_0 = -1 + this.field_ub;
                                    stackIn_73_0 = stackOut_71_0;
                                    break L10;
                                  }
                                }
                                var4 = stackIn_73_0;
                                this.d(18626, var4);
                                return true;
                              }
                            }
                          } else {
                            this.d((byte) -95);
                            return true;
                          }
                        } else {
                          if (this.field_Ab == this.field_ub) {
                            if (this.field_ub >= this.field_wb.length()) {
                              return false;
                            } else {
                              this.field_Ab = 1 + this.field_ub;
                              this.i((byte) -124);
                              return true;
                            }
                          } else {
                            this.i((byte) -124);
                            return true;
                          }
                        }
                      }
                    }
                    return false;
                  }
                } else {
                  if (85 == param0) {
                    if (this.field_Ab == this.field_ub) {
                      if ((this.field_ub ^ -1) < -1) {
                        this.field_Ab = this.field_ub + -1;
                        this.i((byte) -125);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.i((byte) -120);
                      return true;
                    }
                  } else {
                    if (101 != param0) {
                      if (-14 != (param0 ^ -1)) {
                        if (96 != param0) {
                          if (-98 != (param0 ^ -1)) {
                            if ((param0 ^ -1) != -103) {
                              if (-104 != (param0 ^ -1)) {
                                L11: {
                                  if (!oj.field_tb[82]) {
                                    break L11;
                                  } else {
                                    if ((param0 ^ -1) != -66) {
                                      break L11;
                                    } else {
                                      this.k(param1 ^ 19666);
                                      return true;
                                    }
                                  }
                                }
                                L12: {
                                  if (!oj.field_tb[82]) {
                                    break L12;
                                  } else {
                                    if (-67 != (param0 ^ -1)) {
                                      break L12;
                                    } else {
                                      this.f(82);
                                      return true;
                                    }
                                  }
                                }
                                if (oj.field_tb[82]) {
                                  if (67 == param0) {
                                    this.g(100);
                                    return true;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                this.d(param1 ^ -1070, this.field_wb.length());
                                return true;
                              }
                            } else {
                              this.d(param1 + 38322, 0);
                              return true;
                            }
                          } else {
                            if (this.field_ub >= this.field_wb.length()) {
                              return false;
                            } else {
                              L13: {
                                if (!oj.field_tb[82]) {
                                  stackOut_29_0 = this.field_ub + 1;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L13;
                                } else {
                                  stackOut_28_0 = this.g((byte) 50);
                                  stackIn_30_0 = stackOut_28_0;
                                  break L13;
                                }
                              }
                              var4 = stackIn_30_0;
                              this.d(18626, var4);
                              return true;
                            }
                          }
                        } else {
                          if (0 < this.field_ub) {
                            L14: {
                              if (oj.field_tb[82]) {
                                stackOut_22_0 = this.j((byte) -92);
                                stackIn_23_0 = stackOut_22_0;
                                break L14;
                              } else {
                                stackOut_21_0 = -1 + this.field_ub;
                                stackIn_23_0 = stackOut_21_0;
                                break L14;
                              }
                            }
                            var4 = stackIn_23_0;
                            this.d(18626, var4);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        this.d((byte) -95);
                        return true;
                      }
                    } else {
                      if (this.field_Ab == this.field_ub) {
                        if (this.field_ub < this.field_wb.length()) {
                          this.field_Ab = 1 + this.field_ub;
                          this.i((byte) -124);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        this.i((byte) -124);
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          return true;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 == 6) {
          var2 = param0;
          if (-2 != (var2 ^ -1)) {
            if (2 != var2) {
              if (3 != var2) {
                if (-8 == (var2 ^ -1)) {
                  return 1;
                } else {
                  if (var2 != 6) {
                    if (var2 == 5) {
                      return 3;
                    } else {
                      return param0;
                    }
                  } else {
                    if (var3 == 0) {
                      return 2;
                    } else {
                      if (var2 == 5) {
                        return 3;
                      } else {
                        return param0;
                      }
                    }
                  }
                }
              } else {
                if (var3 != 0) {
                  if (-8 != (var2 ^ -1)) {
                    if (var2 != 6) {
                      if (var2 == 5) {
                        return 3;
                      } else {
                        return param0;
                      }
                    } else {
                      if (var2 == 5) {
                        return 3;
                      } else {
                        return param0;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            } else {
              if (var3 != 0) {
                if (3 != var2) {
                  if (-8 != (var2 ^ -1)) {
                    if (var2 != 6) {
                      if (var2 != 5) {
                        return param0;
                      } else {
                        return 3;
                      }
                    } else {
                      if (var3 != 0) {
                        if (var2 == 5) {
                          return 3;
                        } else {
                          return param0;
                        }
                      } else {
                        return 2;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  if (-8 != (var2 ^ -1)) {
                    if (var2 != 6) {
                      if (var2 == 5) {
                        return 3;
                      } else {
                        return param0;
                      }
                    } else {
                      if (var2 == 5) {
                        return 3;
                      } else {
                        return param0;
                      }
                    }
                  } else {
                    return 1;
                  }
                }
              } else {
                return 6;
              }
            }
          } else {
            if (var3 != 0) {
              if (2 == var2) {
                if (var3 != 0) {
                  if (3 == var2) {
                    if (var3 != 0) {
                      if (-8 != (var2 ^ -1)) {
                        if (var2 != 6) {
                          if (var2 == 5) {
                            return 3;
                          } else {
                            return param0;
                          }
                        } else {
                          if (var2 == 5) {
                            return 3;
                          } else {
                            return param0;
                          }
                        }
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (-8 != (var2 ^ -1)) {
                      L0: {
                        if (var2 != 6) {
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      if (var2 != 5) {
                        return param0;
                      } else {
                        return 3;
                      }
                    } else {
                      return 1;
                    }
                  }
                } else {
                  return 6;
                }
              } else {
                L1: {
                  if (3 != var2) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (-8 != (var2 ^ -1)) {
                  L2: {
                    if (var2 != 6) {
                      break L2;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        return 2;
                      }
                    }
                  }
                  if (var2 != 5) {
                    return param0;
                  } else {
                    return 3;
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 7;
            }
          }
        } else {
          return 65;
        }
    }

    private final void d(int param0, int param1) {
        this.field_ub = param1;
        if (param0 != 18626) {
          L0: {
            this.a(83, (byte) 112, 70);
            if (!oj.field_tb[81]) {
              this.field_Ab = this.field_ub;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!oj.field_tb[81]) {
              this.field_Ab = this.field_ub;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void k(byte param0) {
        ta.field_ub = null;
        gca.field_g = null;
        mma.field_b = null;
        rl.field_t = null;
        df.field_J = null;
        ola.field_Ib = null;
        koa.field_b = null;
        int var1 = -56 % ((6 - param0) / 33);
        mh.field_F = null;
        jna.field_j = null;
        jma.field_a = null;
        qi.field_O = null;
        System.gc();
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_7_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 > 3) {
          var2 = this.field_wb.length();
          if (this.field_ub != var2) {
            var3 = 1 + this.field_ub;
            L0: while (true) {
              if (var2 > var3) {
                stackOut_19_0 = up.a(this.field_wb.charAt(var3 - 1), true);
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var4 == 0) {
                  if (!stackIn_21_0) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_20_0 ? 1 : 0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_ub;
          }
        } else {
          this.field_tb = true;
          var2 = this.field_wb.length();
          if (this.field_ub != var2) {
            var3 = 1 + this.field_ub;
            L1: while (true) {
              if (var2 > var3) {
                stackOut_7_0 = up.a(this.field_wb.charAt(var3 - 1), true);
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if (!stackIn_9_0) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_8_0 ? 1 : 0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_ub;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        String discarded$0 = null;
        this.a(param0, param3, -23776, param2, param4);
        this.field_Cb.a(param0, param3, -23776, 0, 0);
        this.field_Eb.a(param0, param3, -23776, 0, 0);
        this.field_Gb = param3 + -4;
        if (param1 < 101) {
            discarded$0 = this.e((byte) 103);
        }
    }

    private final int b(int param0, int param1) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        var4 = 0;
        if (param0 == -2) {
          var5 = this.field_wb.length();
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= param1) {
                  break L2;
                } else {
                  stackOut_4_0 = var3;
                  stackIn_8_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (stackIn_5_0 >= var5) {
                      break L2;
                    } else {
                      incrementValue$4 = var3;
                      var3++;
                      var4 = var4 + this.field_Cb.field_H.a(this.field_wb.charAt(incrementValue$4));
                      continue L0;
                    }
                  }
                }
              }
              stackOut_7_0 = var3;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            return stackIn_8_0;
          }
        } else {
          this.d((byte) -86);
          var5 = this.field_wb.length();
          L3: while (true) {
            L4: {
              L5: {
                if (var4 >= param1) {
                  break L5;
                } else {
                  stackOut_11_0 = var3;
                  stackIn_15_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    if (stackIn_12_0 >= var5) {
                      break L5;
                    } else {
                      incrementValue$5 = var3;
                      var3++;
                      var4 = var4 + this.field_Cb.field_H.a(this.field_wb.charAt(incrementValue$5));
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = var3;
              stackIn_15_0 = stackOut_14_0;
              break L4;
            }
            return stackIn_15_0;
          }
        }
    }

    final String e(byte param0) {
        if (param0 >= -99) {
            this.field_ub = -43;
            return this.field_wb.toString();
        }
        return this.field_wb.toString();
    }

    static {
        field_Fb = "Open in popup window";
        field_zb = new int[]{1, 200, 300, 1000, 200, 500, 300, 100, 200, 300, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 500, 500, 300, 300, 100, 200, 300, 100, 100, 200, 300, 500, 300, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }
}
