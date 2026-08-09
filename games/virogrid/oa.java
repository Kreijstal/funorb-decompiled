/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ba {
    private int field_j;
    private nb field_l;
    private gl field_m;
    private byte[] field_n;
    static int field_q;
    private dk field_y;
    private sb field_e;
    private int field_k;
    private sj field_p;
    private byte[] field_x;
    private ln field_i;
    static String field_u;
    private gl field_t;
    private int field_r;
    private int field_g;
    private p field_o;
    private boolean field_s;
    static kf field_h;
    private p field_f;
    private boolean field_v;
    private boolean field_d;
    private long field_w;

    final static void a(byte param0, eh param1) {
        km var6 = null;
        km var7 = null;
        km var3 = null;
        try {
            qg.field_u = sn.a(param1, "display_name_changed", "basic", false);
            ve.field_q = new ao(0L, gg.field_K, dc.field_Z, hm.field_a);
            lg.field_a = new ao(0L, gg.field_K, kh.field_a, a.field_A);
            dg.field_E = new km(0L, (km) null);
            ee.field_e = new km(0L, ti.field_h);
            ee.field_e.field_lb = 1;
            se.field_c = new km(0L, ag.field_d, tl.field_h);
            if (param0 > -16) {
                int[] var4 = (int[]) null;
                oa.a(90, (String) null, -60L, 66, (int[]) null);
            }
            wb.field_m = new km(0L, he.field_Jb, ke.field_s);
            tf.field_c = new km(0L, ma.field_e);
            dg.field_E.a(0, ee.field_e);
            dg.field_E.a(0, se.field_c);
            dg.field_E.a(0, wb.field_m);
            dg.field_E.a(0, ve.field_q);
            dg.field_E.a(0, tf.field_c);
            ve.field_q.field_Ib.field_Eb.b(18003, ti.field_h);
            ve.field_q.field_Ib.field_Eb.field_D = 1;
            var6 = ve.field_q.field_Ib.field_Eb;
            var7 = var6;
            var7.field_lb = 1;
            lg.field_a.field_Ib.field_Eb.b(18003, ti.field_h);
            lg.field_a.field_Ib.field_Eb.field_D = 1;
            var3 = lg.field_a.field_Ib.field_Eb;
            var3.field_lb = 1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "oa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, la param1, int param2) {
        hg var3 = null;
        try {
            var3 = gk.field_g;
            var3.g(param0, 8);
            if (param2 < 94) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                oa.a((java.applet.Applet) null, -86);
            }
            var3.a(param1.field_j, -69);
            var3.a((byte) 59, param1.field_o);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "oa.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        field_u = null;
        int var1 = -86 % ((-52 - param0) / 61);
    }

    final int a(int param0, int param1) {
        nb var3 = (nb) ((Object) this.field_i.a((long)param1, -14905));
        if (!(var3 == null)) {
            return var3.e(0);
        }
        if (param0 != -7) {
            this.a(-68, 0);
            return 0;
        }
        return 0;
    }

    final sj a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3_ref_RuntimeException = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (this.field_p != null) {
          return this.field_p;
        } else {
          L0: {
            if (this.field_l != null) {
              break L0;
            } else {
              if (!this.field_y.c((byte) 113)) {
                this.field_l = (nb) ((Object) this.field_y.a((byte) 0, this.field_r, true, -1150070304, 255));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_l.field_t) {
            L1: {
              var7 = this.field_l.b((byte) 39);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_l instanceof bl)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_p = new sj(var7, this.field_k, this.field_x);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref_RuntimeException = decompiledCaughtException;
                    this.field_y.d((byte) 83);
                    this.field_p = null;
                    if (!this.field_y.c((byte) 113)) {
                      this.field_l = (nb) ((Object) this.field_y.a((byte) 0, this.field_r, true, -1150070304, 255));
                      break L3;
                    } else {
                      this.field_l = null;
                      break L3;
                    }
                  }
                  return null;
                }
                if (this.field_t == null) {
                  break L1;
                } else {
                  this.field_e.a(this.field_t, var7, (byte) -128, this.field_r);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_p = new sj(var7, this.field_k, this.field_x);
                      if (this.field_p.field_a != this.field_j) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3_ref_RuntimeException = decompiledCaughtException;
                    this.field_p = null;
                    if (this.field_y.c((byte) 113)) {
                      this.field_l = null;
                      break L5;
                    } else {
                      this.field_l = (nb) ((Object) this.field_y.a((byte) 0, this.field_r, true, -1150070304, 255));
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              this.field_l = null;
              if (this.field_m == null) {
                break L6;
              } else {
                this.field_n = new byte[this.field_p.field_v];
                break L6;
              }
            }
            var3 = 48 % ((param0 - -34) / 47);
            return this.field_p;
          } else {
            return null;
          }
        }
    }

    private final nb a(int param0, int param1, int param2) {
        Object stackIn_92_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          var12 = (nb) ((Object) this.field_i.a((long)param2, -14905));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (var12.field_w) {
                break L0;
              } else {
                if (var12.field_t) {
                  var12.a(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param1 != 0) {
                if (-2 == (param1 ^ -1)) {
                  if (null != this.field_m) {
                    var4 = this.field_e.a((byte) 116, param2, this.field_m);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (-3 != (param1 ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_m == null) {
                      throw new RuntimeException();
                    } else {
                      if ((this.field_n[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_y.c(20)) {
                          var4 = this.field_y.a((byte) 2, param2, false, -1150070304, this.field_r);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              } else {
                L3: {
                  if (this.field_m == null) {
                    break L3;
                  } else {
                    if (0 == (this.field_n[param2] ^ -1)) {
                      break L3;
                    } else {
                      var4 = this.field_e.a(param2, -16578, this.field_m);
                      break L2;
                    }
                  }
                }
                if (!this.field_y.c((byte) 113)) {
                  var4 = this.field_y.a((byte) 2, param2, true, param0 ^ 1150071165, this.field_r);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_i.a((l) (var4), (byte) 96, (long)param2);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 == -8035) {
          if (!((nb) (var4)).field_t) {
            var18 = ((nb) (var4)).b((byte) 39);
            var13 = var18;
            var5 = var13;
            if (var4 instanceof bl) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (-3 > (var18.length ^ -1)) {
                        qn.field_S.reset();
                        qn.field_S.update(var5, 0, var18.length - 2);
                        var6_int = (int)qn.field_S.getValue();
                        if (this.field_p.field_m[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L6: {
                            if (this.field_p.field_p == null) {
                              break L6;
                            } else {
                              if (this.field_p.field_p[param2] == null) {
                                break L6;
                              } else {
                                var29 = this.field_p.field_p[param2];
                                var30 = ug.a(var5, -2 + var18.length, 0, false);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if ((var11 ^ -1) <= -65) {
                                    break L6;
                                  } else {
                                    if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
                                      var11++;
                                      continue L7;
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = (255 & var5[var18.length + -1]) + (var5[var18.length - 2] << -2042956632 & 65280);
                          if (var7 == (this.field_p.field_f[param2] & 65535)) {
                            L8: {
                              if ((this.field_n[param2] ^ -1) == -2) {
                                break L8;
                              } else {
                                L9: {
                                  if (-1 != (this.field_n[param2] ^ -1)) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_n[param2] = (byte) 1;
                                break L8;
                              }
                            }
                            L10: {
                              if (!((nb) (var4)).field_w) {
                                ((nb) (var4)).a(false);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            stackIn_92_0 = var4;
                            break L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_n[param2] = (byte)-1;
                ((nb) (var4)).a(false);
                if (((nb) (var4)).field_w) {
                  L11: {
                    if (!this.field_y.c((byte) 113)) {
                      var4 = this.field_y.a((byte) 2, param2, true, param0 + -1150062269, this.field_r);
                      this.field_i.a((l) (var4), (byte) 60, (long)param2);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return null;
                } else {
                  return null;
                }
              }
              return (nb) ((Object) stackIn_92_0);
            } else {
              try {
                L12: {
                  L13: {
                    if (var5 == null) {
                      break L13;
                    } else {
                      if (var18.length > 2) {
                        qn.field_S.reset();
                        qn.field_S.update(var5, 0, -2 + var18.length);
                        var6_int = (int)qn.field_S.getValue();
                        if (this.field_p.field_m[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L14: {
                            if (null == this.field_p.field_p) {
                              break L14;
                            } else {
                              if (this.field_p.field_p[param2] != null) {
                                var28 = this.field_p.field_p[param2];
                                var27 = ug.a(var5, var18.length - 2, 0, false);
                                var9 = 0;
                                L15: while (true) {
                                  if ((var9 ^ -1) <= -65) {
                                    break L14;
                                  } else {
                                    if (var27[var9] != var28[var9]) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      continue L15;
                                    }
                                  }
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_y.field_l = 0;
                          this.field_y.field_b = 0;
                          break L12;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L16: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  this.field_y.d((byte) 102);
                  ((nb) (var4)).a(false);
                  if (((nb) (var4)).field_w) {
                    if (!this.field_y.c((byte) 113)) {
                      var4 = this.field_y.a((byte) 2, param2, true, param0 ^ 1150071165, this.field_r);
                      this.field_i.a((l) (var4), (byte) 14, (long)param2);
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                return null;
              }
              L17: {
                var5[-2 + var18.length] = (byte)(this.field_p.field_f[param2] >>> -348414520);
                var5[var18.length + -1] = (byte)this.field_p.field_f[param2];
                if (null != this.field_m) {
                  this.field_e.a(this.field_m, var18, (byte) -126, param2);
                  if (-2 == (this.field_n[param2] ^ -1)) {
                    break L17;
                  } else {
                    this.field_n[param2] = (byte) 1;
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (!((nb) (var4)).field_w) {
                  ((nb) (var4)).a(false);
                  break L18;
                } else {
                  break L18;
                }
              }
              return (nb) (var4);
            }
          } else {
            return null;
          }
        } else {
          return (nb) null;
        }
    }

    final void b(byte param0) {
        nb discarded$0 = null;
        nb discarded$1 = null;
        nb discarded$2 = null;
        nb discarded$3 = null;
        int var2_int;
        nb var2;
        l var3;
        int var4;
        int var5;
        l var6;
        l var7;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          if (this.field_o != null) {
            if (null == this.a((byte) -89)) {
              return;
            } else {
              if (!this.field_s) {
                if (!this.field_v) {
                  this.field_o = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_o.a((byte) -84);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (this.field_g >= this.field_p.field_n.length) {
                            break L3;
                          } else {
                            if (0 != this.field_p.field_n[this.field_g]) {
                              if (this.field_y.c(20)) {
                                var2_int = 0;
                                break L3;
                              } else {
                                L4: {
                                  if (1 == this.field_n[this.field_g]) {
                                    break L4;
                                  } else {
                                    discarded$0 = this.a(-8035, 2, this.field_g);
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (1 == this.field_n[this.field_g]) {
                                    break L5;
                                  } else {
                                    var7 = new l();
                                    var7.field_d = (long)this.field_g;
                                    var2_int = 0;
                                    this.field_o.a(var7, (byte) -112);
                                    break L5;
                                  }
                                }
                                this.field_g = this.field_g + 1;
                                continue L2;
                              }
                            } else {
                              this.field_g = this.field_g + 1;
                              continue L2;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_v = false;
                          this.field_g = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_d;
                        if (this.field_n[var4] == 1) {
                          break L6;
                        } else {
                          discarded$1 = this.a(-8035, 2, var4);
                          break L6;
                        }
                      }
                      L7: {
                        if (1 == this.field_n[var4]) {
                          var3.a(false);
                          break L7;
                        } else {
                          var2_int = 0;
                          break L7;
                        }
                      }
                      var3 = this.field_o.a(param0 ^ -16207);
                      continue L1;
                    }
                  }
                }
              } else {
                var2_int = 1;
                var3 = this.field_o.a((byte) -75);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (this.field_g >= this.field_p.field_n.length) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_p.field_n[this.field_g] == 0) {
                              break L11;
                            } else {
                              if (this.field_e.field_e >= 250) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L12: {
                                  if (this.field_n[this.field_g] != 0) {
                                    break L12;
                                  } else {
                                    discarded$2 = this.a(-8035, 1, this.field_g);
                                    break L12;
                                  }
                                }
                                if (this.field_n[this.field_g] == 0) {
                                  var6 = new l();
                                  var6.field_d = (long)this.field_g;
                                  this.field_o.a(var6, (byte) -37);
                                  var2_int = 0;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          this.field_g = this.field_g + 1;
                          continue L9;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_s = false;
                        this.field_g = 0;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_d;
                      if (-1 != (this.field_n[var4] ^ -1)) {
                        break L13;
                      } else {
                        discarded$3 = this.a(param0 + -8007, 1, var4);
                        break L13;
                      }
                    }
                    L14: {
                      if (-1 != (this.field_n[var4] ^ -1)) {
                        var3.a(false);
                        break L14;
                      } else {
                        var2_int = 0;
                        break L14;
                      }
                    }
                    var3 = this.field_o.a(16213);
                    continue L8;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (param0 == -28) {
            break L15;
          } else {
            this.field_p = (sj) null;
            break L15;
          }
        }
        L16: {
          if (!this.field_d) {
            break L16;
          } else {
            if (this.field_w <= hc.a(-9986)) {
              var2 = (nb) ((Object) this.field_i.a((byte) 19));
              L17: while (true) {
                if (var2 == null) {
                  this.field_w = 1000L + hc.a(-9986);
                  break L16;
                } else {
                  L18: {
                    if (!var2.field_t) {
                      if (var2.field_v) {
                        if (!var2.field_w) {
                          throw new RuntimeException();
                        } else {
                          var2.a(false);
                          break L18;
                        }
                      } else {
                        var2.field_v = true;
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var2 = (nb) ((Object) this.field_i.a(75));
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        nb discarded$0 = null;
        nb discarded$1 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (!(null != this.field_o)) {
            return;
        }
        if (!(null != this.a((byte) 63))) {
            return;
        }
        if (param0 != 0) {
            this.b(-4, -120);
        }
        l var2 = this.field_f.a((byte) -82);
        while (var2 != null) {
            var3 = (int)var2.field_d;
            if (var3 < 0) {
                var2.a(false);
            } else {
                if (this.field_p.field_v <= var3) {
                    var2.a(false);
                } else {
                    if (this.field_p.field_n[var3] == 0) {
                        var2.a(false);
                    } else {
                        if (0 == this.field_n[var3]) {
                            discarded$0 = this.a(param0 + -8035, 1, var3);
                        }
                        if ((this.field_n[var3] ^ -1) == 0) {
                            discarded$1 = this.a(-8035, 2, var3);
                        }
                        if (!(1 != this.field_n[var3])) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = this.field_f.a(param0 ^ 16213);
        }
    }

    final byte[] b(int param0, int param1) {
        if (param1 <= 119) {
            this.field_r = 115;
        }
        nb var3 = this.a(-8035, 0, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b((byte) 39);
        var3.a(false);
        return var4;
    }

    final static boolean a(int param0, String param1, long param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int[] var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 28977) {
                break L1;
              } else {
                var7 = (int[]) null;
                oa.a(-22, (String) null, 26L, -30, (int[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (2 != param3) {
                      break L4;
                    } else {
                      if (!hm.a(param1, param2, -24236)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("oa.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(boolean param0) {
        if (this.field_m == null) {
            return;
        }
        this.field_v = param0 ? true : false;
        if (!(null != this.field_o)) {
            this.field_o = new p();
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 0) {
                field_u = (String) null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(og.a(-1, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    oa(int param0, gl param1, gl param2, dk param3, sb param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_i = new ln(16);
        this.field_g = 0;
        this.field_f = new p();
        this.field_w = 0L;
        try {
          L0: {
            L1: {
              this.field_m = param1;
              this.field_r = param0;
              if (this.field_m != null) {
                this.field_s = true;
                this.field_o = new p();
                break L1;
              } else {
                this.field_s = false;
                break L1;
              }
            }
            L2: {
              this.field_k = param5;
              this.field_x = param6;
              this.field_t = param2;
              this.field_y = param3;
              this.field_j = param7;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((oa) (this)).field_d = stackIn_7_1 != 0;
              this.field_e = param4;
              if (null == this.field_t) {
                break L3;
              } else {
                this.field_l = (nb) ((Object) this.field_e.a(this.field_r, -16578, this.field_t));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("oa.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_u = "Show game chat from my friends";
    }
}
