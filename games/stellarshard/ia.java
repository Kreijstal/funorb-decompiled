/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends tb implements oi {
    private ig field_P;

    ia(ei param0, di param1) {
        super(param0, 200, 150);
        Object var3 = null;
        rj var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == ke.field_c) {
                var3 = ld.field_D;
                break L1;
              } else {
                if (param1 == nb.field_K) {
                  this.field_t = this.field_t + 10;
                  var3 = wh.field_d;
                  if (!ac.b((byte) 124)) {
                    break L1;
                  } else {
                    this.field_t = this.field_t + 20;
                    var3 = dl.field_B;
                    break L1;
                  }
                } else {
                  if (param1 != jj.field_k) {
                    break L1;
                  } else {
                    var3 = df.field_k;
                    this.field_t = this.field_t + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new rj((String) (var3), (lf) null);
            var4.field_p = this.field_p;
            var4.field_k = 50;
            var4.field_t = 80;
            var4.field_w = 0;
            var4.field_u = (uk) ((Object) new id(de.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(4, var4);
            this.field_P = this.a(-120, (lf) (this), td.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("ia.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static int l(int param0) {
        if ((rk.field_f ^ -1) > -3) {
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
                      if (am.field_g.c((byte) -111)) {
                        if (param0 != 50) {
                          return 101;
                        } else {
                          return 100;
                        }
                      } else {
                        return 80;
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
                              if (am.field_g.c((byte) -111)) {
                                if (param0 != 50) {
                                  return 101;
                                } else {
                                  return 100;
                                }
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
                          if (param0 != 50) {
                            return 101;
                          } else {
                            return 100;
                          }
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
        ig var3 = null;
        if (param0 == 13807) {
          if (!this.field_G) {
            return;
          } else {
            this.field_G = false;
            return;
          }
        } else {
          var3 = (ig) null;
          this.a(-72, -99, (ig) null, false, 3);
          if (!this.field_G) {
            return;
          } else {
            this.field_G = false;
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
              if (param2 != this.field_P) {
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
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("ia.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final ig a(int param0, lf param1, String param2) {
        ig var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ig stackIn_3_0 = null;
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
        ig stackOut_2_0 = null;
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
            L1: {
              var4 = new ig(param2, param1);
              var4.field_u = (uk) ((Object) new b());
              var5 = -6 + this.field_t;
              this.field_t = this.field_t + 38;
              var4.b(-30 + this.field_p, 15, var5, 30, 23987);
              this.b(4, var4);
              this.f(0);
              if (param0 < -116) {
                break L1;
              } else {
                this.k(-89);
                break L1;
              }
            }
            stackOut_2_0 = (ig) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("ia.K(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
