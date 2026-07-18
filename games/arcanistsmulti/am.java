/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_a;
    static String field_b;
    static kc field_c;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_a = null;
              if (!param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "am.A(" + param0 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "am.toString()");
        }
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        boolean stackIn_32_0 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_39_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_35_0 = 0;
        boolean stackOut_38_0 = false;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (qc.field_c != ob.field_eb) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
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
                          L2: {
                            L3: {
                              if (~var5_int <= ~fj.field_h) {
                                break L3;
                              } else {
                                df.field_z.field_j[var5_int] = var4_ref_qe.field_k[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L2;
                                } else {
                                  if (var7 == 0) {
                                    continue L1;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                            ve.field_m = nf.field_W;
                            nf.field_W = se.field_I;
                            se.field_I = on.field_g;
                            on.field_g = var4_ref_qe.field_g;
                            break L2;
                          }
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (0 <= so.field_d) {
                      break L6;
                    } else {
                      df.field_z.field_g = 0;
                      stackOut_29_0 = pe.a((byte) -86, 1);
                      stackIn_39_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        stackOut_30_0 = stackIn_30_0;
                        stackIn_32_0 = stackOut_30_0;
                        if (stackIn_32_0) {
                          so.field_d = df.field_z.g((byte) 62);
                          df.field_z.field_g = 0;
                          fj.field_h = param1[so.field_d];
                          break L6;
                        } else {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          return stackIn_36_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_38_0 = pn.b(-12564);
                  stackIn_39_0 = stackOut_38_0;
                  break L5;
                }
                if (stackIn_39_0) {
                  if (ob.field_ab != 0) {
                    L7: {
                      var4 = ob.field_ab;
                      if (0.0 == hb.field_Cb) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + ag.field_D.nextGaussian() * hb.field_Cb);
                        if (var4 < 0) {
                          var4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var5 = new qe(var2_long + (long)var4, so.field_d, new byte[fj.field_h]);
                    var6 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (fj.field_h <= var6) {
                            break L10;
                          } else {
                            var5.field_k[var6] = df.field_z.field_j[var6];
                            var6++;
                            if (var7 != 0) {
                              break L9;
                            } else {
                              if (var7 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        uf.field_a.b((pg) (Object) var5, -1);
                        so.field_d = -1;
                        break L9;
                      }
                      continue L4;
                    }
                  } else {
                    ve.field_m = nf.field_W;
                    nf.field_W = se.field_I;
                    se.field_I = on.field_g;
                    on.field_g = so.field_d;
                    so.field_d = -1;
                    stackOut_43_0 = 1;
                    stackIn_44_0 = stackOut_43_0;
                    return stackIn_44_0 != 0;
                  }
                } else {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  return stackIn_41_0 != 0;
                }
              }
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var2;
            stackOut_58_1 = new StringBuilder().append("am.B(").append(param0).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L11;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -128 % ((param0 - 17) / 52);
                if (this == (Object) (Object) co.field_h) {
                  break L2;
                } else {
                  if (this == (Object) (Object) bb.field_c) {
                    break L2;
                  } else {
                    if (this != (Object) (Object) qc.field_c) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "am.D(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!qe.field_p) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 == 3020) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              lh.field_n = true;
              tj.a(false, (byte) -106);
              fj.field_j = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "am.C(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var4 = param1 >> -1102712353;
            param1 = param1 - -var4 ^ var4;
            if (!param2) {
              L1: {
                var4 = param0 >> 241898175;
                param0 = param0 + var4 ^ var4;
                if (~param0 >= ~param1) {
                  break L1;
                } else {
                  var4 = param1;
                  param1 = param0;
                  param0 = var4;
                  break L1;
                }
              }
              L2: {
                var3_int = 0;
                if (param1 < 32768) {
                  break L2;
                } else {
                  L3: {
                    if (1073741824 <= param1) {
                      var3_int += 16;
                      param1 = param1 >> 16;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param1 >= 4194304) {
                      param1 = param1 >> 8;
                      var3_int += 8;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (param1 < 262144) {
                      break L5;
                    } else {
                      param1 = param1 >> 4;
                      var3_int += 4;
                      break L5;
                    }
                  }
                  L6: {
                    if (param1 >= 65536) {
                      var3_int += 2;
                      param1 = param1 >> 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (param1 >= 32768) {
                      param1 = param1 >> 1;
                      var3_int++;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  param0 = param0 >> var3_int;
                  break L2;
                }
              }
              if (~param1 >= ~(param0 << -1893384027)) {
                param1 = param1 * param1 + param0 * param0;
                if (param1 >= 65536) {
                  if (param1 < 16777216) {
                    if (param1 >= 1048576) {
                      if (param1 >= 4194304) {
                        stackOut_94_0 = gj.field_g[param1 >> -1275338928] >> -1109693596;
                        stackIn_95_0 = stackOut_94_0;
                        break L0;
                      } else {
                        stackOut_92_0 = gj.field_g[param1 >> 1944815982] >> 563869829;
                        stackIn_93_0 = stackOut_92_0;
                        return stackIn_93_0;
                      }
                    } else {
                      if (param1 < 262144) {
                        stackOut_89_0 = gj.field_g[param1 >> 2052215082] >> 1307515687;
                        stackIn_90_0 = stackOut_89_0;
                        return stackIn_90_0;
                      } else {
                        stackOut_87_0 = gj.field_g[param1 >> 1717579596] >> 1088704902;
                        stackIn_88_0 = stackOut_87_0;
                        return stackIn_88_0;
                      }
                    }
                  } else {
                    if (param1 >= 268435456) {
                      if (1073741824 <= param1) {
                        stackOut_81_0 = gj.field_g[param1 >> -1559587176] << var3_int;
                        stackIn_82_0 = stackOut_81_0;
                        return stackIn_82_0;
                      } else {
                        L8: {
                          if (var3_int >= 1) {
                            stackOut_79_0 = gj.field_g[param1 >> 549846230] << var3_int + -1;
                            stackIn_80_0 = stackOut_79_0;
                            break L8;
                          } else {
                            stackOut_77_0 = gj.field_g[param1 >> -579115018] >> -var3_int + 1;
                            stackIn_80_0 = stackOut_77_0;
                            break L8;
                          }
                        }
                        return stackIn_80_0;
                      }
                    } else {
                      if (param1 < 67108864) {
                        L9: {
                          if (var3_int < 3) {
                            stackOut_71_0 = gj.field_g[param1 >> -2119657294] >> 3 - var3_int;
                            stackIn_72_0 = stackOut_71_0;
                            break L9;
                          } else {
                            stackOut_69_0 = gj.field_g[param1 >> -2121922542] << var3_int - 3;
                            stackIn_72_0 = stackOut_69_0;
                            break L9;
                          }
                        }
                        return stackIn_72_0;
                      } else {
                        L10: {
                          if (var3_int >= 2) {
                            stackOut_66_0 = gj.field_g[param1 >> -1134007724] << -2 + var3_int;
                            stackIn_67_0 = stackOut_66_0;
                            break L10;
                          } else {
                            stackOut_64_0 = gj.field_g[param1 >> 291504116] >> -var3_int + 2;
                            stackIn_67_0 = stackOut_64_0;
                            break L10;
                          }
                        }
                        return stackIn_67_0;
                      }
                    }
                  }
                } else {
                  if (256 > param1) {
                    if (0 > param1) {
                      stackOut_52_0 = -1;
                      stackIn_53_0 = stackOut_52_0;
                      return stackIn_53_0;
                    } else {
                      stackOut_50_0 = gj.field_g[param1] >> -902353972;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0;
                    }
                  } else {
                    if (param1 >= 4096) {
                      if (16384 <= param1) {
                        stackOut_47_0 = gj.field_g[param1 >> -593633432] >> 627695208;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0;
                      } else {
                        stackOut_45_0 = gj.field_g[param1 >> 2143142662] >> 52046441;
                        stackIn_46_0 = stackOut_45_0;
                        return stackIn_46_0;
                      }
                    } else {
                      if (param1 < 1024) {
                        stackOut_42_0 = gj.field_g[param1 >> 1920063330] >> 454719115;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0;
                      } else {
                        stackOut_40_0 = gj.field_g[param1 >> 349370916] >> 1910767434;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0;
                      }
                    }
                  }
                }
              } else {
                stackOut_28_0 = param1 << var3_int;
                stackIn_29_0 = stackOut_28_0;
                return stackIn_29_0;
              }
            } else {
              stackOut_1_0 = -23;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "am.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_95_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Always fire at medium power; just point and click.";
        field_a = "Show chat (1 unread message)";
    }
}
