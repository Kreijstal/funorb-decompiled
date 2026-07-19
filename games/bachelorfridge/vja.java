/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vja extends ii {
    int field_q;
    boolean field_s;
    boolean field_r;
    int field_p;
    boolean field_n;
    eaa field_o;

    void a(byte param0, lu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pp var4 = null;
        int var5 = 0;
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
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= -12) {
                break L1;
              } else {
                this.field_p = -45;
                break L1;
              }
            }
            L2: {
              var3_int = this.field_q;
              if (!this.field_r) {
                break L2;
              } else {
                var3_int = var3_int | 128;
                break L2;
              }
            }
            L3: {
              if (!this.field_n) {
                break L3;
              } else {
                var3_int = var3_int | 64;
                break L3;
              }
            }
            L4: {
              if (!this.field_s) {
                break L4;
              } else {
                var3_int = var3_int | 32;
                break L4;
              }
            }
            param1.d(var3_int, 0);
            param1.d(this.field_p, 0);
            param1.d(this.field_o.g(0), 0);
            var4 = (pp) ((Object) this.field_o.b((byte) 90));
            L5: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var4.a(param1, (byte) -80);
                var4 = (pp) ((Object) this.field_o.c(0));
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("vja.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param0;
        if (0 != var2) {
          if (param1 > -31) {
            L0: {
              vja.a((byte) 40, true);
              if (var2 < 128) {
                break L0;
              } else {
                if ((var2 ^ -1) <= -161) {
                  break L0;
                } else {
                  L1: {
                    var3 = on.field_s[var2 - 128];
                    if (0 != var3) {
                      break L1;
                    } else {
                      var3 = 63;
                      break L1;
                    }
                  }
                  var2 = var3;
                  break L0;
                }
              }
            }
            return (char)var2;
          } else {
            L2: {
              if (var2 < 128) {
                break L2;
              } else {
                if ((var2 ^ -1) <= -161) {
                  break L2;
                } else {
                  L3: {
                    var3 = on.field_s[var2 - 128];
                    if (0 != var3) {
                      break L3;
                    } else {
                      var3 = 63;
                      break L3;
                    }
                  }
                  var2 = var3;
                  break L2;
                }
              }
            }
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    vja(int param0, nq param1, int param2, int param3, boolean param4, boolean param5, boolean param6) {
        super(1, param0, param1);
        try {
            this.field_n = param5 ? true : false;
            this.field_p = param3;
            this.field_r = param4 ? true : false;
            this.field_q = param2;
            this.field_s = param6 ? true : false;
            this.field_o = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vja.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        vla stackIn_5_0 = null;
        mv stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mv stackOut_6_0 = null;
        vla stackOut_4_0 = null;
        at stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 5) {
              if (4 != ((t) ((Object) al.a(-121, this.field_k))).field_p) {
                stackOut_6_0 = new mv(param1, (vja) (this));
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = new vla(param1, (vja) (this));
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (at) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("vja.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (at) ((Object) stackIn_5_0);
          } else {
            return (at) ((Object) stackIn_7_0);
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 < 84) {
          return;
        } else {
          L0: {
            if (null != jea.field_c) {
              dg.g(dg.field_f, dg.field_j, -dg.field_f + dg.field_h, dg.field_k + -dg.field_j);
              jea.field_c.a(param1, 7802);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    vja(int param0, lu param1) {
        super(1, param0, param1);
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
              var3_int = param1.b(16711935);
              this.field_q = 7 & var3_int;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 == (64 & var3_int ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vja) (this)).field_n = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if ((var3_int & 128) == 0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((vja) (this)).field_r = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((32 & var3_int) == 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((vja) (this)).field_s = stackIn_10_1 != 0;
            this.field_p = param1.b(16711935);
            this.field_o = new eaa();
            var4 = param1.b(16711935);
            L4: while (true) {
              var4--;
              if (var4 < 0) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param1), true);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("vja.<init>(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    void a(op param0, boolean param1) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var3 = null;
        pp var4 = null;
        int var5 = 0;
        aga var6_ref_aga = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lu var9 = null;
        aga var10 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var9 = (lu) null;
                this.a((byte) 108, (lu) null);
                break L1;
              }
            }
            var10 = this.field_l.a(20, param0);
            if (var10.i(55)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (0 != this.field_q) {
                  var10.field_s = this.field_q;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var4 = (pp) ((Object) this.field_o.b((byte) 90));
                var10.d(this.field_k, (byte) -94);
                if (this.field_r) {
                  break L3;
                } else {
                  if (!this.field_n) {
                    var5 = 0;
                    L4: while (true) {
                      if (var4 == null) {
                        L5: {
                          L6: {
                            if (0 == var5) {
                              break L6;
                            } else {
                              if (-69 == (this.field_k ^ -1)) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (this.field_k == 69) {
                            break L5;
                          } else {
                            if ((this.field_k ^ -1) == -71) {
                              break L5;
                            } else {
                              L7: {
                                var6 = ((t) ((Object) al.a(-67, this.field_k))).field_s;
                                if (-32 == (this.field_p ^ -1)) {
                                  var6 = 0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                discarded$3 = var10.a(var6, var10, (byte) 2);
                                return;
                              }
                            }
                          }
                        }
                        discarded$4 = var10.a(-var5, var10, (byte) 2);
                        return;
                      } else {
                        if (var4 instanceof iv) {
                          L8: {
                            var6_ref_aga = var4.field_h.a(91, param0);
                            if (!((iv) ((Object) var4)).field_j) {
                              L9: {
                                if (var6_ref_aga.a(13, (byte) -95)) {
                                  discarded$5 = var10.a(5, var6_ref_aga, (byte) 2);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var5 = var4.field_f;
                              if (var6_ref_aga.i(-120)) {
                                var5 = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          if (this instanceof hba) {
                            var7 = nn.a(var6_ref_aga, var10, (byte) 104);
                            ((iv) ((Object) var4)).a((byte) -21, var10, param0, var7);
                            var4 = (pp) ((Object) this.field_o.c(0));
                            continue L4;
                          } else {
                            ((iv) ((Object) var4)).a((byte) -66, var10, param0, this.field_q);
                            var4 = (pp) ((Object) this.field_o.c(0));
                            continue L4;
                          }
                        } else {
                          var4.a(var10, param0, 12);
                          var4 = (pp) ((Object) this.field_o.c(0));
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("vja.K(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
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

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -20) {
          if (!this.field_r) {
            if (!this.field_n) {
              if (this.field_s) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.field_s = false;
          if (!this.field_r) {
            if (this.field_n) {
              return true;
            } else {
              L0: {
                if (!this.field_s) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
