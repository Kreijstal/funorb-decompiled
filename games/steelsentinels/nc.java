/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_p;
    static int field_d;
    static int field_f;
    static String field_g;
    static boolean field_b;
    static h field_e;
    private int field_l;
    static String field_i;
    static int field_a;
    static String[] field_m;
    static int[] field_h;
    private int field_c;
    private hb field_k;
    static a field_j;
    private q field_o;
    static boolean field_q;
    static gh field_n;

    private final void a(byte param0, int param1, Object param2, long param3) {
        bg var6 = null;
        le var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (((nc) this).field_c >= param1) {
              this.a((byte) 117, param3);
              ((nc) this).field_l = ((nc) this).field_l - param1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((nc) this).field_l >= 0) {
                      break L3;
                    } else {
                      var6 = (bg) (Object) ((nc) this).field_k.a(12515);
                      this.a(var6, -17389);
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
                  if (param0 <= -47) {
                    break L2;
                  } else {
                    field_e = null;
                    break L2;
                  }
                }
                var6_ref = new le(param2, param1);
                ((nc) this).field_o.a((ck) (Object) var6_ref, param3, false);
                ((nc) this).field_k.a((byte) 47, (kd) (Object) var6_ref);
                ((bg) (Object) var6_ref).field_w = 0L;
                break L0;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6_ref2;
            stackOut_15_1 = new StringBuilder().append("nc.D(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_m = null;
              field_g = null;
              field_p = null;
              field_e = null;
              field_n = null;
              if (param0 > 126) {
                break L1;
              } else {
                ld discarded$2 = nc.a((byte[]) null, 57);
                break L1;
              }
            }
            field_j = null;
            field_h = null;
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "nc.F(" + param0 + ')');
        }
    }

    private final void a(byte param0, long param1) {
        bg var4 = null;
        if (param0 != 117) {
            return;
        }
        try {
            var4 = (bg) (Object) ((nc) this).field_o.a(param1, (byte) -125);
            this.a(var4, param0 ^ -17306);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nc.B(" + param0 + ',' + param1 + ')');
        }
    }

    final Object a(long param0, int param1) {
        bg var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        le var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_17_0 = null;
        try {
          L0: {
            var4 = (bg) (Object) ((nc) this).field_o.a(param0, (byte) -127);
            if (null == var4) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 <= -30) {
                  break L1;
                } else {
                  this.a((bg) null, -108);
                  break L1;
                }
              }
              var5 = var4.d((byte) 125);
              if (null == var5) {
                var4.b(4);
                var4.e(480);
                ((nc) this).field_l = ((nc) this).field_l + var4.field_z;
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L2: {
                  L3: {
                    if (!var4.h(-29304)) {
                      break L3;
                    } else {
                      var6 = new le(var5, var4.field_z);
                      ((nc) this).field_o.a((ck) (Object) var6, var4.field_j, false);
                      ((nc) this).field_k.a((byte) 72, (kd) (Object) var6);
                      ((bg) (Object) var6).field_w = 0L;
                      var4.b(4);
                      var4.e(480);
                      if (SteelSentinels.field_G == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((nc) this).field_k.a((byte) 50, (kd) (Object) var4);
                  var4.field_w = 0L;
                  break L2;
                }
                stackOut_17_0 = var5;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4_ref, "nc.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(bg param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0) {
                param0.b(param1 ^ -17385);
                param0.e(param1 + 17869);
                ((nc) this).field_l = ((nc) this).field_l + param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -17389) {
                break L2;
              } else {
                nc.a((byte) -12, (java.applet.Applet) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("nc.K(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static ld a(byte[] param0, int param1) {
        ld var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ld stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (null != param0) {
              L1: {
                if (param1 == 7045) {
                  break L1;
                } else {
                  nc.a((byte) 100, (java.applet.Applet) null);
                  break L1;
                }
              }
              var2 = new ld(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
              uh.a(param1 + 2279);
              stackOut_6_0 = (ld) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ld) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("nc.H(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (ch.field_O == null) {
                break L1;
              } else {
                ch.field_O.m(105);
                break L1;
              }
            }
            L2: {
              jd.field_kb = new pm(param0, param1, false, true, true);
              ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
              if (param2 < -37) {
                break L2;
              } else {
                nc.a((byte) 60, (java.applet.Applet) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nc.C(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final void a(long param0, Object param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a((byte) -109, param2, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("nc.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    nc(int param0) {
        this(param0, param0);
    }

    final static vc[] a(int param0, pn param1) {
        RuntimeException var2 = null;
        wj var2_ref = null;
        int[] var3 = null;
        vc[] var4 = null;
        int var5 = 0;
        vc var6 = null;
        int var7 = 0;
        vc[] stackIn_5_0 = null;
        vc[] stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        vc[] stackIn_21_0 = null;
        vc[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc[] stackOut_4_0 = null;
        vc[] stackOut_13_0 = null;
        vc[] stackOut_20_0 = null;
        vc[] stackOut_24_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (!param1.b(-35)) {
              stackOut_4_0 = new vc[]{};
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_ref = param1.a(param0 ^ -30726);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref.field_a != 0) {
                      break L3;
                    } else {
                      a.a((byte) 121, 10L);
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
                  if (var2_ref.field_a != 2) {
                    break L2;
                  } else {
                    stackOut_13_0 = new vc[]{};
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
                if (param0 == 38) {
                  var3 = (int[]) var2_ref.field_c;
                  var4 = new vc[var3.length >> 483645762];
                  var5 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var4.length <= var5) {
                          break L6;
                        } else {
                          var6 = new vc();
                          stackOut_20_0 = (vc[]) var4;
                          stackIn_25_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L5;
                          } else {
                            stackIn_21_0[var5] = var6;
                            var6.field_a = var3[var5 << 207299170];
                            var6.field_g = var3[1 + (var5 << 390866402)];
                            var6.field_j = var3[(var5 << 397193986) + 2];
                            var6.field_i = var3[(var5 << -1336862142) + 3];
                            var5++;
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = (vc[]) var4;
                      stackIn_25_0 = stackOut_24_0;
                      break L5;
                    }
                    break L0;
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (vc[]) (Object) stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("nc.G(").append(param0).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
                    var3 = 58 % ((-15 - param0) / 42);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("nc.E(").append(param0).append(',');
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nc(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        ((nc) this).field_k = new hb();
        try {
          L0: {
            ((nc) this).field_l = param0;
            ((nc) this).field_c = param0;
            var3_int = 1;
            L1: while (true) {
              L2: {
                if (~(var3_int + var3_int) <= ~param0) {
                  break L2;
                } else {
                  if (var3_int >= param1) {
                    break L2;
                  } else {
                    var3_int = var3_int + var3_int;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((nc) this).field_o = new q(var3_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "nc.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    final static gk a(int param0, byte param1) {
        RuntimeException var2 = null;
        gk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        gk stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        gk stackOut_1_0 = null;
        try {
          L0: {
            if (param0 < 35) {
              if (param1 < -93) {
                stackOut_6_0 = ie.field_d[param0];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (gk) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = bl.field_p[param0 - 35];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nc.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = 0;
        field_h = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_p = "Unable to add name - system busy";
        field_m = new String[]{"speed_icons", "diff_icons", "map_icons"};
        field_i = "Email (Login):";
        field_q = false;
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
