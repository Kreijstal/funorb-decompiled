/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends o {
    static String field_v;
    static String field_x;
    static bi field_y;
    static int field_t;
    static int field_B;
    static qr field_w;
    private wk field_z;
    static String field_A;
    static nq field_u;
    private wk[] field_C;

    final static void a(int param0, int param1, boolean param2, int param3) {
        es.field_n = param3;
        ah.field_P = param1;
        rm.field_b = param0;
        if (param2) {
            field_w = null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        Object var5 = null;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          if (param1 == -9861) {
            break L0;
          } else {
            var5 = null;
            vm discarded$2 = gn.a(122, (si) null, (qr) null, (qr) null, (qr) null);
            break L0;
          }
        }
        L1: {
          if (bq.field_h == null) {
            break L1;
          } else {
            if (13 != oq.field_j) {
              break L1;
            } else {
              bq.field_h = null;
              return true;
            }
          }
        }
        if (sr.field_h) {
          if (!b.d((byte) -97)) {
            return false;
          } else {
            L2: {
              if (!le.a(param0, param2, false)) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var4 = stackIn_22_0;
                if (80 == oq.field_j) {
                  break L4;
                } else {
                  if (-85 != (oq.field_j ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = 1;
              sr.field_h = false;
              break L3;
            }
            L5: {
              if ((oq.field_j ^ -1) != -14) {
                break L5;
              } else {
                qq.c(false);
                var4 = 1;
                sr.field_h = false;
                break L5;
              }
            }
            return var4 != 0;
          }
        } else {
          L6: {
            if (dp.field_t) {
              break L6;
            } else {
              if (oq.field_j == 9) {
                break L6;
              } else {
                if (-11 == oq.field_j) {
                  break L6;
                } else {
                  if (-12 != oq.field_j) {
                    L7: {
                      if ((oq.field_j ^ -1) != -81) {
                        break L7;
                      } else {
                        if (!b.d((byte) 108)) {
                          break L7;
                        } else {
                          sr.field_h = true;
                          return true;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          return dp.a(param1 ^ 9952, param0, param3);
        }
    }

    private final void a(gn param0, boolean param1, int param2) {
        int var4 = 0;
        wk var5 = null;
        wk var6 = null;
        int var7 = 0;
        wk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wk stackIn_11_2 = null;
        wk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wk stackOut_10_2 = null;
        wk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wk stackOut_9_2 = null;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          super.a((o) (Object) param0, (byte) 42);
          if (param2 == -21979) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        L1: {
          if (param1) {
            var4 = 0;
            L2: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = ((gn) this).field_C[var4];
                if (var5 != null) {
                  L3: {
                    var6 = param0.field_C[var4];
                    stackOut_8_0 = (wk) var5;
                    stackOut_8_1 = 42;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var6 == null) {
                      param0.field_C[var4] = new wk();
                      stackOut_10_0 = (wk) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = new wk();
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_9_0 = (wk) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (wk) var6;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  ((wk) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
                  var4++;
                  continue L2;
                } else {
                  param0.field_C[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            ps.a((Object[]) (Object) ((gn) this).field_C, 0, (Object[]) (Object) param0.field_C, 0, 6);
            break L1;
          }
        }
    }

    final void a(int param0, bi param1) {
        wk[] var3 = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -12) {
            break L0;
          } else {
            gn.b(true);
            break L0;
          }
        }
        var7 = ((gn) this).field_C;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final wk a(int param0, int param1) {
        int var3 = -79 % ((param0 - -42) / 59);
        ((gn) this).field_C[param1] = new wk();
        return new wk();
    }

    public gn() {
        ((gn) this).field_C = new wk[6];
        ((gn) this).field_z = new wk();
        ((gn) this).field_C[0] = new wk();
        wk var1 = new wk();
        var1.a(false);
    }

    gn(gn param0, boolean param1) {
        this();
        param0.a((gn) this, param1, -21979);
    }

    public static void b(boolean param0) {
        field_u = null;
        field_v = null;
        field_w = null;
        field_A = null;
        field_x = null;
        if (!param0) {
            Object var2 = null;
            vm discarded$0 = gn.a(-46, (si) null, (qr) null, (qr) null, (qr) null);
        }
        field_y = null;
    }

    final static vm a(int param0, si param1, qr param2, qr param3, qr param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        vm[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        si var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        dp var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != null) {
          L0: {
            if (param1.field_r != null) {
              stackOut_4_0 = param1.field_r.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null == param1.field_x) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param1.field_x.length;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var6 = stackIn_8_0;
          var7 = var5 - -var6;
          var8 = new String[var7];
          if (param0 == 0) {
            L2: {
              var25 = new char[var7];
              var23 = var25;
              var21 = var23;
              var19 = var21;
              var9 = var19;
              var24 = new int[var7];
              var22 = var24;
              var20 = var22;
              var18 = var20;
              var10 = var18;
              var11 = new vm[var7];
              if (param1.field_r == null) {
                break L2;
              } else {
                var12 = 0;
                L3: while (true) {
                  if (var12 >= param1.field_r.length) {
                    break L2;
                  } else {
                    var13_ref = kq.field_A.a(param1.field_r[var12], (byte) 100);
                    var8[var12] = var13_ref.field_t;
                    var9[var12] = param1.field_p[var12];
                    var11[var12] = gn.a(param0 + 0, var13_ref, param2, param3, param4);
                    var12++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (null != param1.field_x) {
                var12 = var5;
                var13 = 49;
                var14 = 0;
                L5: while (true) {
                  if (var14 >= param1.field_x.length) {
                    break L4;
                  } else {
                    var15 = param1.field_x[var14];
                    if (-1 == var15) {
                      var8[var12 - -var14] = qh.field_u;
                      var9[var12 + var14] = param1.field_s[var14];
                      var10[var14 + var12] = param1.field_x[var14];
                      var14++;
                      continue L5;
                    } else {
                      L6: {
                        var16 = dh.field_c.a((byte) 47, var15);
                        var8[var14 + var12] = var16.f(80);
                        var9[var12 + var14] = param1.field_s[var14];
                        if (0 < var9[var12 + var14]) {
                          break L6;
                        } else {
                          var13 = (char)(var13 + 1);
                          var9[var14 + var12] = (char)var13;
                          break L6;
                        }
                      }
                      var10[var12 + var14] = param1.field_x[var14];
                      var14++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            return new vm(0L, param2, param4, param3, var11, var24, var8, var25);
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, bi[] param1) {
        wk[] var3 = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var7 = ((gn) this).field_C;
          var3 = var7;
          if (param0 == 8) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_h = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(bi[] param0, int param1, int param2) {
        int var4 = param1;
        if (param2 != 3) {
            field_x = null;
        }
        if (!(((gn) this).field_C[var4] != null)) {
            ((gn) this).field_C[var4] = new wk();
        }
        ((gn) this).field_C[param1].field_h = param0;
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        wk var7 = null;
        wk var9 = null;
        Object var10 = null;
        kg var11 = null;
        wk var12 = null;
        wk var13 = null;
        wk var14 = null;
        wk var15 = null;
        vg stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        vg stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof kg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (vg) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (kg) (Object) stackIn_3_0;
          ke.a(-6187, param0.field_x + (param1 + param0.field_m), param0.field_n + param0.field_q + param3, param0.field_q + param3, param1 - -param0.field_m);
          if (var11 == null) {
            break L1;
          } else {
            param2 = param2 & var11.field_y;
            break L1;
          }
        }
        L2: {
          var7 = ((gn) this).field_C[0];
          ((gn) this).field_z.a(false);
          var7.a(param0, ((gn) this).field_z, (gn) this, param1, 0, param3);
          if (var11 == null) {
            break L2;
          } else {
            L3: {
              if (var11.field_z) {
                var12 = ((gn) this).field_C[1];
                if (var12 == null) {
                  break L3;
                } else {
                  var12.a(param0, ((gn) this).field_z, (gn) this, param1, param4 ^ 12, param3);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (var11.field_k) {
              L4: {
                var13 = ((gn) this).field_C[3];
                if (0 == var11.field_o) {
                  break L4;
                } else {
                  if (var13 == null) {
                    break L4;
                  } else {
                    var13.a(param0, ((gn) this).field_z, (gn) this, param1, param4 + -12, param3);
                    break L2;
                  }
                }
              }
              var9 = ((gn) this).field_C[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(param0, ((gn) this).field_z, (gn) this, param1, param4 ^ 12, param3);
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L5: {
          if (param0.f(1)) {
            var14 = ((gn) this).field_C[5];
            if (var14 != null) {
              var14.a(param0, ((gn) this).field_z, (gn) this, param1, 0, param3);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (!param2) {
            var15 = ((gn) this).field_C[4];
            if (var15 == null) {
              break L6;
            } else {
              var15.a(param0, ((gn) this).field_z, (gn) this, param1, 0, param3);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          ((gn) this).field_z.a(param1, true, param0, param3, (gn) this);
          ln.f((byte) 124);
          if (param4 == 12) {
            break L7;
          } else {
            var10 = null;
            ((gn) this).a(100, (bi) null);
            break L7;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Click to accept the Non-Agression Pact <%0> is offering.";
        field_B = 0;
        field_v = "Try this now, or press <col=2F5FBF>'ENTER'</col> to continue.";
        field_A = "Hide game chat";
        field_t = 0;
    }
}
