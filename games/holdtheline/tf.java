/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends tj {
    private int field_s;
    private int[] field_u;
    static uf field_A;
    private boolean field_w;
    kf field_q;
    private int field_B;
    private int field_D;
    private int field_y;
    private vi field_m;
    private kf field_p;
    static en field_n;
    kf field_C;
    private vi field_z;
    static String field_r;
    private boolean field_x;
    private vi field_t;
    private int[] field_v;
    static uf field_o;

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = HoldTheLine.field_D;
          if (((tf) this).field_y <= 0) {
            if (1048576 <= ((tf) this).field_y) {
              break L0;
            } else {
              if (null != ((tf) this).field_m) {
                ((tf) this).field_C.a(param0);
                break L0;
              } else {
                if (1048576 <= ((tf) this).field_y) {
                  break L0;
                } else {
                  if (null == ((tf) this).field_m) {
                    break L0;
                  } else {
                    ((tf) this).field_C.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (1048576 <= ((tf) this).field_y) {
              break L0;
            } else {
              if (null == ((tf) this).field_m) {
                break L0;
              } else {
                ((tf) this).field_C.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (((tf) this).field_s <= 0) {
            break L1;
          } else {
            if (null != ((tf) this).field_t) {
              ((tf) this).field_p.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!((tf) this).field_x) {
            break L2;
          } else {
            L3: {
              if (0 >= ((tf) this).field_D) {
                break L3;
              } else {
                if (!((tf) this).field_q.c((byte) -128)) {
                  ((tf) this).field_x = false;
                  ((tf) this).field_z = null;
                  ((tf) this).field_D = -((tf) this).field_D;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((tf) this).field_D >= 0) {
              break L2;
            } else {
              if (!((tf) this).field_C.c((byte) 39)) {
                ((tf) this).field_x = false;
                ((tf) this).field_D = -((tf) this).field_D;
                ((tf) this).field_m = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (0 == ((tf) this).field_D) {
            break L4;
          } else {
            ((tf) this).field_y = ((tf) this).field_y + ((tf) this).field_D * param0;
            if (((tf) this).field_y >= 1048576) {
              ((tf) this).field_y = 1048576;
              if (!((tf) this).field_x) {
                ((tf) this).field_D = 0;
                if (!((tf) this).field_w) {
                  L5: {
                    if (null == ((tf) this).field_m) {
                      break L5;
                    } else {
                      ((tf) this).field_C.f(-127);
                      break L5;
                    }
                  }
                  ((tf) this).field_m = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              if (0 < ((tf) this).field_y) {
                break L4;
              } else {
                ((tf) this).field_y = 0;
                if (((tf) this).field_x) {
                  break L4;
                } else {
                  ((tf) this).field_D = 0;
                  if (!((tf) this).field_w) {
                    L6: {
                      if (null == ((tf) this).field_z) {
                        break L6;
                      } else {
                        ((tf) this).field_q.f(-127);
                        break L6;
                      }
                    }
                    ((tf) this).field_z = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
          }
        }
    }

    final static hj[] a(int param0, gn param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        hj[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (qg.a(param2, param0, (byte) -27, param1)) {
              java.awt.Container discarded$4 = tf.e(-27);
              int discarded$5 = -128;
              stackOut_3_0 = jd.h();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hj[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("tf.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + false + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, vi param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param0 < -11) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((tf) this).a(-93, (vi) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == ((tf) this).field_z) {
                  break L3;
                } else {
                  if (((tf) this).field_m != param1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("tf.J(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final tj b() {
        return null;
    }

    final synchronized int c() {
        return 2;
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
        int stackIn_30_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            if (((tf) this).field_B <= 0) {
              ((tf) this).a(param2);
              return;
            } else {
              L1: {
                if (((tf) this).field_x) {
                  L2: {
                    if (0 >= ((tf) this).field_D) {
                      break L2;
                    } else {
                      if (((tf) this).field_q.c((byte) -127)) {
                        break L2;
                      } else {
                        ((tf) this).field_D = -((tf) this).field_D;
                        ((tf) this).field_x = false;
                        ((tf) this).field_z = null;
                        break L1;
                      }
                    }
                  }
                  if (((tf) this).field_D >= 0) {
                    break L1;
                  } else {
                    if (((tf) this).field_C.c((byte) 101)) {
                      break L1;
                    } else {
                      ((tf) this).field_D = -((tf) this).field_D;
                      ((tf) this).field_x = false;
                      ((tf) this).field_m = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (((tf) this).field_y >> 12) * ((tf) this).field_B / 256;
                var5 = ((tf) this).field_B + -var4_int;
                if (((tf) this).field_D == 0) {
                  break L3;
                } else {
                  ((tf) this).field_y = ((tf) this).field_y + param2 * ((tf) this).field_D;
                  if (((tf) this).field_y < 1048576) {
                    if (0 < ((tf) this).field_y) {
                      break L3;
                    } else {
                      ((tf) this).field_y = 0;
                      if (((tf) this).field_x) {
                        break L3;
                      } else {
                        ((tf) this).field_D = 0;
                        if (((tf) this).field_w) {
                          break L3;
                        } else {
                          L4: {
                            if (((tf) this).field_z != null) {
                              ((tf) this).field_q.f(-124);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((tf) this).field_z = null;
                          break L3;
                        }
                      }
                    }
                  } else {
                    ((tf) this).field_y = 1048576;
                    if (((tf) this).field_x) {
                      break L3;
                    } else {
                      ((tf) this).field_D = 0;
                      if (((tf) this).field_w) {
                        break L3;
                      } else {
                        L5: {
                          if (null == ((tf) this).field_m) {
                            break L5;
                          } else {
                            ((tf) this).field_C.f(-127);
                            break L5;
                          }
                        }
                        ((tf) this).field_m = null;
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!lo.field_t) {
                  stackOut_29_0 = param2;
                  stackIn_30_0 = stackOut_29_0;
                  break L6;
                } else {
                  stackOut_28_0 = param2 << 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_30_0;
                if (((tf) this).field_s >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (((tf) this).field_z != null) {
                      break L8;
                    } else {
                      if (((tf) this).field_m != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 == 256) {
                      ((tf) this).field_C.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == ((tf) this).field_v) {
                            break L10;
                          } else {
                            if (var6 > ((tf) this).field_v.length) {
                              break L10;
                            } else {
                              bc.a(((tf) this).field_v, 0, var6);
                              bc.a(((tf) this).field_u, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((tf) this).field_u = new int[var6];
                        ((tf) this).field_v = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((tf) this).field_q.b(((tf) this).field_v, 0, param2);
                        ((tf) this).field_C.b(((tf) this).field_u, 0, param2);
                        if (lo.field_t) {
                          param1 = param1 << 1;
                          stackOut_43_0 = param1 << 1;
                          stackIn_44_0 = stackOut_43_0;
                          break L11;
                        } else {
                          stackOut_42_0 = param1;
                          stackIn_44_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_44_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (((tf) this).field_v[var8] * var4_int + var5 * ((tf) this).field_u[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((tf) this).field_q.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (((tf) this).field_t == null) {
                  break L13;
                } else {
                  if (0 == ((tf) this).field_s) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((tf) this).field_v == null) {
                          break L15;
                        } else {
                          if (((tf) this).field_v.length < var6) {
                            break L15;
                          } else {
                            bc.a(((tf) this).field_v, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((tf) this).field_u = new int[var6];
                      ((tf) this).field_v = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((tf) this).field_p.b(((tf) this).field_v, 0, param2);
                      if (!lo.field_t) {
                        stackOut_56_0 = param1;
                        stackIn_57_0 = stackOut_56_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_55_0 = param1 << 1;
                        stackIn_57_0 = stackOut_55_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_57_0;
                    var8 = ((tf) this).field_s * ((tf) this).field_B / 256;
                    var9 = -var8 + ((tf) this).field_B;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] + var8 * ((tf) this).field_v[var10] >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var4;
            stackOut_61_1 = new StringBuilder().append("tf.A(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L18;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L18;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 0) {
            field_o = null;
        }
        if (!(null == fm.field_a)) {
            return (java.awt.Container) (Object) fm.field_a;
        }
        return (java.awt.Container) (Object) en.a(111);
    }

    final tj a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        ((tf) this).field_B = param0;
        if (param1 != -32284) {
            int discarded$0 = ((tf) this).c();
        }
    }

    public static void f() {
        field_r = null;
        int var1 = 19;
        field_n = null;
        field_A = null;
        field_o = null;
    }

    final static float a(byte param0, float param1, wc[] param2) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        float stackIn_7_0 = 0.0f;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_6_0 = 0.0f;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var3_float = 0.0f;
            var4 = (int)param1;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                L2: {
                  if (param1 == (float)var4) {
                    break L2;
                  } else {
                    var3_float = var3_float + param2[var4].f(50) * ((float)(-var4) + param1);
                    break L2;
                  }
                }
                stackOut_6_0 = var3_float;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_float = var3_float + param2[var5].f(50);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("tf.E(").append(117).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(kf param0, byte param1, kf param2) {
        try {
            ((tf) this).field_q = param0;
            ((tf) this).field_y = 1048576;
            int var4_int = 91;
            ((tf) this).field_C = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "tf.K(" + (param0 != null ? "{...}" : "null") + ',' + 126 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, kf param1, int param2, int param3) {
        try {
            param1.a((byte) 108, -1, param3);
            if (param2 != 17945) {
                ((tf) this).field_y = 96;
            }
            param1.b(param0, param2 + -17943);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "tf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, int param1, vi param2, byte param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        kf stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        vi stackIn_41_2 = null;
        kf stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        vi stackIn_42_2 = null;
        kf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        vi stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        kf stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        vi stackIn_51_2 = null;
        kf stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        vi stackIn_52_2 = null;
        kf stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        vi stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        kf stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        vi stackOut_50_2 = null;
        kf stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        vi stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        kf stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        vi stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        kf stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        vi stackOut_40_2 = null;
        kf stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        vi stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        kf stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        vi stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!((tf) this).field_x) {
                break L1;
              } else {
                if (param4) {
                  L2: {
                    if (((tf) this).field_D > 0) {
                      L3: {
                        if (((tf) this).field_z != null) {
                          ((tf) this).field_q.f(-127);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((tf) this).field_z = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        ((tf) this).field_q.a(param3 + -2128026886, param2, false);
                        this.a(param1, ((tf) this).field_q, 17945, param5);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((tf) this).field_m != null) {
                          ((tf) this).field_C.f(-125);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((tf) this).field_m = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        ((tf) this).field_C.a(-2128027000, param2, false);
                        this.a(param1, ((tf) this).field_C, 17945, param5);
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
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param4) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            ((tf) this).field_x = stackIn_19_1 != 0;
            if (((tf) this).field_z != param2) {
              if (param2 == ((tf) this).field_m) {
                ((tf) this).field_D = -param0;
                this.a(param1, ((tf) this).field_C, 17945, param5);
                return;
              } else {
                L6: {
                  if (param3 == -114) {
                    break L6;
                  } else {
                    var9 = null;
                    ((tf) this).a(85, 112, (vi) null, (byte) -26, false, -91);
                    break L6;
                  }
                }
                L7: {
                  if (((tf) this).field_z == null) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (((tf) this).field_m != null) {
                      L8: {
                        if (((tf) this).field_y >= 524288) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L8;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_34_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (((tf) this).field_m != null) {
                        ((tf) this).field_C.f(-125);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      ((tf) this).field_m = param2;
                      if (param2 != null) {
                        L12: {
                          stackOut_50_0 = ((tf) this).field_C;
                          stackOut_50_1 = -2128027000;
                          stackOut_50_2 = (vi) param2;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          stackIn_52_2 = stackOut_50_2;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          stackIn_51_2 = stackOut_50_2;
                          if (param4) {
                            stackOut_52_0 = (kf) (Object) stackIn_52_0;
                            stackOut_52_1 = stackIn_52_1;
                            stackOut_52_2 = (vi) (Object) stackIn_52_2;
                            stackOut_52_3 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            stackIn_53_3 = stackOut_52_3;
                            break L12;
                          } else {
                            stackOut_51_0 = (kf) (Object) stackIn_51_0;
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = (vi) (Object) stackIn_51_2;
                            stackOut_51_3 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            stackIn_53_2 = stackOut_51_2;
                            stackIn_53_3 = stackOut_51_3;
                            break L12;
                          }
                        }
                        ((kf) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3 != 0);
                        this.a(param1, ((tf) this).field_C, 17945, param5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((tf) this).field_D = -param0;
                    break L9;
                  } else {
                    L13: {
                      if (null == ((tf) this).field_z) {
                        break L13;
                      } else {
                        ((tf) this).field_q.f(param3 ^ 13);
                        break L13;
                      }
                    }
                    L14: {
                      ((tf) this).field_z = param2;
                      if (param2 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_40_0 = ((tf) this).field_q;
                          stackOut_40_1 = -2128027000;
                          stackOut_40_2 = (vi) param2;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          if (param4) {
                            stackOut_42_0 = (kf) (Object) stackIn_42_0;
                            stackOut_42_1 = stackIn_42_1;
                            stackOut_42_2 = (vi) (Object) stackIn_42_2;
                            stackOut_42_3 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            stackIn_43_2 = stackOut_42_2;
                            stackIn_43_3 = stackOut_42_3;
                            break L15;
                          } else {
                            stackOut_41_0 = (kf) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = (vi) (Object) stackIn_41_2;
                            stackOut_41_3 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            stackIn_43_3 = stackOut_41_3;
                            break L15;
                          }
                        }
                        ((kf) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3 != 0);
                        this.a(param1, ((tf) this).field_q, param3 ^ -18025, param5);
                        break L14;
                      }
                    }
                    ((tf) this).field_D = param0;
                    break L9;
                  }
                }
                break L0;
              }
            } else {
              ((tf) this).field_D = param0;
              this.a(param1, ((tf) this).field_q, 17945, param5);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var7;
            stackOut_56_1 = new StringBuilder().append("tf.B(").append(param0).append(',').append(param1).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L16;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public tf() {
        ((tf) this).field_s = 0;
        ((tf) this).field_B = 256;
        ((tf) this).field_w = false;
        kf var1 = new kf();
        this.a(var1, (byte) 126, new kf(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "1P";
        field_n = new en();
    }
}
