/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jw extends b implements cd, tsa {
    private rj field_y;
    private tra field_A;
    private boolean field_w;
    private String field_F;
    private rj field_E;
    private rj field_B;
    static int[] field_z;
    private boolean field_x;
    private boolean field_D;
    private tra field_C;

    jw(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (isa) null);
        jsa dupTemp$2 = null;
        jsa dupTemp$3 = null;
        RuntimeException var6 = null;
        td var6_ref = null;
        il var7 = null;
        String var8 = null;
        nl var9 = null;
        int var11 = 0;
        jsa var12 = null;
        jsa var13 = null;
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
        Object stackIn_16_0 = null;
        rj stackIn_16_1 = null;
        rj stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        rj stackIn_17_1 = null;
        rj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rj stackIn_18_1 = null;
        rj stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
        Object stackOut_15_0 = null;
        rj stackOut_15_1 = null;
        rj stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        rj stackOut_17_1 = null;
        rj stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        rj stackOut_16_1 = null;
        rj stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
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
              ((jw) (this)).field_w = stackIn_4_1 != 0;
              this.field_F = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
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
              ((jw) (this)).field_x = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
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
            L4: {
              ((jw) (this)).field_D = stackIn_10_1 != 0;
              if (!this.field_x) {
                break L4;
              } else {
                L5: {
                  if (this.field_D) {
                    break L5;
                  } else {
                    if (!this.field_w) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              L7: {
                this.field_A = (tra) ((Object) new so(param0, (qc) (this), 100));
                this.field_C = (tra) ((Object) new so("", (qc) (this), 20));
                if (this.field_x) {
                  break L7;
                } else {
                  L8: {
                    this.field_B = new rj(goa.field_c, (qc) null);
                    stackOut_15_0 = this;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    if (!this.field_w) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = null;
                      stackOut_17_2 = null;
                      stackOut_17_3 = sm.field_o;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      stackIn_18_3 = stackOut_17_3;
                      break L8;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = fca.field_d;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      break L8;
                    }
                  }
                  ((jw) (this)).field_y = new rj(stackIn_18_3, (qc) null);
                  if (!this.field_D) {
                    break L6;
                  } else {
                    this.field_E = new rj(foa.field_a, (qc) (this));
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_B = new rj(nga.field_q, (qc) null);
              this.field_y = new rj(nj.field_q, (qc) null);
              this.field_A.field_y = false;
              break L6;
            }
            L9: {
              this.field_A.field_r = (isa) ((Object) new hga(10000536));
              this.field_C.field_r = (isa) ((Object) new poa(10000536));
              var6_ref = new td();
              this.field_B.field_r = (isa) ((Object) var6_ref);
              if (this.field_y == null) {
                break L9;
              } else {
                this.field_y.field_r = (isa) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_A.field_q = kma.field_a;
              if (this.field_E == null) {
                break L10;
              } else {
                this.field_E.field_r = (isa) ((Object) var6_ref);
                break L10;
              }
            }
            L11: {
              if (null == this.field_E) {
                break L11;
              } else {
                this.field_E.field_q = hga.field_n;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!this.field_x) {
                  break L13;
                } else {
                  this.field_y.field_q = koa.field_c;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (!this.field_w) {
                  break L14;
                } else {
                  this.field_y.field_q = tg.field_a;
                  this.field_y.field_r = (isa) ((Object) new kaa());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              this.field_y.field_r = (isa) ((Object) new kaa());
              break L12;
            }
            L15: {
              this.field_n = 15;
              var7 = mj.field_J;
              if (null == this.field_F) {
                break L15;
              } else {
                this.field_n = this.field_n + (var7.a(this.field_F, this.field_m - 40, var7.field_w) + 5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = c.field_h;
                var9 = cc.a((byte) 122, di.a(28));
                if (vw.field_a != var9) {
                  break L17;
                } else {
                  var8 = daa.field_c;
                  if (var11 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (var9 != ub.field_d) {
                break L16;
              } else {
                var8 = ppa.field_a;
                break L16;
              }
            }
            L18: {
              dupTemp$2 = new jsa(10, this.field_n, -20 + this.field_m, 25, this.field_A, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(dupTemp$2, -1);
              this.field_n = this.field_n + (((ae) ((Object) var12)).field_p + 5);
              dupTemp$3 = new jsa(10, this.field_n, -20 + this.field_m, 25, this.field_C, false, 80, 3, var7, 16777215, rta.field_j);
              var13 = dupTemp$3;
              this.a(dupTemp$3, -1);
              this.field_n = this.field_n + (((ae) ((Object) var13)).field_p - -5);
              this.field_B.field_h = (qc) (this);
              if (this.field_E == null) {
                break L18;
              } else {
                this.field_E.field_h = (qc) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_y) {
                break L19;
              } else {
                this.field_y.field_h = (qc) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_E != null) {
                  break L21;
                } else {
                  this.field_B.a((byte) -31, -10 + (this.field_m + -6), 30, 8, this.field_n);
                  this.field_n = this.field_n + 35;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_B.a((byte) -31, this.field_m - 95, 30, 85, this.field_n);
              this.field_n = this.field_n + 60;
              break L20;
            }
            L22: {
              if (this.field_E == null) {
                break L22;
              } else {
                this.field_E.a((byte) -31, -10 + (this.field_m + -6), 30, 8, this.field_n);
                this.field_n = this.field_n + 35;
                break L22;
              }
            }
            L23: {
              if (this.field_y == null) {
                break L23;
              } else {
                L24: {
                  if (this.field_x) {
                    break L24;
                  } else {
                    if (this.field_w) {
                      break L24;
                    } else {
                      this.field_y.a((byte) -31, 40, 20, 8, this.field_n);
                      this.field_n = this.field_n + 25;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                this.field_y.a((byte) -31, -6 + this.field_m + -10, 30, 8, this.field_n);
                this.field_n = this.field_n + 35;
                break L23;
              }
            }
            L25: {
              this.a((byte) -31, this.field_m, 3 + this.field_n, 0, 0);
              this.a(this.field_B, -1);
              if (this.field_E == null) {
                break L25;
              } else {
                this.a(this.field_E, -1);
                break L25;
              }
            }
            L26: {
              if (null == this.field_y) {
                break L26;
              } else {
                this.a(this.field_y, -1);
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("jw.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L27;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L27;
            }
          }
          L28: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L28;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_z = null;
        int var1 = -9 % ((34 - param0) / 46);
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != this.field_B) {
                  break L2;
                } else {
                  this.i((byte) 85);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 != this.field_E) {
                  break L3;
                } else {
                  qfa.a((byte) 6);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param2 != this.field_y) {
                break L1;
              } else {
                L4: {
                  if (this.field_x) {
                    break L4;
                  } else {
                    L5: {
                      if (!this.field_w) {
                        break L5;
                      } else {
                        gqa.a((byte) 62);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    jga.b(50);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                eo.q(83);
                break L1;
              }
            }
            L6: {
              if (param4 > 44) {
                break L6;
              } else {
                var8 = (String) null;
                this.a((String) null, -88);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var6);
            stackOut_18_1 = new StringBuilder().append("jw.M(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(tra param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                field_z = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jw.U(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(String param0, int param1) {
        tra var3 = null;
        String var4 = null;
        try {
            var3 = this.field_A;
            var4 = param0;
            var3.a(false, -16719, var4);
            if (param1 < 121) {
                jw.c(-98);
            }
            this.field_C.f(-10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jw.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void i(byte param0) {
        if (param0 < 27) {
          return;
        } else {
          L0: {
            L1: {
              if (foa.a((byte) 91)) {
                break L1;
              } else {
                if (this.field_A.field_o.length() <= 0) {
                  break L0;
                } else {
                  if (this.field_C.field_o.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            rt.a(true, this.field_A.field_o, this.field_C.field_o);
            break L0;
          }
          return;
        }
    }

    final void a(byte param0) {
        if (param0 != -92) {
            this.field_w = false;
        }
        this.field_A.f(-121);
        this.field_C.f(param0 ^ 34);
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (-99 == (param2 ^ -1)) {
                stackOut_5_0 = this.b(param1, (byte) -81);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param2 ^ -1)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.a(param1, (byte) -9);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("jw.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (null != this.field_F) {
            discarded$0 = mj.field_J.a(this.field_F, param0 + (this.field_i + 20), param1 + this.field_n + 15, this.field_m + -40, this.field_p, 16777215, -1, 1, 0, mj.field_J.field_w);
        }
        if (!(this.field_E == null)) {
            bea.c(param0 - -10, param1 + 134, this.field_m - 20, 4210752);
        }
        super.a(param0, param1, param2 + param2, param3);
    }

    public final void a(int param0, tra param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -6038) {
                break L1;
              } else {
                this.field_A = (tra) null;
                break L1;
              }
            }
            L2: {
              if (this.field_A != param1) {
                break L2;
              } else {
                discarded$2 = this.field_C.a((ae) (this), false);
                break L2;
              }
            }
            L3: {
              if (param1 != this.field_C) {
                break L3;
              } else {
                this.i((byte) 60);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("jw.KA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final String a(int param0) {
        if (this.field_A.field_o == null) {
          return "";
        } else {
          L0: {
            if (param0 >= 29) {
              break L0;
            } else {
              this.a(-72, 15, 19, 125);
              break L0;
            }
          }
          return this.field_A.field_o;
        }
    }

    static {
        field_z = new int[]{99, 179, 108, 280, 219, 303, 398, 439, 500};
    }
}
