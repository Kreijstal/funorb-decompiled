/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ne implements in {
    static ja[] field_Hb;
    private boolean field_Ib;
    static int field_Eb;
    static int field_Db;
    static String field_Cb;
    private fe field_Gb;
    private boolean field_Fb;

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param3 >= -83) {
            return;
        }
        if (this.field_Ib) {
            io.a(-21113, true, false);
            return;
        }
        try {
            va.a((byte) 62);
            this.m(-7435);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tf.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean i(int param0) {
        we discarded$5 = null;
        gh var2 = null;
        uj var3 = null;
        if (param0 == -27388) {
          if (this.field_R) {
            if (!this.field_Fb) {
              var2 = of.d(param0 ^ -27388);
              if (var2 == null) {
                return super.i(-27388);
              } else {
                this.a(-6, false, var2);
                return super.i(-27388);
              }
            } else {
              return super.i(-27388);
            }
          } else {
            return super.i(-27388);
          }
        } else {
          var3 = (uj) null;
          discarded$5 = tf.a((uj) null, (byte) -100);
          if (this.field_R) {
            if (!this.field_Fb) {
              var2 = of.d(param0 ^ -27388);
              if (var2 == null) {
                return super.i(-27388);
              } else {
                this.a(-6, false, var2);
                return super.i(-27388);
              }
            } else {
              return super.i(-27388);
            }
          } else {
            return super.i(-27388);
          }
        }
    }

    private final void a(int param0, boolean param1, gh param2) {
        gn discarded$2 = null;
        gn discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        wd var5 = null;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Fb = true;
              if (param0 == -6) {
                break L1;
              } else {
                field_Eb = 69;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2.field_d) {
                  break L3;
                } else {
                  var4_ref = qa.field_g;
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param2.field_b != null) {
                  break L4;
                } else {
                  var4_ref = param2.field_h;
                  if ((param2.field_c ^ -1) != -249) {
                    break L2;
                  } else {
                    L5: {
                      if (!param1) {
                        nq.f(-42);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4_ref = ba.field_p;
                    this.field_Ib = true;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var4_ref = wg.field_d;
              if (this.field_Gb != null) {
                this.field_Gb.a(496);
                break L2;
              } else {
                break L2;
              }
            }
            L6: {
              L7: {
                var5 = new wd((ne) (this), ci.field_d, var4_ref);
                if (!param2.field_d) {
                  break L7;
                } else {
                  if (param2.field_e) {
                    this.a((cf) (new pj((tf) (this))), (byte) 122);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    discarded$2 = var5.a(ub.field_xb, -112, (bj) (this));
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (!this.field_Ib) {
                    break L9;
                  } else {
                    discarded$3 = var5.a(ub.field_xb, param0 ^ 58, (bj) (this));
                    if (var6 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (-6 != (param2.field_c ^ -1)) {
                  var5.a(sn.field_Zb, -1, true);
                  break L8;
                } else {
                  var5.a(lc.field_g, 11, true);
                  var5.a(oe.field_b, 17, true);
                  if (var6 == 0) {
                    break L8;
                  } else {
                    var5.a(sn.field_Zb, -1, true);
                    break L8;
                  }
                }
              }
              if (param2.field_c == 3) {
                var5.a(od.field_zb, 7, true);
                break L6;
              } else {
                if ((param2.field_c ^ -1) != -7) {
                  break L6;
                } else {
                  var5.a(wm.field_S, 9, true);
                  if (var6 == 0) {
                    break L6;
                  } else {
                    var5.a(od.field_zb, 7, true);
                    break L6;
                  }
                }
              }
            }
            this.a((cf) (var5), (byte) 125);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static we a(uj param0, byte param1) {
        we discarded$2 = null;
        we var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_2_0 = null;
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
              if (param1 <= -62) {
                break L1;
              } else {
                var3 = (uj) null;
                discarded$2 = tf.a((uj) null, (byte) 86);
                break L1;
              }
            }
            var2 = new we(param0, param0);
            gb.field_e.a(var2, false);
            bh.field_a.b(param0);
            stackOut_2_0 = (we) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("tf.D(");
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    tf(vk param0, fe param1) {
        super(param0, ci.field_d, og.field_M, false, false);
        try {
            this.field_Gb = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.a(-6, true, p.a(-97, ba.field_p, param0));
    }

    public static void o(int param0) {
        field_Cb = null;
        field_Hb = null;
        int var1 = -24 / ((10 - param0) / 37);
    }

    static {
        field_Db = -1;
        field_Eb = 0;
        field_Cb = "Members' Benefits";
    }
}
