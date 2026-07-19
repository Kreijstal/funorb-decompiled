/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_b;
    private int[] field_c;
    static tf field_e;
    static tf field_f;
    static int field_a;
    static ch field_d;

    final static String a(qc param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
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
            try {
              L1: {
                L2: {
                  var3_int = param0.c(param1 + 1);
                  if (var3_int > param2) {
                    var3_int = param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_f = param0.field_f + vj.field_b.a(var4, param0.field_f, param0.field_j, param1, -127, var3_int);
                var5 = bc.a(param1 ^ -103, var4, 0, var3_int);
                stackOut_3_0 = (String) (var5);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackOut_5_0 = "Cabbage";
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("qa.A(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static qd a(byte[] param0, boolean param1) {
        qd discarded$2 = null;
        qd var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        qd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd stackOut_5_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                var3 = (byte[]) null;
                discarded$2 = qa.a((byte[]) null, false);
                break L1;
              }
            }
            if (param0 != null) {
              var2 = new qd(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
              kj.c(true);
              stackOut_5_0 = (qd) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("qa.D(");
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var12 = Geoblox.field_C;
        try {
          L0: {
            if (0 == param5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = 121 / ((-63 - param4) / 59);
              var7_int = 0;
              param5 = param5 + param3;
              var9 = param1;
              L1: while (true) {
                L2: {
                  var10 = param2[var9];
                  if (-1 < (var10 ^ -1)) {
                    var7_int = this.field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L4;
                    } else {
                      incrementValue$8 = param3;
                      param3++;
                      param0[incrementValue$8] = (byte)(var11 ^ -1);
                      if (param3 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 == (64 & var10)) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$9 = param3;
                      param3++;
                      param0[incrementValue$9] = (byte)(var11 ^ -1);
                      if (param3 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var10 & 32) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var11 = this.field_c[var7_int];
                    if (-1 >= (this.field_c[var7_int] ^ -1)) {
                      break L8;
                    } else {
                      incrementValue$10 = param3;
                      param3++;
                      param0[incrementValue$10] = (byte)(var11 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L9: {
                    if ((var10 & 16) == 0) {
                      var7_int++;
                      break L9;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    var11 = this.field_c[var7_int];
                    if (-1 >= (this.field_c[var7_int] ^ -1)) {
                      break L10;
                    } else {
                      incrementValue$11 = param3;
                      param3++;
                      param0[incrementValue$11] = (byte)(var11 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L10;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L11: {
                    if ((8 & var10) == 0) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$12 = param3;
                      param3++;
                      param0[incrementValue$12] = (byte)(var11 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-1 != (var10 & 4 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var11 = this.field_c[var7_int];
                    if (-1 < (this.field_c[var7_int] ^ -1)) {
                      incrementValue$13 = param3;
                      param3++;
                      param0[incrementValue$13] = (byte)(var11 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L14;
                      } else {
                        return var9 - -1 + -param1;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var10 & 2) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$14 = param3;
                      param3++;
                      param0[incrementValue$14] = (byte)(var11 ^ -1);
                      if (param3 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (0 == (1 & var10)) {
                      var7_int++;
                      break L17;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L17;
                    }
                  }
                  var11 = this.field_c[var7_int];
                  if (this.field_c[var7_int] < 0) {
                    incrementValue$15 = param3;
                    param3++;
                    param0[incrementValue$15] = (byte)(var11 ^ -1);
                    if (param3 < param5) {
                      var7_int = 0;
                      var9++;
                      continue L1;
                    } else {
                      break L3;
                    }
                  } else {
                    var9++;
                    continue L1;
                  }
                }
                stackOut_65_0 = var9 - -1 + -param1;
                stackIn_66_0 = stackOut_65_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var7);
            stackOut_67_1 = new StringBuilder().append("qa.E(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          L19: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_66_0;
        }
    }

    public static void a(byte param0) {
        if (param0 > -1) {
            qa.b((byte) -72);
            field_e = null;
            field_f = null;
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void b(byte param0) {
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        int fieldTemp$36 = 0;
        int fieldTemp$37 = 0;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$40 = 0;
        int fieldTemp$41 = 0;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int fieldTemp$48 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$53 = 0;
        int fieldTemp$54 = 0;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        int fieldTemp$58 = 0;
        int fieldTemp$59 = 0;
        int var1_int = 0;
        float var1 = 0.0f;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (param0 >= 72) {
          fieldTemp$30 = af.field_c;
          af.field_c = af.field_c - 1;
          if (0 > fieldTemp$30) {
            if (uf.field_b == 0 - -ka.field_h) {
              uf.field_b = ka.field_h + 3;
              L0: {
                af.field_c = 20;
                pa.field_g = pa.field_g - 1;
                gi.field_e = gi.field_e + 1;
                if (-31 < (gi.field_e % 600 ^ -1)) {
                  uf.field_b = ka.field_h + 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              fieldTemp$31 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (-1 <= (fieldTemp$31 ^ -1)) {
                fieldTemp$32 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$32 > 0) {
                  rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                  return;
                } else {
                  return;
                }
              } else {
                ha.field_g = wa.field_a % 15 % 2;
                fieldTemp$33 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$33 <= 0) {
                  return;
                } else {
                  rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                  return;
                }
              }
            } else {
              var1_int = uf.field_b + -ka.field_h;
              if (-2 == (jk.field_d ^ -1)) {
                if ((var1_int ^ -1) < -2) {
                  uf.field_b = uf.field_b - 1;
                  L1: {
                    af.field_c = 20;
                    pa.field_g = pa.field_g - 1;
                    gi.field_e = gi.field_e + 1;
                    if (-31 < (gi.field_e % 600 ^ -1)) {
                      uf.field_b = ka.field_h + 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                  fieldTemp$34 = wa.field_a;
                  wa.field_a = wa.field_a - 1;
                  if (-1 <= (fieldTemp$34 ^ -1)) {
                    fieldTemp$35 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (fieldTemp$35 > 0) {
                      rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L2: {
                      ha.field_g = wa.field_a % 15 % 2;
                      fieldTemp$36 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$36 <= 0) {
                        break L2;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    if (jk.field_d != 2) {
                      break L3;
                    } else {
                      if (-6 >= (var1_int ^ -1)) {
                        break L3;
                      } else {
                        uf.field_b = uf.field_b + 1;
                        L4: {
                          af.field_c = 20;
                          pa.field_g = pa.field_g - 1;
                          gi.field_e = gi.field_e + 1;
                          if (-31 < (gi.field_e % 600 ^ -1)) {
                            uf.field_b = ka.field_h + 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                          fieldTemp$37 = wa.field_a;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (fieldTemp$37 ^ -1)) {
                            break L5;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L5;
                          }
                        }
                        L6: {
                          fieldTemp$38 = jf.field_j;
                          jf.field_j = jf.field_j - 1;
                          if (fieldTemp$38 <= 0) {
                            break L6;
                          } else {
                            rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                            break L6;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L7: {
                    if (jk.field_d != 0) {
                      break L7;
                    } else {
                      if (-4 >= (var1_int ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          uf.field_b = uf.field_b + 1;
                          af.field_c = 20;
                          pa.field_g = pa.field_g - 1;
                          gi.field_e = gi.field_e + 1;
                          if (-31 < (gi.field_e % 600 ^ -1)) {
                            uf.field_b = ka.field_h + 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                          fieldTemp$39 = wa.field_a;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (fieldTemp$39 ^ -1)) {
                            break L9;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L9;
                          }
                        }
                        L10: {
                          fieldTemp$40 = jf.field_j;
                          jf.field_j = jf.field_j - 1;
                          if (fieldTemp$40 <= 0) {
                            break L10;
                          } else {
                            rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (jk.field_d == 0) {
                    if (var1_int <= 3) {
                      L11: {
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$41 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$41 ^ -1)) {
                          break L12;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L12;
                        }
                      }
                      L13: {
                        fieldTemp$42 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$42 <= 0) {
                          break L13;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L13;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        uf.field_b = uf.field_b - 1;
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$43 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$43 ^ -1)) {
                          break L15;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L15;
                        }
                      }
                      L16: {
                        fieldTemp$44 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$44 <= 0) {
                          break L16;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L16;
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$45 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$45 ^ -1)) {
                        break L18;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L18;
                      }
                    }
                    L19: {
                      fieldTemp$46 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$46 <= 0) {
                        break L19;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L19;
                      }
                    }
                    return;
                  }
                }
              } else {
                L20: {
                  if (jk.field_d != 2) {
                    break L20;
                  } else {
                    if (-6 >= (var1_int ^ -1)) {
                      break L20;
                    } else {
                      uf.field_b = uf.field_b + 1;
                      L21: {
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$47 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$47 ^ -1)) {
                          break L22;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L22;
                        }
                      }
                      L23: {
                        fieldTemp$48 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$48 <= 0) {
                          break L23;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L23;
                        }
                      }
                      return;
                    }
                  }
                }
                L24: {
                  if (jk.field_d != 0) {
                    break L24;
                  } else {
                    if (-4 >= (var1_int ^ -1)) {
                      break L24;
                    } else {
                      L25: {
                        uf.field_b = uf.field_b + 1;
                        af.field_c = 20;
                        pa.field_g = pa.field_g - 1;
                        gi.field_e = gi.field_e + 1;
                        if (-31 < (gi.field_e % 600 ^ -1)) {
                          uf.field_b = ka.field_h + 0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$49 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$49 ^ -1)) {
                          break L26;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L26;
                        }
                      }
                      L27: {
                        fieldTemp$50 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$50 <= 0) {
                          break L27;
                        } else {
                          rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                          break L27;
                        }
                      }
                      return;
                    }
                  }
                }
                if (jk.field_d == 0) {
                  if (var1_int <= 3) {
                    L28: {
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$51 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$51 ^ -1)) {
                        break L29;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L29;
                      }
                    }
                    L30: {
                      fieldTemp$52 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$52 <= 0) {
                        break L30;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L30;
                      }
                    }
                    return;
                  } else {
                    L31: {
                      uf.field_b = uf.field_b - 1;
                      af.field_c = 20;
                      pa.field_g = pa.field_g - 1;
                      gi.field_e = gi.field_e + 1;
                      if (-31 < (gi.field_e % 600 ^ -1)) {
                        uf.field_b = ka.field_h + 0;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$53 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$53 ^ -1)) {
                        break L32;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L32;
                      }
                    }
                    L33: {
                      fieldTemp$54 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$54 <= 0) {
                        break L33;
                      } else {
                        rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                        break L33;
                      }
                    }
                    return;
                  }
                } else {
                  L34: {
                    af.field_c = 20;
                    pa.field_g = pa.field_g - 1;
                    gi.field_e = gi.field_e + 1;
                    if (-31 < (gi.field_e % 600 ^ -1)) {
                      uf.field_b = ka.field_h + 0;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    fieldTemp$55 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$55 ^ -1)) {
                      break L35;
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      break L35;
                    }
                  }
                  L36: {
                    fieldTemp$56 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (fieldTemp$56 <= 0) {
                      break L36;
                    } else {
                      rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                      break L36;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L37: {
              pa.field_g = pa.field_g - 1;
              gi.field_e = gi.field_e + 1;
              if (-31 < (gi.field_e % 600 ^ -1)) {
                uf.field_b = ka.field_h + 0;
                break L37;
              } else {
                break L37;
              }
            }
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$57 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$57 ^ -1)) {
              fieldTemp$58 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$58 <= 0) {
                return;
              } else {
                rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$59 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$59 > 0) {
                rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 0;
        field_e = new tf();
        field_a = 0;
        field_f = new tf();
        field_d = null;
    }
}
