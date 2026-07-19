/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends ng {
    private be field_s;
    private byte[] field_A;
    static String field_C;
    private bq field_x;
    private f field_p;
    private byte[] field_k;
    private qb field_h;
    static ao field_j;
    private bq field_t;
    private qc field_l;
    private ai field_z;
    private int field_B;
    static String field_u;
    private int field_w;
    private int field_o;
    private boolean field_m;
    private th field_q;
    private th field_v;
    private int field_i;
    private boolean field_y;
    private boolean field_n;
    private long field_r;

    final static ic a(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ic stackIn_2_0 = null;
        ic stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_6_0 = null;
        ic stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 >= 116) {
              L1: {
                var4_long = 0L;
                var6 = null;
                if (-1 == param1.indexOf('@')) {
                  var7 = (CharSequence) ((Object) param1);
                  var4_long = cq.a(0, var7);
                  break L1;
                } else {
                  var6 = param1;
                  break L1;
                }
              }
              stackOut_6_0 = eg.a(64, var4_long, (String) (var6), param3, param2);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ic) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(boolean param0) {
        if (this.field_x == null) {
            return;
        }
        this.field_m = true;
        if (null == this.field_v) {
            this.field_v = new th();
        }
        if (param0) {
            this.field_i = -112;
        }
    }

    final void c(int param0) {
        qc discarded$2 = null;
        qc discarded$3 = null;
        br var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_22_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_v) {
          return;
        } else {
          if (null == this.a((byte) -101)) {
            return;
          } else {
            var2 = this.field_q.c(65);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_e;
                    stackOut_8_0 = var3;
                    stackIn_23_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_9_0 < 0) {
                              break L5;
                            } else {
                              if (var3 >= this.field_s.field_e) {
                                break L5;
                              } else {
                                if ((this.field_s.field_s[var3] ^ -1) == -1) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.a(true);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (this.field_A[var3] != 0) {
                            break L6;
                          } else {
                            discarded$2 = this.b(1, 0, var3);
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 == this.field_A[var3]) {
                            discarded$3 = this.b(2, 0, var3);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (-2 != (this.field_A[var3] ^ -1)) {
                          break L3;
                        } else {
                          var2.a(true);
                          break L3;
                        }
                      }
                      var2 = this.field_q.b(6);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_22_0 = param0;
                stackIn_23_0 = stackOut_22_0;
                break L1;
              }
              L8: {
                if (stackIn_23_0 > 64) {
                  break L8;
                } else {
                  cn.a((ul) null, -84, (byte[]) null, (int[]) null, (byte[]) null, -44, (String[]) null, (ul) null, (ri[]) null, (ul) null, 116, (ja[][]) null, true, (String[][]) null, (int[]) null, (ja[][]) null, (String[][]) null);
                  break L8;
                }
              }
              return;
            }
          }
        }
    }

    final be a(byte param0) {
        li discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_s == null) {
          L0: {
            if (null != this.field_l) {
              break L0;
            } else {
              if (!this.field_h.e(24)) {
                this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_l.field_t) {
            L1: {
              var7 = this.field_l.e(0);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (param0 <= -83) {
                break L1;
              } else {
                cn.d(-53);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_l instanceof li) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_s = new be(var7, this.field_o, this.field_k);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_h.a((byte) 113);
                      this.field_s = null;
                      if (this.field_h.e(98)) {
                        break L5;
                      } else {
                        this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_l = null;
                    return null;
                  }
                  if (this.field_t != null) {
                    discarded$1 = this.field_z.a(this.field_B, this.field_t, var7, 100);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L6: {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    this.field_s = new be(var7, this.field_o, this.field_k);
                    if (this.field_w != this.field_s.field_h) {
                      throw new RuntimeException();
                    } else {
                      break L6;
                    }
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  this.field_s = null;
                  if (this.field_h.e(88)) {
                    break L7;
                  } else {
                    this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                this.field_l = null;
                return null;
              }
              break L2;
            }
            L8: {
              this.field_l = null;
              if (this.field_x == null) {
                break L8;
              } else {
                this.field_A = new byte[this.field_s.field_e];
                break L8;
              }
            }
            return this.field_s;
          } else {
            return null;
          }
        } else {
          return this.field_s;
        }
    }

    final static ja[] a(boolean param0, String param1, ul param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ja[] stackIn_2_0 = null;
        ja[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ja[] stackOut_3_0 = null;
        ja[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4_int = param2.a(param3, (byte) 112);
            if (param0) {
              var5 = param2.a(param1, var4_int, -1);
              stackOut_3_0 = a.a(var5, (byte) -93, param2, var4_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ja[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("cn.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, boolean param1, int param2, byte param3) {
        aa.a((byte) 124, param1);
        lp.a((byte) -45, param0, param1, param2);
        if (param3 > -79) {
            field_u = (String) null;
        }
    }

    final int b(int param0, int param1) {
        qc var3 = (qc) ((Object) this.field_p.a(param1 ^ param1, (long)param0));
        if (var3 != null) {
            return var3.f(param1 + 103);
        }
        return 0;
    }

    final void b(int param0) {
        qc discarded$6 = null;
        qc discarded$7 = null;
        qc discarded$8 = null;
        qc discarded$9 = null;
        qc discarded$10 = null;
        qc discarded$11 = null;
        qc var2 = null;
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        int var5 = 0;
        br var6 = null;
        br var7 = null;
        byte stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        byte stackIn_41_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_126_0 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_40_0 = 0;
        byte stackOut_40_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_64_0 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            this.field_t = (bq) null;
            break L0;
          }
        }
        L1: {
          if (null == this.field_v) {
            break L1;
          } else {
            if (null != this.a((byte) -110)) {
              L2: {
                if (!this.field_y) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = this.field_v.c(46);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_8_0 = this.field_A[var4];
                            stackIn_19_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_19_0 >= this.field_s.field_s.length) {
                                  break L5;
                                } else {
                                  stackOut_20_0 = this.field_s.field_s[this.field_i];
                                  stackIn_32_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_21_0 == 0) {
                                          this.field_i = this.field_i + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (250 > this.field_z.field_h) {
                                          break L10;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (-1 != (this.field_A[this.field_i] ^ -1)) {
                                          break L11;
                                        } else {
                                          discarded$6 = this.b(1, 0, this.field_i);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (this.field_A[this.field_i] != 0) {
                                          break L12;
                                        } else {
                                          var6 = new br();
                                          var6.field_e = (long)this.field_i;
                                          this.field_v.a(var6, false);
                                          var2_int = 0;
                                          break L12;
                                        }
                                      }
                                      this.field_i = this.field_i + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_18_0 = this.field_i;
                                    stackIn_19_0 = stackOut_18_0;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_9_0 == 0) {
                                  discarded$7 = this.b(1, 0, var4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (-1 == (this.field_A[var4] ^ -1)) {
                                    break L15;
                                  } else {
                                    var3.a(true);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L14;
                              }
                              var3 = this.field_v.b(6);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_128_0 = this.field_i;
                          stackIn_126_0 = stackOut_128_0;
                          if (stackIn_126_0 >= this.field_s.field_s.length) {
                            break L5;
                          } else {
                            stackOut_124_0 = this.field_s.field_s[this.field_i];
                            stackIn_32_0 = stackOut_124_0;
                            stackIn_125_0 = stackOut_124_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_125_0 = stackIn_125_0;
                              stackIn_122_0 = stackOut_125_0;
                              L17: {
                                if (stackIn_122_0 == 0) {
                                  this.field_i = this.field_i + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (250 > this.field_z.field_h) {
                                  break L18;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                if (-1 != (this.field_A[this.field_i] ^ -1)) {
                                  break L19;
                                } else {
                                  discarded$8 = this.b(1, 0, this.field_i);
                                  break L19;
                                }
                              }
                              L20: {
                                if (this.field_A[this.field_i] != 0) {
                                  break L20;
                                } else {
                                  var6 = new br();
                                  var6.field_e = (long)this.field_i;
                                  this.field_v.a(var6, false);
                                  var2_int = 0;
                                  break L20;
                                }
                              }
                              this.field_i = this.field_i + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_31_0 = var2_int;
                      stackIn_32_0 = stackOut_31_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_32_0 == 0) {
                        break L21;
                      } else {
                        this.field_y = false;
                        this.field_i = 0;
                        break L21;
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L22: {
                if (this.field_m) {
                  break L22;
                } else {
                  this.field_v = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L22;
                  }
                }
              }
              var2_int = 1;
              var3 = this.field_v.c(105);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_e;
                        stackOut_40_0 = 1;
                        stackOut_40_1 = this.field_A[var4];
                        stackIn_51_0 = stackOut_40_0;
                        stackIn_51_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var5 != 0) {
                          L27: while (true) {
                            if (stackIn_51_0 >= stackIn_51_1) {
                              break L25;
                            } else {
                              stackOut_52_0 = this.field_s.field_s[this.field_i];
                              stackIn_65_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                L28: {
                                  L29: {
                                    if (stackIn_53_0 == 0) {
                                      this.field_i = this.field_i + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (this.field_h.c(param0 + -89)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L30;
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (-2 == (this.field_A[this.field_i] ^ -1)) {
                                      break L31;
                                    } else {
                                      discarded$9 = this.b(2, 0, this.field_i);
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (this.field_A[this.field_i] == 1) {
                                      break L32;
                                    } else {
                                      var7 = new br();
                                      var7.field_e = (long)this.field_i;
                                      var2_int = 0;
                                      this.field_v.a(var7, false);
                                      break L32;
                                    }
                                  }
                                  this.field_i = this.field_i + 1;
                                  if (var5 == 0) {
                                    break L28;
                                  } else {
                                    break L25;
                                  }
                                }
                                stackOut_50_0 = this.field_i;
                                stackOut_50_1 = this.field_s.field_s.length;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L33: {
                            if (stackIn_41_0 != stackIn_41_1) {
                              discarded$10 = this.b(2, param0 ^ -2, var4);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              if (-2 != (this.field_A[var4] ^ -1)) {
                                break L35;
                              } else {
                                var3.a(true);
                                if (var5 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2_int = 0;
                            break L34;
                          }
                          var3 = this.field_v.b(6);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L36: while (true) {
                      stackOut_106_0 = this.field_i;
                      stackOut_106_1 = this.field_s.field_s.length;
                      stackIn_104_0 = stackOut_106_0;
                      stackIn_104_1 = stackOut_106_1;
                      if (stackIn_104_0 >= stackIn_104_1) {
                        break L25;
                      } else {
                        stackOut_102_0 = this.field_s.field_s[this.field_i];
                        stackIn_65_0 = stackOut_102_0;
                        stackIn_103_0 = stackOut_102_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          stackOut_103_0 = stackIn_103_0;
                          stackIn_100_0 = stackOut_103_0;
                          L37: {
                            if (stackIn_100_0 == 0) {
                              this.field_i = this.field_i + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (this.field_h.c(param0 + -89)) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (-2 == (this.field_A[this.field_i] ^ -1)) {
                              break L39;
                            } else {
                              discarded$11 = this.b(2, 0, this.field_i);
                              break L39;
                            }
                          }
                          L40: {
                            if (this.field_A[this.field_i] == 1) {
                              break L40;
                            } else {
                              var7 = new br();
                              var7.field_e = (long)this.field_i;
                              var2_int = 0;
                              this.field_v.a(var7, false);
                              break L40;
                            }
                          }
                          this.field_i = this.field_i + 1;
                          if (var5 == 0) {
                            continue L36;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  stackOut_64_0 = var2_int;
                  stackIn_65_0 = stackOut_64_0;
                  break L24;
                }
                if (stackIn_65_0 != 0) {
                  this.field_m = false;
                  this.field_i = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              return;
            }
          }
        }
        L41: {
          if (!this.field_n) {
            break L41;
          } else {
            L42: {
              if ((bl.a((byte) 48) ^ -1L) > (this.field_r ^ -1L)) {
                break L42;
              } else {
                var2 = (qc) ((Object) this.field_p.a(0));
                L43: while (true) {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L45: {
                          if (var2.field_t) {
                            break L45;
                          } else {
                            L46: {
                              if (var2.field_x) {
                                break L46;
                              } else {
                                var2.field_x = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (var2.field_r) {
                              var2.a(true);
                              break L45;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                        var2 = (qc) ((Object) this.field_p.b(param0 ^ 122));
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  this.field_r = bl.a((byte) 114) - -1000L;
                  break L42;
                }
              }
            }
            break L41;
          }
        }
    }

    private final qc b(int param0, int param1, int param2) {
        li discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        qc var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_92_0 = 0;
        byte stackOut_92_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_59_0 = null;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var11 = (qc) ((Object) this.field_p.a(0, (long)param2));
          var4 = var11;
          if (var11 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var11.field_r) {
                break L0;
              } else {
                if (var11.field_t) {
                  var11.a(true);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) != -1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (this.field_x == null) {
                        break L5;
                      } else {
                        if (0 != (this.field_A[param2] ^ -1)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (!this.field_h.e(param1 + 116)) {
                      var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      return null;
                    }
                  }
                  var4 = this.field_z.a(param2, this.field_x, -3);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (-2 != (param0 ^ -1)) {
                  break L6;
                } else {
                  if (this.field_x != null) {
                    var4 = this.field_z.b(param2, this.field_x, 10);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              if (param0 == 2) {
                if (this.field_x == null) {
                  throw new RuntimeException();
                } else {
                  if (-1 == this.field_A[param2]) {
                    if (!this.field_h.c(-64)) {
                      var4 = this.field_h.a(487989472, param2, false, this.field_B, (byte) 2);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
            this.field_p.a(true, (long)param2, (br) (var4));
            break L1;
          }
        }
        if (!((qc) (var4)).field_t) {
          var17 = ((qc) (var4)).e(param1);
          var12 = var17;
          var5 = var12;
          if (!(var4 instanceof li)) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L8;
                    } else {
                      gn.field_B.reset();
                      gn.field_B.update(var5, 0, -2 + var17.length);
                      var6_int = (int)gn.field_B.getValue();
                      if (this.field_s.field_r[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          if (this.field_s.field_a == null) {
                            break L9;
                          } else {
                            if (this.field_s.field_a[param2] == null) {
                              break L9;
                            } else {
                              var29 = this.field_s.field_a[param2];
                              var28 = ho.a(4246, 0, var5, -2 + var17.length);
                              var9 = 0;
                              L10: while (true) {
                                if ((var9 ^ -1) <= -65) {
                                  break L9;
                                } else {
                                  stackOut_77_0 = var28[var9] ^ -1;
                                  stackOut_77_1 = var29[var9] ^ -1;
                                  stackIn_93_0 = stackOut_77_0;
                                  stackIn_93_1 = stackOut_77_1;
                                  stackIn_78_0 = stackOut_77_0;
                                  stackIn_78_1 = stackOut_77_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L7;
                                  } else {
                                    if (stackIn_78_0 != stackIn_78_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_h.field_n = 0;
                        this.field_h.field_p = 0;
                        decompiledRegionSelector0 = 1;
                        break L7;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_h.a((byte) 95);
              ((qc) (var4)).a(true);
              if (((qc) (var4)).field_r) {
                L11: {
                  if (!this.field_h.e(110)) {
                    var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
                    this.field_p.a(true, (long)param2, (br) (var4));
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  break L13;
                } else {
                  var5[-2 + var17.length] = (byte)(this.field_s.field_p[param2] >>> 900439080);
                  var5[-1 + var17.length] = (byte)this.field_s.field_p[param2];
                  if (null != this.field_x) {
                    discarded$1 = this.field_z.a(param2, this.field_x, var17, param1 + 108);
                    stackOut_92_0 = 1;
                    stackOut_92_1 = this.field_A[param2];
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              if (stackIn_93_0 != stackIn_93_1) {
                this.field_A[param2] = (byte) 1;
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (((qc) (var4)).field_r) {
                break L14;
              } else {
                ((qc) (var4)).a(true);
                break L14;
              }
            }
            return (qc) (var4);
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (var17.length > 2) {
                      gn.field_B.reset();
                      gn.field_B.update(var5, 0, -2 + var17.length);
                      var6_int = (int)gn.field_B.getValue();
                      if ((this.field_s.field_r[param2] ^ -1) == (var6_int ^ -1)) {
                        L17: {
                          L18: {
                            if (null == this.field_s.field_a) {
                              break L18;
                            } else {
                              if (this.field_s.field_a[param2] == null) {
                                break L18;
                              } else {
                                var26 = this.field_s.field_a[param2];
                                var27 = ho.a(4246, 0, var5, var17.length + -2);
                                var9 = 0;
                                L19: while (true) {
                                  if (var9 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_43_0 = var26[var9] ^ -1;
                                    stackOut_43_1 = var27[var9] ^ -1;
                                    stackIn_49_0 = stackOut_43_0;
                                    stackIn_49_1 = stackOut_43_1;
                                    stackIn_44_0 = stackOut_43_0;
                                    stackIn_44_1 = stackOut_43_1;
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_44_0 != stackIn_44_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L19;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_48_0 = 65280 & var5[var17.length + -2] << -2106908856;
                          stackOut_48_1 = 255 & var5[var17.length + -1];
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          break L17;
                        }
                        var7 = stackIn_49_0 + stackIn_49_1;
                        if ((var7 ^ -1) != (this.field_s.field_p[param2] & 65535 ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          L20: {
                            if (-2 != (this.field_A[param2] ^ -1)) {
                              L21: {
                                if (0 == this.field_A[param2]) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              this.field_A[param2] = (byte) 1;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L22: {
                            if (!((qc) (var4)).field_r) {
                              ((qc) (var4)).a(true);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L15;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              this.field_A[param2] = (byte)-1;
              ((qc) (var4)).a(true);
              if (((qc) (var4)).field_r) {
                if (!this.field_h.e(34)) {
                  var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
                  this.field_p.a(true, (long)param2, (br) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (qc) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 >= -5) {
            field_u = (String) null;
        }
        int var3 = param2 >>> 925627647;
        return -var3 + (var3 + param2) / param0;
    }

    final static void a(ul param0, int param1, byte[] param2, int[] param3, byte[] param4, int param5, String[] param6, ul param7, ri[] param8, ul param9, int param10, ja[][] param11, boolean param12, String[][] param13, int[] param14, ja[][] param15, String[][] param16) {
        ja[] discarded$1 = null;
        RuntimeException var17 = null;
        String var18 = null;
        String[] var19 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var18 = (String) null;
                discarded$1 = cn.a(true, (String) null, (ul) null, (String) null);
                break L1;
              }
            }
            var19 = (String[]) null;
            e.a(param7, param4, 1, (String[]) null, param14, param5, param11, param6, true, param16, param10, param13, param0, param2, param3, param8, param15, param9, param12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var17);
            stackOut_4_1 = new StringBuilder().append("cn.L(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param7 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param8 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param9 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param10).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param11 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param12).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param13 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param14 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param15 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          L14: {
            stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param16 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        qc var3 = this.b(0, 0, param1);
        if (var3 == null) {
            return null;
        }
        if (param0 != -123) {
            return (byte[]) null;
        }
        byte[] var4 = var3.e(0);
        var3.a(true);
        return var4;
    }

    public static void d(int param0) {
        if (param0 >= -103) {
            cn.a(-126, true, 28, (byte) -117);
        }
        field_C = null;
        field_j = null;
        field_u = null;
    }

    cn(int param0, bq param1, bq param2, qb param3, ai param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        this.field_p = new f(16);
        this.field_i = 0;
        this.field_q = new th();
        this.field_r = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_x = param1;
                this.field_B = param0;
                if (null != this.field_x) {
                  break L2;
                } else {
                  this.field_y = false;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_y = true;
              this.field_v = new th();
              break L1;
            }
            L3: {
              this.field_t = param2;
              this.field_w = param7;
              this.field_h = param3;
              this.field_z = param4;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((cn) (this)).field_n = stackIn_7_1 != 0;
              this.field_o = param5;
              this.field_k = param6;
              if (null == this.field_t) {
                break L4;
              } else {
                this.field_l = (qc) ((Object) this.field_z.a(this.field_B, this.field_t, -3));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("cn.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_C = "New Game";
        field_j = new ao(12, 0, 1, 0);
        field_u = "Get them! GET THEM!";
    }
}
