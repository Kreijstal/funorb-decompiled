/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
            return;
        }
        try {
            param3.a((byte) -49, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "th.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_34_0 = 0;
        ei stackIn_42_0 = null;
        ei stackIn_43_0 = null;
        ei stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ei stackIn_51_0 = null;
        ei stackIn_52_0 = null;
        ei stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        ei stackOut_41_0 = null;
        ei stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        ei stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ei stackOut_50_0 = null;
        ei stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        ei stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_B) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    L3: {
                      if (this.field_u > 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_r == null) {
                            break L4;
                          } else {
                            this.field_o.e(-398);
                            break L4;
                          }
                        }
                        this.field_r = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          this.field_o.a(false, 64, param0);
                          this.a((byte) 64, param1, param5, this.field_o);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_F != null) {
                        this.field_C.e(-398);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_F = param0;
                    if (param0 != null) {
                      this.field_C.a(false, param2 + 524395, param0);
                      this.a((byte) 87, param1, param5, this.field_C);
                      break L2;
                    } else {
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
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param3) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L6;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L6;
              }
            }
            ((th) (this)).field_B = stackIn_20_1 != 0;
            if (param0 != this.field_F) {
              if (param0 != this.field_r) {
                L7: {
                  if (param2 == -524289) {
                    break L7;
                  } else {
                    this.field_r = (wk) null;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    if (null != this.field_F) {
                      break L9;
                    } else {
                      var7_int = 1;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (this.field_r == null) {
                      break L10;
                    } else {
                      L11: {
                        if ((this.field_E ^ -1) <= -524289) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L11;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L11;
                        }
                      }
                      var7_int = stackIn_34_0;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var7_int = 0;
                  break L8;
                }
                L12: {
                  L13: {
                    if (var7_int != 0) {
                      break L13;
                    } else {
                      L14: {
                        if (this.field_r != null) {
                          this.field_o.e(-398);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        this.field_r = param0;
                        if (param0 == null) {
                          break L15;
                        } else {
                          L16: {
                            stackOut_41_0 = this.field_o;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (param3) {
                              stackOut_43_0 = (ei) ((Object) stackIn_43_0);
                              stackOut_43_1 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L16;
                            } else {
                              stackOut_42_0 = (ei) ((Object) stackIn_42_0);
                              stackOut_42_1 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              break L16;
                            }
                          }
                          ((ei) (Object) stackIn_44_0).a(stackIn_44_1 != 0, param2 + 524353, param0);
                          this.a((byte) 104, param1, param5, this.field_o);
                          break L15;
                        }
                      }
                      this.field_u = -param4;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (this.field_F != null) {
                      this.field_C.e(-398);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    this.field_F = param0;
                    if (param0 == null) {
                      break L18;
                    } else {
                      L19: {
                        stackOut_50_0 = this.field_C;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_51_0 = stackOut_50_0;
                        if (param3) {
                          stackOut_52_0 = (ei) ((Object) stackIn_52_0);
                          stackOut_52_1 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          break L19;
                        } else {
                          stackOut_51_0 = (ei) ((Object) stackIn_51_0);
                          stackOut_51_1 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          break L19;
                        }
                      }
                      ((ei) (Object) stackIn_53_0).a(stackIn_53_1 != 0, 101, param0);
                      this.a((byte) 79, param1, param5, this.field_C);
                      break L18;
                    }
                  }
                  this.field_u = param4;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_u = -param4;
                this.a((byte) 57, param1, param5, this.field_o);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_u = param4;
              this.a((byte) 72, param1, param5, this.field_C);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) (var7);
            stackOut_56_1 = new StringBuilder().append("th.F(");
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L20;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L20;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        if (param0) {
            field_D = -86;
        }
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
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
        int stackIn_33_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (0 < this.field_x) {
              L1: {
                if (!this.field_B) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (-1 <= (this.field_u ^ -1)) {
                        break L3;
                      } else {
                        if (!this.field_C.d(31499)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (0 <= this.field_u) {
                      break L1;
                    } else {
                      if (!this.field_o.d(31499)) {
                        this.field_B = false;
                        this.field_u = -this.field_u;
                        this.field_r = null;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_F = null;
                  this.field_B = false;
                  this.field_u = -this.field_u;
                  break L1;
                }
              }
              L4: {
                var4_int = this.field_x * (this.field_E >> 439093676) / 256;
                var5 = this.field_x - var4_int;
                if (0 != this.field_u) {
                  L5: {
                    this.field_E = this.field_E + param2 * this.field_u;
                    if (this.field_E < 1048576) {
                      break L5;
                    } else {
                      this.field_E = 1048576;
                      if (this.field_B) {
                        break L4;
                      } else {
                        this.field_u = 0;
                        if (this.field_w) {
                          break L4;
                        } else {
                          L6: {
                            if (this.field_r == null) {
                              break L6;
                            } else {
                              this.field_o.e(-398);
                              break L6;
                            }
                          }
                          this.field_r = null;
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (0 >= this.field_E) {
                    this.field_E = 0;
                    if (!this.field_B) {
                      this.field_u = 0;
                      if (this.field_w) {
                        break L4;
                      } else {
                        L7: {
                          if (this.field_F != null) {
                            this.field_C.e(-398);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        this.field_F = null;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L8: {
                if (la.field_h) {
                  stackOut_32_0 = param2 << 1335842689;
                  stackIn_33_0 = stackOut_32_0;
                  break L8;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L8;
                }
              }
              L9: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_A ^ -1)) {
                  L10: {
                    if (this.field_F != null) {
                      break L10;
                    } else {
                      if (this.field_r != null) {
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
                      this.field_C.b(param0, param1, param2);
                      if (var11 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) == -257) {
                      break L12;
                    } else {
                      L13: {
                        L14: {
                          L15: {
                            if (this.field_q == null) {
                              break L15;
                            } else {
                              if (var6 <= this.field_q.length) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          this.field_p = new int[var6];
                          this.field_q = new int[var6];
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                        dm.a(this.field_q, 0, var6);
                        dm.a(this.field_p, 0, var6);
                        break L13;
                      }
                      L16: {
                        this.field_C.b(this.field_q, 0, param2);
                        this.field_o.b(this.field_p, 0, param2);
                        if (!la.field_h) {
                          stackOut_50_0 = param1;
                          stackIn_51_0 = stackOut_50_0;
                          break L16;
                        } else {
                          param1 = param1 << 1;
                          stackOut_49_0 = param1 << 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L16;
                        }
                      }
                      var7 = stackIn_51_0;
                      var8 = 0;
                      L17: while (true) {
                        if (var8 >= var6) {
                          if (var11 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_q[var8] + this.field_p[var8] * var5 >> 1604844392);
                          var8++;
                          if (var11 != 0) {
                            break L9;
                          } else {
                            continue L17;
                          }
                        }
                      }
                    }
                  }
                  this.field_o.b(param0, param1, param2);
                  break L9;
                } else {
                  break L9;
                }
              }
              L18: {
                if (this.field_y == null) {
                  break L18;
                } else {
                  if (this.field_A != 0) {
                    L19: {
                      L20: {
                        if (null == this.field_q) {
                          break L20;
                        } else {
                          if (this.field_q.length < var6) {
                            break L20;
                          } else {
                            dm.a(this.field_q, 0, var6);
                            if (var11 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      this.field_q = new int[var6];
                      this.field_p = new int[var6];
                      break L19;
                    }
                    L21: {
                      this.field_t.b(this.field_q, 0, param2);
                      if (la.field_h) {
                        param1 = param1 << 1;
                        stackOut_68_0 = param1 << 1;
                        stackIn_69_0 = stackOut_68_0;
                        break L21;
                      } else {
                        stackOut_67_0 = param1;
                        stackIn_69_0 = stackOut_67_0;
                        break L21;
                      }
                    }
                    var7 = stackIn_69_0;
                    var8 = this.field_A * this.field_x / 256;
                    var9 = -var8 + this.field_x;
                    var10 = 0;
                    L22: while (true) {
                      if (var6 <= var10) {
                        break L18;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_q[var10] * var8) >> 1513585096;
                        var10++;
                        if (var11 != 0) {
                          break L18;
                        } else {
                          continue L22;
                        }
                      }
                    }
                  } else {
                    break L18;
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
          L23: {
            var4 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var4);
            stackOut_75_1 = new StringBuilder().append("th.G(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L23;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L23;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        this.field_x = param0;
        if (param1 <= 2) {
            this.field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (this.field_E > 0) {
            if (this.field_F != null) {
              this.field_C.a(param0);
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 < (this.field_E ^ -1)) {
                if (this.field_r != null) {
                  this.field_o.a(param0);
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 < (this.field_E ^ -1)) {
              if (this.field_r != null) {
                this.field_o.a(param0);
                if (0 >= this.field_A) {
                  break L0;
                } else {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                }
              } else {
                if (0 < this.field_A) {
                  if (null == this.field_y) {
                    break L0;
                  } else {
                    this.field_t.a(param0);
                    break L0;
                  }
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (0 >= this.field_A) {
                break L0;
              } else {
                if (null != this.field_y) {
                  this.field_t.a(param0);
                  break L0;
                } else {
                  if (0 >= this.field_A) {
                    break L0;
                  } else {
                    if (null == this.field_y) {
                      break L0;
                    } else {
                      this.field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (!this.field_B) {
            break L1;
          } else {
            L2: {
              if (-1 <= (this.field_u ^ -1)) {
                break L2;
              } else {
                if (this.field_C.d(31499)) {
                  break L2;
                } else {
                  this.field_u = -this.field_u;
                  this.field_F = null;
                  this.field_B = false;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (this.field_u >= 0) {
              break L1;
            } else {
              if (!this.field_o.d(31499)) {
                this.field_B = false;
                this.field_r = null;
                this.field_u = -this.field_u;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (-1 == (this.field_u ^ -1)) {
            break L3;
          } else {
            L4: {
              this.field_E = this.field_E + param0 * this.field_u;
              if (1048576 <= this.field_E) {
                break L4;
              } else {
                if (this.field_E <= 0) {
                  this.field_E = 0;
                  if (!this.field_B) {
                    this.field_u = 0;
                    if (this.field_w) {
                      break L3;
                    } else {
                      L5: {
                        if (this.field_F != null) {
                          this.field_C.e(-398);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_F = null;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            this.field_E = 1048576;
            if (!this.field_B) {
              this.field_u = 0;
              if (this.field_w) {
                break L3;
              } else {
                L6: {
                  if (null == this.field_r) {
                    break L6;
                  } else {
                    this.field_o.e(-398);
                    break L6;
                  }
                }
                this.field_r = null;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
