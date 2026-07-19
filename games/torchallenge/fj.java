/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends qd {
    private int[] field_q;
    private kb field_B;
    private ej field_n;
    private int[] field_u;
    private boolean field_t;
    static int[] field_C;
    private int field_x;
    private int field_y;
    static boolean[][][] field_z;
    private boolean field_s;
    static int[] field_m;
    static int[] field_p;
    private int field_w;
    private ej field_r;
    private kb field_v;
    private kb field_D;
    private ej field_A;
    private int field_o;

    final static void b(byte param0) {
        qb.field_c = null;
        gi.field_c = false;
        if (param0 >= -102) {
            field_C = (int[]) null;
        }
        ji.field_n = null;
        qi.field_b = null;
        jl.field_c = null;
    }

    final qd c() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        this.field_y = param1;
        if (param0 >= -118) {
            this.field_D = (kb) null;
        }
    }

    private final void a(int param0, int param1, kb param2, int param3) {
        param2.a(-3262, param1, -1);
        if (param0 != 1553517424) {
            return;
        }
        try {
            param2.b((byte) 44, param3);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fj.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final qd b() {
        return null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >> 1553517424;
        int var4 = param1 & 65535;
        int var5 = param2 >> -67779504;
        if (param0 != 1870096848) {
            field_C = (int[]) null;
        }
        int var6 = 65535 & param2;
        return (var4 * var6 >> 1870096848) + var3 * param2 - -(var5 * var4);
    }

    final synchronized void a(int param0, int param1, int param2, boolean param3, int param4, ej param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        kb stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        ej stackIn_41_2 = null;
        kb stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        ej stackIn_42_2 = null;
        kb stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ej stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        kb stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        ej stackIn_50_2 = null;
        kb stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        ej stackIn_51_2 = null;
        kb stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        ej stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        kb stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        ej stackOut_49_2 = null;
        kb stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        ej stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        kb stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        ej stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        kb stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        ej stackOut_40_2 = null;
        kb stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ej stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        kb stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        ej stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if (0 >= this.field_x) {
                      L3: {
                        if (this.field_A == null) {
                          break L3;
                        } else {
                          this.field_v.b((byte) 31);
                          break L3;
                        }
                      }
                      this.field_A = param5;
                      if (param5 != null) {
                        this.field_v.a(param0 + -20174, param5, false);
                        this.a(param0 + 1553505376, param2, this.field_v, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_n != null) {
                          this.field_B.b((byte) 31);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_n = param5;
                      if (param5 != null) {
                        this.field_B.a(param0 ^ -12462, param5, false);
                        this.a(param0 + 1553505376, param2, this.field_B, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param3) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            ((fj) (this)).field_t = stackIn_20_1 != 0;
            if (param5 == this.field_n) {
              this.field_x = param4;
              this.a(1553517424, param2, this.field_B, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param5 != this.field_A) {
                L6: {
                  if (this.field_n != null) {
                    if (this.field_A != null) {
                      L7: {
                        if (-524289 >= (this.field_w ^ -1)) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L7;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  } else {
                    var7_int = 1;
                    break L6;
                  }
                }
                if (param0 == 12048) {
                  L8: {
                    if (var7_int == 0) {
                      L9: {
                        if (null != this.field_A) {
                          this.field_v.b((byte) 31);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        this.field_A = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_49_0 = this.field_v;
                            stackOut_49_1 = -8126;
                            stackOut_49_2 = (ej) (param5);
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            if (param3) {
                              stackOut_51_0 = (kb) ((Object) stackIn_51_0);
                              stackOut_51_1 = stackIn_51_1;
                              stackOut_51_2 = (ej) ((Object) stackIn_51_2);
                              stackOut_51_3 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              stackIn_52_2 = stackOut_51_2;
                              stackIn_52_3 = stackOut_51_3;
                              break L11;
                            } else {
                              stackOut_50_0 = (kb) ((Object) stackIn_50_0);
                              stackOut_50_1 = stackIn_50_1;
                              stackOut_50_2 = (ej) ((Object) stackIn_50_2);
                              stackOut_50_3 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              stackIn_52_2 = stackOut_50_2;
                              stackIn_52_3 = stackOut_50_3;
                              break L11;
                            }
                          }
                          ((kb) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_52_3 != 0);
                          this.a(1553517424, param2, this.field_v, param1);
                          break L10;
                        }
                      }
                      this.field_x = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (null == this.field_n) {
                          break L12;
                        } else {
                          this.field_B.b((byte) 31);
                          break L12;
                        }
                      }
                      L13: {
                        this.field_n = param5;
                        if (param5 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackOut_40_0 = this.field_B;
                            stackOut_40_1 = -8126;
                            stackOut_40_2 = (ej) (param5);
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            if (param3) {
                              stackOut_42_0 = (kb) ((Object) stackIn_42_0);
                              stackOut_42_1 = stackIn_42_1;
                              stackOut_42_2 = (ej) ((Object) stackIn_42_2);
                              stackOut_42_3 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              stackIn_43_2 = stackOut_42_2;
                              stackIn_43_3 = stackOut_42_3;
                              break L14;
                            } else {
                              stackOut_41_0 = (kb) ((Object) stackIn_41_0);
                              stackOut_41_1 = stackIn_41_1;
                              stackOut_41_2 = (ej) ((Object) stackIn_41_2);
                              stackOut_41_3 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_43_2 = stackOut_41_2;
                              stackIn_43_3 = stackOut_41_3;
                              break L14;
                            }
                          }
                          ((kb) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3 != 0);
                          this.a(1553517424, param2, this.field_B, param1);
                          break L13;
                        }
                      }
                      this.field_x = param4;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_x = -param4;
                this.a(1553517424, param2, this.field_v, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var7);
            stackOut_55_1 = new StringBuilder().append("fj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param5 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
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

    public static void b(boolean param0) {
        int discarded$0 = 0;
        field_z = (boolean[][][]) null;
        field_C = null;
        field_m = null;
        if (param0) {
            discarded$0 = fj.a(34, -118, -79);
        }
        field_p = null;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if ((this.field_w ^ -1) >= -1) {
            break L0;
          } else {
            if (null == this.field_n) {
              break L0;
            } else {
              this.field_B.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if ((this.field_w ^ -1) <= -1048577) {
            if (-1 <= (this.field_o ^ -1)) {
              break L1;
            } else {
              if (null == this.field_r) {
                break L1;
              } else {
                this.field_D.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= (this.field_o ^ -1)) {
              break L1;
            } else {
              if (null == this.field_r) {
                break L1;
              } else {
                this.field_D.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!this.field_t) {
            break L2;
          } else {
            L3: {
              if (-1 <= (this.field_x ^ -1)) {
                break L3;
              } else {
                if (!this.field_B.d(0)) {
                  this.field_t = false;
                  this.field_n = null;
                  this.field_x = -this.field_x;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 >= (this.field_x ^ -1)) {
              break L2;
            } else {
              if (!this.field_v.d(0)) {
                this.field_t = false;
                this.field_x = -this.field_x;
                this.field_A = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (this.field_x != 0) {
            this.field_w = this.field_w + param0 * this.field_x;
            if ((this.field_w ^ -1) <= -1048577) {
              this.field_w = 1048576;
              if (this.field_t) {
                break L4;
              } else {
                this.field_x = 0;
                if (this.field_s) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_A == null) {
                      break L5;
                    } else {
                      this.field_v.b((byte) 31);
                      break L5;
                    }
                  }
                  this.field_A = null;
                  break L4;
                }
              }
            } else {
              if (0 < this.field_w) {
                break L4;
              } else {
                this.field_w = 0;
                if (this.field_t) {
                  break L4;
                } else {
                  this.field_x = 0;
                  if (!this.field_s) {
                    L6: {
                      if (this.field_n == null) {
                        break L6;
                      } else {
                        this.field_B.b((byte) 31);
                        break L6;
                      }
                    }
                    this.field_n = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
          } else {
            break L4;
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
        int stackIn_35_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_y <= 0) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_t) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= this.field_x) {
                      break L2;
                    } else {
                      if (!this.field_B.d(0)) {
                        this.field_n = null;
                        this.field_t = false;
                        this.field_x = -this.field_x;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-1 >= (this.field_x ^ -1)) {
                    break L1;
                  } else {
                    if (!this.field_v.d(0)) {
                      this.field_x = -this.field_x;
                      this.field_A = null;
                      this.field_t = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = this.field_y * (this.field_w >> -449764788) / 256;
                var5 = -var4_int + this.field_y;
                if (this.field_x != 0) {
                  this.field_w = this.field_w + param2 * this.field_x;
                  if (-1048577 >= (this.field_w ^ -1)) {
                    this.field_w = 1048576;
                    if (!this.field_t) {
                      this.field_x = 0;
                      if (!this.field_s) {
                        L4: {
                          if (this.field_A != null) {
                            this.field_v.b((byte) 31);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_A = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (0 >= this.field_w) {
                      this.field_w = 0;
                      if (this.field_t) {
                        break L3;
                      } else {
                        this.field_x = 0;
                        if (this.field_s) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_n == null) {
                              break L5;
                            } else {
                              this.field_B.b((byte) 31);
                              break L5;
                            }
                          }
                          this.field_n = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (kh.field_g) {
                  stackOut_34_0 = param2 << 1182310017;
                  stackIn_35_0 = stackOut_34_0;
                  break L6;
                } else {
                  stackOut_33_0 = param2;
                  stackIn_35_0 = stackOut_33_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (-257 >= (this.field_o ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_n) {
                      break L8;
                    } else {
                      if (this.field_A == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (256 == var4_int) {
                    this.field_B.b(param0, param1, param2);
                    break L7;
                  } else {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (null == this.field_u) {
                            break L10;
                          } else {
                            if (var6 <= this.field_u.length) {
                              he.a(this.field_u, 0, var6);
                              he.a(this.field_q, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_u = new int[var6];
                        this.field_q = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_B.b(this.field_u, 0, param2);
                        this.field_v.b(this.field_q, 0, param2);
                        if (kh.field_g) {
                          param1 = param1 << 1;
                          stackOut_49_0 = param1 << 1;
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        } else {
                          stackOut_48_0 = param1;
                          stackIn_50_0 = stackOut_48_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var4_int + var5 * this.field_q[var8] >> -1248445688);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_v.b(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (null == this.field_r) {
                  break L13;
                } else {
                  if (0 != this.field_o) {
                    L14: {
                      L15: {
                        if (this.field_u == null) {
                          break L15;
                        } else {
                          if (var6 <= this.field_u.length) {
                            he.a(this.field_u, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_q = new int[var6];
                      this.field_u = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_D.b(this.field_u, 0, param2);
                      if (kh.field_g) {
                        param1 = param1 << 1;
                        stackOut_64_0 = param1 << 1;
                        stackIn_65_0 = stackOut_64_0;
                        break L16;
                      } else {
                        stackOut_63_0 = param1;
                        stackIn_65_0 = stackOut_63_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_65_0;
                    var8 = this.field_o * this.field_y / 256;
                    var9 = this.field_y + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var7 + var10] = this.field_u[var10] * var8 + var9 * param0[var10 + var7] >> 537284136;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var4);
            stackOut_69_1 = new StringBuilder().append("fj.E(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        field_C = new int[128];
        field_p = new int[2];
        field_z = new boolean[][][]{new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}, new boolean[][]{new boolean[]{false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, true, true, true, true, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, true, true, true, false}, new boolean[]{false, true, true, true, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}};
    }
}
