/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends nm {
    static mf field_s;
    int field_i;
    af field_t;
    private jp field_k;
    int field_u;
    int field_w;
    int field_p;
    static String field_l;
    int field_x;
    static mf field_m;
    int field_r;
    static String field_o;
    private boolean field_v;
    static int field_j;
    static mm field_q;
    int field_n;

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        bi stackIn_5_0 = null;
        bi stackIn_6_0 = null;
        bi stackIn_7_0 = null;
        String stackIn_7_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_4_0 = null;
        bi stackOut_6_0 = null;
        String stackOut_6_1 = null;
        bi stackOut_5_0 = null;
        String stackOut_5_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var9_int = param0 + (param3 + param7);
              if (var9_int == 0) {
                break L1;
              } else {
                param7 = (var9_int + 200 * param7) / (2 * var9_int);
                param0 = (var9_int + 200 * param0) / (var9_int * 2);
                param3 = (param3 * 200 + var9_int) / (var9_int * 2);
                break L1;
              }
            }
            L2: {
              if (-1 == param8) {
                break L2;
              } else {
                ob.field_D.a(1 + param8 + ". ", qo.field_N + 54, param1, param5, -1);
                break L2;
              }
            }
            L3: {
              ob.field_D.c(param2, 54 - -qo.field_N, param1, param5, -1);
              ob.field_D.a(Integer.toString(param4), mf.field_d[0], param1, param5, -1);
              stackOut_4_0 = ob.field_D;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-51 >= (var9_int ^ -1)) {
                stackOut_6_0 = (bi) ((Object) stackIn_6_0);
                stackOut_6_1 = "50+";
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = (bi) ((Object) stackIn_5_0);
                stackOut_5_1 = Integer.toString(var9_int);
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            ((bi) (Object) stackIn_7_0).a(stackIn_7_1, mf.field_d[1], param1, param5, -1);
            ob.field_D.a(param3 + "%", mf.field_d[2], param1, param5, param6);
            ob.field_D.a(param0 + "%", mf.field_d[3], param1, param5, -1);
            ob.field_D.a(param7 + "%", mf.field_d[4], param1, param5, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var9);
            stackOut_9_1 = new StringBuilder().append("i.H(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void d(int param0) {
        oh discarded$2 = null;
        String var2 = null;
        field_s = null;
        field_o = null;
        field_m = null;
        if (param0 != 0) {
          var2 = (String) null;
          discarded$2 = i.a(110, 111, (String) null);
          field_l = null;
          field_q = null;
          return;
        } else {
          field_l = null;
          field_q = null;
          return;
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        wq var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            L2: {
              var9 = new wq(param1);
              var3 = var9.l(255);
              var4 = var9.e(255);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (-1 == (bq.field_d ^ -1)) {
                    break L3;
                  } else {
                    if (var4 <= bq.field_d) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.e(255);
                    if (-1 < (var5 ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (bq.field_d == 0) {
                          break L5;
                        } else {
                          if (var5 <= bq.field_d) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (var3 == 1) {
                          discarded$1 = tc.a(var13, var5, param1, var4, 9);
                          break L6;
                        } else {
                          var7 = ae.field_d;
                          synchronized (var7) {
                            L7: {
                              ae.field_d.a(var13, -20555, var9);
                              break L7;
                            }
                          }
                          break L6;
                        }
                      }
                      stackOut_22_0 = (byte[]) (var6);
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(0, var12, 126, var4);
                  stackOut_8_0 = (byte[]) (var5_ref_byte__);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("i.E(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(int param0, pe param1, int param2) {
        pi var3 = null;
        try {
            var3 = k.field_h;
            var3.e(-13413, param0);
            int var4 = 29 / ((-57 - param2) / 59);
            var3.a(114, 2);
            var3.a(-126, 0);
            var3.a(73, param1.field_w);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "i.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (0 != this.field_p) {
            L1: {
              var2 = 0;
              if (-1 <= (this.field_p ^ -1)) {
                var2 = this.field_p >> -1617990494;
                break L1;
              } else {
                var2 = -(-this.field_p >> 2116311554);
                break L1;
              }
            }
            this.field_p = this.field_p - var2;
            this.field_i = this.field_i + var2;
            break L0;
          } else {
            rk.field_Qb = rk.field_Qb & this.field_x;
            if (!bg.a(this.field_i, this.field_w, this.field_u, (byte) 47, po.field_a, pq.field_k, this.field_n)) {
              if (1 != ki.field_e) {
                break L0;
              } else {
                if (bg.a(this.field_i, this.field_w, this.field_u, (byte) 33, qo.field_O, tb.field_fb, this.field_n)) {
                  if (nf.field_P != this.field_r) {
                    nf.field_P = this.field_r;
                    if ((nf.field_P ^ -1) == 0) {
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    } else {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    }
                  } else {
                    nf.field_P = -1;
                    if ((nf.field_P ^ -1) == 0) {
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    } else {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 <= -125) {
                    return;
                  } else {
                    this.field_n = -78;
                    return;
                  }
                }
              }
            } else {
              nf.field_Y = this.field_r;
              if (1 == ki.field_e) {
                if (bg.a(this.field_i, this.field_w, this.field_u, (byte) 33, qo.field_O, tb.field_fb, this.field_n)) {
                  if (nf.field_P != this.field_r) {
                    nf.field_P = this.field_r;
                    if ((nf.field_P ^ -1) != 0) {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    } else {
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    }
                  } else {
                    nf.field_P = -1;
                    if ((nf.field_P ^ -1) != 0) {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        this.field_n = -78;
                        return;
                      }
                    } else {
                      if (param0 > -125) {
                        this.field_n = -78;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 > -125) {
                    this.field_n = -78;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 > -125) {
                  this.field_n = -78;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 <= -125) {
          return;
        } else {
          this.field_n = -78;
          return;
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (!pe.field_o.c(116)) {
          if ((1 << pe.field_o.field_k & pe.field_o.field_w.field_n) != 0) {
            ag.field_D[10] = fh.field_a;
            if (param0 != 32) {
              field_o = (String) null;
              return;
            } else {
              return;
            }
          } else {
            if (pe.field_o.field_w.field_n == 0) {
              ag.field_D[10] = t.field_b;
              if (param0 == 32) {
                return;
              } else {
                field_o = (String) null;
                return;
              }
            } else {
              ag.field_D[10] = er.field_a;
              if (param0 == 32) {
                return;
              } else {
                field_o = (String) null;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static oh a(int param0, int param1, String param2) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        pe var4 = null;
        oh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_2_0 = null;
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
              var3 = new oh(false);
              var3.field_d = param0;
              var3.field_g = param2;
              if (param1 <= -27) {
                break L1;
              } else {
                var4 = (pe) null;
                i.a(-57, (pe) null, 111);
                break L1;
              }
            }
            stackOut_2_0 = (oh) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0) {
        pe var3 = null;
        if (param0 != 1) {
          var3 = (pe) null;
          i.a(-1, (pe) null, 57);
          aa.field_a.a((nm) (this), (byte) 3);
          this.field_v = false;
          this.field_k = null;
          this.field_t = null;
          return;
        } else {
          aa.field_a.a((nm) (this), (byte) 3);
          this.field_v = false;
          this.field_k = null;
          this.field_t = null;
          return;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        jp var6 = null;
        jp var7 = null;
        jp var10 = null;
        tp var11 = null;
        tp var12 = null;
        tp var13 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (eo.a(this.field_t.field_t, this.field_r, (byte) -75)) {
          if (this.field_r == nf.field_P) {
            L0: {
              L1: {
                pa.field_h[this.field_r].f(this.field_i, this.field_n, 384);
                if (this.field_k == null) {
                  break L1;
                } else {
                  if (this.field_v) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var12 = si.field_c[this.field_r];
              this.field_k = new jp(var12.field_f / 4, var12.field_h / 4);
              fc.a(-119, this.field_k);
              var12.c(0, 0);
              sc.b(-89);
              this.field_v = false;
              break L0;
            }
            if (param0 >= 87) {
              this.field_k.c(this.field_i, this.field_n);
              return;
            } else {
              return;
            }
          } else {
            if (this.field_r != nf.field_Y) {
              L2: {
                if (this.field_k == null) {
                  break L2;
                } else {
                  if (this.field_v) {
                    break L2;
                  } else {
                    if (param0 >= 87) {
                      this.field_k.c(this.field_i, this.field_n);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              var13 = si.field_c[this.field_r];
              this.field_k = new jp(var13.field_f / 4, var13.field_h / 4);
              fc.a(-119, this.field_k);
              var13.c(0, 0);
              sc.b(-89);
              this.field_v = false;
              if (param0 >= 87) {
                this.field_k.c(this.field_i, this.field_n);
                return;
              } else {
                return;
              }
            } else {
              L3: {
                L4: {
                  e.field_l[this.field_r].f(this.field_i, this.field_n, 256);
                  if (this.field_k == null) {
                    break L4;
                  } else {
                    if (this.field_v) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = si.field_c[this.field_r];
                this.field_k = new jp(var11.field_f / 4, var11.field_h / 4);
                fc.a(-119, this.field_k);
                var11.c(0, 0);
                sc.b(-89);
                this.field_v = false;
                break L3;
              }
              if (param0 >= 87) {
                this.field_k.c(this.field_i, this.field_n);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L5: {
            if (nf.field_P != this.field_r) {
              if (nf.field_Y == this.field_r) {
                bf.field_L.f(this.field_i, this.field_n, 256);
                break L5;
              } else {
                if (this.field_k != null) {
                  if (this.field_v) {
                    if (param0 < 87) {
                      return;
                    } else {
                      this.field_k.c(this.field_i, this.field_n);
                      return;
                    }
                  } else {
                    var7 = vq.field_F;
                    this.field_k = new jp(var7.field_x / 4, var7.field_z / 4);
                    fc.a(-76, this.field_k);
                    var7.e(0, 0);
                    sc.b(-110);
                    this.field_v = true;
                    if (param0 < 87) {
                      return;
                    } else {
                      this.field_k.c(this.field_i, this.field_n);
                      return;
                    }
                  }
                } else {
                  var6 = vq.field_F;
                  this.field_k = new jp(var6.field_x / 4, var6.field_z / 4);
                  fc.a(-76, this.field_k);
                  var6.e(0, 0);
                  sc.b(-110);
                  this.field_v = true;
                  if (param0 < 87) {
                    return;
                  } else {
                    this.field_k.c(this.field_i, this.field_n);
                    return;
                  }
                }
              }
            } else {
              qh.field_c.f(this.field_i, this.field_n, 384);
              break L5;
            }
          }
          if (this.field_k != null) {
            if (this.field_v) {
              if (param0 >= 87) {
                this.field_k.c(this.field_i, this.field_n);
                return;
              } else {
                return;
              }
            } else {
              var10 = vq.field_F;
              this.field_k = new jp(var10.field_x / 4, var10.field_z / 4);
              fc.a(-76, this.field_k);
              var10.e(0, 0);
              sc.b(-110);
              this.field_v = true;
              if (param0 >= 87) {
                this.field_k.c(this.field_i, this.field_n);
                return;
              } else {
                return;
              }
            }
          } else {
            var10 = vq.field_F;
            this.field_k = new jp(var10.field_x / 4, var10.field_z / 4);
            fc.a(-76, this.field_k);
            var10.e(0, 0);
            sc.b(-110);
            this.field_v = true;
            if (param0 < 87) {
              return;
            } else {
              this.field_k.c(this.field_i, this.field_n);
              return;
            }
          }
        }
    }

    i() {
    }

    static {
        field_l = "Suggested names: ";
        field_o = "You have withdrawn your request to join.";
    }
}
