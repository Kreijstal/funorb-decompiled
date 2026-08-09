/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ma {
    static int field_u;
    private dj field_r;
    static ef field_w;
    static ka field_n;
    static lj field_p;
    static int[][] field_m;
    static sl field_q;
    static mi field_o;
    static String[] field_s;
    static String field_v;
    static byte[][] field_t;

    gf(dj param0, dj param1) {
        super(param0);
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
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
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      if (!param1.equals("F")) {
                        if (!param1.equals("D")) {
                          if (!param1.equals("C")) {
                            if (param0 == 0) {
                              stackIn_31_0 = Class.forName(param1);
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_29_0 = (Class) null;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_26_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("gf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_29_0;
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
    }

    final rj a(byte param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        rj stackIn_6_0 = null;
        rj stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 24) {
                break L1;
              } else {
                gf.d((byte) -38);
                break L1;
              }
            }
            L2: {
              if (!(this.field_r instanceof uh)) {
                break L2;
              } else {
                var3 = ((uh) ((Object) this.field_r)).a(-113);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.b(97) == tf.field_w) {
                    break L2;
                  } else {
                    stackIn_6_0 = lk.field_c;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L3: {
              if (!param1.equals(this.field_r.field_v)) {
                stackIn_10_0 = lk.field_c;
                break L3;
              } else {
                stackIn_10_0 = tf.field_w;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("gf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param1 == 78) {
              var3 = 0;
              L1: while (true) {
                if ((var3 ^ -1) <= -6) {
                  stackIn_10_0 = var2_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (-1 <= (param0 & 1 << var3 ^ -1)) {
                      break L2;
                    } else {
                      var2_int++;
                      break L2;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 68;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "gf.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void d(byte param0) {
        field_m = (int[][]) null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_w = null;
        field_t = (byte[][]) null;
        int var1 = 107 / ((param0 - -58) / 34);
        field_v = null;
    }

    final String a(String param0, byte param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -24) {
                break L1;
              } else {
                field_t = (byte[][]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_r instanceof uh) {
                var3 = ((uh) ((Object) this.field_r)).a(-122);
                if (var3 != null) {
                  L3: {
                    if (var3.b(110) != tf.field_w) {
                      break L3;
                    } else {
                      if (!param0.equals(this.field_r.field_v)) {
                        stackIn_10_0 = ki.field_c;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_12_0 = var3.a((byte) -10);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (!param0.equals(this.field_r.field_v)) {
              stackIn_16_0 = ki.field_c;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("gf.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    static {
        field_n = null;
        field_m = new int[][]{new int[]{0}, new int[]{0}, new int[]{0}, new int[]{15245826, 0, 0}, new int[]{0}};
        field_q = new sl();
    }
}
