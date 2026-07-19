/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    private at field_e;
    static boolean field_a;
    static String field_d;
    static int field_c;
    private tc field_f;
    static wk[] field_b;

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
              if (param0 == 50) {
                break L1;
              } else {
                field_c = -105;
                break L1;
              }
            }
            stackOut_2_0 = qk.field_e.a(param1, param0 ^ -72, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("bb.C(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        if (param0 > -68) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final tc a(boolean param0, tc param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        tc stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        tc stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        tc stackOut_10_0 = null;
        tc stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    var3 = param1;
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = this.field_e.field_d.field_j;
                break L1;
              }
              if (this.field_e.field_d == var3) {
                this.field_f = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_f = var3.field_j;
                stackOut_10_0 = (tc) (var3);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (tc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("bb.F(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (tc) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final tc b(int param0) {
        if (param0 != 50) {
            return (tc) null;
        }
        tc var2 = this.field_f;
        if (!(var2 != this.field_e.field_d)) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_b;
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (null != tn.field_Z) {
          if (!tn.field_Z.c((byte) -121)) {
            if (null == ik.field_b) {
              if (param3 == 50) {
                if (!jt.a((byte) -92)) {
                  if (!vt.a(param1, param0, param2, (byte) 28)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                field_b = (wk[]) null;
                if (!jt.a((byte) -92)) {
                  if (!vt.a(param1, param0, param2, (byte) 28)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (!ik.field_b.l(18585)) {
                if (param3 == 50) {
                  if (!jt.a((byte) -92)) {
                    if (!vt.a(param1, param0, param2, (byte) 28)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  field_b = (wk[]) null;
                  if (!jt.a((byte) -92)) {
                    if (vt.a(param1, param0, param2, (byte) 28)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                ik.field_b = null;
                ot.g(76);
                return true;
              }
            }
          } else {
            ot.g(76);
            return true;
          }
        } else {
          if (null == ik.field_b) {
            if (param3 == 50) {
              if (!jt.a((byte) -92)) {
                if (vt.a(param1, param0, param2, (byte) 28)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              field_b = (wk[]) null;
              if (!jt.a((byte) -92)) {
                if (vt.a(param1, param0, param2, (byte) 28)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            if (!ik.field_b.l(18585)) {
              if (param3 == 50) {
                if (!jt.a((byte) -92)) {
                  if (vt.a(param1, param0, param2, (byte) 28)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                field_b = (wk[]) null;
                if (!jt.a((byte) -92)) {
                  if (vt.a(param1, param0, param2, (byte) 28)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              ik.field_b = null;
              ot.g(76);
              return true;
            }
          }
        }
    }

    final tc b(byte param0) {
        tc var2 = null;
        if (param0 == -112) {
          var2 = this.field_f;
          if (var2 == this.field_e.field_d) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_j;
            return var2;
          }
        } else {
          return (tc) null;
        }
    }

    final tc a(int param0) {
        tc var2 = null;
        var2 = this.field_e.field_d.field_j;
        if (param0 == 50) {
          if (var2 == this.field_e.field_d) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_j;
            return var2;
          }
        } else {
          field_d = (String) null;
          if (var2 == this.field_e.field_d) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_j;
            return var2;
          }
        }
    }

    final tc c(int param0) {
        tc var2 = null;
        var2 = this.field_e.field_d.field_b;
        if (var2 != this.field_e.field_d) {
          if (param0 != 50) {
            return (tc) null;
          } else {
            this.field_f = var2.field_b;
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final tc a(tc param0, boolean param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        tc stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        tc stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        tc stackOut_10_0 = null;
        tc stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1) {
              L1: {
                L2: {
                  if (param0 != null) {
                    break L2;
                  } else {
                    var3 = this.field_e.field_d.field_b;
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = param0;
                break L1;
              }
              if (this.field_e.field_d == var3) {
                this.field_f = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_f = var3.field_b;
                stackOut_10_0 = (tc) (var3);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (tc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("bb.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (tc) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    bb(at param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = true;
        field_d = "Your email address is used to identify this account";
        field_c = 50;
    }
}
