/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends wda {
    private int field_r;
    static int field_q;
    private int field_p;
    private int field_o;

    final static void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        opa.a(ap.field_d, 0, ola.field_Eb, param0, (byte) -100, ota.field_c, true);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ola.field_Eb <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        boa.field_n[var2_int - -param0] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        opa.a(ma.field_g, param0, ola.field_Eb - -param0, param0 + param0, (byte) -100, kc.field_a, false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 >= ola.field_Eb) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ola.field_Eb = param0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1 == 29) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ri.a(10, -96, -65);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "ri.CA(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void e(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        mu stackIn_55_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        mu var6 = null;
        mu var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1 = vc.field_q;
            var2 = var1.h(255);
            if ((var2 ^ -1) != -1) {
              if (var2 != 1) {
                if ((var2 ^ -1) != -3) {
                  if (-4 == (var2 ^ -1)) {
                    L1: {
                      if (2 != ae.field_g) {
                        break L1;
                      } else {
                        ae.field_g = 1;
                        break L1;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var2 != 4) {
                      L2: {
                        ssa.a("F1: " + kk.a(32), (byte) 116, (Throwable) null);
                        if (param0 == 14180) {
                          break L2;
                        } else {
                          field_q = 74;
                          break L2;
                        }
                      }
                      dea.a(param0 ^ 14168);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ae.field_g = 1;
                      var3 = var1.e((byte) -76);
                      ol.field_b = ((String) (var3)).intern();
                      var4 = var1.h(255);
                      ifa.d(var4, 3);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (1 != ae.field_g) {
                      break L3;
                    } else {
                      ae.field_g = 2;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L4: {
                  if (hia.field_s != null) {
                    break L4;
                  } else {
                    hia.field_s = new af(128);
                    ii.field_a = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1.e((byte) -76);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1.e((byte) -76);
                  var5 = var1.e((byte) -76);
                  var6 = wp.a(121, var4_ref_String);
                  if (null == var6) {
                    var6 = wp.a(param0 ^ 14095, var5);
                    if (var6 == null) {
                      break L6;
                    } else {
                      hia.field_s.a(-1, var6, (long)jd.a(1, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 != null) {
                    break L7;
                  } else {
                    var6 = new mu();
                    hia.field_s.a(-1, var6, (long)jd.a(1, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$0 = ii.field_a;
                    ii.field_a = ii.field_a + 1;
                    var6.field_Db = fieldTemp$0;
                    fla.field_f.b((byte) -61, var6);
                    break L7;
                  }
                }
                L8: {
                  if (var3 == null) {
                    break L8;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L8;
                  }
                }
                var6.field_vb = var5;
                var6.field_Cb = (String) (var3);
                var6.field_tb = var4_ref_String;
                var6.p(70);
                var7 = (mu) ((Object) fla.field_f.f(-80));
                L9: while (true) {
                  L10: {
                    L11: {
                      if (null == var7) {
                        break L11;
                      } else {
                        stackIn_55_0 = (mu) (var7);

                        if (var9 != 0) {
                          break L10;
                        } else {
                          if (!ol.a(stackIn_55_0, true, var6)) {
                            break L11;
                          } else {
                            var7 = (mu) ((Object) fla.field_f.e(param0 + -14058));
                            if (var9 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackIn_55_0 = (mu) (var7);
                    break L10;
                  }
                  L12: {
                    L13: {
                      if (stackIn_55_0 != null) {
                        break L13;
                      } else {
                        fla.field_f.b((byte) -112, var6);
                        if (var9 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    ln.a(var7, var6, (byte) 120);
                    break L12;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L14: {
                if (null != bla.field_G) {
                  break L14;
                } else {
                  bla.field_G = new af(128);
                  tba.field_k = 0;
                  break L14;
                }
              }
              L15: {
                if (-2 != (var1.h(255) ^ -1)) {
                  stackIn_11_0 = 0;
                  break L15;
                } else {
                  stackIn_11_0 = 1;
                  break L15;
                }
              }
              L16: {
                L17: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1.e((byte) -76);
                  if (var3_int != 0) {
                    break L17;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                var5 = var1.e((byte) -76);
                break L16;
              }
              L18: {
                var6 = uh.a(var4_ref_String, param0 ^ -14105);
                var7_ref = var1.e((byte) -76);
                var8 = jd.a(1, (CharSequence) ((Object) var4_ref_String));
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (null != var6) {
                  break L19;
                } else {
                  var6 = uh.a(var7_ref, param0 + -14132);
                  if (null != var6) {
                    bla.field_G.a(-1, var6, (long)var8.hashCode());
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (null != var6) {
                  break L20;
                } else {
                  var6 = new mu();
                  bla.field_G.a(param0 ^ -14181, var6, (long)var8.hashCode());
                  fieldTemp$1 = tba.field_k;
                  tba.field_k = tba.field_k + 1;
                  var6.field_Db = fieldTemp$1;
                  wv.field_l.b((byte) -116, var6);
                  break L20;
                }
              }
              var6.field_yb = var5;
              var6.field_tb = var4_ref_String;
              var6.field_vb = var7_ref;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "ri.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        try {
            this.field_r = param1;
            if (param0 != -35) {
                this.field_r = 106;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ri.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var2_int = this.field_p / 2;
                  var4 = 18 / ((param0 - -69) / 42);
                  var3 = 0;
                  if (this.field_r <= 0) {
                    break L3;
                  } else {
                    if (this.field_o - -this.field_r < var2_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((this.field_r ^ -1) <= -1) {
                    break L4;
                  } else {
                    if (-var2_int < -this.field_r + this.field_o) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (-1 <= (this.field_r ^ -1)) {
                      break L6;
                    } else {
                      var3 = var2_int + -this.field_o;
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var3 = var2_int + this.field_o;
                  break L5;
                }
                this.field_r = -this.field_r;
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var3 = this.field_r;
              break L1;
            }
            this.field_o = this.field_o + var3;
            this.field_n.c(false, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "ri.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        try {
            if (param0 != 1) {
                field_q = 91;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ri.V(" + param0 + ')');
        }
    }

    ri(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_r = bla.a(true, 12, param1.b((byte) 44, 12));
            this.field_p = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ri.<init>(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2 <= 1) {
                    break L3;
                  } else {
                    stackIn_10_0 = 0;

                    stackIn_10_1 = 1 & param2;

                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_10_0 == stackIn_10_1) {
                          break L4;
                        } else {
                          var3_int = var3_int * param0;
                          break L4;
                        }
                      }
                      param2 = param2 >> 1;
                      param0 = param0 * param0;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_10_0 = 1;
                stackIn_10_1 = param2;
                break L2;
              }
              if (stackIn_10_0 == stackIn_10_1) {
                stackIn_13_0 = param0 * var3_int;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param1 == 0) {
                  stackIn_18_0 = var3_int;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_16_0 = -97;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "ri.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_q = -97;
                break L1;
              }
            }
            stackIn_4_0 = 16;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ri.P(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(boolean param0, int param1) {
        try {
            this.field_p = param1;
            if (!param0) {
                this.field_r = 121;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ri.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -78) {
              super.a(param0, (byte) -101);
              param0.a((byte) -125, dqa.a(true, this.field_r, 12), 12);
              param0.a((byte) 108, cn.a((byte) -127, this.field_p, 8192, 8), 8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ri.R(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.addMouseListener(wna.field_n);
            param0.addMouseMotionListener(wna.field_n);
            if (param1) {
              param0.addFocusListener(wna.field_n);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ri.O(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        try {
            super.c((byte) -121);
            this.field_r = -this.field_r;
            this.field_o = -this.field_o;
            if (param0 >= -116) {
                this.a((kh) null, (byte) -85);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ri.L(" + param0 + ')');
        }
    }

    ri(la param0, boolean param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_r = 16;
            this.field_p = cba.a((byte) -123, 90.0, 8192);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ri.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_r = 54;
                break L1;
              }
            }
            param1 = fs.a((byte) 26, param1, this.field_r);
            stackIn_4_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "ri.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static nh a(ha param0, byte param1, byte[] param2) {
        java.awt.Canvas var3 = null;
        InterruptedException var3_ref = null;
        RuntimeException var3_ref2 = null;
        java.awt.Image var4 = null;
        java.awt.MediaTracker var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        java.awt.image.PixelGrabber var9 = null;
        nh stackIn_2_0 = null;
        nh stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                var3 = nma.field_l;
                if (param1 < -59) {
                  var4 = java.awt.Toolkit.getDefaultToolkit().createImage(param2);
                  var5 = new java.awt.MediaTracker((java.awt.Component) ((Object) nma.field_l));
                  var5.addImage(var4, 0);
                  var5.waitForAll();
                  var6 = var4.getWidth((java.awt.image.ImageObserver) ((Object) var3));
                  var7 = var4.getHeight((java.awt.image.ImageObserver) ((Object) var3));
                  var8 = new int[var7 * var6];
                  var9 = new java.awt.image.PixelGrabber(var4, 0, 0, var6, var7, var8, 0, var6);
                  var9.grabPixels();
                  stackIn_4_0 = param0.a(var8, var7, 122, var6, var6, 0);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  stackIn_2_0 = (nh) null;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (InterruptedException) (Object) decompiledCaughtException;
              stackIn_6_0 = null;
              return (nh) ((Object) stackIn_6_0);
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref2);

            stackIn_10_1 = new StringBuilder().append("ri.EA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
