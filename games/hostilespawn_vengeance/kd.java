/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj {
    int field_w;
    private boolean field_x;
    private int field_s;
    ji field_B;
    ji field_p;
    ji field_u;
    private int[] field_m;
    w field_C;
    int field_r;
    w field_n;
    w field_F;
    private int[] field_o;
    private int field_z;
    private static long[] field_D;
    boolean field_l;
    static nd field_G;
    static bd field_y;
    static gd field_v;
    static boolean field_t;
    static boolean field_q;
    static String field_E;
    static String field_A;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (-1 <= (param1 ^ -1)) {
                var4 = 96 / ((param0 - 53) / 63);
                stackIn_5_0 = var3_int;
                break L0;
              } else {
                var3_int = var3_int << 268067649 | 1 & param2;
                param2 = param2 >>> 1;
                param1--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "kd.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(int param0, w param1, w param2) {
        try {
            this.field_F = param2;
            if (param0 != -9) {
                field_y = (bd) null;
            }
            this.field_s = 1048576;
            this.field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kd.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, w param1, byte param2, int param3) {
        try {
            param1.a(param0, -1, (byte) -89);
            param1.c(param3, param2 + 89);
            if (param2 != 38) {
                this.field_m = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kd.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        oj var6_ref_oj = null;
        qm var7 = null;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (ha.field_t != param0) {
              L1: {
                var2_int = ln.field_a.field_d;
                var3 = ln.field_a.field_a;
                if (param1 == 1) {
                  break L1;
                } else {
                  field_v = (gd) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    nh.field_E.a(-1, 8360, -1);
                    ha.field_t = param0;
                    var5 = new oc();
                    var6 = ha.field_t;
                    if (0 == var6) {
                      break L4;
                    } else {
                      if (-7 == (var6 ^ -1)) {
                        break L4;
                      } else {
                        if (-2 != (var6 ^ -1)) {
                          if (var6 != 2) {
                            if (-4 == (var6 ^ -1)) {
                              var4 = 0;
                              L5: while (true) {
                                L6: {
                                  if (el.field_j <= var4) {
                                    break L6;
                                  } else {
                                    if (-9 != (mm.field_m[var4].field_i ^ -1)) {
                                      var4++;
                                      continue L5;
                                    } else {
                                      nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                      break L6;
                                    }
                                  }
                                }
                                if (0 != bm.field_c) {
                                  break L3;
                                } else {
                                  if (nh.field_E.field_e != -1) {
                                    break L3;
                                  } else {
                                    kd.a(0, param1 ^ 0);
                                    eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                    r.field_a = 0;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              if ((var6 ^ -1) == -6) {
                                nh.field_E.a(40, 8360, 110);
                                break L2;
                              } else {
                                if (9 != var6) {
                                  if (-5 != (var6 ^ -1)) {
                                    if (10 == var6) {
                                      var6 = 0;
                                      var4 = 0;
                                      L7: while (true) {
                                        L8: {
                                          if (var4 >= dk.field_o) {
                                            break L8;
                                          } else {
                                            if (2 <= var6) {
                                              break L8;
                                            } else {
                                              L9: {
                                                var7 = vj.field_w[var4];
                                                if (var7.field_i < 49) {
                                                  break L9;
                                                } else {
                                                  if (var7.field_i > 52) {
                                                    break L9;
                                                  } else {
                                                    var6++;
                                                    nh.field_E.a((byte) 46, var7.field_j);
                                                    break L9;
                                                  }
                                                }
                                              }
                                              var4++;
                                              continue L7;
                                            }
                                          }
                                        }
                                        break L2;
                                      }
                                    } else {
                                      if (13 != var6) {
                                        if (var6 != 14) {
                                          if (-13 != (var6 ^ -1)) {
                                            break L3;
                                          } else {
                                            var4 = 0;
                                            L10: while (true) {
                                              if (var4 >= ll.field_a) {
                                                if (0 != (nh.field_E.field_e ^ -1)) {
                                                  break L3;
                                                } else {
                                                  kd.a(0, 1);
                                                  eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                                  break L2;
                                                }
                                              } else {
                                                L11: {
                                                  if (wh.field_b[var4].field_i == 2) {
                                                    if (11 != wh.field_b[var4].field_h) {
                                                      break L11;
                                                    } else {
                                                      nh.field_E.a((byte) 46, wh.field_b[var4].field_j);
                                                      break L11;
                                                    }
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                                var4++;
                                                continue L10;
                                              }
                                            }
                                          }
                                        } else {
                                          if (0 != bm.field_c) {
                                            break L3;
                                          } else {
                                            var4 = 0;
                                            L12: while (true) {
                                              if (var4 >= el.field_j) {
                                                break L3;
                                              } else {
                                                if ((mm.field_m[var4].field_i ^ -1) == -128) {
                                                  nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                                  break L2;
                                                } else {
                                                  var4++;
                                                  continue L12;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        nh.field_E.a(-1, 8360, -1);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var4 = 0;
                                    L13: while (true) {
                                      if (var4 >= el.field_j) {
                                        break L3;
                                      } else {
                                        var6_ref_oj = mm.field_m[var4];
                                        if ((var6_ref_oj.field_i ^ -1) != -126) {
                                          var4++;
                                          continue L13;
                                        } else {
                                          nh.field_E.a(-5 + var6_ref_oj.field_j.field_e, 8360, var6_ref_oj.field_j.field_g);
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                          } else {
                            var4 = -1 + el.field_j;
                            L14: while (true) {
                              L15: {
                                if (0 > var4) {
                                  break L15;
                                } else {
                                  if (mm.field_m[var4].field_i == 4) {
                                    nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                    break L15;
                                  } else {
                                    var4--;
                                    continue L14;
                                  }
                                }
                              }
                              if ((nh.field_E.field_e ^ -1) != 0) {
                                break L3;
                              } else {
                                kd.a(0, param1 ^ 0);
                                eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                break L2;
                              }
                            }
                          }
                        } else {
                          var4 = 0;
                          L16: while (true) {
                            if (el.field_j <= var4) {
                              break L3;
                            } else {
                              if (125 != mm.field_m[var4].field_i) {
                                var4++;
                                continue L16;
                              } else {
                                nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5.field_e = 0;
                  L17: while (true) {
                    if (var2_int <= var5.field_e) {
                      if (-1 == (bm.field_c ^ -1)) {
                        L18: {
                          if (0 != rl.field_c) {
                            break L18;
                          } else {
                            if (bj.field_a) {
                              nh.field_E.a(45, 8360, 37);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (1 != rl.field_c) {
                          break L3;
                        } else {
                          if (!tg.field_a) {
                            break L3;
                          } else {
                            nh.field_E.a(45, 8360, 37);
                            break L2;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      var5.field_g = 0;
                      L19: while (true) {
                        if (var3 <= var5.field_g) {
                          var5.field_e = var5.field_e + 1;
                          continue L17;
                        } else {
                          L20: {
                            var6 = ln.field_a.field_y[var5.b(-4)];
                            if (148 != var6) {
                              break L20;
                            } else {
                              nh.field_E.a(-1 + var5.field_e, 8360, -1 + var5.field_g);
                              break L20;
                            }
                          }
                          L21: {
                            if (157 != var6) {
                              break L21;
                            } else {
                              nh.field_E.a(-2 + var5.field_e, 8360, var5.field_g + -2);
                              break L21;
                            }
                          }
                          var5.field_g = var5.field_g + 1;
                          continue L19;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "kd.P(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, byte param1, boolean param2, int param3, ji param4, int param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        w stackIn_42_0 = null;
        w stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        w stackIn_52_0 = null;
        w stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_x) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if (0 < this.field_w) {
                      L3: {
                        if (null != this.field_p) {
                          this.field_F.e(4491);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_p = param4;
                      if (param4 != null) {
                        this.field_F.a(false, (byte) 20, param4);
                        this.a(param3, this.field_F, (byte) 38, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == this.field_u) {
                          break L4;
                        } else {
                          this.field_C.e(4491);
                          break L4;
                        }
                      }
                      this.field_u = param4;
                      if (param4 != null) {
                        this.field_C.a(false, (byte) 28, param4);
                        this.a(param3, this.field_C, (byte) 38, param5);
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
              stackIn_19_0 = this;

              if (!param2) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L5;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L5;
              }
            }
            ((kd) (this)).field_x = stackIn_20_1 != 0;
            if (param4 == this.field_p) {
              this.field_w = param0;
              this.a(param3, this.field_F, (byte) 38, param5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_u != param4) {
                L6: {
                  if (null != this.field_p) {
                    if (this.field_u == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (524288 <= this.field_s) {
                          stackIn_32_0 = 0;
                          break L7;
                        } else {
                          stackIn_32_0 = 1;
                          break L7;
                        }
                      }
                      var7_int = stackIn_32_0;
                      break L6;
                    }
                  } else {
                    var7_int = 1;
                    break L6;
                  }
                }
                L8: {
                  if (var7_int == 0) {
                    L9: {
                      if (this.field_u != null) {
                        this.field_C.e(4491);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      this.field_u = param4;
                      if (param4 != null) {
                        L11: {
                          stackIn_52_0 = this.field_C;

                          if (param2) {
                            stackIn_53_0 = (w) ((Object) stackIn_52_0);
                            stackIn_53_1 = 0;
                            break L11;
                          } else {
                            stackIn_53_0 = (w) ((Object) stackIn_52_0);
                            stackIn_53_1 = 1;
                            break L11;
                          }
                        }
                        ((w) (Object) stackIn_53_0).a(stackIn_53_1 != 0, (byte) 40, param4);
                        this.a(param3, this.field_C, (byte) 38, param5);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    this.field_w = -param0;
                    break L8;
                  } else {
                    L12: {
                      if (this.field_p != null) {
                        this.field_F.e(4491);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      this.field_p = param4;
                      if (param4 != null) {
                        L14: {
                          stackIn_42_0 = this.field_F;

                          if (param2) {
                            stackIn_43_0 = (w) ((Object) stackIn_42_0);
                            stackIn_43_1 = 0;
                            break L14;
                          } else {
                            stackIn_43_0 = (w) ((Object) stackIn_42_0);
                            stackIn_43_1 = 1;
                            break L14;
                          }
                        }
                        ((w) (Object) stackIn_43_0).a(stackIn_43_1 != 0, (byte) 116, param4);
                        this.a(param3, this.field_F, (byte) 38, param5);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_w = param0;
                    break L8;
                  }
                }
                var8 = -111 / ((param1 - -45) / 34);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_w = -param0;
                this.a(param3, this.field_C, (byte) 38, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var7);

            stackIn_59_1 = new StringBuilder().append("kd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L15;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L15;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param5 + ')');
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

    final synchronized void a(int param0, boolean param1) {
        this.field_z = param0;
        if (!param1) {
            this.field_x = false;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_32_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (0 >= this.field_z) {
              this.c(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_x) {
                  break L1;
                } else {
                  L2: {
                    if ((this.field_w ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (!this.field_F.f(323697071)) {
                        this.field_w = -this.field_w;
                        this.field_p = null;
                        this.field_x = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-1 >= (this.field_w ^ -1)) {
                    break L1;
                  } else {
                    if (this.field_C.f(323697071)) {
                      break L1;
                    } else {
                      this.field_u = null;
                      this.field_w = -this.field_w;
                      this.field_x = false;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_s >> 1190818924) * this.field_z / 256;
                var5 = -var4_int + this.field_z;
                if (this.field_w != 0) {
                  this.field_s = this.field_s + this.field_w * param2;
                  if (1048576 > this.field_s) {
                    if ((this.field_s ^ -1) >= -1) {
                      this.field_s = 0;
                      if (this.field_x) {
                        break L3;
                      } else {
                        this.field_w = 0;
                        if (this.field_l) {
                          break L3;
                        } else {
                          L4: {
                            if (null == this.field_p) {
                              break L4;
                            } else {
                              this.field_F.e(4491);
                              break L4;
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
                    this.field_s = 1048576;
                    if (this.field_x) {
                      break L3;
                    } else {
                      this.field_w = 0;
                      if (!this.field_l) {
                        L5: {
                          if (null == this.field_u) {
                            break L5;
                          } else {
                            this.field_C.e(4491);
                            break L5;
                          }
                        }
                        this.field_u = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!ug.field_b) {
                  stackIn_32_0 = param2;
                  break L6;
                } else {
                  stackIn_32_0 = param2 << 1773409153;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (256 <= this.field_r) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_p) {
                      break L8;
                    } else {
                      if (null == this.field_u) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (-257 != (var4_int ^ -1)) {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (null == this.field_m) {
                            break L10;
                          } else {
                            if (var6 <= this.field_m.length) {
                              kf.a(this.field_m, 0, var6);
                              kf.a(this.field_o, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_o = new int[var6];
                        this.field_m = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_F.b(this.field_m, 0, param2);
                        this.field_C.b(this.field_o, 0, param2);
                        if (ug.field_b) {
                          param1 = param1 << 1;
                          stackIn_48_0 = param1 << 1;
                          break L11;
                        } else {
                          stackIn_48_0 = param1;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_m[var8] * var4_int + var5 * this.field_o[var8] >> -567037688);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_C.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    this.field_F.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                L14: {
                  if (null == this.field_B) {
                    break L14;
                  } else {
                    if (this.field_r != 0) {
                      L15: {
                        L16: {
                          if (null == this.field_m) {
                            break L16;
                          } else {
                            if (this.field_m.length >= var6) {
                              kf.a(this.field_m, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_o = new int[var6];
                        this.field_m = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_n.b(this.field_m, 0, param2);
                        if (ug.field_b) {
                          param1 = param1 << 1;
                          stackIn_62_0 = param1 << 1;
                          break L17;
                        } else {
                          stackIn_62_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = this.field_z * this.field_r / 256;
                      var9 = this.field_z - var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = var9 * param0[var10 + var7] + var8 * this.field_m[var10] >> 190320616;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var4);

            stackIn_68_1 = new StringBuilder().append("kd.A(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 <= -76) {
          L0: {
            L1: {
              if (ie.field_c == null) {
                break L1;
              } else {
                if (!ie.field_c.b(28433)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final tj b() {
        return null;
    }

    final tj d() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void c(int param0) {
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_s <= 0) {
            break L0;
          } else {
            if (this.field_p == null) {
              break L0;
            } else {
              this.field_F.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= this.field_s) {
            break L1;
          } else {
            if (null != this.field_u) {
              this.field_C.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (this.field_r <= 0) {
            break L2;
          } else {
            if (this.field_B != null) {
              this.field_n.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!this.field_x) {
            break L3;
          } else {
            L4: {
              if ((this.field_w ^ -1) >= -1) {
                break L4;
              } else {
                if (!this.field_F.f(323697071)) {
                  this.field_w = -this.field_w;
                  this.field_x = false;
                  this.field_p = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (-1 >= (this.field_w ^ -1)) {
              break L3;
            } else {
              if (!this.field_C.f(323697071)) {
                this.field_x = false;
                this.field_u = null;
                this.field_w = -this.field_w;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (0 != this.field_w) {
            this.field_s = this.field_s + this.field_w * param0;
            if (1048576 > this.field_s) {
              L6: {
                if (0 < this.field_s) {
                  break L6;
                } else {
                  this.field_s = 0;
                  if (!this.field_x) {
                    this.field_w = 0;
                    if (!this.field_l) {
                      L7: {
                        if (null == this.field_p) {
                          break L7;
                        } else {
                          this.field_F.e(4491);
                          break L7;
                        }
                      }
                      this.field_p = null;
                      break L6;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              break L5;
            } else {
              this.field_s = 1048576;
              if (!this.field_x) {
                this.field_w = 0;
                if (!this.field_l) {
                  L8: {
                    if (null == this.field_u) {
                      break L8;
                    } else {
                      this.field_C.e(4491);
                      break L8;
                    }
                  }
                  this.field_u = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
    }

    public static void c(byte param0) {
        field_G = null;
        if (param0 != -13) {
            return;
        }
        field_y = null;
        field_E = null;
        field_v = null;
        field_D = null;
        field_A = null;
    }

    final boolean a(ji param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 2) {
                break L1;
              } else {
                field_D = (long[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == this.field_p) {
                  break L3;
                } else {
                  if (this.field_u != param0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("kd.V(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    kd(w param0, w param1, w param2) {
        this.field_r = 0;
        this.field_z = 256;
        this.field_l = false;
        try {
            this.a(-9, param1, param0);
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_D = new long[256];
            var2 = 0;
            L0: while (true) {
              if (256 <= var2) {
                field_G = new nd(7, 0, 1, 1);
                field_t = false;
                field_E = "I need to plant these charges to stop the influx of critters.";
                field_A = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_D[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) == 1L) {
                      var0 = -3932672073523589310L ^ var0 >>> 741565185;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
