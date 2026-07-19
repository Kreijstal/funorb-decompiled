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
        qa var5 = null;
        long var6 = 0L;
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
        String discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 0) {
          L0: {
            discarded$1 = this.h(36);
            if (this.field_L >= this.field_K) {
              stackOut_10_0 = this.field_K;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_L;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (this.field_K <= this.field_L) {
              stackOut_13_0 = this.field_L;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = this.field_K;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return this.field_w.substring(var2, var3);
        } else {
          L2: {
            if (this.field_L >= this.field_K) {
              stackOut_3_0 = this.field_K;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = this.field_L;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (this.field_K <= this.field_L) {
              stackOut_6_0 = this.field_L;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = this.field_K;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return this.field_w.substring(var2, var3);
        }
    }

    private final int k(int param0) {
        String discarded$5 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
          discarded$5 = this.h(-55);
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
        ro var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qa var9 = null;
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
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
            dupTemp$2 = this.field_w.length();
            this.field_L = dupTemp$2;
            this.field_K = dupTemp$2;
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
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("kp.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
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
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (0 == (var8_int ^ -1)) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L3;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = var8_int;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L3;
                    }
                  }
                  L4: {
                    this.a(stackIn_7_1, (byte) -126);
                    var8_long = gk.a(44);
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (-this.field_H + var8_long >= 250L) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L4;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
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
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("kp.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
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
            stackOut_15_0 = (RuntimeException) (var5_ref);
            stackOut_15_1 = new StringBuilder().append("kp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
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
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_39_0 = null;
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
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_71_0 = 0;
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
        int stackOut_18_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
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
              if (param1 == 13) {
                break L1;
              } else {
                this.field_O = -111;
                break L1;
              }
            }
            this.field_M = gk.a(77);
            if (param0 == 60) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
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
                            dupTemp$1 = this.field_w.length();
                            this.field_K = dupTemp$1;
                            this.field_L = dupTemp$1;
                            break L6;
                          }
                        }
                        this.h((byte) 26);
                        break L4;
                      }
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
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
                        stackOut_72_0 = 1;
                        stackIn_73_0 = stackOut_72_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        if ((param2 ^ -1) != -97) {
                          if (-98 == (param2 ^ -1)) {
                            if (this.field_K < this.field_w.length()) {
                              L8: {
                                stackOut_67_0 = this;
                                stackIn_69_0 = stackOut_67_0;
                                stackIn_68_0 = stackOut_67_0;
                                if (!cr.field_eb[82]) {
                                  stackOut_69_0 = this;
                                  stackOut_69_1 = this.field_K + 1;
                                  stackIn_70_0 = stackOut_69_0;
                                  stackIn_70_1 = stackOut_69_1;
                                  break L8;
                                } else {
                                  stackOut_68_0 = this;
                                  stackOut_68_1 = this.k(-27539);
                                  stackIn_70_0 = stackOut_68_0;
                                  stackIn_70_1 = stackOut_68_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_70_1, (byte) -117);
                              stackOut_70_0 = 1;
                              stackIn_71_0 = stackOut_70_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != 102) {
                              if (-104 == (param2 ^ -1)) {
                                this.a(this.field_w.length(), (byte) -116);
                                stackOut_63_0 = 1;
                                stackIn_64_0 = stackOut_63_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if (param2 == 84) {
                                  this.g((byte) 100);
                                  stackOut_61_0 = 1;
                                  stackIn_62_0 = stackOut_61_0;
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
                                        stackOut_51_0 = 1;
                                        stackIn_52_0 = stackOut_51_0;
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
                                        stackOut_55_0 = 1;
                                        stackIn_56_0 = stackOut_55_0;
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
                                      stackOut_59_0 = 1;
                                      stackIn_60_0 = stackOut_59_0;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.a(0, (byte) -127);
                              stackOut_45_0 = 1;
                              stackIn_46_0 = stackOut_45_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          if ((this.field_K ^ -1) >= -1) {
                            break L7;
                          } else {
                            L11: {
                              stackOut_38_0 = this;
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_39_0 = stackOut_38_0;
                              if (!cr.field_eb[82]) {
                                stackOut_40_0 = this;
                                stackOut_40_1 = -1 + this.field_K;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                break L11;
                              } else {
                                stackOut_39_0 = this;
                                stackOut_39_1 = this.l(-128);
                                stackIn_41_0 = stackOut_39_0;
                                stackIn_41_1 = stackOut_39_1;
                                break L11;
                              }
                            }
                            this.a(stackIn_41_1, (byte) -116);
                            stackOut_41_0 = 1;
                            stackIn_42_0 = stackOut_41_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (this.field_K != this.field_L) {
                        this.m(-95);
                        stackOut_33_0 = 1;
                        stackIn_34_0 = stackOut_33_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (this.field_K >= this.field_w.length()) {
                          break L7;
                        } else {
                          this.field_L = 1 + this.field_K;
                          this.m(48);
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (this.field_L != this.field_K) {
                      this.m(111);
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (-1 > (this.field_K ^ -1)) {
                        this.field_L = this.field_K - 1;
                        this.m(-69);
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L7;
                      }
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
            stackOut_76_1 = new StringBuilder().append("kp.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
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
            String var2 = null;
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
