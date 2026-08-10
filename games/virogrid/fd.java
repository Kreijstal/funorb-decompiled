/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fd extends fi implements ja {
    static String field_x;
    static km field_y;
    static String[] field_A;
    static int[] field_B;
    p field_z;
    static int field_C;

    fd(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
        this.field_z = new p();
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        ma var3 = new ma(this.field_z);
        if (param0 != -39) {
            field_x = (String) null;
        }
        fi var4 = (fi) ((Object) var3.c(12677));
        while (var4 != null) {
            var5 = var4.b((byte) -39);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (fi) ((Object) var3.b(41));
        }
        return var2;
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 48) {
                break L1;
              } else {
                field_C = 97;
                break L1;
              }
            }
            var5 = new ma(this.field_z);
            var6 = (fi) ((Object) var5.c(12677));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param1.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param2) {
                    var6.a(param0, (byte) 121, 1 + param2, param1);
                    var6 = (fi) ((Object) var5.b(41));
                    continue L2;
                  } else {
                    discarded$4 = param1.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("fd.BB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 118) {
                break L1;
              } else {
                field_B = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param2, 34, param3)) {
                this.a(param2, param0, (byte) 127, param3);
                this.a(param0, param3, param2, 54);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fd.MA(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void e(int param0) {
        if (param0 != 1) {
            field_B = (int[]) null;
        }
        field_x = null;
        field_B = null;
        field_y = null;
        field_A = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param1 != 6752) {
            return;
        }
        int var7 = 3;
        df.c(param3, param5, param2, param6, (param6 >> -1770988735) - 2, !param4 ? 1063506 : 1264494);
        int var8 = 2 * var7;
        df.c(param3 - -var7, var7 + param5, -var8 + param2, param6 + -var8, -var7 + ((param6 >> -2000939999) - 2), 2);
    }

    final void a(fi param0, byte param1) {
        try {
            this.field_z.a(param0, (byte) -58);
            if (param1 != -78) {
                this.d(-16);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "fd.QB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        ma var8 = null;
        RuntimeException var8_ref = null;
        fi var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ma(this.field_z);
              if (param5 == 0) {
                break L1;
              } else {
                this.f(false);
                break L1;
              }
            }
            var9 = (fi) ((Object) var8.c(param5 ^ 12677));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(false)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.f(true)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, 0, param6)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (fi) ((Object) var8.b(41));
                    continue L2;
                  }
                }
              }
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("fd.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ke.field_r[ka.field_m] = param4;
        lk.field_Tb[ka.field_m] = ka.field_m;
        wh.field_c[ka.field_m] = param1;
        if (rk.field_e > param1) {
            ka.field_k = param1;
        }
        if (!(param1 <= bl.field_F)) {
            dj.field_c = param1;
        }
        vc.field_jb[ka.field_m] = param3;
        tg.field_A[ka.field_m] = param0;
        kf.field_j[ka.field_m] = param5;
        int var6 = param5 + (param0 + param3);
        int var7 = param2 == var6 ? 0 : 1000 * param3 / var6;
        vl.field_i[ka.field_m] = var7;
        if (!(dj.field_c >= var7)) {
            dj.field_c = var7;
        }
        ka.field_m = ka.field_m + 1;
        if (!(ka.field_k <= var7)) {
            ka.field_k = var7;
        }
    }

    final boolean b(int param0, fi param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        ma var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 2) {
              if (this.field_z.b((byte) 32)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = new ma(this.field_z);
                var4 = (fi) ((Object) var8.a((byte) 48));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (var4.f(true)) {
                        var5 = new ma(this.field_z);
                        var5.b(1, var4);
                        var6 = (fi) ((Object) var5.a(-1));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param1, param0 + -8517)) {
                              var6 = (fi) ((Object) var5.a(param0 + -3));
                              continue L3;
                            } else {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (fi) ((Object) var8.a(param0 ^ -3));
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("fd.MB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    private final void d(byte param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        fi var3 = (fi) ((Object) var2.c(12677));
        if (param0 >= -17) {
            field_A = (String[]) null;
        }
        while (var3 != null) {
            var3.d(false);
            var3 = (fi) ((Object) var2.b(41));
        }
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fi var9 = null;
        ma var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var10 = new ma(this.field_z);
            var9 = (fi) ((Object) var10.c(12677));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(false)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.f(true)) {
                        break L3;
                      } else {
                        if (var9.a(param0, param1, param2, -122)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (fi) ((Object) var10.b(41));
                    continue L1;
                  }
                }
              }
              var6 = 48 % ((-75 - param3) / 36);
              var7 = param2;
              if ((var7 ^ -1) != -81) {
                stackIn_16_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L4: {
                  if (dc.field_Y[81]) {
                    stackIn_14_0 = this.b(2, param0);
                    break L4;
                  } else {
                    stackIn_14_0 = this.a(-16234, param0);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("fd.AA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final boolean a(fi param0, int param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new ma(this.field_z);
              var4 = (fi) ((Object) var3.c(12677));
              if (param1 == -8515) {
                break L1;
              } else {
                this.f(false);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param0, -8515)) {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (fi) ((Object) var3.b(41));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("fd.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void a(boolean param0, int param1) {
        wb.a(true, (byte) 125, param0);
        if (param1 != -20248) {
            field_C = 51;
        }
    }

    void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) -102);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param0 != 37) {
            fi var8 = (fi) null;
            this.a(-9, (fi) null);
        }
        if (param3 == 0) {
            if (!(this.field_w == null)) {
                this.field_w.a(param1, (fi) (this), true, param2, -23294);
            }
        }
        ma var5 = new ma(this.field_z);
        fi var6 = (fi) ((Object) var5.a((byte) 48));
        while (var6 != null) {
            var6.a((byte) 37, this.field_l + param1, this.field_u + param2, param3);
            var6 = (fi) ((Object) var5.a(-1));
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            this.field_z = (p) null;
        }
        return this.c((byte) -3) != null ? true : false;
    }

    final boolean a(int param0, fi param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        ma var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_z.b((byte) 95)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == -16234) {
                var8 = new ma(this.field_z);
                var4 = (fi) ((Object) var8.c(12677));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.f(true)) {
                        break L2;
                      } else {
                        var5 = new ma(this.field_z);
                        var5.a(param0 + 16150, var4);
                        var6 = (fi) ((Object) var5.b(41));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param1, param0 + 7719)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (fi) ((Object) var5.b(41));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (fi) ((Object) var8.b(41));
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("fd.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        ma var8 = null;
        RuntimeException var8_ref = null;
        fi var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ma(this.field_z);
              if (!param2) {
                break L1;
              } else {
                this.d((byte) -71);
                break L1;
              }
            }
            var9 = (fi) ((Object) var8.c(12677));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(false)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1, false, this.field_l + param3, param4, param5 - -this.field_u, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (fi) ((Object) var8.b(41));
                      continue L2;
                    }
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("fd.NA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void c(int param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        if (param0 != -1) {
            return;
        }
        fi var3 = (fi) ((Object) var2.c(12677));
        while (var3 != null) {
            var3.c(-1);
            var3 = (fi) ((Object) var2.b(41));
        }
    }

    String d(int param0) {
        String var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        fi var3 = (fi) ((Object) var2.c(12677));
        while (var3 != null) {
            var4 = var3.d(70);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (fi) ((Object) var2.b(41));
        }
        if (param0 > 35) {
            return null;
        }
        this.d((byte) -64);
        return null;
    }

    fi c(byte param0) {
        ma var2;
        fi var3;
        int var4;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          var2 = new ma(this.field_z);
          if (param0 == -3) {
            break L0;
          } else {
            field_x = (String) null;
            break L0;
          }
        }
        var3 = (fi) ((Object) var2.c(param0 + 12680));
        L1: while (true) {
          if (var3 != null) {
            if (var3.f(true)) {
              return var3;
            } else {
              var3 = (fi) ((Object) var2.b(41));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException runtimeException = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, 114, param2, param3);
              var5 = new ma(this.field_z);
              if (param1 >= 113) {
                break L1;
              } else {
                field_C = 3;
                break L1;
              }
            }
            var6 = (fi) ((Object) var5.c(12677));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.b(false)) {
                    break L3;
                  } else {
                    var6.a(param0 + this.field_l, 124, param2, this.field_u + param3);
                    var6 = (fi) ((Object) var5.b(41));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("fd.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        ma var7 = null;
        fi var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new ma(this.field_z);
            var8 = (fi) ((Object) var7.c(12677));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(false)) {
                    break L2;
                  } else {
                    var8.a(param0, param1, param2 - -this.field_l, param3, this.field_u + param4, 104);
                    var8 = (fi) ((Object) var7.b(41));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param5 >= 73) {
                  break L3;
                } else {
                  field_A = (String[]) null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("fd.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
