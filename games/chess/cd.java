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
        if (this.field_v == bi.field_f) {
          this.field_r.a(this.field_i, this.field_k);
          if (param0 != 56) {
            return;
          } else {
            L0: {
              if (null != this.field_t) {
                this.field_t.b(this.field_m, this.field_q.field_j / 2 + this.field_i, this.field_t.field_G / 2 + (this.field_q.field_i / 2 + this.field_k), this.field_o, this.field_n);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          if (this.field_v != ji.field_O) {
            this.field_q.a(this.field_i, this.field_k);
            if (param0 != 56) {
              return;
            } else {
              L1: {
                if (null != this.field_t) {
                  this.field_t.b(this.field_m, this.field_q.field_j / 2 + this.field_i, this.field_t.field_G / 2 + (this.field_q.field_i / 2 + this.field_k), this.field_o, this.field_n);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            if (null != this.field_s) {
              this.field_s.a(this.field_i, this.field_k);
              if (param0 != 56) {
                return;
              } else {
                L2: {
                  if (null != this.field_t) {
                    this.field_t.b(this.field_m, this.field_q.field_j / 2 + this.field_i, this.field_t.field_G / 2 + (this.field_q.field_i / 2 + this.field_k), this.field_o, this.field_n);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              this.field_q.a(this.field_i, this.field_k);
              if (param0 != 56) {
                return;
              } else {
                L3: {
                  if (null != this.field_t) {
                    this.field_t.b(this.field_m, this.field_q.field_j / 2 + this.field_i, this.field_t.field_G / 2 + (this.field_q.field_i / 2 + this.field_k), this.field_o, this.field_n);
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("cd.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean c(int param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 71 / ((-5 - param0) / 50);
        if (this.a((byte) -9)) {
          if ((wh.field_f ^ -1) == -2) {
            if (!this.field_w) {
              if (!this.field_u) {
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
          this.field_t = (lh) null;
          return this.field_q.b(this.field_i, this.field_k, hn.field_k, rf.field_b);
        } else {
          return this.field_q.b(this.field_i, this.field_k, hn.field_k, rf.field_b);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackOut_74_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var3 = Chess.field_G;
        if (this.field_d) {
          this.field_v = bi.field_f;
          if (this.field_y) {
            if (this.c(82)) {
              L0: {
                stackOut_74_0 = this;
                stackIn_76_0 = stackOut_74_0;
                stackIn_75_0 = stackOut_74_0;
                if (this.field_d) {
                  stackOut_76_0 = this;
                  stackOut_76_1 = 0;
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  break L0;
                } else {
                  stackOut_75_0 = this;
                  stackOut_75_1 = 1;
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_77_1 = stackOut_75_1;
                  break L0;
                }
              }
              ((cd) (this)).field_d = stackIn_77_1 != 0;
              if (param0 == 34) {
                return;
              } else {
                var4 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
                return;
              }
            } else {
              if (param0 != 34) {
                var4 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
                return;
              } else {
                return;
              }
            }
          } else {
            if (this.c(91)) {
              this.field_d = true;
              if (param0 != 34) {
                var4 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
                return;
              } else {
                return;
              }
            } else {
              this.field_d = false;
              if (param0 != 34) {
                var4 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (!this.a((byte) -9)) {
            L1: {
              this.field_v = mi.field_r;
              if (this.field_y) {
                if (this.c(82)) {
                  L2: {
                    stackOut_51_0 = this;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (this.field_d) {
                      stackOut_53_0 = this;
                      stackOut_53_1 = 0;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      break L2;
                    } else {
                      stackOut_52_0 = this;
                      stackOut_52_1 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L2;
                    }
                  }
                  ((cd) (this)).field_d = stackIn_54_1 != 0;
                  break L1;
                } else {
                  L3: {
                    if (param0 == 34) {
                      break L3;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                if (this.c(91)) {
                  this.field_d = true;
                  break L1;
                } else {
                  this.field_d = false;
                  break L1;
                }
              }
            }
            if (param0 != 34) {
              var4 = (byte[]) null;
              cd.a(67, (byte[]) null, true, -63, -46, 41);
              return;
            } else {
              return;
            }
          } else {
            if (1 == wh.field_f) {
              this.field_v = bi.field_f;
              if (this.field_y) {
                if (this.c(82)) {
                  L4: {
                    stackOut_36_0 = this;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (this.field_d) {
                      stackOut_38_0 = this;
                      stackOut_38_1 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      break L4;
                    } else {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      break L4;
                    }
                  }
                  ((cd) (this)).field_d = stackIn_39_1 != 0;
                  if (param0 != 34) {
                    var4 = (byte[]) null;
                    cd.a(67, (byte[]) null, true, -63, -46, 41);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    if (param0 == 34) {
                      break L5;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                if (!this.c(91)) {
                  L6: {
                    this.field_d = false;
                    if (param0 == 34) {
                      break L6;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L6;
                    }
                  }
                  return;
                } else {
                  L7: {
                    this.field_d = true;
                    if (param0 == 34) {
                      break L7;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L7;
                    }
                  }
                  return;
                }
              }
            } else {
              this.field_v = ji.field_O;
              if (this.field_y) {
                if (this.c(82)) {
                  L8: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (this.field_d) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L8;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L8;
                    }
                  }
                  ((cd) (this)).field_d = stackIn_19_1 != 0;
                  if (param0 != 34) {
                    var4 = (byte[]) null;
                    cd.a(67, (byte[]) null, true, -63, -46, 41);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L9: {
                    if (param0 == 34) {
                      break L9;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                if (!this.c(91)) {
                  L10: {
                    this.field_d = false;
                    if (param0 == 34) {
                      break L10;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    this.field_d = true;
                    if (param0 == 34) {
                      break L11;
                    } else {
                      var4 = (byte[]) null;
                      cd.a(67, (byte[]) null, true, -63, -46, 41);
                      break L11;
                    }
                  }
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
        byte[] discarded$0 = null;
        try {
            var2 = new km(param1.a("final_frame.jpg", 30045, ""), (java.awt.Component) ((Object) ja.field_h));
            var3 = var2.field_w;
            var4 = var2.field_t;
            r.k(3029);
            v.field_i = new km(var3, 3 * var4 / 4);
            v.field_i.e();
            if (param0 < 125) {
                String var5 = (String) null;
                discarded$0 = cd.a((String) null, -127);
            }
            var2.d(0, 0);
            re.field_u = new km(var3, -v.field_i.field_t + var4);
            re.field_u.e();
            var2.d(0, -v.field_i.field_t);
            re.field_u.field_r = v.field_i.field_t;
            fd.a(28773);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "cd.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4, int param5) {
        nk var6 = null;
        int var7 = 0;
        int var9 = 0;
        try {
            var6 = qn.field_U;
            var6.f(param3, -82);
            var6.field_l = var6.field_l + 1;
            var7 = var6.field_l;
            var6.c(4, (byte) -75);
            int var8 = -76 / ((param5 - -3) / 40);
            var6.c(param4, (byte) 83);
            var9 = param0;
            if (!(!param2)) {
                var9 += 128;
            }
            var6.c(var9, (byte) 81);
            var6.a(param1, (byte) -45, 0, param1.length);
            var6.a(var6.field_l - var7, -1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "cd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        this.d((byte) 34);
        this.field_u = wh.field_f == 1 ? true : false;
        if (param0 > -70) {
            cd.a(18);
            return;
        }
    }

    cd(int param0, int param1, rk param2, rk param3, rk param4, boolean param5, boolean param6) {
        this.field_o = 1;
        this.field_w = false;
        this.field_u = false;
        this.field_y = false;
        this.field_n = -1;
        try {
            this.field_i = param0;
            this.field_y = param5 ? true : false;
            this.field_q = param2;
            this.field_k = param1;
            this.field_w = param6 ? true : false;
            this.field_r = param3;
            this.field_s = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "cd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
