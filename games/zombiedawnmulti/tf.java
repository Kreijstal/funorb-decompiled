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
        if (((tf) this).field_Ib) {
            io.a(-21113, true, false);
            return;
        }
        try {
            int discarded$0 = 62;
            va.a();
            ((tf) this).m(-7435);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "tf.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean i(int param0) {
        gh var2 = null;
        Object var3 = null;
        if (param0 == -27388) {
          if (((tf) this).field_R) {
            if (!((tf) this).field_Fb) {
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
          var3 = null;
          we discarded$5 = tf.a((uj) null, (byte) -100);
          if (((tf) this).field_R) {
            if (!((tf) this).field_Fb) {
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
        RuntimeException var4 = null;
        String var4_ref = null;
        wd var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((tf) this).field_Fb = true;
              if (!param2.field_d) {
                if (param2.field_b != null) {
                  var4_ref = wg.field_d;
                  if (((tf) this).field_Gb != null) {
                    ((tf) this).field_Gb.a(496);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param2.field_h;
                  if (param2.field_c != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param1) {
                        nq.f(-42);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = ba.field_p;
                    ((tf) this).field_Ib = true;
                    break L1;
                  }
                }
              } else {
                var4_ref = qa.field_g;
                break L1;
              }
            }
            L3: {
              var5 = new wd((ne) this, ci.field_d, var4_ref);
              if (!param2.field_d) {
                L4: {
                  if (!((tf) this).field_Ib) {
                    if (param2.field_c != 5) {
                      var5.a(sn.field_Zb, -1, true);
                      break L4;
                    } else {
                      var5.a(lc.field_g, 11, true);
                      var5.a(oe.field_b, 17, true);
                      break L4;
                    }
                  } else {
                    gn discarded$2 = var5.a(ub.field_xb, -64, (bj) this);
                    break L4;
                  }
                }
                if (param2.field_c == 3) {
                  var5.a(od.field_zb, 7, true);
                  break L3;
                } else {
                  if (param2.field_c != 6) {
                    break L3;
                  } else {
                    var5.a(wm.field_S, 9, true);
                    break L3;
                  }
                }
              } else {
                if (param2.field_e) {
                  ((tf) this).a((cf) (Object) new pj((tf) this), (byte) 122);
                  return;
                } else {
                  gn discarded$3 = var5.a(ub.field_xb, -112, (bj) this);
                  break L3;
                }
              }
            }
            ((tf) this).a((cf) (Object) var5, (byte) 125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("tf.A(").append(-6).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    final static we a(uj param0, byte param1) {
        we var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
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
                var3 = null;
                we discarded$2 = tf.a((uj) null, (byte) 86);
                break L1;
              }
            }
            var2 = new we(param0, (br) (Object) param0);
            gb.field_e.a((br) (Object) var2, false);
            bh.field_a.b((gq) (Object) param0);
            stackOut_2_0 = (we) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("tf.D(");
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    tf(vk param0, fe param1) {
        super(param0, ci.field_d, og.field_M, false, false);
        try {
            ((tf) this).field_Gb = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "tf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void p(int param0) {
        this.a(-6, true, p.a(-97, ba.field_p, param0));
    }

    public static void o() {
        field_Cb = null;
        field_Hb = null;
        int var1 = 12;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = -1;
        field_Eb = 0;
        field_Cb = "Members' Benefits";
    }
}
