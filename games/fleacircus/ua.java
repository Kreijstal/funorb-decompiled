/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends bd implements da {
    static dd[] field_tb;
    static String field_xb;
    static long field_sb;
    private boolean field_wb;
    private ca field_ub;
    private boolean field_vb;

    public static void i(byte param0) {
        if (param0 <= 119) {
            ua.i((byte) -36);
            field_xb = null;
            field_tb = null;
            return;
        }
        field_xb = null;
        field_tb = null;
    }

    private final void a(byte param0, mk param1, boolean param2) {
        bb discarded$2 = null;
        bb discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        bm var5 = null;
        int var6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            this.field_wb = true;
            if (param0 == 58) {
              L1: {
                L2: {
                  if (param1.field_k) {
                    break L2;
                  } else {
                    L3: {
                      if (param1.field_j == null) {
                        break L3;
                      } else {
                        var4_ref = de.field_o;
                        if (null == this.field_ub) {
                          break L1;
                        } else {
                          this.field_ub.a(-72);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var4_ref = param1.field_b;
                    if (-249 == (param1.field_f ^ -1)) {
                      L4: {
                        if (param2) {
                          break L4;
                        } else {
                          ii.b(116);
                          break L4;
                        }
                      }
                      this.field_vb = true;
                      var4_ref = al.field_a;
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
                var4_ref = lc.field_q;
                break L1;
              }
              L5: {
                L6: {
                  var5 = new bm((bd) (this), rg.field_o, var4_ref);
                  if (!param1.field_k) {
                    break L6;
                  } else {
                    if (param1.field_g) {
                      this.d(new og((ua) (this)), 26034);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      discarded$2 = var5.a((kd) (this), true, ee.field_k);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (!this.field_vb) {
                      break L8;
                    } else {
                      discarded$3 = var5.a((kd) (this), true, ee.field_k);
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param1.field_f != 5) {
                      break L9;
                    } else {
                      var5.a(ld.field_c, -23493, 11);
                      var5.a(vk.field_K, -23493, 17);
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var5.a(mi.field_k, param0 + -23551, -1);
                  break L7;
                }
                if (param1.field_f == 3) {
                  var5.a(bm.field_N, -23493, 7);
                  break L5;
                } else {
                  if ((param1.field_f ^ -1) != -7) {
                    break L5;
                  } else {
                    var5.a(cb.field_s, param0 ^ -23551, 9);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      var5.a(bm.field_N, -23493, 7);
                      break L5;
                    }
                  }
                }
              }
              this.d(var5, param0 + 25976);
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
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var4);
            stackOut_35_1 = new StringBuilder().append("ua.BA(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
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

    final void h(byte param0) {
        if (param0 >= -3) {
            return;
        }
        this.a((byte) 58, af.a((byte) 36, 248, al.field_a), true);
    }

    final boolean a(int param0) {
        int var2 = 0;
        mk var3 = null;
        var2 = -66 / ((38 - param0) / 49);
        if (this.field_G) {
          if (!this.field_wb) {
            var3 = bg.a((byte) 56);
            if (var3 != null) {
              this.a((byte) 58, var3, false);
              return super.a(100);
            } else {
              return super.a(100);
            }
          } else {
            return super.a(100);
          }
        } else {
          return super.a(100);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (this.field_vb) {
              wa.a(false, true, param3 + -370);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                ih.l(255);
                this.n(param3 ^ -22669);
                if (param3 == 248) {
                  break L1;
                } else {
                  field_xb = (String) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ua.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ua(f param0, ca param1) {
        super(param0, rg.field_o, pb.field_b, false, false);
        try {
            this.field_ub = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_xb = "</shad>";
    }
}
