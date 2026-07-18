/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends dg {
    private fla field_s;
    private int field_p;
    private int field_r;
    static String field_m;
    private int field_q;
    static su field_o;
    static String field_n;

    final void a(int param0, la param1, kh param2) {
        super.a(126, param1, param2);
        if (param1.field_E <= 17) {
            return;
        }
        if (param0 < 119) {
            return;
        }
        try {
            ((lfa) this).field_q = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lfa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    lfa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final int m(byte param0) {
        if (param0 > -63) {
            return -74;
        }
        return -1;
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        super.h(78);
        var2 = ((lfa) this).field_q;
        if (var2 != 0) {
          if (var2 == 1) {
            ((lfa) this).field_q = 0;
            if (param0 > 0) {
              return;
            } else {
              var4 = null;
              ((lfa) this).a(-98, (la) null, (kh) null);
              return;
            }
          } else {
            if (3 != var2) {
              if (var2 != 4) {
                if (param0 <= 0) {
                  var4 = null;
                  ((lfa) this).a(-98, (la) null, (kh) null);
                  return;
                } else {
                  return;
                }
              } else {
                ((lfa) this).field_q = 3;
                if (param0 <= 0) {
                  var4 = null;
                  ((lfa) this).a(-98, (la) null, (kh) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((lfa) this).field_q = 4;
              if (param0 <= 0) {
                var4 = null;
                ((lfa) this).a(-98, (la) null, (kh) null);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((lfa) this).field_q = 1;
          if (param0 > 0) {
            return;
          } else {
            var4 = null;
            ((lfa) this).a(-98, (la) null, (kh) null);
            return;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = null;
              var8 = ((lfa) this).field_q;
              if (var8 != 0) {
                if (var8 != 1) {
                  if (var8 == 2) {
                    var7 = (Object) (Object) ta.field_ub[22];
                    break L1;
                  } else {
                    if (var8 != 3) {
                      if (4 != var8) {
                        if (5 == var8) {
                          var7 = (Object) (Object) ta.field_ub[25];
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        var7 = (Object) (Object) ta.field_ub[24];
                        break L1;
                      }
                    } else {
                      var7 = (Object) (Object) ta.field_ub[23];
                      break L1;
                    }
                  }
                } else {
                  var7 = (Object) (Object) ta.field_ub[21];
                  break L1;
                }
              } else {
                var7 = (Object) (Object) ta.field_ub[20];
                break L1;
              }
            }
            L2: {
              var8 = -76 / ((-38 - param4) / 47);
              if (var7 == null) {
                break L2;
              } else {
                var9 = dfa.a(4096 + var6_int - ((lfa) this).field_h.g(-25787) >> 2, 2048, 102);
                gqa.a(var9, -83584144, param1, param2, (ka) var7, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("lfa.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
            ((lfa) this).field_r = param1.d(param2 + -33);
            ((lfa) this).field_p = param1.e(param2 + 9612);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lfa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void i() {
        field_o = null;
        field_m = null;
        field_n = null;
    }

    final int f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = -36 % ((15 - param0) / 45);
        var3 = ((lfa) this).field_q;
        if (var3 != 2) {
          if (5 == var3) {
            return 2;
          } else {
            return -1;
          }
        } else {
          return 2;
        }
    }

    final void d(int param0) {
        fsa var3 = null;
        int var5 = 0;
        Object var6 = null;
        w var6_ref = null;
        vna var7 = null;
        vna var8 = null;
        var6 = null;
        var6_ref = (w) (Object) ((lfa) this).a(110).field_G;
        if (var6_ref == null) {
          return;
        } else {
          var3 = (fsa) (Object) ((lfa) this).field_h;
          if (!var3.x(param0 + 15471).i(param0 + -14885)) {
            if (param0 == -1) {
              if (-3 != ((lfa) this).field_q) {
                if (-6 != ((lfa) this).field_q) {
                  L0: {
                    L1: {
                      var8 = var3.field_B;
                      uja discarded$2 = new uja(var8);
                      var5 = 0;
                      if (var3.d(3) != ((lfa) this).field_r) {
                        break L1;
                      } else {
                        if (var3.e(9648) != ((lfa) this).field_p) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                    var5 = 1;
                    break L0;
                  }
                  L2: {
                    ((lfa) this).field_r = var3.d(3);
                    ((lfa) this).field_p = var3.e(param0 + 9649);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      if (((lfa) this).field_s != null) {
                        break L2;
                      } else {
                        ((lfa) this).field_s = var6_ref.a(new fm(55, ((lfa) this).b((byte) 89), ((lfa) this).c((byte) 117), ((lfa) this).e((byte) -122)), -58);
                        return;
                      }
                    }
                  }
                  if (var5 == 0) {
                    if (null != ((lfa) this).field_s) {
                      ((lfa) this).field_s.a(78, var6_ref);
                      ((lfa) this).field_s = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((lfa) this).h(95);
              if (-3 != ((lfa) this).field_q) {
                if (-6 != ((lfa) this).field_q) {
                  L3: {
                    L4: {
                      var7 = var3.field_B;
                      uja discarded$3 = new uja(var7);
                      var5 = 0;
                      if (var3.d(3) != ((lfa) this).field_r) {
                        break L4;
                      } else {
                        if (var3.e(9648) != ((lfa) this).field_p) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = 1;
                    break L3;
                  }
                  L5: {
                    ((lfa) this).field_r = var3.d(3);
                    ((lfa) this).field_p = var3.e(param0 + 9649);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      if (((lfa) this).field_s != null) {
                        break L5;
                      } else {
                        ((lfa) this).field_s = var6_ref.a(new fm(55, ((lfa) this).b((byte) 89), ((lfa) this).c((byte) 117), ((lfa) this).e((byte) -122)), -58);
                        return;
                      }
                    }
                  }
                  if (var5 == 0) {
                    if (null != ((lfa) this).field_s) {
                      ((lfa) this).field_s.a(78, var6_ref);
                      ((lfa) this).field_s = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = 94 / ((-8 - param0) / 40);
            super.a((byte) -88, param1);
            param1.a((byte) -125, ((lfa) this).field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lfa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lfa(int param0) {
        super(param0);
    }

    final void a(int param0, boolean param1) {
        ((lfa) this).field_q = param0;
        if (!param1) {
            Object var4 = null;
            ((lfa) this).a((iq) null, 94, 28, 90, (byte) -49);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Coins";
        field_o = new su(14, 0, 4, 1);
        field_n = "<%0> has dropped out.";
    }
}
