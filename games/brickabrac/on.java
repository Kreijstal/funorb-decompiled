/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends bn {
    static String field_F;
    int field_H;
    int field_B;
    int field_N;
    static int[] field_D;
    private int field_v;
    private static int[] field_y;
    static int[] field_L;
    int field_M;
    ee[] field_P;
    static jp field_K;
    int field_S;
    int field_J;
    private int field_G;
    static jp[][] field_I;
    static int field_E;
    static kg field_x;
    static byte[] field_O;
    static mh field_A;
    static String field_z;
    int field_R;
    int field_C;
    static jp field_w;

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              if (param0 > 79) {
                break L1;
              } else {
                ((on) this).f(-33);
                break L1;
              }
            }
            L2: {
              var3_int = super.a(107, param1);
              if (param1 == null) {
                break L2;
              } else {
                StringBuilder discarded$4 = param1.append(((on) this).field_j + " " + ((on) this).field_m + " ");
                StringBuilder discarded$5 = param1.append(((on) this).field_k + " " + " " + ((on) this).field_o + " ");
                StringBuilder discarded$6 = param1.append(((on) this).field_G + " " + ((on) this).field_J + " " + ((on) this).field_S + " " + ((on) this).field_M + " ");
                StringBuilder discarded$7 = param1.append(((on) this).field_R + "\n");
                break L2;
              }
            }
            var3_int = var3_int ^ (((on) this).field_J * 19 + ((on) this).field_G * 23 - (-(((on) this).field_S * 17) - 4641) ^ 405 + 27 * ((on) this).field_N << 21 ^ 47802 + ((on) this).field_M * 3 << 4 ^ 4643 + ((on) this).field_R * 23 << 8);
            var3_int = var3_int ^ ((on) this).field_H * 7 - -35 << 2;
            stackOut_4_0 = var3_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("on.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    private final void a(cl param0, byte param1) {
        int var3_int = 0;
        ee var4_ref_ee = null;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(!param0.field_p.a(false))) {
            return;
        }
        if (param1 > -87) {
            return;
        }
        try {
            ((on) this).field_G = param0.field_t;
            ((on) this).field_P = new ee[param0.field_p.e(119)];
            var3_int = 0;
            var4_ref_ee = (ee) (Object) param0.field_p.d(-38);
            while (var4_ref_ee != null) {
                int incrementValue$0 = var3_int;
                var3_int++;
                ((on) this).field_P[incrementValue$0] = var4_ref_ee;
                var4_ref_ee = (ee) (Object) param0.field_p.a((byte) 116);
            }
            ((on) this).field_v = -1 + ((on) this).field_P.length;
            ((on) this).field_C = 0;
            var3_int = 0;
            var4 = 0;
            while (var3_int <= ((on) this).field_J) {
                var4 = var3_int;
                ((on) this).f(68);
                var3_int = var3_int + ((on) this).field_P[((on) this).field_C].field_t;
            }
            ((on) this).field_S = -var4 + ((on) this).field_J;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "on.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    on() {
        this(0, 0, 0, 0, 0);
    }

    on(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0, param1, param2, param3, 8704, 4096, param4);
        ((on) this).field_R = -1;
        ((on) this).field_J = param7;
        ((on) this).field_N = param5;
        ((on) this).field_M = param6;
    }

    private final void a(j param0) {
        RuntimeException var3 = null;
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
              if ((((on) this).field_N & 2) == 0) {
                break L1;
              } else {
                if (!param0.a(26, ((on) this).field_i)) {
                  break L1;
                } else {
                  param0.field_pb.a((nm) (Object) new ge(((on) this).field_j - -(((on) this).field_u / 2) - 2048, ((on) this).field_m - -(((on) this).field_s * 2), ((on) this).field_i), (byte) 3);
                  if (r.field_A) {
                    jc.a(((on) this).field_i, 2, (byte) -92);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("on.R(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 15165 + 41);
        }
    }

    final void a(cl param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param0, (byte) -105);
              ((on) this).a((byte) 36, param1);
              if (param2 == 4) {
                break L1;
              } else {
                int discarded$2 = on.a((byte) -120, -81);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("on.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, boolean param1) {
        ee var6 = ((on) this).field_P[((on) this).field_v];
        ee var4 = ((on) this).field_P[((on) this).field_C];
        ((on) this).field_k = -var6.field_j + var4.field_j;
        int var5 = var4.field_t;
        ((on) this).field_o = var4.field_m + -var6.field_m;
        if (param0 <= 33) {
            ((on) this).f(-3);
        }
        ((on) this).field_j = ((on) this).field_S * ((on) this).field_k / var5 + var6.field_j;
        ((on) this).field_m = var6.field_m + ((on) this).field_o * ((on) this).field_S / var5;
        if (param1) {
            ((on) this).field_k = ((on) this).field_k / var5;
            ((on) this).field_o = ((on) this).field_o / var5;
        } else {
            ((on) this).field_k = 0;
            ((on) this).field_o = 0;
        }
    }

    public static void d(int param0) {
        field_D = null;
        field_w = null;
        field_I = null;
        field_A = null;
        field_z = null;
        if (param0 != 4641) {
            field_x = null;
        }
        field_L = null;
        field_y = null;
        field_x = null;
        field_K = null;
        field_O = null;
        field_F = null;
    }

    final void a(byte param0, j param1, no param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn var7 = null;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
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
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7 = (vn) (Object) param2;
            if (((on) this).field_i != 28) {
              L1: {
                L2: {
                  if ((sg.field_n & 1 << ((on) this).field_i) != 0) {
                    break L2;
                  } else {
                    if (var7.field_v != 0) {
                      break L1;
                    } else {
                      if (var7.field_J != 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    super.a((byte) 53, param1, param2);
                    var7.field_I = var7.field_I + 1;
                    if (sh.field_a == 8) {
                      break L4;
                    } else {
                      if (sh.field_a != 4) {
                        var7.field_o = -var7.field_o;
                        var5 = ae.field_b * (((on) this).field_o - var7.field_o);
                        if (var5 >= 0) {
                          break L3;
                        } else {
                          var7.field_o = ((on) this).field_o;
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7.field_k = -var7.field_k;
                  var5 = mn.field_A * (((on) this).field_k - var7.field_k);
                  if (0 <= var5) {
                    break L3;
                  } else {
                    var7.field_k = ((on) this).field_k;
                    break L3;
                  }
                }
                var7.field_C = var7.field_C + 1;
                if ((var7.field_I & 3) == 0) {
                  var7.field_k = var7.field_k + (-param1.a(4, (byte) 62) + 2);
                  var7.field_o = var7.field_o + (2 + -param1.a(4, (byte) 62));
                  break L1;
                } else {
                  break L1;
                }
              }
              L5: {
                if (var7.field_J != 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L5;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5 = stackIn_21_0;
                  stackOut_21_0 = var5;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (((on) this).field_i != 19) {
                    break L7;
                  } else {
                    stackOut_22_0 = stackIn_22_0;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (sh.field_a != 1) {
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L6;
                    } else {
                      stackOut_23_0 = stackIn_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      break L7;
                    }
                  }
                }
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L6;
              }
              L8: {
                L9: {
                  var5 = stackIn_26_0 & stackIn_26_1;
                  stackOut_26_0 = var5;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (20 != ((on) this).field_i) {
                    break L9;
                  } else {
                    stackOut_27_0 = stackIn_27_0;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (sh.field_a != 2) {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L8;
                    } else {
                      stackOut_28_0 = stackIn_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      break L9;
                    }
                  }
                }
                stackOut_29_0 = stackIn_29_0;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L8;
              }
              L10: {
                var5 = stackIn_31_0 & stackIn_31_1;
                if (var5 != 0) {
                  L11: {
                    if (25 != ((on) this).field_i) {
                      break L11;
                    } else {
                      param1.a(-27);
                      break L11;
                    }
                  }
                  L12: {
                    if (((on) this).field_i != 27) {
                      break L12;
                    } else {
                      if (((on) this).field_R == 26) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (((on) this).field_i != 26) {
                        break L14;
                      } else {
                        if (((on) this).field_R != 27) {
                          break L14;
                        } else {
                          ((on) this).field_i = 27;
                          ((on) this).field_R = 0;
                          ((on) this).field_B = 1;
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (~(param1.field_l + 1) != ~ej.field_E[((on) this).field_i]) {
                        if ((((on) this).field_N & 1) != 0) {
                          break L15;
                        } else {
                          param1.field_l = 0;
                          break L15;
                        }
                      } else {
                        param1.field_l = param1.field_l + 1;
                        break L15;
                      }
                    }
                    L16: {
                      ((on) this).field_R = ue.field_b[((on) this).field_i];
                      ((on) this).field_B = rb.field_a[((on) this).field_i];
                      if (rb.field_a[((on) this).field_i] < 0) {
                        if (param1.a(100, (byte) 62) > 65) {
                          if (sh.field_a != 1) {
                            if (sh.field_a == 2) {
                              ((on) this).field_B = 7;
                              break L16;
                            } else {
                              if (sh.field_a != 8) {
                                ((on) this).field_B = 9;
                                break L16;
                              } else {
                                ((on) this).field_B = 8;
                                break L16;
                              }
                            }
                          } else {
                            ((on) this).field_B = 6;
                            break L16;
                          }
                        } else {
                          ((on) this).field_B = param1.a(6, (byte) 62);
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    int discarded$1 = 15165;
                    this.a(param1);
                    break L13;
                  }
                  ((on) this).field_l = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L17: {
                if (19 != ((on) this).field_i) {
                  break L17;
                } else {
                  if (((on) this).field_R >= 0) {
                    break L17;
                  } else {
                    ((on) this).field_R = ((on) this).field_i;
                    ((on) this).field_B = 12;
                    break L17;
                  }
                }
              }
              L18: {
                if (20 != ((on) this).field_i) {
                  break L18;
                } else {
                  if (((on) this).field_R < 0) {
                    ((on) this).field_B = 12;
                    ((on) this).field_R = ((on) this).field_i;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (param0 == 53) {
                  break L19;
                } else {
                  field_F = null;
                  break L19;
                }
              }
              break L0;
            } else {
              param1.a((byte) -63, (on) this, var7);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var4 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var4;
            stackOut_68_1 = new StringBuilder().append("on.E(").append(param0).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
    }

    final boolean a(no param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (0 == (4 & ((on) this).field_N)) {
                break L1;
              } else {
                if (((on) this).field_P[((on) this).field_v].field_t != 1) {
                  break L1;
                } else {
                  if (0 != ((on) this).field_S) {
                    break L1;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0 != 0;
                  }
                }
              }
            }
            L2: {
              if ((1 << ((on) this).field_i & sg.field_n) != 0) {
                break L2;
              } else {
                if (0 == ((vn) (Object) param0).field_J) {
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            if (((on) this).field_R != 0) {
              var3_int = -83 % ((-29 - param1) / 35);
              stackOut_12_0 = super.a(param0, (byte) -120);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("on.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    final static void e(int param0) {
        int var1 = (-640 + kp.field_a) / 2;
        int var2 = hj.field_Yb * hj.field_Yb;
        int var3 = var2 - ml.field_b * ml.field_b;
        fe.field_gb.a(-124 + (lb.field_d + -90), 90, -(199 * var3 / var2) + var1, 199, (byte) 64);
        if (param0 >= -50) {
            on.d(61);
        }
        rm.field_a.a(-4 + lb.field_d + -120, 0, 438 * var3 / var2 + (var1 - -202), 438, (byte) 64);
    }

    on(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, 0, 0, 0);
    }

    final void f(int param0) {
        int fieldTemp$0 = ((on) this).field_C + 1;
        ((on) this).field_C = ((on) this).field_C + 1;
        ((on) this).field_C = fieldTemp$0 % ((on) this).field_P.length;
        int fieldTemp$1 = ((on) this).field_v + 1;
        ((on) this).field_v = ((on) this).field_v + 1;
        ((on) this).field_v = fieldTemp$1 % ((on) this).field_P.length;
        if (param0 <= 61) {
            Object var3 = null;
            ((on) this).a(-99, (wq) null);
        }
        ((on) this).field_J = ((on) this).field_J % ((on) this).field_G;
        ((on) this).field_S = 0;
    }

    final static int a(byte param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        qj.field_j = 0;
        dm.field_d = null;
        fc.field_e = null;
        int var2 = gd.field_a;
        gd.field_a = up.field_z;
        int var3 = -47 / ((param0 - -22) / 61);
        if (param1 == 51) {
            vd.field_f.field_f = 2;
        } else {
            if (param1 != 50) {
                vd.field_f.field_f = 1;
            } else {
                vd.field_f.field_f = 5;
            }
        }
        up.field_z = var2;
        vd.field_f.field_i = vd.field_f.field_i + 1;
        if (2 <= vd.field_f.field_i) {
            if (param1 == 51) {
                return 2;
            }
        }
        if (vd.field_f.field_i >= 2) {
            if (!(param1 != 50)) {
                return 5;
            }
        }
        if (!(vd.field_f.field_i < 4)) {
            return 1;
        }
        return -1;
    }

    final void a(int param0, wq param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 89) {
                break L1;
              } else {
                var4 = null;
                this.a((cl) null, (byte) 44);
                break L1;
              }
            }
            L2: {
              super.a(93, param1);
              ((on) this).field_R = param1.b(true);
              if (((on) this).field_R <= 0) {
                break L2;
              } else {
                ((on) this).field_B = param1.l(255);
                break L2;
              }
            }
            L3: {
              ((on) this).field_N = param1.l(255) & 255;
              if ((4 & ((on) this).field_N) != 0) {
                ((on) this).field_M = param1.l(255);
                ((on) this).field_J = param1.i(65280);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("on.L(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        double var1 = 0.0;
        field_y = new int[65536];
        field_L = new int[65536];
        field_D = new int[]{100, 200, 300, 300, 500, 100, 300, 300, 500, 200, 500, 500, 500, 1000, 300, 1000, 100, 300, 500, 300, 500, 1000, 500, 300, 500, 1000, 300, 200, 500, 200, 100, 200, 100, 200, 100, 100, 100, 100, 100, 500, 1000, 200};
        field_F = "You must play <%1> more rated games before playing with the current options.";
        var0 = 0;
        L0: while (true) {
          if (var0 >= 65536) {
            var0 = 0;
            L1: while (true) {
              if (var0 >= 65536) {
                field_z = "<%0> has lost connection.";
                return;
              } else {
                var1 = Math.sqrt((double)var0);
                field_y[var0] = (int)Math.floor((double)var0 * 0.0234375 + (-(9.0 * var1) + 768.5));
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = 256.0 - Math.sqrt((double)var0);
            field_L[var0] = (int)(var1 * var1 + 0.5);
            var0++;
            continue L0;
          }
        }
    }
}
