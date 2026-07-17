/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends tb implements oi {
    private ig field_P;

    ia(ei param0, di param1) {
        super(param0, 200, 150);
        RuntimeException var3 = null;
        String var3_ref = null;
        Object var5 = null;
        rj var6 = null;
        rj var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param1 == ke.field_c) {
                var3_ref = ld.field_D;
                break L1;
              } else {
                if (param1 == nb.field_K) {
                  ((ia) this).field_t = ((ia) this).field_t + 10;
                  var3_ref = wh.field_d;
                  if (!ac.b((byte) 124)) {
                    break L1;
                  } else {
                    ((ia) this).field_t = ((ia) this).field_t + 20;
                    var3_ref = dl.field_B;
                    break L1;
                  }
                } else {
                  if (param1 == jj.field_k) {
                    var3_ref = df.field_k;
                    ((ia) this).field_t = ((ia) this).field_t + 30;
                    break L1;
                  } else {
                    var6 = new rj((String) var5, (lf) null);
                    var6.field_p = ((ia) this).field_p;
                    var6.field_k = 50;
                    var6.field_t = 80;
                    var6.field_w = 0;
                    var6.field_u = (uk) (Object) new id(de.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
                    ((ia) this).b(4, var6);
                    ((ia) this).field_P = this.a(-120, (lf) this, td.field_a);
                    return;
                  }
                }
              }
            }
            var7 = new rj(var3_ref, (lf) null);
            var7.field_p = ((ia) this).field_p;
            var7.field_k = 50;
            var7.field_t = 80;
            var7.field_w = 0;
            var7.field_u = (uk) (Object) new id(de.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ia) this).b(4, var7);
            ((ia) this).field_P = this.a(-120, (lf) this, td.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ia.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static int l() {
        if (rk.field_f < 2) {
          return 0;
        } else {
          if (bb.field_d == 0) {
            if (!lk.field_i.a((byte) -36)) {
              return 20;
            } else {
              if (!lk.field_i.a("commonui", (byte) -109)) {
                return 40;
              } else {
                if (wf.field_e.a((byte) -36)) {
                  if (wf.field_e.a("commonui", (byte) -109)) {
                    if (am.field_g.a((byte) -36)) {
                      if (!am.field_g.c((byte) -111)) {
                        return 80;
                      } else {
                        return 100;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                } else {
                  return 50;
                }
              }
            }
          } else {
            if (null != pg.field_db) {
              if (pg.field_db.a((byte) -36)) {
                if (!pg.field_db.c("", (byte) -116)) {
                  return 29;
                } else {
                  if (pg.field_db.a("", (byte) -109)) {
                    if (lk.field_i.a((byte) -36)) {
                      if (!lk.field_i.a("commonui", (byte) -109)) {
                        return 57;
                      } else {
                        if (wf.field_e.a((byte) -36)) {
                          if (!wf.field_e.a("commonui", (byte) -109)) {
                            return 80;
                          } else {
                            if (!am.field_g.a((byte) -36)) {
                              return 82;
                            } else {
                              if (!am.field_g.c((byte) -111)) {
                                return 86;
                              } else {
                                return 100;
                              }
                            }
                          }
                        } else {
                          return 71;
                        }
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                return 14;
              }
            } else {
              if (lk.field_i.a((byte) -36)) {
                if (!lk.field_i.a("commonui", (byte) -109)) {
                  return 57;
                } else {
                  if (wf.field_e.a((byte) -36)) {
                    if (!wf.field_e.a("commonui", (byte) -109)) {
                      return 80;
                    } else {
                      if (!am.field_g.a((byte) -36)) {
                        return 82;
                      } else {
                        if (am.field_g.c((byte) -111)) {
                          return 100;
                        } else {
                          return 86;
                        }
                      }
                    }
                  } else {
                    return 71;
                  }
                }
              } else {
                return 43;
              }
            }
          }
        }
    }

    private final void k(int param0) {
        Object var3 = null;
        if (param0 == 13807) {
          if (!((ia) this).field_G) {
            return;
          } else {
            ((ia) this).field_G = false;
            return;
          }
        } else {
          var3 = null;
          ((ia) this).a(-72, -99, (ig) null, false, 3);
          if (!((ia) this).field_G) {
            return;
          } else {
            ((ia) this).field_G = false;
            return;
          }
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != ((ia) this).field_P) {
                break L1;
              } else {
                this.k(13807);
                break L1;
              }
            }
            if (!param3) {
              break L0;
            } else {
              this.k(-2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("ia.M(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final ig a(int param0, lf param1, String param2) {
        ig var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ig stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new ig(param2, param1);
            var4.field_u = (uk) (Object) new b();
            var5 = -6 + ((ia) this).field_t;
            ((ia) this).field_t = ((ia) this).field_t + 38;
            var4.b(-30 + ((ia) this).field_p, 15, var5, 30, 23987);
            ((ia) this).b(4, (rj) (Object) var4);
            ((ia) this).f(0);
            stackOut_0_0 = (ig) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ia.K(").append(-120).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
    }
}
