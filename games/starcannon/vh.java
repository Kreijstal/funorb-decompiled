/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh extends eh {
    static String field_s;
    static int field_t;
    static int field_q;
    private sb field_r;

    final static lb a(ia param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        lb stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        lb stackOut_37_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.e(8, 8);
            if (var2_int <= 0) {
              L1: {
                if (param1 >= 85) {
                  break L1;
                } else {
                  vh.h((byte) 12);
                  break L1;
                }
              }
              L2: {
                var3 = od.a(-2, param0) ? 1 : 0;
                var4 = od.a(-2, param0) ? 1 : 0;
                var5 = new lb();
                var5.field_R = (short)param0.e(8, 16);
                var5.field_J = fd.a(16, var5.field_J, -39, param0);
                var5.field_x = fd.a(16, var5.field_x, -118, param0);
                var5.field_q = fd.a(16, var5.field_q, 110, param0);
                var5.field_P = (short)param0.e(8, 16);
                var5.field_z = fd.a(16, var5.field_z, 117, param0);
                var5.field_c = fd.a(16, var5.field_c, 123, param0);
                var5.field_y = fd.a(16, var5.field_y, -108, param0);
                if (var3 != 0) {
                  var5.field_s = (short)param0.e(8, 16);
                  var5.field_N = fd.a(16, var5.field_N, -56, param0);
                  var5.field_a = fd.a(16, var5.field_a, -97, param0);
                  var5.field_o = fd.a(16, var5.field_o, 89, param0);
                  var5.field_Q = fd.a(16, var5.field_Q, 106, param0);
                  var5.field_e = fd.a(16, var5.field_e, 100, param0);
                  var5.field_m = fd.a(16, var5.field_m, -25, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  int discarded$1 = param0.e(8, 16);
                  var5.field_A = fd.a(16, var5.field_A, 116, param0);
                  var5.field_b = fd.a(16, var5.field_b, 104, param0);
                  var5.field_D = fd.a(16, var5.field_D, -45, param0);
                  var5.field_G = fd.a(16, var5.field_G, -119, param0);
                  var5.field_I = fd.a(16, var5.field_I, 89, param0);
                  break L3;
                }
              }
              L4: {
                if (od.a(-2, param0)) {
                  var5.field_K = fd.a(16, var5.field_K, -82, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (od.a(-2, param0)) {
                  var5.field_u = fb.a(16, var5.field_u, param0, true);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (~var5.field_u.length >= ~var7) {
                          break L8;
                        } else {
                          stackOut_23_0 = var6;
                          stackOut_23_1 = var5.field_u[var7] & 255;
                          stackIn_31_0 = stackOut_23_0;
                          stackIn_31_1 = stackOut_23_1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          if (var8 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_24_0 < stackIn_24_1) {
                                var6 = var5.field_u[var7] & 255;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_30_0 = ~var6;
                      stackOut_30_1 = -1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L7;
                    }
                    L10: {
                      if (stackIn_31_0 == stackIn_31_1) {
                        break L10;
                      } else {
                        var5.field_O = (byte)(var6 + 1);
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var5.field_u = null;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              stackOut_37_0 = (lb) var5;
              stackIn_38_0 = stackOut_37_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("vh.R(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L11;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 41);
        }
        return stackIn_38_0;
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            rb stackIn_7_0 = null;
            rb stackIn_9_0 = null;
            rb stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            Throwable decompiledCaughtException = null;
            rb stackOut_6_0 = null;
            rb stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            rb stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            try {
              L0: {
                if (null == ((vh) this).field_r) {
                  return;
                } else {
                  try {
                    L1: {
                      L2: {
                        if (param0 == -100) {
                          break L2;
                        } else {
                          vh.a(0, false, (lb) null, -73, 33);
                          break L2;
                        }
                      }
                      L3: {
                        ((vh) this).field_g.field_g = 0;
                        stackOut_6_0 = ((vh) this).field_g;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!param1) {
                          stackOut_9_0 = (rb) (Object) stackIn_9_0;
                          stackOut_9_1 = 3;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L3;
                        } else {
                          stackOut_7_0 = (rb) (Object) stackIn_7_0;
                          stackOut_7_1 = 2;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          break L3;
                        }
                      }
                      ((rb) (Object) stackIn_10_0).a(stackIn_10_1, -125);
                      ((vh) this).field_g.a((byte) -116, 0L);
                      ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L5: {
                          ((vh) this).field_r.b((byte) -45);
                          break L5;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L6: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L6;
                        }
                      }
                      ((vh) this).field_p = ((vh) this).field_p + 1;
                      ((vh) this).field_d = -2;
                      ((vh) this).field_r = null;
                      break L4;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) (Object) var3_ref, "vh.S(" + param0 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, re param1, int param2) {
        RuntimeException var3 = null;
        ia var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var3_ref = d.field_b;
            var3_ref.d((byte) 81, param0);
            var3_ref.field_g = var3_ref.field_g + 1;
            var4 = var3_ref.field_g;
            var3_ref.a(1, -65);
            var3_ref.c(param1.field_g, -306);
            var3_ref.c(param1.field_n, -306);
            var3_ref.c(param1.field_h, -306);
            var3_ref.c((byte) -70, param1.field_i);
            var3_ref.c((byte) -119, param1.field_m);
            var3_ref.c((byte) -116, param1.field_p);
            var3_ref.c((byte) -97, param1.field_j);
            var3_ref.a(param1.field_o.length, -91);
            var5 = param2;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param1.field_o.length >= ~var5) {
                    break L3;
                  } else {
                    var3_ref.c((byte) -117, param1.field_o[var5]);
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
                int discarded$1 = var3_ref.b((byte) -75, var4);
                var3_ref.b(var3_ref.field_g - var4, 31700);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vh.Q(").append(param0).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((vh) this).field_r == null) {
                break L1;
              } else {
                ((vh) this).field_r.b((byte) -106);
                break L1;
              }
            }
            L2: {
              if (param0 == -4628) {
                break L2;
              } else {
                ((vh) this).field_r = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "vh.H(" + param0 + 41);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ra var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var6 = StarCannon.field_A;
            try {
              L0: {
                L1: {
                  if (null == ((vh) this).field_r) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((vh) this).field_r.b((byte) -71);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((vh) this).field_r = null;
                    break L1;
                  }
                }
                ((vh) this).field_r = (sb) param0;
                this.i((byte) 100);
                this.a((byte) -100, param2);
                ((vh) this).field_a = null;
                ((vh) this).field_f.field_g = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      L7: {
                        var4_ref3 = (ra) (Object) ((vh) this).field_i.c(8);
                        if (var4_ref3 != null) {
                          break L7;
                        } else {
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      ((vh) this).field_m.a(22197, (uh) (Object) var4_ref3);
                      break L6;
                    }
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          var4_ref3 = (ra) (Object) ((vh) this).field_k.c(8);
                          if (null != var4_ref3) {
                            break L11;
                          } else {
                            if (var6 != 0) {
                              break L10;
                            } else {
                              if (var6 == 0) {
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        ((vh) this).field_o.a(22197, (uh) (Object) var4_ref3);
                        break L10;
                      }
                      if (var6 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                    L12: {
                      if (param1 > 17) {
                        break L12;
                      } else {
                        ((vh) this).field_r = null;
                        break L12;
                      }
                    }
                    L13: {
                      if (((vh) this).field_b != 0) {
                        {
                          L14: {
                            ((vh) this).field_g.field_g = 0;
                            ((vh) this).field_g.a(4, -125);
                            ((vh) this).field_g.a((int) ((vh) this).field_b, -87);
                            ((vh) this).field_g.c((byte) -85, 0);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            break L14;
                          }
                        }
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((vh) this).field_l = 0;
                    ((vh) this).field_e = dd.b(121);
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L18: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_38_0 = (RuntimeException) var4_ref2;
                stackOut_38_1 = new StringBuilder().append("vh.C(");
                stackIn_41_0 = stackOut_38_0;
                stackIn_41_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param0 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L18;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_42_0 = stackOut_39_0;
                  stackIn_42_1 = stackOut_39_1;
                  stackIn_42_2 = stackOut_39_2;
                  break L18;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param1 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -98) {
                break L1;
              } else {
                field_t = -12;
                break L1;
              }
            }
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "vh.T(" + param0 + 41);
        }
    }

    final static void a(int param0, boolean param1, lb param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var19 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = td.a(3 * (-param0 + param4), (byte) 41);
              if (param3 == -6787) {
                break L1;
              } else {
                lb discarded$1 = vh.a((ia) null, -87);
                break L1;
              }
            }
            L2: {
              var6 = 3 * param0;
              var7 = var5_int - 10;
              ed.d(-121);
              if (param2.field_O <= 0) {
                break L2;
              } else {
                if (param2.field_u != null) {
                  ae.a(-5607);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            wj.field_e = 0;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var8 >= param2.field_P) {
                    break L5;
                  } else {
                    var9 = param2.field_z[var8];
                    var10 = param2.field_c[var8];
                    var11 = param2.field_y[var8];
                    stackOut_13_0 = param1;
                    stackIn_51_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (!stackIn_14_0) {
                            break L7;
                          } else {
                            var12 = bh.field_c[var9];
                            var13 = ri.field_a[var9];
                            var14 = bh.field_c[var10] - var12;
                            var15 = -var12 + bh.field_c[var11];
                            var16 = ri.field_a[var10] - var13;
                            var17 = -var13 + ri.field_a[var11];
                            if (-(var16 * var15) + var14 * var17 >= 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var12 = sc.field_d[var9];
                          if (-2147483648 != var12) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13 = sc.field_d[var10];
                        if (-2147483648 == var13) {
                          break L6;
                        } else {
                          L9: {
                            var14 = sc.field_d[var11];
                            if (var14 != -2147483648) {
                              break L9;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            var15 = var14 + (var13 + var12) - var6;
                            stackOut_27_0 = -1;
                            stackOut_27_1 = jf.field_a.length;
                            stackIn_30_0 = stackOut_27_0;
                            stackIn_30_1 = stackOut_27_1;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            if (var7 < 0) {
                              stackOut_30_0 = stackIn_30_0;
                              stackOut_30_1 = stackIn_30_1;
                              stackOut_30_2 = var15 << -var7;
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              stackIn_31_2 = stackOut_30_2;
                              break L10;
                            } else {
                              stackOut_28_0 = stackIn_28_0;
                              stackOut_28_1 = stackIn_28_1;
                              stackOut_28_2 = var15 >> var7;
                              stackIn_31_0 = stackOut_28_0;
                              stackIn_31_1 = stackOut_28_1;
                              stackIn_31_2 = stackOut_28_2;
                              break L10;
                            }
                          }
                          var16 = stackIn_31_0 + (stackIn_31_1 - stackIn_31_2);
                          var17 = jf.field_a[var16];
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (0 == var17 >> 4) {
                                  break L13;
                                } else {
                                  var16--;
                                  stackOut_33_0 = -1;
                                  stackOut_33_1 = ~var16;
                                  stackIn_42_0 = stackOut_33_0;
                                  stackIn_42_1 = stackOut_33_1;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  if (var19 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_34_0 >= stackIn_34_1) {
                                        break L14;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var17 = jf.field_a[var16];
                                    if (var19 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_41_0 = var16 << 4;
                              stackOut_41_1 = -var17;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              break L12;
                            }
                            L15: {
                              var18 = stackIn_42_0 - stackIn_42_1;
                              ih.field_d[var18] = var8;
                              jf.field_a[var16] = 1 + var17;
                              if (0 >= param2.field_O) {
                                break L15;
                              } else {
                                if (null == param2.field_u) {
                                  break L15;
                                } else {
                                  jb.field_h[param2.field_u[var8]] = jb.field_h[param2.field_u[var8]] + 1;
                                  break L15;
                                }
                              }
                            }
                            wj.field_e = wj.field_e + 1;
                            break L6;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_50_0 = -1;
                stackIn_51_0 = stackOut_50_0;
                break L4;
              }
              L16: {
                L17: {
                  if (stackIn_51_0 <= ~param2.field_O) {
                    break L17;
                  } else {
                    if (param2.field_u == null) {
                      break L17;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (var9 >= jb.field_h.length) {
                          break L17;
                        } else {
                          var10 = jb.field_h[var9];
                          jb.field_h[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("vh.O(").append(param0).append(44).append(param1).append(44);
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L19;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L19;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void i(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 > 34) {
                    break L1;
                  } else {
                    ((vh) this).field_r = null;
                    break L1;
                  }
                }
                if (null == ((vh) this).field_r) {
                  return;
                } else {
                  {
                    L2: {
                      ((vh) this).field_g.field_g = 0;
                      ((vh) this).field_g.a(6, -67);
                      ((vh) this).field_g.a(3, (byte) -39);
                      ((vh) this).field_g.c(0, -306);
                      ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) (Object) var2_ref, "vh.P(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            ra var2_ref2 = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ra var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_105_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_151_0 = 0;
            int stackIn_161_0 = 0;
            int stackIn_163_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_41_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_104_0 = 0;
            int stackOut_108_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_150_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_160_0 = 0;
            int stackOut_162_0 = 0;
            var16 = StarCannon.field_A;
            try {
              L0: {
                if (null != ((vh) this).field_r) {
                  L1: {
                    var2_long = dd.b(82);
                    var4 = (int)(-((vh) this).field_e + var2_long);
                    if (var4 <= 200) {
                      break L1;
                    } else {
                      var4 = 200;
                      break L1;
                    }
                  }
                  ((vh) this).field_e = var2_long;
                  ((vh) this).field_l = ((vh) this).field_l + var4;
                  if (((vh) this).field_l > 30000) {
                    try {
                      L2: {
                        ((vh) this).field_r.b((byte) -66);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((vh) this).field_r = null;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (((vh) this).field_r != null) {
                ((vh) this).field_r.a((byte) 126);
                var2_ref2 = (ra) (Object) ((vh) this).field_m.a((byte) 127);
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var2_ref2 == null) {
                        break L6;
                      } else {
                        ((vh) this).field_g.field_g = 0;
                        ((vh) this).field_g.a(1, -97);
                        ((vh) this).field_g.a((byte) -50, var2_ref2.field_j);
                        ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                        ((vh) this).field_i.a(22197, (uh) (Object) var2_ref2);
                        var2_ref2 = (ra) (Object) ((vh) this).field_m.a(-99);
                        if (var16 != 0) {
                          break L5;
                        } else {
                          if (var16 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var2_ref2 = (ra) (Object) ((vh) this).field_o.a((byte) 120);
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (null == var2_ref2) {
                          break L9;
                        } else {
                          ((vh) this).field_g.field_g = 0;
                          ((vh) this).field_g.a(0, param0 + -55);
                          ((vh) this).field_g.a((byte) -78, var2_ref2.field_j);
                          ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                          ((vh) this).field_k.a(22197, (uh) (Object) var2_ref2);
                          var2_ref2 = (ra) (Object) ((vh) this).field_o.a(-88);
                          if (var16 != 0) {
                            break L8;
                          } else {
                            if (var16 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (param0 == -62) {
                        break L8;
                      } else {
                        ((vh) this).field_r = null;
                        break L8;
                      }
                    }
                    var2_int = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var2_int >= 100) {
                            break L12;
                          } else {
                            var3_int = ((vh) this).field_r.c(66);
                            stackOut_41_0 = ~var3_int;
                            stackIn_151_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (var16 != 0) {
                              break L11;
                            } else {
                              if (stackIn_42_0 <= -1) {
                                if (var3_int == 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    L14: {
                                      ((vh) this).field_l = 0;
                                      var4 = 0;
                                      if (null == ((vh) this).field_a) {
                                        break L14;
                                      } else {
                                        if (((vh) this).field_a.field_v == 0) {
                                          var4 = 1;
                                          if (var16 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var4 = 10;
                                    break L13;
                                  }
                                  L15: {
                                    if (var4 <= 0) {
                                      L16: {
                                        var5 = ((vh) this).field_a.field_u.field_f.length - ((vh) this).field_a.field_w;
                                        var6 = -((vh) this).field_a.field_v + 512;
                                        if (var6 > -((vh) this).field_a.field_u.field_g + var5) {
                                          var6 = var5 + -((vh) this).field_a.field_u.field_g;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        if (var3_int >= var6) {
                                          break L17;
                                        } else {
                                          var6 = var3_int;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        L19: {
                                          ((vh) this).field_r.a(((vh) this).field_a.field_u.field_g, 32498, var6, ((vh) this).field_a.field_u.field_f);
                                          if (0 != ((vh) this).field_b) {
                                            var7 = 0;
                                            L20: while (true) {
                                              if (~var6 >= ~var7) {
                                                break L19;
                                              } else {
                                                ((vh) this).field_a.field_u.field_f[var7 + ((vh) this).field_a.field_u.field_g] = (byte)dg.a((int) ((vh) this).field_a.field_u.field_f[var7 + ((vh) this).field_a.field_u.field_g], (int) ((vh) this).field_b);
                                                var7++;
                                                if (var16 != 0) {
                                                  break L18;
                                                } else {
                                                  if (var16 == 0) {
                                                    continue L20;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L19;
                                          }
                                        }
                                        ((vh) this).field_a.field_u.field_g = ((vh) this).field_a.field_u.field_g + var6;
                                        ((vh) this).field_a.field_v = ((vh) this).field_a.field_v + var6;
                                        break L18;
                                      }
                                      L21: {
                                        if (var5 == ((vh) this).field_a.field_u.field_g) {
                                          break L21;
                                        } else {
                                          if (512 != ((vh) this).field_a.field_v) {
                                            break L15;
                                          } else {
                                            ((vh) this).field_a.field_v = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                      ((vh) this).field_a.a(param0 + -6180);
                                      ((vh) this).field_a.field_r = false;
                                      ((vh) this).field_a = null;
                                      break L15;
                                    } else {
                                      L22: {
                                        var5 = -((vh) this).field_f.field_g + var4;
                                        if (var5 <= var3_int) {
                                          break L22;
                                        } else {
                                          var5 = var3_int;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        L24: {
                                          ((vh) this).field_r.a(((vh) this).field_f.field_g, 32498, var5, ((vh) this).field_f.field_f);
                                          if (0 == ((vh) this).field_b) {
                                            break L24;
                                          } else {
                                            var6 = 0;
                                            L25: while (true) {
                                              if (~var6 <= ~var5) {
                                                break L24;
                                              } else {
                                                ((vh) this).field_f.field_f[var6 + ((vh) this).field_f.field_g] = (byte)dg.a((int) ((vh) this).field_f.field_f[var6 + ((vh) this).field_f.field_g], (int) ((vh) this).field_b);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L23;
                                                } else {
                                                  if (var16 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((vh) this).field_f.field_g = ((vh) this).field_f.field_g + var5;
                                        break L23;
                                      }
                                      L26: {
                                        if (~((vh) this).field_f.field_g <= ~var4) {
                                          break L26;
                                        } else {
                                          if (var16 == 0) {
                                            break L15;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (((vh) this).field_a == null) {
                                          L28: {
                                            ((vh) this).field_f.field_g = 0;
                                            var6 = ((vh) this).field_f.j(param0 ^ -7897);
                                            var7 = ((vh) this).field_f.f((byte) -114);
                                            var8 = ((vh) this).field_f.j(7909);
                                            var9 = ((vh) this).field_f.f((byte) -114);
                                            var10 = 127 & var8;
                                            if ((128 & var8) == 0) {
                                              stackOut_79_0 = 0;
                                              stackIn_80_0 = stackOut_79_0;
                                              break L28;
                                            } else {
                                              stackOut_77_0 = 1;
                                              stackIn_80_0 = stackOut_77_0;
                                              break L28;
                                            }
                                          }
                                          L29: {
                                            L30: {
                                              var11 = stackIn_80_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ra) (Object) ((vh) this).field_k.a((byte) 124);
                                                L31: while (true) {
                                                  if (var14_ref == null) {
                                                    break L30;
                                                  } else {
                                                    stackOut_95_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                                                    stackIn_105_0 = stackOut_95_0;
                                                    stackIn_96_0 = stackOut_95_0;
                                                    if (var16 != 0) {
                                                      break L29;
                                                    } else {
                                                      if (stackIn_96_0 == 0) {
                                                        break L30;
                                                      } else {
                                                        var14_ref = (ra) (Object) ((vh) this).field_k.a(-93);
                                                        if (var16 == 0) {
                                                          continue L31;
                                                        } else {
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ra) (Object) ((vh) this).field_i.a((byte) 125);
                                                L32: while (true) {
                                                  if (var14_ref == null) {
                                                    break L30;
                                                  } else {
                                                    stackOut_83_0 = (var14_ref.field_j < var12 ? -1 : (var14_ref.field_j == var12 ? 0 : 1));
                                                    stackIn_105_0 = stackOut_83_0;
                                                    stackIn_84_0 = stackOut_83_0;
                                                    if (var16 != 0) {
                                                      break L29;
                                                    } else {
                                                      stackOut_84_0 = stackIn_84_0;
                                                      stackIn_86_0 = stackOut_84_0;
                                                      L33: {
                                                        if (stackIn_86_0 != 0) {
                                                          break L33;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L30;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (ra) (Object) ((vh) this).field_i.a(-112);
                                                      continue L32;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              stackOut_104_0 = var10;
                                              stackIn_105_0 = stackOut_104_0;
                                              break L29;
                                            }
                                          }
                                          L34: {
                                            if (stackIn_105_0 == 0) {
                                              stackOut_108_0 = 5;
                                              stackIn_109_0 = stackOut_108_0;
                                              break L34;
                                            } else {
                                              stackOut_106_0 = 9;
                                              stackIn_109_0 = stackOut_106_0;
                                              break L34;
                                            }
                                          }
                                          var15 = stackIn_109_0;
                                          ((vh) this).field_a = var14_ref;
                                          ((vh) this).field_a.field_u = new rb(var9 + var15 + ((vh) this).field_a.field_w);
                                          ((vh) this).field_a.field_u.a(var10, -96);
                                          ((vh) this).field_a.field_u.c((byte) -105, var9);
                                          ((vh) this).field_f.field_g = 0;
                                          ((vh) this).field_a.field_v = 10;
                                          if (var16 == 0) {
                                            break L15;
                                          } else {
                                            break L27;
                                          }
                                        } else {
                                          break L27;
                                        }
                                      }
                                      L35: {
                                        if (0 != ((vh) this).field_a.field_v) {
                                          break L35;
                                        } else {
                                          L36: {
                                            if (-1 == ((vh) this).field_f.field_f[0]) {
                                              break L36;
                                            } else {
                                              ((vh) this).field_a = null;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                          ((vh) this).field_a.field_v = 1;
                                          ((vh) this).field_f.field_g = 0;
                                          if (var16 == 0) {
                                            break L15;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      throw new IOException();
                                    }
                                  }
                                  var2_int++;
                                  if (var16 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        }
                        stackOut_150_0 = 1;
                        stackIn_151_0 = stackOut_150_0;
                        break L11;
                      }
                      return stackIn_151_0 != 0;
                    }
                  }
                }
              } else {
                L37: {
                  if (0 != ((vh) this).e((byte) -22)) {
                    break L37;
                  } else {
                    if (((vh) this).c((byte) -79) != 0) {
                      break L37;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    }
                  }
                }
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0 != 0;
              }
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                L38: {
                  ((vh) this).field_r.b((byte) -41);
                  break L38;
                }
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L39: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L39;
                }
              }
              L40: {
                ((vh) this).field_d = -2;
                ((vh) this).field_r = null;
                ((vh) this).field_p = ((vh) this).field_p + 1;
                if (((vh) this).e((byte) -61) != 0) {
                  break L40;
                } else {
                  if (((vh) this).c((byte) -79) != 0) {
                    break L40;
                  } else {
                    stackOut_160_0 = 1;
                    stackIn_161_0 = stackOut_160_0;
                    return stackIn_161_0 != 0;
                  }
                }
              }
              stackOut_162_0 = 0;
              stackIn_163_0 = stackOut_162_0;
              return stackIn_163_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) (Object) var2_ref, "vh.F(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vh() {
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              L2: {
                if (~var2_int >= ~var4) {
                  break L2;
                } else {
                  var3[var2_int + (-1 + -var4)] = param0.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = new String(var3);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("vh.N(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    final void a(byte param0) {
        if (param0 <= 118) {
            field_s = null;
        }
        try {
            ((vh) this).field_r.b((byte) -105);
        } catch (Exception exception) {
        }
        ((vh) this).field_p = ((vh) this).field_p + 1;
        ((vh) this).field_r = null;
        ((vh) this).field_d = -1;
        ((vh) this).field_b = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "This password contains your email address, and would be easy to guess";
        field_t = -1;
    }
}
