/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static String field_a;
    static vo field_b;
    static int field_c;

    final static cg[] b(int param0) {
        if (param0 != 19795) {
          c.a('ￄ', 89);
          return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
        } else {
          return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = (vo) null;
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param1 == 441) {
          if (param0 < 48) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 >= param0) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param0) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_c = -62;
          if (param0 >= 48) {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param0) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 < param0) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static String a(dj param0, String param1, String param2, String param3, byte param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -24) {
                break L1;
              } else {
                c.b(-60);
                break L1;
              }
            }
            if (!param0.a((byte) 73)) {
              stackIn_5_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param1 + " - " + param0.b(param3, 109) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("c.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0) {
        String var1;
        if (nm.field_c) {
          L0: {
            if (null != kk.field_i) {
              kk.field_i.h((byte) 20);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 65) {
            return;
          } else {
            var1 = bo.a(param0 + 39);
            he.field_a = new ih(var1, (String) null, true, false, false);
            e.field_S.a(bm.field_d, true);
            bm.field_d.b(20, he.field_a);
            bm.field_d.f((byte) -70);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
        field_b = new vo();
    }
}
