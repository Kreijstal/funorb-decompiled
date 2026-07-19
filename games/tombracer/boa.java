/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class boa extends dg {
    private int field_m;
    static pl field_s;
    static long field_t;
    private fla field_w;
    private int field_v;
    static int[] field_n;
    private fla field_r;
    private fla field_q;
    private fla field_x;
    private fla field_u;
    static float[] field_y;
    private int field_p;
    static int field_o;

    final void a(int param0, la param1, kh param2) {
        try {
            if (param0 <= 119) {
                boa.a(false);
            }
            super.a(122, param1, param2);
            this.field_v = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        fla discarded$4 = null;
        fla discarded$5 = null;
        int var4 = 0;
        w var5 = null;
        super.a((byte) 97, param1);
        this.a(28).b(false).a(this.field_h.e(9648), this.field_h.g((byte) 115), (byte) 46, this.field_h.d(3));
        var5 = (w) ((Object) this.a(30).field_G);
        if (var5 != null) {
          L0: {
            L1: {
              var4 = -67 / ((7 - param0) / 36);
              if (-1 != (this.field_v ^ -1)) {
                break L1;
              } else {
                discarded$4 = var5.a(new fm(3, this.b((byte) -118), this.c((byte) 95), this.e((byte) -89)), -58);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            discarded$5 = var5.a(new fm(2, this.b((byte) -122), this.c((byte) 109), this.e((byte) -97)), -58);
            break L0;
          }
          L2: {
            if (null == this.field_r) {
              break L2;
            } else {
              this.field_r.a(-98, var5);
              this.field_r = null;
              break L2;
            }
          }
          L3: {
            if (this.field_q != null) {
              this.field_q.a(-111, var5);
              this.field_q = null;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == this.field_x) {
              break L4;
            } else {
              this.field_x.a(27, var5);
              this.field_x = null;
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, uw param1) {
        w var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            super.a(-61, param1);
            var3 = (w) ((Object) this.a(21).field_G);
            if (var3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_r == null) {
                  break L1;
                } else {
                  this.field_r.a(50, var3);
                  this.field_r = null;
                  break L1;
                }
              }
              if (param0 < -39) {
                L2: {
                  if (null != this.field_q) {
                    this.field_q.a(-89, var3);
                    this.field_q = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_x == null) {
                    break L3;
                  } else {
                    this.field_x.a(117, var3);
                    this.field_x = null;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("boa.IA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2);
                if (param2 instanceof mra) {
                  break L2;
                } else {
                  L3: {
                    if (4194304 != param0.c(-92)) {
                      break L3;
                    } else {
                      if ((param0.a((byte) 55) ^ -1) != -4194305) {
                        break L3;
                      } else {
                        this.field_v = 10;
                        if (!TombRacer.field_G) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  break L1;
                }
              }
              this.field_v = 8;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("boa.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          L5: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param0 <= 104) {
            field_o = 62;
        }
        this.field_v = param1;
    }

    boa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 1;
        this.field_p = 1;
    }

    private final boolean i(int param0) {
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (param0 == 77) {
            break L0;
          } else {
            this.a(42, (la) null, (kh) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_v ^ -1) == -6) {
              break L2;
            } else {
              if (8 == this.field_v) {
                break L2;
              } else {
                if (-11 == (this.field_v ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_v ^ -1) == -12) {
                    break L2;
                  } else {
                    if (-13 == (this.field_v ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_v == 13) {
                        break L2;
                      } else {
                        if ((this.field_v ^ -1) == -15) {
                          break L2;
                        } else {
                          if (-16 == (this.field_v ^ -1)) {
                            break L2;
                          } else {
                            if (-17 != (this.field_v ^ -1)) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_12_0 = 1;
          stackIn_14_0 = stackOut_12_0;
          break L1;
        }
        return stackIn_14_0 != 0;
    }

    public static void a(boolean param0) {
        field_y = null;
        if (param0) {
            return;
        }
        field_s = null;
        field_n = null;
    }

    final void d(int param0) {
        fla discarded$1 = null;
        fsa var3 = null;
        int var4 = 0;
        int var7_int = 0;
        nv var7 = null;
        nv var8_ref_nv = null;
        int var8 = 0;
        pc var9 = null;
        int var10 = 0;
        w var11 = null;
        vna var12 = null;
        uja var13 = null;
        vna var14 = null;
        uja var15 = null;
        vna var16 = null;
        uja var17 = null;
        boolean stackIn_23_0 = false;
        int stackIn_28_0 = 0;
        boolean stackIn_44_0 = false;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        boolean stackIn_97_0 = false;
        boolean stackOut_22_0 = false;
        int stackOut_27_0 = 0;
        boolean stackOut_43_0 = false;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_67_0 = 0;
        boolean stackOut_71_0 = false;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        boolean stackOut_96_0 = false;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = (w) ((Object) this.a(111).field_G);
        if (var11 != null) {
          L0: {
            L1: {
              L2: {
                var3 = (fsa) ((Object) this.field_h);
                var4 = var3.d(50, false) ? 1 : 0;
                if (this.field_r == null) {
                  break L2;
                } else {
                  if (this.field_r.l((byte) -116)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == 0) {
                break L1;
              } else {
                L3: {
                  if (!this.i(param0 ^ -78)) {
                    break L3;
                  } else {
                    this.field_r = var11.a(new fm(0, this.b((byte) -113), this.c((byte) 118), this.e((byte) -114)), -58);
                    if (var10 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-10 == (this.field_v ^ -1)) {
                    break L4;
                  } else {
                    this.field_r = var11.a(new fm(1, this.b((byte) 39), this.c((byte) 92), this.e((byte) -109)), -58);
                    if (var10 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_r = var11.a(new fm(4, this.b((byte) -112), this.c((byte) 92), this.e((byte) -87)), -58);
                if (var10 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (null == this.field_r) {
              break L0;
            } else {
              if (var4 == 0) {
                this.field_r.a(-96, var11);
                this.field_r = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L5: {
            if (11 == this.field_v) {
              var12 = var3.field_u;
              var13 = new uja(var12);
              var7_int = 0;
              var8_ref_nv = (nv) ((Object) var13.a(true));
              L6: while (true) {
                L7: {
                  L8: {
                    if (var8_ref_nv == null) {
                      break L8;
                    } else {
                      stackOut_22_0 = var8_ref_nv instanceof ska;
                      stackIn_28_0 = stackOut_22_0 ? 1 : 0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var10 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_23_0) {
                            var7_int = var7_int != 0 | ((ska) ((Object) var8_ref_nv)).g((byte) -68) ? 1 : 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var8_ref_nv = (nv) ((Object) var13.a(-1));
                        if (var10 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = var7_int;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                }
                L10: {
                  L11: {
                    if (stackIn_28_0 == 0) {
                      break L11;
                    } else {
                      L12: {
                        if (this.field_x == null) {
                          break L12;
                        } else {
                          if (this.field_x.l((byte) -100)) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      this.field_x = var11.a(new fm(5, this.b((byte) -97), this.c((byte) 107), this.e((byte) -107)), -58);
                      if (var10 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (var7_int != 0) {
                    break L10;
                  } else {
                    if (null != this.field_x) {
                      discarded$1 = var11.a(new fm(6, this.b((byte) 117), this.c((byte) 108), this.e((byte) -116)), -58);
                      this.field_x.a(81, var11);
                      this.field_x = null;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (null == this.field_x) {
                  break L5;
                } else {
                  this.field_x.a(this.b((byte) -114), var11.field_c, -128, var11.field_h, this.c((byte) 105));
                  break L5;
                }
              }
            } else {
              break L5;
            }
          }
          L13: {
            L14: {
              if (16 != this.field_v) {
                break L14;
              } else {
                var14 = var3.field_u;
                var15 = new uja(var14);
                var7 = (nv) ((Object) var15.a(true));
                L15: while (true) {
                  if (var7 == null) {
                    break L14;
                  } else {
                    stackOut_43_0 = var7 instanceof ov;
                    stackIn_68_0 = stackOut_43_0 ? 1 : 0;
                    stackIn_44_0 = stackOut_43_0;
                    if (var10 != 0) {
                      break L13;
                    } else {
                      L16: {
                        if (!stackIn_44_0) {
                          break L16;
                        } else {
                          L17: {
                            if (((ov) ((Object) var7)).b(-98)) {
                              break L17;
                            } else {
                              if (null == this.field_w) {
                                break L16;
                              } else {
                                this.field_w.a(-94, var11);
                                this.field_w = null;
                                if (var10 == 0) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var8 = 1;
                          var9 = ((ov) ((Object) var7)).c(param0 ^ -105);
                          L18: while (true) {
                            L19: {
                              L20: {
                                if (var9.field_h == null) {
                                  break L20;
                                } else {
                                  stackOut_51_0 = 4;
                                  stackOut_51_1 = var8;
                                  stackIn_59_0 = stackOut_51_0;
                                  stackIn_59_1 = stackOut_51_1;
                                  stackIn_52_0 = stackOut_51_0;
                                  stackIn_52_1 = stackOut_51_1;
                                  if (var10 != 0) {
                                    break L19;
                                  } else {
                                    if (stackIn_52_0 <= stackIn_52_1) {
                                      break L20;
                                    } else {
                                      var9 = var9.field_h;
                                      var8++;
                                      if (var10 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                              L21: {
                                if (this.field_w == null) {
                                  break L21;
                                } else {
                                  if (var8 != this.field_m) {
                                    break L21;
                                  } else {
                                    if (!this.field_w.l((byte) 91)) {
                                      break L21;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              stackOut_58_0 = this.field_m ^ -1;
                              stackOut_58_1 = var8 ^ -1;
                              stackIn_59_0 = stackOut_58_0;
                              stackIn_59_1 = stackOut_58_1;
                              break L19;
                            }
                            L22: {
                              if (stackIn_59_0 > stackIn_59_1) {
                                var11.a(-92, new fm(var8 - 2 + 34, this.b((byte) 30), this.c((byte) 105), this.e((byte) -105)));
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              this.field_m = var8;
                              if (null != this.field_w) {
                                this.field_w.a(-119, var11);
                                this.field_w = null;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            this.field_w = var11.a(new fm(29 - -this.field_m - 1, this.b((byte) -80), this.c((byte) 109), this.e((byte) -97)), -58);
                            break L16;
                          }
                        }
                      }
                      var7 = (nv) ((Object) var15.a(-1));
                      if (var10 == 0) {
                        continue L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
              }
            }
            stackOut_67_0 = this.field_v;
            stackIn_68_0 = stackOut_67_0;
            break L13;
          }
          L24: {
            L25: {
              if (stackIn_68_0 != 15) {
                break L25;
              } else {
                var16 = var3.field_u;
                var17 = new uja(var16);
                var7 = (nv) ((Object) var17.a(true));
                L26: while (true) {
                  if (var7 == null) {
                    break L25;
                  } else {
                    stackOut_71_0 = var7 instanceof ov;
                    stackIn_97_0 = stackOut_71_0;
                    stackIn_72_0 = stackOut_71_0;
                    if (var10 != 0) {
                      break L24;
                    } else {
                      L27: {
                        if (stackIn_72_0) {
                          L28: {
                            if (((ov) ((Object) var7)).b(-19)) {
                              break L28;
                            } else {
                              if (this.field_u != null) {
                                this.field_u.a(param0 + -100, var11);
                                this.field_u = null;
                                if (var10 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              } else {
                                break L27;
                              }
                            }
                          }
                          var8 = 1;
                          var9 = ((ov) ((Object) var7)).c(param0 ^ -110);
                          L29: while (true) {
                            L30: {
                              L31: {
                                if (var9.field_h == null) {
                                  break L31;
                                } else {
                                  stackOut_80_0 = var8;
                                  stackOut_80_1 = 4;
                                  stackIn_88_0 = stackOut_80_0;
                                  stackIn_88_1 = stackOut_80_1;
                                  stackIn_81_0 = stackOut_80_0;
                                  stackIn_81_1 = stackOut_80_1;
                                  if (var10 != 0) {
                                    break L30;
                                  } else {
                                    if (stackIn_81_0 >= stackIn_81_1) {
                                      break L31;
                                    } else {
                                      var9 = var9.field_h;
                                      var8++;
                                      if (var10 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                              }
                              L32: {
                                if (null == this.field_u) {
                                  break L32;
                                } else {
                                  if ((var8 ^ -1) != (this.field_p ^ -1)) {
                                    break L32;
                                  } else {
                                    if (this.field_u.l((byte) -90)) {
                                      break L27;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                              }
                              stackOut_87_0 = var8 ^ -1;
                              stackOut_87_1 = this.field_p ^ -1;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L30;
                            }
                            L33: {
                              if (stackIn_88_0 < stackIn_88_1) {
                                var11.a(-104, new fm(var8 + -2 + 44, this.b((byte) -85), this.c((byte) 125), this.e((byte) -117)));
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            L34: {
                              this.field_p = var8;
                              if (this.field_u != null) {
                                this.field_u.a(-123, var11);
                                this.field_u = null;
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                            this.field_u = var11.a(new fm(39 - -this.field_p + -1, this.b((byte) 87), this.c((byte) 127), this.e((byte) -111)), -58);
                            break L27;
                          }
                        } else {
                          break L27;
                        }
                      }
                      var7 = (nv) ((Object) var17.a(-1));
                      if (var10 == 0) {
                        continue L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
              }
            }
            stackOut_96_0 = var3.j(param0);
            stackIn_97_0 = stackOut_96_0;
            break L24;
          }
          L35: {
            L36: {
              if (!stackIn_97_0) {
                break L36;
              } else {
                if (null != this.field_q) {
                  break L36;
                } else {
                  this.field_q = var11.a(new fm(7, this.b((byte) 122), this.c((byte) 92), this.e((byte) -99)), param0 ^ 57);
                  if (var10 == 0) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
            }
            if (var3.j(-1)) {
              break L35;
            } else {
              if (null != this.field_q) {
                this.field_q.a(66, var11);
                this.field_q = null;
                break L35;
              } else {
                break L35;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -100, param1);
            param1.a((byte) 42, this.field_v, 4);
            int var3_int = 108 / ((param0 - -8) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        super.h(106);
        if (param0 <= 0) {
            field_n = (int[]) null;
        }
    }

    boa(int param0) {
        super(param0);
        this.field_m = 1;
        this.field_p = 1;
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 38 % ((param4 - -38) / 47);
              var7 = 0;
              var8 = null;
              var9 = this.field_v;
              if (var9 == 0) {
                var8 = df.field_J[4];
                break L1;
              } else {
                if (1 == var9) {
                  var8 = df.field_J[5];
                  break L1;
                } else {
                  if (var9 == 2) {
                    var8 = df.field_J[7];
                    break L1;
                  } else {
                    if (-4 == (var9 ^ -1)) {
                      var8 = df.field_J[9];
                      var7 = 4096;
                      break L1;
                    } else {
                      if (var9 == 4) {
                        var8 = df.field_J[8];
                        break L1;
                      } else {
                        L2: {
                          if ((var9 ^ -1) != -6) {
                            break L2;
                          } else {
                            if (var10 == 0) {
                              L3: {
                                var9 = 77;
                                if (this.field_g < 33) {
                                  var9 = 77;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              L4: {
                                L5: {
                                  if ((this.field_g ^ -1) > -67) {
                                    break L5;
                                  } else {
                                    var9 = 79;
                                    if (var10 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var9 = 78;
                                break L4;
                              }
                              var8 = df.field_J[var9];
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        if ((var9 ^ -1) == -9) {
                          var8 = df.field_J[6];
                          break L1;
                        } else {
                          if (9 == var9) {
                            var7 = 2048;
                            var8 = df.field_J[27];
                            break L1;
                          } else {
                            L6: {
                              if ((var9 ^ -1) != -11) {
                                break L6;
                              } else {
                                if (var10 == 0) {
                                  var8 = df.field_J[70];
                                  break L1;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if ((var9 ^ -1) != -13) {
                                break L7;
                              } else {
                                if (var10 == 0) {
                                  var8 = df.field_J[12];
                                  break L1;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var9 != 11) {
                                break L8;
                              } else {
                                if (var10 == 0) {
                                  var8 = df.field_J[11];
                                  break L1;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (-14 != (var9 ^ -1)) {
                                break L9;
                              } else {
                                if (var10 == 0) {
                                  var8 = df.field_J[13];
                                  break L1;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (-15 != (var9 ^ -1)) {
                                break L10;
                              } else {
                                if (var10 == 0) {
                                  var8 = df.field_J[14];
                                  break L1;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (-16 == (var9 ^ -1)) {
                              var8 = df.field_J[15];
                              break L1;
                            } else {
                              if (16 == var9) {
                                var8 = df.field_J[16];
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L11: {
              if (var8 == null) {
                break L11;
              } else {
                var9 = dfa.a(4096 + (var7 - this.field_h.g(-25787)) >> 2111911170, 2048, -28);
                gqa.a(var9, -83584144, param1, param2, (ka) (var8), param3);
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var6);
            stackOut_53_1 = new StringBuilder().append("boa.D(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L12;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_t = 0L;
        field_y = new float[4];
        field_s = new pl(3);
        field_o = 0;
    }
}
