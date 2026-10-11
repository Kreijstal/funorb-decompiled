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
        if (!param0) {
          this.f(-69);
          if (null == this.field_O) {
            return false;
          }
          this.field_O.a((byte) -6, param1 * this.field_O.field_T + this.field_O.field_L);
          return true;
        }
        if (null == this.field_O) {
          return false;
        }
        this.field_O.a((byte) -6, param1 * this.field_O.field_T + this.field_O.field_L);
        return true;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -120) {
            var6 = (qm) null;
            this.a((qm) null, -13, 8, -25);
          }
          if (!super.a(param0, (byte) -122, param2, param3)) {
            return false;
          }
          this.f(-2023111216);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sl.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5 + param5, param6)) {
            return true;
          }
          stackIn_8_0 = (this.d(param5 - 2116)) && (this.a(true, param4));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("sl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        qm var3 = null;
        qm var3Lifetime1;
        qm var3Lifetime2;
        qm var3Lifetime3;
        if (null != this.field_O) {
          this.field_P.field_B.field_j = -(int)((long)this.field_O.field_L * (long)(-this.field_P.field_k + this.field_P.field_B.field_k) >> 16);
          if (null == this.field_Q) {
            if (param0 == -2023111216) {
              return;
            }
            var3 = (qm) null;
            this.a(0, -108, -7, 118, 43, -16, (qm) null);
            return;
          }
          this.field_P.field_B.field_n = -(int)((long)this.field_Q.field_Z * (long)(this.field_P.field_B.field_v - this.field_P.field_v) >> 16);
          if (param0 != -2023111216) {
            var3Lifetime3 = (qm) null;
            this.a(0, -108, -7, 118, 43, -16, (qm) null);
            return;
          }
          return;
        }
        if (null != this.field_Q) {
          this.field_P.field_B.field_n = -(int)((long)this.field_Q.field_Z * (long)(this.field_P.field_B.field_v - this.field_P.field_v) >> 16);
          if (param0 == -2023111216) {
            return;
          }
          var3Lifetime1 = (qm) null;
          this.a(0, -108, -7, 118, 43, -16, (qm) null);
          return;
        }
        if (param0 == -2023111216) {
          return;
        }
        var3Lifetime2 = (qm) null;
        this.a(0, -108, -7, 118, 43, -16, (qm) null);
    }

    private final void h(int param0) {
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_O) {
          if (param0 != 1) {
            return;
          }
          if (this.field_Q != null) {
            if (this.field_P.field_v >= this.field_P.field_B.field_v) {
              this.field_Q.a(1, 1, (byte) 120);
            } else {
              this.field_Q.a(this.field_P.field_v, this.field_P.field_B.field_v, (byte) -46);
            }
          }
          return;
        }
        if (this.field_P.field_k >= this.field_P.field_B.field_k) {
          this.field_O.a(1, (byte) -42, 1);
        } else {
          this.field_O.a(this.field_P.field_B.field_k, (byte) -42, this.field_P.field_k);
        }
        if (param0 != 1) {
          return;
        }
        if (this.field_Q == null) {
          return;
        }
        if (this.field_P.field_v < this.field_P.field_B.field_v) {
          this.field_Q.a(this.field_P.field_v, this.field_P.field_B.field_v, (byte) -46);
        } else {
          this.field_Q.a(1, 1, (byte) 120);
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
        int stackIn_14_4;
        ma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ma stackIn_35_0;
        int stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        int stackIn_36_4;
        ma stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        ma stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        ma stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int stackIn_65_4;
        ma stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_71_2 = 0;
        ma stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_0 = 0;
        ma stackIn_92_0;
        int stackIn_92_1;
        int stackIn_92_2;
        int stackIn_92_3;
        int stackIn_93_4;
        ma stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        ma stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        ma stackIn_120_0;
        int stackIn_120_1;
        int stackIn_120_2;
        int stackIn_120_3;
        int stackIn_121_4;
        ma stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_127_2 = 0;
        ma stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_144_0 = 0;
        ma stackIn_148_0;
        int stackIn_148_1;
        int stackIn_148_2;
        int stackIn_148_3;
        int stackIn_149_4;
        ma stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_155_2 = 0;
        ma stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_161_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        if (this.field_U) {
          var2 = 0;
          if (this.field_J) {
            stackIn_25_0 = 0;
          } else {
            if (null == this.field_Q) {
              var3 = 0;
              if (null != this.field_O) {
                stackIn_6_0 = -this.field_O.field_v + this.field_v;
              } else {
                stackIn_6_0 = this.field_v;
              }
              var4 = stackIn_6_0;
              if (this.field_Q != null) {
                stackIn_9_0 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_9_0 = this.field_k;
              }
              var5 = stackIn_9_0;
              this.field_P.a(var5, var3, var4, var2, -101);
              if (null != this.field_O) {
                stackIn_13_0 = this.field_O;
                stackIn_13_1 = this.field_P.field_k;
                stackIn_13_2 = this.field_P.field_j;
                stackIn_13_3 = this.field_O.field_v;
                if (!this.field_U) {
                  stackIn_14_4 = 0;
                } else {
                  stackIn_14_4 = -this.field_O.field_v + this.field_v;
                }
                ((ma) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_14_4, -87);
              }
              if (param0 < 17) {
                this.field_Q = (ma) null;
              }
              if (null != this.field_Q) {
                stackIn_20_0 = this.field_Q;
                stackIn_20_1 = this.field_Q.field_k;
                if (this.field_J) {
                  stackIn_21_2 = -this.field_Q.field_k + this.field_k;
                } else {
                  stackIn_21_2 = 0;
                }
                ((ma) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2, this.field_P.field_v, this.field_P.field_n, -107);
              }
              this.h(1);
              return;
            }
            stackIn_25_0 = this.field_Q.field_k;
          }
          var3 = stackIn_25_0;
          if (null != this.field_O) {
            stackIn_28_0 = -this.field_O.field_v + this.field_v;
          } else {
            stackIn_28_0 = this.field_v;
          }
          var4 = stackIn_28_0;
          if (this.field_Q != null) {
            stackIn_31_0 = -this.field_Q.field_k + this.field_k;
          } else {
            stackIn_31_0 = this.field_k;
          }
          var5 = stackIn_31_0;
          this.field_P.a(var5, var3, var4, var2, -101);
          if (null != this.field_O) {
            stackIn_35_0 = this.field_O;
            stackIn_35_1 = this.field_P.field_k;
            stackIn_35_2 = this.field_P.field_j;
            stackIn_35_3 = this.field_O.field_v;
            if (!this.field_U) {
              stackIn_36_4 = 0;
            } else {
              stackIn_36_4 = -this.field_O.field_v + this.field_v;
            }
            ((ma) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_36_4, -87);
          }
          if (param0 >= 17) {
            if (null != this.field_Q) {
              stackIn_41_0 = this.field_Q;
              stackIn_41_1 = this.field_Q.field_k;
              if (this.field_J) {
                stackIn_42_2 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_42_2 = 0;
              }
              ((ma) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_42_2, this.field_P.field_v, this.field_P.field_n, -107);
            }
          } else {
            this.field_Q = (ma) null;
            if (null != this.field_Q) {
              stackIn_47_0 = this.field_Q;
              stackIn_47_1 = this.field_Q.field_k;
              if (this.field_J) {
                stackIn_48_2 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_48_2 = 0;
              }
              ((ma) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_48_2, this.field_P.field_v, this.field_P.field_n, -107);
            }
          }
        } else {
          if (null != this.field_O) {
            var2 = this.field_O.field_v;
            if (this.field_J) {
              stackIn_138_0 = 0;
            } else {
              if (null == this.field_Q) {
                var3 = 0;
                if (null != this.field_O) {
                  stackIn_113_0 = -this.field_O.field_v + this.field_v;
                } else {
                  stackIn_113_0 = this.field_v;
                }
                var4 = stackIn_113_0;
                if (this.field_Q != null) {
                  stackIn_116_0 = -this.field_Q.field_k + this.field_k;
                } else {
                  stackIn_116_0 = this.field_k;
                }
                var5 = stackIn_116_0;
                this.field_P.a(var5, var3, var4, var2, -101);
                if (null != this.field_O) {
                  stackIn_120_0 = this.field_O;
                  stackIn_120_1 = this.field_P.field_k;
                  stackIn_120_2 = this.field_P.field_j;
                  stackIn_120_3 = this.field_O.field_v;
                  if (!this.field_U) {
                    stackIn_121_4 = 0;
                  } else {
                    stackIn_121_4 = -this.field_O.field_v + this.field_v;
                  }
                  ((ma) (Object) stackIn_120_0).a(stackIn_120_1, stackIn_120_2, stackIn_120_3, stackIn_121_4, -87);
                }
                if (param0 >= 17) {
                  if (null != this.field_Q) {
                    stackIn_126_0 = this.field_Q;
                    stackIn_126_1 = this.field_Q.field_k;
                    if (this.field_J) {
                      stackIn_127_2 = -this.field_Q.field_k + this.field_k;
                    } else {
                      stackIn_127_2 = 0;
                    }
                    ((ma) (Object) stackIn_126_0).a(stackIn_126_1, stackIn_127_2, this.field_P.field_v, this.field_P.field_n, -107);
                  }
                } else {
                  this.field_Q = (ma) null;
                  if (null != this.field_Q) {
                    stackIn_132_0 = this.field_Q;
                    stackIn_132_1 = this.field_Q.field_k;
                    if (this.field_J) {
                      stackIn_133_2 = -this.field_Q.field_k + this.field_k;
                    } else {
                      stackIn_133_2 = 0;
                    }
                    ((ma) (Object) stackIn_132_0).a(stackIn_132_1, stackIn_133_2, this.field_P.field_v, this.field_P.field_n, -107);
                  }
                }
                this.h(1);
                return;
              }
              stackIn_138_0 = this.field_Q.field_k;
            }
            var3 = stackIn_138_0;
            if (null != this.field_O) {
              stackIn_141_0 = -this.field_O.field_v + this.field_v;
            } else {
              stackIn_141_0 = this.field_v;
            }
            var4 = stackIn_141_0;
            if (this.field_Q != null) {
              stackIn_144_0 = -this.field_Q.field_k + this.field_k;
            } else {
              stackIn_144_0 = this.field_k;
            }
            var5 = stackIn_144_0;
            this.field_P.a(var5, var3, var4, var2, -101);
            if (null != this.field_O) {
              stackIn_148_0 = this.field_O;
              stackIn_148_1 = this.field_P.field_k;
              stackIn_148_2 = this.field_P.field_j;
              stackIn_148_3 = this.field_O.field_v;
              if (!this.field_U) {
                stackIn_149_4 = 0;
              } else {
                stackIn_149_4 = -this.field_O.field_v + this.field_v;
              }
              ((ma) (Object) stackIn_148_0).a(stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_149_4, -87);
            }
            if (param0 >= 17) {
              if (null != this.field_Q) {
                stackIn_154_0 = this.field_Q;
                stackIn_154_1 = this.field_Q.field_k;
                if (this.field_J) {
                  stackIn_155_2 = -this.field_Q.field_k + this.field_k;
                } else {
                  stackIn_155_2 = 0;
                }
                ((ma) (Object) stackIn_154_0).a(stackIn_154_1, stackIn_155_2, this.field_P.field_v, this.field_P.field_n, -107);
              }
            } else {
              this.field_Q = (ma) null;
              if (null != this.field_Q) {
                stackIn_160_0 = this.field_Q;
                stackIn_160_1 = this.field_Q.field_k;
                if (this.field_J) {
                  stackIn_161_2 = -this.field_Q.field_k + this.field_k;
                } else {
                  stackIn_161_2 = 0;
                }
                ((ma) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_161_2, this.field_P.field_v, this.field_P.field_n, -107);
              }
            }
            this.h(1);
            return;
          }
          var2 = 0;
          if (this.field_J) {
            stackIn_82_0 = 0;
          } else {
            if (null == this.field_Q) {
              var3 = 0;
              if (null != this.field_O) {
                stackIn_57_0 = -this.field_O.field_v + this.field_v;
              } else {
                stackIn_57_0 = this.field_v;
              }
              var4 = stackIn_57_0;
              if (this.field_Q != null) {
                stackIn_60_0 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_60_0 = this.field_k;
              }
              var5 = stackIn_60_0;
              this.field_P.a(var5, var3, var4, var2, -101);
              if (null != this.field_O) {
                stackIn_64_0 = this.field_O;
                stackIn_64_1 = this.field_P.field_k;
                stackIn_64_2 = this.field_P.field_j;
                stackIn_64_3 = this.field_O.field_v;
                if (!this.field_U) {
                  stackIn_65_4 = 0;
                } else {
                  stackIn_65_4 = -this.field_O.field_v + this.field_v;
                }
                ((ma) (Object) stackIn_64_0).a(stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_65_4, -87);
              }
              if (param0 >= 17) {
                if (null != this.field_Q) {
                  stackIn_70_0 = this.field_Q;
                  stackIn_70_1 = this.field_Q.field_k;
                  if (this.field_J) {
                    stackIn_71_2 = -this.field_Q.field_k + this.field_k;
                  } else {
                    stackIn_71_2 = 0;
                  }
                  ((ma) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_71_2, this.field_P.field_v, this.field_P.field_n, -107);
                }
              } else {
                this.field_Q = (ma) null;
                if (null != this.field_Q) {
                  stackIn_76_0 = this.field_Q;
                  stackIn_76_1 = this.field_Q.field_k;
                  if (this.field_J) {
                    stackIn_77_2 = -this.field_Q.field_k + this.field_k;
                  } else {
                    stackIn_77_2 = 0;
                  }
                  ((ma) (Object) stackIn_76_0).a(stackIn_76_1, stackIn_77_2, this.field_P.field_v, this.field_P.field_n, -107);
                }
              }
              this.h(1);
              return;
            }
            stackIn_82_0 = this.field_Q.field_k;
          }
          var3 = stackIn_82_0;
          if (null != this.field_O) {
            stackIn_85_0 = -this.field_O.field_v + this.field_v;
          } else {
            stackIn_85_0 = this.field_v;
          }
          var4 = stackIn_85_0;
          if (this.field_Q != null) {
            stackIn_88_0 = -this.field_Q.field_k + this.field_k;
          } else {
            stackIn_88_0 = this.field_k;
          }
          var5 = stackIn_88_0;
          this.field_P.a(var5, var3, var4, var2, -101);
          if (null != this.field_O) {
            stackIn_92_0 = this.field_O;
            stackIn_92_1 = this.field_P.field_k;
            stackIn_92_2 = this.field_P.field_j;
            stackIn_92_3 = this.field_O.field_v;
            if (!this.field_U) {
              stackIn_93_4 = 0;
            } else {
              stackIn_93_4 = -this.field_O.field_v + this.field_v;
            }
            ((ma) (Object) stackIn_92_0).a(stackIn_92_1, stackIn_92_2, stackIn_92_3, stackIn_93_4, -87);
          }
          if (param0 >= 17) {
            if (null != this.field_Q) {
              stackIn_98_0 = this.field_Q;
              stackIn_98_1 = this.field_Q.field_k;
              if (this.field_J) {
                stackIn_99_2 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_99_2 = 0;
              }
              ((ma) (Object) stackIn_98_0).a(stackIn_98_1, stackIn_99_2, this.field_P.field_v, this.field_P.field_n, -107);
            }
          } else {
            this.field_Q = (ma) null;
            if (null != this.field_Q) {
              stackIn_104_0 = this.field_Q;
              stackIn_104_1 = this.field_Q.field_k;
              if (this.field_J) {
                stackIn_105_2 = -this.field_Q.field_k + this.field_k;
              } else {
                stackIn_105_2 = 0;
              }
              ((ma) (Object) stackIn_104_0).a(stackIn_104_1, stackIn_105_2, this.field_P.field_v, this.field_P.field_n, -107);
            }
          }
        }
        this.h(1);
    }

    public static void g(int param0) {
        field_S = null;
        field_R = null;
        field_M = null;
        field_H = null;
        if (param0 >= 111) {
          field_K = null;
          field_V = null;
          field_N = null;
          return;
        }
        sl.g(37);
        field_K = null;
        field_V = null;
        field_N = null;
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
