/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends cj {
    static pb field_l;
    eaa field_k;

    final void a(jm param0, byte param1) {
        RuntimeException runtimeException = null;
        jm var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_k.a(param0, true);
              if (param1 > 37) {
                break L1;
              } else {
                var4 = (jm) null;
                this.a((jm) null, (byte) -11);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lc.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(op param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        jm var5 = null;
        jm var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var6 = (jm) ((Object) this.field_k.b((byte) 90));
            L1: while (true) {
              if (var6 == null) {
                if (!param1) {
                  break L0;
                } else {
                  var5 = (jm) null;
                  this.a((jm) null, (byte) 97);
                  return;
                }
              } else {
                var6.a(param1, param0);
                var6 = (jm) ((Object) this.field_k.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lc.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        ub stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                this.field_k = (eaa) null;
                break L1;
              }
            }
            stackIn_3_0 = new ub(param1, (lc) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lc.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    final void a(lu param0, int param1) {
        int var4 = 0;
        jm var5 = null;
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
              param0.d(this.field_k.g(0), 0);
              if (param1 == -9) {
                break L1;
              } else {
                this.field_k = (eaa) null;
                break L1;
              }
            }
            var5 = (jm) ((Object) this.field_k.b((byte) 90));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a(param0, (byte) -63);
                var5 = (jm) ((Object) this.field_k.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lc.O(");

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

    public static void c(boolean param0) {
        field_l = null;
        if (param0) {
            field_l = (pb) null;
        }
    }

    lc(lu param0) {
        super(6);
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            this.field_k = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                var3 = param0.b(16711935);
                if ((var3 ^ -1) == -2) {
                  this.field_k.a(new oca(param0), true);
                  continue L1;
                } else {
                  if (-1 != (var3 ^ -1)) {
                    if (var3 == 2) {
                      this.field_k.a(new tga(param0), true);
                      continue L1;
                    } else {
                      if (3 == var3) {
                        this.field_k.a(new wp(param0), true);
                        continue L1;
                      } else {
                        if (var3 == 4) {
                          this.field_k.a(new fi(param0), true);
                          continue L1;
                        } else {
                          if (var3 == 5) {
                            this.field_k.a(new bg(param0), true);
                            continue L1;
                          } else {
                            if (var3 == 6) {
                              this.field_k.a(new bja(param0), true);
                              continue L1;
                            } else {
                              if (var3 == 7) {
                                this.field_k.a(new ej(param0), true);
                                continue L1;
                              } else {
                                if ((var3 ^ -1) == -9) {
                                  this.field_k.a(new ns(param0), true);
                                  continue L1;
                                } else {
                                  if ((var3 ^ -1) == -10) {
                                    this.field_k.a(new ow(param0), true);
                                    continue L1;
                                  } else {
                                    throw new IllegalStateException();
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.field_k.a(new iia(param0), true);
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("lc.<init>(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L2;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public lc() {
        super(6);
        this.field_k = new eaa();
    }

    final static void b(int param0) {
        if (param0 != -1) {
          L0: {
            field_l = (pb) null;
            if (gm.field_k) {
              ki.g(param0 + -25);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (gm.field_k) {
              ki.g(param0 + -25);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
    }
}
