/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hj {
    private tv field_t;
    private int field_C;
    static hr[] field_q;
    private int[] field_s;
    private tv field_y;
    private int[] field_A;
    private boolean field_u;
    static ri field_p;
    private tv field_v;
    private int field_z;
    private int field_B;
    private bs field_D;
    private boolean field_w;
    bs field_r;
    bs field_x;
    private int field_o;

    public static void c(int param0) {
        field_p = null;
        int var1 = -38 / ((-89 - param0) / 33);
        field_q = null;
    }

    final synchronized void a(int param0, int param1, tv param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        wb[] var9 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_35_0 = 0;
        bs stackIn_43_0 = null;
        bs stackIn_44_0 = null;
        bs stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        bs stackIn_53_0 = null;
        bs stackIn_54_0 = null;
        bs stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        bs stackOut_42_0 = null;
        bs stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        bs stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        bs stackOut_52_0 = null;
        bs stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        bs stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_u) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    L3: {
                      if (this.field_C <= 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_v != null) {
                            this.field_x.e(0);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_v = param2;
                        if (param2 == null) {
                          break L2;
                        } else {
                          this.field_x.a(false, param2, 117);
                          this.a(param1, (byte) 39, this.field_x, param5);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null != this.field_y) {
                        this.field_r.e(0);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_y = param2;
                    if (param2 != null) {
                      this.field_r.a(false, param2, 60);
                      this.a(param1, (byte) 24, this.field_r, param5);
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
              if (param0 == 1) {
                break L6;
              } else {
                var9 = (wb[]) null;
                ud.a(57, -30, 8, 30, (wb[]) null);
                break L6;
              }
            }
            L7: {
              stackOut_20_0 = this;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!param3) {
                stackOut_22_0 = this;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L7;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L7;
              }
            }
            ((ud) (this)).field_u = stackIn_23_1 != 0;
            if (param2 != this.field_v) {
              if (param2 != this.field_y) {
                L8: {
                  L9: {
                    if (this.field_v != null) {
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
                    if (this.field_y == null) {
                      break L10;
                    } else {
                      L11: {
                        if (524288 <= this.field_o) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L11;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L11;
                        }
                      }
                      var7_int = stackIn_35_0;
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
                    if (var7_int == 0) {
                      break L13;
                    } else {
                      L14: {
                        if (null == this.field_v) {
                          break L14;
                        } else {
                          this.field_x.e(param0 + -1);
                          break L14;
                        }
                      }
                      L15: {
                        this.field_v = param2;
                        if (param2 != null) {
                          L16: {
                            stackOut_42_0 = this.field_x;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (param3) {
                              stackOut_44_0 = (bs) ((Object) stackIn_44_0);
                              stackOut_44_1 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L16;
                            } else {
                              stackOut_43_0 = (bs) ((Object) stackIn_43_0);
                              stackOut_43_1 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              stackIn_45_1 = stackOut_43_1;
                              break L16;
                            }
                          }
                          ((bs) (Object) stackIn_45_0).a(stackIn_45_1 != 0, param2, 121);
                          this.a(param1, (byte) -114, this.field_x, param5);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.field_C = param4;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (null != this.field_y) {
                      this.field_r.e(0);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    this.field_y = param2;
                    if (param2 != null) {
                      L19: {
                        stackOut_52_0 = this.field_r;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_53_0 = stackOut_52_0;
                        if (param3) {
                          stackOut_54_0 = (bs) ((Object) stackIn_54_0);
                          stackOut_54_1 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          break L19;
                        } else {
                          stackOut_53_0 = (bs) ((Object) stackIn_53_0);
                          stackOut_53_1 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          break L19;
                        }
                      }
                      ((bs) (Object) stackIn_55_0).a(stackIn_55_1 != 0, param2, param0 + 67);
                      this.a(param1, (byte) 45, this.field_r, param5);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  this.field_C = -param4;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_C = -param4;
                this.a(param1, (byte) -82, this.field_r, param5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_C = param4;
              this.a(param1, (byte) -114, this.field_x, param5);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var7);
            stackOut_58_1 = new StringBuilder().append("ud.I(").append(param0).append(',').append(param1).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param2 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L20;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L20;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static void a(int param0, int param1, int param2, int param3, wb[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (-1 <= (param1 ^ -1)) {
                  break L1;
                } else {
                  var5_int = param4[0].field_z;
                  var6 = param4[2].field_z;
                  var7 = param4[1].field_z;
                  param4[0].a(param3, param0);
                  param4[param2].a(-var6 + (param1 + param3), param0);
                  lk.b(mo.field_t);
                  lk.e(param3 + var5_int, param0, -var6 + param3 - -param1, param4[1].field_w + param0);
                  var8 = param3 + var5_int;
                  var9 = param1 + param3 + -var6;
                  param3 = var8;
                  L2: while (true) {
                    L3: {
                      if (param3 >= var9) {
                        lk.a(mo.field_t);
                        break L3;
                      } else {
                        param4[1].a(param3, param0);
                        param3 = param3 + var7;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ud.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, bs param2, int param3) {
        try {
            param2.a((byte) -86, -1, param3);
            param2.b(param0, 0);
            int var5_int = -21 / ((param1 - -28) / 47);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ud.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -43) {
            return;
        }
        this.field_B = param1;
    }

    private final void a(bs param0, int param1, bs param2) {
        int discarded$0 = 0;
        try {
            if (param1 > -55) {
                discarded$0 = this.d();
            }
            this.field_o = 1048576;
            this.field_r = param0;
            this.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ud.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final hj c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (-1 <= (this.field_o ^ -1)) {
            if ((this.field_o ^ -1) <= -1048577) {
              break L0;
            } else {
              if (null == this.field_y) {
                break L0;
              } else {
                this.field_r.a(param0);
                break L0;
              }
            }
          } else {
            if ((this.field_o ^ -1) <= -1048577) {
              break L0;
            } else {
              if (null == this.field_y) {
                break L0;
              } else {
                this.field_r.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_z) {
            break L1;
          } else {
            if (this.field_t == null) {
              break L1;
            } else {
              this.field_D.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_u) {
            break L2;
          } else {
            L3: {
              L4: {
                if ((this.field_C ^ -1) >= -1) {
                  break L4;
                } else {
                  if (!this.field_x.c(-8192)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (0 <= this.field_C) {
                break L2;
              } else {
                if (!this.field_r.c(-8192)) {
                  this.field_C = -this.field_C;
                  this.field_y = null;
                  this.field_u = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
            }
            this.field_C = -this.field_C;
            this.field_u = false;
            this.field_v = null;
            break L2;
          }
        }
        L5: {
          if (this.field_C != 0) {
            L6: {
              this.field_o = this.field_o + this.field_C * param0;
              if ((this.field_o ^ -1) > -1048577) {
                break L6;
              } else {
                this.field_o = 1048576;
                if (!this.field_u) {
                  this.field_C = 0;
                  if (!this.field_w) {
                    L7: {
                      if (this.field_y != null) {
                        this.field_r.e(0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_y = null;
                    if (var3 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (0 < this.field_o) {
              break L5;
            } else {
              this.field_o = 0;
              if (!this.field_u) {
                this.field_C = 0;
                if (this.field_w) {
                  break L5;
                } else {
                  L8: {
                    if (this.field_v == null) {
                      break L8;
                    } else {
                      this.field_x.e(0);
                      break L8;
                    }
                  }
                  this.field_v = null;
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

    final synchronized int d() {
        return 2;
    }

    final hj a() {
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
        int stackIn_50_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (-1 > (this.field_B ^ -1)) {
              L1: {
                if (!this.field_u) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (0 >= this.field_C) {
                        break L3;
                      } else {
                        if (!this.field_x.c(-8192)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (0 <= this.field_C) {
                      break L1;
                    } else {
                      if (!this.field_r.c(-8192)) {
                        this.field_y = null;
                        this.field_C = -this.field_C;
                        this.field_u = false;
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
                  this.field_u = false;
                  this.field_C = -this.field_C;
                  this.field_v = null;
                  break L1;
                }
              }
              L4: {
                var4_int = (this.field_o >> -610152532) * this.field_B / 256;
                var5 = this.field_B - var4_int;
                if (-1 == (this.field_C ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    this.field_o = this.field_o + this.field_C * param2;
                    if (this.field_o < 1048576) {
                      break L5;
                    } else {
                      this.field_o = 1048576;
                      if (!this.field_u) {
                        this.field_C = 0;
                        if (!this.field_w) {
                          L6: {
                            if (null == this.field_y) {
                              break L6;
                            } else {
                              this.field_r.e(0);
                              break L6;
                            }
                          }
                          this.field_y = null;
                          if (var11 == 0) {
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
                    }
                  }
                  if (0 < this.field_o) {
                    break L4;
                  } else {
                    this.field_o = 0;
                    if (this.field_u) {
                      break L4;
                    } else {
                      this.field_C = 0;
                      if (!this.field_w) {
                        L7: {
                          if (null != this.field_v) {
                            this.field_x.e(0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        this.field_v = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L8: {
                if (du.field_o) {
                  stackOut_32_0 = param2 << 1771722849;
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
                if ((this.field_z ^ -1) <= -257) {
                  break L9;
                } else {
                  L10: {
                    if (this.field_v != null) {
                      break L10;
                    } else {
                      if (this.field_y == null) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if ((var4_int ^ -1) == -257) {
                      break L11;
                    } else {
                      L12: {
                        if (256 != var5) {
                          break L12;
                        } else {
                          this.field_r.b(param0, param1, param2);
                          if (var11 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          L15: {
                            if (this.field_s == null) {
                              break L15;
                            } else {
                              if (var6 <= this.field_s.length) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          this.field_s = new int[var6];
                          this.field_A = new int[var6];
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                        la.a(this.field_s, 0, var6);
                        la.a(this.field_A, 0, var6);
                        break L13;
                      }
                      L16: {
                        this.field_x.b(this.field_s, 0, param2);
                        this.field_r.b(this.field_A, 0, param2);
                        if (!du.field_o) {
                          stackOut_49_0 = param1;
                          stackIn_50_0 = stackOut_49_0;
                          break L16;
                        } else {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L16;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L17: while (true) {
                        if (var8 >= var6) {
                          if (var11 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_A[var8] + var4_int * this.field_s[var8] >> -1622576056);
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
                  this.field_x.b(param0, param1, param2);
                  break L9;
                }
              }
              L18: {
                if (null == this.field_t) {
                  break L18;
                } else {
                  if (this.field_z == 0) {
                    break L18;
                  } else {
                    L19: {
                      L20: {
                        if (this.field_s == null) {
                          break L20;
                        } else {
                          if (var6 > this.field_s.length) {
                            break L20;
                          } else {
                            la.a(this.field_s, 0, var6);
                            if (var11 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      this.field_A = new int[var6];
                      this.field_s = new int[var6];
                      break L19;
                    }
                    L21: {
                      this.field_D.b(this.field_s, 0, param2);
                      if (du.field_o) {
                        param1 = param1 << 1;
                        stackOut_66_0 = param1 << 1;
                        stackIn_67_0 = stackOut_66_0;
                        break L21;
                      } else {
                        stackOut_65_0 = param1;
                        stackIn_67_0 = stackOut_65_0;
                        break L21;
                      }
                    }
                    var7 = stackIn_67_0;
                    var8 = this.field_z * this.field_B / 256;
                    var9 = this.field_B - var8;
                    var10 = 0;
                    L22: while (true) {
                      if (var6 <= var10) {
                        break L18;
                      } else {
                        param0[var10 + var7] = this.field_s[var10] * var8 + param0[var10 + var7] * var9 >> -1592342008;
                        var10++;
                        if (var11 != 0) {
                          break L18;
                        } else {
                          continue L22;
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
          L23: {
            var4 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var4);
            stackOut_73_1 = new StringBuilder().append("ud.J(");
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ud(bs param0, bs param1) {
        this.field_B = 256;
        this.field_w = false;
        this.field_z = 0;
        try {
            this.a(param1, -79, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
