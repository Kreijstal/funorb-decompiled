/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int field_c;
    static ad field_s;
    int[] field_g;
    static boolean field_l;
    int field_n;
    static String field_q;
    String field_h;
    String field_i;
    boolean field_j;
    int field_k;
    km field_t;
    long field_p;
    String field_d;
    int field_e;
    static int[] field_o;
    static String field_f;
    static String[] field_b;
    int field_m;
    String field_r;
    int field_a;

    final int b(int param0) {
        if (!this.field_j) {
          if (2 == this.field_n) {
            if ((this.field_e ^ -1) < -1) {
              return 2;
            } else {
              if (param0 == -6761) {
                if (this.field_p != hh.field_d) {
                  L0: {
                    if ((oa.field_q ^ -1) != -3) {
                      break L0;
                    } else {
                      if (!ch.a(this.field_i, (byte) -73)) {
                        break L0;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              } else {
                this.b(-36);
                if (this.field_p != hh.field_d) {
                  L1: {
                    if ((oa.field_q ^ -1) != -3) {
                      break L1;
                    } else {
                      if (!ch.a(this.field_i, (byte) -73)) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 == -6761) {
              if (this.field_p != hh.field_d) {
                L2: {
                  if ((oa.field_q ^ -1) != -3) {
                    break L2;
                  } else {
                    if (!ch.a(this.field_i, (byte) -73)) {
                      break L2;
                    } else {
                      return 1;
                    }
                  }
                }
                return 0;
              } else {
                return 1;
              }
            } else {
              this.b(-36);
              if (this.field_p != hh.field_d) {
                if ((oa.field_q ^ -1) == -3) {
                  if (ch.a(this.field_i, (byte) -73)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param1.equals("I")) {
                if (!param1.equals("S")) {
                  var2_int = -46 % ((9 - param0) / 58);
                  if (param1.equals("J")) {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.equals("Z")) {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param1.equals("F")) {
                        if (!param1.equals("D")) {
                          if (!param1.equals("C")) {
                            stackIn_28_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
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
                    }
                  }
                } else {
                  stackIn_9_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("cj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
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
                        return stackIn_28_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_o = null;
        field_b = null;
        field_q = null;
        field_f = null;
        if (param0 >= -14) {
            field_l = false;
        }
    }

    cj(boolean param0) {
        this.field_p = hk.field_Kb;
        this.field_j = ea.field_b;
        this.field_h = aa.field_f;
        this.field_i = vl.field_k;
        this.field_r = vc.field_hb;
        this.field_n = td.field_h;
        this.field_a = pl.field_b;
        if (param0) {
            this.field_g = ne.field_e;
        } else {
            this.field_g = null;
        }
        this.field_d = pb.field_l;
        this.field_k = ef.field_b;
        this.field_m = eb.field_d;
        this.field_e = va.field_b;
    }

    cj(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_i = param1;
            this.field_e = 0;
            this.field_g = null;
            this.field_d = param3;
            this.field_j = true;
            this.field_h = param4;
            this.field_p = 0L;
            this.field_n = param0;
            this.field_r = param1;
            this.field_m = 0;
            this.field_a = 0;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "cj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Show chat (1 unread message)";
        field_o = new int[128];
        field_f = "Return to game";
    }
}
