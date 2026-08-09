/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kq extends fw {
    static int field_L;
    private kb field_Q;
    static me field_M;
    static je field_N;
    static wk field_P;

    final static String a(int param0, int param1, int param2, ha param3, int param4) {
        String[] array$0 = null;
        String[] array$1 = null;
        String[] array$2 = null;
        Object stackIn_7_0 = null;
        int stackIn_13_0;
        String stackIn_13_1;
        String[] stackIn_13_2;
        String[] stackIn_13_3;
        int stackIn_13_4;
        int stackIn_14_0 = 0;
        String stackIn_14_1 = null;
        String[] stackIn_14_2 = null;
        String[] stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        String stackIn_14_5 = null;
        int stackIn_16_4;
        int stackIn_17_4;
        String stackIn_17_5;
        String stackIn_18_0 = null;
        int stackIn_29_0;
        String stackIn_29_1;
        String[] stackIn_29_2;
        String[] stackIn_29_3;
        int stackIn_29_4;
        int stackIn_30_0 = 0;
        String stackIn_30_1 = null;
        String[] stackIn_30_2 = null;
        String[] stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        String stackIn_30_5 = null;
        int stackIn_32_4;
        int stackIn_33_4;
        String stackIn_33_5;
        String stackIn_34_0 = null;
        int stackIn_41_0;
        String stackIn_41_1;
        String[] stackIn_41_2;
        String[] stackIn_41_3;
        int stackIn_41_4;
        int stackIn_42_0 = 0;
        String stackIn_42_1 = null;
        String[] stackIn_42_2 = null;
        String[] stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        String stackIn_42_5 = null;
        int stackIn_44_4;
        int stackIn_45_4;
        String stackIn_45_5;
        String stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        jd var7 = null;
        jd var8 = null;
        try {
          L0: {
            L1: {
              if (param1 == 7) {
                break L1;
              } else {
                field_N = (je) null;
                break L1;
              }
            }
            if (-1 == (uc.field_d[param2][3] ^ -1)) {
              var7 = param3.c(param0, true, param4);
              var8 = var7;
              if (var8 != null) {
                L2: {
                  if (uc.field_d[param2][4] == 1) {
                    if (-1 <= (var8.c((byte) 81) ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        var6 = dl.field_e[var7.c((byte) 81)][var7.j(20640)];
                        array$0 = new String[3];
                        stackIn_13_0 = 4800;

                        stackIn_13_1 = rb.field_c;

                        stackIn_13_2 = (String[]) (array$0);

                        stackIn_13_3 = (String[]) (array$0);

                        stackIn_13_4 = 1;

                        if ((og.field_m ^ -1) != -2) {
                          stackIn_14_0 = stackIn_13_0;
                          stackIn_14_1 = (String) ((Object) stackIn_13_1);
                          stackIn_14_2 = (String[]) ((Object) stackIn_13_2);
                          stackIn_14_3 = (String[]) ((Object) stackIn_13_3);
                          stackIn_14_4 = stackIn_13_4;
                          stackIn_14_5 = fq.field_f[param2].toLowerCase();
                          break L3;
                        } else {
                          stackIn_14_0 = stackIn_13_0;
                          stackIn_14_1 = (String) ((Object) stackIn_13_1);
                          stackIn_14_2 = (String[]) ((Object) stackIn_13_2);
                          stackIn_14_3 = (String[]) ((Object) stackIn_13_3);
                          stackIn_14_4 = stackIn_13_4;
                          stackIn_14_5 = fq.field_f[param2];
                          break L3;
                        }
                      }
                      L4: {
                        stackIn_14_3[stackIn_14_4] = stackIn_14_5;








                        stackIn_16_4 = 2;

                        if (-2 != (og.field_m ^ -1)) {

                          stackIn_14_1 = (String) ((Object) stackIn_14_1);
                          stackIn_14_2 = (String[]) ((Object) stackIn_14_2);
                          stackIn_14_2 = (String[]) ((Object) stackIn_14_2);
                          stackIn_17_4 = stackIn_16_4;
                          stackIn_17_5 = fq.field_f[var6].toLowerCase();
                          break L4;
                        } else {

                          stackIn_14_1 = (String) ((Object) stackIn_14_1);
                          stackIn_14_2 = (String[]) ((Object) stackIn_14_2);
                          stackIn_14_2 = (String[]) ((Object) stackIn_14_2);
                          stackIn_17_4 = stackIn_16_4;
                          stackIn_17_5 = fq.field_f[var6];
                          break L4;
                        }
                      }
                      stackIn_14_2[stackIn_17_4] = stackIn_17_5;
                      stackIn_18_0 = fo.a(stackIn_14_0, stackIn_14_1, stackIn_14_2);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (uc.field_d[param2][4] == 0) {
                    if (0 != var8.field_P) {
                      L6: {
                        var6 = pr.field_f[var7.field_P];
                        if (7 == var8.field_P) {
                          break L6;
                        } else {
                          if (var8.field_P != 8) {
                            var6 = var6 + (-1 + var8.field_o);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        array$1 = new String[3];
                        stackIn_29_0 = 4800;

                        stackIn_29_1 = oo.field_o;

                        stackIn_29_2 = (String[]) (array$1);

                        stackIn_29_3 = (String[]) (array$1);

                        stackIn_29_4 = 1;

                        if (og.field_m == 1) {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = (String) ((Object) stackIn_29_1);
                          stackIn_30_2 = (String[]) ((Object) stackIn_29_2);
                          stackIn_30_3 = (String[]) ((Object) stackIn_29_3);
                          stackIn_30_4 = stackIn_29_4;
                          stackIn_30_5 = fq.field_f[param2];
                          break L7;
                        } else {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = (String) ((Object) stackIn_29_1);
                          stackIn_30_2 = (String[]) ((Object) stackIn_29_2);
                          stackIn_30_3 = (String[]) ((Object) stackIn_29_3);
                          stackIn_30_4 = stackIn_29_4;
                          stackIn_30_5 = fq.field_f[param2].toLowerCase();
                          break L7;
                        }
                      }
                      L8: {
                        stackIn_30_3[stackIn_30_4] = stackIn_30_5;








                        stackIn_32_4 = 2;

                        if ((og.field_m ^ -1) == -2) {

                          stackIn_30_1 = (String) ((Object) stackIn_30_1);
                          stackIn_30_2 = (String[]) ((Object) stackIn_30_2);
                          stackIn_30_2 = (String[]) ((Object) stackIn_30_2);
                          stackIn_33_4 = stackIn_32_4;
                          stackIn_33_5 = fq.field_f[var6];
                          break L8;
                        } else {

                          stackIn_30_1 = (String) ((Object) stackIn_30_1);
                          stackIn_30_2 = (String[]) ((Object) stackIn_30_2);
                          stackIn_30_2 = (String[]) ((Object) stackIn_30_2);
                          stackIn_33_4 = stackIn_32_4;
                          stackIn_33_5 = fq.field_f[var6].toLowerCase();
                          break L8;
                        }
                      }
                      stackIn_30_2[stackIn_33_4] = stackIn_33_5;
                      stackIn_34_0 = fo.a(stackIn_30_0, stackIn_30_1, stackIn_30_2);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if ((uc.field_d[param2][4] ^ -1) == -4) {
                  if (var8.field_ab != 0) {
                    L9: {
                      var6 = bw.field_f[var7.field_ab];
                      array$2 = new String[3];
                      stackIn_41_0 = 4800;

                      stackIn_41_1 = io.field_u;

                      stackIn_41_2 = (String[]) (array$2);

                      stackIn_41_3 = (String[]) (array$2);

                      stackIn_41_4 = 1;

                      if (og.field_m == 1) {
                        stackIn_42_0 = stackIn_41_0;
                        stackIn_42_1 = (String) ((Object) stackIn_41_1);
                        stackIn_42_2 = (String[]) ((Object) stackIn_41_2);
                        stackIn_42_3 = (String[]) ((Object) stackIn_41_3);
                        stackIn_42_4 = stackIn_41_4;
                        stackIn_42_5 = fq.field_f[param2];
                        break L9;
                      } else {
                        stackIn_42_0 = stackIn_41_0;
                        stackIn_42_1 = (String) ((Object) stackIn_41_1);
                        stackIn_42_2 = (String[]) ((Object) stackIn_41_2);
                        stackIn_42_3 = (String[]) ((Object) stackIn_41_3);
                        stackIn_42_4 = stackIn_41_4;
                        stackIn_42_5 = fq.field_f[param2].toLowerCase();
                        break L9;
                      }
                    }
                    L10: {
                      stackIn_42_3[stackIn_42_4] = stackIn_42_5;








                      stackIn_44_4 = 2;

                      if ((og.field_m ^ -1) == -2) {

                        stackIn_42_1 = (String) ((Object) stackIn_42_1);
                        stackIn_42_2 = (String[]) ((Object) stackIn_42_2);
                        stackIn_42_2 = (String[]) ((Object) stackIn_42_2);
                        stackIn_45_4 = stackIn_44_4;
                        stackIn_45_5 = fq.field_f[var6];
                        break L10;
                      } else {

                        stackIn_42_1 = (String) ((Object) stackIn_42_1);
                        stackIn_42_2 = (String[]) ((Object) stackIn_42_2);
                        stackIn_42_2 = (String[]) ((Object) stackIn_42_2);
                        stackIn_45_4 = stackIn_44_4;
                        stackIn_45_5 = fq.field_f[var6].toLowerCase();
                        break L10;
                      }
                    }
                    stackIn_42_2[stackIn_45_4] = stackIn_45_5;
                    stackIn_46_0 = fo.a(stackIn_42_0, stackIn_42_1, stackIn_42_2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  stackIn_48_0 = null;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var5);

            stackIn_51_1 = new StringBuilder().append("kq.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L11;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_46_0;
              } else {
                return (String) ((Object) stackIn_48_0);
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        lw.field_mb = param4;
        jg.field_k = param0;
        cn.field_o = param1;
        ia.field_g = param3;
        if (param2 != 87) {
            ha var6 = (ha) null;
            kq.a(-11, 19, 8, (ha) null, -83);
        }
    }

    kq(kb param0) {
        try {
            this.field_Q = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_P = null;
        field_N = null;
        int var1 = 126 % ((param0 - -59) / 34);
        field_M = null;
    }

    final static void a(int param0, int param1, int param2, int param3, bv param4) {
        int var5_int = 0;
        if (param3 <= param2) {
            param4.d((byte) -88, param0 - -param2);
            return;
        }
        param4.d((byte) -40, param3 + param0);
        if (param1 != -24232) {
            return;
        }
        try {
            var5_int = param4.g(-99, param2);
            param4.c(param0, (byte) 0);
            param4.a(-16807, param2, var5_int);
            param4.d((byte) -73, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kq.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                field_L = 76;
                break L1;
              }
            }
            stackIn_3_0 = this.field_Q.a(param0 + 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kq.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 == param0.length()) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  var3 = (String) null;
                  kq.a((String) null, true);
                  break L1;
                }
              }
              var2 = db.a(true, ' ');
              if (!param0.equals(var2)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("kq.H(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    static {
        field_L = 0;
        field_M = new me(15, 0, 1, 0);
        field_P = new wk(270, 70);
    }
}
