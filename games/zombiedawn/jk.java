/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_c;
    static String field_h;
    static String field_g;
    private int field_f;
    float field_a;
    String field_b;
    private int field_d;
    private j[] field_e;

    final void a(String param0, dj param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, -1, (String) null, param0, 25324, (String) null);
              if (param2 == 1) {
                break L1;
              } else {
                jk.a(false, true);
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

            stackIn_5_1 = new StringBuilder().append("jk.F(");

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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(dj param0, int param1, String param2, String param3, int param4, String param5) {
        j[] var9 = null;
        j var8 = null;
        j var10 = null;
        int fieldTemp$0 = 0;
        if (!(this.field_e.length > this.field_c)) {
            var9 = new j[2 * this.field_c];
            j[] var7 = var9;
            gp.a(this.field_e, 0, var9, 0, this.field_c);
            this.field_e = var9;
        }
        if (param4 != 25324) {
            return;
        }
        try {
            var8 = new j();
            var10 = var8;
            j var7_ref = var10;
            var10.field_i = param2;
            var10.field_k = param5;
            var10.field_f = param1;
            var10.field_g = param3;
            var10.field_c = param0;
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_e[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "jk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        lc.field_i = -1;
        pl.field_m = param0;
        mm.field_i = -1;
        qo.field_x = false;
        da.field_m = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (!we.o((byte) -80)) {
          return;
        } else {
          L0: {
            if (param0) {
              bi.a(0, 0, bi.field_f, bi.field_a, 0, 192);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1) {
            field_h = (String) null;
            wo.field_xb.a(0, 0, 0);
            return;
          } else {
            wo.field_xb.a(0, 0, 0);
            return;
          }
        }
    }

    final static void a(byte param0, aa param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aa var6 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (-4 >= (var2_int ^ -1)) {
                var2_int = 0;
                L2: while (true) {
                  if (tb.field_E <= var2_int) {
                    L3: {
                      if (param0 < -57) {
                        break L3;
                      } else {
                        var6 = (aa) null;
                        jk.a((byte) -114, (aa) null);
                        break L3;
                      }
                    }
                    dupTemp$0 = param1.a((byte) -80);
                    nl.field_o[dupTemp$0] = nl.field_o[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (tb.field_E <= var3) {
                        tb.field_E = var2_int;
                        fieldTemp$1 = tb.field_E;
                        tb.field_E = tb.field_E + 1;
                        cc.field_m[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (cc.field_m[var3].field_j != param1.field_j) {
                              break L6;
                            } else {
                              var4 = cc.field_m[var3].a((byte) -78);
                              if (ej.field_d < nl.field_o[var4]) {
                                nl.field_o[var4] = nl.field_o[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          cc.field_m[incrementValue$2] = cc.field_m[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (cc.field_m[var2_int].field_j != param1.field_j) {
                        break L7;
                      } else {
                        dupTemp$3 = cc.field_m[var2_int].a((byte) -82);
                        nl.field_o[dupTemp$3] = nl.field_o[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                nl.field_o[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("jk.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final void a(byte param0, dj param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        aa var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, -1, (String) null, param3, 25324, param2);
              if (param0 <= -90) {
                break L1;
              } else {
                var6 = (aa) null;
                jk.a((byte) -18, (aa) null);
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

            stackIn_5_1 = new StringBuilder().append("jk.C(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ')');
        }
    }

    private final void a(int param0, int param1, j param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              field_h = (String) null;
              break L0;
            }
          }
          var4_float = (float)(1 + this.field_f) + (float)param1 / 100.0f;
          this.field_a = (float)this.field_d * var4_float / (float)(1 + this.field_c);
          if (param1 != 0) {
            this.field_b = param2.field_k + " - " + param1 + "%";
            return;
          } else {
            this.field_b = param2.field_g;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 <= 19) {
            field_g = (String) null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final void a(String param0, String param1, String param2, dj param3, byte param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param3, -1, param0, param1, param4 ^ -25280, param2);
              if (param4 == -84) {
                break L1;
              } else {
                jk.b(-21);
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

            stackIn_5_1 = new StringBuilder().append("jk.J(");

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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        int var3;
        j var4;
        var3 = ZombieDawn.field_J;
        L0: while (true) {
          if (this.field_c <= this.field_f) {
            if (param0 != -1) {
              this.field_d = -49;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = this.field_e[this.field_f];
            if (var4.field_c.a((byte) 73)) {
              L1: {
                if ((var4.field_f ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_c.b(-29092, var4.field_f)) {
                    this.a(0, var4.field_c.a(var4.field_f, param0 + -5365), var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_i == null) {
                  break L2;
                } else {
                  if (var4.field_c.a(-1, var4.field_i)) {
                    break L2;
                  } else {
                    this.a(0, var4.field_c.b(var4.field_i, 103), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_f ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_i != null) {
                    break L3;
                  } else {
                    if (var4.field_k == null) {
                      break L3;
                    } else {
                      if (!var4.field_c.c(9001)) {
                        this.a(param0 ^ -1, var4.field_c.e(-102), var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.field_f = this.field_f + 1;
              continue L0;
            } else {
              this.a(param0 ^ -1, 0, var4);
              return false;
            }
          }
        }
    }

    jk(int param0) {
        this.field_e = new j[16];
        this.field_d = param0;
    }

    static {
        field_g = "Back";
        field_h = "This is a members only level. If you are a member, log in to start at any members only level you've reached.";
    }
}
