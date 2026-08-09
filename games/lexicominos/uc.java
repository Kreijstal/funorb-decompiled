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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 == param1) {
              this.g(true);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 23 % ((param3 - -13) / 55);
              stackIn_5_0 = super.a(param0, param1, param2, (byte) 114);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("uc.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vc stackIn_12_0 = null;
        vc stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        vc var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_lb) {
              L1: {
                this.field_lb = true;
                var4_int = -97 / ((param0 - 31) / 49);
                stackIn_5_0 = this;

                if (-257 != (param1 ^ -1)) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
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
                        var5.a(-1, og.field_j, (vd) (this));
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      stackIn_12_0 = (vc) (var5);

                      if (!this.field_ib) {
                        stackIn_13_0 = (vc) ((Object) stackIn_12_0);
                        stackIn_13_1 = a.field_e;
                        break L5;
                      } else {
                        stackIn_13_0 = (vc) ((Object) stackIn_12_0);
                        stackIn_13_1 = og.field_j;
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
                      var5.a(-1, qj.field_eb, (vd) (this));
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
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("uc.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
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
        if (!this.field_D) {
          return;
        } else {
          this.field_D = false;
          if (param0) {
            if (this.field_ib) {
              L0: {
                if (param0) {
                  stackIn_26_0 = 0;
                  break L0;
                } else {
                  stackIn_26_0 = 1;
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
                  stackIn_12_0 = 0;
                  break L1;
                } else {
                  stackIn_12_0 = 1;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
