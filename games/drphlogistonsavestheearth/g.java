/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ei {
    static boolean[] field_p;
    static vd field_t;
    static int[] field_s;
    static String field_r;
    static he[] field_q;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(8192, param1) != u.field_b) {
              if (param0 <= 47) {
                field_t = (vd) null;
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = jf.field_kb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("g.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_6_0);
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        L0: {
          if (param1 <= -32) {
            break L0;
          } else {
            field_t = (vd) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 > param6) {
              break L2;
            } else {
              if (param0 + param4 <= param6) {
                break L2;
              } else {
                if (param5 < param3) {
                  break L2;
                } else {
                  if (param3 - -param2 <= param5) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(String param0, int param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gl.field_c != -1) {
                break L1;
              } else {
                if (0 == (oc.field_B ^ -1)) {
                  oc.field_B = ob.field_g;
                  gl.field_c = ck.field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                dd.field_l = dd.field_l + 1;
                if (param0 != null) {
                  if (!param0.equals(ie.field_C)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (ie.field_C != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!em.field_c) {
                  if (dd.field_l >= qe.field_c) {
                    if (je.field_j + qe.field_c > dd.field_l) {
                      stackIn_18_0 = 1;
                      break L4;
                    } else {
                      stackIn_18_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_18_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_18_0 = 0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_18_0;
                  if (param0 == null) {
                    break L6;
                  } else {
                    if (em.field_c) {
                      dd.field_l = qe.field_c;
                      break L5;
                    } else {
                      if (var2_int != 0) {
                        dd.field_l = qe.field_c;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                dd.field_l = 0;
                break L5;
              }
              oh.field_e = gl.field_c;
              pi.field_Q = oc.field_B;
              if (param0 != null) {
                em.field_c = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  em.field_c = true;
                  break L2;
                }
              }
            }
            ie.field_C = param0;
            if (param1 == 0) {
              L7: {
                if (em.field_c) {
                  break L7;
                } else {
                  if (dd.field_l >= qe.field_c) {
                    break L7;
                  } else {
                    if (df.field_o) {
                      oh.field_e = gl.field_c;
                      pi.field_Q = oc.field_B;
                      dd.field_l = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                gl.field_c = -1;
                if (!em.field_c) {
                  break L8;
                } else {
                  if (dd.field_l != cd.field_d) {
                    break L8;
                  } else {
                    dd.field_l = 0;
                    em.field_c = false;
                    break L8;
                  }
                }
              }
              oc.field_B = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("g.E(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L9;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param1.length()) {
                if (param0 > 94) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (param1.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("g.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final vh a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        vh stackIn_2_0 = null;
        vh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (jf.a(var4, param0 + -640)) {
              L1: {
                if (param0 == 8192) {
                  break L1;
                } else {
                  field_s = (int[]) null;
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = hh.a(10, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return ce.field_e;
                  }
                }
              }
              stackIn_9_0 = u.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = u.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("g.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            g.a(-14, (byte) -108, 98, -109, -122, -119, -13);
        }
        field_p = null;
        field_q = null;
        field_s = null;
        field_r = null;
        field_t = null;
    }

    g(kl param0) {
        super(param0);
    }

    static {
        field_p = new boolean[64];
        field_s = new int[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 128, 64, 64, 64, 64, 64, 64, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 64, 64, 64, 64, 0, 128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
        field_t = new vd();
    }
}
