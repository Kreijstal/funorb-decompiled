/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends w implements oh {
    static wma field_i;
    static int[] field_o;
    private boolean field_k;
    private vi field_n;
    private vr field_j;
    private int field_l;
    private vr field_m;

    wi(vr param0, vr param1, vr param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_k = false;
        this.field_l = 50;
        try {
            this.field_l = param3;
            this.field_j = param0;
            this.field_k = param4 ? true : false;
            this.field_m = param2;
            this.field_n = new vi(this.field_l);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int[] a(boolean param0, int param1, float param2) {
        cg var4 = null;
        cg stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        vr stackIn_4_2 = null;
        float stackIn_4_3 = 0.0f;
        cg stackIn_5_0 = null;
        Object stackIn_5_1 = null;
        vr stackIn_5_2 = null;
        float stackIn_5_3 = 0.0f;
        cg stackIn_6_0 = null;
        Object stackIn_6_1 = null;
        vr stackIn_6_2 = null;
        float stackIn_6_3 = 0.0f;
        cg stackIn_7_0 = null;
        Object stackIn_7_1 = null;
        vr stackIn_7_2 = null;
        float stackIn_7_3 = 0.0f;
        cg stackIn_8_0 = null;
        Object stackIn_8_1 = null;
        vr stackIn_8_2 = null;
        float stackIn_8_3 = 0.0f;
        int stackIn_8_4 = 0;
        cg stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        vr stackOut_3_2 = null;
        float stackOut_3_3 = 0.0f;
        cg stackOut_4_0 = null;
        Object stackOut_4_1 = null;
        vr stackOut_4_2 = null;
        float stackOut_4_3 = 0.0f;
        cg stackOut_7_0 = null;
        Object stackOut_7_1 = null;
        vr stackOut_7_2 = null;
        float stackOut_7_3 = 0.0f;
        int stackOut_7_4 = 0;
        cg stackOut_5_0 = null;
        Object stackOut_5_1 = null;
        vr stackOut_5_2 = null;
        float stackOut_5_3 = 0.0f;
        cg stackOut_6_0 = null;
        Object stackOut_6_1 = null;
        vr stackOut_6_2 = null;
        float stackOut_6_3 = 0.0f;
        int stackOut_6_4 = 0;
        if (param0) {
          var4 = this.d((byte) 97, param1);
          if (var4 == null) {
            return null;
          } else {
            L0: {
              L1: {
                stackOut_3_0 = (cg) (var4);
                stackOut_3_1 = this;
                stackOut_3_2 = this.field_m;
                stackOut_3_3 = param2;
                stackIn_6_0 = stackOut_3_0;
                stackIn_6_1 = stackOut_3_1;
                stackIn_6_2 = stackOut_3_2;
                stackIn_6_3 = stackOut_3_3;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                if (this.field_k) {
                  break L1;
                } else {
                  stackOut_4_0 = (cg) ((Object) stackIn_4_0);
                  stackOut_4_1 = this;
                  stackOut_4_2 = (vr) ((Object) stackIn_4_2);
                  stackOut_4_3 = stackIn_4_3;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  stackIn_7_3 = stackOut_4_3;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  if (!this.c(param1, 0).field_d) {
                    stackOut_7_0 = (cg) ((Object) stackIn_7_0);
                    stackOut_7_1 = this;
                    stackOut_7_2 = (vr) ((Object) stackIn_7_2);
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    break L0;
                  } else {
                    stackOut_5_0 = (cg) ((Object) stackIn_5_0);
                    stackOut_5_1 = this;
                    stackOut_5_2 = (vr) ((Object) stackIn_5_2);
                    stackOut_5_3 = stackIn_5_3;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = (cg) ((Object) stackIn_6_0);
              stackOut_6_1 = this;
              stackOut_6_2 = (vr) ((Object) stackIn_6_2);
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              break L0;
            }
            return ((cg) (Object) stackIn_8_0).a((q) (this), stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0);
          }
        } else {
          return (int[]) null;
        }
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        lb.field_w = param2;
        if (param3 != -68) {
            return;
        }
        try {
            dk.field_p = param1;
            uv.a(false, oc.field_m, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wi.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final cg d(byte param0, int param1) {
        cg var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        var3 = (cg) ((Object) this.field_n.a(126, (long)param1));
        if (var3 == null) {
          var4 = this.field_j.b(-54, param1, 0);
          if (var4 == null) {
            return null;
          } else {
            var3 = new cg(new lu(var4));
            this.field_n.a(var3, (long)param1, 83);
            var5 = -80 / ((param0 - -37) / 48);
            return var3;
          }
        } else {
          return var3;
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_i = null;
        if (!param0) {
            field_i = (wma) null;
        }
    }

    public final int a(int param0, int param1) {
        if (param0 != 6) {
            return 96;
        }
        return this.c(param1, param0 ^ 6).field_b;
    }

    final static boolean a(int param0, int param1, int param2) {
        if ((gf.field_k ^ -1) != -14) {
          if (gf.field_k != 102) {
            if (param0 >= 71) {
              if (null != da.field_d) {
                if (!da.field_d.b(param2, -19044, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            da.field_d.f((byte) -118);
            return true;
          }
        } else {
          lc.b(-1);
          return true;
        }
    }

    public final boolean b(byte param0, int param1) {
        on discarded$8 = null;
        if (param0 > 103) {
          if (!this.field_k) {
            if (this.c(param1, 0).field_d) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          discarded$8 = this.d(80, -10);
          if (!this.field_k) {
            if (this.c(param1, 0).field_d) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public final int a(byte param0, int param1) {
        int var3 = -11 % ((param0 - 45) / 57);
        return 65535 & this.c(param1, 0).field_g;
    }

    public final boolean b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -23316) {
          L0: {
            field_o = (int[]) null;
            if (this.c(param1, 0).field_f) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.c(param1, 0).field_f) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_5_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("S")) {
                  if (param0.equals("J")) {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("D")) {
                          if (!param0.equals("C")) {
                            var2_int = -51 / ((35 - param1) / 33);
                            stackOut_27_0 = Class.forName(param0);
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackOut_25_0 = Character.TYPE;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackOut_22_0 = Double.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("wi.O(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
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
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
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

    final on d(int param0, int param1) {
        cg var3 = null;
        String var4 = null;
        if (param1 == -23060) {
          var3 = this.d((byte) 28, param0);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_q;
          }
        } else {
          var4 = (String) null;
          wi.a(true, (String) null, (String) null, (byte) 43);
          var3 = this.d((byte) 28, param0);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_q;
          }
        }
    }

    static {
        field_o = new int[]{2, 20, 21, 6, 5, 9};
    }
}
