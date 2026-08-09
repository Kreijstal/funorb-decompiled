/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv extends cj {
    static uha field_n;
    eaa field_m;
    static kv[] field_k;
    static sna field_l;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        jma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new jma(param1, (rv) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("rv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    final void a(boolean param0, pp param1) {
        try {
            this.field_m.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rv.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        var8 = 15 % ((-53 - param3) / 36);
        if (param2 == param4) {
          ur.a(param4, param7, param5, param0, param1, param6, 512);
          return;
        } else {
          if (param7 - param4 >= eo.field_l) {
            if (pw.field_x >= param4 + param7) {
              if (param5 - param2 >= an.field_q) {
                if (param2 + param5 <= ha.field_n) {
                  pw.a(true, param4, param1, param6, param5, param2, param0, param7);
                  return;
                } else {
                  eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                  return;
                }
              } else {
                eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                return;
              }
            } else {
              eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
              return;
            }
          } else {
            eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
            return;
          }
        }
    }

    final void a(op param0, boolean param1) {
        int var4 = 0;
        pp var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                rv.a(120, 93, 90, -30, -60, 118, -97, -20);
                break L1;
              }
            }
            var5 = (pp) ((Object) this.field_m.b((byte) 90));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a((aga) null, param0, 12);
                var5 = (pp) ((Object) this.field_m.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("rv.K(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -4) {
            return;
        }
        field_l = null;
        field_n = null;
    }

    rv(lu param0) {
        super(5);
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            this.field_m = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if ((var2_int ^ -1) > -1) {
                break L0;
              } else {
                var3 = param0.b(16711935);
                if (-2 != (var3 ^ -1)) {
                  if (var3 == 2) {
                    this.field_m.a(db.a(param0, 95), true);
                    continue L1;
                  } else {
                    if ((var3 ^ -1) == -4) {
                      this.field_m.a(hea.b(16866, param0), true);
                      continue L1;
                    } else {
                      if ((var3 ^ -1) == -5) {
                        this.field_m.a(uha.b(param0, -7), true);
                        continue L1;
                      } else {
                        if (5 != var3) {
                          if ((var3 ^ -1) == -7) {
                            this.field_m.a(eo.a(param0, -4479), true);
                            continue L1;
                          } else {
                            if (var3 == 7) {
                              this.field_m.a(bea.a(-1547040176, param0), true);
                              continue L1;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        } else {
                          this.field_m.a(k.a(false, param0), true);
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  this.field_m.a(vo.a(-44, param0), true);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("rv.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void a(lu param0, int param1) {
        pp var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            param0.d(this.field_m.g(0), 0);
            if (param1 == -9) {
              var3 = (pp) ((Object) this.field_m.b((byte) 90));
              L1: while (true) {
                if (var3 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!(var3 instanceof lia)) {
                      if (!(var3 instanceof qq)) {
                        if (var3 instanceof ks) {
                          param0.d(3, 0);
                          break L2;
                        } else {
                          if (!(var3 instanceof mh)) {
                            if (var3 instanceof kt) {
                              param0.d(5, 0);
                              break L2;
                            } else {
                              if (var3 instanceof fda) {
                                param0.d(6, param1 ^ -9);
                                break L2;
                              } else {
                                if (var3 instanceof ic) {
                                  param0.d(7, 0);
                                  break L2;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                          } else {
                            param0.d(4, 0);
                            break L2;
                          }
                        }
                      } else {
                        param0.d(2, param1 ^ -9);
                        break L2;
                      }
                    } else {
                      param0.d(1, 0);
                      break L2;
                    }
                  }
                  var3.a(param0, (byte) -56);
                  var3 = (pp) ((Object) this.field_m.c(param1 ^ -9));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("rv.O(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public rv() {
        super(5);
        this.field_m = new eaa();
    }

    static {
    }
}
