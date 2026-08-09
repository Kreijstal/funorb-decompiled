/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static boolean field_e;
    private String field_b;
    private boolean field_c;
    static tf field_f;
    static String field_d;
    static String field_a;
    static String field_g;

    final boolean c(int param0) {
        int var2 = -5 / ((-31 - param0) / 58);
        return this.field_c;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        String var8;
        int stackIn_8_0 = 0;
        L0: {
          if (param3 == -124) {
            break L0;
          } else {
            var8 = (String) null;
            ec.a(true, (String) null, -17);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 < param0) {
              break L2;
            } else {
              if (param0 - -param5 <= param2) {
                break L2;
              } else {
                if (param1 < param4) {
                  break L2;
                } else {
                  if (param6 + param4 <= param1) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(boolean param0, tv param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (vb.field_j <= var2_int) {
                    dupTemp$0 = param1.b(80);
                    pj.field_C[dupTemp$0] = pj.field_C[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (vb.field_j <= var3) {
                        if (param0) {
                          vb.field_j = var2_int;
                          fieldTemp$1 = vb.field_j;
                          vb.field_j = vb.field_j + 1;
                          fu.field_b[fieldTemp$1] = param1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        L4: {
                          L5: {
                            if ((param1.field_c ^ -1) == (fu.field_b[var3].field_c ^ -1)) {
                              var4 = fu.field_b[var3].b(80);
                              if (at.field_Hb < pj.field_C[var4]) {
                                pj.field_C[var4] = pj.field_C[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          fu.field_b[incrementValue$2] = fu.field_b[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (fu.field_b[var2_int].field_c != param1.field_c) {
                        break L6;
                      } else {
                        dupTemp$3 = fu.field_b[var2_int].b(80);
                        pj.field_C[dupTemp$3] = pj.field_C[dupTemp$3] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                pj.field_C[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ec.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -23044) {
              if (!param0) {
                stackIn_7_0 = sn.field_i.a(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = sn.field_a.a(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -20;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ec.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    ec(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              stackIn_3_0 = this;

              if (!param1) {
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
              ((ec) (this)).field_c = stackIn_4_1 != 0;
              if (null != this.field_b) {
                break L2;
              } else {
                this.field_b = "";
                break L2;
              }
            }
            L3: {
              if (0 != this.field_b.length()) {
                break L3;
              } else {
                this.field_c = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("ec.<init>(");

            if (param0 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_g = null;
    }

    ec(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != 27939) {
            String var3 = (String) null;
            ec.a(true, (String) null, 58);
        }
        return this.field_b;
    }

    static {
        field_d = "Day";
        field_a = "Click";
        field_f = new tf();
        field_g = "You cannot add yourself!";
    }
}
