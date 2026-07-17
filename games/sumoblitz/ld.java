/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sp implements ai {
    private wp field_I;
    boolean field_A;
    private int field_M;
    private int field_H;
    mc field_J;
    private boolean field_K;
    hd field_B;
    private wp field_O;
    static ri[] field_F;
    static int field_D;
    String field_L;
    vn field_G;
    static int field_C;
    static bw field_N;

    private final void j(int param0) {
        int var2 = ((ld) this).field_B.e((byte) -128);
        int var3 = var2;
        int var4 = 0;
        if (var3 > ((ld) this).field_H) {
            var3 = ((ld) this).field_H;
            var4 = 1;
        }
        this.c(((ld) this).field_r, ((ld) this).field_q, 8725, ((ld) this).field_v, var3 + ((ld) this).field_M);
        ((ld) this).field_B.a(114, 0, 0, var2, ((ld) this).field_q);
        ((ld) this).field_J = new mc(0, 0, 0, 0, (mh) (Object) new tm(), (pk) (Object) ((ld) this).field_B, (mh) null);
        if (var4 != 0) {
            int discarded$0 = 35;
            ((ld) this).field_J.a(1332, true, hb.a());
        }
        ((ld) this).field_J.a(-126, 0, ((ld) this).field_M, ((ld) this).field_p + -((ld) this).field_M, ((ld) this).field_q);
        ((ld) this).field_A = true;
        int var5 = 32 % ((param0 - -71) / 49);
        ((ld) this).a((pk) (Object) ((ld) this).field_J, 72);
        int discarded$1 = -1;
        this.k();
    }

    final String c(int param0) {
        if (((ld) this).field_k) {
          L0: {
            if (param0 == -6696) {
              break L0;
            } else {
              ((ld) this).field_L = null;
              break L0;
            }
          }
          L1: {
            if (!((ld) this).i(param0 ^ -6708)) {
              break L1;
            } else {
              if (!((ld) this).field_J.field_k) {
                break L1;
              } else {
                if (((ld) this).field_B.field_N != -1) {
                  return ((ld) this).field_B.field_K[((ld) this).field_B.field_N].toString();
                } else {
                  break L1;
                }
              }
            }
          }
          if (((ld) this).field_B.a(-47) != null) {
            return ((ld) this).field_B.a(param0 ^ 6783).toString();
          } else {
            return super.c(-6696);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ld) this).field_M = param3;
        this.c(param1, param4, 8725, param2, param3);
        int var6 = 101 % ((28 - param0) / 63);
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == 61) {
              L1: {
                param0.c((byte) 115);
                ((ld) this).field_K = true;
                ((ld) this).field_L = "";
                if (null == ((ld) this).field_o) {
                  break L1;
                } else {
                  if (((ld) this).field_o instanceof fc) {
                    ((fc) (Object) ((ld) this).field_o).a(((ld) this).field_K, (pk) this, -90);
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ld.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 < -42) {
                break L1;
              } else {
                ((ld) this).field_J = null;
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, -54, param2, param3, param4, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ld.R(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    final void c(byte param0) {
        int var2 = 4 / ((param0 - 64) / 51);
        ((ld) this).field_K = false;
        super.c((byte) 116);
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((ld) this).h(24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ld) this).field_K) {
              break L2;
            } else {
              if (!super.d(-1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void a() {
        field_F = null;
        int var1 = 53;
        field_N = null;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            int var5_int = -76 % ((-25 - param1) / 45);
            super.a(param0, 85, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ld.U(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void e(byte param0) {
        if (!((ld) this).i(20)) {
            return;
        }
        this.c(((ld) this).field_r, ((ld) this).field_q, 8725, ((ld) this).field_v, ((ld) this).field_M);
        ((ld) this).field_A = false;
        if (param0 != 65) {
            return;
        }
        ((ld) this).field_J.b(false);
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        super.a(-108, param0, param3, param4, param1);
        ((ld) this).field_O.a(98, 0, 0, ((ld) this).field_M, param1 + -20);
        ((ld) this).field_I.a(99, param1 + -20, 0, ((ld) this).field_M, 20);
        if (!(!((ld) this).field_A)) {
            ((ld) this).field_J.a(-91, 0, ((ld) this).field_M, -((ld) this).field_M + param4, param1);
        }
    }

    final void h(int param0) {
        if (param0 != 0) {
            this.e((byte) 67);
        }
        if (((ld) this).field_o instanceof hs) {
            ((hs) (Object) ((ld) this).field_o).a((byte) -13, (ld) this);
        }
    }

    private final void k() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((ld) this).i(20)) {
            break L0;
          } else {
            if (((ld) this).field_B.field_L == -1) {
              break L0;
            } else {
              if (((ld) this).field_B.field_K == null) {
                break L0;
              } else {
                if (null != ((ld) this).field_J.field_B) {
                  var2 = ((ld) this).field_J.field_D.field_p;
                  var3 = ((ld) this).field_B.field_J;
                  var4 = -var2 + ((ld) this).field_B.field_p;
                  if (var4 > 0) {
                    L1: {
                      var5 = ((ld) this).field_B.field_L * var3;
                      var6 = ((ld) this).field_J.field_D.field_y.field_v + var5;
                      var7 = var2 >> 2;
                      if (var7 > var6) {
                        L2: {
                          var8 = -(-var5 + var7 << 16) / var4;
                          if (0 > var8) {
                            var8 = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((ld) this).field_J.field_B.field_D = var8;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L3: {
                      var7 = (var2 * 3 >> 2) + -var3;
                      if (var6 <= var7) {
                        break L3;
                      } else {
                        L4: {
                          var8 = -(var7 + -var5 << 16) / var4;
                          if (var8 <= 65536) {
                            break L4;
                          } else {
                            var8 = 65536;
                            break L4;
                          }
                        }
                        ((ld) this).field_J.field_B.field_D = var8;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final static void a(String param0) {
        try {
            rj.a((byte) -94, param0);
            oc.a(us.field_m, false, (byte) -89);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ld.JA(" + (param0 != null ? "{...}" : "null") + 44 + -47 + 41);
        }
    }

    final boolean i(int param0) {
        if (param0 != 20) {
            field_C = -95;
        }
        return ((ld) this).field_A;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_60_0 = false;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (((ld) this).d(-1)) {
              L1: {
                if (null != ((ld) this).field_B.field_K) {
                  L2: {
                    var5_int = ((ld) this).field_B.field_K.length;
                    if (param3 == 99) {
                      break L2;
                    } else {
                      if (param3 == 98) {
                        break L2;
                      } else {
                        L3: {
                          if (105 == param3) {
                            break L3;
                          } else {
                            if (param3 != 104) {
                              if (84 != param3) {
                                if (param3 == 85) {
                                  var6_int = ((ld) this).field_L.length();
                                  if (0 < var6_int) {
                                    ((ld) this).field_L = ((ld) this).field_L.substring(0, var6_int + -1);
                                    stackOut_47_0 = 1;
                                    stackIn_48_0 = stackOut_47_0;
                                    return stackIn_48_0 != 0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (32 > param1) {
                                    break L1;
                                  } else {
                                    if (param1 < 128) {
                                      var6 = ((ld) this).field_L + param1;
                                      this.a(false, var6);
                                      stackOut_52_0 = 1;
                                      stackIn_53_0 = stackOut_52_0;
                                      return stackIn_53_0 != 0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                L4: {
                                  if (((ld) this).field_A) {
                                    this.e((byte) 65);
                                    break L4;
                                  } else {
                                    this.j(-120);
                                    break L4;
                                  }
                                }
                                stackOut_41_0 = 1;
                                stackIn_42_0 = stackOut_41_0;
                                return stackIn_42_0 != 0;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (((ld) this).i(20)) {
                            break L5;
                          } else {
                            this.j(-126);
                            break L5;
                          }
                        }
                        L6: {
                          var6_int = ((ld) this).field_J.field_D.field_p / ((ld) this).field_B.field_J;
                          if (param3 == 105) {
                            ((ld) this).field_B.field_L = ((ld) this).field_B.field_L + var6_int;
                            break L6;
                          } else {
                            ((ld) this).field_B.field_L = ((ld) this).field_B.field_L - var6_int;
                            break L6;
                          }
                        }
                        L7: {
                          if (((ld) this).field_B.field_L >= 0) {
                            break L7;
                          } else {
                            ((ld) this).field_B.field_L = 0;
                            break L7;
                          }
                        }
                        L8: {
                          if (var5_int <= ((ld) this).field_B.field_L) {
                            ((ld) this).field_B.field_L = var5_int + -1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        int discarded$2 = -1;
                        this.k();
                        stackOut_35_0 = 1;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0 != 0;
                      }
                    }
                  }
                  L9: {
                    if (!((ld) this).i(20)) {
                      this.j(-122);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param3 != 99) {
                      ((ld) this).field_B.field_L = ((ld) this).field_B.field_L - 1;
                      break L10;
                    } else {
                      ((ld) this).field_B.field_L = ((ld) this).field_B.field_L + 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (0 > ((ld) this).field_B.field_L) {
                      ((ld) this).field_B.field_L = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5_int > ((ld) this).field_B.field_L) {
                      break L12;
                    } else {
                      ((ld) this).field_B.field_L = var5_int + -1;
                      break L12;
                    }
                  }
                  int discarded$3 = -1;
                  this.k();
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  break L1;
                }
              }
              if (param2 >= 9) {
                if (param3 != 80) {
                  stackOut_60_0 = super.a(param0, param1, (byte) 102, param3);
                  stackIn_61_0 = stackOut_60_0;
                  break L0;
                } else {
                  this.e((byte) 65);
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  return stackIn_59_0 != 0;
                }
              } else {
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                return stackIn_56_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("ld.KA(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L13;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L13;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_61_0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                field_C = -21;
                break L1;
              }
            }
            L2: {
              if (!((ld) this).i(20)) {
                this.j(119);
                break L2;
              } else {
                this.e((byte) 65);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ld.C(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    ld(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (mh) null);
        ((ld) this).field_G = kw.field_b;
        ((ld) this).field_L = "";
        try {
            ((ld) this).field_B = new hd((ld) this, ((ld) this).field_G, param0, param1);
            ((ld) this).field_H = param2;
            ((ld) this).field_A = false;
            ((ld) this).field_B.field_o = (qm) this;
            ((ld) this).field_O = new wp("", (mh) (Object) new dv((ld) this), (qm) this);
            ((ld) this).field_I = new wp();
            ((ld) this).field_I.field_w = (mh) (Object) new fm();
            ((ld) this).field_I.field_o = (qm) this;
            ((ld) this).a((pk) (Object) ((ld) this).field_O, 125);
            ((ld) this).a((pk) (Object) ((ld) this).field_I, 74);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ld.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            param0 = param0.toLowerCase();
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((ld) this).field_B.field_K.length) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var4 = ((ld) this).field_B.field_K[var3_int].toString().toLowerCase();
                if (var4.startsWith(param0)) {
                  stackOut_5_0 = var3_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ld.AA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -2860 + 41);
        }
        return stackIn_9_0;
    }

    final int g(int param0) {
        int var2 = -105 / ((param0 - -37) / 54);
        return ((ld) this).field_B.field_L;
    }

    private final void a(boolean param0, String param1) {
        if (((ld) this).field_B.field_K == null) {
            return;
        }
        int var3_int = this.a(param1.toLowerCase(), -2860);
        if (var3_int == -1) {
            return;
        }
        try {
            ((ld) this).field_B.field_L = var3_int;
            int discarded$0 = -1;
            this.k();
            ((ld) this).field_L = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ld.LA(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
