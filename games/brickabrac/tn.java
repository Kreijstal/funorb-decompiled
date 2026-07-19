/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qd {
    private int field_s;
    static int[] field_n;
    private boolean field_E;
    static int field_C;
    private int[] field_q;
    private vm field_o;
    private int field_u;
    private vm field_r;
    private vm field_t;
    private ie field_D;
    private int field_p;
    private ie field_z;
    private int[] field_G;
    private int field_y;
    private ie field_x;
    static String field_B;
    private boolean field_v;
    static gq field_m;
    static volatile boolean field_A;
    static String field_w;

    final qd d() {
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
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (-1 <= (this.field_p ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_v) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_y <= 0) {
                      break L2;
                    } else {
                      if (this.field_D.d(-1)) {
                        break L2;
                      } else {
                        this.field_r = null;
                        this.field_v = false;
                        this.field_y = -this.field_y;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_y ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (this.field_x.d(-1)) {
                      break L1;
                    } else {
                      this.field_y = -this.field_y;
                      this.field_o = null;
                      this.field_v = false;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_s >> 1587168844) * this.field_p / 256;
                var5 = -var4_int + this.field_p;
                if (this.field_y == 0) {
                  break L3;
                } else {
                  this.field_s = this.field_s + this.field_y * param2;
                  if (1048576 > this.field_s) {
                    if ((this.field_s ^ -1) >= -1) {
                      this.field_s = 0;
                      if (!this.field_v) {
                        this.field_y = 0;
                        if (!this.field_E) {
                          L4: {
                            if (null == this.field_r) {
                              break L4;
                            } else {
                              this.field_D.f(-24774);
                              break L4;
                            }
                          }
                          this.field_r = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_s = 1048576;
                    if (this.field_v) {
                      break L3;
                    } else {
                      this.field_y = 0;
                      if (!this.field_E) {
                        L5: {
                          if (null != this.field_o) {
                            this.field_x.f(-24774);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_o = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!tj.field_g) {
                  stackOut_32_0 = param2;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2 << -1963262239;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_u ^ -1)) {
                  L8: {
                    if (this.field_r != null) {
                      break L8;
                    } else {
                      if (this.field_o == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (256 == var5) {
                      this.field_x.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_q == null) {
                            break L10;
                          } else {
                            if (var6 <= this.field_q.length) {
                              pm.a(this.field_q, 0, var6);
                              pm.a(this.field_G, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_G = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_D.b(this.field_q, 0, param2);
                        this.field_x.b(this.field_G, 0, param2);
                        if (!tj.field_g) {
                          stackOut_48_0 = param1;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_47_0 = param1 << 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_G[var8] + this.field_q[var8] * var4_int >> 845287688);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_D.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == this.field_t) {
                  break L13;
                } else {
                  if (this.field_u != 0) {
                    L14: {
                      L15: {
                        if (this.field_q == null) {
                          break L15;
                        } else {
                          if (this.field_q.length < var6) {
                            break L15;
                          } else {
                            pm.a(this.field_q, 0, var6);
                            break L14;
                          }
                        }
                      }
                      this.field_G = new int[var6];
                      this.field_q = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_z.b(this.field_q, 0, param2);
                      if (tj.field_g) {
                        param1 = param1 << 1;
                        stackOut_62_0 = param1 << 1;
                        stackIn_63_0 = stackOut_62_0;
                        break L16;
                      } else {
                        stackOut_61_0 = param1;
                        stackIn_63_0 = stackOut_61_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_63_0;
                    var8 = this.field_u * this.field_p / 256;
                    var9 = -var8 + this.field_p;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * this.field_q[var10] + param0[var7 - -var10] * var9 >> -1943340440;
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
            stackOut_67_0 = (RuntimeException) (var4);
            stackOut_67_1 = new StringBuilder().append("tn.D(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final qd a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (this.field_s > 0) {
            if (null != this.field_r) {
              this.field_D.a(param0);
              if (-1048577 >= (this.field_s ^ -1)) {
                break L0;
              } else {
                if (null == this.field_o) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            } else {
              if (-1048577 >= (this.field_s ^ -1)) {
                break L0;
              } else {
                if (null == this.field_o) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 >= (this.field_s ^ -1)) {
              break L0;
            } else {
              if (null == this.field_o) {
                break L0;
              } else {
                this.field_x.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (this.field_u <= 0) {
            break L1;
          } else {
            if (null != this.field_t) {
              this.field_z.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_v) {
            break L2;
          } else {
            L3: {
              if (-1 <= (this.field_y ^ -1)) {
                break L3;
              } else {
                if (!this.field_D.d(-1)) {
                  this.field_v = false;
                  this.field_r = null;
                  this.field_y = -this.field_y;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= this.field_y) {
              break L2;
            } else {
              if (!this.field_x.d(-1)) {
                this.field_v = false;
                this.field_y = -this.field_y;
                this.field_o = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (this.field_y == 0) {
            break L4;
          } else {
            this.field_s = this.field_s + param0 * this.field_y;
            if ((this.field_s ^ -1) > -1048577) {
              if (-1 > (this.field_s ^ -1)) {
                break L4;
              } else {
                this.field_s = 0;
                if (this.field_v) {
                  break L4;
                } else {
                  this.field_y = 0;
                  if (!this.field_E) {
                    L5: {
                      if (this.field_r == null) {
                        break L5;
                      } else {
                        this.field_D.f(-24774);
                        break L5;
                      }
                    }
                    this.field_r = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            } else {
              this.field_s = 1048576;
              if (this.field_v) {
                break L4;
              } else {
                this.field_y = 0;
                if (!this.field_E) {
                  L6: {
                    if (null == this.field_o) {
                      break L6;
                    } else {
                      this.field_x.f(-24774);
                      break L6;
                    }
                  }
                  this.field_o = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, int param4, vm param5) {
        int discarded$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        ie stackIn_41_0 = null;
        vm stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        ie stackIn_42_0 = null;
        vm stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        ie stackIn_43_0 = null;
        vm stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        ie stackIn_51_0 = null;
        vm stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        ie stackIn_52_0 = null;
        vm stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        ie stackIn_53_0 = null;
        vm stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
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
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ie stackOut_50_0 = null;
        vm stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        ie stackOut_52_0 = null;
        vm stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        ie stackOut_51_0 = null;
        vm stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        ie stackOut_40_0 = null;
        vm stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        ie stackOut_42_0 = null;
        vm stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        ie stackOut_41_0 = null;
        vm stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_v) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (0 < this.field_y) {
                      L3: {
                        if (null != this.field_r) {
                          this.field_D.f(-24774);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_r = param5;
                      if (param5 != null) {
                        this.field_D.a(param5, 127, false);
                        this.a(param0, false, this.field_D, param4);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_o == null) {
                          break L4;
                        } else {
                          this.field_x.f(-24774);
                          break L4;
                        }
                      }
                      this.field_o = param5;
                      if (param5 != null) {
                        this.field_x.a(param5, -66, false);
                        this.a(param0, false, this.field_x, param4);
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
              if (!param1) {
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
            ((tn) (this)).field_v = stackIn_20_1 != 0;
            if (param5 != this.field_r) {
              if (param5 != this.field_o) {
                L6: {
                  if (param3 == 22) {
                    break L6;
                  } else {
                    discarded$1 = this.b();
                    break L6;
                  }
                }
                L7: {
                  if (this.field_r == null) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null == this.field_o) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (this.field_s >= 524288) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L8;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (null != this.field_r) {
                        this.field_D.f(-24774);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_r = param5;
                      if (param5 != null) {
                        L12: {
                          stackOut_50_0 = this.field_D;
                          stackOut_50_1 = (vm) (param5);
                          stackOut_50_2 = 126;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          stackIn_52_2 = stackOut_50_2;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          stackIn_51_2 = stackOut_50_2;
                          if (param1) {
                            stackOut_52_0 = (ie) ((Object) stackIn_52_0);
                            stackOut_52_1 = (vm) ((Object) stackIn_52_1);
                            stackOut_52_2 = stackIn_52_2;
                            stackOut_52_3 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            stackIn_53_3 = stackOut_52_3;
                            break L12;
                          } else {
                            stackOut_51_0 = (ie) ((Object) stackIn_51_0);
                            stackOut_51_1 = (vm) ((Object) stackIn_51_1);
                            stackOut_51_2 = stackIn_51_2;
                            stackOut_51_3 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            stackIn_53_2 = stackOut_51_2;
                            stackIn_53_3 = stackOut_51_3;
                            break L12;
                          }
                        }
                        ((ie) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3 != 0);
                        this.a(param0, false, this.field_D, param4);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_y = param2;
                    break L9;
                  } else {
                    L13: {
                      if (this.field_o == null) {
                        break L13;
                      } else {
                        this.field_x.f(-24774);
                        break L13;
                      }
                    }
                    L14: {
                      this.field_o = param5;
                      if (param5 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_40_0 = this.field_x;
                          stackOut_40_1 = (vm) (param5);
                          stackOut_40_2 = 126;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          if (param1) {
                            stackOut_42_0 = (ie) ((Object) stackIn_42_0);
                            stackOut_42_1 = (vm) ((Object) stackIn_42_1);
                            stackOut_42_2 = stackIn_42_2;
                            stackOut_42_3 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            stackIn_43_2 = stackOut_42_2;
                            stackIn_43_3 = stackOut_42_3;
                            break L15;
                          } else {
                            stackOut_41_0 = (ie) ((Object) stackIn_41_0);
                            stackOut_41_1 = (vm) ((Object) stackIn_41_1);
                            stackOut_41_2 = stackIn_41_2;
                            stackOut_41_3 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            stackIn_43_3 = stackOut_41_3;
                            break L15;
                          }
                        }
                        ((ie) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3 != 0);
                        this.a(param0, false, this.field_x, param4);
                        break L14;
                      }
                    }
                    this.field_y = -param2;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_y = -param2;
                this.a(param0, false, this.field_x, param4);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_y = param2;
              this.a(param0, false, this.field_D, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) (var7);
            stackOut_56_1 = new StringBuilder().append("tn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param5 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L16;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ')');
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

    final synchronized int b() {
        return 2;
    }

    public static void c(int param0) {
        if (param0 > -18) {
            tn.c(-21);
        }
        field_B = null;
        field_m = null;
        field_n = null;
        field_w = null;
    }

    final synchronized void a(boolean param0, int param1) {
        int discarded$0 = 0;
        this.field_p = param1;
        if (!param0) {
            discarded$0 = this.b();
        }
    }

    private final void a(int param0, boolean param1, ie param2, int param3) {
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
              param2.e(param0, -1, 16);
              param2.b(param3, -606970073);
              if (!param1) {
                break L1;
              } else {
                this.field_E = false;
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
            stackOut_3_1 = new StringBuilder().append("tn.C(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        b.field_c = param1;
        if (param2 != 256) {
            return;
        }
        so.field_b = param0;
        ae.field_f = param3;
        pe.field_s = param4;
    }

    private tn() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_B = "Highscores";
        field_n = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 979869185));
            var4 = (long)((var0 << -1076818687) - 1);
            var3 = (int)(-32768L + (var6 * var6 >> 662387538));
            var2 = (int)(-32768L + (var4 * var4 >> 234206930));
            if (!(field_n.length > var3)) {
                var3 = -1 + field_n.length;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_n[var1] = var0;
            }
        }
        field_A = false;
        field_w = "Speed up: increases the speed of any ball in play.";
    }
}
