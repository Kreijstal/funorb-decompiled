/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bj {
    static int field_sb;
    static int field_rb;
    static int field_tb;

    final static boolean j(byte param0) {
        if (kn.field_L) {
          if (param0 == 78) {
            if (-1 != (vk.field_g ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            field_sb = 57;
            if (-1 != (vk.field_g ^ -1)) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static aj b(String param0, boolean param1) {
        RuntimeException var2 = null;
        aj stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_sb = 58;
                break L1;
              }
            }
            if (ci.field_ub != vl.field_A) {
              L2: {
                if (vl.field_A != kn.field_D) {
                  break L2;
                } else {
                  if (!param0.equals(lc.field_e)) {
                    break L2;
                  } else {
                    vl.field_A = ji.field_T;
                    stackOut_7_0 = kf.field_j;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              lc.field_e = param0;
              kf.field_j = null;
              vl.field_A = ci.field_ub;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("sb.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (aj) ((Object) stackIn_10_0);
        }
    }

    final static void a(String param0, boolean param1) {
        aj discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var3 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (-1 != ac.field_k) {
                break L1;
              } else {
                if ((kj.field_c ^ -1) == 0) {
                  ac.field_k = hn.field_k;
                  kj.field_c = rf.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ei.field_u = ei.field_u + 1;
              if (param1) {
                break L2;
              } else {
                var4 = (String) null;
                discarded$1 = sb.b((String) null, true);
                break L2;
              }
            }
            L3: {
              L4: {
                if (param0 != null) {
                  if (param0.equals(eg.field_j)) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  if (eg.field_j != null) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!uk.field_e) {
                  if (ei.field_u >= be.field_f) {
                    if (ei.field_u < sj.field_n + be.field_f) {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_19_0 = stackOut_16_0;
                      break L5;
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_19_0 = stackOut_14_0;
                    break L5;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_19_0 = stackOut_12_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_19_0;
                if (param0 == null) {
                  ei.field_u = 0;
                  break L6;
                } else {
                  if (uk.field_e) {
                    ei.field_u = be.field_f;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      ei.field_u = be.field_f;
                      break L6;
                    } else {
                      ei.field_u = 0;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                vn.field_Db = kj.field_c;
                if (param0 != null) {
                  uk.field_e = false;
                  break L7;
                } else {
                  if (var2_int != 0) {
                    uk.field_e = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              fm.field_S = ac.field_k;
              break L3;
            }
            L8: {
              if (uk.field_e) {
                break L8;
              } else {
                if (ei.field_u >= be.field_f) {
                  break L8;
                } else {
                  if (lf.field_O) {
                    fm.field_S = ac.field_k;
                    ei.field_u = 0;
                    vn.field_Db = kj.field_c;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              eg.field_j = param0;
              if (!uk.field_e) {
                break L9;
              } else {
                if (ei.field_u != ae.field_k) {
                  break L9;
                } else {
                  uk.field_e = false;
                  ei.field_u = 0;
                  break L9;
                }
              }
            }
            kj.field_c = -1;
            ac.field_k = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var2);
            stackOut_43_1 = new StringBuilder().append("sb.H(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
    }

    final void c(mf param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.c(param0, 117);
              if (param1 >= 45) {
                break L1;
              } else {
                field_sb = -34;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sb.T(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void d(int param0, int param1, int param2) {
        ac.field_k = param2;
        kj.field_c = param1;
        if (param0 != 33) {
            String var4 = (String) null;
            sb.a((String) null, true);
        }
    }

    sb(fm param0, mf param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_tb = 360;
    }
}
