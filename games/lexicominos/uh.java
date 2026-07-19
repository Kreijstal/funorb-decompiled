/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends lk {
    hl field_s;
    int field_u;
    private ih field_t;
    private int field_w;
    hl field_A;
    private int[] field_r;
    private ih field_m;
    private int field_x;
    private ih field_B;
    private int[] field_y;
    private hl field_z;
    static java.util.zip.CRC32 field_v;
    private boolean field_o;
    private int field_q;
    private boolean field_p;
    static dg field_l;
    static int field_D;
    static uh field_n;
    static int[] field_C;

    final synchronized void a(byte param0, int param1, ih param2, int param3) {
        try {
            this.a(256, param3, false, param2, param1, (byte) 91);
            int var5_int = 83 / ((param0 - -55) / 51);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(hl param0, byte param1, hl param2) {
        if (param1 >= -66) {
            return;
        }
        try {
            this.field_A = param0;
            this.field_w = 1048576;
            this.field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, hl param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              param3.a(-1, param2, false);
              if (param0 > -88) {
                this.field_o = true;
                param3.b(-180, param1);
                break L1;
              } else {
                param3.b(-180, param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("uh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(sj param0, byte param1, int param2) {
        th var3 = null;
        if (param1 > -91) {
            return;
        }
        try {
            var3 = ed.field_q;
            var3.h(param2, 0);
            var3.c(5, -1);
            var3.c(0, -1);
            var3.e(91, param0.field_h);
            var3.c(param0.field_o, -1);
            var3.c(param0.field_m, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (0 >= this.field_w) {
            if (1048576 > this.field_w) {
              if (this.field_t == null) {
                break L0;
              } else {
                this.field_s.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_w) {
                break L0;
              } else {
                if (this.field_t == null) {
                  break L0;
                } else {
                  this.field_s.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 > this.field_w) {
              if (this.field_t == null) {
                break L0;
              } else {
                this.field_s.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_w) {
                break L0;
              } else {
                if (this.field_t == null) {
                  break L0;
                } else {
                  this.field_s.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if ((this.field_q ^ -1) >= -1) {
            break L1;
          } else {
            if (this.field_m != null) {
              this.field_z.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (this.field_p) {
            L3: {
              if (-1 <= (this.field_x ^ -1)) {
                break L3;
              } else {
                if (this.field_A.a((byte) -32)) {
                  break L3;
                } else {
                  this.field_x = -this.field_x;
                  this.field_B = null;
                  this.field_p = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if ((this.field_x ^ -1) <= -1) {
              break L2;
            } else {
              if (!this.field_s.a((byte) -32)) {
                this.field_t = null;
                this.field_x = -this.field_x;
                this.field_p = false;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (this.field_x != 0) {
            L5: {
              this.field_w = this.field_w + param0 * this.field_x;
              if (this.field_w < 1048576) {
                break L5;
              } else {
                this.field_w = 1048576;
                if (this.field_p) {
                  break L4;
                } else {
                  this.field_x = 0;
                  if (!this.field_o) {
                    L6: {
                      if (this.field_t == null) {
                        break L6;
                      } else {
                        this.field_s.d(false);
                        break L6;
                      }
                    }
                    this.field_t = null;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (0 < this.field_w) {
              break L4;
            } else {
              this.field_w = 0;
              if (!this.field_p) {
                this.field_x = 0;
                if (this.field_o) {
                  break L4;
                } else {
                  L7: {
                    if (null == this.field_B) {
                      break L7;
                    } else {
                      this.field_A.d(false);
                      break L7;
                    }
                  }
                  this.field_B = null;
                  break L4;
                }
              } else {
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
    }

    private final synchronized void a(int param0, int param1, boolean param2, ih param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        hl stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        hl stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        hl stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        hl stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        hl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        hl stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        hl stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        hl stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        hl stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        hl stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        hl stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        hl stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_p) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    L3: {
                      if (this.field_x > 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_t != null) {
                            this.field_s.d(false);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_t = param3;
                        if (param3 == null) {
                          break L2;
                        } else {
                          this.field_s.a(94, false, param3);
                          this.a(-101, param4, param0, this.field_s);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_B == null) {
                        break L5;
                      } else {
                        this.field_A.d(false);
                        break L5;
                      }
                    }
                    this.field_B = param3;
                    if (param3 == null) {
                      break L2;
                    } else {
                      this.field_A.a(34, false, param3);
                      this.a(-117, param4, param0, this.field_A);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param2) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            ((uh) (this)).field_p = stackIn_19_1 != 0;
            if (this.field_B != param3) {
              if (this.field_t != param3) {
                L7: {
                  L8: {
                    if (null == this.field_B) {
                      break L8;
                    } else {
                      L9: {
                        if (null != this.field_t) {
                          break L9;
                        } else {
                          var7_int = 0;
                          if (var8 == 0) {
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (524288 <= this.field_w) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L10;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          break L10;
                        }
                      }
                      var7_int = stackIn_31_0;
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var7_int = 1;
                  break L7;
                }
                if (param5 >= 89) {
                  L11: {
                    L12: {
                      if (var7_int == 0) {
                        break L12;
                      } else {
                        L13: {
                          if (null != this.field_B) {
                            this.field_A.d(false);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          this.field_B = param3;
                          if (param3 == null) {
                            break L14;
                          } else {
                            L15: {
                              stackOut_40_0 = this.field_A;
                              stackOut_40_1 = 27;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_42_1 = stackOut_40_1;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              if (param2) {
                                stackOut_42_0 = (hl) ((Object) stackIn_42_0);
                                stackOut_42_1 = stackIn_42_1;
                                stackOut_42_2 = 0;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                stackIn_43_2 = stackOut_42_2;
                                break L15;
                              } else {
                                stackOut_41_0 = (hl) ((Object) stackIn_41_0);
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = 1;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                stackIn_43_2 = stackOut_41_2;
                                break L15;
                              }
                            }
                            ((hl) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2 != 0, param3);
                            this.a(-124, param4, param0, this.field_A);
                            break L14;
                          }
                        }
                        this.field_x = param1;
                        if (var8 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L16: {
                      if (this.field_t == null) {
                        break L16;
                      } else {
                        this.field_s.d(false);
                        break L16;
                      }
                    }
                    L17: {
                      this.field_t = param3;
                      if (param3 == null) {
                        break L17;
                      } else {
                        L18: {
                          stackOut_48_0 = this.field_s;
                          stackOut_48_1 = 46;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (param2) {
                            stackOut_50_0 = (hl) ((Object) stackIn_50_0);
                            stackOut_50_1 = stackIn_50_1;
                            stackOut_50_2 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            break L18;
                          } else {
                            stackOut_49_0 = (hl) ((Object) stackIn_49_0);
                            stackOut_49_1 = stackIn_49_1;
                            stackOut_49_2 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            break L18;
                          }
                        }
                        ((hl) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2 != 0, param3);
                        this.a(-116, param4, param0, this.field_s);
                        break L17;
                      }
                    }
                    this.field_x = -param1;
                    break L11;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_x = -param1;
                this.a(-92, param4, param0, this.field_s);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_x = param1;
              this.a(-89, param4, param0, this.field_A);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var7);
            stackOut_54_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final lk b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            sj var2 = (sj) null;
            uh.a((sj) null, (byte) 38, -34);
        }
        field_l = null;
        field_C = null;
        field_n = null;
        field_v = null;
    }

    final lk d() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        lk discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.b();
        }
        this.field_u = param1;
    }

    final static db a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        db stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        db stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        db stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        db stackOut_1_0 = null;
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
            if (param2 < -47) {
              if (nb.a(param1, param3, (byte) 127, param0)) {
                stackOut_6_0 = eb.a((byte) 27);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (db) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("uh.K(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (db) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if ((this.field_u ^ -1) < -1) {
              L1: {
                if (!this.field_p) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= this.field_x) {
                      break L2;
                    } else {
                      if (this.field_A.a((byte) -32)) {
                        break L2;
                      } else {
                        this.field_x = -this.field_x;
                        this.field_p = false;
                        this.field_B = null;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (this.field_x >= 0) {
                    break L1;
                  } else {
                    if (!this.field_s.a((byte) -32)) {
                      this.field_p = false;
                      this.field_t = null;
                      this.field_x = -this.field_x;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_w >> -170141204) * this.field_u / 256;
                var5 = -var4_int + this.field_u;
                if (0 != this.field_x) {
                  L4: {
                    this.field_w = this.field_w + param2 * this.field_x;
                    if (this.field_w >= 1048576) {
                      break L4;
                    } else {
                      if (0 < this.field_w) {
                        break L3;
                      } else {
                        this.field_w = 0;
                        if (!this.field_p) {
                          this.field_x = 0;
                          if (this.field_o) {
                            break L3;
                          } else {
                            L5: {
                              if (this.field_B == null) {
                                break L5;
                              } else {
                                this.field_A.d(false);
                                break L5;
                              }
                            }
                            this.field_B = null;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.field_w = 1048576;
                  if (this.field_p) {
                    break L3;
                  } else {
                    this.field_x = 0;
                    if (!this.field_o) {
                      L6: {
                        if (null == this.field_t) {
                          break L6;
                        } else {
                          this.field_s.d(false);
                          break L6;
                        }
                      }
                      this.field_t = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L7: {
                if (!b.field_j) {
                  stackOut_31_0 = param2;
                  stackIn_32_0 = stackOut_31_0;
                  break L7;
                } else {
                  stackOut_30_0 = param2 << 958621377;
                  stackIn_32_0 = stackOut_30_0;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var6 = stackIn_32_0;
                  if (-257 < (this.field_q ^ -1)) {
                    L10: {
                      if (null != this.field_B) {
                        break L10;
                      } else {
                        if (this.field_t != null) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (-257 != (var4_int ^ -1)) {
                        break L11;
                      } else {
                        this.field_A.b(param0, param1, param2);
                        if (var11 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5 != 256) {
                        break L12;
                      } else {
                        this.field_s.b(param0, param1, param2);
                        if (var11 == 0) {
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (null == this.field_y) {
                          break L14;
                        } else {
                          if (this.field_y.length < var6) {
                            break L14;
                          } else {
                            o.a(this.field_y, 0, var6);
                            o.a(this.field_r, 0, var6);
                            if (var11 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      this.field_r = new int[var6];
                      this.field_y = new int[var6];
                      break L13;
                    }
                    L15: {
                      this.field_A.b(this.field_y, 0, param2);
                      this.field_s.b(this.field_r, 0, param2);
                      if (!b.field_j) {
                        stackOut_50_0 = param1;
                        stackIn_51_0 = stackOut_50_0;
                        break L15;
                      } else {
                        param1 = param1 << 1;
                        stackOut_49_0 = param1 << 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L15;
                      }
                    }
                    var7 = stackIn_51_0;
                    var8 = 0;
                    L16: while (true) {
                      if (var6 <= var8) {
                        break L9;
                      } else {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_y[var8] >> -534517816);
                        var8++;
                        if (var11 != 0) {
                          break L8;
                        } else {
                          continue L16;
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                if (this.field_m == null) {
                  break L8;
                } else {
                  if (-1 == (this.field_q ^ -1)) {
                    break L8;
                  } else {
                    L17: {
                      L18: {
                        if (this.field_y == null) {
                          break L18;
                        } else {
                          if (this.field_y.length < var6) {
                            break L18;
                          } else {
                            o.a(this.field_y, 0, var6);
                            if (var11 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      this.field_r = new int[var6];
                      this.field_y = new int[var6];
                      break L17;
                    }
                    L19: {
                      this.field_z.b(this.field_y, 0, param2);
                      if (b.field_j) {
                        param1 = param1 << 1;
                        stackOut_65_0 = param1 << 1;
                        stackIn_66_0 = stackOut_65_0;
                        break L19;
                      } else {
                        stackOut_64_0 = param1;
                        stackIn_66_0 = stackOut_64_0;
                        break L19;
                      }
                    }
                    var7 = stackIn_66_0;
                    var8 = this.field_u * this.field_q / 256;
                    var9 = this.field_u + -var8;
                    var10 = 0;
                    L20: while (true) {
                      if (var6 <= var10) {
                        break L8;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_y[var10] * var8) >> 1607914824;
                        var10++;
                        if (var11 != 0) {
                          break L8;
                        } else {
                          continue L20;
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) (var4);
            stackOut_72_1 = new StringBuilder().append("uh.I(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public uh() {
        this.field_u = 256;
        this.field_q = 0;
        this.field_o = false;
        hl var1 = new hl();
        this.a(var1, (byte) -72, new hl(var1));
    }

    final synchronized int a() {
        return 2;
    }

    static {
        field_v = new java.util.zip.CRC32();
        field_l = new dg();
        field_C = new int[4];
    }
}
