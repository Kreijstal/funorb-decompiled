/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    int field_j;
    int field_k;
    int field_c;
    static String field_i;
    private er field_h;
    static an field_b;
    cc field_f;
    static String field_d;
    private int[] field_a;
    int field_g;
    private boolean field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 23744) {
            return;
        }
        field_d = null;
        field_i = null;
    }

    final static dg a(Throwable param0, String param1) {
        dg var2 = null;
        if (param0 instanceof dg) {
            var2 = (dg) ((Object) param0);
            var2.field_e = var2.field_e + ' ' + param1;
        } else {
            var2 = new dg(param0, param1);
        }
        return var2;
    }

    final static void c(int param0) {
        qh.a(-32739);
        if (param0 != -2618) {
            field_i = (String) null;
        }
        ha.a((byte) 112);
    }

    final void a(int param0, byte param1, int param2, int param3, String param4, int param5) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              var10 = bi.field_l;
              var7 = var10;
              var8 = bi.field_e;
              var9 = bi.field_j;
              bi.a(this.field_a);
              this.field_h.d();
              bi.b(this.field_a);
              this.field_f.b(param4, param3, param5, param0, param2);
              bi.a(var10, var8, var9);
              bi.b(this.field_a);
              this.field_e = true;
              if (param1 > 51) {
                break L1;
              } else {
                this.field_h = (er) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7_ref);

            stackIn_5_1 = new StringBuilder().append("wn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        int[] var2_ref_int__ = null;
        int var3 = 0;
        int var4 = 0;
        if (!(!this.field_e)) {
            var2_ref_int__ = bi.field_l;
            var3 = bi.field_e;
            var4 = bi.field_j;
            bi.a(this.field_a);
            this.field_h.d();
            an.a((byte) 41, 0, 640, 480, 0);
            bi.a(var2_ref_int__, var3, var4);
            bi.b(this.field_a);
            this.field_h.e(0, 0);
            this.field_h.d();
            bi.c();
            ro.field_g.a(-39);
            this.field_e = false;
        }
        int var2 = -117 % ((30 - param0) / 60);
    }

    final static void a(String[] args, byte[] param1, int[] param2, String[][] param3, u[] param4, r param5, r param6, byte param7, er[][] param8, String[][] param9, r param10, int param11, byte[] param12, er[][] param13, int param14, int[] param15, boolean param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int[] var18 = null;
        String[] var19 = null;
        try {
          L0: {
            L1: {
              var19 = (String[]) null;
              nk.a(param14, param9, param5, (byte) 58, param11, param1, param13, param3, args, param12, (String[]) null, param8, param10, param6, param2, 1, param16, param4, param15);
              if (param7 == -42) {
                break L1;
              } else {
                var18 = (int[]) null;
                wn.a((String[]) null, (byte[]) null, (int[]) null, (String[][]) null, (u[]) null, (r) null, (r) null, (byte) -38, (er[][]) null, (String[][]) null, (r) null, 49, (byte[]) null, (er[][]) null, 77, (int[]) null, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var17);

            stackIn_5_1 = new StringBuilder().append("wn.N(");

            if (args == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_42_2 + ',' + param16 + ')');
        }
    }

    final int a(int param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              stackIn_4_0 = this.field_f.c(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -4;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        try {
            this.a(param2, (byte) 52, param4, param0 + -this.field_f.c(param5), param5, param3);
            if (param1 >= -7) {
                String var8 = (String) null;
                this.a(123, 84, -103, 23, -80, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wn.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, cr param1, cr param2) {
        try {
            if (!(param1.field_M != null)) {
                param1.field_M = new nj();
            }
            if (param2.field_M == null) {
                param2.field_M = new nj();
            }
            if (se.field_A == null) {
                se.field_A = new fi(64);
            }
            if (param0 >= -43) {
                wn.c(-19);
            }
            if (!(jn.field_g != null)) {
                jn.field_g = new fi(64);
            }
            vj.field_d = param2.field_M;
            tm.field_a = param1.field_M;
            lh.a((byte) -22);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            this.a(param1, (byte) 115, param2, param3 - this.field_f.c(param0) / param5, param0, param4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == nb.field_A) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 0) {
                L1: {
                  if (param0.toLowerCase().indexOf(nb.field_A.toLowerCase()) < 0) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("wn.L(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        param7--;
        L0: while (true) {
          if (param7 < 0) {
            return;
          } else {
            var9 = param6 - 1;
            L1: while (true) {
              if (var9 < 0) {
                param1 = param1 + param8;
                param7--;
                continue L0;
              } else {
                if (param0[param1] > 1) {
                  L2: {
                    param2 = param1 - 1;
                    param3 = param1 + 1;
                    param4 = param1 - bi.field_e;
                    param5 = param1 + bi.field_e;
                    if (param0[param4 + 1] != 0) {
                      break L2;
                    } else {
                      param0[param4 + 1] = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0[param5 + 1] != 0) {
                      break L3;
                    } else {
                      param0[param5 + 1] = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0[param4 - 1] != 0) {
                      break L4;
                    } else {
                      param0[param4 - 1] = 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0[param5 - 1] != 0) {
                      break L5;
                    } else {
                      param0[param5 - 1] = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (param0[param2] != 0) {
                      break L6;
                    } else {
                      param0[param2] = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0[param3] != 0) {
                      break L7;
                    } else {
                      param0[param3] = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0[param4] != 0) {
                      break L8;
                    } else {
                      param0[param4] = 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0[param5] != 0) {
                      break L9;
                    } else {
                      param0[param5] = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (param0[param2 - 1] != 0) {
                      break L10;
                    } else {
                      param0[param2 - 1] = 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (param0[param3 + 1] != 0) {
                      break L11;
                    } else {
                      param0[param3 + 1] = 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (param0[param4 - bi.field_e] != 0) {
                      break L12;
                    } else {
                      param0[param4 - bi.field_e] = 1;
                      break L12;
                    }
                  }
                  if (param0[param5 + bi.field_e] == 0) {
                    param0[param5 + bi.field_e] = 1;
                    param1++;
                    var9--;
                    continue L1;
                  } else {
                    param1++;
                    var9--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var9--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1, qj param2, int param3, String param4, boolean param5, qj param6) {
        int stackIn_5_0 = 0;
        ed stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ed stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_17_2 = null;
        ed stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ed stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_20_2 = null;
        int stackIn_30_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param2.a(param0);
              var8 = param6.a(param0);
              if (lo.field_k == null) {
                if (ce.a((byte) 116, false)) {
                  break L1;
                } else {
                  stackIn_5_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (nn.field_w != rg.field_d) {
                break L2;
              } else {
                L3: {
                  mr.field_a = null;
                  uh.field_Wb.field_u = 0;
                  if (param4 == null) {
                    L4: {
                      iq.field_x.field_u = 0;
                      iq.field_x.e(j.field_r.nextInt(), 0);
                      iq.field_x.e(j.field_r.nextInt(), 0);
                      stackIn_16_0 = iq.field_x;

                      stackIn_16_1 = 684868900;

                      if (!param2.a(113)) {
                        stackIn_17_0 = (ed) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = "";
                        break L4;
                      } else {
                        stackIn_17_0 = (ed) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = (String) (var14);
                        break L4;
                      }
                    }
                    L5: {
                      ((ed) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2);
                      stackIn_19_0 = iq.field_x;

                      stackIn_19_1 = 684868900;

                      if (param6.a(75)) {
                        stackIn_20_0 = (ed) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = (String) (var8);
                        break L5;
                      } else {
                        stackIn_20_0 = (ed) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = "";
                        break L5;
                      }
                    }
                    ((ed) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2);
                    uh.field_Wb.f(16, -53);
                    uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
                    var9 = uh.field_Wb.field_u;
                    mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
                    uh.field_Wb.b((byte) -97, uh.field_Wb.field_u - var9);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      if (!param5) {
                        break L6;
                      } else {
                        var9 = var9 | 1;
                        break L6;
                      }
                    }
                    L7: {
                      iq.field_x.field_u = 0;
                      iq.field_x.e(j.field_r.nextInt(), 0);
                      iq.field_x.e(j.field_r.nextInt(), 0);
                      iq.field_x.a(684868900, var14);
                      iq.field_x.a(684868900, var8);
                      var15 = (CharSequence) ((Object) param4);
                      iq.field_x.a(684868900, rr.a(-99, var15));
                      iq.field_x.d(param1, -1783);
                      iq.field_x.f(param3, 80);
                      iq.field_x.f(var9, 100);
                      uh.field_Wb.f(18, -93);
                      uh.field_Wb.field_u = uh.field_Wb.field_u + 2;
                      var10 = uh.field_Wb.field_u;
                      var11_ref_String = vq.a(ob.e((byte) 74), (byte) 114);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    uh.field_Wb.a((byte) 0, var11_ref_String);
                    mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
                    uh.field_Wb.a((byte) -120, -var10 + uh.field_Wb.field_u);
                    break L3;
                  }
                }
                lf.d(106, -1);
                rg.field_d = fi.field_b;
                break L2;
              }
            }
            L8: {
              if (fi.field_b == rg.field_d) {
                if (!c.a(1, (byte) -104)) {
                  break L8;
                } else {
                  L9: {
                    var9 = id.field_f.h(-11);
                    id.field_f.field_u = 0;
                    if ((var9 ^ -1) > -101) {
                      break L9;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        rg.field_d = bj.field_f;
                        na.field_m = new String[-100 + var9];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 != var9) {
                      lc.field_f = var9;
                      rg.field_d = ko.field_O;
                      ca.field_b = -1;
                      break L8;
                    } else {
                      c.a(tk.c(1), (byte) -104);
                      mr.field_a = new Boolean(nr.a(id.field_f, 67));
                      id.field_f.field_u = 0;
                      break L8;
                    }
                  } else {
                    fk.a(ob.e((byte) -77), 11514);
                    nk.field_Kb = ql.field_K;
                    rm.b((byte) 117);
                    gn.field_d = false;
                    stackIn_30_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (rg.field_d == bj.field_f) {
                var9 = 2;
                if (!c.a(var9, (byte) -104)) {
                  break L10;
                } else {
                  var10 = id.field_f.a((byte) -11);
                  id.field_f.field_u = 0;
                  if (c.a(var10, (byte) -104)) {
                    var11 = na.field_m.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        rm.b((byte) -106);
                        gn.field_d = false;
                        stackIn_44_0 = 100 - -var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        na.field_m[var12] = id.field_f.c(true);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (rg.field_d == ko.field_O) {
                if (dl.b((byte) -72)) {
                  L13: {
                    if (255 != lc.field_f) {
                      nk.field_Kb = id.field_f.f(128);
                      break L13;
                    } else {
                      var9_ref_String = id.field_f.k(-116);
                      if (var9_ref_String != null) {
                        be.a(var9_ref_String, -1, ob.e((byte) 106));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  rm.b((byte) 95);
                  gn.field_d = false;
                  stackIn_55_0 = lc.field_f;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L12;
                }
              } else {
                break L12;
              }
            }
            L14: {
              if (null == lo.field_k) {
                if (!gn.field_d) {
                  var9 = cl.field_d;
                  cl.field_d = ne.field_P;
                  gn.field_d = true;
                  ne.field_P = var9;
                  break L14;
                } else {
                  L15: {
                    if (qg.b(false) <= 30000L) {
                      nk.field_Kb = ba.field_c;
                      break L15;
                    } else {
                      nk.field_Kb = tf.field_m;
                      break L15;
                    }
                  }
                  gn.field_d = false;
                  stackIn_63_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L14;
              }
            }
            stackIn_66_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("wn.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L16;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L17;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L18;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L18;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_70_0), stackIn_76_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_55_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_63_0;
                } else {
                  return stackIn_66_0;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var16 = bi.field_l;
        int[] var15 = var16;
        int[] var14 = var15;
        int[] var11 = var14;
        int var12 = bi.field_e;
        int var13 = bi.field_j;
        bi.a(this.field_a);
        this.field_h.d();
        if (param6 != 1) {
            return;
        }
        try {
            bi.b(this.field_a);
            this.field_f.a(param2, param5, param4, param7, param3, param9, param1, param0, param8, this.field_f.field_D - -4);
            bi.a(var16, var12, var13);
            bi.b(this.field_a);
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wn.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    wn(cc param0) {
        try {
            this.field_f = param0;
            this.field_h = new er(640, 480);
            this.field_k = param0.field_D;
            this.field_g = param0.field_t;
            this.field_c = param0.field_M;
            this.field_a = new int[4];
            this.field_j = param0.field_z;
            this.field_e = false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Cancel";
    }
}
