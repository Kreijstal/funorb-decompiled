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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("uh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var3;
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
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        hl stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        hl stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        hl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        hl stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
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
              stackIn_18_0 = this;

              if (!param2) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L6;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
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
                          stackIn_31_0 = 0;
                          break L10;
                        } else {
                          stackIn_31_0 = 1;
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
                              stackIn_42_0 = this.field_A;

                              stackIn_42_1 = 27;

                              if (param2) {
                                stackIn_43_0 = (hl) ((Object) stackIn_42_0);
                                stackIn_43_1 = stackIn_42_1;
                                stackIn_43_2 = 0;
                                break L15;
                              } else {
                                stackIn_43_0 = (hl) ((Object) stackIn_42_0);
                                stackIn_43_1 = stackIn_42_1;
                                stackIn_43_2 = 1;
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
                          stackIn_50_0 = this.field_s;

                          stackIn_50_1 = 46;

                          if (param2) {
                            stackIn_51_0 = (hl) ((Object) stackIn_50_0);
                            stackIn_51_1 = stackIn_50_1;
                            stackIn_51_2 = 0;
                            break L18;
                          } else {
                            stackIn_51_0 = (hl) ((Object) stackIn_50_0);
                            stackIn_51_1 = stackIn_50_1;
                            stackIn_51_2 = 1;
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
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L19;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
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
        if (param0 != 0) {
            this.b();
        }
        this.field_u = param1;
    }

    final static db a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        db stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        db stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -47) {
              if (nb.a(param1, param3, (byte) 127, param0)) {
                stackIn_7_0 = eb.a((byte) 27);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (db) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("uh.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((this.field_u ^ -1) < -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(param2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (!this.field_p) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 >= this.field_x) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_A.a((byte) -32)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_x = -this.field_x;
                        this.field_p = false;
                        this.field_B = null;
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_x >= 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!this.field_s.a((byte) -32)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_p = false;
                        this.field_t = null;
                        this.field_x = -this.field_x;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = (this.field_w >> -170141204) * this.field_u / 256;
                        var5 = -var4_int + this.field_u;
                        if (0 != this.field_x) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_w = this.field_w + param2 * this.field_x;
                        if (this.field_w >= 1048576) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 < this.field_w) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_w = 0;
                        if (!this.field_p) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_x = 0;
                        if (this.field_o) {
                            statePc = 29;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_B == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_A.d(false);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_B = null;
                        if (var11 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_w = 1048576;
                        if (this.field_p) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_x = 0;
                        if (!this.field_o) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == this.field_t) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_s.d(false);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_t = null;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!b.field_j) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = param2 << 958621377;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = param2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = stackIn_32_0;
                        if (-257 < (this.field_q ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null != this.field_B) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_t != null) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-257 != (var4_int ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_A.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5 != 256) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_s.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == this.field_y) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (this.field_y.length < var6) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        o.a(this.field_y, 0, var6);
                        o.a(this.field_r, 0, var6);
                        if (var11 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_r = new int[var6];
                        this.field_y = new int[var6];
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_A.b(this.field_y, 0, param2);
                        this.field_s.b(this.field_r, 0, param2);
                        if (!b.field_j) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1 = param1 << 1;
                        stackIn_51_0 = param1 << 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = param1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var7 = stackIn_51_0;
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var6 <= var8) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_y[var8] >> -534517816);
                        var8++;
                        if (var11 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var11 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (this.field_m == null) {
                            statePc = 76;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-1 == (this.field_q ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.field_y == null) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_y.length < var6) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        o.a(this.field_y, 0, var6);
                        if (var11 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_r = new int[var6];
                        this.field_y = new int[var6];
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_z.b(this.field_y, 0, param2);
                        if (b.field_j) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_66_0 = param1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param1 = param1 << 1;
                        stackIn_66_0 = param1 << 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var7 = stackIn_66_0;
                        var8 = this.field_u * this.field_q / 256;
                        var9 = this.field_u + -var8;
                        var10 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var6 <= var10) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_y[var10] * var8) >> 1607914824;
                        var10++;
                        if (var11 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var11 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var4);
                    stackIn_73_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("uh.I(");
                    stackIn_73_1 = stackIn_74_1;
                    if (param0 == null) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    throw ld.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 76: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
