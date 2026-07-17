/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class up extends lh {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int field_k;
    static String field_w;
    static int field_j;
    static int field_l;
    private ad field_z;
    static String field_L;
    private bm field_G;
    static String field_K;
    private byte[] field_E;
    private int field_y;
    static String field_I;
    static String field_v;
    private np field_t;
    static int field_m;
    private no field_r;
    private np field_n;
    private rn field_D;
    static String field_J;
    private gr field_H;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private ko field_q;
    private ko field_s;
    private long field_F;
    private boolean field_A;

    final void c(int param0) {
        ma var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var4 = Pool.field_O;
        if (((up) this).field_s != null) {
          if (((up) this).b((byte) -21) == null) {
            return;
          } else {
            var2 = ((up) this).field_q.c((byte) 111);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_c;
                    stackOut_7_0 = 0;
                    stackOut_7_1 = var3;
                    stackIn_25_0 = stackOut_7_0;
                    stackIn_25_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L5;
                            } else {
                              if (var3 >= ((up) this).field_z.field_d) {
                                break L5;
                              } else {
                                if (((up) this).field_z.field_s[var3] != 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var2.a((byte) -117);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((up) this).field_E[var3] == 0) {
                            gr discarded$6 = this.a(var3, 1, (byte) 25);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (((up) this).field_E[var3] == -1) {
                            gr discarded$7 = this.a(var3, 2, (byte) 25);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (((up) this).field_E[var3] == 1) {
                          var2.a((byte) -117);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = ((up) this).field_q.f((byte) -5);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_24_0 = param0;
                stackOut_24_1 = 82;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L1;
              }
              L8: {
                if (stackIn_25_0 > stackIn_25_1) {
                  break L8;
                } else {
                  var5 = null;
                  String discarded$8 = up.a(false, (CharSequence) null, (byte) 71);
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (null == ((up) this).field_t) {
          return;
        } else {
          L0: {
            if (param0 >= 78) {
              break L0;
            } else {
              field_J = null;
              break L0;
            }
          }
          L1: {
            ((up) this).field_B = true;
            if (null == ((up) this).field_s) {
              ((up) this).field_s = new ko();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        gr var3 = null;
        L0: {
          if (param0 == -18600) {
            break L0;
          } else {
            byte[] discarded$2 = ((up) this).a(100, (byte) -43);
            break L0;
          }
        }
        var3 = (gr) (Object) ((up) this).field_G.a(false, (long)param1);
        if (var3 != null) {
          return var3.e(54);
        } else {
          return 0;
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        boolean stackIn_24_0 = false;
        String stackIn_31_0 = null;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0 = false;
        String stackOut_30_0 = null;
        int stackOut_33_0 = 0;
        String stackOut_36_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = hq.a(91, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (qd.a(0, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (qd.a(0, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (param2 >= 96) {
                                    break L4;
                                  } else {
                                    int discarded$1 = up.a(-125);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (param1.length() <= var6) {
                                        break L7;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_23_0 = qd.a(0, (char) var7);
                                        stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (stackIn_24_0) {
                                                break L9;
                                              } else {
                                                var5 = 0;
                                                if (var8 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5++;
                                            break L8;
                                          }
                                          L10: {
                                            if (var5 < 2) {
                                              break L10;
                                            } else {
                                              if (!param0) {
                                                stackOut_30_0 = oh.field_g;
                                                stackIn_31_0 = stackOut_30_0;
                                                return stackIn_31_0;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_33_0 = -1;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L6;
                                  }
                                  if (stackIn_34_0 > ~var5) {
                                    stackOut_36_0 = lg.field_r;
                                    stackIn_37_0 = stackOut_36_0;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = lg.field_r;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    stackOut_12_0 = gp.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
              stackOut_7_0 = gp.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = gp.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("up.K(").append(param0).append(44);
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
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param2 + 41);
        }
        return stackIn_37_0;
    }

    final static int a(int param0) {
        return 111;
    }

    final static dd[] a(dd[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dd var3 = null;
        int var4 = 0;
        dd[] stackIn_6_0 = null;
        dd[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_5_0 = null;
        dd[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
                    break L3;
                  } else {
                    var3 = param0[var2_int];
                    param0[var2_int].field_B = 0;
                    var3.field_G = 0;
                    param0[var2_int].field_w = param0[var2_int].field_z;
                    stackOut_5_0 = (dd[]) param0;
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      stackIn_6_0[var2_int].field_y = param0[var2_int].field_A;
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_8_0 = (dd[]) param0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("up.D(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 12519 + 41);
        }
        return stackIn_9_0;
    }

    final ad b(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        if (null == ((up) this).field_z) {
          L0: {
            if (null != ((up) this).field_H) {
              break L0;
            } else {
              if (!((up) this).field_r.b((byte) -125)) {
                ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((up) this).field_H.field_F) {
            L1: {
              var5 = ((up) this).field_H.b(false);
              var2 = var5;
              if (!(((up) this).field_H instanceof dg)) {
                try {
                  L2: {
                    if (var5 != null) {
                      ((up) this).field_z = new ad(var5, ((up) this).field_y, ((up) this).field_o);
                      break L2;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = decompiledCaughtException;
                  ((up) this).field_r.a((byte) -123);
                  ((up) this).field_z = null;
                  if (((up) this).field_r.b((byte) -125)) {
                    ((up) this).field_H = null;
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                      return null;
                    }
                  } else {
                    ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                    return null;
                  }
                }
                if (((up) this).field_n != null) {
                  dg discarded$1 = ((up) this).field_D.a(var5, ((up) this).field_n, (byte) -128, ((up) this).field_k);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L3: {
                    if (var5 != null) {
                      ((up) this).field_z = new ad(var5, ((up) this).field_y, ((up) this).field_o);
                      if (((up) this).field_u == ((up) this).field_z.field_h) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((up) this).field_z = null;
                  if (!((up) this).field_r.b((byte) -125)) {
                    ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((up) this).field_H = null;
                      return null;
                    }
                  } else {
                    ((up) this).field_H = null;
                    return null;
                  }
                }
                break L1;
              }
            }
            L4: {
              if (param0 == -21) {
                break L4;
              } else {
                up.a(false);
                break L4;
              }
            }
            L5: {
              ((up) this).field_H = null;
              if (((up) this).field_t == null) {
                break L5;
              } else {
                ((up) this).field_E = new byte[((up) this).field_z.field_d];
                break L5;
              }
            }
            return ((up) this).field_z;
          } else {
            return null;
          }
        } else {
          return ((up) this).field_z;
        }
    }

    public static void a(boolean param0) {
        field_J = null;
        field_M = null;
        field_I = null;
        field_w = null;
        field_L = null;
        field_p = null;
        field_v = null;
        field_K = null;
        field_w = null;
    }

    private final gr a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        Object stackIn_92_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        L0: {
          var10 = Pool.field_O;
          var4 = (Object) (Object) (gr) (Object) ((up) this).field_G.a(false, (long)param0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((gr) var4).field_x) {
                break L0;
              } else {
                if (!((gr) var4).field_F) {
                  break L0;
                } else {
                  ((gr) var4).a((byte) -117);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  if (param1 == 1) {
                    if (((up) this).field_t != null) {
                      var4 = (Object) (Object) ((up) this).field_D.a((byte) 58, ((up) this).field_t, param0);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (param1 == 2) {
                      if (((up) this).field_t == null) {
                        throw new RuntimeException();
                      } else {
                        if (((up) this).field_E[param0] != -1) {
                          throw new RuntimeException();
                        } else {
                          if (!((up) this).field_r.a(20)) {
                            var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, false, -154018400);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              L4: {
                if (null == ((up) this).field_t) {
                  break L4;
                } else {
                  if (((up) this).field_E[param0] != -1) {
                    var4 = (Object) (Object) ((up) this).field_D.a(121, ((up) this).field_t, param0);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (!((up) this).field_r.b((byte) -125)) {
                var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                if (var10 == 0) {
                  break L2;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            ((up) this).field_G.a((byte) -114, (ma) var4, (long)param0);
            break L1;
          }
        }
        if (!((gr) var4).field_F) {
          var5 = ((gr) var4).b(false);
          if (var4 instanceof dg) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length > 2) {
                      oq.field_B.reset();
                      oq.field_B.update(var5, 0, -2 + var5.length);
                      var6_int = (int)oq.field_B.getValue();
                      if (var6_int == ((up) this).field_z.field_w[param0]) {
                        L7: {
                          L8: {
                            if (null == ((up) this).field_z.field_a) {
                              break L8;
                            } else {
                              if (null == ((up) this).field_z.field_a[param0]) {
                                break L8;
                              } else {
                                var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                                var8 = jr.a(-2 + var5.length, (byte) -83, var5, 0);
                                var9 = 0;
                                L9: while (true) {
                                  if (64 <= var9) {
                                    break L8;
                                  } else {
                                    stackOut_77_0 = ~var7_ref_byte__[var9];
                                    stackOut_77_1 = ~var8[var9];
                                    stackIn_82_0 = stackOut_77_0;
                                    stackIn_82_1 = stackOut_77_1;
                                    stackIn_78_0 = stackOut_77_0;
                                    stackIn_78_1 = stackOut_77_1;
                                    if (var10 != 0) {
                                      break L7;
                                    } else {
                                      if (stackIn_78_0 == stackIn_78_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L9;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_81_0 = var5[-1 + var5.length] & 255;
                          stackOut_81_1 = (255 & var5[-2 + var5.length]) << 8;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L7;
                        }
                        var7 = stackIn_82_0 + stackIn_82_1;
                        if (var7 == (((up) this).field_z.field_i[param0] & 65535)) {
                          L10: {
                            if (((up) this).field_E[param0] != 1) {
                              L11: {
                                if (((up) this).field_E[param0] == 0) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              ((up) this).field_E[param0] = (byte) 1;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L12: {
                            if (!((gr) var4).field_x) {
                              ((gr) var4).a((byte) -117);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          stackOut_91_0 = var4;
                          stackIn_92_0 = stackOut_91_0;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((up) this).field_E[param0] = (byte) -1;
              ((gr) var4).a((byte) -117);
              if (!((gr) var4).field_x) {
                return null;
              } else {
                L13: {
                  if (!((up) this).field_r.b((byte) -125)) {
                    var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                    ((up) this).field_G.a((byte) -127, (ma) var4, (long)param0);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return null;
              }
            }
            return (gr) (Object) stackIn_92_0;
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (2 >= var5.length) {
                      break L15;
                    } else {
                      oq.field_B.reset();
                      oq.field_B.update(var5, 0, var5.length + -2);
                      var6_int = (int)oq.field_B.getValue();
                      if (var6_int == ((up) this).field_z.field_w[param0]) {
                        L16: {
                          if (((up) this).field_z.field_a == null) {
                            break L16;
                          } else {
                            if (null == ((up) this).field_z.field_a[param0]) {
                              break L16;
                            } else {
                              var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                              var8 = jr.a(var5.length + -2, (byte) -76, var5, 0);
                              var9 = 0;
                              L17: while (true) {
                                if (64 <= var9) {
                                  break L16;
                                } else {
                                  stackOut_45_0 = ~var7_ref_byte__[var9];
                                  stackOut_45_1 = ~var8[var9];
                                  stackIn_62_0 = stackOut_45_0;
                                  stackIn_62_1 = stackOut_45_1;
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L14;
                                  } else {
                                    if (stackIn_46_0 != stackIn_46_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L17;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((up) this).field_r.field_e = 0;
                        ((up) this).field_r.field_a = 0;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              ((up) this).field_r.a((byte) -53);
              ((gr) var4).a((byte) -117);
              if (((gr) var4).field_x) {
                if (((up) this).field_r.b((byte) -125)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                  ((up) this).field_G.a((byte) -124, (ma) var4, (long)param0);
                  return null;
                }
              } else {
                return null;
              }
            }
            L18: {
              L19: {
                if (decompiledRegionSelector0 == 0) {
                  break L19;
                } else {
                  var5[var5.length - 2] = (byte)(((up) this).field_z.field_i[param0] >>> 8);
                  var5[var5.length + -1] = (byte)((up) this).field_z.field_i[param0];
                  if (((up) this).field_t != null) {
                    dg discarded$1 = ((up) this).field_D.a(var5, ((up) this).field_t, (byte) -98, param0);
                    stackOut_61_0 = ~((up) this).field_E[param0];
                    stackOut_61_1 = -2;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              if (stackIn_62_0 == stackIn_62_1) {
                break L18;
              } else {
                ((up) this).field_E[param0] = (byte) 1;
                break L18;
              }
            }
            L20: {
              if (((gr) var4).field_x) {
                break L20;
              } else {
                ((gr) var4).a((byte) -117);
                break L20;
              }
            }
            return (gr) var4;
          }
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        gr var2 = null;
        ma var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        byte stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        byte stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_69_0 = 0;
        byte stackIn_69_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_90_0 = 0;
        boolean stackIn_100_0 = false;
        boolean stackIn_101_0 = false;
        byte stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        byte stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_89_0 = 0;
        boolean stackOut_99_0 = false;
        L0: {
          var5 = Pool.field_O;
          if (((up) this).field_s == null) {
            break L0;
          } else {
            if (null == ((up) this).b((byte) -21)) {
              return;
            } else {
              L1: {
                if (((up) this).field_C) {
                  break L1;
                } else {
                  L2: {
                    if (!((up) this).field_B) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((up) this).field_s.c((byte) -58);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_c;
                                stackOut_8_0 = ((up) this).field_E[var4];
                                stackOut_8_1 = 1;
                                stackIn_24_0 = stackOut_8_0;
                                stackIn_24_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var5 == 0) {
                                  L7: {
                                    if (stackIn_24_0 == stackIn_24_1) {
                                      break L7;
                                    } else {
                                      gr discarded$6 = this.a(var4, 2, (byte) 25);
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    L9: {
                                      if (((up) this).field_E[var4] == 1) {
                                        break L9;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var3.a((byte) -117);
                                    break L8;
                                  }
                                  var3 = ((up) this).field_s.f((byte) -5);
                                  continue L3;
                                } else {
                                  if (stackIn_9_0 >= stackIn_9_1) {
                                    break L5;
                                  } else {
                                    stackOut_10_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                    stackIn_45_0 = stackOut_10_0;
                                    stackIn_11_0 = stackOut_10_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L10: {
                                        if (stackIn_11_0 == 0) {
                                          ((up) this).field_x = ((up) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((up) this).field_r.a(20)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((up) this).field_E[((up) this).field_x] == 1) {
                                          break L12;
                                        } else {
                                          gr discarded$7 = this.a(((up) this).field_x, 2, (byte) 25);
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (((up) this).field_E[((up) this).field_x] == 1) {
                                          break L13;
                                        } else {
                                          var3 = new ma();
                                          var3.field_c = (long)((up) this).field_x;
                                          var2_int = 0;
                                          ((up) this).field_s.b((byte) 96, var3);
                                          break L13;
                                        }
                                      }
                                      ((up) this).field_x = ((up) this).field_x + 1;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L14: while (true) {
                              if (((up) this).field_x >= ((up) this).field_z.field_s.length) {
                                break L5;
                              } else {
                                stackOut_32_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                stackIn_45_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  L15: {
                                    if (stackIn_33_0 == 0) {
                                      ((up) this).field_x = ((up) this).field_x + 1;
                                      if (var5 == 0) {
                                        continue L14;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (((up) this).field_r.a(20)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L16;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (((up) this).field_E[((up) this).field_x] == 1) {
                                      break L17;
                                    } else {
                                      gr discarded$8 = this.a(((up) this).field_x, 2, (byte) 25);
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (((up) this).field_E[((up) this).field_x] == 1) {
                                      break L18;
                                    } else {
                                      var3 = new ma();
                                      var3.field_c = (long)((up) this).field_x;
                                      var2_int = 0;
                                      ((up) this).field_s.b((byte) 96, var3);
                                      break L18;
                                    }
                                  }
                                  ((up) this).field_x = ((up) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L14;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_44_0 = var2_int;
                          stackIn_45_0 = stackOut_44_0;
                          break L4;
                        }
                        L19: {
                          if (stackIn_45_0 != 0) {
                            ((up) this).field_B = false;
                            ((up) this).field_x = 0;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((up) this).field_s = null;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2_int = 1;
              var3 = ((up) this).field_s.c((byte) 78);
              L20: while (true) {
                L21: {
                  L22: {
                    L23: {
                      if (var3 == null) {
                        break L23;
                      } else {
                        var4 = (int)var3.field_c;
                        stackOut_53_0 = 0;
                        stackOut_53_1 = ((up) this).field_E[var4];
                        stackIn_69_0 = stackOut_53_0;
                        stackIn_69_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (var5 == 0) {
                          L24: {
                            if (stackIn_69_0 != stackIn_69_1) {
                              break L24;
                            } else {
                              gr discarded$9 = this.a(var4, 1, (byte) 25);
                              break L24;
                            }
                          }
                          L25: {
                            L26: {
                              if (((up) this).field_E[var4] != 0) {
                                break L26;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            var3.a((byte) -117);
                            break L25;
                          }
                          var3 = ((up) this).field_s.f((byte) -5);
                          continue L20;
                        } else {
                          if (stackIn_54_0 >= stackIn_54_1) {
                            break L22;
                          } else {
                            stackOut_55_0 = ((up) this).field_z.field_s[((up) this).field_x];
                            stackIn_90_0 = stackOut_55_0;
                            stackIn_56_0 = stackOut_55_0;
                            if (var5 != 0) {
                              break L21;
                            } else {
                              L27: {
                                if (stackIn_56_0 != 0) {
                                  break L27;
                                } else {
                                  ((up) this).field_x = ((up) this).field_x + 1;
                                  if (var5 == 0) {
                                    break L23;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (((up) this).field_D.field_e >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L22;
                                  } else {
                                    break L28;
                                  }
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (((up) this).field_E[((up) this).field_x] != 0) {
                                  break L29;
                                } else {
                                  gr discarded$10 = this.a(((up) this).field_x, 1, (byte) 25);
                                  break L29;
                                }
                              }
                              L30: {
                                if (((up) this).field_E[((up) this).field_x] != 0) {
                                  break L30;
                                } else {
                                  var3 = new ma();
                                  var3.field_c = (long)((up) this).field_x;
                                  ((up) this).field_s.b((byte) -64, var3);
                                  var2_int = 0;
                                  break L30;
                                }
                              }
                              ((up) this).field_x = ((up) this).field_x + 1;
                              if (var5 == 0) {
                                break L23;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                    }
                    L31: while (true) {
                      if (((up) this).field_x >= ((up) this).field_z.field_s.length) {
                        break L22;
                      } else {
                        stackOut_77_0 = ((up) this).field_z.field_s[((up) this).field_x];
                        stackIn_90_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (var5 != 0) {
                          break L21;
                        } else {
                          L32: {
                            if (stackIn_78_0 != 0) {
                              break L32;
                            } else {
                              ((up) this).field_x = ((up) this).field_x + 1;
                              if (var5 == 0) {
                                continue L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: {
                            if (((up) this).field_D.field_e >= 250) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L22;
                              } else {
                                break L33;
                              }
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            if (((up) this).field_E[((up) this).field_x] != 0) {
                              break L34;
                            } else {
                              gr discarded$11 = this.a(((up) this).field_x, 1, (byte) 25);
                              break L34;
                            }
                          }
                          L35: {
                            if (((up) this).field_E[((up) this).field_x] != 0) {
                              break L35;
                            } else {
                              var3 = new ma();
                              var3.field_c = (long)((up) this).field_x;
                              ((up) this).field_s.b((byte) -64, var3);
                              var2_int = 0;
                              break L35;
                            }
                          }
                          ((up) this).field_x = ((up) this).field_x + 1;
                          if (var5 == 0) {
                            continue L31;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  stackOut_89_0 = var2_int;
                  stackIn_90_0 = stackOut_89_0;
                  break L21;
                }
                if (stackIn_90_0 == 0) {
                  break L0;
                } else {
                  ((up) this).field_C = false;
                  ((up) this).field_x = 0;
                  break L0;
                }
              }
            }
          }
        }
        if (((up) this).field_A) {
          if (~rl.a((byte) -124) <= ~((up) this).field_F) {
            var2 = (gr) (Object) ((up) this).field_G.a(0);
            L36: while (true) {
              if (var2 != null) {
                stackOut_99_0 = var2.field_F;
                stackIn_101_0 = stackOut_99_0;
                stackIn_100_0 = stackOut_99_0;
                if (var5 == 0) {
                  L37: {
                    if (stackIn_101_0) {
                      break L37;
                    } else {
                      L38: {
                        if (!var2.field_C) {
                          break L38;
                        } else {
                          if (!var2.field_x) {
                            throw new RuntimeException();
                          } else {
                            var2.a((byte) -117);
                            if (var5 == 0) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      var2.field_C = true;
                      break L37;
                    }
                  }
                  var2 = (gr) (Object) ((up) this).field_G.b(-1);
                  continue L36;
                } else {
                  var2_int = stackIn_100_0 ? 1 : 0;
                  return;
                }
              } else {
                ((up) this).field_F = rl.a((byte) -107) + 1000L;
                var2_int = 86 % ((param0 - 82) / 40);
                return;
              }
            }
          } else {
            var2_int = 86 % ((param0 - 82) / 40);
            return;
          }
        } else {
          var2_int = 86 % ((param0 - 82) / 40);
          return;
        }
    }

    final byte[] a(int param0, byte param1) {
        gr var3 = null;
        byte[] var4 = null;
        var3 = this.a(param0, 0, (byte) 25);
        if (var3 != null) {
          if (param1 != 19) {
            return null;
          } else {
            var4 = var3.b(false);
            var3.a((byte) -117);
            return var4;
          }
        } else {
          return null;
        }
    }

    up(int param0, np param1, np param2, no param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((up) this).field_G = new bm(16);
        ((up) this).field_x = 0;
        ((up) this).field_q = new ko();
        ((up) this).field_F = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((up) this).field_k = param0;
                ((up) this).field_t = param1;
                if (null != ((up) this).field_t) {
                  break L2;
                } else {
                  ((up) this).field_C = false;
                  if (Pool.field_O == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((up) this).field_C = true;
              ((up) this).field_s = new ko();
              break L1;
            }
            L3: {
              ((up) this).field_o = param6;
              ((up) this).field_n = param2;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((up) this).field_A = stackIn_7_1 != 0;
              ((up) this).field_y = param5;
              ((up) this).field_u = param7;
              ((up) this).field_r = param3;
              ((up) this).field_D = param4;
              if (((up) this).field_n == null) {
                break L4;
              } else {
                ((up) this).field_H = (gr) (Object) ((up) this).field_D.a(92, ((up) this).field_n, ((up) this).field_k);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("up.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[7];
        field_K = "The invitation has been withdrawn.";
        field_v = "Sound: ";
        field_I = "<%0> has joined your game.";
        field_L = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        field_w = "OVER <%0>";
        field_J = "Rematch";
    }
}
