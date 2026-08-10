/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private byte[] field_a;
    static boolean field_k;
    static int[] field_h;
    static oc field_f;
    private int[] field_c;
    static int field_b;
    private int[] field_e;
    static String field_m;
    static int field_i;
    static ll[] field_j;
    static int field_g;
    static String field_d;
    static int field_l;

    final int a(int param0, byte param1, byte[] param2, int param3, byte[] param4, int param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (-1 != (param3 ^ -1)) {
              L1: {
                param3 = param3 + param0;
                var7_int = 0;
                var8 = param5;
                if (param1 <= -113) {
                  break L1;
                } else {
                  u.a(-33);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 < 0) {
                    var7_int = this.field_c[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param0;
                      param0++;
                      param2[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (64 & var9 ^ -1)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param0;
                      param0++;
                      param2[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L9;
                    } else {
                      incrementValue$5 = param0;
                      param0++;
                      param2[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-1 != (16 & var9 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (-1 < (dupTemp$6 ^ -1)) {
                      incrementValue$7 = param0;
                      param0++;
                      param2[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param3 > param0) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var9 & 8) == 0) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L13;
                    } else {
                      incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (4 & var9 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (0 <= dupTemp$12) {
                      break L17;
                    } else {
                      incrementValue$13 = param0;
                      param0++;
                      param2[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param5 + (1 + var8);
                      }
                    }
                  }
                  L18: {
                    if ((var9 & 1) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_c[var7_int];
                  var10 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param0;
                    param0++;
                    param2[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param0 >= param3) {
                      break L4;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackIn_63_0 = -param5 + (1 + var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var7);

            stackIn_66_1 = new StringBuilder().append("u.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L19;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_67_0), stackIn_70_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_63_0;
        }
    }

    final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param3 << 450450179;
            param1 = param1 + param5;
            L1: while (true) {
              if (param5 >= param1) {
                L2: {
                  if (param4 == 1) {
                    break L2;
                  } else {
                    field_b = 117;
                    break L2;
                  }
                }
                stackIn_19_0 = -param3 + (var8 + 7 >> 1978117955);
                break L0;
              } else {
                var9 = 255 & param2[param5];
                var10 = this.field_e[var9];
                var11 = this.field_a[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  var12 = var8 >> -1776433085;
                  var13 = var8 & 7;
                  var7_int = var7_int & -var13 >> 1274093471;
                  var14 = var12 - -(-1 + (var11 + var13) >> 1445648387);
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$0 = fj.b(var7_int, var10 >>> var13);
                  var7_int = dupTemp$0;
                  param0[var12] = (byte)dupTemp$0;
                  if (var12 < var14) {
                    L3: {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param0[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param0[var12] = (byte)(var10 >>> var13);
                          if (var12 < var14) {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param0[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          param5++;
                          continue L1;
                        }
                      } else {
                        break L3;
                      }
                    }
                    param5++;
                    continue L1;
                  } else {
                    param5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("u.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_19_0;
    }

    final static int a(jd param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
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
            if (0 < param2) {
              if (uj.a(-2147483648, param2)) {
                stackIn_5_0 = (int)(((long)param0.c((byte) -46) & 4294967295L) * (long)param2 >> -805192864);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -(int)(4294967296L % (long)param2) + param1;
                L1: while (true) {
                  var4 = param0.c((byte) -46);
                  if (var3_int > var4) {
                    stackIn_10_0 = dh.a(var4, true, param2);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("u.G(");

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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static void a(byte param0) {
        int stackIn_45_0 = 0;
        cg stackIn_51_0 = null;
        cg stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        cg stackIn_93_0 = null;
        cg stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ab var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        cg var3_ref_cg = null;
        na var4 = null;
        int var4_int = 0;
        int var5 = 0;
        na var6 = null;
        cg var7 = null;
        int var8 = 0;
        cg var8_ref_cg = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        na var13 = null;
        cg var14 = null;
        na var15 = null;
        Object var16 = null;
        Object var17 = null;
        na var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        na var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        cg var23 = null;
        cg var24 = null;
        na var25 = null;
        String var26 = null;
        String var27 = null;
        cg var28 = null;
        cg var29 = null;
        cg var30 = null;
        na var31 = null;
        na var32 = null;
        cg var33 = null;
        var16 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 <= -45) {
              L1: {
                L2: {
                  L3: {
                    var1 = df.field_z;
                    var2 = ((wk) ((Object) var1)).e((byte) -110);
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if ((var2 ^ -1) == -2) {
                        break L3;
                      } else {
                        if (var2 == 2) {
                          break L3;
                        } else {
                          if (-4 == (var2 ^ -1)) {
                            break L3;
                          } else {
                            if (-5 != (var2 ^ -1)) {
                              if (var2 != 5) {
                                if (6 != var2) {
                                  if (-8 == (var2 ^ -1)) {
                                    var33 = (cg) ((Object) gm.field_j.b(12623));
                                    L4: while (true) {
                                      if (var33 == null) {
                                        oe.field_b = 0;
                                        break L2;
                                      } else {
                                        var33.a(true);
                                        var33.a((byte) 88);
                                        var33 = (cg) ((Object) gm.field_j.a(0));
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    if (-9 == (var2 ^ -1)) {
                                      L5: {
                                        var3 = ((wk) ((Object) var1)).n(-98);
                                        var4 = (na) ((Object) nk.field_q.a((long)var3, (byte) -93));
                                        if (var4 != null) {
                                          break L5;
                                        } else {
                                          var4 = new na(vf.field_l);
                                          nk.field_q.a(var4, (long)var3, (byte) 116);
                                          break L5;
                                        }
                                      }
                                      dn.a(var1, var4, true, 2);
                                      cb.a(var4, 67);
                                      break L1;
                                    } else {
                                      if (-10 == (var2 ^ -1)) {
                                        var3 = ((wk) ((Object) var1)).n(-98);
                                        var4_int = ((wk) ((Object) var1)).e((byte) 105);
                                        var15 = (na) ((Object) nk.field_q.a((long)var3, (byte) -70));
                                        var31 = var15;
                                        if (var15 != null) {
                                          L6: {
                                            if (var4_int == 0) {
                                              var31.a(true);
                                              break L6;
                                            } else {
                                              var15.field_bc = vd.field_i;
                                              var15.field_ac = var4_int;
                                              break L6;
                                            }
                                          }
                                          var31.a((byte) 88);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        if (-11 != (var2 ^ -1)) {
                                          L7: {
                                            if (-12 == (var2 ^ -1)) {
                                              break L7;
                                            } else {
                                              if (12 != var2) {
                                                if (-14 != (var2 ^ -1)) {
                                                  L8: {
                                                    if ((var2 ^ -1) == -15) {
                                                      break L8;
                                                    } else {
                                                      if ((var2 ^ -1) == -17) {
                                                        break L8;
                                                      } else {
                                                        L9: {
                                                          if (var2 == 15) {
                                                            break L9;
                                                          } else {
                                                            if ((var2 ^ -1) == -18) {
                                                              break L9;
                                                            } else {
                                                              if (var2 != 18) {
                                                                if (19 != var2) {
                                                                  if (var2 == 20) {
                                                                    dn.a(var1, wi.field_f, false, 2);
                                                                    break L1;
                                                                  } else {
                                                                    if ((var2 ^ -1) == -22) {
                                                                      var3 = ((wk) ((Object) var1)).n(-98);
                                                                      if (-1 == (var3 ^ -1)) {
                                                                        ba.field_a = 0L;
                                                                        break L1;
                                                                      } else {
                                                                        ba.field_a = qj.b(-26572) + (long)var3;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      if ((var2 ^ -1) != -23) {
                                                                        if (var2 == 23) {
                                                                          qf.field_a = ((wk) ((Object) var1)).c(-943038560);
                                                                          break L1;
                                                                        } else {
                                                                          jh.a((Throwable) null, "L1: " + nn.g((byte) -25), (byte) 20);
                                                                          ka.b(false);
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        sk.field_e = ((wk) ((Object) var1)).n(-98);
                                                                        jh.field_e = ((wk) ((Object) var1)).a(121);
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3_long = ((wk) ((Object) var1)).c(-943038560);
                                                                  var5 = ((wk) ((Object) var1)).e((byte) -111);
                                                                  var14 = vf.a(var3_long, 8192);
                                                                  var28 = var14;
                                                                  if (var14 != null) {
                                                                    L10: {
                                                                      if (-1 == (var5 ^ -1)) {
                                                                        var28.a(true);
                                                                        break L10;
                                                                      } else {
                                                                        var14.field_Sb = var5;
                                                                        var14.field_Eb = vd.field_i;
                                                                        break L10;
                                                                      }
                                                                    }
                                                                    var28.a((byte) 88);
                                                                    wi.field_f.field_Rb = wi.field_f.field_Rb - 1;
                                                                    break L1;
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                L11: {
                                                                  var3_long = ((wk) ((Object) var1)).c(-943038560);
                                                                  var26 = ((wk) ((Object) var1)).l(-1);
                                                                  var27 = ((wk) ((Object) var1)).l(-1);
                                                                  var7 = vf.a(var3_long, 8192);
                                                                  if (var7 != null) {
                                                                    break L11;
                                                                  } else {
                                                                    var7 = new cg(var26, var27, var3_long);
                                                                    kn.field_qb.a(var7, var3_long, (byte) 121);
                                                                    wi.field_f.field_Rb = wi.field_f.field_Rb + 1;
                                                                    break L11;
                                                                  }
                                                                }
                                                                L12: {
                                                                  var7.field_Pb = ((wk) ((Object) var1)).n(-98);
                                                                  var8 = ((wk) ((Object) var1)).a(16);
                                                                  var7.field_Vb = var8 >> 1682702497;
                                                                  stackIn_93_0 = (cg) (var7);

                                                                  if ((var8 & 1) == 0) {
                                                                    stackIn_94_0 = (cg) ((Object) stackIn_93_0);
                                                                    stackIn_94_1 = 0;
                                                                    break L12;
                                                                  } else {
                                                                    stackIn_94_0 = (cg) ((Object) stackIn_93_0);
                                                                    stackIn_94_1 = 1;
                                                                    break L12;
                                                                  }
                                                                }
                                                                stackIn_94_0.field_Jb = stackIn_94_1 != 0;
                                                                var7.field_Mb = ((wk) ((Object) var1)).e((byte) -109);
                                                                var7.field_Bb = ((wk) ((Object) var1)).e((byte) -120);
                                                                ph.field_a.b(var7, -1);
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L13: {
                                                          var3_long = ((wk) ((Object) var1)).c(-943038560);
                                                          var5 = ((wk) ((Object) var1)).e((byte) 107);
                                                          var29 = fn.a(var3_long, 123);
                                                          if (var29 == null) {
                                                            break L13;
                                                          } else {
                                                            L14: {
                                                              if (var5 != 0) {
                                                                var29.field_Eb = vd.field_i;
                                                                var29.field_Sb = var5;
                                                                break L14;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                            L15: {
                                                              if ((var2 ^ -1) == -16) {
                                                                var29.field_Db = false;
                                                                break L15;
                                                              } else {
                                                                if (!var29.field_Kb) {
                                                                  break L15;
                                                                } else {
                                                                  var29.field_Kb = false;
                                                                  oe.field_b = oe.field_b - 1;
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            jf.a(var29, (byte) 15);
                                                            break L13;
                                                          }
                                                        }
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                  L16: {
                                                    var3_long = ((wk) ((Object) var1)).c(-943038560);
                                                    var30 = fn.a(var3_long, 121);
                                                    if (var30 == null) {
                                                      break L16;
                                                    } else {
                                                      L17: {
                                                        if (-15 != (var2 ^ -1)) {
                                                          if (!var30.field_Kb) {
                                                            oe.field_b = oe.field_b + 1;
                                                            var30.field_Kb = true;
                                                            break L17;
                                                          } else {
                                                            break L17;
                                                          }
                                                        } else {
                                                          var30.field_Db = true;
                                                          break L17;
                                                        }
                                                      }
                                                      jf.a(var30, (byte) 127);
                                                      break L16;
                                                    }
                                                  }
                                                  break L1;
                                                } else {
                                                  L18: {
                                                    var3 = ((wk) ((Object) var1)).n(-98);
                                                    var4_int = ((wk) ((Object) var1)).e((byte) -107);
                                                    var17_ref = (na) ((Object) nk.field_q.a((long)var3, (byte) -105));
                                                    if (var17_ref == null) {
                                                      break L18;
                                                    } else {
                                                      L19: {
                                                        var17_ref.field_Nb = false;
                                                        var13 = var17_ref;
                                                        var6 = var13;
                                                        if (0 == var4_int) {
                                                          break L19;
                                                        } else {
                                                          var17_ref.field_ac = var4_int;
                                                          var17_ref.field_bc = vd.field_i;
                                                          break L19;
                                                        }
                                                      }
                                                      var13.field_Hb = false;
                                                      cb.a(var17_ref, 25);
                                                      break L18;
                                                    }
                                                  }
                                                  break L1;
                                                }
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L20: {
                                            var3 = ((wk) ((Object) var1)).n(-98);
                                            var19_ref = (na) ((Object) nk.field_q.a((long)var3, (byte) -98));
                                            var25 = var19_ref;
                                            if (var25 == null) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (-12 != (var2 ^ -1)) {
                                                  var25.field_Nb = true;
                                                  break L21;
                                                } else {
                                                  var25.field_Hb = true;
                                                  break L21;
                                                }
                                              }
                                              cb.a(var25, -26);
                                              break L20;
                                            }
                                          }
                                          break L1;
                                        } else {
                                          var32 = (na) ((Object) vh.field_a.b(12623));
                                          L22: while (true) {
                                            if (var32 == null) {
                                              break L2;
                                            } else {
                                              var32.a(true);
                                              var32.a((byte) 88);
                                              var32 = (na) ((Object) vh.field_a.a(0));
                                              continue L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L23: {
                                    var3_long = ((wk) ((Object) var1)).c(-943038560);
                                    var5 = ((wk) ((Object) var1)).e((byte) -96);
                                    var24 = fn.a(var3_long, 111);
                                    if (var24 == null) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (!var24.field_Kb) {
                                          break L24;
                                        } else {
                                          oe.field_b = oe.field_b - 1;
                                          var24.field_Kb = false;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        if (-1 != (var5 ^ -1)) {
                                          var24.field_Eb = vd.field_i;
                                          var24.field_Sb = var5;
                                          break L25;
                                        } else {
                                          var24.a(true);
                                          break L25;
                                        }
                                      }
                                      var24.a((byte) 88);
                                      break L23;
                                    }
                                  }
                                  break L1;
                                }
                              } else {
                                L26: {
                                  var3_long = ((wk) ((Object) var1)).c(-943038560);
                                  var21 = ((wk) ((Object) var1)).l(-1);
                                  var20 = ((wk) ((Object) var1)).l(-1);
                                  var22 = ((wk) ((Object) var1)).l(-1);
                                  var23 = fn.a(var3_long, 119);
                                  var8_ref_cg = var23;
                                  if (var20.equals("")) {
                                    stackIn_45_0 = 0;
                                    break L26;
                                  } else {
                                    stackIn_45_0 = 1;
                                    break L26;
                                  }
                                }
                                L27: {
                                  var9 = stackIn_45_0;
                                  if (var23 != null) {
                                    if (var9 == 0) {
                                      break L27;
                                    } else {
                                      var23.a(var21, var22, 93);
                                      break L27;
                                    }
                                  } else {
                                    var8_ref_cg = new cg(var21, var22, var3_long);
                                    bc.field_c.a(var8_ref_cg, var3_long, (byte) 126);
                                    break L27;
                                  }
                                }
                                L28: {
                                  var8_ref_cg.field_Ob = qj.b(-26572) + -(long)((wk) ((Object) var1)).d(-10674);
                                  var8_ref_cg.field_Pb = ((wk) ((Object) var1)).n(-98);
                                  var10 = ((wk) ((Object) var1)).a(31);
                                  stackIn_51_0 = (cg) (var8_ref_cg);

                                  if (0 == (1 & var10)) {
                                    stackIn_52_0 = (cg) ((Object) stackIn_51_0);
                                    stackIn_52_1 = 0;
                                    break L28;
                                  } else {
                                    stackIn_52_0 = (cg) ((Object) stackIn_51_0);
                                    stackIn_52_1 = 1;
                                    break L28;
                                  }
                                }
                                stackIn_52_0.field_Jb = stackIn_52_1 != 0;
                                var8_ref_cg.field_Vb = var10 >> 902129281;
                                var8_ref_cg.field_Mb = ((wk) ((Object) var1)).e((byte) -123);
                                var8_ref_cg.field_Bb = ((wk) ((Object) var1)).e((byte) 100);
                                jf.a(var8_ref_cg, (byte) 1);
                                break L1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3_ref_cg = (cg) ((Object) ph.field_a.b(12623));
                  L29: while (true) {
                    if (var3_ref_cg == null) {
                      var3_ref_cg = (cg) ((Object) bc.field_c.f(-79));
                      L30: while (true) {
                        if (var3_ref_cg == null) {
                          L31: {
                            if (var2 != 1) {
                              break L31;
                            } else {
                              if (wi.field_f != null) {
                                va.field_e = wi.field_f.field_ic;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if (var2 == 4) {
                              var3 = ((wk) ((Object) var1)).n(-98);
                              wi.field_f = new na(vf.field_l);
                              wi.field_f.a(46, (long)var3);
                              dn.a(var1, wi.field_f, false, 2);
                              ba.field_a = 0L;
                              break L32;
                            } else {
                              wi.field_f = null;
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (-3 == (var2 ^ -1)) {
                                break L34;
                              } else {
                                if (-4 == (var2 ^ -1)) {
                                  break L34;
                                } else {
                                  om.field_x = null;
                                  break L33;
                                }
                              }
                            }
                            if (null != om.field_x) {
                              break L33;
                            } else {
                              om.field_x = new na(vf.field_l);
                              break L33;
                            }
                          }
                          if (-4 == (var2 ^ -1)) {
                            dn.field_Db = true;
                            var3 = 0;
                            L35: while (true) {
                              if (gh.field_E.length <= var3) {
                                q.field_L = ((wk) ((Object) var1)).e((byte) 32);
                                q.field_N = ((wk) ((Object) var1)).e((byte) 72);
                                var3 = 0;
                                L36: while (true) {
                                  if (var3 >= ng.field_D.length) {
                                    break L2;
                                  } else {
                                    ng.field_D[var3] = ((wk) ((Object) var1)).o(6);
                                    var3++;
                                    continue L36;
                                  }
                                }
                              } else {
                                gh.field_E[var3] = ((wk) ((Object) var1)).o(6);
                                var3++;
                                continue L35;
                              }
                            }
                          } else {
                            dn.field_Db = false;
                            break L1;
                          }
                        } else {
                          L37: {
                            L38: {
                              if (var3_ref_cg.field_Db) {
                                break L38;
                              } else {
                                if (var3_ref_cg.field_Kb) {
                                  break L38;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L39: {
                              if (!var3_ref_cg.field_Kb) {
                                break L39;
                              } else {
                                oe.field_b = oe.field_b - 1;
                                var3_ref_cg.field_Kb = false;
                                break L39;
                              }
                            }
                            var3_ref_cg.field_Db = false;
                            jf.a(var3_ref_cg, (byte) -109);
                            break L37;
                          }
                          var3_ref_cg = (cg) ((Object) bc.field_c.a(-1));
                          continue L30;
                        }
                      }
                    } else {
                      var3_ref_cg.a(true);
                      var3_ref_cg.a((byte) 88);
                      var3_ref_cg = (cg) ((Object) ph.field_a.a(0));
                      continue L29;
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "u.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        if (param0 != 6) {
            return;
        }
        if (ka.field_m == null) {
            return;
        }
        qm.a(ka.field_m, (byte) 122);
        ka.field_m.a(fi.field_d, (byte) 67);
        ka.field_m = null;
        if (ob.field_Y != null) {
            ob.field_Y.a(true);
        }
        on.field_c.requestFocus();
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_k = true;
        }
        field_f = null;
        field_m = null;
        field_h = null;
        field_d = null;
        field_j = null;
    }

    u(byte[] param0) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        try {
          L0: {
            var2_int = param0.length;
            this.field_a = param0;
            this.field_e = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_c = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (-1 == (var6 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var17[var6];
                      this.field_e[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[-1 + var6];
                        break L3;
                      } else {
                        var10 = var6 - 1;
                        L4: while (true) {
                          L5: {
                            if ((var10 ^ -1) > -2) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << -var10 + 32;
                                if ((var12 & var11) != 0) {
                                  var3[var10] = var3[-1 + var10];
                                  break L5;
                                } else {
                                  var3[var10] = fj.b(var12, var11);
                                  var10--;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var9 = var7 | var8;
                          break L3;
                        }
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L6: while (true) {
                      if (-33 > (var10 ^ -1)) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            this.field_c[var10] = var5 ^ -1;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = 1 + var10;
                              break L2;
                            }
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var12 & var8)) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (this.field_c[var10] != 0) {
                                    break L9;
                                  } else {
                                    this.field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_c[var10];
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (this.field_c.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * this.field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (this.field_c.length <= var14) {
                                    this.field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_c[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        L12: {
                          if ((var17[var10] ^ -1) != (var8 ^ -1)) {
                            break L12;
                          } else {
                            var17[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("u.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (1 != param1) {
              if (-3 == (param1 ^ -1)) {
                stackIn_6_0 = tj.a(-73, new String[]{param2}, rj.field_h);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != 3) {
                  if (param1 == 4) {
                    stackIn_13_0 = tj.a(125, new String[]{param2}, q.field_M);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (5 != param1) {
                      if (param1 == 6) {
                        stackIn_20_0 = tj.a(120, new String[]{param2}, b.field_b);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-8 != (param1 ^ -1)) {
                          if ((param1 ^ -1) != -9) {
                            if (-12 == (param1 ^ -1)) {
                              stackIn_30_0 = tj.a(-92, new String[]{param2}, ui.field_w);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (-13 == (param1 ^ -1)) {
                                stackIn_34_0 = tj.a(-85, new String[]{param2}, so.field_n);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                L1: {
                                  if (param0 < -125) {
                                    break L1;
                                  } else {
                                    field_l = -80;
                                    break L1;
                                  }
                                }
                                if (param1 == 13) {
                                  stackIn_40_0 = tj.a(-123, new String[]{param2}, qo.field_d);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackIn_26_0 = tj.a(122, new String[]{param2}, c.field_c);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_23_0 = tj.a(122, new String[]{param2}, ho.field_d);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = tj.a(-95, new String[]{param2}, gm.field_n);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = tj.a(-54, new String[]{param2}, ij.field_Gb);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = tj.a(126, new String[]{param2}, kb.field_e);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("u.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L2;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_34_0;
                          } else {
                            return stackIn_40_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_k = false;
        field_h = new int[]{76, 77, 78};
        field_m = "Armageddon counter";
        field_f = new oc();
        field_i = 0;
        field_d = "Friends";
    }
}
