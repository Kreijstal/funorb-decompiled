/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends le {
    static long field_G;
    private String field_J;
    private int field_K;
    static String field_I;
    private wa field_L;
    static String field_M;
    private ti field_H;
    static String field_F;

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
            this.field_K = this.field_K + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String f(int param0) {
        if (param0 == 4) {
            return null;
        }
        return (String) null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5;
        rc var6;
        int var7;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Object var18;
        ti var19;
        Object var22;
        m var49;
        ti var20;
        ti var21;
        ti var23;
        ti var24;
        ti var25;
        ti var26;
        ti var27;
        ti var28;
        ti var29;
        ti var32;
        ti var33;
        ti var36;
        ti var37;
        ti var38;
        ti var39;
        ti var40;
        ti var41;
        ti var42;
        ti var43;
        ti var44;
        ti var45;
        ti var46;
        ti var47;
        ti var48;
        m var50;
        L0: {
          L1: {
            L2: {
              L3: {
                var18 = null;
                var22 = null;
                var14 = Transmogrify.field_A ? 1 : 0;
                var6 = this.field_L.a(27835);
                if (var6 == ek.field_a) {
                  var5 = bj.field_X;
                  if (var14 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (fi.field_u != var6) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          var5 = bj.field_X;
                          if (var14 == 0) {
                            break L6;
                          } else {
                            var5 = this.field_L.c(30523);
                            if (var5 == null) {
                              var5 = this.field_J;
                              break L6;
                            } else {
                              if (!var5.equals(this.field_k)) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (!var5.equals(this.field_k)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                      this.field_k = var5;
                      this.j(-108);
                      break L4;
                    }
                    L7: {
                      L8: {
                        L9: {
                          var7 = 97 % ((77 - param3) / 34);
                          super.a(param0, param1, param2, (byte) 111);
                          var6 = this.field_L.a(27835);
                          var49 = (m) ((Object) this.field_q);
                          var10 = param0 + this.field_p;
                          var11 = var49.a((qg) (this), 68, param1) - -(var49.a((qg) (this), -2).a(126) >> -678446239);
                          if (ek.field_a == var6) {
                            break L9;
                          } else {
                            if (fi.field_u != var6) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          L11: {
                            var19 = ai.field_b[0];
                            var12 = var19.field_r << 836923905;
                            var13 = var19.field_s << 908056673;
                            if (null == this.field_H) {
                              break L11;
                            } else {
                              if (this.field_H.field_n < var12) {
                                break L11;
                              } else {
                                if (var13 <= this.field_H.field_m) {
                                  oj.a(this.field_H, 256);
                                  sb.c();
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          this.field_H = new ti(var12, var13);
                          oj.a(this.field_H, 256);
                          if (var14 == 0) {
                            break L10;
                          } else {
                            oj.a(this.field_H, 256);
                            sb.c();
                            break L10;
                          }
                        }
                        var19.a(112, 144, var19.field_r << -306217724, var19.field_s << -172847676, -this.field_K << 2001662346, 4096);
                        fi.c(true);
                        this.field_H.c(var10 - (var19.field_r >> 263659009), var11 + -var19.field_s, 256);
                        if (var14 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      L12: {
                        if (ec.field_d != var6) {
                          break L12;
                        } else {
                          var20 = ai.field_b[2];
                          var20.c(var10, var11 - (var20.field_m >> -1794552927), 256);
                          if (var14 == 0) {
                            break L7;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (hi.field_b != var6) {
                        break L7;
                      } else {
                        var21 = ai.field_b[1];
                        var21.c(var10, -(var21.field_m >> 454651233) + var11, 256);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
              var5 = this.field_L.c(30523);
              if (var5 == null) {
                var5 = this.field_J;
                break L2;
              } else {
                if (!var5.equals(this.field_k)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!var5.equals(this.field_k)) {
              break L1;
            } else {
              break L0;
            }
          }
          this.field_k = var5;
          this.j(-108);
          break L0;
        }
        var7 = 97 % ((77 - param3) / 34);
        super.a(param0, param1, param2, (byte) 111);
        var6 = this.field_L.a(27835);
        var50 = (m) ((Object) this.field_q);
        var10 = param0 + this.field_p;
        var11 = var50.a((qg) (this), 68, param1) - -(var50.a((qg) (this), -2).a(126) >> -678446239);
        if (ek.field_a == var6) {
          L13: {
            var38 = ai.field_b[0];
            var12 = var38.field_r << 836923905;
            var13 = var38.field_s << 908056673;
            if (null == this.field_H) {
              break L13;
            } else {
              if (this.field_H.field_n < var12) {
                break L13;
              } else {
                if (var13 > this.field_H.field_m) {
                  this.field_H = new ti(var12, var13);
                  oj.a(this.field_H, 256);
                  if (var14 != 0) {
                    L14: {
                      oj.a(this.field_H, 256);
                      sb.c();
                      var38.a(112, 144, var38.field_r << -306217724, var38.field_s << -172847676, -this.field_K << 2001662346, 4096);
                      fi.c(true);
                      this.field_H.c(var10 - (var38.field_r >> 263659009), var11 + -var38.field_s, 256);
                      if (ec.field_d != var6) {
                        break L14;
                      } else {
                        var39 = ai.field_b[2];
                        var39.c(var10, var11 - (var39.field_m >> -1794552927), 256);
                        break L14;
                      }
                    }
                    L15: {
                      if (hi.field_b != var6) {
                        break L15;
                      } else {
                        var40 = ai.field_b[1];
                        var40.c(var10, -(var40.field_m >> 454651233) + var11, 256);
                        break L15;
                      }
                    }
                    return;
                  } else {
                    L16: {
                      var38.a(112, 144, var38.field_r << -306217724, var38.field_s << -172847676, -this.field_K << 2001662346, 4096);
                      fi.c(true);
                      this.field_H.c(var10 - (var38.field_r >> 263659009), var11 + -var38.field_s, 256);
                      if (var14 == 0) {
                        break L16;
                      } else {
                        L17: {
                          if (ec.field_d != var6) {
                            break L17;
                          } else {
                            var41 = ai.field_b[2];
                            var41.c(var10, var11 - (var41.field_m >> -1794552927), 256);
                            break L17;
                          }
                        }
                        if (hi.field_b != var6) {
                          break L16;
                        } else {
                          var42 = ai.field_b[1];
                          var42.c(var10, -(var42.field_m >> 454651233) + var11, 256);
                          break L16;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    oj.a(this.field_H, 256);
                    sb.c();
                    var38.a(112, 144, var38.field_r << -306217724, var38.field_s << -172847676, -this.field_K << 2001662346, 4096);
                    fi.c(true);
                    this.field_H.c(var10 - (var38.field_r >> 263659009), var11 + -var38.field_s, 256);
                    if (var14 == 0) {
                      break L18;
                    } else {
                      L19: {
                        if (ec.field_d != var6) {
                          break L19;
                        } else {
                          var43 = ai.field_b[2];
                          var43.c(var10, var11 - (var43.field_m >> -1794552927), 256);
                          break L19;
                        }
                      }
                      if (hi.field_b != var6) {
                        break L18;
                      } else {
                        var44 = ai.field_b[1];
                        var44.c(var10, -(var44.field_m >> 454651233) + var11, 256);
                        break L18;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          this.field_H = new ti(var12, var13);
          oj.a(this.field_H, 256);
          if (var14 != 0) {
            L20: {
              oj.a(this.field_H, 256);
              sb.c();
              var38.a(112, 144, var38.field_r << -306217724, var38.field_s << -172847676, -this.field_K << 2001662346, 4096);
              fi.c(true);
              this.field_H.c(var10 - (var38.field_r >> 263659009), var11 + -var38.field_s, 256);
              if (ec.field_d != var6) {
                break L20;
              } else {
                var45 = ai.field_b[2];
                var45.c(var10, var11 - (var45.field_m >> -1794552927), 256);
                break L20;
              }
            }
            L21: {
              if (hi.field_b != var6) {
                break L21;
              } else {
                var46 = ai.field_b[1];
                var46.c(var10, -(var46.field_m >> 454651233) + var11, 256);
                break L21;
              }
            }
            return;
          } else {
            L22: {
              var38.a(112, 144, var38.field_r << -306217724, var38.field_s << -172847676, -this.field_K << 2001662346, 4096);
              fi.c(true);
              this.field_H.c(var10 - (var38.field_r >> 263659009), var11 + -var38.field_s, 256);
              if (var14 == 0) {
                break L22;
              } else {
                L23: {
                  if (ec.field_d != var6) {
                    break L23;
                  } else {
                    var47 = ai.field_b[2];
                    var47.c(var10, var11 - (var47.field_m >> -1794552927), 256);
                    break L23;
                  }
                }
                if (hi.field_b != var6) {
                  break L22;
                } else {
                  var48 = ai.field_b[1];
                  var48.c(var10, -(var48.field_m >> 454651233) + var11, 256);
                  break L22;
                }
              }
            }
            return;
          }
        } else {
          if (fi.field_u == var6) {
            var23 = ai.field_b[0];
            var12 = var23.field_r << 836923905;
            var13 = var23.field_s << 908056673;
            if (null != this.field_H) {
              if (this.field_H.field_n >= var12) {
                if (var13 > this.field_H.field_m) {
                  this.field_H = new ti(var12, var13);
                  oj.a(this.field_H, 256);
                  if (var14 != 0) {
                    L24: {
                      oj.a(this.field_H, 256);
                      sb.c();
                      var23.a(112, 144, var23.field_r << -306217724, var23.field_s << -172847676, -this.field_K << 2001662346, 4096);
                      fi.c(true);
                      this.field_H.c(var10 - (var23.field_r >> 263659009), var11 + -var23.field_s, 256);
                      if (ec.field_d != var6) {
                        break L24;
                      } else {
                        var32 = ai.field_b[2];
                        var32.c(var10, var11 - (var32.field_m >> -1794552927), 256);
                        break L24;
                      }
                    }
                    L25: {
                      if (hi.field_b != var6) {
                        break L25;
                      } else {
                        var33 = ai.field_b[1];
                        var33.c(var10, -(var33.field_m >> 454651233) + var11, 256);
                        break L25;
                      }
                    }
                    return;
                  } else {
                    L26: {
                      var23.a(112, 144, var23.field_r << -306217724, var23.field_s << -172847676, -this.field_K << 2001662346, 4096);
                      fi.c(true);
                      this.field_H.c(var10 - (var23.field_r >> 263659009), var11 + -var23.field_s, 256);
                      if (var14 == 0) {
                        break L26;
                      } else {
                        L27: {
                          if (ec.field_d != var6) {
                            break L27;
                          } else {
                            var36 = ai.field_b[2];
                            var36.c(var10, var11 - (var36.field_m >> -1794552927), 256);
                            break L27;
                          }
                        }
                        if (hi.field_b != var6) {
                          break L26;
                        } else {
                          var37 = ai.field_b[1];
                          var37.c(var10, -(var37.field_m >> 454651233) + var11, 256);
                          break L26;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L28: {
                    oj.a(this.field_H, 256);
                    sb.c();
                    var23.a(112, 144, var23.field_r << -306217724, var23.field_s << -172847676, -this.field_K << 2001662346, 4096);
                    fi.c(true);
                    this.field_H.c(var10 - (var23.field_r >> 263659009), var11 + -var23.field_s, 256);
                    if (var14 == 0) {
                      break L28;
                    } else {
                      L29: {
                        if (ec.field_d != var6) {
                          break L29;
                        } else {
                          var28 = ai.field_b[2];
                          var28.c(var10, var11 - (var28.field_m >> -1794552927), 256);
                          break L29;
                        }
                      }
                      if (hi.field_b != var6) {
                        break L28;
                      } else {
                        var29 = ai.field_b[1];
                        var29.c(var10, -(var29.field_m >> 454651233) + var11, 256);
                        break L28;
                      }
                    }
                  }
                  return;
                }
              } else {
                L30: {
                  this.field_H = new ti(var12, var13);
                  oj.a(this.field_H, 256);
                  if (var14 == 0) {
                    break L30;
                  } else {
                    oj.a(this.field_H, 256);
                    sb.c();
                    break L30;
                  }
                }
                L31: {
                  var23.a(112, 144, var23.field_r << -306217724, var23.field_s << -172847676, -this.field_K << 2001662346, 4096);
                  fi.c(true);
                  this.field_H.c(var10 - (var23.field_r >> 263659009), var11 + -var23.field_s, 256);
                  if (var14 == 0) {
                    break L31;
                  } else {
                    L32: {
                      if (ec.field_d != var6) {
                        break L32;
                      } else {
                        var26 = ai.field_b[2];
                        var26.c(var10, var11 - (var26.field_m >> -1794552927), 256);
                        break L32;
                      }
                    }
                    if (hi.field_b != var6) {
                      break L31;
                    } else {
                      var27 = ai.field_b[1];
                      var27.c(var10, -(var27.field_m >> 454651233) + var11, 256);
                      break L31;
                    }
                  }
                }
                return;
              }
            } else {
              L33: {
                this.field_H = new ti(var12, var13);
                oj.a(this.field_H, 256);
                if (var14 == 0) {
                  break L33;
                } else {
                  oj.a(this.field_H, 256);
                  sb.c();
                  break L33;
                }
              }
              L34: {
                var23.a(112, 144, var23.field_r << -306217724, var23.field_s << -172847676, -this.field_K << 2001662346, 4096);
                fi.c(true);
                this.field_H.c(var10 - (var23.field_r >> 263659009), var11 + -var23.field_s, 256);
                if (var14 == 0) {
                  break L34;
                } else {
                  L35: {
                    if (ec.field_d != var6) {
                      break L35;
                    } else {
                      var24 = ai.field_b[2];
                      var24.c(var10, var11 - (var24.field_m >> -1794552927), 256);
                      break L35;
                    }
                  }
                  if (hi.field_b != var6) {
                    break L34;
                  } else {
                    var25 = ai.field_b[1];
                    var25.c(var10, -(var25.field_m >> 454651233) + var11, 256);
                    break L34;
                  }
                }
              }
              return;
            }
          } else {
            L36: {
              L37: {
                if (ec.field_d != var6) {
                  break L37;
                } else {
                  var47 = ai.field_b[2];
                  var47.c(var10, var11 - (var47.field_m >> -1794552927), 256);
                  if (var14 == 0) {
                    break L36;
                  } else {
                    break L37;
                  }
                }
              }
              if (hi.field_b != var6) {
                break L36;
              } else {
                var48 = ai.field_b[1];
                var48.c(var10, -(var48.field_m >> 454651233) + var11, 256);
                break L36;
              }
            }
            return;
          }
        }
    }

    ob(wa param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, rj.b(true));
        try {
            this.field_J = param1;
            this.field_L = param0;
            this.a(62, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, sj param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ii var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ii var11 = null;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ue.field_c[param1]) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ue.field_c[param1] = new ii(wl.field_K.field_n, wl.field_K.field_m, 256);
                        ue.field_c[param1].field_h = hk.field_a.field_y;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == tj.field_s) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        tj.field_s = new ti(wl.field_K.field_n, wl.field_K.field_m);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        tj.field_s.e();
                        sb.c();
                        param2.a(param3, -param2.field_q, 1, -param2.field_j);
                        var11 = ue.field_c[param1];
                        var4 = var11;
                        var11.field_j[0] = 0;
                        var5 = param0;
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 >= sb.field_h.length) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = sb.field_h[var6];
                        var8 = -1;
                        if (var10 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 <= var9) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var13 = var7 ^ -1;
                        var12 = var11.field_j[var9] ^ -1;
                        if (var10 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var12 == var13) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var12 == var13) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var9;
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8 == -1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = var5;
                        incrementValue$0 = var5;
                        var5++;
                        var11.field_j[incrementValue$0] = var7;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11.field_i[var6] = (byte)var8;
                        var6++;
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ri.field_k.a(104);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var4_ref);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param2 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -11) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_L = (wa) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ob.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void k(int param0) {
        field_M = null;
        int var1 = -3 % ((-60 - param0) / 57);
        field_F = null;
        field_I = null;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (20 < var2_int) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = 20;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = new char[var2_int];
                        var7 = var8;
                        var3 = var7;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = param1.charAt(var4);
                        stackIn_23_0 = var5 ^ -1;
                        stackIn_7_0 = stackIn_23_0;
                        stackIn_23_1 = -66;
                        stackIn_7_1 = stackIn_23_1;
                        if (var6 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 > stackIn_7_1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 <= 90) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 < 97) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (122 >= var5) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 < 48) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 > 57) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3[var4] = (char)var5;
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3[var4] = (char)95;
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (char)(97 + (-65 + var5));
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = -67;
                        stackIn_23_1 = (50 - param0) / 38;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = stackIn_23_0 / stackIn_23_1;
                        stackIn_24_0 = new String(var8);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var2);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void l(int param0) {
        int var1 = -55 / ((16 - param0) / 35);
        wg.field_f = new qj();
    }

    static {
        field_I = "Passwords must be between 5 and 20 characters long";
        field_M = "Previous";
    }
}
