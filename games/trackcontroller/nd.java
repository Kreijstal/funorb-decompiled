/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends td implements m {
    private rh[] field_K;
    private a field_J;
    private String[] field_D;
    static int[] field_F;
    static nh field_M;
    static int[] field_G;
    static String field_I;
    static String field_H;
    static qj[] field_L;

    final static String a(int param0, be param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
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
              if (param0 < -4) {
                break L1;
              } else {
                field_I = (String) null;
                break L1;
              }
            }
            try {
              L2: {
                L3: {
                  var3_int = param1.l(-1);
                  if (param2 < var3_int) {
                    var3_int = param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param1.field_k = param1.field_k + nb.field_v.a(param1.field_j, param1.field_k, 0, 0, var3_int, var4);
                var5 = ka.a(0, -129, var4, var3_int);
                stackOut_5_0 = (String) (var5);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackOut_7_0 = "Cabbage";
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("nd.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (param3 != 29221) {
            nd.b(false);
        }
        super.a(param0, param1, param2, param3 ^ 0);
        if (param0 != 0) {
            return;
        }
        oh var5 = gk.field_c;
        if (!(null == this.field_D)) {
            discarded$0 = var5.a(el.field_K, this.field_p + param1, this.field_m + param2, this.field_x, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_G);
        }
    }

    final static ng[] a(kk param0, int param1, int param2, int param3) {
        String discarded$2 = null;
        RuntimeException var4 = null;
        be var5 = null;
        Object stackIn_4_0 = null;
        ng[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ng[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 16777215) {
                break L1;
              } else {
                var5 = (be) null;
                discarded$2 = nd.a(83, (be) null, -120);
                break L1;
              }
            }
            if (sk.a(param1, param0, 1, param2)) {
              stackOut_5_0 = me.d(-104);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("nd.C(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ng[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          if (param4 <= param3) {
            if (param3 < param1) {
              e.a(param7, param1, ll.field_i, param3, param2, param6, param5, param0 ^ -26362, param4);
              break L0;
            } else {
              if (param1 <= param4) {
                e.a(param6, param3, ll.field_i, param4, param7, param2, param5, param0 ^ -26362, param1);
                break L0;
              } else {
                e.a(param7, param3, ll.field_i, param1, param6, param2, param5, -26361, param4);
                break L0;
              }
            }
          } else {
            if (param4 < param1) {
              e.a(param2, param1, ll.field_i, param4, param7, param6, param5, param0 ^ -26362, param3);
              break L0;
            } else {
              if (param1 <= param3) {
                e.a(param6, param4, ll.field_i, param3, param2, param7, param5, -26361, param1);
                break L0;
              } else {
                e.a(param2, param4, ll.field_i, param1, param6, param7, param5, -26361, param3);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            field_L = (qj[]) null;
            break L1;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 <= -34) {
              L1: {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param1 < 128) {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param1 < 160) {
                  break L2;
                } else {
                  if (param1 > 255) {
                    break L2;
                  } else {
                    return true;
                  }
                }
              }
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  var6 = h.field_e;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= var6.length) {
                      break L3;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L4;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "nd.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final void a(String[] param0, byte param1) {
        String discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ne var4 = null;
        int var5 = 0;
        int var6 = 0;
        be var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_B.e(1);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != 0) {
                  var3_int = param0.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      L3: {
                        var4 = new ne(gk.field_c, 0, 1);
                        this.field_K = new rh[1 + var3_int];
                        if (param1 == -58) {
                          break L3;
                        } else {
                          var7 = (be) null;
                          discarded$1 = nd.a(59, (be) null, -116);
                          break L3;
                        }
                      }
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          this.field_K[var3_int] = new rh(j.field_d, (tg) (this));
                          this.field_K[var3_int].field_y = (t) ((Object) var4);
                          this.field_K[var3_int].a(15, -3050, (var3_int + 1) * 16 + 20, 100, 0);
                          this.a(false, this.field_K[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_K[var5] = new rh(this.field_D[var5], (tg) (this));
                          this.field_K[var5].field_y = (t) ((Object) var4);
                          this.field_K[var5].field_n = ke.field_b;
                          this.field_K[var5].a(15, -3050, 16 * var5 + 20, 80, 0);
                          this.a(false, this.field_K[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_D[var4_int] = ob.a((byte) 100, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("nd.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param4 == -27322) {
              var6_int = 0;
              L1: while (true) {
                if (this.field_D.length <= var6_int) {
                  L2: {
                    if (param0 != this.field_K[this.field_D.length]) {
                      break L2;
                    } else {
                      this.field_J.a((byte) 125);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (this.field_K[var6_int] != param0) {
                      break L3;
                    } else {
                      this.field_J.a(true, this.field_D[var6_int]);
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("nd.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nd(a param0) {
        super(0, 0, 0, 0, (t) null);
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a((byte) -84, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) == -99) {
                stackOut_6_0 = this.a(param2, -52);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param3 ^ -1) == -100) {
                  stackOut_10_0 = this.a(param2, true);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = 68 / ((17 - param0) / 51);
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("nd.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        ng[] discarded$0 = null;
        field_M = null;
        field_H = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0) {
            kk var2 = (kk) null;
            discarded$0 = nd.a((kk) null, 7, 76, -121);
        }
    }

    static {
        field_F = new int[4];
        field_M = new nh(3);
        field_G = new int[13];
        field_H = "Log in";
        field_I = "No highscores";
    }
}
