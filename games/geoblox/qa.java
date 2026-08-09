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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
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
                stackIn_4_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_6_0 = "Cabbage";
              return stackIn_6_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("qa.A(");

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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static qd a(byte[] param0, boolean param1) {
        qd var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        qd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var3 = (byte[]) null;
                qa.a((byte[]) null, false);
                break L1;
              }
            }
            if (param0 != null) {
              var2 = new qd(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
              kj.c(true);
              stackIn_6_0 = (qd) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("qa.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        try {
          L0: {
            if (0 == param5) {
              stackIn_4_0 = 0;
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
                    dupTemp$0 = this.field_c[var7_int];
                    var11 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L4;
                    } else {
                      incrementValue$1 = param3;
                      param3++;
                      param0[incrementValue$1] = (byte)(var11 ^ -1);
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
                    dupTemp$2 = this.field_c[var7_int];
                    var11 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param3;
                      param3++;
                      param0[incrementValue$3] = (byte)(var11 ^ -1);
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
                    dupTemp$4 = this.field_c[var7_int];
                    var11 = dupTemp$4;
                    if (-1 >= (dupTemp$4 ^ -1)) {
                      break L8;
                    } else {
                      incrementValue$5 = param3;
                      param3++;
                      param0[incrementValue$5] = (byte)(var11 ^ -1);
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
                    dupTemp$6 = this.field_c[var7_int];
                    var11 = dupTemp$6;
                    if (-1 >= (dupTemp$6 ^ -1)) {
                      break L10;
                    } else {
                      incrementValue$7 = param3;
                      param3++;
                      param0[incrementValue$7] = (byte)(var11 ^ -1);
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
                    dupTemp$8 = this.field_c[var7_int];
                    var11 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param3;
                      param3++;
                      param0[incrementValue$9] = (byte)(var11 ^ -1);
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
                    dupTemp$10 = this.field_c[var7_int];
                    var11 = dupTemp$10;
                    if (-1 < (dupTemp$10 ^ -1)) {
                      incrementValue$11 = param3;
                      param3++;
                      param0[incrementValue$11] = (byte)(var11 ^ -1);
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
                    dupTemp$12 = this.field_c[var7_int];
                    var11 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param3;
                      param3++;
                      param0[incrementValue$13] = (byte)(var11 ^ -1);
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
                  dupTemp$14 = this.field_c[var7_int];
                  var11 = dupTemp$14;
                  if (dupTemp$14 < 0) {
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
                stackIn_66_0 = var9 - -1 + -param1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("qa.E(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L18;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L19;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        float var1;
        int var1_int;
        int var2;
        var2 = Geoblox.field_C;
        if (param0 >= 72) {
          fieldTemp$0 = af.field_c;
          af.field_c = af.field_c - 1;
          if (0 > fieldTemp$0) {
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
              fieldTemp$1 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (-1 <= (fieldTemp$1 ^ -1)) {
                fieldTemp$2 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$2 > 0) {
                  rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                  return;
                } else {
                  return;
                }
              } else {
                ha.field_g = wa.field_a % 15 % 2;
                fieldTemp$3 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$3 <= 0) {
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
                  fieldTemp$4 = wa.field_a;
                  wa.field_a = wa.field_a - 1;
                  if (-1 <= (fieldTemp$4 ^ -1)) {
                    fieldTemp$5 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (fieldTemp$5 > 0) {
                      rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L2: {
                      ha.field_g = wa.field_a % 15 % 2;
                      fieldTemp$6 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$6 <= 0) {
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
                          fieldTemp$7 = wa.field_a;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (fieldTemp$7 ^ -1)) {
                            break L5;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L5;
                          }
                        }
                        L6: {
                          fieldTemp$8 = jf.field_j;
                          jf.field_j = jf.field_j - 1;
                          if (fieldTemp$8 <= 0) {
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
                          fieldTemp$9 = wa.field_a;
                          wa.field_a = wa.field_a - 1;
                          if (-1 <= (fieldTemp$9 ^ -1)) {
                            break L9;
                          } else {
                            ha.field_g = wa.field_a % 15 % 2;
                            break L9;
                          }
                        }
                        L10: {
                          fieldTemp$10 = jf.field_j;
                          jf.field_j = jf.field_j - 1;
                          if (fieldTemp$10 <= 0) {
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
                        fieldTemp$11 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$11 ^ -1)) {
                          break L12;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L12;
                        }
                      }
                      L13: {
                        fieldTemp$12 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$12 <= 0) {
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
                        fieldTemp$13 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$13 ^ -1)) {
                          break L15;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L15;
                        }
                      }
                      L16: {
                        fieldTemp$14 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$14 <= 0) {
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
                      fieldTemp$15 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$15 ^ -1)) {
                        break L18;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L18;
                      }
                    }
                    L19: {
                      fieldTemp$16 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$16 <= 0) {
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
                        fieldTemp$17 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$17 ^ -1)) {
                          break L22;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L22;
                        }
                      }
                      L23: {
                        fieldTemp$18 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$18 <= 0) {
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
                        fieldTemp$19 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$19 ^ -1)) {
                          break L26;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L26;
                        }
                      }
                      L27: {
                        fieldTemp$20 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (fieldTemp$20 <= 0) {
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
                      fieldTemp$21 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$21 ^ -1)) {
                        break L29;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L29;
                      }
                    }
                    L30: {
                      fieldTemp$22 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$22 <= 0) {
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
                      fieldTemp$23 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$23 ^ -1)) {
                        break L32;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L32;
                      }
                    }
                    L33: {
                      fieldTemp$24 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (fieldTemp$24 <= 0) {
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
                    fieldTemp$25 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$25 ^ -1)) {
                      break L35;
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      break L35;
                    }
                  }
                  L36: {
                    fieldTemp$26 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (fieldTemp$26 <= 0) {
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
            fieldTemp$27 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$27 ^ -1)) {
              fieldTemp$28 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$28 <= 0) {
                return;
              } else {
                rj.field_c = ((int)(fe.field_c * var1) << -449443480) + (r.field_ub + ((int)(var1 * md.field_b) << -1230457200) - -(int)(var1 * uk.field_j));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$29 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$29 > 0) {
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
