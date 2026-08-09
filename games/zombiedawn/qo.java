/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends vf {
    static int field_s;
    private gj[] field_u;
    private gj field_v;
    static String field_t;
    static af field_w;
    static int[] field_r;
    static boolean field_x;

    final static void c(int param0) {
        if (param0 != 29756) {
            field_s = 56;
        }
    }

    final void a(int param0, vn[] param1, int param2) {
        int var4_int = param2;
        if (param0 != 1) {
            return;
        }
        try {
            if (!(null != this.field_u[var4_int])) {
                this.field_u[var4_int] = new gj();
            }
            this.field_u[param2].field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qo.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            e.field_S.a(nm.field_f, rm.field_b, true, true);
            e.field_S.g(-123);
            if (param0 < -120) {
              L1: while (true) {
                if (!on.b(-54)) {
                  if (0 == (ba.field_s ^ -1)) {
                    if (ce.field_q) {
                      stackIn_12_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (vh.field_c == tk.field_a) {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (!gl.field_E.a(-114)) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (vh.field_c == fk.field_F) {
                            stackIn_24_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            return -1;
                          }
                        }
                      }
                    }
                  } else {
                    var1_int = ba.field_s;
                    og.b(-112, -1);
                    stackIn_8_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  e.field_S.a(kg.field_i, (byte) 96, lc.field_c);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -36;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "qo.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    qo(qo param0, boolean param1) {
        this();
        try {
            param0.a((byte) 125, param1, (qo) (this));
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, vn[] param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var7 = this.field_u;
              var3 = var7;
              if (param0 > 66) {
                break L1;
              } else {
                field_x = false;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_t = param1;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("qo.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, vn[] param2, int param3, vn[] param4, rb param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, rb param18, vn[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            L1: {
              if (param9 == -75) {
                break L1;
              } else {
                field_x = true;
                break L1;
              }
            }
            ig.a(param18, param14, param11, 495, param12, param5, param3, param8, param0, new mf(param19), param15, new mf(param4), param1, new mf(param2), param17, param7, param6, param10, param16, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("qo.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        ga stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        gj var7 = null;
        gj var9 = null;
        an var10 = null;
        gj var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof an)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (ga) (param3);
                break L1;
              }
            }
            L2: {
              var10 = (an) ((Object) stackIn_3_0);
              g.a(param2 + param3.field_j, (byte) 99, param3.field_i + (param4 + param3.field_k), param2 - (-param3.field_j - param3.field_n), param3.field_k + param4);
              if (var10 != null) {
                param1 = param1 & var10.field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_u[0];
              this.field_v.a(false);
              var7.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
              if (var10 != null) {
                L4: {
                  if (!var10.field_x) {
                    break L4;
                  } else {
                    var11 = this.field_u[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
                      break L4;
                    }
                  }
                }
                if (!var10.field_l) {
                  break L3;
                } else {
                  L5: {
                    var12 = this.field_u[3];
                    if (0 == var10.field_m) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_u[2];
                  if (var9 != null) {
                    var9.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (!param3.e(param0 + -16794956)) {
                break L6;
              } else {
                var13 = this.field_u[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
                  break L6;
                }
              }
            }
            L7: {
              if (param0 == 16777215) {
                break L7;
              } else {
                this.a((byte) 52, 14);
                break L7;
              }
            }
            L8: {
              if (!param1) {
                var14 = this.field_u[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a((qo) (this), param4, param2, (byte) 116, param3, this.field_v);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            this.field_v.a(0, param3, param2, (qo) (this), param4);
            pa.a(-21189);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("qo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param4 + ')');
        }
    }

    final gj a(byte param0, int param1) {
        if (param0 != 73) {
            return (gj) null;
        }
        gj dupTemp$0 = new gj();
        this.field_u[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public qo() {
        this.field_u = new gj[6];
        this.field_v = new gj();
        gj dupTemp$0 = new gj();
        this.field_u[0] = dupTemp$0;
        gj var1 = dupTemp$0;
        var1.a(false);
    }

    private final void a(byte param0, boolean param1, qo param2) {
        gj dupTemp$2 = null;
        int var4_int = 0;
        int var5 = 0;
        gj var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        gj stackIn_9_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              super.a(param2, (byte) -95);
              var4_int = 118 / ((param0 - 32) / 58);
              if (param1) {
                var5 = 0;
                L2: while (true) {
                  if (6 <= var5) {
                    break L1;
                  } else {
                    L3: {
                      var6 = this.field_u[var5];
                      if (var6 == null) {
                        param2.field_u[var5] = null;
                        break L3;
                      } else {
                        L4: {
                          var7 = param2.field_u[var5];
                          stackIn_8_0 = (gj) (var6);

                          stackIn_8_1 = 33;

                          if (var7 != null) {
                            stackIn_9_0 = (gj) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (gj) (var7);
                            break L4;
                          } else {
                            dupTemp$2 = new gj();
                            param2.field_u[var5] = dupTemp$2;
                            stackIn_9_0 = (gj) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (gj) (dupTemp$2);
                            break L4;
                          }
                        }
                        ((gj) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                gp.a(this.field_u, 0, param2.field_u, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qo.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void a(vn param0, int param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var7 = this.field_u;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_x = param0;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("qo.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
            return;
        }
        field_r = null;
        field_t = null;
        field_w = null;
    }

    static {
        field_t = "Type your password again to make sure it's correct";
        field_w = new af();
        field_x = false;
    }
}
