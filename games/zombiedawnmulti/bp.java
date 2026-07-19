/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends un {
    static cj field_u;
    static int field_r;
    static ja field_s;
    static String[] field_v;
    static cj field_w;
    static String field_t;
    static boolean field_q;

    final re a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_10_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        re stackOut_11_0 = null;
        re stackOut_9_0 = null;
        re stackOut_6_0 = null;
        re stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (ti.a((byte) 57, var4)) {
              L1: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = md.a(var5, -9159);
                if (-1 <= (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-131 <= (var3_int ^ -1)) {
                    if (!param0) {
                      stackOut_11_0 = db.field_b;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_9_0 = (re) null;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_6_0 = jq.field_b;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = jq.field_b;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("bp.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(kj param0, boolean param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ga var7 = null;
        ga var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = ma.field_a;
            var8 = var7;
            var8.b((byte) -35, param2);
            var8.field_j = var8.field_j + 1;
            var4 = var8.field_j;
            var8.a(108, 1);
            var8.a(param0.field_i, (byte) -95);
            var8.a(param0.field_v, (byte) -76);
            var8.a(param0.field_t, (byte) -66);
            var8.b(-116, param0.field_w);
            var8.b(-99, param0.field_x);
            var8.b(122, param0.field_l);
            var8.b(-128, param0.field_k);
            var8.a(-83, param0.field_y.length);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= param0.field_y.length) {
                    break L3;
                  } else {
                    var7.b(52, param0.field_y[var5]);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param1) {
                    break L4;
                  } else {
                    field_u = (cj) null;
                    break L4;
                  }
                }
                discarded$1 = var8.f(var4, 118);
                var8.e(77, var8.field_j + -var4);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("bp.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    bp(pm param0) {
        super(param0);
    }

    public static void h(int param0) {
        field_s = null;
        if (param0 != -3) {
          field_q = true;
          field_t = null;
          field_v = null;
          field_w = null;
          field_u = null;
          return;
        } else {
          field_t = null;
          field_v = null;
          field_w = null;
          field_u = null;
          return;
        }
    }

    final static void a(int param0, k param1, go param2, int param3) {
        try {
            byte[] array$1 = null;
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            go var15 = null;
            Object var16 = null;
            lp var16_ref = null;
            String var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            int stackIn_4_0 = 0;
            int stackIn_42_0 = 0;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_41_0 = 0;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            var14 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var16_ref = new lp();
                var16_ref.field_n = param1.g(31365);
                var16_ref.field_r = param1.i(param3 + -1478490340);
                var16_ref.field_m = new di[var16_ref.field_n];
                var16_ref.field_o = new byte[var16_ref.field_n][][];
                var16_ref.field_g = new int[var16_ref.field_n];
                var16_ref.field_q = new int[var16_ref.field_n];
                var16_ref.field_l = new di[var16_ref.field_n];
                var16_ref.field_i = new int[var16_ref.field_n];
                var5 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var16_ref.field_n <= var5) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            var6_int = param1.g(31365);
                            stackOut_3_0 = var6_int;
                            stackIn_42_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (var14 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  L7: {
                                    if (stackIn_4_0 == 0) {
                                      break L7;
                                    } else {
                                      if (-2 == (var6_int ^ -1)) {
                                        break L7;
                                      } else {
                                        if (var6_int != 2) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  L8: {
                                    var17 = param1.f((byte) -43);
                                    var8 = param1.f((byte) -61);
                                    var9 = 0;
                                    if (var6_int != 1) {
                                      break L8;
                                    } else {
                                      var9 = param1.i(param3 + -1478490340);
                                      break L8;
                                    }
                                  }
                                  var16_ref.field_i[var5] = var6_int;
                                  var16_ref.field_q[var5] = var9;
                                  var16_ref.field_m[var5] = param2.a((byte) -89, var8, mq.a(var17, (byte) -29));
                                  if (var14 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                L9: {
                                  if ((var6_int ^ -1) == -4) {
                                    break L9;
                                  } else {
                                    if (var6_int != 4) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var19 = param1.f((byte) -32);
                                var20 = param1.f((byte) -55);
                                var9 = param1.g(31365);
                                var10 = new String[var9];
                                var11_int = 0;
                                L10: while (true) {
                                  if (var9 <= var11_int) {
                                    L11: {
                                      L12: {
                                        var21 = new byte[var9][];
                                        var18 = var21;
                                        var11 = var18;
                                        if (-4 == (var6_int ^ -1)) {
                                          var12_int = 0;
                                          L13: while (true) {
                                            if (var9 <= var12_int) {
                                              break L12;
                                            } else {
                                              var13 = param1.i(-1478490344);
                                              array$1 = new byte[var13];
                                              var11[var12_int] = array$1;
                                              param1.a(0, param3 + -6347, var13, var21[var12_int]);
                                              var12_int++;
                                              if (var14 != 0) {
                                                break L11;
                                              } else {
                                                continue L13;
                                              }
                                            }
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var16_ref.field_i[var5] = var6_int;
                                      break L11;
                                    }
                                    var12 = new Class[var9];
                                    var13 = 0;
                                    L14: while (true) {
                                      L15: {
                                        if (var9 <= var13) {
                                          var16_ref.field_l[var5] = param2.a(var12, false, mq.a(var19, (byte) -123), var20);
                                          break L15;
                                        } else {
                                          var12[var13] = mq.a(var10[var13], (byte) -119);
                                          var13++;
                                          if (var14 != 0) {
                                            break L15;
                                          } else {
                                            continue L14;
                                          }
                                        }
                                      }
                                      var16_ref.field_o[var5] = var21;
                                      break L5;
                                    }
                                  } else {
                                    var10[var11_int] = param1.f((byte) -8);
                                    var11_int++;
                                    if (var14 != 0) {
                                      break L5;
                                    } else {
                                      continue L10;
                                    }
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L16: {
                            var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var16_ref.field_g[var5] = -1;
                            decompiledRegionSelector0 = 1;
                            break L16;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L17: {
                            var6_ref = (SecurityException) (Object) decompiledCaughtException;
                            var16_ref.field_g[var5] = -2;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L18: {
                            var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var16_ref.field_g[var5] = -3;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L19: {
                            var6_ref3 = (Exception) (Object) decompiledCaughtException;
                            var16_ref.field_g[var5] = -4;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L20: {
                            var6_ref4 = decompiledCaughtException;
                            var16_ref.field_g[var5] = -5;
                            decompiledRegionSelector0 = 1;
                            break L20;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          var5++;
                          if (var14 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    we.field_k.a(var16_ref, false);
                    stackOut_41_0 = param3;
                    stackIn_42_0 = stackOut_41_0;
                    break L2;
                  }
                  if (stackIn_42_0 == -4) {
                    break L0;
                  } else {
                    var15 = (go) null;
                    bp.a(-51, (k) null, (go) null, 59);
                    return;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L21: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) (var4);
                stackOut_45_1 = new StringBuilder().append("bp.D(").append(param0).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param1 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L21;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L21;
                }
              }
              L22: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param2 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L22;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L22;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (this.a(false, param0) == jq.field_b) {
              stackOut_2_0 = ob.field_z;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != -1276425040) {
                stackOut_6_0 = (String) null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("bp.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_v = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_u = new cj();
    }
}
