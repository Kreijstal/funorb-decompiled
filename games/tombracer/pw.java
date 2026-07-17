/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pw extends fqa {
    private int field_K;
    private int field_L;
    private int field_J;

    final static void a(boolean param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var7 = 0;
        jea var8 = null;
        gqa var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (pk.field_r >= pna.field_q) {
                break L1;
              } else {
                pk.field_r = pk.field_r + 1;
                break L1;
              }
            }
            L2: {
              if (mha.field_E != gn.field_C.field_e) {
                tj.field_b = tj.field_b + (gn.field_C.field_e - mha.field_E);
                mha.field_E = gn.field_C.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            if (pk.field_r > 0) {
              L3: {
                rg.a((byte) -53);
                era.field_e.c(37, param0);
                if (null != apa.field_c) {
                  if (!fua.field_g) {
                    apa.field_c = null;
                    break L3;
                  } else {
                    boolean discarded$1 = apa.field_c.a(era.field_e.field_A, param0, era.field_e.field_q, -90);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (0 != ara.field_ub.field_y) {
                      fj.field_c = new wla(ara.field_ub.field_q, ara.field_ub.field_A, ara.field_ub.field_G, ara.field_ub.field_t, param2, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = mna.a((byte) 73, param3, di.field_a, mna.field_d);
                    if (var9 == null) {
                      var5 = fa.a((byte) -126);
                      break L6;
                    } else {
                      hpa.a(-2, var9);
                      var5 = fa.a((byte) -126);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == null) {
                      break L7;
                    } else {
                      qda.field_b = var5;
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  L8: {
                    var8 = wba.field_p[var4_int];
                    if (var8 == null) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "pw.VB(" + param0 + 44 + -112 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return -28;
        }
        return 3;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            ((pw) this).field_K = -83;
            return false;
        }
        return false;
    }

    final static void C() {
        if (-gpa.field_b != tl.field_r) {
            if (tl.field_r != 250 - gpa.field_b) {
            }
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((pw) this).field_L = 117;
            return false;
        }
        return false;
    }

    pw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((pw) this).field_L = 2;
        try {
            ((pw) this).field_L = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          super.q(param0);
          var2 = ((pw) this).field_m;
          if (3 != var2) {
            if (var2 != 4) {
              ((pw) this).field_J = -1;
              ((pw) this).field_K = -1;
              break L0;
            } else {
              ((pw) this).field_J = 2;
              ((pw) this).field_K = 2;
              break L0;
            }
          } else {
            ((pw) this).field_J = 1;
            ((pw) this).field_K = 1;
            break L0;
          }
        }
        ((pw) this).b(106, ((pw) this).field_J * 2097152, 2097152 * ((pw) this).field_K);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            ((pw) this).field_J = 97;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((pw) this).v(97);
        }
        return 5;
    }

    pw(la param0, int param1) {
        super(param0, param1);
        ((pw) this).field_L = 2;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        int var5_int = 0;
        dja var5 = null;
        mfa var6 = null;
        cv var7 = null;
        int var8 = 0;
        int var9 = 0;
        fsa var10 = null;
        fsa stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new fsa(param2, param0);
              var5_int = ((pw) this).field_m;
              if (var5_int == 54) {
                ((pw) this).field_k = 2097152;
                break L1;
              } else {
                if (55 == var5_int) {
                  ((pw) this).field_l = 2097152;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var10.b((byte) -11, ((pw) this).field_k, ((pw) this).field_l);
              var5 = new dja(param2, param0);
              var5.a(((pw) this).field_L, true);
              ((pw) this).a((ut) (Object) var5, (byte) -94);
              var10.a((byte) 83, (nv) (Object) var5);
              var6 = rm.field_a;
              var7 = (cv) (Object) var6.a(9, param1 ^ 113);
              if (param1 == 3) {
                break L2;
              } else {
                ((pw) this).field_K = 33;
                break L2;
              }
            }
            L3: {
              var8 = ((pw) this).field_m;
              if (var8 != 3) {
                if (var8 != 4) {
                  if (54 == var8) {
                    var7.b(4, (byte) -112);
                    break L3;
                  } else {
                    if (var8 == 55) {
                      var7.b(5, (byte) -112);
                      break L3;
                    } else {
                      var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
                      return var10;
                    }
                  }
                } else {
                  var7.b(2, (byte) -112);
                  break L3;
                }
              } else {
                var7.b(0, (byte) -112);
                break L3;
              }
            }
            var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_19_0 = (fsa) var10;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("pw.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final static ha a(int param0, java.awt.Canvas param1, int param2, byte param3, d param4) {
        RuntimeException var5 = null;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = new oa(param1, param4, param2, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("pw.TB(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(-62).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return (ha) (Object) stackIn_3_0;
    }

    final boolean v(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == 555277520) {
            break L0;
          } else {
            ((pw) this).field_K = -36;
            break L0;
          }
        }
        var2 = ((pw) this).field_m;
        if (var2 == 54) {
          return true;
        } else {
          if (var2 != 55) {
            return false;
          } else {
            return true;
          }
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, ((pw) this).field_L, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pw.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            ((pw) this).field_K = -50;
            return true;
        }
        return true;
    }

    static {
    }
}
