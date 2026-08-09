/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private int field_e;
    pb field_b;
    private int field_h;
    static int field_g;
    private boolean field_j;
    private int field_i;
    private int field_a;
    static int field_c;
    pb[] field_d;
    private int field_f;

    final db a(byte param0, pb[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 72) {
                break L1;
              } else {
                this.field_a = -127;
                break L1;
              }
            }
            this.field_d = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("db.I(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (db) (this);
    }

    final db a(byte param0, boolean param1) {
        this.field_j = param1 ? true : false;
        if (param0 <= 123) {
            return (db) null;
        }
        return (db) (this);
    }

    final void a(tc param0, db param1, int param2, int param3, rj param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_j) {
                param1.a(param3, param0, param4, 2, param5);
                param1.a((byte) 120);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 <= this.field_e) {
                param1.field_e = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 >= (this.field_h ^ -1)) {
                param1.field_h = this.field_h;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_d) {
                param1.field_d = this.field_d;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var7_int = 64 / ((-22 - param2) / 60);
              if (-2147483648 == this.field_a) {
                break L5;
              } else {
                param1.field_a = this.field_a;
                break L5;
              }
            }
            L6: {
              if (-2147483648 == this.field_f) {
                break L6;
              } else {
                param1.field_f = this.field_f;
                break L6;
              }
            }
            L7: {
              if (-2147483648 != this.field_i) {
                param1.field_i = this.field_i;
                break L7;
              } else {
                break L7;
              }
            }
            if (null == this.field_b) {
              break L0;
            } else {
              param1.field_b = this.field_b;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("db.K(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ',' + param5 + ')');
        }
    }

    final db a(int param0, boolean param1) {
        if (param1) {
            this.field_i = -34;
            this.field_i = param0;
            return (db) (this);
        }
        this.field_i = param0;
        return (db) (this);
    }

    final db a(int param0, int param1) {
        if (param0 != -1) {
            this.field_e = 114;
            this.field_e = param1;
            return (db) (this);
        }
        this.field_e = param1;
        return (db) (this);
    }

    final db a(boolean param0, int param1) {
        this.field_h = param1;
        if (param0) {
            this.a(-120, false);
            return (db) (this);
        }
        return (db) (this);
    }

    final static void a(int param0) {
        int var1;
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        ii.field_F = null;
        ck.field_db = false;
        var1 = -66 % ((74 - param0) / 34);
        if (!gk.field_a) {
          var2 = ag.field_c;
          if (0 < var2) {
            if (var2 == 1) {
              ii.field_F = lj.field_C;
              ii.field_F = ei.a(new CharSequence[]{(CharSequence) ((Object) ii.field_F), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nl.field_a)}, (byte) 127);
              ei.field_G.o(3);
              qh.b(-21923);
              return;
            } else {
              ii.field_F = h.a(be.field_e, 0, new String[]{Integer.toString(var2)});
              ii.field_F = ei.a(new CharSequence[]{(CharSequence) ((Object) ii.field_F), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nl.field_a)}, (byte) 127);
              ei.field_G.o(3);
              qh.b(-21923);
              return;
            }
          } else {
            ei.field_G.o(3);
            qh.b(-21923);
            return;
          }
        } else {
          ei.field_G.h((byte) 52);
          return;
        }
    }

    final void a(db param0, boolean param1) {
        param0.field_f = this.field_f;
        param0.field_d = this.field_d;
        param0.field_b = this.field_b;
        if (!param1) {
            return;
        }
        try {
            param0.field_j = this.field_j;
            param0.field_i = this.field_i;
            param0.field_e = this.field_e;
            param0.field_h = this.field_h;
            param0.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "db.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static StringBuilder a(int param0, byte param1, char param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var4_int = param3.length();
            param3.setLength(param0);
            var5 = var4_int;
            L1: while (true) {
              if (param0 <= var5) {
                L2: {
                  if (param1 == 61) {
                    break L2;
                  } else {
                    field_g = 70;
                    break L2;
                  }
                }
                stackIn_7_0 = (StringBuilder) (param3);
                break L0;
              } else {
                param3.setCharAt(var5, param2);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("db.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(byte param0) {
        if (param0 <= 6) {
          return;
        } else {
          this.field_h = -1;
          this.field_e = 0;
          this.field_b = null;
          this.field_f = 256;
          this.field_i = 0;
          this.field_a = 0;
          this.field_d = null;
          return;
        }
    }

    final db b(int param0, int param1) {
        if (param0 != -2147483648) {
            this.field_b = (pb) null;
            this.field_a = param1;
            return (db) (this);
        }
        this.field_a = param1;
        return (db) (this);
    }

    db() {
        this.field_b = null;
        this.field_j = false;
        this.field_e = -2;
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_i = -2147483648;
        this.field_d = null;
        this.field_f = -2147483648;
    }

    final void a(int param0, tc param1, rj param2, int param3, int param4) {
        bd stackIn_19_0 = null;
        String stackIn_19_1 = null;
        bd stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              ed.a(param3 + -6315, param4 - -param2.field_w, param0 + param2.field_k, this.field_d, param2.field_p, param2.field_t);
              if (this.field_b != null) {
                L2: {
                  var6_int = param4 - -param2.field_w - -this.field_i;
                  if (-2 != (param1.field_h ^ -1)) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param2.field_p + -this.field_b.field_w) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param0 - (-param2.field_k - this.field_a);
                  if (2 != param1.field_h) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_b.field_w + param2.field_p);
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_d != 1) {
                    break L4;
                  } else {
                    var7 = var7 + (-this.field_b.field_x + param2.field_t) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (2 != param1.field_d) {
                    break L5;
                  } else {
                    var7 = var7 + (-this.field_b.field_x + param2.field_t);
                    break L5;
                  }
                }
                this.field_b.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              if (param3 == 2) {
                break L6;
              } else {
                this.field_d = (pb[]) null;
                break L6;
              }
            }
            L7: {
              var6 = param1.b(param2, 0);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param1.field_a) {
                  break L7;
                } else {
                  if (0 <= this.field_e) {
                    L8: {
                      stackIn_19_0 = param1.field_a;

                      stackIn_19_1 = (String) (var6);

                      if (this.field_i == -2147483648) {
                        stackIn_20_0 = (bd) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = 0;
                        break L8;
                      } else {
                        stackIn_20_0 = (bd) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) ((Object) stackIn_19_1);
                        stackIn_20_2 = this.field_i;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_22_2 = stackIn_20_2 + (param4 - -param2.field_w) - -param1.field_m;

                      if ((this.field_a ^ -1) == 2147483647) {
                        stackIn_20_0 = (bd) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = 0;
                        break L9;
                      } else {
                        stackIn_20_0 = (bd) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = this.field_a;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_25_3 = stackIn_23_3 + param1.field_c + (param2.field_k + param0);

                      stackIn_25_4 = -param1.field_f + param2.field_p - param1.field_m;

                      stackIn_25_5 = -param1.field_c + (param2.field_t - param1.field_k);

                      stackIn_25_6 = this.field_e;

                      stackIn_25_7 = this.field_h;

                      if (this.field_f == -2147483648) {
                        stackIn_20_0 = (bd) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = 256;
                        break L10;
                      } else {
                        stackIn_20_0 = (bd) ((Object) stackIn_20_0);
                        stackIn_20_1 = (String) ((Object) stackIn_20_1);

                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = stackIn_25_5;
                        stackIn_26_6 = stackIn_25_6;
                        stackIn_26_7 = stackIn_25_7;
                        stackIn_26_8 = this.field_f;
                        break L10;
                      }
                    }
                    ((bd) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param1.field_h, param1.field_d, param1.field_j);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var6_ref);

            stackIn_30_1 = new StringBuilder().append("db.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_g = 0;
        field_c = 0;
    }
}
