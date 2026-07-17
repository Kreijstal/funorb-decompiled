/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends qs {
    static kh field_G;
    private pf field_H;
    static String field_D;
    static int field_C;
    static String[] field_E;
    static int field_B;
    static String field_F;

    public tc() {
        super(0, 0, ep.field_a, ec.field_q, (iq) null, (ko) null);
        ((tc) this).field_H = new pf();
    }

    final void k(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= 77) {
            return;
        }
        on var2 = new on(((tc) this).field_H);
        w var3 = (w) (Object) var2.a(2);
        while (var3 != null) {
            var3.field_E = false;
            var3 = (w) (Object) var2.a((byte) 121);
        }
        ((tc) this).field_z = null;
    }

    final void i(int param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        on var2 = new on(((tc) this).field_H);
        w var3 = (w) (Object) var2.a(2);
        while (var3 != null) {
            if (!(!var3.a((byte) 92))) {
                var3.b((byte) -80);
            }
            var3 = (w) (Object) var2.a((byte) 125);
        }
        int var4 = 18 % ((46 - param0) / 54);
        ((tc) this).field_z = (vg) (Object) ((tc) this).g((byte) 115);
    }

    final w g(byte param0) {
        on var2 = null;
        w var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new on(((tc) this).field_H);
        var3 = (w) (Object) var2.a(2);
        var4 = 98 % ((param0 - 64) / 35);
        L0: while (true) {
          if (var3 != null) {
            if (var3.field_E) {
              return var3;
            } else {
              var3 = (w) (Object) var2.a((byte) 110);
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void f() {
        if (!hg.field_r) {
            if (!(ur.field_zb != null)) {
                int discarded$0 = 4;
                int discarded$1 = 88;
                ur.field_zb = vs.a();
            }
        }
        if (!h.field_q) {
            if (js.field_c == null) {
                js.field_c = hd.a(6, 109);
            }
            if (!(!js.field_c.field_l)) {
                if (!(js.field_c.field_o == null)) {
                    int discarded$2 = 30;
                    gg.a(js.field_c.field_o);
                }
                int discarded$8 = -69;
                ta.b();
                if (!(de.field_j != -1)) {
                    de.field_j = uc.field_A;
                }
                h.field_q = true;
            }
        }
    }

    final static kj a(String[] args, byte param1) {
        kj var2 = null;
        RuntimeException var2_ref = null;
        kj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_2_0 = null;
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
              if (param1 <= -63) {
                break L1;
              } else {
                field_B = 100;
                break L1;
              }
            }
            var2 = new kj(false);
            var2.field_d = args;
            stackOut_2_0 = (kj) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("tc.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
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
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -11857) {
            tc.e(false);
        }
        if (null != ((tc) this).field_p) {
            ((tc) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
        }
        on var5 = new on(((tc) this).field_H);
        vg var6 = (vg) (Object) var5.c(105);
        while (var6 != null) {
            var6.a(param0, -11857, ((tc) this).field_q + param2, param3 + ((tc) this).field_m);
            var6 = (vg) (Object) var5.b((byte) -124);
        }
    }

    final void a(boolean param0, vg param1) {
        w var3 = null;
        try {
            if (!(param1 instanceof w)) {
                throw new IllegalArgumentException();
            }
            var3 = (w) (Object) param1;
            ((tc) this).field_H.a((oh) (Object) var3, 0);
            var3.field_E = param0 ? true : false;
            boolean discarded$0 = var3.a((byte) 126, (vg) this);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "tc.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void h(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        on var2 = new on(((tc) this).field_H);
        int var4 = 71 % ((param0 - -34) / 44);
        w var3 = (w) (Object) var2.a(2);
        while (var3 != null) {
            if (var3.k(0)) {
                var3.b((byte) -101);
            }
            var3 = (w) (Object) var2.a((byte) 47);
        }
    }

    final static void a(int param0, ik param1, boolean param2, ik param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        L0: {
          var31 = ShatteredPlansClient.field_F ? 1 : 0;
          var4_int = param1.field_i;
          var5 = param3.field_i;
          var6 = param1.field_k;
          var7 = param3.field_k;
          var8 = var5 + -var4_int;
          var9 = -var6 + var7;
          var10 = var6 >> 4;
          var11 = 15 & var6;
          var12 = var7 >> 4;
          var14 = -78 % ((param0 - -15) / 37);
          var13 = 15 & var7;
          var15 = var4_int >> 4;
          var16 = var4_int & 15;
          var17 = var5 >> 4;
          var18 = 15 & var5;
          if (var10 == var12) {
            if (var15 == var17) {
              L1: {
                var19 = (var13 + -var11) * (var18 + var16) >> 1;
                var20 = (-var11 + var13) * 16;
                if (!param2) {
                  break L1;
                } else {
                  var19 = -var19;
                  var20 = -var20;
                  break L1;
                }
              }
              sq.a(var10, 0, 2147483647, var20, var15, -27259, var19);
              break L0;
            } else {
              if (0 <= var8) {
                L2: {
                  var19 = (-var16 + 16) * (-var16 + 16) * var9 / (var8 * 2);
                  var20 = (24 - var16) * var9 / var8;
                  var21 = var9 * 16 / var8;
                  var22 = -(var18 * var18 * var9 / (2 * var8)) + (var13 - var11) * 16;
                  var23 = (-var11 + var13) * 16;
                  if (!param2) {
                    break L2;
                  } else {
                    var21 = -var21;
                    var20 = -var20;
                    var22 = -var22;
                    var23 = -var23;
                    var19 = -var19;
                    break L2;
                  }
                }
                sq.a(var10, var21, var17 + -var15, var20, var15, -27259, var19);
                sq.a(var10, 0, 2147483647, var23, var17, -27259, var22);
                break L0;
              } else {
                L3: {
                  var19 = (16 - var18) * ((16 - var18) * -var9) / (var8 * 2);
                  var20 = (24 - var18) * -var9 / var8;
                  var21 = 16 * -var9 / var8;
                  var22 = 16 * (-var11 + var13) - var16 * var16 * -var9 / (var8 * 2);
                  var23 = (-var11 + var13) * 16;
                  if (!param2) {
                    break L3;
                  } else {
                    var19 = -var19;
                    var20 = -var20;
                    var22 = -var22;
                    var21 = -var21;
                    var23 = -var23;
                    break L3;
                  }
                }
                sq.a(var10, var21, -var17 + var15, var20, var17, -27259, var19);
                sq.a(var10, 0, 2147483647, var23, var15, -27259, var22);
                break L0;
              }
            }
          } else {
            L4: {
              var19 = var8 * (-var11 + 16) / var9 + var4_int;
              var20 = var19 >> 4;
              var21 = 15 & var19;
              if (var20 == var15) {
                L5: {
                  var22 = (-var11 + 16) * (32 + -var16 + -var21) / 2;
                  var23 = -(16 * var11) + 256;
                  if (!param2) {
                    break L5;
                  } else {
                    var23 = -var23;
                    var22 = -var22;
                    break L5;
                  }
                }
                sq.a(var10, 0, 2147483647, var23, var15, -27259, var22);
                break L4;
              } else {
                if (var8 >= 0) {
                  L6: {
                    var22 = var9 * (-var16 + 16) * (16 - var16) / (2 * var8);
                    var23 = 16 * ((-var16 + 24) * var9) / var8;
                    var24 = (-(16 * var9) + 256) / var8;
                    var25 = 16 * (16 + -var11) + -(var21 * var21 * var9 / (2 * var8));
                    var26 = 256 - var11 * 16;
                    if (param2) {
                      var22 = -var22;
                      var25 = -var25;
                      var24 = -var24;
                      var26 = -var26;
                      var23 = -var23;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  sq.a(var10, var24, var20 - var15, var23, var15, -27259, var22);
                  sq.a(var10, 0, 2147483647, var26, var20, -27259, var25);
                  break L4;
                } else {
                  L7: {
                    var22 = -var9 * ((-var21 + 16) * (-var21 + 16)) / (var8 * 2);
                    var23 = (-var21 + 24) * (16 * -var9) / var8;
                    var24 = -var9 * 256 / var8;
                    var25 = 16 * (-var11 + 16) - -(var16 * var16 * var9 / (var8 * 2));
                    var26 = -(var11 * 16) + 256;
                    if (param2) {
                      var26 = -var26;
                      var22 = -var22;
                      var24 = -var24;
                      var23 = -var23;
                      var25 = -var25;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  sq.a(var10, var24, -var20 + var15, var23, var20, -27259, var22);
                  sq.a(var10, 0, 2147483647, var26, var15, -27259, var25);
                  break L4;
                }
              }
            }
            var22 = 1 + var10;
            L8: while (true) {
              if (var12 <= var22) {
                var19 = var5 - var8 * var13 / var9;
                var21 = 15 & var19;
                var20 = var19 >> 4;
                if (var17 != var20) {
                  if (var8 < 0) {
                    L9: {
                      var22 = (-var18 + 16) * ((-var18 + 16) * -var9) / (var8 * 2);
                      var23 = 16 * ((24 - var18) * -var9) / var8;
                      var24 = -var9 * 256 / var8;
                      var25 = -(-var9 * (var21 * var21) / (var8 * 2)) + 16 * var13;
                      var26 = var13 * 16;
                      if (param2) {
                        var24 = -var24;
                        var25 = -var25;
                        var26 = -var26;
                        var22 = -var22;
                        var23 = -var23;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    sq.a(var12, var24, -var17 + var20, var23, var17, -27259, var22);
                    sq.a(var12, 0, 2147483647, var26, var20, -27259, var25);
                    break L0;
                  } else {
                    L10: {
                      var22 = (-var21 + 16) * (16 + -var21) * var9 / (var8 * 2);
                      var23 = var9 * 16 * (-var21 + 24) / var8;
                      var24 = var9 * 256 / var8;
                      var25 = 16 * var13 - var9 * var18 * var18 / (2 * var8);
                      var26 = var13 * 16;
                      if (param2) {
                        var24 = -var24;
                        var23 = -var23;
                        var25 = -var25;
                        var22 = -var22;
                        var26 = -var26;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    sq.a(var12, var24, var17 - var20, var23, var20, -27259, var22);
                    sq.a(var12, 0, 2147483647, var26, var17, -27259, var25);
                    break L0;
                  }
                } else {
                  L11: {
                    var22 = (32 - (var18 - -var21)) * var13 / 2;
                    var23 = 16 * var13;
                    if (param2) {
                      var22 = -var22;
                      var23 = -var23;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  sq.a(var12, 0, 2147483647, var23, var17, -27259, var22);
                  break L0;
                }
              } else {
                L12: {
                  var23 = var4_int + var8 * (16 * (-var10 + var22) - (-16 + var11)) / var9;
                  var24 = var23 >> 4;
                  var25 = var23 & 15;
                  if (var24 != var20) {
                    if (var8 < 0) {
                      L13: {
                        var26 = (-var25 + 16) * (-var25 + 16) * -var9 / (var8 * 2);
                        var27 = -var9 * (-(var25 * 16) + 384) / var8;
                        var28 = 256 * -var9 / var8;
                        var29 = 256 - var21 * (var21 * -var9) / (var8 * 2);
                        var30 = 256;
                        if (!param2) {
                          break L13;
                        } else {
                          var29 = -var29;
                          var27 = -var27;
                          var30 = -var30;
                          var26 = -var26;
                          var28 = -var28;
                          break L13;
                        }
                      }
                      sq.a(var22, var28, var20 - var24, var27, var24, -27259, var26);
                      sq.a(var22, 0, 2147483647, var30, var20, -27259, var29);
                      break L12;
                    } else {
                      L14: {
                        var26 = var9 * (16 - var21) * (-var21 + 16) / (var8 * 2);
                        var27 = (-var21 + 24) * (16 * var9) / var8;
                        var28 = 256 * var9 / var8;
                        var29 = -(var25 * var25 * var9 / (var8 * 2)) + 256;
                        var30 = 256;
                        if (!param2) {
                          break L14;
                        } else {
                          var28 = -var28;
                          var30 = -var30;
                          var27 = -var27;
                          var26 = -var26;
                          var29 = -var29;
                          break L14;
                        }
                      }
                      sq.a(var22, var28, var24 - var20, var27, var20, -27259, var26);
                      sq.a(var22, 0, 2147483647, var30, var24, -27259, var29);
                      break L12;
                    }
                  } else {
                    L15: {
                      var26 = 8 * (-var21 + 32 - var25);
                      var27 = 256;
                      if (!param2) {
                        break L15;
                      } else {
                        var27 = -var27;
                        var26 = -var26;
                        break L15;
                      }
                    }
                    sq.a(var22, 0, 2147483647, var27, var20, -27259, var26);
                    break L12;
                  }
                }
                var19 = var23;
                var21 = var25;
                var20 = var24;
                var22++;
                continue L8;
              }
            }
          }
        }
    }

    final vg a(int param0) {
        on var2 = null;
        w var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new on(((tc) this).field_H);
        var3 = (w) (Object) var2.a(param0);
        L0: while (true) {
          if (var3 != null) {
            if (var3.field_E) {
              return var3.i(param0 ^ 3);
            } else {
              var3 = (w) (Object) var2.a((byte) 115);
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        n.field_h = !param1 ? new wh(jo.field_c, so.field_t) : new wh(ve.field_yb, oh.field_c);
        am.field_xb = new qr(0L, (qr) null);
        am.field_xb.a(4, (qr) (Object) n.field_h.field_d);
        am.field_xb.a(4, i.field_g);
        ed.field_d = new qr(0L, ho.field_j);
        jo.field_a = new qr(0L, (qr) null);
        ed.field_d.a(4, hl.field_K);
        ed.field_d.a(4, jo.field_a);
        jo.field_a.a(4, lp.field_v);
        jo.field_a.a(4, oo.field_c);
        en.a(15471, param1);
    }

    final static void a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            int discarded$2 = 13;
            ql.a((byte) 50, qk.a(param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tc.S(").append(23).append(44);
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
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    public static void e(boolean param0) {
        field_E = null;
        field_F = null;
        field_D = null;
        field_G = null;
        if (!param0) {
            field_F = null;
        }
    }

    final static boolean a(char param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (160 == param0) {
              break L1;
            } else {
              if (param0 == 32) {
                break L1;
              } else {
                if (95 == param0) {
                  break L1;
                } else {
                  if (param0 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void j(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        qr stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        qr stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        qr stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        qr stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        qr stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        qr stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_9_0 = 0;
        qr stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        qr stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        qr stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        qr stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        qr stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        qr stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          el.field_c = gf.field_k;
          kh.field_Mb = gf.field_b;
          int discarded$2 = 438;
          nj.a();
          bc.field_g.a(0, ia.field_j.field_mb + -42, (byte) 95, ia.field_j.field_K, 0);
          nm.field_c.a(cp.field_a.field_K, cr.field_c, (byte) 76, 0, 0);
          var1 = cr.field_c - -2;
          stackOut_0_0 = lp.field_v;
          stackOut_0_1 = cp.field_a.field_K;
          stackOut_0_2 = cp.field_a.field_mb;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (ns.field_pb) {
            stackOut_2_0 = (qr) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = var1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (qr) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (qr) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2 + -stackIn_3_3;
          stackOut_3_3 = 105;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (ns.field_pb) {
            stackOut_5_0 = (qr) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = var1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            break L1;
          } else {
            stackOut_4_0 = (qr) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        L2: {
          ((qr) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, (byte) stackIn_6_3, stackIn_6_4, 0);
          int discarded$3 = 18;
          p.d();
          vm.field_Ab.a(ia.field_j.field_K, 40, (byte) 41, -40 + ia.field_j.field_mb, 0);
          sg.field_zb.a(se.field_i.field_K, 30, (byte) 72, 0, 0);
          qf.field_e.a(se.field_i.field_K, -40 + se.field_i.field_mb + -32, (byte) 48, 30, 0);
          vn.field_y.a(68, 30, (byte) 64, 5, 5);
          km.field_e.a(78, 30, (byte) 42, 5, 75);
          mc.field_t.a(48, 30, (byte) 61, 5, 155);
          ta.field_d.a(48, 30, (byte) 39, 5, 205);
          if (ns.field_pb) {
            stackOut_8_0 = 250;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 200;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          ea.field_c.a(363 + -var2, 30, (byte) 95, 5, var2 + 5);
          hq.field_b.a(-5 + se.field_i.field_K - 370, 30, (byte) 53, 5, 370);
          qs.field_y.a(-5 + qf.field_e.field_K + -5, 37, 5, 2, -125, -5 + (qf.field_e.field_mb + -32) - 5, pe.field_K);
          if (param0 >= 93) {
            break L3;
          } else {
            field_C = -10;
            break L3;
          }
        }
        L4: {
          var3 = (2 + se.field_i.field_K) / 2;
          gb.field_m.a(-2 + var3, 40, (byte) 114, -40 + se.field_i.field_mb, 0);
          if (!ns.field_pb) {
            var3 = 0;
            break L4;
          } else {
            break L4;
          }
        }
        rq.field_b.a(se.field_i.field_K + -var3, 40, (byte) 85, -40 + se.field_i.field_mb, var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Average fleet move size";
        field_E = new String[]{"Destroy all opposition to reign supreme.", "Capture and hold Sol to earn points. Most points after 20 turns wins.", "Capture and hold systems to earn points.", "Capture derelict alien ships and research their secrets."};
        field_B = 0;
        field_F = "Playing";
    }
}
