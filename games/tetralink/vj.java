/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends mc {
    int[] field_r;
    static boolean field_q;
    static int field_n;
    static long field_o;
    static String field_p;

    public static void a(boolean param0) {
        float discarded$0 = 0.0f;
        field_p = null;
        if (param0) {
            discarded$0 = vj.a(-1.4104137420654297f, true);
        }
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        jd var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (!(param2 instanceof byte[])) {
                L1: {
                  if (param1 == -28) {
                    break L1;
                  } else {
                    vj.a(49);
                    break L1;
                  }
                }
                if (param2 instanceof jd) {
                  var4 = (jd) (param2);
                  stackOut_13_0 = var4.a(111);
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) (param2);
                if (param0) {
                  stackOut_7_0 = ak.a(-14074, var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_5_0 = (byte[]) (var3);
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("vj.F(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static float a(float param0, boolean param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float stackIn_7_0 = 0.0f;
        float stackIn_12_0 = 0.0f;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float stackOut_11_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (null != el.field_Nb) {
                break L1;
              } else {
                el.field_Nb = new float[8];
                fm.field_b = new float[8];
                var2_float = 0.5f;
                var3 = 0;
                L2: while (true) {
                  if (8 <= var3) {
                    break L1;
                  } else {
                    el.field_Nb[var3] = (float)(Math.random() * (double)var2_float);
                    fm.field_b[var3] = (float)(2.0 * (Math.random() * 3.141592653589793));
                    var2_float = var2_float / 2.0f;
                    var3++;
                    continue L2;
                  }
                }
              }
            }
            var2_float = 0.0f;
            if (param1) {
              var5 = 0;
              var3 = var5;
              L3: while (true) {
                if ((var5 ^ -1) <= -9) {
                  stackOut_11_0 = var2_float;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2_float = (float)((double)var2_float + (double)el.field_Nb[var5] * Math.sin((double)((float)(1 << var5) * param0 + fm.field_b[var5])));
                  var5++;
                  continue L3;
                }
              }
            } else {
              stackOut_6_0 = 1.0860400199890137f;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "vj.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param0 <= -73) {
                break L1;
              } else {
                field_o = 126L;
                break L1;
              }
            }
            stackOut_2_0 = bo.field_e.a("", param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("vj.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private vj() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        byte[] discarded$0 = null;
        ei.a(lk.q(13), 60);
        if (param0 != 1) {
            Object var2 = (Object) null;
            discarded$0 = vj.a(false, (byte) 43, (Object) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 > 85) {
          L0: {
            if (-1 == (param0 ^ -1)) {
              L1: {
                if (ik.field_e != param2) {
                  hg.field_c = true;
                  ik.field_e = param2;
                  nl.a(107, param1);
                  if (-2 == (param0 ^ -1)) {
                    if (param2 != me.field_b) {
                      me.field_b = param2;
                      hg.field_c = true;
                      nl.a(102, param1);
                      break L1;
                    } else {
                      if (param0 != 2) {
                        break L0;
                      } else {
                        if (mc.field_f == param2) {
                          break L0;
                        } else {
                          hg.field_c = true;
                          mc.field_f = param2;
                          nl.a(108, param1);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param0 != 2) {
                      break L0;
                    } else {
                      if (mc.field_f == param2) {
                        break L0;
                      } else {
                        hg.field_c = true;
                        mc.field_f = param2;
                        nl.a(108, param1);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (-2 == (param0 ^ -1)) {
                    if (param2 != me.field_b) {
                      me.field_b = param2;
                      hg.field_c = true;
                      nl.a(102, param1);
                      break L1;
                    } else {
                      if (param0 != 2) {
                        break L0;
                      } else {
                        if (mc.field_f == param2) {
                          break L0;
                        } else {
                          hg.field_c = true;
                          mc.field_f = param2;
                          nl.a(108, param1);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param0 != 2) {
                      break L0;
                    } else {
                      if (mc.field_f == param2) {
                        break L0;
                      } else {
                        hg.field_c = true;
                        mc.field_f = param2;
                        nl.a(108, param1);
                        break L0;
                      }
                    }
                  }
                }
              }
              if (param0 != 2) {
                break L0;
              } else {
                if (mc.field_f == param2) {
                  break L0;
                } else {
                  hg.field_c = true;
                  mc.field_f = param2;
                  nl.a(108, param1);
                  break L0;
                }
              }
            } else {
              if (-2 != (param0 ^ -1)) {
                if (param0 == 2) {
                  if (mc.field_f == param2) {
                    break L0;
                  } else {
                    hg.field_c = true;
                    mc.field_f = param2;
                    nl.a(108, param1);
                    break L0;
                  }
                } else {
                  if (param0 != 2) {
                    break L0;
                  } else {
                    if (mc.field_f == param2) {
                      break L0;
                    } else {
                      hg.field_c = true;
                      mc.field_f = param2;
                      nl.a(108, param1);
                      break L0;
                    }
                  }
                }
              } else {
                if (param0 != 2) {
                  break L0;
                } else {
                  if (mc.field_f == param2) {
                    break L0;
                  } else {
                    hg.field_c = true;
                    mc.field_f = param2;
                    nl.a(108, param1);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
