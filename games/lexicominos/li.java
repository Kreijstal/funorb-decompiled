/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends bc {
    static aj field_R;
    private ma field_N;
    static mb field_T;
    static int field_S;
    private int field_M;
    private String field_O;
    private db field_Q;
    static String field_P;

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        w var4 = null;
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
            L1: {
              if (param0 == 44) {
                break L1;
              } else {
                var4 = (w) null;
                this.a((byte) -87, (w) null, 66, 22);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("li.LA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void g(boolean param0) {
        vc.field_K[61] = 27;
        vc.field_K[93] = 43;
        if (param0) {
          field_S = -24;
          vc.field_K[46] = 72;
          vc.field_K[45] = 26;
          vc.field_K[92] = 74;
          vc.field_K[44] = 71;
          vc.field_K[47] = 73;
          vc.field_K[59] = 57;
          vc.field_K[222] = 58;
          vc.field_K[520] = 59;
          vc.field_K[192] = 28;
          vc.field_K[91] = 42;
          return;
        } else {
          vc.field_K[46] = 72;
          vc.field_K[45] = 26;
          vc.field_K[92] = 74;
          vc.field_K[44] = 71;
          vc.field_K[47] = 73;
          vc.field_K[59] = 57;
          vc.field_K[222] = 58;
          vc.field_K[520] = 59;
          vc.field_K[192] = 28;
          vc.field_K[91] = 42;
          return;
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
            this.field_M = this.field_M + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "li.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    li(ma param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, t.b(-11));
        try {
            this.field_O = param1;
            this.field_N = param0;
            this.a(param5, param4, true, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(int param0) {
        if (param0 > 121) {
            return null;
        }
        return (String) null;
    }

    public static void a(byte param0) {
        field_T = null;
        field_R = null;
        field_P = null;
        if (param0 < 64) {
            li.g(false);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        sc var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        ub var18_ref = null;
        db var19 = null;
        db var20 = null;
        db var21 = null;
        Object var22 = null;
        ub var22_ref = null;
        db var23 = null;
        db var24 = null;
        db var25 = null;
        Object var26 = null;
        ub var26_ref = null;
        db var27 = null;
        db var28 = null;
        db var29 = null;
        db var30 = null;
        db var31 = null;
        db var32 = null;
        db var33 = null;
        db var34 = null;
        db var35 = null;
        db var36 = null;
        db var37 = null;
        db var38 = null;
        db var39 = null;
        db var40 = null;
        db var41 = null;
        db var42 = null;
        db var43 = null;
        db var44 = null;
        db var45 = null;
        db var46 = null;
        L0: {
          L1: {
            var18 = null;
            var22 = null;
            var26 = null;
            var13 = Lexicominos.field_L ? 1 : 0;
            var6 = this.field_N.b((byte) 125);
            if (var6 == jj.field_e) {
              break L1;
            } else {
              if (be.field_q == var6) {
                break L1;
              } else {
                var17 = this.field_N.a((byte) 100);
                if (var17 == null) {
                  var5 = this.field_O;
                  if (var13 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L2: {
                    if (var17.equals(this.field_u)) {
                      break L2;
                    } else {
                      this.field_u = var17;
                      this.f(true);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        super.a(param0, param1, param2, param3);
                        var6 = this.field_N.b((byte) 119);
                        var18_ref = (ub) ((Object) this.field_i);
                        var9 = param2 - -this.field_t;
                        var10 = var18_ref.a((w) (this), param0 ^ -20231, param1) + (var18_ref.a((w) (this), (byte) 101).a(0) >> -1720259807);
                        if (var6 == jj.field_e) {
                          break L5;
                        } else {
                          if (be.field_q != var6) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          var19 = be.field_b[0];
                          var11 = var19.field_r << -772272607;
                          var12 = var19.field_x << 2127018369;
                          if (null == this.field_Q) {
                            break L7;
                          } else {
                            if (var11 > this.field_Q.field_p) {
                              break L7;
                            } else {
                              if (var12 <= this.field_Q.field_u) {
                                de.a(this.field_Q, 6);
                                lf.a();
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        this.field_Q = new db(var11, var12);
                        de.a(this.field_Q, 6);
                        if (var13 == 0) {
                          break L6;
                        } else {
                          de.a(this.field_Q, 6);
                          lf.a();
                          break L6;
                        }
                      }
                      var19.a(112, 144, var19.field_r << -2113126012, var19.field_x << -822984956, -this.field_M << -1293422998, 4096);
                      pd.a(-22949);
                      this.field_Q.d(-(var19.field_r >> -278138303) + var9, var10 + -var19.field_x, 256);
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    L8: {
                      if (ni.field_b != var6) {
                        break L8;
                      } else {
                        var20 = be.field_b[2];
                        var20.d(var9, var10 + -(var20.field_u >> 1645215233), 256);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (rh.field_p != var6) {
                      break L3;
                    } else {
                      var21 = be.field_b[1];
                      var21.d(var9, var10 + -(var21.field_u >> -535101727), 256);
                      break L3;
                    }
                  }
                  return;
                }
              }
            }
          }
          var5 = gg.field_c;
          break L0;
        }
        if (var5.equals(this.field_u)) {
          super.a(param0, param1, param2, param3);
          var6 = this.field_N.b((byte) 119);
          var26_ref = (ub) ((Object) this.field_i);
          var9 = param2 - -this.field_t;
          var10 = var26_ref.a((w) (this), param0 ^ -20231, param1) + (var26_ref.a((w) (this), (byte) 101).a(0) >> -1720259807);
          if (var6 == jj.field_e) {
            var32 = be.field_b[0];
            var11 = var32.field_r << -772272607;
            var12 = var32.field_x << 2127018369;
            if (null != this.field_Q) {
              if (var11 > this.field_Q.field_p) {
                this.field_Q = new db(var11, var12);
                de.a(this.field_Q, 6);
                if (var13 != 0) {
                  L9: {
                    de.a(this.field_Q, 6);
                    lf.a();
                    var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                    pd.a(-22949);
                    this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                    if (ni.field_b != var6) {
                      break L9;
                    } else {
                      var43 = be.field_b[2];
                      var43.d(var9, var10 + -(var43.field_u >> 1645215233), 256);
                      break L9;
                    }
                  }
                  L10: {
                    if (rh.field_p != var6) {
                      break L10;
                    } else {
                      var44 = be.field_b[1];
                      var44.d(var9, var10 + -(var44.field_u >> -535101727), 256);
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                    pd.a(-22949);
                    this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                    if (var13 == 0) {
                      break L11;
                    } else {
                      L12: {
                        if (ni.field_b != var6) {
                          break L12;
                        } else {
                          var45 = be.field_b[2];
                          var45.d(var9, var10 + -(var45.field_u >> 1645215233), 256);
                          break L12;
                        }
                      }
                      if (rh.field_p != var6) {
                        break L11;
                      } else {
                        var46 = be.field_b[1];
                        var46.d(var9, var10 + -(var46.field_u >> -535101727), 256);
                        break L11;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (var12 > this.field_Q.field_u) {
                  this.field_Q = new db(var11, var12);
                  de.a(this.field_Q, 6);
                  if (var13 != 0) {
                    L13: {
                      de.a(this.field_Q, 6);
                      lf.a();
                      var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                      pd.a(-22949);
                      this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                      if (ni.field_b != var6) {
                        break L13;
                      } else {
                        var37 = be.field_b[2];
                        var37.d(var9, var10 + -(var37.field_u >> 1645215233), 256);
                        break L13;
                      }
                    }
                    L14: {
                      if (rh.field_p != var6) {
                        break L14;
                      } else {
                        var38 = be.field_b[1];
                        var38.d(var9, var10 + -(var38.field_u >> -535101727), 256);
                        break L14;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                      pd.a(-22949);
                      this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                      if (var13 == 0) {
                        break L15;
                      } else {
                        L16: {
                          if (ni.field_b != var6) {
                            break L16;
                          } else {
                            var39 = be.field_b[2];
                            var39.d(var9, var10 + -(var39.field_u >> 1645215233), 256);
                            break L16;
                          }
                        }
                        if (rh.field_p != var6) {
                          break L15;
                        } else {
                          var40 = be.field_b[1];
                          var40.d(var9, var10 + -(var40.field_u >> -535101727), 256);
                          break L15;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    de.a(this.field_Q, 6);
                    lf.a();
                    var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                    pd.a(-22949);
                    this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                    if (var13 == 0) {
                      break L17;
                    } else {
                      L18: {
                        if (ni.field_b != var6) {
                          break L18;
                        } else {
                          var41 = be.field_b[2];
                          var41.d(var9, var10 + -(var41.field_u >> 1645215233), 256);
                          break L18;
                        }
                      }
                      if (rh.field_p != var6) {
                        break L17;
                      } else {
                        var42 = be.field_b[1];
                        var42.d(var9, var10 + -(var42.field_u >> -535101727), 256);
                        break L17;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              this.field_Q = new db(var11, var12);
              de.a(this.field_Q, 6);
              if (var13 != 0) {
                L19: {
                  de.a(this.field_Q, 6);
                  lf.a();
                  var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                  pd.a(-22949);
                  this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                  if (ni.field_b != var6) {
                    break L19;
                  } else {
                    var33 = be.field_b[2];
                    var33.d(var9, var10 + -(var33.field_u >> 1645215233), 256);
                    break L19;
                  }
                }
                L20: {
                  if (rh.field_p != var6) {
                    break L20;
                  } else {
                    var34 = be.field_b[1];
                    var34.d(var9, var10 + -(var34.field_u >> -535101727), 256);
                    break L20;
                  }
                }
                return;
              } else {
                L21: {
                  var32.a(112, 144, var32.field_r << -2113126012, var32.field_x << -822984956, -this.field_M << -1293422998, 4096);
                  pd.a(-22949);
                  this.field_Q.d(-(var32.field_r >> -278138303) + var9, var10 + -var32.field_x, 256);
                  if (var13 == 0) {
                    break L21;
                  } else {
                    L22: {
                      if (ni.field_b != var6) {
                        break L22;
                      } else {
                        var35 = be.field_b[2];
                        var35.d(var9, var10 + -(var35.field_u >> 1645215233), 256);
                        break L22;
                      }
                    }
                    if (rh.field_p != var6) {
                      break L21;
                    } else {
                      var36 = be.field_b[1];
                      var36.d(var9, var10 + -(var36.field_u >> -535101727), 256);
                      break L21;
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (be.field_q == var6) {
              L23: {
                var27 = be.field_b[0];
                var11 = var27.field_r << -772272607;
                var12 = var27.field_x << 2127018369;
                if (null == this.field_Q) {
                  break L23;
                } else {
                  if (var11 > this.field_Q.field_p) {
                    break L23;
                  } else {
                    if (var12 > this.field_Q.field_u) {
                      break L23;
                    } else {
                      de.a(this.field_Q, 6);
                      lf.a();
                      L24: {
                        var27.a(112, 144, var27.field_r << -2113126012, var27.field_x << -822984956, -this.field_M << -1293422998, 4096);
                        pd.a(-22949);
                        this.field_Q.d(-(var27.field_r >> -278138303) + var9, var10 + -var27.field_x, 256);
                        if (var13 == 0) {
                          break L24;
                        } else {
                          L25: {
                            if (ni.field_b != var6) {
                              break L25;
                            } else {
                              var30 = be.field_b[2];
                              var30.d(var9, var10 + -(var30.field_u >> 1645215233), 256);
                              break L25;
                            }
                          }
                          if (rh.field_p != var6) {
                            break L24;
                          } else {
                            var31 = be.field_b[1];
                            var31.d(var9, var10 + -(var31.field_u >> -535101727), 256);
                            break L24;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              this.field_Q = new db(var11, var12);
              de.a(this.field_Q, 6);
              if (var13 == 0) {
                L26: {
                  var27.a(112, 144, var27.field_r << -2113126012, var27.field_x << -822984956, -this.field_M << -1293422998, 4096);
                  pd.a(-22949);
                  this.field_Q.d(-(var27.field_r >> -278138303) + var9, var10 + -var27.field_x, 256);
                  if (var13 == 0) {
                    break L26;
                  } else {
                    L27: {
                      if (ni.field_b != var6) {
                        break L27;
                      } else {
                        var28 = be.field_b[2];
                        var28.d(var9, var10 + -(var28.field_u >> 1645215233), 256);
                        break L27;
                      }
                    }
                    if (rh.field_p != var6) {
                      break L26;
                    } else {
                      var29 = be.field_b[1];
                      var29.d(var9, var10 + -(var29.field_u >> -535101727), 256);
                      break L26;
                    }
                  }
                }
                return;
              } else {
                de.a(this.field_Q, 6);
                lf.a();
                L28: {
                  var27.a(112, 144, var27.field_r << -2113126012, var27.field_x << -822984956, -this.field_M << -1293422998, 4096);
                  pd.a(-22949);
                  this.field_Q.d(-(var27.field_r >> -278138303) + var9, var10 + -var27.field_x, 256);
                  if (var13 == 0) {
                    break L28;
                  } else {
                    L29: {
                      if (ni.field_b != var6) {
                        break L29;
                      } else {
                        var30 = be.field_b[2];
                        var30.d(var9, var10 + -(var30.field_u >> 1645215233), 256);
                        break L29;
                      }
                    }
                    if (rh.field_p != var6) {
                      break L28;
                    } else {
                      var31 = be.field_b[1];
                      var31.d(var9, var10 + -(var31.field_u >> -535101727), 256);
                      break L28;
                    }
                  }
                }
                return;
              }
            } else {
              L30: {
                L31: {
                  if (ni.field_b != var6) {
                    break L31;
                  } else {
                    var45 = be.field_b[2];
                    var45.d(var9, var10 + -(var45.field_u >> 1645215233), 256);
                    if (var13 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                if (rh.field_p != var6) {
                  break L30;
                } else {
                  var46 = be.field_b[1];
                  var46.d(var9, var10 + -(var46.field_u >> -535101727), 256);
                  break L30;
                }
              }
              return;
            }
          }
        } else {
          L32: {
            L33: {
              L34: {
                this.field_u = var5;
                this.f(true);
                super.a(param0, param1, param2, param3);
                var6 = this.field_N.b((byte) 119);
                var22_ref = (ub) ((Object) this.field_i);
                var9 = param2 - -this.field_t;
                var10 = var22_ref.a((w) (this), param0 ^ -20231, param1) + (var22_ref.a((w) (this), (byte) 101).a(0) >> -1720259807);
                if (var6 == jj.field_e) {
                  break L34;
                } else {
                  if (be.field_q != var6) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              L35: {
                L36: {
                  var23 = be.field_b[0];
                  var11 = var23.field_r << -772272607;
                  var12 = var23.field_x << 2127018369;
                  if (null == this.field_Q) {
                    break L36;
                  } else {
                    if (var11 > this.field_Q.field_p) {
                      break L36;
                    } else {
                      if (var12 <= this.field_Q.field_u) {
                        de.a(this.field_Q, 6);
                        lf.a();
                        break L35;
                      } else {
                        break L36;
                      }
                    }
                  }
                }
                this.field_Q = new db(var11, var12);
                de.a(this.field_Q, 6);
                if (var13 == 0) {
                  break L35;
                } else {
                  de.a(this.field_Q, 6);
                  lf.a();
                  break L35;
                }
              }
              var23.a(112, 144, var23.field_r << -2113126012, var23.field_x << -822984956, -this.field_M << -1293422998, 4096);
              pd.a(-22949);
              this.field_Q.d(-(var23.field_r >> -278138303) + var9, var10 + -var23.field_x, 256);
              if (var13 == 0) {
                break L32;
              } else {
                break L33;
              }
            }
            L37: {
              if (ni.field_b != var6) {
                break L37;
              } else {
                var24 = be.field_b[2];
                var24.d(var9, var10 + -(var24.field_u >> 1645215233), 256);
                if (var13 == 0) {
                  break L32;
                } else {
                  break L37;
                }
              }
            }
            if (rh.field_p != var6) {
              break L32;
            } else {
              var25 = be.field_b[1];
              var25.d(var9, var10 + -(var25.field_u >> -535101727), 256);
              break L32;
            }
          }
          return;
        }
    }

    static {
        field_S = 0;
        field_R = new aj(9, 0, 4, 1);
        field_P = "Waiting for fonts";
    }
}
