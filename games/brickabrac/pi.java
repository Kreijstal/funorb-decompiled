/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends wq {
    static jp field_t;
    private fo field_v;
    private int field_n;
    static String field_s;
    private int field_p;
    static int[] field_o;
    static lo field_r;
    static n field_u;
    static int field_q;

    final void p(int param0) {
        ((pi) this).field_k[((pi) this).field_l] = (byte) 0;
        ((pi) this).field_n = 8;
        if (param0 < 51) {
            ((pi) this).q(126);
        }
    }

    pi(byte[] param0) {
        super(param0);
    }

    final void a(int[] param0, int param1) {
        ((pi) this).field_v = new fo(param0);
        int var3 = -50 / ((param1 - 22) / 37);
    }

    public static void o(int param0) {
        field_t = null;
        field_o = null;
        if (param0 != 60) {
            field_s = null;
        }
        field_r = null;
        field_u = null;
        field_s = null;
    }

    pi(int param0) {
        super(param0);
    }

    final void n(int param0) {
        if (param0 > -74) {
            field_u = null;
        }
        ((pi) this).field_p = 8 * ((pi) this).field_l;
    }

    final void e(int param0, int param1) {
        ((pi) this).field_l = ((pi) this).field_l + 1;
        ((pi) this).field_k[((pi) this).field_l] = (byte)(param1 + ((pi) this).field_v.b(111));
        if (param0 != -13413) {
            ((pi) this).f((byte) -89);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, ak param4, int param5) {
        vo var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11_int = 0;
        kc var11 = null;
        vn var12 = null;
        ge var12_ref = null;
        int var12_int = 0;
        il var12_ref2 = null;
        ul var12_ref3 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        j var22 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        int stackOut_14_0;
        int stackOut_13_0;
        L0: {
          var21 = BrickABrac.field_J ? 1 : 0;
          var22 = param4.field_l[param1];
          var7 = var22.field_yb;
          var8 = var22.field_mb;
          var9 = var22.field_wb;
          lb.e(param5, param3, param5 - -(var8 / param2), var9 / param2 + param3);
          if (var22.field_z == null) {
            break L0;
          } else {
            jo.a(param2, var22, param1, param4, param5, 30, param3);
            break L0;
          }
        }
        L1: {
          if (0 == (var22.field_M ^ -1)) {
            break L1;
          } else {
            var10_double = (double)(500 - var22.field_M);
            var10_double = (var10_double / 666.0 + 1.0) * (var10_double / 10.0);
            var10_double = 30.0 * Math.sin(var10_double) + 60.0;
            lb.d(param5, param3, var8 / param2, var9 + -param2, 16724787, (int)var10_double);
            break L1;
          }
        }
        L2: {
          if (((param4.field_g | param4.field_i | param4.field_a) & 1 << param1) == 0) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        L3: {
          var10 = stackIn_7_0;
          if ((var22.field_Z ^ -1) != -3) {
            break L3;
          } else {
            if (var10 == 0) {
              var11_int = var22.field_gb.e(127);
              var12 = (vn) (Object) var22.field_gb.d(-7);
              L4: while (true) {
                if (var12 == null) {
                  var12 = (vn) (Object) var22.field_K.d(-76);
                  L5: while (true) {
                    if (var12 == null) {
                      var12_ref = (ge) (Object) var22.field_pb.d(-113);
                      L6: while (true) {
                        if (var12_ref == null) {
                          var12_ref2 = (il) (Object) var22.field_C.d(-20);
                          L7: while (true) {
                            if (var12_ref2 == null) {
                              break L3;
                            } else {
                              la.a((var12_ref2.field_j >> -32141084) / param2 + (param5 << -979222716), (var12_ref2.field_m >> 436903364) / param2 + (param3 << -1028288988), (var12_ref2.field_u >> -61160252) / param2, var12_ref2.field_v);
                              var12_ref2 = (il) (Object) var22.field_C.a((byte) 116);
                              continue L7;
                            }
                          }
                        } else {
                          we.field_b[var12_ref.field_i].c(param5 - -((var12_ref.field_j >> 1938908328) / param2), (var12_ref.field_m >> -1188504760) / param2 + param3);
                          var12_ref = (ge) (Object) var22.field_pb.a((byte) 116);
                          continue L6;
                        }
                      }
                    } else {
                      kq.a(var12, (byte) -119, param2, param5, param3);
                      var12 = (vn) (Object) var22.field_K.a((byte) 116);
                      continue L5;
                    }
                  }
                } else {
                  L8: {
                    var13 = var12.field_E.field_j;
                    if ((var12.field_C ^ -1) > -41) {
                      stackOut_14_0 = (18 - -var12.field_C) / (var11_int * 3);
                      stackIn_15_0 = stackOut_14_0;
                      break L8;
                    } else {
                      stackOut_13_0 = 19 / var11_int;
                      stackIn_15_0 = stackOut_13_0;
                      break L8;
                    }
                  }
                  var14 = stackIn_15_0;
                  var15 = (var12.field_C + 3) * 256 / (var12.field_C + 6);
                  var16 = var15 / (1 + var14);
                  var17 = var12.field_u;
                  var18 = 0;
                  L9: while (true) {
                    L10: {
                      if (var13 < 0) {
                        break L10;
                      } else {
                        if (var18 >= var14) {
                          break L10;
                        } else {
                          var19 = var12.field_E.b(var13, 1);
                          var20 = var12.field_y.b(var13, 1);
                          lb.a((param5 << -54573916) - -((var19 >> 1902718532) / param2), (var20 >> 1026956580) / param2 + (param3 << -402400252), var17 / param2 >> 640424932, var15, ag.field_M);
                          var15 = var15 - var16;
                          var17 = var17 * 252 >> 267109800;
                          var13--;
                          var18++;
                          continue L9;
                        }
                      }
                    }
                    L11: {
                      if (var12.field_C < 40) {
                        break L11;
                      } else {
                        al.a((var12.field_u >> -1587221048) / param2 + (param3 - -((var12.field_m >> -1872433112) / param2)), 40 / param2, 256, sa.a(100 * de.field_x, -4097) * 10 >> -1859638928, 123, 20 / param2, (var12.field_j >> -1384967320) / param2 + param5 - -((var12.field_u >> 332338248) / param2));
                        la.a((var12.field_j - -var12.field_u >> -1232886396) / param2 + (param5 << 1328849092), (param3 << 1064899236) - -((var12.field_m - -var12.field_u >> -1097388060) / param2), (var12.field_u >> -336467133) / param2, 4, 3, lj.field_n, var22.field_F / 5);
                        break L11;
                      }
                    }
                    kq.a(var12, (byte) -119, param2, param5, param3);
                    var12 = (vn) (Object) var22.field_gb.a((byte) 116);
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
        }
        L12: {
          L13: {
            if ((var22.field_Z ^ -1) == -3) {
              break L13;
            } else {
              if ((var22.field_Z ^ -1) == -5) {
                break L13;
              } else {
                if (var22.field_Z != 1) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
          }
          if (var10 != 0) {
            break L12;
          } else {
            oj.a(kb.a(param4, param1, 127, var22), var7, param2, param3, (byte) 107, var22, param5);
            break L12;
          }
        }
        var11 = (kc) (Object) var22.field_x.d(-30);
        L14: while (true) {
          if (var11 == null) {
            L15: {
              if (-2 != (param4.field_k ^ -1)) {
                break L15;
              } else {
                if (var22.field_Z == -2) {
                  L16: {
                    var12_int = 256;
                    if (-26 > var22.field_P) {
                      var12_int = var22.field_P * 256 / 25;
                      break L16;
                    } else {
                      if (-110 <= (var22.field_P ^ -1)) {
                        break L16;
                      } else {
                        var12_int = 125 - var22.field_P;
                        var12_int = var12_int * 256 / 15;
                        break L16;
                      }
                    }
                  }
                  lb.d(7, 280, 510, 45, 0, 96 * var12_int / 256);
                  w.field_r.b(7 - -((-w.field_r.field_D + 510) / 2), 260, var12_int);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L17: {
              if (3 == var22.field_Z) {
                ja.a((byte) -113, v.field_b, var8, var9, var22);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-6 == (var22.field_Z ^ -1)) {
                ja.a((byte) -104, jk.field_u, var8, var9, var22);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null != var22.field_w) {
                jg.a(param5, var22, var22.field_w, param2, 25, param3);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (var22.field_D == null) {
                break L20;
              } else {
                jg.a(param5, var22, var22.field_D, param2, 25, param3);
                break L20;
              }
            }
            var12_ref3 = (ul) (Object) var22.field_nb.d(-81);
            if (param0 >= 14) {
              L21: while (true) {
                if (var12_ref3 == null) {
                  L22: {
                    if (0 == (param4.field_a & 1 << param1)) {
                      break L22;
                    } else {
                      cp.a(param5, var8, var9, (byte) 126, var22, param3, param2);
                      break L22;
                    }
                  }
                  L23: {
                    if (0 == (1 << param1 & param4.field_g)) {
                      break L23;
                    } else {
                      bm.a(param5, param3, var9, var22, var8, param2, ci.field_s.toLowerCase(), (byte) 123);
                      break L23;
                    }
                  }
                  L24: {
                    if ((param4.field_i & 1 << param1) == 0) {
                      break L24;
                    } else {
                      bm.a(param5, param3, var9, var22, var8, param2, t.field_h.toLowerCase(), (byte) 76);
                      break L24;
                    }
                  }
                  lb.a();
                  return;
                } else {
                  cn.a(var12_ref3, var22, 10030, param5, param3);
                  var12_ref3 = (ul) (Object) var22.field_nb.a((byte) 116);
                  continue L21;
                }
              }
            } else {
              return;
            }
          } else {
            var11.a(param2, param5, param3, true);
            var11 = (kc) (Object) var22.field_x.a((byte) 116);
            continue L14;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        param2 = param2 & kk.field_g[param0];
        if (param1 != -17566) {
            ((pi) this).f((byte) 28);
        }
        while (((pi) this).field_n < param0) {
            param0 = param0 - ((pi) this).field_n;
            ((pi) this).field_l = ((pi) this).field_l + 1;
            ((pi) this).field_k[((pi) this).field_l] = (byte)(((pi) this).field_k[((pi) this).field_l] + (param2 >>> param0));
            ((pi) this).field_k[((pi) this).field_l] = (byte) 0;
            ((pi) this).field_n = 8;
        }
        if (((pi) this).field_n != param0) {
            ((pi) this).field_n = ((pi) this).field_n - param0;
            ((pi) this).field_k[((pi) this).field_l] = (byte)(((pi) this).field_k[((pi) this).field_l] + (param2 << ((pi) this).field_n));
        } else {
            ((pi) this).field_l = ((pi) this).field_l + 1;
            ((pi) this).field_k[((pi) this).field_l] = (byte)(((pi) this).field_k[((pi) this).field_l] + param2);
            ((pi) this).field_k[((pi) this).field_l] = (byte) 0;
            ((pi) this).field_n = 8;
        }
    }

    final int d(boolean param0) {
        if (!param0) {
            field_r = null;
        }
        ((pi) this).field_l = ((pi) this).field_l + 1;
        return 255 & ((pi) this).field_k[((pi) this).field_l] + -((pi) this).field_v.b(99);
    }

    final void f(byte param0) {
        ((pi) this).field_l = (((pi) this).field_p - -7) / 8;
        if (param0 < 69) {
            Object var3 = null;
            pi.a((jp) null, (pb) null, 39, 118, (byte) 103, -79);
        }
    }

    final void a(boolean param0, int param1, int param2, byte[] param3) {
        int var6 = BrickABrac.field_J ? 1 : 0;
        int var5 = 0;
        if (param0) {
            Object var7 = null;
            ((pi) this).a(true, 24, -63, (byte[]) null);
        }
        while (var5 < param2) {
            ((pi) this).field_l = ((pi) this).field_l + 1;
            param3[param1 + var5] = (byte)(((pi) this).field_k[((pi) this).field_l] + -((pi) this).field_v.b(126));
            var5++;
        }
    }

    final static void a(jp param0, pb param1, int param2, int param3, byte param4, int param5) {
        fc.a(-102, param1.field_p);
        lb.g(0, 0, param1.field_i, param1.field_q, hh.field_c[param2], 10792131);
        param0.c((param1.field_i + -param0.field_x) / 2, -(75 / param3) + -param0.field_z + (param5 + param1.field_q));
        sc.b(-102);
        if (param4 < 6) {
            pi.o(102);
        }
    }

    final int c(int param0, byte param1) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 84 % ((-27 - param1) / 58);
        int var3 = ((pi) this).field_p >> 2114969091;
        int var5 = -(7 & ((pi) this).field_p) + 8;
        int var6 = 0;
        ((pi) this).field_p = ((pi) this).field_p + param0;
        while (param0 > var5) {
            var3++;
            var6 = var6 + ((kk.field_g[var5] & ((pi) this).field_k[var3]) << param0 + -var5);
            param0 = param0 - var5;
            var5 = 8;
        }
        if (var5 == param0) {
            var6 = var6 + (((pi) this).field_k[var3] & kk.field_g[var5]);
        } else {
            var6 = var6 + (((pi) this).field_k[var3] >> -param0 + var5 & kk.field_g[param0]);
        }
        return var6;
    }

    final void q(int param0) {
        if (8 > ((pi) this).field_n) {
            ((pi) this).field_n = 8;
            ((pi) this).field_l = ((pi) this).field_l + 1;
        }
        int var2 = 53 % ((param0 - -14) / 35);
    }

    final static void a(int param0, String param1, long param2) {
        ng.field_b = 2;
        if (param0 != 21846) {
            return;
        }
        tk.field_p = param1;
        CharSequence var5 = (CharSequence) (Object) param1;
        kb.field_Qb = gb.a(var5, 96);
        qn.field_n = param2;
        di.a((byte) -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Unpacking sound effects";
        field_r = new lo();
        field_u = new n();
    }
}
