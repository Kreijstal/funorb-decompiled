/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends we {
    static jea field_z;
    private int field_u;
    private int[] field_A;
    private long[][] field_w;
    static String field_v;
    private int[][] field_F;
    private int[] field_B;
    static jea field_s;
    private int field_E;
    private int[] field_D;
    static int field_r;
    private String[][] field_y;
    private int field_x;
    static int field_C;
    private int[] field_t;

    final String b(int param0, byte param1) {
        if (param1 < 111) {
            ((pk) this).a(false, true, 79);
        }
        if (param0 == 0) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 113);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        bb var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        if (param0) {
          if (vpa.a(8)) {
            ((pk) this).field_E = 1;
            return;
          } else {
            var4 = cb.field_i.length;
            var5_int = 0;
            L0: while (true) {
              if (var5_int >= var4) {
                L1: {
                  var5 = pt.field_p;
                  if (var5 == null) {
                    pt.field_p = uta.a(3, ((pk) this).field_u, 0, 10, 1);
                    ((pk) this).field_E = 0;
                    break L1;
                  } else {
                    if (!var5.field_h) {
                      ((pk) this).field_E = 0;
                      break L1;
                    } else {
                      if (var5.field_k != null) {
                        ((pk) this).field_F = var5.field_p;
                        ((pk) this).field_y = var5.field_k;
                        ((pk) this).field_E = 2;
                        ((pk) this).field_w = var5.field_o;
                        if (((pk) this).field_y[((pk) this).field_x][0] == null) {
                          ((pk) this).field_E = 3;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        ((pk) this).field_E = 1;
                        break L1;
                      }
                    }
                  }
                }
                return;
              } else {
                if (jba.field_j >= -(((pk) this).field_D[var5_int] >> 1) + ((pk) this).field_A[var5_int]) {
                  if (jba.field_j <= ((pk) this).field_A[var5_int] + (((pk) this).field_D[var5_int] >> 1)) {
                    if (-(((pk) this).field_t[var5_int] >> 1) + ((pk) this).field_B[var5_int] <= sta.field_B) {
                      if ((((pk) this).field_t[var5_int] >> 1) + ((pk) this).field_B[var5_int] >= sta.field_B) {
                        if (1 == hf.field_b) {
                          pt.field_p = null;
                          ((pk) this).field_u = var5_int;
                          var5_int++;
                          continue L0;
                        } else {
                          var5_int++;
                          continue L0;
                        }
                      } else {
                        var5_int++;
                        continue L0;
                      }
                    } else {
                      var5_int++;
                      continue L0;
                    }
                  } else {
                    var5_int++;
                    continue L0;
                  }
                } else {
                  var5_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        if (param0 <= 54) {
            boolean discarded$0 = this.a(-109, (byte) -61, 118);
        }
        ((pk) this).field_x = param1;
    }

    final int a(byte param0, int param1) {
        if (param0 < 111) {
            return 78;
        }
        return 335 + (-(80 * ((pk) this).field_m.length) - -(param1 * 160));
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            int discarded$0 = ((pk) this).g(-68, -86);
        }
        return koa.b(0) + -30;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        da var11 = null;
        da var12 = null;
        String var8 = null;
        String var10 = null;
        try {
            var11 = kn.field_p;
            var12 = var11;
            int var9 = 44 % ((param4 - -34) / 41);
            var8 = param1 >= 10 ? Integer.toString(param1) : "0" + (char)(48 - -param1);
            if (param1 == -1) {
                var8 = "";
            }
            var10 = f.a(2843, true, bg.field_t, (long)param2, 0);
            var11.a(-1, -1, ab.field_t[0], param3 | -16777216, param0, var8);
            var11.a(param0, false, param5, ab.field_t[1], param3 | -16777216, -1);
            var12.a(12199, param0, var10, -1, param3 | -16777216, ab.field_t[2]);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pk.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        String[] var4 = null;
        kb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String[] var17 = null;
        int[] var24 = null;
        long[] var25 = null;
        int stackIn_3_0 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var17 = ((pk) this).field_y[param0];
          var4 = var17;
          var24 = ((pk) this).field_F[param0];
          var25 = ((pk) this).field_w[param0];
          var7 = qv.field_o;
          var8 = 0;
          if (var7 != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var9 = stackIn_3_0;
        var10 = param2 + 140;
        var11 = 0;
        var12 = 140 + param2;
        L1: while (true) {
          if (var11 >= 10) {
            L2: {
              if (var9 != 0) {
                break L2;
              } else {
                if (((pk) this).field_u == var7.field_f) {
                  var8 = 1;
                  this.a(var10 - -20, -1, var7.field_o[0], -5818367, -91, fna.field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < -85) {
                break L3;
              } else {
                field_v = null;
                break L3;
              }
            }
            return var8 != 0;
          } else {
            var13 = var17[var11];
            if (var13 != null) {
              if (var13.length() != 0) {
                L4: {
                  var14 = var24[var11];
                  var15 = 0;
                  if (var9 == 0) {
                    if (var25[var11] != var7.field_h) {
                      break L4;
                    } else {
                      if (var7.field_o[0] != var14) {
                        break L4;
                      } else {
                        if (ue.a(var13, 0)) {
                          var9 = 1;
                          var15 = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var10 = var12;
                  stackOut_16_0 = this;
                  stackOut_16_1 = var12;
                  stackOut_16_2 = var11 - -1;
                  stackOut_16_3 = var14;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  if (var15 != 0) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = stackIn_18_3;
                    stackOut_18_4 = 10309393;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    stackIn_19_4 = stackOut_18_4;
                    break L5;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = stackIn_17_3;
                    stackOut_17_4 = 2431750;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    stackIn_19_4 = stackOut_17_4;
                    break L5;
                  }
                }
                this.a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, -105, var13);
                var8 = 1;
                var11++;
                var12 += 20;
                continue L1;
              } else {
                var11++;
                var12 += 20;
                continue L1;
              }
            } else {
              var11++;
              var12 += 20;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        qr.field_v.a(param1 + 63, false, vea.field_a.toUpperCase() + " - " + bi.field_b[((pk) this).field_x].toUpperCase(), 65, -14279929, -1);
        if (param2 <= -9) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= cb.field_i.length) {
              L1: {
                var4 = 120 + param1 - -50;
                eda.field_f.a(-1, -1, ab.field_t[0], -14671840, var4, hl.field_a);
                eda.field_f.a(var4, false, pta.field_g.toUpperCase(), ab.field_t[1], -14671840, -1);
                eda.field_f.a(12199, var4, lc.field_L.toUpperCase(), -1, -14671840, ab.field_t[2]);
                var5 = null;
                var6 = ((pk) this).field_E;
                if (var6 == 0) {
                  var5 = (Object) (Object) dt.field_n;
                  break L1;
                } else {
                  if (var6 == 1) {
                    var5 = (Object) (Object) kt.field_H;
                    break L1;
                  } else {
                    if (3 == var6) {
                      var5 = (Object) (Object) nm.field_j;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (var5 != null) {
                  oka.a(((String) var5).toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                  break L2;
                } else {
                  boolean discarded$1 = this.a(((pk) this).field_x, (byte) -91, 50 + param1);
                  break L2;
                }
              }
              kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
              return;
            } else {
              L3: {
                var5 = null;
                var6 = 255;
                if (((pk) this).field_u == var4) {
                  var5 = (Object) (Object) cb.field_i[var4];
                  break L3;
                } else {
                  var6 = var6 >> 1;
                  var5 = (Object) (Object) qf.field_k[var4];
                  break L3;
                }
              }
              ((nh) var5).a(((pk) this).field_A[var4] + -(((pk) this).field_D[var4] >> 1), -(((pk) this).field_t[var4] >> 1) + (((pk) this).field_B[var4] + param1), ((pk) this).field_D[var4], ((pk) this).field_t[var4], 0, 16777215 | var6 << 24, 1);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            field_C = -47;
        }
        return param0 * 160 + 465 + -(80 * ((pk) this).field_m.length);
    }

    final boolean a(int param0, int param1) {
        if (param0 != -13) {
            return true;
        }
        return -1 + param1 == ((pk) this).field_x ? true : false;
    }

    public static void b(boolean param0) {
        if (!param0) {
            pk.b(false);
        }
        field_z = null;
        field_s = null;
        field_v = null;
    }

    pk(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((pk) this).field_u = 0;
        ((pk) this).field_E = 0;
        ((pk) this).field_x = 0;
        try {
          L0: {
            var7_int = cb.field_i.length;
            ((pk) this).field_B = new int[var7_int];
            ((pk) this).field_D = new int[var7_int];
            ((pk) this).field_A = new int[var7_int];
            ((pk) this).field_t = new int[var7_int];
            var8 = 0;
            L1: while (true) {
              if (var7_int <= var8) {
                ((pk) this).field_o = false;
                break L0;
              } else {
                L2: {
                  var9 = cb.field_i[var8].a();
                  var10 = cb.field_i[var8].c();
                  ((pk) this).field_A[var8] = (aaa.a(false) >> 1) + -(32 * (-1 + cb.field_i.length)) + var8 * 65;
                  ((pk) this).field_B[var8] = 110;
                  ((pk) this).field_D[var8] = 3 * var9 / 4;
                  ((pk) this).field_t[var8] = 3 * var10 / 4;
                  if (var8 != 1) {
                    break L2;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 15;
                    break L2;
                  }
                }
                L3: {
                  if (var8 != 2) {
                    break L3;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 20;
                    ((pk) this).field_D[var8] = var9 >> 1;
                    ((pk) this).field_t[var8] = var10 >> 1;
                    break L3;
                  }
                }
                L4: {
                  if (3 != var8) {
                    break L4;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 10;
                    ((pk) this).field_B[var8] = ((pk) this).field_B[var8] - 5;
                    break L4;
                  }
                }
                L5: {
                  if (var8 != 4) {
                    break L5;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 15;
                    break L5;
                  }
                }
                L6: {
                  if (5 != var8) {
                    break L6;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 15;
                    break L6;
                  }
                }
                L7: {
                  if (var8 != 6) {
                    break L7;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 10;
                    ((pk) this).field_B[var8] = ((pk) this).field_B[var8] + 5;
                    break L7;
                  }
                }
                L8: {
                  if (7 != var8) {
                    break L8;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 15;
                    ((pk) this).field_B[var8] = ((pk) this).field_B[var8] - 5;
                    break L8;
                  }
                }
                L9: {
                  if (var8 != 8) {
                    break L9;
                  } else {
                    ((pk) this).field_A[var8] = ((pk) this).field_A[var8] - 10;
                    break L9;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("pk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Invalid name";
        field_C = 0;
    }
}
