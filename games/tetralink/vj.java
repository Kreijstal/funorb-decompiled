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
        field_p = null;
        if (param0) {
            vj.a(-1.4104137420654297f, true);
        }
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        jd var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_14_0 = var4.a(111);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) (param2);
                if (param0) {
                  stackIn_8_0 = ak.a(-14074, var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (byte[]) (var3);
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
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("vj.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
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
                  stackIn_12_0 = var2_float;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2_float = (float)((double)var2_float + (double)el.field_Nb[var5] * Math.sin((double)((float)(1 << var5) * param0 + fm.field_b[var5])));
                  var5++;
                  continue L3;
                }
              }
            } else {
              stackIn_7_0 = 1.0860400199890137f;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = bo.field_e.a("", param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        ei.a(lk.q(13), 60);
        if (param0 != 1) {
            Object var2 = (Object) null;
            vj.a(false, (byte) 43, (Object) null);
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
