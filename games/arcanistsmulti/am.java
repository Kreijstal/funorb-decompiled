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
        qe var4_ref_qe = null;
        int var4 = 0;
        int var5_int = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (qc.field_c != ob.field_eb) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            if (param0 == 26) {
              L0: {
                var2_long = qj.b(-26572);
                if (ob.field_ab == 0) {
                  break L0;
                } else {
                  if (so.field_d < 0) {
                    var4_ref_qe = (qe) (Object) uf.field_a.b(12623);
                    if (var4_ref_qe == null) {
                      break L0;
                    } else {
                      if (var4_ref_qe.field_q >= var2_long) {
                        break L0;
                      } else {
                        var4_ref_qe.a(true);
                        fj.field_h = var4_ref_qe.field_k.length;
                        df.field_z.field_g = 0;
                        var5_int = 0;
                        L1: while (true) {
                          if (var5_int >= fj.field_h) {
                            ve.field_m = nf.field_W;
                            nf.field_W = se.field_I;
                            se.field_I = on.field_g;
                            on.field_g = var4_ref_qe.field_g;
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          } else {
                            df.field_z.field_j[var5_int] = var4_ref_qe.field_k[var5_int];
                            var5_int++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (0 <= so.field_d) {
                    break L3;
                  } else {
                    df.field_z.field_g = 0;
                    if (pe.a((byte) -86, 1)) {
                      so.field_d = df.field_z.g((byte) 62);
                      df.field_z.field_g = 0;
                      fj.field_h = param1[so.field_d];
                      break L3;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0 != 0;
                    }
                  }
                }
                if (pn.b(-12564)) {
                  if (ob.field_ab != 0) {
                    L4: {
                      var4 = ob.field_ab;
                      if (0.0 == hb.field_Cb) {
                        break L4;
                      } else {
                        var4 = (int)((double)var4 + ag.field_D.nextGaussian() * hb.field_Cb);
                        if (var4 < 0) {
                          var4 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5 = new qe(var2_long + (long)var4, so.field_d, new byte[fj.field_h]);
                    var6 = 0;
                    L5: while (true) {
                      if (fj.field_h <= var6) {
                        uf.field_a.b((pg) (Object) var5, -1);
                        so.field_d = -1;
                        continue L2;
                      } else {
                        var5.field_k[var6] = df.field_z.field_j[var6];
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    ve.field_m = nf.field_W;
                    nf.field_W = se.field_I;
                    se.field_I = on.field_g;
                    on.field_g = so.field_d;
                    so.field_d = -1;
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            } else {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("am.B(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L6;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
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
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0) {
        if (!(qe.field_p)) {
            throw new IllegalStateException();
        }
        lh.field_n = true;
        tj.a(false, (byte) -106);
        fj.field_j = 0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var4 = param1 >> 31;
          param1 = param1 - -var4 ^ var4;
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
                      stackOut_46_0 = gj.field_g[param1 >> 22] << var3 + -1;
                      stackIn_47_0 = stackOut_46_0;
                      break L7;
                    } else {
                      stackOut_45_0 = gj.field_g[param1 >> 22] >> -var3 + 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L7;
                    }
                  }
                  return stackIn_47_0;
                }
              } else {
                if (param1 < 67108864) {
                  L8: {
                    if (var3 < 3) {
                      stackOut_41_0 = gj.field_g[param1 >> 18] >> 3 - var3;
                      stackIn_42_0 = stackOut_41_0;
                      break L8;
                    } else {
                      stackOut_40_0 = gj.field_g[param1 >> 18] << var3 - 3;
                      stackIn_42_0 = stackOut_40_0;
                      break L8;
                    }
                  }
                  return stackIn_42_0;
                } else {
                  L9: {
                    if (var3 >= 2) {
                      stackOut_37_0 = gj.field_g[param1 >> 20] << -2 + var3;
                      stackIn_38_0 = stackOut_37_0;
                      break L9;
                    } else {
                      stackOut_36_0 = gj.field_g[param1 >> 20] >> -var3 + 2;
                      stackIn_38_0 = stackOut_36_0;
                      break L9;
                    }
                  }
                  return stackIn_38_0;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Always fire at medium power; just point and click.";
        field_a = "Show chat (1 unread message)";
    }
}
