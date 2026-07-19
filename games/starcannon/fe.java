/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fe extends dk {
    private int field_B;
    private boolean field_I;
    private int field_D;
    static hl field_H;
    private long field_E;
    private long field_F;
    private int field_A;
    private boolean field_G;
    private int field_C;
    static td[] field_J;

    private final void h(boolean param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        uj var3 = null;
        if (!(this.field_g instanceof si)) {
          if (param0) {
            var3 = (uj) null;
            discarded$4 = this.a((uj) null, 'z', (byte) -18, -33);
            return;
          } else {
            return;
          }
        } else {
          ((si) ((Object) this.field_g)).a(false, (fe) (this));
          if (!param0) {
            return;
          } else {
            var3 = (uj) null;
            discarded$5 = this.a((uj) null, 'z', (byte) -18, -33);
            return;
          }
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          this.field_C = 3;
          this.g(true);
          this.e((byte) -113);
          return;
        } else {
          this.g(true);
          this.e((byte) -113);
          return;
        }
    }

    private final void e(int param0) {
        bd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lg var9 = null;
        var8 = StarCannon.field_A;
        if (!this.field_I) {
          this.field_n = 0;
          this.field_q = 0;
          return;
        } else {
          if (this.field_o instanceof lg) {
            var9 = (lg) ((Object) this.field_o);
            var3 = var9.a((uj) (this), (byte) -106);
            var4 = var3.c(param0 + 101);
            var5 = var9.b(91, (uj) (this));
            var6 = var9.a(param0 + param0) >> -1681125119;
            if (var5 + -var6 > var4) {
              this.field_n = 0;
              this.field_q = 0;
              return;
            } else {
              var7 = this.field_n + var3.a((byte) -30, this.field_B);
              if (var7 <= -var6 + var5) {
                if (var7 < var6) {
                  this.field_n = -var7 + (var6 + this.field_n);
                  if (this.field_n <= 0) {
                    if (var6 + -var5 <= this.field_n) {
                      return;
                    } else {
                      this.field_n = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_n = 0;
                    return;
                  }
                } else {
                  if (this.field_n <= 0) {
                    if (var6 + -var5 <= this.field_n) {
                      return;
                    } else {
                      this.field_n = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_n = 0;
                    return;
                  }
                }
              } else {
                this.field_n = this.field_n - var7 - (var6 + -var5);
                if (this.field_n <= 0) {
                  if (var6 + -var5 <= this.field_n) {
                    return;
                  } else {
                    this.field_n = var6 + -var5;
                    return;
                  }
                } else {
                  this.field_n = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        if (-1 != (this.field_B ^ -1)) {
          var2 = -1 + this.field_B;
          L0: while (true) {
            if (0 < var2) {
              if (32 != this.field_k.charAt(var2 + -1)) {
                var2--;
                continue L0;
              } else {
                var3 = -16 / ((54 - param0) / 61);
                return var2;
              }
            } else {
              var3 = -16 / ((54 - param0) / 61);
              return var2;
            }
          }
        } else {
          return this.field_B;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        boolean discarded$1 = false;
        long var6 = 0L;
        uj var8 = null;
        lg var9 = null;
        lg var11 = null;
        lg var12 = null;
        if (param2 == 49) {
          if (null != this.field_o) {
            if (0 == param0) {
              this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (uj) (this));
              if (this.field_o instanceof lg) {
                var12 = (lg) ((Object) this.field_o);
                if (this.field_B == this.field_D) {
                  var6 = dd.b(74);
                  if (500L <= (-this.field_F + var6) % 1000L) {
                    return;
                  } else {
                    var12.a(-3, (uj) (this), param1, param3, this.field_B);
                    return;
                  }
                } else {
                  L0: {
                    var12.a(param3, param1, this.field_B, (uj) (this), (byte) 104, this.field_D);
                    var6 = dd.b(74);
                    if (500L > (-this.field_F + var6) % 1000L) {
                      var12.a(-3, (uj) (this), param1, param3, this.field_B);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var8 = (uj) null;
          discarded$1 = this.a((uj) null, '￑', (byte) 109, -100);
          if (null != this.field_o) {
            if (0 == param0) {
              this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (uj) (this));
              if (this.field_o instanceof lg) {
                var11 = (lg) ((Object) this.field_o);
                var9 = var11;
                if (this.field_B == this.field_D) {
                  var6 = dd.b(74);
                  if (500L <= (-this.field_F + var6) % 1000L) {
                    return;
                  } else {
                    var11.a(-3, (uj) (this), param1, param3, this.field_B);
                    return;
                  }
                } else {
                  L1: {
                    var11.a(param3, param1, this.field_B, (uj) (this), (byte) 104, this.field_D);
                    var6 = dd.b(74);
                    if (500L > (-this.field_F + var6) % 1000L) {
                      var11.a(-3, (uj) (this), param1, param3, this.field_B);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        try {
          L0: {
            L1: {
              this.field_F = dd.b(param2 ^ -2);
              if (param2 == -90) {
                break L1;
              } else {
                this.f(true);
                break L1;
              }
            }
            if (param1 == 60) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 62) {
                L2: {
                  if (param1 < 32) {
                    break L2;
                  } else {
                    if (param1 <= 126) {
                      L3: {
                        if (this.field_B == this.field_D) {
                          break L3;
                        } else {
                          this.e((byte) -106);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (0 == (this.field_A ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_k.length() < this.field_A) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (this.field_B >= this.field_k.length()) {
                            this.field_k = this.field_k + param1;
                            dupTemp$1 = this.field_k.length();
                            this.field_B = dupTemp$1;
                            this.field_D = dupTemp$1;
                            break L6;
                          } else {
                            this.field_k = this.field_k.substring(0, this.field_B) + param1 + this.field_k.substring(this.field_B, this.field_k.length());
                            this.field_B = this.field_B + 1;
                            this.field_D = this.field_B;
                            break L6;
                          }
                        }
                        this.f(true);
                        break L4;
                      }
                      stackOut_72_0 = 1;
                      stackIn_73_0 = stackOut_72_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  if (-86 != (param3 ^ -1)) {
                    if (101 == param3) {
                      if (this.field_D == this.field_B) {
                        if (this.field_B >= this.field_k.length()) {
                          break L7;
                        } else {
                          this.field_D = 1 + this.field_B;
                          this.e((byte) -109);
                          stackOut_61_0 = 1;
                          stackIn_62_0 = stackOut_61_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        this.e((byte) -97);
                        stackOut_58_0 = 1;
                        stackIn_59_0 = stackOut_58_0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    } else {
                      if ((param3 ^ -1) == -14) {
                        this.i(19293);
                        stackOut_55_0 = 1;
                        stackIn_56_0 = stackOut_55_0;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        if ((param3 ^ -1) == -97) {
                          if (0 >= this.field_B) {
                            break L7;
                          } else {
                            L8: {
                              stackOut_50_0 = this;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_51_0 = stackOut_50_0;
                              if (!wc.field_c[82]) {
                                stackOut_52_0 = this;
                                stackOut_52_1 = -1 + this.field_B;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                break L8;
                              } else {
                                stackOut_51_0 = this;
                                stackOut_51_1 = this.g((byte) 122);
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_53_1, 101);
                            stackOut_53_0 = 1;
                            stackIn_54_0 = stackOut_53_0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          }
                        } else {
                          if (param3 != 97) {
                            if (-103 != (param3 ^ -1)) {
                              if (-104 != (param3 ^ -1)) {
                                if ((param3 ^ -1) == -85) {
                                  this.h(false);
                                  stackOut_47_0 = 1;
                                  stackIn_48_0 = stackOut_47_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  L9: {
                                    if (!wc.field_c[82]) {
                                      break L9;
                                    } else {
                                      if (-66 == (param3 ^ -1)) {
                                        this.e(false);
                                        stackOut_45_0 = 1;
                                        stackIn_46_0 = stackOut_45_0;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!wc.field_c[82]) {
                                      break L10;
                                    } else {
                                      if (-67 != (param3 ^ -1)) {
                                        break L10;
                                      } else {
                                        this.g(true);
                                        stackOut_39_0 = 1;
                                        stackIn_40_0 = stackOut_39_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!wc.field_c[82]) {
                                    break L7;
                                  } else {
                                    if (-68 != (param3 ^ -1)) {
                                      break L7;
                                    } else {
                                      this.g(param2 + 89);
                                      stackOut_43_0 = 1;
                                      stackIn_44_0 = stackOut_43_0;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                this.a(this.field_k.length(), param2 + 191);
                                stackOut_31_0 = 1;
                                stackIn_32_0 = stackOut_31_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              this.a(0, 101);
                              stackOut_28_0 = 1;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            if (this.field_B >= this.field_k.length()) {
                              break L7;
                            } else {
                              L11: {
                                stackOut_22_0 = this;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if (!wc.field_c[82]) {
                                  stackOut_24_0 = this;
                                  stackOut_24_1 = this.field_B - -1;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  break L11;
                                } else {
                                  stackOut_23_0 = this;
                                  stackOut_23_1 = this.f(param2 ^ 89);
                                  stackIn_25_0 = stackOut_23_0;
                                  stackIn_25_1 = stackOut_23_1;
                                  break L11;
                                }
                              }
                              this.a(stackIn_25_1, 101);
                              stackOut_25_0 = 1;
                              stackIn_26_0 = stackOut_25_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (this.field_D == this.field_B) {
                      if (this.field_B <= 0) {
                        break L7;
                      } else {
                        this.field_D = this.field_B - 1;
                        this.e((byte) -123);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      this.e((byte) -94);
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var5);
            stackOut_76_1 = new StringBuilder().append("fe.EA(");
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L12;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L12;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_40_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_44_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_46_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_48_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_54_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_59_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      return stackIn_75_0 != 0;
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
                }
              }
            }
          }
        }
    }

    void f(boolean param0) {
        L0: {
          if (this.field_g instanceof si) {
            ((si) ((Object) this.field_g)).a(-4312, (fe) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          field_H = (hl) null;
          return;
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= -73) {
          L0: {
            this.a(-88, 64, (byte) -102, 68);
            if (this.field_D == this.field_B) {
              break L0;
            } else {
              L1: {
                if (this.field_B <= this.field_D) {
                  stackOut_13_0 = this.field_B;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = this.field_D;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (this.field_B > this.field_D) {
                  stackOut_16_0 = this.field_B;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = this.field_D;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              this.field_D = var2;
              this.field_B = var2;
              this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
              this.f(true);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_D == this.field_B) {
              break L3;
            } else {
              L4: {
                if (this.field_B <= this.field_D) {
                  stackOut_4_0 = this.field_B;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = this.field_D;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (this.field_B > this.field_D) {
                  stackOut_7_0 = this.field_B;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = this.field_D;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              this.field_D = var2;
              this.field_B = var2;
              this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
              this.f(true);
              break L3;
            }
          }
          return;
        }
    }

    final static void a(rf param0, rf param1, boolean param2) {
        try {
            if (!(param1.field_d == null)) {
                param1.b(4);
            }
            param1.field_d = param0.field_d;
            param1.field_a = param0;
            if (param2) {
                field_J = (td[]) null;
            }
            param1.field_d.field_a = param1;
            param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fe.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        var2 = this.field_k.length();
        if (var2 == this.field_B) {
          return this.field_B;
        } else {
          var3 = this.field_B - param0;
          L0: while (true) {
            if (var2 > var3) {
              if (this.field_k.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    private final void g(boolean param0) {
        try {
            String var2 = null;
            if (!param0) {
              L0: {
                this.h(false);
                var2 = this.h(-107);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(-110))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.h(-107);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(-110))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fe(String param0, qg param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_E = 0L;
        this.field_C = -1;
        try {
            this.field_A = param2;
            this.field_o = eh.field_j.field_c;
            this.a((byte) -91, true, param0);
            this.field_I = true;
            this.field_F = dd.b(84);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        this.field_B = 0;
        if (param0 != 19293) {
            return;
        }
        this.field_D = 0;
        this.field_k = "";
        this.f(true);
    }

    private final String h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -102) {
          return (String) null;
        } else {
          L0: {
            if (this.field_B > this.field_D) {
              stackOut_3_0 = this.field_D;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_B;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_D < this.field_B) {
              stackOut_6_0 = this.field_B;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_D;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_k.substring(var2, var3);
        }
    }

    private final void a(int param0, int param1) {
        L0: {
          this.field_B = param0;
          if (!wc.field_c[81]) {
            this.field_D = this.field_B;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 101) {
          this.field_C = -124;
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.e((byte) -106);
                if (param0 == -1) {
                  this.a(var2, 4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (0 == (this.field_A ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_A + -this.field_k.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var3_int = 67 % ((-58 - param1) / 50);
              if (this.field_B != this.field_k.length()) {
                this.field_k = this.field_k.substring(0, this.field_B) + param0 + this.field_k.substring(this.field_B, this.field_k.length());
                break L2;
              } else {
                this.field_k = this.field_k + param0;
                break L2;
              }
            }
            this.field_B = this.field_B + param0.length();
            this.field_D = this.field_B;
            this.f(true);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("fe.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        lg var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            super.a(60, param1, param2, param3);
            this.e(0);
            if (param0 >= 27) {
              L1: {
                if (this.field_l != 1) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_o instanceof lg) {
                      var7 = (lg) ((Object) this.field_o);
                      var6 = var7.a(pe.field_d, la.field_c, (uj) (this), param1, param3, true);
                      if (0 != (var6 ^ -1)) {
                        L3: {
                          if (!this.field_G) {
                            break L3;
                          } else {
                            if (var6 >= this.field_C) {
                              break L3;
                            } else {
                              if (this.field_D < var6) {
                                var6 = this.field_C;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        this.field_B = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  this.field_F = dd.b(122);
                  break L1;
                }
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
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("fe.U(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_o instanceof lg) {
                L1: {
                  var8_int = ((lg) ((Object) this.field_o)).a(pe.field_d, la.field_c, (uj) (this), param2, param3, true);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var8_int == -1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = var8_int;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, 101);
                  var8_long = dd.b(param4 + 137);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-251L >= (var8_long + -this.field_E ^ -1L)) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((fe) (this)).field_G = stackIn_10_1 != 0;
                  if (!this.field_G) {
                    break L3;
                  } else {
                    L4: {
                      this.field_D = this.g((byte) 124);
                      this.field_B = this.f(-1);
                      if (0 >= this.field_B) {
                        break L4;
                      } else {
                        if (this.field_k.charAt(-1 + this.field_B) != 32) {
                          break L4;
                        } else {
                          this.field_B = this.field_B - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_C = this.field_B;
                    break L3;
                  }
                }
                this.field_E = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("fe.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              this.field_k = param2;
              var4_int = param2.length();
              if (0 == (this.field_A ^ -1)) {
                break L2;
              } else {
                if (this.field_A >= var4_int) {
                  break L2;
                } else {
                  this.field_k = this.field_k.substring(0, this.field_A);
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == -91) {
                break L3;
              } else {
                var5 = (String) null;
                this.a((byte) 3, true, (String) null);
                break L3;
              }
            }
            dupTemp$2 = this.field_k.length();
            this.field_D = dupTemp$2;
            this.field_B = dupTemp$2;
            if (param1) {
              break L0;
            } else {
              this.f(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("fe.HA(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public static void f(byte param0) {
        field_H = null;
        if (param0 != 73) {
            field_H = (hl) null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    static {
    }
}
