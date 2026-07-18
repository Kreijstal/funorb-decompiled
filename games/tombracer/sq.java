/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends cg {
    private int[] field_t;
    l field_y;
    private l field_k;
    private int field_r;
    l field_n;
    private int field_m;
    static String field_x;
    private l field_l;
    private qua field_u;
    private boolean field_q;
    private qua field_w;
    private int[] field_o;
    private boolean field_p;
    private int field_s;
    private int field_j;
    private qua field_v;

    final cg b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, int param3, boolean param4, qua param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        l stackIn_41_0 = null;
        qua stackIn_41_1 = null;
        l stackIn_42_0 = null;
        qua stackIn_42_1 = null;
        l stackIn_43_0 = null;
        qua stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        l stackIn_50_0 = null;
        qua stackIn_50_1 = null;
        l stackIn_51_0 = null;
        qua stackIn_51_1 = null;
        l stackIn_52_0 = null;
        qua stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        l stackOut_49_0 = null;
        qua stackOut_49_1 = null;
        l stackOut_51_0 = null;
        qua stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        l stackOut_50_0 = null;
        qua stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        l stackOut_40_0 = null;
        qua stackOut_40_1 = null;
        l stackOut_42_0 = null;
        qua stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        l stackOut_41_0 = null;
        qua stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((sq) this).field_q) {
                break L1;
              } else {
                if (param4) {
                  L2: {
                    if (((sq) this).field_m <= 0) {
                      L3: {
                        if (((sq) this).field_w != null) {
                          ((sq) this).field_l.b(2);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((sq) this).field_w = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        ((sq) this).field_l.a(param5, false, (byte) 80);
                        this.a(1048576, param3, param0, ((sq) this).field_l);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != ((sq) this).field_u) {
                          ((sq) this).field_y.b(param2 ^ -42);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((sq) this).field_u = param5;
                      if (param5 != null) {
                        ((sq) this).field_y.a(param5, false, (byte) 80);
                        this.a(1048576, param3, param0, ((sq) this).field_y);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param4) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            ((sq) this).field_q = stackIn_20_1 != 0;
            if (param5 == ((sq) this).field_u) {
              ((sq) this).field_m = param1;
              this.a(1048576, param3, param0, ((sq) this).field_y);
              return;
            } else {
              if (param5 != ((sq) this).field_w) {
                L6: {
                  if (((sq) this).field_u == null) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (null != ((sq) this).field_w) {
                      L7: {
                        if (((sq) this).field_r >= 524288) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L7;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_32_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var7_int != 0) {
                    L9: {
                      if (((sq) this).field_u != null) {
                        ((sq) this).field_y.b(param2 + 46);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      ((sq) this).field_u = param5;
                      if (param5 == null) {
                        break L10;
                      } else {
                        L11: {
                          stackOut_49_0 = ((sq) this).field_y;
                          stackOut_49_1 = (qua) param5;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (param4) {
                            stackOut_51_0 = (l) (Object) stackIn_51_0;
                            stackOut_51_1 = (qua) (Object) stackIn_51_1;
                            stackOut_51_2 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L11;
                          } else {
                            stackOut_50_0 = (l) (Object) stackIn_50_0;
                            stackOut_50_1 = (qua) (Object) stackIn_50_1;
                            stackOut_50_2 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            stackIn_52_2 = stackOut_50_2;
                            break L11;
                          }
                        }
                        ((l) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2 != 0, (byte) 80);
                        this.a(1048576, param3, param0, ((sq) this).field_y);
                        break L10;
                      }
                    }
                    ((sq) this).field_m = param1;
                    break L8;
                  } else {
                    L12: {
                      if (null != ((sq) this).field_w) {
                        ((sq) this).field_l.b(2);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      ((sq) this).field_w = param5;
                      if (param5 != null) {
                        L14: {
                          stackOut_40_0 = ((sq) this).field_l;
                          stackOut_40_1 = (qua) param5;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          if (param4) {
                            stackOut_42_0 = (l) (Object) stackIn_42_0;
                            stackOut_42_1 = (qua) (Object) stackIn_42_1;
                            stackOut_42_2 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            stackIn_43_2 = stackOut_42_2;
                            break L14;
                          } else {
                            stackOut_41_0 = (l) (Object) stackIn_41_0;
                            stackOut_41_1 = (qua) (Object) stackIn_41_1;
                            stackOut_41_2 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            break L14;
                          }
                        }
                        ((l) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2 != 0, (byte) 80);
                        this.a(1048576, param3, param0, ((sq) this).field_l);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((sq) this).field_m = -param1;
                    break L8;
                  }
                }
                if (param2 == -44) {
                  break L0;
                } else {
                  ((sq) this).field_u = null;
                  return;
                }
              } else {
                ((sq) this).field_m = -param1;
                this.a(1048576, param3, param0, ((sq) this).field_l);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var7;
            stackOut_57_1 = new StringBuilder().append("sq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param5 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L15;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_x = null;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((sq) this).field_s > 0) {
              L1: {
                if (((sq) this).field_q) {
                  L2: {
                    if (((sq) this).field_m <= 0) {
                      break L2;
                    } else {
                      if (!((sq) this).field_y.a((byte) -72)) {
                        ((sq) this).field_q = false;
                        ((sq) this).field_m = -((sq) this).field_m;
                        ((sq) this).field_u = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((sq) this).field_m >= 0) {
                    break L1;
                  } else {
                    if (!((sq) this).field_l.a((byte) -117)) {
                      ((sq) this).field_q = false;
                      ((sq) this).field_w = null;
                      ((sq) this).field_m = -((sq) this).field_m;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (((sq) this).field_r >> 12) * ((sq) this).field_s / 256;
                var5 = -var4_int + ((sq) this).field_s;
                if (0 != ((sq) this).field_m) {
                  ((sq) this).field_r = ((sq) this).field_r + param2 * ((sq) this).field_m;
                  if (((sq) this).field_r < 1048576) {
                    if (((sq) this).field_r <= 0) {
                      ((sq) this).field_r = 0;
                      if (((sq) this).field_q) {
                        break L3;
                      } else {
                        ((sq) this).field_m = 0;
                        if (!((sq) this).field_p) {
                          L4: {
                            if (((sq) this).field_u != null) {
                              ((sq) this).field_y.b(2);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((sq) this).field_u = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((sq) this).field_r = 1048576;
                    if (!((sq) this).field_q) {
                      ((sq) this).field_m = 0;
                      if (((sq) this).field_p) {
                        break L3;
                      } else {
                        L5: {
                          if (null == ((sq) this).field_w) {
                            break L5;
                          } else {
                            ((sq) this).field_l.b(2);
                            break L5;
                          }
                        }
                        ((sq) this).field_w = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!kta.field_h) {
                  stackOut_34_0 = param2;
                  stackIn_35_0 = stackOut_34_0;
                  break L6;
                } else {
                  stackOut_33_0 = param2 << 1;
                  stackIn_35_0 = stackOut_33_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (256 <= ((sq) this).field_j) {
                  break L7;
                } else {
                  L8: {
                    if (null != ((sq) this).field_u) {
                      break L8;
                    } else {
                      if (((sq) this).field_w == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((sq) this).field_y.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 == 256) {
                      ((sq) this).field_l.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((sq) this).field_t == null) {
                            break L10;
                          } else {
                            if (((sq) this).field_t.length >= var6) {
                              lua.a(((sq) this).field_t, 0, var6);
                              lua.a(((sq) this).field_o, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((sq) this).field_o = new int[var6];
                        ((sq) this).field_t = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((sq) this).field_y.b(((sq) this).field_t, 0, param2);
                        ((sq) this).field_l.b(((sq) this).field_o, 0, param2);
                        if (!kta.field_h) {
                          stackOut_48_0 = param1;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_47_0 = param1 << 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var4_int * ((sq) this).field_t[var8] - -(var5 * ((sq) this).field_o[var8]) >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (((sq) this).field_v == null) {
                  break L13;
                } else {
                  if (((sq) this).field_j != 0) {
                    L14: {
                      L15: {
                        if (((sq) this).field_t == null) {
                          break L15;
                        } else {
                          if (((sq) this).field_t.length >= var6) {
                            lua.a(((sq) this).field_t, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((sq) this).field_t = new int[var6];
                      ((sq) this).field_o = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((sq) this).field_k.b(((sq) this).field_t, 0, param2);
                      if (kta.field_h) {
                        param1 = param1 << 1;
                        stackOut_64_0 = param1 << 1;
                        stackIn_65_0 = stackOut_64_0;
                        break L16;
                      } else {
                        stackOut_63_0 = param1;
                        stackIn_65_0 = stackOut_63_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_65_0;
                    var8 = ((sq) this).field_j * ((sq) this).field_s / 256;
                    var9 = -var8 + ((sq) this).field_s;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = param0[var10 + var7] * var9 + ((sq) this).field_t[var10] * var8 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            } else {
              ((sq) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var4;
            stackOut_69_1 = new StringBuilder().append("sq.D(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(l param0, l param1, int param2) {
        try {
            ((sq) this).field_l = param0;
            ((sq) this).field_y = param1;
            ((sq) this).field_r = 1048576;
            ((sq) this).field_n = ((sq) this).field_y;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sq.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 1048576 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -94) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = sq.a(59, (byte[]) null, (byte) -100);
                break L1;
              }
            }
            stackOut_2_0 = aia.a(param1, param0, 71, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sq.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(byte param0, int param1) {
        int var3 = -104 / ((-2 - param0) / 53);
        ((sq) this).field_s = param1;
    }

    private final void a(int param0, int param1, int param2, l param3) {
        try {
            ((sq) this).field_n = param3;
            param3.a((byte) -105, param2, -1);
            param3.a(param1, (byte) 55);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sq.A(" + 1048576 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final cg c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (0 < ((sq) this).field_r) {
          if (((sq) this).field_u != null) {
            L0: {
              ((sq) this).field_y.a(param0);
              if (((sq) this).field_r >= 1048576) {
                break L0;
              } else {
                if (((sq) this).field_w == null) {
                  break L0;
                } else {
                  ((sq) this).field_l.a(param0);
                  break L0;
                }
              }
            }
            L1: {
              if (((sq) this).field_j <= 0) {
                break L1;
              } else {
                if (null != ((sq) this).field_v) {
                  ((sq) this).field_k.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (((sq) this).field_q) {
              L2: {
                if (((sq) this).field_m <= 0) {
                  break L2;
                } else {
                  if (!((sq) this).field_y.a((byte) -91)) {
                    ((sq) this).field_m = -((sq) this).field_m;
                    ((sq) this).field_q = false;
                    ((sq) this).field_u = null;
                    if (((sq) this).field_m != 0) {
                      L3: {
                        ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                        if (((sq) this).field_r < 1048576) {
                          if (((sq) this).field_r > 0) {
                            break L3;
                          } else {
                            ((sq) this).field_r = 0;
                            if (((sq) this).field_q) {
                              break L3;
                            } else {
                              ((sq) this).field_m = 0;
                              if (!((sq) this).field_p) {
                                L4: {
                                  if (null != ((sq) this).field_u) {
                                    ((sq) this).field_y.b(2);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                ((sq) this).field_u = null;
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          ((sq) this).field_r = 1048576;
                          if (((sq) this).field_q) {
                            break L3;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L5: {
                                if (((sq) this).field_w != null) {
                                  ((sq) this).field_l.b(2);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              ((sq) this).field_w = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (((sq) this).field_m < 0) {
                if (!((sq) this).field_l.a((byte) -127)) {
                  ((sq) this).field_q = false;
                  ((sq) this).field_m = -((sq) this).field_m;
                  ((sq) this).field_w = null;
                  if (((sq) this).field_m != 0) {
                    L6: {
                      ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                      if (((sq) this).field_r < 1048576) {
                        if (((sq) this).field_r > 0) {
                          break L6;
                        } else {
                          ((sq) this).field_r = 0;
                          if (((sq) this).field_q) {
                            break L6;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L7: {
                                if (null != ((sq) this).field_u) {
                                  ((sq) this).field_y.b(2);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              ((sq) this).field_u = null;
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        ((sq) this).field_r = 1048576;
                        if (((sq) this).field_q) {
                          break L6;
                        } else {
                          ((sq) this).field_m = 0;
                          if (!((sq) this).field_p) {
                            L8: {
                              if (((sq) this).field_w != null) {
                                ((sq) this).field_l.b(2);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            ((sq) this).field_w = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((sq) this).field_m != 0) {
                    L9: {
                      ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                      if (((sq) this).field_r < 1048576) {
                        if (((sq) this).field_r > 0) {
                          break L9;
                        } else {
                          ((sq) this).field_r = 0;
                          if (((sq) this).field_q) {
                            break L9;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L10: {
                                if (null != ((sq) this).field_u) {
                                  ((sq) this).field_y.b(2);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              ((sq) this).field_u = null;
                              break L9;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        ((sq) this).field_r = 1048576;
                        if (((sq) this).field_q) {
                          break L9;
                        } else {
                          ((sq) this).field_m = 0;
                          if (!((sq) this).field_p) {
                            L11: {
                              if (((sq) this).field_w != null) {
                                ((sq) this).field_l.b(2);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            ((sq) this).field_w = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (((sq) this).field_m != 0) {
                  ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                  if (((sq) this).field_r < 1048576) {
                    if (((sq) this).field_r <= 0) {
                      ((sq) this).field_r = 0;
                      if (!((sq) this).field_q) {
                        ((sq) this).field_m = 0;
                        if (((sq) this).field_p) {
                          return;
                        } else {
                          L12: {
                            if (null != ((sq) this).field_u) {
                              ((sq) this).field_y.b(2);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ((sq) this).field_u = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((sq) this).field_r = 1048576;
                    if (!((sq) this).field_q) {
                      ((sq) this).field_m = 0;
                      if (!((sq) this).field_p) {
                        L13: {
                          if (((sq) this).field_w != null) {
                            ((sq) this).field_l.b(2);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        ((sq) this).field_w = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (((sq) this).field_m != 0) {
                L14: {
                  ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                  if (((sq) this).field_r < 1048576) {
                    if (((sq) this).field_r > 0) {
                      break L14;
                    } else {
                      ((sq) this).field_r = 0;
                      if (((sq) this).field_q) {
                        break L14;
                      } else {
                        ((sq) this).field_m = 0;
                        if (!((sq) this).field_p) {
                          L15: {
                            if (null != ((sq) this).field_u) {
                              ((sq) this).field_y.b(2);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          ((sq) this).field_u = null;
                          break L14;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    ((sq) this).field_r = 1048576;
                    if (((sq) this).field_q) {
                      break L14;
                    } else {
                      ((sq) this).field_m = 0;
                      if (!((sq) this).field_p) {
                        L16: {
                          if (((sq) this).field_w != null) {
                            ((sq) this).field_l.b(2);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        ((sq) this).field_w = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            L17: {
              if (((sq) this).field_r >= 1048576) {
                break L17;
              } else {
                if (((sq) this).field_w == null) {
                  break L17;
                } else {
                  ((sq) this).field_l.a(param0);
                  break L17;
                }
              }
            }
            L18: {
              if (((sq) this).field_j <= 0) {
                break L18;
              } else {
                if (null != ((sq) this).field_v) {
                  ((sq) this).field_k.a(param0);
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (((sq) this).field_q) {
                L20: {
                  if (((sq) this).field_m <= 0) {
                    break L20;
                  } else {
                    if (((sq) this).field_y.a((byte) -91)) {
                      break L20;
                    } else {
                      L21: {
                        ((sq) this).field_m = -((sq) this).field_m;
                        ((sq) this).field_q = false;
                        ((sq) this).field_u = null;
                        if (((sq) this).field_m != 0) {
                          ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                          if (((sq) this).field_r < 1048576) {
                            if (((sq) this).field_r > 0) {
                              break L21;
                            } else {
                              ((sq) this).field_r = 0;
                              if (((sq) this).field_q) {
                                break L21;
                              } else {
                                ((sq) this).field_m = 0;
                                if (!((sq) this).field_p) {
                                  L22: {
                                    if (null != ((sq) this).field_u) {
                                      ((sq) this).field_y.b(2);
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  ((sq) this).field_u = null;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          } else {
                            ((sq) this).field_r = 1048576;
                            if (((sq) this).field_q) {
                              break L21;
                            } else {
                              ((sq) this).field_m = 0;
                              if (!((sq) this).field_p) {
                                L23: {
                                  if (((sq) this).field_w != null) {
                                    ((sq) this).field_l.b(2);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                ((sq) this).field_w = null;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        } else {
                          break L21;
                        }
                      }
                      return;
                    }
                  }
                }
                if (((sq) this).field_m >= 0) {
                  break L19;
                } else {
                  if (((sq) this).field_l.a((byte) -127)) {
                    break L19;
                  } else {
                    L24: {
                      ((sq) this).field_q = false;
                      ((sq) this).field_m = -((sq) this).field_m;
                      ((sq) this).field_w = null;
                      if (((sq) this).field_m != 0) {
                        ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                        if (((sq) this).field_r < 1048576) {
                          if (((sq) this).field_r > 0) {
                            break L24;
                          } else {
                            ((sq) this).field_r = 0;
                            if (((sq) this).field_q) {
                              break L24;
                            } else {
                              ((sq) this).field_m = 0;
                              if (!((sq) this).field_p) {
                                L25: {
                                  if (null != ((sq) this).field_u) {
                                    ((sq) this).field_y.b(2);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                ((sq) this).field_u = null;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                          }
                        } else {
                          ((sq) this).field_r = 1048576;
                          if (((sq) this).field_q) {
                            break L24;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L26: {
                                if (((sq) this).field_w != null) {
                                  ((sq) this).field_l.b(2);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              ((sq) this).field_w = null;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L19;
              }
            }
            if (((sq) this).field_m != 0) {
              ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
              if (((sq) this).field_r < 1048576) {
                if (((sq) this).field_r <= 0) {
                  ((sq) this).field_r = 0;
                  if (!((sq) this).field_q) {
                    ((sq) this).field_m = 0;
                    if (!((sq) this).field_p) {
                      L27: {
                        if (null != ((sq) this).field_u) {
                          ((sq) this).field_y.b(2);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      ((sq) this).field_u = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((sq) this).field_r = 1048576;
                if (!((sq) this).field_q) {
                  ((sq) this).field_m = 0;
                  if (!((sq) this).field_p) {
                    L28: {
                      if (((sq) this).field_w != null) {
                        ((sq) this).field_l.b(2);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((sq) this).field_w = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L29: {
            if (((sq) this).field_r >= 1048576) {
              break L29;
            } else {
              if (((sq) this).field_w == null) {
                break L29;
              } else {
                ((sq) this).field_l.a(param0);
                break L29;
              }
            }
          }
          L30: {
            if (((sq) this).field_j <= 0) {
              break L30;
            } else {
              if (null != ((sq) this).field_v) {
                ((sq) this).field_k.a(param0);
                break L30;
              } else {
                break L30;
              }
            }
          }
          L31: {
            if (((sq) this).field_q) {
              L32: {
                if (((sq) this).field_m <= 0) {
                  break L32;
                } else {
                  if (((sq) this).field_y.a((byte) -91)) {
                    break L32;
                  } else {
                    L33: {
                      ((sq) this).field_m = -((sq) this).field_m;
                      ((sq) this).field_q = false;
                      ((sq) this).field_u = null;
                      if (((sq) this).field_m != 0) {
                        ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                        if (((sq) this).field_r < 1048576) {
                          if (((sq) this).field_r > 0) {
                            break L33;
                          } else {
                            ((sq) this).field_r = 0;
                            if (((sq) this).field_q) {
                              break L33;
                            } else {
                              ((sq) this).field_m = 0;
                              if (!((sq) this).field_p) {
                                L34: {
                                  if (null != ((sq) this).field_u) {
                                    ((sq) this).field_y.b(2);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                ((sq) this).field_u = null;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                        } else {
                          ((sq) this).field_r = 1048576;
                          if (((sq) this).field_q) {
                            break L33;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L35: {
                                if (((sq) this).field_w != null) {
                                  ((sq) this).field_l.b(2);
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              ((sq) this).field_w = null;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                    return;
                  }
                }
              }
              if (((sq) this).field_m >= 0) {
                break L31;
              } else {
                if (((sq) this).field_l.a((byte) -127)) {
                  break L31;
                } else {
                  L36: {
                    ((sq) this).field_q = false;
                    ((sq) this).field_m = -((sq) this).field_m;
                    ((sq) this).field_w = null;
                    if (((sq) this).field_m != 0) {
                      ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
                      if (((sq) this).field_r < 1048576) {
                        if (((sq) this).field_r > 0) {
                          break L36;
                        } else {
                          ((sq) this).field_r = 0;
                          if (((sq) this).field_q) {
                            break L36;
                          } else {
                            ((sq) this).field_m = 0;
                            if (!((sq) this).field_p) {
                              L37: {
                                if (null != ((sq) this).field_u) {
                                  ((sq) this).field_y.b(2);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                              ((sq) this).field_u = null;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                        }
                      } else {
                        ((sq) this).field_r = 1048576;
                        if (((sq) this).field_q) {
                          break L36;
                        } else {
                          ((sq) this).field_m = 0;
                          if (!((sq) this).field_p) {
                            L38: {
                              if (((sq) this).field_w != null) {
                                ((sq) this).field_l.b(2);
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            ((sq) this).field_w = null;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                    } else {
                      break L36;
                    }
                  }
                  return;
                }
              }
            } else {
              break L31;
            }
          }
          if (((sq) this).field_m != 0) {
            ((sq) this).field_r = ((sq) this).field_r + param0 * ((sq) this).field_m;
            if (((sq) this).field_r < 1048576) {
              if (((sq) this).field_r <= 0) {
                ((sq) this).field_r = 0;
                if (!((sq) this).field_q) {
                  ((sq) this).field_m = 0;
                  if (((sq) this).field_p) {
                    return;
                  } else {
                    L39: {
                      if (null != ((sq) this).field_u) {
                        ((sq) this).field_y.b(2);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    ((sq) this).field_u = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((sq) this).field_r = 1048576;
              if (!((sq) this).field_q) {
                ((sq) this).field_m = 0;
                if (((sq) this).field_p) {
                  return;
                } else {
                  L40: {
                    if (((sq) this).field_w != null) {
                      ((sq) this).field_l.b(2);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  ((sq) this).field_w = null;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    sq(l param0, l param1) {
        ((sq) this).field_s = 256;
        ((sq) this).field_p = false;
        ((sq) this).field_j = 0;
        try {
            this.a(param1, param0, 1048576);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Error connecting to server. Please try using a different server.";
    }
}
