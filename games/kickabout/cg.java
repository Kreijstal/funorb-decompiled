/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ct {
    private int field_J;
    static String[] field_G;
    private String field_A;
    private hu field_I;
    static ut field_K;
    private boolean field_B;
    static String[] field_E;
    static int field_D;
    private int field_C;
    static String field_L;
    private int field_M;

    final static void a(String param0, byte param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param1 <= -83) {
              L1: {
                k.field_i = k.field_i + 1;
                if (0 != (ji.field_Hb ^ -1)) {
                  break L1;
                } else {
                  if (lj.field_h == -1) {
                    ji.field_Hb = el.field_A;
                    lj.field_h = n.field_m;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (param0 != null) {
                    if (param0.equals(mh.field_o)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    if (null != mh.field_o) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!nc.field_a) {
                    if (us.field_e <= k.field_i) {
                      if (k.field_i < us.field_e - -rd.field_i) {
                        stackIn_19_0 = 1;
                        break L4;
                      } else {
                        stackIn_19_0 = 0;
                        break L4;
                      }
                    } else {
                      stackIn_19_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_19_0 = 0;
                    break L4;
                  }
                }
                L5: {
                  var2_int = stackIn_19_0;
                  if (param0 == null) {
                    k.field_i = 0;
                    break L5;
                  } else {
                    if (nc.field_a) {
                      k.field_i = us.field_e;
                      break L5;
                    } else {
                      if (var2_int == 0) {
                        k.field_i = 0;
                        break L5;
                      } else {
                        k.field_i = us.field_e;
                        break L5;
                      }
                    }
                  }
                }
                td.field_d = lj.field_h;
                ws.field_e = ji.field_Hb;
                if (param0 == null) {
                  if (var2_int != 0) {
                    nc.field_a = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  nc.field_a = false;
                  break L2;
                }
              }
              L6: {
                if (nc.field_a) {
                  break L6;
                } else {
                  if (us.field_e <= k.field_i) {
                    break L6;
                  } else {
                    if (!el.field_C) {
                      break L6;
                    } else {
                      k.field_i = 0;
                      td.field_d = lj.field_h;
                      ws.field_e = ji.field_Hb;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                mh.field_o = param0;
                if (!nc.field_a) {
                  break L7;
                } else {
                  if (k.field_i == nd.field_b) {
                    k.field_i = 0;
                    nc.field_a = false;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              lj.field_h = -1;
              ji.field_Hb = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("cg.D(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L8;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void k(int param0) {
        field_E = null;
        field_L = null;
        field_G = null;
        field_K = null;
        if (param0 < 89) {
            String var2 = (String) null;
            cg.a((String) null, (byte) 122);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_t - -param2;
        int var6 = param3 + this.field_g;
        super.a(param0, (int) (char)param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        int var7 = !this.field_B ? 0 : -(2 * this.field_J) + -this.field_M + this.field_n;
        this.field_I.a(this.field_A, var5 + (var7 + this.field_J), this.field_J + var6, -this.field_J + this.field_M, this.field_i - this.field_J * 2, this.field_C, -1, this.field_B ? 0 : 2, 1, this.field_I.field_G);
    }

    final String f(int param0) {
        int var2 = this.field_z.field_m ? 1 : 0;
        this.field_z.field_m = this.field_m;
        String var3 = this.field_z.f(param0);
        this.field_z.field_m = var2 != 0 ? true : false;
        return var3;
    }

    cg(int param0, int param1, int param2, int param3, fd param4, boolean param5, int param6, int param7, hu param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gj) null, (jv) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_C = param9;
              this.field_z = param4;
              this.field_J = param7;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((cg) (this)).field_B = stackIn_4_1 != 0;
              this.field_A = param10;
              this.field_M = param6;
              this.field_I = param8;
              var12_int = this.field_M - this.field_J;
              var13 = this.field_I.c(param10, var12_int, this.field_I.field_G) - -(2 * this.field_J);
              if (param3 < var13) {
                this.a(var13, 1, param0, param2, param1);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_B) {
                stackIn_10_0 = this.field_M + 2 * this.field_J;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_z.a(-(this.field_J * 2) + param3, 1, var14, -this.field_M + (param2 + -(this.field_J * 3)), this.field_J + (var13 + -param3 >> -954640639));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("cg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_D = 0;
        field_G = new String[]{"Right-click", "Mouse wheel"};
        field_L = "<%0> beats <%1>, <%2> to <%3>, sealing their place <%4>.";
    }
}
