/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends br {
    private int field_m;
    static int[] field_i;
    static ja[] field_k;
    private int field_l;
    static String field_j;
    private int field_h;
    private int field_g;
    static int[] field_f;

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ac var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ac.b(param1.a("headers.packvorbis", "", false));
              if (param0 == 7478) {
                break L1;
              } else {
                field_k = (ja[]) null;
                break L1;
              }
            }
            var2 = ac.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ui.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void c(int param0) {
        int discarded$0 = 0;
        try {
            if (param0 != 9307) {
                discarded$0 = this.a(105);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ui.H(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ui.a(true, false);
                break L1;
              }
            }
            stackIn_3_0 = 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = -3 % ((-42 - param0) / 33);
                if (-31 >= (Math.abs(param1 + -this.field_h) ^ -1)) {
                  break L2;
                } else {
                  if ((Math.abs(-this.field_m + param2) ^ -1) <= -31) {
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        ja[] stackIn_30_0 = null;
        ef stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        ef stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int[] var13 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_k = (ja[]) null;
                break L1;
              }
            }
            L2: {
              if (null == op.field_m) {
                break L2;
              } else {
                if (1 >= op.field_m.field_t) {
                  break L2;
                } else {
                  L3: {
                    if (pl.field_I == 10) {
                      stackIn_8_0 = 1;
                      break L3;
                    } else {
                      stackIn_8_0 = 0;
                      break L3;
                    }
                  }
                  L4: {
                    var2_int = stackIn_8_0;
                    if (!iq.field_f) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      if (var2_int != 0) {
                        stackIn_14_0 = 1;
                        break L4;
                      } else {
                        stackIn_14_0 = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      L7: {
                        var3 = stackIn_14_0;
                        if (!tj.field_f) {
                          break L7;
                        } else {
                          if (param0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (0 >= id.field_D) {
                          break L8;
                        } else {
                          if (20 > wf.field_m % 40) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var3 == 0) {
                          break L9;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L9;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackIn_26_0 = 0;
                      break L5;
                    }
                    stackIn_26_0 = 1;
                    break L5;
                  }
                  L10: {
                    var4 = stackIn_26_0;
                    if (var4 != 0) {
                      stackIn_30_0 = rl.field_a;
                      break L10;
                    } else {
                      stackIn_30_0 = oi.field_h;
                      break L10;
                    }
                  }
                  L11: {
                    var5 = stackIn_30_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var13 = new int[4];
                    oo.a(var13);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_33_0 = qp.field_w;

                    stackIn_33_1 = pb.field_i;

                    stackIn_33_2 = -var5[2].field_x + 635;

                    stackIn_33_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_34_0 = (ef) ((Object) stackIn_33_0);
                      stackIn_34_1 = (String) ((Object) stackIn_33_1);
                      stackIn_34_2 = stackIn_33_2;
                      stackIn_34_3 = stackIn_33_3;
                      stackIn_34_4 = 16777215;
                      break L11;
                    } else {
                      stackIn_34_0 = (ef) ((Object) stackIn_33_0);
                      stackIn_34_1 = (String) ((Object) stackIn_33_1);
                      stackIn_34_2 = stackIn_33_2;
                      stackIn_34_3 = stackIn_33_3;
                      stackIn_34_4 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      ((ef) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, -1);
                      oo.b(var13);
                      if (!hh.field_b) {
                        break L13;
                      } else {
                        if (!sq.field_N) {
                          break L13;
                        } else {
                          if (df.field_I) {
                            break L13;
                          } else {
                            stackIn_40_0 = 1;
                            break L12;
                          }
                        }
                      }
                    }
                    stackIn_40_0 = 0;
                    break L12;
                  }
                  L14: {
                    L15: {
                      var9 = stackIn_40_0;
                      if (!param0) {
                        break L15;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L15;
                        } else {
                          if (var9 != 0) {
                            break L15;
                          } else {
                            stackIn_46_0 = 1;
                            break L14;
                          }
                        }
                      }
                    }
                    stackIn_46_0 = 0;
                    break L14;
                  }
                  dd.a(stackIn_46_0 != 0, 0);
                  if (!re.field_b) {
                    break L2;
                  } else {
                    if (var9 != 0) {
                      L16: {
                        L17: {
                          if (!param0) {
                            break L17;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L17;
                            } else {
                              stackIn_56_0 = 1;
                              break L16;
                            }
                          }
                        }
                        stackIn_56_0 = 0;
                        break L16;
                      }
                      kg.a(stackIn_56_0 != 0, (byte) 117);
                      break L2;
                    } else {
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
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -29394) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -57;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        try {
            field_f = null;
            field_i = null;
            field_j = null;
            field_k = null;
            if (param0 > -41) {
                field_j = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ui.F(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  if (mh.field_c != null) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              io.field_b = false;
              break L1;
            }
            L3: {
              if (!param1) {
                if (null != mh.field_c) {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    break L3;
                  } else {
                    if (-1 > (sq.field_Q ^ -1)) {
                      sq.field_Q = sq.field_Q - 1;
                      break L3;
                    } else {
                      if (da.field_a < b.field_d) {
                        L4: {
                          if (da.field_a != 0) {
                            break L4;
                          } else {
                            jq.a(false, (byte) -20);
                            break L4;
                          }
                        }
                        da.field_a = da.field_a + 1;
                        break L3;
                      } else {
                        var2_int = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  }
                } else {
                  if (ej.field_n == null) {
                    io.field_b = false;
                    if (-1 > (sq.field_Q ^ -1)) {
                      sq.field_Q = sq.field_Q - 1;
                      break L3;
                    } else {
                      if ((da.field_a ^ -1) >= -1) {
                        if (mh.field_h >= b.field_d) {
                          break L3;
                        } else {
                          L5: {
                            if (0 != mh.field_h) {
                              break L5;
                            } else {
                              wf.a(6835);
                              break L5;
                            }
                          }
                          mh.field_h = mh.field_h + 1;
                          break L3;
                        }
                      } else {
                        da.field_a = da.field_a - 1;
                        break L3;
                      }
                    }
                  } else {
                    if (0 < mh.field_h) {
                      mh.field_h = mh.field_h - 1;
                      break L3;
                    } else {
                      if ((da.field_a ^ -1) >= -1) {
                        if (sq.field_Q < b.field_d) {
                          L6: {
                            if (0 != sq.field_Q) {
                              break L6;
                            } else {
                              jq.a(true, (byte) 126);
                              break L6;
                            }
                          }
                          sq.field_Q = sq.field_Q + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        da.field_a = da.field_a - 1;
                        break L3;
                      }
                    }
                  }
                }
              } else {
                if (-1 > (mh.field_h ^ -1)) {
                  mh.field_h = mh.field_h - 1;
                  break L3;
                } else {
                  if (0 >= sq.field_Q) {
                    if (da.field_a <= 0) {
                      break L3;
                    } else {
                      da.field_a = da.field_a - 1;
                      break L3;
                    }
                  } else {
                    sq.field_Q = sq.field_Q - 1;
                    break L3;
                  }
                }
              }
            }
            var2_int = -72 / ((-39 - param0) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.G(" + param0 + ',' + param1 + ')');
        }
    }

    ui(int param0, int param1, int param2) {
        try {
            this.field_l = param0;
            this.field_g = param1;
            this.field_h = 24 * this.field_l - (-12 + -this.a(-29394));
            this.field_m = 12 + (24 * this.field_g - -this.a(-29394));
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
