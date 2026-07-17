/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class va implements ur, qa {
    int field_d;
    private boolean field_q;
    int field_n;
    static java.applet.Applet field_o;
    private int field_g;
    int field_m;
    int field_a;
    static int[] field_b;
    static wn field_s;
    static cr field_f;
    int field_e;
    int field_p;
    static String field_r;
    static cr field_h;
    int field_i;
    int field_j;
    int field_c;
    int field_k;
    cc field_l;

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!wq.field_H) {
              return;
            } else {
              bi.b(40, 40, 560, 400, 1, 164);
              bi.e(40, 40, 560, 400, 16777215);
              var1_int = 16;
              var2 = 60;
              var3 = 60;
              tk.field_c.b("Press 'H' to close this screen", var3, var2, 16777215, -1);
              var2 = var2 + var1_int;
              var4 = var2;
              var5 = 0;
              L1: while (true) {
                if (~al.field_A.length >= ~var5) {
                  break L0;
                } else {
                  L2: {
                    var7_int = al.field_x[var5];
                    if (var7_int == 2) {
                      var6 = al.field_A[var5] + "+ALT";
                      break L2;
                    } else {
                      if (var7_int != 1) {
                        if (var7_int == 3) {
                          var6 = al.field_A[var5] + "+CTRL+ALT";
                          break L2;
                        } else {
                          if (var7_int != 0) {
                            var6 = null;
                            break L2;
                          } else {
                            var6 = al.field_A[var5];
                            break L2;
                          }
                        }
                      } else {
                        var6 = al.field_A[var5] + "+CTRL";
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var9 = var5 / 12;
                    var10 = var5 - var9 * 12;
                    var11 = 0;
                    if (-7 + var10 >= 0) {
                      var12 = -7 + (var10 - -(5 * var9));
                      if (var12 < 0) {
                        var5++;
                        var5++;
                        continue L1;
                      } else {
                        if (wa.field_h.length > var12) {
                          var7 = wa.field_h[var12];
                          var8 = 14517504;
                          break L3;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var12 = 7 * var9 + var10;
                      if (jl.field_a.length > var12) {
                        var7 = jl.field_a[var12];
                        var8 = 39168;
                        if ((1 << var12 & mb.field_s) != 0) {
                          var11 = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var5++;
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  L4: {
                    if (var11 != 0) {
                      bi.b(-10 + var3, var2 + -10, 50, 20 - -var1_int, var8, 120);
                      break L4;
                    } else {
                      bi.b(var3 + -10, -10 + var2, 50, 20 + var1_int, var8);
                      break L4;
                    }
                  }
                  int discarded$2 = tk.field_c.a(var6, var3 - 10, -10 + var2, 50, 20 + var1_int, 16777215, 5592405, 1, 1, 0);
                  int discarded$3 = tk.field_c.a(var7, -10 + (var3 + 60), var2 + -10, 140, var1_int + 20, 16777215, -1, 0, 1, 0);
                  var2 = var2 + (24 + var1_int);
                  if (var2 > 420) {
                    var2 = var4;
                    var3 += 220;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "va.H(" + 127 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 19207) {
              var3_int = 1;
              L1: while (true) {
                if (1 >= param1) {
                  if (1 == param1) {
                    stackOut_11_0 = var3_int * param2;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    stackOut_13_0 = var3_int;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  }
                } else {
                  L2: {
                    if ((1 & param1) == 0) {
                      break L2;
                    } else {
                      var3_int = var3_int * param2;
                      break L2;
                    }
                  }
                  param1 = param1 >> 1;
                  param2 = param2 * param2;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -94;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "va.O(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, byte param1) {
        if (param1 < 118) {
            va.a(0);
            sl.field_w = 1000000000L / (long)param0;
            return;
        }
        sl.field_w = 1000000000L / (long)param0;
    }

    final static boolean b(byte param0) {
        if (hn.field_w < 10) {
            return false;
        }
        if (sq.field_c) {
            return false;
        }
        return !oe.q(95) ? true : false;
    }

    public final int a(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              ro discarded$10 = ((va) this).b(param0, param1 + 102);
              if (param1 == -1) {
                break L1;
              } else {
                ((va) this).field_k = -38;
                break L1;
              }
            }
            stackOut_2_0 = param0.field_r.b((byte) 116) - -((va) this).field_k + ((va) this).field_c;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("va.K(");
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public final int a(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == 1) {
              stackOut_3_0 = this.a(param2, (byte) 110, 0, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 57;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("va.DA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(int param0, byte param1, iq param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            stackOut_2_0 = param3 + (param2.field_u + (param2.field_o + param0 + ((va) this).field_i));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("va.CA(").append(param0).append(44).append(-94).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    public void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        if (!param2) {
            ((va) this).field_k = 26;
        }
        if (!(((va) this).field_l != null)) {
            return;
        }
        try {
            this.a(0, param1, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "va.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public final int b(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 == -14323) {
              stackOut_3_0 = this.a(param1, (byte) -94, param0, 0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -38;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("va.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public final int a(iq param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              ro discarded$7 = ((va) this).b(param0, 46);
              if (param1 > 98) {
                break L1;
              } else {
                ((va) this).field_m = -99;
                break L1;
              }
            }
            stackOut_2_0 = param0.field_r.a(8783) - -((va) this).field_i - -((va) this).field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("va.F(");
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    private final int c(iq param0) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = -((va) this).field_c + -((va) this).field_k + param0.field_s;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("va.AA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    private final int a(int param0, byte param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param0 - (-param3.field_t + (-((va) this).field_k - param3.field_y));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("va.T(").append(param0).append(44).append(110).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, iq param5, int param6) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          jb.a(param0 - -param5.field_t, param5.field_n + (param5.field_o + param3), param5.field_o + param3, -30486, param5.field_s + param5.field_t + param0);
          var9_int = ((va) this).a(-1, param5);
          int discarded$2 = 0;
          var10 = this.c(param5);
          if (!((va) this).field_q) {
            L0: {
              var12 = ((va) this).field_d;
              if (var12 == 0) {
                var11 = ((va) this).field_l.field_z;
                break L0;
              } else {
                if (2 != var12) {
                  L1: {
                    if (var12 == 3) {
                      break L1;
                    } else {
                      if (var12 == 1) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var11 = (-((va) this).field_l.field_z + var10 - ((va) this).field_l.field_M >> 1) + ((va) this).field_l.field_z;
                  break L0;
                } else {
                  var11 = var10 - ((va) this).field_l.field_M;
                  break L0;
                }
              }
            }
            L2: {
              var12 = ((va) this).field_m;
              if (var12 == 0) {
                break L2;
              } else {
                if (var12 == 3) {
                  break L2;
                } else {
                  if (1 != var12) {
                    if (2 == var12) {
                      ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, 0) - -var9_int, this.a(param0, (byte) 110, 0, param5) + var11, param6, param1);
                      ln.d(-28558);
                      return;
                    } else {
                      ln.d(-28558);
                      return;
                    }
                  } else {
                    ((va) this).field_l.c(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, 0) + (var9_int >> 1), this.a(param0, (byte) 110, 0, param5) + var11, param6, param1);
                    ln.d(-28558);
                    return;
                  }
                }
              }
            }
            ((va) this).field_l.b(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, 0), this.a(param0, (byte) 110, 0, param5) - -var11, param6, param1);
            ln.d(-28558);
            return;
          } else {
            int discarded$3 = ((va) this).field_l.a(((va) this).a((byte) -90, param5), this.a(param3, (byte) -94, param5, 0), this.a(param0, (byte) 110, 0, param5), var9_int, var10, param6, param1, ((va) this).field_m, ((va) this).field_d, ((va) this).field_n);
            ln.d(-28558);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var9;
            stackOut_27_1 = new StringBuilder().append("va.Q(").append(param0).append(44).append(param1).append(44).append(0).append(44).append(param3).append(44).append(65).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param6 + 44 + 0 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, iq param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        lq var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ro var13 = null;
        ro var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 <= -81) {
              L1: {
                if (!param3.f(48)) {
                  break L1;
                } else {
                  L2: {
                    var13 = ((va) this).b(param3, 80);
                    var14 = var13;
                    var7 = var14.a(param1, 22413);
                    var8 = var13.field_c[var7];
                    var9 = var14.b(param1, -61);
                    var10 = this.a(param2, (byte) -94, param3, var9);
                    var11 = ((va) this).a(param3, 1, param4) + Math.max(0, var8.field_f);
                    int discarded$1 = 0;
                    stackOut_3_0 = ((va) this).a(param3, 1, param4);
                    stackOut_3_1 = this.c(param3);
                    stackOut_3_2 = var8.field_d;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    if (var14.field_c.length <= 1 + var7) {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = stackIn_5_2;
                      stackOut_5_3 = var8.field_d;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      break L2;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = stackIn_4_2;
                      stackOut_4_3 = var13.field_c[1 + var7].field_f;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      break L2;
                    }
                  }
                  var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                  jb.a(param3.field_t + param4, param3.field_o + param2 + param3.field_n, param2 - -param3.field_o, -30486, param4 + (param3.field_t + param3.field_s));
                  eb.field_c.a(var10, var12, ((va) this).field_p, var10, var11, 105);
                  ln.d(-28558);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("va.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
    }

    public final int a(int param0, int param1, int param2, int param3, iq param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            ro discarded$7 = ((va) this).b(param4, 33);
            if (param2 > 21) {
              stackOut_3_0 = param4.field_r.a(param5 - ((va) this).a(param4, 1, param1), (byte) 42, param0 - ((va) this).b(param4, param3, -14323));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 114;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("va.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, int param1, int param2, iq param3) {
        try {
            int discarded$0 = 0;
            this.a(param2, ((va) this).field_g, 0, param1, 65, param3, ((va) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "va.R(" + 0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, iq param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1.field_r) {
                param1.field_r = (ro) (Object) new sl();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = ((va) this).a(-1, param1);
              int discarded$1 = 0;
              var4 = this.c(param1);
              var6 = ((va) this).field_d;
              if (var6 == 0) {
                var5 = ((va) this).field_l.field_z;
                break L2;
              } else {
                if (var6 == 2) {
                  var5 = var4 - ((va) this).field_l.field_M;
                  break L2;
                } else {
                  L3: {
                    if (var6 != 3) {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = (var4 - (((va) this).field_l.field_z - -((va) this).field_l.field_M) >> 1) + ((va) this).field_l.field_z;
                  break L2;
                }
              }
            }
            L4: {
              var6 = ((va) this).field_m;
              if (var6 != 0) {
                if (var6 != 3) {
                  if (var6 == 1) {
                    if (param1.field_r instanceof sl) {
                      ((sl) (Object) param1.field_r).a(var5, ((va) this).field_l, ((va) this).a((byte) -90, param1), -12558, var3_int >> 1);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L5: {
                      if (2 != var6) {
                        break L5;
                      } else {
                        if (!(param1.field_r instanceof sl)) {
                          break L5;
                        } else {
                          ((sl) (Object) param1.field_r).a(var3_int, (byte) 94, ((va) this).field_l, var5, ((va) this).a((byte) -90, param1));
                          return;
                        }
                      }
                    }
                    break L0;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (param1.field_r instanceof sl) {
              ((sl) (Object) param1.field_r).b(-96, ((va) this).field_l, ((va) this).a((byte) -90, param1), var5, 0);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("va.V(").append(0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    final void a(int param0, va param1) {
        try {
            param1.field_g = ((va) this).field_g;
            param1.field_d = ((va) this).field_d;
            param1.field_n = ((va) this).field_n;
            param1.field_p = ((va) this).field_p;
            param1.field_l = ((va) this).field_l;
            param1.field_i = ((va) this).field_i;
            if (param0 != 16777215) {
                ((va) this).field_e = 14;
            }
            param1.field_c = ((va) this).field_c;
            param1.field_j = ((va) this).field_j;
            param1.field_a = ((va) this).field_a;
            param1.field_q = ((va) this).field_q;
            param1.field_e = ((va) this).field_e;
            param1.field_m = ((va) this).field_m;
            param1.field_k = ((va) this).field_k;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "va.EA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int a(byte param0) {
        Object var3 = null;
        if (param0 != -91) {
          var3 = null;
          int discarded$2 = ((va) this).a((iq) null, (byte) 64);
          return ((va) this).field_l.field_M + ((va) this).field_l.field_z;
        } else {
          return ((va) this).field_l.field_M + ((va) this).field_l.field_z;
        }
    }

    public final int a(int param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == -1) {
                break L1;
              } else {
                ((va) this).field_p = 47;
                break L1;
              }
            }
            stackOut_2_0 = -((va) this).field_j + param1.field_n + -((va) this).field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("va.I(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(iq param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ro var17 = null;
        ro var18 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == param3) {
              return;
            } else {
              L1: {
                if (param0.f(24)) {
                  L2: {
                    var17 = ((va) this).b(param0, 122);
                    var18 = var17;
                    if (param3 < param1) {
                      var9 = param1;
                      var8 = param3;
                      break L2;
                    } else {
                      var8 = param1;
                      var9 = param3;
                      break L2;
                    }
                  }
                  var10 = var18.a(var8, 22413);
                  var11 = var18.a(var9, 22413);
                  jb.a(param0.field_t + param4, param0.field_n + param0.field_o + param5, param0.field_o + param5, -30486, param0.field_s + (param4 - -param0.field_t));
                  var12 = var10;
                  L3: while (true) {
                    if (var11 < var12) {
                      ln.d(-28558);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_c[var12];
                        if (var12 != var10) {
                          stackOut_13_0 = var13.field_c[0];
                          stackIn_14_0 = stackOut_13_0;
                          break L4;
                        } else {
                          stackOut_12_0 = var18.b(var8, -28);
                          stackIn_14_0 = stackOut_12_0;
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_14_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L5;
                          } else {
                            stackOut_17_0 = var13.field_c[var13.field_c.length - 1];
                            stackIn_19_0 = stackOut_17_0;
                            break L5;
                          }
                        } else {
                          stackOut_15_0 = var18.b(var9, 126);
                          stackIn_19_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      var15 = stackIn_19_0;
                      eb.field_c.a(var13.field_d, (byte) -101, param4 + param0.field_t + (((va) this).field_k + param0.field_y) - -var13.field_f, ((va) this).field_a, ((va) this).field_a >>> 24, this.a(param5, (byte) -94, param0, var14), var15 - var14);
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (!param2) {
                break L0;
              } else {
                ((va) this).field_n = -106;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("va.U(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_r = null;
        field_o = null;
        if (param0 != 60) {
            return;
        }
        field_s = null;
        field_f = null;
    }

    String a(byte param0, iq param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param0 == -90) {
                break L1;
              } else {
                int discarded$2 = va.a(-117, 22, 99);
                break L1;
              }
            }
            stackOut_2_0 = param1.field_w;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("va.BA(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final ro b(iq param0, int param1) {
        RuntimeException var3 = null;
        ro stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_r == null) {
                param0.field_r = (ro) (Object) new sl();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 4) {
                break L2;
              } else {
                ((va) this).field_p = -35;
                break L2;
              }
            }
            L3: {
              if (!((va) this).field_q) {
                this.a(false, param0);
                break L3;
              } else {
                int discarded$3 = 0;
                ((sl) (Object) param0.field_r).a(((va) this).field_d, ((va) this).a((byte) -90, param0), 1, ((va) this).field_l, ((va) this).field_m, this.c(param0), ((va) this).a(-1, param0), ((va) this).field_n);
                break L3;
              }
            }
            stackOut_8_0 = param0.field_r;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("va.S(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    protected va() {
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            ((va) this).field_g = param6;
            ((va) this).field_a = param11;
            ((va) this).field_q = param12 ? true : false;
            ((va) this).field_j = param2;
            ((va) this).field_d = param8;
            ((va) this).field_c = param4;
            ((va) this).field_k = param3;
            ((va) this).field_i = param1;
            ((va) this).field_e = param5;
            ((va) this).field_m = param7;
            ((va) this).field_n = param9;
            ((va) this).field_l = param0;
            ((va) this).field_p = param10;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "va.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<%0> cannot join; the game is full.";
        field_b = null;
    }
}
