/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends ja {
    private int field_T;
    static String[] field_R;
    private dd field_Q;
    private jb field_S;
    private String field_V;
    static byte[][] field_U;

    final String g(int param0) {
        if (param0 == 4) {
            return null;
        }
        this.field_Q = (dd) null;
        return null;
    }

    v(jb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, wi.a(17641));
        try {
            this.field_V = param1;
            this.field_S = param0;
            this.a(param2, param4, param3, param5, 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_T = this.field_T + 1;
              super.a(param0, param1, param2, (byte) -112);
              if (param3 < -85) {
                break L1;
              } else {
                this.field_S = (jb) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("v.I(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        String var5 = null;
        wd var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dd var16 = null;
        Object var17 = null;
        dd var18 = null;
        dd var19 = null;
        dd var20 = null;
        String var21 = null;
        Object var22 = null;
        dd var23 = null;
        dd var24 = null;
        Object var29 = null;
        dd var30 = null;
        dd var31 = null;
        dd var32 = null;
        Object var33 = null;
        dd var34 = null;
        dd var35 = null;
        dd var36 = null;
        eg var37 = null;
        eg var38 = null;
        eg var39 = null;
        eg var40 = null;
        L0: {
          L1: {
            var17 = null;
            var22 = null;
            var29 = null;
            var33 = null;
            var13 = fleas.field_A ? 1 : 0;
            var6 = this.field_S.a(false);
            if (ea.field_b == var6) {
              var5 = bg.field_b;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            } else {
              if (var6 != w.field_e) {
                break L1;
              } else {
                L2: {
                  var5 = bg.field_b;
                  if (var13 == 0) {
                    break L2;
                  } else {
                    var5 = this.field_S.b(-19);
                    if (var5 == null) {
                      var5 = this.field_V;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var5.equals(this.field_i)) {
                    break L3;
                  } else {
                    this.field_i = var5;
                    this.i(424);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    super.b(param0, param1, true, param3);
                    var6 = this.field_S.a(false);
                    var37 = (eg) ((Object) this.field_p);
                    var9 = param1 + this.field_y;
                    var10 = var37.a(param0, (qa) (this), (byte) -59) - -(var37.a((qa) (this), (byte) -35).a(param2) >> 1449838945);
                    if (ea.field_b == var6) {
                      break L5;
                    } else {
                      if (var6 == w.field_e) {
                        break L5;
                      } else {
                        L6: {
                          if (var6 != ml.field_K) {
                            break L6;
                          } else {
                            var18 = t.field_h[2];
                            var18.a(var9, var10 - (var18.field_t >> -707282303), 256);
                            if (var13 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (hm.field_b == var6) {
                          var19 = t.field_h[1];
                          var19.a(var9, -(var19.field_t >> -579947871) + var10, 256);
                          if (var13 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L7: {
                    L8: {
                      var20 = t.field_h[0];
                      var16 = var20;
                      var11 = var20.field_x << -1465467423;
                      var12 = var20.field_r << 1907293153;
                      if (this.field_Q == null) {
                        break L8;
                      } else {
                        if (var11 > this.field_Q.field_w) {
                          break L8;
                        } else {
                          if (this.field_Q.field_t < var12) {
                            break L8;
                          } else {
                            r.a(this.field_Q, 45);
                            gb.c();
                            if (var13 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    this.field_Q = new dd(var11, var12);
                    r.a(this.field_Q, 45);
                    break L7;
                  }
                  var20.a(112, 144, var20.field_x << 155964772, var20.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var20.field_x >> 1511108321), -var20.field_r + var10, 256);
                  break L4;
                }
                return;
              }
            }
          }
          var21 = this.field_S.b(-19);
          if (var21 == null) {
            var5 = this.field_V;
            break L0;
          } else {
            L9: {
              if (var21.equals(this.field_i)) {
                break L9;
              } else {
                this.field_i = var21;
                this.i(424);
                break L9;
              }
            }
            L10: {
              super.b(param0, param1, true, param3);
              var6 = this.field_S.a(false);
              var38 = (eg) ((Object) this.field_p);
              var9 = param1 + this.field_y;
              var10 = var38.a(param0, (qa) (this), (byte) -59) - -(var38.a((qa) (this), (byte) -35).a(param2) >> 1449838945);
              if (ea.field_b == var6) {
                break L10;
              } else {
                if (var6 == w.field_e) {
                  break L10;
                } else {
                  L11: {
                    if (var6 != ml.field_K) {
                      break L11;
                    } else {
                      var23 = t.field_h[2];
                      var23.a(var9, var10 - (var23.field_t >> -707282303), 256);
                      if (var13 != 0) {
                        break L11;
                      } else {
                        return;
                      }
                    }
                  }
                  if (hm.field_b == var6) {
                    var24 = t.field_h[1];
                    var24.a(var9, -(var24.field_t >> -579947871) + var10, 256);
                    if (var13 != 0) {
                      break L10;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var16 = t.field_h[0];
            var11 = var16.field_x << -1465467423;
            var12 = var16.field_r << 1907293153;
            if (this.field_Q != null) {
              if (var11 <= this.field_Q.field_w) {
                if (this.field_Q.field_t >= var12) {
                  r.a(this.field_Q, 45);
                  gb.c();
                  if (var13 != 0) {
                    this.field_Q = new dd(var11, var12);
                    r.a(this.field_Q, 45);
                    var16.a(112, 144, var16.field_x << 155964772, var16.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                    ia.a(-66);
                    this.field_Q.a(var9 + -(var16.field_x >> 1511108321), -var16.field_r + var10, 256);
                    return;
                  } else {
                    var16.a(112, 144, var16.field_x << 155964772, var16.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                    ia.a(-66);
                    this.field_Q.a(var9 + -(var16.field_x >> 1511108321), -var16.field_r + var10, 256);
                    return;
                  }
                } else {
                  this.field_Q = new dd(var11, var12);
                  r.a(this.field_Q, 45);
                  var16.a(112, 144, var16.field_x << 155964772, var16.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var16.field_x >> 1511108321), -var16.field_r + var10, 256);
                  return;
                }
              } else {
                this.field_Q = new dd(var11, var12);
                r.a(this.field_Q, 45);
                var16.a(112, 144, var16.field_x << 155964772, var16.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                ia.a(-66);
                this.field_Q.a(var9 + -(var16.field_x >> 1511108321), -var16.field_r + var10, 256);
                return;
              }
            } else {
              this.field_Q = new dd(var11, var12);
              r.a(this.field_Q, 45);
              var16.a(112, 144, var16.field_x << 155964772, var16.field_r << -1821427388, -this.field_T << 1673028810, 4096);
              ia.a(-66);
              this.field_Q.a(var9 + -(var16.field_x >> 1511108321), -var16.field_r + var10, 256);
              return;
            }
          }
        }
        if (var5.equals(this.field_i)) {
          L12: {
            super.b(param0, param1, true, param3);
            var6 = this.field_S.a(false);
            var40 = (eg) ((Object) this.field_p);
            var9 = param1 + this.field_y;
            var10 = var40.a(param0, (qa) (this), (byte) -59) - -(var40.a((qa) (this), (byte) -35).a(param2) >> 1449838945);
            if (ea.field_b == var6) {
              break L12;
            } else {
              if (var6 == w.field_e) {
                break L12;
              } else {
                L13: {
                  if (var6 != ml.field_K) {
                    break L13;
                  } else {
                    var34 = t.field_h[2];
                    var34.a(var9, var10 - (var34.field_t >> -707282303), 256);
                    if (var13 != 0) {
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
                if (hm.field_b == var6) {
                  var35 = t.field_h[1];
                  var35.a(var9, -(var35.field_t >> -579947871) + var10, 256);
                  if (var13 != 0) {
                    break L12;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          var36 = t.field_h[0];
          var11 = var36.field_x << -1465467423;
          var12 = var36.field_r << 1907293153;
          if (this.field_Q != null) {
            if (var11 <= this.field_Q.field_w) {
              if (this.field_Q.field_t >= var12) {
                r.a(this.field_Q, 45);
                gb.c();
                if (var13 != 0) {
                  this.field_Q = new dd(var11, var12);
                  r.a(this.field_Q, 45);
                  var36.a(112, 144, var36.field_x << 155964772, var36.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var36.field_x >> 1511108321), -var36.field_r + var10, 256);
                  return;
                } else {
                  var36.a(112, 144, var36.field_x << 155964772, var36.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var36.field_x >> 1511108321), -var36.field_r + var10, 256);
                  return;
                }
              } else {
                this.field_Q = new dd(var11, var12);
                r.a(this.field_Q, 45);
                var36.a(112, 144, var36.field_x << 155964772, var36.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                ia.a(-66);
                this.field_Q.a(var9 + -(var36.field_x >> 1511108321), -var36.field_r + var10, 256);
                return;
              }
            } else {
              this.field_Q = new dd(var11, var12);
              r.a(this.field_Q, 45);
              var36.a(112, 144, var36.field_x << 155964772, var36.field_r << -1821427388, -this.field_T << 1673028810, 4096);
              ia.a(-66);
              this.field_Q.a(var9 + -(var36.field_x >> 1511108321), -var36.field_r + var10, 256);
              return;
            }
          } else {
            this.field_Q = new dd(var11, var12);
            r.a(this.field_Q, 45);
            var36.a(112, 144, var36.field_x << 155964772, var36.field_r << -1821427388, -this.field_T << 1673028810, 4096);
            ia.a(-66);
            this.field_Q.a(var9 + -(var36.field_x >> 1511108321), -var36.field_r + var10, 256);
            return;
          }
        } else {
          L14: {
            this.field_i = var5;
            this.i(424);
            super.b(param0, param1, true, param3);
            var6 = this.field_S.a(false);
            var39 = (eg) ((Object) this.field_p);
            var9 = param1 + this.field_y;
            var10 = var39.a(param0, (qa) (this), (byte) -59) - -(var39.a((qa) (this), (byte) -35).a(param2) >> 1449838945);
            if (ea.field_b == var6) {
              break L14;
            } else {
              if (var6 == w.field_e) {
                break L14;
              } else {
                L15: {
                  if (var6 != ml.field_K) {
                    break L15;
                  } else {
                    var30 = t.field_h[2];
                    var30.a(var9, var10 - (var30.field_t >> -707282303), 256);
                    if (var13 != 0) {
                      break L15;
                    } else {
                      return;
                    }
                  }
                }
                if (hm.field_b == var6) {
                  var31 = t.field_h[1];
                  var31.a(var9, -(var31.field_t >> -579947871) + var10, 256);
                  if (var13 != 0) {
                    break L14;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          var32 = t.field_h[0];
          var16 = var32;
          var11 = var32.field_x << -1465467423;
          var12 = var32.field_r << 1907293153;
          if (this.field_Q != null) {
            if (var11 <= this.field_Q.field_w) {
              if (this.field_Q.field_t >= var12) {
                r.a(this.field_Q, 45);
                gb.c();
                if (var13 == 0) {
                  var32.a(112, 144, var32.field_x << 155964772, var32.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var32.field_x >> 1511108321), -var32.field_r + var10, 256);
                  return;
                } else {
                  this.field_Q = new dd(var11, var12);
                  r.a(this.field_Q, 45);
                  var32.a(112, 144, var32.field_x << 155964772, var32.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                  ia.a(-66);
                  this.field_Q.a(var9 + -(var32.field_x >> 1511108321), -var32.field_r + var10, 256);
                  return;
                }
              } else {
                this.field_Q = new dd(var11, var12);
                r.a(this.field_Q, 45);
                var32.a(112, 144, var32.field_x << 155964772, var32.field_r << -1821427388, -this.field_T << 1673028810, 4096);
                ia.a(-66);
                this.field_Q.a(var9 + -(var32.field_x >> 1511108321), -var32.field_r + var10, 256);
                return;
              }
            } else {
              this.field_Q = new dd(var11, var12);
              r.a(this.field_Q, 45);
              var32.a(112, 144, var32.field_x << 155964772, var32.field_r << -1821427388, -this.field_T << 1673028810, 4096);
              ia.a(-66);
              this.field_Q.a(var9 + -(var32.field_x >> 1511108321), -var32.field_r + var10, 256);
              return;
            }
          } else {
            this.field_Q = new dd(var11, var12);
            r.a(this.field_Q, 45);
            var32.a(112, 144, var32.field_x << 155964772, var32.field_r << -1821427388, -this.field_T << 1673028810, 4096);
            ia.a(-66);
            this.field_Q.a(var9 + -(var32.field_x >> 1511108321), -var32.field_r + var10, 256);
            return;
          }
        }
    }

    final boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param1 <= -26) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_R = (String[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("v.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void k(int param0) {
        field_U = (byte[][]) null;
        field_R = null;
        if (param0 != -8011) {
            field_U = (byte[][]) null;
        }
    }

    static {
        field_U = new byte[250][];
    }
}
