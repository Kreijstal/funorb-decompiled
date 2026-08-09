/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends d {
    private int field_N;
    private int field_O;
    private boolean field_J;
    private boolean field_I;
    private int field_K;
    private long field_H;
    private int field_L;
    private long field_M;
    static int field_P;

    final void a(boolean param0, int param1, int param2, int param3) {
        qa var5;
        long var6;
        if (this.field_B != null) {
          if (0 == param1) {
            this.field_B.a(this.field_F, param2, true, (iq) (this), param3);
            if (this.field_B instanceof qa) {
              var5 = (qa) ((Object) this.field_B);
              if (this.field_K == this.field_L) {
                var6 = gk.a(126);
                if (500L <= (var6 - this.field_M) % 1000L) {
                  if (param0) {
                    this.field_K = -119;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var5.a(-94, this.field_K, param2, (iq) (this), param3);
                  if (param0) {
                    this.field_K = -119;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var5.a((iq) (this), this.field_K, param0, this.field_L, param3, param2);
                var6 = gk.a(126);
                if (500L <= (var6 - this.field_M) % 1000L) {
                  if (param0) {
                    this.field_K = -119;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var5.a(-94, this.field_K, param2, (iq) (this), param3);
                  if (!param0) {
                    return;
                  } else {
                    this.field_K = -119;
                    return;
                  }
                }
              }
            } else {
              if (param0) {
                this.field_K = -119;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0) {
              this.field_K = -119;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0) {
            this.field_K = -119;
            return;
          } else {
            return;
          }
        }
    }

    private final String h(int param0) {
        String discarded$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        int var3;
        if (param0 != 0) {
          L0: {
            discarded$0 = this.h(36);
            if (this.field_L >= this.field_K) {
              stackIn_11_0 = this.field_K;
              break L0;
            } else {
              stackIn_11_0 = this.field_L;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (this.field_K <= this.field_L) {
              stackIn_14_0 = this.field_L;
              break L1;
            } else {
              stackIn_14_0 = this.field_K;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return this.field_w.substring(var2, var3);
        } else {
          L2: {
            if (this.field_L >= this.field_K) {
              stackIn_4_0 = this.field_K;
              break L2;
            } else {
              stackIn_4_0 = this.field_L;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (this.field_K <= this.field_L) {
              stackIn_7_0 = this.field_L;
              break L3;
            } else {
              stackIn_7_0 = this.field_K;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return this.field_w.substring(var2, var3);
        }
    }

    private final int k(int param0) {
        String discarded$2 = null;
        int var2;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -27539) {
          var2 = this.field_w.length();
          if (var2 != this.field_K) {
            var3 = 1 + this.field_K;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_w.charAt(var3 + -1) ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_K;
          }
        } else {
          discarded$2 = this.h(-55);
          var2 = this.field_w.length();
          if (var2 != this.field_K) {
            var3 = 1 + this.field_K;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_w.charAt(var3 + -1) ^ -1)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_K;
          }
        }
    }

    private final void b(boolean param0) {
        ro var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qa var9;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (!this.field_J) {
          this.field_u = 0;
          this.field_y = 0;
          return;
        } else {
          if (param0) {
            if (this.field_B instanceof qa) {
              var9 = (qa) ((Object) this.field_B);
              var3 = var9.b((iq) (this), 64);
              var4 = var3.a(8783);
              var5 = var9.a(-1, (iq) (this));
              var6 = var9.a((byte) -91) >> -610322815;
              if (var4 < var5 + -var6) {
                this.field_y = 0;
                this.field_u = 0;
                return;
              } else {
                var7 = this.field_u + var3.b(this.field_K, 118);
                if (var7 > -var6 + var5) {
                  this.field_u = this.field_u + (var5 + -var6) + -var7;
                  if ((this.field_u ^ -1) >= -1) {
                    if (this.field_u < -var5 - -var6) {
                      this.field_u = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_u = 0;
                    return;
                  }
                } else {
                  if (var7 < var6) {
                    this.field_u = var6 - (var7 - this.field_u);
                    if ((this.field_u ^ -1) >= -1) {
                      if (this.field_u >= -var5 - -var6) {
                        return;
                      } else {
                        this.field_u = var6 + -var5;
                        return;
                      }
                    } else {
                      this.field_u = 0;
                      return;
                    }
                  } else {
                    if ((this.field_u ^ -1) >= -1) {
                      if (this.field_u >= -var5 - -var6) {
                        return;
                      } else {
                        this.field_u = var6 + -var5;
                        return;
                      }
                    } else {
                      this.field_u = 0;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void m(int param0) {
        int var3 = 0;
        int var2 = 0;
        if (!(this.field_K == this.field_L)) {
            var2 = this.field_K <= this.field_L ? this.field_K : this.field_L;
            var3 = this.field_L < this.field_K ? this.field_K : this.field_L;
            this.field_L = var2;
            this.field_K = var2;
            this.field_w = this.field_w.substring(0, var2) + this.field_w.substring(var3, this.field_w.length());
            this.h((byte) 34);
        }
        var2 = 55 / ((-22 - param0) / 32);
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (!(-1 == this.field_N)) {
            var3_int = this.field_N - this.field_w.length();
            if (!(var3_int < 0)) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_K != this.field_w.length()) {
            this.field_w = this.field_w.substring(0, this.field_K) + param0 + this.field_w.substring(this.field_K, this.field_w.length());
        } else {
            this.field_w = this.field_w + param0;
        }
        if (param1 <= 80) {
            return;
        }
        try {
            this.field_K = this.field_K + param0.length();
            this.field_L = this.field_K;
            this.h((byte) 32);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "kp.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        this.field_L = 0;
        this.field_w = "";
        this.field_K = param0;
        this.h((byte) 103);
    }

    void h(byte param0) {
        L0: {
          if (this.field_v instanceof ih) {
            ((ih) ((Object) this.field_v)).a(-122, (kp) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 16) {
          this.g((byte) -96);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        this.field_K = param0;
        if (param1 < -84) {
          if (!cr.field_eb[81]) {
            this.field_L = this.field_K;
            return;
          } else {
            return;
          }
        } else {
          this.a(true, -70, -56, -82);
          if (cr.field_eb[81]) {
            return;
          } else {
            this.field_L = this.field_K;
            return;
          }
        }
    }

    private final void e(byte param0) {
        this.f((byte) -127);
        this.m(55);
        if (param0 <= 0) {
            this.field_N = -70;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_w = param0;
              if (param1 < -71) {
                break L2;
              } else {
                var5 = (String) null;
                this.a((String) null, -67, false);
                break L2;
              }
            }
            L3: {
              var4_int = param0.length();
              if (-1 == this.field_N) {
                break L3;
              } else {
                if (var4_int > this.field_N) {
                  this.field_w = this.field_w.substring(0, this.field_N);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            dupTemp$1 = this.field_w.length();
            this.field_L = dupTemp$1;
            this.field_K = dupTemp$1;
            if (!param2) {
              this.h((byte) 29);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("kp.K(");

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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param5 <= -107) {
                break L1;
              } else {
                this.field_O = 102;
                break L1;
              }
            }
            L2: {
              if (!super.a(param0, param1, param2, param3, param4, (byte) -111, param6)) {
                break L2;
              } else {
                if (!(this.field_B instanceof qa)) {
                  break L2;
                } else {
                  L3: {
                    var8_int = ((qa) ((Object) this.field_B)).a(ed.field_n, param2, 101, param1, (iq) (this), gb.field_d);
                    stackIn_6_0 = this;

                    if (0 == (var8_int ^ -1)) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L3;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = var8_int;
                      break L3;
                    }
                  }
                  L4: {
                    this.a(stackIn_7_1, (byte) -126);
                    var8_long = gk.a(44);
                    stackIn_9_0 = this;

                    if (-this.field_H + var8_long >= 250L) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 0;
                      break L4;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    ((kp) (this)).field_I = stackIn_10_1 != 0;
                    if (!this.field_I) {
                      break L5;
                    } else {
                      L6: {
                        this.field_L = this.l(44);
                        this.field_K = this.k(-27539);
                        if (this.field_K <= 0) {
                          break L6;
                        } else {
                          if (32 == this.field_w.charAt(-1 + this.field_K)) {
                            this.field_K = this.field_K - 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_O = this.field_K;
                      break L5;
                    }
                  }
                  this.field_H = var8_long;
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_19_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("kp.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        qa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a((byte) 31, param1, param2, param3);
            if (param0 >= 6) {
              this.b(true);
              if (this.field_A == 1) {
                L1: {
                  if (!(this.field_B instanceof qa)) {
                    break L1;
                  } else {
                    var5 = (qa) ((Object) this.field_B);
                    var6 = var5.a(ed.field_n, param2, 106, param1, (iq) (this), gb.field_d);
                    if ((var6 ^ -1) != 0) {
                      L2: {
                        if (!this.field_I) {
                          break L2;
                        } else {
                          if (this.field_O <= var6) {
                            break L2;
                          } else {
                            if (var6 > this.field_L) {
                              var6 = this.field_O;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      this.field_K = var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_M = gk.a(57);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5_ref);

            stackIn_17_1 = new StringBuilder().append("kp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                this.field_O = -111;
                break L1;
              }
            }
            this.field_M = gk.a(77);
            if (param0 == 60) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L2: {
                  if (param0 < 32) {
                    break L2;
                  } else {
                    if (param0 > 126) {
                      break L2;
                    } else {
                      L3: {
                        if (this.field_K == this.field_L) {
                          break L3;
                        } else {
                          this.m(-126);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if ((this.field_N ^ -1) == 0) {
                            break L5;
                          } else {
                            if (this.field_w.length() >= this.field_N) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (this.field_K < this.field_w.length()) {
                            this.field_w = this.field_w.substring(0, this.field_K) + param0 + this.field_w.substring(this.field_K, this.field_w.length());
                            this.field_K = this.field_K + 1;
                            this.field_L = this.field_K;
                            break L6;
                          } else {
                            this.field_w = this.field_w + param0;
                            dupTemp$0 = this.field_w.length();
                            this.field_K = dupTemp$0;
                            this.field_L = dupTemp$0;
                            break L6;
                          }
                        }
                        this.h((byte) 26);
                        break L4;
                      }
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L7: {
                  if (param2 != 85) {
                    if (param2 != 101) {
                      if (param2 == 13) {
                        this.j(0);
                        stackIn_73_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        if ((param2 ^ -1) != -97) {
                          if (-98 == (param2 ^ -1)) {
                            if (this.field_K < this.field_w.length()) {
                              L8: {
                                stackIn_69_0 = this;

                                if (!cr.field_eb[82]) {
                                  stackIn_70_0 = this;
                                  stackIn_70_1 = this.field_K + 1;
                                  break L8;
                                } else {
                                  stackIn_70_0 = this;
                                  stackIn_70_1 = this.k(-27539);
                                  break L8;
                                }
                              }
                              this.a(stackIn_70_1, (byte) -117);
                              stackIn_71_0 = 1;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != 102) {
                              if (-104 == (param2 ^ -1)) {
                                this.a(this.field_w.length(), (byte) -116);
                                stackIn_64_0 = 1;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if (param2 == 84) {
                                  this.g((byte) 100);
                                  stackIn_62_0 = 1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  L9: {
                                    if (!cr.field_eb[82]) {
                                      break L9;
                                    } else {
                                      if ((param2 ^ -1) != -66) {
                                        break L9;
                                      } else {
                                        this.e((byte) 35);
                                        stackIn_52_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!cr.field_eb[82]) {
                                      break L10;
                                    } else {
                                      if (-67 != (param2 ^ -1)) {
                                        break L10;
                                      } else {
                                        this.f((byte) -127);
                                        stackIn_56_0 = 1;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!cr.field_eb[82]) {
                                    break L7;
                                  } else {
                                    if ((param2 ^ -1) != -68) {
                                      break L7;
                                    } else {
                                      this.i((byte) -35);
                                      stackIn_60_0 = 1;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.a(0, (byte) -127);
                              stackIn_46_0 = 1;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          if ((this.field_K ^ -1) >= -1) {
                            break L7;
                          } else {
                            L11: {
                              stackIn_40_0 = this;

                              if (!cr.field_eb[82]) {
                                stackIn_41_0 = this;
                                stackIn_41_1 = -1 + this.field_K;
                                break L11;
                              } else {
                                stackIn_41_0 = this;
                                stackIn_41_1 = this.l(-128);
                                break L11;
                              }
                            }
                            this.a(stackIn_41_1, (byte) -116);
                            stackIn_42_0 = 1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (this.field_K != this.field_L) {
                        this.m(-95);
                        stackIn_34_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (this.field_K >= this.field_w.length()) {
                          break L7;
                        } else {
                          this.field_L = 1 + this.field_K;
                          this.m(48);
                          stackIn_32_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (this.field_L != this.field_K) {
                      this.m(111);
                      stackIn_27_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (-1 > (this.field_K ^ -1)) {
                        this.field_L = this.field_K - 1;
                        this.m(-69);
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                stackIn_75_0 = 0;
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
            stackIn_78_0 = (RuntimeException) (var5);

            stackIn_78_1 = new StringBuilder().append("kp.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L12;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L12;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_46_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_52_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_56_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_60_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_64_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_71_0 != 0;
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

    private final int l(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (this.field_K != 0) {
          var2 = 22 % ((-64 - param0) / 62);
          var3 = this.field_K - 1;
          L0: while (true) {
            if (0 < var3) {
              if (this.field_w.charAt(-1 + var3) != 32) {
                var3--;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return this.field_K;
        }
    }

    kp(String param0, uf param1, int param2) {
        super(param0, param1);
        this.field_O = -1;
        this.field_H = 0L;
        this.field_I = false;
        try {
            this.field_B = eb.field_c.field_c;
            this.field_N = param2;
            this.a(param0, -103, true);
            this.field_J = true;
            this.field_M = gk.a(117);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "kp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void i(int param0) {
        if (!pm.field_a) {
          if (param0 != 0) {
            kp.i(-128);
            return;
          } else {
            return;
          }
        } else {
          bi.d(bi.field_d, bi.field_f, -bi.field_d + bi.field_i, bi.field_c - bi.field_f);
          ql.field_L.b(false, param0 ^ 0);
          if (param0 == 0) {
            return;
          } else {
            kp.i(-128);
            return;
          }
        }
    }

    private final void i(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                L1: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  if (param0 == -35) {
                    break L1;
                  } else {
                    this.field_H = -44L;
                    break L1;
                  }
                }
                this.m(-59);
                this.a(var2, (byte) 100);
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

    private final void g(byte param0) {
        L0: {
          if (this.field_v instanceof ih) {
            ((ih) ((Object) this.field_v)).a((byte) 58, (kp) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 100) {
          this.e((byte) -20);
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        try {
            String var2;
            var2 = this.h(0);
            if (param0 != -127) {
              L0: {
                this.f((byte) 37);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(0))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(0))), (java.awt.datatransfer.ClipboardOwner) null);
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

    static {
    }
}
