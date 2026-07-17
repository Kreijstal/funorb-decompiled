/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_a;
    static String field_b;
    static kc field_c;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        Object var4_ref = null;
        qe var4_ref_qe = null;
        int var4 = 0;
        int var5_int = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var4_ref = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (qc.field_c != ob.field_eb) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          } else {
            L0: {
              L1: {
                var2_long = qj.b(-26572);
                if (ob.field_ab == 0) {
                  break L1;
                } else {
                  if (so.field_d < 0) {
                    L2: {
                      var4_ref_qe = (qe) (Object) uf.field_a.b(12623);
                      if (var4_ref_qe == null) {
                        break L2;
                      } else {
                        if (var4_ref_qe.field_q >= var2_long) {
                          break L2;
                        } else {
                          var4_ref_qe.a(true);
                          fj.field_h = var4_ref_qe.field_k.length;
                          df.field_z.field_g = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= fj.field_h) {
                              ve.field_m = nf.field_W;
                              nf.field_W = se.field_I;
                              se.field_I = on.field_g;
                              on.field_g = var4_ref_qe.field_g;
                              stackOut_19_0 = 1;
                              stackIn_20_0 = stackOut_19_0;
                              return stackIn_20_0 != 0;
                            } else {
                              df.field_z.field_j[var5_int] = var4_ref_qe.field_k[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_23_0 = 0;
                    stackIn_26_0 = stackOut_23_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_21_0 = 0;
              stackIn_26_0 = stackOut_21_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_26_0 <= so.field_d) {
                  break L5;
                } else {
                  df.field_z.field_g = 0;
                  if (pe.a((byte) -86, 1)) {
                    so.field_d = df.field_z.g((byte) 62);
                    df.field_z.field_g = 0;
                    fj.field_h = param1[so.field_d];
                    break L5;
                  } else {
                    return false;
                  }
                }
              }
              if (pn.b(-12564)) {
                if (ob.field_ab != 0) {
                  L6: {
                    var4 = ob.field_ab;
                    if (0.0 == hb.field_Cb) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + ag.field_D.nextGaussian() * hb.field_Cb);
                      if (var4 < 0) {
                        var4 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = new qe(var2_long + (long)var4, so.field_d, new byte[fj.field_h]);
                  var6 = 0;
                  L7: while (true) {
                    if (fj.field_h <= var6) {
                      uf.field_a.b((pg) (Object) var5, -1);
                      so.field_d = -1;
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      continue L4;
                    } else {
                      var5.field_k[var6] = df.field_z.field_j[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  ve.field_m = nf.field_W;
                  nf.field_W = se.field_I;
                  se.field_I = on.field_g;
                  on.field_g = so.field_d;
                  so.field_d = -1;
                  stackOut_35_0 = 1;
                  stackIn_36_0 = stackOut_35_0;
                  return stackIn_36_0 != 0;
                }
              } else {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                return stackIn_33_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var2;
            stackOut_47_1 = new StringBuilder().append("am.B(").append(26).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = -128 % ((param0 - 17) / 52);
            if (this == (Object) (Object) co.field_h) {
              break L1;
            } else {
              if (this == (Object) (Object) bb.field_c) {
                break L1;
              } else {
                if (this != (Object) (Object) qc.field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_7_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void a() {
        if (!qe.field_p) {
          throw new IllegalStateException();
        } else {
          lh.field_n = true;
          tj.a(false, (byte) -106);
          fj.field_j = 0;
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        var4 = param1 >> 31;
        param1 = param1 - -var4 ^ var4;
        if (!param2) {
          L0: {
            var4 = param0 >> 31;
            param0 = param0 + var4 ^ var4;
            if (~param0 >= ~param1) {
              break L0;
            } else {
              var4 = param1;
              param1 = param0;
              param0 = var4;
              break L0;
            }
          }
          L1: {
            var3 = 0;
            if (param1 < 32768) {
              break L1;
            } else {
              L2: {
                if (1073741824 <= param1) {
                  var3 += 16;
                  param1 = param1 >> 16;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 >= 4194304) {
                  param1 = param1 >> 8;
                  var3 += 8;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 < 262144) {
                  break L4;
                } else {
                  param1 = param1 >> 4;
                  var3 += 4;
                  break L4;
                }
              }
              L5: {
                if (param1 >= 65536) {
                  var3 += 2;
                  param1 = param1 >> 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param1 >= 32768) {
                  param1 = param1 >> 1;
                  var3++;
                  break L6;
                } else {
                  break L6;
                }
              }
              param0 = param0 >> var3;
              break L1;
            }
          }
          if (~param1 >= ~(param0 << 5)) {
            param1 = param1 * param1 + param0 * param0;
            if (param1 >= 65536) {
              if (param1 < 16777216) {
                if (param1 >= 1048576) {
                  if (param1 >= 4194304) {
                    return gj.field_g[param1 >> 16] >> 4;
                  } else {
                    return gj.field_g[param1 >> 14] >> 5;
                  }
                } else {
                  if (param1 < 262144) {
                    return gj.field_g[param1 >> 10] >> 7;
                  } else {
                    return gj.field_g[param1 >> 12] >> 6;
                  }
                }
              } else {
                if (param1 >= 268435456) {
                  if (1073741824 <= param1) {
                    return gj.field_g[param1 >> 24] << var3;
                  } else {
                    L7: {
                      if (var3 >= 1) {
                        stackOut_69_0 = gj.field_g[param1 >> 22] << var3 + -1;
                        stackIn_70_0 = stackOut_69_0;
                        break L7;
                      } else {
                        stackOut_67_0 = gj.field_g[param1 >> 22] >> -var3 + 1;
                        stackIn_70_0 = stackOut_67_0;
                        break L7;
                      }
                    }
                    return stackIn_70_0;
                  }
                } else {
                  if (param1 < 67108864) {
                    L8: {
                      if (var3 < 3) {
                        stackOut_61_0 = gj.field_g[param1 >> 18] >> 3 - var3;
                        stackIn_62_0 = stackOut_61_0;
                        break L8;
                      } else {
                        stackOut_59_0 = gj.field_g[param1 >> 18] << var3 - 3;
                        stackIn_62_0 = stackOut_59_0;
                        break L8;
                      }
                    }
                    return stackIn_62_0;
                  } else {
                    L9: {
                      if (var3 >= 2) {
                        stackOut_56_0 = gj.field_g[param1 >> 20] << -2 + var3;
                        stackIn_57_0 = stackOut_56_0;
                        break L9;
                      } else {
                        stackOut_54_0 = gj.field_g[param1 >> 20] >> -var3 + 2;
                        stackIn_57_0 = stackOut_54_0;
                        break L9;
                      }
                    }
                    return stackIn_57_0;
                  }
                }
              }
            } else {
              if (256 > param1) {
                if (0 > param1) {
                  return -1;
                } else {
                  return gj.field_g[param1] >> 12;
                }
              } else {
                if (param1 >= 4096) {
                  if (16384 <= param1) {
                    return gj.field_g[param1 >> 8] >> 8;
                  } else {
                    return gj.field_g[param1 >> 6] >> 9;
                  }
                } else {
                  if (param1 < 1024) {
                    return gj.field_g[param1 >> 2] >> 11;
                  } else {
                    return gj.field_g[param1 >> 4] >> 10;
                  }
                }
              }
            }
          } else {
            return param1 << var3;
          }
        } else {
          return -23;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Always fire at medium power; just point and click.";
        field_a = "Show chat (1 unread message)";
    }
}
