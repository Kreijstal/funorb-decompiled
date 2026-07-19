/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        try {
            param0.a(param2, param1, false);
            param0.a((byte) -116, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "w.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        gd stackIn_40_0 = null;
        ug stackIn_40_1 = null;
        gd stackIn_41_0 = null;
        ug stackIn_41_1 = null;
        gd stackIn_42_0 = null;
        ug stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        gd stackIn_49_0 = null;
        ug stackIn_49_1 = null;
        gd stackIn_50_0 = null;
        ug stackIn_50_1 = null;
        gd stackIn_51_0 = null;
        ug stackIn_51_1 = null;
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
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        gd stackOut_39_0 = null;
        ug stackOut_39_1 = null;
        gd stackOut_41_0 = null;
        ug stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        gd stackOut_40_0 = null;
        ug stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        gd stackOut_48_0 = null;
        ug stackOut_48_1 = null;
        gd stackOut_50_0 = null;
        ug stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        gd stackOut_49_0 = null;
        ug stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (0 >= this.field_q) {
                        break L3;
                      } else {
                        L4: {
                          if (null == this.field_p) {
                            break L4;
                          } else {
                            this.field_j.g(2);
                            break L4;
                          }
                        }
                        this.field_p = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          this.field_j.a(param0, false, 8361407);
                          this.a(this.field_j, -1, param3, param1);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_o == null) {
                        break L5;
                      } else {
                        this.field_v.g(2);
                        break L5;
                      }
                    }
                    this.field_o = param0;
                    if (param0 != null) {
                      this.field_v.a(param0, false, 8361407);
                      this.a(this.field_v, -1, param3, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L6: {
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!param2) {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L6;
              }
            }
            ((w) (this)).field_y = stackIn_18_1 != 0;
            if (param5) {
              if (this.field_p == param0) {
                this.field_q = param4;
                this.a(this.field_j, -1, param3, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param0 != this.field_o) {
                  L7: {
                    L8: {
                      if (this.field_p != null) {
                        break L8;
                      } else {
                        var7_int = 1;
                        if (var8 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (this.field_o != null) {
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
                      if (524288 <= this.field_s) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L10;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L10;
                      }
                    }
                    var7_int = stackIn_33_0;
                    break L7;
                  }
                  L11: {
                    L12: {
                      if (var7_int == 0) {
                        break L12;
                      } else {
                        L13: {
                          if (this.field_p == null) {
                            break L13;
                          } else {
                            this.field_j.g(2);
                            break L13;
                          }
                        }
                        L14: {
                          this.field_p = param0;
                          if (param0 != null) {
                            L15: {
                              stackOut_39_0 = this.field_j;
                              stackOut_39_1 = (ug) (param0);
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (param2) {
                                stackOut_41_0 = (gd) ((Object) stackIn_41_0);
                                stackOut_41_1 = (ug) ((Object) stackIn_41_1);
                                stackOut_41_2 = 0;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                break L15;
                              } else {
                                stackOut_40_0 = (gd) ((Object) stackIn_40_0);
                                stackOut_40_1 = (ug) ((Object) stackIn_40_1);
                                stackOut_40_2 = 1;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                break L15;
                              }
                            }
                            ((gd) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2 != 0, 8361407);
                            this.a(this.field_j, -1, param3, param1);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        this.field_q = param4;
                        if (var8 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L16: {
                      if (null == this.field_o) {
                        break L16;
                      } else {
                        this.field_v.g(2);
                        break L16;
                      }
                    }
                    L17: {
                      this.field_o = param0;
                      if (param0 != null) {
                        L18: {
                          stackOut_48_0 = this.field_v;
                          stackOut_48_1 = (ug) (param0);
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (param2) {
                            stackOut_50_0 = (gd) ((Object) stackIn_50_0);
                            stackOut_50_1 = (ug) ((Object) stackIn_50_1);
                            stackOut_50_2 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            break L18;
                          } else {
                            stackOut_49_0 = (gd) ((Object) stackIn_49_0);
                            stackOut_49_1 = (ug) ((Object) stackIn_49_1);
                            stackOut_49_2 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            break L18;
                          }
                        }
                        ((gd) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2 != 0, 8361407);
                        this.a(this.field_v, -1, param3, param1);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    this.field_q = -param4;
                    break L11;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  this.field_q = -param4;
                  this.a(this.field_v, -1, param3, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var7);
            stackOut_54_1 = new StringBuilder().append("w.C(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final gq d() {
        return null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 94 % ((param3 - -10) / 35);
        ia.a(param0, param1, param2, 0);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        L0: {
          if (pk.field_b == null) {
            break L0;
          } else {
            if (!pk.field_b.a(false)) {
              break L0;
            } else {
              q.b(124);
              return true;
            }
          }
        }
        if (param3 == 18663) {
          L1: {
            if (bk.field_i == null) {
              break L1;
            } else {
              if (!bk.field_i.k(param3 ^ 18562)) {
                break L1;
              } else {
                bk.field_i = null;
                q.b(46);
                return true;
              }
            }
          }
          if (vc.a(param3 ^ 5010853)) {
            return true;
          } else {
            if (sd.a(param2, (byte) 122, param0, param1)) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if ((this.field_s ^ -1) >= -1) {
            if (this.field_s >= 1048576) {
              break L0;
            } else {
              if (this.field_o == null) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            }
          } else {
            if (this.field_s >= 1048576) {
              break L0;
            } else {
              if (this.field_o == null) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_u) {
            break L1;
          } else {
            if (this.field_x != null) {
              this.field_t.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_y) {
            break L2;
          } else {
            L3: {
              if (-1 <= (this.field_q ^ -1)) {
                break L3;
              } else {
                if (this.field_j.c(-106)) {
                  break L3;
                } else {
                  this.field_p = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if ((this.field_q ^ -1) <= -1) {
              break L2;
            } else {
              if (!this.field_v.c(-61)) {
                this.field_o = null;
                this.field_q = -this.field_q;
                this.field_y = false;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (this.field_q != 0) {
            L5: {
              this.field_s = this.field_s + param0 * this.field_q;
              if ((this.field_s ^ -1) <= -1048577) {
                break L5;
              } else {
                if (0 >= this.field_s) {
                  this.field_s = 0;
                  if (!this.field_y) {
                    this.field_q = 0;
                    if (!this.field_l) {
                      L6: {
                        if (this.field_p == null) {
                          break L6;
                        } else {
                          this.field_j.g(2);
                          break L6;
                        }
                      }
                      this.field_p = null;
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L5;
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
            }
            this.field_s = 1048576;
            if (!this.field_y) {
              this.field_q = 0;
              if (this.field_l) {
                break L4;
              } else {
                L7: {
                  if (null != this.field_o) {
                    this.field_v.g(2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_o = null;
                break L4;
              }
            } else {
              break L4;
            }
          } else {
            break L4;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 18813) {
            discarded$0 = this.a();
        }
        this.field_k = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (uf.field_g <= var1_int) {
                    break L3;
                  } else {
                    uk.field_M[var1_int] = null;
                    var1_int++;
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
                uf.field_g = param0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
        }
    }

    final gq b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
            return;
        }
        field_z = null;
        field_n = null;
        field_A = null;
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
        int stackIn_48_0 = 0;
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
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_k > 0) {
              L1: {
                if (this.field_y) {
                  L2: {
                    if (0 >= this.field_q) {
                      break L2;
                    } else {
                      if (this.field_j.c(-54)) {
                        break L2;
                      } else {
                        this.field_p = null;
                        this.field_y = false;
                        this.field_q = -this.field_q;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (this.field_q >= 0) {
                    break L1;
                  } else {
                    if (!this.field_v.c(-103)) {
                      this.field_o = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_s >> 292573932) * this.field_k / 256;
                var5 = -var4_int + this.field_k;
                if (this.field_q != 0) {
                  L4: {
                    this.field_s = this.field_s + this.field_q * param2;
                    if (-1048577 >= (this.field_s ^ -1)) {
                      break L4;
                    } else {
                      if (0 < this.field_s) {
                        break L3;
                      } else {
                        this.field_s = 0;
                        if (this.field_y) {
                          break L3;
                        } else {
                          this.field_q = 0;
                          if (this.field_l) {
                            break L3;
                          } else {
                            L5: {
                              if (null != this.field_p) {
                                this.field_j.g(2);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            this.field_p = null;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_s = 1048576;
                  if (this.field_y) {
                    break L3;
                  } else {
                    this.field_q = 0;
                    if (!this.field_l) {
                      L6: {
                        if (null == this.field_o) {
                          break L6;
                        } else {
                          this.field_v.g(2);
                          break L6;
                        }
                      }
                      this.field_o = null;
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
                if (gp.field_j) {
                  stackOut_32_0 = param2 << -1305592351;
                  stackIn_33_0 = stackOut_32_0;
                  break L7;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L7;
                }
              }
              L8: {
                var6 = stackIn_33_0;
                if ((this.field_u ^ -1) > -257) {
                  L9: {
                    if (null != this.field_p) {
                      break L9;
                    } else {
                      if (this.field_o == null) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if ((var4_int ^ -1) == -257) {
                      break L10;
                    } else {
                      L11: {
                        if (256 == var5) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              if (this.field_w == null) {
                                break L13;
                              } else {
                                if (this.field_w.length < var6) {
                                  break L13;
                                } else {
                                  d.a(this.field_w, 0, var6);
                                  d.a(this.field_r, 0, var6);
                                  if (var11 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            this.field_w = new int[var6];
                            this.field_r = new int[var6];
                            break L12;
                          }
                          L14: {
                            this.field_j.b(this.field_w, 0, param2);
                            this.field_v.b(this.field_r, 0, param2);
                            if (!gp.field_j) {
                              stackOut_47_0 = param1;
                              stackIn_48_0 = stackOut_47_0;
                              break L14;
                            } else {
                              param1 = param1 << 1;
                              stackOut_46_0 = param1 << 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L14;
                            }
                          }
                          var7 = stackIn_48_0;
                          var8 = 0;
                          L15: while (true) {
                            if (var6 <= var8) {
                              if (var11 == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            } else {
                              param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_w[var8] >> 468994792);
                              var8++;
                              if (var11 != 0) {
                                break L8;
                              } else {
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      this.field_v.b(param0, param1, param2);
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  this.field_j.b(param0, param1, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
              L16: {
                if (this.field_x == null) {
                  break L16;
                } else {
                  if (this.field_u != 0) {
                    L17: {
                      L18: {
                        L19: {
                          if (null == this.field_w) {
                            break L19;
                          } else {
                            if (this.field_w.length >= var6) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        this.field_r = new int[var6];
                        this.field_w = new int[var6];
                        if (var11 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                      d.a(this.field_w, 0, var6);
                      break L17;
                    }
                    L20: {
                      this.field_t.b(this.field_w, 0, param2);
                      if (!gp.field_j) {
                        stackOut_68_0 = param1;
                        stackIn_69_0 = stackOut_68_0;
                        break L20;
                      } else {
                        param1 = param1 << 1;
                        stackOut_67_0 = param1 << 1;
                        stackIn_69_0 = stackOut_67_0;
                        break L20;
                      }
                    }
                    var7 = stackIn_69_0;
                    var8 = this.field_u * this.field_k / 256;
                    var9 = -var8 + this.field_k;
                    var10 = 0;
                    L21: while (true) {
                      if (var6 <= var10) {
                        break L16;
                      } else {
                        param0[var10 + var7] = var8 * this.field_w[var10] + param0[var10 + var7] * var9 >> 1756589480;
                        var10++;
                        if (var11 != 0) {
                          break L16;
                        } else {
                          continue L21;
                        }
                      }
                    }
                  } else {
                    break L16;
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
          L22: {
            var4 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var4);
            stackOut_75_1 = new StringBuilder().append("w.F(");
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
              break L22;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L22;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    static {
        field_n = "Ready";
    }
}
