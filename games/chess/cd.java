/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends pk {
    private boolean field_w;
    private int field_v;
    private String field_m;
    static w field_x;
    private lh field_t;
    private int field_o;
    static int field_p;
    boolean field_u;
    private boolean field_y;
    private rk field_q;
    private rk field_s;
    private rk field_r;
    private int field_n;

    final void c(byte param0) {
        int var3 = 0;
        var3 = Chess.field_G;
        if (((cd) this).field_v == bi.field_f) {
          ((cd) this).field_r.a(((cd) this).field_i, ((cd) this).field_k);
          if (param0 != 56) {
            return;
          } else {
            L0: {
              if (null != ((cd) this).field_t) {
                ((cd) this).field_t.b(((cd) this).field_m, ((cd) this).field_q.field_j / 2 + ((cd) this).field_i, ((cd) this).field_t.field_G / 2 + (((cd) this).field_q.field_i / 2 + ((cd) this).field_k), ((cd) this).field_o, ((cd) this).field_n);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          if (((cd) this).field_v != ji.field_O) {
            ((cd) this).field_q.a(((cd) this).field_i, ((cd) this).field_k);
            if (param0 != 56) {
              return;
            } else {
              L1: {
                if (null != ((cd) this).field_t) {
                  ((cd) this).field_t.b(((cd) this).field_m, ((cd) this).field_q.field_j / 2 + ((cd) this).field_i, ((cd) this).field_t.field_G / 2 + (((cd) this).field_q.field_i / 2 + ((cd) this).field_k), ((cd) this).field_o, ((cd) this).field_n);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            if (null != ((cd) this).field_s) {
              ((cd) this).field_s.a(((cd) this).field_i, ((cd) this).field_k);
              if (param0 != 56) {
                return;
              } else {
                L2: {
                  if (null != ((cd) this).field_t) {
                    ((cd) this).field_t.b(((cd) this).field_m, ((cd) this).field_q.field_j / 2 + ((cd) this).field_i, ((cd) this).field_t.field_G / 2 + (((cd) this).field_q.field_i / 2 + ((cd) this).field_k), ((cd) this).field_o, ((cd) this).field_n);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              ((cd) this).field_q.a(((cd) this).field_i, ((cd) this).field_k);
              if (param0 != 56) {
                return;
              } else {
                L3: {
                  if (null != ((cd) this).field_t) {
                    ((cd) this).field_t.b(((cd) this).field_m, ((cd) this).field_q.field_j / 2 + ((cd) this).field_i, ((cd) this).field_t.field_G / 2 + (((cd) this).field_q.field_i / 2 + ((cd) this).field_k), ((cd) this).field_o, ((cd) this).field_n);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static byte[] a(String param0, int param1) {
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
              if (param1 <= -73) {
                break L1;
              } else {
                field_p = 49;
                break L1;
              }
            }
            stackOut_2_0 = sc.field_c.a("", 30045, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("cd.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean c(int param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 71 / ((-5 - param0) / 50);
        if (((cd) this).a((byte) -9)) {
          if (wh.field_f == 1) {
            if (!((cd) this).field_w) {
              if (!((cd) this).field_u) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0) {
        if (param0 != -9) {
          ((cd) this).field_t = null;
          return ((cd) this).field_q.b(((cd) this).field_i, ((cd) this).field_k, hn.field_k, rf.field_b);
        } else {
          return ((cd) this).field_q.b(((cd) this).field_i, ((cd) this).field_k, hn.field_k, rf.field_b);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d() {
        int var3 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        var3 = Chess.field_G;
        if (((cd) this).field_d) {
          ((cd) this).field_v = bi.field_f;
          if (((cd) this).field_y) {
            if (!this.c(82)) {
              return;
            } else {
              L0: {
                stackOut_45_0 = this;
                stackIn_47_0 = stackOut_45_0;
                stackIn_46_0 = stackOut_45_0;
                if (((cd) this).field_d) {
                  stackOut_47_0 = this;
                  stackOut_47_1 = 0;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  break L0;
                } else {
                  stackOut_46_0 = this;
                  stackOut_46_1 = 1;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  break L0;
                }
              }
              ((cd) this).field_d = stackIn_48_1 != 0;
              return;
            }
          } else {
            if (!this.c(91)) {
              ((cd) this).field_d = false;
              return;
            } else {
              ((cd) this).field_d = true;
              return;
            }
          }
        } else {
          if (!((cd) this).a((byte) -9)) {
            ((cd) this).field_v = mi.field_r;
            if (((cd) this).field_y) {
              if (!this.c(82)) {
                return;
              } else {
                L1: {
                  stackOut_33_0 = this;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (((cd) this).field_d) {
                    stackOut_35_0 = this;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L1;
                  } else {
                    stackOut_34_0 = this;
                    stackOut_34_1 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L1;
                  }
                }
                ((cd) this).field_d = stackIn_36_1 != 0;
                return;
              }
            } else {
              if (!this.c(91)) {
                ((cd) this).field_d = false;
                return;
              } else {
                ((cd) this).field_d = true;
                return;
              }
            }
          } else {
            if (1 == wh.field_f) {
              ((cd) this).field_v = bi.field_f;
              if (((cd) this).field_y) {
                if (!this.c(82)) {
                  return;
                } else {
                  L2: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (((cd) this).field_d) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L2;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L2;
                    }
                  }
                  ((cd) this).field_d = stackIn_24_1 != 0;
                  return;
                }
              } else {
                if (!this.c(91)) {
                  ((cd) this).field_d = false;
                  return;
                } else {
                  ((cd) this).field_d = true;
                  return;
                }
              }
            } else {
              ((cd) this).field_v = ji.field_O;
              if (((cd) this).field_y) {
                if (!this.c(82)) {
                  return;
                } else {
                  L3: {
                    stackOut_9_0 = this;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (((cd) this).field_d) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L3;
                    }
                  }
                  ((cd) this).field_d = stackIn_12_1 != 0;
                  return;
                }
              } else {
                if (!this.c(91)) {
                  ((cd) this).field_d = false;
                  return;
                } else {
                  ((cd) this).field_d = true;
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, um param1) {
        km var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new km(param1.a("final_frame.jpg", 30045, ""), (java.awt.Component) (Object) ja.field_h);
            var3 = var2.field_w;
            var4 = var2.field_t;
            r.k(3029);
            v.field_i = new km(var3, 3 * var4 / 4);
            v.field_i.e();
            var2.d(0, 0);
            re.field_u = new km(var3, -v.field_i.field_t + var4);
            re.field_u.e();
            var2.d(0, -v.field_i.field_t);
            re.field_u.field_r = v.field_i.field_t;
            int discarded$0 = 28773;
            fd.a();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cd.K(" + 127 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1570) {
            field_p = -20;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4) {
        nk var6 = null;
        int var7 = 0;
        int var9 = 0;
        try {
            var6 = qn.field_U;
            var6.f(11, -82);
            var6.field_l = var6.field_l + 1;
            var7 = var6.field_l;
            var6.c(4, (byte) -75);
            int var8 = -25;
            var6.c(param4, (byte) 83);
            var9 = 0;
            var9 += 128;
            var6.c(var9, (byte) 81);
            var6.a(param1, (byte) -45, 0, param1.length);
            var6.a(var6.field_l - var7, -1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cd.F(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ',' + 11 + ',' + param4 + ',' + 121 + ')');
        }
    }

    final void b(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          int discarded$2 = 34;
          this.d();
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (wh.field_f != 1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((cd) this).field_u = stackIn_3_1 != 0;
        if (param0 > -70) {
          cd.a(18);
          return;
        } else {
          return;
        }
    }

    cd(int param0, int param1, rk param2, rk param3, rk param4, boolean param5, boolean param6) {
        ((cd) this).field_o = 1;
        ((cd) this).field_w = false;
        ((cd) this).field_u = false;
        ((cd) this).field_y = false;
        ((cd) this).field_n = -1;
        try {
            ((cd) this).field_i = param0;
            ((cd) this).field_y = param5 ? true : false;
            ((cd) this).field_q = param2;
            ((cd) this).field_k = param1;
            ((cd) this).field_w = param6 ? true : false;
            ((cd) this).field_r = param3;
            ((cd) this).field_s = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
