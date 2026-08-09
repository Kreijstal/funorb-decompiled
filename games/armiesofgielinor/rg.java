/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    int field_f;
    int[] field_i;
    static wk[] field_h;
    static int[] field_m;
    int field_e;
    String field_k;
    rg field_j;
    String field_g;
    static ue field_b;
    rg[] field_a;
    static String field_l;
    static String field_d;
    wk field_c;

    final int a(int param0, int param1, int param2, int param3, ci param4, int param5, int param6) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        wk stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        wk stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        wk stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        wk stackIn_61_0;
        int stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 40) {
                break L1;
              } else {
                rg.a(-65);
                break L1;
              }
            }
            L2: {
              var8_int = param0;
              if (this.field_a == null) {
                if (null != this.field_i) {
                  var8_int = var8_int * this.field_i.length;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var8_int = var8_int * this.field_a.length;
                break L2;
              }
            }
            L3: {
              var9 = param5;
              if (0 >= param0) {
                stackIn_11_0 = 0;
                break L3;
              } else {
                stackIn_11_0 = 150 * param0 >> 1895594824;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_11_0;
              if ((param0 ^ -1) <= -1) {
                stackIn_14_0 = 256;
                break L4;
              } else {
                stackIn_14_0 = param0 + 256;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_14_0;
              if (-1 > (param0 ^ -1)) {
                break L5;
              } else {
                if (this.field_j == null) {
                  break L5;
                } else {
                  L6: {
                    go.field_e.f(130 - -param2, 177, var11);
                    if (param0 != 0) {
                      break L6;
                    } else {
                      if (ml.a(212, 165, 20, false)) {
                        vi.field_f = fo.a(4800, rr.field_a, new String[]{this.field_j.field_k});
                        var9 = 40;
                        go.field_e.f(db.a(true, 130 + param2), u.a(177, (byte) 94), 128);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_c.e(db.a(true, param2 + 145), u.a(192, (byte) 94), var11);
                  km.field_h[1].e(db.a(true, 142 - -param2), u.a(189, (byte) 94), var11);
                  break L5;
                }
              }
            }
            L7: {
              if (null != this.field_a) {
                var12 = this.field_a.length;
                var17 = 0;
                var13 = var17;
                L8: while (true) {
                  if (var12 <= var17) {
                    break L7;
                  } else {
                    L9: {
                      if ((param0 ^ -1) <= -1) {
                        var14 = param2 + 165 + (int)(Math.sin(((double)var8_int + 256.0 * ((double)var17 * 6.283185307179586)) / (double)(256 * var12)) * (double)(90 + var10));
                        var15 = -(int)((double)(var10 + 90) * Math.cos(((double)var8_int + 256.0 * (6.283185307179586 * (double)var17)) / (double)(256 * var12))) + 212;
                        break L9;
                      } else {
                        if (param6 == var17) {
                          var14 = param2 + 165 + (int)((double)((90 * param0 >> 1793171368) + 90) * Math.sin(256.0 * ((double)var17 * 6.283185307179586) / (double)(var12 * 256)));
                          var15 = 212 + -(int)(Math.cos(256.0 * (6.283185307179586 * (double)var17) / (double)(var12 * 256)) * (double)((90 * param0 >> 578855784) + 90));
                          break L9;
                        } else {
                          var14 = 165 + ((int)(Math.sin(256.0 * ((double)var17 * 6.283185307179586) / (double)(256 * var12)) * (double)(90 - -var10)) + param2);
                          var15 = -(int)(Math.cos(256.0 * (6.283185307179586 * (double)var17) / (double)(256 * var12)) * (double)(var10 + 90)) + 212;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 != 0) {
                        break L10;
                      } else {
                        if (ml.a(var15, var14, 20, false)) {
                          vi.field_f = this.field_a[var17].field_k;
                          var9 = 50 + var17;
                          go.field_e.f(db.a(true, var14 - 35), u.a(var15 - 35, (byte) 94), 128);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param0 >= 0) {
                        break L11;
                      } else {
                        if (param6 == var17) {
                          go.field_e.f(db.a(true, var14 - 35), u.a(var15 - 35, (byte) 94), -param0);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      stackIn_57_0 = this.field_a[var17].field_c;

                      stackIn_57_1 = db.a(true, -20 + var14);

                      stackIn_57_2 = u.a(var15 - 20, (byte) 94);

                      if (var17 != param6) {
                        stackIn_58_0 = (wk) ((Object) stackIn_57_0);
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = stackIn_57_2;
                        stackIn_58_3 = var11;
                        break L12;
                      } else {
                        stackIn_58_0 = (wk) ((Object) stackIn_57_0);
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = stackIn_57_2;
                        stackIn_58_3 = 256;
                        break L12;
                      }
                    }
                    L13: {
                      ((wk) (Object) stackIn_58_0).e(stackIn_58_1, stackIn_58_2, stackIn_58_3);
                      stackIn_60_0 = km.field_h[1];

                      stackIn_60_1 = db.a(true, var14 - 23);

                      stackIn_60_2 = u.a(-23 + var15, (byte) 94);

                      if (var17 == param6) {
                        stackIn_61_0 = (wk) ((Object) stackIn_60_0);
                        stackIn_61_1 = stackIn_60_1;
                        stackIn_61_2 = stackIn_60_2;
                        stackIn_61_3 = 256;
                        break L13;
                      } else {
                        stackIn_61_0 = (wk) ((Object) stackIn_60_0);
                        stackIn_61_1 = stackIn_60_1;
                        stackIn_61_2 = stackIn_60_2;
                        stackIn_61_3 = var11;
                        break L13;
                      }
                    }
                    ((wk) (Object) stackIn_61_0).e(stackIn_61_1, stackIn_61_2, stackIn_61_3);
                    var17++;
                    continue L8;
                  }
                }
              } else {
                if (this.field_i == null) {
                  break L7;
                } else {
                  var12 = this.field_i.length;
                  var13 = 0;
                  L14: while (true) {
                    if (var12 <= var13) {
                      break L7;
                    } else {
                      L15: {
                        var14 = 165 - -(int)(Math.sin((256.0 * (6.283185307179586 * (double)var13) + (double)var8_int) / (double)(var12 * 256)) * (double)(var10 + 90)) - -param2;
                        var15 = -(int)((double)(90 + var10) * Math.cos(((double)var8_int + 6.283185307179586 * (double)var13 * 256.0) / (double)(256 * var12))) + 212;
                        if (0 != param0) {
                          break L15;
                        } else {
                          if (ml.a(var15, var14, 20, false)) {
                            vi.field_f = fq.field_f[this.field_i[var13]];
                            var9 = 50 + var13;
                            go.field_e.f(db.a(true, -35 + var14), u.a(-35 + var15, (byte) 94), 128);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (ev.field_d == this.field_i[var13]) {
                          go.field_e.f(db.a(true, -35 + var14), u.a(var15 - 35, (byte) 94), param1);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (this.field_i[var13] != ab.field_a) {
                          break L17;
                        } else {
                          go.field_e.f(db.a(true, var14 + -35), u.a(var15 + -35, (byte) 94), 256 - param1);
                          break L17;
                        }
                      }
                      L18: {
                        lf.field_h[uc.field_d[this.field_i[var13]][2]].g(db.a(true, var14 - 20), u.a(-20 + var15, (byte) 94));
                        if (ev.field_d != this.field_i[var13]) {
                          break L18;
                        } else {
                          lf.field_h[uc.field_d[this.field_i[var13]][2]].f(db.a(true, -20 + var14), u.a(var15 - 20, (byte) 94), param1);
                          break L18;
                        }
                      }
                      L19: {
                        if (this.field_i[var13] == ab.field_a) {
                          lf.field_h[uc.field_d[this.field_i[var13]][2]].f(db.a(true, var14 + -20), u.a(var15 - 20, (byte) 94), 256 - param1);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      km.field_h[0].g(db.a(true, -23 + var14), u.a(var15 + -23, (byte) 94));
                      var13++;
                      continue L14;
                    }
                  }
                }
              }
            }
            stackIn_63_0 = var9;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var8 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var8);

            stackIn_66_1 = new StringBuilder().append("rg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L20;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_63_0;
    }

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 > -57) {
            field_b = (ue) null;
        }
    }

    rg(int param0, String param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_j = null;
        try {
          L0: {
            this.field_f = param0;
            this.field_c = lf.field_h[param0];
            this.field_k = param1;
            this.field_i = param3;
            this.field_g = param2;
            var5_int = 0;
            L1: while (true) {
              if (this.field_i.length <= var5_int) {
                break L0;
              } else {
                ct.field_o[this.field_i[var5_int]] = (rg) (this);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
    }

    rg(int param0, String param1, String param2, rg[] param3) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_j = null;
        try {
          L0: {
            this.field_f = param0;
            this.field_c = lf.field_h[param0];
            this.field_k = param1;
            this.field_a = param3;
            this.field_g = param2;
            var5_int = 0;
            L1: while (true) {
              if (this.field_a.length <= var5_int) {
                break L0;
              } else {
                this.field_a[var5_int].field_j = (rg) (this);
                this.field_a[var5_int].field_e = var5_int;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_l = "To play a multiplayer game, please log in or create a free account.";
        field_d = "Elixirs";
    }
}
