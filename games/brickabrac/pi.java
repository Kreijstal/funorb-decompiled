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
        this.field_k[this.field_l] = (byte) 0;
        this.field_n = 8;
        if (param0 < 51) {
            this.q(126);
        }
    }

    pi(byte[] param0) {
        super(param0);
    }

    final void a(int[] param0, int param1) {
        try {
            this.field_v = new fo(param0);
            int var3_int = -50 / ((param1 - 22) / 37);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "pi.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void o(int param0) {
        field_t = null;
        field_o = null;
        if (param0 != 60) {
            field_s = (String) null;
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
            field_u = (n) null;
        }
        this.field_p = 8 * this.field_l;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 + this.field_v.b(111));
        if (param0 != -13413) {
            this.f((byte) -89);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, ak param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        vo var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        vn var12_ref_vn = null;
        ge var12_ref_ge = null;
        il var12_ref_il = null;
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
        Object var22 = null;
        Object var23 = null;
        j var24 = null;
        Object var25 = null;
        vn var26 = null;
        kc var27 = null;
        ul var28 = null;
        var22 = null;
        var23 = null;
        var25 = null;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var24 = param4.field_l[param1];
              var7 = var24.field_yb;
              var8 = var24.field_mb;
              var9 = var24.field_wb;
              lb.e(param5, param3, param5 - -(var8 / param2), var9 / param2 + param3);
              if (var24.field_z == null) {
                break L1;
              } else {
                jo.a(param2, var24, param1, param4, param5, 30, param3);
                break L1;
              }
            }
            L2: {
              if (0 == (var24.field_M ^ -1)) {
                break L2;
              } else {
                var10_double = (double)(500 - var24.field_M);
                var10_double = (var10_double / 666.0 + 1.0) * (var10_double / 10.0);
                var10_double = 30.0 * Math.sin(var10_double) + 60.0;
                lb.d(param5, param3, var8 / param2, var9 + -param2, 16724787, (int)var10_double);
                break L2;
              }
            }
            L3: {
              if (((param4.field_g | param4.field_i | param4.field_a) & 1 << param1) == 0) {
                stackIn_8_0 = 0;
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_8_0;
              if ((var24.field_Z ^ -1) != -3) {
                break L4;
              } else {
                if (var10 == 0) {
                  var11 = var24.field_gb.e(127);
                  var12_ref_vn = (vn) ((Object) var24.field_gb.d(-7));
                  L5: while (true) {
                    if (var12_ref_vn == null) {
                      var26 = (vn) ((Object) var24.field_K.d(-76));
                      L6: while (true) {
                        if (var26 == null) {
                          var12_ref_ge = (ge) ((Object) var24.field_pb.d(-113));
                          L7: while (true) {
                            if (var12_ref_ge == null) {
                              var12_ref_il = (il) ((Object) var24.field_C.d(-20));
                              L8: while (true) {
                                if (var12_ref_il == null) {
                                  break L4;
                                } else {
                                  la.a((var12_ref_il.field_j >> -32141084) / param2 + (param5 << -979222716), (var12_ref_il.field_m >> 436903364) / param2 + (param3 << -1028288988), (var12_ref_il.field_u >> -61160252) / param2, var12_ref_il.field_v);
                                  var12_ref_il = (il) ((Object) var24.field_C.a((byte) 116));
                                  continue L8;
                                }
                              }
                            } else {
                              we.field_b[var12_ref_ge.field_i].c(param5 - -((var12_ref_ge.field_j >> 1938908328) / param2), (var12_ref_ge.field_m >> -1188504760) / param2 + param3);
                              var12_ref_ge = (ge) ((Object) var24.field_pb.a((byte) 116));
                              continue L7;
                            }
                          }
                        } else {
                          kq.a(var26, (byte) -119, param2, param5, param3);
                          var26 = (vn) ((Object) var24.field_K.a((byte) 116));
                          continue L6;
                        }
                      }
                    } else {
                      L9: {
                        var13 = var12_ref_vn.field_E.field_j;
                        if ((var12_ref_vn.field_C ^ -1) > -41) {
                          stackIn_16_0 = (18 - -var12_ref_vn.field_C) / (var11 * 3);
                          break L9;
                        } else {
                          stackIn_16_0 = 19 / var11;
                          break L9;
                        }
                      }
                      var14 = stackIn_16_0;
                      var15 = (var12_ref_vn.field_C + 3) * 256 / (var12_ref_vn.field_C + 6);
                      var16 = var15 / (1 + var14);
                      var17 = var12_ref_vn.field_u;
                      var18 = 0;
                      L10: while (true) {
                        L11: {
                          if (var13 < 0) {
                            break L11;
                          } else {
                            if ((var18 ^ -1) <= (var14 ^ -1)) {
                              break L11;
                            } else {
                              var19 = var12_ref_vn.field_E.b(var13, 1);
                              var20 = var12_ref_vn.field_y.b(var13, 1);
                              lb.a((param5 << -54573916) - -((var19 >> 1902718532) / param2), (var20 >> 1026956580) / param2 + (param3 << -402400252), var17 / param2 >> 640424932, var15, ag.field_M);
                              var15 = var15 - var16;
                              var17 = var17 * 252 >> 267109800;
                              var13--;
                              var18++;
                              continue L10;
                            }
                          }
                        }
                        L12: {
                          if (var12_ref_vn.field_C < 40) {
                            break L12;
                          } else {
                            al.a((var12_ref_vn.field_u >> -1587221048) / param2 + (param3 - -((var12_ref_vn.field_m >> -1872433112) / param2)), 40 / param2, 256, sa.a(100 * de.field_x, -4097) * 10 >> -1859638928, 123, 20 / param2, (var12_ref_vn.field_j >> -1384967320) / param2 + param5 - -((var12_ref_vn.field_u >> 332338248) / param2));
                            la.a((var12_ref_vn.field_j - -var12_ref_vn.field_u >> -1232886396) / param2 + (param5 << 1328849092), (param3 << 1064899236) - -((var12_ref_vn.field_m - -var12_ref_vn.field_u >> -1097388060) / param2), (var12_ref_vn.field_u >> -336467133) / param2, 4, 3, lj.field_n, var24.field_F / 5);
                            break L12;
                          }
                        }
                        kq.a(var12_ref_vn, (byte) -119, param2, param5, param3);
                        var12_ref_vn = (vn) ((Object) var24.field_gb.a((byte) 116));
                        continue L5;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L13: {
              L14: {
                if ((var24.field_Z ^ -1) == -3) {
                  break L14;
                } else {
                  if ((var24.field_Z ^ -1) == -5) {
                    break L14;
                  } else {
                    if (var24.field_Z != 1) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              if (var10 != 0) {
                break L13;
              } else {
                oj.a(kb.a(param4, param1, 127, var24), var7, param2, param3, (byte) 107, var24, param5);
                break L13;
              }
            }
            var27 = (kc) ((Object) var24.field_x.d(-30));
            L15: while (true) {
              if (var27 == null) {
                L16: {
                  if (-2 != (param4.field_k ^ -1)) {
                    break L16;
                  } else {
                    if ((var24.field_Z ^ -1) == -2) {
                      L17: {
                        var12 = 256;
                        if (-26 < (var24.field_P ^ -1)) {
                          var12 = var24.field_P * 256 / 25;
                          break L17;
                        } else {
                          if (-110 <= (var24.field_P ^ -1)) {
                            break L17;
                          } else {
                            var12 = 125 - var24.field_P;
                            var12 = var12 * 256 / 15;
                            break L17;
                          }
                        }
                      }
                      lb.d(7, 280, 510, 45, 0, 96 * var12 / 256);
                      w.field_r.b(7 - -((-w.field_r.field_D + 510) / 2), 260, var12);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
                L18: {
                  if (3 == var24.field_Z) {
                    ja.a((byte) -113, v.field_b, var8, var9, var24);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-6 == (var24.field_Z ^ -1)) {
                    ja.a((byte) -104, jk.field_u, var8, var9, var24);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (null != var24.field_w) {
                    jg.a(param5, var24, var24.field_w, param2, 25, param3);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var24.field_D == null) {
                    break L21;
                  } else {
                    jg.a(param5, var24, var24.field_D, param2, 25, param3);
                    break L21;
                  }
                }
                var28 = (ul) ((Object) var24.field_nb.d(-81));
                if (param0 >= 14) {
                  L22: while (true) {
                    if (var28 == null) {
                      L23: {
                        if (0 == (param4.field_a & 1 << param1)) {
                          break L23;
                        } else {
                          cp.a(param5, var8, var9, (byte) 126, var24, param3, param2);
                          break L23;
                        }
                      }
                      L24: {
                        if (0 == (1 << param1 & param4.field_g)) {
                          break L24;
                        } else {
                          bm.a(param5, param3, var9, var24, var8, param2, ci.field_s.toLowerCase(), (byte) 123);
                          break L24;
                        }
                      }
                      L25: {
                        if ((param4.field_i & 1 << param1) == 0) {
                          break L25;
                        } else {
                          bm.a(param5, param3, var9, var24, var8, param2, t.field_h.toLowerCase(), (byte) 76);
                          break L25;
                        }
                      }
                      lb.a();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      cn.a(var28, var24, 10030, param5, param3);
                      var28 = (ul) ((Object) var24.field_nb.a((byte) 116));
                      continue L22;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var27.a(param2, param5, param3, true);
                var27 = (kc) ((Object) var24.field_x.a((byte) 116));
                continue L15;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var6);

            stackIn_74_1 = new StringBuilder().append("pi.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L26;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L26;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        param2 = param2 & kk.field_g[param0];
        if (param1 != -17566) {
            this.f((byte) 28);
        }
        while (this.field_n < param0) {
            param0 = param0 - this.field_n;
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$0] = (byte)(this.field_k[fieldTemp$0] + (param2 >>> param0));
            this.field_k[this.field_l] = (byte) 0;
            this.field_n = 8;
        }
        if (this.field_n != param0) {
            this.field_n = this.field_n - param0;
            this.field_k[this.field_l] = (byte)(this.field_k[this.field_l] + (param2 << this.field_n));
        } else {
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$1] = (byte)(this.field_k[fieldTemp$1] + param2);
            this.field_k[this.field_l] = (byte) 0;
            this.field_n = 8;
        }
    }

    final int d(boolean param0) {
        if (!param0) {
            field_r = (lo) null;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return 255 & this.field_k[fieldTemp$0] + -this.field_v.b(99);
    }

    final void f(byte param0) {
        this.field_l = (this.field_p - -7) / 8;
        if (param0 < 69) {
            pb var3 = (pb) null;
            pi.a((jp) null, (pb) null, 39, 118, (byte) 103, -79);
        }
    }

    final void a(boolean param0, int param1, int param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        byte[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (!param0) {
                break L1;
              } else {
                var7 = (byte[]) null;
                this.a(true, 24, -63, (byte[]) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                fieldTemp$2 = this.field_l;
                this.field_l = this.field_l + 1;
                param3[param1 + var5_int] = (byte)(this.field_k[fieldTemp$2] + -this.field_v.b(126));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pi.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(jp param0, pb param1, int param2, int param3, byte param4, int param5) {
        try {
            fc.a(-102, param1.field_p);
            lb.g(0, 0, param1.field_i, param1.field_q, hh.field_c[param2], 10792131);
            param0.c((param1.field_i + -param0.field_x) / 2, -(75 / param3) + -param0.field_z + (param5 + param1.field_q));
            sc.b(-102);
            if (param4 < 6) {
                pi.o(102);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "pi.LB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int c(int param0, byte param1) {
        int incrementValue$0 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 84 % ((-27 - param1) / 58);
        int var3 = this.field_p >> 2114969091;
        int var5 = -(7 & this.field_p) + 8;
        int var6 = 0;
        this.field_p = this.field_p + param0;
        while (param0 > var5) {
            incrementValue$0 = var3;
            var3++;
            var6 = var6 + ((kk.field_g[var5] & this.field_k[incrementValue$0]) << param0 + -var5);
            param0 = param0 - var5;
            var5 = 8;
        }
        if (var5 == param0) {
            var6 = var6 + (this.field_k[var3] & kk.field_g[var5]);
        } else {
            var6 = var6 + (this.field_k[var3] >> -param0 + var5 & kk.field_g[param0]);
        }
        return var6;
    }

    final void q(int param0) {
        if (8 > this.field_n) {
            this.field_n = 8;
            this.field_l = this.field_l + 1;
        }
        int var2 = 53 % ((param0 - -14) / 35);
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        ng.field_b = 2;
        if (param0 != 21846) {
            return;
        }
        try {
            tk.field_p = param1;
            var5 = (CharSequence) ((Object) param1);
            kb.field_Qb = gb.a(var5, 96);
            qn.field_n = param2;
            di.a((byte) -120);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "pi.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = "Unpacking sound effects";
        field_r = new lo();
        field_u = new n();
    }
}
