/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static oc[] field_b;
    private hma field_f;
    private sk field_c;
    private int field_e;
    static boolean field_a;
    private int field_g;
    static int[] field_d;

    final Object a(byte param0) {
        pb var2 = null;
        Object var3 = null;
        pb var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackOut_4_0 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var2 = (pb) ((Object) this.field_c.a((byte) 55));
          if (param0 == 60) {
            break L0;
          } else {
            this.a(43, (Object) null, -32, 102L);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 != null) {
            var3 = var2.f(29243);
            stackOut_4_0 = null;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              L2: {
                if (stackIn_6_0 != var3) {
                  break L2;
                } else {
                  var4 = var2;
                  var2 = (pb) ((Object) this.field_c.a((byte) 55));
                  var4.p(param0 ^ 21);
                  var4.c(-7975);
                  this.field_e = this.field_e + var4.field_m;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              return var3;
            } else {
              return stackIn_5_0;
            }
          } else {
            return null;
          }
        }
    }

    final Object a(byte param0, long param1) {
        tja var6 = null;
        pb var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (pb) ((Object) this.field_c.a(param1, false));
        if (var7 != null) {
          if (param0 > 14) {
            var9 = var7.f(29243);
            if (var9 != null) {
              if (!var7.a(14646)) {
                this.field_f.a(var7, -11396);
                var7.field_j = 0L;
                if (TombRacer.field_G) {
                  var6 = new tja(var9, var7.field_m);
                  this.field_c.a(var6, (byte) 125, var7.field_d);
                  this.field_f.a(var6, -11396);
                  ((pb) ((Object) var6)).field_j = 0L;
                  var7.p(118);
                  var7.c(-7975);
                  return var9;
                } else {
                  return var9;
                }
              } else {
                var6 = new tja(var9, var7.field_m);
                this.field_c.a(var6, (byte) 125, var7.field_d);
                this.field_f.a(var6, -11396);
                ((pb) ((Object) var6)).field_j = 0L;
                var7.p(118);
                var7.c(-7975);
                return var9;
              }
            } else {
              var7.p(69);
              var7.c(-7975);
              this.field_e = this.field_e + var7.field_m;
              return null;
            }
          } else {
            field_d = (int[]) null;
            var8 = var7.f(29243);
            if (var8 != null) {
              if (!var7.a(14646)) {
                this.field_f.a(var7, -11396);
                var7.field_j = 0L;
                if (!TombRacer.field_G) {
                  return var8;
                } else {
                  var6 = new tja(var8, var7.field_m);
                  this.field_c.a(var6, (byte) 125, var7.field_d);
                  this.field_f.a(var6, -11396);
                  ((pb) ((Object) var6)).field_j = 0L;
                  var7.p(118);
                  var7.c(-7975);
                  return var8;
                }
              } else {
                var6 = new tja(var8, var7.field_m);
                this.field_c.a(var6, (byte) 125, var7.field_d);
                this.field_f.a(var6, -11396);
                ((pb) ((Object) var6)).field_j = 0L;
                var7.p(118);
                var7.c(-7975);
                return var8;
              }
            } else {
              var7.p(69);
              var7.c(-7975);
              this.field_e = this.field_e + var7.field_m;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        if (param0 != -118) {
          this.field_e = 108;
          this.field_f.a((byte) 84);
          this.field_c.a(param0 ^ -118);
          this.field_e = this.field_g;
          return;
        } else {
          this.field_f.a((byte) 84);
          this.field_c.a(param0 ^ -118);
          this.field_e = this.field_g;
          return;
        }
    }

    final Object b(byte param0) {
        pb var2 = null;
        Object var3 = null;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 > 83) {
          var2 = (pb) ((Object) this.field_c.b((byte) 35));
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 == null) {
                var6 = var2;
                var2 = (pb) ((Object) this.field_c.a((byte) 55));
                var6.p(121);
                var6.c(-7975);
                this.field_e = this.field_e + var6.field_m;
                if (var5 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          field_d = (int[]) null;
          var2 = (pb) ((Object) this.field_c.b((byte) 35));
          L1: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 == null) {
                var7 = var2;
                var2 = (pb) ((Object) this.field_c.a((byte) 55));
                var7.p(121);
                var7.c(-7975);
                this.field_e = this.field_e + var7.field_m;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        long fieldTemp$2 = 0L;
        pb var3 = null;
        eba var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 >= 59) {
          var3 = (pb) ((Object) this.field_f.c(100));
          L0: while (true) {
            if (var3 != null) {
              if (var5 == 0) {
                L1: {
                  L2: {
                    if (!var3.a(14646)) {
                      break L2;
                    } else {
                      if (var3.f(29243) == null) {
                        var3.p(120);
                        var3.c(-7975);
                        this.field_e = this.field_e + var3.field_m;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  fieldTemp$2 = var3.field_j + 1L;
                  var3.field_j = var3.field_j + 1L;
                  if (((long)param1 ^ -1L) > (fieldTemp$2 ^ -1L)) {
                    var4 = new eba(var3.f(29243), var3.field_m);
                    this.field_c.a(var4, (byte) 124, var3.field_d);
                    ig.a(31, var4, var3);
                    var3.p(126);
                    var3.c(-7975);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (pb) ((Object) this.field_f.a(-122));
                continue L0;
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

    final void a(int param0, Object param1, long param2) {
        if (param0 != 29166) {
            return;
        }
        try {
            this.a(-1, param1, 1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static cn a(int param0, int param1) {
        if (param1 != 1) {
          dd.a(10);
          return nt.a(param0, 1, 5200, false, false, true);
        } else {
          return nt.a(param0, 1, 5200, false, false, true);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8476) {
            return;
        }
        field_d = null;
    }

    private final void a(int param0, pb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                param1.p(123);
                param1.c(param0 + -7976);
                this.field_e = this.field_e + param1.field_m;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1) {
              break L0;
            } else {
              this.a(85, (Object) null, 32L);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("dd.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        tja var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        pb var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 <= this.field_g) {
              this.a(param3, 1);
              this.field_e = this.field_e - param2;
              L1: while (true) {
                L2: {
                  if ((this.field_e ^ -1) <= -1) {
                    break L2;
                  } else {
                    var8 = (pb) ((Object) this.field_f.b((byte) 60));
                    this.a(param0 ^ -2, var8);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = new tja(param1, param2);
                this.field_c.a(var6, (byte) 114, param3);
                this.field_f.a(var6, -11396);
                ((pb) ((Object) var6)).field_j = 0L;
                if (param0 == -1) {
                  break L0;
                } else {
                  this.a(6, (Object) null, 106, 15L);
                  return;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6_ref);
            stackOut_9_1 = new StringBuilder().append("dd.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    dd(int param0) {
        this(param0, param0);
    }

    private dd(int param0, int param1) {
        int var3 = 0;
        this.field_f = new hma();
        this.field_g = param0;
        this.field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              this.field_c = new sk(var3);
              return;
            }
          } else {
            this.field_c = new sk(var3);
            return;
          }
        }
    }

    private final void a(long param0, int param1) {
        pb var4 = (pb) ((Object) this.field_c.a(param0, false));
        this.a(param1, var4);
    }

    static {
        field_d = new int[8192];
    }
}
