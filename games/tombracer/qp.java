/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends we {
    static String field_v;
    static boolean field_s;
    private int[][] field_u;
    private String[][] field_t;
    private int field_x;
    private int field_w;
    static qla field_r;

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -13 / ((24 - param1) / 57);
        return -1 != (param0 & 16 ^ -1) ? true : false;
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            field_v = (String) null;
            return koa.b(0) + -30;
        }
        return koa.b(0) + -30;
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
            return (String) null;
        }
        if (!(param0 != 0)) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 112);
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        da var12 = null;
        String var13 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
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
            L1: {
              var10_int = param5 + param2 + param3;
              if (var10_int == 0) {
                break L1;
              } else {
                param2 = (200 * param2 + var10_int) / (var10_int * 2);
                param5 = (var10_int + 200 * param5) / (var10_int * 2);
                break L1;
              }
            }
            if (param1 == 127) {
              L2: {
                if (500 <= var10_int) {
                  stackOut_6_0 = kha.field_a;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = Integer.toString(var10_int);
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              L3: {
                var11 = stackIn_7_0;
                var13 = var11;
                var13 = var11;
                var12 = kn.field_p;
                if ((param0 ^ -1) > -11) {
                  stackOut_9_0 = "0" + (char)(48 - -param0);
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = Integer.toString(param0);
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              L4: {
                var13 = stackIn_10_0;
                if (param0 != -1) {
                  break L4;
                } else {
                  var13 = "";
                  break L4;
                }
              }
              var12.a(-1, -1, es.field_h[0], param7, param4, var13);
              var12.a(param4, false, param8, es.field_h[1], param7, -1);
              var12.a(param4, false, Integer.toString(param6), es.field_h[2], param7, -1);
              var12.a(param4, false, var11, es.field_h[3], param7, -1);
              var12.a(param4, false, param2 + "%", es.field_h[4], param7, -1);
              var12.a(param4, false, param5 + "%", es.field_h[5], param7, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var10);
            stackOut_14_1 = new StringBuilder().append("qp.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param8 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 > 116) {
          L0: {
            param1 = (127 & param0) * param1 >> 1747666919;
            if (2 <= param1) {
              break L0;
            } else {
              param1 = 2;
              if (TombRacer.field_G) {
                break L0;
              } else {
                return (65408 & param0) - -param1;
              }
            }
          }
          if (-127 <= (param1 ^ -1)) {
            return (65408 & param0) - -param1;
          } else {
            param1 = 126;
            return (65408 & param0) - -param1;
          }
        } else {
          return -119;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          return 100;
        } else {
          return -80 + (aaa.a(false) >> 1519033153) - ((this.field_m[0].e(-163) >> -456821343) * this.field_m.length - param1 * this.field_m[0].e(-163));
        }
    }

    final void h(int param0, int param1) {
        int discarded$0 = 0;
        this.field_x = param1;
        if (param0 != 18608) {
            discarded$0 = this.g(-85, -41);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            return 88;
        }
        return this.a((byte) 116, param0) + this.field_m[param0].e(-163);
    }

    qp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_x = 0;
        this.field_w = 0;
        try {
            this.field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        String[] var4 = null;
        int[] var5 = null;
        upa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        String[] var15 = null;
        int stackIn_3_0 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        int stackIn_20_7 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_21_8 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        int stackOut_19_7 = 0;
        int stackOut_19_8 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var15 = this.field_t[param1];
          var4 = var15;
          var5 = this.field_u[param1];
          var6 = sb.field_a;
          var7 = 0;
          if (var6 != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        if (param0 > 39) {
          var9 = 140 + param2;
          var10 = 0;
          var11 = 140 + param2;
          L1: while (true) {
            if (-11 < (var10 ^ -1)) {
              var12 = var15[var10];
              if (var14 == 0) {
                L2: {
                  if (var12 == null) {
                    break L2;
                  } else {
                    if (0 == var12.length()) {
                      break L2;
                    } else {
                      L3: {
                        var13 = 0;
                        if (var8 == 0) {
                          if (!ue.a(var12, 0)) {
                            break L3;
                          } else {
                            var8 = 1;
                            var13 = 1;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        stackOut_18_0 = this;
                        stackOut_18_1 = var10 - -1;
                        stackOut_18_2 = 127;
                        stackOut_18_3 = var5[1 + 4 * var10];
                        stackOut_18_4 = var5[4 * var10 - -2];
                        stackOut_18_5 = var11;
                        stackOut_18_6 = var5[3 + var10 * 4];
                        stackOut_18_7 = var5[4 * var10];
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        stackIn_20_4 = stackOut_18_4;
                        stackIn_20_5 = stackOut_18_5;
                        stackIn_20_6 = stackOut_18_6;
                        stackIn_20_7 = stackOut_18_7;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        stackIn_19_4 = stackOut_18_4;
                        stackIn_19_5 = stackOut_18_5;
                        stackIn_19_6 = stackOut_18_6;
                        stackIn_19_7 = stackOut_18_7;
                        if (var13 != 0) {
                          stackOut_20_0 = this;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = stackIn_20_2;
                          stackOut_20_3 = stackIn_20_3;
                          stackOut_20_4 = stackIn_20_4;
                          stackOut_20_5 = stackIn_20_5;
                          stackOut_20_6 = stackIn_20_6;
                          stackOut_20_7 = stackIn_20_7;
                          stackOut_20_8 = 10309393;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          stackIn_21_2 = stackOut_20_2;
                          stackIn_21_3 = stackOut_20_3;
                          stackIn_21_4 = stackOut_20_4;
                          stackIn_21_5 = stackOut_20_5;
                          stackIn_21_6 = stackOut_20_6;
                          stackIn_21_7 = stackOut_20_7;
                          stackIn_21_8 = stackOut_20_8;
                          break L4;
                        } else {
                          stackOut_19_0 = this;
                          stackOut_19_1 = stackIn_19_1;
                          stackOut_19_2 = stackIn_19_2;
                          stackOut_19_3 = stackIn_19_3;
                          stackOut_19_4 = stackIn_19_4;
                          stackOut_19_5 = stackIn_19_5;
                          stackOut_19_6 = stackIn_19_6;
                          stackOut_19_7 = stackIn_19_7;
                          stackOut_19_8 = 2431750;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          stackIn_21_2 = stackOut_19_2;
                          stackIn_21_3 = stackOut_19_3;
                          stackIn_21_4 = stackOut_19_4;
                          stackIn_21_5 = stackOut_19_5;
                          stackIn_21_6 = stackOut_19_6;
                          stackIn_21_7 = stackOut_19_7;
                          stackIn_21_8 = stackOut_19_8;
                          break L4;
                        }
                      }
                      this.a(stackIn_21_1, (byte) stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, stackIn_21_7, stackIn_21_8 | -16777216, var12);
                      var7 = 1;
                      var9 = var11;
                      break L2;
                    }
                  }
                }
                var10++;
                var11 += 20;
                continue L1;
              } else {
                return var7 != 0;
              }
            } else {
              L5: {
                if (var8 != 0) {
                  break L5;
                } else {
                  var7 = 1;
                  this.a(-1, (byte) 127, var6.field_f, var6.field_g, var9 + 20, var6.field_j, var6.field_l, -5818367, fna.field_k);
                  break L5;
                }
              }
              return var7 != 0;
            }
          }
        } else {
          return true;
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_v = null;
        if (param0 <= 63) {
            field_v = (String) null;
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        int var4 = 0;
        Object var5 = null;
        String var5_ref = null;
        int var6 = 0;
        L0: {
          es.field_h = new int[]{85, 130, 260, 365, 470, 540};
          if (param2 <= -9) {
            break L0;
          } else {
            this.a(false, -74, (byte) 102);
            break L0;
          }
        }
        qr.field_v.a(param1 + 63, false, b.field_v.toUpperCase() + " - " + wg.field_m[this.field_x].toUpperCase(), 65, -14279929, -1);
        var4 = 120 + param1;
        eda.field_f.a(-1, -1, es.field_h[0], -14671840, var4, hl.field_a);
        eda.field_f.a(var4, false, pta.field_g.toUpperCase(), es.field_h[1], -14671840, -1);
        eda.field_f.a(var4, false, nj.field_o.toUpperCase(), es.field_h[2], -14671840, -1);
        eda.field_f.a(var4, false, rb.field_q.toUpperCase(), es.field_h[3], -14671840, -1);
        eda.field_f.a(var4, false, ufa.field_u.toUpperCase(), es.field_h[4], -14671840, -1);
        eda.field_f.a(var4, false, ida.field_a.toUpperCase(), es.field_h[5], -14671840, -1);
        var5 = null;
        var6 = this.field_w;
        if (0 == var6) {
          var5_ref = dt.field_n;
          if (var5_ref != null) {
            oka.a(var5_ref.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> -1552513311, -1);
            if (!TombRacer.field_G) {
              return;
            } else {
              discarded$6 = this.a((byte) 106, this.field_x, param1);
              return;
            }
          } else {
            discarded$7 = this.a((byte) 106, this.field_x, param1);
            return;
          }
        } else {
          if ((var6 ^ -1) == -2) {
            var5_ref = kt.field_H;
            if (var5_ref != null) {
              oka.a(var5_ref.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> -1552513311, -1);
              if (!TombRacer.field_G) {
                return;
              } else {
                discarded$8 = this.a((byte) 106, this.field_x, param1);
                return;
              }
            } else {
              discarded$9 = this.a((byte) 106, this.field_x, param1);
              return;
            }
          } else {
            if (var5 != null) {
              oka.a(((String) (var5)).toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> -1552513311, -1);
              if (!TombRacer.field_G) {
                return;
              } else {
                discarded$10 = this.a((byte) 106, this.field_x, param1);
                return;
              }
            } else {
              discarded$11 = this.a((byte) 106, this.field_x, param1);
              return;
            }
          }
        }
    }

    final boolean c(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 0) {
            discarded$0 = this.a(-73, (byte) -31);
            return super.c(param0, 0);
        }
        return super.c(param0, 0);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        String var6 = null;
        upa var7 = null;
        upa var8 = null;
        upa var14 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2 + 0);
        if (param2 == 15283) {
          if (param0) {
            if (!vpa.a(111)) {
              L0: {
                var14 = sb.field_a;
                if (var14 != null) {
                  if (!var14.field_i) {
                    this.field_w = 0;
                    return;
                  } else {
                    if (null != var14.field_h) {
                      this.field_w = 2;
                      this.field_u = var14.field_m;
                      this.field_t = var14.field_h;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        this.field_w = 0;
                        return;
                      }
                    } else {
                      this.field_w = 1;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        this.field_w = 2;
                        this.field_u = var14.field_m;
                        this.field_t = var14.field_h;
                        this.field_w = 0;
                        return;
                      }
                    }
                  }
                } else {
                  sb.field_a = pt.a(22578, 7, 10, 0);
                  this.field_w = 0;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    if (!var14.field_i) {
                      this.field_w = 0;
                      return;
                    } else {
                      if (null != var14.field_h) {
                        this.field_w = 2;
                        this.field_u = var14.field_m;
                        this.field_t = var14.field_h;
                        if (var5 == 0) {
                          return;
                        } else {
                          this.field_w = 0;
                          return;
                        }
                      } else {
                        this.field_w = 1;
                        this.field_w = 2;
                        this.field_u = var14.field_m;
                        this.field_t = var14.field_h;
                        this.field_w = 0;
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              this.field_w = 1;
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = (String) null;
          this.a(38, (byte) 100, -54, 60, 55, -54, -22, -27, (String) null);
          if (param0) {
            if (!vpa.a(111)) {
              var8 = sb.field_a;
              var7 = var8;
              if (var8 == null) {
                sb.field_a = pt.a(22578, 7, 10, 0);
                this.field_w = 0;
                if (var5 != 0) {
                  if (!var8.field_i) {
                    this.field_w = 0;
                    return;
                  } else {
                    L1: {
                      if (null != var8.field_h) {
                        break L1;
                      } else {
                        this.field_w = 1;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                    this.field_w = 2;
                    this.field_u = var8.field_m;
                    this.field_t = var8.field_h;
                    if (var5 != 0) {
                      this.field_w = 0;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (var8.field_i) {
                  if (null != var8.field_h) {
                    this.field_w = 2;
                    this.field_u = var8.field_m;
                    this.field_t = var8.field_h;
                    if (var5 == 0) {
                      return;
                    } else {
                      this.field_w = 0;
                      return;
                    }
                  } else {
                    this.field_w = 1;
                    if (var5 == 0) {
                      return;
                    } else {
                      this.field_w = 2;
                      this.field_u = var8.field_m;
                      this.field_t = var8.field_h;
                      this.field_w = 0;
                      return;
                    }
                  }
                } else {
                  this.field_w = 0;
                  return;
                }
              }
            } else {
              this.field_w = 1;
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1) {
        boolean discarded$4 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -13) {
          L0: {
            discarded$4 = this.a((byte) 118, -37, -116);
            if (this.field_x != -1 + param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_x != -1 + param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_v = "Unfortunately you are not eligible to create an account.";
    }
}
