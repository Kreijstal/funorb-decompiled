/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static rk field_g;
    static ci field_f;
    static long field_d;
    private int[] field_c;
    private int field_e;
    private boolean field_b;
    static String field_h;
    private int field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
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
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (0L != jl.a(var3, false)) {
                  L2: {
                    if (param1 == -43) {
                      break L2;
                    } else {
                      field_h = (String) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("ml.P(");

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
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static short[] a(short[] param0, int param1, nk param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.applet.Applet var9 = null;
        Object stackIn_5_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              var4_int = param2.e(20, param1);
              if (param3 > 40) {
                break L1;
              } else {
                var9 = (java.applet.Applet) null;
                ml.a((java.applet.Applet) null, (byte) 24);
                break L1;
              }
            }
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param0 == null) {
                    break L3;
                  } else {
                    if (param0.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.e(127, 4);
                var6 = (short)param2.e(22, 16);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (short)(param2.e(29, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ml.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Chess.field_G;
        var3 = this.field_c.length;
        if (param1 == -1) {
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!this.field_b) {
                var3 = var3 + this.field_a;
                continue L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * this.field_a;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 7;
        }
    }

    final static void a(byte param0, ld param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (qf.field_c <= var2_int) {
                    L3: {
                      dupTemp$0 = param1.b(2);
                      pj.field_f[dupTemp$0] = pj.field_f[dupTemp$0] + 1;
                      var2_int = 0;
                      if (param0 > 3) {
                        break L3;
                      } else {
                        field_f = (ci) null;
                        break L3;
                      }
                    }
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= qf.field_c) {
                        qf.field_c = var2_int;
                        fieldTemp$1 = qf.field_c;
                        qf.field_c = qf.field_c + 1;
                        ik.field_i[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param1.field_k != ik.field_i[var3].field_k) {
                              break L6;
                            } else {
                              var4 = ik.field_i[var3].b(2);
                              if (pj.field_f[var4] <= fh.field_b) {
                                break L6;
                              } else {
                                pj.field_f[var4] = pj.field_f[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          ik.field_i[incrementValue$2] = ik.field_i[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_k != ik.field_i[var2_int].field_k) {
                        break L7;
                      } else {
                        dupTemp$3 = ik.field_i[var2_int].b(2);
                        pj.field_f[dupTemp$3] = pj.field_f[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                pj.field_f[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ml.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final static void a(int param0, km[] param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = Chess.field_G;
        if (param1 == null || 0 >= param4) {
            return;
        }
        int var5_int = param1[0].field_v;
        int var6 = param1[2].field_v;
        int var7 = param1[1].field_v;
        param1[0].b(param2, param0);
        param1[2].b(param2 + (param4 - var6), param0);
        wb.b(o.field_d);
        wb.e(var5_int + param2, param0, param4 + (param2 - var6), param1[1].field_u + param0);
        if (param3 > -125) {
            return;
        }
        try {
            var8 = var5_int + param2;
            var9 = -var6 + param2 + param4;
            for (param2 = var8; param2 < var9; param2 = param2 + var7) {
                param1[1].b(param2, param0);
            }
            wb.a(o.field_d);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ml.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int c(int param0, int param1) {
        if (param1 != 1) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            ml.a((java.applet.Applet) null, (byte) 91);
        }
        if (this.field_e < param0) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_c[param0];
    }

    private final void d(int param0, int param1) {
        int[] var4 = new int[this.b(param1, -1)];
        int[] var3 = var4;
        ne.a(this.field_c, 0, var4, 0, this.field_c.length);
        if (param0 != 19840) {
            field_f = (ci) null;
        }
        this.field_c = var4;
    }

    final static void a(String param0, ln param1, byte param2, boolean param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dh var9 = null;
        String var10 = null;
        dh var11 = null;
        String var12 = null;
        dh var13 = null;
        String var14 = null;
        dh var15 = null;
        try {
          L0: {
            L1: {
              ja.a(0L, (String) null, (byte) -103, ci.field_zb, -1, param1, (int[]) null, param1.g((byte) -82), (String) null);
              if (!param1.field_Vb) {
                break L1;
              } else {
                L2: {
                  if ((param1.field_Mb ^ -1) == -3) {
                    break L2;
                  } else {
                    if (2 <= sk.field_t) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var9 = pi.field_d;
                var10 = oc.a(sl.field_h, new String[]{param0}, (byte) -43);
                var9.field_b.a((byte) -12, var10, 10);
                break L1;
              }
            }
            L3: {
              pi.field_d.b((byte) -97);
              if (param3) {
                if (cn.field_g == pi.field_d.field_d) {
                  var13 = pi.field_d;
                  var14 = oc.a(qc.field_c, new String[]{param0}, (byte) -54);
                  var13.field_b.a((byte) -12, var14, 16);
                  break L3;
                } else {
                  var11 = pi.field_d;
                  var12 = oc.a(tm.field_b, new String[]{param0}, (byte) -71);
                  var11.field_b.a((byte) -12, var12, 15);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var5 = -10 / ((34 - param2) / 47);
            var15 = pi.field_d;
            var6 = re.field_m;
            var7 = ag.field_f;
            var15.field_b.a(true, var6, 0, var7, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ml.F(");

            if (param0 == null) {
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


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        if (this.field_e < param1) {
            this.field_e = param1;
        }
        if (this.field_c.length <= param1) {
            this.d(19840, param1);
        }
        this.field_c[param1] = param2;
        if (!param0) {
            this.field_c = (int[]) null;
        }
    }

    final static void a(int param0) {
        sg.field_c.setLength(param0);
        vk.field_g = 0;
    }

    final void a(int param0, byte param1) {
        this.a(true, this.field_e - -1, param0);
        int var3 = 77 / ((param1 - 0) / 42);
    }

    final void a(int param0, int param1) {
        if (param0 < (param1 ^ -1) || this.field_e < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_e != param1) {
            ne.a(this.field_c, param1 + 1, this.field_c, param1, this.field_e + -param1);
        }
        this.field_e = this.field_e - 1;
    }

    final int a(boolean param0) {
        if (!param0) {
            return 127;
        }
        return 1 + this.field_e;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -122) {
            field_f = (ci) null;
        }
        field_h = null;
        field_f = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = i.a(param2, param0);
            if (param1.indexOf(param0) != -1) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.indexOf(var3) == -1) {
                L1: {
                  L2: {
                    if (param1.startsWith(param0)) {
                      break L2;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param1.endsWith(param0)) {
                          break L2;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackIn_12_0 = 0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ml.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static boolean a(int param0, um param1) {
        RuntimeException var2 = null;
        nk var3 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (nk) null;
                ml.a((short[]) null, 52, (nk) null, 27);
                break L1;
              }
            }
            stackIn_3_0 = param1.b((byte) -40);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ml.O(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}
