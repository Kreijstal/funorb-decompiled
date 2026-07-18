/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends pg {
    static long field_k;
    static String field_i;
    kd field_m;
    static qb[] field_g;
    pg field_n;
    int field_l;
    static int[] field_h;
    static String field_j;

    public static void a(int param0) {
        field_i = null;
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final static qb[] a(int param0, int param1, int param2) {
        if (param1 <= 27) {
            Object var4 = null;
            boolean discarded$0 = fk.a((nf) null, -111, (ll) null, 35, (byte) -40, (qb) null);
        }
        return ql.a(1, (byte) 127, param2, param0);
    }

    final static void d(int param0) {
        L0: {
          L1: {
            if (fj.field_j == 10) {
              break L1;
            } else {
              if (!ke.g(-115)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          pa.b((byte) 108);
          fj.field_j = 11;
          break L0;
        }
        ii.field_f = true;
    }

    final static boolean a(nf param0, int param1, ll param2, int param3, byte param4, qb param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param3 = param3 + param5.field_x;
              param1 = param1 + param5.field_o;
              ce.field_k = 0;
              var6_int = 0;
              di.field_m = 0;
              jo.field_b = false;
              if (param4 == -1) {
                break L1;
              } else {
                field_k = -23L;
                break L1;
              }
            }
            L2: {
              var7 = param5.field_q;
              var8 = param5.field_y;
              if (param3 >= param0.field_y) {
                break L2;
              } else {
                if (-var7 >= param3) {
                  break L2;
                } else {
                  if (param1 >= param0.field_H) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    if (-var8 < param1) {
                      L3: {
                        if (0 < param3) {
                          stackOut_15_0 = param3;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      L4: {
                        var9 = stackIn_16_0;
                        var10 = param3 - -var7;
                        if (~param0.field_y > ~var10) {
                          var10 = param0.field_y;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (param1 <= 0) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L5;
                        } else {
                          stackOut_20_0 = param1;
                          stackIn_22_0 = stackOut_20_0;
                          break L5;
                        }
                      }
                      L6: {
                        var11 = stackIn_22_0;
                        var12 = param1 - -var8;
                        if (~param0.field_y > ~var12) {
                          var12 = param0.field_y;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var10 = var10 - var9;
                        var12 = var12 - var11;
                        if ((var12 & 1) > 0) {
                          var12--;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if ((1 & var10) > 0) {
                          var10--;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var13 = (var9 >> 1) + (var11 >> 1) * param0.field_hb;
                      var14 = param0.field_hb + -(var10 >> 1);
                      var15 = (-param1 + var11) * param5.field_q + -param3 + var9;
                      var16 = var7 + -var10;
                      var16 = var16 + var7;
                      var28 = param2.field_m;
                      var29 = param5.field_A;
                      var27 = var29;
                      var25 = var27;
                      var23 = var25;
                      var18 = var23;
                      var19 = var12;
                      L9: while (true) {
                        if (var19 <= 0) {
                          if (var6_int > 0) {
                            di.field_m = di.field_m / var6_int;
                            ce.field_k = ce.field_k / var6_int;
                            stackOut_63_0 = 1;
                            stackIn_64_0 = stackOut_63_0;
                            break L0;
                          } else {
                            return false;
                          }
                        } else {
                          var20 = var10;
                          L10: while (true) {
                            if (var20 <= 0) {
                              var13 = var13 + var14;
                              var15 = var15 + var16;
                              if (var13 >= param2.field_m.length) {
                                stackOut_58_0 = 0;
                                stackIn_59_0 = stackOut_58_0;
                                return stackIn_59_0 != 0;
                              } else {
                                var19 -= 2;
                                continue L9;
                              }
                            } else {
                              L11: {
                                if (var28[var13] == 0) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var29[var15] == 0) {
                                      break L12;
                                    } else {
                                      ce.field_k = ce.field_k + (var12 + (var11 + -var19));
                                      di.field_m = di.field_m + (-var20 + (var10 + var9));
                                      var6_int++;
                                      if (-1 == var28[var13]) {
                                        jo.field_b = true;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var18[var15 - -1] != 0) {
                                      L14: {
                                        ce.field_k = ce.field_k + (-var19 + var11 - -var12);
                                        di.field_m = di.field_m + (-var20 + (var9 - -var10 + 1));
                                        if (var28[var13] == -1) {
                                          jo.field_b = true;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      var6_int++;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L15: {
                                    if (0 != var18[var15 + var7]) {
                                      ce.field_k = ce.field_k + (1 + -var19 + (var12 + var11));
                                      di.field_m = di.field_m + (-var20 + var10 + var9);
                                      var6_int++;
                                      if (var28[var13] == -1) {
                                        jo.field_b = true;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  if (var18[1 + (var15 + var7)] != 0) {
                                    di.field_m = di.field_m + (-var20 + (var10 + (var9 - -1)));
                                    ce.field_k = ce.field_k + (1 + (-var19 + (var12 + var11)));
                                    var6_int++;
                                    if (-1 != var28[var13]) {
                                      break L11;
                                    } else {
                                      jo.field_b = true;
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var13++;
                              var15 += 2;
                              var20 -= 2;
                              continue L10;
                            }
                          }
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("fk.A(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L16;
            }
          }
          L17: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L18;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_64_0 != 0;
    }

    final static ll[] c(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        ll[] var1 = new ll[h.field_J];
        for (var2 = 0; h.field_J > var2; var2++) {
            var1[var2] = new ll(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], ln.field_I[var2], ph.field_c);
        }
        dk.a(-18229);
        return var1;
    }

    final static void a(qb param0, int param1) {
        try {
            if (param1 != -23095) {
                Object var3 = null;
                fk.a((qb) null, -12);
            }
            ec.a(65280);
            de.a(param0.field_A, param0.field_n, param0.field_w);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fk.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ab var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        cm var11 = null;
        fe var12 = null;
        ab var13 = null;
        fe var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = df.field_z;
              var2 = var13.e((byte) 54);
              if (var2 == 0) {
                var10 = la.b((byte) 12);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((wk) (Object) var5).e((byte) -100);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var12 = (fe) (Object) i.field_e.b(12623);
                    if (var12 != null) {
                      var12.field_l = true;
                      var12.field_i = var3;
                      var12.a(true);
                      break L1;
                    } else {
                      ka.b(false);
                      return;
                    }
                  } else {
                    var9[var7] = ((wk) (Object) var5).d(-10674);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                if (var2 == 1) {
                  var11 = (cm) (Object) cc.field_e.b(12623);
                  if (var11 == null) {
                    ka.b(false);
                    return;
                  } else {
                    var11.a(true);
                    break L1;
                  }
                } else {
                  if (var2 != 2) {
                    jh.a((Throwable) null, "A1: " + nn.g((byte) -25), (byte) 20);
                    ka.b(false);
                    break L1;
                  } else {
                    var14 = (fe) (Object) i.field_e.b(12623);
                    if (var14 != null) {
                      var14.field_i = la.b((byte) 12);
                      var14.field_l = true;
                      var14.a(true);
                      break L1;
                    } else {
                      ka.b(false);
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "fk.G(" + -20 + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
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
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = nm.a(param0, var3, -31843);
                    jh.a(var3.toString(), param0, true, (byte) -109);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var3_ref2;
                stackOut_4_1 = new StringBuilder().append("fk.C(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              L4: {
                stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(false).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param2 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = an.field_g;
            var3 = me.field_I;
            var4 = pg.field_c.field_Z.a(param1, 500);
            var5 = 6 + pg.field_c.field_Z.c(param1, 500);
            var6 = 2 + var4 * ga.field_r;
            var7 = ih.a(var2_int, var5, 12, 246);
            var8 = ql.a(10, 20, var6, var3);
            de.a(var7, var8, var5, var6, 0);
            de.d(var7 - -1, 1 + var8, -2 + var5, -2 + var6, 16777088);
            int discarded$0 = pg.field_c.field_Z.a(param1, var7 + 3, 1 + (var8 - -oc.field_i - pg.field_c.field_Z.field_C), 500, 1000, 0, -1, 0, 0, ga.field_r);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fk.D(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fk(kd param0, pg param1) {
        try {
            ((fk) this).field_m = param0;
            ((fk) this).field_l = param0.f();
            ((fk) this).field_n = param1;
            ((fk) this).field_m.c(si.field_l * ((fk) this).field_l + 128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Down at the bottom-right of the screen you will see the map. You can use this to scan for your enemies and get a general feel of the arena. Click on it to move the view quickly.";
        field_h = new int[]{58, 59, 60};
        field_j = "Change display name";
    }
}
