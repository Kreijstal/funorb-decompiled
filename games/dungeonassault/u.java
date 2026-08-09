/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends gd {
    static ad field_U;
    static cf[] field_T;
    static int field_P;
    static String field_S;
    h field_Q;
    static boolean field_O;
    static String field_R;

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
          if (param0 == 0) {
            if (0 != param1) {
              if (-1 < (param1 ^ -1)) {
                return -2048;
              } else {
                return 2048;
              }
            } else {
              return 0;
            }
          } else {
            if (param0 < 0) {
              if (0 != param1) {
                if (-1 >= (param1 ^ -1)) {
                  return -d.a(-81, -param0, param1) + 4096;
                } else {
                  return d.a(-89, -param0, -param1) - 4096;
                }
              } else {
                return 4096;
              }
            } else {
              if (0 != param1) {
                if (-1 >= (param1 ^ -1)) {
                  return d.a(-103, param0, param1);
                } else {
                  return -d.a(-120, param0, -param1);
                }
              } else {
                return 0;
              }
            }
          }
        } else {
          return 117;
        }
    }

    u(int param0, int param1, h param2) {
        super(param0, param1, 0, 0, 0);
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        gp stackIn_17_0 = null;
        String stackIn_17_1 = null;
        gp stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_3;
        int stackIn_21_3;
        int stackIn_21_4;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        int var15 = 0;
        cn var16 = null;
        cn var17 = null;
        String var19 = null;
        try {
          L0: {
            L1: {
              this.field_Q = param2;
              var19 = this.field_Q.field_F;
              var4 = var19;
              var5 = ib.a(this.field_Q, 918);
              var6 = jn.a(var19, new int[]{140, 88}, -78, db.field_v);
              var7 = var6.length * db.field_v.field_H - -la.field_b.field_H - -42;
              if (0 >= pb.field_G) {
                if (0 != (1 & this.field_Q.field_x)) {
                  stackIn_7_0 = 1;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              } else {
                stackIn_7_0 = 0;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_7_0;
              if (0 == gm.field_d.field_e) {
                if (0 != (this.field_Q.field_x & 2)) {
                  stackIn_13_0 = 1;
                  break L2;
                } else {
                  stackIn_13_0 = 0;
                  break L2;
                }
              } else {
                stackIn_13_0 = 0;
                break L2;
              }
            }
            var9 = stackIn_13_0;
            var10 = var8 | var9;
            var11 = new cn(140, var7);
            var12 = new cn(140, var7);
            var13 = new cn(140, var7);
            jh.a(var11);
            gf.a();
            var14 = 0;
            var15 = 0;
            L3: while (true) {
              if (var6.length <= var15) {
                L4: {
                  var14 = var14 + (la.field_b.field_H - -2);
                  if (var8 == 0) {
                    if (var9 == 0) {
                      la.field_b.b(jk.a(new String[]{Integer.toString(var5 / 10)}, n.field_a, 30496), 52, var14, 12632256, -1);
                      break L4;
                    } else {
                      la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                      break L4;
                    }
                  } else {
                    la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                    break L4;
                  }
                }
                var14 += 4;
                var12.e();
                var15 = -45 + var7;
                gf.a();
                var11.e(0, 0, 16744448);
                gk.a(52, this.field_Q, 95, 16744448, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var13.e();
                gf.a();
                var11.e(0, 0, 12690143);
                gk.a(52, this.field_Q, 118, 10449103, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var11.e();
                gk.a(52, this.field_Q, 115, 12632256, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                jh.b();
                var16 = rb.a(16, var12, 255, (byte) 99);
                var17 = rb.a(16, var12, 16711680, (byte) -128);
                this.a(var12, var11, var17, var13, (byte) 106, var16);
                this.field_n = (en) ((Object) new fc(this.field_Q));
                if (var10 != 0) {
                  this.field_w = false;
                  break L0;
                } else {
                  return;
                }
              } else {
                L5: {
                  var14 = var14 + la.field_b.field_H;
                  stackIn_17_0 = la.field_b;

                  stackIn_17_1 = var6[var15];

                  if ((var15 ^ -1) != -1) {
                    stackIn_18_0 = (gp) ((Object) stackIn_17_0);
                    stackIn_18_1 = (String) ((Object) stackIn_17_1);
                    stackIn_18_2 = la.field_b.field_H;
                    break L5;
                  } else {
                    stackIn_18_0 = (gp) ((Object) stackIn_17_0);
                    stackIn_18_1 = (String) ((Object) stackIn_17_1);
                    stackIn_18_2 = 0;
                    break L5;
                  }
                }
                L6: {






                  stackIn_20_3 = var14;

                  if (var10 == 0) {
                    stackIn_18_0 = (gp) ((Object) stackIn_18_0);
                    stackIn_18_1 = (String) ((Object) stackIn_18_1);

                    stackIn_21_3 = stackIn_20_3;
                    stackIn_21_4 = 16760832;
                    break L6;
                  } else {
                    stackIn_18_0 = (gp) ((Object) stackIn_18_0);
                    stackIn_18_1 = (String) ((Object) stackIn_18_1);

                    stackIn_21_3 = stackIn_20_3;
                    stackIn_21_4 = 8421504;
                    break L6;
                  }
                }
                ((gp) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_18_2, stackIn_21_3, stackIn_21_4, -1);
                var15++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("u.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final static void a(int param0, lb param1) {
        int var2_int = 0;
        eh var3 = null;
        int var4 = 0;
        eh stackIn_15_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (um.field_i != null) {
                break L1;
              } else {
                um.field_i = new hb[8];
                break L1;
              }
            }
            if (param0 == 1) {
              var2_int = 0;
              L2: while (true) {
                if (8 <= var2_int) {
                  ho.b((byte) -36);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (param1 == null) {
                        break L4;
                      } else {
                        if (um.field_i[var2_int] == param1.field_a[var2_int]) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    um.field_i[var2_int] = gm.field_d.field_a[var2_int];
                    if (null != um.field_i[var2_int]) {
                      L5: {
                        if (255 != um.field_i[var2_int].field_p) {
                          stackIn_15_0 = um.field_i[var2_int].field_n.field_e;
                          break L5;
                        } else {
                          stackIn_15_0 = k.field_c;
                          break L5;
                        }
                      }
                      var3 = stackIn_15_0;
                      um.field_i[var2_int].field_b = new wd(var3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var2_int++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("u.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        cn stackIn_12_0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        cn var8;
        int var9;
        int var10;
        cn var13;
        var4 = -3 + this.field_t - -param0;
        var5 = -3 + (param2 + this.field_i);
        var6 = this.field_q + var4 + 5;
        var7 = this.field_x + var5 - -5;
        if (var4 <= gf.field_h) {
          if (gf.field_e >= var5) {
            if (gf.field_j <= var6) {
              if (gf.field_f <= var7) {
                L0: {
                  gf.b(var4, var5, 5 + this.field_q, this.field_x + 5, 0, 128);
                  super.b(param0, param1, param2);
                  if (null != this.field_Q.field_e) {
                    stackIn_12_0 = this.field_Q.field_e.a(40, 0, 40, 0);
                    break L0;
                  } else {
                    stackIn_12_0 = null;
                    break L0;
                  }
                }
                var13 = stackIn_12_0;
                var8 = var13;
                var9 = this.field_x + var5 + -2 - 40;
                var10 = 5 + var4;
                if (var13 == null) {
                  gf.b(var10, var9, 32, 32, 0);
                  return;
                } else {
                  var13.c(var10, var9);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static String a(se param0, byte param1, String param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = 106 % ((-21 - param1) / 43);
            stackIn_1_0 = ia.a(param5, param0, an.a(param4, (byte) -109, param3, param2), 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("u.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    public static void c(byte param0) {
        field_R = null;
        field_S = null;
        field_T = null;
        int var1 = 52 / ((param0 - 30) / 54);
        field_U = null;
    }

    static {
        field_S = "<col=8B1717>Disarm</col>";
        field_U = new ad(7, 0, 1, 1);
        field_R = "Monster attacks.";
    }
}
