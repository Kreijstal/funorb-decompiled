/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends q {
    private static long[] field_m;
    static int field_l;
    static boolean[] field_j;
    static int field_k;
    static int field_i;

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 422) {
                break L1;
              } else {
                field_l = -21;
                break L1;
              }
            }
            if (this.a(-257, param1) != si.field_m) {
              stackIn_6_0 = da.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = wj.field_B;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ag.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("S")) {
                  if (!param0.equals("J")) {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_19_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("D")) {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param0.equals("C")) {
                            stackIn_27_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            L1: {
                              if (!param1) {
                                break L1;
                              } else {
                                ag.g(26);
                                break L1;
                              }
                            }
                            stackIn_31_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_15_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("ag.E(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_j = (boolean[]) null;
                break L1;
              }
            }
            stackIn_3_0 = bc.a(-8, param1, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ag.B(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final lh a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        lh stackIn_5_0 = null;
        lh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ca.a(param1, 1)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (var3_int != 0) {
              L2: {
                if (param0 == -257) {
                  break L2;
                } else {
                  var4 = (String) null;
                  this.b(97, (String) null);
                  break L2;
                }
              }
              stackIn_9_0 = kk.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = si.field_m;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ag.D(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(int param0, byte param1) {
        je var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            j.field_gb = param0;
            var2 = (je) ((Object) qa.field_f.g(0));
            if (param1 == -67) {
              L1: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!var2.field_f.a(126)) {
                      var2.a(false);
                      break L2;
                    } else {
                      var2.field_g.f((int)((float)(j.field_gb * var2.field_i / 80) * 1.399999976158142f));
                      break L2;
                    }
                  }
                  var2 = (je) ((Object) qa.field_f.d(1));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ag.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -13) {
            byte[] var2 = (byte[]) null;
            ag.a(95, (byte[]) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    ag(dj param0) {
        super(param0);
    }

    final static void c(int param0, String param1) {
        try {
            rd.a(-119, param1);
            if (param0 != 12607) {
                field_l = 32;
            }
            fa.a(rj.field_g, 480, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ag.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_m = new long[256];
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                field_j = new boolean[7];
                field_i = 0;
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_m[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L != (1L & var0)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> 1169355905;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
