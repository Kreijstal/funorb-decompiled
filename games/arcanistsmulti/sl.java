/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends kl {
    static String field_R;
    static kc field_S;
    static int[] field_H;
    static String field_N;
    private boolean field_J;
    static int[] field_V;
    private boolean field_U;
    static int field_I;
    static String field_K;
    wm field_P;
    private ma field_Q;
    static String field_M;
    static int field_W;
    static int field_T;
    ma field_O;

    private final boolean a(boolean param0, int param1) {
        if (param0) {
          if (null != this.field_O) {
            this.field_O.a((byte) -6, param1 * this.field_O.field_T + this.field_O.field_L);
            return true;
          } else {
            return false;
          }
        } else {
          this.f(-69);
          if (null != this.field_O) {
            this.field_O.a((byte) -6, param1 * this.field_O.field_T + this.field_O.field_L);
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0, int param1, ma param2) {
        try {
            this.field_U = param0 ? true : false;
            this.field_O = param2;
            this.field_z[param1] = (qm) ((Object) param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sl.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.h(1);
            this.f(-2023111216);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        qm var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -120) {
                break L1;
              } else {
                var6 = (qm) null;
                this.a((qm) null, -13, 8, -25);
                break L1;
              }
            }
            if (!super.a(param0, (byte) -122, param2, param3)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.f(-2023111216);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("sl.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5 + param5, param6)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!this.d(param5 + -2116)) {
                    break L2;
                  } else {
                    if (!this.a(true, param4)) {
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("sl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    private final void f(int param0) {
        qm var3;
        if (null == this.field_O) {
          if (null == this.field_Q) {
            if (param0 != -2023111216) {
              var3 = (qm) null;
              this.a(0, -108, -7, 118, 43, -16, (qm) null);
              return;
            } else {
              return;
            }
          } else {
            this.field_P.field_B.field_n = -(int)((long)this.field_Q.field_Z * (long)(this.field_P.field_B.field_v + -this.field_P.field_v) >> -2023111216);
            if (param0 != -2023111216) {
              var3 = (qm) null;
              this.a(0, -108, -7, 118, 43, -16, (qm) null);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_P.field_B.field_j = -(int)((long)this.field_O.field_L * (long)(-this.field_P.field_k + this.field_P.field_B.field_k) >> 1999507920);
          if (null != this.field_Q) {
            this.field_P.field_B.field_n = -(int)((long)this.field_Q.field_Z * (long)(this.field_P.field_B.field_v + -this.field_P.field_v) >> -2023111216);
            if (param0 == -2023111216) {
              return;
            } else {
              var3 = (qm) null;
              this.a(0, -108, -7, 118, 43, -16, (qm) null);
              return;
            }
          } else {
            if (param0 != -2023111216) {
              var3 = (qm) null;
              this.a(0, -108, -7, 118, 43, -16, (qm) null);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void h(int param0) {
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_O) {
          if (this.field_P.field_k >= this.field_P.field_B.field_k) {
            this.field_O.a(1, (byte) -42, 1);
            if (param0 == 1) {
              if (this.field_Q != null) {
                if (this.field_P.field_v < this.field_P.field_B.field_v) {
                  this.field_Q.a(this.field_P.field_v, this.field_P.field_B.field_v, (byte) -46);
                  return;
                } else {
                  this.field_Q.a(1, 1, (byte) 120);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_O.a(this.field_P.field_B.field_k, (byte) -42, this.field_P.field_k);
            if (param0 == 1) {
              if (this.field_Q != null) {
                if (this.field_P.field_v < this.field_P.field_B.field_v) {
                  this.field_Q.a(this.field_P.field_v, this.field_P.field_B.field_v, (byte) -46);
                  return;
                } else {
                  this.field_Q.a(1, 1, (byte) 120);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param0 != 1) {
            return;
          } else {
            L0: {
              if (this.field_Q != null) {
                if (this.field_P.field_v >= this.field_P.field_B.field_v) {
                  this.field_Q.a(1, 1, (byte) 120);
                  break L0;
                } else {
                  this.field_Q.a(this.field_P.field_v, this.field_P.field_B.field_v, (byte) -46);
                  break L0;
                }
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    sl(int param0, int param1, int param2, int param3, pf param4, qm param5, pf param6) {
        super(param0, param1, param2, param3, param4);
        wm dupTemp$0 = null;
        try {
            this.field_z = new qm[3];
            dupTemp$0 = new wm(param0, param1, param2, param3, param6, param5);
            this.field_P = dupTemp$0;
            this.field_z[2] = (qm) ((Object) dupTemp$0);
            this.e(123);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        ma stackIn_13_0;
        int stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        ma stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        ma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ma stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ma stackIn_35_0;
        int stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        ma stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        int stackIn_36_4;
        ma stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        ma stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        ma stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        ma stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        ma stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        ma stackIn_65_0;
        int stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_65_4;
        ma stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ma stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        ma stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        ma stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_0 = 0;
        ma stackIn_92_0;
        int stackIn_92_1;
        int stackIn_92_2;
        int stackIn_92_3;
        ma stackIn_93_0;
        int stackIn_93_1;
        int stackIn_93_2;
        int stackIn_93_3;
        int stackIn_93_4;
        ma stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        ma stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        ma stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        ma stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        ma stackIn_120_0;
        int stackIn_120_1;
        int stackIn_120_2;
        int stackIn_120_3;
        ma stackIn_121_0;
        int stackIn_121_1;
        int stackIn_121_2;
        int stackIn_121_3;
        int stackIn_121_4;
        ma stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        ma stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        ma stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        ma stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_144_0 = 0;
        ma stackIn_148_0;
        int stackIn_148_1;
        int stackIn_148_2;
        int stackIn_148_3;
        ma stackIn_149_0;
        int stackIn_149_1;
        int stackIn_149_2;
        int stackIn_149_3;
        int stackIn_149_4;
        ma stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        ma stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        ma stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        ma stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        if (!this.field_U) {
          if (null != this.field_O) {
            L0: {
              var2 = this.field_O.field_v;
              if (this.field_J) {
                stackIn_138_0 = 0;
                break L0;
              } else {
                if (null != this.field_Q) {
                  stackIn_138_0 = this.field_Q.field_k;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    if (null != this.field_O) {
                      stackIn_113_0 = -this.field_O.field_v + this.field_v;
                      break L1;
                    } else {
                      stackIn_113_0 = this.field_v;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = stackIn_113_0;
                    if (this.field_Q != null) {
                      stackIn_116_0 = -this.field_Q.field_k + this.field_k;
                      break L2;
                    } else {
                      stackIn_116_0 = this.field_k;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = stackIn_116_0;
                    this.field_P.a(var5, var3, var4, var2, -101);
                    if (null != this.field_O) {
                      L4: {
                        stackIn_120_0 = this.field_O;

                        stackIn_120_1 = this.field_P.field_k;

                        stackIn_120_2 = this.field_P.field_j;

                        stackIn_120_3 = this.field_O.field_v;

                        if (!this.field_U) {
                          stackIn_121_0 = (ma) ((Object) stackIn_120_0);
                          stackIn_121_1 = stackIn_120_1;
                          stackIn_121_2 = stackIn_120_2;
                          stackIn_121_3 = stackIn_120_3;
                          stackIn_121_4 = 0;
                          break L4;
                        } else {
                          stackIn_121_0 = (ma) ((Object) stackIn_120_0);
                          stackIn_121_1 = stackIn_120_1;
                          stackIn_121_2 = stackIn_120_2;
                          stackIn_121_3 = stackIn_120_3;
                          stackIn_121_4 = -this.field_O.field_v + this.field_v;
                          break L4;
                        }
                      }
                      ((ma) (Object) stackIn_121_0).a(stackIn_121_1, stackIn_121_2, stackIn_121_3, stackIn_121_4, -87);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param0 < 17) {
                    L5: {
                      this.field_Q = (ma) null;
                      if (null == this.field_Q) {
                        break L5;
                      } else {
                        L6: {
                          stackIn_132_0 = this.field_Q;

                          stackIn_132_1 = this.field_Q.field_k;

                          if (this.field_J) {
                            stackIn_133_0 = (ma) ((Object) stackIn_132_0);
                            stackIn_133_1 = stackIn_132_1;
                            stackIn_133_2 = -this.field_Q.field_k + this.field_k;
                            break L6;
                          } else {
                            stackIn_133_0 = (ma) ((Object) stackIn_132_0);
                            stackIn_133_1 = stackIn_132_1;
                            stackIn_133_2 = 0;
                            break L6;
                          }
                        }
                        ((ma) (Object) stackIn_133_0).a(stackIn_133_1, stackIn_133_2, this.field_P.field_v, this.field_P.field_n, -107);
                        break L5;
                      }
                    }
                    this.h(1);
                    return;
                  } else {
                    L7: {
                      if (null == this.field_Q) {
                        break L7;
                      } else {
                        L8: {
                          stackIn_126_0 = this.field_Q;

                          stackIn_126_1 = this.field_Q.field_k;

                          if (this.field_J) {
                            stackIn_127_0 = (ma) ((Object) stackIn_126_0);
                            stackIn_127_1 = stackIn_126_1;
                            stackIn_127_2 = -this.field_Q.field_k + this.field_k;
                            break L8;
                          } else {
                            stackIn_127_0 = (ma) ((Object) stackIn_126_0);
                            stackIn_127_1 = stackIn_126_1;
                            stackIn_127_2 = 0;
                            break L8;
                          }
                        }
                        ((ma) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2, this.field_P.field_v, this.field_P.field_n, -107);
                        break L7;
                      }
                    }
                    this.h(1);
                    return;
                  }
                }
              }
            }
            L9: {
              var3 = stackIn_138_0;
              if (null != this.field_O) {
                stackIn_141_0 = -this.field_O.field_v + this.field_v;
                break L9;
              } else {
                stackIn_141_0 = this.field_v;
                break L9;
              }
            }
            L10: {
              var4 = stackIn_141_0;
              if (this.field_Q != null) {
                stackIn_144_0 = -this.field_Q.field_k + this.field_k;
                break L10;
              } else {
                stackIn_144_0 = this.field_k;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_144_0;
              this.field_P.a(var5, var3, var4, var2, -101);
              if (null != this.field_O) {
                L12: {
                  stackIn_148_0 = this.field_O;

                  stackIn_148_1 = this.field_P.field_k;

                  stackIn_148_2 = this.field_P.field_j;

                  stackIn_148_3 = this.field_O.field_v;

                  if (!this.field_U) {
                    stackIn_149_0 = (ma) ((Object) stackIn_148_0);
                    stackIn_149_1 = stackIn_148_1;
                    stackIn_149_2 = stackIn_148_2;
                    stackIn_149_3 = stackIn_148_3;
                    stackIn_149_4 = 0;
                    break L12;
                  } else {
                    stackIn_149_0 = (ma) ((Object) stackIn_148_0);
                    stackIn_149_1 = stackIn_148_1;
                    stackIn_149_2 = stackIn_148_2;
                    stackIn_149_3 = stackIn_148_3;
                    stackIn_149_4 = -this.field_O.field_v + this.field_v;
                    break L12;
                  }
                }
                ((ma) (Object) stackIn_149_0).a(stackIn_149_1, stackIn_149_2, stackIn_149_3, stackIn_149_4, -87);
                break L11;
              } else {
                break L11;
              }
            }
            if (param0 < 17) {
              L13: {
                this.field_Q = (ma) null;
                if (null == this.field_Q) {
                  break L13;
                } else {
                  L14: {
                    stackIn_160_0 = this.field_Q;

                    stackIn_160_1 = this.field_Q.field_k;

                    if (this.field_J) {
                      stackIn_161_0 = (ma) ((Object) stackIn_160_0);
                      stackIn_161_1 = stackIn_160_1;
                      stackIn_161_2 = -this.field_Q.field_k + this.field_k;
                      break L14;
                    } else {
                      stackIn_161_0 = (ma) ((Object) stackIn_160_0);
                      stackIn_161_1 = stackIn_160_1;
                      stackIn_161_2 = 0;
                      break L14;
                    }
                  }
                  ((ma) (Object) stackIn_161_0).a(stackIn_161_1, stackIn_161_2, this.field_P.field_v, this.field_P.field_n, -107);
                  break L13;
                }
              }
              this.h(1);
              return;
            } else {
              L15: {
                if (null == this.field_Q) {
                  break L15;
                } else {
                  L16: {
                    stackIn_154_0 = this.field_Q;

                    stackIn_154_1 = this.field_Q.field_k;

                    if (this.field_J) {
                      stackIn_155_0 = (ma) ((Object) stackIn_154_0);
                      stackIn_155_1 = stackIn_154_1;
                      stackIn_155_2 = -this.field_Q.field_k + this.field_k;
                      break L16;
                    } else {
                      stackIn_155_0 = (ma) ((Object) stackIn_154_0);
                      stackIn_155_1 = stackIn_154_1;
                      stackIn_155_2 = 0;
                      break L16;
                    }
                  }
                  ((ma) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2, this.field_P.field_v, this.field_P.field_n, -107);
                  break L15;
                }
              }
              this.h(1);
              return;
            }
          } else {
            L17: {
              var2 = 0;
              if (this.field_J) {
                stackIn_82_0 = 0;
                break L17;
              } else {
                if (null != this.field_Q) {
                  stackIn_82_0 = this.field_Q.field_k;
                  break L17;
                } else {
                  L18: {
                    var3 = 0;
                    if (null != this.field_O) {
                      stackIn_57_0 = -this.field_O.field_v + this.field_v;
                      break L18;
                    } else {
                      stackIn_57_0 = this.field_v;
                      break L18;
                    }
                  }
                  L19: {
                    var4 = stackIn_57_0;
                    if (this.field_Q != null) {
                      stackIn_60_0 = -this.field_Q.field_k + this.field_k;
                      break L19;
                    } else {
                      stackIn_60_0 = this.field_k;
                      break L19;
                    }
                  }
                  L20: {
                    var5 = stackIn_60_0;
                    this.field_P.a(var5, var3, var4, var2, -101);
                    if (null != this.field_O) {
                      L21: {
                        stackIn_64_0 = this.field_O;

                        stackIn_64_1 = this.field_P.field_k;

                        stackIn_64_2 = this.field_P.field_j;

                        stackIn_64_3 = this.field_O.field_v;

                        if (!this.field_U) {
                          stackIn_65_0 = (ma) ((Object) stackIn_64_0);
                          stackIn_65_1 = stackIn_64_1;
                          stackIn_65_2 = stackIn_64_2;
                          stackIn_65_3 = stackIn_64_3;
                          stackIn_65_4 = 0;
                          break L21;
                        } else {
                          stackIn_65_0 = (ma) ((Object) stackIn_64_0);
                          stackIn_65_1 = stackIn_64_1;
                          stackIn_65_2 = stackIn_64_2;
                          stackIn_65_3 = stackIn_64_3;
                          stackIn_65_4 = -this.field_O.field_v + this.field_v;
                          break L21;
                        }
                      }
                      ((ma) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_65_4, -87);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (param0 < 17) {
                    L22: {
                      this.field_Q = (ma) null;
                      if (null == this.field_Q) {
                        break L22;
                      } else {
                        L23: {
                          stackIn_76_0 = this.field_Q;

                          stackIn_76_1 = this.field_Q.field_k;

                          if (this.field_J) {
                            stackIn_77_0 = (ma) ((Object) stackIn_76_0);
                            stackIn_77_1 = stackIn_76_1;
                            stackIn_77_2 = -this.field_Q.field_k + this.field_k;
                            break L23;
                          } else {
                            stackIn_77_0 = (ma) ((Object) stackIn_76_0);
                            stackIn_77_1 = stackIn_76_1;
                            stackIn_77_2 = 0;
                            break L23;
                          }
                        }
                        ((ma) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2, this.field_P.field_v, this.field_P.field_n, -107);
                        break L22;
                      }
                    }
                    this.h(1);
                    return;
                  } else {
                    L24: {
                      if (null == this.field_Q) {
                        break L24;
                      } else {
                        L25: {
                          stackIn_70_0 = this.field_Q;

                          stackIn_70_1 = this.field_Q.field_k;

                          if (this.field_J) {
                            stackIn_71_0 = (ma) ((Object) stackIn_70_0);
                            stackIn_71_1 = stackIn_70_1;
                            stackIn_71_2 = -this.field_Q.field_k + this.field_k;
                            break L25;
                          } else {
                            stackIn_71_0 = (ma) ((Object) stackIn_70_0);
                            stackIn_71_1 = stackIn_70_1;
                            stackIn_71_2 = 0;
                            break L25;
                          }
                        }
                        ((ma) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_71_2, this.field_P.field_v, this.field_P.field_n, -107);
                        break L24;
                      }
                    }
                    this.h(1);
                    return;
                  }
                }
              }
            }
            L26: {
              var3 = stackIn_82_0;
              if (null != this.field_O) {
                stackIn_85_0 = -this.field_O.field_v + this.field_v;
                break L26;
              } else {
                stackIn_85_0 = this.field_v;
                break L26;
              }
            }
            L27: {
              var4 = stackIn_85_0;
              if (this.field_Q != null) {
                stackIn_88_0 = -this.field_Q.field_k + this.field_k;
                break L27;
              } else {
                stackIn_88_0 = this.field_k;
                break L27;
              }
            }
            L28: {
              var5 = stackIn_88_0;
              this.field_P.a(var5, var3, var4, var2, -101);
              if (null != this.field_O) {
                L29: {
                  stackIn_92_0 = this.field_O;

                  stackIn_92_1 = this.field_P.field_k;

                  stackIn_92_2 = this.field_P.field_j;

                  stackIn_92_3 = this.field_O.field_v;

                  if (!this.field_U) {
                    stackIn_93_0 = (ma) ((Object) stackIn_92_0);
                    stackIn_93_1 = stackIn_92_1;
                    stackIn_93_2 = stackIn_92_2;
                    stackIn_93_3 = stackIn_92_3;
                    stackIn_93_4 = 0;
                    break L29;
                  } else {
                    stackIn_93_0 = (ma) ((Object) stackIn_92_0);
                    stackIn_93_1 = stackIn_92_1;
                    stackIn_93_2 = stackIn_92_2;
                    stackIn_93_3 = stackIn_92_3;
                    stackIn_93_4 = -this.field_O.field_v + this.field_v;
                    break L29;
                  }
                }
                ((ma) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, -87);
                break L28;
              } else {
                break L28;
              }
            }
            if (param0 < 17) {
              L30: {
                this.field_Q = (ma) null;
                if (null == this.field_Q) {
                  break L30;
                } else {
                  L31: {
                    stackIn_104_0 = this.field_Q;

                    stackIn_104_1 = this.field_Q.field_k;

                    if (this.field_J) {
                      stackIn_105_0 = (ma) ((Object) stackIn_104_0);
                      stackIn_105_1 = stackIn_104_1;
                      stackIn_105_2 = -this.field_Q.field_k + this.field_k;
                      break L31;
                    } else {
                      stackIn_105_0 = (ma) ((Object) stackIn_104_0);
                      stackIn_105_1 = stackIn_104_1;
                      stackIn_105_2 = 0;
                      break L31;
                    }
                  }
                  ((ma) (Object) stackIn_105_0).a(stackIn_105_1, stackIn_105_2, this.field_P.field_v, this.field_P.field_n, -107);
                  break L30;
                }
              }
              this.h(1);
              return;
            } else {
              L32: {
                if (null == this.field_Q) {
                  break L32;
                } else {
                  L33: {
                    stackIn_98_0 = this.field_Q;

                    stackIn_98_1 = this.field_Q.field_k;

                    if (this.field_J) {
                      stackIn_99_0 = (ma) ((Object) stackIn_98_0);
                      stackIn_99_1 = stackIn_98_1;
                      stackIn_99_2 = -this.field_Q.field_k + this.field_k;
                      break L33;
                    } else {
                      stackIn_99_0 = (ma) ((Object) stackIn_98_0);
                      stackIn_99_1 = stackIn_98_1;
                      stackIn_99_2 = 0;
                      break L33;
                    }
                  }
                  ((ma) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_99_2, this.field_P.field_v, this.field_P.field_n, -107);
                  break L32;
                }
              }
              this.h(1);
              return;
            }
          }
        } else {
          L34: {
            var2 = 0;
            if (this.field_J) {
              stackIn_25_0 = 0;
              break L34;
            } else {
              if (null != this.field_Q) {
                stackIn_25_0 = this.field_Q.field_k;
                break L34;
              } else {
                L35: {
                  var3 = 0;
                  if (null != this.field_O) {
                    stackIn_6_0 = -this.field_O.field_v + this.field_v;
                    break L35;
                  } else {
                    stackIn_6_0 = this.field_v;
                    break L35;
                  }
                }
                L36: {
                  var4 = stackIn_6_0;
                  if (this.field_Q != null) {
                    stackIn_9_0 = -this.field_Q.field_k + this.field_k;
                    break L36;
                  } else {
                    stackIn_9_0 = this.field_k;
                    break L36;
                  }
                }
                L37: {
                  var5 = stackIn_9_0;
                  this.field_P.a(var5, var3, var4, var2, -101);
                  if (null != this.field_O) {
                    L38: {
                      stackIn_13_0 = this.field_O;

                      stackIn_13_1 = this.field_P.field_k;

                      stackIn_13_2 = this.field_P.field_j;

                      stackIn_13_3 = this.field_O.field_v;

                      if (!this.field_U) {
                        stackIn_14_0 = (ma) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = stackIn_13_3;
                        stackIn_14_4 = 0;
                        break L38;
                      } else {
                        stackIn_14_0 = (ma) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = stackIn_13_3;
                        stackIn_14_4 = -this.field_O.field_v + this.field_v;
                        break L38;
                      }
                    }
                    ((ma) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, -87);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L39: {
                  if (param0 >= 17) {
                    break L39;
                  } else {
                    this.field_Q = (ma) null;
                    break L39;
                  }
                }
                L40: {
                  if (null == this.field_Q) {
                    break L40;
                  } else {
                    L41: {
                      stackIn_20_0 = this.field_Q;

                      stackIn_20_1 = this.field_Q.field_k;

                      if (this.field_J) {
                        stackIn_21_0 = (ma) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = -this.field_Q.field_k + this.field_k;
                        break L41;
                      } else {
                        stackIn_21_0 = (ma) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 0;
                        break L41;
                      }
                    }
                    ((ma) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, this.field_P.field_v, this.field_P.field_n, -107);
                    break L40;
                  }
                }
                this.h(1);
                return;
              }
            }
          }
          L42: {
            var3 = stackIn_25_0;
            if (null != this.field_O) {
              stackIn_28_0 = -this.field_O.field_v + this.field_v;
              break L42;
            } else {
              stackIn_28_0 = this.field_v;
              break L42;
            }
          }
          L43: {
            var4 = stackIn_28_0;
            if (this.field_Q != null) {
              stackIn_31_0 = -this.field_Q.field_k + this.field_k;
              break L43;
            } else {
              stackIn_31_0 = this.field_k;
              break L43;
            }
          }
          L44: {
            var5 = stackIn_31_0;
            this.field_P.a(var5, var3, var4, var2, -101);
            if (null != this.field_O) {
              L45: {
                stackIn_35_0 = this.field_O;

                stackIn_35_1 = this.field_P.field_k;

                stackIn_35_2 = this.field_P.field_j;

                stackIn_35_3 = this.field_O.field_v;

                if (!this.field_U) {
                  stackIn_36_0 = (ma) ((Object) stackIn_35_0);
                  stackIn_36_1 = stackIn_35_1;
                  stackIn_36_2 = stackIn_35_2;
                  stackIn_36_3 = stackIn_35_3;
                  stackIn_36_4 = 0;
                  break L45;
                } else {
                  stackIn_36_0 = (ma) ((Object) stackIn_35_0);
                  stackIn_36_1 = stackIn_35_1;
                  stackIn_36_2 = stackIn_35_2;
                  stackIn_36_3 = stackIn_35_3;
                  stackIn_36_4 = -this.field_O.field_v + this.field_v;
                  break L45;
                }
              }
              ((ma) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, -87);
              break L44;
            } else {
              break L44;
            }
          }
          if (param0 < 17) {
            L46: {
              this.field_Q = (ma) null;
              if (null == this.field_Q) {
                break L46;
              } else {
                L47: {
                  stackIn_47_0 = this.field_Q;

                  stackIn_47_1 = this.field_Q.field_k;

                  if (this.field_J) {
                    stackIn_48_0 = (ma) ((Object) stackIn_47_0);
                    stackIn_48_1 = stackIn_47_1;
                    stackIn_48_2 = -this.field_Q.field_k + this.field_k;
                    break L47;
                  } else {
                    stackIn_48_0 = (ma) ((Object) stackIn_47_0);
                    stackIn_48_1 = stackIn_47_1;
                    stackIn_48_2 = 0;
                    break L47;
                  }
                }
                ((ma) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, this.field_P.field_v, this.field_P.field_n, -107);
                break L46;
              }
            }
            this.h(1);
            return;
          } else {
            L48: {
              if (null == this.field_Q) {
                break L48;
              } else {
                L49: {
                  stackIn_41_0 = this.field_Q;

                  stackIn_41_1 = this.field_Q.field_k;

                  if (this.field_J) {
                    stackIn_42_0 = (ma) ((Object) stackIn_41_0);
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = -this.field_Q.field_k + this.field_k;
                    break L49;
                  } else {
                    stackIn_42_0 = (ma) ((Object) stackIn_41_0);
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = 0;
                    break L49;
                  }
                }
                ((ma) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, this.field_P.field_v, this.field_P.field_n, -107);
                break L48;
              }
            }
            this.h(1);
            return;
          }
        }
    }

    public static void g(int param0) {
        field_S = null;
        field_R = null;
        field_M = null;
        field_H = null;
        if (param0 < 111) {
          sl.g(37);
          field_K = null;
          field_V = null;
          field_N = null;
          return;
        } else {
          field_K = null;
          field_V = null;
          field_N = null;
          return;
        }
    }

    static {
        field_H = new int[4];
        field_R = "Try again";
        field_M = "Provides you with a respawn point if you die";
        field_I = 2;
        field_N = "Drawn";
        field_V = new int[8192];
        field_K = "New Game";
    }
}
