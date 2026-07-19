/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uc extends re implements jk {
    private le field_jb;
    static volatile int field_eb;
    private boolean field_ob;
    private md field_gb;
    static db[] field_hb;
    static String field_nb;
    static int field_fb;
    private boolean field_lb;
    private boolean field_db;
    private boolean field_ib;
    static String field_mb;
    static ik field_kb;

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (13 == param1) {
              this.g(true);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 23 % ((param3 - -13) / 55);
              stackOut_4_0 = super.a(param0, param1, param2, (byte) 114);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("uc.P(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final void a(int param0, int param1, String param2) {
        kf discarded$2 = null;
        kf discarded$3 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        vc var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vc stackIn_11_0 = null;
        vc stackIn_12_0 = null;
        vc stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vc stackOut_10_0 = null;
        vc stackOut_12_0 = null;
        String stackOut_12_1 = null;
        vc stackOut_11_0 = null;
        String stackOut_11_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_lb) {
              L1: {
                this.field_lb = true;
                var4_int = -97 / ((param0 - 31) / 49);
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (-257 != (param1 ^ -1)) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((uc) (this)).field_ob = stackIn_6_1 != 0;
                  this.field_gb.b(4210752, 8405024, 124);
                  var5 = new vc((uc) (this), this.field_jb, param2);
                  if (-6 == (param1 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if ((param1 ^ -1) != -257) {
                        break L4;
                      } else {
                        discarded$2 = var5.a(-1, og.field_j, (vd) (this));
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      stackOut_10_0 = (vc) (var5);
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (!this.field_ib) {
                        stackOut_12_0 = (vc) ((Object) stackIn_12_0);
                        stackOut_12_1 = a.field_e;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L5;
                      } else {
                        stackOut_11_0 = (vc) ((Object) stackIn_11_0);
                        stackOut_11_1 = og.field_j;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L5;
                      }
                    }
                    ((vc) (Object) stackIn_13_0).a(stackIn_13_1, -1, 111);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5.a(md.field_B, 11, 122);
                var5.a(jd.field_d, 17, -62);
                break L2;
              }
              L6: {
                L7: {
                  if ((param1 ^ -1) == -4) {
                    break L7;
                  } else {
                    L8: {
                      if (4 != param1) {
                        break L8;
                      } else {
                        var5.a(dj.field_a, 8, 111);
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (6 != param1) {
                        break L9;
                      } else {
                        var5.a(lb.field_b, 9, 105);
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (9 == param1) {
                      discarded$3 = var5.a(-1, qj.field_eb, (vd) (this));
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    } else {
                      this.b(118, var5);
                      return;
                    }
                  }
                }
                var5.a(pa.field_b, 7, 112);
                break L6;
              }
              this.b(118, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("uc.J(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(boolean param0) {
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (!this.field_D) {
          return;
        } else {
          this.field_D = false;
          if (param0) {
            if (this.field_ib) {
              L0: {
                if (param0) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  stackOut_24_0 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  break L0;
                }
              }
              u.h(stackIn_26_0 != 0);
              if (Lexicominos.field_L) {
                if (!this.field_db) {
                  return;
                } else {
                  tj.c(0);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!this.field_db) {
                return;
              } else {
                tj.c(0);
                return;
              }
            }
          } else {
            field_hb = (db[]) null;
            if (this.field_ib) {
              L1: {
                if (param0) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              u.h(stackIn_12_0 != 0);
              if (Lexicominos.field_L) {
                if (!this.field_db) {
                  return;
                } else {
                  tj.c(0);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!this.field_db) {
                return;
              } else {
                tj.c(0);
                return;
              }
            }
          }
        }
    }

    public void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_ob) {
                  break L2;
                } else {
                  ni.a(56, 3);
                  this.g(true);
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              pd.a("tochangedisplayname.ws", -109, kk.c(-14047));
              break L1;
            }
            if (param2 == 215535458) {
              break L0;
            } else {
              this.g(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void h(int param0) {
        field_hb = null;
        if (param0 != 11331) {
            return;
        }
        field_mb = null;
        field_nb = null;
        field_kb = null;
    }

    final void i(int param0) {
        this.field_gb.b(4210752, 2121792, 120);
        vc var2 = new vc((uc) (this), this.field_jb, la.field_a);
        var2.a(e.field_e, param0, 124);
        this.b(117, var2);
    }

    uc(eg param0, le param1, String param2, boolean param3, boolean param4) {
        super(param0, new vc((uc) null, param1, param2), 77, 10, 10);
        try {
            this.field_ob = false;
            this.field_lb = false;
            this.field_ib = param3 ? true : false;
            this.field_db = param4 ? true : false;
            this.field_jb = param1;
            this.field_gb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_gb.field_G = true;
            this.b((byte) -65, (w) (this.field_gb));
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_nb = "Passwords must be between 5 and 20 letters and numbers";
        field_eb = 0;
        field_mb = "Not yet achieved";
    }
}
