/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve implements db {
    private int field_m;
    static int field_l;
    private wl field_e;
    static hh field_d;
    private int field_c;
    static String field_f;
    static mf field_h;
    private int field_j;
    private int field_a;
    private int field_b;
    static byte[][][] field_n;
    private int field_i;
    static int field_g;
    static int field_k;

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        hm stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof q)) {
                stackIn_4_0 = null;
                break L1;
              } else {
                stackIn_4_0 = (hm) (param3);
                break L1;
              }
            }
            L2: {
              var12 = (q) ((Object) stackIn_4_0);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            em.a(param3.field_k + param0, param1 + param3.field_j, param3.field_g, param3.field_x, this.field_b);
            var7 = param3.field_g + -(2 * var12.field_M);
            var8 = param0 - (-param3.field_k + -var12.field_M);
            var9 = var12.field_J + (param1 + param3.field_j);
            em.d(var8, var9, var8 - -var7, var9, this.field_m);
            var10 = -1 + var12.e((byte) 98);
            L3: while (true) {
              if (-1 < (var10 ^ -1)) {
                L4: {
                  if (param2 <= -14) {
                    break L4;
                  } else {
                    this.field_j = -58;
                    break L4;
                  }
                }
                if (this.field_e == null) {
                  break L0;
                } else {
                  this.field_e.c(var12.field_l, var8 - -(var7 / 2), var12.field_J + this.field_e.field_y + var9, this.field_i, this.field_a);
                  return;
                }
              } else {
                em.d(var8 + var7 * var12.b(var10, (byte) 97) / var12.k(-1), var9, this.field_j, this.field_c);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ve.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static p a(int param0, mf param1, mf param2, int[] param3) {
        RuntimeException var4 = null;
        String var5 = null;
        int[] var6 = null;
        Object stackIn_3_0 = null;
        p stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
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
            if (null == om.field_e) {
              kc.field_c = dn.a(0, vl.field_f, ej.field_g, param1, 1, param3, dn.field_C);
              var6 = (int[]) null;
              rb.field_k = dn.a(0, ok.field_b, c.field_q, param2, 0, (int[]) null, q.field_L);
              tk.field_b = new qh(param1, bm.field_e, sb.field_i, 1, od.field_n, param3);
              om.field_e = new p();
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  var5 = (String) null;
                  ve.a((byte) 82, (String) null);
                  break L1;
                }
              }
              if (om.field_e.a(23389)) {
                stackIn_9_0 = om.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ve.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (p) ((Object) stackIn_3_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        ff.a((String) null, param2, 64, param1);
        int var3 = 104 / ((31 - param0) / 61);
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != 0) {
            return (mf) null;
        }
        return ji.a(param2, param0, false, param3, param4, (byte) 114);
    }

    final static void a(byte param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (-1 != bg.field_f) {
                break L1;
              } else {
                if ((oj.field_M ^ -1) != 0) {
                  break L1;
                } else {
                  oj.field_M = bj.field_y;
                  bg.field_f = dh.field_d;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                ei.field_j = ei.field_j + 1;
                if (param1 != null) {
                  if (!param1.equals(on.field_b)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (on.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!un.field_u) {
                  if (ei.field_j >= ef.field_d) {
                    if (ei.field_j < ef.field_d + qf.field_l) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  ei.field_j = 0;
                  break L5;
                } else {
                  if (un.field_u) {
                    ei.field_j = ef.field_d;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      ei.field_j = 0;
                      break L5;
                    } else {
                      ei.field_j = ef.field_d;
                      break L5;
                    }
                  }
                }
              }
              ni.field_O = bg.field_f;
              ci.field_g = oj.field_M;
              if (param1 != null) {
                un.field_u = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  un.field_u = true;
                  break L2;
                }
              }
            }
            L6: {
              on.field_b = param1;
              if (un.field_u) {
                break L6;
              } else {
                if (ei.field_j >= ef.field_d) {
                  break L6;
                } else {
                  if (ah.field_h) {
                    ei.field_j = 0;
                    ci.field_g = oj.field_M;
                    ni.field_O = bg.field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (param0 <= -97) {
                break L7;
              } else {
                ve.a(-81, 8, false, 82, false);
                break L7;
              }
            }
            L8: {
              if (!un.field_u) {
                break L8;
              } else {
                if (ei.field_j != fj.field_jb) {
                  break L8;
                } else {
                  un.field_u = false;
                  ei.field_j = 0;
                  break L8;
                }
              }
            }
            bg.field_f = -1;
            oj.field_M = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("ve.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    public static void a(int param0) {
        field_n = (byte[][][]) null;
        field_f = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
            field_l = -119;
        }
    }

    ve(wl param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_j = param5;
            this.field_e = param0;
            this.field_i = param1;
            this.field_c = param6;
            this.field_b = param4;
            this.field_a = param2;
            this.field_m = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = 0;
        field_f = "Try again";
    }
}
