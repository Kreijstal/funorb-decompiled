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
        cg var4;
        cg stackIn_6_0;
        Object stackIn_6_1;
        vr stackIn_6_2;
        float stackIn_6_3;
        Object stackIn_7_1;
        cg stackIn_8_0 = null;
        Object stackIn_8_1 = null;
        vr stackIn_8_2 = null;
        float stackIn_8_3 = 0.0f;
        int stackIn_8_4 = 0;
        if (param0) {
          var4 = this.d((byte) 97, param1);
          if (var4 == null) {
            return null;
          } else {
            L0: {
              L1: {
                stackIn_6_0 = (cg) (var4);

                stackIn_6_1 = this;

                stackIn_6_2 = this.field_m;

                stackIn_6_3 = param2;

                if (this.field_k) {
                  break L1;
                } else {


                  stackIn_7_1 = this;

                  if (!this.c(param1, 0).field_d) {
                    stackIn_8_0 = (cg) ((Object) stackIn_6_0);
                    stackIn_8_1 = this;
                    stackIn_8_2 = (vr) ((Object) stackIn_6_2);
                    stackIn_8_3 = stackIn_6_3;
                    stackIn_8_4 = 0;
                    break L0;
                  } else {
                    stackIn_6_0 = (cg) ((Object) stackIn_6_0);
                    stackIn_6_1 = this;
                    stackIn_6_2 = (vr) ((Object) stackIn_6_2);

                    break L1;
                  }
                }
              }
              stackIn_8_0 = (cg) ((Object) stackIn_6_0);
              stackIn_8_1 = this;
              stackIn_8_2 = (vr) ((Object) stackIn_6_2);
              stackIn_8_3 = stackIn_6_3;
              stackIn_8_4 = 1;
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
        cg var3;
        byte[] var4;
        int var5;
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
          this.d(80, -10);
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
        if (param0 != -23316) {
          L0: {
            field_o = (int[]) null;
            if (this.c(param1, 0).field_f) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.c(param1, 0).field_f) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
                  if (param0.equals("J")) {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("D")) {
                          if (!param0.equals("C")) {
                            var2_int = -51 / ((35 - param1) / 33);
                            stackIn_28_0 = Class.forName(param0);
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
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
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
          L1: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("wi.O(");

            if (param0 == null) {
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
        cg var3;
        String var4;
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
