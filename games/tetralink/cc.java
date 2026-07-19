/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements kg {
    static hl field_j;
    private int field_l;
    private int field_c;
    private int field_k;
    static int field_f;
    private int field_h;
    private int field_i;
    private jb field_g;
    private int field_b;
    static oh field_a;
    private int field_d;
    static String field_e;

    final static String a(CharSequence param0, byte param1) {
        int discarded$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!tk.a((byte) 81, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!tk.a((byte) 81, param0.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var6 >= var3) {
                          L6: {
                            if (param1 >= 94) {
                              break L6;
                            } else {
                              discarded$2 = cc.a(86, (byte) -28);
                              break L6;
                            }
                          }
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!sj.a(3010, (char) var7)) {
                              break L7;
                            } else {
                              var8 = kb.a((char) var7, -122);
                              if (var8 != 0) {
                                discarded$3 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("cc.A(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_3_0);
    }

    final static short[] a(short[] param0, bc param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var4_int = param1.e(param2, (byte) -112);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int == param0.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.e(4, (byte) -112);
                var6 = (short)param1.e(16, (byte) -112);
                if (param3 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (short)(var6 + param1.e(var5, (byte) -112));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) (param0);
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("cc.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    final static void c(int param0) {
        dd.b(param0 + -17958);
        if (param0 != 17896) {
            return;
        }
        qa.field_v = true;
        jd.field_a = true;
        mf.field_s.i(0);
        uf.a(id.field_n, false, false);
    }

    final static int a(byte param0, int param1) {
        param1 = (param1 & 1431655765) - -((param1 & -1431655765) >>> -1454048415);
        param1 = (param1 >>> 680778306 & -1288490189) + (858993459 & param1);
        param1 = (param1 >>> -665210812) + param1 & 252645135;
        param1 = param1 + (param1 >>> -2024446008);
        param1 = param1 + (param1 >>> 1484886160);
        if (param0 != 71) {
            return -19;
        }
        return 255 & param1;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qd var14 = null;
        na stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof qd) {
                stackOut_2_0 = (na) (param0);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (na) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (qd) ((Object) stackIn_3_0);
              ra.c(param0.field_t + param1, param2 + param0.field_w, param0.field_F, param0.field_u, this.field_b);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param1 + (param0.field_t - -var14.field_V);
              var8 = param2 - (-param0.field_w - var14.field_Z);
              ra.f(var7, var8, var14.field_bb, this.field_h);
              if (param3) {
                break L3;
              } else {
                this.field_b = 42;
                break L3;
              }
            }
            L4: {
              if (-1 == var14.field_U) {
                break L4;
              } else {
                var9 = (double)var14.field_U * 3.141592653589793 * 2.0 / (double)var14.field_R;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
                var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
                ra.f(var7 - -var11, var12 + var8, 1, this.field_l);
                break L4;
              }
            }
            L5: {
              ra.f(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_R;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
              var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
              ra.d(var7, var8, var11 + var7, var8 - -var12, 1);
              if (this.field_g == null) {
                break L5;
              } else {
                var13 = var14.field_V - -var14.field_bb - -this.field_k;
                discarded$1 = this.field_g.a(param0.field_A, param0.field_t + (param1 - -var13), this.field_d + (param2 + param0.field_w), -var13 + (-this.field_k + param0.field_F), param0.field_u - (this.field_k << 1417374529), this.field_i, this.field_c, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("cc.L(");
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
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static db[] b(int param0) {
        if (param0 <= 36) {
            return (db[]) null;
        }
        return new db[]{rj.field_f, qj.field_c, ej.field_r, ni.field_h, e.field_e, mk.field_c, ji.field_Qb, la.field_i, dj.field_g, io.field_d, hh.field_b, uk.field_t, je.field_d, wd.field_e};
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -80) {
                break L1;
              } else {
                field_j = (hl) null;
                break L1;
              }
            }
            if (!cl.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (-3 != (sf.field_d ^ -1)) {
                  break L2;
                } else {
                  if (null == qj.field_a) {
                    break L2;
                  } else {
                    var3 = (CharSequence) ((Object) param0);
                    if (!qj.field_a.equals(cc.a(var3, (byte) 95))) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("cc.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        int var1 = 57 / ((param0 - -40) / 56);
    }

    cc(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_i = param3;
            this.field_d = param2;
            this.field_c = param4;
            this.field_l = param6;
            this.field_b = param7;
            this.field_h = param5;
            this.field_k = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void b(boolean param0, boolean param1) {
        if (ak.a(3058)) {
            param1 = false;
        }
        on.a(param0, param1);
        kk.g(-1);
    }

    final static int a(int param0, byte param1) {
        param0--;
        if (param1 > -47) {
            field_e = (String) null;
        }
        param0 = param0 | param0 >>> -1459686527;
        param0 = param0 | param0 >>> 168924194;
        param0 = param0 | param0 >>> 1598413220;
        param0 = param0 | param0 >>> -90960056;
        param0 = param0 | param0 >>> -1084891856;
        return param0 - -1;
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        int var7_int = 0;
        int var8 = 0;
        hl var8_ref_hl = null;
        int var9_int = 0;
        nh var9 = null;
        int var10_int = 0;
        nh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_4_0 = 0;
        hl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        hl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        hl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        hl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        hl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        hl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              cf.field_n = ra.field_f;
              bk.field_c = ra.field_e;
              if (!param0) {
                stackOut_3_0 = am.field_f;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ng.field_t;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              nb.a(stackIn_4_0, (byte) 1);
              we.field_e.a(0, 0, -40 + tl.field_P.field_R + -2, 66, tl.field_P.field_Hb);
              e.field_d.a((byte) -92, qd.field_Q.field_Hb, 0, qe.field_d, 0);
              stackOut_4_0 = ae.field_J;
              stackOut_4_1 = -92;
              stackOut_4_2 = qd.field_Q.field_Hb;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (!kj.field_b) {
                stackOut_6_0 = (hl) ((Object) stackIn_6_0);
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L2;
              } else {
                stackOut_5_0 = (hl) ((Object) stackIn_5_0);
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 2 + ha.field_e - -42;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            L3: {
              ((hl) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2 + -stackIn_7_3, qe.field_d + 2, 18, 0);
              lh.field_q.a((byte) -97, ha.field_e + 42, qe.field_d - -2, 18, qd.field_Q.field_Hb - ha.field_e - 42);
              v.field_x.a(qd.field_Q.field_Hb, ha.field_e, -qe.field_d + (qd.field_Q.field_R - 22), param1, 20 + (qe.field_d - -2), 0, 2);
              qi.field_n.a((byte) -100, tl.field_P.field_Hb, -40 + tl.field_P.field_R, 40, 0);
              ua.field_d.a((byte) -95, fk.field_V.field_Hb, 0, 30, 0);
              bl.field_Qb.a((byte) -94, fk.field_V.field_Hb, 30, -30 + fk.field_V.field_R + -40 - 2, 0);
              var2_int = 3 + hg.field_k;
              if ((cl.field_f.length ^ -1) <= -3) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (param0) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + (-10 + (-5 + bl.field_Qb.field_R - 5 - -2 - -((var2_int - -1) / 2))) / (1 + var2_int);
              if (30 >= var3) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -5 + bl.field_Qb.field_R - (5 + (2 + var3) * var2_int);
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            f.field_x.a((byte) -93, -5 + bl.field_Qb.field_Hb - 5, 5, var4, 5);
            var5 = var4 + 5 + 2;
            var6 = 0;
            L7: while (true) {
              if (hg.field_k + 4 <= var6) {
                fj.field_b.a((byte) -127, 360, 10, -130 + ra.field_e + -4 + -10, -360 + ra.field_f >> -177236031);
                dc.field_l.a((byte) -102, fj.field_b.field_Hb, 0, 24, 0);
                wb.field_e.a((byte) -79, fj.field_b.field_Hb, 24, fj.field_b.field_R + -24, 0);
                wb.field_e.field_Eb = ah.a(1, 3, 8421504, 16, 11579568, wb.field_e.field_R);
                hh.field_c.a((byte) -105, wb.field_e.field_Hb + -10, 5, -12 + (wb.field_e.field_R + -24), 5);
                c.field_b.a((byte) -118, 80, -29 + wb.field_e.field_R, 24, (wb.field_e.field_Hb - 80) / 2);
                g.c(1753);
                break L0;
              } else {
                L8: {
                  L9: {
                    if ((var6 ^ -1) != -2) {
                      break L9;
                    } else {
                      if (-3 >= (cl.field_f.length ^ -1)) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (3 != var6) {
                      break L10;
                    } else {
                      if (mk.field_e <= 1) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (param0) {
                      break L11;
                    } else {
                      if (3 == var6) {
                        var7 = em.field_m[var6];
                        em.field_m[var6].field_R = 0;
                        var7.field_Hb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (var8 >= cn.field_e[var6].length) {
                            break L8;
                          } else {
                            if (null != cn.field_e[var6][var8]) {
                              var9 = cn.field_e[var6][var8];
                              cn.field_e[var6][var8].field_R = 0;
                              var9.field_Hb = 0;
                              var8++;
                              continue L12;
                            } else {
                              var8++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      if (var6 != 0) {
                        break L13;
                      } else {
                        var7 = em.field_m[var6];
                        em.field_m[var6].field_R = 0;
                        var7.field_Hb = 0;
                        var8 = 0;
                        L14: while (true) {
                          if (var8 >= cn.field_e[var6].length) {
                            break L8;
                          } else {
                            if (null != cn.field_e[var6][var8]) {
                              var9 = cn.field_e[var6][var8];
                              cn.field_e[var6][var8].field_R = 0;
                              var9.field_Hb = 0;
                              var8++;
                              continue L14;
                            } else {
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    if (param0) {
                      if (-5 >= (var6 ^ -1)) {
                        if (ve.field_d != null) {
                          if (ve.field_d[var6 + -4]) {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            break L15;
                          } else {
                            stackOut_41_0 = 0;
                            stackIn_44_0 = stackOut_41_0;
                            break L15;
                          }
                        } else {
                          stackOut_39_0 = 0;
                          stackIn_44_0 = stackOut_39_0;
                          break L15;
                        }
                      } else {
                        stackOut_37_0 = 0;
                        stackIn_44_0 = stackOut_37_0;
                        break L15;
                      }
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      break L15;
                    }
                  }
                  var7_int = stackIn_44_0;
                  if (var7_int != 0) {
                    var8_ref_hl = em.field_m[var6];
                    em.field_m[var6].field_R = 0;
                    var8_ref_hl.field_Hb = 0;
                    var14 = 0;
                    var9_int = var14;
                    L16: while (true) {
                      if (var14 >= cn.field_e[var6].length) {
                        break L8;
                      } else {
                        L17: {
                          if (null != cn.field_e[var6][var14]) {
                            var10 = cn.field_e[var6][var14];
                            cn.field_e[var6][var14].field_R = 0;
                            var10.field_Hb = 0;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var14++;
                        continue L16;
                      }
                    }
                  } else {
                    L18: {
                      em.field_m[var6].a((byte) -101, 103, var5, var3, 5);
                      var8 = 110;
                      if (param0) {
                        cn.field_e[var6][0].b(0, 38, var5, eh.field_w, var8, 2, var3);
                        var8 += 40;
                        break L18;
                      } else {
                        if (null != cn.field_e[var6][0]) {
                          var9 = cn.field_e[var6][0];
                          cn.field_e[var6][0].field_R = 0;
                          var9.field_Hb = 0;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var9_int = -var8 + -5 + fk.field_V.field_Hb - -2;
                    var10_int = -1 + cn.field_e[var6].length;
                    var11 = 0;
                    L19: while (true) {
                      if (var11 >= var10_int) {
                        var5 = var5 + (2 + var3);
                        break L8;
                      } else {
                        var12 = var11 * var9_int / var10_int;
                        cn.field_e[var6][var11 - -1].b(0, (var11 + 1) * var9_int / var10_int - (2 + var12), var5, eh.field_w, var12 + var8, 2, var3);
                        var11++;
                        continue L19;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "cc.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new oh(128, 128);
        field_e = "Players: ";
    }
}
