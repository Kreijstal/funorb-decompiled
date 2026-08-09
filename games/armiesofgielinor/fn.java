/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fn extends fw {
    static int field_M;
    private int field_O;
    private int field_L;
    static int[] field_Q;
    private int field_V;
    private long field_T;
    private int field_R;
    private long field_U;
    private boolean field_P;
    static String field_S;
    private boolean field_N;

    private final String o(int param0) {
        if (param0 >= -58) {
            return (String) null;
        }
        int var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
        int var3 = this.field_O > this.field_L ? this.field_O : this.field_L;
        return this.field_v.substring(var2, var3);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        } else {
          var2 = -1 + this.field_O;
          var3 = -88 / ((param0 - 11) / 55);
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (-33 == (this.field_v.charAt(var2 + -1) ^ -1)) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        if (!param0) {
            this.field_V = 32;
        }
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 1000) {
            return;
        }
        if (this.field_L != this.field_O) {
            var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
            var3 = this.field_O <= this.field_L ? this.field_L : this.field_O;
            this.field_L = var2;
            this.field_O = var2;
            this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
            this.d((byte) -123);
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        pm var5 = null;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.l(param0 + -32722);
            if (1 == this.field_q) {
                if (!(!(this.field_k instanceof pm))) {
                    var5 = (pm) ((Object) this.field_k);
                    var6 = var5.a((kb) (this), sm.field_d, 113, param2, ko.field_b, param1);
                    if (var6 != -1) {
                        if (this.field_P && this.field_V > var6 && var6 > this.field_L) {
                            var6 = this.field_V;
                        }
                        this.field_O = var6;
                    }
                }
                this.field_U = vi.b(98);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fn.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        if (param0 >= -46) {
            return;
        }
        if (this.field_x instanceof fb) {
            ((fb) ((Object) this.field_x)).a((fn) (this), 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == -27934) {
                break L1;
              } else {
                field_M = -84;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                param1 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_v = param1;
              var4_int = param1.length();
              if (this.field_R == -1) {
                break L3;
              } else {
                if (var4_int > this.field_R) {
                  this.field_v = this.field_v.substring(0, this.field_R);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$1 = this.field_v.length();
              this.field_L = dupTemp$1;
              this.field_O = dupTemp$1;
              if (param0) {
                break L4;
              } else {
                this.d((byte) -128);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("fn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        js var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = "";
              if (43 != param1) {
                break L1;
              } else {
                param1 = 77;
                break L1;
              }
            }
            if (param2 == -32596) {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  L3: {
                    if (-17 != (param1 ^ -1)) {
                      break L3;
                    } else {
                      param1 = 78;
                      break L3;
                    }
                  }
                  L4: {
                    if (-26 == (param1 ^ -1)) {
                      param1 = 79;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((param1 ^ -1) == -49) {
                      param1 = 80;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if ((param1 ^ -1) != -86) {
                    break L2;
                  } else {
                    param1 = 89;
                    break L2;
                  }
                }
              }
              L6: {
                if (param1 == 76) {
                  bn.field_a = new kk[mn.field_m[param1].length];
                  bn.field_a[0] = mn.field_k[param1][0];
                  break L6;
                } else {
                  break L6;
                }
              }
              var4 = 1;
              L7: while (true) {
                L8: {
                  if (var4 >= mn.field_m[param1].length) {
                    break L8;
                  } else {
                    if (null != mn.field_k[param1][var4]) {
                      break L8;
                    } else {
                      L9: {
                        var5 = mn.field_m[param1][var4];
                        var6 = hs.a(var5, param2 ^ -32697, var9);
                        if (var6 == null) {
                          break L9;
                        } else {
                          L10: {
                            if (th.a(var6, -17900)) {
                              nh.field_D[param1] = true;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (null != var6.field_p) {
                              var7 = 0;
                              L12: while (true) {
                                if (var7 >= var6.field_O) {
                                  break L11;
                                } else {
                                  L13: {
                                    if (-3 == (var6.field_p[var7] ^ -1)) {
                                      var6.field_q[var7] = 0;
                                      var6.field_o[var7] = 0;
                                      var6.field_r[var7] = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var7++;
                                  continue L12;
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                          L14: {
                            mn.field_k[param1][var4] = var6.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                            if (param1 == 76) {
                              bn.field_a[var4] = mn.field_k[param1][var4];
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          if (0 != ((gd) ((Object) mn.field_k[param1][var4])).field_I) {
                            break L9;
                          } else {
                            mn.field_k[param1] = null;
                            break L9;
                          }
                        }
                      }
                      var4++;
                      continue L7;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_U = vi.b(-82);
            if (param3 == -12215) {
              L1: {
                if (param2 == 60) {
                  break L1;
                } else {
                  if (param2 == 62) {
                    break L1;
                  } else {
                    L2: {
                      if (param2 < 32) {
                        break L2;
                      } else {
                        if (param2 <= 126) {
                          L3: {
                            if (this.field_O == this.field_L) {
                              break L3;
                            } else {
                              this.j(1000);
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (this.field_R == -1) {
                                break L5;
                              } else {
                                if (this.field_v.length() >= this.field_R) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (this.field_O >= this.field_v.length()) {
                                this.field_v = this.field_v + param2;
                                dupTemp$0 = this.field_v.length();
                                this.field_O = dupTemp$0;
                                this.field_L = dupTemp$0;
                                break L6;
                              } else {
                                this.field_v = this.field_v.substring(0, this.field_O) + param2 + this.field_v.substring(this.field_O, this.field_v.length());
                                this.field_O = this.field_O + 1;
                                this.field_L = this.field_O;
                                break L6;
                              }
                            }
                            this.d((byte) -123);
                            break L4;
                          }
                          stackIn_77_0 = 1;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (85 != param1) {
                      L7: {
                        if ((param1 ^ -1) == -102) {
                          if (this.field_L == this.field_O) {
                            if (this.field_O >= this.field_v.length()) {
                              break L7;
                            } else {
                              this.field_L = 1 + this.field_O;
                              this.j(1000);
                              stackIn_66_0 = 1;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            }
                          } else {
                            this.j(1000);
                            stackIn_63_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          }
                        } else {
                          if (param1 == 13) {
                            this.k(98);
                            stackIn_60_0 = 1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            if ((param1 ^ -1) != -97) {
                              if (-98 != (param1 ^ -1)) {
                                if ((param1 ^ -1) == -103) {
                                  this.a(0, (byte) -59);
                                  stackIn_58_0 = 1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (103 != param1) {
                                    if ((param1 ^ -1) != -85) {
                                      L8: {
                                        if (!br.field_f[82]) {
                                          break L8;
                                        } else {
                                          if (param1 != 65) {
                                            break L8;
                                          } else {
                                            this.b(true);
                                            stackIn_46_0 = 1;
                                            decompiledRegionSelector0 = 8;
                                            break L0;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (!br.field_f[82]) {
                                          break L9;
                                        } else {
                                          if ((param1 ^ -1) == -67) {
                                            this.a((byte) -53);
                                            stackIn_56_0 = 1;
                                            decompiledRegionSelector0 = 10;
                                            break L0;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (!br.field_f[82]) {
                                        break L7;
                                      } else {
                                        if (67 == param1) {
                                          this.f((byte) -104);
                                          stackIn_54_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    } else {
                                      this.n(-92);
                                      stackIn_42_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  } else {
                                    this.a(this.field_v.length(), (byte) -59);
                                    stackIn_39_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              } else {
                                if (this.field_O >= this.field_v.length()) {
                                  break L7;
                                } else {
                                  L10: {
                                    stackIn_33_0 = this;

                                    if (!br.field_f[82]) {
                                      stackIn_34_0 = this;
                                      stackIn_34_1 = this.field_O - -1;
                                      break L10;
                                    } else {
                                      stackIn_34_0 = this;
                                      stackIn_34_1 = this.p(-97);
                                      break L10;
                                    }
                                  }
                                  this.a(stackIn_34_1, (byte) -59);
                                  stackIn_35_0 = 1;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            } else {
                              if (this.field_O > 0) {
                                L11: {
                                  stackIn_26_0 = this;

                                  if (br.field_f[82]) {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = this.e((byte) 81);
                                    break L11;
                                  } else {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = -1 + this.field_O;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_27_1, (byte) -59);
                                stackIn_28_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackIn_79_0 = 0;
                      decompiledRegionSelector0 = 16;
                      break L0;
                    } else {
                      if (this.field_L != this.field_O) {
                        this.j(1000);
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (0 < this.field_O) {
                          this.field_L = -1 + this.field_O;
                          this.j(1000);
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var5);

            stackIn_82_1 = new StringBuilder().append("fn.F(");

            if (param0 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L12;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_42_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_46_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_54_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_56_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_66_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_77_0 != 0;
                                      } else {
                                        return stackIn_79_0 != 0;
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
    }

    final static void a(int param0, int param1, int param2, wk param3) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wk var16 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.i();
              var4_int = 0;
              var5 = param3.field_y / 2;
              if (param0 == 8678) {
                break L1;
              } else {
                var16 = (wk) null;
                fn.a(-106, -71, -114, (wk) null);
                break L1;
              }
            }
            L2: {
              var6 = param3.field_v / 2;
              if (var5 >= var6) {
                stackIn_6_0 = var6;
                break L2;
              } else {
                stackIn_6_0 = var5;
                break L2;
              }
            }
            var7 = stackIn_6_0;
            var8 = 0;
            L3: while (true) {
              if (param3.field_v <= var8) {
                break L0;
              } else {
                var9 = 0;
                L4: while (true) {
                  if (param3.field_y <= var9) {
                    var8++;
                    continue L3;
                  } else {
                    L5: {
                      var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 + -var6) * (-var6 + var8)));
                      if (param2 <= var10) {
                        var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
                        break L5;
                      } else {
                        var10 = param1;
                        break L5;
                      }
                    }
                    if (0 < var10) {
                      L6: {
                        var11 = param3.field_B[var4_int];
                        if (var11 != 1) {
                          break L6;
                        } else {
                          var11 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        var12 = (var11 & 16711680) - -(var10 << -1232173808);
                        var13 = (var11 & 65280) - -(var10 << 501192584);
                        if (-16711681 > (var12 ^ -1)) {
                          var12 = 16711680;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        var14 = (var11 & 255) - -var10;
                        if ((var13 ^ -1) >= -65281) {
                          break L8;
                        } else {
                          var13 = 65280;
                          break L8;
                        }
                      }
                      L9: {
                        if (255 < var14) {
                          var14 = 255;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      param3.field_B[var4_int] = oe.c(oe.c(var12, var13), var14);
                      var4_int++;
                      var9++;
                      continue L4;
                    } else {
                      var4_int++;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_P = false;
        this.field_V = -1;
        try {
            this.field_k = t.field_c.field_w;
            this.field_R = param2;
            this.a(true, param0, -27934);
            this.field_N = true;
            this.field_U = vi.b(-83);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        this.field_O = 0;
        this.field_L = 0;
        this.field_v = "";
        int var2 = 26 % ((33 - param0) / 36);
        this.d((byte) -126);
    }

    private final void l(int param0) {
        int discarded$0 = 0;
        ju var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pm var9;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_N) {
          if (this.field_k instanceof pm) {
            L0: {
              var9 = (pm) ((Object) this.field_k);
              var3 = var9.a(-100, (kb) (this));
              if (param0 == 0) {
                break L0;
              } else {
                discarded$0 = this.e((byte) -33);
                break L0;
              }
            }
            var4 = var3.a(false);
            var5 = var9.b(66, (kb) (this));
            var6 = var9.a(true) >> -1534463071;
            if (-var6 + var5 > var4) {
              this.field_z = 0;
              this.field_r = 0;
              return;
            } else {
              L1: {
                var7 = this.field_r + var3.a((byte) -66, this.field_O);
                if (var5 + -var6 < var7) {
                  this.field_r = this.field_r - var7 - var6 - -var5;
                  break L1;
                } else {
                  if (var7 < var6) {
                    this.field_r = this.field_r + (-var7 + var6);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_r ^ -1) >= -1) {
                  if (var6 + -var5 <= this.field_r) {
                    break L2;
                  } else {
                    this.field_r = var6 + -var5;
                    break L2;
                  }
                } else {
                  this.field_r = 0;
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_r = 0;
          this.field_z = 0;
          return;
        }
    }

    void d(byte param0) {
        if (!(!(this.field_x instanceof fb))) {
            ((fb) ((Object) this.field_x)).b((fn) (this), 111);
        }
        if (param0 >= -114) {
            this.field_R = -53;
        }
    }

    private final void a(byte param0) {
        String var2 = this.o(param0 ^ 108);
        if (param0 != -53) {
            return;
        }
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.o(-74))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_O = param0;
        if (!br.field_f[81]) {
            this.field_L = this.field_O;
        }
        if (param1 != -59) {
            this.n(-104);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int stackIn_2_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (param3 > 103) {
              if (!super.a(param0, param1, param2, 119, param4, param5, param6)) {
                stackIn_21_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (this.field_k instanceof pm) {
                  L1: {
                    var8_int = ((pm) ((Object) this.field_k)).a((kb) (this), sm.field_d, 87, param2, ko.field_b, param1);
                    stackIn_8_0 = this;

                    if ((var8_int ^ -1) != 0) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = var8_int;
                      break L1;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L1;
                    }
                  }
                  L2: {
                    this.a(stackIn_9_1, (byte) -59);
                    var8_long = vi.b(39);
                    stackIn_11_0 = this;

                    if (-this.field_T + var8_long >= 250L) {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 0;
                      break L2;
                    } else {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ((fn) (this)).field_P = stackIn_12_1 != 0;
                    if (!this.field_P) {
                      break L3;
                    } else {
                      L4: {
                        this.field_L = this.e((byte) -85);
                        this.field_O = this.p(-89);
                        if (-1 <= (this.field_O ^ -1)) {
                          break L4;
                        } else {
                          if (-33 == (this.field_v.charAt(this.field_O + -1) ^ -1)) {
                            this.field_O = this.field_O - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_V = this.field_O;
                      break L3;
                    }
                  }
                  this.field_T = var8_long;
                  stackIn_19_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var8);

            stackIn_24_1 = new StringBuilder().append("fn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    public static void m(int param0) {
        if (param0 != 32) {
            field_Q = (int[]) null;
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pm var8 = null;
        long var6 = 0L;
        if (param2 > -82) {
            return;
        }
        if (this.field_k != null) {
            if (!(-1 != (param3 ^ -1))) {
                this.field_k.a((kb) (this), param0, -128, this.field_I, param1);
                if (this.field_k instanceof pm) {
                    var8 = (pm) ((Object) this.field_k);
                    if (this.field_O != this.field_L) {
                        var8.a(-21259, this.field_O, this.field_L, (kb) (this), param1, param0);
                    }
                    var6 = vi.b(-126);
                    if (-501L < ((var6 + -this.field_U) % 1000L ^ -1L)) {
                        var8.a(param1, 1024, param0, (kb) (this), this.field_O);
                    }
                }
            }
        }
    }

    private final void f(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            kb var3 = null;
            try {
              L0: {
                L1: {
                  if (param0 == -104) {
                    break L1;
                  } else {
                    var3 = (kb) null;
                    this.a((kb) null, -59, 'x', 71);
                    break L1;
                  }
                }
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.j(param0 + 1104);
                this.a(var2, (byte) -114);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 == (this.field_R ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_R - this.field_v.length();
                if ((var3_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_O != this.field_v.length()) {
                this.field_v = this.field_v.substring(0, this.field_O) + param0 + this.field_v.substring(this.field_O, this.field_v.length());
                break L2;
              } else {
                this.field_v = this.field_v + param0;
                break L2;
              }
            }
            L3: {
              this.field_O = this.field_O + param0.length();
              this.field_L = this.field_O;
              if (param1 > -78) {
                this.field_L = 91;
                this.d((byte) -126);
                break L3;
              } else {
                this.d((byte) -126);
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("fn.BA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int p(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= -10) {
          var2 = this.field_v.length();
          if (this.field_O != var2) {
            var3 = this.field_O - -1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (this.field_v.charAt(-1 + var3) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return this.field_O;
          }
        } else {
          return -64;
        }
    }

    static {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
