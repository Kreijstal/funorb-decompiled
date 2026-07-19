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
        String var5 = null;
        rc var6 = null;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var18 = null;
        ti var19 = null;
        ti var20 = null;
        ti var21 = null;
        Object var22 = null;
        ti var23 = null;
        ti var24 = null;
        ti var25 = null;
        ti var26 = null;
        ti var27 = null;
        ti var28 = null;
        ti var29 = null;
        ti var32 = null;
        ti var33 = null;
        ti var36 = null;
        ti var37 = null;
        ti var38 = null;
        ti var39 = null;
        ti var40 = null;
        ti var41 = null;
        ti var42 = null;
        ti var43 = null;
        ti var44 = null;
        ti var45 = null;
        ti var46 = null;
        ti var47 = null;
        ti var48 = null;
        m var49 = null;
        m var50 = null;
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
        int incrementValue$1 = 0;
        RuntimeException var4 = null;
        ii var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ii var11 = null;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ue.field_c[param1]) {
                break L1;
              } else {
                ue.field_c[param1] = new ii(wl.field_K.field_n, wl.field_K.field_m, 256);
                ue.field_c[param1].field_h = hk.field_a.field_y;
                break L1;
              }
            }
            L2: {
              if (null == tj.field_s) {
                tj.field_s = new ti(wl.field_K.field_n, wl.field_K.field_m);
                break L2;
              } else {
                break L2;
              }
            }
            tj.field_s.e();
            sb.c();
            param2.a(param3, -param2.field_q, 1, -param2.field_j);
            var11 = ue.field_c[param1];
            var4_ref = var11;
            var11.field_j[0] = 0;
            var5 = param0;
            var6 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var6 >= sb.field_h.length) {
                    break L5;
                  } else {
                    var7 = sb.field_h[var6];
                    var8 = -1;
                    if (var10 != 0) {
                      break L4;
                    } else {
                      var9 = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            L9: {
                              if (var5 <= var9) {
                                break L9;
                              } else {
                                var13 = var7 ^ -1;
                                var12 = var11.field_j[var9] ^ -1;
                                if (var10 != 0) {
                                  if (var12 == var13) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  L10: {
                                    if (var12 == var13) {
                                      var8 = var9;
                                      if (var10 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var9++;
                                  continue L6;
                                }
                              }
                            }
                            if (var8 == -1) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                          var8 = var5;
                          incrementValue$1 = var5;
                          var5++;
                          var11.field_j[incrementValue$1] = var7;
                          break L7;
                        }
                        var11.field_i[var6] = (byte)var8;
                        var6++;
                        if (var10 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                ri.field_k.a(104);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
    }

    final boolean a(qg param0, int param1) {
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
            if (param1 < -11) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ob.M(");
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var2_int) {
                  stackOut_22_0 = -67;
                  stackOut_22_1 = (50 - param0) / 38;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L3;
                } else {
                  var5 = param1.charAt(var4);
                  stackOut_6_0 = var5 ^ -1;
                  stackOut_6_1 = -66;
                  stackIn_23_0 = stackOut_6_0;
                  stackIn_23_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          if (stackIn_7_0 > stackIn_7_1) {
                            break L6;
                          } else {
                            if (var5 <= 90) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            L9: {
                              if (var5 < 97) {
                                break L9;
                              } else {
                                if (122 >= var5) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (var5 < 48) {
                              break L7;
                            } else {
                              if (var5 > 57) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3[var4] = (char)var5;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                        var3[var4] = (char)95;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                      var3[var4] = (char)(97 + (-65 + var5));
                      break L4;
                    }
                    var4++;
                    continue L2;
                  }
                }
              }
              var5 = stackIn_23_0 / stackIn_23_1;
              stackOut_23_0 = new String(var8);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
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
