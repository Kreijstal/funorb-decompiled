/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends hn {
    static int field_z;
    private ih field_r;
    private boolean field_F;
    private int field_x;
    private int field_C;
    ih field_y;
    private boolean field_B;
    static int field_o;
    static String field_u;
    ih field_w;
    ih field_D;
    private int[] field_E;
    private um field_p;
    private um field_q;
    private int[] field_t;
    static kl field_s;
    private int field_v;
    private int field_G;
    private um field_A;

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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if ((this.field_x ^ -1) >= -1) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_F) {
                  L2: {
                    if (-1 <= (this.field_C ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_w.g(11899)) {
                        break L2;
                      } else {
                        this.field_F = false;
                        this.field_p = null;
                        this.field_C = -this.field_C;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (this.field_C >= 0) {
                    break L1;
                  } else {
                    if (this.field_D.g(11899)) {
                      break L1;
                    } else {
                      this.field_F = false;
                      this.field_C = -this.field_C;
                      this.field_A = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_G >> -1158767380) * this.field_x / 256;
                var5 = -var4_int + this.field_x;
                if (this.field_C == 0) {
                  break L3;
                } else {
                  L4: {
                    this.field_G = this.field_G + param2 * this.field_C;
                    if (1048576 > this.field_G) {
                      break L4;
                    } else {
                      this.field_G = 1048576;
                      if (this.field_F) {
                        break L3;
                      } else {
                        this.field_C = 0;
                        if (!this.field_B) {
                          L5: {
                            if (null != this.field_A) {
                              this.field_D.j(7);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_A = null;
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (-1 > (this.field_G ^ -1)) {
                    break L3;
                  } else {
                    this.field_G = 0;
                    if (this.field_F) {
                      break L3;
                    } else {
                      this.field_C = 0;
                      if (!this.field_B) {
                        L6: {
                          if (this.field_p == null) {
                            break L6;
                          } else {
                            this.field_w.j(7);
                            break L6;
                          }
                        }
                        this.field_p = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L7: {
                if (!rc.field_q) {
                  stackOut_32_0 = param2;
                  stackIn_33_0 = stackOut_32_0;
                  break L7;
                } else {
                  stackOut_31_0 = param2 << -1077437279;
                  stackIn_33_0 = stackOut_31_0;
                  break L7;
                }
              }
              L8: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_v ^ -1)) {
                  L9: {
                    if (this.field_p != null) {
                      break L9;
                    } else {
                      if (null == this.field_A) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-257 != (var4_int ^ -1)) {
                      break L10;
                    } else {
                      this.field_w.b(param0, param1, param2);
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-257 == (var5 ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          L14: {
                            if (null == this.field_t) {
                              break L14;
                            } else {
                              if (var6 <= this.field_t.length) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_t = new int[var6];
                          this.field_E = new int[var6];
                          if (var11 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                        vm.a(this.field_t, 0, var6);
                        vm.a(this.field_E, 0, var6);
                        break L12;
                      }
                      L15: {
                        this.field_w.b(this.field_t, 0, param2);
                        this.field_D.b(this.field_E, 0, param2);
                        if (!rc.field_q) {
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
                        if (var8 >= var6) {
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L11;
                          }
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (var5 * this.field_E[var8] + var4_int * this.field_t[var8] >> 1437544328);
                          var8++;
                          if (var11 != 0) {
                            break L8;
                          } else {
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  this.field_D.b(param0, param1, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
              L17: {
                if (this.field_q == null) {
                  break L17;
                } else {
                  if (-1 != (this.field_v ^ -1)) {
                    L18: {
                      L19: {
                        if (this.field_t == null) {
                          break L19;
                        } else {
                          if (var6 > this.field_t.length) {
                            break L19;
                          } else {
                            vm.a(this.field_t, 0, var6);
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      this.field_E = new int[var6];
                      this.field_t = new int[var6];
                      break L18;
                    }
                    L20: {
                      this.field_r.b(this.field_t, 0, param2);
                      if (!rc.field_q) {
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
                    var8 = this.field_x * this.field_v / 256;
                    var9 = -var8 + this.field_x;
                    var10 = 0;
                    L21: while (true) {
                      if (var10 >= var6) {
                        break L17;
                      } else {
                        param0[var10 + var7] = param0[var10 + var7] * var9 - -(var8 * this.field_t[var10]) >> -1668644856;
                        var10++;
                        if (var11 != 0) {
                          break L17;
                        } else {
                          continue L21;
                        }
                      }
                    }
                  } else {
                    break L17;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var4);
            stackOut_75_1 = new StringBuilder().append("nm.E(");
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
          throw ig.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(um param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 41) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            L2: {
              if (lk.field_e == null) {
                break L2;
              } else {
                bk.a(param2, 1048576, param0, param3 + 20566, param1);
                break L2;
              }
            }
            L3: {
              if (null != au.field_Kb) {
                var4 = l.field_a;
                synchronized (var4) {
                  L4: {
                    au.field_Kb.a(param2, -1, (byte) -91);
                    if (lo.field_u == param0) {
                      return;
                    } else {
                      L5: {
                        au.field_Kb.j(7);
                        l.field_a.c();
                        lo.field_u = param0;
                        if (lo.field_u == null) {
                          break L5;
                        } else {
                          au.field_Kb.a(2, param1, lo.field_u);
                          break L5;
                        }
                      }
                      break L4;
                    }
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4_ref);
            stackOut_18_1 = new StringBuilder().append("nm.N(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final hn a() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
            return false;
        }
        return (param0 ^ -1) <= -1 ? true : false;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((this.field_G ^ -1) >= -1) {
            break L0;
          } else {
            if (this.field_p != null) {
              this.field_w.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1048577 >= (this.field_G ^ -1)) {
            if (-1 <= (this.field_v ^ -1)) {
              break L1;
            } else {
              if (null == this.field_q) {
                break L1;
              } else {
                this.field_r.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= (this.field_v ^ -1)) {
              break L1;
            } else {
              if (null == this.field_q) {
                break L1;
              } else {
                this.field_r.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!this.field_F) {
            break L2;
          } else {
            if (this.field_C > 0) {
              if (!this.field_w.g(11899)) {
                this.field_F = false;
                this.field_C = -this.field_C;
                this.field_p = null;
                if (var3 == 0) {
                  break L2;
                } else {
                  if ((this.field_C ^ -1) <= -1) {
                    break L2;
                  } else {
                    if (this.field_D.g(11899)) {
                      break L2;
                    } else {
                      this.field_F = false;
                      this.field_C = -this.field_C;
                      this.field_A = null;
                      break L2;
                    }
                  }
                }
              } else {
                if ((this.field_C ^ -1) <= -1) {
                  break L2;
                } else {
                  if (this.field_D.g(11899)) {
                    break L2;
                  } else {
                    this.field_F = false;
                    this.field_C = -this.field_C;
                    this.field_A = null;
                    break L2;
                  }
                }
              }
            } else {
              if ((this.field_C ^ -1) <= -1) {
                break L2;
              } else {
                if (this.field_D.g(11899)) {
                  break L2;
                } else {
                  this.field_F = false;
                  this.field_C = -this.field_C;
                  this.field_A = null;
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (this.field_C != 0) {
            L4: {
              this.field_G = this.field_G + this.field_C * param0;
              if ((this.field_G ^ -1) > -1048577) {
                break L4;
              } else {
                this.field_G = 1048576;
                if (!this.field_F) {
                  this.field_C = 0;
                  if (!this.field_B) {
                    L5: {
                      if (this.field_A != null) {
                        this.field_D.j(7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_A = null;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            if ((this.field_G ^ -1) >= -1) {
              this.field_G = 0;
              if (this.field_F) {
                break L3;
              } else {
                this.field_C = 0;
                if (this.field_B) {
                  break L3;
                } else {
                  L6: {
                    if (null != this.field_p) {
                      this.field_w.j(7);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_p = null;
                  break L3;
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

    final synchronized void a(int param0, boolean param1, um param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ih var9 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_34_0 = 0;
        ih stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ih stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ih stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        ih stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        ih stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        ih stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        ih stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ih stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        ih stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        ih stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        ih stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        ih stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_F) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    L3: {
                      if (-1 <= (this.field_C ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_p != null) {
                            this.field_w.j(7);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_p = param2;
                        if (param2 == null) {
                          break L2;
                        } else {
                          this.field_w.a(2, false, param2);
                          this.a(-1, this.field_w, param5, param0);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null != this.field_A) {
                        this.field_D.j(7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_A = param2;
                    if (param2 == null) {
                      break L2;
                    } else {
                      this.field_D.a(2, false, param2);
                      this.a(-1, this.field_D, param5, param0);
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
              if (!param1) {
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
            ((nm) (this)).field_F = stackIn_20_1 != 0;
            if (param2 == this.field_p) {
              this.field_C = param4;
              this.a(-1, this.field_w, param5, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param2 == this.field_A) {
                this.field_C = -param4;
                this.a(-1, this.field_D, param5, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L7: {
                  if (param3 == -1) {
                    break L7;
                  } else {
                    var9 = (ih) null;
                    this.a(-25, (ih) null, 43, -18);
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    if (this.field_p == null) {
                      break L9;
                    } else {
                      L10: {
                        if (null == this.field_A) {
                          break L10;
                        } else {
                          L11: {
                            if (-524289 >= (this.field_G ^ -1)) {
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
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7_int = 1;
                  break L8;
                }
                L12: {
                  L13: {
                    if (var7_int != 0) {
                      break L13;
                    } else {
                      L14: {
                        if (null == this.field_A) {
                          break L14;
                        } else {
                          this.field_D.j(7);
                          break L14;
                        }
                      }
                      L15: {
                        this.field_A = param2;
                        if (param2 != null) {
                          L16: {
                            stackOut_42_0 = this.field_D;
                            stackOut_42_1 = param3 + 3;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            if (param1) {
                              stackOut_44_0 = (ih) ((Object) stackIn_44_0);
                              stackOut_44_1 = stackIn_44_1;
                              stackOut_44_2 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              stackIn_45_2 = stackOut_44_2;
                              break L16;
                            } else {
                              stackOut_43_0 = (ih) ((Object) stackIn_43_0);
                              stackOut_43_1 = stackIn_43_1;
                              stackOut_43_2 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              stackIn_45_1 = stackOut_43_1;
                              stackIn_45_2 = stackOut_43_2;
                              break L16;
                            }
                          }
                          ((ih) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2 != 0, param2);
                          this.a(param3 ^ 0, this.field_D, param5, param0);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.field_C = -param4;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (this.field_p == null) {
                      break L17;
                    } else {
                      this.field_w.j(7);
                      break L17;
                    }
                  }
                  L18: {
                    this.field_p = param2;
                    if (param2 != null) {
                      L19: {
                        stackOut_51_0 = this.field_w;
                        stackOut_51_1 = 2;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (param1) {
                          stackOut_53_0 = (ih) ((Object) stackIn_53_0);
                          stackOut_53_1 = stackIn_53_1;
                          stackOut_53_2 = 0;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          stackIn_54_2 = stackOut_53_2;
                          break L19;
                        } else {
                          stackOut_52_0 = (ih) ((Object) stackIn_52_0);
                          stackOut_52_1 = stackIn_52_1;
                          stackOut_52_2 = 1;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_54_1 = stackOut_52_1;
                          stackIn_54_2 = stackOut_52_2;
                          break L19;
                        }
                      }
                      ((ih) (Object) stackIn_54_0).a(stackIn_54_1, stackIn_54_2 != 0, param2);
                      this.a(param3 + 0, this.field_w, param5, param0);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  this.field_C = param4;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var7);
            stackOut_57_1 = new StringBuilder().append("nm.J(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L20;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final hn b() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        int var3 = 74 % ((param1 - -65) / 46);
    }

    final synchronized int c() {
        return 2;
    }

    private final void a(int param0, ih param1, ih param2) {
        RuntimeException runtimeException = null;
        ih var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              this.field_D = param2;
              this.field_w = param1;
              this.field_G = 1048576;
              this.field_y = this.field_w;
              if (param0 >= 36) {
                break L1;
              } else {
                var5 = (ih) null;
                this.a(-114, (ih) null, (ih) null);
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
            stackOut_3_1 = new StringBuilder().append("nm.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 256) {
            field_u = (String) null;
        }
        field_u = null;
        field_s = null;
    }

    private final void a(int param0, ih param1, int param2, int param3) {
        try {
            this.field_y = param1;
            param1.a(param3, param0, (byte) -55);
            param1.c(param2, param0 ^ 34);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nm.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        je stackIn_4_0 = null;
        je stackIn_5_0 = null;
        je stackIn_6_0 = null;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_8_0 = null;
        je stackIn_9_0 = null;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_20_0 = null;
        je stackIn_21_0 = null;
        je stackIn_22_0 = null;
        je stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        je stackIn_24_0 = null;
        je stackIn_25_0 = null;
        je stackIn_26_0 = null;
        je stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        je stackOut_3_0 = null;
        je stackOut_4_0 = null;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        je stackOut_7_0 = null;
        je stackOut_8_0 = null;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        je stackOut_19_0 = null;
        je stackOut_20_0 = null;
        je stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        je stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        je stackOut_23_0 = null;
        je stackOut_24_0 = null;
        je stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        je stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        L0: {
          id.a(-640 + qn.field_l >> -1264848031, 640 + qn.field_l >> -2033411135, qn.field_g, 0, (byte) 91);
          if (gk.field_J <= 0) {
            break L0;
          } else {
            L1: {
              if (null == dh.field_k) {
                break L1;
              } else {
                dh.field_k.f(no.field_T.field_S, 0);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = no.field_T;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_4_0 = (je) ((Object) stackIn_4_0);
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackOut_5_0 = (je) ((Object) stackIn_5_0);
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = (je) ((Object) stackIn_6_0);
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L2;
            }
            L4: {
              L5: {
                ((je) (Object) stackIn_7_0).b(stackIn_7_1 != 0, 20);
                stackOut_7_0 = ov.field_i;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_8_0 = (je) ((Object) stackIn_8_0);
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (bw.field_g) {
                    break L5;
                  } else {
                    stackOut_9_0 = (je) ((Object) stackIn_9_0);
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (je) ((Object) stackIn_10_0);
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L4;
            }
            ((je) (Object) stackIn_11_0).b(stackIn_11_1 != 0, 20);
            break L0;
          }
        }
        if (param0 != 95) {
          return;
        } else {
          L6: {
            L7: {
              if (0 < bd.field_r) {
                break L7;
              } else {
                if (rk.field_D > 0) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (dh.field_k != null) {
                dh.field_k.f(lk.field_a.field_S, 0);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                stackOut_19_0 = lk.field_a;
                stackIn_22_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!param1) {
                  break L10;
                } else {
                  stackOut_20_0 = (je) ((Object) stackIn_20_0);
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (vk.field_f) {
                    break L10;
                  } else {
                    stackOut_21_0 = (je) ((Object) stackIn_21_0);
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L9;
                  }
                }
              }
              stackOut_22_0 = (je) ((Object) stackIn_22_0);
              stackOut_22_1 = 0;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L9;
            }
            L11: {
              L12: {
                ((je) (Object) stackIn_23_0).b(stackIn_23_1 != 0, 20);
                stackOut_23_0 = pd.field_c;
                stackIn_26_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (!param1) {
                  break L12;
                } else {
                  stackOut_24_0 = (je) ((Object) stackIn_24_0);
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (vk.field_f) {
                    break L12;
                  } else {
                    stackOut_25_0 = (je) ((Object) stackIn_25_0);
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L11;
                  }
                }
              }
              stackOut_26_0 = (je) ((Object) stackIn_26_0);
              stackOut_26_1 = 0;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              break L11;
            }
            ((je) (Object) stackIn_27_0).b(stackIn_27_1 != 0, 20);
            break L6;
          }
          rf.b(-18862);
          return;
        }
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = null;
        RuntimeException var3_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        li stackOut_3_0 = null;
        li stackOut_1_0 = null;
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
            var3 = new li(param2);
            s.field_e.a((byte) -119, (tc) (var3));
            hp.a(var3, param1, 25522);
            if (param0 == 0) {
              stackOut_3_0 = (li) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (li) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("nm.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nm(ih param0, ih param1) {
        this.field_B = false;
        this.field_x = 256;
        this.field_v = 0;
        try {
            this.a(121, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "The following settings need to be changed:  ";
        field_o = -1;
    }
}
