/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dh implements ai {
    private boolean field_lb;
    private boolean field_kb;
    private rf field_jb;
    static int field_fb;
    static ki field_hb;
    static String field_gb;
    static pk field_ib;

    final boolean d(boolean param0) {
        qj var2;
        if (!param0) {
          if (this.field_A) {
            if (!this.field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        } else {
          field_ib = (pk) null;
          if (this.field_A) {
            if (!this.field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        if (!(!this.field_kb)) {
            wj.a(-108, false, true);
            return;
        }
        try {
            int var6_int = -48 % ((-3 - param0) / 62);
            mh.b((byte) -57);
            this.q(4210752);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ig.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void r(int param0) {
        field_ib = null;
        field_gb = null;
        field_hb = null;
        if (param0 != 11285) {
            ig.r(29);
        }
    }

    private final void a(boolean param0, byte param1, qj param2) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ec var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_lb = true;
                if (param2.field_f) {
                  break L2;
                } else {
                  L3: {
                    if (param2.field_c != null) {
                      break L3;
                    } else {
                      var4 = param2.field_e;
                      if ((param2.field_b ^ -1) != -249) {
                        break L1;
                      } else {
                        L4: {
                          if (param0) {
                            break L4;
                          } else {
                            km.a(16711935);
                            break L4;
                          }
                        }
                        var4 = tb.field_a;
                        this.field_kb = true;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = j.field_c;
                  if (null != this.field_jb) {
                    this.field_jb.a((byte) -8);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var4 = bd.field_m;
              break L1;
            }
            if (param1 >= 115) {
              L5: {
                L6: {
                  var5 = new ec((dh) (this), qc.field_b, var4);
                  if (param2.field_f) {
                    break L6;
                  } else {
                    L7: {
                      if (this.field_kb) {
                        var5.a(sk.field_C, -34, (ag) (this));
                        break L7;
                      } else {
                        L8: {
                          if ((param2.field_b ^ -1) == -6) {
                            break L8;
                          } else {
                            var5.a(vc.field_i, -1, -15858);
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var5.a(vc.field_n, 11, -15858);
                        var5.a(ld.field_d, 17, -15858);
                        if (var6 == 0) {
                          break L7;
                        } else {
                          var5.a(sk.field_C, -34, (ag) (this));
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (3 != param2.field_b) {
                        break L9;
                      } else {
                        var5.a(vk.field_y, 7, -15858);
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (6 != param2.field_b) {
                      break L5;
                    } else {
                      var5.a(qf.field_k, 9, -15858);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (param2.field_d) {
                  this.a(false, new ob((ig) (this)));
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.a(sk.field_C, -34, (ag) (this));
                  break L5;
                }
              }
              this.a(false, var5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4_ref = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var4_ref);

            stackIn_37_1 = new StringBuilder().append("ig.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    ig(sk param0, rf param1) {
        super(param0, qc.field_b, bh.field_f, false, false);
        try {
            this.field_jb = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(byte param0) {
        int var2 = -19 % ((-21 - param0) / 42);
        this.a(true, (byte) 122, oe.a(248, tb.field_a, -3));
    }

    static {
        field_gb = "NORMO";
        field_fb = 0;
    }
}
