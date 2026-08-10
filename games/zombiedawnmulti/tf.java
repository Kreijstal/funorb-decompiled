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
        gh var2;
        uj var3;
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
          tf.a((uj) null, (byte) -100);
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        wd var5 = null;
        int var6 = 0;
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
              if (!param2.field_d) {
                if (param2.field_b != null) {
                  var4 = wg.field_d;
                  if (this.field_Gb != null) {
                    this.field_Gb.a(496);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = param2.field_h;
                  if ((param2.field_c ^ -1) != -249) {
                    break L2;
                  } else {
                    L3: {
                      if (!param1) {
                        nq.f(-42);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = ba.field_p;
                    this.field_Ib = true;
                    break L2;
                  }
                }
              } else {
                var4 = qa.field_g;
                break L2;
              }
            }
            L4: {
              var5 = new wd((ne) (this), ci.field_d, var4);
              if (!param2.field_d) {
                L5: {
                  if (!this.field_Ib) {
                    if (-6 != (param2.field_c ^ -1)) {
                      var5.a(sn.field_Zb, -1, true);
                      break L5;
                    } else {
                      var5.a(lc.field_g, 11, true);
                      var5.a(oe.field_b, 17, true);
                      break L5;
                    }
                  } else {
                    var5.a(ub.field_xb, param0 ^ 58, (bj) (this));
                    break L5;
                  }
                }
                if (param2.field_c == 3) {
                  var5.a(od.field_zb, 7, true);
                  break L4;
                } else {
                  if ((param2.field_c ^ -1) != -7) {
                    break L4;
                  } else {
                    var5.a(wm.field_S, 9, true);
                    break L4;
                  }
                }
              } else {
                if (param2.field_e) {
                  this.a((cf) (new pj((tf) (this))), (byte) 122);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a(ub.field_xb, -112, (bj) (this));
                  break L4;
                }
              }
            }
            this.a((cf) (var5), (byte) 125);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L6;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static we a(uj param0, byte param1) {
        we var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -62) {
                break L1;
              } else {
                var3 = (uj) null;
                tf.a((uj) null, (byte) 86);
                break L1;
              }
            }
            var2 = new we(param0, param0);
            gb.field_e.a(var2, false);
            bh.field_a.b(param0);
            stackIn_3_0 = (we) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("tf.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
