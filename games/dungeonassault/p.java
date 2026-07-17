/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends qe {
    private gd field_L;
    private nn field_M;
    private tf field_E;
    private gd field_C;
    private gd field_A;
    private int field_z;
    private gd field_w;
    static String field_K;
    private int field_F;
    private cl field_u;
    private gd field_P;
    private boolean field_s;
    static int[] field_x;
    private gd field_y;
    private gd field_t;
    private pp field_Q;
    private cp[] field_v;
    private pp field_O;
    private cp[] field_D;
    private nn field_R;
    static String[] field_J;
    static cn[] field_G;
    private rh field_N;
    private rh field_I;
    static String field_r;
    private wd field_H;

    private final static cn[] a(cn[] param0) {
        RuntimeException var2 = null;
        cn[] var2_array = null;
        int var3 = 0;
        cn var4 = null;
        int var6 = 0;
        cn var7 = null;
        cn[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2_array = new cn[param0.length];
            jh.c();
            var3 = 0;
            L1: while (true) {
              if (param0.length <= var3) {
                jh.b();
                stackOut_8_0 = (cn[]) var2_array;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var7 = param0[var3];
                  var4 = var7;
                  if (var4 == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("p.K(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 400 + 41);
        }
        return stackIn_9_0;
    }

    private final void a(gd param0, String param1, byte param2, String param3, String param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        String var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 109) {
                break L1;
              } else {
                this.a((byte) -82);
                break L1;
              }
            }
            L2: {
              jh.c();
              var6_int = 130;
              var7 = db.field_v.field_H + db.field_v.field_E;
              var8 = new cn(var6_int, var7);
              var8.e();
              db.field_v.b(param4, 0, db.field_v.field_H, 12632256, -1);
              db.field_v.a(param3, var6_int, db.field_v.field_H, 12632256, -1);
              var9 = new cn(var6_int, var7);
              var9.e();
              db.field_v.b(param4, 0, db.field_v.field_H, 12690143, -1);
              db.field_v.a(param3, var6_int, db.field_v.field_H, 12690143, -1);
              if (!param0.field_B) {
                stackOut_4_0 = (String) param3;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (String) param1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var10 = stackIn_5_0;
            var11 = new cn(var6_int, var7);
            var11.e();
            db.field_v.b(param4, 0, db.field_v.field_H, 16744448, -1);
            db.field_v.a(var10, var6_int, db.field_v.field_H, 16744448, -1);
            jh.b();
            var12 = rb.a(8, var9, 255, (byte) -13);
            var13 = rb.a(8, var11, 16711680, (byte) 78);
            param0.a(var11, var8, var13, var9, (byte) 126, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("p.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final gd a(String param0, String param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        cn var9 = null;
        cn var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        gd stackIn_1_0 = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_0_0 = null;
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
            jh.c();
            var7_int = 130;
            var8 = db.field_v.field_E + db.field_v.field_H;
            var9 = new cn(var7_int, var8);
            var9.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 12632256, -1);
            db.field_v.a(param0, var7_int, db.field_v.field_H, 12632256, -1);
            var10 = new cn(var7_int, var8);
            var10.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 12690143, -1);
            db.field_v.a(param0, var7_int, db.field_v.field_H, 12690143, -1);
            var11 = new cn(var7_int, var8);
            var11.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 16744448, -1);
            db.field_v.a(param5, var7_int, db.field_v.field_H, 16744448, -1);
            jh.b();
            var12 = rb.a(8, var10, 255, (byte) 92);
            var13 = rb.a(8, var11, 16711680, (byte) -8);
            stackOut_0_0 = new gd(var9, var10, var12, var11, var13, 491, (-var8 + 30 >> 1) + param4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("p.R(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(491).append(44).append(-1).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ac var4 = null;
        cp var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        ((p) this).field_v = new cp[gh.field_i.length];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= gh.field_i.length) {
            return;
          } else {
            var4 = gh.field_i[var3];
            if (var4 != null) {
              if (var4.field_j != -1) {
                if (0 != var4.field_g) {
                  if (var4.field_z != null) {
                    if (var4.field_i <= gm.field_d.field_m) {
                      var5 = new cp(10, var2, var4);
                      var2 = var2 + (var5.field_x + 10);
                      ((p) this).field_v[var3] = var5;
                      ((p) this).field_R.a((gd) (Object) var5, (byte) -20);
                      var3++;
                      continue L0;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        cn var7_ref_cn = null;
        int var8 = 0;
        int var9 = 0;
        lb var10 = null;
        L0: {
          var10 = gm.field_d;
          var5 = var10;
          var6 = var10.field_L[param3].field_a;
          if (qj.field_c[param3] != null) {
            var6 = qj.field_c[param3].field_a;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var6 == 0) {
            L2: {
              var7 = 0;
              if (param3 % 7 == 0) {
                break L2;
              } else {
                if (!gm.field_d.field_k.a(-1 + param3 + -(param3 / 7), (byte) 72)) {
                  break L2;
                } else {
                  var7 = var7 | 1;
                  break L2;
                }
              }
            }
            L3: {
              if (param3 % 7 == 6) {
                break L3;
              } else {
                if (gm.field_d.field_k.a(param3 - param3 / 7, (byte) 73)) {
                  var7 = var7 | 2;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param3 <= 6) {
                break L4;
              } else {
                if (gm.field_d.field_k.a(param3 - -35, (byte) 119)) {
                  var7 = var7 | 4;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param3 >= 42) {
                break L5;
              } else {
                if (!gm.field_d.field_k.a(param3 - -42, (byte) 80)) {
                  break L5;
                } else {
                  var7 = var7 | 8;
                  break L5;
                }
              }
            }
            id.field_m[var7].h(param1, param0 + 12);
            break L1;
          } else {
            this.a(param1, 124, param3, -dm.field_a[var6].field_v + 56 + param0, dm.field_a[var6]);
            if (gh.field_i[var6].field_g == 2) {
              var7_ref_cn = jb.a((byte) -70, var6);
              if (var7_ref_cn == null) {
                break L1;
              } else {
                var8 = var7_ref_cn.field_E * 5 >> 3;
                var9 = var7_ref_cn.field_G * 5 >> 3;
                var7_ref_cn.c(param1 + (-var8 + 48 >> 1), 40 + param0 - var9, var8, var9);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        Object var2 = null;
        Object var3 = null;
        rj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        gg var16 = null;
        String var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var15 = DungeonAssault.field_K;
          super.a(param0);
          ((p) this).field_e.b(0, 0);
          var2 = null;
          if (-1 != ((p) this).field_F) {
            var2 = (Object) (Object) qj.field_c[((p) this).field_F];
            if (var2 == null) {
              var2 = (Object) (Object) gm.field_d.field_L[((p) this).field_F];
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          var3 = null;
          if (var2 == null) {
            if (((p) this).field_R.field_l != null) {
              var3 = (Object) (Object) ((cp) (Object) ((p) this).field_R.field_l).field_S;
              break L1;
            } else {
              break L1;
            }
          } else {
            var3 = (Object) (Object) ((ai) var2).field_h;
            break L1;
          }
        }
        L2: {
          p.a(200, 65, (ac) var3);
          if (var2 == null) {
            p.a(488, 54, ((p) this).field_H, kc.field_V);
            break L2;
          } else {
            p.a(488, 54, (ai) var2);
            break L2;
          }
        }
        this.a(false, 484, 327);
        var4 = (rj) (Object) ((p) this).field_p.e(-24172);
        L3: while (true) {
          if (var4 == null) {
            L4: {
              ad.field_e.h(187, 48);
              ad.field_e.i(187, -ad.field_e.field_b + 40);
              ad.field_e.f(604 - ad.field_e.field_d, 40 + -ad.field_e.field_b);
              oe.field_m.h(171, 382);
              oe.field_m.j(580, 99);
              if (!gl.field_Lb) {
                this.a(8, 80, 394);
                break L4;
              } else {
                ((p) this).field_u.b((byte) -55);
                break L4;
              }
            }
            L5: {
              if (null != ((p) this).field_b) {
                ((p) this).field_b.a((byte) -91);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              p.e();
              ((p) this).field_q.a((byte) -61);
              if (gl.field_Lb) {
                var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo.field_a / 20.0f))));
                wm.field_c.b(-(im.field_e.field_y >> 1) + 356, -(im.field_e.field_v >> 1) + 267, 256);
                wm.field_c.b(356 + -(im.field_e.field_y >> 1), 267 - (im.field_e.field_v >> 1), var5);
                if (((p) this).field_w.field_B) {
                  ec.a(-(im.field_e.field_v >> 1) + 265, -(im.field_e.field_y >> 1) + 354, (byte) -86, im.field_e, 16744448, 96);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                var5 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 128.0);
                wm.field_c.b(205, 83, 256);
                wm.field_c.b(205, 83, var5);
                if (((p) this).field_w.field_B) {
                  ec.a(95, 205, (byte) -95, im.field_e, 16744448, 192);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            var4 = (rj) (Object) ((p) this).field_p.e(-24172);
            L7: while (true) {
              if (var4 == null) {
                L8: {
                  if (((p) this).field_F == -1) {
                    break L8;
                  } else {
                    if (null != ((p) this).field_R.field_l) {
                      L9: {
                        var5 = 0;
                        if (qj.field_c[((p) this).field_F] != null) {
                          var5 = qj.field_c[((p) this).field_F].field_h.field_c;
                          break L9;
                        } else {
                          if (null == gm.field_d.field_L[((p) this).field_F]) {
                            break L9;
                          } else {
                            var5 = gm.field_d.field_L[((p) this).field_F].field_h.field_c >> 1;
                            break L9;
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L8;
                      } else {
                        L10: {
                          var6 = ((p) this).field_F / 7;
                          var7 = ((p) this).field_F % 7;
                          var8 = 421 - (189 + -((var7 + var6) * 27));
                          var9 = 80 - -(20 * (-var7 + (var6 + 7)));
                          if (gl.field_Lb) {
                            var16 = ((p) this).field_u.b(((p) this).field_F, -15390);
                            var8 = -1 + var16.field_f;
                            var9 = 7 + var16.field_b;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (t.field_a == var5) {
                            break L11;
                          } else {
                            var17 = "+" + var5 / 10;
                            var11 = db.field_v.b(var17);
                            var12 = db.field_v.field_E + db.field_v.field_H;
                            jn.field_a = new cn(var11, var12);
                            jh.a(jn.field_a);
                            db.field_v.b(var17, 0, db.field_v.field_H, 16744512, -1);
                            jh.b();
                            dm.field_f = dd.a((byte) -112, 12, jn.field_a);
                            var19 = dm.field_f.field_B;
                            var18 = var19;
                            var13 = var18;
                            var14 = 0;
                            L12: while (true) {
                              if (var14 >= var19.length) {
                                t.field_a = var5;
                                break L11;
                              } else {
                                var13[var14] = nb.a(var19[var14], 255);
                                if (var19[var14] == 0) {
                                  var19[var14] = 1;
                                  var14++;
                                  continue L12;
                                } else {
                                  var14++;
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                        var10 = var8 - (jn.field_a.field_y >> 1);
                        var11 = -jn.field_a.field_v + var9;
                        int discarded$1 = 99;
                        bp.a(var11, dm.field_f, var10);
                        jn.field_a.h(var10, var11);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L13: {
                  ((p) this).field_N.d();
                  ((p) this).field_I.d();
                  if (null == ((p) this).field_b) {
                    break L13;
                  } else {
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= gf.field_b.length) {
                        ((p) this).field_b.b(112);
                        break L13;
                      } else {
                        gf.field_b[var5] = nb.a(gf.field_b[var5] >>> 2, 1061109567);
                        var5++;
                        continue L14;
                      }
                    }
                  }
                }
                L15: {
                  if (!kn.field_g) {
                    break L15;
                  } else {
                    ab.a(0);
                    break L15;
                  }
                }
                oh.a((byte) 54);
                return;
              } else {
                var4.d(0);
                var4 = (rj) (Object) ((p) this).field_p.a(4);
                continue L7;
              }
            }
          } else {
            var4.a(68);
            var4 = (rj) (Object) ((p) this).field_p.a(4);
            continue L3;
          }
        }
    }

    final static void a(nh param0, int param1, nh param2, nh param3) {
        RuntimeException var4 = null;
        q[] var5 = null;
        q[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        q[] var10 = null;
        cn var11 = null;
        int var11_int = 0;
        cn var12 = null;
        int var13 = 0;
        q[] var14 = null;
        cn var15 = null;
        int[][] var16 = null;
        cn var17 = null;
        cn var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            gn.field_i = kn.a(param3, "commonui", "frame_top", -62);
            di.field_l = kn.a(param3, "commonui", "frame_bottom", -91);
            bl.field_e = oh.a(param3, "commonui", 11091, "jagex_logo_grey");
            na.field_C = kn.a(param3, "commonui", "button", -94);
            sl.field_c = da.a("commonui", "validation", 0, param3);
            ta.field_e = (se) (Object) kk.a(param2, param3, "arezzo12", 0, "commonui");
            lp.field_C = (se) (Object) kk.a(param2, param3, "arezzo14", 0, "commonui");
            hc.field_f = (se) (Object) kk.a(param2, param3, "arezzo14bold", 0, "commonui");
            var17 = new cn(param0.a("button.gif", "", (byte) -116), (java.awt.Component) (Object) c.field_h);
            q discarded$2 = pa.a((byte) -94, param3, "commonui", "dropdown");
            var5 = qa.a(15322, "screen_options", "commonui", param3);
            d.field_c = new q[4];
            nf.field_v = new q[4];
            wo.field_a = new q[4];
            var6 = new q[][]{d.field_c, nf.field_v, wo.field_a};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              if (var19.length <= var8) {
                var8 = var5[0].field_j[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_v;
                    ie.a(95);
                    var17.e();
                    gf.d(0, 0, gf.field_i, gf.field_c);
                    var15 = new cn(var9, var9);
                    var18 = var15;
                    var18.e();
                    var17.c(0, 0);
                    var11 = new cn(var9, var9);
                    var11.e();
                    var17.c(-var17.field_y + var9, 0);
                    var12 = new cn(var17.field_y + -(var9 * 2), var9);
                    var12.e();
                    var17.c(-var9, 0);
                    int discarded$3 = 1;
                    ti.c();
                    na.field_C = new cn[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = pi.a(1, var5[var9], var19[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var19[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("p.Q(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(37).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static vk a(int param0, String param1) {
        vk var3 = null;
        RuntimeException var3_ref = null;
        vk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_0_0 = null;
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
            var3 = new vk(false);
            var3.field_g = param1;
            var3.field_d = param0;
            stackOut_0_0 = (vk) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("p.A(").append(param0).append(44);
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -28323 + 41);
        }
        return stackIn_1_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 327 + (8 - -la.field_b.field_H);
        db.field_v.b(pb.field_I, 491, var4, 16777215, -1);
        db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 617, var4, 16777215, -1);
        int var5 = jj.field_c <= 0 ? 0 : jj.field_c / 10;
        var4 += 37;
        int var6 = gm.field_d.field_s < jj.field_c ? 16711680 : 16777215;
        db.field_v.b(ef.field_f, 491, var4, var6, -1);
        db.field_v.a(Integer.toString(var5), 617, var4, var6, -1);
    }

    private final void d(int param0) {
        ai var2_ref_ai = null;
        int var2 = 0;
        ac var3 = null;
        int var4 = 0;
        ac var5 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          ((p) this).field_F = -1;
          if (kn.field_g) {
            if (!od.a((byte) -91)) {
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (super.d()) {
          return;
        } else {
          L1: {
            int discarded$6 = 162;
            ((p) this).field_F = this.b(hj.field_S, eh.field_h);
            if (((p) this).field_F != -1) {
              L2: {
                var2_ref_ai = qj.field_c[((p) this).field_F];
                if (var2_ref_ai != null) {
                  break L2;
                } else {
                  var2_ref_ai = gm.field_d.field_L[((p) this).field_F];
                  break L2;
                }
              }
              if (var2_ref_ai != null) {
                L3: {
                  if (var2_ref_ai == rd.field_x) {
                    break L3;
                  } else {
                    hh.field_r = (en) (Object) new bd(var2_ref_ai.field_h);
                    rd.field_x = var2_ref_ai;
                    break L3;
                  }
                }
                int discarded$7 = 95;
                uj.a(hh.field_r);
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          L4: {
            if ((Object) (Object) ((p) this).field_Q != (Object) (Object) hh.field_s) {
              if ((Object) (Object) ((p) this).field_O == (Object) (Object) hh.field_s) {
                this.d((byte) -76);
                this.a(true, (byte) -11);
                break L4;
              } else {
                if ((Object) (Object) ((p) this).field_L == (Object) (Object) hh.field_s) {
                  this.a((byte) -50, 1);
                  break L4;
                } else {
                  if ((Object) (Object) hh.field_s != (Object) (Object) ((p) this).field_A) {
                    if ((Object) (Object) ((p) this).field_C == (Object) (Object) hh.field_s) {
                      this.a((byte) -82, 2);
                      break L4;
                    } else {
                      if ((Object) (Object) hh.field_s != (Object) (Object) ((p) this).field_y) {
                        if ((Object) (Object) ((p) this).field_P == (Object) (Object) hh.field_s) {
                          this.a((byte) -52, 3);
                          break L4;
                        } else {
                          L5: {
                            if ((Object) (Object) hh.field_s == (Object) (Object) ((p) this).field_w) {
                              break L5;
                            } else {
                              if ((Object) (Object) ((p) this).field_t != (Object) (Object) hh.field_s) {
                                if (hh.field_s instanceof cp) {
                                  var5 = ((cp) (Object) hh.field_s).field_S;
                                  ((p) this).field_H = new wd(var5.field_d);
                                  if (null == var5.field_u) {
                                    break L4;
                                  } else {
                                    ((p) this).field_H.a(rf.field_M, var5.field_u, -10872);
                                    break L4;
                                  }
                                } else {
                                  if (0 == no.field_d) {
                                    break L4;
                                  } else {
                                    L6: {
                                      int discarded$8 = 162;
                                      var2 = this.b(lc.field_c, hm.field_k);
                                      if (var2 == -1) {
                                        break L6;
                                      } else {
                                        if (var2 == 0) {
                                          break L6;
                                        } else {
                                          if (var2 == 6) {
                                            break L6;
                                          } else {
                                            if (var2 == 24) {
                                              break L6;
                                            } else {
                                              if (var2 == 42) {
                                                break L6;
                                              } else {
                                                if (var2 != 48) {
                                                  L7: {
                                                    if (no.field_d == 1) {
                                                      if (((p) this).field_R.field_l != null) {
                                                        L8: {
                                                          var3 = ((cp) (Object) ((p) this).field_R.field_l).field_S;
                                                          if (qj.field_c[var2] == null) {
                                                            break L8;
                                                          } else {
                                                            if (var3 != qj.field_c[var2].field_h) {
                                                              break L8;
                                                            } else {
                                                              break L7;
                                                            }
                                                          }
                                                        }
                                                        L9: {
                                                          if (null == qj.field_c[var2]) {
                                                            if (gm.field_d.field_L[var2] != null) {
                                                              jj.field_c = jj.field_c - (gm.field_d.field_L[var2].field_h.field_c >> 1);
                                                              break L9;
                                                            } else {
                                                              break L9;
                                                            }
                                                          } else {
                                                            jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                                            break L9;
                                                          }
                                                        }
                                                        L10: {
                                                          L11: {
                                                            qj.field_c[var2] = new ai(var3.field_v);
                                                            if (null == qj.field_c[var2].field_c) {
                                                              break L11;
                                                            } else {
                                                              if (qj.field_c[var2].field_c.field_i != var3.field_d) {
                                                                break L11;
                                                              } else {
                                                                break L10;
                                                              }
                                                            }
                                                          }
                                                          qj.field_c[var2].field_c = new wd(var3.field_d);
                                                          break L10;
                                                        }
                                                        jj.field_c = jj.field_c + var3.field_c;
                                                        qh.a(-13716, (rj) (Object) ((p) this).field_Q, 19);
                                                        if (var3.field_u != qj.field_c[var2].field_c.field_n) {
                                                          L12: {
                                                            if (null != var3.field_u) {
                                                              qj.field_c[var2].field_c.a(rf.field_M, var3.field_u, -10872);
                                                              break L12;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                          if (var3.field_a != null) {
                                                            o discarded$9 = gd.a(64, var3.field_a);
                                                            break L7;
                                                          } else {
                                                            break L7;
                                                          }
                                                        } else {
                                                          int discarded$10 = 59;
                                                          jk.j();
                                                          this.c((byte) -118);
                                                          break L4;
                                                        }
                                                      } else {
                                                        break L7;
                                                      }
                                                    } else {
                                                      if (2 != no.field_d) {
                                                        break L7;
                                                      } else {
                                                        L13: {
                                                          if (null != qj.field_c[var2]) {
                                                            jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                                            if (gm.field_d.field_L[var2] != null) {
                                                              jj.field_c = jj.field_c + (gm.field_d.field_L[var2].field_h.field_c >> 1);
                                                              break L13;
                                                            } else {
                                                              break L13;
                                                            }
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                        qj.field_c[var2] = null;
                                                        ((p) this).field_H = null;
                                                        break L7;
                                                      }
                                                    }
                                                  }
                                                  int discarded$11 = 59;
                                                  jk.j();
                                                  this.c((byte) -118);
                                                  break L6;
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.a((byte) -121);
                          break L4;
                        }
                      } else {
                        this.a((byte) -88, 4);
                        break L4;
                      }
                    }
                  } else {
                    this.a((byte) -47, 0);
                    break L4;
                  }
                }
              }
            } else {
              this.c(115);
              this.a(true, (byte) -27);
              break L4;
            }
          }
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        cp[] var5 = null;
        int var6 = 0;
        cp var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          var10 = new int[gh.field_i.length];
          var9 = var10;
          var3 = var9;
          var4 = param1;
          if (0 != var4) {
            if (var4 != 1) {
              if (var4 == 2) {
                var10 = var9;
                var4 = 0;
                L1: while (true) {
                  if (var10.length <= var4) {
                    break L0;
                  } else {
                    if (null != gh.field_i[var4]) {
                      var3[var4] = gh.field_i[var4].field_k;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (3 != var4) {
                  if (4 != var4) {
                    break L0;
                  } else {
                    var10 = var9;
                    var4 = 0;
                    L2: while (true) {
                      if (var10.length <= var4) {
                        break L0;
                      } else {
                        if (gh.field_i[var4] != null) {
                          var3[var4] = gh.field_i[var4].field_r;
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var10 = var9;
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= var10.length) {
                      break L0;
                    } else {
                      if (gh.field_i[var4] != null) {
                        var3[var4] = gh.field_i[var4].field_y;
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var9;
              var4 = 0;
              L4: while (true) {
                if (var10.length <= var4) {
                  break L0;
                } else {
                  if (gh.field_i[var4] != null) {
                    var3[var4] = gh.field_i[var4].field_A;
                    var4++;
                    continue L4;
                  } else {
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var10 = var9;
            var4 = 0;
            L5: while (true) {
              if (var4 >= var10.length) {
                break L0;
              } else {
                if (null != gh.field_i[var4]) {
                  var3[var4] = gh.field_i[var4].field_c;
                  var4++;
                  continue L5;
                } else {
                  var4++;
                  continue L5;
                }
              }
            }
          }
        }
        L6: {
          if (((p) this).field_z == param1) {
            L7: {
              stackOut_38_0 = this;
              stackIn_40_0 = stackOut_38_0;
              stackIn_39_0 = stackOut_38_0;
              if (((p) this).field_s) {
                stackOut_40_0 = this;
                stackOut_40_1 = 0;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                break L7;
              } else {
                stackOut_39_0 = this;
                stackOut_39_1 = 1;
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                break L7;
              }
            }
            ((p) this).field_s = stackIn_41_1 != 0;
            break L6;
          } else {
            ((p) this).field_s = false;
            break L6;
          }
        }
        L8: {
          ((p) this).field_z = param1;
          if (!((p) this).field_s) {
            var4 = 0;
            L9: while (true) {
              if (var4 >= var10.length) {
                break L8;
              } else {
                var3[var4] = -var10[var4];
                var4++;
                continue L9;
              }
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (((p) this).field_v == null) {
            break L10;
          } else {
            ((p) this).field_D = (cp[]) ((p) this).field_v.clone();
            ik.a((Object[]) (Object) ((p) this).field_D, -111, var10);
            break L10;
          }
        }
        L11: {
          if (param0 < -42) {
            break L11;
          } else {
            ((p) this).field_R = null;
            break L11;
          }
        }
        hf.field_nb.field_J = null;
        hf.field_nb.e(true);
        var4 = 0;
        var5 = ((p) this).field_D;
        var6 = 0;
        L12: while (true) {
          if (var6 >= var5.length) {
            return;
          } else {
            var7 = var5[var6];
            if (var7 != null) {
              ((gd) (Object) var7).b(10, var4, (byte) 4);
              var4 = var4 + (8 + ((gd) (Object) var7).field_x);
              hf.field_nb.a((rj) (Object) var7, (byte) -48);
              var6++;
              continue L12;
            } else {
              var6++;
              continue L12;
            }
          }
        }
    }

    final void c(boolean param0) {
        ai[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        ai[] var6 = null;
        ai[] var7 = null;
        int var8 = 0;
        lf var9 = null;
        ai var10 = null;
        ai var11 = null;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        } else {
          if (param0) {
            L0: while (true) {
              int discarded$2 = 47;
              if (!ha.b()) {
                L1: {
                  if (null == ((p) this).field_b) {
                    break L1;
                  } else {
                    if (!((p) this).field_b.field_d) {
                      break L1;
                    } else {
                      L2: {
                        var9 = (lf) (Object) ((p) this).field_b;
                        if (var9.field_u) {
                          this.c(65);
                          break L2;
                        } else {
                          this.d((byte) -76);
                          break L2;
                        }
                      }
                      ((p) this).field_b.c(-127);
                      ((p) this).field_b = null;
                      this.a(true, (byte) -11);
                      break L1;
                    }
                  }
                }
                L3: {
                  this.d(-1380862175);
                  if (kn.field_g) {
                    int discarded$3 = 0;
                    bl.a();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (((p) this).field_H != null) {
                    ((p) this).field_H.a((byte) 109, 20);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6 = gm.field_d.field_L;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var3 >= var6.length) {
                    var7 = qj.field_c;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L6: while (true) {
                      if (var8 >= var7.length) {
                        return;
                      } else {
                        var11 = var7[var8];
                        if (var11 != null) {
                          var11.field_c.a((byte) 109, 20);
                          var8++;
                          continue L6;
                        } else {
                          var8++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var10 = var6[var3];
                    if (var10 != null) {
                      var10.field_c.a((byte) 109, 20);
                      var3++;
                      continue L5;
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              } else {
                if (mm.field_t != 13) {
                  super.f();
                  continue L0;
                } else {
                  this.a(false, (byte) -94);
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void d(boolean param0) {
        field_r = null;
        field_G = null;
        field_K = null;
        field_x = null;
        field_J = null;
        if (!param0) {
            field_K = null;
        }
    }

    private final void c(byte param0) {
        ((p) this).field_Q.field_w = gm.field_d.field_s >= jj.field_c ? true : false;
        int var2 = -29 % ((-32 - param0) / 39);
    }

    private final int b(int param0, int param1) {
        if (!(((p) this).field_u == null)) {
            return ((p) this).field_u.b(param0, 19091, param1);
        }
        param1 -= 98;
        param0 -= 394;
        int var4 = ((189 + param0) * 3 + 560 + -(param1 * 4)) / 162;
        int var5 = (3 * param0 + param1 * 4) / 162;
        if (var4 >= 0) {
            if (var5 >= 0) {
                if (var4 < 7) {
                    if (var5 < 7) {
                        return 7 * var5 + var4;
                    }
                }
            }
        }
        return -1;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        for (var2 = 0; var2 < 49; var2++) {
            qj.field_c[var2] = null;
        }
        jj.field_c = 0;
        this.c((byte) 34);
    }

    private final void a(boolean param0, byte param1) {
        String var4 = null;
        int var5 = DungeonAssault.field_K;
        int var3 = 0;
        if (param1 > -3) {
            this.c((byte) 76);
        }
        while (var3 < 49) {
            if (null != qj.field_c[var3]) {
                break;
            }
            var3++;
        }
        if (!(var3 == 49)) {
            var4 = wj.field_x;
            if (!(gm.field_d.field_H)) {
                var4 = var4 + dh.field_c;
            }
            ((p) this).field_b = (kl) (Object) new lf(oa.field_h, var4);
            return;
        }
        if (!ed.c(true)) {
            if (!(gm.field_d.field_H)) {
                ac.field_B.d((byte) -106, 58);
            }
        }
        if (kn.field_g) {
            gd.a(g.field_Hb, 0, 5, param0);
            return;
        }
        gd.a(g.field_Hb, 0, g.field_Hb, param0);
    }

    private final void a(byte param0) {
        this.a(((p) this).field_w, dc.field_k, (byte) 125, ob.field_Kb, mm.field_s);
        this.a(((p) this).field_t, dc.field_k, (byte) 122, ob.field_Kb, cf.field_d);
        if (param0 > -65) {
            ((p) this).c();
        }
        if (!(gl.field_Lb != ((p) this).field_t.field_B)) {
            gl.field_Lb = !((p) this).field_t.field_B ? true : false;
            this.a(14);
        }
    }

    private final void b(int param0) {
        int discarded$0 = 400;
        rl.field_d = p.a(ri.field_d);
        int discarded$1 = 400;
        dm.field_a = p.a(i.field_r);
        int discarded$2 = 400;
        id.field_m = p.a(mc.field_w);
        int var2 = 390;
        int var3 = 300;
        bd.field_g = new cn(var2, var3);
        jh.a(bd.field_g);
        nb.field_d.a(0, 0, var2, var3);
        jh.b();
    }

    private final void e(int param0) {
        gd stackIn_1_0 = null;
        gd stackIn_2_0 = null;
        gd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gd stackOut_0_0 = null;
        gd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((p) this).b();
          ((p) this).field_R = new nn(true);
          ((p) this).field_M = new nn(false);
          hf.field_nb = new ed(8, 90, 180, 382);
          ((p) this).field_Q = tn.a(16, 12, (se) (Object) ne.field_c, jm.field_i, -124, lk.field_P);
          ((p) this).field_O = tn.a(472, 12, (se) (Object) ne.field_c, jm.field_i, -121, be.field_r.toUpperCase());
          ((p) this).field_A = sj.a(24, 87, 66, uj.field_c, ((p) this).field_M);
          ((p) this).field_L = sj.a(55, 96, 66, gd.field_E, ((p) this).field_M);
          ((p) this).field_C = sj.a(86, 110, 66, jj.field_b, ((p) this).field_M);
          ((p) this).field_P = sj.a(117, 87, 66, tb.field_c, ((p) this).field_M);
          ((p) this).field_y = sj.a(148, 91, 66, kd.field_f, ((p) this).field_M);
          ((p) this).field_p.a((ne) (Object) hf.field_nb, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_Q, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_O, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_A, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_L, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_C, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_P, false);
          ((p) this).field_p.a((ne) (Object) ((p) this).field_y, false);
          int discarded$5 = 30496;
          ((p) this).field_A.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w));
          int discarded$6 = 30496;
          ((p) this).field_L.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w));
          int discarded$7 = 30496;
          ((p) this).field_C.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w));
          int discarded$8 = 30496;
          ((p) this).field_P.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w));
          int discarded$9 = 30496;
          ((p) this).field_y.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w));
          ((p) this).field_O.field_n = (en) (Object) new e((String) null, pm.field_o, nk.field_Lb);
          ((p) this).field_Q.field_n = (en) (Object) new e((String) null, ud.field_u, oi.field_M);
          this.b((byte) 26);
          ((p) this).field_z = 0;
          ((p) this).field_s = false;
          ((p) this).field_M.a(((p) this).field_A, -256);
          this.a((byte) -124, 0);
          ((p) this).field_w = this.a(ob.field_Kb, mm.field_s, 491, -1, 438, dc.field_k);
          ((p) this).field_w.field_B = true;
          ((p) this).field_p.a((ne) (Object) ((p) this).field_w, false);
          ((p) this).field_t = this.a(ob.field_Kb, cf.field_d, 491, -1, 401, dc.field_k);
          stackOut_0_0 = ((p) this).field_t;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (gl.field_Lb) {
            stackOut_2_0 = (gd) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (gd) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_B = stackIn_3_1 != 0;
        ((p) this).field_p.a((ne) (Object) ((p) this).field_t, false);
        ((p) this).field_q = new sa(186, 401, 288, 71);
        ((p) this).field_q.a(true, f.field_c, (byte) 91, wh.field_c, 16777215);
    }

    private final void a(int param0) {
        ol.field_a = new cn[4];
        ol.field_a[0] = me.a(32, 14, 14, 0, 14);
        ol.field_a[1] = me.a(32, 14, 0, 14, 14);
        ol.field_a[2] = me.a(md.b(14, 46), 0, 14, 14, 14);
        ol.field_a[3] = me.a(32, 14, 14, 14, 0);
        if (!gl.field_Lb) {
            int discarded$0 = 400;
            ol.field_a = p.a(wk.a(ol.field_a, 0));
        }
        if (gl.field_Lb) {
            ((p) this).field_u = (cl) (Object) new sf((go) null, 350, 261);
        } else {
            ((p) this).field_u = null;
        }
        int discarded$1 = 59;
        jk.j();
    }

    final void c() {
        im.field_e = null;
        rl.field_d = null;
        dm.field_a = null;
        rd.field_x = null;
        jn.field_a = null;
        dm.field_f = null;
        ol.field_a = null;
        wm.field_c = null;
        bd.field_g = null;
        id.field_m = null;
        hh.field_r = null;
        bn.field_f = null;
        super.c();
        System.gc();
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (param0 >= 56) {
            break L0;
          } else {
            this.a(-105, -4, 26);
            break L0;
          }
        }
        L1: {
          if (~gm.field_d.field_s <= ~jj.field_c) {
            L2: {
              if (!ed.c(true)) {
                ac.field_B.d((byte) -127, 57);
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 49) {
                    break L2;
                  } else {
                    L4: {
                      if (0 == var2) {
                        break L4;
                      } else {
                        if (6 == var2) {
                          break L4;
                        } else {
                          if (var2 == 24) {
                            break L4;
                          } else {
                            if (var2 == 42) {
                              break L4;
                            } else {
                              if (var2 != 48) {
                                if (null == qj.field_c[var2]) {
                                  ac.field_B.a(6, 0);
                                  break L4;
                                } else {
                                  ac.field_B.a(6, qj.field_c[var2].field_a);
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L5: {
              if (jj.field_c > 0) {
                gm.field_d.field_s = gm.field_d.field_s - jj.field_c;
                break L5;
              } else {
                break L5;
              }
            }
            var4 = 0;
            var2 = var4;
            L6: while (true) {
              if (49 <= var4) {
                jj.field_c = 0;
                this.c((byte) -91);
                break L1;
              } else {
                L7: {
                  if (var4 == 0) {
                    break L7;
                  } else {
                    if (var4 == 6) {
                      break L7;
                    } else {
                      if (24 == var4) {
                        break L7;
                      } else {
                        if (var4 == 42) {
                          break L7;
                        } else {
                          if (var4 != 48) {
                            if (null != qj.field_c[var4]) {
                              gm.field_d.field_L[var4] = new ai(qj.field_c[var4].field_a);
                              gm.field_d.field_L[var4].field_c = qj.field_c[var4].field_c;
                              qj.field_c[var4] = null;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L6;
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, cn param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var20 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var20 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = 256;
              if (0 == gm.field_d.field_L[param2].field_a) {
                var6_int = 128;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = 10066329;
              var8 = var6_int * (192 - -((var7 & 16711680) >> 18)) / 255;
              var9 = (((var7 & 65280) >> 10) + 192) * var6_int / 255;
              var10 = (((var7 & 255) >> 2) + 192) * var6_int / 255;
              var11 = 0;
              var12 = (param4.field_A + param3) * gf.field_i + (param0 - -param4.field_w);
              var13 = -param4.field_y + gf.field_i;
              var15 = -param4.field_v;
              if (param1 > 54) {
                break L2;
              } else {
                this.a((gd) null, (String) null, (byte) -123, (String) null, (String) null);
                break L2;
              }
            }
            L3: while (true) {
              if (var15 >= 0) {
                break L0;
              } else {
                var14 = -param4.field_y;
                L4: while (true) {
                  if (var14 >= 0) {
                    var12 = var12 + var13;
                    var15++;
                    continue L3;
                  } else {
                    L5: {
                      var16 = param4.field_B[var11];
                      if (0 == var16) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var12++;
                    var11++;
                    var14++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("p.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        lb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          var13 = DungeonAssault.field_K;
          bd.field_g.h(-(bd.field_g.field_y >> 1) + param2 - -2, param1 + 12);
          var4 = gm.field_d;
          if (param0 == 8) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 > 140) {
            var5 = 0;
            L2: while (true) {
              if (var5 >= 7) {
                var5 = 7;
                L3: while (true) {
                  if (13 <= var5) {
                    return;
                  } else {
                    var6 = -((13 - var5) * 27) + param2;
                    var7 = param1 + var5 * 20;
                    var8 = 7 * var5 + -42;
                    var9 = 0;
                    L4: while (true) {
                      if (13 + -var5 <= var9) {
                        var5++;
                        continue L3;
                      } else {
                        L5: {
                          var10 = var4.field_k.a(var8 - -35, (byte) 86) ? 1 : 0;
                          var11 = 5;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            L6: {
                              var12 = 0;
                              if (var12 != 0) {
                                stackOut_40_0 = 1;
                                stackIn_41_0 = stackOut_40_0;
                                break L6;
                              } else {
                                stackOut_39_0 = 3;
                                stackIn_41_0 = stackOut_39_0;
                                break L6;
                              }
                            }
                            var11 = stackIn_41_0;
                            break L5;
                          }
                        }
                        L7: {
                          this.a(var6, 57, var8, 4 + var7, rl.field_d[var11]);
                          var10 = var4.field_k.a(var8 - var8 / 7, (byte) 110) ? 1 : 0;
                          var11 = 4;
                          if (var10 != 0) {
                            L8: {
                              var12 = 0;
                              if (var12 == 0) {
                                stackOut_46_0 = 2;
                                stackIn_47_0 = stackOut_46_0;
                                break L8;
                              } else {
                                stackOut_45_0 = 0;
                                stackIn_47_0 = stackOut_45_0;
                                break L8;
                              }
                            }
                            var11 = stackIn_47_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          this.a(27 + var6, 124, var8, var7 + 4, rl.field_d[var11]);
                          this.a(var7, var6, (byte) 127, var8);
                          if (0 == var9) {
                            if (var8 != 0) {
                              if (42 != var8) {
                                rl.field_d[4].h(var6, 20 + (4 + var7));
                                if (-var5 + 12 != var9) {
                                  break L9;
                                } else {
                                  if (42 == var8) {
                                    break L9;
                                  } else {
                                    if (var8 == 48) {
                                      break L9;
                                    } else {
                                      rl.field_d[5].h(27 + var6, 24 + var7);
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                if (-var5 + 12 != var9) {
                                  break L9;
                                } else {
                                  if (42 == var8) {
                                    break L9;
                                  } else {
                                    if (var8 == 48) {
                                      break L9;
                                    } else {
                                      rl.field_d[5].h(27 + var6, 24 + var7);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (-var5 + 12 != var9) {
                                break L9;
                              } else {
                                if (42 == var8) {
                                  break L9;
                                } else {
                                  if (var8 == 48) {
                                    break L9;
                                  } else {
                                    rl.field_d[5].h(27 + var6, 24 + var7);
                                    break L9;
                                  }
                                }
                              }
                            }
                          } else {
                            if (-var5 + 12 != var9) {
                              break L9;
                            } else {
                              if (42 == var8) {
                                break L9;
                              } else {
                                if (var8 == 48) {
                                  break L9;
                                } else {
                                  rl.field_d[5].h(27 + var6, 24 + var7);
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var8 += 8;
                        var6 += 54;
                        var9++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var6 = param2 - (1 + var5) * 27;
                var7 = 20 * var5 + param1;
                var8 = 6 + -var5;
                var9 = 0;
                L10: while (true) {
                  if (var9 >= 1 + var5) {
                    var5++;
                    continue L2;
                  } else {
                    L11: {
                      if (var9 != 0) {
                        L12: {
                          var10 = var4.field_k.a(35 + var8, (byte) 109) ? 1 : 0;
                          var11 = 5;
                          if (var10 == 0) {
                            break L12;
                          } else {
                            L13: {
                              var12 = 0;
                              if (var12 != 0) {
                                stackOut_16_0 = 1;
                                stackIn_17_0 = stackOut_16_0;
                                break L13;
                              } else {
                                stackOut_15_0 = 3;
                                stackIn_17_0 = stackOut_15_0;
                                break L13;
                              }
                            }
                            var11 = stackIn_17_0;
                            break L12;
                          }
                        }
                        this.a(var6, 97, var8, 4 + var7, rl.field_d[var11]);
                        break L11;
                      } else {
                        if (0 == var8) {
                          break L11;
                        } else {
                          if (var8 == 6) {
                            break L11;
                          } else {
                            this.a(var6, 92, var8, var7 - -4, rl.field_d[5]);
                            break L11;
                          }
                        }
                      }
                    }
                    L14: {
                      if (var5 != var9) {
                        L15: {
                          var10 = var4.field_k.a(var8 + -(var8 / 7), (byte) 125) ? 1 : 0;
                          var11 = 4;
                          if (var10 != 0) {
                            L16: {
                              var12 = 0;
                              if (var12 != 0) {
                                stackOut_28_0 = 0;
                                stackIn_29_0 = stackOut_28_0;
                                break L16;
                              } else {
                                stackOut_27_0 = 2;
                                stackIn_29_0 = stackOut_27_0;
                                break L16;
                              }
                            }
                            var11 = stackIn_29_0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        this.a(27 + var6, 110, var8, 4 + var7, rl.field_d[var11]);
                        break L14;
                      } else {
                        if (var8 == 6) {
                          break L14;
                        } else {
                          if (var8 != 48) {
                            this.a(27 + var6, 119, var8, var7 + 4, rl.field_d[4]);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    this.a(var7, var6, (byte) 127, var8);
                    var6 += 54;
                    var9++;
                    var8 += 8;
                    continue L10;
                  }
                }
              }
            }
          } else {
            gf.b(-(var5 * 4 / 3) + param2, var5 + 18 + param1, var5 * 8 / 3, 0);
            gf.b(param2 + -(var5 * 4 / 3), -var5 + 280 + param1 - -18, var5 * 8 / 3, 0);
            var5++;
            continue L1;
          }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        fk.a((byte) 121, lf.field_w);
        p.a(((p) this).field_e, 188, 48, 605, 400, 394, 220);
        jh.a(((p) this).field_e);
        p.b(8, 46, 180, 427, 16777215, 32, 128);
        h.a(false, 388, 15, true, 80);
        h.a(false, 426, 617, true, 46);
        p.a(8, 47, 172, 425, 256, 32, 8, 128);
        p.a(8, 8, 172, 32, 256, 64, 4, 128);
        p.a(460, 8, 172, 32, 256, 64, 4, 128);
        p.a(188, 8, 264, 32, 256, 64, 4, 128);
        ((p) this).field_E.b(12, 32, 320 + -(((p) this).field_E.field_i >> 1));
        ke.a(-116, 0, 480, 0);
        ke.a(48, 180, 480, 0);
        ke.a(-93, 605, 480, 48);
        jc.a(32, 452, 8, 1, 2, 1);
        ke.a(-112, -be.field_o.field_d + 640, 480, 0);
        c.a(0, 640, 0, (byte) 53);
        c.a(0, 640, 40, (byte) 91);
        c.a(0, 640, -bk.field_e.field_b + 480, (byte) 102);
        p.a(14, 55, 161, 36);
        p.b(188, 55, 418, 83, 8421504, 128, 128);
        p.a(188, 55, 418, 83, 256, 64, 4, 32);
        p.a(188, 55, 418, 11184810, 255, 128);
        p.a(188, 137, 418, 11184810, 255, 128);
        p.b(186, 400, 418, 87, 8421504, 32, 64);
        p.a(186, 399, 418, 0, 255, 128);
        p.a(186, 400, 418, 11184810, 255, 128);
        p.a(186, 402, 420, 70, 256, 64, 4, 32);
        p.a(484, 327, 144, 30);
        p.a(484, 364, 144, 30);
        p.a(484, 401, 144, 30);
        p.a(484, 438, 144, 30);
        jh.b();
        this.b(2798);
        jj.field_c = 0;
        qj.field_c = new ai[49];
        t.field_a = -1;
        bl.a((byte) 124);
        this.e(18239);
        this.a(14);
        ((p) this).field_H = null;
        ((p) this).field_N = new rh(204, 394, 80, 160, 16711680, 768, 249);
        ((p) this).field_I = new rh(600, 111, 80, 160, 16711680, 768, 249);
        qh.a(-13716, (rj) (Object) ((p) this).field_v[15], 18);
    }

    p() {
        ((p) this).field_E = new tf((se) (Object) ne.field_c, f.field_c, cm.field_M);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Please wait...";
        field_x = new int[8192];
        field_J = new String[]{null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability."};
        field_r = "Raids: ";
    }
}
